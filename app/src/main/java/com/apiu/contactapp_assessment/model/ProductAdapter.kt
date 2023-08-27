import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup

import androidx.recyclerview.widget.RecyclerView
import com.apiu.contactapp_assessment.databinding.ActivityListitemviewBinding
import com.apiu.contactapp_assessment.model.FormData


class ProductAdapter (var ProductList:List<FormData>, var  context:Context): RecyclerView.Adapter<ProductAdapter.ProductViewHolder>(){
    @SuppressLint("SuspiciousIndentation")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        var binding=ActivityListitemviewBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return  ProductViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return ProductList.size

    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        var detail=ProductList[position]
        holder.binding.apply {

            tvname.text=detail.name.toString()
            tvemail.text=detail.email.toString()


        }




    }




    class  ProductViewHolder(var binding: ActivityListitemviewBinding ):RecyclerView.ViewHolder(binding.root){
    }}

