package viewmodel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.mvvm.R;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductViewModel extends ViewModel{
    private MutableLiveData<List<Product>> productList;

    public LiveData<List<Product>> getProducts(){
        if(productList == null){
            productList = new MutableLiveData<>();
            loadProducts();
        }
        return productList;
    }
    private void loadProducts(){
        List<Product> products = new ArrayList<>();

        products.add(new Product(
                "Notebook",
                "School Supply",
                44.00,
                R.drawable.notebook
        ));

        products.add(new Product(
                "ID Lace",
                "Accessory",
                25.00,
                R.drawable.hcdc
        ));

        products.add(new Product(
                "Flash Drive",
                "Electronics",
                350.00,
                R.drawable.flashdrive
        ));

        products.add(new Product(
                "UTP Cable - 5m",
                "Electronics",
                200.00,
                R.drawable.utp
        ));

        productList.setValue(products);
    }
}
