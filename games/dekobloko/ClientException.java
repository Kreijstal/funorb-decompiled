/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ClientException {
    int integerState0139;
    static int integerState0140;
    static int integerState0141;
    static int integerState0142;
    static String[] stringArrayState0006;
    static SceneWidget[] sceneWidgetArrayState0001;

    final static void performAction0401(BitmapFont bitmapFontArgument1, int integerArgument2, int integerArgument3, MixedSupport015 mixedSupport015Argument4, MixedSupport015 mixedSupport015Argument5, MixedSupport015 mixedSupport015Argument6, int integerArgument7, int integerArgument8, BitmapFont bitmapFontArgument9, int integerArgument10, int integerArgument11, int integerArgument12, int integerArgument13, boolean booleanArgument14, int integerArgument15, int integerArgument16, int integerArgument17, int integerArgument18, int integerArgument19, int integerArgument20) {
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        StringBuilder stackStringBuilderLocal10 = null;
        String stackStringLocal11 = null;
        RuntimeException caughtExceptionLocal12 = null;
        RuntimeException runtimeExceptionLocal13 = null;
        try {
          SoftwareFramebuffer.bitmapFontState0021 = bitmapFontArgument1;
          if (booleanArgument14) {
            ClientException.performAction0401((BitmapFont) null, 99, -109, (MixedSupport015) null, (MixedSupport015) null, (MixedSupport015) null, 54, -67, (BitmapFont) null, 70, -37, -96, -83, true, 8, 108, -4, 38, -94, -69);
          }
          NetworkSupport001.bitmapFontState0003 = bitmapFontArgument9;
          MixedSupport042.performAction0597(integerArgument15, integerArgument18, integerArgument20, 0, integerArgument11);
          MixedSupport149.performAction1988(mixedSupport015Argument5, integerArgument12, integerArgument2, -11);
          MixedSupport086.performAction1201(integerArgument10, integerArgument16, (byte) -118, mixedSupport015Argument6, integerArgument3, mixedSupport015Argument4);
          RenderingSupport015.performAction1776(integerArgument8, -25073, integerArgument19);
          MixedSupport111.performAction1574(integerArgument17, -115, integerArgument7, integerArgument13);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal14) {
          caughtExceptionLocal12 = caughtParameterLocal14;
          runtimeExceptionLocal13 = caughtExceptionLocal12;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal13;
          stackStringBuilderLocal2 = new StringBuilder().append("dh.B(");
          if (bitmapFontArgument1 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          stackStringBuilderLocal4 = ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',');
          if (mixedSupport015Argument4 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          stackStringBuilderLocal6 = ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',');
          if (mixedSupport015Argument5 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          stackStringBuilderLocal8 = ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',');
          if (mixedSupport015Argument6 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          stackStringBuilderLocal10 = ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',').append(integerArgument7).append(',').append(integerArgument8).append(',');
          if (bitmapFontArgument9 == null) {
            stackStringLocal11 = "null";
          } else {
            stackStringLocal11 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal10).append(stackStringLocal11).append(',').append(integerArgument10).append(',').append(integerArgument11).append(',').append(integerArgument12).append(',').append(integerArgument13).append(',').append(booleanArgument14).append(',').append(integerArgument15).append(',').append(integerArgument16).append(',').append(integerArgument17).append(',').append(integerArgument18).append(',').append(integerArgument19).append(',').append(integerArgument20).append(')').toString());
        }
    }

    public static void performAction0399(byte byteArgument1) {
        sceneWidgetArrayState0001 = null;
        stringArrayState0006 = null;
        if (byteArgument1 != -68) {
          ClientException.performAction0401((BitmapFont) null, -53, 78, (MixedSupport015) null, (MixedSupport015) null, (MixedSupport015) null, -74, -100, (BitmapFont) null, 108, -57, 96, -30, true, 2, 34, -16, -53, -123, 32);
        }
    }

    final static DiagnosticSupport002 computeDiagnosticSupport0020400(Throwable throwableArgument1, String stringArgument2) {
        DiagnosticSupport002 diagnosticSupport002Local1 = null;
        if (throwableArgument1 instanceof DiagnosticSupport002) {
          diagnosticSupport002Local1 = (DiagnosticSupport002) ((Object) throwableArgument1);
          diagnosticSupport002Local1.stringState0270 = diagnosticSupport002Local1.stringState0270 + ' ' + stringArgument2;
        } else {
          diagnosticSupport002Local1 = new DiagnosticSupport002(throwableArgument1, stringArgument2);
        }
        return diagnosticSupport002Local1;
    }

    static {
        integerState0142 = -1;
    }
}
