/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport014 {
    static String stringState0066;
    private GameDomainSupport005[] gameDomainSupport005ArrayState0001;
    static boolean[][] booleanArrayArrayState0001;
    static String stringState0067;
    private int integerState0096;
    String stringState0068;
    static String stringState0069;
    float floatState0001;
    private int integerState0097;
    static String stringState0070;
    private int integerState0098;
    static int integerState0099;

    private final void performAction0211(String stringArgument1, int integerArgument2, String stringArgument3, String stringArgument4, int integerArgument5, ResourceArchive resourceArchiveArgument6) {
        GameDomainSupport005[] gameDomainSupport005ArrayLocal1 = null;
        GameDomainSupport005 gameDomainSupport005Local2 = null;
        GameDomainSupport005 gameDomainSupport005Local3 = null;
        int integerLocal4 = 0;
        try {
          if (this.integerState0098 >= this.gameDomainSupport005ArrayState0001.length) {
            gameDomainSupport005ArrayLocal1 = new GameDomainSupport005[2 * this.integerState0098];
            GameDomainSupport005[] gameDomainSupport005ArrayLocal5 = gameDomainSupport005ArrayLocal1;
            MixedSupport008.performAction0086(this.gameDomainSupport005ArrayState0001, 0, gameDomainSupport005ArrayLocal1, 0, this.integerState0098);
            this.gameDomainSupport005ArrayState0001 = gameDomainSupport005ArrayLocal1;
          }
          gameDomainSupport005Local2 = new GameDomainSupport005();
          gameDomainSupport005Local3 = gameDomainSupport005Local2;
          GameDomainSupport005 gameDomainSupport005Local6 = gameDomainSupport005Local3;
          gameDomainSupport005Local3.stringState0403 = stringArgument4;
          if (integerArgument2 != 2) {
            this.stringState0068 = (String) null;
          }
          gameDomainSupport005Local3.stringState0404 = stringArgument3;
          gameDomainSupport005Local3.stringState0402 = stringArgument1;
          gameDomainSupport005Local3.integerState0577 = integerArgument5;
          gameDomainSupport005Local3.resourceArchiveState0013 = resourceArchiveArgument6;
          integerLocal4 = this.integerState0098;
          this.integerState0098 = this.integerState0098 + 1;
          this.gameDomainSupport005ArrayState0001[integerLocal4] = gameDomainSupport005Local2;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "cb.C(" + (stringArgument1 != null ? "{...}" : "null") + ',' + integerArgument2 + ',' + (stringArgument3 != null ? "{...}" : "null") + ',' + (stringArgument4 != null ? "{...}" : "null") + ',' + integerArgument5 + ',' + (resourceArchiveArgument6 != null ? "{...}" : "null") + ')');
        }
    }

    public static void performAction0216(int integerArgument1) {
        booleanArrayArrayState0001 = (boolean[][]) null;
        if (integerArgument1 != 12623) {
          return;
        }
        stringState0066 = null;
        stringState0069 = null;
        stringState0070 = null;
        stringState0067 = null;
    }

    final boolean computeBoolean0208(int integerArgument1) {
        GameDomainSupport005 gameDomainSupport005Local1;
        int integerLocal2;
        GameDomainSupport005 gameDomainSupport005Local3;
        integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (integerArgument1 > -48) {
          this.computeBoolean0208(88);
        }
        while (this.integerState0097 < this.integerState0098) {
          gameDomainSupport005Local3 = this.gameDomainSupport005ArrayState0001[this.integerState0097];
          gameDomainSupport005Local1 = gameDomainSupport005Local3;
          if (!gameDomainSupport005Local3.resourceArchiveState0013.computeBoolean0904((byte) 121)) {
            this.performAction0213(gameDomainSupport005Local3, 30993, 0);
            return false;
          }
          if (gameDomainSupport005Local3.integerState0577 >= 0 &&
            !gameDomainSupport005Local3.resourceArchiveState0013.computeBoolean0924(gameDomainSupport005Local3.integerState0577, (byte) -106)) {
            this.performAction0213(gameDomainSupport005Local1, 30993, gameDomainSupport005Local3.resourceArchiveState0013.computeInteger0905((byte) 34, gameDomainSupport005Local3.integerState0577));
            return false;
          }
          if (null != gameDomainSupport005Local3.stringState0402 &&
            !gameDomainSupport005Local3.resourceArchiveState0013.computeBoolean0918(gameDomainSupport005Local3.stringState0402, (byte) -103)) {
            this.performAction0213(gameDomainSupport005Local1, 30993, gameDomainSupport005Local3.resourceArchiveState0013.computeInteger0915(20, gameDomainSupport005Local3.stringState0402));
            return false;
          }
          if (gameDomainSupport005Local3.integerState0577 < 0 &&
            gameDomainSupport005Local3.stringState0402 == null &&
            null != gameDomainSupport005Local3.stringState0404 &&
            !gameDomainSupport005Local3.resourceArchiveState0013.computeBoolean0921(false)) {
            this.performAction0213(gameDomainSupport005Local1, 30993, gameDomainSupport005Local3.resourceArchiveState0013.computeInteger0923((byte) -100));
            return false;
          }
          this.integerState0097 = this.integerState0097 + 1;
        }
        return true;
    }

    final static boolean computeBoolean0206(byte byteArgument1) {
        if (byteArgument1 != -128) {
          CharSequence charSequenceLocal1 = (CharSequence) null;
          MixedSupport014.computeInteger0207((byte) 49, (CharSequence) null);
          if (!MixedSupport016.computeBoolean0222(8192)) {
            return false;
          }
          if ((8 & CipherPacketBuffer.integerState0799) == 0) {
            return true;
          }
          return false;
        }
        if (!MixedSupport016.computeBoolean0222(8192)) {
          return false;
        }
        if ((8 & CipherPacketBuffer.integerState0799) == 0) {
          return true;
        }
        return false;
    }

    private final void performAction0213(GameDomainSupport005 gameDomainSupport005Argument1, int integerArgument2, int integerArgument3) {
        float floatLocal1 = 0.0f;
        RuntimeException runtimeExceptionLocal2 = null;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        try {
          if (integerArgument2 != 30993) {
            return;
          }
          floatLocal1 = (float)(this.integerState0097 + 1) + (float)integerArgument3 / 100.0f;
          this.floatState0001 = floatLocal1 * (float)this.integerState0096 / (float)(this.integerState0098 + 1);
          if (integerArgument3 != 0) {
            this.stringState0068 = gameDomainSupport005Argument1.stringState0404 + " - " + integerArgument3 + "%";
            return;
          }
          this.stringState0068 = gameDomainSupport005Argument1.stringState0403;
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal6 = caughtParameterLocal7;
          runtimeExceptionLocal2 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal2;
          stackStringBuilderLocal4 = new StringBuilder().append("cb.D(");
          if (gameDomainSupport005Argument1 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(integerArgument2).append(',').append(integerArgument3).append(')').toString());
        }
    }

    final void performAction0212(String stringArgument1, ResourceArchive resourceArchiveArgument2, String stringArgument3, byte byteArgument4, String stringArgument5) {
        try {
          int integerLocal1 = -19 / ((byteArgument4 - 43) / 42);
          this.performAction0211(stringArgument1, 2, stringArgument3, stringArgument5, -1, resourceArchiveArgument2);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "cb.F(" + (stringArgument1 != null ? "{...}" : "null") + ',' + (resourceArchiveArgument2 != null ? "{...}" : "null") + ',' + (stringArgument3 != null ? "{...}" : "null") + ',' + byteArgument4 + ',' + (stringArgument5 != null ? "{...}" : "null") + ')');
        }
    }

    final static void performAction0209(MixedSupport056 mixedSupport056Argument1, boolean booleanArgument2) {
        String stackStringLocal1;
        Object stackObjectLocal2;
        int stackIntegerLocal3;
        Object stackObjectLocal4;
        SceneWidget stackSceneWidgetLocal5;
        String stackStringLocal6;
        long stackLongLocal7;
        int stackIntegerLocal8;
        int stackIntegerLocal9 = 0;
        RuntimeException stackRuntimeExceptionLocal10 = null;
        StringBuilder stackStringBuilderLocal11 = null;
        String stackStringLocal12 = null;
        RuntimeException caughtExceptionLocal13 = null;
        RuntimeException runtimeExceptionLocal14 = null;
        int integerLocal15 = 0;
        int integerLocal16 = 0;
        MixedSupport104 mixedSupport104Local17 = null;
        String stringLocal18 = null;
        MixedSupport104 mixedSupport104Local19 = null;
        String stringLocal20 = null;
        MixedSupport104 mixedSupport104Local21 = null;
        String stringLocal22 = null;
        MixedSupport104 mixedSupport104Local23 = null;
        String stringLocal24 = null;
        MixedSupport104 mixedSupport104Local25 = null;
        try {
          stackStringLocal1 = mixedSupport056Argument1.stringState0238;
          stackObjectLocal2 = null;
          stackIntegerLocal3 = 100;
          stackObjectLocal4 = null;
          stackSceneWidgetLocal5 = mixedSupport056Argument1.sceneWidgetState0049;
          stackStringLocal6 = mixedSupport056Argument1.stringState0243;
          stackLongLocal7 = mixedSupport056Argument1.longState0021;
          stackIntegerLocal8 = mixedSupport056Argument1.integerState0290;
          if (mixedSupport056Argument1.integerState0290 == 1) {
            stackIntegerLocal9 = mixedSupport056Argument1.integerState0287;
          } else {
            stackIntegerLocal9 = 0;
          }
          MixedSupport122.performAction1732(stackStringLocal1, (int[]) (stackObjectLocal2), stackIntegerLocal3, (SceneWidgetPart008) (stackObjectLocal4), stackSceneWidgetLocal5, stackStringLocal6, stackLongLocal7, stackIntegerLocal8, stackIntegerLocal9);
          if (0 == mixedSupport056Argument1.integerState0290 &&
            !CodecSupport002.computeBoolean1250(-18163) &&
            MixedSupport016.sceneWidgetPart013State0001 == null &&
            null == UiComponentPart011.sceneWidgetPart013State0002) {
            if (!PacketBuffer.booleanState0228) {
              mixedSupport104Local17 = SceneWidget.mixedSupport104State0001;
              stringLocal18 = GameDomainSupport006.stringState0629;
              mixedSupport104Local17.sceneWidgetPart002State0002.performAction0620(stringLocal18, 14, -61);
            }
            mixedSupport104Local19 = SceneWidget.mixedSupport104State0001;
            stringLocal20 = CodecSupport003.stringState0471;
            mixedSupport104Local19.sceneWidgetPart002State0002.performAction0620(stringLocal20, 20, 91);
          }
          if (mixedSupport056Argument1.integerState0290 == 1 &&
            !CodecSupport002.computeBoolean1250(-18163) &&
            null != MixedSupport016.sceneWidgetPart013State0001 &&
            mixedSupport056Argument1.integerState0287 == MixedSupport016.sceneWidgetPart013State0001.computeInteger1937(125)) {
            if (!PacketBuffer.booleanState0228) {
              mixedSupport104Local21 = SceneWidget.mixedSupport104State0001;
              stringLocal22 = MixedSupport095.stringState0376;
              mixedSupport104Local21.sceneWidgetPart002State0002.performAction0620(stringLocal22, 14, 121);
            }
            mixedSupport104Local23 = SceneWidget.mixedSupport104State0001;
            stringLocal24 = MixedSupport028.stringState0139;
            mixedSupport104Local23.sceneWidgetPart002State0002.performAction0620(stringLocal24, 20, -57);
          }
          SceneWidget.mixedSupport104State0001.performAction1412(-92);
          SceneWidget.mixedSupport104State0001.performAction1410(booleanArgument2, 29072);
          SceneWidget.mixedSupport104State0001.performAction1404(mixedSupport056Argument1.integerState0290, (byte) -43, mixedSupport056Argument1.integerArrayState0065);
          SceneWidget.mixedSupport104State0001.performAction1403(17);
          SceneWidget.mixedSupport104State0001.performAction1400((byte) -51, mixedSupport056Argument1);
          mixedSupport104Local25 = SceneWidget.mixedSupport104State0001;
          integerLocal15 = UiComponentPart013.integerState0276;
          integerLocal16 = TextLineMetrics.integerState0535;
          mixedSupport104Local25.sceneWidgetPart002State0002.performAction0621(integerLocal16, integerLocal15, 121, 0, 0);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal26) {
          caughtExceptionLocal13 = caughtParameterLocal26;
          runtimeExceptionLocal14 = caughtExceptionLocal13;
          stackRuntimeExceptionLocal10 = runtimeExceptionLocal14;
          stackStringBuilderLocal11 = new StringBuilder().append("cb.J(");
          if (mixedSupport056Argument1 == null) {
            stackStringLocal12 = "null";
          } else {
            stackStringLocal12 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal10), ((StringBuilder) (Object) stackStringBuilderLocal11).append(stackStringLocal12).append(',').append(booleanArgument2).append(')').toString());
        }
    }

    final void performAction0210(String stringArgument1, byte byteArgument2, ResourceArchive resourceArchiveArgument3, String stringArgument4) {
        try {
          this.performAction0211((String) null, 2, stringArgument4, stringArgument1, -1, resourceArchiveArgument3);
          int integerLocal1 = 73 / ((6 - byteArgument2) / 37);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "cb.B(" + (stringArgument1 != null ? "{...}" : "null") + ',' + byteArgument2 + ',' + (resourceArchiveArgument3 != null ? "{...}" : "null") + ',' + (stringArgument4 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean computeBoolean0214(boolean booleanArgument1, CharSequence charSequenceArgument2, int integerArgument3) {
        int integerLocal1 = 0;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        int integerLocal6 = 0;
        RuntimeException runtimeExceptionLocal7 = null;
        String stringLocal8 = null;
        int integerLocal9 = 0;
        int integerLocal10 = 0;
        int integerLocal11 = 0;
        integerLocal11 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (charSequenceArgument2 == null) {
            return false;
          }
          if (integerArgument3 != 4564) {
            integerState0099 = 77;
          }
          integerLocal6 = charSequenceArgument2.length();
          if (integerLocal6 >= 1 &&
            integerLocal6 <= 12) {
            stringLocal8 = ComponentContainer.computeString1011(charSequenceArgument2, (byte) 2);
            if (stringLocal8 != null &&
              stringLocal8.length() >= 1) {
              if (!MixedSupport136.computeBoolean1870(stringLocal8.charAt(0), 32) &&
                !MixedSupport136.computeBoolean1870(stringLocal8.charAt(stringLocal8.length() - 1), 32)) {
                integerLocal9 = 0;
                for (integerLocal1 = 0; charSequenceArgument2.length() > integerLocal1; integerLocal1++) {
                  integerLocal10 = charSequenceArgument2.charAt(integerLocal1);
                  if (!MixedSupport136.computeBoolean1870((char) integerLocal10, 32)) {
                    integerLocal9 = 0;
                  } else {
                    integerLocal9++;
                  }
                  if (integerLocal9 >= 2 &&
                    !booleanArgument1) {
                    return false;
                  }
                }
                if (integerLocal9 <= 0) {
                  return true;
                }
                return false;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException caughtParameterLocal12) {
          caughtExceptionLocal5 = caughtParameterLocal12;
          runtimeExceptionLocal7 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal7;
          stackStringBuilderLocal3 = new StringBuilder().append("cb.G(").append(booleanArgument1).append(',');
          if (charSequenceArgument2 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(',').append(integerArgument3).append(')').toString());
        }
    }

    MixedSupport014(int integerArgument1) {
        this.gameDomainSupport005ArrayState0001 = new GameDomainSupport005[16];
        this.integerState0096 = integerArgument1;
    }

    final static void performAction0215(byte byteArgument1) {
        int integerLocal1;
        MixedSupport056 mixedSupport056Local2;
        MixedSupport056 mixedSupport056Local3;
        MixedSupport056 mixedSupport056Local4;
        MixedSupport056 mixedSupport056Local5;
        integerLocal1 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (MixedSupport049.integerState0264 < 0) {
          RenderingSupport001.integerState0065 = RenderingSupport001.integerState0065 - (MixedSupport049.integerState0264 >> 1);
        } else {
          RenderingSupport001.integerState0065 = RenderingSupport001.integerState0065 + (-MixedSupport049.integerState0264 >> 1);
        }
        MixedSupport049.integerState0264 = MixedSupport049.integerState0264 + RenderingSupport001.integerState0065;
        if (0 > MixedSupport049.integerState0264) {
          MixedSupport049.integerState0264 = MixedSupport049.integerState0264 - (MixedSupport049.integerState0264 >> 4);
          if (0 <= TextLineMetrics.integerState0534) {
            MouseInput.integerState0929 = MouseInput.integerState0929 + (-TextLineMetrics.integerState0534 >> 1);
          } else {
            MouseInput.integerState0929 = MouseInput.integerState0929 - (TextLineMetrics.integerState0534 >> 1);
          }
          TextLineMetrics.integerState0534 = TextLineMetrics.integerState0534 + MouseInput.integerState0929;
          if (TextLineMetrics.integerState0534 < 0) {
            TextLineMetrics.integerState0534 = TextLineMetrics.integerState0534 - (TextLineMetrics.integerState0534 >> 4);
          } else {
            TextLineMetrics.integerState0534 = TextLineMetrics.integerState0534 + (-TextLineMetrics.integerState0534 >> 4);
          }
          if (byteArgument1 != 71) {
            mixedSupport056Local2 = (MixedSupport056) null;
            MixedSupport014.performAction0209((MixedSupport056) null, false);
          }
          if (TextLineMetrics.integerState0534 > 0) {
            if (MouseInput.integerState0929 > 0) {
              MouseInput.integerState0929 = -MouseInput.integerState0929;
            }
            TextLineMetrics.integerState0534 = 0;
          }
          return;
        }
        MixedSupport049.integerState0264 = MixedSupport049.integerState0264 + (-MixedSupport049.integerState0264 >> 4);
        if (0 > TextLineMetrics.integerState0534) {
          MouseInput.integerState0929 = MouseInput.integerState0929 - (TextLineMetrics.integerState0534 >> 1);
          TextLineMetrics.integerState0534 = TextLineMetrics.integerState0534 + MouseInput.integerState0929;
          if (TextLineMetrics.integerState0534 < 0) {
            TextLineMetrics.integerState0534 = TextLineMetrics.integerState0534 - (TextLineMetrics.integerState0534 >> 4);
          } else {
            TextLineMetrics.integerState0534 = TextLineMetrics.integerState0534 + (-TextLineMetrics.integerState0534 >> 4);
          }
          if (byteArgument1 != 71) {
            mixedSupport056Local3 = (MixedSupport056) null;
            MixedSupport014.performAction0209((MixedSupport056) null, false);
          }
          if (TextLineMetrics.integerState0534 > 0) {
            if (MouseInput.integerState0929 > 0) {
              MouseInput.integerState0929 = -MouseInput.integerState0929;
            }
            TextLineMetrics.integerState0534 = 0;
          }
          return;
        }
        MouseInput.integerState0929 = MouseInput.integerState0929 + (-TextLineMetrics.integerState0534 >> 1);
        TextLineMetrics.integerState0534 = TextLineMetrics.integerState0534 + MouseInput.integerState0929;
        if (TextLineMetrics.integerState0534 >= 0) {
          TextLineMetrics.integerState0534 = TextLineMetrics.integerState0534 + (-TextLineMetrics.integerState0534 >> 4);
          if (byteArgument1 != 71) {
            mixedSupport056Local4 = (MixedSupport056) null;
            MixedSupport014.performAction0209((MixedSupport056) null, false);
          }
          if (TextLineMetrics.integerState0534 > 0) {
            if (MouseInput.integerState0929 > 0) {
              MouseInput.integerState0929 = -MouseInput.integerState0929;
            }
            TextLineMetrics.integerState0534 = 0;
          }
          return;
        }
        TextLineMetrics.integerState0534 = TextLineMetrics.integerState0534 - (TextLineMetrics.integerState0534 >> 4);
        if (byteArgument1 == 71) {
          if (TextLineMetrics.integerState0534 > 0) {
            if (MouseInput.integerState0929 > 0) {
              MouseInput.integerState0929 = -MouseInput.integerState0929;
            }
            TextLineMetrics.integerState0534 = 0;
          }
          return;
        }
        mixedSupport056Local5 = (MixedSupport056) null;
        MixedSupport014.performAction0209((MixedSupport056) null, false);
        if (TextLineMetrics.integerState0534 > 0) {
          if (MouseInput.integerState0929 > 0) {
            MouseInput.integerState0929 = -MouseInput.integerState0929;
          }
          TextLineMetrics.integerState0534 = 0;
        }
        return;
    }

    final static int computeInteger0207(byte byteArgument1, CharSequence charSequenceArgument2) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        int stackIntegerLocal3 = 0;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        try {
          integerLocal1 = 96 % ((3 - byteArgument1) / 35);
          stackIntegerLocal3 = SceneWidgetPart010.computeInteger1666(true, 4, 10, charSequenceArgument2);
          return stackIntegerLocal3;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal7 = caughtParameterLocal8;
          runtimeExceptionLocal2 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal2;
          stackStringBuilderLocal5 = new StringBuilder().append("cb.H(").append(byteArgument1).append(',');
          if (charSequenceArgument2 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(')').toString());
        }
    }

    static {
        stringState0067 = "Breaking real-world laws";
        stringState0066 = "Game full";
        stringState0069 = "Name";
        stringState0070 = "OH NO!";
    }
}
