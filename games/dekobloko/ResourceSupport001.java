/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ResourceSupport001 {
    private int integerState0020;
    byte[][] byteArrayArrayState0001;
    static int integerState0021;
    int[][] integerArrayArrayState0001;
    MixedSupport096 mixedSupport096State0001;
    MixedSupport096[] mixedSupport096ArrayState0001;
    static RgbSprite rgbSpriteState0003;
    int[] integerArrayState0006;
    int integerState0022;
    int[] integerArrayState0007;
    int integerState0023;
    int integerState0024;
    int[] integerArrayState0008;
    static String stringState0009;
    private int[][] integerArrayArrayState0002;
    private int[] integerArrayState0009;
    private byte[] byteArrayState0001;
    static String stringState0010;
    int[] integerArrayState0010;
    static SceneWidget sceneWidgetState0001;
    static RgbSprite[][] rgbSpriteArrayArrayState0001;
    int[] integerArrayState0011;
    static RgbSprite rgbSpriteState0004;
    static String stringState0011;
    static int integerState0025;
    static int[] integerArrayState0012;
    static String stringState0012;
    static String stringState0013;

    public static void performAction0045(byte byteArgument1) {
        stringState0009 = null;
        rgbSpriteState0003 = null;
        rgbSpriteArrayArrayState0001 = (RgbSprite[][]) null;
        integerArrayState0012 = null;
        stringState0010 = null;
        stringState0013 = null;
        stringState0012 = null;
        sceneWidgetState0001 = null;
        rgbSpriteState0004 = null;
        stringState0011 = null;
        if (byteArgument1 != -67) {
          rgbSpriteState0004 = (RgbSprite) null;
        }
    }

    final static void performAction0046(int integerArgument1, int integerArgument2) {
        if (integerArgument1 != -1) {
          sceneWidgetState0001 = (SceneWidget) null;
        }
        CipherPacketBuffer cipherPacketBufferLocal1 = SocketFactory.cipherPacketBufferState0002;
        cipherPacketBufferLocal1.performAction1861(integerArgument2, -4);
        cipherPacketBufferLocal1.performAction2073(true, 1);
        cipherPacketBufferLocal1.performAction2073(true, 0);
    }

    final static String computeString0047(ResourceArchive resourceArchiveArgument1, String stringArgument2, boolean booleanArgument3, String stringArgument4) {
        RuntimeException runtimeExceptionLocal1 = null;
        byte[] byteArrayLocal2 = null;
        String stackStringLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        StringBuilder stackStringBuilderLocal10 = null;
        String stackStringLocal11 = null;
        RuntimeException caughtExceptionLocal12 = null;
        try {
          if (!resourceArchiveArgument1.computeBoolean0904((byte) 121)) {
            stackStringLocal3 = (String) (stringArgument2);
            return stackStringLocal3;
          }
          if (!booleanArgument3) {
            byteArrayLocal2 = (byte[]) null;
            ResourceSupport001.performAction0049((byte[]) null, -41, true, 8, -58, true);
          }
          stackStringLocal4 = stringArgument4 + " - " + resourceArchiveArgument1.computeInteger0923((byte) -89) + "%";
          return stackStringLocal4;
        } catch (java.lang.RuntimeException caughtParameterLocal13) {
          caughtExceptionLocal12 = caughtParameterLocal13;
          runtimeExceptionLocal1 = caughtExceptionLocal12;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal1;
          stackStringBuilderLocal6 = new StringBuilder().append("ad.B(");
          if (resourceArchiveArgument1 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          stackStringBuilderLocal8 = ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',');
          if (stringArgument2 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          stackStringBuilderLocal10 = ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',').append(booleanArgument3).append(',');
          if (stringArgument4 == null) {
            stackStringLocal11 = "null";
          } else {
            stackStringLocal11 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal10).append(stackStringLocal11).append(')').toString());
        }
    }

    final static void performAction0049(byte[] byteArrayArgument1, int integerArgument2, boolean booleanArgument3, int integerArgument4, int integerArgument5, boolean booleanArgument6) {
        CipherPacketBuffer cipherPacketBufferLocal1 = null;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        try {
          cipherPacketBufferLocal1 = SocketFactory.cipherPacketBufferState0002;
          cipherPacketBufferLocal1.performAction1861(integerArgument2, -4);
          cipherPacketBufferLocal1.position = cipherPacketBufferLocal1.position + 1;
          integerLocal2 = cipherPacketBufferLocal1.position;
          cipherPacketBufferLocal1.performAction2073(booleanArgument3, 4);
          cipherPacketBufferLocal1.performAction2073(booleanArgument3, integerArgument4);
          integerLocal3 = integerArgument5;
          if (booleanArgument6) {
            integerLocal3 += 128;
          }
          cipherPacketBufferLocal1.performAction2073(booleanArgument3, integerLocal3);
          cipherPacketBufferLocal1.performAction2074(false, byteArrayArgument1.length, byteArrayArgument1, 0);
          cipherPacketBufferLocal1.performAction2079(-integerLocal2 + cipherPacketBufferLocal1.position, booleanArgument3);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "ad.A(" + (byteArrayArgument1 != null ? "{...}" : "null") + ',' + integerArgument2 + ',' + booleanArgument3 + ',' + integerArgument4 + ',' + integerArgument5 + ',' + booleanArgument6 + ')');
        }
    }

    private final void performAction0048(byte[] byteArrayArgument1, int integerArgument2) {
        int cachedIntegerLocal1 = 0;
        int cachedIntegerLocal2 = 0;
        int[] integerArrayLocal3 = null;
        int cachedIntegerLocal4 = 0;
        int[] cachedIntegerArrayLocal5 = null;
        int[] integerArrayLocal6 = null;
        int cachedIntegerLocal7 = 0;
        int[] cachedIntegerArrayLocal8 = null;
        int[] integerArrayLocal9 = null;
        int stackIntegerLocal10 = 0;
        int stackIntegerLocal11 = 0;
        RuntimeException stackRuntimeExceptionLocal12 = null;
        StringBuilder stackStringBuilderLocal13 = null;
        String stackStringLocal14 = null;
        RuntimeException caughtExceptionLocal15 = null;
        RuntimeException runtimeExceptionLocal16 = null;
        int integerLocal17 = 0;
        int integerLocal18 = 0;
        int integerLocal19 = 0;
        int integerLocal20 = 0;
        int integerLocal21 = 0;
        int integerLocal22 = 0;
        int integerLocal23 = 0;
        int integerLocal24 = 0;
        int integerLocal25 = 0;
        int integerLocal26 = 0;
        int integerLocal27 = 0;
        int integerLocal28 = 0;
        int integerLocal29 = 0;
        PacketBuffer packetBufferLocal30 = null;
        byte[] byteArrayLocal31 = null;
        int integerLocal32;
        int integerLocal33;
        int integerLocal34;
        int integerLocal35;
        int integerLocal36;
        int integerLocal37;
        int integerLocal38;
        int integerLocal39;
        int integerLocal40;
        int integerLocal41;
        int integerLocal42;
        int integerLocal43;
        int integerLocal44;
        integerLocal29 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          packetBufferLocal30 = new PacketBuffer(MixedSupport057.computeByteArray0766(byteArrayArgument1, -89));
          integerLocal17 = packetBufferLocal30.computeInteger2085((byte) -114);
          if (integerLocal17 >= 5 &&
            integerLocal17 <= 7) {
            if (integerLocal17 >= 6) {
              this.integerState0022 = packetBufferLocal30.computeInteger2096(integerArgument2 ^ 7553);
            } else {
              this.integerState0022 = 0;
            }
            integerLocal18 = packetBufferLocal30.computeInteger2085((byte) -46);
            stackIntegerLocal10 = ((integerLocal18 & 1) == 0) ? 0 : 1;
            integerLocal19 = stackIntegerLocal10;
            stackIntegerLocal11 = ((integerLocal18 & 2) == 0) ? 0 : 1;
            integerLocal20 = stackIntegerLocal11;
            if (7 <= integerLocal17) {
              this.integerState0020 = packetBufferLocal30.computeInteger2092(21663);
            } else {
              this.integerState0020 = packetBufferLocal30.computeInteger2089(integerArgument2 + 3);
            }
            integerLocal21 = 0;
            integerLocal22 = -1;
            this.integerArrayState0008 = new int[this.integerState0020];
            if (integerLocal17 < 7) {
              for (integerLocal23 = 0; this.integerState0020 > integerLocal23; integerLocal23++) {
                cachedIntegerLocal1 = integerLocal21 + packetBufferLocal30.computeInteger2089(MixedSupport111.computeInteger1576(integerArgument2, 3));
                integerLocal21 = cachedIntegerLocal1;
                this.integerArrayState0008[integerLocal23] = cachedIntegerLocal1;
                if (this.integerArrayState0008[integerLocal23] > integerLocal22) {
                  integerLocal22 = this.integerArrayState0008[integerLocal23];
                }
              }
            } else {
              for (integerLocal23 = 0; this.integerState0020 > integerLocal23; integerLocal23++) {
                cachedIntegerLocal2 = integerLocal21 + packetBufferLocal30.computeInteger2092(21663);
                integerLocal21 = cachedIntegerLocal2;
                this.integerArrayState0008[integerLocal23] = cachedIntegerLocal2;
                if (this.integerArrayState0008[integerLocal23] > integerLocal22) {
                  integerLocal22 = this.integerArrayState0008[integerLocal23];
                }
              }
            }
            this.integerState0023 = integerLocal22 + 1;
            this.integerArrayState0007 = new int[this.integerState0023];
            if (integerLocal20 != 0) {
              this.byteArrayArrayState0001 = new byte[this.integerState0023][];
            }
            this.integerArrayState0010 = new int[this.integerState0023];
            this.integerArrayArrayState0001 = new int[this.integerState0023][];
            this.integerArrayState0011 = new int[this.integerState0023];
            this.integerArrayState0006 = new int[this.integerState0023];
            if (integerLocal19 != 0) {
              this.integerArrayState0009 = new int[this.integerState0023];
              for (integerLocal33 = 0; this.integerState0023 > integerLocal33; integerLocal33++) {
                this.integerArrayState0009[integerLocal33] = -1;
              }
              for (integerLocal43 = 0; this.integerState0020 > integerLocal43; integerLocal43++) {
                this.integerArrayState0009[this.integerArrayState0008[integerLocal43]] = packetBufferLocal30.computeInteger2096(integerArgument2 + 7553);
              }
              this.mixedSupport096State0001 = new MixedSupport096(this.integerArrayState0009);
            }
            for (integerLocal34 = integerArgument2; this.integerState0020 > integerLocal34; integerLocal34++) {
              this.integerArrayState0010[this.integerArrayState0008[integerLocal34]] = packetBufferLocal30.computeInteger2096(7553);
            }
            if (integerLocal20 != 0) {
              for (integerLocal35 = 0; integerLocal35 < this.integerState0020; integerLocal35++) {
                byteArrayLocal31 = new byte[64];
                packetBufferLocal30.performAction2075(byteArrayLocal31, 0, (byte) 125, 64);
                this.byteArrayArrayState0001[this.integerArrayState0008[integerLocal35]] = byteArrayLocal31;
              }
            }
            for (integerLocal36 = 0; this.integerState0020 > integerLocal36; integerLocal36++) {
              this.integerArrayState0007[this.integerArrayState0008[integerLocal36]] = packetBufferLocal30.computeInteger2096(7553);
            }
            if (integerLocal17 >= 7) {
              for (integerLocal37 = 0; this.integerState0020 > integerLocal37; integerLocal37++) {
                this.integerArrayState0011[this.integerArrayState0008[integerLocal37]] = packetBufferLocal30.computeInteger2092(21663);
              }
              for (integerLocal37 = 0; this.integerState0020 > integerLocal37; integerLocal37++) {
                integerLocal24 = this.integerArrayState0008[integerLocal37];
                integerLocal25 = this.integerArrayState0011[integerLocal24];
                integerLocal32 = 0;
                integerArrayLocal3 = new int[integerLocal25];
                this.integerArrayArrayState0001[integerLocal24] = integerArrayLocal3;
                integerLocal26 = -1;
                for (integerLocal27 = 0; integerLocal27 < integerLocal25; integerLocal27++) {
                  cachedIntegerLocal4 = integerLocal32 + packetBufferLocal30.computeInteger2092(21663);
                  integerLocal32 = cachedIntegerLocal4;
                  cachedIntegerArrayLocal5 = this.integerArrayArrayState0001[integerLocal24];
                  cachedIntegerArrayLocal5[integerLocal27] = cachedIntegerLocal4;
                  integerLocal28 = cachedIntegerLocal4;
                  if (integerLocal28 > integerLocal26) {
                    integerLocal26 = integerLocal28;
                  }
                }
                this.integerArrayState0006[integerLocal24] = 1 + integerLocal26;
                if (integerLocal26 + 1 == integerLocal25) {
                  this.integerArrayArrayState0001[integerLocal24] = null;
                }
              }
            } else {
              for (integerLocal37 = 0; integerLocal37 < this.integerState0020; integerLocal37++) {
                this.integerArrayState0011[this.integerArrayState0008[integerLocal37]] = packetBufferLocal30.computeInteger2089(3);
              }
              for (integerLocal37 = 0; this.integerState0020 > integerLocal37; integerLocal37++) {
                integerLocal24 = this.integerArrayState0008[integerLocal37];
                integerLocal25 = this.integerArrayState0011[integerLocal24];
                integerLocal32 = 0;
                integerLocal26 = -1;
                integerArrayLocal6 = new int[integerLocal25];
                this.integerArrayArrayState0001[integerLocal24] = integerArrayLocal6;
                for (integerLocal27 = 0; integerLocal27 < integerLocal25; integerLocal27++) {
                  cachedIntegerLocal7 = integerLocal32 + packetBufferLocal30.computeInteger2089(3);
                  integerLocal32 = cachedIntegerLocal7;
                  cachedIntegerArrayLocal8 = this.integerArrayArrayState0001[integerLocal24];
                  cachedIntegerArrayLocal8[integerLocal27] = cachedIntegerLocal7;
                  integerLocal28 = cachedIntegerLocal7;
                  if (integerLocal28 > integerLocal26) {
                    integerLocal26 = integerLocal28;
                  }
                }
                this.integerArrayState0006[integerLocal24] = 1 + integerLocal26;
                if (1 + integerLocal26 == integerLocal25) {
                  this.integerArrayArrayState0001[integerLocal24] = null;
                }
              }
            }
            if (integerLocal19 != 0) {
              this.mixedSupport096ArrayState0001 = new MixedSupport096[integerLocal22 + 1];
              this.integerArrayArrayState0002 = new int[integerLocal22 + 1][];
              for (integerLocal38 = 0; this.integerState0020 > integerLocal38; integerLocal38++) {
                integerLocal41 = this.integerArrayState0008[integerLocal38];
                integerLocal42 = this.integerArrayState0011[integerLocal41];
                integerArrayLocal9 = new int[this.integerArrayState0006[integerLocal41]];
                this.integerArrayArrayState0002[integerLocal41] = integerArrayLocal9;
                for (integerLocal39 = 0; this.integerArrayState0006[integerLocal41] > integerLocal39; integerLocal39++) {
                  this.integerArrayArrayState0002[integerLocal41][integerLocal39] = -1;
                }
                for (integerLocal44 = 0; integerLocal44 < integerLocal42; integerLocal44++) {
                  if (null != this.integerArrayArrayState0001[integerLocal41]) {
                    integerLocal40 = this.integerArrayArrayState0001[integerLocal41][integerLocal44];
                  } else {
                    integerLocal40 = integerLocal44;
                  }
                  this.integerArrayArrayState0002[integerLocal41][integerLocal40] = packetBufferLocal30.computeInteger2096(MixedSupport111.computeInteger1576(integerArgument2, 7553));
                }
                this.mixedSupport096ArrayState0001[integerLocal41] = new MixedSupport096(this.integerArrayArrayState0002[integerLocal41]);
              }
              return;
            }
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException caughtParameterLocal45) {
          caughtExceptionLocal15 = caughtParameterLocal45;
          runtimeExceptionLocal16 = caughtExceptionLocal15;
          stackRuntimeExceptionLocal12 = runtimeExceptionLocal16;
          stackStringBuilderLocal13 = new StringBuilder().append("ad.D(");
          if (byteArrayArgument1 == null) {
            stackStringLocal14 = "null";
          } else {
            stackStringLocal14 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal12), ((StringBuilder) (Object) stackStringBuilderLocal13).append(stackStringLocal14).append(',').append(integerArgument2).append(')').toString());
        }
    }

    ResourceSupport001(byte[] byteArrayArgument1, int integerArgument2, byte[] byteArrayArgument3) {
        int integerLocal1 = 0;
        try {
          this.integerState0024 = SceneWidgetPart012.computeInteger1821(byteArrayArgument1.length, 0, byteArrayArgument1);
          if (this.integerState0024 != integerArgument2) {
            throw new RuntimeException();
          }
          if (byteArrayArgument3 != null) {
            if (byteArrayArgument3.length != 64) {
              throw new RuntimeException();
            }
            this.byteArrayState0001 = MixedSupport139.computeByteArray1899(0, byteArrayArgument1, 0, byteArrayArgument1.length);
            for (integerLocal1 = 0; integerLocal1 < 64; integerLocal1++) {
              if (byteArrayArgument3[integerLocal1] != this.byteArrayState0001[integerLocal1]) {
                throw new RuntimeException();
              }
            }
          }
          this.performAction0048(byteArrayArgument1, 0);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "ad.<init>(" + (byteArrayArgument1 != null ? "{...}" : "null") + ',' + integerArgument2 + ',' + (byteArrayArgument3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        stringState0009 = "Please enter a year between <%0> and <%1>";
        rgbSpriteState0003 = new RgbSprite(18, 18);
        rgbSpriteArrayArrayState0001 = new RgbSprite[8][];
        stringState0010 = "<%0> wants to join";
        stringState0011 = "Your email address is used to identify this account";
        integerState0025 = 0;
        stringState0013 = "Achievements This Session";
    }
}
