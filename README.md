# RecyclerView_kt
 kotlin version

#
#### Type 1
- Make class Adapter
```kotlin
class CostumAdapter(
    private val list: ArrayList<String>,
    private val listener: (String) -> Unit
) : RecyclerView.Adapter<CostumAdapter.MyHolder>() {
    
    ...
    
}
```

- Use in activity
```kotlin
class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    lateinit var list: ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list.add("GZeinNumer")

        val adapter = CostumAdapter(list){
            Log.d(TAG, "onCreate: $it")
        }
        
        rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        rv.adapter = adapter
    }
}
```

#
#### Type 2
- Make class Adapter
```kotlin
class CostumAdapter2(
    private val list: ArrayList<String>,
    private val listener: OnCallBack
) : RecyclerView.Adapter<CostumAdapter2.MyHolder>() {

    interface OnCallBack {
        fun onClick(data: String)
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.itemView.setOnClickListener {
            listener.onClick(list[position])
        }
    }
    
    ...
    
}
```

- Use in activity
```kotlin
class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    lateinit var list: ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list.add("GZeinNumer")

        val adapter = CostumAdapter2(list, object: CostumAdapter2.OnCallBack{
            override fun onClick(data: String) {
                Log.d(TAG, "onClick: $data")
            }
        })
        
        rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        rv.adapter = adapter
    }
}
```

---

```
Copyright 2020 M. Fadli Zein
```
