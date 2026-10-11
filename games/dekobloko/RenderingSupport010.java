/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RenderingSupport010 extends BitmapFont {
    private byte[][] byteArrayArrayState0003;

    private final static void performAction1133(int[] integerArrayArgument1, byte[] byteArrayArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10, int integerArgument11, int[] integerArrayArgument12, int[] integerArrayArgument13) {
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
        integerLocal4 = integerArgument3 - SoftwareRaster.integerState0282;
        integerLocal5 = integerArgument4 - SoftwareRaster.integerState0280;
        for (integerLocal1 = integerLocal5; integerLocal1 < integerLocal5 + integerArgument6; integerLocal1++) {
          boolean frameRemainderLocal11 = true;
          integerLocal6 = integerArrayArgument12[integerLocal1];
          integerLocal7 = integerArrayArgument13[integerLocal1];
          integerLocal8 = integerArgument5;
          if (integerLocal4 <= integerLocal6) {
            integerLocal9 = integerLocal6 - integerLocal4;
            if (integerLocal9 >= integerArgument5) {
              integerArgument8 = integerArgument8 + (integerArgument5 + integerArgument11);
              integerArgument9 = integerArgument9 + (integerArgument5 + integerArgument10);
              frameRemainderLocal11 = false;
            }
            else {
              integerArgument8 = integerArgument8 + integerLocal9;
              integerLocal8 = integerLocal8 - integerLocal9;
              integerArgument9 = integerArgument9 + integerLocal9;
            }
          } else {
            integerLocal9 = integerLocal4 - integerLocal6;
            if (integerLocal9 >= integerLocal7) {
              integerArgument8 = integerArgument8 + (integerArgument5 + integerArgument11);
              integerArgument9 = integerArgument9 + (integerArgument5 + integerArgument10);
              frameRemainderLocal11 = false;
            }
            else {
              integerLocal7 = integerLocal7 - integerLocal9;
            }
          }
          if (frameRemainderLocal11) {
            integerLocal10 = 0;
            if (integerLocal8 >= integerLocal7) {
              integerLocal10 = integerLocal8 - integerLocal7;
            } else {
              integerLocal7 = integerLocal8;
            }
            for (integerLocal2 = -integerLocal7; integerLocal2 < 0; integerLocal2++) {
              if (byteArrayArgument2[integerArgument8++] == 0) {
                integerArgument9++;
              } else {
                previousIntegerLocal3 = integerArgument9;
                integerArgument9++;
                SoftwareRaster.integerArrayState0063[previousIntegerLocal3] = integerArgument7;
              }
            }
            integerArgument8 = integerArgument8 + (integerLocal10 + integerArgument11);
            integerArgument9 = integerArgument9 + (integerLocal10 + integerArgument10);
          }
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
          if (SoftwareRaster.integerArrayState0061 == null) {
            RenderingSupport010.performAction1131(SoftwareRaster.integerArrayState0063, this.byteArrayArrayState0003[integerArgument1], integerArgument6, integerLocal4, integerLocal1, integerArgument4, integerArgument5, integerLocal2, integerLocal3);
          } else {
            RenderingSupport010.performAction1133(SoftwareRaster.integerArrayState0063, this.byteArrayArrayState0003[integerArgument1], integerArgument2, integerArgument3, integerArgument4, integerArgument5, integerArgument6, integerLocal4, integerLocal1, integerLocal2, integerLocal3, SoftwareRaster.integerArrayState0061, SoftwareRaster.integerArrayState0062);
          }
          return;
        }
    }

    final static void performAction1132(int[] integerArrayArgument1, byte[] byteArrayArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int previousIntegerLocal3 = 0;
        int integerLocal4;
        integerArgument3 = ((integerArgument3 & 16711935) * integerArgument10 & -16711936) + ((integerArgument3 & 65280) * integerArgument10 & 16711680) >> 8;
        integerArgument10 = 256 - integerArgument10;
        for (integerLocal1 = -integerArgument7; integerLocal1 < 0; integerLocal1++) {
          for (integerLocal2 = -integerArgument6; integerLocal2 < 0; integerLocal2++) {
            if (byteArrayArgument2[integerArgument4++] == 0) {
              integerArgument5++;
            } else {
              integerLocal4 = integerArrayArgument1[integerArgument5];
              previousIntegerLocal3 = integerArgument5;
              integerArgument5++;
              integerArrayArgument1[previousIntegerLocal3] = (((integerLocal4 & 16711935) * integerArgument10 & -16711936) + ((integerLocal4 & 65280) * integerArgument10 & 16711680) >> 8) + integerArgument3;
            }
          }
          integerArgument5 = integerArgument5 + integerArgument8;
          integerArgument4 = integerArgument4 + integerArgument9;
        }
    }

    RenderingSupport010(byte[] byteArrayArgument1, int[] integerArrayArgument2, int[] integerArrayArgument3, int[] integerArrayArgument4, int[] integerArrayArgument5, byte[][] byteArrayArrayArgument6) {
        super(byteArrayArgument1, integerArrayArgument2, integerArrayArgument3, integerArrayArgument4, integerArrayArgument5);
        this.byteArrayArrayState0003 = new byte[256][];
        this.byteArrayArrayState0003 = byteArrayArrayArgument6;
    }

    final static void performAction1131(int[] integerArrayArgument1, byte[] byteArrayArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9) {
        int integerLocal1 = 0;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        integerLocal2 = -(integerArgument6 >> 2);
        integerArgument6 = -(integerArgument6 & 3);
        for (integerLocal1 = -integerArgument7; integerLocal1 < 0; integerLocal1++) {
          for (integerLocal3 = integerLocal2; integerLocal3 < 0; integerLocal3++) {
            if (byteArrayArgument2[integerArgument4++] == 0) {
              integerArgument5++;
            } else {
              integerArrayArgument1[integerArgument5++] = integerArgument3;
            }
            if (byteArrayArgument2[integerArgument4++] == 0) {
              integerArgument5++;
            } else {
              integerArrayArgument1[integerArgument5++] = integerArgument3;
            }
            if (byteArrayArgument2[integerArgument4++] == 0) {
              integerArgument5++;
            } else {
              integerArrayArgument1[integerArgument5++] = integerArgument3;
            }
            if (byteArrayArgument2[integerArgument4++] == 0) {
              integerArgument5++;
            } else {
              integerArrayArgument1[integerArgument5++] = integerArgument3;
            }
          }
          for (integerLocal4 = integerArgument6; integerLocal4 < 0; integerLocal4++) {
            if (byteArrayArgument2[integerArgument4++] == 0) {
              integerArgument5++;
            } else {
              integerArrayArgument1[integerArgument5++] = integerArgument3;
            }
          }
          integerArgument5 = integerArgument5 + integerArgument8;
          integerArgument4 = integerArgument4 + integerArgument9;
        }
    }

    final void performAction1129(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, boolean booleanArgument8) {
        int integerLocal1 = 0;
        int integerLocal2 = integerArgument2 + integerArgument3 * SoftwareRaster.integerState0285;
        int integerLocal3 = SoftwareRaster.integerState0285 - integerArgument4;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        int integerLocal6;
        int integerLocal7;
        if (integerArgument3 < SoftwareRaster.integerState0280) {
          integerLocal1 = SoftwareRaster.integerState0280 - integerArgument3;
          integerArgument5 = integerArgument5 - integerLocal1;
          integerArgument3 = SoftwareRaster.integerState0280;
          integerLocal5 = integerLocal5 + integerLocal1 * integerArgument4;
          integerLocal2 = integerLocal2 + integerLocal1 * SoftwareRaster.integerState0285;
        }
        if (integerArgument3 + integerArgument5 > SoftwareRaster.integerState0283) {
          integerArgument5 = integerArgument5 - (integerArgument3 + integerArgument5 - SoftwareRaster.integerState0283);
        }
        if (integerArgument2 < SoftwareRaster.integerState0282) {
          integerLocal6 = SoftwareRaster.integerState0282 - integerArgument2;
          integerArgument4 = integerArgument4 - integerLocal6;
          integerArgument2 = SoftwareRaster.integerState0282;
          integerLocal5 = integerLocal5 + integerLocal6;
          integerLocal2 = integerLocal2 + integerLocal6;
          integerLocal4 = integerLocal4 + integerLocal6;
          integerLocal3 = integerLocal3 + integerLocal6;
        }
        if (integerArgument2 + integerArgument4 > SoftwareRaster.integerState0281) {
          integerLocal7 = integerArgument2 + integerArgument4 - SoftwareRaster.integerState0281;
          integerArgument4 = integerArgument4 - integerLocal7;
          integerLocal4 = integerLocal4 + integerLocal7;
          integerLocal3 = integerLocal3 + integerLocal7;
        }
        if (integerArgument4 <= 0 ||
          integerArgument5 <= 0) {
          return;
        }
        RenderingSupport010.performAction1132(SoftwareRaster.integerArrayState0063, this.byteArrayArrayState0003[integerArgument1], integerArgument6, integerLocal5, integerLocal2, integerArgument4, integerArgument5, integerLocal3, integerLocal4, integerArgument7);
    }
}
