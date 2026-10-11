/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport035 {
    static java.awt.Color colorState0001;
    static String stringState0165;
    static String stringState0166;
    static SceneWidget sceneWidgetState0026;
    static int integerState0219;
    static RgbSprite[][] rgbSpriteArrayArrayState0006;
    static int integerState0220;

    public static void performAction0552(byte byteArgument1) {
        stringState0165 = null;
        sceneWidgetState0026 = null;
        colorState0001 = null;
        if (byteArgument1 > 66) {
          stringState0166 = null;
          rgbSpriteArrayArrayState0006 = (RgbSprite[][]) null;
          return;
        }
        int[] integerArrayLocal1 = (int[]) null;
        MixedSupport035.computeBoolean0553(-7, 19, (int[]) null);
        stringState0166 = null;
        rgbSpriteArrayArrayState0006 = (RgbSprite[][]) null;
    }

    final static boolean computeBoolean0553(int integerArgument1, int integerArgument2, int[] integerArrayArgument3) {
        RuntimeException runtimeExceptionLocal1 = null;
        int[] integerArrayLocal2 = null;
        boolean stackBooleanLocal3 = false;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        try {
          if (integerArgument2 != 10040319) {
            integerArrayLocal2 = (int[]) null;
            MixedSupport035.computeBoolean0553(1, 103, (int[]) null);
          }
          stackBooleanLocal3 = ((integerArrayArgument3[integerArgument1 >> 5] & 1 << (31 & integerArgument1)) == 0);
          return stackBooleanLocal3;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal7 = caughtParameterLocal8;
          runtimeExceptionLocal1 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal1;
          stackStringBuilderLocal5 = new StringBuilder().append("fb.A(").append(integerArgument1).append(',').append(integerArgument2).append(',');
          if (integerArrayArgument3 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(')').toString());
        }
    }

    static {
        stringState0166 = "Hide players in <%0>'s game";
        stringState0165 = "Type your age in years";
        colorState0001 = new java.awt.Color(10040319);
        rgbSpriteArrayArrayState0006 = new RgbSprite[8][8];
    }
}
