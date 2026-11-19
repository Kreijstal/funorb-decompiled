/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DirectSoundBackend implements LegacyAudioBackend {
    private com.ms.directX.DSCursors[] bufferCursors;
    private com.ms.directX.DSBufferDesc[] bufferDescriptions;

    public DirectSoundBackend() throws Exception {
        int var1 = 0;
        int var1Lifetime1;
        this.bufferCursors = new com.ms.directX.DSCursors[2];
        this.bufferDescriptions = new com.ms.directX.DSBufferDesc[2];
        com.ms.directX.DirectSound discarded$0 = new com.ms.directX.DirectSound();
        com.ms.directX.WaveFormatEx discarded$1 = new com.ms.directX.WaveFormatEx();
        for (var1 = 0; var1 < 2; var1++) {
          this.bufferDescriptions[var1] = new com.ms.directX.DSBufferDesc();
        }
        for (var1Lifetime1 = 0; var1Lifetime1 < 2; var1Lifetime1++) {
          this.bufferCursors[var1Lifetime1] = new com.ms.directX.DSCursors();
        }
    }
}
