package com.example.design_pattern_observe

class LiveData<T>(data : T) {


    private var listData : MutableList<Observer<T>> = mutableListOf()

    var value :T = data
        set(value) {
            field = value

            listData.forEach {
                it.changed(value)
            }
        }


    fun obServe(ob :Observer<T>)
    {
        listData.add(ob)
    }

    fun detach(ob:Observer<T>)
    {
        listData.remove(ob)
    }

}