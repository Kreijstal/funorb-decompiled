/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport061 extends TextFieldValidator {
    static String stringState0256;
    static ResourceArchive resourceArchiveState0008;
    static String stringState0257;
    static String stringState0258;
    static boolean booleanState0077;

    public static void performAction0736(int integerArgument1) {
        stringState0256 = null;
        stringState0258 = null;
        if (integerArgument1 == 9369) {
          resourceArchiveState0008 = null;
          stringState0257 = null;
          return;
        }
        MixedSupport061.performAction0736(6);
        resourceArchiveState0008 = null;
        stringState0257 = null;
    }

    final String getValidationMessage(String stringArgument1, byte byteArgument2) {
        RuntimeException runtimeExceptionLocal1 = null;
        String stringLocal2 = null;
        String stackStringLocal3 = null;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        try {
          if (byteArgument2 != -11) {
            stringLocal2 = (String) null;
            this.getValidationStatus((String) null, (byte) -35);
          }
          if (this.getValidationStatus(stringArgument1, (byte) -40) != MixedSupport149.validationStatusState0005) {
            return MixedSupport081.stringState0331;
          }
          stackStringLocal3 = MixedSupport090.stringState0363;
          return stackStringLocal3;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal7 = caughtParameterLocal8;
          runtimeExceptionLocal1 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal1;
          stackStringBuilderLocal5 = new StringBuilder().append("ii.A(");
          if (stringArgument1 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020367((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(byteArgument2).append(')').toString());
        }
    }

    final ValidationStatus getValidationStatus(String stringArgument1, byte byteArgument2) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        int stackIntegerLocal3 = 0;
        ValidationStatus stackValidationStatusLocal4 = null;
        ValidationStatus stackValidationStatusLocal5 = null;
        ValidationStatus stackValidationStatusLocal6 = null;
        RuntimeException stackRuntimeExceptionLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        RuntimeException caughtExceptionLocal10 = null;
        try {
          stackIntegerLocal3 = (null != DekoBlokoClient.computeMixedSupport0660303(stringArgument1, -12828)) ? 0 : 1;
          integerLocal1 = stackIntegerLocal3;
          if (integerLocal1 == 0) {
            stackValidationStatusLocal4 = MixedSupport149.validationStatusState0005;
            return stackValidationStatusLocal4;
          }
          if (byteArgument2 == -40) {
            stackValidationStatusLocal6 = MixedSupport023.validationStatusState0001;
            return stackValidationStatusLocal6;
          }
          stackValidationStatusLocal5 = (ValidationStatus) null;
          return stackValidationStatusLocal5;
        } catch (java.lang.RuntimeException caughtParameterLocal11) {
          caughtExceptionLocal10 = caughtParameterLocal11;
          runtimeExceptionLocal2 = caughtExceptionLocal10;
          stackRuntimeExceptionLocal7 = runtimeExceptionLocal2;
          stackStringBuilderLocal8 = new StringBuilder().append("ii.B(");
          if (stringArgument1 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020367((Throwable) ((Object) stackRuntimeExceptionLocal7), ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',').append(byteArgument2).append(')').toString());
        }
    }

    MixedSupport061(UiComponentPart028 uiComponentPart028Argument1) {
        super(uiComponentPart028Argument1);
    }

    static {
        stringState0256 = "Eliminate Score: ";
        stringState0257 = "Some players haven't unlocked the currently selected game options.<br>Please view the '<%0>' tab on the left for details.";
        stringState0258 = "<%0> is not on your ignore list.";
    }
}
