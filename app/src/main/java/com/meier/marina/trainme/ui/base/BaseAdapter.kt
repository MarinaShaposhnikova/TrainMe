package com.meier.marina.trainme.ui.base

import com.hannesdorfmann.adapterdelegates3.ListDelegationAdapter

class BaseAdapter<T : Identifiable> : ListDelegationAdapter<List<Identifiable>>() {
}
