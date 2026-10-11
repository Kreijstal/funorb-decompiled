/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class Framebuffer {
    int integerState0190;
    int[] integerArrayState0040;
    int integerState0191;
    java.awt.Image imageState0001;
    static MixedSupport066 mixedSupport066State0002;
    static boolean[][] booleanArrayArrayState0002;
    static String stringState0154;
    static String stringState0155;
    static RenderingSupport011 renderingSupport011State0001;
    static int integerState0192;

    final void performAction0463(byte byteArgument1) {
        if (byteArgument1 > -82) {
          this.performAction0463((byte) 23);
        }
        SoftwareRaster.performAction0724(this.integerArrayState0040, this.integerState0190, this.integerState0191);
    }

    abstract void performAction0467(int integerArgument1, byte byteArgument2, int integerArgument3, java.awt.Component componentArgument4);

    final static void performAction0465(byte byteArgument1, byte[] byteArrayArgument2) {
        byte cachedByteLocal1 = 0;
        byte cachedByteLocal2 = 0;
        int stackIntegerLocal3 = 0;
        int stackIntegerLocal4 = 0;
        int stackIntegerLocal5 = 0;
        int stackIntegerLocal6 = 0;
        RuntimeException stackRuntimeExceptionLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        RuntimeException caughtExceptionLocal10 = null;
        RuntimeException runtimeExceptionLocal11 = null;
        int integerLocal12 = 0;
        int integerLocal13 = 0;
        int integerLocal14 = 0;
        int integerLocal15 = 0;
        int integerLocal16 = 0;
        byte[] byteArrayLocal17 = null;
        byte[] byteArrayLocal18 = null;
        int integerLocal19 = 0;
        int integerLocal20 = 0;
        int integerLocal21 = 0;
        int integerLocal22 = 0;
        int integerLocal23 = 0;
        int integerLocal24 = 0;
        PacketBuffer packetBufferLocal25 = null;
        PacketBuffer packetBufferLocal26 = null;
        byte[] byteArrayLocal27 = null;
        byte[] byteArrayLocal28 = null;
        byte[] byteArrayLocal29 = null;
        byte[] byteArrayLocal30 = null;
        int integerLocal31;
        int integerLocal32;
        int integerLocal33;
        int integerLocal34;
        int integerLocal35;
        integerLocal24 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (byteArgument1 != -72) {
            integerState0192 = 89;
          }
          packetBufferLocal25 = new PacketBuffer(byteArrayArgument2);
          packetBufferLocal26 = packetBufferLocal25;
          packetBufferLocal26.position = -2 + byteArrayArgument2.length;
          GameDomainSupport002.integerState0177 = packetBufferLocal26.computeInteger2089(3);
          MixedSupport022.booleanArrayState0004 = new boolean[GameDomainSupport002.integerState0177];
          InputAdapter006.integerArrayState0206 = new int[GameDomainSupport002.integerState0177];
          MixedSupport039.integerArrayState0047 = new int[GameDomainSupport002.integerState0177];
          MixedSupport130.integerArrayState0208 = new int[GameDomainSupport002.integerState0177];
          MixedSupport052.integerArrayState0054 = new int[GameDomainSupport002.integerState0177];
          MixedSupport102.byteArrayArrayState0007 = new byte[GameDomainSupport002.integerState0177][];
          SceneWidgetPart011.byteArrayArrayState0008 = new byte[GameDomainSupport002.integerState0177][];
          packetBufferLocal26.position = -(GameDomainSupport002.integerState0177 * 8) + (byteArrayArgument2.length - 7);
          MixedSupport029.integerState0181 = packetBufferLocal26.computeInteger2089(3);
          MixedSupport057.integerState0297 = packetBufferLocal26.computeInteger2089(3);
          integerLocal12 = 1 + (packetBufferLocal26.computeInteger2085((byte) -104) & 255);
          for (integerLocal13 = 0; integerLocal13 < GameDomainSupport002.integerState0177; integerLocal13++) {
            InputAdapter006.integerArrayState0206[integerLocal13] = packetBufferLocal25.computeInteger2089(MixedSupport111.computeInteger1576((int) byteArgument1, -69));
          }
          for (integerLocal31 = 0; GameDomainSupport002.integerState0177 > integerLocal31; integerLocal31++) {
            MixedSupport039.integerArrayState0047[integerLocal31] = packetBufferLocal26.computeInteger2089(MixedSupport111.computeInteger1576((int) byteArgument1, -69));
          }
          for (integerLocal32 = 0; integerLocal32 < GameDomainSupport002.integerState0177; integerLocal32++) {
            MixedSupport130.integerArrayState0208[integerLocal32] = packetBufferLocal26.computeInteger2089(3);
          }
          for (integerLocal33 = 0; GameDomainSupport002.integerState0177 > integerLocal33; integerLocal33++) {
            MixedSupport052.integerArrayState0054[integerLocal33] = packetBufferLocal26.computeInteger2089(3);
          }
          packetBufferLocal26.position = -(3 * (integerLocal12 - 1)) + (byteArrayArgument2.length - (7 + GameDomainSupport002.integerState0177 * 8));
          NetworkSupport006.integerArrayState0152 = new int[integerLocal12];
          for (integerLocal34 = 1; integerLocal12 > integerLocal34; integerLocal34++) {
            NetworkSupport006.integerArrayState0152[integerLocal34] = packetBufferLocal26.computeInteger2095(byteArgument1 + 65352);
            if (0 == NetworkSupport006.integerArrayState0152[integerLocal34]) {
              NetworkSupport006.integerArrayState0152[integerLocal34] = 1;
            }
          }
          packetBufferLocal26.position = 0;
          for (integerLocal35 = 0; GameDomainSupport002.integerState0177 > integerLocal35; integerLocal35++) {
            integerLocal14 = MixedSupport130.integerArrayState0208[integerLocal35];
            integerLocal15 = MixedSupport052.integerArrayState0054[integerLocal35];
            integerLocal16 = integerLocal14 * integerLocal15;
            byteArrayLocal29 = new byte[integerLocal16];
            byteArrayLocal27 = byteArrayLocal29;
            byteArrayLocal17 = byteArrayLocal27;
            SceneWidgetPart011.byteArrayArrayState0008[integerLocal35] = byteArrayLocal29;
            byteArrayLocal30 = new byte[integerLocal16];
            byteArrayLocal28 = byteArrayLocal30;
            byteArrayLocal18 = byteArrayLocal28;
            MixedSupport102.byteArrayArrayState0007[integerLocal35] = byteArrayLocal30;
            integerLocal19 = 0;
            integerLocal20 = packetBufferLocal26.computeInteger2085((byte) -35);
            if ((integerLocal20 & 1) == 0) {
              for (integerLocal21 = 0; integerLocal16 > integerLocal21; integerLocal21++) {
                byteArrayLocal17[integerLocal21] = packetBufferLocal26.computeByte2093((byte) -127);
              }
              if ((integerLocal20 & 2) != 0) {
                for (integerLocal21 = 0; integerLocal21 < integerLocal16; integerLocal21++) {
                  cachedByteLocal1 = packetBufferLocal26.computeByte2093((byte) -119);
                  byteArrayLocal18[integerLocal21] = cachedByteLocal1;
                  integerLocal22 = cachedByteLocal1;
                  stackIntegerLocal3 = integerLocal19;
                  if (integerLocal22 == -1) {
                    stackIntegerLocal4 = 0;
                  } else {
                    stackIntegerLocal4 = 1;
                  }
                  integerLocal19 = stackIntegerLocal3 | stackIntegerLocal4;
                }
              }
            } else {
              for (integerLocal21 = 0; integerLocal14 > integerLocal21; integerLocal21++) {
                for (integerLocal22 = 0; integerLocal22 < integerLocal15; integerLocal22++) {
                  byteArrayLocal17[integerLocal22 * integerLocal14 + integerLocal21] = packetBufferLocal26.computeByte2093((byte) -124);
                }
              }
              if ((2 & integerLocal20) != 0) {
                for (integerLocal21 = 0; integerLocal14 > integerLocal21; integerLocal21++) {
                  for (integerLocal22 = 0; integerLocal15 > integerLocal22; integerLocal22++) {
                    cachedByteLocal2 = packetBufferLocal26.computeByte2093((byte) -115);
                    byteArrayLocal18[integerLocal21 + integerLocal22 * integerLocal14] = cachedByteLocal2;
                    integerLocal23 = cachedByteLocal2;
                    stackIntegerLocal5 = integerLocal19;
                    if (-1 == integerLocal23) {
                      stackIntegerLocal6 = 0;
                    } else {
                      stackIntegerLocal6 = 1;
                    }
                    integerLocal19 = stackIntegerLocal5 | stackIntegerLocal6;
                  }
                }
              }
            }
            MixedSupport022.booleanArrayState0004[integerLocal35] = integerLocal19 != 0;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal36) {
          caughtExceptionLocal10 = caughtParameterLocal36;
          runtimeExceptionLocal11 = caughtExceptionLocal10;
          stackRuntimeExceptionLocal7 = runtimeExceptionLocal11;
          stackStringBuilderLocal8 = new StringBuilder().append("eh.M(").append(byteArgument1).append(',');
          if (byteArrayArgument2 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal7), ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(')').toString());
        }
    }

    abstract void performAction0464(byte byteArgument1, java.awt.Graphics graphicsArgument2, int integerArgument3, int integerArgument4);

    public static void performAction0466(int integerArgument1) {
        stringState0154 = null;
        stringState0155 = null;
        booleanArrayArrayState0002 = (boolean[][]) null;
        mixedSupport066State0002 = null;
        renderingSupport011State0001 = null;
        if (integerArgument1 != 24744) {
          Framebuffer.performAction0466(125);
        }
    }

    static {
        mixedSupport066State0002 = new MixedSupport066();
        stringState0154 = "Shape feedback:";
    }
}
