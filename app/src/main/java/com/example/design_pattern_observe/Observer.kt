package com.example.design_pattern_observe

interface Observer<T> {
    fun changed(data :T)
}