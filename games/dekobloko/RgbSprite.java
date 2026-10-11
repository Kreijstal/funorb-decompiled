/*
 * Decompiled by CFR-JS 0.4.0.
 */
class RgbSprite extends RenderingSupport004 {
    int[] integerArrayState0024;

    private final void performAction0314(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5) {
        int stackIntegerLocal1 = 0;
        int stackIntegerLocal2 = 0;
        int stackIntegerLocal3 = 0;
        int stackIntegerLocal4 = 0;
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
        integerLocal5 = integerArgument3 * this.integerState0258 + integerArgument2;
        integerArgument4 = integerArgument4 & 4095;
        integerArgument5 = integerArgument5 & 4095;
        if (integerArgument3 < 0) {
          integerLocal11 = 0;
          integerLocal10 = 0;
          integerLocal7 = 0;
          integerLocal6 = 0;
        } else {
          if (integerArgument2 < 0) {
            integerLocal10 = 0;
            integerLocal6 = 0;
          } else {
            integerLocal6 = this.integerArrayState0024[integerLocal5];
            if (integerLocal6 == 0) {
              stackIntegerLocal1 = 0;
            } else {
              stackIntegerLocal1 = (4096 - integerArgument4) * (4096 - integerArgument5);
            }
            integerLocal10 = stackIntegerLocal1;
          }
          if (integerArgument2 >= this.integerState0258 - 1) {
            integerLocal11 = 0;
            integerLocal7 = 0;
          } else {
            integerLocal7 = this.integerArrayState0024[integerLocal5 + 1];
            if (integerLocal7 == 0) {
              stackIntegerLocal2 = 0;
            } else {
              stackIntegerLocal2 = integerArgument4 * (4096 - integerArgument5);
            }
            integerLocal11 = stackIntegerLocal2;
          }
        }
        if (integerArgument3 >= this.integerState0255 - 1) {
          integerLocal13 = 0;
          integerLocal12 = 0;
          integerLocal9 = 0;
          integerLocal8 = 0;
        } else {
          if (integerArgument2 < 0) {
            integerLocal12 = 0;
            integerLocal8 = 0;
          } else {
            integerLocal8 = this.integerArrayState0024[integerLocal5 + this.integerState0258];
            if (integerLocal8 == 0) {
              stackIntegerLocal3 = 0;
            } else {
              stackIntegerLocal3 = (4096 - integerArgument4) * integerArgument5;
            }
            integerLocal12 = stackIntegerLocal3;
          }
          if (integerArgument2 >= this.integerState0258 - 1) {
            integerLocal13 = 0;
            integerLocal9 = 0;
          } else {
            integerLocal9 = this.integerArrayState0024[integerLocal5 + this.integerState0258 + 1];
            if (integerLocal9 == 0) {
              stackIntegerLocal4 = 0;
            } else {
              stackIntegerLocal4 = integerArgument4 * integerArgument5;
            }
            integerLocal13 = stackIntegerLocal4;
          }
        }
        integerLocal10 = integerLocal10 >> 16;
        integerLocal11 = integerLocal11 >> 16;
        integerLocal12 = integerLocal12 >> 16;
        integerLocal13 = integerLocal13 >> 16;
        integerLocal14 = integerLocal10 + integerLocal11 + integerLocal12 + integerLocal13;
        if (integerLocal14 < 256) {
          if (integerLocal14 < 128) {
            return;
          }
          integerLocal15 = (integerLocal6 & 16711935) * integerLocal10 + (integerLocal7 & 16711935) * integerLocal11;
          integerLocal15 = integerLocal15 + ((integerLocal8 & 16711935) * integerLocal12 + (integerLocal9 & 16711935) * integerLocal13);
          integerLocal16 = (integerLocal6 & 65280) * integerLocal10 + (integerLocal7 & 65280) * integerLocal11;
          integerLocal16 = integerLocal16 + ((integerLocal8 & 65280) * integerLocal12 + (integerLocal9 & 65280) * integerLocal13);
          integerLocal17 = ((integerLocal15 >>> 16) / integerLocal14 << 16) + (integerLocal16 / integerLocal14 & 65280) + (integerLocal15 & 65535) / integerLocal14;
          if (integerLocal17 == 0) {
            integerLocal17 = 1;
          }
          SoftwareRaster.integerArrayState0063[integerArgument1] = integerLocal17;
        } else {
          integerLocal15 = (integerLocal6 & 16711935) * integerLocal10 + (integerLocal7 & 16711935) * integerLocal11;
          integerLocal15 = integerLocal15 + ((integerLocal8 & 16711935) * integerLocal12 + (integerLocal9 & 16711935) * integerLocal13);
          integerLocal16 = (integerLocal6 & 65280) * integerLocal10 + (integerLocal7 & 65280) * integerLocal11;
          integerLocal16 = integerLocal16 + ((integerLocal8 & 65280) * integerLocal12 + (integerLocal9 & 65280) * integerLocal13);
          integerLocal17 = (integerLocal15 >>> 8 & 16711935) + (integerLocal16 >>> 8 & 65280);
          if (integerLocal17 == 0) {
            integerLocal17 = 1;
          }
          SoftwareRaster.integerArrayState0063[integerArgument1] = integerLocal17;
        }
    }

    final void performAction0309(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        int integerLocal1 = this.integerState0254 << 3;
        int integerLocal2 = this.integerState0260 << 3;
        integerArgument1 = (integerArgument1 << 4) + (integerLocal1 & 15);
        integerArgument2 = (integerArgument2 << 4) + (integerLocal2 & 15);
        this.performAction0281(integerLocal1, integerLocal2, integerArgument1, integerArgument2, integerArgument3, integerArgument4);
    }

    final void performAction0315() {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        int integerLocal6;
        int integerLocal7;
        int integerLocal8;
        int[] integerArrayLocal9;
        int integerLocal10;
        int integerLocal11;
        int integerLocal12;
        int integerLocal13;
        int integerLocal14;
        int integerLocal15;
        integerLocal3 = this.integerState0255 - 1;
        scanLoop1: while (true) {
          if (integerLocal3 >= 0) {
            integerLocal4 = integerLocal3 * this.integerState0258;
            for (integerLocal5 = 0; integerLocal5 < this.integerState0258; integerLocal5++) {
              if (this.integerArrayState0024[integerLocal4 + integerLocal5] != 0) {
                break scanLoop1;
              }
            }
            integerLocal3--;
            continue;
          }
          break;
        }
        integerLocal10 = 0;
        scanLoop2: while (true) {
          if (integerLocal10 < integerLocal3) {
            integerLocal11 = integerLocal10 * this.integerState0258;
            for (integerLocal6 = 0; integerLocal6 < this.integerState0258; integerLocal6++) {
              if (this.integerArrayState0024[integerLocal11 + integerLocal6] != 0) {
                break scanLoop2;
              }
            }
            integerLocal10++;
            continue;
          }
          break;
        }
        integerLocal12 = this.integerState0258 - 1;
        scanLoop3: while (true) {
          if (integerLocal12 >= 0) {
            for (integerLocal13 = integerLocal10; integerLocal13 <= integerLocal3; integerLocal13++) {
              if (this.integerArrayState0024[integerLocal13 * this.integerState0258 + integerLocal12] != 0) {
                break scanLoop3;
              }
            }
            integerLocal12--;
            continue;
          }
          break;
        }
        integerLocal14 = 0;
        scanLoop4: while (true) {
          if (integerLocal14 < integerLocal12) {
            for (integerLocal7 = integerLocal10; integerLocal7 <= integerLocal3; integerLocal7++) {
              if (this.integerArrayState0024[integerLocal7 * this.integerState0258 + integerLocal14] != 0) {
                break scanLoop4;
              }
            }
            integerLocal14++;
            continue;
          }
          break;
        }
        if (integerLocal14 == 0 &&
          integerLocal12 == this.integerState0258 - 1 &&
          integerLocal10 == 0 &&
          integerLocal3 == this.integerState0255 - 1) {
          return;
        }
        integerLocal15 = integerLocal12 + 1 - integerLocal14;
        integerLocal8 = integerLocal3 + 1 - integerLocal10;
        integerArrayLocal9 = new int[integerLocal15 * integerLocal8];
        for (integerLocal1 = 0; integerLocal1 < integerLocal8; integerLocal1++) {
          for (integerLocal2 = 0; integerLocal2 < integerLocal15; integerLocal2++) {
            integerArrayLocal9[integerLocal1 * integerLocal15 + integerLocal2] = this.integerArrayState0024[(integerLocal1 + integerLocal10) * this.integerState0258 + (integerLocal2 + integerLocal14)];
          }
        }
        this.integerArrayState0024 = integerArrayLocal9;
        this.integerState0258 = integerLocal15;
        this.integerState0255 = integerLocal8;
        this.integerState0259 = this.integerState0259 + integerLocal14;
        this.integerState0256 = this.integerState0256 + integerLocal10;
        return;
    }

    void performAction0312(int integerArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        int integerLocal2;
        int integerLocal3;
        integerArgument1 = integerArgument1 + this.integerState0259;
        integerArgument2 = integerArgument2 + this.integerState0256;
        int integerLocal4 = integerArgument1 + integerArgument2 * SoftwareRaster.integerState0285;
        int integerLocal5 = 0;
        int integerLocal6 = this.integerState0255;
        int integerLocal7 = this.integerState0258;
        int integerLocal8 = SoftwareRaster.integerState0285 - integerLocal7;
        int integerLocal9 = 0;
        if (integerArgument2 < SoftwareRaster.integerState0280) {
          integerLocal1 = SoftwareRaster.integerState0280 - integerArgument2;
          integerLocal6 = integerLocal6 - integerLocal1;
          integerArgument2 = SoftwareRaster.integerState0280;
          integerLocal5 = integerLocal5 + integerLocal1 * integerLocal7;
          integerLocal4 = integerLocal4 + integerLocal1 * SoftwareRaster.integerState0285;
        }
        if (integerArgument2 + integerLocal6 > SoftwareRaster.integerState0283) {
          integerLocal6 = integerLocal6 - (integerArgument2 + integerLocal6 - SoftwareRaster.integerState0283);
        }
        if (integerArgument1 < SoftwareRaster.integerState0282) {
          integerLocal2 = SoftwareRaster.integerState0282 - integerArgument1;
          integerLocal7 = integerLocal7 - integerLocal2;
          integerArgument1 = SoftwareRaster.integerState0282;
          integerLocal5 = integerLocal5 + integerLocal2;
          integerLocal4 = integerLocal4 + integerLocal2;
          integerLocal9 = integerLocal9 + integerLocal2;
          integerLocal8 = integerLocal8 + integerLocal2;
        }
        if (integerArgument1 + integerLocal7 > SoftwareRaster.integerState0281) {
          integerLocal3 = integerArgument1 + integerLocal7 - SoftwareRaster.integerState0281;
          integerLocal7 = integerLocal7 - integerLocal3;
          integerLocal9 = integerLocal9 + integerLocal3;
          integerLocal8 = integerLocal8 + integerLocal3;
        }
        if (integerLocal7 > 0) {
          if (integerLocal6 <= 0) {
            return;
          }
          RgbSprite.performAction0286(SoftwareRaster.integerArrayState0063, this.integerArrayState0024, integerLocal5, integerLocal4, integerLocal7, integerLocal6, integerLocal8, integerLocal9);
          return;
        }
    }

    private final static void performAction0295(int[] integerArrayArgument1, int[] integerArrayArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9) {
        int integerLocal1 = 0;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        integerLocal2 = -(integerArgument6 >> 2);
        integerArgument6 = -(integerArgument6 & 3);
        for (integerLocal1 = -integerArgument7; integerLocal1 < 0; integerLocal1++) {
          for (integerLocal3 = integerLocal2; integerLocal3 < 0; integerLocal3++) {
            integerArgument3 = integerArrayArgument2[integerArgument4++];
            if (integerArgument3 == 0) {
              integerArgument5++;
            } else {
              integerArrayArgument1[integerArgument5++] = integerArgument3;
            }
            integerArgument3 = integerArrayArgument2[integerArgument4++];
            if (integerArgument3 == 0) {
              integerArgument5++;
            } else {
              integerArrayArgument1[integerArgument5++] = integerArgument3;
            }
            integerArgument3 = integerArrayArgument2[integerArgument4++];
            if (integerArgument3 == 0) {
              integerArgument5++;
            } else {
              integerArrayArgument1[integerArgument5++] = integerArgument3;
            }
            integerArgument3 = integerArrayArgument2[integerArgument4++];
            if (integerArgument3 == 0) {
              integerArgument5++;
            } else {
              integerArrayArgument1[integerArgument5++] = integerArgument3;
            }
          }
          for (integerLocal4 = integerArgument6; integerLocal4 < 0; integerLocal4++) {
            integerArgument3 = integerArrayArgument2[integerArgument4++];
            if (integerArgument3 == 0) {
              integerArgument5++;
            } else {
              integerArrayArgument1[integerArgument5++] = integerArgument3;
            }
          }
          integerArgument5 = integerArgument5 + integerArgument8;
          integerArgument4 = integerArgument4 + integerArgument9;
        }
    }

