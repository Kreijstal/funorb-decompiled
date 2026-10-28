/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class VorbisMapping {
    int[] submapFloors;
    int[] submapResidues;
    int submaps;
    int mux;

    VorbisMapping() {
        VorbisSample.readBits(16);
        this.submaps = VorbisSample.readBit() != 0 ? VorbisSample.readBits(4) + 1 : 1;
        if (VorbisSample.readBit() != 0) {
          VorbisSample.readBits(8);
        }
        VorbisSample.readBits(2);
        if (this.submaps > 1) {
          this.mux = VorbisSample.readBits(4);
        }
        this.submapFloors = new int[this.submaps];
        this.submapResidues = new int[this.submaps];
        for (int var1 = 0; var1 < this.submaps; var1++) {
          VorbisSample.readBits(8);
          this.submapFloors[var1] = VorbisSample.readBits(8);
          this.submapResidues[var1] = VorbisSample.readBits(8);
        }
    }
}
