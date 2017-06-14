package io.github.nobe0716.demo.kotlin.kotlin.repository

import io.github.nobe0716.demo.kotlin.kotlin.domain.SampleFeverEntity
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

/**
 *
 *
 * @author @sunghyo.jung
 */
@RepositoryRestResource(path = "/sample-fevers/")
interface SampleFeverRepository : PagingAndSortingRepository<SampleFeverEntity, Long> {
}