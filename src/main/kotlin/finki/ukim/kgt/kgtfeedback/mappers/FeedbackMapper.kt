package finki.ukim.kgt.kgtfeedback.mappers

import finki.ukim.kgt.kgtfeedback.dtos.FeedbackDto
import finki.ukim.kgt.kgtfeedback.models.Feedback
import org.mapstruct.Mapper
import org.mapstruct.MappingTarget
import org.mapstruct.NullValueCheckStrategy
import org.mapstruct.NullValuePropertyMappingStrategy

@Mapper(
    componentModel = "spring",
    nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
    nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
)
interface FeedbackMapper {
    fun toDto(entity: Feedback?): FeedbackDto?
    fun updateEntity(dto: FeedbackDto?, @MappingTarget entity: Feedback?)
}