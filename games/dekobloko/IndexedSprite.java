/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IndexedSprite extends Sprite {
    byte[] byteArrayState0021;
    int[] integerArrayState0183;

    private final static void performAction1423(int[] integerArrayArgument1, byte[] byteArrayArgument2, int[] integerArrayArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int previousIntegerLocal3 = 0;
        int integerLocal4;
        int integerLocal5;
        int integerLocal6;
        integerLocal4 = 256 - integerArgument10;
        for (integerLocal1 = -integerArgument7; integerLocal1 < 0; integerLocal1++) {
          for (integerLocal2 = -integerArgument6; integerLocal2 < 0; integerLocal2++) {
            integerLocal5 = byteArrayArgument2[integerArgument4++];
            if (integerLocal5 == 0) {
              integerArgument5++;
            } else {
              integerLocal5 = integerArrayArgument3[integerLocal5 & 255];
              integerLocal6 = integerArrayArgument1[integerArgument5];
              previousIntegerLocal3 = integerArgument5;
              integerArgument5++;
              integerArrayArgument1[previousIntegerLocal3] = ((integerLocal5 & 16711935) * integerArgument10 + (integerLocal6 & 16711935) * integerLocal4 & -16711936) + ((integerLocal5 & 65280) * integerArgument10 + (integerLocal6 & 65280) * integerLocal4 & 16711680) >> 8;
            }
          }
          integerArgument5 = integerArgument5 + integerArgument8;
          integerArgument4 = integerArgument4 + integerArgument9;
        }
    }

    final void performAction1054(int integerArgument1, int integerArgument2, int integerArgument3) {
        int integerLocal1 = 0;
        int integerLocal2;
        int integerLocal3;
        integerArgument1 = integerArgument1 + this.integerState0427;
        integerArgument2 = integerArgument2 + this.integerState0428;
        int integerLocal4 = integerArgument1 + integerArgument2 * SoftwareRaster.integerState0285;
        int integerLocal5 = 0;
        int integerLocal6 = this.integerState0426;
        int integerLocal7 = this.integerState0425;
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
        IndexedSprite.performAction1423(SoftwareRaster.integerArrayState0063, this.byteArrayState0021, this.integerArrayState0183, integerLocal5, integerLocal4, integerLocal7, integerLocal6, integerLocal8, integerLocal9, integerArgument3);
    }

    private final static void performAction1425(int[] integerArrayArgument1, byte[] byteArrayArgument2, int[] integerArrayArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10) {
        int integerLocal1 = 0;
        int previousIntegerLocal2 = 0;
        int previousIntegerLocal3 = 0;
        int previousIntegerLocal4 = 0;
        int previousIntegerLocal5 = 0;
        int previousIntegerLocal6 = 0;
        int integerLocal7;
        int integerLocal8;
        int integerLocal9;
        integerLocal7 = -(integerArgument7 >> 2);
        integerArgument7 = -(integerArgument7 & 3);
        for (integerLocal1 = -integerArgument8; integerLocal1 < 0; integerLocal1++) {
          for (integerLocal8 = integerLocal7; integerLocal8 < 0; integerLocal8++) {
            integerArgument4 = byteArrayArgument2[integerArgument5++];
            if (integerArgument4 == 0) {
              integerArgument6++;
            } else {
              previousIntegerLocal2 = integerArgument6;
              integerArgument6++;
              integerArrayArgument1[previousIntegerLocal2] = integerArrayArgument3[integerArgument4 & 255];
            }
            integerArgument4 = byteArrayArgument2[integerArgument5++];
            if (integerArgument4 == 0) {
              integerArgument6++;
            } else {
              previousIntegerLocal3 = integerArgument6;
              integerArgument6++;
              integerArrayArgument1[previousIntegerLocal3] = integerArrayArgument3[integerArgument4 & 255];
            }
            integerArgument4 = byteArrayArgument2[integerArgument5++];
            if (integerArgument4 == 0) {
              integerArgument6++;
            } else {
              previousIntegerLocal4 = integerArgument6;
              integerArgument6++;
              integerArrayArgument1[previousIntegerLocal4] = integerArrayArgument3[integerArgument4 & 255];
            }
            integerArgument4 = byteArrayArgument2[integerArgument5++];
            if (integerArgument4 == 0) {
              integerArgument6++;
            } else {
              previousIntegerLocal5 = integerArgument6;
              integerArgument6++;
              integerArrayArgument1[previousIntegerLocal5] = integerArrayArgument3[integerArgument4 & 255];
            }
          }
          for (integerLocal9 = integerArgument7; integerLocal9 < 0; integerLocal9++) {
            integerArgument4 = byteArrayArgument2[integerArgument5++];
            if (integerArgument4 == 0) {
              integerArgument6++;
            } else {
              previousIntegerLocal6 = integerArgument6;
              integerArgument6++;
              integerArrayArgument1[previousIntegerLocal6] = integerArrayArgument3[integerArgument4 & 255];
            }
          }
          integerArgument6 = integerArgument6 + integerArgument9;
          integerArgument5 = integerArgument5 + integerArgument10;
        }
    }

    IndexedSprite(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, byte[] byteArrayArgument7, int[] integerArrayArgument8) {
        this.integerState0422 = integerArgument1;
        this.integerState0423 = integerArgument2;
        this.integerState0427 = integerArgument3;
        this.integerState0428 = integerArgument4;
        this.integerState0425 = integerArgument5;
        this.integerState0426 = integerArgument6;
        this.byteArrayState0021 = byteArrayArgument7;
        this.integerArrayState0183 = integerArrayArgument8;
    }

    final void performAction1053(int integerArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        int integerLocal2;
        int integerLocal3;
        integerArgument1 = integerArgument1 + this.integerState0427;
        integerArgument2 = integerArgument2 + this.integerState0428;
        int integerLocal4 = integerArgument1 + integerArgument2 * SoftwareRaster.integerState0285;
        int integerLocal5 = 0;
        int integerLocal6 = this.integerState0426;
        int integerLocal7 = this.integerState0425;
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
        IndexedSprite.performAction1425(SoftwareRaster.integerArrayState0063, this.byteArrayState0021, this.integerArrayState0183, 0, integerLocal5, integerLocal4, integerLocal7, integerLocal6, integerLocal8, integerLocal9);
    }

    final void performAction1422() {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int previousIntegerLocal3 = 0;
        if (this.integerState0425 == this.integerState0422 &&
          this.integerState0426 == this.integerState0423) {
          return;
        }
        byte[] byteArrayLocal4 = new byte[this.integerState0422 * this.integerState0423];
        int integerLocal5 = 0;
        for (integerLocal1 = 0; integerLocal1 < this.integerState0426; integerLocal1++) {
          for (integerLocal2 = 0; integerLocal2 < this.integerState0425; integerLocal2++) {
            previousIntegerLocal3 = integerLocal5;
            integerLocal5++;
            byteArrayLocal4[integerLocal2 + this.integerState0427 + (integerLocal1 + this.integerState0428) * this.integerState0422] = this.byteArrayState0021[previousIntegerLocal3];
          }
        }
        this.byteArrayState0021 = byteArrayLocal4;
        this.integerState0425 = this.integerState0422;
        this.integerState0426 = this.integerState0423;
        this.integerState0427 = 0;
        this.integerState0428 = 0;
    }

    IndexedSprite(int integerArgument1, int integerArgument2, int integerArgument3) {
        this.integerState0425 = integerArgument1;
        this.integerState0422 = integerArgument1;
        this.integerState0426 = integerArgument2;
        this.integerState0423 = integerArgument2;
        this.integerState0428 = 0;
        this.integerState0427 = 0;
        this.byteArrayState0021 = new byte[integerArgument1 * integerArgument2];
        this.integerArrayState0183 = new int[integerArgument3];
    }

    final IndexedSprite computeIndexedSprite1424() {
        int integerLocal1 = 0;
        IndexedSprite indexedSpriteLocal2 = new IndexedSprite(this.integerState0425, this.integerState0426, this.integerArrayState0183.length);
        int integerLocal3;
        indexedSpriteLocal2.integerState0422 = this.integerState0422;
        indexedSpriteLocal2.integerState0423 = this.integerState0423;
        indexedSpriteLocal2.integerState0427 = this.integerState0427;
        indexedSpriteLocal2.integerState0428 = this.integerState0428;
        int integerLocal4 = this.byteArrayState0021.length;
        for (integerLocal1 = 0; integerLocal1 < integerLocal4; integerLocal1++) {
          indexedSpriteLocal2.byteArrayState0021[integerLocal1] = this.byteArrayState0021[integerLocal1];
        }
        integerLocal4 = this.integerArrayState0183.length;
        int integerLocal5 = 0;
        integerLocal3 = integerLocal5;
        while (integerLocal5 < integerLocal4) {
          indexedSpriteLocal2.integerArrayState0183[integerLocal5] = this.integerArrayState0183[integerLocal5];
          integerLocal5++;
        }
        return indexedSpriteLocal2;
    }
}
