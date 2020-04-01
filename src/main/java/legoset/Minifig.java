package legoset;

import lombok.Data;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Minifig {

    @XmlAttribute
    private int count;

    @XmlValue
    private String value;

    public Minifig() {}

    public Minifig(int count, String value) {
        this.count = count;
        this.value = value;
    }
}
