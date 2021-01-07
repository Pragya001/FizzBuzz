import com.demo.xml.mapping.JaxbMapper;
import com.demo.xml.model.ndoservice.NdoXml;
import com.demo.xml.model.ndoservice.ProductFeed;
import com.demo.xml.model.stockservice.StockServiceXml;

public class Application {
    public static void main(String[] args) {
        JaxbMapper.pojoToXML(new StockServiceXml(), "StockServices");
        JaxbMapper.pojoToXML(new NdoXml(), new ProductFeed(), "NdoService");
    }
}
