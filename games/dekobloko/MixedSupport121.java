/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport121 {
    static SceneWidget sceneWidgetState0111;
    static String stringState0511;
    private int integerState0749;
    boolean booleanState0177;
    private int integerState0750;
    static int integerState0751;
    static RawPcmStream[][] rawPcmStreamArrayArrayState0001;
    private boolean booleanState0178;
    private int integerState0752;
    static int integerState0753;
    static RgbSprite rgbSpriteState0056;
    static String stringState0512;
    int integerState0754;
    private int integerState0755;
    int integerState0756;
    static ResourceArchive resourceArchiveState0021;
    static String stringState0513;

    final void performAction1719(int integerArgument1, byte byteArgument2) {
        if (this.integerState0755 == 0) {
          this.integerState0754 = integerArgument1;
          this.booleanState0177 = true;
          this.booleanState0178 = false;
        }
        if (byteArgument2 >= -53) {
          stringState0513 = (String) null;
        }
    }

    final boolean computeBoolean1723(boolean booleanArgument1) {
        if (!booleanArgument1) {
          MixedSupport121.performAction1731(-70);
        }
        return this.integerState0755 != 0 ? true : false;
    }

    final boolean computeBoolean1729(int integerArgument1) {
        if (integerArgument1 <= 111) {
          rgbSpriteState0056 = (RgbSprite) null;
        }
        return this.integerState0752 == 102 ? true : false;
    }

    final void performAction1724(boolean booleanArgument1, int integerArgument2, int integerArgument3) {
        this.integerState0755 = 0;
        this.booleanState0178 = booleanArgument1 ? true : false;
        if (this.booleanState0178) {
          this.integerState0754 = integerArgument3;
        }
        int integerLocal1 = -68 / ((54 - integerArgument2) / 44);
    }

    final boolean computeBoolean1716(byte byteArgument1) {
        if (byteArgument1 != -51) {
          return false;
        }
        return this.integerState0752 == 103 ? true : false;
    }

    final boolean computeBoolean1728(boolean booleanArgument1) {
        if (!booleanArgument1) {
          return true;
        }
        return this.integerState0752 == 96 ? true : false;
    }

    final void performAction1717(byte byteArgument1, int integerArgument2) {
        if (byteArgument1 != 58) {
          this.integerState0754 = 111;
        }
        this.integerState0752 = 0;
        this.integerState0749 = 0;
        this.booleanState0177 = false;
        if (0 == this.integerState0755) {
          this.integerState0752 = MixedSupport153.integerState0931;
        }
        if (0 == this.integerState0755 &&
          MixedSupport153.integerState0931 == 96) {
          if (this.integerState0754 <= 0) {
            this.integerState0754 = this.integerState0756;
          }
          this.booleanState0178 = false;
          this.integerState0754 = this.integerState0754 - 1;
          this.booleanState0177 = true;
        }
        if (this.integerState0755 == 0 &&
          MixedSupport153.integerState0931 == 97) {
          this.integerState0754 = this.integerState0754 + 1;
          this.booleanState0178 = false;
          this.booleanState0177 = true;
          if (this.integerState0756 <= this.integerState0754) {
            this.integerState0754 = 0;
          }
        }
        if (this.integerState0755 == 0 && (98 == MixedSupport153.integerState0931 ||
          MixedSupport153.integerState0931 == 99)) {
          if (this.integerState0754 < 0) {
            this.integerState0754 = integerArgument2;
          }
          this.booleanState0178 = false;
          this.booleanState0177 = true;
        }
    }

    final boolean computeBoolean1727(int integerArgument1) {
        int integerLocal1 = 90 % ((31 - integerArgument1) / 42);
        return this.integerState0752 == 97 ? true : false;
    }

    final void performAction1722(int integerArgument1, int integerArgument2, int integerArgument3, boolean booleanArgument4) {
        this.booleanState0178 = booleanArgument4 ? true : false;
        this.integerState0755 = integerArgument2;
        if (this.booleanState0178) {
          this.integerState0754 = integerArgument3;
        } else {
          this.integerState0754 = integerArgument1;
        }
    }

    final void performAction1718(int integerArgument1) {
        this.booleanState0177 = false;
        this.integerState0749 = 0;
        if (integerArgument1 > -24) {
          return;
        }
        this.integerState0752 = 0;
        if (0 == this.integerState0755 &&
          MixedSupport153.integerState0931 == 98) {
          if (this.integerState0754 <= 0) {
            this.integerState0754 = this.integerState0756;
          }
          this.integerState0754 = this.integerState0754 - 1;
          this.booleanState0178 = false;
          this.booleanState0177 = true;
        }
        if (this.integerState0755 == 0) {
          this.integerState0752 = MixedSupport153.integerState0931;
        }
        if (0 == this.integerState0755 &&
          MixedSupport153.integerState0931 == 99) {
          this.integerState0754 = this.integerState0754 + 1;
          this.booleanState0178 = false;
          if (this.integerState0754 >= this.integerState0756) {
            this.integerState0754 = 0;
          }
          this.booleanState0177 = true;
        }
    }

    final static boolean computeBoolean1725(boolean booleanArgument1, CharSequence charSequenceArgument2, boolean booleanArgument3, int integerArgument4) {
        int integerLocal1 = 0;
        int stackIntegerLocal2 = 0;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        int integerLocal7 = 0;
        RuntimeException runtimeExceptionLocal8 = null;
        int integerLocal9 = 0;
        int integerLocal10 = 0;
        int integerLocal11 = 0;
        int integerLocal12 = 0;
        int integerLocal13 = 0;
        int integerLocal14 = 0;
        integerLocal14 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (integerArgument4 >= 2 &&
            integerArgument4 <= 36) {
            integerLocal7 = 0;
            integerLocal9 = 0;
            integerLocal10 = 0;
            integerLocal11 = charSequenceArgument2.length();
            for (integerLocal1 = 0; integerLocal1 < integerLocal11; integerLocal1++) {
              boolean frameRemainderLocal15 = true;
              integerLocal12 = charSequenceArgument2.charAt(integerLocal1);
              if ((0 == integerLocal1) &&
                (integerLocal12 == 45)) {
                integerLocal7 = 1;
                frameRemainderLocal15 = false;
              }
              if ((frameRemainderLocal15) && (0 != integerLocal1 || (integerLocal12 != 43 ||
                !booleanArgument3))) {
                if (48 <= integerLocal12 &&
                  57 >= integerLocal12) {
                  integerLocal12 -= 48;
                } else if (65 <= integerLocal12 &&
                  integerLocal12 <= 90) {
                  integerLocal12 -= 55;
                } else if (integerLocal12 >= 97 &&
                  integerLocal12 <= 122) {
                  integerLocal12 -= 87;
                } else {
                  return false;
                }
                if (integerLocal12 >= integerArgument4) {
                  return false;
                }
                if (integerLocal7 != 0) {
                  integerLocal12 = -integerLocal12;
                }
                integerLocal13 = integerLocal12 + integerLocal10 * integerArgument4;
                if (integerLocal13 / integerArgument4 != integerLocal10) {
                  return false;
                }
                integerLocal9 = 1;
                integerLocal10 = integerLocal13;
              }
            }
            if (!booleanArgument1) {
              stringState0513 = (String) null;
            }
            stackIntegerLocal2 = integerLocal9;
            return stackIntegerLocal2 != 0;
          }
          throw new IllegalArgumentException("" + integerArgument4);
        } catch (java.lang.RuntimeException caughtParameterLocal16) {
          caughtExceptionLocal6 = caughtParameterLocal16;
          runtimeExceptionLocal8 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal8;
          stackStringBuilderLocal4 = new StringBuilder().append("sk.O(").append(booleanArgument1).append(',');
          if (charSequenceArgument2 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(booleanArgument3).append(',').append(integerArgument4).append(')').toString());
        }
    }

    final static int computeInteger1720(int integerArgument1, int integerArgument2) {
        if (integerArgument2 >= -52) {
          integerState0751 = -122;
        }
        integerArgument1 = integerArgument1 & 8191;
        if (integerArgument1 < 4096) {
          return integerArgument1 < 2048 ? MixedSupport102.integerArrayState0180[integerArgument1] : MixedSupport102.integerArrayState0180[4096 - integerArgument1];
        }
        return integerArgument1 >= 6144 ? -MixedSupport102.integerArrayState0180[-integerArgument1 + 8192] : -MixedSupport102.integerArrayState0180[-4096 + integerArgument1];
    }

    final void performAction1730(int integerArgument1) {
        this.integerState0752 = 0;
        this.integerState0749 = integerArgument1;
        this.booleanState0177 = false;
        if (this.integerState0755 == 0) {
          this.integerState0752 = MixedSupport153.integerState0931;
        }
    }

    public static void performAction1731(int integerArgument1) {
        sceneWidgetState0111 = null;
        stringState0511 = null;
        stringState0512 = null;
        resourceArchiveState0021 = null;
        rgbSpriteState0056 = null;
        if (integerArgument1 != -28610) {
          MixedSupport121.performAction1731(69);
        }
        rawPcmStreamArrayArrayState0001 = (RawPcmStream[][]) null;
        stringState0513 = null;
    }

    final void performAction1721(int integerArgument1, int integerArgument2, int integerArgument3) {
        if (this.integerState0756 <= integerArgument1) {
          throw new IllegalArgumentException();
        }
        if (integerArgument3 >= this.integerState0756) {
          throw new IllegalArgumentException();
        }
        this.integerState0752 = 0;
        this.integerState0749 = 0;
        this.booleanState0177 = false;
        if (SceneWidgetPart005.integerState0328 != 0) {
          this.booleanState0178 = true;
          this.integerState0755 = SceneWidgetPart005.integerState0328;
          this.integerState0749 = SceneWidgetPart005.integerState0328;
          this.integerState0754 = integerArgument3;
          this.integerState0750 = UiComponentPart014.integerState0316;
        }
        if (this.integerState0755 != 0 &&
          DualNode.integerState0062 != 0) {
          if (this.integerState0750 <= 0) {
            this.integerState0750 = SceneWidgetPart009.integerState0647;
          }
          this.integerState0750 = this.integerState0750 - 1;
        }
        if (integerArgument2 != -20563) {
          return;
        }
        if (SceneWidgetPart005.integerState0328 == 0 &&
          DualNode.integerState0062 == 0) {
          this.integerState0755 = 0;
        }
        if (this.integerState0755 == 0 && (this.booleanState0178 ||
          MixedSupport106.booleanState0135)) {
          if (integerArgument1 >= 0) {
            if (this.integerState0754 != integerArgument1) {
              this.booleanState0177 = true;
            }
            this.booleanState0178 = true;
            this.integerState0754 = integerArgument1;
          } else {
            if (this.booleanState0178) {
              this.integerState0754 = -1;
            }
          }
        }
    }

    final boolean computeBoolean1726(byte byteArgument1) {
        boolean stackBooleanLocal1 = false;
        if (byteArgument1 != 114) {
          return false;
        }
        stackBooleanLocal1 = (0 != this.integerState0749) || (84 == this.integerState0752) || (this.integerState0752 == 83);
        return stackBooleanLocal1;
    }

    public MixedSupport121() {
        this.booleanState0178 = false;
        this.integerState0754 = 0;
    }

    MixedSupport121(int integerArgument1) {
        this.booleanState0178 = false;
        this.integerState0754 = 0;
        this.integerState0756 = integerArgument1;
    }

    static {
        stringState0511 = "START!";
        rawPcmStreamArrayArrayState0001 = new RawPcmStream[2][8];
        stringState0512 = "Private";
        stringState0513 = "Draw?";
    }
}
