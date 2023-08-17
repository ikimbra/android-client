package com.mifos.repositories

import com.mifos.api.GenericResponse
import com.mifos.objects.noncore.Identifier
import rx.Observable

/**
 * Created by Aditya Gupta on 08/08/23.
 */
interface ClientIdentifiersRepository {

    fun getClientIdentifiers(clientId: Int): Observable<List<Identifier>>

    fun deleteClientIdentifier(clientId: Int, identifierId: Int): Observable<GenericResponse>
}