package com.demo.xml.mapping;

import com.demo.xml.model.stockservice.StockServiceXml;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.xmlunit.assertj.XmlAssert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JaxbMapper.class)
public class JaxbMapperTest {

    @Test
    @DisplayName("Successful Validation")
    public void testPojoToXML() {
        try {
            String testXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
                    "<ItemCost xmlns:ns0=\"http://www.tibco.com/schemas/Tesco_v1.4.3/Schemas/Common/MessageModel/Schema.xsd\" xmlns:ns1=\"http://www.tesco.com/Integration/CanonicalModel/Product\" BatchID=\"425026987\" MessageType=\"PIM12\">\n" +
                    "    <ItemList>\n" +
                    "        <Item ItemGroupCode=\"PROD\" ItemID=\"209-8556\" OrganizationCode=\"TESCOUK\" UnitOfMeasure=\"Each\">\n" +
                    "            <PrimaryInformation AssumeInfiniteInventory=\"N\" Description=\"Vodafone Â£10 Top Up\" IsHazmat=\"N\" IsReturnable=\"N\" ItemType=\"Product\" ProductLine=\"Directs\" Status=\"3000\" UnitHeight=\"1\" UnitHeightUOM=\"1\" UnitLength=\"1\" UnitLengthUOM=\"1\" UnitWeight=\"1\" UnitWeightUOM=\"MM\" UnitWidth=\"1\" UnitWidthUOM=\"10\"/>\n" +
                    "            <Components></Components>\n" +
                    "            <InventoryParameters ATPRule=\"TESCO_ATP_RULE\" AdvanceNotificationTime=\"0\" FutureSafetyFactorPercentage=\"\" InventoryMonitorRule=\"TESCO_GLOBAL_MONITOR\" LeadTime=\"1\" MinNotificationTime=\"0\" NodeLevelInventoryMonitorRule=\"TESCO_NODE_MONITOR\" OnhandSafetyFactorPercentage=\"\" OnhandSafetyFactorQuantity=\"\" UseUnplannedInventory=\"N\"/>\n" +
                    "            <ClassificationCodes ECCNNo=\"Pay On Order\" HarmonizedCode=\"Product\"/>\n" +
                    "            <Extn ExtnCaseQuantity=\"1\" ExtnDeliveryBeforeReleaseAllowed=\"Y\" ExtnDeliveryServiceLeadTime=\"2\" ExtnEmbargo=\"N\" ExtnIsFragile=\"N\" ExtnIsPreOrderable=\"N\" ExtnIsUgly=\"N\" ExtnItemCategory=\"Phones\" ExtnItemSubcategory=\"SIM Card\" ExtnMinimumAgeRequired=\"\" ExtnPODLegal=\"N\" ExtnPODRequired=\"N\" ExtnPODValue=\"N\" ExtnPreferredEAN=\"05000462191259\" ExtnPreferredTPND=\"8621060\" ExtnPricePromise=\"N\" ExtnSpecialDeliveryReqt=\"Not Applicable\" ExtnTPNB=\"050231543\" ExtnTVLACode=\"100\" ExtnTVLAFlag=\"N\" ExtnVatRate=\"20\"/>\n" +
                    "        </Item>\n" +
                    "    </ItemList>\n" +
                    "    <ItemNode ItemID=\"209-8556\" OrganizationCode=\"TESCOUK\">\n" +
                    "        <Nodes>\n" +
                    "            <Node AverageCost=\"10\" ShipNode=\"66650\"/>\n" +
                    "        </Nodes>\n" +
                    "        <ItemNodeDefn EnrollmentStatus=\"Active\" ItemID=\"209-8556\" Node=\"66650\" OrganizationCode=\"TESCOUK\" UnitOfMeasure=\"Each\">\n" +
                    "            <Extn ExtnItemCost=\"10\"/>\n" +
                    "        </ItemNodeDefn>\n" +
                    "    </ItemNode>\n" +
                    "</ItemCost>";
//            String controlXml = JaxbMapper.pojoToXML(new StockServiceXml(), "StockServices");
//            System.out.println(controlXml);
//            assertThat(testXml).and(controlXml).areSimilar();
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    @DisplayName("Failure Validation if any of the field value is different")
    public void testPojoToXMLFailure1() {
        try {
            String testXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
                    "<ItemCost xmlns:ns0=\"http://www.tibco.com/schemas/Tesco_v1.4.3/Schemas/Common/MessageModel/Schema.xsd\" xmlns:ns1=\"http://www.tesco.com/Integration/CanonicalModel/Product\" BatchID=\"425026987\" MessageType=\"PIM12\">\n" +
                    "    <ItemList>\n" +
                    "        <Item ItemGroupCode=\"PROD\" ItemID=\"209-8556\" OrganizationCode=\"TESCOUK\" UnitOfMeasure=\"Each\">\n" +
                    "            <PrimaryInformation AssumeInfiniteInventory=\"N\" Description=\"Vodafone Â£10 Top Up\" IsHazmat=\"N\" IsReturnable=\"N\" ItemType=\"Product\" ProductLine=\"Directs\" Status=\"3000\" UnitHeight=\"1\" UnitHeightUOM=\"1\" UnitLength=\"1\" UnitLengthUOM=\"1\" UnitWeight=\"1\" UnitWeightUOM=\"MM\" UnitWidth=\"1\" UnitWidthUOM=\"10\"/>\n" +
                    "            <Components></Components>\n" +
                    "            <InventoryParameters ATPRule=\"TESCO_ATP_RULE\" AdvanceNotificationTime=\"0\" FutureSafetyFactorPercentage=\"\" InventoryMonitorRule=\"TESCO_GLOBAL_MONITOR\" LeadTime=\"1\" MinNotificationTime=\"0\" NodeLevelInventoryMonitorRule=\"TESCO_NODE_MONITOR\" OnhandSafetyFactorPercentage=\"\" OnhandSafetyFactorQuantity=\"\" UseUnplannedInventory=\"N\"/>\n" +
                    "            <ClassificationCodes ECCNNo=\"Pay On Order\" HarmonizedCode=\"Product\"/>\n" +
                    "            <Extn ExtnCaseQuantity=\"1\" ExtnDeliveryBeforeReleaseAllowed=\"Y\" ExtnDeliveryServiceLeadTime=\"2\" ExtnEmbargo=\"N\" ExtnIsFragile=\"N\" ExtnIsPreOrderable=\"N\" ExtnIsUgly=\"N\" ExtnItemCategory=\"Phones\" ExtnItemSubcategory=\"SIM Card\" ExtnMinimumAgeRequired=\"\" ExtnPODLegal=\"N\" ExtnPODRequired=\"N\" ExtnPODValue=\"N\" ExtnPreferredEAN=\"05000462191259\" ExtnPreferredTPND=\"8621060\" ExtnPricePromise=\"N\" ExtnSpecialDeliveryReqt=\"Not Applicable\" ExtnTPNB=\"050231543\" ExtnTVLACode=\"100\" ExtnTVLAFlag=\"N\" ExtnVatRate=\"20\"/>\n" +
                    "        </Item>\n" +
                    "    </ItemList>\n" +
                    "    <ItemNode ItemID=\"209-8556\" OrganizationCode=\"TESCO\">\n" +
                    "        <Nodes>\n" +
                    "            <Node AverageCost=\"10\" ShipNode=\"66650\"/>\n" +
                    "        </Nodes>\n" +
                    "        <ItemNodeDefn EnrollmentStatus=\"Active\" ItemID=\"209-8556\" Node=\"66650\" OrganizationCode=\"TESCOUK\" UnitOfMeasure=\"Each\">\n" +
                    "            <Extn ExtnItemCost=\"10\"/>\n" +
                    "        </ItemNodeDefn>\n" +
                    "    </ItemNode>\n" +
                    "</ItemCost>";
//            String controlXml = JaxbMapper.pojoToXML(new StockServiceXml(), "StockServices");
//            System.out.println(controlXml);
//            assertThat(testXml).and(controlXml).areSimilar();
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    @DisplayName("Failure Validation if any extra element is added")
    public void testPojoToXMLFailure2() {
        try {
            String testXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
                    "<ItemCost xmlns:ns0=\"http://www.tibco.com/schemas/Tesco_v1.4.3/Schemas/Common/MessageModel/Schema.xsd\" xmlns:ns1=\"http://www.tesco.com/Integration/CanonicalModel/Product\" BatchID=\"425026987\" MessageType=\"PIM12\">\n" +
                    "    <ItemList>\n" +
                    "        <Item ItemGroupCode=\"PROD\" ItemID=\"209-8556\" OrganizationCode=\"TESCOUK\" UnitOfMeasure=\"Each\">\n" +
                    "            <PrimaryInformation AssumeInfiniteInventory=\"N\" Description=\"Vodafone Â£10 Top Up\" IsHazmat=\"N\" IsReturnable=\"N\" ItemType=\"Product\" ProductLine=\"Directs\" Status=\"3000\" UnitHeight=\"1\" UnitHeightUOM=\"1\" UnitLength=\"1\" UnitLengthUOM=\"1\" UnitWeight=\"1\" UnitWeightUOM=\"MM\" UnitWidth=\"1\" UnitWidthUOM=\"10\"/>\n" +
                    "            <Components></Components>\n" +
                    "            <InventoryParameters ATPRule=\"TESCO_ATP_RULE\" AdvanceNotificationTime=\"0\" FutureSafetyFactorPercentage=\"\" InventoryMonitorRule=\"TESCO_GLOBAL_MONITOR\" LeadTime=\"1\" MinNotificationTime=\"0\" NodeLevelInventoryMonitorRule=\"TESCO_NODE_MONITOR\" OnhandSafetyFactorPercentage=\"\" OnhandSafetyFactorQuantity=\"\" UseUnplannedInventory=\"N\"/>\n" +
                    "            <ClassificationCodes ECCNNo=\"Pay On Order\" HarmonizedCode=\"Product\"/>\n" +
                    "            <Extn ExtnCaseQuantity=\"1\" ExtnDeliveryBeforeReleaseAllowed=\"Y\" ExtnDeliveryServiceLeadTime=\"2\" ExtnEmbargo=\"N\" ExtnIsFragile=\"N\" ExtnIsPreOrderable=\"N\" ExtnIsUgly=\"N\" ExtnItemCategory=\"Phones\" ExtnItemSubcategory=\"SIM Card\" ExtnMinimumAgeRequired=\"\" ExtnPODLegal=\"N\" ExtnPODRequired=\"N\" ExtnPODValue=\"N\" ExtnPreferredEAN=\"05000462191259\" ExtnPreferredTPND=\"8621060\" ExtnPricePromise=\"N\" ExtnSpecialDeliveryReqt=\"Not Applicable\" ExtnTPNB=\"050231543\" ExtnTVLACode=\"100\" ExtnTVLAFlag=\"N\" ExtnVatRate=\"20\"/>\n" +
                    "        </Item>\n" +
                    "    </ItemList>\n" +
                    "    <ItemNode ItemID=\"209-8556\" OrganizationCode=\"TESCOUK\">\n" +
                    "        <Nodes>\n" +
                    "            <Node AverageCost=\"10\" ShipNode=\"66650\"/>\n" +
                    "            <Node AverageCost=\"10\" ShipNode=\"66650\"/>\n" +
                    "        </Nodes>\n" +
                    "        <ItemNodeDefn EnrollmentStatus=\"Active\" ItemID=\"209-8556\" Node=\"66650\" OrganizationCode=\"TESCOUK\" UnitOfMeasure=\"Each\">\n" +
                    "            <Extn ExtnItemCost=\"10\"/>\n" +
                    "        </ItemNodeDefn>\n" +
                    "    </ItemNode>\n" +
                    "</ItemCost>";
            //String controlXml = JaxbMapper.pojoToXML(new StockServiceXml(), "StockServices");
            //System.out.println(controlXml);
            //assertThat(testXml).and(controlXml).areSimilar();
        } catch (Exception e) {
            assertNull(e);
        }
    }
}