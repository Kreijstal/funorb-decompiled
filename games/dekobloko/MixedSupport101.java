/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport101 {
    static String stringState0407;
    static String stringState0408;
    static ResourceArchive resourceArchiveState0014;
    static String stringState0409;
    static String stringState0410;
    static String stringState0411;

    final static String computeString1390(int integerArgument1) {
        if (GameAssets.mixedSupport004State0004 == UiComponentPart022.mixedSupport004State0003) {
          return SceneWidgetPart013.stringState0586;
        }
        if (integerArgument1 != 2) {
          return (String) null;
        }
        return SceneWidgetPart011.stringState0525;
    }

    public static void performAction1389(byte byteArgument1) {
        stringState0408 = null;
        stringState0409 = null;
        if (byteArgument1 >= -9) {
          return;
        }
        stringState0410 = null;
        resourceArchiveState0014 = null;
        stringState0407 = null;
        stringState0411 = null;
    }

    final static boolean computeBoolean1391(int integerArgument1, int integerArgument2, long longArgument3, String stringArgument4, int[] integerArrayArgument5) {
        RuntimeException runtimeExceptionLocal1 = null;
        boolean stackBooleanLocal2 = false;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        try {
          if (integerArgument2 != 2) {
            stringState0409 = (String) null;
          }
          boolean frameRemainderLocal9 = true;
          if (integerArrayArgument5 != null && (integerArgument1 != 2 ||
            InputAdapter006.computeBoolean1695(stringArgument4, 120, longArgument3))) {
            stackBooleanLocal2 = true;
            frameRemainderLocal9 = false;
          }
          else {
            stackBooleanLocal2 = false;
          }
          return stackBooleanLocal2;
        } catch (java.lang.RuntimeException caughtParameterLocal10) {
          caughtExceptionLocal8 = caughtParameterLocal10;
          runtimeExceptionLocal1 = caughtExceptionLocal8;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal1;
          stackStringBuilderLocal4 = new StringBuilder().append("pc.C(").append(integerArgument1).append(',').append(integerArgument2).append(',').append(longArgument3).append(',');
          if (stringArgument4 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          stackStringBuilderLocal6 = ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',');
          if (integerArrayArgument5 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(')').toString());
        }
    }

    static {
        stringState0407 = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
        stringState0408 = "Private";
        stringState0409 = "FINISH<br><%0>";
        stringState0410 = "Change display name";
        stringState0411 = "Return to Main Menu";
    }
}