    private final static void performAction0282(int integerArgument1, int integerArgument2, int integerArgument3, int[] integerArrayArgument4, int[] integerArrayArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10, int integerArgument11, int integerArgument12, int integerArgument13) {
        int previousIntegerLocal1 = 0;
        for (integerArgument9 = -integerArgument11; integerArgument9 < 0; integerArgument9++) {
          for (integerArgument7 = -integerArgument10; integerArgument7 < 0; integerArgument7++) {
            integerArgument1 = integerArrayArgument5[integerArgument6++];
            if (integerArgument1 == 0) {
              integerArgument8++;
            } else {
              integerArgument2 = integerArrayArgument4[integerArgument8];
              integerArgument3 = integerArgument1 + integerArgument2;
              integerArgument1 = (integerArgument1 & 16711935) + (integerArgument2 & 16711935);
              integerArgument2 = (integerArgument1 & 16777472) + (integerArgument3 - integerArgument1 & 65536);
              previousIntegerLocal1 = integerArgument8;
              integerArgument8++;
              integerArrayArgument4[previousIntegerLocal1] = integerArgument3 - integerArgument2 | integerArgument2 - (integerArgument2 >>> 8);
            }
          }
          integerArgument8 = integerArgument8 + integerArgument12;
          integerArgument6 = integerArgument6 + integerArgument13;
        }
    }

    final void performAction0303(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        int integerLocal6 = 0;
        int integerLocal7 = 0;
        int integerLocal8 = 0;
        int integerLocal9 = 0;
        int integerLocal10 = 0;
        int integerLocal11 = 0;
        int integerLocal12;
        int integerLocal13;
        int integerLocal14;
        int integerLocal15;
        if (integerArgument3 > 0) {
          if (integerArgument4 <= 0) {
            return;
          }
          if (integerArgument3 == this.integerState0258 &&
            integerArgument4 == this.integerState0255) {
            this.performAction0308(integerArgument1, integerArgument2, integerArgument5);
            return;
          }
          integerLocal1 = this.integerState0258;
          integerLocal2 = this.integerState0255;
          integerLocal3 = 0;
          integerLocal4 = 0;
          integerLocal5 = this.integerState0254;
          integerLocal6 = this.integerState0260;
          integerLocal7 = (integerLocal5 << 16) / integerArgument3;
          integerLocal8 = (integerLocal6 << 16) / integerArgument4;
          if (this.integerState0259 > 0) {
            integerLocal10 = ((this.integerState0259 << 16) + integerLocal7 - 1) / integerLocal7;
            integerArgument1 = integerArgument1 + integerLocal10;
            integerLocal3 = integerLocal3 + (integerLocal10 * integerLocal7 - (this.integerState0259 << 16));
          }
          if (this.integerState0256 > 0) {
            integerLocal12 = ((this.integerState0256 << 16) + integerLocal8 - 1) / integerLocal8;
            integerArgument2 = integerArgument2 + integerLocal12;
            integerLocal4 = integerLocal4 + (integerLocal12 * integerLocal8 - (this.integerState0256 << 16));
          }
          if (integerLocal1 < integerLocal5) {
            integerArgument3 = ((integerLocal1 << 16) - integerLocal3 + integerLocal7 - 1) / integerLocal7;
          }
          if (integerLocal2 < integerLocal6) {
            integerArgument4 = ((integerLocal2 << 16) - integerLocal4 + integerLocal8 - 1) / integerLocal8;
          }
          integerLocal13 = integerArgument1 + integerArgument2 * SoftwareRaster.integerState0285;
          integerLocal9 = SoftwareRaster.integerState0285 - integerArgument3;
          if (integerArgument2 + integerArgument4 > SoftwareRaster.integerState0283) {
            integerArgument4 = integerArgument4 - (integerArgument2 + integerArgument4 - SoftwareRaster.integerState0283);
          }
          if (integerArgument2 < SoftwareRaster.integerState0280) {
            integerLocal11 = SoftwareRaster.integerState0280 - integerArgument2;
            integerArgument4 = integerArgument4 - integerLocal11;
            integerLocal13 = integerLocal13 + integerLocal11 * SoftwareRaster.integerState0285;
            integerLocal4 = integerLocal4 + integerLocal8 * integerLocal11;
          }
          if (integerArgument1 + integerArgument3 > SoftwareRaster.integerState0281) {
            integerLocal14 = integerArgument1 + integerArgument3 - SoftwareRaster.integerState0281;
            integerArgument3 = integerArgument3 - integerLocal14;
            integerLocal9 = integerLocal9 + integerLocal14;
          }
          if (integerArgument1 < SoftwareRaster.integerState0282) {
            integerLocal15 = SoftwareRaster.integerState0282 - integerArgument1;
            integerArgument3 = integerArgument3 - integerLocal15;
            integerLocal13 = integerLocal13 + integerLocal15;
            integerLocal3 = integerLocal3 + integerLocal7 * integerLocal15;
            integerLocal9 = integerLocal9 + integerLocal15;
          }
          RgbSprite.performAction0305(SoftwareRaster.integerArrayState0063, this.integerArrayState0024, 0, integerLocal3, integerLocal4, integerLocal13, integerLocal9, integerArgument3, integerArgument4, integerLocal7, integerLocal8, integerLocal1, integerArgument5);
          return;
        }
    }

    final void performAction0278() {
        SoftwareRaster.performAction0724(this.integerArrayState0024, this.integerState0258, this.integerState0255);
    }

