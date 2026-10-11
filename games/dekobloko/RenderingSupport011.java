/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RenderingSupport011 extends BitmapFont {
    private byte[][] byteArrayArrayState0004;
    int[][] integerArrayArrayState0018;

    RenderingSupport011(byte[] byteArrayArgument1, int[] integerArrayArgument2, int[] integerArrayArgument3, int[] integerArrayArgument4, int[] integerArrayArgument5, int[] integerArrayArgument6, byte[][] byteArrayArrayArgument7) {
        super(byteArrayArgument1, integerArrayArgument2, integerArrayArgument3, integerArrayArgument4, integerArrayArgument5);
        this.byteArrayArrayState0004 = new byte[256][];
        this.byteArrayArrayState0004 = byteArrayArrayArgument7;
        this.integerArrayArrayState0018 = new int[4][];
        this.integerArrayArrayState0018[0] = integerArrayArgument6;
    }

    private final static void performAction1275(int integerArgument1, int[] integerArrayArgument2, byte[] byteArrayArgument3, int[] integerArrayArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10, int integerArgument11) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int previousIntegerLocal3 = 0;
        byte cachedByteLocal4 = 0;
        int previousIntegerLocal5 = 0;
        int integerLocal6;
        int integerLocal7;
        int integerLocal8;
        integerLocal6 = 256 - integerArgument11;
        for (integerLocal1 = -integerArgument8; integerLocal1 < 0; integerLocal1++) {
          for (integerLocal2 = -integerArgument7; integerLocal2 < 0; integerLocal2++) {
            previousIntegerLocal3 = integerArgument5;
            integerArgument5++;
            cachedByteLocal4 = byteArrayArgument3[previousIntegerLocal3];
            integerArgument1 = cachedByteLocal4;
            if (cachedByteLocal4 == 0) {
              integerArgument6++;
            } else {
              integerLocal7 = integerArrayArgument2[integerArgument6];
              integerLocal8 = integerArrayArgument4[integerArgument1 & 255];
              previousIntegerLocal5 = integerArgument6;
              integerArgument6++;
              integerArrayArgument2[previousIntegerLocal5] = ((integerLocal8 & 16711935) * integerArgument11 + (integerLocal7 & 16711935) * integerLocal6 & -16711936) + ((integerLocal8 & 65280) * integerArgument11 + (integerLocal7 & 65280) * integerLocal6 & 16711680) >> 8;
            }
          }
          integerArgument6 = integerArgument6 + integerArgument9;
          integerArgument5 = integerArgument5 + integerArgument10;
        }
    }

    final void performAction1129(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, boolean booleanArgument8) {
        int integerLocal1;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        int integerLocal6;
        int integerLocal7;
        integerLocal1 = integerArgument2 + integerArgument3 * SoftwareRaster.integerState0285;
        integerLocal2 = SoftwareRaster.integerState0285 - integerArgument4;
        integerLocal3 = 0;
        integerLocal4 = 0;
        if (integerArgument3 < SoftwareRaster.integerState0280) {
          integerLocal5 = SoftwareRaster.integerState0280 - integerArgument3;
          integerArgument5 = integerArgument5 - integerLocal5;
          integerArgument3 = SoftwareRaster.integerState0280;
          integerLocal4 = integerLocal4 + integerLocal5 * integerArgument4;
          integerLocal1 = integerLocal1 + integerLocal5 * SoftwareRaster.integerState0285;
        }
        if (integerArgument3 + integerArgument5 > SoftwareRaster.integerState0283) {
          integerArgument5 = integerArgument5 - (integerArgument3 + integerArgument5 - SoftwareRaster.integerState0283);
        }
        if (integerArgument2 < SoftwareRaster.integerState0282) {
          integerLocal6 = SoftwareRaster.integerState0282 - integerArgument2;
          integerArgument4 = integerArgument4 - integerLocal6;
          integerArgument2 = SoftwareRaster.integerState0282;
          integerLocal4 = integerLocal4 + integerLocal6;
          integerLocal1 = integerLocal1 + integerLocal6;
          integerLocal3 = integerLocal3 + integerLocal6;
          integerLocal2 = integerLocal2 + integerLocal6;
        }
        if (integerArgument2 + integerArgument4 > SoftwareRaster.integerState0281) {
          integerLocal7 = integerArgument2 + integerArgument4 - SoftwareRaster.integerState0281;
          integerArgument4 = integerArgument4 - integerLocal7;
          integerLocal3 = integerLocal3 + integerLocal7;
          integerLocal2 = integerLocal2 + integerLocal7;
        }
        if (integerArgument4 > 0 &&
          integerArgument5 > 0) {
          if (!booleanArgument8) {
            RenderingSupport011.performAction1275(0, SoftwareRaster.integerArrayState0063, this.byteArrayArrayState0004[integerArgument1], this.integerArrayArrayState0018[integerArgument6], integerLocal4, integerLocal1, integerArgument4, integerArgument5, integerLocal2, integerLocal3, integerArgument7);
          } else {
            RenderingSupport010.performAction1132(SoftwareRaster.integerArrayState0063, this.byteArrayArrayState0004[integerArgument1], integerArgument6, integerLocal4, integerLocal1, integerArgument4, integerArgument5, integerLocal2, integerLocal3, integerArgument7);
          }
          return;
        }
    }

    private final static void performAction1274(int integerArgument1, int[] integerArrayArgument2, byte[] byteArrayArgument3, int[] integerArrayArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10) {
        int integerLocal1 = 0;
        int previousIntegerLocal2 = 0;
        byte cachedByteLocal3 = 0;
        int previousIntegerLocal4 = 0;
        int previousIntegerLocal5 = 0;
        byte cachedByteLocal6 = 0;
        int previousIntegerLocal7 = 0;
        int previousIntegerLocal8 = 0;
        byte cachedByteLocal9 = 0;
        int previousIntegerLocal10 = 0;
        int previousIntegerLocal11 = 0;
        byte cachedByteLocal12 = 0;
        int previousIntegerLocal13 = 0;
        int previousIntegerLocal14 = 0;
        byte cachedByteLocal15 = 0;
        int previousIntegerLocal16 = 0;
        int integerLocal17;
        int integerLocal18;
        int integerLocal19;
        integerLocal17 = -(integerArgument7 >> 2);
        integerArgument7 = -(integerArgument7 & 3);
        for (integerLocal1 = -integerArgument8; integerLocal1 < 0; integerLocal1++) {
          for (integerLocal18 = integerLocal17; integerLocal18 < 0; integerLocal18++) {
            previousIntegerLocal2 = integerArgument5;
            integerArgument5++;
            cachedByteLocal3 = byteArrayArgument3[previousIntegerLocal2];
            integerArgument1 = cachedByteLocal3;
            if (cachedByteLocal3 == 0) {
              integerArgument6++;
            } else {
              previousIntegerLocal4 = integerArgument6;
              integerArgument6++;
              integerArrayArgument2[previousIntegerLocal4] = integerArrayArgument4[integerArgument1 & 255];
            }
            previousIntegerLocal5 = integerArgument5;
            integerArgument5++;
            cachedByteLocal6 = byteArrayArgument3[previousIntegerLocal5];
            integerArgument1 = cachedByteLocal6;
            if (cachedByteLocal6 == 0) {
              integerArgument6++;
            } else {
              previousIntegerLocal7 = integerArgument6;
              integerArgument6++;
              integerArrayArgument2[previousIntegerLocal7] = integerArrayArgument4[integerArgument1 & 255];
            }
            previousIntegerLocal8 = integerArgument5;
            integerArgument5++;
            cachedByteLocal9 = byteArrayArgument3[previousIntegerLocal8];
            integerArgument1 = cachedByteLocal9;
            if (cachedByteLocal9 == 0) {
              integerArgument6++;
            } else {
              previousIntegerLocal10 = integerArgument6;
              integerArgument6++;
              integerArrayArgument2[previousIntegerLocal10] = integerArrayArgument4[integerArgument1 & 255];
            }
            previousIntegerLocal11 = integerArgument5;
            integerArgument5++;
            cachedByteLocal12 = byteArrayArgument3[previousIntegerLocal11];
            integerArgument1 = cachedByteLocal12;
            if (cachedByteLocal12 == 0) {
              integerArgument6++;
            } else {
              previousIntegerLocal13 = integerArgument6;
              integerArgument6++;
              integerArrayArgument2[previousIntegerLocal13] = integerArrayArgument4[integerArgument1 & 255];
            }
          }
          for (integerLocal19 = integerArgument7; integerLocal19 < 0; integerLocal19++) {
            previousIntegerLocal14 = integerArgument5;
            integerArgument5++;
            cachedByteLocal15 = byteArrayArgument3[previousIntegerLocal14];
            integerArgument1 = cachedByteLocal15;
            if (cachedByteLocal15 == 0) {
              integerArgument6++;
            } else {
              previousIntegerLocal16 = integerArgument6;
              integerArgument6++;
              integerArrayArgument2[previousIntegerLocal16] = integerArrayArgument4[integerArgument1 & 255];
            }
          }
          integerArgument6 = integerArgument6 + integerArgument9;
          integerArgument5 = integerArgument5 + integerArgument10;
        }
    }

    final void performAction1130(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, boolean booleanArgument7) {
        int integerLocal1;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        int integerLocal6;
        int integerLocal7;
        integerLocal1 = integerArgument2 + integerArgument3 * SoftwareRaster.integerState0285;
        integerLocal2 = SoftwareRaster.integerState0285 - integerArgument4;
        integerLocal3 = 0;
        integerLocal4 = 0;
        if (integerArgument3 < SoftwareRaster.integerState0280) {
          integerLocal5 = SoftwareRaster.integerState0280 - integerArgument3;
          integerArgument5 = integerArgument5 - integerLocal5;
          integerArgument3 = SoftwareRaster.integerState0280;
          integerLocal4 = integerLocal4 + integerLocal5 * integerArgument4;
          integerLocal1 = integerLocal1 + integerLocal5 * SoftwareRaster.integerState0285;
        }
        if (integerArgument3 + integerArgument5 > SoftwareRaster.integerState0283) {
          integerArgument5 = integerArgument5 - (integerArgument3 + integerArgument5 - SoftwareRaster.integerState0283);
        }
        if (integerArgument2 < SoftwareRaster.integerState0282) {
          integerLocal6 = SoftwareRaster.integerState0282 - integerArgument2;
          integerArgument4 = integerArgument4 - integerLocal6;
          integerArgument2 = SoftwareRaster.integerState0282;
          integerLocal4 = integerLocal4 + integerLocal6;
          integerLocal1 = integerLocal1 + integerLocal6;
          integerLocal3 = integerLocal3 + integerLocal6;
          integerLocal2 = integerLocal2 + integerLocal6;
        }
        if (integerArgument2 + integerArgument4 > SoftwareRaster.integerState0281) {
          integerLocal7 = integerArgument2 + integerArgument4 - SoftwareRaster.integerState0281;
          integerArgument4 = integerArgument4 - integerLocal7;
          integerLocal3 = integerLocal3 + integerLocal7;
          integerLocal2 = integerLocal2 + integerLocal7;
        }
        if (integerArgument4 > 0 &&
          integerArgument5 > 0) {
          if (!booleanArgument7) {
            RenderingSupport011.performAction1274(0, SoftwareRaster.integerArrayState0063, this.byteArrayArrayState0004[integerArgument1], this.integerArrayArrayState0018[integerArgument6], integerLocal4, integerLocal1, integerArgument4, integerArgument5, integerLocal2, integerLocal3);
          } else {
            RenderingSupport010.performAction1131(SoftwareRaster.integerArrayState0063, this.byteArrayArrayState0004[integerArgument1], integerArgument6, integerLocal4, integerLocal1, integerArgument4, integerArgument5, integerLocal2, integerLocal3);
          }
          return;
        }
    }
}
