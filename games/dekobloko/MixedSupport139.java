/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport139 {
    static String stringState0570;
    static int integerState0821;
    static String stringState0571;
    static int integerState0822;
    static SceneWidget[] sceneWidgetArrayState0008;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static byte[] computeByteArray1899(int integerArgument1, byte[] byteArrayArgument2, int integerArgument3, int integerArgument4) {
        int integerLocal1 = 0;
        byte[] byteArrayLocal2 = null;
        int integerLocal3 = 0;
        byte[] byteArrayLocal4 = null;
        byte[] stackByteArrayLocal5 = null;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        RuntimeException runtimeExceptionLocal10 = null;
        RenderingSupport013 renderingSupport013Local11 = null;
        byte[] byteArrayLocal12 = null;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (integerArgument3 > 0) {
            byteArrayLocal4 = new byte[integerArgument4];
            byteArrayLocal2 = byteArrayLocal4;
            for (integerLocal1 = 0; integerArgument4 > integerLocal1; integerLocal1++) {
              byteArrayLocal4[integerLocal1] = byteArrayArgument2[integerArgument3 + integerLocal1];
            }
          } else {
            byteArrayLocal2 = byteArrayArgument2;
          }
          renderingSupport013Local11 = new RenderingSupport013();
          renderingSupport013Local11.performAction1527((byte) -44);
          renderingSupport013Local11.performAction1523(255, byteArrayLocal2, (long)(8 * integerArgument4));
          byteArrayLocal12 = new byte[64];
          renderingSupport013Local11.performAction1522(64767752, integerArgument1, byteArrayLocal12);
          stackByteArrayLocal5 = byteArrayLocal12;
          return stackByteArrayLocal5;
        } catch (java.lang.RuntimeException caughtParameterLocal13) {
          caughtExceptionLocal9 = caughtParameterLocal13;
          runtimeExceptionLocal10 = caughtExceptionLocal9;
          stackRuntimeExceptionLocal6 = runtimeExceptionLocal10;
          stackStringBuilderLocal7 = new StringBuilder().append("um.C(").append(integerArgument1).append(',');
          if (byteArrayArgument2 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',').append(integerArgument3).append(',').append(integerArgument4).append(')').toString());
        }
    }

    final static int computeInteger1898(int integerArgument1, int integerArgument2, int integerArgument3) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = integerArgument2 >> 16;
        if (integerArgument3 == 11469) {
          integerLocal1 = integerArgument2 & 65535;
          integerLocal2 = integerArgument1 >> 16;
          integerLocal3 = integerArgument1 & 65535;
          return integerArgument1 * integerLocal4 + integerLocal1 * integerLocal2 + (integerLocal1 * integerLocal3 >> 16);
        }
        return 84;
    }

    final boolean computeBoolean1900(int integerArgument1) {
        if (integerArgument1 != 22277) {
          return false;
        }
        if (this == MixedSupport092.mixedSupport139State0007) {
          return true;
        }
        if (this == ResourceSupport003.mixedSupport139State0008) {
          return true;
        }
        if (this != SoftwareFramebuffer.mixedSupport139State0012) {
          return false;
        }
        return true;
    }

    public static void performAction1897(int integerArgument1) {
        sceneWidgetArrayState0008 = null;
        if (integerArgument1 != 0) {
          stringState0571 = (String) null;
          stringState0570 = null;
          stringState0571 = null;
          return;
        }
        stringState0570 = null;
        stringState0571 = null;
    }

    static {
        stringState0570 = "Please enter your age in years";
        integerState0821 = 65;
        integerState0822 = 4;
        stringState0571 = "If you are not, please change your password to something more obscure!";
    }
}
