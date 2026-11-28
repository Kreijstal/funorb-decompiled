/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport138 {
    int[] integerArrayState0240;
    short[] shortArrayState0001;
    short[] shortArrayState0002;
    short[] shortArrayState0003;
    static RgbSprite rgbSpriteState0063;
    short[] shortArrayState0004;
    int integerState0849;
    int[] integerArrayState0241;
    int[] integerArrayState0242;
    int integerState0850;
    int[] integerArrayState0243;
    int[] integerArrayState0244;
    static RgbSprite rgbSpriteState0064;
    static String stringState0591;
    short[] shortArrayState0005;
    static NetworkSupport008 networkSupport008State0001;
    short[] shortArrayState0006;
    short shortState0001;
    int[] integerArrayState0245;
    int[] integerArrayState0246;
    short[] shortArrayState0007;
    int integerState0851;
    static String[] stringArrayState0053;
    short shortState0002;
    byte[] byteArrayState0033;
    private boolean booleanState0210;
    int[] integerArrayState0247;
    short[] shortArrayState0008;
    short shortState0003;
    short[] shortArrayState0009;
    short[] shortArrayState0010;
    static int[] integerArrayState0248;
    int[] integerArrayState0249;
    short[] shortArrayState0011;
    short[] shortArrayState0012;
    short[] shortArrayState0013;
    short[] shortArrayState0014;
    short[] shortArrayState0015;
    int integerState0852;
    short[] shortArrayState0016;
    short[] shortArrayState0017;
    static String stringState0592;
    int integerState0853;
    byte byteState0004;
    short[] shortArrayState0018;
    int integerState0854;

    final void performAction1718(int integerArgument1) {
        int integerLocal1 = 0;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        int integerLocal6;
        int integerLocal7;
        int integerLocal8;
        int integerLocal9;
        int integerLocal10;
        int integerLocal11;
        integerLocal11 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (this.booleanState0210) {
          return;
        }
        this.booleanState0210 = true;
        integerLocal2 = 32767;
        integerLocal3 = 32767;
        integerLocal4 = 32767;
        if (integerArgument1 != -14200) {
          this.performAction1720(70, 90, (byte) -86, 59, -78);
        }
        integerLocal5 = -32768;
        integerLocal6 = -32768;
        integerLocal7 = -32768;
        for (integerLocal1 = 0; integerLocal1 < this.shortState0003; integerLocal1++) {
          integerLocal8 = this.shortArrayState0001[integerLocal1];
          integerLocal9 = this.shortArrayState0004[integerLocal1];
          if (integerLocal8 > integerLocal5) {
            integerLocal5 = integerLocal8;
          }
          integerLocal10 = this.shortArrayState0009[integerLocal1];
          if (integerLocal8 < integerLocal2) {
            integerLocal2 = integerLocal8;
          }
          if (integerLocal9 > integerLocal6) {
            integerLocal6 = integerLocal9;
          }
          if (integerLocal9 < integerLocal3) {
            integerLocal3 = integerLocal9;
          }
          if (integerLocal7 < integerLocal10) {
            integerLocal7 = integerLocal10;
          }
          if (integerLocal4 > integerLocal10) {
            integerLocal4 = integerLocal10;
          }
        }
        this.integerState0851 = integerLocal5;
        this.integerState0849 = integerLocal2;
        this.integerState0854 = integerLocal7;
        this.integerState0853 = integerLocal4;
        this.integerState0850 = integerLocal6;
        this.integerState0852 = integerLocal3;
    }

    final static void performAction1721(int integerArgument1, int integerArgument2, int integerArgument3) {
        LobbyRoomRow sceneWidgetPart013Local1 = null;
        LobbyRoomRow sceneWidgetPart013Local2 = null;
        CipherPacketBuffer cipherPacketBufferLocal3 = null;
        if (integerArgument1 != -20974) {
          return;
        }
        if (MixedSupport119.integerState0772 != integerArgument3) {
          sceneWidgetPart013Local1 = (LobbyRoomRow) (MixedSupport121.secondaryNodeHashTableState0005.get(24710, (long)MixedSupport119.integerState0772));
          sceneWidgetPart013Local2 = sceneWidgetPart013Local1;
          if (sceneWidgetPart013Local2 != null) {
            sceneWidgetPart013Local2.stringArrayState0052 = null;
          }
          MixedSupport119.integerState0772 = integerArgument3;
          cipherPacketBufferLocal3 = SocketFactory.cipherPacketBufferState0002;
          cipherPacketBufferLocal3.performAction1641(integerArgument2, -4);
          cipherPacketBufferLocal3.writeByte(true, 3);
          cipherPacketBufferLocal3.writeByte(true, 11);
          cipherPacketBufferLocal3.writeShort(-1, integerArgument3);
        }
    }

    final static void performAction1722(int integerArgument1, boolean booleanArgument2, boolean booleanArgument3, int integerArgument4) {
        int stackIntegerLocal1 = 0;
        SceneWidget stackSceneWidgetLocal2 = null;
        String stackStringLocal3 = null;
        SceneWidget stackSceneWidgetLocal4 = null;
        int stackIntegerLocal5 = 0;
        String stackStringLocal6 = null;
        String stackStringLocal7 = null;
        SceneWidget stackSceneWidgetLocal8 = null;
        boolean stackBooleanLocal9 = false;
        boolean stackBooleanLocal10 = false;
        SceneWidget stackSceneWidgetLocal11 = null;
        boolean stackBooleanLocal12 = false;
        boolean stackBooleanLocal13 = false;
        SceneWidget stackSceneWidgetLocal14 = null;
        boolean stackBooleanLocal15 = false;
        boolean stackBooleanLocal16 = false;
        RuntimeException caughtExceptionLocal17 = null;
        RuntimeException runtimeExceptionLocal18 = null;
        SceneWidget sceneWidgetLocal19 = null;
        SceneWidget sceneWidgetLocal20 = null;
        int integerLocal21 = 0;
        int integerLocal22 = 0;
        int integerLocal23 = 0;
        Object objectLocal24 = null;
        int integerLocal25 = 0;
        int integerLocal26 = 0;
        Object objectLocal27 = null;
        String stringLocal28 = null;
        int integerLocal29 = 0;
        int integerLocal30 = 0;
        SceneWidget sceneWidgetLocal31 = null;
        String stringLocal32 = null;
        SceneWidget sceneWidgetLocal33 = null;
        Object objectLocal34;
        int integerLocal35;
        int integerLocal36;
        integerLocal29 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          BirthDateValidator.performAction1350(RenderingSupport001.integerState0064, 109);
          if (UiComponentPart011.sceneWidgetPart013State0002 != null) {
            MixedSupport039.sceneWidgetState0030.integerState0915 = 0;
            sceneWidgetLocal31 = MixedSupport039.sceneWidgetState0030;
            sceneWidgetLocal33 = sceneWidgetLocal31;
            sceneWidgetLocal33.integerState0896 = 0;
            MixedSupport087.sceneWidgetState0091.integerState0915 = 0;
            sceneWidgetLocal19 = MixedSupport087.sceneWidgetState0091;
            sceneWidgetLocal19.integerState0896 = 0;
            sceneWidgetLocal20 = MixedSupport121.sceneWidgetState0117;
            MixedSupport121.sceneWidgetState0117.integerState0915 = 0;
            sceneWidgetLocal20.integerState0896 = 0;
            MixedSupport042.sceneWidgetState0033.stringState0598 = MixedSupport020.stringState0094.toUpperCase();
            integerLocal21 = (2 + NetworkSupport008.sceneWidgetState0093.integerState0896) / 2;
            MixedSupport121.sceneWidgetState0117.performAction1764(-2 + integerLocal21, integerArgument4 ^ 48, -40 + NetworkSupport008.sceneWidgetState0093.integerState0915, 40, 0);
            MixedSupport087.sceneWidgetState0091.performAction1764(NetworkSupport008.sceneWidgetState0093.integerState0896 - integerLocal21, integerArgument4 - 48, -40 + NetworkSupport008.sceneWidgetState0093.integerState0915, 40, integerLocal21);
            if (UiComponentPart002.integerArrayState0014.length == 1 &&
              UiComponentPart002.integerArrayState0014[0] == 2) {
              integerLocal22 = 0;
            } else {
              integerLocal22 = 0;
              integerLocal23 = 0;
              integerLocal25 = 0;
              while (true) {
                if (UiComponentPart002.integerArrayState0014.length > integerLocal25) {
                  stackIntegerLocal1 = ((MixedSupport070.byteArrayState0011[integerLocal25 / 8] & 1 << (integerLocal25 & 7)) == 0) ? 0 : 1;
                  integerLocal26 = stackIntegerLocal1;
                  if (integerLocal26 != 0) {
                    integerLocal23++;
                  }
                  if (integerLocal26 != 0 &&
                    UiComponentPart002.integerArrayState0014[integerLocal25] != 2) {
                    integerLocal22 = 1;
                  } else {
                    integerLocal25++;
                    continue;
                  }
                }
                if (0 != integerLocal23) {
                  break;
                }
                integerLocal22 = 1;
                break;
              }
            }
            MixedSupport087.sceneWidgetState0091.booleanState0212 = true;
            if (MixedSupport040.booleanState0047) {
              ComponentDecorator.sceneWidgetState0078.booleanState0212 = false;
              MixedSupport020.sceneWidgetState0012.stringState0598 = CacheWorkQueue.stringState0263;
              if (integerLocal22 == 0) {
                stackStringLocal7 = GameDomainSupport006.stringState0626;
              } else {
                stackStringLocal7 = MixedSupport052.stringState0218;
              }
              stringLocal32 = stackStringLocal7;
              objectLocal24 = stringLocal32;
              objectLocal24 = stringLocal32;
              objectLocal24 = stringLocal32;
              integerLocal36 = MixedSupport121.sceneWidgetState0117.bitmapFontState0020.computeInteger1066(stringLocal32) + 3 * MixedSupport121.sceneWidgetState0117.bitmapFontState0020.computeInteger1064('.');
              MixedSupport121.sceneWidgetState0117.integerState0916 = 0;
              MixedSupport121.sceneWidgetState0117.integerState0893 = (-integerLocal36 + MixedSupport121.sceneWidgetState0117.integerState0896) / 2;
              if ((48 & UiComponentPart020.integerState0552) == 16) {
                objectLocal24 = stringLocal32 + ".";
              }
              if ((UiComponentPart020.integerState0552 & 48) == 32) {
                objectLocal24 = (String) (objectLocal24) + "..";
              }
              if ((48 & UiComponentPart020.integerState0552) == 48) {
                objectLocal24 = (String) (objectLocal24) + "...";
              }
              MixedSupport121.sceneWidgetState0117.stringState0598 = (String) (objectLocal24);
              MixedSupport087.sceneWidgetState0091.stringState0598 = MixedSupport036.stringState0167.toUpperCase();
            } else {
              stackSceneWidgetLocal2 = MixedSupport087.sceneWidgetState0091;
              if (integerLocal22 != 0) {
                stackStringLocal3 = MouseInput.stringState0619;
              } else {
                stackStringLocal3 = AgeValidator.stringState0304;
              }
              stackSceneWidgetLocal2.stringState0598 = ((String) (Object) stackStringLocal3).toUpperCase();
              stackSceneWidgetLocal4 = MixedSupport020.sceneWidgetState0012;
              stackIntegerLocal5 = 94;
              if (integerLocal22 == 0) {
                stackStringLocal6 = MixedSupport145.stringState0610;
              } else {
                stackStringLocal6 = MixedSupport004.stringState0016;
              }
              stackSceneWidgetLocal4.stringState0598 = NodeHashTableIterator.substituteIndexedPlaceholders(stackIntegerLocal5, stackStringLocal6, new String[]{MixedSupport087.sceneWidgetState0091.stringState0598});
              ComponentDecorator.sceneWidgetState0078.booleanState0212 = true;
              MixedSupport121.sceneWidgetState0117.stringState0598 = MixedSupport069.stringState0310;
              LobbyRoomRow.booleanState0207 = true;
              if (MixedSupport009.integerArrayArrayState0004 != null) {
                MixedSupport046.booleanState0052 = false;
                if (SceneWidgetNode.byteArrayState0012 == null) {
                  SceneWidgetNode.byteArrayState0012 = new byte[MixedSupport063.integerState0336];
                  MixedSupport108.booleanArrayState0009 = new boolean[MixedSupport063.integerState0336];
                }
                LobbyRoomRow.booleanState0207 = false;
                integerLocal30 = 0;
                integerLocal35 = integerLocal30;
                while (integerLocal30 < MixedSupport063.integerState0336) {
                  MixedSupport108.booleanArrayState0009[integerLocal30] = false;
                  integerLocal30++;
                }
                MixedSupport127.performAction1629(-1, true, -1, 0, -1, MixedSupport063.integerState0336, UiComponentPart011.sceneWidgetPart013State0002, false);
                if (!(2 > PasswordValidator.integerState0776) &&
                  MixedSupport011.booleanArrayState0002[12]) {
                  LobbyRoomRow.booleanState0207 = true;
                }
              }
              if (!LobbyRoomRow.booleanState0207) {
                MixedSupport087.sceneWidgetState0091.booleanState0212 = false;
                if (MixedSupport087.sceneWidgetState0091.booleanState0211) {
                  objectLocal24 = null;
                  if (MixedSupport046.booleanState0052) {
                    objectLocal24 = "<col=A00000>" + PlayerNamePrompt.stringState0215 + "</col>";
                    objectLocal27 = objectLocal24;
                    objectLocal24 = objectLocal27;
                    objectLocal34 = objectLocal24;
                    objectLocal24 = objectLocal34;
                  }
                  for (integerLocal36 = 0; MixedSupport063.integerState0336 > integerLocal36; integerLocal36++) {
                    if (MixedSupport108.booleanArrayState0009[integerLocal36]) {
                      stringLocal28 = "<col=A00000>" + AccountFieldStatusIndicator.stringArrayState0026[integerLocal36] + "</col>";
                      objectLocal24 = stringLocal28;
                      objectLocal24 = stringLocal28;
                      if (objectLocal24 != null) {
                        objectLocal24 = (String) (objectLocal24) + ", " + stringLocal28;
                      } else {
                        objectLocal24 = stringLocal28;
                      }
                    }
                  }
                  MixedSupport117.stringState0515 = "<col=A00000>" + BucketBoard.stringState0336 + "<br>" + PlayerNamePrompt.stringState0216 + (String) (objectLocal24);
                }
              }
            }
          }
          stackSceneWidgetLocal8 = IsaacRandom.sceneWidgetState0023;
          stackBooleanLocal9 = false;
          stackBooleanLocal10 = (booleanArgument2) && (!booleanArgument3) && (!NanoFrameTimer.booleanState0028);
          ((SceneWidget) (Object) stackSceneWidgetLocal8).performAction1772(stackBooleanLocal9, stackBooleanLocal10);
          stackSceneWidgetLocal11 = NetworkSupport008.sceneWidgetState0093;
          stackBooleanLocal12 = false;
          stackBooleanLocal13 = (booleanArgument2) && (!booleanArgument3) && (!NanoFrameTimer.booleanState0028);
          ((SceneWidget) (Object) stackSceneWidgetLocal11).performAction1772(stackBooleanLocal12, stackBooleanLocal13);
          stackSceneWidgetLocal14 = MixedSupport083.sceneWidgetState0087;
          stackBooleanLocal15 = false;
          stackBooleanLocal16 = (booleanArgument2) && (!booleanArgument3) && (NanoFrameTimer.booleanState0028);
          ((SceneWidget) (Object) stackSceneWidgetLocal14).performAction1772(stackBooleanLocal15, stackBooleanLocal16);
          PcmResampler.mixedSupport006State0002.sceneWidgetPart011State0001.performAction1574(false);
          if (integerArgument4 != 48) {
            MixedSupport138.performAction1721(49, 2, 67);
          }
          if (UiComponentPart011.sceneWidgetPart013State0002 != null) {
            if (ComponentDecorator.sceneWidgetState0078.integerState0891 != 0) {
              MixedSupport131.performAction1671(integerArgument1, integerArgument4 ^ 52);
            }
            if (MixedSupport087.sceneWidgetState0091.integerState0891 != 0) {
              if (MixedSupport040.booleanState0047) {
                ResourceArchive.writeTwoByteCommand(integerArgument1, 1);
              } else {
                MixedSupport122.performAction1603(integerArgument1, true);
              }
            }
            MixedSupport081.performAction1030(UiComponentPart011.sceneWidgetPart013State0002, true, integerArgument1, (byte) -127);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal37) {
          caughtExceptionLocal17 = caughtParameterLocal37;
          runtimeExceptionLocal18 = caughtExceptionLocal17;
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeExceptionLocal18), "vg.A(" + integerArgument1 + ',' + booleanArgument2 + ',' + booleanArgument3 + ',' + integerArgument4 + ')');
        }
    }

    private final void performAction1723(boolean booleanArgument1) {
        this.booleanState0210 = booleanArgument1 ? true : false;
    }

    final static ResourceArchive computeResourceArchive1719(int integerArgument1, int integerArgument2) {
        if (integerArgument2 <= 20) {
          integerArrayState0248 = (int[]) null;
        }
        return MixedSupport068.computeResourceArchive0841(true, 1, integerArgument1, false, false, false);
    }

    final void performAction1717(byte byteArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        int integerLocal1 = 0;
        int integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        for (integerLocal1 = 0; this.shortState0003 > integerLocal1; integerLocal1++) {
          this.shortArrayState0001[integerLocal1] = (short)(this.shortArrayState0001[integerLocal1] + integerArgument2);
          this.shortArrayState0004[integerLocal1] = (short)(this.shortArrayState0004[integerLocal1] + integerArgument3);
          this.shortArrayState0009[integerLocal1] = (short)(this.shortArrayState0009[integerLocal1] + integerArgument4);
        }
        if (byteArgument1 > -62) {
          this.byteState0004 = (byte) 59;
        }
        this.performAction1723(false);
    }

    final void performAction1720(int integerArgument1, int integerArgument2, byte byteArgument3, int integerArgument4, int integerArgument5) {
        int integerLocal1 = 0;
        int integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        int integerLocal3 = 19 % ((68 - byteArgument3) / 34);
        for (integerLocal1 = 0; this.shortState0003 > integerLocal1; integerLocal1++) {
          this.shortArrayState0001[integerLocal1] = (short)(this.shortArrayState0001[integerLocal1] * integerArgument2 / integerArgument5);
          this.shortArrayState0004[integerLocal1] = (short)(integerArgument1 * this.shortArrayState0004[integerLocal1] / integerArgument5);
          this.shortArrayState0009[integerLocal1] = (short)(this.shortArrayState0009[integerLocal1] * integerArgument4 / integerArgument5);
        }
        this.performAction1723(false);
    }

    public static void clearStaticReferences(byte byteArgument1) {
        stringArrayState0053 = null;
        int integerLocal1 = 0 / ((10 - byteArgument1) / 39);
        stringState0591 = null;
        stringState0592 = null;
        rgbSpriteState0063 = null;
        rgbSpriteState0064 = null;
        integerArrayState0248 = null;
        networkSupport008State0001 = null;
    }

    MixedSupport138() {
        this.booleanState0210 = false;
        this.byteState0004 = (byte) 0;
    }

    static {
        stringState0591 = "Chat is currently disabled.";
        stringArrayState0053 = new String[16];
        integerArrayState0248 = new int[8192];
        stringState0592 = "Only show lobby chat from my friends";
    }
}
