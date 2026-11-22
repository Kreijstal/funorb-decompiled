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

    final static void performAction0542(byte byteArgument1, HashNode hashNodeArgument2, HashNode hashNodeArgument3) {
        try {
          int integerLocal1 = 32 % ((byteArgument1 - 60) / 49);
          if (null != hashNodeArgument2.next) {
            hashNodeArgument2.unlink((byte) 113);
          }
          hashNodeArgument2.previous = hashNodeArgument3;
          hashNodeArgument2.next = hashNodeArgument3.next;
          hashNodeArgument2.next.previous = hashNodeArgument2;
          hashNodeArgument2.previous.next = hashNodeArgument2;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "fm.J(" + byteArgument1 + ',' + (hashNodeArgument2 != null ? "{...}" : "null") + ',' + (hashNodeArgument3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void performAction0541(byte byteArgument1, int integerArgument2, MixedSupport072 mixedSupport072Argument3) {
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
          cipherPacketBufferLocal5.performAction1641(integerArgument2, -4);
          cipherPacketBufferLocal5.position = cipherPacketBufferLocal5.position + 1;
          integerLocal2 = cipherPacketBufferLocal5.position;
          cipherPacketBufferLocal5.writeByte(true, 1);
          cipherPacketBufferLocal5.writeShort(-1, mixedSupport072Argument3.integerState0411);
          cipherPacketBufferLocal5.writeShort(-1, mixedSupport072Argument3.integerState0414);
          cipherPacketBufferLocal5.writeShort(-1, mixedSupport072Argument3.integerState0410);
          cipherPacketBufferLocal5.writeInt(mixedSupport072Argument3.integerState0413, false);
          cipherPacketBufferLocal5.writeInt(mixedSupport072Argument3.integerState0412, false);
          cipherPacketBufferLocal5.writeInt(mixedSupport072Argument3.integerState0408, false);
          cipherPacketBufferLocal5.writeInt(mixedSupport072Argument3.integerState0409, false);
          cipherPacketBufferLocal5.writeByte(true, mixedSupport072Argument3.integerArrayState0139.length);
          for (integerLocal1 = 0; integerLocal1 < mixedSupport072Argument3.integerArrayState0139.length; integerLocal1++) {
            cipherPacketBufferLocal4.writeInt(mixedSupport072Argument3.integerArrayState0139[integerLocal1], false);
          }
          cipherPacketBufferLocal5.appendCrc32((byte) -15, integerLocal2);
          cipherPacketBufferLocal5.writeLengthByte(cipherPacketBufferLocal5.position - integerLocal2, true);
          if (byteArgument1 > -90) {
            booleanState0049 = true;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal11) {
          caughtExceptionLocal9 = caughtParameterLocal11;
          runtimeExceptionLocal10 = caughtExceptionLocal9;
          stackRuntimeExceptionLocal6 = runtimeExceptionLocal10;
          stackStringBuilderLocal7 = new StringBuilder().append("fm.I(").append(byteArgument1).append(',').append(integerArgument2).append(',');
          if (mixedSupport072Argument3 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(')').toString());
        }
    }

    abstract void performAction0545(PacketBuffer packetBufferArgument1, byte byteArgument2);

    public static void performAction0546(boolean booleanArgument1) {
        stringState0186 = null;
        stringState0185 = null;
        if (!booleanArgument1) {
          MixedSupport072 mixedSupport072Local1 = (MixedSupport072) null;
          MixedSupport043.performAction0541((byte) 8, -15, (MixedSupport072) null);
        }
    }

    abstract MixedSupport048 computeMixedSupport0480543(int integerArgument1);

    final static void performAction0544(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7) {
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
            integerLocal1 = integerLocal1 + MixedSupport141.computeInteger1754(23841, 80, integerArgument7 * 18 + 40);
          } else {
            if (integerArgument5 < 93) {
              integerLocal2 = MixedSupport141.computeInteger1754(23841, 80, 18 * SceneWidgetPart013.integerArrayState0239[1 + integerArgument5 - 80] + 40);
            } else {
              SoftwareRaster.performAction0642(integerArgument2 - 36 - 3, integerArgument3 + 36 - 3, 78, 60, 4, 65280, 100);
            }
          }
        } else {
          integerLocal1 = integerLocal1 + MixedSupport141.computeInteger1754(23841, 80, integerArgument4 * 18 + 40);
        }
        RenderingSupport002.performAction0243(integerArgument1, 2, 5, integerArgument2 + 18, integerArgument3 + 73, -2, -2);
        RenderingSupport002.performAction0243(integerArgument1, 2, 12, 18 + integerArgument2, integerArgument3 + 55, -2, -1);
        RenderingSupport002.performAction0243(integerArgument1, 2, 8, 18 + integerArgument2, 36 + (integerArgument3 + 1), -2, -1);
        RenderingSupport002.performAction0243(integerArgument1, 2, 2, integerArgument2, 1 + integerArgument3 + 72, -1, -2);
        MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument1][2].performAction0280(integerArgument2 - 18, 72 + integerArgument3, 18, 18);
        MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument1][2].performAction0280(-36 + integerArgument2, integerArgument3 + 72, 18, 18);
        integerLocal5 = 16 / ((59 - integerArgument6) / 43);
        MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument1][2].performAction0280(integerArgument2, integerArgument3 + 54, 18, 18);
        MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument1][2].performAction0280(integerArgument2 - 18, integerArgument3 + integerLocal1 + integerLocal2, 18, 18 - integerLocal2);
    }

    static {
        stringState0185 = "In Single-player";
        stringState0186 = "Connection restored.";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void performAction0540(int integerArgument1, HashNode hashNodeArgument2, HashNode hashNodeArgument3) {
        try {
          int integerLocal1 = 32 % ((integerArgument1 - 60) / 49);
          if (null != hashNodeArgument2.next) {
            hashNodeArgument2.unlink((byte) 113);
          }
          hashNodeArgument2.previous = hashNodeArgument3;
          hashNodeArgument2.next = hashNodeArgument3.next;
          hashNodeArgument2.next.previous = hashNodeArgument2;
          hashNodeArgument2.previous.next = hashNodeArgument2;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "fm.J(" + integerArgument1 + ',' + (hashNodeArgument2 != null ? "{...}" : "null") + ',' + (hashNodeArgument3 != null ? "{...}" : "null") + ')');
        }
    }
}
