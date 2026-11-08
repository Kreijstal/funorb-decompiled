/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class VorbisMapping {
    int[] floorIds;
    int submapCount;
    int[] residueIds;
    int mux;

    VorbisMapping() {
        int var1 = 0;
        VorbisSample.readBits(16);
        this.submapCount = VorbisSample.readBit() != 0 ? VorbisSample.readBits(4) + 1 : 1;
        if (VorbisSample.readBit() != 0) {
          VorbisSample.readBits(8);
        }
        VorbisSample.readBits(2);
        if (this.submapCount > 1) {
          this.mux = VorbisSample.readBits(4);
        }
        this.floorIds = new int[this.submapCount];
        this.residueIds = new int[this.submapCount];
        for (var1 = 0; var1 < this.submapCount; var1++) {
          VorbisSample.readBits(8);
          this.floorIds[var1] = VorbisSample.readBits(8);
          this.residueIds[var1] = VorbisSample.readBits(8);
        }
    }
}
