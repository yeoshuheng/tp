package seedu.address.model.person;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

/**
 * Represents funding stage of current project.
 */
public class FundingStage {

    public static final String MESSAGE_CONSTRAINTS =
      "Funding stages should be either 'A', 'B' or 'C'.";

    public String value;

    public FundingStage(String fundingLevel) {
        requireNonNull(fundingLevel);
        fundingLevel = fundingLevel.toUpperCase();
        checkArgument(isValidFundingLevel(fundingLevel), MESSAGE_CONSTRAINTS);
        value = fundingLevel;
    }

    /**
     * Returns true if a given industry is a valid industry.
     */
    public static boolean isValidFundingLevel(String fundingLevel) {
        return fundingLevel.equals("A")  || fundingLevel.equals("B") || fundingLevel.equals("C");
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof FundingStage)) {
            return false;
        }

        FundingStage otherFundingStage = (FundingStage) other;
        return value.equals(otherFundingStage.value);
    }

    @Override
    public String toString() {
        return "Series " + this.value;
    }
}