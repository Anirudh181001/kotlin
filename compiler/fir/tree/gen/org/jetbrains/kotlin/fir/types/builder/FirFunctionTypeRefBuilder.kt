/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir.types.builder

import kotlin.contracts.*
import org.jetbrains.kotlin.fir.FirPureAbstractElement
import org.jetbrains.kotlin.fir.FirSourceElement
import org.jetbrains.kotlin.fir.builder.FirAnnotationContainerBuilder
import org.jetbrains.kotlin.fir.builder.FirBuilderDsl
import org.jetbrains.kotlin.fir.declarations.FirValueParameter
import org.jetbrains.kotlin.fir.expressions.FirAnnotationCall
import org.jetbrains.kotlin.fir.types.FirFunctionTypeRef
import org.jetbrains.kotlin.fir.types.FirTypeRef
import org.jetbrains.kotlin.fir.types.impl.FirFunctionTypeRefImpl
import org.jetbrains.kotlin.fir.visitors.*

/*
 * This file was generated automatically
 * DO NOT MODIFY IT MANUALLY
 */

@FirBuilderDsl
class FirFunctionTypeRefBuilder : FirAnnotationContainerBuilder {
    override var source: FirSourceElement? = null
    override val annotations: MutableList<FirAnnotationCall> = mutableListOf()
    var isMarkedNullable: Boolean by kotlin.properties.Delegates.notNull<Boolean>()
    var receiverTypeRef: FirTypeRef? = null
    val valueParameters: MutableList<FirValueParameter> = mutableListOf()
    lateinit var returnTypeRef: FirTypeRef

    override fun build(): FirFunctionTypeRef {
        return FirFunctionTypeRefImpl(
            source,
            annotations,
            isMarkedNullable,
            receiverTypeRef,
            valueParameters,
            returnTypeRef,
        )
    }

}

@UseExperimental(ExperimentalContracts::class)
inline fun buildFunctionTypeRef(init: FirFunctionTypeRefBuilder.() -> Unit): FirFunctionTypeRef {
    contract {
        callsInPlace(init, kotlin.contracts.InvocationKind.EXACTLY_ONCE)
    }
    return FirFunctionTypeRefBuilder().apply(init).build()
}
