
package com.microsoft.bingads.v10.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeywordSearchCounts" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity}ArrayOfKeywordSearchCount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "keywordSearchCounts"
})
@XmlRootElement(name = "GetHistoricalSearchCountResponse", namespace = "Microsoft.Advertiser.AdInsight.Api.Service")
public class GetHistoricalSearchCountResponse {

    @XmlElement(name = "KeywordSearchCounts", namespace = "Microsoft.Advertiser.AdInsight.Api.Service", nillable = true)
    protected ArrayOfKeywordSearchCount keywordSearchCounts;

    /**
     * Gets the value of the keywordSearchCounts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeywordSearchCount }
     *     
     */
    public ArrayOfKeywordSearchCount getKeywordSearchCounts() {
        return keywordSearchCounts;
    }

    /**
     * Sets the value of the keywordSearchCounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeywordSearchCount }
     *     
     */
    public void setKeywordSearchCounts(ArrayOfKeywordSearchCount value) {
        this.keywordSearchCounts = value;
    }

}
