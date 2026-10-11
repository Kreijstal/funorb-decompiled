/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport012 {
    private int integerState0075;
    private int[] integerArrayState0019;
    private int integerState0076;
    private int integerState0077;
    private int integerState0078;
    private int integerState0079;
    private int integerState0080;

    final void performAction0184(float[] floatArrayArgument1, int integerArgument2, boolean booleanArgument3) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        int integerLocal5;
        int integerLocal6;
        int integerLocal7;
        int[] integerArrayLocal8;
        int integerLocal9;
        int integerLocal10;
        int integerLocal11;
        int integerLocal12;
        int integerLocal13;
        MixedSupport065 mixedSupport065Local14;
        int integerLocal15;
        int[] integerArrayLocal16;
        int[] integerArrayLocal17;
        float[] floatArrayLocal18;
        float[] floatArrayLocal19;
        int integerLocal20;
        int integerLocal21;
        int integerLocal22;
        int[] integerArrayLocal23;
        for (integerLocal5 = 0; integerLocal5 < integerArgument2; integerLocal5++) {
          floatArrayArgument1[integerLocal5] = 0.0f;
        }
        if (booleanArgument3) {
          return;
        }
        integerLocal20 = VorbisSample.mixedSupport065ArrayState0001[this.integerState0078].integerState0338;
        integerLocal6 = this.integerState0077 - this.integerState0080;
        integerLocal7 = integerLocal6 / this.integerState0076;
        integerArrayLocal17 = new int[integerLocal7];
        integerArrayLocal16 = integerArrayLocal17;
        integerArrayLocal8 = integerArrayLocal16;
        for (integerLocal1 = 0; integerLocal1 < 8; integerLocal1++) {
          integerLocal9 = 0;
          while (integerLocal9 < integerLocal7) {
            if (integerLocal1 == 0) {
              integerLocal10 = VorbisSample.mixedSupport065ArrayState0001[this.integerState0078].computeInteger0855();
              for (integerLocal11 = integerLocal20 - 1; integerLocal11 >= 0; integerLocal11--) {
                if (integerLocal9 + integerLocal11 < integerLocal7) {
                  integerArrayLocal8[integerLocal9 + integerLocal11] = integerLocal10 % this.integerState0075;
                }
                integerLocal10 = integerLocal10 / this.integerState0075;
              }
            }
            integerArrayLocal23 = integerArrayLocal16;
            integerLocal21 = 0;
            while (integerLocal21 < integerLocal20) {
              integerLocal22 = integerArrayLocal23[integerLocal9];
              integerLocal12 = this.integerArrayState0019[integerLocal22 * 8 + integerLocal1];
              if (integerLocal12 >= 0) {
                integerLocal13 = this.integerState0080 + integerLocal9 * this.integerState0076;
                mixedSupport065Local14 = VorbisSample.mixedSupport065ArrayState0001[integerLocal12];
                if (this.integerState0079 != 0) {
                  integerLocal15 = 0;
                  while (integerLocal15 < this.integerState0076) {
                    floatArrayLocal19 = mixedSupport065Local14.computeFloatArray0857();
                    for (integerLocal2 = 0; integerLocal2 < mixedSupport065Local14.integerState0338; integerLocal2++) {
                      floatArrayArgument1[integerLocal13 + integerLocal15] = floatArrayArgument1[integerLocal13 + integerLocal15] + floatArrayLocal19[integerLocal2];
                      integerLocal15++;
                    }
                  }
                } else {
                  integerLocal15 = this.integerState0076 / mixedSupport065Local14.integerState0338;
                  for (integerLocal3 = 0; integerLocal3 < integerLocal15; integerLocal3++) {
                    floatArrayLocal18 = mixedSupport065Local14.computeFloatArray0857();
                    for (integerLocal4 = 0; integerLocal4 < mixedSupport065Local14.integerState0338; integerLocal4++) {
                      floatArrayArgument1[integerLocal13 + integerLocal3 + integerLocal4 * integerLocal15] = floatArrayArgument1[integerLocal13 + integerLocal3 + integerLocal4 * integerLocal15] + floatArrayLocal18[integerLocal4];
                    }
                  }
                }
              }
              integerLocal9++;
              if (integerLocal9 >= integerLocal7) {
                break;
              }
              integerLocal21++;
            }
          }
        }
        return;
    }

    MixedSupport012() {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        int integerLocal5;
        this.integerState0079 = VorbisSample.computeInteger1923(16);
        this.integerState0080 = VorbisSample.computeInteger1923(24);
        this.integerState0077 = VorbisSample.computeInteger1923(24);
        this.integerState0076 = VorbisSample.computeInteger1923(24) + 1;
        this.integerState0075 = VorbisSample.computeInteger1923(6) + 1;
        this.integerState0078 = VorbisSample.computeInteger1923(8);
        int[] integerArrayLocal6 = new int[this.integerState0075];
        for (integerLocal4 = 0; integerLocal4 < this.integerState0075; integerLocal4++) {
          integerLocal1 = 0;
          integerLocal2 = VorbisSample.computeInteger1923(3);
          integerLocal3 = VorbisSample.computeInteger1920() != 0 ? 1 : 0;
          if (integerLocal3 != 0) {
            integerLocal1 = VorbisSample.computeInteger1923(5);
          }
          integerArrayLocal6[integerLocal4] = integerLocal1 << 3 | integerLocal2;
        }
        this.integerArrayState0019 = new int[this.integerState0075 * 8];
        int integerLocal7 = 0;
        integerLocal5 = integerLocal7;
        while (integerLocal7 < this.integerState0075 * 8) {
          this.integerArrayState0019[integerLocal7] = (integerArrayLocal6[integerLocal7 >> 3] & 1 << (integerLocal7 & 7)) != 0 ? VorbisSample.computeInteger1923(8) : -1;
          integerLocal7++;
        }
    }
}
