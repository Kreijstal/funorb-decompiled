/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyDirectSoundBridge implements DirectSoundCompatibility {
    private com.ms.directX.DSBufferDesc[] bufferDescriptors;
    private com.ms.directX.DSCursors[] bufferCursors;

    public LegacyDirectSoundBridge() throws Exception {
        int bufferIndex = 0;
        int bufferIndexLiteralPhase1;
        this.bufferDescriptors = new com.ms.directX.DSBufferDesc[2];
        this.bufferCursors = new com.ms.directX.DSCursors[2];
        com.ms.directX.DirectSound unusedDirectSoundInstance = new com.ms.directX.DirectSound();
        com.ms.directX.WaveFormatEx unusedWaveFormatInstance = new com.ms.directX.WaveFormatEx();
        for (bufferIndex = 0; bufferIndex < 2; bufferIndex++) {
            this.bufferDescriptors[bufferIndex] = new com.ms.directX.DSBufferDesc();
        }
        for (bufferIndexLiteralPhase1 = 0; bufferIndexLiteralPhase1 < 2; bufferIndexLiteralPhase1++) {
            this.bufferCursors[bufferIndexLiteralPhase1] = new com.ms.directX.DSCursors();
        }
    }
}
