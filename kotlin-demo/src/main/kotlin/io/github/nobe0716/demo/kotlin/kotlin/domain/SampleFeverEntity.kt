package io.github.nobe0716.demo.kotlin.kotlin.domain

import javax.persistence.Entity
import javax.persistence.Id

/**
 *
 *
 * @author @sunghyo.jung
 */
@Entity(name = "sample_fever")
class SampleFeverEntity(
		@Id	var id: Long,
		var name: String,
		var uid: Number) {
	override fun toString(): String {
		return "SampleFeverEntity(id=$id, name='$name', uid=$uid)"
	}
}