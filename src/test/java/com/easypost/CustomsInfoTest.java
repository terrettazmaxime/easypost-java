package com.easypost;

import com.easypost.exception.EasyPostException;
import com.easypost.model.CustomsInfo;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertTrue;

public final class CustomsInfoTest {
    private static TestUtils.VCR vcr;

    /**
     * Set up the testing environment for this file.
     *
     * @throws EasyPostException when the request fails.
     */
    @BeforeAll
    public static void setup() throws EasyPostException {
        vcr = new TestUtils.VCR("customs_info", TestUtils.ApiKey.TEST);
    }

    /**
     * Create a customs info object.
     *
     * @return CustomsInfo object.
     */
    private static CustomsInfo createBasicCustomsInfo() throws EasyPostException {
        return vcr.client.customsInfo.create(Fixtures.basicCustomsInfo());
    }

    /**
     * Test creating a CustomsInfo.
     *
     * @throws EasyPostException when the request fails.
     */
    @Test
    public void testCreate() throws EasyPostException {
        vcr.setUpTest("create");

        CustomsInfo customsInfo = createBasicCustomsInfo();

        assertInstanceOf(CustomsInfo.class, customsInfo);
        assertTrue(customsInfo.getId().startsWith("cstinfo_"));
        assertEquals("NOEEI 30.37(a)", customsInfo.getEelPfc());
    }

    /**
     * Test retrieving a CustomsInfo.
     *
     * @throws EasyPostException when the request fails.
     */
    @Test
    public void testRetrieve() throws EasyPostException {
        vcr.setUpTest("retrieve");

        CustomsInfo customsInfo = createBasicCustomsInfo();

        CustomsInfo retrievedCustomsInfo = vcr.client.customsInfo.retrieve(customsInfo.getId());

        assertInstanceOf(CustomsInfo.class, retrievedCustomsInfo);
        assertTrue(customsInfo.equals(retrievedCustomsInfo));
    }
}
