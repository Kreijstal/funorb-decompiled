/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class VorbisMapping {
    int[] floorIndices;
    int mux;
    int[] residueIndices;
    int submapCount;

    VorbisMapping() {
        int var1 = 0;
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
        for (var1 = 0; var1 < this.submapCount; var1++) {
            MusicDecoder.readBits(8);
            this.floorIndices[var1] = MusicDecoder.readBits(8);
            this.residueIndices[var1] = MusicDecoder.readBits(8);
        }
    }
}
