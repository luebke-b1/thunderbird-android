package app.k9mail.feature.account.setup.ui.autoconfig

import app.k9mail.core.common.domain.usecase.validation.ValidationResult

class FakeAccountAutoConfigValidator(
    private val emailAddressAnswer: ValidationResult = ValidationResult.Success,
    private val passwordAnswer: ValidationResult = ValidationResult.Success,
    private val configurationApprovalAnswer: ValidationResult = ValidationResult.Success,
) : AccountAutoConfigContract.Validator {
    override fun validateEmailAddress(emailAddress: String): ValidationResult = emailAddressAnswer
    override fun validatePassword(password: String): ValidationResult = passwordAnswer
    override fun validateConfigurationApproval(
        isApproved: Boolean?,
        isAutoDiscoveryTrusted: Boolean?,
    ): ValidationResult = configurationApprovalAnswer
}
