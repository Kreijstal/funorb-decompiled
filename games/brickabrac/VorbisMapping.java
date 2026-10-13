/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class VorbisMapping {
    int[] submapResidues;
    int mux;
    int submapCount;
    int[] submapFloors;

    VorbisMapping() {
        int submapIndex = 0;
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
        for (submapIndex = 0; submapIndex < this.submapCount; submapIndex++) {
          VorbisSample.readBits(8);
          this.submapFloors[submapIndex] = VorbisSample.readBits(8);
          this.submapResidues[submapIndex] = VorbisSample.readBits(8);
        }
    }
}
