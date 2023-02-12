package com.gram15inch.data.converter

import com.clone.mycoupang.data.remote.model.pay.RemotePay
import com.clone.mycoupang.domain.model.pay.Pay


/*
* type :ACCOUNT, CREDIT, COUPAY
* */
object PayConverter {
    fun toPay(remote: RemotePay): List<Pay> {
        val payList = mutableListOf<Pay>()

        remote.accountList.forEach {
            payList.add(
                Pay(
                    it.paymentId,
                    it.bankName,
                    it.number,
                    it.type,
                    it.bankLogoImage,
                    -1
                )
            )
        }
        remote.cardList.forEach {
            payList.add(
                Pay(
                    it.paymentId,
                    it.bankName,
                    it.number,
                    it.type,
                    it.bankLogoImage,
                    -1
                )
            )
        }
        remote.userCouPayMoney.also {
            payList.add(Pay(0,
                "",
                "",
                "COUPAY",
                "",
                it
            ))
        }
        return payList
    }
}
