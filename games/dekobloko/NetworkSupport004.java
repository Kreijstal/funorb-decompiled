/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NetworkSupport004 {
    static String stringState0209;
    static int integerState0266;
    static boolean booleanState0065;
    static int[] integerArrayState0052;
    static String[][] stringArrayArrayState0002;
    static volatile long longState0018;

    public static void performAction0661(int integerArgument1) {
        integerArrayState0052 = null;
        if (integerArgument1 != 0) {
          return;
        }
        stringArrayArrayState0002 = (String[][]) null;
        stringState0209 = null;
    }

    final static java.net.URL computeURL0662(java.net.URL uRLArgument1, int integerArgument2, java.applet.Applet appletArgument3) {
        Object objectLocal1 = null;
        Object objectLocal2 = null;
        java.net.URL stackURLLocal3 = null;
        java.net.URL stackURLLocal4 = null;
        Object stackObjectLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        RuntimeException caughtExceptionLocal10 = null;
        Object objectLocal11;
        Object objectLocal12;
        try {
          objectLocal1 = null;
          if (integerArgument2 != -1) {
            stackURLLocal3 = (java.net.URL) null;
            return stackURLLocal3;
          }
          if (null != MixedSupport112.stringState0462 &&
            !MixedSupport112.stringState0462.equals(appletArgument3.getParameter("settings"))) {
            objectLocal1 = MixedSupport112.stringState0462;
            objectLocal2 = objectLocal1;
            objectLocal12 = objectLocal1;
          }
          objectLocal11 = null;
          if (MixedSupport131.stringState0543 != null &&
            !MixedSupport131.stringState0543.equals(appletArgument3.getParameter("session"))) {
            objectLocal11 = MixedSupport131.stringState0543;
          }
          stackURLLocal4 = NetworkSupport011.computeURL1442((String) (objectLocal11), (String) (objectLocal1), false, uRLArgument1, -1);
          return stackURLLocal4;
        } catch (java.lang.RuntimeException caughtParameterLocal13) {
          caughtExceptionLocal10 = caughtParameterLocal13;
          objectLocal1 = caughtExceptionLocal10;
          stackObjectLocal5 = objectLocal1;
          stackStringBuilderLocal6 = new StringBuilder().append("gn.B(");
          if (uRLArgument1 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          stackStringBuilderLocal8 = ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(integerArgument2).append(',');
          if (appletArgument3 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) (stackObjectLocal5), ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(')').toString());
        }
    }

    final static void performAction0663(int integerArgument1) {
        if (integerArgument1 != -29550) {
          return;
        }
        UiComponentPart010.performAction0457((byte) 53);
        CipherPacketBuffer.performAction1868(-4840);
    }

    static {
        stringState0209 = "Stamina Mode";
        longState0018 = 0L;
    }
}
