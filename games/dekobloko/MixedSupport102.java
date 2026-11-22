/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport102 {
    int integerState0593;
    int[] integerArrayState0185;
    int integerState0594;
    int[] integerArrayState0186;

    MixedSupport102() {
        int integerLocal1 = 0;
        VorbisSample.readBits(16);
        this.integerState0594 = VorbisSample.readBit() != 0 ? VorbisSample.readBits(4) + 1 : 1;
        if (VorbisSample.readBit() != 0) {
          VorbisSample.readBits(8);
        }
        VorbisSample.readBits(2);
        if (this.integerState0594 > 1) {
          this.integerState0593 = VorbisSample.readBits(4);
        }
        this.integerArrayState0185 = new int[this.integerState0594];
        this.integerArrayState0186 = new int[this.integerState0594];
        for (integerLocal1 = 0; integerLocal1 < this.integerState0594; integerLocal1++) {
          VorbisSample.readBits(8);
          this.integerArrayState0185[integerLocal1] = VorbisSample.readBits(8);
          this.integerArrayState0186[integerLocal1] = VorbisSample.readBits(8);
        }
    }
}
