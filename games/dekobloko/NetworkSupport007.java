/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NetworkSupport007 extends DualNode {
    int[] integerArrayState0154;
    static long longState0030;
    static String stringState0345;
    static String stringState0346;
    static IndexedSprite indexedSpriteState0002;
    private String[] stringArrayState0022;
    private int[][] integerArrayArrayState0016;
    static String stringState0347;
    private int[] integerArrayState0155;
    static int integerState0503;
    static MixedSupport068 mixedSupport068State0001;
    static int[] integerArrayState0156;

    final void performAction1167(byte byteArgument1, PacketBuffer packetBufferArgument2) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        RuntimeException runtimeExceptionLocal7 = null;
        PacketBuffer packetBufferLocal8 = null;
        integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          while (true) {
            integerLocal1 = packetBufferArgument2.computeInteger2085((byte) -88);
            if (integerLocal1 != 0) {
              this.performAction1168(integerLocal1, byteArgument1 ^ 2598, packetBufferArgument2);
              continue;
            }
            break;
          }
          if (byteArgument1 != 80) {
            packetBufferLocal8 = (PacketBuffer) null;
            this.performAction1167((byte) 71, (PacketBuffer) null);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal6 = caughtParameterLocal9;
          runtimeExceptionLocal7 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal7;
          stackStringBuilderLocal4 = new StringBuilder().append("me.F(").append(byteArgument1).append(',');
          if (packetBufferArgument2 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(')').toString());
        }
    }

    final String computeString1172(byte byteArgument1) {
        int integerLocal1 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        StringBuilder stringBuilderLocal5 = new StringBuilder(80);
        StringBuilder stringBuilderLocal6 = stringBuilderLocal5;
        if (byteArgument1 > -57) {
          PacketBuffer packetBufferLocal7 = (PacketBuffer) null;
          this.performAction1167((byte) 104, (PacketBuffer) null);
        }
        if (null == this.stringArrayState0022) {
          return "";
        }
        StringBuilder discarded$0 = stringBuilderLocal5.append(this.stringArrayState0022[0]);
        for (integerLocal1 = 1; this.stringArrayState0022.length > integerLocal1; integerLocal1++) {
          discarded$1 = stringBuilderLocal6.append("...");
          discarded$2 = stringBuilderLocal5.append(this.stringArrayState0022[integerLocal1]);
        }
        return stringBuilderLocal6.toString();
    }

    final void performAction1171(int integerArgument1) {
        int integerLocal1 = 0;
        int integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (integerArgument1 != 19423) {
          NetworkSupport007.performAction1170(-120);
        }
        if (this.integerArrayState0154 != null) {
          for (integerLocal1 = 0; integerLocal1 < this.integerArrayState0154.length; integerLocal1++) {
            this.integerArrayState0154[integerLocal1] = UiComponentPart006.computeInteger0388(this.integerArrayState0154[integerLocal1], 32768);
          }
        }
    }

    public static void performAction1170(int integerArgument1) {
        mixedSupport068State0001 = null;
        stringState0347 = null;
        stringState0346 = null;
        stringState0345 = null;
        indexedSpriteState0002 = null;
        integerArrayState0156 = null;
        if (integerArgument1 != 0) {
          integerState0503 = 75;
        }
    }

    private final void performAction1168(int integerArgument1, int integerArgument2, PacketBuffer packetBufferArgument3) {
        int[] integerArrayLocal1 = null;
        int integerLocal2 = 0;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        int integerLocal7 = 0;
        RuntimeException runtimeExceptionLocal8 = null;
        int integerLocal9 = 0;
        int integerLocal10 = 0;
        MixedSupport111 mixedSupport111Local11 = null;
        int integerLocal12 = 0;
        integerLocal12 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (integerArgument2 != 2678) {
            return;
          }
          if (integerArgument1 == 1) {
            this.stringArrayState0022 = ResourceArchive.computeStringArray0907('<', (byte) 66, packetBufferArgument3.computeString2082((byte) -38));
          } else {
            if (integerArgument1 == 2) {
              integerLocal7 = packetBufferArgument3.computeInteger2085((byte) -86);
              this.integerArrayState0154 = new int[integerLocal7];
              for (integerLocal9 = 0; integerLocal9 < integerLocal7; integerLocal9++) {
                this.integerArrayState0154[integerLocal9] = packetBufferArgument3.computeInteger2089(3);
              }
            } else if (integerArgument1 == 3) {
              integerLocal7 = packetBufferArgument3.computeInteger2085((byte) -89);
              this.integerArrayArrayState0016 = new int[integerLocal7][];
              this.integerArrayState0155 = new int[integerLocal7];
              for (integerLocal9 = 0; integerLocal7 > integerLocal9; integerLocal9++) {
                integerLocal10 = packetBufferArgument3.computeInteger2089(3);
                mixedSupport111Local11 = AudioSupport002.computeMixedSupport1110883(-121, integerLocal10);
                if (mixedSupport111Local11 != null) {
                  this.integerArrayState0155[integerLocal9] = integerLocal10;
                  integerArrayLocal1 = new int[mixedSupport111Local11.integerState0672];
                  this.integerArrayArrayState0016[integerLocal9] = integerArrayLocal1;
                  for (integerLocal2 = 0; integerLocal2 < mixedSupport111Local11.integerState0672; integerLocal2++) {
                    this.integerArrayArrayState0016[integerLocal9][integerLocal2] = packetBufferArgument3.computeInteger2089(MixedSupport111.computeInteger1576(integerArgument2, 2677));
                  }
                }
              }
            } else {
              if (integerArgument1 == 4) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal13) {
          caughtExceptionLocal6 = caughtParameterLocal13;
          runtimeExceptionLocal8 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal8;
          stackStringBuilderLocal4 = new StringBuilder().append("me.A(").append(integerArgument1).append(',').append(integerArgument2).append(',');
          if (packetBufferArgument3 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(')').toString());
        }
    }

    final static void performAction1166(byte byteArgument1, java.applet.Applet appletArgument2) {
        try {
          RuntimeException stackRuntimeExceptionLocal1 = null;
          StringBuilder stackStringBuilderLocal2 = null;
          String stackStringLocal3 = null;
          Throwable caughtExceptionLocal4 = null;
          Throwable throwableLocal5 = null;
          RuntimeException runtimeExceptionLocal6 = null;
          String stringLocal7 = null;
          int integerLocal8 = 0;
          java.net.URL uRLLocal9 = null;
          try {
            try {
              uRLLocal9 = appletArgument2.getCodeBase();
              stringLocal7 = NetworkSupport004.computeURL0662(uRLLocal9, -1, appletArgument2).getFile();
              MixedSupport088.computeObject1241("updatelinks", -14541, appletArgument2, new Object[]{"home", stringLocal7 + "home.ws"});
              integerLocal8 = -128 / ((byteArgument1 - 10) / 61);
              MixedSupport088.computeObject1241("updatelinks", -14541, appletArgument2, new Object[]{"gamelist", stringLocal7 + "togamelist.ws"});
              MixedSupport088.computeObject1241("updatelinks", -14541, appletArgument2, new Object[]{"serverlist", stringLocal7 + "toserverlist.ws"});
              MixedSupport088.computeObject1241("updatelinks", -14541, appletArgument2, new Object[]{"options", stringLocal7 + "options.ws"});
              MixedSupport088.computeObject1241("updatelinks", -14541, appletArgument2, new Object[]{"terms", stringLocal7 + "terms.ws"});
              MixedSupport088.computeObject1241("updatelinks", -14541, appletArgument2, new Object[]{"privacy", stringLocal7 + "privacy.ws"});
            } catch (java.lang.Throwable caughtParameterLocal10) {
              caughtExceptionLocal4 = caughtParameterLocal10;
              throwableLocal5 = caughtExceptionLocal4;
            }
            return;
          } catch (java.lang.RuntimeException caughtParameterLocal11) {
            caughtExceptionLocal4 = caughtParameterLocal11;
            runtimeExceptionLocal6 = (RuntimeException) (Object) caughtExceptionLocal4;
            stackRuntimeExceptionLocal1 = runtimeExceptionLocal6;
            stackStringBuilderLocal2 = new StringBuilder().append("me.C(").append(byteArgument1).append(',');
            if (appletArgument2 == null) {
              stackStringLocal3 = "null";
            } else {
              stackStringLocal3 = "{...}";
            }
            throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(')').toString());
          }
        } catch (RuntimeException | Error uncheckedExceptionLocal12) {
          throw uncheckedExceptionLocal12;
        } catch (Throwable checkedExceptionLocal13) {
          throw new RuntimeException(checkedExceptionLocal13);
        }
    }

    NetworkSupport007() {
    }

    final static RgbSprite computeRgbSprite1169(RgbSprite rgbSpriteArgument1, boolean booleanArgument2, byte byteArgument3, boolean booleanArgument4) {
        RgbSprite stackRgbSpriteLocal1 = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        RuntimeException runtimeExceptionLocal6 = null;
        int integerLocal7 = 0;
        int integerLocal8 = 0;
        int integerLocal9 = 0;
        int integerLocal10 = 0;
        int integerLocal11 = 0;
        int integerLocal12 = 0;
        RgbSprite rgbSpriteLocal13 = null;
        RgbSprite rgbSpriteLocal14 = null;
        int integerLocal15;
        int integerLocal16;
        int integerLocal17;
        int integerLocal18;
        int integerLocal19;
        int integerLocal20;
        int integerLocal21;
        int integerLocal22;
        int integerLocal23;
        int integerLocal24;
        int integerLocal25;
        int integerLocal26;
        int integerLocal27;
        int integerLocal28;
        int integerLocal29;
        int integerLocal30;
        int integerLocal31;
        int integerLocal32;
        integerLocal12 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          rgbSpriteArgument1.performAction0291();
          rgbSpriteLocal13 = new RgbSprite(36, 36);
          rgbSpriteLocal14 = rgbSpriteLocal13;
          for (integerLocal7 = 0; integerLocal7 < 18; integerLocal7++) {
            for (integerLocal8 = 0; integerLocal8 < 18; integerLocal8++) {
              integerLocal9 = rgbSpriteArgument1.integerArrayState0024[integerLocal7 * 18 + integerLocal8];
              if (integerLocal9 != 0) {
                integerLocal9 = integerLocal9 + 16777216;
              }
              rgbSpriteLocal14.integerArrayState0024[integerLocal7 * 72 + 2 * integerLocal8] = integerLocal9;
            }
            for (integerLocal28 = 0; integerLocal28 < 17; integerLocal28++) {
              integerLocal30 = rgbSpriteLocal14.integerArrayState0024[integerLocal28 * 2 + 72 * integerLocal7];
              integerLocal10 = rgbSpriteLocal14.integerArrayState0024[2 + integerLocal28 * 2 + integerLocal7 * 72];
              integerLocal11 = ((integerLocal10 & 16711423) >> 1) + ((16711423 & integerLocal30) >> 1);
              if (integerLocal11 == 0 &&
                (integerLocal10 | integerLocal30) != 0) {
                integerLocal11 = 1;
              }
              if (integerLocal30 != 0 &&
                integerLocal10 != 0) {
                integerLocal11 = integerLocal11 + 16777216;
              }
              rgbSpriteLocal14.integerArrayState0024[1 + integerLocal7 * 72 + integerLocal28 * 2] = integerLocal11;
            }
            if (booleanArgument4) {
              integerLocal29 = rgbSpriteLocal14.integerArrayState0024[34 + 72 * integerLocal7];
              integerLocal31 = rgbSpriteLocal13.integerArrayState0024[72 * integerLocal7];
              integerLocal32 = ((16711422 & integerLocal29) >> 1) + ((integerLocal31 & 16711423) >> 1);
              if (integerLocal32 == 0 &&
                (integerLocal31 | integerLocal29) != 0) {
                integerLocal32 = 1;
              }
              if (integerLocal29 != 0 &&
                0 != integerLocal31) {
                integerLocal32 = integerLocal32 + 16777216;
              }
              rgbSpriteLocal14.integerArrayState0024[34 + (integerLocal7 * 72 + 1)] = integerLocal32;
            }
          }
          for (integerLocal15 = 0; integerLocal15 < 17; integerLocal15++) {
            for (integerLocal19 = 0; integerLocal19 < 36; integerLocal19++) {
              regionExit1: {
                integerLocal22 = rgbSpriteLocal14.integerArrayState0024[integerLocal19 + integerLocal15 * 72];
                integerLocal25 = rgbSpriteLocal14.integerArrayState0024[integerLocal19 + (integerLocal15 * 72 + 72)];
                integerLocal27 = ((integerLocal25 & 16711423) >> 1) + ((16711423 & integerLocal22) >> 1);
                if ((integerLocal22 | integerLocal25) < 16777216 && ((16777215 & integerLocal22) == 0 ||
                  (16777215 & integerLocal25) == 0)) {
                  integerLocal27 = 0;
                  break regionExit1;
                }
                if (integerLocal27 == 0) {
                  integerLocal27 = 1;
                }
              }
              rgbSpriteLocal14.integerArrayState0024[36 + (integerLocal19 + 72 * integerLocal15)] = integerLocal27;
            }
          }
          if (booleanArgument2) {
            for (integerLocal16 = 0; integerLocal16 < 36; integerLocal16++) {
              regionExit2: {
                integerLocal20 = rgbSpriteLocal13.integerArrayState0024[1224 + integerLocal16];
                integerLocal23 = rgbSpriteLocal13.integerArrayState0024[integerLocal16];
                integerLocal26 = (8355711 & integerLocal20 >> 1) + ((16711423 & integerLocal23) >> 1);
                if ((integerLocal23 | integerLocal20) < 16777216 && ((integerLocal20 & 16777215) == 0 ||
                  (16777215 & integerLocal23) == 0)) {
                  integerLocal26 = 0;
                  break regionExit2;
                }
                if (integerLocal26 == 0) {
                  integerLocal26 = 1;
                }
              }
              rgbSpriteLocal14.integerArrayState0024[36 + integerLocal16 + 1224] = integerLocal26;
            }
          }
          for (integerLocal17 = 0; integerLocal17 < 18; integerLocal17++) {
            for (integerLocal21 = 0; integerLocal21 < 36; integerLocal21++) {
              integerLocal24 = rgbSpriteLocal14.integerArrayState0024[72 * integerLocal17 + integerLocal21];
              integerLocal24 = integerLocal24 & 16777215;
              rgbSpriteLocal14.integerArrayState0024[integerLocal21 + 72 * integerLocal17] = integerLocal24;
            }
          }
          integerLocal18 = 23 % ((59 - byteArgument3) / 42);
          stackRgbSpriteLocal1 = rgbSpriteLocal14;
          return stackRgbSpriteLocal1;
        } catch (java.lang.RuntimeException caughtParameterLocal33) {
          caughtExceptionLocal5 = caughtParameterLocal33;
          runtimeExceptionLocal6 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal6;
          stackStringBuilderLocal3 = new StringBuilder().append("me.D(");
          if (rgbSpriteArgument1 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(',').append(booleanArgument2).append(',').append(byteArgument3).append(',').append(booleanArgument4).append(')').toString());
        }
    }

    static {
        stringState0346 = "Orb coins: ";
        stringState0347 = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        stringState0345 = "Members";
        indexedSpriteState0002 = new IndexedSprite(0, 0, 0);
        integerState0503 = 9;
        integerArrayState0156 = new int[8];
    }
}
