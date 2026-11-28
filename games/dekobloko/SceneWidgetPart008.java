/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SceneWidgetPart008 extends SceneWidget {
    SceneWidget sceneWidgetState0089;
    static String stringState0368;
    SceneWidgetPart006 sceneWidgetPart006State0001;
    static boolean booleanState0123;
    static int[] integerArrayState0170;
    SceneWidget sceneWidgetState0090;

    final static void performAction1129(int integerArgument1) {
        int integerLocal1 = -114 % ((integerArgument1 - 79) / 35);
        MixedSupport040.performAction0530(48, (byte) -89, MouseWheelInput.rawSoundState0009);
    }

    public static void discardDeclaredStaticReferences(int integerArgument1) {
        integerArrayState0170 = null;
        if (integerArgument1 != 48) {
          integerArrayState0170 = (int[]) null;
        }
        stringState0368 = null;
    }

    final static int computeInteger1120(float floatArgument1, float floatArgument2, boolean booleanArgument3, float floatArgument4) {
        float floatLocal1;
        float floatLocal2;
        float floatLocal3;
        float floatLocal4;
        int integerLocal5;
        float floatLocal6;
        float floatLocal7;
        float floatLocal8;
        float floatLocal9;
        int integerLocal10;
        int integerLocal11;
        int integerLocal12;
        int integerLocal13;
        int integerLocal14;
        int integerLocal15;
        int integerLocal16;
        integerLocal15 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        floatLocal1 = 0.0f;
        floatLocal2 = 0.0f;
        floatLocal3 = 0.0f;
        floatLocal4 = floatArgument1 * 6.0f % 6.0f;
        integerLocal5 = (int)floatLocal4;
        floatLocal6 = floatLocal4 - (float)integerLocal5;
        floatLocal7 = (-floatArgument4 + 1.0f) * floatArgument2;
        floatLocal8 = (-(floatLocal6 * floatArgument4) + 1.0f) * floatArgument2;
        floatLocal9 = floatArgument2 * (-((1.0f - floatLocal6) * floatArgument4) + 1.0f);
        integerLocal10 = integerLocal5;
        if (integerLocal10 != 0) {
          if (integerLocal10 != 1) {
            if (integerLocal10 == 2) {
              floatLocal2 = floatArgument2;
              floatLocal1 = floatLocal7;
              floatLocal3 = floatLocal9;
            } else {
              if (integerLocal10 == 3) {
                floatLocal2 = floatLocal8;
                floatLocal3 = floatArgument2;
                floatLocal1 = floatLocal7;
              } else {
                if (4 != integerLocal10) {
                  if (integerLocal10 == 5) {
                    floatLocal1 = floatArgument2;
                    floatLocal3 = floatLocal8;
                    floatLocal2 = floatLocal7;
                  }
                } else {
                  floatLocal1 = floatLocal9;
                  floatLocal3 = floatArgument2;
                  floatLocal2 = floatLocal7;
                }
              }
            }
          } else {
            floatLocal2 = floatArgument2;
            floatLocal1 = floatLocal8;
            floatLocal3 = floatLocal7;
          }
        } else {
          floatLocal3 = floatLocal7;
          floatLocal1 = floatArgument2;
          floatLocal2 = floatLocal9;
        }
        if (booleanArgument3) {
          return 25;
        }
        integerLocal16 = 256;
        integerLocal11 = Math.min(Math.round((float)integerLocal16 * floatLocal1), integerLocal16 - 1);
        integerLocal12 = Math.min(Math.round(floatLocal2 * (float)integerLocal16), -1 + integerLocal16);
        integerLocal13 = Math.min(Math.round((float)integerLocal16 * floatLocal3), -1 + integerLocal16);
        integerLocal14 = 255 & integerLocal13 | (integerLocal12 << 8 & 65280 | 16711680 & integerLocal11 << 16);
        return integerLocal14;
    }

    private final boolean computeBoolean1126(boolean booleanArgument1, int integerArgument2, byte byteArgument3, int integerArgument4, int integerArgument5, int integerArgument6, boolean booleanArgument7) {
        int integerLocal1;
        int stackIntegerLocal2 = 0;
        if (byteArgument3 != 43) {
          this.performAction1125(97, true, false, -111);
        }
        if (!booleanArgument1) {
          if (this.booleanState0218) {
            stackIntegerLocal2 = (!booleanArgument7) ? 1 : 0;
          } else {
            stackIntegerLocal2 = 0;
          }
        } else {
          stackIntegerLocal2 = 1;
        }
        integerLocal1 = stackIntegerLocal2;
        this.sceneWidgetState0090.performAction1762((byte) -94, integerArgument6, this.sceneWidgetState0089.integerState0915, integerLocal1 != 0);
        this.performAction1123(integerArgument2, integerArgument5, byteArgument3 ^ 43, false, integerArgument4);
        return integerLocal1 != 0;
    }

    private final void performAction1127(int integerArgument1, int integerArgument2, int integerArgument3) {
        this.sceneWidgetState0089.integerState0896 = -integerArgument1 + (this.integerState0896 - integerArgument3);
        this.sceneWidgetState0089.integerState0915 = this.integerState0915;
        this.sceneWidgetState0090.integerState0890 = integerArgument2;
        this.sceneWidgetState0090.integerState0896 = -integerArgument1 + (this.integerState0896 - integerArgument3);
        this.sceneWidgetPart006State0001.performAction0771(this.integerState0896 - integerArgument3, (byte) -32, this.integerState0915, this.sceneWidgetState0090.integerState0915, integerArgument3, -this.sceneWidgetState0090.integerState0903, this.sceneWidgetState0089.integerState0915, 0);
    }

    final static RgbSprite computeRgbSprite1130(byte byteArgument1) {
        int integerLocal1 = 0;
        int integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        int integerLocal3 = MixedSupport123.integerArrayState0208[0] * MixedSupport052.integerArrayState0054[0];
        byte[] byteArrayLocal4 = SceneWidgetPart011.byteArrayArrayState0008[0];
        int[] integerArrayLocal5 = new int[integerLocal3];
        int integerLocal6;
        for (integerLocal1 = 0; integerLocal1 < integerLocal3; integerLocal1++) {
          integerArrayLocal5[integerLocal1] = NetworkSupport006.integerArrayState0152[PlayerBoardUpdateQueue.bitwiseAnd(255, (int) byteArrayLocal4[integerLocal1])];
        }
        integerLocal6 = -8 % ((byteArgument1 + 40) / 42);
        RgbSprite rgbSpriteLocal7 = new RgbSprite(MixedSupport029.integerState0181, MixedSupport057.integerState0297, InputAdapter003.integerArrayState0206[0], MixedSupport039.integerArrayState0047[0], MixedSupport123.integerArrayState0208[0], MixedSupport052.integerArrayState0054[0], integerArrayLocal5);
        MixedSupport089.performAction1138(127);
        return rgbSpriteLocal7;
    }

    final static boolean computeBoolean1121(int integerArgument1, int integerArgument2, int integerArgument3) {
        StringBuilder discarded$0 = null;
        int integerLocal2;
        int integerLocal3;
        String stringLocal4;
        int integerLocal5;
        String stringLocal6;
        String stringLocal7;
        int integerLocal8;
        int integerLocal9;
        int integerLocal10;
        String stringLocal11;
        String stringLocal12;
        String stringLocal13;
        String stringLocal14;
        String stringLocal15;
        String stringLocal16;
        String stringLocal17;
        String stringLocal18;
        String stringLocal19;
        Object objectLocal20;
        CharSequence charSequenceLocal21;
        int integerLocal22;
        String stringLocal23;
        String stringLocal24;
        String stringLocal25;
        String stringLocal26;
        String stringLocal27;
        String stringLocal28;
        String stringLocal29;
        String stringLocal30;
        objectLocal20 = null;
        integerLocal10 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (integerArgument2 != 1) {
          booleanState0123 = true;
        }
        integerLocal2 = 1;
        if (!ProxySocketFactory.booleanState0169 &&
          null == AccountRegistrationPanel.sceneWidgetState0116) {
          integerLocal2 = 0;
        }
        if (TextHotspotBounds.integerState0585 == 0 &&
          null != UiComponentPart011.sceneWidgetPart013State0002) {
          integerLocal2 = 0;
        }
        if (2 == TextHotspotBounds.integerState0585 &&
          !MixedSupport056.computeBoolean0666((byte) -53)) {
          integerLocal2 = 0;
        }
        if (MixedSupport146.integerState0931 == 84) {
          if (integerLocal2 == 0) {
            if (0 != TextHotspotBounds.integerState0585) {
              BufferedSocket.performAction1371((byte) 94);
            }
          } else {
            if (DialogMessagePane.stringBuilderState0001.length() <= 0) {
              BufferedSocket.performAction1371((byte) 94);
            } else {
              stringLocal4 = DialogMessagePane.stringBuilderState0001.toString();
              stringLocal6 = stringLocal4;
              stringLocal24 = stringLocal4;
              if (MixedSupport128.computeBoolean1635(integerArgument2 ^ 2049, stringLocal4)) {
                stringLocal12 = (String) null;
                stringLocal11 = (String) null;
                ContentTransitionDialog.performAction0184((String) null, (String) null, MixedSupport145.stringState0608, (byte) 90, 2, 0);
                stringLocal14 = (String) null;
                stringLocal13 = (String) null;
                ContentTransitionDialog.performAction0184((String) null, (String) null, MixedSupport132.stringState0571, (byte) 69, 2, 0);
                BufferedSocket.performAction1371((byte) 94);
              } else {
                integerLocal5 = TextHotspotBounds.integerState0585;
                if (integerLocal5 == 0 &&
                  null != MixedSupport016.sceneWidgetPart013State0001) {
                  integerLocal5 = 1;
                }
                if (ReturnedShape.computeInteger1429(0, integerLocal5) == 2) {
                  MixedSupport031.performAction0418(integerLocal5, integerArgument3, 1, (byte) 71);
                }
                UiComponent.performAction0208(integerArgument1, (byte) -85, TextHotspotBounds.integerState0585, MixedSupport029.stringState0149, -1, stringLocal4);
                BufferedSocket.performAction1371((byte) 94);
              }
            }
          }
          return true;
        }
        if (MixedSupport146.integerState0931 == 85) {
          if (integerLocal2 != 0 &&
            0 < DialogMessagePane.stringBuilderState0001.length()) {
            MixedSupport137.computeStringBuilder1715(DialogMessagePane.stringBuilderState0001, -23510, DialogMessagePane.stringBuilderState0001.length() - 1, ' ');
            return true;
          }
          return true;
        }
        integerLocal3 = ArchiveRequestManager.characterState0002;
        if (!MixedSupport069.isAcceptedTextInputCharacter((char) integerLocal3, 8212)) {
          return false;
        }
        if (integerLocal2 != 0 &&
          80 > DialogMessagePane.stringBuilderState0001.length()) {
          discarded$0 = DialogMessagePane.stringBuilderState0001.append((char) integerLocal3);
          integerLocal22 = 485;
          stringLocal16 = MixedSupport089.stringState0372;
          stringLocal23 = stringLocal16;
          stringLocal25 = stringLocal16;
          stringLocal15 = UiComponentPart002.computeString0079(integerArgument2 + 82, stringLocal16);
          stringLocal26 = stringLocal15;
          stringLocal27 = stringLocal15;
          stringLocal17 = stringLocal15;
          stringLocal28 = stringLocal17;
          stringLocal29 = stringLocal17;
          if (TextHotspotBounds.integerState0585 == 2) {
            charSequenceLocal21 = (CharSequence) ((Object) MixedSupport029.stringState0149);
            stringLocal19 = NodeHashTableIterator.substituteIndexedPlaceholders(94, NetworkSupport009.stringState0388, new String[]{MixedSupport125.computeString1621(charSequenceLocal21, true)});
            stringLocal7 = NodeHashTableIterator.substituteIndexedPlaceholders(108, CacheWorkQueue.stringState0266, new String[]{stringLocal15});
            integerLocal8 = MixedSupport038.bitmapFontState0013.stringWidth(stringLocal19);
            integerLocal9 = MixedSupport038.bitmapFontState0013.stringWidth(stringLocal7);
            if (integerLocal8 <= integerLocal9) {
              integerLocal22 = integerLocal22 - integerLocal9;
            } else {
              integerLocal22 = integerLocal22 - integerLocal8;
            }
          } else {
            stringLocal30 = "";
            if (TextHotspotBounds.integerState0585 == 0) {
              if (MixedSupport016.sceneWidgetPart013State0001 == null &&
                EmailFormatValidator.booleanState0077) {
                stringLocal30 = "[" + MixedSupport127.stringState0554 + "] ";
              }
              if (null != MixedSupport016.sceneWidgetPart013State0001) {
                if (MixedSupport146.booleanState0224 &&
                  null != MixedSupport033.stringState0158) {
                  stringLocal30 = "[" + MixedSupport033.stringState0158 + "] ";
                } else {
                  stringLocal30 = "[" + NodeHashTableIterator.substituteIndexedPlaceholders(125, BoundedRandomAccessFile.stringState0232, new String[]{MixedSupport016.sceneWidgetPart013State0001.stringState0585}) + "] ";
                }
              }
            }
            stringLocal18 = stringLocal30 + stringLocal17 + ": ";
            integerLocal22 = integerLocal22 - MixedSupport038.bitmapFontState0013.stringWidth(stringLocal18);
          }
          if (MixedSupport038.bitmapFontState0013.stringWidth(DialogMessagePane.stringBuilderState0001.toString()) > integerLocal22) {
            MixedSupport137.computeStringBuilder1715(DialogMessagePane.stringBuilderState0001, -23510, DialogMessagePane.stringBuilderState0001.length() - 1, ' ');
          }
        }
        return true;
    }

    final boolean computeBoolean1124(int integerArgument1, int integerArgument2, int integerArgument3, boolean booleanArgument4, int integerArgument5, boolean booleanArgument6) {
        if (integerArgument3 != -15230) {
          return false;
        }
        return this.computeBoolean1126(booleanArgument4, this.sceneWidgetState0089.integerState0915, (byte) 43, integerArgument1, integerArgument2, integerArgument5, booleanArgument6);
    }

    SceneWidgetPart008(long longArgument1, SceneWidget sceneWidgetArgument2, SceneWidget sceneWidgetArgument3, SceneWidgetPart006 sceneWidgetPart006Argument4) {
        super(longArgument1, (SceneWidget) null);
        try {
          this.sceneWidgetState0089 = new SceneWidget(0L, sceneWidgetArgument3);
          this.sceneWidgetPart006State0001 = new SceneWidgetPart006(0L, sceneWidgetPart006Argument4);
          this.performAction1768(this.sceneWidgetState0089, -16834);
          this.performAction1768(this.sceneWidgetPart006State0001, -16834);
          this.sceneWidgetState0090 = sceneWidgetArgument2;
          this.sceneWidgetState0089.performAction1768(sceneWidgetArgument2, -16834);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "nm.<init>(" + longArgument1 + ',' + (sceneWidgetArgument2 != null ? "{...}" : "null") + ',' + (sceneWidgetArgument3 != null ? "{...}" : "null") + ',' + (sceneWidgetPart006Argument4 != null ? "{...}" : "null") + ')');
        }
    }

    final static void performAction1132(byte byteArgument1) {
        if (byteArgument1 != 112) {
          booleanState0123 = false;
        }
    }

    final void performAction1125(int integerArgument1, boolean booleanArgument2, boolean booleanArgument3, int integerArgument4) {
        this.performAction1123(this.sceneWidgetState0089.integerState0915, integerArgument1, 0, booleanArgument3, integerArgument4);
        if (!booleanArgument2) {
          SceneWidgetPart008.performAction1132((byte) 66);
        }
    }

    final static void performAction1128(int integerArgument1) {
        if (!UiComponentPart001.computeBoolean0059((byte) -126)) {
          return;
        }
        ModalDialog.performAction0163(-11, 4, false);
        int integerLocal1 = -75 / ((-27 - integerArgument1) / 47);
    }

    final void performAction1122(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7) {
        this.integerState0896 = integerArgument6;
        if (integerArgument1 != 6) {
          return;
        }
        this.integerState0890 = integerArgument4;
        this.integerState0903 = integerArgument2;
        this.integerState0915 = integerArgument5;
        this.performAction1127(integerArgument7, 0, integerArgument3);
    }

    private final void performAction1123(int integerArgument1, int integerArgument2, int integerArgument3, boolean booleanArgument4, int integerArgument5) {
        if (this.sceneWidgetPart006State0001.computeBoolean0780((byte) 7)) {
          this.sceneWidgetState0090.integerState0904 = this.sceneWidgetState0090.integerState0904 + integerArgument5;
        }
        if (this.sceneWidgetPart006State0001.computeBoolean0779((byte) 78)) {
          this.sceneWidgetState0090.integerState0904 = this.sceneWidgetState0090.integerState0904 - integerArgument5;
        }
        if (this.sceneWidgetPart006State0001.computeBoolean0777((byte) -127)) {
          this.sceneWidgetState0090.integerState0904 = this.sceneWidgetState0090.integerState0904 + integerArgument1;
        }
        if (this.sceneWidgetPart006State0001.computeBoolean0776(integerArgument3)) {
          this.sceneWidgetState0090.integerState0904 = this.sceneWidgetState0090.integerState0904 - integerArgument1;
        }
        if (this.booleanState0218) {
          this.sceneWidgetState0090.integerState0904 = this.sceneWidgetState0090.integerState0904 - integerArgument2;
        }
        if (booleanArgument4) {
          if (0 > -(this.sceneWidgetState0090.integerState0903 + this.sceneWidgetState0090.integerState0904)) {
            this.sceneWidgetState0090.integerState0904 = -this.sceneWidgetState0090.integerState0903;
          }
          if (this.sceneWidgetState0090.integerState0895 + (this.sceneWidgetState0090.integerState0915 - this.sceneWidgetState0089.integerState0915) < -(this.sceneWidgetState0090.integerState0904 + this.sceneWidgetState0090.integerState0903)) {
            this.sceneWidgetState0090.integerState0904 = -this.sceneWidgetState0090.integerState0903 - (-this.sceneWidgetState0089.integerState0915 + (this.sceneWidgetState0090.integerState0895 + this.sceneWidgetState0090.integerState0915));
          }
        } else {
          if (-(this.sceneWidgetState0090.integerState0904 + this.sceneWidgetState0090.integerState0903) > this.sceneWidgetState0090.integerState0895 + this.sceneWidgetState0090.integerState0915 - this.sceneWidgetState0089.integerState0915) {
            this.sceneWidgetState0090.integerState0904 = -(-this.sceneWidgetState0089.integerState0915 + (this.sceneWidgetState0090.integerState0915 + this.sceneWidgetState0090.integerState0895)) - this.sceneWidgetState0090.integerState0903;
          }
          if (-(this.sceneWidgetState0090.integerState0903 + this.sceneWidgetState0090.integerState0904) < 0) {
            this.sceneWidgetState0090.integerState0904 = -this.sceneWidgetState0090.integerState0903;
          }
        }
        if (this.sceneWidgetPart006State0001.computeBoolean0781((byte) -2)) {
          this.sceneWidgetState0090.integerState0903 = -this.sceneWidgetPart006State0001.computeInteger0774(booleanArgument4, (byte) 88, this.sceneWidgetState0089.integerState0915, this.sceneWidgetState0090.integerState0915);
          this.sceneWidgetState0090.integerState0904 = 0;
        }
        this.sceneWidgetPart006State0001.performAction0772(this.sceneWidgetState0089.integerState0915, this.sceneWidgetState0090.integerState0915, 106, -this.sceneWidgetState0090.integerState0903);
    }

    static {
        stringState0368 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        integerArrayState0170 = new int[128];
    }
}
