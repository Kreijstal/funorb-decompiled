/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport107 {
    int integerState0593;
    int[] integerArrayState0185;
    int integerState0594;
    int[] integerArrayState0186;

    MixedSupport107() {
        int integerLocal1 = 0;
        VorbisSample.computeInteger1923(16);
        this.integerState0594 = VorbisSample.computeInteger1920() != 0 ? VorbisSample.computeInteger1923(4) + 1 : 1;
        if (VorbisSample.computeInteger1920() != 0) {
          VorbisSample.computeInteger1923(8);
        }
        VorbisSample.computeInteger1923(2);
        if (this.integerState0594 > 1) {
          this.integerState0593 = VorbisSample.computeInteger1923(4);
        }
        this.integerArrayState0185 = new int[this.integerState0594];
        this.integerArrayState0186 = new int[this.integerState0594];
        for (integerLocal1 = 0; integerLocal1 < this.integerState0594; integerLocal1++) {
          VorbisSample.computeInteger1923(8);
          this.integerArrayState0185[integerLocal1] = VorbisSample.computeInteger1923(8);
          this.integerArrayState0186[integerLocal1] = VorbisSample.computeInteger1923(8);
        }
    }
}
