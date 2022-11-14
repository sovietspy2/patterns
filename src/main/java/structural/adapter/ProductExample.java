package structural.adapter;

import java.util.Date;

// cannot change this class
public class ProductExample {

    public ProductExample(Date createDate, Integer id) {
        this.createDate = createDate;
        this.id = id;
    }

    protected final Date createDate;

    protected final Integer id;

    public Date getCreateDate() {
        return createDate;
    }

    public Integer getId() {
        return id;
    }
}


