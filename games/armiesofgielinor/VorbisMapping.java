/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class VorbisMapping {
    int[] residueIds;
    int submapCount;
    int selectedSubmap;
    int[] floorIds;

    VorbisMapping() {
        int submapIndex = 0;
        VorbisSample.readBits(16);
        this.submapCount = VorbisSample.readBit() != 0 ? VorbisSample.readBits(4) + 1 : 1;
        if (VorbisSample.readBit() != 0) {
          VorbisSample.readBits(8);
        }
        VorbisSample.readBits(2);
        if (this.submapCount > 1) {
          this.selectedSubmap = VorbisSample.readBits(4);
        }
        this.floorIds = new int[this.submapCount];
        this.residueIds = new int[this.submapCount];
        for (submapIndex = 0; submapIndex < this.submapCount; submapIndex++) {
          VorbisSample.readBits(8);
          this.floorIds[submapIndex] = VorbisSample.readBits(8);
          this.residueIds[submapIndex] = VorbisSample.readBits(8);
        }
    }
}
