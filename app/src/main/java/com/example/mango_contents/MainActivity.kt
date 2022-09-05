package com.example.mango_contents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val items=  mutableListOf<ContentModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        items.add(
            ContentModel(
                "https://www.mangoplate.com/restaurants/B64oLGvWbo5d",
            "https://mp-seoul-image-production-s3.mangoplate.com/523935_1623245432052274.jpg",
                "스시이마"
            )
        )
        items.add(
            ContentModel(
                "https://www.mangoplate.com/restaurants/_c641YCsJWU3",
                "https://mp-seoul-image-production-s3.mangoplate.com/249700/1042666_1597122578575_37310?fit=around|738:738&crop=738:738;*,*&output-format=jpg&output-quality=80",
                "횟집울릉도"
            )
        )
        items.add(
            ContentModel(
                "https://www.mangoplate.com/restaurants/cHYhGejaT_",
                "https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/532640_1471097953708316.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "제주도그릴특상"
            )
        )
        items.add(
            ContentModel(
                "https://www.mangoplate.com/restaurants/i4IbCYrqwDeQ",
                "https://mp-seoul-image-production-s3.mangoplate.com/1515134_1610875043199453.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "니하오"
            )
        )
        items.add(
            ContentModel(
                "https://www.mangoplate.com/restaurants/RLwmEULwZPHo",
                "https://mp-seoul-image-production-s3.mangoplate.com/288424_1656598616585466.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "금원함흥냉면"
            )
        )
        items.add(
            ContentModel(
                "https://www.mangoplate.com/restaurants/r0oHu19ooXxW",
                "https://mp-seoul-image-production-s3.mangoplate.com/430689/439642_1660275196148_3936?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "YM에스프레소룸"
            )
        )

        val recyclerview = findViewById<RecyclerView>(R.id.rv)
        val rvAdapter = RVAdapter(baseContext, items)
        recyclerview.adapter = rvAdapter

        recyclerview.layoutManager = GridLayoutManager(this,2)
    }
}