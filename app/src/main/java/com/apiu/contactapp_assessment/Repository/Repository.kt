
import com.apiu.contactapp_assessment.Api.ApiClient
import com.apiu.contactapp_assessment.Api.ApiInterface
import com.apiu.contactapp_assessment.model.FormData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Repository {
    private val apiInterface = ApiClient.buildClient(ApiInterface::class.java)

    suspend fun submitForm(formData: FormData) {
        return withContext(Dispatchers.IO) {
            apiInterface.submitForm(formData)
        }
    }
}
