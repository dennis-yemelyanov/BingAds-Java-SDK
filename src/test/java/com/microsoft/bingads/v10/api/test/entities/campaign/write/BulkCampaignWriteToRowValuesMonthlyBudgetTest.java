package com.microsoft.bingads.v10.api.test.entities.campaign.write;

import com.microsoft.bingads.v10.api.test.entities.campaign.BulkCampaignTest;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaign;
import com.microsoft.bingads.v10.campaignmanagement.BudgetLimitType;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkCampaignWriteToRowValuesMonthlyBudgetTest extends BulkCampaignTest {

    @Parameter(value = 1)
    public Double propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        // In this example, the parameter generator returns a List of
        // arrays.  Each array has two elements: { datum, expected }.
        // These data are hard-coded into the class, but they could be
        // generated or loaded in any way you like.
        return Arrays.asList(new Object[][]{
            {"12.34", 12.34},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        BiConsumer<BulkCampaign, Double> setValues = new BiConsumer<BulkCampaign, Double>() {
            @Override
            public void accept(BulkCampaign c, Double v) {
                c.getCampaign().setMonthlyBudget(v);
                c.getCampaign().setBudgetType(BudgetLimitType.MONTHLY_BUDGET_SPEND_UNTIL_DEPLETED);
            }
        };

        this.<Double>testWriteProperty("Budget", this.datum, this.propertyValue, setValues);
    }
}
