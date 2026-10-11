/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class UiComponentPart030 extends UiComponentPart003 {
    private int integerState0765;
    private int integerState0766;
    private int integerState0767;
    static String stringState0519;
    static String stringState0520;
    private int integerState0768;
    static String[] stringArrayState0046;
    private int integerState0769;
    private int integerState0770;

    boolean computeBoolean0182(byte byteArgument1) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        if (this.integerState0769 > 0) {
          integerLocal1 = this.integerState0768;
          integerLocal2 = this.integerState0766;
          integerLocal3 = this.integerState0767 + 1;
          this.integerState0767 = this.integerState0767 + 1;
          if (this.integerState0769 <= integerLocal3) {
            this.integerState0769 = 0;
            this.performAction0202((byte) -52);
          } else {
            integerLocal4 = (-this.integerState0767 + 2 * this.integerState0769) * this.integerState0767;
            integerLocal5 = this.integerState0769 * this.integerState0769;
            integerLocal1 = integerLocal4 * (this.integerState0768 - this.integerState0765) / integerLocal5 + this.integerState0765;
            integerLocal2 = this.integerState0770 + integerLocal4 * (-this.integerState0770 + this.integerState0766) / integerLocal5;
          }
          this.performAction0174(110, integerLocal1, integerLocal2);
        }
        if (byteArgument1 < 15) {
          return true;
        }
        return super.computeBoolean0182((byte) 90);
    }

    final void performAction1761(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        if (integerArgument4 != 194) {
          this.performAction1761(35, 121, -128, 19);
        }
        if (integerArgument2 <= 0) {
          this.performAction0174(121, integerArgument1, integerArgument3);
          return;
        }
        this.integerState0769 = integerArgument2;
        this.integerState0766 = integerArgument3;
        this.integerState0765 = this.integerState0107;
        this.integerState0770 = this.integerState0108;
        this.integerState0768 = integerArgument1;
        this.integerState0767 = 0;
    }

    final static void performAction1763(byte byteArgument1) {
        if (byteArgument1 != -73) {
          return;
        }
        UiComponentPart006.uiComponentPart023State0001.performAction0201(new UiComponentPart017(), (byte) 121);
    }

    void performAction0203(int integerArgument1) {
        if (this.integerState0769 <= 0) {
          return;
        }
        this.performAction0174(112, this.integerState0768, this.integerState0766);
        this.integerState0769 = 0;
        this.performAction0202((byte) -32);
        int integerLocal1 = 40 % ((integerArgument1 + 15) / 49);
    }

    final static boolean computeBoolean1762(byte byteArgument1) {
        boolean stackBooleanLocal1 = false;
        if (byteArgument1 != 124) {
          stringState0519 = (String) null;
        }
        stackBooleanLocal1 = (MixedSupport052.integerState0269 >= 10) && (UiComponentPart004.integerState0091 >= 13);
        return stackBooleanLocal1;
    }

    UiComponentPart030(UiComponentPart016 uiComponentPart016Argument1, int integerArgument2, int integerArgument3) {
        super(uiComponentPart016Argument1, integerArgument2, integerArgument3);
        this.integerState0767 = 0;
        this.integerState0769 = 0;
    }

    boolean computeBoolean0180(byte byteArgument1) {
        this.performAction0203(38);
        if (byteArgument1 < 77) {
          stringState0519 = (String) null;
        }
        return super.computeBoolean0180((byte) 125);
    }

    void performAction0202(byte byteArgument1) {
        int integerLocal1 = -128 % ((byteArgument1 - 30) / 39);
    }

    final static void performAction1759(int integerArgument1, boolean booleanArgument2) {
        if (integerArgument1 < 104) {
          return;
        }
        MixedSupport134.performAction1851(true, booleanArgument2, 54);
    }

    void performAction0178(int integerArgument1, int integerArgument2, int integerArgument3) {
        int integerLocal1;
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
        int integerLocal12;
        int integerLocal13;
        int integerLocal14;
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
        integerLocal13 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (integerArgument1 > -127) {
          return;
        }
        SoftwareRaster.performAction0739(6 + integerArgument3, 35 + integerArgument2, -12 + this.integerState0107, this.integerState0108 - 40, 2105376, 0);
        integerLocal2 = 211;
        integerLocal1 = 35;
        integerLocal3 = 194;
        integerLocal4 = 0;
        integerLocal5 = integerArgument2;
        while (integerLocal1 > integerLocal4) {
          if (SoftwareRaster.integerState0280 <= integerLocal5 &&
            SoftwareRaster.integerState0283 > integerLocal5) {
            integerLocal6 = integerLocal2 + (-integerLocal2 + integerLocal3) * integerLocal4 / integerLocal1;
            integerLocal7 = 0;
            integerLocal8 = this.integerState0107;
            if (20 >= integerLocal4) {
              while (integerLocal7 <= 20) {
                integerLocal9 = (20 - integerLocal4) * (-integerLocal4 + 20) + (-integerLocal7 + 20) * (20 - integerLocal7);
                if (462 >= integerLocal9) {
                  if (integerLocal9 < 420) {
                    break;
                  }
                  integerLocal10 = (-integerLocal9 + 462) * integerLocal6 / 42;
                  integerLocal10 = integerLocal10 | (integerLocal10 << 8 | integerLocal10 << 16);
                  SoftwareRaster.integerArrayState0063[SoftwareRaster.integerState0285 * integerLocal5 + integerArgument3 + integerLocal7] = integerLocal10;
                }
                integerLocal7++;
              }
            }
            if (integerLocal4 <= 20) {
              integerLocal26 = integerLocal8;
              integerLocal8 -= 21;
              integerLocal27 = 0;
              while (20 >= integerLocal27) {
                integerLocal11 = (-integerLocal4 + 20) * (20 - integerLocal4) + integerLocal27 * integerLocal27;
                if (integerLocal11 <= 462) {
                  if (420 > integerLocal11) {
                    integerLocal26 = integerLocal8 + 1;
                  } else {
                    integerLocal12 = (462 - integerLocal11) * integerLocal6 / 42;
                    integerLocal12 = integerLocal12 | (integerLocal12 << 8 | integerLocal12 << 16);
                    SoftwareRaster.integerArrayState0063[integerArgument3 + integerLocal5 * SoftwareRaster.integerState0285 + integerLocal8] = integerLocal12;
                  }
                  integerLocal27++;
                  integerLocal8++;
                  continue;
                }
                break;
              }
              integerLocal8 = integerLocal26;
            }
            integerLocal6 = integerLocal6 | (integerLocal6 << 16 | integerLocal6 << 8);
            SoftwareRaster.performAction0718(integerLocal7 + integerArgument3, integerLocal5, -integerLocal7 + integerLocal8, integerLocal6);
          }
          integerLocal4++;
          integerLocal5++;
        }
        integerLocal18 = 169;
        integerLocal14 = 22;
        integerLocal16 = 194;
        integerLocal20 = 0;
        integerLocal22 = integerArgument2 + 35;
        while (integerLocal20 < integerLocal14) {
          integerLocal24 = (-integerLocal16 + integerLocal18) * integerLocal20 / integerLocal14 + integerLocal16;
          integerLocal24 = integerLocal24 | (integerLocal24 << 16 | integerLocal24 << 8);
          SoftwareRaster.performAction0718(integerArgument3, integerLocal22, 6, integerLocal24);
          SoftwareRaster.performAction0718(integerArgument3 + this.integerState0107 - 6, integerLocal22, 6, integerLocal24);
          integerLocal20++;
          integerLocal22++;
        }
        MixedSupport069.rgbSpriteState0025.performAction0300(-90 + (integerArgument3 + this.integerState0107), 10 + integerArgument2);
        MixedSupport090.performAction1262(NetworkSupport002.rgbSpriteArrayState0003, -10 + this.integerState0107, integerArgument2 + 35, -1, 5 + integerArgument3);
        MixedSupport090.performAction1262(UiComponentPart011.rgbSpriteArrayState0013, this.integerState0107, integerArgument2 + (this.integerState0108 - 22), -1, integerArgument3);
        integerLocal15 = this.integerState0108 - 79;
        integerLocal17 = 169;
        integerLocal19 = 127;
        integerLocal21 = 0;
        integerLocal23 = 57 + integerArgument2;
        while (integerLocal21 < integerLocal15) {
          integerLocal25 = integerLocal17 + integerLocal21 * (integerLocal19 - integerLocal17) / integerLocal15;
          integerLocal25 = integerLocal25 | (integerLocal25 << 16 | integerLocal25 << 8);
          SoftwareRaster.performAction0718(integerArgument3, integerLocal23, 6, integerLocal25);
          SoftwareRaster.performAction0718(-6 + (this.integerState0107 + integerArgument3), integerLocal23, 6, integerLocal25);
          integerLocal23++;
          integerLocal21++;
        }
        return;
    }

    final static IndexedSprite[] computeIndexedSpriteArray1760(String stringArgument1, ResourceArchive resourceArchiveArgument2, boolean booleanArgument3, String stringArgument4) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        IndexedSprite[] stackIndexedSpriteArrayLocal4 = null;
        IndexedSprite[] stackIndexedSpriteArrayLocal5 = null;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        StringBuilder stackStringBuilderLocal11 = null;
        String stackStringLocal12 = null;
        RuntimeException caughtExceptionLocal13 = null;
        try {
          if (booleanArgument3) {
            stackIndexedSpriteArrayLocal4 = (IndexedSprite[]) null;
            return stackIndexedSpriteArrayLocal4;
          }
          integerLocal1 = resourceArchiveArgument2.computeInteger0926(-1, stringArgument4);
          integerLocal3 = resourceArchiveArgument2.computeInteger0913(integerLocal1, 13030, stringArgument1);
          stackIndexedSpriteArrayLocal5 = MixedSupport099.computeIndexedSpriteArray1375(integerLocal3, (byte) 37, integerLocal1, resourceArchiveArgument2);
          return stackIndexedSpriteArrayLocal5;
        } catch (java.lang.RuntimeException caughtParameterLocal14) {
          caughtExceptionLocal13 = caughtParameterLocal14;
          runtimeExceptionLocal2 = caughtExceptionLocal13;
          stackRuntimeExceptionLocal6 = runtimeExceptionLocal2;
          stackStringBuilderLocal7 = new StringBuilder().append("t.MA(");
          if (stringArgument1 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          stackStringBuilderLocal9 = ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',');
          if (resourceArchiveArgument2 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          stackStringBuilderLocal11 = ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(',').append(booleanArgument3).append(',');
          if (stringArgument4 == null) {
            stackStringLocal12 = "null";
          } else {
            stackStringLocal12 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal11).append(stackStringLocal12).append(')').toString());
        }
    }

    public static void performAction1765(byte byteArgument1) {
        stringState0519 = null;
        stringState0520 = null;
        if (byteArgument1 != 94) {
          String stringLocal1 = (String) null;
          UiComponentPart030.computeIndexedSpriteArray1760((String) null, (ResourceArchive) null, true, (String) null);
        }
        stringArrayState0046 = null;
    }

    final static InputAdapter003 computeInputAdapter0031764(int integerArgument1) {
        try {
          Throwable throwableLocal1 = null;
          InputAdapter003 stackInputAdapter003Local2 = null;
          Throwable caughtExceptionLocal3 = null;
          if (integerArgument1 != -22) {
            return (InputAdapter003) null;
          }
          try {
            stackInputAdapter003Local2 = (InputAdapter003) (Class.forName("InputAdapter001").newInstance());
            return stackInputAdapter003Local2;
          } catch (java.lang.Throwable caughtParameterLocal4) {
            caughtExceptionLocal3 = caughtParameterLocal4;
            throwableLocal1 = caughtExceptionLocal3;
            return null;
          }
        } catch (RuntimeException | Error uncheckedExceptionLocal5) {
          throw uncheckedExceptionLocal5;
        } catch (Throwable checkedExceptionLocal6) {
          throw new RuntimeException(checkedExceptionLocal6);
        }
    }

    static {
        stringState0519 = "Matching Score: ";
        stringState0520 = "Animals";
        stringArrayState0046 = new String[255];
    }
}