    private final static void performAction0305(int[] integerArrayArgument1, int[] integerArrayArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10, int integerArgument11, int integerArgument12, int integerArgument13) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = integerArgument4;
        for (integerLocal1 = -integerArgument9; integerLocal1 < 0; integerLocal1++) {
          integerLocal2 = (integerArgument5 >> 16) * integerArgument12;
          for (integerLocal3 = -integerArgument8; integerLocal3 < 0; integerLocal3++) {
            integerArgument3 = integerArrayArgument2[(integerArgument4 >> 16) + integerLocal2];
            if (integerArgument3 != 0) {
              integerArrayArgument1[integerArgument6++] = integerArgument13;
            } else {
              integerArgument6++;
            }
            integerArgument4 = integerArgument4 + integerArgument10;
          }
          integerArgument5 = integerArgument5 + integerArgument11;
          integerArgument4 = integerLocal4;
          integerArgument6 = integerArgument6 + integerArgument7;
        }
    }

    final RgbSprite computeRgbSprite0311() {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        RgbSprite rgbSpriteLocal3 = new RgbSprite(this.integerState0258, this.integerState0255);
        rgbSpriteLocal3.integerState0254 = this.integerState0254;
        rgbSpriteLocal3.integerState0260 = this.integerState0260;
        rgbSpriteLocal3.integerState0259 = this.integerState0254 - this.integerState0258 - this.integerState0259;
        rgbSpriteLocal3.integerState0256 = this.integerState0256;
        for (integerLocal1 = 0; integerLocal1 < this.integerState0255; integerLocal1++) {
          for (integerLocal2 = 0; integerLocal2 < this.integerState0258; integerLocal2++) {
            rgbSpriteLocal3.integerArrayState0024[integerLocal1 * this.integerState0258 + integerLocal2] = this.integerArrayState0024[integerLocal1 * this.integerState0258 + this.integerState0258 - 1 - integerLocal2];
          }
        }
        return rgbSpriteLocal3;
    }

    private final static void performAction0285(int[] integerArrayArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8) {
        int cachedIntegerLocal1 = 0;
        int cachedIntegerLocal2 = 0;
        int cachedIntegerLocal3 = 0;
        int cachedIntegerLocal4 = 0;
        int previousIntegerLocal5 = 0;
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
        integerLocal6 = 0;
        while (integerLocal6 < integerArgument8) {
          integerLocal7 = 0;
          while (integerLocal7 < integerArgument7) {
            integerLocal9 = SoftwareRaster.integerArrayState0063[integerArgument3] & 16711935;
            integerLocal10 = SoftwareRaster.integerArrayState0063[integerArgument3] & 65280;
            integerLocal11 = 0;
            integerLocal12 = 0;
            cachedIntegerLocal1 = integerArrayArgument1[integerArgument2];
            integerLocal8 = cachedIntegerLocal1;
            if (cachedIntegerLocal1 != 0) {
              integerLocal11 = integerLocal11 + (integerLocal8 & 16711935);
              integerLocal12 = integerLocal12 + (integerLocal8 & 65280);
            } else {
              integerLocal11 = integerLocal11 + integerLocal9;
              integerLocal12 = integerLocal12 + integerLocal10;
            }
            cachedIntegerLocal2 = integerArrayArgument1[integerArgument2 + 1];
            integerLocal13 = cachedIntegerLocal2;
            if (cachedIntegerLocal2 != 0) {
              integerLocal11 = integerLocal11 + (integerLocal13 & 16711935);
              integerLocal12 = integerLocal12 + (integerLocal13 & 65280);
            } else {
              integerLocal11 = integerLocal11 + integerLocal9;
              integerLocal12 = integerLocal12 + integerLocal10;
            }
            cachedIntegerLocal3 = integerArrayArgument1[integerArgument2 + integerArgument6];
            integerLocal14 = cachedIntegerLocal3;
            if (cachedIntegerLocal3 != 0) {
              integerLocal11 = integerLocal11 + (integerLocal14 & 16711935);
              integerLocal12 = integerLocal12 + (integerLocal14 & 65280);
            } else {
              integerLocal11 = integerLocal11 + integerLocal9;
              integerLocal12 = integerLocal12 + integerLocal10;
            }
            cachedIntegerLocal4 = integerArrayArgument1[integerArgument2 + integerArgument6 + 1];
            integerLocal15 = cachedIntegerLocal4;
            if (cachedIntegerLocal4 != 0) {
              integerLocal11 = integerLocal11 + (integerLocal15 & 16711935);
              integerLocal12 = integerLocal12 + (integerLocal15 & 65280);
            } else {
              integerLocal11 = integerLocal11 + integerLocal9;
              integerLocal12 = integerLocal12 + integerLocal10;
            }
            previousIntegerLocal5 = integerArgument3;
            integerArgument3++;
            SoftwareRaster.integerArrayState0063[previousIntegerLocal5] = (integerLocal11 & 66847740 | integerLocal12 & 261120) >> 2;
            integerLocal7++;
            integerArgument2 += 2;
          }
          integerLocal6++;
          integerArgument2 = integerArgument2 + integerArgument4;
          integerArgument3 = integerArgument3 + integerArgument5;
        }
    }

    void performAction0300(int integerArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        int integerLocal2;
        int integerLocal3;
        integerArgument1 = integerArgument1 + this.integerState0259;
        integerArgument2 = integerArgument2 + this.integerState0256;
        int integerLocal4 = integerArgument1 + integerArgument2 * SoftwareRaster.integerState0285;
        int integerLocal5 = 0;
        int integerLocal6 = this.integerState0255;
        int integerLocal7 = this.integerState0258;
        int integerLocal8 = SoftwareRaster.integerState0285 - integerLocal7;
        int integerLocal9 = 0;
        if (integerArgument2 < SoftwareRaster.integerState0280) {
          integerLocal1 = SoftwareRaster.integerState0280 - integerArgument2;
          integerLocal6 = integerLocal6 - integerLocal1;
          integerArgument2 = SoftwareRaster.integerState0280;
          integerLocal5 = integerLocal5 + integerLocal1 * integerLocal7;
          integerLocal4 = integerLocal4 + integerLocal1 * SoftwareRaster.integerState0285;
        }
        if (integerArgument2 + integerLocal6 > SoftwareRaster.integerState0283) {
          integerLocal6 = integerLocal6 - (integerArgument2 + integerLocal6 - SoftwareRaster.integerState0283);
        }
        if (integerArgument1 < SoftwareRaster.integerState0282) {
          integerLocal2 = SoftwareRaster.integerState0282 - integerArgument1;
          integerLocal7 = integerLocal7 - integerLocal2;
          integerArgument1 = SoftwareRaster.integerState0282;
          integerLocal5 = integerLocal5 + integerLocal2;
          integerLocal4 = integerLocal4 + integerLocal2;
          integerLocal9 = integerLocal9 + integerLocal2;
          integerLocal8 = integerLocal8 + integerLocal2;
        }
        if (integerArgument1 + integerLocal7 > SoftwareRaster.integerState0281) {
          integerLocal3 = integerArgument1 + integerLocal7 - SoftwareRaster.integerState0281;
          integerLocal7 = integerLocal7 - integerLocal3;
          integerLocal9 = integerLocal9 + integerLocal3;
          integerLocal8 = integerLocal8 + integerLocal3;
        }
        if (integerLocal7 > 0) {
          if (integerLocal6 <= 0) {
            return;
          }
          RgbSprite.performAction0295(SoftwareRaster.integerArrayState0063, this.integerArrayState0024, 0, integerLocal5, integerLocal4, integerLocal7, integerLocal6, integerLocal8, integerLocal9);
          return;
        }
    }

    final void performAction0293(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
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
        int integerLocal28;
        int integerLocal29;
        int integerLocal30;
        int integerLocal31;
        if (integerArgument3 <= this.integerState0254 &&
          integerArgument4 <= this.integerState0260) {
          integerLocal4 = integerArgument1 + this.integerState0259 * integerArgument3 / this.integerState0254;
          integerLocal5 = integerArgument1 + ((this.integerState0259 + this.integerState0258) * integerArgument3 + this.integerState0254 - 1) / this.integerState0254;
          integerLocal6 = integerArgument2 + this.integerState0256 * integerArgument4 / this.integerState0260;
          integerLocal7 = integerArgument2 + ((this.integerState0256 + this.integerState0255) * integerArgument4 + this.integerState0260 - 1) / this.integerState0260;
          if (integerLocal4 < SoftwareRaster.integerState0282) {
            integerLocal4 = SoftwareRaster.integerState0282;
          }
          if (integerLocal5 > SoftwareRaster.integerState0281) {
            integerLocal5 = SoftwareRaster.integerState0281;
          }
          if (integerLocal6 < SoftwareRaster.integerState0280) {
            integerLocal6 = SoftwareRaster.integerState0280;
          }
          if (integerLocal7 > SoftwareRaster.integerState0283) {
            integerLocal7 = SoftwareRaster.integerState0283;
          }
          if (integerLocal4 >= integerLocal5) {
            return;
          }
          if (integerLocal6 >= integerLocal7) {
            return;
          }
          integerLocal8 = integerLocal6 * SoftwareRaster.integerState0285 + integerLocal4;
          integerLocal9 = SoftwareRaster.integerState0285 - (integerLocal5 - integerLocal4);
          for (integerLocal1 = integerLocal6; integerLocal1 < integerLocal7; integerLocal1++) {
            for (integerLocal2 = integerLocal4; integerLocal2 < integerLocal5; integerLocal2++) {
              integerLocal10 = integerLocal2 - integerArgument1 << 4;
              integerLocal11 = integerLocal1 - integerArgument2 << 4;
              integerLocal12 = integerLocal10 * this.integerState0254 / integerArgument3 - (this.integerState0259 << 4);
              integerLocal13 = (integerLocal10 + 16) * this.integerState0254 / integerArgument3 - (this.integerState0259 << 4);
              integerLocal14 = integerLocal11 * this.integerState0260 / integerArgument4 - (this.integerState0256 << 4);
              integerLocal15 = (integerLocal11 + 16) * this.integerState0260 / integerArgument4 - (this.integerState0256 << 4);
              integerLocal16 = (integerLocal13 - integerLocal12) * (integerLocal15 - integerLocal14);
              if (integerLocal16 != 0) {
                if (integerLocal12 < 0) {
                  integerLocal12 = 0;
                }
                if (integerLocal13 > this.integerState0258 << 4) {
                  integerLocal13 = this.integerState0258 << 4;
                }
                if (integerLocal14 < 0) {
                  integerLocal14 = 0;
                }
                if (integerLocal15 > this.integerState0255 << 4) {
                  integerLocal15 = this.integerState0255 << 4;
                }
                integerLocal13--;
                integerLocal15--;
                integerLocal17 = 16 - (integerLocal12 & 15);
                integerLocal18 = (integerLocal13 & 15) + 1;
                integerLocal19 = 16 - (integerLocal14 & 15);
                integerLocal20 = (integerLocal15 & 15) + 1;
                integerLocal12 = integerLocal12 >> 4;
                integerLocal13 = integerLocal13 >> 4;
                integerLocal14 = integerLocal14 >> 4;
                integerLocal15 = integerLocal15 >> 4;
                integerLocal21 = 0;
                integerLocal22 = 0;
                integerLocal23 = 0;
                integerLocal24 = 0;
                integerLocal25 = SoftwareRaster.integerArrayState0063[integerLocal8];
                for (integerLocal26 = integerLocal14; integerLocal26 <= integerLocal15; integerLocal26++) {
                  integerLocal27 = 16;
                  if (integerLocal26 == integerLocal14) {
                    integerLocal27 = integerLocal19;
                  }
                  if (integerLocal26 == integerLocal15) {
                    integerLocal27 = integerLocal20;
                  }
                  for (integerLocal3 = integerLocal12; integerLocal3 <= integerLocal13; integerLocal3++) {
                    integerLocal28 = this.integerArrayState0024[integerLocal26 * this.integerState0258 + integerLocal3];
                    if (integerLocal28 == 0) {
                      integerLocal28 = integerLocal25;
                    }
                    integerLocal29 = integerLocal27;
                    if (integerLocal3 != integerLocal12) {
                      if (integerLocal3 != integerLocal13) {
                        integerLocal29 = integerLocal29 << 4;
                      } else {
                        integerLocal29 = integerLocal29 * integerLocal18;
                      }
                    } else {
                      integerLocal29 = integerLocal29 * integerLocal17;
                    }
                    integerLocal24 = integerLocal24 + integerLocal29;
                    integerLocal21 = integerLocal21 + (integerLocal28 >> 16 & 255) * integerLocal29;
                    integerLocal22 = integerLocal22 + (integerLocal28 >> 8 & 255) * integerLocal29;
                    integerLocal23 = integerLocal23 + (integerLocal28 & 255) * integerLocal29;
                  }
                }
                if (integerLocal24 < integerLocal16) {
                  integerLocal30 = integerLocal16 - integerLocal24;
                  integerLocal21 = integerLocal21 + (integerLocal25 >> 16 & 255) * integerLocal30;
                  integerLocal22 = integerLocal22 + (integerLocal25 >> 8 & 255) * integerLocal30;
                  integerLocal23 = integerLocal23 + (integerLocal25 & 255) * integerLocal30;
                }
                integerLocal31 = (integerLocal21 / integerLocal16 << 16) + (integerLocal22 / integerLocal16 << 8) + integerLocal23 / integerLocal16;
                if (integerLocal31 == 0) {
                  integerLocal31 = 1;
                }
                SoftwareRaster.integerArrayState0063[integerLocal8] = integerLocal31;
                integerLocal8++;
              }
            }
            integerLocal8 = integerLocal8 + integerLocal9;
          }
          return;
        }
        throw new IllegalArgumentException();
    }

    void performAction0317(int integerArgument1, int integerArgument2, int integerArgument3) {
        int integerLocal1 = 0;
        int integerLocal2;
        int integerLocal3;
        integerArgument1 = integerArgument1 + this.integerState0259;
        integerArgument2 = integerArgument2 + this.integerState0256;
        int integerLocal4 = integerArgument1 + integerArgument2 * SoftwareRaster.integerState0285;
        int integerLocal5 = 0;
        int integerLocal6 = this.integerState0255;
        int integerLocal7 = this.integerState0258;
        int integerLocal8 = SoftwareRaster.integerState0285 - integerLocal7;
        int integerLocal9 = 0;
        if (integerArgument2 < SoftwareRaster.integerState0280) {
          integerLocal1 = SoftwareRaster.integerState0280 - integerArgument2;
          integerLocal6 = integerLocal6 - integerLocal1;
          integerArgument2 = SoftwareRaster.integerState0280;
          integerLocal5 = integerLocal5 + integerLocal1 * integerLocal7;
          integerLocal4 = integerLocal4 + integerLocal1 * SoftwareRaster.integerState0285;
        }
        if (integerArgument2 + integerLocal6 > SoftwareRaster.integerState0283) {
          integerLocal6 = integerLocal6 - (integerArgument2 + integerLocal6 - SoftwareRaster.integerState0283);
        }
        if (integerArgument1 < SoftwareRaster.integerState0282) {
          integerLocal2 = SoftwareRaster.integerState0282 - integerArgument1;
          integerLocal7 = integerLocal7 - integerLocal2;
          integerArgument1 = SoftwareRaster.integerState0282;
          integerLocal5 = integerLocal5 + integerLocal2;
          integerLocal4 = integerLocal4 + integerLocal2;
          integerLocal9 = integerLocal9 + integerLocal2;
          integerLocal8 = integerLocal8 + integerLocal2;
        }
        if (integerArgument1 + integerLocal7 > SoftwareRaster.integerState0281) {
          integerLocal3 = integerArgument1 + integerLocal7 - SoftwareRaster.integerState0281;
          integerLocal7 = integerLocal7 - integerLocal3;
          integerLocal9 = integerLocal9 + integerLocal3;
          integerLocal8 = integerLocal8 + integerLocal3;
        }
        if (integerLocal7 > 0) {
          if (integerLocal6 <= 0) {
            return;
          }
          if (integerArgument3 == 256) {
            RgbSprite.performAction0282(0, 0, 0, SoftwareRaster.integerArrayState0063, this.integerArrayState0024, integerLocal5, 0, integerLocal4, 0, integerLocal7, integerLocal6, integerLocal8, integerLocal9);
          } else {
            RgbSprite.performAction0283(0, 0, 0, SoftwareRaster.integerArrayState0063, this.integerArrayState0024, integerLocal5, 0, integerLocal4, 0, integerLocal7, integerLocal6, integerLocal8, integerLocal9, integerArgument3);
          }
          return;
        }
    }

    private final static void performAction0287(int[] integerArrayArgument1, int[] integerArrayArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9) {
        int integerLocal1 = 0;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        integerLocal2 = -(integerArgument6 >> 2);
        integerArgument6 = -(integerArgument6 & 3);
        for (integerLocal1 = -integerArgument7; integerLocal1 < 0; integerLocal1++) {
          for (integerLocal3 = integerLocal2; integerLocal3 < 0; integerLocal3++) {
            if (integerArrayArgument2[integerArgument4++] == 0) {
              integerArgument5++;
            } else {
              integerArrayArgument1[integerArgument5++] = integerArgument3;
            }
            if (integerArrayArgument2[integerArgument4++] == 0) {
              integerArgument5++;
            } else {
              integerArrayArgument1[integerArgument5++] = integerArgument3;
            }
            if (integerArrayArgument2[integerArgument4++] == 0) {
              integerArgument5++;
            } else {
              integerArrayArgument1[integerArgument5++] = integerArgument3;
            }
            if (integerArrayArgument2[integerArgument4++] == 0) {
              integerArgument5++;
            } else {
              integerArrayArgument1[integerArgument5++] = integerArgument3;
            }
          }
          for (integerLocal4 = integerArgument6; integerLocal4 < 0; integerLocal4++) {
            if (integerArrayArgument2[integerArgument4++] == 0) {
              integerArgument5++;
            } else {
              integerArrayArgument1[integerArgument5++] = integerArgument3;
            }
          }
          integerArgument5 = integerArgument5 + integerArgument8;
          integerArgument4 = integerArgument4 + integerArgument9;
        }
    }

    final void performAction0316(int integerArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        int integerLocal2;
        int integerLocal3;
        integerArgument1 = integerArgument1 + this.integerState0259;
        integerArgument2 = integerArgument2 + this.integerState0256;
        int integerLocal4 = integerArgument1 + integerArgument2 * SoftwareRaster.integerState0285;
        int integerLocal5 = 0;
        int integerLocal6 = this.integerState0255;
        int integerLocal7 = this.integerState0258;
        int integerLocal8 = SoftwareRaster.integerState0285 - integerLocal7;
        int integerLocal9 = 0;
        if (integerArgument2 < SoftwareRaster.integerState0280) {
          integerLocal1 = SoftwareRaster.integerState0280 - integerArgument2;
          integerLocal6 = integerLocal6 - integerLocal1;
          integerArgument2 = SoftwareRaster.integerState0280;
          integerLocal5 = integerLocal5 + integerLocal1 * integerLocal7;
          integerLocal4 = integerLocal4 + integerLocal1 * SoftwareRaster.integerState0285;
        }
        if (integerArgument2 + integerLocal6 > SoftwareRaster.integerState0283) {
          integerLocal6 = integerLocal6 - (integerArgument2 + integerLocal6 - SoftwareRaster.integerState0283);
        }
        if (integerArgument1 < SoftwareRaster.integerState0282) {
          integerLocal2 = SoftwareRaster.integerState0282 - integerArgument1;
          integerLocal7 = integerLocal7 - integerLocal2;
          integerArgument1 = SoftwareRaster.integerState0282;
          integerLocal5 = integerLocal5 + integerLocal2;
          integerLocal4 = integerLocal4 + integerLocal2;
          integerLocal9 = integerLocal9 + integerLocal2;
          integerLocal8 = integerLocal8 + integerLocal2;
        }
        if (integerArgument1 + integerLocal7 > SoftwareRaster.integerState0281) {
          integerLocal3 = integerArgument1 + integerLocal7 - SoftwareRaster.integerState0281;
          integerLocal7 = integerLocal7 - integerLocal3;
          integerLocal9 = integerLocal9 + integerLocal3;
          integerLocal8 = integerLocal8 + integerLocal3;
        }
        if (integerLocal7 > 0) {
          if (integerLocal6 <= 0) {
            return;
          }
          RgbSprite.performAction0284(0, SoftwareRaster.integerArrayState0063, this.integerArrayState0024, 0, integerLocal5, integerLocal4, integerLocal7, integerLocal6, integerLocal8, integerLocal9);
          return;
        }
    }

    private final static void performAction0289(int[] integerArrayArgument1, int[] integerArrayArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10, int integerArgument11, int integerArgument12) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = integerArgument4;
        for (integerLocal1 = -integerArgument9; integerLocal1 < 0; integerLocal1++) {
          integerLocal2 = (integerArgument5 >> 16) * integerArgument12;
          for (integerLocal3 = -integerArgument8; integerLocal3 < 0; integerLocal3++) {
            integerArgument3 = integerArrayArgument2[(integerArgument4 >> 16) + integerLocal2];
            if (integerArgument3 != 0) {
              integerArrayArgument1[integerArgument6++] = integerArgument3;
            } else {
              integerArgument6++;
            }
            integerArgument4 = integerArgument4 + integerArgument10;
          }
          integerArgument5 = integerArgument5 + integerArgument11;
          integerArgument4 = integerLocal4;
          integerArgument6 = integerArgument6 + integerArgument7;
        }
    }

    void performAction0307(int integerArgument1, int integerArgument2) {
        integerArgument1 = integerArgument1 + (this.integerState0259 >> 1);
        integerArgument2 = integerArgument2 + (this.integerState0256 >> 1);
        int integerLocal1 = integerArgument1 < SoftwareRaster.integerState0282 ? SoftwareRaster.integerState0282 - integerArgument1 << 1 : 0;
        int integerLocal2 = integerArgument1 + (this.integerState0258 >> 1) > SoftwareRaster.integerState0281 ? SoftwareRaster.integerState0281 - integerArgument1 << 1 : this.integerState0258;
        int integerLocal3 = integerArgument2 < SoftwareRaster.integerState0280 ? SoftwareRaster.integerState0280 - integerArgument2 << 1 : 0;
        int integerLocal4 = integerArgument2 + (this.integerState0255 >> 1) > SoftwareRaster.integerState0283 ? SoftwareRaster.integerState0283 - integerArgument2 << 1 : this.integerState0255;
        RgbSprite.performAction0285(this.integerArrayState0024, integerLocal3 * this.integerState0258 + integerLocal1, (integerArgument2 + (integerLocal3 >> 1)) * SoftwareRaster.integerState0285 + (integerArgument1 + (integerLocal1 >> 1)), (this.integerState0258 << 1) - (integerLocal2 - integerLocal1) + (this.integerState0258 & 1), SoftwareRaster.integerState0285 - (integerLocal2 - integerLocal1 >> 1), this.integerState0258, integerLocal2 - integerLocal1 >> 1, integerLocal4 - integerLocal3 >> 1);
    }

    final RgbSprite computeRgbSprite0299() {
        int integerLocal1 = 0;
        RgbSprite rgbSpriteLocal2 = new RgbSprite(this.integerState0258, this.integerState0255);
        rgbSpriteLocal2.integerState0254 = this.integerState0254;
        rgbSpriteLocal2.integerState0260 = this.integerState0260;
        rgbSpriteLocal2.integerState0259 = this.integerState0259;
        rgbSpriteLocal2.integerState0256 = this.integerState0256;
        int integerLocal3 = this.integerArrayState0024.length;
        for (integerLocal1 = 0; integerLocal1 < integerLocal3; integerLocal1++) {
          rgbSpriteLocal2.integerArrayState0024[integerLocal1] = this.integerArrayState0024[integerLocal1];
        }
        return rgbSpriteLocal2;
    }

    private final static void performAction0304(int[] integerArrayArgument1, int[] integerArrayArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int previousIntegerLocal3 = 0;
        int integerLocal4;
        int integerLocal5;
        for (integerLocal1 = -integerArgument7; integerLocal1 < 0; integerLocal1++) {
          for (integerLocal2 = -integerArgument6; integerLocal2 < 0; integerLocal2++) {
            integerArgument3 = integerArrayArgument2[integerArgument4++];
            if (integerArgument3 == 0) {
              integerArgument5++;
            } else {
              integerLocal4 = (integerArgument3 & 16711935) * integerArgument10 & -16711936;
              integerLocal5 = (integerArgument3 & 65280) * integerArgument10 & 16711680;
              previousIntegerLocal3 = integerArgument5;
              integerArgument5++;
              integerArrayArgument1[previousIntegerLocal3] = (integerLocal4 | integerLocal5) >>> 8;
            }
          }
          integerArgument5 = integerArgument5 + integerArgument8;
          integerArgument4 = integerArgument4 + integerArgument9;
        }
    }

    final void performAction0291() {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        if (this.integerState0258 == this.integerState0254 &&
          this.integerState0255 == this.integerState0260) {
          return;
        }
        int[] integerArrayLocal3 = new int[this.integerState0254 * this.integerState0260];
        for (integerLocal1 = 0; integerLocal1 < this.integerState0255; integerLocal1++) {
          for (integerLocal2 = 0; integerLocal2 < this.integerState0258; integerLocal2++) {
            integerArrayLocal3[(integerLocal1 + this.integerState0256) * this.integerState0254 + (integerLocal2 + this.integerState0259)] = this.integerArrayState0024[integerLocal1 * this.integerState0258 + integerLocal2];
          }
        }
        this.integerArrayState0024 = integerArrayLocal3;
        this.integerState0258 = this.integerState0254;
        this.integerState0255 = this.integerState0260;
        this.integerState0259 = 0;
        this.integerState0256 = 0;
    }

    private final static void performAction0298(int[] integerArrayArgument1, int[] integerArrayArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10, int integerArgument11, int integerArgument12, int integerArgument13) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int previousIntegerLocal4 = 0;
        int integerLocal5 = 0;
        int integerLocal6 = 256 - integerArgument13;
        int integerLocal7 = integerArgument4;
        for (integerLocal1 = -integerArgument9; integerLocal1 < 0; integerLocal1++) {
          integerLocal2 = (integerArgument5 >> 16) * integerArgument12;
          for (integerLocal3 = -integerArgument8; integerLocal3 < 0; integerLocal3++) {
            integerArgument3 = integerArrayArgument2[(integerArgument4 >> 16) + integerLocal2];
            if (integerArgument3 != 0) {
              integerLocal5 = integerArrayArgument1[integerArgument6];
              previousIntegerLocal4 = integerArgument6;
              integerArgument6++;
              integerArrayArgument1[previousIntegerLocal4] = ((integerArgument3 & 16711935) * integerArgument13 + (integerLocal5 & 16711935) * integerLocal6 & -16711936) + ((integerArgument3 & 65280) * integerArgument13 + (integerLocal5 & 65280) * integerLocal6 & 16711680) >> 8;
            } else {
              integerArgument6++;
            }
            integerArgument4 = integerArgument4 + integerArgument10;
          }
          integerArgument5 = integerArgument5 + integerArgument11;
          integerArgument4 = integerLocal7;
          integerArgument6 = integerArgument6 + integerArgument7;
        }
    }

    void performAction0313(int integerArgument1, int integerArgument2, int integerArgument3) {
        int integerLocal1 = 0;
        int integerLocal2;
        int integerLocal3;
        if (integerArgument3 == 256) {
          this.performAction0300(integerArgument1, integerArgument2);
          return;
        }
        integerArgument1 = integerArgument1 + this.integerState0259;
        integerArgument2 = integerArgument2 + this.integerState0256;
        int integerLocal4 = integerArgument1 + integerArgument2 * SoftwareRaster.integerState0285;
        int integerLocal5 = 0;
        int integerLocal6 = this.integerState0255;
        int integerLocal7 = this.integerState0258;
        int integerLocal8 = SoftwareRaster.integerState0285 - integerLocal7;
        int integerLocal9 = 0;
        if (integerArgument2 < SoftwareRaster.integerState0280) {
          integerLocal1 = SoftwareRaster.integerState0280 - integerArgument2;
          integerLocal6 = integerLocal6 - integerLocal1;
          integerArgument2 = SoftwareRaster.integerState0280;
          integerLocal5 = integerLocal5 + integerLocal1 * integerLocal7;
          integerLocal4 = integerLocal4 + integerLocal1 * SoftwareRaster.integerState0285;
        }
        if (integerArgument2 + integerLocal6 > SoftwareRaster.integerState0283) {
          integerLocal6 = integerLocal6 - (integerArgument2 + integerLocal6 - SoftwareRaster.integerState0283);
        }
        if (integerArgument1 < SoftwareRaster.integerState0282) {
          integerLocal2 = SoftwareRaster.integerState0282 - integerArgument1;
          integerLocal7 = integerLocal7 - integerLocal2;
          integerArgument1 = SoftwareRaster.integerState0282;
          integerLocal5 = integerLocal5 + integerLocal2;
          integerLocal4 = integerLocal4 + integerLocal2;
          integerLocal9 = integerLocal9 + integerLocal2;
          integerLocal8 = integerLocal8 + integerLocal2;
        }
        if (integerArgument1 + integerLocal7 > SoftwareRaster.integerState0281) {
          integerLocal3 = integerArgument1 + integerLocal7 - SoftwareRaster.integerState0281;
          integerLocal7 = integerLocal7 - integerLocal3;
          integerLocal9 = integerLocal9 + integerLocal3;
          integerLocal8 = integerLocal8 + integerLocal3;
        }
        if (integerLocal7 > 0) {
          if (integerLocal6 <= 0) {
            return;
          }
          RgbSprite.performAction0304(SoftwareRaster.integerArrayState0063, this.integerArrayState0024, 0, integerLocal5, integerLocal4, integerLocal7, integerLocal6, integerLocal8, integerLocal9, integerArgument3);
          return;
        }
    }

    private final static void performAction0297(int[] integerArrayArgument1, int[] integerArrayArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10, int integerArgument11, int integerArgument12) {
        int previousIntegerLocal1 = 0;
        int integerLocal2;
        int integerLocal3;
        integerLocal2 = integerArgument12 & 16711935;
        integerLocal3 = integerArgument12 >> 8 & 255;
        for (integerArgument7 = -integerArgument9; integerArgument7 < 0; integerArgument7++) {
          for (integerArgument6 = -integerArgument8; integerArgument6 < 0; integerArgument6++) {
            integerArgument3 = integerArrayArgument2[integerArgument4++];
            if (integerArgument3 == 0) {
              integerArgument5++;
            } else {
              if (integerArgument3 >> 8 != (integerArgument3 & 65535)) {
                integerArrayArgument1[integerArgument5++] = integerArgument3;
              } else {
                integerArgument3 = integerArgument3 & 255;
                previousIntegerLocal1 = integerArgument5;
                integerArgument5++;
                integerArrayArgument1[previousIntegerLocal1] = (integerArgument3 * integerLocal2 >> 8 & 16711934) + (integerArgument3 * integerLocal3 & 65280) + 1;
              }
            }
          }
          integerArgument5 = integerArgument5 + integerArgument10;
          integerArgument4 = integerArgument4 + integerArgument11;
        }
    }

    final void performAction0308(int integerArgument1, int integerArgument2, int integerArgument3) {
        int integerLocal1 = 0;
        int integerLocal2;
        int integerLocal3;
        integerArgument1 = integerArgument1 + this.integerState0259;
        integerArgument2 = integerArgument2 + this.integerState0256;
        int integerLocal4 = integerArgument1 + integerArgument2 * SoftwareRaster.integerState0285;
        int integerLocal5 = 0;
        int integerLocal6 = this.integerState0255;
        int integerLocal7 = this.integerState0258;
        int integerLocal8 = SoftwareRaster.integerState0285 - integerLocal7;
        int integerLocal9 = 0;
        if (integerArgument2 < SoftwareRaster.integerState0280) {
          integerLocal1 = SoftwareRaster.integerState0280 - integerArgument2;
          integerLocal6 = integerLocal6 - integerLocal1;
          integerArgument2 = SoftwareRaster.integerState0280;
          integerLocal5 = integerLocal5 + integerLocal1 * integerLocal7;
          integerLocal4 = integerLocal4 + integerLocal1 * SoftwareRaster.integerState0285;
        }
        if (integerArgument2 + integerLocal6 > SoftwareRaster.integerState0283) {
          integerLocal6 = integerLocal6 - (integerArgument2 + integerLocal6 - SoftwareRaster.integerState0283);
        }
        if (integerArgument1 < SoftwareRaster.integerState0282) {
          integerLocal2 = SoftwareRaster.integerState0282 - integerArgument1;
          integerLocal7 = integerLocal7 - integerLocal2;
          integerArgument1 = SoftwareRaster.integerState0282;
          integerLocal5 = integerLocal5 + integerLocal2;
          integerLocal4 = integerLocal4 + integerLocal2;
          integerLocal9 = integerLocal9 + integerLocal2;
          integerLocal8 = integerLocal8 + integerLocal2;
        }
        if (integerArgument1 + integerLocal7 > SoftwareRaster.integerState0281) {
          integerLocal3 = integerArgument1 + integerLocal7 - SoftwareRaster.integerState0281;
          integerLocal7 = integerLocal7 - integerLocal3;
          integerLocal9 = integerLocal9 + integerLocal3;
          integerLocal8 = integerLocal8 + integerLocal3;
        }
        if (integerLocal7 > 0) {
          if (integerLocal6 <= 0) {
            return;
          }
          RgbSprite.performAction0287(SoftwareRaster.integerArrayState0063, this.integerArrayState0024, integerArgument3, integerLocal5, integerLocal4, integerLocal7, integerLocal6, integerLocal8, integerLocal9);
          return;
        }
    }

    final void performAction0306() {
        int integerLocal1 = 0;
        int previousIntegerLocal2 = 0;
        int integerLocal3 = 0;
        int[] integerArrayLocal4 = new int[this.integerState0258 * this.integerState0255];
        int integerLocal5 = 0;
        int integerLocal6;
        int integerLocal7;
        int integerLocal8;
        for (integerLocal3 = 0; integerLocal3 < this.integerState0258; integerLocal3++) {
          for (integerLocal1 = this.integerState0255 - 1; integerLocal1 >= 0; integerLocal1--) {
            previousIntegerLocal2 = integerLocal5;
            integerLocal5++;
            integerArrayLocal4[previousIntegerLocal2] = this.integerArrayState0024[integerLocal3 + integerLocal1 * this.integerState0258];
          }
        }
        this.integerArrayState0024 = integerArrayLocal4;
        integerLocal6 = this.integerState0256;
        this.integerState0256 = this.integerState0259;
        this.integerState0259 = this.integerState0260 - this.integerState0255 - integerLocal6;
        integerLocal7 = this.integerState0255;
        this.integerState0255 = this.integerState0258;
        this.integerState0258 = integerLocal7;
        integerLocal8 = this.integerState0260;
        this.integerState0260 = this.integerState0254;
        this.integerState0254 = integerLocal8;
    }

    void performAction0292(int integerArgument1, int integerArgument2, int integerArgument3) {
        int integerLocal1 = 0;
        int integerLocal2;
        int integerLocal3;
        integerArgument1 = integerArgument1 + this.integerState0259;
        integerArgument2 = integerArgument2 + this.integerState0256;
        int integerLocal4 = integerArgument1 + integerArgument2 * SoftwareRaster.integerState0285;
        int integerLocal5 = 0;
        int integerLocal6 = this.integerState0255;
        int integerLocal7 = this.integerState0258;
        int integerLocal8 = SoftwareRaster.integerState0285 - integerLocal7;
        int integerLocal9 = 0;
        if (integerArgument2 < SoftwareRaster.integerState0280) {
          integerLocal1 = SoftwareRaster.integerState0280 - integerArgument2;
          integerLocal6 = integerLocal6 - integerLocal1;
          integerArgument2 = SoftwareRaster.integerState0280;
          integerLocal5 = integerLocal5 + integerLocal1 * integerLocal7;
          integerLocal4 = integerLocal4 + integerLocal1 * SoftwareRaster.integerState0285;
        }
        if (integerArgument2 + integerLocal6 > SoftwareRaster.integerState0283) {
          integerLocal6 = integerLocal6 - (integerArgument2 + integerLocal6 - SoftwareRaster.integerState0283);
        }
        if (integerArgument1 < SoftwareRaster.integerState0282) {
          integerLocal2 = SoftwareRaster.integerState0282 - integerArgument1;
          integerLocal7 = integerLocal7 - integerLocal2;
          integerArgument1 = SoftwareRaster.integerState0282;
          integerLocal5 = integerLocal5 + integerLocal2;
          integerLocal4 = integerLocal4 + integerLocal2;
          integerLocal9 = integerLocal9 + integerLocal2;
          integerLocal8 = integerLocal8 + integerLocal2;
        }
        if (integerArgument1 + integerLocal7 > SoftwareRaster.integerState0281) {
          integerLocal3 = integerArgument1 + integerLocal7 - SoftwareRaster.integerState0281;
          integerLocal7 = integerLocal7 - integerLocal3;
          integerLocal9 = integerLocal9 + integerLocal3;
          integerLocal8 = integerLocal8 + integerLocal3;
        }
        if (integerLocal7 > 0) {
          if (integerLocal6 <= 0) {
            return;
          }
          RgbSprite.performAction0297(SoftwareRaster.integerArrayState0063, this.integerArrayState0024, 0, integerLocal5, integerLocal4, 0, 0, integerLocal7, integerLocal6, integerLocal8, integerLocal9, integerArgument3);
          return;
        }
    }

    final void performAction0281(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6) {
        double doubleLocal1;
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
        double doubleLocal18;
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
        int integerLocal54;
        int integerLocal55;
        int integerLocal56;
        int integerLocal57;
        int integerLocal58;
        int integerLocal59;
        int integerLocal60;
        if (integerArgument6 == 0) {
          return;
        }
        integerArgument1 = integerArgument1 - (this.integerState0259 << 4);
        integerArgument2 = integerArgument2 - (this.integerState0256 << 4);
        doubleLocal1 = (double)(integerArgument5 & 65535) * 0.00009587379924285257;
        integerLocal2 = (int)Math.floor(Math.sin(doubleLocal1) * (double)integerArgument6 + 0.5);
        integerLocal3 = (int)Math.floor(Math.cos(doubleLocal1) * (double)integerArgument6 + 0.5);
        integerLocal4 = -integerArgument1 * integerLocal3 + -integerArgument2 * integerLocal2;
        integerLocal5 = -(-integerArgument1) * integerLocal2 + -integerArgument2 * integerLocal3;
        integerLocal6 = ((this.integerState0258 << 4) - integerArgument1) * integerLocal3 + -integerArgument2 * integerLocal2;
        integerLocal7 = -((this.integerState0258 << 4) - integerArgument1) * integerLocal2 + -integerArgument2 * integerLocal3;
        integerLocal8 = -integerArgument1 * integerLocal3 + ((this.integerState0255 << 4) - integerArgument2) * integerLocal2;
        integerLocal9 = -(-integerArgument1) * integerLocal2 + ((this.integerState0255 << 4) - integerArgument2) * integerLocal3;
        integerLocal10 = ((this.integerState0258 << 4) - integerArgument1) * integerLocal3 + ((this.integerState0255 << 4) - integerArgument2) * integerLocal2;
        integerLocal11 = -((this.integerState0258 << 4) - integerArgument1) * integerLocal2 + ((this.integerState0255 << 4) - integerArgument2) * integerLocal3;
        if (integerLocal4 >= integerLocal6) {
          integerLocal12 = integerLocal6;
          integerLocal13 = integerLocal4;
        } else {
          integerLocal12 = integerLocal4;
          integerLocal13 = integerLocal6;
        }
        if (integerLocal8 < integerLocal12) {
          integerLocal12 = integerLocal8;
        }
        if (integerLocal10 < integerLocal12) {
          integerLocal12 = integerLocal10;
        }
        if (integerLocal8 > integerLocal13) {
          integerLocal13 = integerLocal8;
        }
        if (integerLocal10 > integerLocal13) {
          integerLocal13 = integerLocal10;
        }
        if (integerLocal5 >= integerLocal7) {
          integerLocal14 = integerLocal7;
          integerLocal15 = integerLocal5;
        } else {
          integerLocal14 = integerLocal5;
          integerLocal15 = integerLocal7;
        }
        if (integerLocal9 < integerLocal14) {
          integerLocal14 = integerLocal9;
        }
        if (integerLocal11 < integerLocal14) {
          integerLocal14 = integerLocal11;
        }
        if (integerLocal9 > integerLocal15) {
          integerLocal15 = integerLocal9;
        }
        if (integerLocal11 > integerLocal15) {
          integerLocal15 = integerLocal11;
        }
        integerLocal12 = integerLocal12 >> 12;
        integerLocal13 = integerLocal13 + 4095 >> 12;
        integerLocal14 = integerLocal14 >> 12;
        integerLocal15 = integerLocal15 + 4095 >> 12;
        integerLocal12 = integerLocal12 + integerArgument3;
        integerLocal13 = integerLocal13 + integerArgument3;
        integerLocal14 = integerLocal14 + integerArgument4;
        integerLocal15 = integerLocal15 + integerArgument4;
        integerLocal12 = integerLocal12 >> 4;
        integerLocal13 = integerLocal13 + 15 >> 4;
        integerLocal14 = integerLocal14 >> 4;
        integerLocal15 = integerLocal15 + 15 >> 4;
        if (integerLocal12 < SoftwareRaster.integerState0282) {
          integerLocal12 = SoftwareRaster.integerState0282;
        }
        if (integerLocal13 > SoftwareRaster.integerState0281) {
          integerLocal13 = SoftwareRaster.integerState0281;
        }
        if (integerLocal14 < SoftwareRaster.integerState0280) {
          integerLocal14 = SoftwareRaster.integerState0280;
        }
        if (integerLocal15 > SoftwareRaster.integerState0283) {
          integerLocal15 = SoftwareRaster.integerState0283;
        }
        integerLocal13 = integerLocal12 - integerLocal13;
        if (integerLocal13 >= 0) {
          return;
        }
        integerLocal15 = integerLocal14 - integerLocal15;
        if (integerLocal15 >= 0) {
          return;
        }
        integerLocal16 = integerLocal14 * SoftwareRaster.integerState0285 + integerLocal12;
        integerLocal17 = SoftwareRaster.integerState0285 + integerLocal13;
        doubleLocal18 = 16777216.0 / (double)integerArgument6;
        integerLocal19 = (int)Math.floor(Math.sin(doubleLocal1) * doubleLocal18 + 0.5);
        integerLocal20 = (int)Math.floor(Math.cos(doubleLocal1) * doubleLocal18 + 0.5);
        integerLocal21 = (integerLocal12 << 4) + 8 - integerArgument3;
        integerLocal22 = (integerLocal14 << 4) + 8 - integerArgument4;
        integerLocal23 = (integerArgument1 << 8) - 2048 - (integerLocal22 * integerLocal19 >> 4);
        integerLocal24 = (integerArgument2 << 8) - 2048 + (integerLocal22 * integerLocal20 >> 4);
        if (integerLocal20 >= 0) {
          if (integerLocal19 >= 0) {
            integerLocal28 = integerLocal15;
            while (integerLocal28 < 0) {
              integerLocal29 = integerLocal23 + (integerLocal21 * integerLocal20 >> 4);
              integerLocal30 = integerLocal24 + (integerLocal21 * integerLocal19 >> 4);
              integerLocal31 = integerLocal13;
              integerLocal32 = 0;
              integerLocal27 = integerLocal29 + 4096;
              if (integerLocal27 < 0) {
                if (integerLocal20 != 0) {
                  integerLocal27 = (integerLocal20 - 1 - integerLocal27) / integerLocal20;
                  integerLocal31 = integerLocal31 + integerLocal27;
                  integerLocal29 = integerLocal29 + integerLocal20 * integerLocal27;
                  integerLocal30 = integerLocal30 + integerLocal19 * integerLocal27;
                  integerLocal16 = integerLocal16 + integerLocal27;
                  integerLocal32 = 1;
                } else {
                  integerLocal16 = integerLocal16 - integerLocal31;
                }
              } else {
                integerLocal32 = 1;
              }
              if (integerLocal32 != 0) {
                integerLocal32 = 0;
                integerLocal59 = integerLocal30 + 4096;
                if (integerLocal59 < 0) {
                  if (integerLocal19 != 0) {
                    integerLocal59 = (integerLocal19 - 1 - integerLocal59) / integerLocal19;
                    integerLocal31 = integerLocal31 + integerLocal59;
                    integerLocal29 = integerLocal29 + integerLocal20 * integerLocal59;
                    integerLocal30 = integerLocal30 + integerLocal19 * integerLocal59;
                    integerLocal16 = integerLocal16 + integerLocal59;
                    integerLocal32 = 1;
                  } else {
                    integerLocal16 = integerLocal16 - integerLocal31;
                  }
                } else {
                  integerLocal32 = 1;
                }
                if (integerLocal32 != 0) {
                  while (integerLocal31 < 0) {
                    integerLocal25 = integerLocal29 >> 12;
                    if (integerLocal29 >> 12 < this.integerState0258) {
                      integerLocal26 = integerLocal30 >> 12;
                      if (integerLocal30 >> 12 < this.integerState0255) {
                        this.performAction0314(integerLocal16, integerLocal25, integerLocal26, integerLocal29, integerLocal30);
                        integerLocal31++;
                        integerLocal29 = integerLocal29 + integerLocal20;
                        integerLocal30 = integerLocal30 + integerLocal19;
                        integerLocal16++;
                        continue;
                      }
                    }
                    break;
                  }
                  integerLocal16 = integerLocal16 - integerLocal31;
                }
              }
              integerLocal28++;
              integerLocal23 = integerLocal23 - integerLocal19;
              integerLocal24 = integerLocal24 + integerLocal20;
              integerLocal16 = integerLocal16 + integerLocal17;
            }
            return;
          }
          integerLocal52 = integerLocal15;
          while (integerLocal52 < 0) {
            integerLocal53 = integerLocal23 + (integerLocal21 * integerLocal20 >> 4);
            integerLocal54 = integerLocal24 + (integerLocal21 * integerLocal19 >> 4);
            integerLocal55 = integerLocal13;
            integerLocal56 = 0;
            integerLocal51 = integerLocal53 + 4096;
            if (integerLocal51 < 0) {
              if (integerLocal20 != 0) {
                integerLocal51 = (integerLocal20 - 1 - integerLocal51) / integerLocal20;
                integerLocal55 = integerLocal55 + integerLocal51;
                integerLocal53 = integerLocal53 + integerLocal20 * integerLocal51;
                integerLocal54 = integerLocal54 + integerLocal19 * integerLocal51;
                integerLocal16 = integerLocal16 + integerLocal51;
                integerLocal56 = 1;
              } else {
                integerLocal16 = integerLocal16 - integerLocal55;
              }
            } else {
              integerLocal56 = 1;
            }
            if (integerLocal56 != 0) {
              integerLocal56 = 0;
              integerLocal60 = integerLocal54 - (this.integerState0255 << 12);
              if (integerLocal60 >= 0) {
                if (integerLocal19 != 0) {
                  integerLocal60 = (integerLocal19 - integerLocal60) / integerLocal19;
                  integerLocal55 = integerLocal55 + integerLocal60;
                  integerLocal53 = integerLocal53 + integerLocal20 * integerLocal60;
                  integerLocal54 = integerLocal54 + integerLocal19 * integerLocal60;
                  integerLocal16 = integerLocal16 + integerLocal60;
                  integerLocal56 = 1;
                } else {
                  integerLocal16 = integerLocal16 - integerLocal55;
                }
              } else {
                integerLocal56 = 1;
              }
              if (integerLocal56 != 0) {
                while (integerLocal55 < 0) {
                  if (integerLocal54 >= -4096) {
                    integerLocal49 = integerLocal53 >> 12;
                    if (integerLocal53 >> 12 < this.integerState0258) {
                      integerLocal50 = integerLocal54 >> 12;
                      this.performAction0314(integerLocal16, integerLocal49, integerLocal50, integerLocal53, integerLocal54);
                      integerLocal55++;
                      integerLocal53 = integerLocal53 + integerLocal20;
                      integerLocal54 = integerLocal54 + integerLocal19;
                      integerLocal16++;
                      continue;
                    }
                  }
                  break;
                }
                integerLocal16 = integerLocal16 - integerLocal55;
              }
            }
            integerLocal52++;
            integerLocal23 = integerLocal23 - integerLocal19;
            integerLocal24 = integerLocal24 + integerLocal20;
            integerLocal16 = integerLocal16 + integerLocal17;
          }
          return;
        }
        if (integerLocal19 >= 0) {
          integerLocal39 = integerLocal15;
          while (integerLocal39 < 0) {
            integerLocal41 = integerLocal23 + (integerLocal21 * integerLocal20 >> 4);
            integerLocal43 = integerLocal24 + (integerLocal21 * integerLocal19 >> 4);
            integerLocal45 = integerLocal13;
            integerLocal47 = 0;
            integerLocal37 = integerLocal41 - (this.integerState0258 << 12);
            if (integerLocal37 >= 0) {
              if (integerLocal20 != 0) {
                integerLocal37 = (integerLocal20 - integerLocal37) / integerLocal20;
                integerLocal45 = integerLocal45 + integerLocal37;
                integerLocal41 = integerLocal41 + integerLocal20 * integerLocal37;
                integerLocal43 = integerLocal43 + integerLocal19 * integerLocal37;
                integerLocal16 = integerLocal16 + integerLocal37;
                integerLocal47 = 1;
              } else {
                integerLocal16 = integerLocal16 - integerLocal45;
              }
            } else {
              integerLocal47 = 1;
            }
            if (integerLocal47 != 0) {
              integerLocal47 = 0;
              integerLocal57 = integerLocal43 + 4096;
              if (integerLocal57 < 0) {
                if (integerLocal19 != 0) {
                  integerLocal57 = (integerLocal19 - 1 - integerLocal57) / integerLocal19;
                  integerLocal45 = integerLocal45 + integerLocal57;
                  integerLocal41 = integerLocal41 + integerLocal20 * integerLocal57;
                  integerLocal43 = integerLocal43 + integerLocal19 * integerLocal57;
                  integerLocal16 = integerLocal16 + integerLocal57;
                  integerLocal47 = 1;
                } else {
                  integerLocal16 = integerLocal16 - integerLocal45;
                }
              } else {
                integerLocal47 = 1;
              }
              if (integerLocal47 != 0) {
                while (integerLocal45 < 0) {
                  if (integerLocal41 >= -4096) {
                    integerLocal35 = integerLocal43 >> 12;
                    if (integerLocal43 >> 12 < this.integerState0255) {
                      integerLocal33 = integerLocal41 >> 12;
                      this.performAction0314(integerLocal16, integerLocal33, integerLocal35, integerLocal41, integerLocal43);
                      integerLocal45++;
                      integerLocal41 = integerLocal41 + integerLocal20;
                      integerLocal43 = integerLocal43 + integerLocal19;
                      integerLocal16++;
                      continue;
                    }
                  }
                  break;
                }
                integerLocal16 = integerLocal16 - integerLocal45;
              }
            }
            integerLocal39++;
            integerLocal23 = integerLocal23 - integerLocal19;
            integerLocal24 = integerLocal24 + integerLocal20;
            integerLocal16 = integerLocal16 + integerLocal17;
          }
          return;
        }
        integerLocal40 = integerLocal15;
        while (integerLocal40 < 0) {
          integerLocal42 = integerLocal23 + (integerLocal21 * integerLocal20 >> 4);
          integerLocal44 = integerLocal24 + (integerLocal21 * integerLocal19 >> 4);
          integerLocal46 = integerLocal13;
          integerLocal48 = 0;
          integerLocal38 = integerLocal42 - (this.integerState0258 << 12);
          if (integerLocal38 >= 0) {
            if (integerLocal20 != 0) {
              integerLocal38 = (integerLocal20 - integerLocal38) / integerLocal20;
              integerLocal46 = integerLocal46 + integerLocal38;
              integerLocal42 = integerLocal42 + integerLocal20 * integerLocal38;
              integerLocal44 = integerLocal44 + integerLocal19 * integerLocal38;
              integerLocal16 = integerLocal16 + integerLocal38;
              integerLocal48 = 1;
            } else {
              integerLocal16 = integerLocal16 - integerLocal46;
            }
          } else {
            integerLocal48 = 1;
          }
          if (integerLocal48 != 0) {
            integerLocal48 = 0;
            integerLocal58 = integerLocal44 - (this.integerState0255 << 12);
            if (integerLocal58 >= 0) {
              if (integerLocal19 != 0) {
                integerLocal58 = (integerLocal19 - integerLocal58) / integerLocal19;
                integerLocal46 = integerLocal46 + integerLocal58;
                integerLocal42 = integerLocal42 + integerLocal20 * integerLocal58;
                integerLocal44 = integerLocal44 + integerLocal19 * integerLocal58;
                integerLocal16 = integerLocal16 + integerLocal58;
                integerLocal48 = 1;
              } else {
                integerLocal16 = integerLocal16 - integerLocal46;
              }
            } else {
              integerLocal48 = 1;
            }
            if (integerLocal48 != 0) {
              while (integerLocal46 < 0) {
                if (integerLocal42 >= -4096 &&
                  integerLocal44 >= -4096) {
                  integerLocal34 = integerLocal42 >> 12;
                  integerLocal36 = integerLocal44 >> 12;
                  this.performAction0314(integerLocal16, integerLocal34, integerLocal36, integerLocal42, integerLocal44);
                  integerLocal46++;
                  integerLocal42 = integerLocal42 + integerLocal20;
                  integerLocal44 = integerLocal44 + integerLocal19;
                  integerLocal16++;
                  continue;
                }
                break;
              }
              integerLocal16 = integerLocal16 - integerLocal46;
            }
          }
          integerLocal40++;
          integerLocal23 = integerLocal23 - integerLocal19;
          integerLocal24 = integerLocal24 + integerLocal20;
          integerLocal16 = integerLocal16 + integerLocal17;
        }
        return;
    }

    private final static void performAction0296(int[] integerArrayArgument1, int[] integerArrayArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int previousIntegerLocal3 = 0;
        int previousIntegerLocal4 = 0;
        int integerLocal5;
        int integerLocal6;
        int integerLocal7;
        int integerLocal8;
        int integerLocal9;
        int integerLocal10;
        int integerLocal11;
        int integerLocal12;
        integerLocal5 = integerArgument10 >> 16 & 255;
        integerLocal6 = integerArgument10 >> 8 & 255;
        integerLocal7 = integerArgument10 & 255;
        integerLocal8 = -(integerArgument6 >> 2);
        integerArgument6 = -(integerArgument6 & 3);
        integerLocal9 = integerLocal8 + integerLocal8 + integerLocal8 + integerLocal8 + integerArgument6;
        for (integerLocal1 = -integerArgument7; integerLocal1 < 0; integerLocal1++) {
          for (integerLocal2 = integerLocal9; integerLocal2 < 0; integerLocal2++) {
            boolean frameRemainderLocal13 = true;
            integerArgument3 = integerArrayArgument2[integerArgument4++];
            if (integerArgument3 == 0) {
              integerArgument5++;
            } else {
              integerLocal10 = integerArgument3 >> 16 & 255;
              integerLocal11 = integerArgument3 >> 8 & 255;
              integerLocal12 = integerArgument3 & 255;
              if (integerLocal10 == integerLocal11 &&
                integerLocal11 == integerLocal12) {
                if (integerLocal10 > 128) {
                  previousIntegerLocal3 = integerArgument5;
                  integerArgument5++;
                  integerArrayArgument1[previousIntegerLocal3] = (integerLocal5 * (256 - integerLocal10) + 255 * (integerLocal10 - 128) >> 7 << 16) + (integerLocal6 * (256 - integerLocal11) + 255 * (integerLocal11 - 128) >> 7 << 8) + (integerLocal7 * (256 - integerLocal12) + 255 * (integerLocal12 - 128) >> 7);
                } else {
                  previousIntegerLocal4 = integerArgument5;
                  integerArgument5++;
                  integerArrayArgument1[previousIntegerLocal4] = (integerLocal10 * integerLocal5 >> 7 << 16) + (integerLocal11 * integerLocal6 >> 7 << 8) + (integerLocal12 * integerLocal7 >> 7);
                }
                frameRemainderLocal13 = false;
              }
              else {
                integerArrayArgument1[integerArgument5++] = integerArgument3;
              }
            }
          }
          integerArgument5 = integerArgument5 + integerArgument8;
          integerArgument4 = integerArgument4 + integerArgument9;
        }
    }

    private final static void performAction0283(int integerArgument1, int integerArgument2, int integerArgument3, int[] integerArrayArgument4, int[] integerArrayArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10, int integerArgument11, int integerArgument12, int integerArgument13, int integerArgument14) {
        int previousIntegerLocal1 = 0;
        for (integerArgument9 = -integerArgument11; integerArgument9 < 0; integerArgument9++) {
          for (integerArgument7 = -integerArgument10; integerArgument7 < 0; integerArgument7++) {
            integerArgument1 = integerArrayArgument5[integerArgument6++];
            if (integerArgument1 == 0) {
              integerArgument8++;
            } else {
              integerArgument2 = (integerArgument1 & 16711935) * integerArgument14;
              integerArgument1 = (integerArgument2 & -16711936) + (integerArgument1 * integerArgument14 - integerArgument2 & 16711680) >>> 8;
              integerArgument2 = integerArrayArgument4[integerArgument8];
              integerArgument3 = integerArgument1 + integerArgument2;
              integerArgument1 = (integerArgument1 & 16711935) + (integerArgument2 & 16711935);
              integerArgument2 = (integerArgument1 & 16777472) + (integerArgument3 - integerArgument1 & 65536);
              previousIntegerLocal1 = integerArgument8;
              integerArgument8++;
              integerArrayArgument4[previousIntegerLocal1] = integerArgument3 - integerArgument2 | integerArgument2 - (integerArgument2 >>> 8);
            }
          }
          integerArgument8 = integerArgument8 + integerArgument12;
          integerArgument6 = integerArgument6 + integerArgument13;
        }
    }

    private final static void performAction0286(int[] integerArrayArgument1, int[] integerArrayArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        for (integerLocal1 = -integerArgument6; integerLocal1 < 0; integerLocal1++) {
          integerLocal2 = integerArgument4 + integerArgument5 - 3;
          while (integerArgument4 < integerLocal2) {
            integerArrayArgument1[integerArgument4++] = integerArrayArgument2[integerArgument3++];
            integerArrayArgument1[integerArgument4++] = integerArrayArgument2[integerArgument3++];
            integerArrayArgument1[integerArgument4++] = integerArrayArgument2[integerArgument3++];
            integerArrayArgument1[integerArgument4++] = integerArrayArgument2[integerArgument3++];
          }
          integerLocal2 += 3;
          while (integerArgument4 < integerLocal2) {
            integerArrayArgument1[integerArgument4++] = integerArrayArgument2[integerArgument3++];
          }
          integerArgument4 = integerArgument4 + integerArgument7;
          integerArgument3 = integerArgument3 + integerArgument8;
        }
    }

    private final static void performAction0284(int integerArgument1, int[] integerArrayArgument2, int[] integerArrayArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int previousIntegerLocal3 = 0;
        int integerLocal4;
        int integerLocal5;
        int integerLocal6;
        for (integerLocal1 = -integerArgument8; integerLocal1 < 0; integerLocal1++) {
          for (integerLocal2 = -integerArgument7; integerLocal2 < 0; integerLocal2++) {
            integerArgument4 = integerArrayArgument3[integerArgument5++];
            if (integerArgument4 != 0) {
              integerArgument1 = integerArrayArgument2[integerArgument6];
              if (integerArgument1 != 0) {
                integerLocal4 = ((integerArgument4 & 16711680) >>> 16) * ((integerArgument1 & 16711680) >>> 16) >>> 8;
                integerLocal5 = (integerArgument4 & 65280) * (integerArgument1 & 65280) >>> 24;
                integerLocal6 = (integerArgument4 & 255) * (integerArgument1 & 255) >>> 8;
                previousIntegerLocal3 = integerArgument6;
                integerArgument6++;
                integerArrayArgument2[previousIntegerLocal3] = (integerLocal4 << 16) + (integerLocal5 << 8) + integerLocal6;
              } else {
                integerArgument6++;
              }
            } else {
              integerArgument6++;
            }
          }
          integerArgument6 = integerArgument6 + integerArgument9;
          integerArgument5 = integerArgument5 + integerArgument10;
        }
    }

    void performAction0279(int integerArgument1, int integerArgument2, int integerArgument3) {
        int integerLocal1 = 0;
        int integerLocal2;
        int integerLocal3;
        integerArgument1 = integerArgument1 + this.integerState0259;
        integerArgument2 = integerArgument2 + this.integerState0256;
        int integerLocal4 = integerArgument1 + integerArgument2 * SoftwareRaster.integerState0285;
        int integerLocal5 = 0;
        int integerLocal6 = this.integerState0255;
        int integerLocal7 = this.integerState0258;
        int integerLocal8 = SoftwareRaster.integerState0285 - integerLocal7;
        int integerLocal9 = 0;
        if (integerArgument2 < SoftwareRaster.integerState0280) {
          integerLocal1 = SoftwareRaster.integerState0280 - integerArgument2;
          integerLocal6 = integerLocal6 - integerLocal1;
          integerArgument2 = SoftwareRaster.integerState0280;
          integerLocal5 = integerLocal5 + integerLocal1 * integerLocal7;
          integerLocal4 = integerLocal4 + integerLocal1 * SoftwareRaster.integerState0285;
        }
        if (integerArgument2 + integerLocal6 > SoftwareRaster.integerState0283) {
          integerLocal6 = integerLocal6 - (integerArgument2 + integerLocal6 - SoftwareRaster.integerState0283);
        }
        if (integerArgument1 < SoftwareRaster.integerState0282) {
          integerLocal2 = SoftwareRaster.integerState0282 - integerArgument1;
          integerLocal7 = integerLocal7 - integerLocal2;
          integerArgument1 = SoftwareRaster.integerState0282;
          integerLocal5 = integerLocal5 + integerLocal2;
          integerLocal4 = integerLocal4 + integerLocal2;
          integerLocal9 = integerLocal9 + integerLocal2;
          integerLocal8 = integerLocal8 + integerLocal2;
        }
        if (integerArgument1 + integerLocal7 > SoftwareRaster.integerState0281) {
          integerLocal3 = integerArgument1 + integerLocal7 - SoftwareRaster.integerState0281;
          integerLocal7 = integerLocal7 - integerLocal3;
          integerLocal9 = integerLocal9 + integerLocal3;
          integerLocal8 = integerLocal8 + integerLocal3;
        }
        if (integerLocal7 > 0) {
          if (integerLocal6 <= 0) {
            return;
          }
          RgbSprite.performAction0296(SoftwareRaster.integerArrayState0063, this.integerArrayState0024, 0, integerLocal5, integerLocal4, integerLocal7, integerLocal6, integerLocal8, integerLocal9, integerArgument3);
          return;
        }
    }

    final void performAction0280(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
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
        int integerLocal28;
        int integerLocal29;
        if (integerArgument3 <= this.integerState0254 &&
          integerArgument4 <= this.integerState0260) {
          integerLocal4 = integerArgument1 + this.integerState0259 * integerArgument3 / this.integerState0254;
          integerLocal5 = integerArgument1 + ((this.integerState0259 + this.integerState0258) * integerArgument3 + this.integerState0254 - 1) / this.integerState0254;
          integerLocal6 = integerArgument2 + this.integerState0256 * integerArgument4 / this.integerState0260;
          integerLocal7 = integerArgument2 + ((this.integerState0256 + this.integerState0255) * integerArgument4 + this.integerState0260 - 1) / this.integerState0260;
          if (integerLocal4 < SoftwareRaster.integerState0282) {
            integerLocal4 = SoftwareRaster.integerState0282;
          }
          if (integerLocal5 > SoftwareRaster.integerState0281) {
            integerLocal5 = SoftwareRaster.integerState0281;
          }
          if (integerLocal6 < SoftwareRaster.integerState0280) {
            integerLocal6 = SoftwareRaster.integerState0280;
          }
          if (integerLocal7 > SoftwareRaster.integerState0283) {
            integerLocal7 = SoftwareRaster.integerState0283;
          }
          if (integerLocal4 >= integerLocal5) {
            return;
          }
          if (integerLocal6 >= integerLocal7) {
            return;
          }
          integerLocal8 = integerLocal6 * SoftwareRaster.integerState0285 + integerLocal4;
          integerLocal9 = SoftwareRaster.integerState0285 - (integerLocal5 - integerLocal4);
          for (integerLocal1 = integerLocal6; integerLocal1 < integerLocal7; integerLocal1++) {
            for (integerLocal2 = integerLocal4; integerLocal2 < integerLocal5; integerLocal2++) {
              integerLocal10 = integerLocal2 - integerArgument1 << 4;
              integerLocal11 = integerLocal1 - integerArgument2 << 4;
              integerLocal12 = integerLocal10 * this.integerState0254 / integerArgument3 - (this.integerState0259 << 4);
              integerLocal13 = (integerLocal10 + 16) * this.integerState0254 / integerArgument3 - (this.integerState0259 << 4);
              integerLocal14 = integerLocal11 * this.integerState0260 / integerArgument4 - (this.integerState0256 << 4);
              integerLocal15 = (integerLocal11 + 16) * this.integerState0260 / integerArgument4 - (this.integerState0256 << 4);
              integerLocal16 = (integerLocal13 - integerLocal12) * (integerLocal15 - integerLocal14) >> 1;
              if (integerLocal16 != 0) {
                if (integerLocal12 < 0) {
                  integerLocal12 = 0;
                }
                if (integerLocal13 > this.integerState0258 << 4) {
                  integerLocal13 = this.integerState0258 << 4;
                }
                if (integerLocal14 < 0) {
                  integerLocal14 = 0;
                }
                if (integerLocal15 > this.integerState0255 << 4) {
                  integerLocal15 = this.integerState0255 << 4;
                }
                integerLocal13--;
                integerLocal15--;
                integerLocal17 = 16 - (integerLocal12 & 15);
                integerLocal18 = (integerLocal13 & 15) + 1;
                integerLocal19 = 16 - (integerLocal14 & 15);
                integerLocal20 = (integerLocal15 & 15) + 1;
                integerLocal12 = integerLocal12 >> 4;
                integerLocal13 = integerLocal13 >> 4;
                integerLocal14 = integerLocal14 >> 4;
                integerLocal15 = integerLocal15 >> 4;
                integerLocal21 = 0;
                integerLocal22 = 0;
                integerLocal23 = 0;
                integerLocal24 = 0;
                for (integerLocal25 = integerLocal14; integerLocal25 <= integerLocal15; integerLocal25++) {
                  integerLocal26 = 16;
                  if (integerLocal25 == integerLocal14) {
                    integerLocal26 = integerLocal19;
                  }
                  if (integerLocal25 == integerLocal15) {
                    integerLocal26 = integerLocal20;
                  }
                  for (integerLocal3 = integerLocal12; integerLocal3 <= integerLocal13; integerLocal3++) {
                    integerLocal27 = this.integerArrayState0024[integerLocal25 * this.integerState0258 + integerLocal3];
                    if (integerLocal27 != 0) {
                      integerLocal28 = integerLocal26;
                      if (integerLocal3 != integerLocal12) {
                        if (integerLocal3 != integerLocal13) {
                          integerLocal28 = integerLocal28 << 4;
                        } else {
                          integerLocal28 = integerLocal28 * integerLocal18;
                        }
                      } else {
                        integerLocal28 = integerLocal28 * integerLocal17;
                      }
                      integerLocal24 = integerLocal24 + integerLocal28;
                      integerLocal21 = integerLocal21 + (integerLocal27 >> 16 & 255) * integerLocal28;
                      integerLocal22 = integerLocal22 + (integerLocal27 >> 8 & 255) * integerLocal28;
                      integerLocal23 = integerLocal23 + (integerLocal27 & 255) * integerLocal28;
                    }
                  }
                }
                if (integerLocal24 >= integerLocal16) {
                  integerLocal29 = (integerLocal21 / integerLocal24 << 16) + (integerLocal22 / integerLocal24 << 8) + integerLocal23 / integerLocal24;
                  if (integerLocal29 == 0) {
                    integerLocal29 = 1;
                  }
                  SoftwareRaster.integerArrayState0063[integerLocal8] = integerLocal29;
                }
                integerLocal8++;
              }
            }
            integerLocal8 = integerLocal8 + integerLocal9;
          }
          return;
        }
        throw new IllegalArgumentException();
    }

    void performAction0294(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        int integerLocal6 = 0;
        int integerLocal7 = 0;
        int integerLocal8 = 0;
        int integerLocal9 = 0;
        int integerLocal10 = 0;
        int integerLocal11 = 0;
        int integerLocal12;
        int integerLocal13;
        int integerLocal14;
        int integerLocal15;
        if (integerArgument3 > 0) {
          if (integerArgument4 <= 0) {
            return;
          }
          integerLocal1 = this.integerState0258;
          integerLocal2 = this.integerState0255;
          integerLocal3 = 0;
          integerLocal4 = 0;
          integerLocal5 = this.integerState0254;
          integerLocal6 = this.integerState0260;
          integerLocal7 = (integerLocal5 << 16) / integerArgument3;
          integerLocal8 = (integerLocal6 << 16) / integerArgument4;
          if (this.integerState0259 > 0) {
            integerLocal10 = ((this.integerState0259 << 16) + integerLocal7 - 1) / integerLocal7;
            integerArgument1 = integerArgument1 + integerLocal10;
            integerLocal3 = integerLocal3 + (integerLocal10 * integerLocal7 - (this.integerState0259 << 16));
          }
          if (this.integerState0256 > 0) {
            integerLocal12 = ((this.integerState0256 << 16) + integerLocal8 - 1) / integerLocal8;
            integerArgument2 = integerArgument2 + integerLocal12;
            integerLocal4 = integerLocal4 + (integerLocal12 * integerLocal8 - (this.integerState0256 << 16));
          }
          if (integerLocal1 < integerLocal5) {
            integerArgument3 = ((integerLocal1 << 16) - integerLocal3 + integerLocal7 - 1) / integerLocal7;
          }
          if (integerLocal2 < integerLocal6) {
            integerArgument4 = ((integerLocal2 << 16) - integerLocal4 + integerLocal8 - 1) / integerLocal8;
          }
          integerLocal13 = integerArgument1 + integerArgument2 * SoftwareRaster.integerState0285;
          integerLocal9 = SoftwareRaster.integerState0285 - integerArgument3;
          if (integerArgument2 + integerArgument4 > SoftwareRaster.integerState0283) {
            integerArgument4 = integerArgument4 - (integerArgument2 + integerArgument4 - SoftwareRaster.integerState0283);
          }
          if (integerArgument2 < SoftwareRaster.integerState0280) {
            integerLocal11 = SoftwareRaster.integerState0280 - integerArgument2;
            integerArgument4 = integerArgument4 - integerLocal11;
            integerLocal13 = integerLocal13 + integerLocal11 * SoftwareRaster.integerState0285;
            integerLocal4 = integerLocal4 + integerLocal8 * integerLocal11;
          }
          if (integerArgument1 + integerArgument3 > SoftwareRaster.integerState0281) {
            integerLocal14 = integerArgument1 + integerArgument3 - SoftwareRaster.integerState0281;
            integerArgument3 = integerArgument3 - integerLocal14;
            integerLocal9 = integerLocal9 + integerLocal14;
          }
          if (integerArgument1 < SoftwareRaster.integerState0282) {
            integerLocal15 = SoftwareRaster.integerState0282 - integerArgument1;
            integerArgument3 = integerArgument3 - integerLocal15;
            integerLocal13 = integerLocal13 + integerLocal15;
            integerLocal3 = integerLocal3 + integerLocal7 * integerLocal15;
            integerLocal9 = integerLocal9 + integerLocal15;
          }
          RgbSprite.performAction0298(SoftwareRaster.integerArrayState0063, this.integerArrayState0024, 0, integerLocal3, integerLocal4, integerLocal13, integerLocal9, integerArgument3, integerArgument4, integerLocal7, integerLocal8, integerLocal1, integerArgument5);
          return;
        }
    }

    private final static void performAction0290(int[] integerArrayArgument1, int[] integerArrayArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10, int integerArgument11, int integerArgument12, int integerArgument13) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        int previousIntegerLocal5 = 0;
        int integerLocal6 = 0;
        int integerLocal7 = integerArgument4;
        for (integerLocal1 = -integerArgument9; integerLocal1 < 0; integerLocal1++) {
          integerLocal2 = (integerArgument5 >> 16) * integerArgument12;
          for (integerLocal3 = -integerArgument8; integerLocal3 < 0; integerLocal3++) {
            integerArgument3 = integerArrayArgument2[(integerArgument4 >> 16) + integerLocal2];
            if (integerArgument3 != 0) {
              integerLocal6 = (integerArgument3 & 16711935) * integerArgument13 & -16711936;
              integerLocal4 = (integerArgument3 & 65280) * integerArgument13 & 16711680;
              previousIntegerLocal5 = integerArgument6;
              integerArgument6++;
              integerArrayArgument1[previousIntegerLocal5] = (integerLocal6 | integerLocal4) >>> 8;
            } else {
              integerArgument6++;
            }
            integerArgument4 = integerArgument4 + integerArgument10;
          }
          integerArgument5 = integerArgument5 + integerArgument11;
          integerArgument4 = integerLocal7;
          integerArgument6 = integerArgument6 + integerArgument7;
        }
    }

    RgbSprite(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int[] integerArrayArgument7) {
        this.integerState0254 = integerArgument1;
        this.integerState0260 = integerArgument2;
        this.integerState0259 = integerArgument3;
        this.integerState0256 = integerArgument4;
        this.integerState0258 = integerArgument5;
        this.integerState0255 = integerArgument6;
        this.integerArrayState0024 = integerArrayArgument7;
    }

    private final static void performAction0288(int[] integerArrayArgument1, int[] integerArrayArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int previousIntegerLocal3 = 0;
        int integerLocal4;
        int integerLocal5;
        integerLocal4 = 256 - integerArgument10;
        for (integerLocal1 = -integerArgument7; integerLocal1 < 0; integerLocal1++) {
          for (integerLocal2 = -integerArgument6; integerLocal2 < 0; integerLocal2++) {
            integerArgument3 = integerArrayArgument2[integerArgument4++];
            if (integerArgument3 == 0) {
              integerArgument5++;
            } else {
              integerLocal5 = integerArrayArgument1[integerArgument5];
              previousIntegerLocal3 = integerArgument5;
              integerArgument5++;
              integerArrayArgument1[previousIntegerLocal3] = ((integerArgument3 & 16711935) * integerArgument10 + (integerLocal5 & 16711935) * integerLocal4 & -16711936) + ((integerArgument3 & 65280) * integerArgument10 + (integerLocal5 & 65280) * integerLocal4 & 16711680) >> 8;
            }
          }
          integerArgument5 = integerArgument5 + integerArgument8;
          integerArgument4 = integerArgument4 + integerArgument9;
        }
    }

    RgbSprite(int integerArgument1, int integerArgument2) {
        this.integerArrayState0024 = new int[integerArgument1 * integerArgument2];
        this.integerState0254 = integerArgument1;
        this.integerState0258 = integerArgument1;
        this.integerState0260 = integerArgument2;
        this.integerState0255 = integerArgument2;
        this.integerState0256 = 0;
        this.integerState0259 = 0;
    }

    void performAction0301(int integerArgument1, int integerArgument2, int integerArgument3) {
        int integerLocal1 = 0;
        int integerLocal2;
        int integerLocal3;
        integerArgument1 = integerArgument1 + this.integerState0259;
        integerArgument2 = integerArgument2 + this.integerState0256;
        int integerLocal4 = integerArgument1 + integerArgument2 * SoftwareRaster.integerState0285;
        int integerLocal5 = 0;
        int integerLocal6 = this.integerState0255;
        int integerLocal7 = this.integerState0258;
        int integerLocal8 = SoftwareRaster.integerState0285 - integerLocal7;
        int integerLocal9 = 0;
        if (integerArgument2 < SoftwareRaster.integerState0280) {
          integerLocal1 = SoftwareRaster.integerState0280 - integerArgument2;
          integerLocal6 = integerLocal6 - integerLocal1;
          integerArgument2 = SoftwareRaster.integerState0280;
          integerLocal5 = integerLocal5 + integerLocal1 * integerLocal7;
          integerLocal4 = integerLocal4 + integerLocal1 * SoftwareRaster.integerState0285;
        }
        if (integerArgument2 + integerLocal6 > SoftwareRaster.integerState0283) {
          integerLocal6 = integerLocal6 - (integerArgument2 + integerLocal6 - SoftwareRaster.integerState0283);
        }
        if (integerArgument1 < SoftwareRaster.integerState0282) {
          integerLocal2 = SoftwareRaster.integerState0282 - integerArgument1;
          integerLocal7 = integerLocal7 - integerLocal2;
          integerArgument1 = SoftwareRaster.integerState0282;
          integerLocal5 = integerLocal5 + integerLocal2;
          integerLocal4 = integerLocal4 + integerLocal2;
          integerLocal9 = integerLocal9 + integerLocal2;
          integerLocal8 = integerLocal8 + integerLocal2;
        }
        if (integerArgument1 + integerLocal7 > SoftwareRaster.integerState0281) {
          integerLocal3 = integerArgument1 + integerLocal7 - SoftwareRaster.integerState0281;
          integerLocal7 = integerLocal7 - integerLocal3;
          integerLocal9 = integerLocal9 + integerLocal3;
          integerLocal8 = integerLocal8 + integerLocal3;
        }
        if (integerLocal7 > 0) {
          if (integerLocal6 <= 0) {
            return;
          }
          RgbSprite.performAction0288(SoftwareRaster.integerArrayState0063, this.integerArrayState0024, 0, integerLocal5, integerLocal4, integerLocal7, integerLocal6, integerLocal8, integerLocal9, integerArgument3);
          return;
        }
    }

    RgbSprite(byte[] byteArrayArgument1, java.awt.Component componentArgument2) {
        Throwable caughtExceptionLocal1 = null;
        java.awt.Image imageLocal2 = null;
        InterruptedException interruptedExceptionLocal3 = null;
        java.awt.MediaTracker mediaTrackerLocal4 = null;
        java.awt.image.PixelGrabber pixelGrabberLocal5 = null;
        try {
          imageLocal2 = java.awt.Toolkit.getDefaultToolkit().createImage(byteArrayArgument1);
          mediaTrackerLocal4 = new java.awt.MediaTracker(componentArgument2);
          mediaTrackerLocal4.addImage(imageLocal2, 0);
          mediaTrackerLocal4.waitForAll();
          this.integerState0258 = imageLocal2.getWidth((java.awt.image.ImageObserver) ((Object) componentArgument2));
          this.integerState0255 = imageLocal2.getHeight((java.awt.image.ImageObserver) ((Object) componentArgument2));
          this.integerState0254 = this.integerState0258;
          this.integerState0260 = this.integerState0255;
          this.integerState0259 = 0;
          this.integerState0256 = 0;
          this.integerArrayState0024 = new int[this.integerState0258 * this.integerState0255];
          pixelGrabberLocal5 = new java.awt.image.PixelGrabber(imageLocal2, 0, 0, this.integerState0258, this.integerState0255, this.integerArrayState0024, 0, this.integerState0258);
          pixelGrabberLocal5.grabPixels();
        } catch (java.lang.InterruptedException caughtParameterLocal6) {
          caughtExceptionLocal1 = caughtParameterLocal6;
          interruptedExceptionLocal3 = (InterruptedException) (Object) caughtExceptionLocal1;
        }
    }

    void performAction0310(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        int integerLocal6 = 0;
        int integerLocal7 = 0;
        int integerLocal8 = 0;
        int integerLocal9 = 0;
        int integerLocal10 = 0;
        int integerLocal11 = 0;
        int integerLocal12;
        int integerLocal13;
        int integerLocal14;
        int integerLocal15;
        if (integerArgument3 > 0) {
          if (integerArgument4 <= 0) {
            return;
          }
          if (integerArgument5 == 256) {
            this.performAction0302(integerArgument1, integerArgument2, integerArgument3, integerArgument4);
            return;
          }
          integerLocal1 = this.integerState0258;
          integerLocal2 = this.integerState0255;
          integerLocal3 = 0;
          integerLocal4 = 0;
          integerLocal5 = this.integerState0254;
          integerLocal6 = this.integerState0260;
          integerLocal7 = (integerLocal5 << 16) / integerArgument3;
          integerLocal8 = (integerLocal6 << 16) / integerArgument4;
          if (this.integerState0259 > 0) {
            integerLocal10 = ((this.integerState0259 << 16) + integerLocal7 - 1) / integerLocal7;
            integerArgument1 = integerArgument1 + integerLocal10;
            integerLocal3 = integerLocal3 + (integerLocal10 * integerLocal7 - (this.integerState0259 << 16));
          }
          if (this.integerState0256 > 0) {
            integerLocal12 = ((this.integerState0256 << 16) + integerLocal8 - 1) / integerLocal8;
            integerArgument2 = integerArgument2 + integerLocal12;
            integerLocal4 = integerLocal4 + (integerLocal12 * integerLocal8 - (this.integerState0256 << 16));
          }
          if (integerLocal1 < integerLocal5) {
            integerArgument3 = ((integerLocal1 << 16) - integerLocal3 + integerLocal7 - 1) / integerLocal7;
          }
          if (integerLocal2 < integerLocal6) {
            integerArgument4 = ((integerLocal2 << 16) - integerLocal4 + integerLocal8 - 1) / integerLocal8;
          }
          integerLocal13 = integerArgument1 + integerArgument2 * SoftwareRaster.integerState0285;
          integerLocal9 = SoftwareRaster.integerState0285 - integerArgument3;
          if (integerArgument2 + integerArgument4 > SoftwareRaster.integerState0283) {
            integerArgument4 = integerArgument4 - (integerArgument2 + integerArgument4 - SoftwareRaster.integerState0283);
          }
          if (integerArgument2 < SoftwareRaster.integerState0280) {
            integerLocal11 = SoftwareRaster.integerState0280 - integerArgument2;
            integerArgument4 = integerArgument4 - integerLocal11;
            integerLocal13 = integerLocal13 + integerLocal11 * SoftwareRaster.integerState0285;
            integerLocal4 = integerLocal4 + integerLocal8 * integerLocal11;
          }
          if (integerArgument1 + integerArgument3 > SoftwareRaster.integerState0281) {
            integerLocal14 = integerArgument1 + integerArgument3 - SoftwareRaster.integerState0281;
            integerArgument3 = integerArgument3 - integerLocal14;
            integerLocal9 = integerLocal9 + integerLocal14;
          }
          if (integerArgument1 < SoftwareRaster.integerState0282) {
            integerLocal15 = SoftwareRaster.integerState0282 - integerArgument1;
            integerArgument3 = integerArgument3 - integerLocal15;
            integerLocal13 = integerLocal13 + integerLocal15;
            integerLocal3 = integerLocal3 + integerLocal7 * integerLocal15;
            integerLocal9 = integerLocal9 + integerLocal15;
          }
          RgbSprite.performAction0290(SoftwareRaster.integerArrayState0063, this.integerArrayState0024, 0, integerLocal3, integerLocal4, integerLocal13, integerLocal9, integerArgument3, integerArgument4, integerLocal7, integerLocal8, integerLocal1, integerArgument5);
          return;
        }
    }

    void performAction0302(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        int integerLocal6 = 0;
        int integerLocal7 = 0;
        int integerLocal8 = 0;
        int integerLocal9 = 0;
        int integerLocal10 = 0;
        int integerLocal11 = 0;
        int integerLocal12;
        int integerLocal13;
        int integerLocal14;
        int integerLocal15;
        if (integerArgument3 > 0) {
          if (integerArgument4 <= 0) {
            return;
          }
          integerLocal1 = this.integerState0258;
          integerLocal2 = this.integerState0255;
          integerLocal3 = 0;
          integerLocal4 = 0;
          integerLocal5 = this.integerState0254;
          integerLocal6 = this.integerState0260;
          integerLocal7 = (integerLocal5 << 16) / integerArgument3;
          integerLocal8 = (integerLocal6 << 16) / integerArgument4;
          if (this.integerState0259 > 0) {
            integerLocal10 = ((this.integerState0259 << 16) + integerLocal7 - 1) / integerLocal7;
            integerArgument1 = integerArgument1 + integerLocal10;
            integerLocal3 = integerLocal3 + (integerLocal10 * integerLocal7 - (this.integerState0259 << 16));
          }
          if (this.integerState0256 > 0) {
            integerLocal12 = ((this.integerState0256 << 16) + integerLocal8 - 1) / integerLocal8;
            integerArgument2 = integerArgument2 + integerLocal12;
            integerLocal4 = integerLocal4 + (integerLocal12 * integerLocal8 - (this.integerState0256 << 16));
          }
          if (integerLocal1 < integerLocal5) {
            integerArgument3 = ((integerLocal1 << 16) - integerLocal3 + integerLocal7 - 1) / integerLocal7;
          }
          if (integerLocal2 < integerLocal6) {
            integerArgument4 = ((integerLocal2 << 16) - integerLocal4 + integerLocal8 - 1) / integerLocal8;
          }
          integerLocal13 = integerArgument1 + integerArgument2 * SoftwareRaster.integerState0285;
          integerLocal9 = SoftwareRaster.integerState0285 - integerArgument3;
          if (integerArgument2 + integerArgument4 > SoftwareRaster.integerState0283) {
            integerArgument4 = integerArgument4 - (integerArgument2 + integerArgument4 - SoftwareRaster.integerState0283);
          }
          if (integerArgument2 < SoftwareRaster.integerState0280) {
            integerLocal11 = SoftwareRaster.integerState0280 - integerArgument2;
            integerArgument4 = integerArgument4 - integerLocal11;
            integerLocal13 = integerLocal13 + integerLocal11 * SoftwareRaster.integerState0285;
            integerLocal4 = integerLocal4 + integerLocal8 * integerLocal11;
          }
          if (integerArgument1 + integerArgument3 > SoftwareRaster.integerState0281) {
            integerLocal14 = integerArgument1 + integerArgument3 - SoftwareRaster.integerState0281;
            integerArgument3 = integerArgument3 - integerLocal14;
            integerLocal9 = integerLocal9 + integerLocal14;
          }
          if (integerArgument1 < SoftwareRaster.integerState0282) {
            integerLocal15 = SoftwareRaster.integerState0282 - integerArgument1;
            integerArgument3 = integerArgument3 - integerLocal15;
            integerLocal13 = integerLocal13 + integerLocal15;
            integerLocal3 = integerLocal3 + integerLocal7 * integerLocal15;
            integerLocal9 = integerLocal9 + integerLocal15;
          }
          RgbSprite.performAction0289(SoftwareRaster.integerArrayState0063, this.integerArrayState0024, 0, integerLocal3, integerLocal4, integerLocal13, integerLocal9, integerArgument3, integerArgument4, integerLocal7, integerLocal8, integerLocal1);
          return;
        }
    }
}
