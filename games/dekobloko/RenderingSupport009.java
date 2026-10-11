/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RenderingSupport009 extends RgbSprite {
    private final static void performAction1062(int[] integerArrayArgument1, int[] integerArrayArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10, int integerArgument11, int integerArgument12, int integerArgument13) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        int integerLocal6 = 0;
        int integerLocal7 = 0;
        int previousIntegerLocal8 = 0;
        int integerLocal9 = 0;
        int integerLocal10 = integerArgument4;
        for (integerLocal1 = -integerArgument9; integerLocal1 < 0; integerLocal1++) {
          integerLocal2 = (integerArgument5 >> 16) * integerArgument12;
          for (integerLocal3 = -integerArgument8; integerLocal3 < 0; integerLocal3++) {
            integerArgument3 = integerArrayArgument2[(integerArgument4 >> 16) + integerLocal2];
            integerLocal4 = integerArgument3 >>> 24;
            if (integerLocal4 != 0) {
              integerLocal9 = integerArrayArgument1[integerArgument6];
              integerLocal5 = 256 - integerLocal4;
              integerLocal6 = (integerArgument3 & 16711935) * integerArgument13 & -16711936;
              integerLocal7 = (integerArgument3 & 65280) * integerArgument13 & 16711680;
              integerArgument3 = (integerLocal6 | integerLocal7) >>> 8;
              previousIntegerLocal8 = integerArgument6;
              integerArgument6++;
              integerArrayArgument1[previousIntegerLocal8] = ((integerArgument3 & 16711935) * integerLocal4 + (integerLocal9 & 16711935) * integerLocal5 & -16711936) + ((integerArgument3 & 65280) * integerLocal4 + (integerLocal9 & 65280) * integerLocal5 & 16711680) >>> 8;
            } else {
              integerArgument6++;
            }
            integerArgument4 = integerArgument4 + integerArgument10;
          }
          integerArgument5 = integerArgument5 + integerArgument11;
          integerArgument4 = integerLocal10;
          integerArgument6 = integerArgument6 + integerArgument7;
        }
    }

    private final static void performAction1064(int[] integerArrayArgument1, int[] integerArrayArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10, int integerArgument11, int integerArgument12, int integerArgument13) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        int integerLocal6 = 0;
        int integerLocal7 = 0;
        int previousIntegerLocal8 = 0;
        int integerLocal9 = integerArgument4;
        for (integerLocal1 = -integerArgument9; integerLocal1 < 0; integerLocal1++) {
          integerLocal2 = (integerArgument5 >> 16) * integerArgument12;
          for (integerLocal3 = -integerArgument8; integerLocal3 < 0; integerLocal3++) {
            integerLocal4 = integerArrayArgument2[(integerArgument4 >> 16) + integerLocal2];
            integerLocal5 = integerArrayArgument1[integerArgument6];
            integerLocal6 = (integerLocal4 >>> 24) * integerArgument13 >> 8;
            integerLocal7 = 256 - integerLocal6;
            previousIntegerLocal8 = integerArgument6;
            integerArgument6++;
            integerArrayArgument1[previousIntegerLocal8] = ((integerLocal4 & 16711935) * integerLocal6 + (integerLocal5 & 16711935) * integerLocal7 & -16711936) + ((integerLocal4 & 65280) * integerLocal6 + (integerLocal5 & 65280) * integerLocal7 & 16711680) >>> 8;
            integerArgument4 = integerArgument4 + integerArgument10;
          }
          integerArgument5 = integerArgument5 + integerArgument11;
          integerArgument4 = integerLocal9;
          integerArgument6 = integerArgument6 + integerArgument7;
        }
    }

    private final static void performAction1061(int[] integerArrayArgument1, int[] integerArrayArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10, int integerArgument11, int integerArgument12) {
        int previousIntegerLocal1 = 0;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        int integerLocal6;
        int integerLocal7;
        int integerLocal8;
        integerLocal2 = integerArgument12 & 16711935;
        integerLocal3 = integerArgument12 >> 8 & 255;
        for (integerArgument7 = -integerArgument9; integerArgument7 < 0; integerArgument7++) {
          for (integerArgument6 = -integerArgument8; integerArgument6 < 0; integerArgument6++) {
            integerArgument3 = integerArrayArgument2[integerArgument4++];
            integerLocal4 = integerArgument3 >>> 24;
            integerArgument3 = integerArgument3 & 16777215;
            if (integerLocal4 == 0) {
              integerArgument5++;
            } else {
              integerLocal5 = 0;
              if (integerArgument3 >> 8 != (integerArgument3 & 65535)) {
                integerLocal8 = integerArgument3;
              } else {
                integerArgument3 = integerArgument3 & 255;
                integerLocal8 = (integerArgument3 * integerLocal2 >> 8 & 16711934) + (integerArgument3 * integerLocal3 & 65280) + 1;
              }
              integerLocal6 = 256 - integerLocal4;
              integerLocal7 = integerArrayArgument1[integerArgument5];
              previousIntegerLocal1 = integerArgument5;
              integerArgument5++;
              integerArrayArgument1[previousIntegerLocal1] = ((integerLocal8 & 16711935) * integerLocal4 + (integerLocal7 & 16711935) * integerLocal6 & -16711936) + ((integerLocal8 & 65280) * integerLocal4 + (integerLocal7 & 65280) * integerLocal6 & 16711680) >>> 8;
            }
          }
          integerArgument5 = integerArgument5 + integerArgument10;
          integerArgument4 = integerArgument4 + integerArgument11;
        }
    }

    final void performAction0307(int integerArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        int stackIntegerLocal2 = 0;
        int stackIntegerLocal3 = 0;
        int stackIntegerLocal4 = 0;
        int stackIntegerLocal5 = 0;
        int[] stackIntegerArrayLocal6 = null;
        int stackIntegerLocal7 = 0;
        int stackIntegerLocal8 = 0;
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
        integerLocal9 = this.integerState0258 >> 1;
        integerLocal10 = this.integerState0255 >> 1;
        integerArgument1 = integerArgument1 + this.integerState0259 / 2;
        integerArgument2 = integerArgument2 + this.integerState0256 / 2;
        if (integerArgument1 >= SoftwareRaster.integerState0282) {
          stackIntegerLocal2 = 0;
        } else {
          stackIntegerLocal2 = SoftwareRaster.integerState0282 - integerArgument1 << 1;
        }
        integerLocal11 = stackIntegerLocal2;
        if (integerArgument1 + integerLocal9 <= SoftwareRaster.integerState0281) {
          stackIntegerLocal3 = this.integerState0258 - 2;
        } else {
          stackIntegerLocal3 = (SoftwareRaster.integerState0281 - integerArgument1 << 1) - 2;
        }
        integerLocal12 = stackIntegerLocal3;
        if (integerArgument2 >= SoftwareRaster.integerState0280) {
          stackIntegerLocal4 = 0;
        } else {
          stackIntegerLocal4 = SoftwareRaster.integerState0280 - integerArgument2 << 1;
        }
        integerLocal13 = stackIntegerLocal4;
        if (integerArgument2 + integerLocal10 <= SoftwareRaster.integerState0283) {
          stackIntegerLocal5 = this.integerState0255 - 2;
        } else {
          stackIntegerLocal5 = (SoftwareRaster.integerState0283 - integerArgument2 << 1) - 2;
        }
        integerLocal14 = stackIntegerLocal5;
        for (integerLocal1 = integerLocal13; integerLocal1 <= integerLocal14; integerLocal1 += 2) {
          integerLocal15 = integerLocal1 * this.integerState0258 + integerLocal11;
          integerLocal16 = (integerArgument2 + (integerLocal1 >> 1)) * SoftwareRaster.integerState0285 + (integerArgument1 + (integerLocal11 >> 1));
          integerLocal17 = integerLocal11;
          while (integerLocal17 <= integerLocal12) {
            integerLocal18 = 0;
            integerLocal19 = 0;
            integerLocal20 = 0;
            integerLocal21 = 0;
            integerLocal22 = 0;
            integerLocal23 = 0;
            for (integerLocal24 = 0; integerLocal24 < 4; integerLocal24++) {
              stackIntegerArrayLocal6 = this.integerArrayState0024;
              stackIntegerLocal7 = integerLocal15 + (integerLocal24 & 1);
              if ((integerLocal24 & 2) != 0) {
                stackIntegerLocal8 = 0;
              } else {
                stackIntegerLocal8 = this.integerState0258;
              }
              integerLocal27 = stackIntegerArrayLocal6[stackIntegerLocal7 + stackIntegerLocal8];
              integerLocal28 = integerLocal27 >>> 24;
              integerLocal23 = integerLocal23 + integerLocal28;
              integerLocal20 = integerLocal20 + integerLocal28 * (integerLocal27 >> 16 & 255);
              integerLocal21 = integerLocal21 + integerLocal28 * (integerLocal27 >> 8 & 255);
              integerLocal22 = integerLocal22 + integerLocal28 * (integerLocal27 & 255);
            }
            if (integerLocal23 != 0) {
              integerLocal20 = (integerLocal20 / integerLocal23 << 16) + integerLocal22 / integerLocal23;
              integerLocal21 = integerLocal21 / integerLocal23 << 8;
              integerLocal29 = integerLocal23 >> 2;
              integerLocal25 = 256 - integerLocal29;
              integerLocal26 = SoftwareRaster.integerArrayState0063[integerLocal16];
              SoftwareRaster.integerArrayState0063[integerLocal16] = (integerLocal29 * integerLocal20 + integerLocal25 * (integerLocal26 & 16711935) & -16711936) + (integerLocal29 * integerLocal21 + integerLocal25 * (integerLocal26 & 65280) & 16711680) >>> 8;
            }
            integerLocal17 += 2;
            integerLocal16++;
            integerLocal15 += 2;
          }
        }
    }

    private final static void performAction1060(int[] integerArrayArgument1, int[] integerArrayArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        int integerLocal6 = 0;
        int previousIntegerLocal7 = 0;
        for (integerLocal1 = -integerArgument7; integerLocal1 < 0; integerLocal1++) {
          for (integerLocal2 = -integerArgument6; integerLocal2 < 0; integerLocal2++) {
            integerLocal3 = (integerArrayArgument2[integerArgument4] >>> 24) * integerArgument10 >> 8;
            integerLocal4 = 256 - integerLocal3;
            integerLocal5 = integerArrayArgument2[integerArgument4++];
            integerLocal6 = integerArrayArgument1[integerArgument5];
            previousIntegerLocal7 = integerArgument5;
            integerArgument5++;
            integerArrayArgument1[previousIntegerLocal7] = ((integerLocal5 & 16711935) * integerLocal3 + (integerLocal6 & 16711935) * integerLocal4 & -16711936) + ((integerLocal5 & 65280) * integerLocal3 + (integerLocal6 & 65280) * integerLocal4 & 16711680) >>> 8;
          }
          integerArgument5 = integerArgument5 + integerArgument8;
          integerArgument4 = integerArgument4 + integerArgument9;
        }
    }

    private final static void performAction1059(int[] integerArrayArgument1, int[] integerArrayArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10, int integerArgument11, int integerArgument12) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        int previousIntegerLocal6 = 0;
        int integerLocal7 = 0;
        int integerLocal8 = integerArgument4;
        for (integerLocal1 = -integerArgument9; integerLocal1 < 0; integerLocal1++) {
          integerLocal2 = (integerArgument5 >> 16) * integerArgument12;
          for (integerLocal3 = -integerArgument8; integerLocal3 < 0; integerLocal3++) {
            integerArgument3 = integerArrayArgument2[(integerArgument4 >> 16) + integerLocal2];
            integerLocal4 = integerArgument3 >>> 24;
            if (integerLocal4 != 0) {
              integerLocal7 = 256 - integerLocal4;
              integerLocal5 = integerArrayArgument1[integerArgument6];
              previousIntegerLocal6 = integerArgument6;
              integerArgument6++;
              integerArrayArgument1[previousIntegerLocal6] = ((integerArgument3 & 16711935) * integerLocal4 + (integerLocal5 & 16711935) * integerLocal7 & -16711936) + ((integerArgument3 & 65280) * integerLocal4 + (integerLocal5 & 65280) * integerLocal7 & 16711680) >>> 8;
            } else {
              integerArgument6++;
            }
            integerArgument4 = integerArgument4 + integerArgument10;
          }
          integerArgument5 = integerArgument5 + integerArgument11;
          integerArgument4 = integerLocal8;
          integerArgument6 = integerArgument6 + integerArgument7;
        }
    }

    RenderingSupport009(int integerArgument1, int integerArgument2) {
        super(integerArgument1, integerArgument2);
    }

    final void performAction0294(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        int integerLocal6;
        if (integerArgument3 <= 0 ||
          integerArgument4 <= 0) {
          return;
        }
        int integerLocal7 = this.integerState0258;
        int integerLocal8 = this.integerState0255;
        int integerLocal9 = 0;
        int integerLocal10 = 0;
        int integerLocal11 = this.integerState0254;
        int integerLocal12 = this.integerState0260;
        int integerLocal13 = (integerLocal11 << 16) / integerArgument3;
        int integerLocal14 = (integerLocal12 << 16) / integerArgument4;
        if (this.integerState0259 > 0) {
          integerLocal1 = ((this.integerState0259 << 16) + integerLocal13 - 1) / integerLocal13;
          integerArgument1 = integerArgument1 + integerLocal1;
          integerLocal9 = integerLocal9 + (integerLocal1 * integerLocal13 - (this.integerState0259 << 16));
        }
        if (this.integerState0256 > 0) {
          integerLocal3 = ((this.integerState0256 << 16) + integerLocal14 - 1) / integerLocal14;
          integerArgument2 = integerArgument2 + integerLocal3;
          integerLocal10 = integerLocal10 + (integerLocal3 * integerLocal14 - (this.integerState0256 << 16));
        }
        if (integerLocal7 < integerLocal11) {
          integerArgument3 = ((integerLocal7 << 16) - integerLocal9 + integerLocal13 - 1) / integerLocal13;
        }
        if (integerLocal8 < integerLocal12) {
          integerArgument4 = ((integerLocal8 << 16) - integerLocal10 + integerLocal14 - 1) / integerLocal14;
        }
        integerLocal4 = integerArgument1 + integerArgument2 * SoftwareRaster.integerState0285;
        int integerLocal15 = SoftwareRaster.integerState0285 - integerArgument3;
        if (integerArgument2 + integerArgument4 > SoftwareRaster.integerState0283) {
          integerArgument4 = integerArgument4 - (integerArgument2 + integerArgument4 - SoftwareRaster.integerState0283);
        }
        if (integerArgument2 < SoftwareRaster.integerState0280) {
          integerLocal2 = SoftwareRaster.integerState0280 - integerArgument2;
          integerArgument4 = integerArgument4 - integerLocal2;
          integerLocal4 = integerLocal4 + integerLocal2 * SoftwareRaster.integerState0285;
          integerLocal10 = integerLocal10 + integerLocal14 * integerLocal2;
        }
        if (integerArgument1 + integerArgument3 > SoftwareRaster.integerState0281) {
          integerLocal5 = integerArgument1 + integerArgument3 - SoftwareRaster.integerState0281;
          integerArgument3 = integerArgument3 - integerLocal5;
          integerLocal15 = integerLocal15 + integerLocal5;
        }
        if (integerArgument1 < SoftwareRaster.integerState0282) {
          integerLocal6 = SoftwareRaster.integerState0282 - integerArgument1;
          integerArgument3 = integerArgument3 - integerLocal6;
          integerLocal4 = integerLocal4 + integerLocal6;
          integerLocal9 = integerLocal9 + integerLocal13 * integerLocal6;
          integerLocal15 = integerLocal15 + integerLocal6;
        }
        RenderingSupport009.performAction1064(SoftwareRaster.integerArrayState0063, this.integerArrayState0024, 0, integerLocal9, integerLocal10, integerLocal4, integerLocal15, integerArgument3, integerArgument4, integerLocal13, integerLocal14, integerLocal7, integerArgument5);
    }

    RenderingSupport009(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int[] integerArrayArgument7) {
        super(integerArgument1, integerArgument2, integerArgument3, integerArgument4, integerArgument5, integerArgument6, integerArrayArgument7);
    }

    private final static void performAction1063(int[] integerArrayArgument1, int[] integerArrayArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int previousIntegerLocal3 = 0;
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
        integerLocal4 = integerArgument10 >> 16 & 255;
        integerLocal5 = integerArgument10 >> 8 & 255;
        integerLocal6 = integerArgument10 & 255;
        integerLocal7 = -(integerArgument6 >> 2);
        integerArgument6 = -(integerArgument6 & 3);
        integerLocal8 = integerLocal7 + integerLocal7 + integerLocal7 + integerLocal7 + integerArgument6;
        for (integerLocal1 = -integerArgument7; integerLocal1 < 0; integerLocal1++) {
          for (integerLocal2 = integerLocal8; integerLocal2 < 0; integerLocal2++) {
            integerArgument3 = integerArrayArgument2[integerArgument4++];
            integerLocal9 = integerArgument3 >>> 24;
            if (integerLocal9 == 0) {
              integerArgument5++;
            } else {
              integerLocal11 = integerArgument3 >> 16 & 255;
              integerLocal12 = integerArgument3 >> 8 & 255;
              integerLocal13 = integerArgument3 & 255;
              if (integerLocal11 == integerLocal12 &&
                integerLocal12 == integerLocal13) {
                if (integerLocal11 > 128) {
                  integerLocal10 = (integerLocal4 * (256 - integerLocal11) + 255 * (integerLocal11 - 128) >> 7 << 16) + (integerLocal5 * (256 - integerLocal12) + 255 * (integerLocal12 - 128) >> 7 << 8) + (integerLocal6 * (256 - integerLocal13) + 255 * (integerLocal13 - 128) >> 7);
                } else {
                  integerLocal10 = (integerLocal11 * integerLocal4 >> 7 << 16) + (integerLocal12 * integerLocal5 >> 7 << 8) + (integerLocal13 * integerLocal6 >> 7);
                }
              } else {
                integerLocal10 = integerArgument3;
              }
              integerLocal14 = 256 - integerLocal9;
              integerLocal15 = integerArrayArgument1[integerArgument5];
              previousIntegerLocal3 = integerArgument5;
              integerArgument5++;
              integerArrayArgument1[previousIntegerLocal3] = ((integerLocal10 & 16711935) * integerLocal9 + (integerLocal15 & 16711935) * integerLocal14 & -16711936) + ((integerLocal10 & 65280) * integerLocal9 + (integerLocal15 & 65280) * integerLocal14 & 16711680) >>> 8;
            }
          }
          integerArgument5 = integerArgument5 + integerArgument8;
          integerArgument4 = integerArgument4 + integerArgument9;
        }
    }

    final void performAction0313(int integerArgument1, int integerArgument2, int integerArgument3) {
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
        if (integerLocal7 <= 0 ||
          integerLocal6 <= 0) {
          return;
        }
        RenderingSupport009.performAction1065(SoftwareRaster.integerArrayState0063, this.integerArrayState0024, 0, integerLocal5, integerLocal4, integerLocal7, integerLocal6, integerLocal8, integerLocal9, integerArgument3);
    }

    final void performAction0279(int integerArgument1, int integerArgument2, int integerArgument3) {
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
        if (integerLocal7 <= 0 ||
          integerLocal6 <= 0) {
          return;
        }
        RenderingSupport009.performAction1063(SoftwareRaster.integerArrayState0063, this.integerArrayState0024, 0, integerLocal5, integerLocal4, integerLocal7, integerLocal6, integerLocal8, integerLocal9, integerArgument3);
    }

    final void performAction0301(int integerArgument1, int integerArgument2, int integerArgument3) {
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
        if (integerLocal7 <= 0 ||
          integerLocal6 <= 0) {
          return;
        }
        RenderingSupport009.performAction1060(SoftwareRaster.integerArrayState0063, this.integerArrayState0024, 0, integerLocal5, integerLocal4, integerLocal7, integerLocal6, integerLocal8, integerLocal9, integerArgument3);
    }

    private final static void performAction1065(int[] integerArrayArgument1, int[] integerArrayArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int previousIntegerLocal3 = 0;
        int integerLocal4;
        int integerLocal5;
        int integerLocal6;
        int integerLocal7;
        int integerLocal8;
        for (integerLocal1 = -integerArgument7; integerLocal1 < 0; integerLocal1++) {
          for (integerLocal2 = -integerArgument6; integerLocal2 < 0; integerLocal2++) {
            integerArgument3 = integerArrayArgument2[integerArgument4++];
            integerLocal4 = integerArgument3 >>> 24;
            if (integerLocal4 == 0) {
              integerArgument5++;
            } else {
              integerLocal5 = integerArrayArgument1[integerArgument5];
              integerLocal6 = 256 - integerLocal4;
              integerLocal7 = (integerArgument3 & 16711935) * integerArgument10 & -16711936;
              integerLocal8 = (integerArgument3 & 65280) * integerArgument10 & 16711680;
              integerArgument3 = (integerLocal7 | integerLocal8) >>> 8;
              previousIntegerLocal3 = integerArgument5;
              integerArgument5++;
              integerArrayArgument1[previousIntegerLocal3] = ((integerArgument3 & 16711935) * integerLocal4 + (integerLocal5 & 16711935) * integerLocal6 & -16711936) + ((integerArgument3 & 65280) * integerLocal4 + (integerLocal5 & 65280) * integerLocal6 & 16711680) >>> 8;
            }
          }
          integerArgument5 = integerArgument5 + integerArgument8;
          integerArgument4 = integerArgument4 + integerArgument9;
        }
    }

    final void performAction0310(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        int integerLocal6;
        if (integerArgument5 == 256) {
          this.performAction0302(integerArgument1, integerArgument2, integerArgument3, integerArgument4);
          return;
        }
        if (integerArgument3 <= 0 ||
          integerArgument4 <= 0) {
          return;
        }
        int integerLocal7 = this.integerState0258;
        int integerLocal8 = this.integerState0255;
        int integerLocal9 = 0;
        int integerLocal10 = 0;
        int integerLocal11 = this.integerState0254;
        int integerLocal12 = this.integerState0260;
        int integerLocal13 = (integerLocal11 << 16) / integerArgument3;
        int integerLocal14 = (integerLocal12 << 16) / integerArgument4;
        if (this.integerState0259 > 0) {
          integerLocal1 = ((this.integerState0259 << 16) + integerLocal13 - 1) / integerLocal13;
          integerArgument1 = integerArgument1 + integerLocal1;
          integerLocal9 = integerLocal9 + (integerLocal1 * integerLocal13 - (this.integerState0259 << 16));
        }
        if (this.integerState0256 > 0) {
          integerLocal3 = ((this.integerState0256 << 16) + integerLocal14 - 1) / integerLocal14;
          integerArgument2 = integerArgument2 + integerLocal3;
          integerLocal10 = integerLocal10 + (integerLocal3 * integerLocal14 - (this.integerState0256 << 16));
        }
        if (integerLocal7 < integerLocal11) {
          integerArgument3 = ((integerLocal7 << 16) - integerLocal9 + integerLocal13 - 1) / integerLocal13;
        }
        if (integerLocal8 < integerLocal12) {
          integerArgument4 = ((integerLocal8 << 16) - integerLocal10 + integerLocal14 - 1) / integerLocal14;
        }
        integerLocal4 = integerArgument1 + integerArgument2 * SoftwareRaster.integerState0285;
        int integerLocal15 = SoftwareRaster.integerState0285 - integerArgument3;
        if (integerArgument2 + integerArgument4 > SoftwareRaster.integerState0283) {
          integerArgument4 = integerArgument4 - (integerArgument2 + integerArgument4 - SoftwareRaster.integerState0283);
        }
        if (integerArgument2 < SoftwareRaster.integerState0280) {
          integerLocal2 = SoftwareRaster.integerState0280 - integerArgument2;
          integerArgument4 = integerArgument4 - integerLocal2;
          integerLocal4 = integerLocal4 + integerLocal2 * SoftwareRaster.integerState0285;
          integerLocal10 = integerLocal10 + integerLocal14 * integerLocal2;
        }
        if (integerArgument1 + integerArgument3 > SoftwareRaster.integerState0281) {
          integerLocal5 = integerArgument1 + integerArgument3 - SoftwareRaster.integerState0281;
          integerArgument3 = integerArgument3 - integerLocal5;
          integerLocal15 = integerLocal15 + integerLocal5;
        }
        if (integerArgument1 < SoftwareRaster.integerState0282) {
          integerLocal6 = SoftwareRaster.integerState0282 - integerArgument1;
          integerArgument3 = integerArgument3 - integerLocal6;
          integerLocal4 = integerLocal4 + integerLocal6;
          integerLocal9 = integerLocal9 + integerLocal13 * integerLocal6;
          integerLocal15 = integerLocal15 + integerLocal6;
        }
        RenderingSupport009.performAction1062(SoftwareRaster.integerArrayState0063, this.integerArrayState0024, 0, integerLocal9, integerLocal10, integerLocal4, integerLocal15, integerArgument3, integerArgument4, integerLocal13, integerLocal14, integerLocal7, integerArgument5);
    }

    final void performAction0292(int integerArgument1, int integerArgument2, int integerArgument3) {
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
        if (integerLocal7 <= 0 ||
          integerLocal6 <= 0) {
          return;
        }
        RenderingSupport009.performAction1061(SoftwareRaster.integerArrayState0063, this.integerArrayState0024, 0, integerLocal5, integerLocal4, 0, 0, integerLocal7, integerLocal6, integerLocal8, integerLocal9, integerArgument3);
    }

    final void performAction0317(int integerArgument1, int integerArgument2, int integerArgument3) {
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
        if (integerLocal7 <= 0 ||
          integerLocal6 <= 0) {
          return;
        }
        RenderingSupport009.performAction1057(0, 0, 0, SoftwareRaster.integerArrayState0063, this.integerArrayState0024, integerLocal5, 0, integerLocal4, 0, integerLocal7, integerLocal6, integerLocal8, integerLocal9, integerArgument3);
    }

    private final static void performAction1057(int integerArgument1, int integerArgument2, int integerArgument3, int[] integerArrayArgument4, int[] integerArrayArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10, int integerArgument11, int integerArgument12, int integerArgument13, int integerArgument14) {
        int previousIntegerLocal1 = 0;
        int integerLocal2;
        for (integerArgument9 = -integerArgument11; integerArgument9 < 0; integerArgument9++) {
          for (integerArgument7 = -integerArgument10; integerArgument7 < 0; integerArgument7++) {
            integerArgument1 = integerArrayArgument5[integerArgument6++];
            if (integerArgument1 == 0) {
              integerArgument8++;
            } else {
              integerLocal2 = integerArgument14 * (integerArgument1 >>> 24) >> 8 & 255;
              integerArgument2 = (integerArgument1 & 16711935) * integerLocal2;
              integerArgument1 = (integerArgument2 & -16711936) + (integerArgument1 * integerLocal2 - integerArgument2 & 16711680) >>> 8;
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

    private final static void performAction1058(int[] integerArrayArgument1, int[] integerArrayArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int previousIntegerLocal3 = 0;
        int integerLocal4;
        int integerLocal5;
        int integerLocal6;
        int integerLocal7;
        integerLocal4 = -integerArgument6;
        for (integerLocal1 = -integerArgument7; integerLocal1 < 0; integerLocal1++) {
          for (integerLocal2 = integerLocal4; integerLocal2 < 0; integerLocal2++) {
            integerArgument3 = integerArrayArgument2[integerArgument4++];
            integerLocal5 = integerArgument3 >>> 24;
            if (integerLocal5 == 0) {
              integerArgument5++;
            } else {
              integerLocal6 = 256 - integerLocal5;
              integerLocal7 = integerArrayArgument1[integerArgument5];
              previousIntegerLocal3 = integerArgument5;
              integerArgument5++;
              integerArrayArgument1[previousIntegerLocal3] = ((integerArgument3 & 16711935) * integerLocal5 + (integerLocal7 & 16711935) * integerLocal6 & -16711936) + ((integerArgument3 & 65280) * integerLocal5 + (integerLocal7 & 65280) * integerLocal6 & 16711680) >>> 8;
            }
          }
          integerArgument5 = integerArgument5 + integerArgument8;
          integerArgument4 = integerArgument4 + integerArgument9;
        }
    }

    final void performAction0312(int integerArgument1, int integerArgument2) {
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
        if (integerLocal7 <= 0 ||
          integerLocal6 <= 0) {
          return;
        }
        RenderingSupport009.performAction1058(SoftwareRaster.integerArrayState0063, this.integerArrayState0024, 0, integerLocal5, integerLocal4, integerLocal7, integerLocal6, integerLocal8, integerLocal9);
    }

    final void performAction0300(int integerArgument1, int integerArgument2) {
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
        if (integerLocal7 <= 0 ||
          integerLocal6 <= 0) {
          return;
        }
        RenderingSupport009.performAction1058(SoftwareRaster.integerArrayState0063, this.integerArrayState0024, 0, integerLocal5, integerLocal4, integerLocal7, integerLocal6, integerLocal8, integerLocal9);
    }

    final void performAction0302(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        int integerLocal6;
        if (integerArgument3 <= 0 ||
          integerArgument4 <= 0) {
          return;
        }
        int integerLocal7 = this.integerState0258;
        int integerLocal8 = this.integerState0255;
        int integerLocal9 = 0;
        int integerLocal10 = 0;
        int integerLocal11 = this.integerState0254;
        int integerLocal12 = this.integerState0260;
        int integerLocal13 = (integerLocal11 << 16) / integerArgument3;
        int integerLocal14 = (integerLocal12 << 16) / integerArgument4;
        if (this.integerState0259 > 0) {
          integerLocal1 = ((this.integerState0259 << 16) + integerLocal13 - 1) / integerLocal13;
          integerArgument1 = integerArgument1 + integerLocal1;
          integerLocal9 = integerLocal9 + (integerLocal1 * integerLocal13 - (this.integerState0259 << 16));
        }
        if (this.integerState0256 > 0) {
          integerLocal3 = ((this.integerState0256 << 16) + integerLocal14 - 1) / integerLocal14;
          integerArgument2 = integerArgument2 + integerLocal3;
          integerLocal10 = integerLocal10 + (integerLocal3 * integerLocal14 - (this.integerState0256 << 16));
        }
        if (integerLocal7 < integerLocal11) {
          integerArgument3 = ((integerLocal7 << 16) - integerLocal9 + integerLocal13 - 1) / integerLocal13;
        }
        if (integerLocal8 < integerLocal12) {
          integerArgument4 = ((integerLocal8 << 16) - integerLocal10 + integerLocal14 - 1) / integerLocal14;
        }
        integerLocal4 = integerArgument1 + integerArgument2 * SoftwareRaster.integerState0285;
        int integerLocal15 = SoftwareRaster.integerState0285 - integerArgument3;
        if (integerArgument2 + integerArgument4 > SoftwareRaster.integerState0283) {
          integerArgument4 = integerArgument4 - (integerArgument2 + integerArgument4 - SoftwareRaster.integerState0283);
        }
        if (integerArgument2 < SoftwareRaster.integerState0280) {
          integerLocal2 = SoftwareRaster.integerState0280 - integerArgument2;
          integerArgument4 = integerArgument4 - integerLocal2;
          integerLocal4 = integerLocal4 + integerLocal2 * SoftwareRaster.integerState0285;
          integerLocal10 = integerLocal10 + integerLocal14 * integerLocal2;
        }
        if (integerArgument1 + integerArgument3 > SoftwareRaster.integerState0281) {
          integerLocal5 = integerArgument1 + integerArgument3 - SoftwareRaster.integerState0281;
          integerArgument3 = integerArgument3 - integerLocal5;
          integerLocal15 = integerLocal15 + integerLocal5;
        }
        if (integerArgument1 < SoftwareRaster.integerState0282) {
          integerLocal6 = SoftwareRaster.integerState0282 - integerArgument1;
          integerArgument3 = integerArgument3 - integerLocal6;
          integerLocal4 = integerLocal4 + integerLocal6;
          integerLocal9 = integerLocal9 + integerLocal13 * integerLocal6;
          integerLocal15 = integerLocal15 + integerLocal6;
        }
        RenderingSupport009.performAction1059(SoftwareRaster.integerArrayState0063, this.integerArrayState0024, 0, integerLocal9, integerLocal10, integerLocal4, integerLocal15, integerArgument3, integerArgument4, integerLocal13, integerLocal14, integerLocal7);
    }
}
