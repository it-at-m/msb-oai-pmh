//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2023.10.23 at 08:06:18 AM CEST
//

package de.muenchen.oss.oai.pmh.schema.metadata.marc21;

import jakarta.xml.bind.annotation.*;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

/**
 * <p>
 * Java class for subfieldatafieldType complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="subfieldatafieldType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.loc.gov/MARC21/slim&gt;subfieldDataType"&gt;
 *       &lt;attribute name="id" type="{http://www.loc.gov/MARC21/slim}idDataType" /&gt;
 *       &lt;attribute name="code" use="required" type="{http://www.loc.gov/MARC21/slim}subfieldcodeDataType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "subfieldatafieldType", propOrder = {
                "value"
        }
)
@ToString
@EqualsAndHashCode
public class SubfieldatafieldType implements Serializable {

    @Serial
    private static final long serialVersionUID = 2242670658530573229L;

    @XmlValue
    public String value;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public String id;
    @XmlAttribute(name = "code", required = true)
    public String code;

    public SubfieldatafieldType(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public SubfieldatafieldType() {
    }

    /**
     * Gets the value of the value property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value allowed object is
     *            {@link String }
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is
     *            {@link String }
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the code property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     *
     * @param value allowed object is
     *            {@link String }
     */
    public void setCode(String value) {
        this.code = value;
    }

}