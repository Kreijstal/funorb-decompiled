/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport070 {
    static String stringState0293;
    static SceneWidget sceneWidgetState0068;
    static MixedSupport121 mixedSupport121State0001;
    static String stringState0294;
    static String stringState0295;
    static int[] integerArrayState0119;
    static AsyncTask asyncTaskState0004;
    static SceneWidgetPart010 sceneWidgetPart010State0003;

    public static void performAction0942(int integerArgument1) {
        stringState0293 = null;
        if (integerArgument1 == -5161) {
          integerArrayState0119 = null;
          stringState0294 = null;
          asyncTaskState0004 = null;
          stringState0295 = null;
          sceneWidgetState0068 = null;
          sceneWidgetPart010State0003 = null;
          mixedSupport121State0001 = null;
          return;
        }
        sceneWidgetPart010State0003 = (SceneWidgetPart010) null;
        integerArrayState0119 = null;
        stringState0294 = null;
        asyncTaskState0004 = null;
        stringState0295 = null;
        sceneWidgetState0068 = null;
        sceneWidgetPart010State0003 = null;
        mixedSupport121State0001 = null;
    }

    final static boolean computeBoolean0943(String stringArgument1, boolean booleanArgument2) {
        RuntimeException runtimeExceptionLocal1 = null;
        CharSequence charSequenceLocal2 = null;
        boolean stackBooleanLocal3 = false;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        try {
          if (!booleanArgument2) {
            return false;
          }
          charSequenceLocal2 = (CharSequence) ((Object) stringArgument1);
          stackBooleanLocal3 = MixedSupport051.stringState0212.equals(ComponentContainer.computeString1011(charSequenceLocal2, (byte) 2));
          return stackBooleanLocal3;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal7 = caughtParameterLocal8;
          runtimeExceptionLocal1 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal1;
          stackStringBuilderLocal5 = new StringBuilder().append("k.A(");
          if (stringArgument1 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(booleanArgument2).append(')').toString());
        }
    }

    final static void performAction0941(byte byteArgument1) {
        if (byteArgument1 != -36) {
          asyncTaskState0004 = (AsyncTask) null;
          LoginCredentials.performAction0894(UiComponentPart029.computeApplet1689(25144), 0);
          return;
        }
        LoginCredentials.performAction0894(UiComponentPart029.computeApplet1689(25144), 0);
    }

    static {
        stringState0294 = "Accept rematch";
        stringState0293 = "Security";
        mixedSupport121State0001 = new MixedSupport121(1);
        stringState0295 = null;
    }
}
