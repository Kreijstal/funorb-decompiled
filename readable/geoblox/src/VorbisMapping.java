/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class VorbisMapping {
    int[] floorIndices;
    int mux;
    int[] residueIndices;
    int submapCount;

    VorbisMapping() {
        int submapIndex = 0;
        MusicDecoder.readBits(16);
        this.submapCount = MusicDecoder.readBit() != 0 ? MusicDecoder.readBits(4) + 1 : 1;
        if (MusicDecoder.readBit() != 0) {
            MusicDecoder.readBits(8);
        }
        MusicDecoder.readBits(2);
        if (this.submapCount > 1) {
            this.mux = MusicDecoder.readBits(4);
        }
        this.floorIndices = new int[this.submapCount];
        this.residueIndices = new int[this.submapCount];
        for (submapIndex = 0; submapIndex < this.submapCount; submapIndex++) {
            MusicDecoder.readBits(8);
            this.floorIndices[submapIndex] = MusicDecoder.readBits(8);
            this.residueIndices[submapIndex] = MusicDecoder.readBits(8);
        }
    }
}
