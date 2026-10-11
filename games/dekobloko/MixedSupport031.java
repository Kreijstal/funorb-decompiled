/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport031 {
    static String stringState0151;
    static String stringState0152;
    static String stringState0153;
    static boolean booleanState0032;
    static ResourceArchive resourceArchiveState0005;

    final static void performAction0461(int integerArgument1, int integerArgument2, int integerArgument3, byte byteArgument4) {
        if (integerArgument1 != 0) {
          if (1 != integerArgument1) {
            if (2 == integerArgument1 &&
              integerArgument3 != PacketBuffer.integerState0936) {
              PacketBuffer.integerState0936 = integerArgument3;
              MixedSupport114.booleanState0162 = true;
              UiComponentPart019.performAction1173((byte) 120, integerArgument2);
            }
          } else {
            if (MixedSupport153.integerState0932 == integerArgument3) {
              if (2 == integerArgument1 &&
                integerArgument3 != PacketBuffer.integerState0936) {
                PacketBuffer.integerState0936 = integerArgument3;
                MixedSupport114.booleanState0162 = true;
                UiComponentPart019.performAction1173((byte) 120, integerArgument2);
              }
            } else {
              MixedSupport114.booleanState0162 = true;
              MixedSupport153.integerState0932 = integerArgument3;
              UiComponentPart019.performAction1173((byte) 108, integerArgument2);
              if (2 == integerArgument1) {
                if (integerArgument3 == PacketBuffer.integerState0936) {
                  if (byteArgument4 <= 67) {
                    booleanState0032 = false;
                  }
                  return;
                }
                PacketBuffer.integerState0936 = integerArgument3;
                MixedSupport114.booleanState0162 = true;
                UiComponentPart019.performAction1173((byte) 120, integerArgument2);
              }
            }
          }
        } else {
          if (BufferedSocket.integerState0667 != integerArgument3) {
            MixedSupport114.booleanState0162 = true;
            BufferedSocket.integerState0667 = integerArgument3;
            UiComponentPart019.performAction1173((byte) 125, integerArgument2);
          }
          if (1 == integerArgument1 &&
            MixedSupport153.integerState0932 != integerArgument3) {
            MixedSupport114.booleanState0162 = true;
            MixedSupport153.integerState0932 = integerArgument3;
            UiComponentPart019.performAction1173((byte) 108, integerArgument2);
          }
          if (2 == integerArgument1 &&
            integerArgument3 != PacketBuffer.integerState0936) {
            PacketBuffer.integerState0936 = integerArgument3;
            MixedSupport114.booleanState0162 = true;
            UiComponentPart019.performAction1173((byte) 120, integerArgument2);
          }
        }
        if (byteArgument4 > 67) {
          return;
        }
        booleanState0032 = false;
    }

    final static int[] computeIntegerArray0462(int[] integerArrayArgument1, int[] integerArrayArgument2, byte byteArgument3) {
        int integerLocal1 = 0;
        int[] integerArrayLocal2 = null;
        RuntimeException runtimeExceptionLocal3 = null;
        int integerLocal4 = 0;
        int[] integerArrayLocal5 = null;
        int[] integerArrayLocal6 = null;
        int[] stackIntegerArrayLocal7 = null;
        RuntimeException stackRuntimeExceptionLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        StringBuilder stackStringBuilderLocal11 = null;
        String stackStringLocal12 = null;
        RuntimeException caughtExceptionLocal13 = null;
        integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (byteArgument3 < 76) {
            integerArrayLocal5 = (int[]) null;
            MixedSupport031.computeIntegerArray0462((int[]) null, (int[]) null, (byte) -36);
          }
          integerArrayLocal6 = new int[8];
          integerArrayLocal2 = integerArrayLocal6;
          for (integerLocal1 = 0; integerLocal1 < 8; integerLocal1++) {
            integerArrayLocal6[integerLocal1] = MixedSupport079.computeInteger1051(integerArrayArgument2[integerLocal1], integerArrayArgument1[integerLocal1]);
          }
          stackIntegerArrayLocal7 = integerArrayLocal2;
          return stackIntegerArrayLocal7;
        } catch (java.lang.RuntimeException caughtParameterLocal14) {
          caughtExceptionLocal13 = caughtParameterLocal14;
          runtimeExceptionLocal3 = caughtExceptionLocal13;
          stackRuntimeExceptionLocal8 = runtimeExceptionLocal3;
          stackStringBuilderLocal9 = new StringBuilder().append("eg.B(");
          if (integerArrayArgument1 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          stackStringBuilderLocal11 = ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(',');
          if (integerArrayArgument2 == null) {
            stackStringLocal12 = "null";
          } else {
            stackStringLocal12 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal8), ((StringBuilder) (Object) stackStringBuilderLocal11).append(stackStringLocal12).append(',').append(byteArgument3).append(')').toString());
        }
    }

    final static MixedSupport059 computeMixedSupport0590459(byte byteArgument1) {
        if (byteArgument1 != 63) {
          MixedSupport031.computeMixedSupport0590459((byte) 127);
          return (MixedSupport059) ((Object) new MixedSupport026());
        }
        return (MixedSupport059) ((Object) new MixedSupport026());
    }

    public static void performAction0460(int integerArgument1) {
        stringState0151 = null;
        stringState0152 = null;
        if (integerArgument1 != 10140) {
          return;
        }
        resourceArchiveState0005 = null;
        stringState0153 = null;
    }

    static {
        stringState0151 = "Playing";
        stringState0152 = "Game";
        stringState0153 = "Email (Login):";
        booleanState0032 = false;
    }
}
