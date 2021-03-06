//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.18 at 10:13:06 PM BST 
//


package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for meatType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="meatType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Beef"/>
 *     &lt;enumeration value="Chicken"/>
 *     &lt;enumeration value="Pork"/>
 *     &lt;enumeration value="Boar"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "meatType")
@XmlEnum
public enum MeatType {

    @XmlEnumValue("Beef")
    BEEF("Beef"),
    @XmlEnumValue("Chicken")
    CHICKEN("Chicken"),
    @XmlEnumValue("Pork")
    PORK("Pork"),
    @XmlEnumValue("Boar")
    BOAR("Boar");
    private final String value;

    MeatType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeatType fromValue(String v) {
        for (MeatType c: MeatType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
