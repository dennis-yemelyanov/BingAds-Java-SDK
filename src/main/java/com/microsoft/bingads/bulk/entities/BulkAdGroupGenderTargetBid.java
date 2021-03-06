package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.bulk.BulkServiceManager;
import com.microsoft.bingads.bulk.BulkFileReader;
import com.microsoft.bingads.bulk.BulkFileWriter;
import com.microsoft.bingads.bulk.BulkOperation;

/**
 * Represents one gender target bid within a gender target that is associated with an ad group.
 *
 * This class exposes the {@link BulkGenderTargetBid#setGenderTargetBid} and {@link BulkGenderTargetBid#getGenderTargetBid}
 * methods that can be used to read and write fields of the Ad Group Gender Target record in a bulk file.
 *
 * <p>
 *     For more information, see Ad Group Gender Target at
 *     <a href="http://go.microsoft.com/fwlink/?LinkID=511544">http://go.microsoft.com/fwlink/?LinkID=511544</a>.
 * </p>
 *
 * <p>
 *     One {@link BulkAdGroupGenderTarget} exposes a read only list of {@link BulkAdGroupGenderTargetBid}.
 *     Each {@link BulkAdGroupGenderTargetBid} instance corresponds to one Ad Group Gender Target record in the bulk file.
 *     If you upload a {@link BulkAdGroupGenderTarget},
 *     then you are effectively replacing any existing bids for the corresponding gender target.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAdGroupGenderTargetBid extends BulkGenderTargetBid {

    /**
     * Initializes a new instanced of the BulkAdGroupGenderTargetBid class.
     */
    public BulkAdGroupGenderTargetBid() {
        super(new BulkAdGroupTargetIdentifier(BulkAdGroupGenderTargetBid.class));
    }

    /**
     * Gets the identifier of the ad group that the target is associated.
     *
     * <p>
     *     Corresponds to the 'Parent Id' field in the bulk file.
     * </p>
     */
    public Long getAdGroupId() {
        return getEntityId();
    }

    /**
     * Sets the identifier of the ad group that the target is associated.
     *
     * <p>
     *     Corresponds to the 'Parent Id' field in the bulk file.
     * </p>
     */
    public void setAdGroupId(Long adGroupId) {
        setEntityId(adGroupId);
    }

    /**
     * Gets the name of the ad group that the target is associated.
     *
     * <p>
     *     Corresponds to the 'Ad Group' field in the bulk file.
     * </p>
     */
    public String getAdGroupName() {
        return getEntityName();
    }

    /**
     * Sets the name of the ad group that the target is associated.
     *
     * <p>
     *     Corresponds to the 'Ad Group' field in the bulk file.
     * </p>
     */
    public void setAdGroupName(String adGroupName) {
        setEntityName(adGroupName);
    }

    /**
     * Gets the name of the campaign that target is associated.
     *
     * <p>
     *     Corresponds to the 'Campaign' field in the bulk file.
     * </p>
     */
    public String getCampaignName() {
        return getParentEntityName();
    }

    /**
     * Sets the name of the campaign that target is associated.
     *
     * <p>
     *     Corresponds to the 'Campaign' field in the bulk file.
     * </p>
     */
    public void setCampaignName(String campaignName) {
        setParentEntityName(campaignName);
    }
}
