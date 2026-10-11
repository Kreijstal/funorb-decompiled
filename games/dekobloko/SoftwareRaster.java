/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoftwareRaster {
    static int integerState0280;
    private static int[] integerArrayState0058;
    private static int[] integerArrayState0059;
    static int integerState0281;
    static int integerState0282;
    static int integerState0283;
    private static int[] integerArrayState0060;
    static int[] integerArrayState0061;
    static int integerState0284;
    static int[] integerArrayState0062;
    static int[] integerArrayState0063;
    static int integerState0285;

    final static void performAction0717(int integerArgument1, int integerArgument2, int integerArgument3) {
        if (integerArgument1 >= integerState0282) {
          if (integerArgument2 < integerState0280 ||
            integerArgument1 >= integerState0281 ||
            integerArgument2 >= integerState0283) {
            return;
          }
          integerArrayState0063[integerArgument1 + integerArgument2 * integerState0285] = integerArgument3;
          return;
        }
    }

    final static void performAction0736() {
        integerState0282 = 0;
        integerState0280 = 0;
        integerState0281 = integerState0285;
        integerState0283 = integerState0284;
        SoftwareRaster.performAction0732();
    }

    final static void performAction0724(int[] integerArrayArgument1, int integerArgument2, int integerArgument3) {
        integerArrayState0063 = integerArrayArgument1;
        integerState0285 = integerArgument2;
        integerState0284 = integerArgument3;
        SoftwareRaster.performAction0728(0, 0, integerArgument2, integerArgument3);
    }

    final static void performAction0727() {
        int previousIntegerLocal1 = 0;
        int previousIntegerLocal2 = 0;
        int previousIntegerLocal3 = 0;
        int previousIntegerLocal4 = 0;
        int previousIntegerLocal5 = 0;
        int previousIntegerLocal6 = 0;
        int previousIntegerLocal7 = 0;
        int previousIntegerLocal8 = 0;
        int previousIntegerLocal9 = 0;
        int integerLocal10 = 0;
        int integerLocal11 = integerState0285 * integerState0284 - 7;
        while (integerLocal10 < integerLocal11) {
          previousIntegerLocal1 = integerLocal10;
          integerLocal10++;
          integerArrayState0063[previousIntegerLocal1] = 0;
          previousIntegerLocal2 = integerLocal10;
          integerLocal10++;
          integerArrayState0063[previousIntegerLocal2] = 0;
          previousIntegerLocal3 = integerLocal10;
          integerLocal10++;
          integerArrayState0063[previousIntegerLocal3] = 0;
          previousIntegerLocal4 = integerLocal10;
          integerLocal10++;
          integerArrayState0063[previousIntegerLocal4] = 0;
          previousIntegerLocal5 = integerLocal10;
          integerLocal10++;
          integerArrayState0063[previousIntegerLocal5] = 0;
          previousIntegerLocal6 = integerLocal10;
          integerLocal10++;
          integerArrayState0063[previousIntegerLocal6] = 0;
          previousIntegerLocal7 = integerLocal10;
          integerLocal10++;
          integerArrayState0063[previousIntegerLocal7] = 0;
          previousIntegerLocal8 = integerLocal10;
          integerLocal10++;
          integerArrayState0063[previousIntegerLocal8] = 0;
        }
        integerLocal11 += 7;
        while (integerLocal10 < integerLocal11) {
          previousIntegerLocal9 = integerLocal10;
          integerLocal10++;
          integerArrayState0063[previousIntegerLocal9] = 0;
        }
    }

    final static void performAction0730(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6) {
        SoftwareRaster.performAction0725(integerArrayState0063, 0, integerArgument3 + integerArgument4 * integerState0285, integerArgument1, integerArgument3, integerArgument5, integerState0285 - integerArgument5, integerArgument6);
        SoftwareRaster.performAction0726(integerArrayState0063, 0, integerArgument3 + integerArgument4 * integerState0285, integerArgument2, integerArgument4, integerArgument6, integerState0285 - integerArgument5, integerArgument3, integerArgument5);
    }

    final static void performAction0744(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        if (integerArgument1 >= integerState0282) {
          if (integerArgument1 >= integerState0281) {
            return;
          }
          if (integerArgument2 < integerState0280) {
            integerArgument3 = integerArgument3 - (integerState0280 - integerArgument2);
            integerArgument2 = integerState0280;
          }
          if (integerArgument2 + integerArgument3 > integerState0283) {
            integerArgument3 = integerState0283 - integerArgument2;
          }
          integerLocal1 = integerArgument1 + integerArgument2 * integerState0285;
          integerLocal2 = 0;
          while (integerLocal2 < integerArgument3) {
            integerArrayState0063[integerLocal1] = integerArgument4;
            integerLocal2++;
            integerLocal1 = integerLocal1 + integerState0285;
          }
          return;
        }
    }

    final static void performAction0743(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5) {
        SoftwareRaster.performAction0718(integerArgument1, integerArgument2, integerArgument3, integerArgument5);
        SoftwareRaster.performAction0718(integerArgument1, integerArgument2 + integerArgument4 - 1, integerArgument3, integerArgument5);
        SoftwareRaster.performAction0744(integerArgument1, integerArgument2, integerArgument4, integerArgument5);
        SoftwareRaster.performAction0744(integerArgument1 + integerArgument3 - 1, integerArgument2, integerArgument4, integerArgument5);
    }

    final static void performAction0719(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int previousIntegerLocal3 = 0;
        if (integerArgument1 < integerState0282) {
          integerArgument3 = integerArgument3 - (integerState0282 - integerArgument1);
          integerArgument1 = integerState0282;
        }
        if (integerArgument2 < integerState0280) {
          integerArgument4 = integerArgument4 - (integerState0280 - integerArgument2);
          integerArgument2 = integerState0280;
        }
        if (integerArgument1 + integerArgument3 > integerState0281) {
          integerArgument3 = integerState0281 - integerArgument1;
        }
        if (integerArgument2 + integerArgument4 > integerState0283) {
          integerArgument4 = integerState0283 - integerArgument2;
        }
        int integerLocal4 = integerState0285 - integerArgument3;
        int integerLocal5 = integerArgument1 + integerArgument2 * integerState0285;
        for (integerLocal1 = -integerArgument4; integerLocal1 < 0; integerLocal1++) {
          for (integerLocal2 = -integerArgument3; integerLocal2 < 0; integerLocal2++) {
            previousIntegerLocal3 = integerLocal5;
            integerLocal5++;
            integerArrayState0063[previousIntegerLocal3] = integerArgument5;
          }
          integerLocal5 = integerLocal5 + integerLocal4;
        }
    }

    final static void performAction0742(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        if (integerState0282 < integerArgument1) {
          integerState0282 = integerArgument1;
        }
        if (integerState0280 < integerArgument2) {
          integerState0280 = integerArgument2;
        }
        if (integerState0281 > integerArgument3) {
          integerState0281 = integerArgument3;
        }
        if (integerState0283 > integerArgument4) {
          integerState0283 = integerArgument4;
        }
        SoftwareRaster.performAction0732();
    }

    private final static void performAction0722(int integerArgument1, int[] integerArrayArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6) {
        while (integerArgument5 < 0) {
          integerArgument3 = integerArgument1 + integerArgument4 - 7;
          while (integerArgument1 < integerArgument3) {
            integerArrayArgument2[integerArgument1] = (integerArrayArgument2[integerArgument1] & 16711422) >> 1;
            integerArgument1++;
            integerArrayArgument2[integerArgument1] = (integerArrayArgument2[integerArgument1] & 16711422) >> 1;
            integerArgument1++;
            integerArrayArgument2[integerArgument1] = (integerArrayArgument2[integerArgument1] & 16711422) >> 1;
            integerArgument1++;
            integerArrayArgument2[integerArgument1] = (integerArrayArgument2[integerArgument1] & 16711422) >> 1;
            integerArgument1++;
            integerArrayArgument2[integerArgument1] = (integerArrayArgument2[integerArgument1] & 16711422) >> 1;
            integerArgument1++;
            integerArrayArgument2[integerArgument1] = (integerArrayArgument2[integerArgument1] & 16711422) >> 1;
            integerArgument1++;
            integerArrayArgument2[integerArgument1] = (integerArrayArgument2[integerArgument1] & 16711422) >> 1;
            integerArgument1++;
            integerArrayArgument2[integerArgument1] = (integerArrayArgument2[integerArgument1] & 16711422) >> 1;
            integerArgument1++;
          }
          integerArgument3 += 7;
          while (integerArgument1 < integerArgument3) {
            integerArrayArgument2[integerArgument1] = (integerArrayArgument2[integerArgument1] & 16711422) >> 1;
            integerArgument1++;
          }
          integerArgument1 = integerArgument1 + integerArgument6;
          integerArgument5++;
        }
    }

    private final static void performAction0725(int[] integerArrayArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8) {
        int integerLocal1 = 0;
        int previousIntegerLocal2 = 0;
        int previousIntegerLocal3 = 0;
        int previousIntegerLocal4 = 0;
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
        integerLocal6 = 16384 / (2 * integerArgument4 + 1);
        integerLocal7 = 1 + integerArgument4 - integerArgument6 - integerArgument5;
        if (0 < integerLocal7) {
          integerLocal7 = 0;
        }
        integerLocal8 = integerState0285 - integerArgument5 - integerArgument6 - integerArgument4;
        if (0 < integerLocal8) {
          integerLocal8 = 0;
        }
        integerLocal9 = 0;
        integerLocal10 = integerArgument5 + integerArgument4 + 1;
        if (integerState0285 < integerLocal10) {
          integerLocal9 = integerLocal10 - integerState0285;
          integerLocal10 = integerState0285;
        }
        for (integerLocal1 = -integerArgument8; integerLocal1 < 0; integerLocal1++) {
          integerLocal11 = 0;
          integerLocal12 = 0;
          integerLocal13 = 0;
          integerLocal14 = integerArgument3 - integerArgument4;
          integerLocal15 = integerLocal14 - (integerArgument4 << 1) - 1;
          integerLocal16 = integerArgument5 - integerArgument4;
          if (integerLocal16 < 0) {
            integerLocal14 = integerLocal14 - integerLocal16;
            integerLocal15 = integerLocal15 - integerLocal16;
            integerLocal16 = 0;
          }
          integerLocal17 = integerLocal10 - integerLocal16;
          while (integerLocal16 < integerLocal10) {
            integerArgument2 = integerArrayArgument1[integerLocal14];
            integerLocal11 = integerLocal11 + (integerArgument2 >> 16 & 255);
            integerLocal12 = integerLocal12 + (integerArgument2 >> 8 & 255);
            integerLocal13 = integerLocal13 + (integerArgument2 & 255);
            integerLocal14++;
            integerLocal15++;
            integerLocal16++;
          }
          integerLocal15 = integerLocal15 + integerLocal9;
          previousIntegerLocal2 = integerArgument3;
          integerArgument3++;
          integerArrayArgument1[previousIntegerLocal2] = (integerLocal11 / integerLocal17 << 16) + (integerLocal12 / integerLocal17 << 8) + integerLocal13 / integerLocal17;
          for (integerLocal21 = 1 - integerArgument6; integerLocal21 < integerLocal7; integerLocal21++) {
            integerLocal15++;
            if (integerArgument5 + integerArgument6 + integerLocal21 + integerArgument4 < integerState0281) {
              integerArgument2 = integerArrayArgument1[integerLocal14];
              integerLocal14++;
              integerLocal11 = integerLocal11 + (integerArgument2 >> 16 & 255);
              integerLocal12 = integerLocal12 + (integerArgument2 >> 8 & 255);
              integerLocal13 = integerLocal13 + (integerArgument2 & 255);
              integerLocal17++;
            }
            integerLocal18 = integerLocal11 / integerLocal17;
            integerLocal19 = integerLocal12 / integerLocal17;
            integerLocal20 = integerLocal13 / integerLocal17;
            previousIntegerLocal3 = integerArgument3;
            integerArgument3++;
            integerArrayArgument1[previousIntegerLocal3] = (integerLocal18 << 16) + (integerLocal19 << 8) + integerLocal20;
          }
          while (integerLocal21 < integerLocal8) {
            integerArgument2 = integerArrayArgument1[integerLocal15++];
            integerLocal11 = integerLocal11 - (integerArgument2 >> 16 & 255);
            if (integerLocal11 < 0) {
              integerLocal11 = 0;
            }
            integerLocal12 = integerLocal12 - (integerArgument2 >> 8 & 255);
            if (integerLocal12 < 0) {
              integerLocal12 = 0;
            }
            integerLocal13 = integerLocal13 - (integerArgument2 & 255);
            if (integerLocal13 < 0) {
              integerLocal13 = 0;
            }
            integerArgument2 = integerArrayArgument1[integerLocal14];
            integerLocal14++;
            integerLocal11 = integerLocal11 + (integerArgument2 >> 16 & 255);
            integerLocal12 = integerLocal12 + (integerArgument2 >> 8 & 255);
            integerLocal13 = integerLocal13 + (integerArgument2 & 255);
            integerLocal22 = integerLocal11 * integerLocal6 >> 14;
            integerLocal24 = integerLocal12 * integerLocal6 >> 14;
            integerLocal26 = integerLocal13 * integerLocal6 >> 14;
            if (integerLocal22 > 255) {
              integerLocal22 = 255;
            }
            if (integerLocal24 > 255) {
              integerLocal24 = 255;
            }
            if (integerLocal26 > 255) {
              integerLocal26 = 255;
            }
            previousIntegerLocal4 = integerArgument3;
            integerArgument3++;
            integerArrayArgument1[previousIntegerLocal4] = (integerLocal22 << 16) + (integerLocal24 << 8) + integerLocal26;
            integerLocal21++;
          }
          while (integerLocal21 < 0) {
            integerArgument2 = integerArrayArgument1[integerLocal15++];
            integerLocal11 = integerLocal11 - (integerArgument2 >> 16 & 255);
            integerLocal12 = integerLocal12 - (integerArgument2 >> 8 & 255);
            integerLocal13 = integerLocal13 - (integerArgument2 & 255);
            integerLocal17--;
            integerLocal23 = integerLocal11 / integerLocal17;
            integerLocal25 = integerLocal12 / integerLocal17;
            integerLocal27 = integerLocal13 / integerLocal17;
            if (integerLocal23 >= 0) {
              if (integerLocal23 > 255) {
                integerLocal23 = 255;
              }
            } else {
              integerLocal23 = 0;
            }
            if (integerLocal25 >= 0) {
              if (integerLocal25 > 255) {
                integerLocal25 = 255;
              }
            } else {
              integerLocal25 = 0;
            }
            if (integerLocal27 >= 0) {
              if (integerLocal27 > 255) {
                integerLocal27 = 255;
              }
            } else {
              integerLocal27 = 0;
            }
            previousIntegerLocal5 = integerArgument3;
            integerArgument3++;
            integerArrayArgument1[previousIntegerLocal5] = (integerLocal23 << 16) + (integerLocal25 << 8) + integerLocal27;
            integerLocal21++;
          }
          integerArgument3 = integerArgument3 + integerArgument7;
        }
    }

    public static void performAction0716() {
        integerArrayState0063 = null;
        integerArrayState0061 = null;
        integerArrayState0062 = null;
        integerArrayState0060 = null;
        integerArrayState0059 = null;
        integerArrayState0058 = null;
    }

    final static void performAction0734(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5) {
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
        int previousIntegerLocal11 = 0;
        if (integerArgument2 >= integerState0280) {
          if (integerArgument2 >= integerState0283) {
            return;
          }
          if (integerArgument1 < integerState0282) {
            integerArgument3 = integerArgument3 - (integerState0282 - integerArgument1);
            integerArgument1 = integerState0282;
          }
          if (integerArgument1 + integerArgument3 > integerState0281) {
            integerArgument3 = integerState0281 - integerArgument1;
          }
          integerLocal1 = 256 - integerArgument5;
          integerLocal2 = (integerArgument4 >> 16 & 255) * integerArgument5;
          integerLocal3 = (integerArgument4 >> 8 & 255) * integerArgument5;
          integerLocal4 = (integerArgument4 & 255) * integerArgument5;
          integerLocal5 = integerArgument1 + integerArgument2 * integerState0285;
          for (integerLocal6 = 0; integerLocal6 < integerArgument3; integerLocal6++) {
            integerLocal7 = (integerArrayState0063[integerLocal5] >> 16 & 255) * integerLocal1;
            integerLocal8 = (integerArrayState0063[integerLocal5] >> 8 & 255) * integerLocal1;
            integerLocal9 = (integerArrayState0063[integerLocal5] & 255) * integerLocal1;
            integerLocal10 = (integerLocal2 + integerLocal7 >> 8 << 16) + (integerLocal3 + integerLocal8 >> 8 << 8) + (integerLocal4 + integerLocal9 >> 8);
            previousIntegerLocal11 = integerLocal5;
            integerLocal5++;
            integerArrayState0063[previousIntegerLocal11] = integerLocal10;
          }
          return;
        }
    }

    private final static void performAction0741(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5) {
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
        if (integerArgument1 >= integerState0282) {
          if (integerArgument1 >= integerState0281) {
            return;
          }
          if (integerArgument2 < integerState0280) {
            integerArgument3 = integerArgument3 - (integerState0280 - integerArgument2);
            integerArgument2 = integerState0280;
          }
          if (integerArgument2 + integerArgument3 > integerState0283) {
            integerArgument3 = integerState0283 - integerArgument2;
          }
          integerLocal1 = 256 - integerArgument5;
          integerLocal2 = (integerArgument4 >> 16 & 255) * integerArgument5;
          integerLocal3 = (integerArgument4 >> 8 & 255) * integerArgument5;
          integerLocal4 = (integerArgument4 & 255) * integerArgument5;
          integerLocal5 = integerArgument1 + integerArgument2 * integerState0285;
          for (integerLocal6 = 0; integerLocal6 < integerArgument3; integerLocal6++) {
            integerLocal7 = (integerArrayState0063[integerLocal5] >> 16 & 255) * integerLocal1;
            integerLocal8 = (integerArrayState0063[integerLocal5] >> 8 & 255) * integerLocal1;
            integerLocal9 = (integerArrayState0063[integerLocal5] & 255) * integerLocal1;
            integerLocal10 = (integerLocal2 + integerLocal7 >> 8 << 16) + (integerLocal3 + integerLocal8 >> 8 << 8) + (integerLocal4 + integerLocal9 >> 8);
            integerArrayState0063[integerLocal5] = integerLocal10;
            integerLocal5 = integerLocal5 + integerState0285;
          }
          return;
        }
    }

    private final static void performAction0732() {
        integerArrayState0061 = null;
        integerArrayState0062 = null;
    }

    final static void performAction0737(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        if (integerArgument1 < integerState0282) {
          integerArgument3 = integerArgument3 - (integerState0282 - integerArgument1);
          integerArgument1 = integerState0282;
        }
        if (integerArgument2 < integerState0280) {
          integerArgument4 = integerArgument4 - (integerState0280 - integerArgument2);
          integerArgument2 = integerState0280;
        }
        if (integerArgument1 + integerArgument3 > integerState0281) {
          integerArgument3 = integerState0281 - integerArgument1;
        }
        if (integerArgument2 + integerArgument4 > integerState0283) {
          integerArgument4 = integerState0283 - integerArgument2;
        }
        int integerLocal1 = integerState0285 - integerArgument3;
        int integerLocal2 = integerArgument1 + integerArgument2 * integerState0285;
        SoftwareRaster.performAction0722(integerLocal2, integerArrayState0063, 0, integerArgument3, -integerArgument4, integerLocal1);
    }

    final static void performAction0735(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6) {
        int previousIntegerLocal1 = 0;
        int previousIntegerLocal2 = 0;
        int previousIntegerLocal3 = 0;
        int integerLocal4 = 0;
        int previousIntegerLocal5 = 0;
        int previousIntegerLocal6 = 0;
        int previousIntegerLocal7 = 0;
        int previousIntegerLocal8 = 0;
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
        int integerLocal32;
        int integerLocal33;
        int integerLocal34;
        int integerLocal35;
        int integerLocal36;
        int integerLocal37;
        if (integerArgument5 == 0) {
          SoftwareRaster.performAction0719(integerArgument1, integerArgument2, integerArgument3, integerArgument4, integerArgument6);
          return;
        }
        if (integerArgument5 < 0) {
          integerArgument5 = -integerArgument5;
        }
        integerLocal9 = integerArgument1 + integerArgument5;
        integerLocal10 = integerArgument2 + integerArgument5;
        integerLocal11 = integerArgument2;
        if (integerLocal11 < integerState0280) {
          integerLocal11 = integerState0280;
        }
        integerLocal12 = integerArgument2 + integerArgument4;
        if (integerLocal12 > integerState0283) {
          integerLocal12 = integerState0283;
        }
        integerLocal13 = integerArgument3 - integerArgument5 - integerArgument5 - 1;
        integerLocal14 = integerLocal11;
        integerLocal15 = integerArgument5 * integerArgument5;
        integerLocal16 = 0;
        integerLocal17 = integerLocal10 - integerLocal14;
        integerLocal18 = integerLocal17 * integerLocal17;
        integerLocal19 = integerLocal18 - integerLocal17;
        if (integerLocal10 > integerLocal12) {
          integerLocal10 = integerLocal12;
        }
        while (integerLocal14 < integerLocal10) {
          while (true) {
            if (integerLocal19 > integerLocal15 &&
              integerLocal18 > integerLocal15) {
              integerLocal20 = integerLocal9 - integerLocal16 + 1;
              if (integerLocal20 < integerState0282) {
                integerLocal20 = integerState0282;
              }
              integerLocal21 = integerLocal9 + integerLocal13 + integerLocal16;
              if (integerLocal21 > integerState0281) {
                integerLocal21 = integerState0281;
              }
              integerLocal22 = integerLocal20 + integerLocal14 * integerState0285;
              for (integerLocal23 = integerLocal20; integerLocal23 < integerLocal21; integerLocal23++) {
                previousIntegerLocal1 = integerLocal22;
                integerLocal22++;
                integerArrayState0063[previousIntegerLocal1] = integerArgument6;
              }
              integerLocal14++;
              previousIntegerLocal2 = integerLocal17;
              integerLocal17--;
              integerLocal18 = integerLocal18 - (previousIntegerLocal2 + integerLocal17);
              integerLocal19 = integerLocal19 - (integerLocal17 + integerLocal17);
              break;
            }
            integerLocal18 = integerLocal18 + (integerLocal16 + integerLocal16);
            previousIntegerLocal3 = integerLocal16;
            integerLocal16++;
            integerLocal19 = integerLocal19 + (previousIntegerLocal3 + integerLocal16);
          }
        }
        integerLocal26 = integerLocal14 - integerLocal10;
        integerLocal30 = integerArgument1;
        if (integerLocal30 < integerState0282) {
          integerLocal30 = integerState0282;
        }
        integerLocal32 = integerArgument1 + integerArgument3;
        if (integerLocal32 > integerState0281) {
          integerLocal32 = integerState0281;
        }
        integerLocal34 = integerLocal30 + integerLocal14 * integerState0285;
        integerLocal36 = integerState0285 + integerLocal30 - integerLocal32;
        integerLocal24 = integerArgument2 + integerArgument4 - integerArgument5 - 1;
        if (integerLocal24 > integerState0283) {
          integerLocal24 = integerState0283;
        }
        while (integerLocal14 < integerLocal24) {
          for (integerLocal4 = integerLocal30; integerLocal4 < integerLocal32; integerLocal4++) {
            previousIntegerLocal5 = integerLocal34;
            integerLocal34++;
            integerArrayState0063[previousIntegerLocal5] = integerArgument6;
          }
          integerLocal14++;
          integerLocal34 = integerLocal34 + integerLocal36;
        }
        integerLocal27 = 0;
        integerLocal25 = integerArgument5;
        integerLocal29 = integerLocal27 * integerLocal27 + integerLocal15;
        integerLocal28 = integerLocal29 - integerLocal25;
        integerLocal29 = integerLocal29 - integerLocal27;
        while (integerLocal14 < integerLocal12) {
          while (integerLocal29 > integerLocal15) {
            if (integerLocal28 > integerLocal15) {
              previousIntegerLocal6 = integerLocal25;
              integerLocal25--;
              integerLocal29 = integerLocal29 - (previousIntegerLocal6 + integerLocal25);
              integerLocal28 = integerLocal28 - (integerLocal25 + integerLocal25);
              continue;
            }
            break;
          }
          integerLocal31 = integerLocal9 - integerLocal25;
          if (integerLocal31 < integerState0282) {
            integerLocal31 = integerState0282;
          }
          integerLocal33 = integerLocal9 + integerLocal13 + integerLocal25;
          if (integerLocal33 > integerState0281 - 1) {
            integerLocal33 = integerState0281 - 1;
          }
          integerLocal35 = integerLocal31 + integerLocal14 * integerState0285;
          for (integerLocal37 = integerLocal31; integerLocal37 <= integerLocal33; integerLocal37++) {
            previousIntegerLocal7 = integerLocal35;
            integerLocal35++;
            integerArrayState0063[previousIntegerLocal7] = integerArgument6;
          }
          integerLocal14++;
          integerLocal29 = integerLocal29 + (integerLocal27 + integerLocal27);
          previousIntegerLocal8 = integerLocal27;
          integerLocal27++;
          integerLocal28 = integerLocal28 + (previousIntegerLocal8 + integerLocal27);
        }
        return;
    }

    final static void performAction0739(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6) {
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
        integerLocal4 = 0;
        integerLocal5 = 65536 / integerArgument4;
        if (integerArgument1 < integerState0282) {
          integerArgument3 = integerArgument3 - (integerState0282 - integerArgument1);
          integerArgument1 = integerState0282;
        }
        if (integerArgument2 < integerState0280) {
          integerLocal4 = integerLocal4 + (integerState0280 - integerArgument2) * integerLocal5;
          integerArgument4 = integerArgument4 - (integerState0280 - integerArgument2);
          integerArgument2 = integerState0280;
        }
        if (integerArgument1 + integerArgument3 > integerState0281) {
          integerArgument3 = integerState0281 - integerArgument1;
        }
        if (integerArgument2 + integerArgument4 > integerState0283) {
          integerArgument4 = integerState0283 - integerArgument2;
        }
        integerLocal6 = integerState0285 - integerArgument3;
        integerLocal7 = integerArgument1 + integerArgument2 * integerState0285;
        for (integerLocal1 = -integerArgument4; integerLocal1 < 0; integerLocal1++) {
          integerLocal8 = 65536 - integerLocal4 >> 8;
          integerLocal9 = integerLocal4 >> 8;
          integerLocal10 = ((integerArgument5 & 16711935) * integerLocal8 + (integerArgument6 & 16711935) * integerLocal9 & -16711936) + ((integerArgument5 & 65280) * integerLocal8 + (integerArgument6 & 65280) * integerLocal9 & 16711680) >>> 8;
          for (integerLocal2 = -integerArgument3; integerLocal2 < 0; integerLocal2++) {
            previousIntegerLocal3 = integerLocal7;
            integerLocal7++;
            integerArrayState0063[previousIntegerLocal3] = integerLocal10;
          }
          integerLocal7 = integerLocal7 + integerLocal6;
          integerLocal4 = integerLocal4 + integerLocal5;
        }
    }

    private final static void performAction0726(int[] integerArrayArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9) {
        int previousIntegerLocal1 = 0;
        int previousIntegerLocal2 = 0;
        int previousIntegerLocal3 = 0;
        int previousIntegerLocal4 = 0;
        int[] stackIntegerArrayLocal5 = null;
        int stackIntegerLocal6 = 0;
        int stackIntegerLocal7 = 0;
        int[] stackIntegerArrayLocal8 = null;
        int stackIntegerLocal9 = 0;
        int stackIntegerLocal10 = 0;
        int[] stackIntegerArrayLocal11 = null;
        int stackIntegerLocal12 = 0;
        int stackIntegerLocal13 = 0;
        int[] integerArrayLocal14;
        int[] integerArrayLocal15;
        int[] integerArrayLocal16;
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
        int[] integerArrayLocal29;
        int[] integerArrayLocal30;
        int[] integerArrayLocal31;
        int[] integerArrayLocal32;
        int[] integerArrayLocal33;
        int[] integerArrayLocal34;
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
        if (integerArrayState0060 == null ||
          !(integerArrayState0060.length >= integerArgument9)) {
          integerArrayState0060 = new int[integerArgument9];
          integerArrayState0059 = new int[integerArgument9];
          integerArrayState0058 = new int[integerArgument9];
        }
        integerArrayLocal32 = integerArrayState0060;
        integerArrayLocal29 = integerArrayLocal32;
        integerArrayLocal14 = integerArrayLocal29;
        integerArrayLocal33 = integerArrayState0059;
        integerArrayLocal30 = integerArrayLocal33;
        integerArrayLocal15 = integerArrayLocal30;
        integerArrayLocal34 = integerArrayState0058;
        integerArrayLocal31 = integerArrayLocal34;
        integerArrayLocal16 = integerArrayLocal31;
        MixedSupport008.performAction0083(integerArrayLocal32, 0, integerArgument9);
        MixedSupport008.performAction0083(integerArrayLocal33, 0, integerArgument9);
        MixedSupport008.performAction0083(integerArrayLocal34, 0, integerArgument9);
        integerLocal17 = 16384 / (2 * integerArgument4 + 1);
        integerLocal18 = integerArgument5 - integerArgument4;
        if (integerLocal18 < 0) {
          integerLocal18 = 0;
        }
        integerLocal19 = integerArgument8 + integerLocal18 * integerState0285;
        integerLocal20 = integerArgument5 + integerArgument4;
        integerLocal21 = 0;
        if (integerLocal20 >= integerState0284) {
          integerLocal21 = integerLocal20 - integerState0284 + 1;
          integerLocal20 = integerState0284 - 1;
        }
        integerLocal22 = integerLocal20 - integerLocal18 + 1;
        while (integerLocal18 <= integerLocal20) {
          for (integerLocal23 = 0; integerLocal23 < integerArgument9; integerLocal23++) {
            integerArgument2 = integerArrayArgument1[integerLocal19++];
            integerArrayLocal14[integerLocal23] = integerArrayLocal14[integerLocal23] + (integerArgument2 >> 16 & 255);
            integerArrayLocal15[integerLocal23] = integerArrayLocal15[integerLocal23] + (integerArgument2 >> 8 & 255);
            integerArrayLocal16[integerLocal23] = integerArrayLocal16[integerLocal23] + (integerArgument2 & 255);
          }
          integerLocal19 = integerLocal19 + integerArgument7;
          integerLocal18++;
        }
        integerLocal19 = integerLocal19 + integerLocal21 * integerState0285;
        for (integerLocal36 = 0; integerLocal36 < integerArgument9; integerLocal36++) {
          previousIntegerLocal1 = integerArgument3;
          integerArgument3++;
          integerArrayArgument1[previousIntegerLocal1] = (integerArrayLocal32[integerLocal36] / integerLocal22 << 16) + (integerArrayLocal33[integerLocal36] / integerLocal22 << 8) + integerArrayLocal34[integerLocal36] / integerLocal22;
        }
        integerArgument3 = integerArgument3 + integerArgument7;
        integerLocal35 = 1 - integerArgument6;
        integerLocal37 = 1 + integerArgument4 - integerArgument6 - integerArgument5;
        if (0 < integerLocal37) {
          integerLocal37 = 0;
        }
        integerLocal24 = integerArgument8 + (integerArgument5 - integerArgument4) * integerState0285;
        if (integerLocal35 < integerLocal37) {
          integerLocal24 = integerLocal24 + (integerLocal37 - integerLocal35) * integerState0285;
        }
        while (integerLocal35 < integerLocal37) {
          if (integerLocal35 + integerArgument5 + integerArgument6 + integerArgument4 < integerState0283) {
            for (integerLocal25 = 0; integerLocal25 < integerArgument9; integerLocal25++) {
              integerArgument2 = integerArrayArgument1[integerLocal19++];
              integerArrayLocal14[integerLocal25] = integerArrayLocal14[integerLocal25] + (integerArgument2 >> 16 & 255);
              integerArrayLocal15[integerLocal25] = integerArrayLocal15[integerLocal25] + (integerArgument2 >> 8 & 255);
              integerArrayLocal16[integerLocal25] = integerArrayLocal16[integerLocal25] + (integerArgument2 & 255);
            }
            integerLocal19 = integerLocal19 + integerArgument7;
            integerLocal22++;
          } else {
            integerLocal19 = integerLocal19 + integerState0285;
          }
          for (integerLocal47 = 0; integerLocal47 < integerArgument9; integerLocal47++) {
            integerLocal26 = integerArrayLocal32[integerLocal47] / integerLocal22;
            integerLocal27 = integerArrayLocal33[integerLocal47] / integerLocal22;
            integerLocal28 = integerArrayLocal34[integerLocal47] / integerLocal22;
            previousIntegerLocal2 = integerArgument3;
            integerArgument3++;
            integerArrayArgument1[previousIntegerLocal2] = (integerLocal26 << 16) + (integerLocal27 << 8) + integerLocal28;
          }
          integerArgument3 = integerArgument3 + integerArgument7;
          integerLocal35++;
        }
        integerLocal38 = integerState0284 - integerArgument5 - integerArgument6 - integerArgument4;
        if (0 < integerLocal38) {
          integerLocal38 = 0;
        }
        while (integerLocal35 < integerLocal38) {
          for (integerLocal39 = 0; integerLocal39 < integerArgument9; integerLocal39++) {
            integerArgument2 = integerArrayArgument1[integerLocal24++];
            integerLocal41 = integerArrayLocal32[integerLocal39] - (integerArgument2 >> 16 & 255);
            stackIntegerArrayLocal5 = integerArrayLocal14;
            stackIntegerLocal6 = integerLocal39;
            if (integerLocal41 >= 0) {
              stackIntegerLocal7 = integerLocal41;
            } else {
              stackIntegerLocal7 = 0;
            }
            stackIntegerArrayLocal5[stackIntegerLocal6] = stackIntegerLocal7;
            integerLocal52 = integerArrayLocal33[integerLocal39] - (integerArgument2 >> 8 & 255);
            stackIntegerArrayLocal8 = integerArrayLocal15;
            stackIntegerLocal9 = integerLocal39;
            if (integerLocal52 >= 0) {
              stackIntegerLocal10 = integerLocal52;
            } else {
              stackIntegerLocal10 = 0;
            }
            stackIntegerArrayLocal8[stackIntegerLocal9] = stackIntegerLocal10;
            integerLocal53 = integerArrayLocal34[integerLocal39] - (integerArgument2 & 255);
            stackIntegerArrayLocal11 = integerArrayLocal16;
            stackIntegerLocal12 = integerLocal39;
            if (integerLocal53 >= 0) {
              stackIntegerLocal13 = integerLocal53;
            } else {
              stackIntegerLocal13 = 0;
            }
            stackIntegerArrayLocal11[stackIntegerLocal12] = stackIntegerLocal13;
          }
          integerLocal24 = integerLocal24 + integerArgument7;
          for (integerLocal48 = 0; integerLocal48 < integerArgument9; integerLocal48++) {
            integerArgument2 = integerArrayArgument1[integerLocal19++];
            integerArrayLocal14[integerLocal48] = integerArrayLocal14[integerLocal48] + (integerArgument2 >> 16 & 255);
            integerArrayLocal15[integerLocal48] = integerArrayLocal15[integerLocal48] + (integerArgument2 >> 8 & 255);
            integerArrayLocal16[integerLocal48] = integerArrayLocal16[integerLocal48] + (integerArgument2 & 255);
          }
          integerLocal19 = integerLocal19 + integerArgument7;
          for (integerLocal49 = 0; integerLocal49 < integerArgument9; integerLocal49++) {
            integerLocal51 = integerArrayLocal32[integerLocal49] * integerLocal17 >> 14;
            integerLocal43 = integerArrayLocal33[integerLocal49] * integerLocal17 >> 14;
            integerLocal45 = integerArrayLocal34[integerLocal49] * integerLocal17 >> 14;
            if (integerLocal51 > 255) {
              integerLocal51 = 255;
            }
            if (integerLocal43 > 255) {
              integerLocal43 = 255;
            }
            if (integerLocal45 > 255) {
              integerLocal45 = 255;
            }
            previousIntegerLocal3 = integerArgument3;
            integerArgument3++;
            integerArrayArgument1[previousIntegerLocal3] = (integerLocal51 << 16) + (integerLocal43 << 8) + integerLocal45;
          }
          integerArgument3 = integerArgument3 + integerArgument7;
          integerLocal35++;
        }
        while (integerLocal35 < 0) {
          for (integerLocal40 = 0; integerLocal40 < integerArgument9; integerLocal40++) {
            integerArgument2 = integerArrayArgument1[integerLocal24++];
            integerArrayLocal14[integerLocal40] = integerArrayLocal14[integerLocal40] - (integerArgument2 >> 16 & 255);
            integerArrayLocal15[integerLocal40] = integerArrayLocal15[integerLocal40] - (integerArgument2 >> 8 & 255);
            integerArrayLocal16[integerLocal40] = integerArrayLocal16[integerLocal40] - (integerArgument2 & 255);
          }
          integerLocal24 = integerLocal24 + integerArgument7;
          integerLocal22--;
          for (integerLocal50 = 0; integerLocal50 < integerArgument9; integerLocal50++) {
            integerLocal42 = integerArrayLocal32[integerLocal50] / integerLocal22;
            integerLocal44 = integerArrayLocal33[integerLocal50] / integerLocal22;
            integerLocal46 = integerArrayLocal34[integerLocal50] / integerLocal22;
            if (integerLocal42 >= 0) {
              if (integerLocal42 > 255) {
                integerLocal42 = 255;
              }
            } else {
              integerLocal42 = 0;
            }
            if (integerLocal44 >= 0) {
              if (integerLocal44 > 255) {
                integerLocal44 = 255;
              }
            } else {
              integerLocal44 = 0;
            }
            if (integerLocal46 >= 0) {
              if (integerLocal46 > 255) {
                integerLocal46 = 255;
              }
            } else {
              integerLocal46 = 0;
            }
            previousIntegerLocal4 = integerArgument3;
            integerArgument3++;
            integerArrayArgument1[previousIntegerLocal4] = (integerLocal42 << 16) + (integerLocal44 << 8) + integerLocal46;
          }
          integerArgument3 = integerArgument3 + integerArgument7;
          integerLocal35++;
        }
    }

    final static void performAction0720(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int previousIntegerLocal3 = 0;
        int integerLocal4;
        int integerLocal5;
        int integerLocal6;
        int integerLocal7;
        if (integerArgument1 < integerState0282) {
          integerArgument3 = integerArgument3 - (integerState0282 - integerArgument1);
          integerArgument1 = integerState0282;
        }
        if (integerArgument2 < integerState0280) {
          integerArgument4 = integerArgument4 - (integerState0280 - integerArgument2);
          integerArgument2 = integerState0280;
        }
        if (integerArgument1 + integerArgument3 > integerState0281) {
          integerArgument3 = integerState0281 - integerArgument1;
        }
        if (integerArgument2 + integerArgument4 > integerState0283) {
          integerArgument4 = integerState0283 - integerArgument2;
        }
        integerArgument5 = ((integerArgument5 & 16711935) * integerArgument6 >> 8 & 16711935) + ((integerArgument5 & 65280) * integerArgument6 >> 8 & 65280);
        integerLocal4 = 256 - integerArgument6;
        integerLocal5 = integerState0285 - integerArgument3;
        integerLocal6 = integerArgument1 + integerArgument2 * integerState0285;
        for (integerLocal1 = 0; integerLocal1 < integerArgument4; integerLocal1++) {
          for (integerLocal2 = -integerArgument3; integerLocal2 < 0; integerLocal2++) {
            integerLocal7 = integerArrayState0063[integerLocal6];
            integerLocal7 = ((integerLocal7 & 16711935) * integerLocal4 >> 8 & 16711935) + ((integerLocal7 & 65280) * integerLocal4 >> 8 & 65280);
            previousIntegerLocal3 = integerLocal6;
            integerLocal6++;
            integerArrayState0063[previousIntegerLocal3] = integerArgument5 + integerLocal7;
          }
          integerLocal6 = integerLocal6 + integerLocal5;
        }
    }

    final static void performAction0721(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7) {
        int previousIntegerLocal1 = 0;
        int previousIntegerLocal2 = 0;
        int previousIntegerLocal3 = 0;
        int integerLocal4 = 0;
        int previousIntegerLocal5 = 0;
        int previousIntegerLocal6 = 0;
        int previousIntegerLocal7 = 0;
        int previousIntegerLocal8 = 0;
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
        if (integerArgument7 == 256) {
          SoftwareRaster.performAction0735(integerArgument1, integerArgument2, integerArgument3, integerArgument4, integerArgument5, integerArgument6);
          return;
        }
        if (integerArgument5 == 0) {
          SoftwareRaster.performAction0720(integerArgument1, integerArgument2, integerArgument3, integerArgument4, integerArgument6, integerArgument7);
          return;
        }
        integerLocal9 = 256 - integerArgument7;
        integerArgument6 = ((integerArgument6 & 16711935) * integerArgument7 >> 8 & 16711935) + ((integerArgument6 & 65280) * integerArgument7 >> 8 & 65280);
        if (integerArgument5 < 0) {
          integerArgument5 = -integerArgument5;
        }
        integerLocal10 = integerArgument1 + integerArgument5;
        integerLocal11 = integerArgument2 + integerArgument5;
        integerLocal12 = integerArgument2;
        if (integerLocal12 < integerState0280) {
          integerLocal12 = integerState0280;
        }
        integerLocal13 = integerArgument2 + integerArgument4;
        if (integerLocal13 > integerState0283) {
          integerLocal13 = integerState0283;
        }
        integerLocal14 = integerArgument3 - integerArgument5 - integerArgument5 - 1;
        integerLocal15 = integerLocal12;
        integerLocal16 = integerArgument5 * integerArgument5;
        integerLocal17 = 0;
        integerLocal18 = integerLocal11 - integerLocal15;
        integerLocal19 = integerLocal18 * integerLocal18;
        integerLocal20 = integerLocal19 - integerLocal18;
        if (integerLocal11 > integerLocal13) {
          integerLocal11 = integerLocal13;
        }
        while (integerLocal15 < integerLocal11) {
          while (true) {
            if (integerLocal20 > integerLocal16 &&
              integerLocal19 > integerLocal16) {
              integerLocal21 = integerLocal10 - integerLocal17 + 1;
              if (integerLocal21 < integerState0282) {
                integerLocal21 = integerState0282;
              }
              integerLocal22 = integerLocal10 + integerLocal14 + integerLocal17;
              if (integerLocal22 > integerState0281) {
                integerLocal22 = integerState0281;
              }
              integerLocal23 = integerLocal21 + integerLocal15 * integerState0285;
              for (integerLocal24 = integerLocal21; integerLocal24 < integerLocal22; integerLocal24++) {
                integerLocal25 = integerArrayState0063[integerLocal23];
                integerLocal25 = ((integerLocal25 & 16711935) * integerLocal9 >> 8 & 16711935) + ((integerLocal25 & 65280) * integerLocal9 >> 8 & 65280);
                previousIntegerLocal1 = integerLocal23;
                integerLocal23++;
                integerArrayState0063[previousIntegerLocal1] = integerArgument6 + integerLocal25;
              }
              integerLocal15++;
              previousIntegerLocal2 = integerLocal18;
              integerLocal18--;
              integerLocal19 = integerLocal19 - (previousIntegerLocal2 + integerLocal18);
              integerLocal20 = integerLocal20 - (integerLocal18 + integerLocal18);
              break;
            }
            integerLocal19 = integerLocal19 + (integerLocal17 + integerLocal17);
            previousIntegerLocal3 = integerLocal17;
            integerLocal17++;
            integerLocal20 = integerLocal20 + (previousIntegerLocal3 + integerLocal17);
          }
        }
        integerLocal28 = integerLocal15 - integerLocal11;
        integerLocal32 = integerArgument1;
        if (integerLocal32 < integerState0282) {
          integerLocal32 = integerState0282;
        }
        integerLocal34 = integerArgument1 + integerArgument3;
        if (integerLocal34 > integerState0281) {
          integerLocal34 = integerState0281;
        }
        integerLocal36 = integerLocal32 + integerLocal15 * integerState0285;
        integerLocal38 = integerState0285 + integerLocal32 - integerLocal34;
        integerLocal40 = integerArgument2 + integerArgument4 - integerArgument5 - 1;
        if (integerLocal40 > integerState0283) {
          integerLocal40 = integerState0283;
        }
        while (integerLocal15 < integerLocal40) {
          for (integerLocal4 = integerLocal32; integerLocal4 < integerLocal34; integerLocal4++) {
            integerLocal26 = integerArrayState0063[integerLocal36];
            integerLocal26 = ((integerLocal26 & 16711935) * integerLocal9 >> 8 & 16711935) + ((integerLocal26 & 65280) * integerLocal9 >> 8 & 65280);
            previousIntegerLocal5 = integerLocal36;
            integerLocal36++;
            integerArrayState0063[previousIntegerLocal5] = integerArgument6 + integerLocal26;
          }
          integerLocal15++;
          integerLocal36 = integerLocal36 + integerLocal38;
        }
        integerLocal29 = 0;
        integerLocal27 = integerArgument5;
        integerLocal31 = integerLocal29 * integerLocal29 + integerLocal16;
        integerLocal30 = integerLocal31 - integerLocal27;
        integerLocal31 = integerLocal31 - integerLocal29;
        while (integerLocal15 < integerLocal13) {
          while (integerLocal31 > integerLocal16) {
            if (integerLocal30 > integerLocal16) {
              previousIntegerLocal6 = integerLocal27;
              integerLocal27--;
              integerLocal31 = integerLocal31 - (previousIntegerLocal6 + integerLocal27);
              integerLocal30 = integerLocal30 - (integerLocal27 + integerLocal27);
              continue;
            }
            break;
          }
          integerLocal33 = integerLocal10 - integerLocal27;
          if (integerLocal33 < integerState0282) {
            integerLocal33 = integerState0282;
          }
          integerLocal35 = integerLocal10 + integerLocal14 + integerLocal27;
          if (integerLocal35 > integerState0281 - 1) {
            integerLocal35 = integerState0281 - 1;
          }
          integerLocal37 = integerLocal33 + integerLocal15 * integerState0285;
          for (integerLocal39 = integerLocal33; integerLocal39 <= integerLocal35; integerLocal39++) {
            integerLocal41 = integerArrayState0063[integerLocal37];
            integerLocal41 = ((integerLocal41 & 16711935) * integerLocal9 >> 8 & 16711935) + ((integerLocal41 & 65280) * integerLocal9 >> 8 & 65280);
            previousIntegerLocal7 = integerLocal37;
            integerLocal37++;
            integerArrayState0063[previousIntegerLocal7] = integerArgument6 + integerLocal41;
          }
          integerLocal15++;
          integerLocal31 = integerLocal31 + (integerLocal29 + integerLocal29);
          previousIntegerLocal8 = integerLocal29;
          integerLocal29++;
          integerLocal30 = integerLocal30 + (previousIntegerLocal8 + integerLocal29);
        }
        return;
    }

    final static void performAction0740(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        int previousIntegerLocal1 = 0;
        int previousIntegerLocal2 = 0;
        int previousIntegerLocal3 = 0;
        int previousIntegerLocal4 = 0;
        int previousIntegerLocal5 = 0;
        int previousIntegerLocal6 = 0;
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
        if (integerArgument3 == 0) {
          SoftwareRaster.performAction0717(integerArgument1, integerArgument2, integerArgument4);
          return;
        }
        if (integerArgument3 < 0) {
          integerArgument3 = -integerArgument3;
        }
        integerLocal7 = integerArgument2 - integerArgument3;
        if (integerLocal7 < integerState0280) {
          integerLocal7 = integerState0280;
        }
        integerLocal8 = integerArgument2 + integerArgument3 + 1;
        if (integerLocal8 > integerState0283) {
          integerLocal8 = integerState0283;
        }
        integerLocal9 = integerLocal7;
        integerLocal10 = integerArgument3 * integerArgument3;
        integerLocal11 = 0;
        integerLocal12 = integerArgument2 - integerLocal9;
        integerLocal13 = integerLocal12 * integerLocal12;
        integerLocal14 = integerLocal13 - integerLocal12;
        if (integerArgument2 > integerLocal8) {
          integerArgument2 = integerLocal8;
        }
        while (integerLocal9 < integerArgument2) {
          while (true) {
            if (integerLocal14 > integerLocal10 &&
              integerLocal13 > integerLocal10) {
              integerLocal15 = integerArgument1 - integerLocal11 + 1;
              if (integerLocal15 < integerState0282) {
                integerLocal15 = integerState0282;
              }
              integerLocal16 = integerArgument1 + integerLocal11;
              if (integerLocal16 > integerState0281) {
                integerLocal16 = integerState0281;
              }
              integerLocal17 = integerLocal15 + integerLocal9 * integerState0285;
              for (integerLocal18 = integerLocal15; integerLocal18 < integerLocal16; integerLocal18++) {
                previousIntegerLocal1 = integerLocal17;
                integerLocal17++;
                integerArrayState0063[previousIntegerLocal1] = integerArgument4;
              }
              integerLocal9++;
              previousIntegerLocal2 = integerLocal12;
              integerLocal12--;
              integerLocal13 = integerLocal13 - (previousIntegerLocal2 + integerLocal12);
              integerLocal14 = integerLocal14 - (integerLocal12 + integerLocal12);
              break;
            }
            integerLocal13 = integerLocal13 + (integerLocal11 + integerLocal11);
            previousIntegerLocal3 = integerLocal11;
            integerLocal11++;
            integerLocal14 = integerLocal14 + (previousIntegerLocal3 + integerLocal11);
          }
        }
        integerLocal19 = integerArgument3;
        integerLocal20 = integerLocal9 - integerArgument2;
        integerLocal22 = integerLocal20 * integerLocal20 + integerLocal10;
        integerLocal21 = integerLocal22 - integerLocal19;
        integerLocal22 = integerLocal22 - integerLocal20;
        while (integerLocal9 < integerLocal8) {
          while (integerLocal22 > integerLocal10) {
            if (integerLocal21 > integerLocal10) {
              previousIntegerLocal4 = integerLocal19;
              integerLocal19--;
              integerLocal22 = integerLocal22 - (previousIntegerLocal4 + integerLocal19);
              integerLocal21 = integerLocal21 - (integerLocal19 + integerLocal19);
              continue;
            }
            break;
          }
          integerLocal23 = integerArgument1 - integerLocal19;
          if (integerLocal23 < integerState0282) {
            integerLocal23 = integerState0282;
          }
          integerLocal24 = integerArgument1 + integerLocal19;
          if (integerLocal24 > integerState0281 - 1) {
            integerLocal24 = integerState0281 - 1;
          }
          integerLocal25 = integerLocal23 + integerLocal9 * integerState0285;
          for (integerLocal26 = integerLocal23; integerLocal26 <= integerLocal24; integerLocal26++) {
            previousIntegerLocal5 = integerLocal25;
            integerLocal25++;
            integerArrayState0063[previousIntegerLocal5] = integerArgument4;
          }
          integerLocal9++;
          integerLocal22 = integerLocal22 + (integerLocal20 + integerLocal20);
          previousIntegerLocal6 = integerLocal20;
          integerLocal20++;
          integerLocal21 = integerLocal21 + (previousIntegerLocal6 + integerLocal20);
        }
        return;
    }

    final static void performAction0731(int[] integerArrayArgument1) {
        integerArrayArgument1[0] = integerState0282;
        integerArrayArgument1[1] = integerState0280;
        integerArrayArgument1[2] = integerState0281;
        integerArrayArgument1[3] = integerState0283;
    }

    final static void performAction0733(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        int integerLocal6 = 0;
        int integerLocal7 = 0;
        int previousIntegerLocal8 = 0;
        if (integerArgument1 < integerState0282) {
          integerArgument3 = integerArgument3 - (integerState0282 - integerArgument1);
          integerArgument1 = integerState0282;
        }
        if (integerArgument1 + integerArgument3 > integerState0281) {
          integerArgument3 = integerState0281 - integerArgument1;
        }
        if (integerArgument2 < integerState0280) {
          integerArgument4 = integerArgument4 - (integerState0280 - integerArgument2);
          integerArgument2 = integerState0280;
        }
        if (integerArgument2 + integerArgument4 > integerState0283) {
          integerArgument4 = integerState0283 - integerArgument2;
        }
        int integerLocal9 = integerArgument1 + integerArgument2 * integerState0285;
        if (integerArgument3 > 0) {
          if (integerArgument4 <= 0) {
            return;
          }
          for (integerLocal1 = 0; integerLocal1 < integerArgument4; integerLocal1++) {
            for (integerLocal2 = 0; integerLocal2 < integerArgument3; integerLocal2++) {
              integerLocal3 = integerArrayState0063[integerLocal9];
              integerLocal4 = integerLocal3 >> 15 & 510;
              integerLocal5 = integerLocal3 >> 8 & 255;
              integerLocal6 = integerLocal3 & 255;
              integerLocal7 = (integerLocal6 + integerLocal4) / 3 + integerLocal5 >> 1;
              previousIntegerLocal8 = integerLocal9;
              integerLocal9++;
              integerArrayState0063[previousIntegerLocal8] = (integerLocal7 << 16) + (integerLocal7 << 8) + integerLocal7;
            }
            integerLocal9 = integerLocal9 + (integerState0285 - integerArgument3);
          }
          return;
        }
    }

    final static void performAction0723(int[] integerArrayArgument1) {
        integerState0282 = integerArrayArgument1[0];
        integerState0280 = integerArrayArgument1[1];
        integerState0281 = integerArrayArgument1[2];
        integerState0283 = integerArrayArgument1[3];
        SoftwareRaster.performAction0732();
    }

    final static void performAction0729(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5) {
        int integerLocal1;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        integerArgument3 = integerArgument3 - integerArgument1;
        integerArgument4 = integerArgument4 - integerArgument2;
        if (integerArgument4 == 0) {
          if (integerArgument3 < 0) {
            SoftwareRaster.performAction0718(integerArgument1 + integerArgument3, integerArgument2, -integerArgument3 + 1, integerArgument5);
          } else {
            SoftwareRaster.performAction0718(integerArgument1, integerArgument2, integerArgument3 + 1, integerArgument5);
          }
          return;
        }
        if (integerArgument3 == 0) {
          if (integerArgument4 < 0) {
            SoftwareRaster.performAction0744(integerArgument1, integerArgument2 + integerArgument4, -integerArgument4 + 1, integerArgument5);
          } else {
            SoftwareRaster.performAction0744(integerArgument1, integerArgument2, integerArgument4 + 1, integerArgument5);
          }
          return;
        }
        if (integerArgument3 + integerArgument4 < 0) {
          integerArgument1 = integerArgument1 + integerArgument3;
          integerArgument3 = -integerArgument3;
          integerArgument2 = integerArgument2 + integerArgument4;
          integerArgument4 = -integerArgument4;
        }
        if (integerArgument3 <= integerArgument4) {
          integerArgument1 = integerArgument1 << 16;
          integerArgument1 = integerArgument1 + 32768;
          integerArgument3 = integerArgument3 << 16;
          integerLocal1 = (int)Math.floor((double)integerArgument3 / (double)integerArgument4 + 0.5);
          integerArgument4 = integerArgument4 + integerArgument2;
          if (integerArgument2 < integerState0280) {
            integerArgument1 = integerArgument1 + integerLocal1 * (integerState0280 - integerArgument2);
            integerArgument2 = integerState0280;
          }
          if (integerArgument4 >= integerState0283) {
            integerArgument4 = integerState0283 - 1;
          }
          while (integerArgument2 <= integerArgument4) {
            integerLocal2 = integerArgument1 >> 16;
            if (integerLocal2 >= integerState0282 &&
              integerLocal2 < integerState0281) {
              integerArrayState0063[integerLocal2 + integerArgument2 * integerState0285] = integerArgument5;
            }
            integerArgument1 = integerArgument1 + integerLocal1;
            integerArgument2++;
          }
          return;
        }
        integerArgument2 = integerArgument2 << 16;
        integerArgument2 = integerArgument2 + 32768;
        integerArgument4 = integerArgument4 << 16;
        integerLocal3 = (int)Math.floor((double)integerArgument4 / (double)integerArgument3 + 0.5);
        integerArgument3 = integerArgument3 + integerArgument1;
        if (integerArgument1 < integerState0282) {
          integerArgument2 = integerArgument2 + integerLocal3 * (integerState0282 - integerArgument1);
          integerArgument1 = integerState0282;
        }
        if (integerArgument3 >= integerState0281) {
          integerArgument3 = integerState0281 - 1;
        }
        while (integerArgument1 <= integerArgument3) {
          integerLocal4 = integerArgument2 >> 16;
          if (integerLocal4 >= integerState0280 &&
            integerLocal4 < integerState0283) {
            integerArrayState0063[integerArgument1 + integerLocal4 * integerState0285] = integerArgument5;
          }
          integerArgument2 = integerArgument2 + integerLocal3;
          integerArgument1++;
        }
    }

    final static void performAction0738(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        for (integerLocal1 = 0; integerLocal1 < 4; integerLocal1++) {
          integerLocal2 = 128 - (integerLocal1 << 5);
          SoftwareRaster.performAction0734(integerArgument1 + integerLocal1, integerArgument2 + integerArgument4 + integerLocal1, integerArgument3, integerArgument5, integerLocal2);
          SoftwareRaster.performAction0741(integerArgument1 + integerArgument3 + integerLocal1, integerArgument2 + integerLocal1, integerArgument4 + 1, integerArgument5, integerLocal2);
        }
    }

    final static void performAction0728(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        if (integerArgument1 < 0) {
          integerArgument1 = 0;
        }
        if (integerArgument2 < 0) {
          integerArgument2 = 0;
        }
        if (integerArgument3 > integerState0285) {
          integerArgument3 = integerState0285;
        }
        if (integerArgument4 > integerState0284) {
          integerArgument4 = integerState0284;
        }
        integerState0282 = integerArgument1;
        integerState0280 = integerArgument2;
        integerState0281 = integerArgument3;
        integerState0283 = integerArgument4;
        SoftwareRaster.performAction0732();
    }

    final static void performAction0718(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        if (integerArgument2 >= integerState0280) {
          if (integerArgument2 >= integerState0283) {
            return;
          }
          if (integerArgument1 < integerState0282) {
            integerArgument3 = integerArgument3 - (integerState0282 - integerArgument1);
            integerArgument1 = integerState0282;
          }
          if (integerArgument1 + integerArgument3 > integerState0281) {
            integerArgument3 = integerState0281 - integerArgument1;
          }
          integerLocal1 = integerArgument1 + integerArgument2 * integerState0285;
          for (integerLocal2 = 0; integerLocal2 < integerArgument3; integerLocal2++) {
            integerArrayState0063[integerLocal1 + integerLocal2] = integerArgument4;
          }
          return;
        }
    }

    static {
        integerState0281 = 0;
        integerState0283 = 0;
        integerState0280 = 0;
        integerState0282 = 0;
    }
}
