/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport090 {
    static String stringState0362;
    private HashNode[] hashNodeArrayState0001;
    private int integerState0536;
    static String stringState0363;
    private int integerState0537;
    static String stringState0364;
    static long longState0032;
    static SceneWidget sceneWidgetState0088;
    static RgbSprite rgbSpriteState0036;
    static String stringState0365;
    private HashNode hashNodeState0005;
    private HashNode hashNodeState0006;

    final static void performAction1262(RgbSprite[] rgbSpriteArrayArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5) {
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        RuntimeException caughtExceptionLocal4 = null;
        int integerLocal5 = 0;
        RuntimeException runtimeExceptionLocal6 = null;
        int integerLocal7 = 0;
        int integerLocal8 = 0;
        int integerLocal9 = 0;
        int integerLocal10 = 0;
        int integerLocal11 = 0;
        integerLocal11 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (rgbSpriteArrayArgument1 != null &&
            integerArgument2 > 0) {
            integerLocal5 = rgbSpriteArrayArgument1[0].integerState0254;
            integerLocal7 = rgbSpriteArrayArgument1[2].integerState0254;
            if (integerArgument4 != -1) {
              stringState0362 = (String) null;
            }
            integerLocal8 = rgbSpriteArrayArgument1[1].integerState0254;
            rgbSpriteArrayArgument1[0].performAction0300(integerArgument5, integerArgument3);
            rgbSpriteArrayArgument1[2].performAction0300(integerArgument5 + integerArgument2 - integerLocal7, integerArgument3);
            SoftwareRaster.performAction0731(MixedSupport073.integerArrayState0123);
            SoftwareRaster.performAction0742(integerLocal5 + integerArgument5, integerArgument3, integerArgument5 + (integerArgument2 - integerLocal7), integerArgument3 + rgbSpriteArrayArgument1[1].integerState0260);
            integerLocal9 = integerLocal5 + integerArgument5;
            integerLocal10 = -integerLocal7 + integerArgument5 + integerArgument2;
            for (integerArgument5 = integerLocal9; integerArgument5 < integerLocal10; integerArgument5 = integerArgument5 + integerLocal8) {
              rgbSpriteArrayArgument1[1].performAction0300(integerArgument5, integerArgument3);
            }
            SoftwareRaster.performAction0723(MixedSupport073.integerArrayState0123);
            return;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal12) {
          caughtExceptionLocal4 = caughtParameterLocal12;
          runtimeExceptionLocal6 = caughtExceptionLocal4;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal6;
          stackStringBuilderLocal2 = new StringBuilder().append("ng.A(");
          if (rgbSpriteArrayArgument1 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',').append(integerArgument4).append(',').append(integerArgument5).append(')').toString());
        }
    }

    public static void performAction1258(int integerArgument1) {
        sceneWidgetState0088 = null;
        stringState0362 = null;
        if (integerArgument1 > -26) {
          return;
        }
        stringState0364 = null;
        rgbSpriteState0036 = null;
        stringState0365 = null;
        stringState0363 = null;
    }

    final void performAction1261(long longArgument1, int integerArgument2, HashNode hashNodeArgument3) {
        HashNode hashNodeLocal1 = null;
        try {
          if (null != hashNodeArgument3.next) {
            hashNodeArgument3.performAction0161((byte) 116);
          }
          hashNodeLocal1 = this.hashNodeArrayState0001[(int)((long)(this.integerState0537 + integerArgument2) & longArgument1)];
          hashNodeArgument3.next = hashNodeLocal1.next;
          hashNodeArgument3.previous = hashNodeLocal1;
          hashNodeArgument3.next.previous = hashNodeArgument3;
          hashNodeArgument3.previous.next = hashNodeArgument3;
          hashNodeArgument3.key = longArgument1;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "ng.E(" + longArgument1 + ',' + integerArgument2 + ',' + (hashNodeArgument3 != null ? "{...}" : "null") + ')');
        }
    }

    final HashNode computeHashNode1260(long longArgument1, int integerArgument2) {
        HashNode hashNodeLocal1 = null;
        int integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        HashNode hashNodeLocal3 = this.hashNodeArrayState0001[(int)((long)(this.integerState0537 - 1) & longArgument1)];
        this.hashNodeState0005 = hashNodeLocal3.previous;
        while (this.hashNodeState0005 != hashNodeLocal3) {
          if (~this.hashNodeState0005.key == ~longArgument1) {
            hashNodeLocal1 = this.hashNodeState0005;
            this.hashNodeState0005 = this.hashNodeState0005.previous;
            return hashNodeLocal1;
          }
          this.hashNodeState0005 = this.hashNodeState0005.previous;
        }
        this.hashNodeState0005 = null;
        if (integerArgument2 < 48) {
          return (HashNode) null;
        }
        return null;
    }

    final static MixedSupport066 computeMixedSupport0661259(int integerArgument1, String stringArgument2) {
        MixedSupport066 stackMixedSupport066Local1 = null;
        MixedSupport066 stackMixedSupport066Local2 = null;
        MixedSupport066 stackMixedSupport066Local3 = null;
        int stackIntegerLocal4 = 0;
        MixedSupport066 stackMixedSupport066Local5 = null;
        MixedSupport066 stackMixedSupport066Local6 = null;
        MixedSupport066 stackMixedSupport066Local7 = null;
        RuntimeException stackRuntimeExceptionLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        RuntimeException caughtExceptionLocal11 = null;
        int integerLocal12 = 0;
        RuntimeException runtimeExceptionLocal13 = null;
        int integerLocal14 = 0;
        int integerLocal15 = 0;
        int integerLocal16 = 0;
        int integerLocal17 = 0;
        RgbSprite[] rgbSpriteArrayLocal18 = null;
        int integerLocal19;
        int integerLocal20;
        int integerLocal21;
        integerLocal17 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal12 = stringArgument2.length();
          if (integerLocal12 == 0) {
            stackMixedSupport066Local1 = InputAdapter003.mixedSupport066State0004;
            return stackMixedSupport066Local1;
          }
          if (integerLocal12 > 64) {
            stackMixedSupport066Local2 = MixedSupport045.mixedSupport066State0003;
            return stackMixedSupport066Local2;
          }
          if (integerArgument1 != -1) {
            rgbSpriteArrayLocal18 = (RgbSprite[]) null;
            MixedSupport090.performAction1262((RgbSprite[]) null, 38, -12, 7, -118);
          }
          if (stringArgument2.charAt(0) == 34) {
            if (stringArgument2.charAt(integerLocal12 - 1) != 34) {
              stackMixedSupport066Local3 = DualNode.mixedSupport066State0001;
              return stackMixedSupport066Local3;
            }
            integerLocal14 = 0;
            for (integerLocal15 = 1; integerLocal12 - 1 > integerLocal15; integerLocal15++) {
              integerLocal16 = stringArgument2.charAt(integerLocal15);
              if (integerLocal16 == 92) {
                stackIntegerLocal4 = (integerLocal14 != 0) ? 0 : 1;
                integerLocal14 = stackIntegerLocal4;
              } else {
                if (integerLocal16 == 34 &&
                  integerLocal14 == 0) {
                  stackMixedSupport066Local5 = DualNode.mixedSupport066State0001;
                  return stackMixedSupport066Local5;
                }
                integerLocal14 = 0;
              }
            }
            return null;
          }
          integerLocal19 = 0;
          for (integerLocal20 = 0; integerLocal12 > integerLocal20; integerLocal20++) {
            boolean frameRemainderLocal22 = true;
            integerLocal21 = stringArgument2.charAt(integerLocal20);
            if (46 == integerLocal21) {
              if (0 != integerLocal20 &&
                integerLocal20 != -1 + integerLocal12 &&
                integerLocal19 == 0) {
                integerLocal19 = 1;
                frameRemainderLocal22 = false;
              }
              else {
                stackMixedSupport066Local6 = DualNode.mixedSupport066State0001;
                return stackMixedSupport066Local6;
              }
            }
            if (frameRemainderLocal22) {
              if (-1 == SceneWidgetPart008.stringState0368.indexOf(integerLocal21)) {
                stackMixedSupport066Local7 = DualNode.mixedSupport066State0001;
                return stackMixedSupport066Local7;
              }
              integerLocal19 = 0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException caughtParameterLocal23) {
          caughtExceptionLocal11 = caughtParameterLocal23;
          runtimeExceptionLocal13 = caughtExceptionLocal11;
          stackRuntimeExceptionLocal8 = runtimeExceptionLocal13;
          stackStringBuilderLocal9 = new StringBuilder().append("ng.B(").append(integerArgument1).append(',');
          if (stringArgument2 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal8), ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(')').toString());
        }
    }

    final HashNode computeHashNode1257(byte byteArgument1) {
        this.integerState0536 = 0;
        if (byteArgument1 != 126) {
          this.computeHashNode1263((byte) 112);
          return this.computeHashNode1263((byte) 49);
        }
        return this.computeHashNode1263((byte) 49);
    }

    final HashNode computeHashNode1263(byte byteArgument1) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3;
        HashNode hashNodeLocal4;
        HashNode hashNodeLocal5;
        HashNode hashNodeLocal6;
        HashNode hashNodeLocal7;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (this.integerState0536 <= 0) {
          if (byteArgument1 < 37) {
            return (HashNode) null;
          }
          do {
            if (this.integerState0537 <= this.integerState0536) {
              return null;
            }
            integerLocal1 = this.integerState0536;
            this.integerState0536 = this.integerState0536 + 1;
            hashNodeLocal4 = this.hashNodeArrayState0001[integerLocal1].previous;
            hashNodeLocal7 = hashNodeLocal4;
          } while (hashNodeLocal4 == this.hashNodeArrayState0001[-1 + this.integerState0536]);
          this.hashNodeState0006 = hashNodeLocal7.previous;
          return hashNodeLocal7;
        }
        if (this.hashNodeArrayState0001[-1 + this.integerState0536] != this.hashNodeState0006) {
          hashNodeLocal6 = this.hashNodeState0006;
          this.hashNodeState0006 = hashNodeLocal6.previous;
          return hashNodeLocal6;
        }
        if (byteArgument1 < 37) {
          return (HashNode) null;
        }
        do {
          if (this.integerState0537 <= this.integerState0536) {
            return null;
          }
          integerLocal2 = this.integerState0536;
          this.integerState0536 = this.integerState0536 + 1;
          hashNodeLocal4 = this.hashNodeArrayState0001[integerLocal2].previous;
          hashNodeLocal5 = hashNodeLocal4;
        } while (hashNodeLocal4 == this.hashNodeArrayState0001[-1 + this.integerState0536]);
        this.hashNodeState0006 = hashNodeLocal5.previous;
        return hashNodeLocal5;
    }

    MixedSupport090(int integerArgument1) {
        int integerLocal1 = 0;
        HashNode cachedHashNodeLocal2 = null;
        HashNode hashNodeLocal3;
        this.integerState0536 = 0;
        this.integerState0537 = integerArgument1;
        this.hashNodeArrayState0001 = new HashNode[integerArgument1];
        for (integerLocal1 = 0; integerArgument1 > integerLocal1; integerLocal1++) {
          cachedHashNodeLocal2 = new HashNode();
          hashNodeLocal3 = cachedHashNodeLocal2;
          this.hashNodeArrayState0001[integerLocal1] = cachedHashNodeLocal2;
          hashNodeLocal3.previous = hashNodeLocal3;
          hashNodeLocal3.next = hashNodeLocal3;
        }
    }

    static {
        stringState0363 = "Please check if address is correct";
        stringState0362 = "Stage";
        stringState0364 = "This password is part of your Player Name, and would be easy to guess";
        stringState0365 = "Waiting for graphics";
    }
}
