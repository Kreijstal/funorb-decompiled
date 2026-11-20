/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class VorbisMapping {
    int[] submapFloors;
    int[] submapResidues;
    int submapCount;
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
        this.submapFloors = new int[this.submapCount];
        this.submapResidues = new int[this.submapCount];
        for (var1 = 0; var1 < this.submapCount; var1++) {
          VorbisSample.readBits(8);
          this.submapFloors[var1] = VorbisSample.readBits(8);
          this.submapResidues[var1] = VorbisSample.readBits(8);
        }
    }
}
