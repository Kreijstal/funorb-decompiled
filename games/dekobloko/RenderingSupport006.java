/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class RenderingSupport006 extends HashNode {
    boolean booleanState0081;
    static String stringState0267;
    static SceneWidget sceneWidgetState0056;
    private RgbSprite rgbSpriteState0022;
    static String stringState0268;
    int integerState0334;
    private int[] integerArrayState0110;
    static RenderingSupport010 renderingSupport010State0003;

    private final void performAction0843(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10, int integerArgument11, int integerArgument12, int integerArgument13, int integerArgument14, boolean booleanArgument15, boolean booleanArgument16) {
        int integerLocal1 = 0;
        Object stackObjectLocal2 = null;
        int stackIntegerLocal3 = 0;
        Object stackObjectLocal4;
        Object stackObjectLocal5;
        int stackIntegerLocal6;
        int stackIntegerLocal7;
        int stackIntegerLocal8;
        int stackIntegerLocal9;
        int stackIntegerLocal10;
        int stackIntegerLocal11;
        boolean stackBooleanLocal12;
        int integerLocal13;
        int integerLocal14;
        int integerLocal15;
        int integerLocal16;
        Object objectLocal17;
        Object objectLocal18;
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
        int integerLocal45;
        int integerLocal46;
        int integerLocal47;
        int integerLocal48;
        int integerLocal49;
        int integerLocal50;
        int integerLocal51;
        int integerLocal52;
        int integerLocal53;
        Object objectLocal54;
        int integerLocal55;
        int integerLocal56;
        integerLocal13 = integerArgument10;
        integerLocal14 = -integerArgument8;
        integerLocal15 = this.rgbSpriteState0022.integerArrayState0024[integerArgument12 * this.rgbSpriteState0022.integerState0254 + integerArgument11];
        integerLocal16 = (integerLocal15 & 24) >> 3;
        objectLocal17 = null;
        objectLocal18 = null;
        integerLocal19 = 0;
        integerLocal20 = 2;
        integerLocal21 = Math.abs(integerArgument10);
        if (integerLocal16 == 1) {
          boolean frameRemainderLocal57 = true;
          if (integerArgument11 > 0) {
            if (((this.rgbSpriteState0022.integerArrayState0024[integerArgument12 * this.rgbSpriteState0022.integerState0254 + (integerArgument11 - 1)] ^ integerLocal15) & 31) == 0) {
              integerLocal19++;
              if (integerArgument11 >= this.rgbSpriteState0022.integerState0254 - 1) {
                if ((!(integerArgument12 <= 0)) &&
                  ((((this.rgbSpriteState0022.integerArrayState0024[(integerArgument12 - 1) * this.rgbSpriteState0022.integerState0254 + integerArgument11] ^ integerLocal15) & 31) == 0))) {
                  integerLocal19 += 4;
                }
                frameRemainderLocal57 = false;
              }
              else {
                if (((this.rgbSpriteState0022.integerArrayState0024[integerArgument12 * this.rgbSpriteState0022.integerState0254 + (integerArgument11 + 1)] ^ integerLocal15) & 31) != 0) {
                  if ((!(integerArgument12 <= 0)) &&
                    ((((this.rgbSpriteState0022.integerArrayState0024[(integerArgument12 - 1) * this.rgbSpriteState0022.integerState0254 + integerArgument11] ^ integerLocal15) & 31) == 0))) {
                    integerLocal19 += 4;
                  }
                  frameRemainderLocal57 = false;
                }
                else {
                  integerLocal19 += 2;
                }
              }
            } else {
              if (integerArgument11 >= this.rgbSpriteState0022.integerState0254 - 1) {
                if ((!(integerArgument12 <= 0)) &&
                  ((((this.rgbSpriteState0022.integerArrayState0024[(integerArgument12 - 1) * this.rgbSpriteState0022.integerState0254 + integerArgument11] ^ integerLocal15) & 31) == 0))) {
                  integerLocal19 += 4;
                }
                frameRemainderLocal57 = false;
              }
              else {
                if (((this.rgbSpriteState0022.integerArrayState0024[integerArgument12 * this.rgbSpriteState0022.integerState0254 + (integerArgument11 + 1)] ^ integerLocal15) & 31) != 0) {
                  if ((!(integerArgument12 <= 0)) &&
                    ((((this.rgbSpriteState0022.integerArrayState0024[(integerArgument12 - 1) * this.rgbSpriteState0022.integerState0254 + integerArgument11] ^ integerLocal15) & 31) == 0))) {
                    integerLocal19 += 4;
                  }
                  frameRemainderLocal57 = false;
                }
                else {
                  integerLocal19 += 2;
                }
              }
            }
          } else {
            if (integerArgument11 >= this.rgbSpriteState0022.integerState0254 - 1) {
              if ((!(integerArgument12 <= 0)) &&
                ((((this.rgbSpriteState0022.integerArrayState0024[(integerArgument12 - 1) * this.rgbSpriteState0022.integerState0254 + integerArgument11] ^ integerLocal15) & 31) == 0))) {
                integerLocal19 += 4;
              }
              frameRemainderLocal57 = false;
            }
            else {
              if (((this.rgbSpriteState0022.integerArrayState0024[integerArgument12 * this.rgbSpriteState0022.integerState0254 + (integerArgument11 + 1)] ^ integerLocal15) & 31) != 0) {
                if ((!(integerArgument12 <= 0)) &&
                  ((((this.rgbSpriteState0022.integerArrayState0024[(integerArgument12 - 1) * this.rgbSpriteState0022.integerState0254 + integerArgument11] ^ integerLocal15) & 31) == 0))) {
                  integerLocal19 += 4;
                }
                frameRemainderLocal57 = false;
              }
              else {
                integerLocal19 += 2;
              }
            }
          }
          if ((frameRemainderLocal57) && (integerArgument12 > 0 &&
            ((this.rgbSpriteState0022.integerArrayState0024[(integerArgument12 - 1) * this.rgbSpriteState0022.integerState0254 + integerArgument11] ^ integerLocal15) & 31) == 0)) {
            integerLocal19 += 4;
          }
          if (integerArgument12 < this.rgbSpriteState0022.integerState0260 - 1 &&
            ((this.rgbSpriteState0022.integerArrayState0024[(integerArgument12 + 1) * this.rgbSpriteState0022.integerState0254 + integerArgument11] ^ integerLocal15) & 31) == 0) {
            integerLocal19 += 8;
          }
          objectLocal17 = MixedSupport095.rgbSpriteArrayArrayArrayState0001[integerArgument1][integerLocal15 & 7];
          objectLocal18 = MixedSupport047.indexedSpriteArrayState0003[integerLocal19];
        }
        integerLocal22 = this.integerArrayState0110[integerArgument12 * this.rgbSpriteState0022.integerState0254 + integerArgument11];
        integerLocal23 = (byte)integerLocal22;
        integerLocal24 = (byte)(integerLocal22 >> 8);
        integerLocal25 = integerLocal22 >> 16 & 255;
        integerLocal26 = integerLocal22 >> 24;
        integerLocal27 = (integerArgument14 + integerLocal26 - 60) * 1000 / 60;
        if (booleanArgument15) {
          integerLocal28 = (int)(333.0 * Math.sin((double)(CipherPacketBuffer.integerState0799 + integerLocal26) * 0.045));
          if (integerLocal27 > integerLocal28) {
            integerLocal27 = integerLocal28;
          }
        }
        integerLocal27 = integerLocal27 * integerLocal27 / 1000;
        integerLocal56 = (integerArgument14 + integerLocal26 / 2 - 60) * 2000 / 60;
        if (booleanArgument15 &&
          integerLocal56 > 0) {
          integerLocal56 = 0;
        } else {
          integerLocal56 = integerLocal56 * integerLocal56 / 2000;
          integerLocal56 = integerLocal56 * integerLocal56 / 2000;
          integerLocal56 = integerLocal56 * integerLocal56 / 2000;
        }
        integerLocal29 = integerLocal25 * (integerLocal27 + integerLocal56) / 10;
        integerLocal30 = integerLocal29 * integerLocal23 / ((this.rgbSpriteState0022.integerState0254 + this.rgbSpriteState0022.integerState0260) * 4);
        integerLocal31 = integerLocal29 * integerLocal24 / ((this.rgbSpriteState0022.integerState0254 + this.rgbSpriteState0022.integerState0260) * 4) + (int)(100.0 * Math.sin((double)(CipherPacketBuffer.integerState0799 + integerLocal26 * 4) * 0.07));
        integerLocal32 = 4000000 / integerArgument4;
        integerLocal33 = (integerLocal30 * integerArgument8 + integerLocal29 * integerArgument10) / (integerLocal32 * 2);
        integerLocal34 = (integerLocal30 * integerArgument10 - integerLocal29 * integerArgument8) / (integerLocal32 * 2);
        integerArgument5 = integerArgument5 + integerLocal33;
        integerArgument6 = integerArgument6 + integerLocal31;
        integerArgument7 = integerArgument7 + integerLocal34;
        if (objectLocal17 == null) {
          return;
        }
        if (integerLocal21 < integerArgument8 * 2) {
          integerLocal20 = 1 + ((integerLocal20 - 1) * integerLocal21 + integerArgument8 / 2) / integerArgument8;
        }
        integerLocal35 = 2147483647;
        integerLocal36 = -2147483648;
        integerLocal37 = 2147483647;
        integerLocal38 = -2147483648;
        for (integerLocal1 = -integerLocal20; integerLocal1 <= integerLocal20; integerLocal1 += 2) {
          integerLocal39 = integerLocal1;
          integerLocal40 = integerLocal1;
          integerLocal41 = this.rgbSpriteState0022.integerState0254 * integerLocal20 * 2;
          integerLocal42 = integerArgument5 + (integerArgument11 * integerArgument8 * integerLocal20 * 2 + integerLocal13 * integerLocal39) / integerLocal41;
          integerLocal43 = integerArgument5 + ((integerArgument11 + 1) * integerArgument8 * integerLocal20 * 2 + integerLocal13 * integerLocal40) / integerLocal41;
          integerLocal44 = integerArgument6 + integerArgument12 * integerArgument9 / this.rgbSpriteState0022.integerState0260;
          integerLocal45 = integerArgument6 + (integerArgument12 + 1) * integerArgument9 / this.rgbSpriteState0022.integerState0260;
          integerLocal46 = integerArgument7 + (integerArgument11 * integerArgument10 * integerLocal20 * 2 + integerLocal14 * integerLocal39) / integerLocal41;
          integerLocal47 = integerArgument7 + ((integerArgument11 + 1) * integerArgument10 * integerLocal20 * 2 + integerLocal14 * integerLocal40) / integerLocal41;
          if (integerLocal46 >= 500 &&
            integerLocal47 >= 500) {
            integerLocal48 = integerArgument2 + integerLocal42 * integerArgument4 / integerLocal46;
            integerLocal49 = integerArgument2 + integerLocal43 * integerArgument4 / integerLocal47;
            integerLocal50 = integerArgument3 + integerLocal44 * integerArgument4 / integerLocal46;
            integerLocal51 = integerArgument3 + integerLocal44 * integerArgument4 / integerLocal47;
            integerLocal52 = integerArgument3 + integerLocal45 * integerArgument4 / integerLocal46;
            integerLocal53 = integerArgument3 + integerLocal45 * integerArgument4 / integerLocal47;
            if (!booleanArgument16) {
              stackObjectLocal2 = objectLocal17;
              if (integerLocal1 != integerLocal20) {
                stackIntegerLocal3 = integerLocal19 & 12;
              } else {
                stackIntegerLocal3 = integerLocal19;
              }
              objectLocal54 = ((Object[]) (stackObjectLocal2))[stackIntegerLocal3];
              integerLocal55 = 0;
              if (integerArgument11 < integerArgument13) {
                integerLocal55 = (integerLocal20 - integerLocal1) * ((RgbSprite) (objectLocal54)).integerState0254 / (integerLocal20 * 2);
              }
              if (integerArgument11 > integerArgument13) {
                integerLocal55 = (integerLocal20 + integerLocal1) * ((RgbSprite) (objectLocal54)).integerState0254 / (integerLocal20 * 2);
              }
              stackObjectLocal4 = objectLocal54;
              stackObjectLocal5 = objectLocal18;
              stackIntegerLocal6 = integerLocal48;
              stackIntegerLocal7 = integerLocal49;
              stackIntegerLocal8 = integerLocal50;
              stackIntegerLocal9 = integerLocal51;
              stackIntegerLocal10 = integerLocal52;
              stackIntegerLocal11 = integerLocal53;
              stackBooleanLocal12 = !(integerLocal1 >= integerLocal20);
              RenderingSupport002.performAction0265((RgbSprite) (stackObjectLocal4), (IndexedSprite) (stackObjectLocal5), stackIntegerLocal6, stackIntegerLocal7, stackIntegerLocal8, stackIntegerLocal9, stackIntegerLocal10, stackIntegerLocal11, stackBooleanLocal12, false, integerLocal55, -1);
            } else {
              if (integerLocal48 < integerLocal35) {
                integerLocal35 = integerLocal48;
              }
              if (integerLocal49 > integerLocal36) {
                integerLocal36 = integerLocal49;
              }
              if (integerLocal50 < integerLocal37) {
                integerLocal37 = integerLocal50;
              }
              if (integerLocal51 < integerLocal37) {
                integerLocal37 = integerLocal51;
              }
              if (integerLocal52 > integerLocal38) {
                integerLocal38 = integerLocal52;
              }
              if (integerLocal53 > integerLocal38) {
                integerLocal38 = integerLocal53;
              }
            }
          }
        }
        if (integerLocal35 != 2147483647) {
          SoftwareRaster.performAction0735(integerLocal35 - 2, integerLocal37 - 2, integerLocal36 - integerLocal35 + 4, integerLocal38 - integerLocal37 + 4, 2, 0);
        }
        return;
    }

    RenderingSupport006(String stringArgument1, int integerArgument2, boolean booleanArgument3) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int previousIntegerLocal3 = 0;
        int previousIntegerLocal4 = 0;
        int previousIntegerLocal5 = 0;
        int previousIntegerLocal6 = 0;
        int integerLocal7 = 0;
        boolean stackBooleanLocal8 = false;
        RuntimeException stackRuntimeExceptionLocal9 = null;
        StringBuilder stackStringBuilderLocal10 = null;
        String stackStringLocal11 = null;
        RuntimeException caughtExceptionLocal12 = null;
        int integerLocal13 = 0;
        RuntimeException runtimeExceptionLocal14 = null;
        int integerLocal15 = 0;
        int integerLocal16 = 0;
        int integerLocal17 = 0;
        int[] integerArrayLocal18 = null;
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
        int integerLocal30 = 0;
        int integerLocal31 = 0;
        int integerLocal32 = 0;
        int[] integerArrayLocal33 = null;
        int[] integerArrayLocal34 = null;
        int[] integerArrayLocal35 = null;
        int integerLocal36;
        int integerLocal37;
        int integerLocal38;
        int integerLocal39;
        this.integerState0334 = 0;
        try {
          stackBooleanLocal8 = (booleanArgument3);
          this.booleanState0081 = stackBooleanLocal8;
          integerLocal13 = renderingSupport010State0003.computeInteger1222(stringArgument1, 2147483647);
          integerLocal15 = renderingSupport010State0003.computeInteger1223(stringArgument1, 2147483647, 8);
          integerLocal13--;
          this.rgbSpriteState0022 = new RgbSprite(integerLocal13, integerLocal15);
          integerArrayLocal35 = SoftwareRaster.integerArrayState0063;
          integerLocal16 = SoftwareRaster.integerState0285;
          integerLocal17 = SoftwareRaster.integerState0284;
          this.rgbSpriteState0022.performAction0278();
          renderingSupport010State0003.computeInteger1213(stringArgument1, 0, 0, 1 + integerLocal13, integerLocal15, integerArgument2, -1, 1, 1, 8);
          SoftwareRaster.performAction0724(integerArrayLocal35, integerLocal16, integerLocal17);
          this.integerArrayState0110 = new int[integerLocal13 * integerLocal15];
          integerArrayLocal34 = new int[integerLocal15 * integerLocal13];
          integerArrayLocal33 = integerArrayLocal34;
          integerArrayLocal18 = integerArrayLocal33;
          for (integerLocal1 = 0; integerLocal1 < integerLocal15; integerLocal1++) {
            for (integerLocal2 = 0; integerLocal13 > integerLocal2; integerLocal2++) {
              if (this.integerArrayState0110[integerLocal1 * integerLocal13 + integerLocal2] == 0) {
                integerLocal19 = this.rgbSpriteState0022.integerArrayState0024[integerLocal13 * integerLocal1 + integerLocal2];
                if ((24 & integerLocal19) != 0) {
                  integerLocal20 = integerLocal2;
                  integerLocal21 = integerLocal2;
                  integerLocal22 = integerLocal1;
                  integerLocal23 = integerLocal1;
                  integerLocal24 = 0;
                  integerLocal25 = 1;
                  integerArrayLocal18[0] = integerLocal1 * integerLocal13 + integerLocal2;
                  this.rgbSpriteState0022.integerArrayState0024[integerLocal13 * integerLocal1 + integerLocal2] = this.rgbSpriteState0022.integerArrayState0024[integerLocal13 * integerLocal1 + integerLocal2] + -2147483648;
                  if ((24 & integerLocal19) == 8) {
                    integerLocal26 = 31 & integerLocal19;
                    while (integerLocal24 < integerLocal25) {
                      integerLocal27 = integerArrayLocal18[integerLocal24++];
                      integerLocal28 = integerLocal27 % integerLocal13;
                      if (integerLocal28 < integerLocal20) {
                        integerLocal20 = integerLocal28;
                      }
                      if (integerLocal21 < integerLocal28) {
                        integerLocal21 = integerLocal28;
                      }
                      integerLocal29 = integerLocal27 / integerLocal13;
                      if (integerLocal23 < integerLocal29) {
                        integerLocal23 = integerLocal29;
                      }
                      if (integerLocal22 > integerLocal29) {
                        integerLocal22 = integerLocal29;
                      }
                      if (0 < integerLocal28 &&
                        (-2147483617 & this.rgbSpriteState0022.integerArrayState0024[integerLocal27 - 1]) == integerLocal26) {
                        previousIntegerLocal3 = integerLocal25;
                        integerLocal25++;
                        integerArrayLocal18[previousIntegerLocal3] = -1 + integerLocal27;
                        this.rgbSpriteState0022.integerArrayState0024[-1 + integerLocal27] = this.rgbSpriteState0022.integerArrayState0024[-1 + integerLocal27] + -2147483648;
                      }
                      if (-1 + integerLocal13 > integerLocal28 &&
                        (this.rgbSpriteState0022.integerArrayState0024[1 + integerLocal27] & -2147483617) == integerLocal26) {
                        previousIntegerLocal4 = integerLocal25;
                        integerLocal25++;
                        integerArrayLocal18[previousIntegerLocal4] = 1 + integerLocal27;
                        this.rgbSpriteState0022.integerArrayState0024[integerLocal27 + 1] = this.rgbSpriteState0022.integerArrayState0024[integerLocal27 + 1] + -2147483648;
                      }
                      if (integerLocal29 > 0 &&
                        (this.rgbSpriteState0022.integerArrayState0024[-integerLocal13 + integerLocal27] & -2147483617) == integerLocal26) {
                        previousIntegerLocal5 = integerLocal25;
                        integerLocal25++;
                        integerArrayLocal18[previousIntegerLocal5] = integerLocal27 - integerLocal13;
                        this.rgbSpriteState0022.integerArrayState0024[-integerLocal13 + integerLocal27] = this.rgbSpriteState0022.integerArrayState0024[-integerLocal13 + integerLocal27] + -2147483648;
                      }
                      if (integerLocal29 >= integerLocal15 - 1) {
                        continue;
                      }
                      if (integerLocal26 != (this.rgbSpriteState0022.integerArrayState0024[integerLocal27 + integerLocal13] & -2147483617)) {
                        continue;
                      }
                      previousIntegerLocal6 = integerLocal25;
                      integerLocal25++;
                      integerArrayLocal18[previousIntegerLocal6] = integerLocal27 + integerLocal13;
                      this.rgbSpriteState0022.integerArrayState0024[integerLocal27 + integerLocal13] = this.rgbSpriteState0022.integerArrayState0024[integerLocal27 + integerLocal13] + -2147483648;
                    }
                  }
                  integerLocal36 = -integerLocal13 + (integerLocal20 + integerLocal21 + 1);
                  integerLocal37 = 1 + integerLocal23 + integerLocal22 - integerLocal15;
                  integerLocal38 = 150 + UiComponentPart016.computeInteger0944((byte) 116, 51, UiComponentPart031.randomState0003);
                  integerLocal39 = integerLocal38;
                  integerLocal30 = -8 + UiComponentPart016.computeInteger0944((byte) 50, 17, UiComponentPart031.randomState0003);
                  integerLocal31 = (integerLocal30 << 24) + (integerLocal39 << 16) + ((integerLocal37 << 8 & 65280) + (255 & integerLocal36));
                  for (integerLocal7 = 0; integerLocal7 < integerLocal25; integerLocal7++) {
                    integerLocal32 = integerArrayLocal34[integerLocal7];
                    this.rgbSpriteState0022.integerArrayState0024[integerLocal32] = this.rgbSpriteState0022.integerArrayState0024[integerLocal32] - -2147483648;
                    this.integerArrayState0110[integerLocal32] = integerLocal31;
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal40) {
          caughtExceptionLocal12 = caughtParameterLocal40;
          runtimeExceptionLocal14 = caughtExceptionLocal12;
          stackRuntimeExceptionLocal9 = runtimeExceptionLocal14;
          stackStringBuilderLocal10 = new StringBuilder().append("in.<init>(");
          if (stringArgument1 == null) {
            stackStringLocal11 = "null";
          } else {
            stackStringLocal11 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal9), ((StringBuilder) (Object) stackStringBuilderLocal10).append(stackStringLocal11).append(',').append(integerArgument2).append(',').append(booleanArgument3).append(')').toString());
        }
    }

    private final void performAction0842(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, byte byteArgument6, boolean booleanArgument7, int integerArgument8, int integerArgument9, int integerArgument10, int integerArgument11, int integerArgument12, int integerArgument13) {
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
        integerLocal6 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        integerArgument11 = integerArgument11 - integerArgument1;
        integerArgument9 = integerArgument9 - integerArgument13;
        integerArgument5 = integerArgument5 - integerArgument4;
        integerLocal1 = MixedSupport148.computeInteger1983(23841, integerArgument5 * integerArgument5 + integerArgument9 * integerArgument9, this.rgbSpriteState0022.integerState0254 * -(integerArgument5 * integerArgument4 + integerArgument13 * integerArgument9));
        integerLocal2 = MixedSupport148.computeInteger1983(23841, integerArgument11, this.rgbSpriteState0022.integerState0260 * -integerArgument1);
        integerLocal3 = integerLocal1;
        if (integerLocal2 >= 0) {
          if (this.rgbSpriteState0022.integerState0260 < integerLocal2) {
            integerLocal2 = this.rgbSpriteState0022.integerState0260;
          }
        } else {
          integerLocal2 = 0;
        }
        if (integerLocal1 >= 0) {
          if (this.rgbSpriteState0022.integerState0254 < integerLocal1) {
            integerLocal1 = this.rgbSpriteState0022.integerState0254;
          }
        } else {
          integerLocal1 = 0;
        }
        if (byteArgument6 != 72) {
          return;
        }
        for (integerLocal4 = 0; integerLocal4 < this.rgbSpriteState0022.integerState0254; integerLocal4++) {
          for (integerLocal5 = 0; this.rgbSpriteState0022.integerState0260 > integerLocal5; integerLocal5++) {
            this.performAction0843(integerArgument10, integerArgument12, integerArgument2, integerArgument8, integerArgument4, integerArgument1, integerArgument13, integerArgument5, integerArgument11, integerArgument9, integerLocal4, integerLocal5, integerLocal3, integerArgument3, booleanArgument7, true);
          }
        }
        for (integerLocal7 = 0; integerLocal1 > integerLocal7; integerLocal7++) {
          for (integerLocal9 = 0; integerLocal9 < integerLocal2; integerLocal9++) {
            this.performAction0843(integerArgument10, integerArgument12, integerArgument2, integerArgument8, integerArgument4, integerArgument1, integerArgument13, integerArgument5, integerArgument11, integerArgument9, integerLocal7, integerLocal9, integerLocal3, integerArgument3, booleanArgument7, false);
          }
          for (integerLocal11 = this.rgbSpriteState0022.integerState0260 - 1; integerLocal2 <= integerLocal11; integerLocal11--) {
            this.performAction0843(integerArgument10, integerArgument12, integerArgument2, integerArgument8, integerArgument4, integerArgument1, integerArgument13, integerArgument5, integerArgument11, integerArgument9, integerLocal7, integerLocal11, integerLocal3, integerArgument3, booleanArgument7, false);
          }
        }
        for (integerLocal8 = this.rgbSpriteState0022.integerState0254 - 1; integerLocal8 >= integerLocal1; integerLocal8--) {
          for (integerLocal10 = 0; integerLocal10 < integerLocal2; integerLocal10++) {
            this.performAction0843(integerArgument10, integerArgument12, integerArgument2, integerArgument8, integerArgument4, integerArgument1, integerArgument13, integerArgument5, integerArgument11, integerArgument9, integerLocal8, integerLocal10, integerLocal3, integerArgument3, booleanArgument7, false);
          }
          for (integerLocal12 = this.rgbSpriteState0022.integerState0260 - 1; integerLocal2 <= integerLocal12; integerLocal12--) {
            this.performAction0843(integerArgument10, integerArgument12, integerArgument2, integerArgument8, integerArgument4, integerArgument1, integerArgument13, integerArgument5, integerArgument11, integerArgument9, integerLocal8, integerLocal12, integerLocal3, integerArgument3, booleanArgument7, false);
          }
        }
        return;
    }

    public static void performAction0841(int integerArgument1) {
        stringState0268 = null;
        renderingSupport010State0003 = null;
        stringState0267 = null;
        if (integerArgument1 < 121) {
          return;
        }
        sceneWidgetState0056 = null;
    }

    final static void performAction0846(byte byteArgument1) {
        DiagnosticSupport001.performAction0363(byteArgument1 - 76, MixedSupport126.stringState0527, SceneWidgetPart013.stringState0586, true);
        MixedSupport023.booleanState0025 = true;
        if (byteArgument1 != -51) {
          MixedSupport136 mixedSupport136Local1 = (MixedSupport136) null;
          RenderingSupport006.performAction0845((MixedSupport136) null, (byte) 121, -105);
        }
    }

    final void performAction0844(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, boolean booleanArgument5, int integerArgument6, int integerArgument7) {
        int integerLocal1 = 2000;
        int integerLocal2 = 1500;
        if (booleanArgument5) {
          integerLocal2 = 600;
        }
        if (integerArgument2 != 1) {
          return;
        }
        if (integerLocal2 * this.rgbSpriteState0022.integerState0254 <= this.rgbSpriteState0022.integerState0260 * integerLocal1) {
          integerLocal1 = integerLocal2 * this.rgbSpriteState0022.integerState0254 / this.rgbSpriteState0022.integerState0260;
        } else {
          integerLocal2 = this.rgbSpriteState0022.integerState0260 * integerLocal1 / this.rgbSpriteState0022.integerState0254;
        }
        int integerLocal3 = !!booleanArgument5 ? 5 * this.integerState0334 : 0;
        this.performAction0842(-integerLocal2 - integerLocal3, integerArgument3, integerArgument7, -integerLocal1, integerLocal1, (byte) 72, booleanArgument5, integerArgument1, 10000, integerArgument6, -integerLocal3 + integerLocal2, integerArgument4, 10000);
    }

    final static void performAction0845(MixedSupport136 mixedSupport136Argument1, byte byteArgument2, int integerArgument3) {
        CipherPacketBuffer cipherPacketBufferLocal1 = null;
        try {
          cipherPacketBufferLocal1 = SocketFactory.cipherPacketBufferState0002;
          cipherPacketBufferLocal1.performAction1861(integerArgument3, byteArgument2 ^ 70);
          if (byteArgument2 != -70) {
            MixedSupport136 mixedSupport136Local2 = (MixedSupport136) null;
            RenderingSupport006.performAction0845((MixedSupport136) null, (byte) -31, 108);
          }
          cipherPacketBufferLocal1.performAction2073(true, mixedSupport136Argument1.integerState0800);
          cipherPacketBufferLocal1.performAction2087(-1, mixedSupport136Argument1.integerState0801);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "in.B(" + (mixedSupport136Argument1 != null ? "{...}" : "null") + ',' + byteArgument2 + ',' + integerArgument3 + ')');
        }
    }

    static {
        stringState0267 = "All games";
        stringState0268 = "<%0> is not a member, and cannot play with the current options.";
    }
}
