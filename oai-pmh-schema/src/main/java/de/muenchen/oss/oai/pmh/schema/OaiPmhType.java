//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2023.08.31 at 09:34:26 AM CEST
//

package de.muenchen.oss.oai.pmh.schema;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * <p>
 * Java class for OAI-PMHtype complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="OAI-PMHtype"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="responseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="request" type="{http://www.openarchives.org/OAI/2.0/}requestType"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="error" type="{http://www.openarchives.org/OAI/2.0/}OAI-PMHerrorType" maxOccurs="unbounded"/&gt;
 *           &lt;element name="Identify" type="{http://www.openarchives.org/OAI/2.0/}IdentifyType"/&gt;
 *           &lt;element name="ListMetadataFormats" type="{http://www.openarchives.org/OAI/2.0/}ListMetadataFormatsType"/&gt;
 *           &lt;element name="ListSets" type="{http://www.openarchives.org/OAI/2.0/}ListSetsType"/&gt;
 *           &lt;element name="GetRecord" type="{http://www.openarchives.org/OAI/2.0/}GetRecordType"/&gt;
 *           &lt;element name="ListIdentifiers" type="{http://www.openarchives.org/OAI/2.0/}ListIdentifiersType"/&gt;
 *           &lt;element name="ListRecords" type="{http://www.openarchives.org/OAI/2.0/}ListRecordsType"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "OAI-PMHtype", propOrder = {
                "responseDate",
                "request",
                "error",
                "identify",
                "listMetadataFormats",
                "listSets",
                "getRecord",
                "listIdentifiers",
                "listRecords"
        }
)
@XmlRootElement(name = "OAI-PMH")
public class OaiPmhType {

    @XmlAttribute(name = "xmlns")
    public final String xmlns = "http://www.openarchives.org/OAI/2.0/";

    @XmlAttribute(name = "xmlns:xsi")
    public final String xsi = "http://www.w3.org/2001/XMLSchema-instance";

    @XmlAttribute(name = "xsi:schemaLocation")
    public final String schemaLocation = "http://www.openarchives.org/OAI/2.0/ http://www.openarchives.org/OAI/2.0/OAI-PMH.xsd";

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    public XMLGregorianCalendar responseDate;
    @XmlElement(required = true)
    public RequestType request;

    @JacksonXmlElementWrapper(useWrapping = false)
    public List<OaiPmhErrorType> error;
    @XmlElement(name = "Identify")
    public IdentifyType identify;
    @XmlElement(name = "ListMetadataFormats")
    public ListMetadataFormatsType listMetadataFormats;
    @XmlElement(name = "ListSets")
    public ListSetsType listSets;
    @XmlElement(name = "GetRecord")
    public GetRecordType getRecord;
    @XmlElement(name = "ListIdentifiers")
    public ListIdentifiersType listIdentifiers;
    @XmlElement(name = "ListRecords")
    public ListRecordsType listRecords;

    /**
     * Gets the value of the responseDate property.
     *
     * @return possible object is
     *         {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getResponseDate() {
        return responseDate;
    }

    /**
     * Sets the value of the responseDate property.
     *
     * @param value allowed object is
     *            {@link XMLGregorianCalendar }
     */
    public void setResponseDate(XMLGregorianCalendar value) {
        this.responseDate = value;
    }

    public void setResponseDateToCurrentDate() {
        try {
            this.responseDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar());
        } catch (DatatypeConfigurationException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Gets the value of the request property.
     *
     * @return possible object is
     *         {@link RequestType }
     */
    public RequestType getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     *
     * @param value allowed object is
     *            {@link RequestType }
     */
    public void setRequest(RequestType value) {
        this.request = value;
    }

    /**
     * Gets the value of the error property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the error property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getError().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OaiPmhErrorType }
     */
    public List<OaiPmhErrorType> getError() {
        if (error == null) {
            error = new ArrayList<>();
        }
        return this.error;
    }

    /**
     * Gets the value of the identify property.
     *
     * @return possible object is
     *         {@link IdentifyType }
     */
    public IdentifyType getIdentify() {
        return identify;
    }

    /**
     * Sets the value of the identify property.
     *
     * @param value allowed object is
     *            {@link IdentifyType }
     */
    public void setIdentify(IdentifyType value) {
        this.identify = value;
    }

    /**
     * Gets the value of the listMetadataFormats property.
     *
     * @return possible object is
     *         {@link ListMetadataFormatsType }
     */
    public ListMetadataFormatsType getListMetadataFormats() {
        return listMetadataFormats;
    }

    /**
     * Sets the value of the listMetadataFormats property.
     *
     * @param value allowed object is
     *            {@link ListMetadataFormatsType }
     */
    public void setListMetadataFormats(ListMetadataFormatsType value) {
        this.listMetadataFormats = value;
    }

    /**
     * Gets the value of the listSets property.
     *
     * @return possible object is
     *         {@link ListSetsType }
     */
    public ListSetsType getListSets() {
        return listSets;
    }

    /**
     * Sets the value of the listSets property.
     *
     * @param value allowed object is
     *            {@link ListSetsType }
     */
    public void setListSets(ListSetsType value) {
        this.listSets = value;
    }

    /**
     * Gets the value of the getRecord property.
     *
     * @return possible object is
     *         {@link GetRecordType }
     */
    public GetRecordType getGetRecord() {
        return getRecord;
    }

    /**
     * Sets the value of the getRecord property.
     *
     * @param value allowed object is
     *            {@link GetRecordType }
     */
    public void setGetRecord(GetRecordType value) {
        this.getRecord = value;
    }

    /**
     * Gets the value of the listIdentifiers property.
     *
     * @return possible object is
     *         {@link ListIdentifiersType }
     */
    public ListIdentifiersType getListIdentifiers() {
        return listIdentifiers;
    }

    /**
     * Sets the value of the listIdentifiers property.
     *
     * @param value allowed object is
     *            {@link ListIdentifiersType }
     */
    public void setListIdentifiers(ListIdentifiersType value) {
        this.listIdentifiers = value;
    }

    /**
     * Gets the value of the listRecords property.
     *
     * @return possible object is
     *         {@link ListRecordsType }
     */
    public ListRecordsType getListRecords() {
        return listRecords;
    }

    /**
     * Sets the value of the listRecords property.
     *
     * @param value allowed object is
     *            {@link ListRecordsType }
     */
    public void setListRecords(ListRecordsType value) {
        this.listRecords = value;
    }

}