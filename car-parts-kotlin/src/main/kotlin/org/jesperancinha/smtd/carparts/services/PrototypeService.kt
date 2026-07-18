package org.jesperancinha.smtd.carparts.services

import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component
import java.util.*


@Component
@Scope("prototype")
class PrototypeBean {
    val id: String? = UUID.randomUUID().toString()
}

@Component
@Scope("singleton")
class SingletonBean(private val prototypeBean: PrototypeBean) {
    val prototypeId: String?
        get() = prototypeBean.id
}

@Component
@Scope("singleton")
class SingletonBean2(private val prototypeBean: PrototypeBean) {
    val prototypeId: String?
        get() = prototypeBean.id
}
