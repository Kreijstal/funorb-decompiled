/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport071 {
    static String stringState0298;
    static MixedSupport139 mixedSupport139State0003;
    static int integerState0356;
    static String stringState0299;
    static String stringState0300;
    static String stringState0301;
    static SceneWidgetPart001 sceneWidgetPart001State0001;
    static int[] integerArrayState0120;
    static java.applet.Applet appletState0001;

    final static byte[] computeByteArray0954(int integerArgument1, String stringArgument2) {
        RuntimeException runtimeExceptionLocal1 = null;
        byte[] stackByteArrayLocal2 = null;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        try {
          if (integerArgument1 >= -14) {
            MixedSupport071.performAction0953(95);
          }
          stackByteArrayLocal2 = MixedSupport101.resourceArchiveState0014.computeByteArray0916(0, stringArgument2, "");
          return stackByteArrayLocal2;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal6 = caughtParameterLocal7;
          runtimeExceptionLocal1 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal1;
          stackStringBuilderLocal4 = new StringBuilder().append("kb.B(").append(integerArgument1).append(',');
          if (stringArgument2 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(')').toString());
        }
    }

    public static void performAction0953(int integerArgument1) {
        if (integerArgument1 <= -85) {
          stringState0298 = null;
          stringState0299 = null;
          stringState0300 = null;
          integerArrayState0120 = null;
          mixedSupport139State0003 = null;
          appletState0001 = null;
          sceneWidgetPart001State0001 = null;
          stringState0301 = null;
          return;
        }
        integerState0356 = -67;
        stringState0298 = null;
        stringState0299 = null;
        stringState0300 = null;
        integerArrayState0120 = null;
        mixedSupport139State0003 = null;
        appletState0001 = null;
        sceneWidgetPart001State0001 = null;
        stringState0301 = null;
    }

    static {
        stringState0298 = "Data server full or too many connections from your address. Please try again in a few minutes.";
        mixedSupport139State0003 = new MixedSupport139();
        stringState0300 = "Your request to join has been declined.";
        integerArrayState0120 = new int[8192];
        stringState0301 = "You can get other special items by popping two or more shapes in one go.";
        stringState0299 = "Close";
    }
}
