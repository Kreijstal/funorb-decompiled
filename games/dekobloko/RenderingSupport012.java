/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RenderingSupport012 extends BitmapFont {
    private byte[][] byteArrayArrayState0005;

    private final static byte[][] computeByteArrayArray1278(int[] integerArrayArgument1, byte[][] byteArrayArrayArgument2) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        byte[][] byteArrayArrayLocal3;
        int integerLocal4;
        int integerLocal5;
        byte[] byteArrayLocal6;
        int integerLocal7;
        int integerLocal8;
        for (integerLocal1 = 0; integerLocal1 < integerArrayArgument1.length; integerLocal1++) {
          integerLocal4 = integerArrayArgument1[integerLocal1];
          integerLocal5 = (integerLocal4 >> 15 & 510) + (integerLocal4 & 255);
          integerArrayArgument1[integerLocal1] = integerLocal5 / 3 + (integerLocal4 >> 8 & 255) >> 1;
        }
        byteArrayArrayLocal3 = byteArrayArrayArgument2;
        for (integerLocal8 = 0; integerLocal8 < byteArrayArrayLocal3.length; integerLocal8++) {
          byteArrayLocal6 = byteArrayArrayLocal3[integerLocal8];
          for (integerLocal2 = 0; integerLocal2 < byteArrayLocal6.length; integerLocal2++) {
            integerLocal7 = byteArrayLocal6[integerLocal2];
            if (integerLocal7 != 0) {
              byteArrayLocal6[integerLocal2] = (byte)integerArrayArgument1[integerLocal7];
            }
          }
        }
        return byteArrayArrayArgument2;
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
            RenderingSupport012.performAction1276(SoftwareRaster.integerArrayState0063, this.byteArrayArrayState0005[integerArgument1], integerArgument6, integerLocal4, integerLocal1, integerArgument4, integerArgument5, integerLocal2, integerLocal3);
          } else {
            RenderingSupport010.performAction1131(SoftwareRaster.integerArrayState0063, this.byteArrayArrayState0005[integerArgument1], integerArgument6, integerLocal4, integerLocal1, integerArgument4, integerArgument5, integerLocal2, integerLocal3);
          }
          return;
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
            RenderingSupport012.performAction1277(SoftwareRaster.integerArrayState0063, this.byteArrayArrayState0005[integerArgument1], integerArgument6, integerLocal4, integerLocal1, integerArgument4, integerArgument5, integerLocal2, integerLocal3, integerArgument7);
          } else {
            RenderingSupport010.performAction1132(SoftwareRaster.integerArrayState0063, this.byteArrayArrayState0005[integerArgument1], integerArgument6, integerLocal4, integerLocal1, integerArgument4, integerArgument5, integerLocal2, integerLocal3, integerArgument7);
          }
          return;
        }
    }

    private final static void performAction1277(int[] integerArrayArgument1, byte[] byteArrayArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int previousIntegerLocal3 = 0;
        int previousIntegerLocal4 = 0;
        int integerLocal5;
        int integerLocal6;
        int integerLocal7;
        for (integerLocal1 = -integerArgument7; integerLocal1 < 0; integerLocal1++) {
          for (integerLocal2 = -integerArgument6; integerLocal2 < 0; integerLocal2++) {
            previousIntegerLocal3 = integerArgument4;
            integerArgument4++;
            integerLocal5 = (255 & byteArrayArgument2[previousIntegerLocal3]) * integerArgument10 >> 8;
            if (integerLocal5 == 0) {
              integerArgument5++;
            } else {
              integerLocal6 = ((integerArgument3 & 16711935) * integerLocal5 & -16711936) + ((integerArgument3 & 65280) * integerLocal5 & 16711680) >> 8;
              integerLocal5 = 256 - integerLocal5;
              integerLocal7 = integerArrayArgument1[integerArgument5];
              previousIntegerLocal4 = integerArgument5;
              integerArgument5++;
              integerArrayArgument1[previousIntegerLocal4] = (((integerLocal7 & 16711935) * integerLocal5 & -16711936) + ((integerLocal7 & 65280) * integerLocal5 & 16711680) >> 8) + integerLocal6;
            }
          }
          integerArgument5 = integerArgument5 + integerArgument8;
          integerArgument4 = integerArgument4 + integerArgument9;
        }
    }

    private final static void performAction1276(int[] integerArrayArgument1, byte[] byteArrayArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int previousIntegerLocal3 = 0;
        int previousIntegerLocal4 = 0;
        int integerLocal5;
        int integerLocal6;
        int integerLocal7;
        for (integerLocal1 = -integerArgument7; integerLocal1 < 0; integerLocal1++) {
          for (integerLocal2 = -integerArgument6; integerLocal2 < 0; integerLocal2++) {
            previousIntegerLocal3 = integerArgument4;
            integerArgument4++;
            integerLocal5 = 255 & byteArrayArgument2[previousIntegerLocal3];
            if (integerLocal5 == 0) {
              integerArgument5++;
            } else {
              integerLocal6 = ((integerArgument3 & 16711935) * integerLocal5 & -16711936) + ((integerArgument3 & 65280) * integerLocal5 & 16711680) >> 8;
              integerLocal5 = 256 - integerLocal5;
              integerLocal7 = integerArrayArgument1[integerArgument5];
              previousIntegerLocal4 = integerArgument5;
              integerArgument5++;
              integerArrayArgument1[previousIntegerLocal4] = (((integerLocal7 & 16711935) * integerLocal5 & -16711936) + ((integerLocal7 & 65280) * integerLocal5 & 16711680) >> 8) + integerLocal6;
            }
          }
          integerArgument5 = integerArgument5 + integerArgument8;
          integerArgument4 = integerArgument4 + integerArgument9;
        }
    }

    RenderingSupport012(byte[] byteArrayArgument1, int[] integerArrayArgument2, int[] integerArrayArgument3, int[] integerArrayArgument4, int[] integerArrayArgument5, int[] integerArrayArgument6, byte[][] byteArrayArrayArgument7) {
        super(byteArrayArgument1, integerArrayArgument2, integerArrayArgument3, integerArrayArgument4, integerArrayArgument5);
        this.byteArrayArrayState0005 = new byte[256][];
        this.byteArrayArrayState0005 = RenderingSupport012.computeByteArrayArray1278(integerArrayArgument6, byteArrayArrayArgument7);
    }
}
