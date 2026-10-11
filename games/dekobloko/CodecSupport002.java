/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CodecSupport002 {
    private MixedSupport080[] mixedSupport080ArrayState0001;
    private PacketBuffer packetBufferState0005;
    static byte[] byteArrayState0017;
    private CacheWorkQueue cacheWorkQueueState0002;
    static String stringState0360;
    static String stringState0361;
    private ResourceSupport004 resourceSupport004State0002;
    private NetworkSupport003 networkSupport003State0002;
    private java.math.BigInteger bigIntegerState0002;
    private java.math.BigInteger bigIntegerState0003;

    public static void performAction1244(byte byteArgument1) {
        byteArrayState0017 = null;
        stringState0360 = null;
        stringState0361 = null;
        if (byteArgument1 != 0) {
          byteArrayState0017 = (byte[]) null;
        }
    }

    final static int computeInteger1247(int integerArgument1, int integerArgument2, boolean booleanArgument3, int integerArgument4) {
        if (integerArgument1 != 255) {
          return -17;
        }
        return MixedSupport111.computeInteger1571((byte) 57);
    }

    final boolean computeBoolean1248(boolean booleanArgument1) {
        int integerLocal1 = 0;
        int integerLocal2;
        byte[] byteArrayLocal3;
        byte[] byteArrayLocal4;
        java.math.BigInteger bigIntegerLocal5;
        int integerLocal6;
        PacketBuffer packetBufferLocal7;
        byte[] byteArrayLocal8;
        java.math.BigInteger bigIntegerLocal9;
        byte[] byteArrayLocal10;
        byte[] byteArrayLocal11;
        integerLocal6 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (null != this.packetBufferState0005) {
          return true;
        }
        if (null == this.resourceSupport004State0002) {
          if (this.networkSupport003State0002.computeBoolean0378(true)) {
            return false;
          }
          this.resourceSupport004State0002 = this.networkSupport003State0002.computeResourceSupport0040379(true, (byte) 0, booleanArgument1, 255, 255);
        }
        if (this.resourceSupport004State0002.booleanState0173) {
          return false;
        }
        packetBufferLocal7 = new PacketBuffer(this.resourceSupport004State0002.computeByteArray0518((byte) 113));
        packetBufferLocal7.position = 5;
        integerLocal2 = packetBufferLocal7.computeInteger2085((byte) -69);
        packetBufferLocal7.position = packetBufferLocal7.position + integerLocal2 * 72;
        byteArrayLocal10 = new byte[-packetBufferLocal7.position + packetBufferLocal7.payload.length];
        byteArrayLocal8 = byteArrayLocal10;
        byteArrayLocal3 = byteArrayLocal8;
        packetBufferLocal7.performAction2075(byteArrayLocal3, 0, (byte) 125, byteArrayLocal10.length);
        if (!booleanArgument1) {
          return true;
        }
        if (this.bigIntegerState0003 != null &&
          null != this.bigIntegerState0002) {
          bigIntegerLocal9 = new java.math.BigInteger(byteArrayLocal10);
          bigIntegerLocal5 = bigIntegerLocal9.modPow(this.bigIntegerState0003, this.bigIntegerState0002);
          byteArrayLocal4 = bigIntegerLocal5.toByteArray();
        } else {
          byteArrayLocal4 = byteArrayLocal3;
        }
        if (byteArrayLocal4.length != 65) {
          throw new RuntimeException();
        }
        byteArrayLocal11 = MixedSupport139.computeByteArray1899(0, packetBufferLocal7.payload, 5, packetBufferLocal7.position - (byteArrayLocal10.length + 5));
        for (integerLocal1 = 0; integerLocal1 < 64; integerLocal1++) {
          if (byteArrayLocal11[integerLocal1] != byteArrayLocal4[integerLocal1 + 1]) {
            throw new RuntimeException();
          }
        }
        this.mixedSupport080ArrayState0001 = new MixedSupport080[integerLocal2];
        this.packetBufferState0005 = packetBufferLocal7;
        return true;
    }

    final MixedSupport080 computeMixedSupport0801245(byte byteArgument1, int integerArgument2, MixedSupport073 mixedSupport073Argument3, MixedSupport073 mixedSupport073Argument4, boolean booleanArgument5) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        MixedSupport080 mixedSupport080Local5 = null;
        byte[] byteArrayLocal6 = null;
        MixedSupport080 stackMixedSupport080Local7 = null;
        MixedSupport080 stackMixedSupport080Local8 = null;
        RuntimeException stackRuntimeExceptionLocal9 = null;
        StringBuilder stackStringBuilderLocal10 = null;
        String stackStringLocal11 = null;
        StringBuilder stackStringBuilderLocal12 = null;
        String stackStringLocal13 = null;
        RuntimeException caughtExceptionLocal14 = null;
        try {
          if (this.packetBufferState0005 == null) {
            throw new RuntimeException();
          }
          if (0 <= integerArgument2 &&
            this.mixedSupport080ArrayState0001.length > integerArgument2) {
            if (this.mixedSupport080ArrayState0001[integerArgument2] != null) {
              stackMixedSupport080Local7 = this.mixedSupport080ArrayState0001[integerArgument2];
              return stackMixedSupport080Local7;
            }
            this.packetBufferState0005.position = integerArgument2 * 72 + 6;
            integerLocal3 = 10 / ((-41 - byteArgument1) / 42);
            integerLocal1 = this.packetBufferState0005.computeInteger2096(7553);
            integerLocal4 = this.packetBufferState0005.computeInteger2096(7553);
            byteArrayLocal6 = new byte[64];
            this.packetBufferState0005.performAction2075(byteArrayLocal6, 0, (byte) 127, 64);
            mixedSupport080Local5 = new MixedSupport080(integerArgument2, mixedSupport073Argument3, mixedSupport073Argument4, this.networkSupport003State0002, this.cacheWorkQueueState0002, integerLocal1, byteArrayLocal6, integerLocal4, booleanArgument5);
            this.mixedSupport080ArrayState0001[integerArgument2] = mixedSupport080Local5;
            stackMixedSupport080Local8 = mixedSupport080Local5;
            return stackMixedSupport080Local8;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException caughtParameterLocal15) {
          caughtExceptionLocal14 = caughtParameterLocal15;
          runtimeExceptionLocal2 = caughtExceptionLocal14;
          stackRuntimeExceptionLocal9 = runtimeExceptionLocal2;
          stackStringBuilderLocal10 = new StringBuilder().append("ne.B(").append(byteArgument1).append(',').append(integerArgument2).append(',');
          if (mixedSupport073Argument3 == null) {
            stackStringLocal11 = "null";
          } else {
            stackStringLocal11 = "{...}";
          }
          stackStringBuilderLocal12 = ((StringBuilder) (Object) stackStringBuilderLocal10).append(stackStringLocal11).append(',');
          if (mixedSupport073Argument4 == null) {
            stackStringLocal13 = "null";
          } else {
            stackStringLocal13 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal9), ((StringBuilder) (Object) stackStringBuilderLocal12).append(stackStringLocal13).append(',').append(booleanArgument5).append(')').toString());
        }
    }

    final static void performAction1253(int integerArgument1) {
        UiComponentPart033.performAction2053(114);
        if (integerArgument1 != -5) {
          byteArrayState0017 = (byte[]) null;
        }
        UiComponentPart032.booleanState0198 = true;
        SceneWidgetPart012.booleanState0188 = true;
        MixedSupport005.uiComponentPart016State0001.performAction0948(true);
        MixedSupport154.performAction2044(false, integerArgument1 ^ 49, MixedSupport006.stringState0027);
    }

    final static java.awt.Canvas computeCanvas1252(int integerArgument1) {
        if (integerArgument1 > -25) {
          CodecSupport002.performAction1244((byte) 18);
        }
        return null != MixedSupport020.platformSupport006State0001 ? (java.awt.Canvas) ((Object) MixedSupport020.platformSupport006State0001) : GameDomainSupport004.canvasState0001;
    }

    CodecSupport002(NetworkSupport003 networkSupport003Argument1, CacheWorkQueue cacheWorkQueueArgument2) {
        this(networkSupport003Argument1, cacheWorkQueueArgument2, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final static boolean computeBoolean1250(int integerArgument1) {
        if (integerArgument1 != -18163) {
          return true;
        }
        if (!LoginCredentials.booleanState0085) {
          return false;
        }
        if (0 != NetworkSupport010.integerState0585) {
          return false;
        }
        return true;
    }

    final static int computeInteger1249(byte byteArgument1) {
        if (byteArgument1 != -40) {
          CodecSupport002.computeBoolean1250(-2);
        }
        return MixedSupport104.integerState0579;
    }

    final void performAction1246(int integerArgument1) {
        int integerLocal1;
        int integerLocal2;
        int integerLocal3;
        integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (this.mixedSupport080ArrayState0001 == null) {
          return;
        }
        for (integerLocal1 = 0; integerLocal1 < this.mixedSupport080ArrayState0001.length; integerLocal1++) {
          if (this.mixedSupport080ArrayState0001[integerLocal1] != null) {
            this.mixedSupport080ArrayState0001[integerLocal1].performAction1072(16322);
          }
        }
        integerLocal3 = 0;
        if (integerArgument1 > -106) {
          return;
        }
        while (integerLocal3 < this.mixedSupport080ArrayState0001.length) {
          if (null != this.mixedSupport080ArrayState0001[integerLocal3]) {
            this.mixedSupport080ArrayState0001[integerLocal3].performAction1075(true);
          }
          integerLocal3++;
        }
    }

    final static void performAction1251(int integerArgument1) {
        MixedSupport151.booleanState0221 = false;
        PacketBuffer.booleanState0228 = 0 == UiComponentPart006.cipherPacketBufferState0001.computeInteger2085((byte) -96) ? true : false;
        if (integerArgument1 != 27721) {
          CodecSupport002.performAction1244((byte) 94);
        }
    }

    private CodecSupport002(NetworkSupport003 networkSupport003Argument1, CacheWorkQueue cacheWorkQueueArgument2, java.math.BigInteger bigIntegerArgument3, java.math.BigInteger bigIntegerArgument4) {
        RuntimeException runtimeException = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        RuntimeException caughtExceptionLocal11 = null;
        try {
          this.cacheWorkQueueState0002 = cacheWorkQueueArgument2;
          this.bigIntegerState0003 = bigIntegerArgument3;
          this.bigIntegerState0002 = bigIntegerArgument4;
          this.networkSupport003State0002 = networkSupport003Argument1;
          if (!this.networkSupport003State0002.computeBoolean0378(true)) {
            this.resourceSupport004State0002 = this.networkSupport003State0002.computeResourceSupport0040379(true, (byte) 0, true, 255, 255);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal12) {
          caughtExceptionLocal11 = caughtParameterLocal12;
          runtimeException = caughtExceptionLocal11;
          stackRuntimeExceptionLocal2 = runtimeException;
          stackStringBuilderLocal3 = new StringBuilder().append("ne.<init>(");
          if (networkSupport003Argument1 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          stackStringBuilderLocal5 = ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(',');
          if (cacheWorkQueueArgument2 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          stackStringBuilderLocal7 = ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',');
          if (bigIntegerArgument3 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          stackStringBuilderLocal9 = ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',');
          if (bigIntegerArgument4 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(')').toString());
        }
    }

    static {
        stringState0361 = "Waiting for fonts";
        stringState0360 = "Achieved";
    }
}
