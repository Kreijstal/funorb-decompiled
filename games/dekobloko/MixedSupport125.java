/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport125 {
    private static MixedSupport148 mixedSupport148State0001;

    private final static void performAction1791(MixedSupport148 mixedSupport148Argument1) {
        int integerLocal1;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        int[] integerArrayLocal6;
        int integerLocal7;
        byte[] byteArrayLocal8;
        int integerLocal9;
        int integerLocal10;
        int integerLocal11;
        int integerLocal12;
        int integerLocal13;
        int[] integerArrayLocal14;
        int[] integerArrayLocal15;
        int[] integerArrayLocal16;
        integerLocal2 = mixedSupport148Argument1.byteState0005;
        integerLocal3 = mixedSupport148Argument1.integerState0867;
        integerLocal4 = mixedSupport148Argument1.integerState0864;
        integerLocal5 = mixedSupport148Argument1.integerState0866;
        integerArrayLocal15 = SceneWidgetPart014.integerArrayState0257;
        integerArrayLocal14 = integerArrayLocal15;
        integerArrayLocal6 = integerArrayLocal14;
        integerLocal7 = mixedSupport148Argument1.integerState0871;
        byteArrayLocal8 = mixedSupport148Argument1.byteArrayState0034;
        integerLocal9 = mixedSupport148Argument1.integerState0869;
        integerLocal10 = mixedSupport148Argument1.integerState0865;
        integerLocal11 = integerLocal10;
        integerLocal12 = mixedSupport148Argument1.integerState0860 + 1;
        scanLoop1: while (true) {
          if (integerLocal3 > 0) {
            while (true) {
              if (integerLocal10 == 0) {
                break scanLoop1;
              }
              if (integerLocal3 != 1) {
                byteArrayLocal8[integerLocal9] = (byte)integerLocal2;
                integerLocal3--;
                integerLocal9++;
                integerLocal10--;
                continue;
              }
              break;
            }
            if (integerLocal10 == 0) {
              integerLocal3 = 1;
              break scanLoop1;
            }
            byteArrayLocal8[integerLocal9] = (byte)integerLocal2;
            integerLocal9++;
            integerLocal10--;
          }
          while (integerLocal4 != integerLocal12) {
            integerArrayLocal16 = integerArrayLocal14;
            integerLocal2 = (byte)integerLocal5;
            integerLocal7 = integerArrayLocal16[integerLocal7];
            integerLocal1 = (byte)integerLocal7;
            integerLocal7 = integerLocal7 >> 8;
            integerLocal4++;
            if (integerLocal1 == integerLocal5) {
              if (integerLocal4 != integerLocal12) {
                integerLocal3 = 2;
                integerLocal7 = integerArrayLocal16[integerLocal7];
                integerLocal1 = (byte)integerLocal7;
                integerLocal7 = integerLocal7 >> 8;
                integerLocal4++;
                if (integerLocal4 == integerLocal12) {
                  continue scanLoop1;
                }
                if (integerLocal1 != integerLocal5) {
                  integerLocal5 = integerLocal1;
                  continue scanLoop1;
                }
                integerLocal3 = 3;
                integerLocal7 = integerArrayLocal16[integerLocal7];
                integerLocal1 = (byte)integerLocal7;
                integerLocal7 = integerLocal7 >> 8;
                integerLocal4++;
                if (integerLocal4 == integerLocal12) {
                  continue scanLoop1;
                }
                if (integerLocal1 != integerLocal5) {
                  integerLocal5 = integerLocal1;
                  continue scanLoop1;
                }
                integerLocal7 = integerArrayLocal16[integerLocal7];
                integerLocal1 = (byte)integerLocal7;
                integerLocal7 = integerLocal7 >> 8;
                integerLocal4++;
                integerLocal3 = (integerLocal1 & 255) + 4;
                integerLocal7 = integerArrayLocal16[integerLocal7];
                integerLocal5 = (byte)integerLocal7;
                integerLocal7 = integerLocal7 >> 8;
                integerLocal4++;
                continue scanLoop1;
              }
              if (integerLocal10 == 0) {
                integerLocal3 = 1;
                break scanLoop1;
              }
            } else {
              integerLocal5 = integerLocal1;
              if (integerLocal10 == 0) {
                integerLocal3 = 1;
                break scanLoop1;
              }
            }
            byteArrayLocal8[integerLocal9] = (byte)integerLocal2;
            integerLocal9++;
            integerLocal10--;
          }
          integerLocal3 = 0;
          break;
        }
        integerLocal13 = mixedSupport148Argument1.integerState0870;
        mixedSupport148Argument1.integerState0870 = mixedSupport148Argument1.integerState0870 + (integerLocal11 - integerLocal10);
        if (mixedSupport148Argument1.integerState0870 >= integerLocal13) {
        }
        mixedSupport148Argument1.byteState0005 = (byte) integerLocal2;
        mixedSupport148Argument1.integerState0867 = integerLocal3;
        mixedSupport148Argument1.integerState0864 = integerLocal4;
        mixedSupport148Argument1.integerState0866 = integerLocal5;
        SceneWidgetPart014.integerArrayState0257 = integerArrayLocal6;
        mixedSupport148Argument1.integerState0871 = integerLocal7;
        mixedSupport148Argument1.byteArrayState0034 = byteArrayLocal8;
        mixedSupport148Argument1.integerState0869 = integerLocal9;
        mixedSupport148Argument1.integerState0865 = integerLocal10;
        return;
    }

    private final static void performAction1792(MixedSupport148 mixedSupport148Argument1) {
        int cachedIntegerLocal1 = 0;
        int cachedIntegerLocal2 = 0;
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
        Object objectLocal25;
        Object objectLocal26;
        Object objectLocal27;
        int integerLocal28;
        byte[] byteArrayLocal29;
        int integerLocal30;
        int integerLocal31;
        int integerLocal32;
        int integerLocal33;
        int integerLocal34;
        int integerLocal35;
        int integerLocal36;
        int integerLocal37;
        int integerLocal38;
        byte[] byteArrayLocal39;
        byte[] byteArrayLocal40;
        integerLocal6 = 0;
        integerLocal7 = 0;
        integerLocal8 = 0;
        integerLocal9 = 0;
        integerLocal10 = 0;
        integerLocal11 = 0;
        integerLocal12 = 0;
        integerLocal13 = 0;
        integerLocal14 = 0;
        integerLocal15 = 0;
        integerLocal16 = 0;
        integerLocal17 = 0;
        integerLocal18 = 0;
        integerLocal19 = 0;
        integerLocal20 = 0;
        integerLocal21 = 0;
        integerLocal22 = 0;
        integerLocal23 = 0;
        integerLocal24 = 0;
        objectLocal25 = null;
        objectLocal26 = null;
        objectLocal27 = null;
        mixedSupport148Argument1.integerState0862 = 1;
        if (SceneWidgetPart014.integerArrayState0257 == null) {
          SceneWidgetPart014.integerArrayState0257 = new int[mixedSupport148Argument1.integerState0862 * 100000];
        }
        integerLocal28 = 1;
        while (true) {
          if (integerLocal28 == 0) {
            return;
          }
          integerLocal3 = MixedSupport125.computeByte1787(mixedSupport148Argument1);
          if (integerLocal3 == 23) {
            return;
          }
          integerLocal3 = MixedSupport125.computeByte1787(mixedSupport148Argument1);
          integerLocal3 = MixedSupport125.computeByte1787(mixedSupport148Argument1);
          integerLocal3 = MixedSupport125.computeByte1787(mixedSupport148Argument1);
          integerLocal3 = MixedSupport125.computeByte1787(mixedSupport148Argument1);
          integerLocal3 = MixedSupport125.computeByte1787(mixedSupport148Argument1);
          integerLocal3 = MixedSupport125.computeByte1787(mixedSupport148Argument1);
          integerLocal3 = MixedSupport125.computeByte1787(mixedSupport148Argument1);
          integerLocal3 = MixedSupport125.computeByte1787(mixedSupport148Argument1);
          integerLocal3 = MixedSupport125.computeByte1787(mixedSupport148Argument1);
          integerLocal3 = MixedSupport125.computeByte1793(mixedSupport148Argument1);
          if (integerLocal3 == 0) {
          }
          mixedSupport148Argument1.integerState0875 = 0;
          integerLocal3 = MixedSupport125.computeByte1787(mixedSupport148Argument1);
          mixedSupport148Argument1.integerState0875 = mixedSupport148Argument1.integerState0875 << 8 | integerLocal3 & 255;
          integerLocal3 = MixedSupport125.computeByte1787(mixedSupport148Argument1);
          mixedSupport148Argument1.integerState0875 = mixedSupport148Argument1.integerState0875 << 8 | integerLocal3 & 255;
          integerLocal3 = MixedSupport125.computeByte1787(mixedSupport148Argument1);
          mixedSupport148Argument1.integerState0875 = mixedSupport148Argument1.integerState0875 << 8 | integerLocal3 & 255;
          for (integerLocal6 = 0; integerLocal6 < 16; integerLocal6++) {
            integerLocal3 = MixedSupport125.computeByte1793(mixedSupport148Argument1);
            if (integerLocal3 != 1) {
              mixedSupport148Argument1.booleanArrayState0012[integerLocal6] = false;
            } else {
              mixedSupport148Argument1.booleanArrayState0012[integerLocal6] = true;
            }
          }
          for (integerLocal6 = 0; integerLocal6 < 256; integerLocal6++) {
            mixedSupport148Argument1.booleanArrayState0013[integerLocal6] = false;
          }
          for (integerLocal6 = 0; integerLocal6 < 16; integerLocal6++) {
            if (mixedSupport148Argument1.booleanArrayState0012[integerLocal6]) {
              for (integerLocal7 = 0; integerLocal7 < 16; integerLocal7++) {
                integerLocal3 = MixedSupport125.computeByte1793(mixedSupport148Argument1);
                if (integerLocal3 == 1) {
                  mixedSupport148Argument1.booleanArrayState0013[integerLocal6 * 16 + integerLocal7] = true;
                }
              }
            }
          }
          MixedSupport125.performAction1790(mixedSupport148Argument1);
          integerLocal9 = mixedSupport148Argument1.integerState0872 + 2;
          integerLocal10 = MixedSupport125.computeInteger1786(3, mixedSupport148Argument1);
          integerLocal11 = MixedSupport125.computeInteger1786(15, mixedSupport148Argument1);
          integerLocal6 = 0;
          while (integerLocal6 < integerLocal11) {
            integerLocal7 = 0;
            while (true) {
              integerLocal3 = MixedSupport125.computeByte1793(mixedSupport148Argument1);
              if (integerLocal3 != 0) {
                integerLocal7++;
                continue;
              }
              break;
            }
            mixedSupport148Argument1.byteArrayState0036[integerLocal6] = (byte)integerLocal7;
            integerLocal6++;
          }
          byteArrayLocal40 = new byte[6];
          byteArrayLocal39 = byteArrayLocal40;
          byteArrayLocal29 = byteArrayLocal39;
          integerLocal32 = 0;
          while (integerLocal32 < integerLocal10) {
            byteArrayLocal29[integerLocal32] = (byte)integerLocal32;
            integerLocal32 = (byte)(integerLocal32 + 1);
          }
          for (integerLocal6 = 0; integerLocal6 < integerLocal11; integerLocal6++) {
            integerLocal32 = mixedSupport148Argument1.byteArrayState0036[integerLocal6];
            integerLocal31 = byteArrayLocal40[integerLocal32];
            while (integerLocal32 > 0) {
              byteArrayLocal29[integerLocal32] = byteArrayLocal29[integerLocal32 - 1];
              integerLocal32 = (byte)(integerLocal32 - 1);
            }
            byteArrayLocal29[0] = (byte)integerLocal31;
            mixedSupport148Argument1.byteArrayState0038[integerLocal6] = (byte)integerLocal31;
          }
          integerLocal8 = 0;
          while (integerLocal8 < integerLocal10) {
            integerLocal19 = MixedSupport125.computeInteger1786(5, mixedSupport148Argument1);
            integerLocal6 = 0;
            while (true) {
              if (integerLocal6 >= integerLocal9) {
                integerLocal8++;
                break;
              }
              while (true) {
                integerLocal3 = MixedSupport125.computeByte1793(mixedSupport148Argument1);
                if (integerLocal3 == 0) {
                  mixedSupport148Argument1.byteArrayArrayState0012[integerLocal8][integerLocal6] = (byte)integerLocal19;
                  integerLocal6++;
                  break;
                }
                integerLocal3 = MixedSupport125.computeByte1793(mixedSupport148Argument1);
                if (integerLocal3 != 0) {
                  integerLocal19--;
                  continue;
                }
                integerLocal19++;
              }
            }
          }
          for (integerLocal8 = 0; integerLocal8 < integerLocal10; integerLocal8++) {
            integerLocal4 = 32;
            integerLocal5 = 0;
            for (integerLocal6 = 0; integerLocal6 < integerLocal9; integerLocal6++) {
              if (mixedSupport148Argument1.byteArrayArrayState0012[integerLocal8][integerLocal6] > integerLocal5) {
                integerLocal5 = mixedSupport148Argument1.byteArrayArrayState0012[integerLocal8][integerLocal6];
              }
              if (mixedSupport148Argument1.byteArrayArrayState0012[integerLocal8][integerLocal6] < integerLocal4) {
                integerLocal4 = mixedSupport148Argument1.byteArrayArrayState0012[integerLocal8][integerLocal6];
              }
            }
            MixedSupport125.performAction1789(mixedSupport148Argument1.integerArrayArrayState0027[integerLocal8], mixedSupport148Argument1.integerArrayArrayState0028[integerLocal8], mixedSupport148Argument1.integerArrayArrayState0026[integerLocal8], mixedSupport148Argument1.byteArrayArrayState0012[integerLocal8], integerLocal4, integerLocal5, integerLocal9);
            mixedSupport148Argument1.integerArrayState0251[integerLocal8] = integerLocal4;
          }
          integerLocal12 = mixedSupport148Argument1.integerState0872 + 1;
          integerLocal13 = -1;
          integerLocal14 = 0;
          for (integerLocal6 = 0; integerLocal6 <= 255; integerLocal6++) {
            mixedSupport148Argument1.integerArrayState0255[integerLocal6] = 0;
          }
          integerLocal32 = 4095;
          for (integerLocal30 = 15; integerLocal30 >= 0; integerLocal30--) {
            for (integerLocal31 = 15; integerLocal31 >= 0; integerLocal31--) {
              mixedSupport148Argument1.byteArrayState0039[integerLocal32] = (byte)(integerLocal30 * 16 + integerLocal31);
              integerLocal32--;
            }
            mixedSupport148Argument1.integerArrayState0254[integerLocal30] = integerLocal32 + 1;
          }
          integerLocal16 = 0;
          if (integerLocal14 == 0) {
            integerLocal13++;
            integerLocal14 = 50;
            integerLocal23 = mixedSupport148Argument1.byteArrayState0038[integerLocal13];
            integerLocal24 = mixedSupport148Argument1.integerArrayState0251[integerLocal23];
            objectLocal25 = mixedSupport148Argument1.integerArrayArrayState0027[integerLocal23];
            objectLocal27 = mixedSupport148Argument1.integerArrayArrayState0026[integerLocal23];
            objectLocal26 = mixedSupport148Argument1.integerArrayArrayState0028[integerLocal23];
          }
          integerLocal14--;
          integerLocal20 = integerLocal24;
          integerLocal21 = MixedSupport125.computeInteger1786(integerLocal20, mixedSupport148Argument1);
          while (integerLocal21 > ((int[]) (objectLocal25))[integerLocal20]) {
            integerLocal20++;
            integerLocal22 = MixedSupport125.computeByte1793(mixedSupport148Argument1);
            integerLocal21 = integerLocal21 << 1 | integerLocal22;
          }
          integerLocal15 = ((int[]) (objectLocal27))[integerLocal21 - ((int[]) (objectLocal26))[integerLocal20]];
          while (true) {
            if (integerLocal15 == integerLocal12) {
              mixedSupport148Argument1.integerState0867 = 0;
              mixedSupport148Argument1.byteState0005 = (byte) 0;
              mixedSupport148Argument1.integerArrayState0253[0] = 0;
              for (integerLocal6 = 1; integerLocal6 <= 256; integerLocal6++) {
                mixedSupport148Argument1.integerArrayState0253[integerLocal6] = mixedSupport148Argument1.integerArrayState0255[integerLocal6 - 1];
              }
              for (integerLocal6 = 1; integerLocal6 <= 256; integerLocal6++) {
                mixedSupport148Argument1.integerArrayState0253[integerLocal6] = mixedSupport148Argument1.integerArrayState0253[integerLocal6] + mixedSupport148Argument1.integerArrayState0253[integerLocal6 - 1];
              }
              for (integerLocal6 = 0; integerLocal6 < integerLocal16; integerLocal6++) {
                integerLocal3 = (byte)(SceneWidgetPart014.integerArrayState0257[integerLocal6] & 255);
                cachedIntegerLocal1 = mixedSupport148Argument1.integerArrayState0253[integerLocal3 & 255];
                SceneWidgetPart014.integerArrayState0257[cachedIntegerLocal1] = SceneWidgetPart014.integerArrayState0257[cachedIntegerLocal1] | integerLocal6 << 8;
                mixedSupport148Argument1.integerArrayState0253[integerLocal3 & 255] = mixedSupport148Argument1.integerArrayState0253[integerLocal3 & 255] + 1;
              }
              mixedSupport148Argument1.integerState0871 = SceneWidgetPart014.integerArrayState0257[mixedSupport148Argument1.integerState0875] >> 8;
              mixedSupport148Argument1.integerState0864 = 0;
              mixedSupport148Argument1.integerState0871 = SceneWidgetPart014.integerArrayState0257[mixedSupport148Argument1.integerState0871];
              mixedSupport148Argument1.integerState0866 = (byte)(mixedSupport148Argument1.integerState0871 & 255);
              mixedSupport148Argument1.integerState0871 = mixedSupport148Argument1.integerState0871 >> 8;
              mixedSupport148Argument1.integerState0864 = mixedSupport148Argument1.integerState0864 + 1;
              mixedSupport148Argument1.integerState0860 = integerLocal16;
              MixedSupport125.performAction1791(mixedSupport148Argument1);
              if (mixedSupport148Argument1.integerState0864 == mixedSupport148Argument1.integerState0860 + 1 &&
                mixedSupport148Argument1.integerState0867 == 0) {
                integerLocal28 = 1;
                break;
              }
              integerLocal28 = 0;
              break;
            }
            if (integerLocal15 != 0 &&
              integerLocal15 != 1) {
              integerLocal36 = integerLocal15 - 1;
              if (integerLocal36 < 16) {
                integerLocal33 = mixedSupport148Argument1.integerArrayState0254[0];
                integerLocal3 = mixedSupport148Argument1.byteArrayState0039[integerLocal33 + integerLocal36];
                while (integerLocal36 > 3) {
                  integerLocal37 = integerLocal33 + integerLocal36;
                  mixedSupport148Argument1.byteArrayState0039[integerLocal37] = mixedSupport148Argument1.byteArrayState0039[integerLocal37 - 1];
                  mixedSupport148Argument1.byteArrayState0039[integerLocal37 - 1] = mixedSupport148Argument1.byteArrayState0039[integerLocal37 - 2];
                  mixedSupport148Argument1.byteArrayState0039[integerLocal37 - 2] = mixedSupport148Argument1.byteArrayState0039[integerLocal37 - 3];
                  mixedSupport148Argument1.byteArrayState0039[integerLocal37 - 3] = mixedSupport148Argument1.byteArrayState0039[integerLocal37 - 4];
                  integerLocal36 -= 4;
                }
                while (integerLocal36 > 0) {
                  mixedSupport148Argument1.byteArrayState0039[integerLocal33 + integerLocal36] = mixedSupport148Argument1.byteArrayState0039[integerLocal33 + integerLocal36 - 1];
                  integerLocal36--;
                }
                mixedSupport148Argument1.byteArrayState0039[integerLocal33] = (byte)integerLocal3;
              } else {
                integerLocal34 = integerLocal36 / 16;
                integerLocal35 = integerLocal36 % 16;
                integerLocal38 = mixedSupport148Argument1.integerArrayState0254[integerLocal34] + integerLocal35;
                integerLocal33 = integerLocal38;
                integerLocal3 = mixedSupport148Argument1.byteArrayState0039[integerLocal38];
                while (integerLocal38 > mixedSupport148Argument1.integerArrayState0254[integerLocal34]) {
                  mixedSupport148Argument1.byteArrayState0039[integerLocal38] = mixedSupport148Argument1.byteArrayState0039[integerLocal38 - 1];
                  integerLocal38--;
                }
                mixedSupport148Argument1.integerArrayState0254[integerLocal34] = mixedSupport148Argument1.integerArrayState0254[integerLocal34] + 1;
                while (integerLocal34 > 0) {
                  mixedSupport148Argument1.integerArrayState0254[integerLocal34] = mixedSupport148Argument1.integerArrayState0254[integerLocal34] - 1;
                  mixedSupport148Argument1.byteArrayState0039[mixedSupport148Argument1.integerArrayState0254[integerLocal34]] = mixedSupport148Argument1.byteArrayState0039[mixedSupport148Argument1.integerArrayState0254[integerLocal34 - 1] + 16 - 1];
                  integerLocal34--;
                }
                mixedSupport148Argument1.integerArrayState0254[0] = mixedSupport148Argument1.integerArrayState0254[0] - 1;
                mixedSupport148Argument1.byteArrayState0039[mixedSupport148Argument1.integerArrayState0254[0]] = (byte)integerLocal3;
                if (mixedSupport148Argument1.integerArrayState0254[0] == 0) {
                  integerLocal32 = 4095;
                  for (integerLocal30 = 15; integerLocal30 >= 0; integerLocal30--) {
                    for (integerLocal31 = 15; integerLocal31 >= 0; integerLocal31--) {
                      mixedSupport148Argument1.byteArrayState0039[integerLocal32] = mixedSupport148Argument1.byteArrayState0039[mixedSupport148Argument1.integerArrayState0254[integerLocal30] + integerLocal31];
                      integerLocal32--;
                    }
                    mixedSupport148Argument1.integerArrayState0254[integerLocal30] = integerLocal32 + 1;
                  }
                }
              }
              cachedIntegerLocal2 = mixedSupport148Argument1.byteArrayState0035[integerLocal3 & 255] & 255;
              mixedSupport148Argument1.integerArrayState0255[cachedIntegerLocal2] = mixedSupport148Argument1.integerArrayState0255[cachedIntegerLocal2] + 1;
              SceneWidgetPart014.integerArrayState0257[integerLocal16] = mixedSupport148Argument1.byteArrayState0035[integerLocal3 & 255] & 255;
              integerLocal16++;
              if (integerLocal14 == 0) {
                integerLocal13++;
                integerLocal14 = 50;
                integerLocal23 = mixedSupport148Argument1.byteArrayState0038[integerLocal13];
                integerLocal24 = mixedSupport148Argument1.integerArrayState0251[integerLocal23];
                objectLocal25 = mixedSupport148Argument1.integerArrayArrayState0027[integerLocal23];
                objectLocal27 = mixedSupport148Argument1.integerArrayArrayState0026[integerLocal23];
                objectLocal26 = mixedSupport148Argument1.integerArrayArrayState0028[integerLocal23];
              }
              integerLocal14--;
              integerLocal20 = integerLocal24;
              integerLocal21 = MixedSupport125.computeInteger1786(integerLocal20, mixedSupport148Argument1);
              while (integerLocal21 > ((int[]) (objectLocal25))[integerLocal20]) {
                integerLocal20++;
                integerLocal22 = MixedSupport125.computeByte1793(mixedSupport148Argument1);
                integerLocal21 = integerLocal21 << 1 | integerLocal22;
              }
              integerLocal15 = ((int[]) (objectLocal27))[integerLocal21 - ((int[]) (objectLocal26))[integerLocal20]];
              continue;
            }
            integerLocal17 = -1;
            integerLocal18 = 1;
            do {
              if (integerLocal15 != 0) {
                if (integerLocal15 == 1) {
                  integerLocal17 = integerLocal17 + 2 * integerLocal18;
                }
              } else {
                integerLocal17 = integerLocal17 + 1 * integerLocal18;
              }
              integerLocal18 = integerLocal18 * 2;
              if (integerLocal14 == 0) {
                integerLocal13++;
                integerLocal14 = 50;
                integerLocal23 = mixedSupport148Argument1.byteArrayState0038[integerLocal13];
                integerLocal24 = mixedSupport148Argument1.integerArrayState0251[integerLocal23];
                objectLocal25 = mixedSupport148Argument1.integerArrayArrayState0027[integerLocal23];
                objectLocal27 = mixedSupport148Argument1.integerArrayArrayState0026[integerLocal23];
                objectLocal26 = mixedSupport148Argument1.integerArrayArrayState0028[integerLocal23];
              }
              integerLocal14--;
              integerLocal20 = integerLocal24;
              integerLocal21 = MixedSupport125.computeInteger1786(integerLocal20, mixedSupport148Argument1);
              while (integerLocal21 > ((int[]) (objectLocal25))[integerLocal20]) {
                integerLocal20++;
                integerLocal22 = MixedSupport125.computeByte1793(mixedSupport148Argument1);
                integerLocal21 = integerLocal21 << 1 | integerLocal22;
              }
              integerLocal15 = ((int[]) (objectLocal27))[integerLocal21 - ((int[]) (objectLocal26))[integerLocal20]];
            } while (integerLocal15 == 0 ||
              integerLocal15 == 1);
            integerLocal17++;
            integerLocal3 = mixedSupport148Argument1.byteArrayState0035[mixedSupport148Argument1.byteArrayState0039[mixedSupport148Argument1.integerArrayState0254[0]] & 255];
            mixedSupport148Argument1.integerArrayState0255[integerLocal3 & 255] = mixedSupport148Argument1.integerArrayState0255[integerLocal3 & 255] + integerLocal17;
            while (integerLocal17 > 0) {
              SceneWidgetPart014.integerArrayState0257[integerLocal16] = integerLocal3 & 255;
              integerLocal16++;
              integerLocal17--;
            }
          }
        }
    }

    private final static void performAction1789(int[] integerArrayArgument1, int[] integerArrayArgument2, int[] integerArrayArgument3, byte[] byteArrayArgument4, int integerArgument5, int integerArgument6, int integerArgument7) {
        int integerLocal1 = 0;
        int cachedIntegerLocal2 = 0;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        int integerLocal6;
        int integerLocal7;
        int integerLocal8;
        int integerLocal9;
        int integerLocal10;
        int integerLocal11;
        integerLocal3 = 0;
        for (integerLocal4 = integerArgument5; integerLocal4 <= integerArgument6; integerLocal4++) {
          for (integerLocal1 = 0; integerLocal1 < integerArgument7; integerLocal1++) {
            if (byteArrayArgument4[integerLocal1] == integerLocal4) {
              integerArrayArgument3[integerLocal3] = integerLocal1;
              integerLocal3++;
            }
          }
        }
        for (integerLocal6 = 0; integerLocal6 < 23; integerLocal6++) {
          integerArrayArgument2[integerLocal6] = 0;
        }
        for (integerLocal7 = 0; integerLocal7 < integerArgument7; integerLocal7++) {
          cachedIntegerLocal2 = byteArrayArgument4[integerLocal7] + 1;
          integerArrayArgument2[cachedIntegerLocal2] = integerArrayArgument2[cachedIntegerLocal2] + 1;
        }
        for (integerLocal8 = 1; integerLocal8 < 23; integerLocal8++) {
          integerArrayArgument2[integerLocal8] = integerArrayArgument2[integerLocal8] + integerArrayArgument2[integerLocal8 - 1];
        }
        for (integerLocal9 = 0; integerLocal9 < 23; integerLocal9++) {
          integerArrayArgument1[integerLocal9] = 0;
        }
        integerLocal5 = 0;
        for (integerLocal10 = integerArgument5; integerLocal10 <= integerArgument6; integerLocal10++) {
          integerLocal5 = integerLocal5 + (integerArrayArgument2[integerLocal10 + 1] - integerArrayArgument2[integerLocal10]);
          integerArrayArgument1[integerLocal10] = integerLocal5 - 1;
          integerLocal5 = integerLocal5 << 1;
        }
        for (integerLocal11 = integerArgument5 + 1; integerLocal11 <= integerArgument6; integerLocal11++) {
          integerArrayArgument2[integerLocal11] = (integerArrayArgument1[integerLocal11 - 1] + 1 << 1) - integerArrayArgument2[integerLocal11];
        }
    }

    private final static void performAction1790(MixedSupport148 mixedSupport148Argument1) {
        int integerLocal1 = 0;
        mixedSupport148Argument1.integerState0872 = 0;
        for (integerLocal1 = 0; integerLocal1 < 256; integerLocal1++) {
          if (mixedSupport148Argument1.booleanArrayState0013[integerLocal1]) {
            mixedSupport148Argument1.byteArrayState0035[mixedSupport148Argument1.integerState0872] = (byte)integerLocal1;
            mixedSupport148Argument1.integerState0872 = mixedSupport148Argument1.integerState0872 + 1;
          }
        }
    }

    public static void performAction1785() {
        mixedSupport148State0001 = null;
    }

    private final static byte computeByte1793(MixedSupport148 mixedSupport148Argument1) {
        return (byte)MixedSupport125.computeInteger1786(1, mixedSupport148Argument1);
    }

    final static int computeInteger1788(byte[] byteArrayArgument1, int integerArgument2, byte[] byteArrayArgument3, int integerArgument4, int integerArgument5) {
        int stackIntegerLocal1 = 0;
        Throwable caughtExceptionLocal2 = null;
        Object objectLocal3 = null;
        objectLocal3 = mixedSupport148State0001;
        synchronized (objectLocal3) {
          mixedSupport148State0001.byteArrayState0037 = byteArrayArgument3;
          mixedSupport148State0001.integerState0863 = integerArgument5;
          mixedSupport148State0001.byteArrayState0034 = byteArrayArgument1;
          mixedSupport148State0001.integerState0869 = 0;
          mixedSupport148State0001.integerState0865 = integerArgument2;
          mixedSupport148State0001.integerState0868 = 0;
          mixedSupport148State0001.integerState0861 = 0;
          mixedSupport148State0001.integerState0874 = 0;
          mixedSupport148State0001.integerState0870 = 0;
          MixedSupport125.performAction1792(mixedSupport148State0001);
          integerArgument2 = integerArgument2 - mixedSupport148State0001.integerState0865;
          mixedSupport148State0001.byteArrayState0037 = null;
          mixedSupport148State0001.byteArrayState0034 = null;
          stackIntegerLocal1 = integerArgument2;
        }
        return stackIntegerLocal1;
    }

    private final static byte computeByte1787(MixedSupport148 mixedSupport148Argument1) {
        return (byte)MixedSupport125.computeInteger1786(8, mixedSupport148Argument1);
    }

    private final static int computeInteger1786(int integerArgument1, MixedSupport148 mixedSupport148Argument2) {
        int integerLocal1;
        while (mixedSupport148Argument2.integerState0868 < integerArgument1) {
          mixedSupport148Argument2.integerState0861 = mixedSupport148Argument2.integerState0861 << 8 | mixedSupport148Argument2.byteArrayState0037[mixedSupport148Argument2.integerState0863] & 255;
          mixedSupport148Argument2.integerState0868 = mixedSupport148Argument2.integerState0868 + 8;
          mixedSupport148Argument2.integerState0863 = mixedSupport148Argument2.integerState0863 + 1;
          mixedSupport148Argument2.integerState0874 = mixedSupport148Argument2.integerState0874 + 1;
          if (mixedSupport148Argument2.integerState0874 != 0) {
            continue;
          }
        }
        integerLocal1 = mixedSupport148Argument2.integerState0861 >> mixedSupport148Argument2.integerState0868 - integerArgument1 & (1 << integerArgument1) - 1;
        mixedSupport148Argument2.integerState0868 = mixedSupport148Argument2.integerState0868 - integerArgument1;
        return integerLocal1;
    }

    static {
        mixedSupport148State0001 = new MixedSupport148();
    }
}
