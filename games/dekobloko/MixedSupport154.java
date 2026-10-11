/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport154 {
    static String stringState0622;
    static int integerState0933;

    final static void performAction2041(byte byteArgument1, ResourceArchive resourceArchiveArgument2) {
        VorbisSample vorbisSampleLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        try {
          VorbisSample.performAction1921(resourceArchiveArgument2.computeByteArray0916(byteArgument1 ^ -51, "", "headers.packvorbis"));
          vorbisSampleLocal1 = VorbisSample.computeVorbisSample1916(resourceArchiveArgument2, "jagex logo2.packvorbis", "");
          vorbisSampleLocal1.computeRawSound1912();
          if (byteArgument1 == -51) {
            return;
          }
          integerState0933 = -123;
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal6 = caughtParameterLocal7;
          runtimeExceptionLocal2 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal2;
          stackStringBuilderLocal4 = new StringBuilder().append("wi.A(").append(byteArgument1).append(',');
          if (resourceArchiveArgument2 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(')').toString());
        }
    }

    final static MixedSupport016 computeMixedSupport0162045(String[] args, int integerArgument2) {
        MixedSupport016 mixedSupport016Local1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        MixedSupport016 stackMixedSupport016Local3 = null;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        try {
          if (integerArgument2 != -3) {
            integerState0933 = 29;
          }
          mixedSupport016Local1 = new MixedSupport016(false);
          mixedSupport016Local1.stringArrayState0003 = args;
          stackMixedSupport016Local3 = mixedSupport016Local1;
          return stackMixedSupport016Local3;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal7 = caughtParameterLocal8;
          runtimeExceptionLocal2 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal2;
          stackStringBuilderLocal5 = new StringBuilder().append("wi.B(");
          if (args == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(integerArgument2).append(')').toString());
        }
    }

    final static boolean computeBoolean2043(int integerArgument1, String stringArgument2) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        CharSequence charSequenceLocal3 = null;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        try {
          if (!LoginCredentials.booleanState0085) {
            return false;
          }
          if (NetworkSupport010.integerState0585 == 2 &&
            TextLayout.stringState0081 != null) {
            charSequenceLocal3 = (CharSequence) ((Object) stringArgument2);
            if (TextLayout.stringState0081.equals(ComponentContainer.computeString1011(charSequenceLocal3, (byte) 2))) {
              integerLocal1 = 82 / ((-50 - integerArgument1) / 34);
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal7 = caughtParameterLocal8;
          runtimeExceptionLocal2 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal2;
          stackStringBuilderLocal5 = new StringBuilder().append("wi.E(").append(integerArgument1).append(',');
          if (stringArgument2 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(')').toString());
        }
    }

    public static void performAction2042(int integerArgument1) {
        stringState0622 = null;
        if (integerArgument1 != 0) {
          String[] stringArrayLocal1 = (String[]) null;
          MixedSupport154.computeMixedSupport0162045((String[]) null, 103);
        }
    }

    final static void performAction2044(boolean booleanArgument1, int integerArgument2, String stringArgument3) {
        try {
          MixedSupport023.booleanState0025 = booleanArgument1;
          SceneWidgetPart007.booleanState0113 = true;
          MixedSupport020.uiComponentPart012State0001 = new UiComponentPart012(MixedSupport005.uiComponentPart016State0001, GameDomainSupport002.bitmapFontState0012, stringArgument3, UiComponentPart032.booleanState0198, MixedSupport023.booleanState0025);
          MixedSupport005.uiComponentPart016State0001.performAction0945((byte) -115, MixedSupport020.uiComponentPart012State0001);
          if (integerArgument2 > -20) {
            integerState0933 = -117;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "wi.C(" + booleanArgument1 + ',' + integerArgument2 + ',' + (stringArgument3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        stringState0622 = "to keep fullscreen or";
        integerState0933 = 0;
    }
}
