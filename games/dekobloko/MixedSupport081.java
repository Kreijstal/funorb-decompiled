/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport081 {
    static String stringState0330;
    static String stringState0331;
    static SceneWidget sceneWidgetState0074;
    static String stringState0332;
    static CodecSupport004 codecSupport004State0001;
    static RgbSprite rgbSpriteState0032;
    static SceneWidget sceneWidgetState0075;
    static long longState0029;
    static String stringState0333;

    final static String computeString1083(int integerArgument1, int integerArgument2, PacketBuffer packetBufferArgument3) {
        int integerLocal1 = 0;
        Exception exceptionLocal2 = null;
        RuntimeException runtimeExceptionLocal3 = null;
        byte[] byteArrayLocal4 = null;
        String stringLocal5 = null;
        String stackStringLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException stackRuntimeExceptionLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        Throwable caughtExceptionLocal11 = null;
        try {
          try {
            integerLocal1 = packetBufferArgument3.computeInteger2072(false);
            if (integerLocal1 > integerArgument1) {
              integerLocal1 = integerArgument1;
            }
            byteArrayLocal4 = new byte[integerLocal1];
            packetBufferArgument3.position = packetBufferArgument3.position + NetworkSupport007.mixedSupport068State0001.computeInteger0932(packetBufferArgument3.position, (byte) 91, integerArgument2, byteArrayLocal4, packetBufferArgument3.payload, integerLocal1);
            stringLocal5 = MixedSupport140.computeString1906(byteArrayLocal4, 0, 0, integerLocal1);
            stackStringLocal6 = stringLocal5;
            return stackStringLocal6;
          } catch (java.lang.Exception caughtParameterLocal12) {
            caughtExceptionLocal11 = caughtParameterLocal12;
            exceptionLocal2 = (Exception) (Object) caughtExceptionLocal11;
            stackStringLocal7 = "Cabbage";
            return stackStringLocal7;
          }
        } catch (java.lang.RuntimeException caughtParameterLocal13) {
          caughtExceptionLocal11 = caughtParameterLocal13;
          runtimeExceptionLocal3 = (RuntimeException) (Object) caughtExceptionLocal11;
          stackRuntimeExceptionLocal8 = runtimeExceptionLocal3;
          stackStringBuilderLocal9 = new StringBuilder().append("li.A(").append(integerArgument1).append(',').append(integerArgument2).append(',');
          if (packetBufferArgument3 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal8), ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(')').toString());
        }
    }

    public static void performAction1082(int integerArgument1) {
        codecSupport004State0001 = null;
        rgbSpriteState0032 = null;
        stringState0332 = null;
        sceneWidgetState0074 = null;
        sceneWidgetState0075 = null;
        stringState0330 = null;
        stringState0333 = null;
        int integerLocal1 = 26 % ((integerArgument1 + 65) / 33);
        stringState0331 = null;
    }

    static {
        stringState0331 = "Email is valid";
        stringState0332 = "Report <%0> for abuse";
        stringState0333 = "Status";
        codecSupport004State0001 = null;
        stringState0330 = "You are invited to <%0>'s game.";
    }
}
