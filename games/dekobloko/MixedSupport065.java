/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport065 {
    private int[] integerArrayState0112;
    private int integerState0337;
    private int[] integerArrayState0113;
    int integerState0338;
    private float[][] floatArrayArrayState0002;
    private int[] integerArrayState0114;

    private final static int computeInteger0856(int integerArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        for (integerLocal1 = (int)Math.pow((double)integerArgument1, 1.0 / (double)integerArgument2) + 1; UiComponentPart032.computeInteger1926(integerLocal1, integerArgument2, false) > integerArgument1; integerLocal1--) {
        }
        return integerLocal1;
    }

    private final void performAction0858() {
        int[] integerArrayLocal1;
        int integerLocal2;
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
        int[] integerArrayLocal13;
        int[] integerArrayLocal14;
        int[] integerArrayLocal15;
        int integerLocal16;
        int integerLocal17;
        int integerLocal18;
        int integerLocal19;
        int integerLocal20;
        int integerLocal21;
        int integerLocal22;
        int integerLocal23;
        int integerLocal24;
        integerArrayLocal15 = new int[this.integerState0337];
        integerArrayLocal14 = new int[33];
        integerArrayLocal13 = integerArrayLocal14;
        integerArrayLocal1 = integerArrayLocal13;
        for (integerLocal3 = 0; integerLocal3 < this.integerState0337; integerLocal3++) {
          integerLocal4 = this.integerArrayState0114[integerLocal3];
          if (integerLocal4 != 0) {
            {
              integerLocal5 = 1 << 32 - integerLocal4;
              integerLocal6 = integerArrayLocal14[integerLocal4];
              integerArrayLocal15[integerLocal3] = integerLocal6;
              if ((integerLocal6 & integerLocal5) == 0) {
                integerLocal7 = integerLocal6 | integerLocal5;
                for (integerLocal8 = integerLocal4 - 1; integerLocal8 >= 1; integerLocal8--) {
                  integerLocal10 = integerArrayLocal14[integerLocal8];
                  if (integerLocal10 != integerLocal6) {
                    break;
                  }
                  integerLocal11 = 1 << 32 - integerLocal8;
                  if ((integerLocal10 & integerLocal11) != 0) {
                    integerArrayLocal1[integerLocal8] = integerArrayLocal1[integerLocal8 - 1];
                    break;
                  }
                  integerArrayLocal1[integerLocal8] = integerLocal10 | integerLocal11;
                }
              } else {
                integerLocal7 = integerArrayLocal1[integerLocal4 - 1];
              }
            }
            integerArrayLocal14[integerLocal4] = integerLocal7;
            for (integerLocal23 = integerLocal4 + 1; integerLocal23 <= 32; integerLocal23++) {
              integerLocal24 = integerArrayLocal14[integerLocal23];
              if (integerLocal24 == integerLocal6) {
                integerArrayLocal14[integerLocal23] = integerLocal7;
              }
            }
          }
        }
        this.integerArrayState0112 = new int[8];
        integerLocal2 = 0;
        for (integerLocal16 = 0; integerLocal16 < this.integerState0337; integerLocal16++) {
          integerLocal17 = this.integerArrayState0114[integerLocal16];
          if (integerLocal17 != 0) {
            integerLocal18 = integerArrayLocal15[integerLocal16];
            integerLocal19 = 0;
            for (integerLocal20 = 0; integerLocal20 < integerLocal17; integerLocal20++) {
              integerLocal21 = -2147483648 >>> integerLocal20;
              if ((integerLocal18 & integerLocal21) == 0) {
                integerLocal19++;
              } else {
                if (this.integerArrayState0112[integerLocal19] == 0) {
                  this.integerArrayState0112[integerLocal19] = integerLocal2;
                }
                integerLocal19 = this.integerArrayState0112[integerLocal19];
              }
              if (integerLocal19 >= this.integerArrayState0112.length) {
                integerArrayLocal9 = new int[this.integerArrayState0112.length * 2];
                integerLocal12 = 0;
                integerLocal22 = integerLocal12;
                while (integerLocal12 < this.integerArrayState0112.length) {
                  integerArrayLocal9[integerLocal12] = this.integerArrayState0112[integerLocal12];
                  integerLocal12++;
                }
                this.integerArrayState0112 = integerArrayLocal9;
              }
              integerLocal21 = integerLocal21 >>> 1;
            }
            this.integerArrayState0112[integerLocal19] = ~integerLocal16;
            if (integerLocal19 >= integerLocal2) {
              integerLocal2 = integerLocal19 + 1;
            }
          }
        }
    }

    final float[] computeFloatArray0857() {
        return this.floatArrayArrayState0002[this.computeInteger0855()];
    }

    MixedSupport065() {
        int previousIntegerLocal1 = 0;
        int stackIntegerLocal2 = 0;
        int stackIntegerLocal3 = 0;
        int stackIntegerLocal4 = 0;
        int integerLocal5;
        int integerLocal6;
        int integerLocal7;
        float floatLocal8;
        int integerLocal9;
        float floatLocal10;
        int integerLocal11;
        int integerLocal12;
        int integerLocal13;
        int integerLocal14;
        float floatLocal15;
        int integerLocal16;
        int integerLocal17;
        float floatLocal18;
        int integerLocal19;
        float floatLocal20;
        int integerLocal21;
        int integerLocal22;
        int integerLocal23;
        int integerLocal24;
        VorbisSample.computeInteger1923(24);
        this.integerState0338 = VorbisSample.computeInteger1923(16);
        this.integerState0337 = VorbisSample.computeInteger1923(24);
        this.integerArrayState0114 = new int[this.integerState0337];
        stackIntegerLocal2 = (VorbisSample.computeInteger1920() == 0) ? 0 : 1;
        integerLocal5 = stackIntegerLocal2;
        if (integerLocal5 != 0) {
          integerLocal6 = 0;
          integerLocal7 = VorbisSample.computeInteger1923(5) + 1;
          while (integerLocal6 < this.integerState0337) {
            integerLocal9 = VorbisSample.computeInteger1923(SceneWidgetPart010.computeInteger1667((byte) 120, this.integerState0337 - integerLocal6));
            for (integerLocal11 = 0; integerLocal11 < integerLocal9; integerLocal11++) {
              previousIntegerLocal1 = integerLocal6;
              integerLocal6++;
              this.integerArrayState0114[previousIntegerLocal1] = integerLocal7;
            }
            integerLocal7++;
          }
        } else {
          stackIntegerLocal3 = (VorbisSample.computeInteger1920() == 0) ? 0 : 1;
          integerLocal6 = stackIntegerLocal3;
          integerLocal21 = 0;
          integerLocal7 = integerLocal21;
          while (integerLocal21 < this.integerState0337) {
            if (integerLocal6 != 0 &&
              VorbisSample.computeInteger1920() == 0) {
              this.integerArrayState0114[integerLocal21] = 0;
            } else {
              this.integerArrayState0114[integerLocal21] = VorbisSample.computeInteger1923(5) + 1;
            }
            integerLocal21++;
          }
        }
        this.performAction0858();
        integerLocal22 = VorbisSample.computeInteger1923(4);
        if (integerLocal22 > 0) {
          floatLocal8 = VorbisSample.computeFloat1913(VorbisSample.computeInteger1923(32));
          floatLocal10 = VorbisSample.computeFloat1913(VorbisSample.computeInteger1923(32));
          integerLocal23 = VorbisSample.computeInteger1923(4) + 1;
          stackIntegerLocal4 = (VorbisSample.computeInteger1920() == 0) ? 0 : 1;
          integerLocal12 = stackIntegerLocal4;
          if (integerLocal22 != 1) {
            integerLocal13 = this.integerState0337 * this.integerState0338;
          } else {
            integerLocal13 = MixedSupport065.computeInteger0856(this.integerState0337, this.integerState0338);
          }
          this.integerArrayState0113 = new int[integerLocal13];
          for (integerLocal14 = 0; integerLocal14 < integerLocal13; integerLocal14++) {
            this.integerArrayState0113[integerLocal14] = VorbisSample.computeInteger1923(integerLocal23);
          }
          this.floatArrayArrayState0002 = new float[this.integerState0337][this.integerState0338];
          if (integerLocal22 != 1) {
            for (integerLocal24 = 0; integerLocal24 < this.integerState0337; integerLocal24++) {
              floatLocal15 = 0.0f;
              integerLocal16 = integerLocal24 * this.integerState0338;
              for (integerLocal17 = 0; integerLocal17 < this.integerState0338; integerLocal17++) {
                floatLocal18 = (float)this.integerArrayState0113[integerLocal16] * floatLocal10 + floatLocal8 + floatLocal15;
                this.floatArrayArrayState0002[integerLocal24][integerLocal17] = floatLocal18;
                if (integerLocal12 != 0) {
                  floatLocal15 = floatLocal18;
                }
                integerLocal16++;
              }
            }
          } else {
            for (integerLocal24 = 0; integerLocal24 < this.integerState0337; integerLocal24++) {
              floatLocal15 = 0.0f;
              integerLocal16 = 1;
              for (integerLocal17 = 0; integerLocal17 < this.integerState0338; integerLocal17++) {
                integerLocal19 = integerLocal24 / integerLocal16 % integerLocal13;
                floatLocal20 = (float)this.integerArrayState0113[integerLocal19] * floatLocal10 + floatLocal8 + floatLocal15;
                this.floatArrayArrayState0002[integerLocal24][integerLocal17] = floatLocal20;
                if (integerLocal12 != 0) {
                  floatLocal15 = floatLocal20;
                }
                integerLocal16 = integerLocal16 * integerLocal13;
              }
            }
          }
        }
    }

    final int computeInteger0855() {
        int integerLocal1 = 0;
        while (this.integerArrayState0112[integerLocal1] >= 0) {
          integerLocal1 = VorbisSample.computeInteger1920() != 0 ? this.integerArrayState0112[integerLocal1] : integerLocal1 + 1;
        }
        return ~this.integerArrayState0112[integerLocal1];
    }
}
