/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport097 {
    private static int integerState0560;
    private static int integerState0561;
    private static int integerState0562;
    private static int[] integerArrayState0177;
    private static int integerState0563;
    private static int integerState0564;
    private static int integerState0565;
    private static int integerState0566;

    private final static void performAction1370() {
        integerState0562 = 0;
    }

    public static void performAction1371() {
        integerArrayState0177 = null;
    }

    final static void performAction1364(int[] integerArrayArgument1, int integerArgument2, int integerArgument3) {
        MixedSupport097.performAction1366(integerArrayArgument1, 0, integerArrayArgument1.length, integerArgument2, integerArgument3, (int[]) null, (int[]) null);
    }

    private final static void performAction1362(int integerArgument1, int integerArgument2, int[] integerArrayArgument3, int[] integerArrayArgument4) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        MixedSupport097.performAction1359();
        while (MixedSupport097.computeBoolean1367()) {
          integerLocal1 = integerState0565;
          integerLocal2 = integerState0563;
          integerLocal3 = integerState0561;
          if (integerArrayArgument3 != null) {
            integerLocal4 = integerLocal3 - SoftwareRaster.integerState0280;
            if (integerLocal1 < integerArrayArgument3[integerLocal4] + SoftwareRaster.integerState0282) {
              integerLocal1 = integerArrayArgument3[integerLocal4] + SoftwareRaster.integerState0282;
            }
            if (integerLocal2 > integerArrayArgument3[integerLocal4] + integerArrayArgument4[integerLocal4] + SoftwareRaster.integerState0282) {
              integerLocal2 = integerArrayArgument3[integerLocal4] + integerArrayArgument4[integerLocal4] + SoftwareRaster.integerState0282;
            }
          }
          SoftwareRaster.performAction0734(integerLocal1, integerLocal3, integerLocal2 - integerLocal1, integerArgument1, integerArgument2);
        }
    }

    private final static void performAction1359() {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        int integerLocal6 = 0;
        int integerLocal7 = 0;
        if (integerState0562 < 0) {
          integerState0564 = 0;
          integerState0560 = 0;
          integerState0566 = 0;
          integerState0561 = 2147483646;
          return;
        }
        MixedSupport097.performAction1361(0, integerState0562);
        int integerLocal8 = integerArrayState0177[1];
        if (integerLocal8 < SoftwareRaster.integerState0280) {
          integerLocal8 = SoftwareRaster.integerState0280;
        }
        int integerLocal9 = 0;
        for (integerLocal7 = 0; integerLocal7 < integerState0562; integerLocal7 += 4) {
          integerLocal1 = integerArrayState0177[integerLocal7 + 1];
          if (integerLocal8 < integerLocal1) {
            break;
          }
          integerLocal2 = integerArrayState0177[integerLocal7];
          integerLocal3 = integerArrayState0177[integerLocal7 + 2];
          integerLocal4 = integerArrayState0177[integerLocal7 + 3];
          integerLocal5 = (integerLocal3 - integerLocal2 << 16) / (integerLocal4 - integerLocal1);
          integerLocal6 = (integerLocal2 << 16) + 32768;
          integerArrayState0177[integerLocal7] = integerLocal6 + (integerLocal8 - integerLocal1) * integerLocal5;
          integerArrayState0177[integerLocal7 + 2] = integerLocal5;
        }
        integerState0566 = integerLocal9;
        integerState0560 = integerLocal7;
        integerState0564 = integerLocal7;
        integerState0561 = integerLocal8 - 1;
    }

    private final static void performAction1368(int integerArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        while (integerArgument2 >= integerArgument1 + 8) {
          integerLocal2 = 1;
          for (integerLocal1 = integerArgument1 + 4; integerLocal1 < integerArgument2; integerLocal1 += 4) {
            integerLocal3 = integerArrayState0177[integerLocal1 - 4];
            integerLocal4 = integerArrayState0177[integerLocal1];
            if (integerLocal3 > integerLocal4) {
              integerLocal2 = 0;
              integerArrayState0177[integerLocal1 - 4] = integerLocal4;
              integerArrayState0177[integerLocal1] = integerLocal3;
              integerLocal3 = integerArrayState0177[integerLocal1 - 2];
              integerArrayState0177[integerLocal1 - 2] = integerArrayState0177[integerLocal1 + 2];
              integerArrayState0177[integerLocal1 + 2] = integerLocal3;
              integerLocal3 = integerArrayState0177[integerLocal1 - 1];
              integerArrayState0177[integerLocal1 - 1] = integerArrayState0177[integerLocal1 + 3];
              integerArrayState0177[integerLocal1 + 3] = integerLocal3;
            }
          }
          if (integerLocal2 != 0) {
            return;
          }
          integerArgument2 -= 4;
        }
        return;
    }

    private final static boolean computeBoolean1367() {
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
        integerLocal1 = integerState0560;
        integerLocal2 = integerState0564;
        integerLocal3 = integerState0561;
        while (true) {
          if (integerLocal2 < integerLocal1) {
            integerState0565 = integerArrayState0177[integerLocal2] >> 16;
            integerState0563 = integerArrayState0177[integerLocal2 + 4] >> 16;
            integerArrayState0177[integerLocal2] = integerArrayState0177[integerLocal2] + integerArrayState0177[integerLocal2 + 2];
            integerArrayState0177[integerLocal2 + 4] = integerArrayState0177[integerLocal2 + 4] + integerArrayState0177[integerLocal2 + 6];
            integerLocal2 += 8;
            integerState0564 = integerLocal2;
            return true;
          }
          integerLocal3++;
          integerState0561 = integerLocal3;
          if (integerLocal3 >= SoftwareRaster.integerState0283) {
            return false;
          }
          integerLocal4 = integerState0566;
          while (integerLocal1 < integerState0562) {
            integerLocal5 = integerArrayState0177[integerLocal1 + 1];
            if (integerLocal3 >= integerLocal5) {
              integerLocal6 = integerArrayState0177[integerLocal1];
              integerLocal7 = integerArrayState0177[integerLocal1 + 2];
              integerLocal8 = integerArrayState0177[integerLocal1 + 3];
              integerLocal9 = (integerLocal7 - integerLocal6 << 16) / (integerLocal8 - integerLocal5);
              integerLocal10 = (integerLocal6 << 16) + 32768;
              integerArrayState0177[integerLocal1] = integerLocal10;
              integerArrayState0177[integerLocal1 + 2] = integerLocal9;
              integerLocal1 += 4;
              continue;
            }
            break;
          }
          integerLocal11 = integerLocal4;
          integerLocal12 = integerLocal11;
          while (integerLocal11 < integerLocal1) {
            integerLocal13 = integerArrayState0177[integerLocal11 + 3];
            if (integerLocal3 >= integerLocal13) {
              integerArrayState0177[integerLocal11] = integerArrayState0177[integerLocal4];
              integerArrayState0177[integerLocal11 + 1] = integerArrayState0177[integerLocal4 + 1];
              integerArrayState0177[integerLocal11 + 2] = integerArrayState0177[integerLocal4 + 2];
              integerArrayState0177[integerLocal11 + 3] = integerArrayState0177[integerLocal4 + 3];
              integerLocal4 += 4;
            }
            integerLocal11 += 4;
          }
          if (integerLocal4 == integerState0562) {
            integerState0562 = 0;
            return false;
          }
          MixedSupport097.performAction1368(integerLocal4, integerLocal1);
          integerState0566 = integerLocal4;
          integerState0560 = integerLocal1;
          integerLocal2 = integerLocal4;
        }
    }

    private final static void performAction1361(int integerArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        int integerLocal6;
        int integerLocal7;
        if (integerArgument2 <= integerArgument1 + 4) {
          return;
        }
        integerLocal2 = integerArgument1;
        integerLocal3 = integerArrayState0177[integerLocal2];
        integerLocal4 = integerArrayState0177[integerLocal2 + 1];
        integerLocal5 = integerArrayState0177[integerLocal2 + 2];
        integerLocal6 = integerArrayState0177[integerLocal2 + 3];
        for (integerLocal1 = integerArgument1 + 4; integerLocal1 < integerArgument2; integerLocal1 += 4) {
          integerLocal7 = integerArrayState0177[integerLocal1 + 1];
          if (integerLocal7 < integerLocal4) {
            integerArrayState0177[integerLocal2] = integerArrayState0177[integerLocal1];
            integerArrayState0177[integerLocal2 + 1] = integerLocal7;
            integerArrayState0177[integerLocal2 + 2] = integerArrayState0177[integerLocal1 + 2];
            integerArrayState0177[integerLocal2 + 3] = integerArrayState0177[integerLocal1 + 3];
            integerLocal2 += 4;
            integerArrayState0177[integerLocal1] = integerArrayState0177[integerLocal2];
            integerArrayState0177[integerLocal1 + 1] = integerArrayState0177[integerLocal2 + 1];
            integerArrayState0177[integerLocal1 + 2] = integerArrayState0177[integerLocal2 + 2];
            integerArrayState0177[integerLocal1 + 3] = integerArrayState0177[integerLocal2 + 3];
          }
        }
        integerArrayState0177[integerLocal2] = integerLocal3;
        integerArrayState0177[integerLocal2 + 1] = integerLocal4;
        integerArrayState0177[integerLocal2 + 2] = integerLocal5;
        integerArrayState0177[integerLocal2 + 3] = integerLocal6;
        MixedSupport097.performAction1361(integerArgument1, integerLocal2);
        MixedSupport097.performAction1361(integerLocal2 + 4, integerArgument2);
    }

    final static void performAction1363(int[] integerArrayArgument1, int integerArgument2) {
        MixedSupport097.performAction1365(integerArrayArgument1, 0, integerArrayArgument1.length, integerArgument2);
    }

    private final static void performAction1365(int[] integerArrayArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        MixedSupport097.performAction1370();
        MixedSupport097.performAction1369(integerArrayArgument1, integerArgument2, integerArgument3);
        MixedSupport097.performAction1360(integerArgument4);
    }

    private final static void performAction1360(int integerArgument1) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        MixedSupport097.performAction1359();
        while (MixedSupport097.computeBoolean1367()) {
          integerLocal1 = integerState0565;
          integerLocal2 = integerState0563;
          integerLocal3 = integerState0561;
          SoftwareRaster.performAction0718(integerLocal1, integerLocal3, integerLocal2 - integerLocal1, integerArgument1);
        }
    }

    private final static void performAction1366(int[] integerArrayArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int[] integerArrayArgument6, int[] integerArrayArgument7) {
        if (integerArrayArgument6 != null &&
          SoftwareRaster.integerState0283 - SoftwareRaster.integerState0280 != integerArrayArgument6.length) {
          throw new IllegalStateException();
        }
        MixedSupport097.performAction1370();
        MixedSupport097.performAction1369(integerArrayArgument1, integerArgument2, integerArgument3);
        MixedSupport097.performAction1362(integerArgument4, integerArgument5, integerArrayArgument6, integerArrayArgument7);
    }

    private final static void performAction1369(int[] integerArrayArgument1, int integerArgument2, int integerArgument3) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        int integerLocal6 = 0;
        int integerLocal7 = 0;
        int integerLocal8 = 0;
        int integerLocal9;
        int[] integerArrayLocal10;
        int integerLocal11;
        int integerLocal12;
        int integerLocal13;
        int integerLocal14;
        int integerLocal15;
        int integerLocal16;
        integerLocal9 = integerState0562 + (integerArgument3 << 1);
        if (integerArrayState0177 == null ||
          !(integerArrayState0177.length >= integerLocal9)) {
          integerArrayLocal10 = new int[integerLocal9];
          for (integerLocal12 = 0; integerLocal12 < integerState0562; integerLocal12++) {
            integerArrayLocal10[integerLocal12] = integerArrayState0177[integerLocal12];
          }
          integerArrayState0177 = integerArrayLocal10;
        }
        integerArgument3 = integerArgument3 + integerArgument2;
        integerLocal11 = integerArgument3 - 2;
        integerLocal15 = integerArgument2;
        integerLocal16 = integerLocal15;
        while (integerLocal15 < integerArgument3) {
          integerLocal13 = integerArrayArgument1[integerLocal11 + 1];
          integerLocal14 = integerArrayArgument1[integerLocal15 + 1];
          if (integerLocal13 >= integerLocal14) {
            if (integerLocal14 < integerLocal13) {
              integerLocal1 = integerState0562;
              integerState0562 = integerState0562 + 1;
              integerArrayState0177[integerLocal1] = integerArrayArgument1[integerLocal15];
              integerLocal2 = integerState0562;
              integerState0562 = integerState0562 + 1;
              integerArrayState0177[integerLocal2] = integerLocal14;
              integerLocal3 = integerState0562;
              integerState0562 = integerState0562 + 1;
              integerArrayState0177[integerLocal3] = integerArrayArgument1[integerLocal11];
              integerLocal4 = integerState0562;
              integerState0562 = integerState0562 + 1;
              integerArrayState0177[integerLocal4] = integerLocal13;
            }
          } else {
            integerLocal5 = integerState0562;
            integerState0562 = integerState0562 + 1;
            integerArrayState0177[integerLocal5] = integerArrayArgument1[integerLocal11];
            integerLocal6 = integerState0562;
            integerState0562 = integerState0562 + 1;
            integerArrayState0177[integerLocal6] = integerLocal13;
            integerLocal7 = integerState0562;
            integerState0562 = integerState0562 + 1;
            integerArrayState0177[integerLocal7] = integerArrayArgument1[integerLocal15];
            integerLocal8 = integerState0562;
            integerState0562 = integerState0562 + 1;
            integerArrayState0177[integerLocal8] = integerLocal14;
          }
          integerLocal11 = integerLocal15;
          integerLocal15 += 2;
        }
    }
}
