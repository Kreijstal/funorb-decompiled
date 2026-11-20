/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyDirectSoundBuffers implements DirectSoundBufferMarker {
    private com.ms.directX.DSBufferDesc[] descriptors;
    private com.ms.directX.DSCursors[] cursors;

    public LegacyDirectSoundBuffers() throws Exception {
        int var1 = 0;
        int var1Lifetime1;
        this.descriptors = new com.ms.directX.DSBufferDesc[2];
        this.cursors = new com.ms.directX.DSCursors[2];
        com.ms.directX.DirectSound discarded$0 = new com.ms.directX.DirectSound();
        com.ms.directX.WaveFormatEx discarded$1 = new com.ms.directX.WaveFormatEx();
        for (var1 = 0; var1 < 2; var1++) {
          this.descriptors[var1] = new com.ms.directX.DSBufferDesc();
        }
        for (var1Lifetime1 = 0; var1Lifetime1 < 2; var1Lifetime1++) {
          this.cursors[var1Lifetime1] = new com.ms.directX.DSCursors();
        }
    }
}
