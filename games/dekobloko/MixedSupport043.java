/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class MixedSupport043 {
    static boolean booleanState0048;
    static String stringState0185;
    static boolean booleanState0049;
    static long longState0017;
    static boolean booleanState0050;
    static String stringState0186;

    final static void performAction0600(byte byteArgument1, HashNode hashNodeArgument2, HashNode hashNodeArgument3) {
        try {
          int integerLocal1 = 32 % ((byteArgument1 - 60) / 49);
          if (null != hashNodeArgument2.next) {
            hashNodeArgument2.performAction0161((byte) 113);
          }
          hashNodeArgument2.previous = hashNodeArgument3;
          hashNodeArgument2.next = hashNodeArgument3.next;
          hashNodeArgument2.next.previous = hashNodeArgument2;
          hashNodeArgument2.previous.next = hashNodeArgument2;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "fm.J(" + byteArgument1 + ',' + (hashNodeArgument2 != null ? "{...}" : "null") + ',' + (hashNodeArgument3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void performAction0599(byte byteArgument1, int integerArgument2, MixedSupport076 mixedSupport076Argument3) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        CipherPacketBuffer cipherPacketBufferLocal4 = null;
        CipherPacketBuffer cipherPacketBufferLocal5 = null;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        RuntimeException runtimeExceptionLocal10 = null;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          cipherPacketBufferLocal4 = SocketFactory.cipherPacketBufferState0002;
          cipherPacketBufferLocal5 = cipherPacketBufferLocal4;
          cipherPacketBufferLocal5.performAction1861(integerArgument2, -4);
          cipherPacketBufferLocal5.position = cipherPacketBufferLocal5.position + 1;
          integerLocal2 = cipherPacketBufferLocal5.position;
          cipherPacketBufferLocal5.performAction2073(true, 1);
          cipherPacketBufferLocal5.performAction2087(-1, mixedSupport076Argument3.integerState0411);
          cipherPacketBufferLocal5.performAction2087(-1, mixedSupport076Argument3.integerState0414);
          cipherPacketBufferLocal5.performAction2087(-1, mixedSupport076Argument3.integerState0410);
          cipherPacketBufferLocal5.performAction2067(mixedSupport076Argument3.integerState0413, false);
          cipherPacketBufferLocal5.performAction2067(mixedSupport076Argument3.integerState0412, false);
          cipherPacketBufferLocal5.performAction2067(mixedSupport076Argument3.integerState0408, false);
          cipherPacketBufferLocal5.performAction2067(mixedSupport076Argument3.integerState0409, false);
          cipherPacketBufferLocal5.performAction2073(true, mixedSupport076Argument3.integerArrayState0139.length);
          for (integerLocal1 = 0; integerLocal1 < mixedSupport076Argument3.integerArrayState0139.length; integerLocal1++) {
            cipherPacketBufferLocal4.performAction2067(mixedSupport076Argument3.integerArrayState0139[integerLocal1], false);
          }
          cipherPacketBufferLocal5.computeInteger2061((byte) -15, integerLocal2);
          cipherPacketBufferLocal5.performAction2079(cipherPacketBufferLocal5.position - integerLocal2, true);
          if (byteArgument1 > -90) {
            booleanState0049 = true;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal11) {
          caughtExceptionLocal9 = caughtParameterLocal11;
          runtimeExceptionLocal10 = caughtExceptionLocal9;
          stackRuntimeExceptionLocal6 = runtimeExceptionLocal10;
          stackStringBuilderLocal7 = new StringBuilder().append("fm.I(").append(byteArgument1).append(',').append(integerArgument2).append(',');
          if (mixedSupport076Argument3 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(')').toString());
        }
    }

    abstract void performAction0603(PacketBuffer packetBufferArgument1, byte byteArgument2);

    public static void performAction0604(boolean booleanArgument1) {
        stringState0186 = null;
        stringState0185 = null;
        if (!booleanArgument1) {
          MixedSupport076 mixedSupport076Local1 = (MixedSupport076) null;
          MixedSupport043.performAction0599((byte) 8, -15, (MixedSupport076) null);
        }
    }

    abstract MixedSupport048 computeMixedSupport0480601(int integerArgument1);

    final static void performAction0602(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7) {
        int integerLocal1;
        int integerLocal2;
        int integerLocal3;
        int stackIntegerLocal4 = 0;
        int integerLocal5;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (80 > integerArgument5) {
          stackIntegerLocal4 = integerArgument5 / 20 * 18;
        } else {
          stackIntegerLocal4 = 54;
        }
        integerLocal1 = stackIntegerLocal4;
        integerLocal2 = 0;
        if (60 <= integerArgument5) {
          if (integerArgument5 < 80) {
            integerLocal1 = integerLocal1 + MixedSupport148.computeInteger1983(23841, 80, integerArgument7 * 18 + 40);
          } else {
            if (integerArgument5 < 93) {
              integerLocal2 = MixedSupport148.computeInteger1983(23841, 80, 18 * SceneWidgetPart013.integerArrayState0239[1 + integerArgument5 - 80] + 40);
            } else {
              SoftwareRaster.performAction0721(integerArgument2 - 36 - 3, integerArgument3 + 36 - 3, 78, 60, 4, 65280, 100);
            }
          }
        } else {
          integerLocal1 = integerLocal1 + MixedSupport148.computeInteger1983(23841, 80, integerArgument4 * 18 + 40);
        }
        RenderingSupport002.performAction0263(integerArgument1, 2, 5, integerArgument2 + 18, integerArgument3 + 73, -2, -2);
        RenderingSupport002.performAction0263(integerArgument1, 2, 12, 18 + integerArgument2, integerArgument3 + 55, -2, -1);
        RenderingSupport002.performAction0263(integerArgument1, 2, 8, 18 + integerArgument2, 36 + (integerArgument3 + 1), -2, -1);
        RenderingSupport002.performAction0263(integerArgument1, 2, 2, integerArgument2, 1 + integerArgument3 + 72, -1, -2);
        MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument1][2].performAction0302(integerArgument2 - 18, 72 + integerArgument3, 18, 18);
        MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument1][2].performAction0302(-36 + integerArgument2, integerArgument3 + 72, 18, 18);
        integerLocal5 = 16 / ((59 - integerArgument6) / 43);
        MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument1][2].performAction0302(integerArgument2, integerArgument3 + 54, 18, 18);
        MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument1][2].performAction0302(integerArgument2 - 18, integerArgument3 + integerLocal1 + integerLocal2, 18, 18 - integerLocal2);
    }

    static {
        stringState0185 = "In Single-player";
        stringState0186 = "Connection restored.";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void performAction0598(int integerArgument1, HashNode hashNodeArgument2, HashNode hashNodeArgument3) {
        try {
          int integerLocal1 = 32 % ((integerArgument1 - 60) / 49);
          if (null != hashNodeArgument2.next) {
            hashNodeArgument2.performAction0161((byte) 113);
          }
          hashNodeArgument2.previous = hashNodeArgument3;
          hashNodeArgument2.next = hashNodeArgument3.next;
          hashNodeArgument2.next.previous = hashNodeArgument2;
          hashNodeArgument2.previous.next = hashNodeArgument2;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "fm.J(" + integerArgument1 + ',' + (hashNodeArgument2 != null ? "{...}" : "null") + ',' + (hashNodeArgument3 != null ? "{...}" : "null") + ')');
        }
    }
}
