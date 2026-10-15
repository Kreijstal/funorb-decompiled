/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MicrosoftDirectSoundInitializer implements DirectSoundInitializerMarker {
    private com.ms.directX.DSBufferDesc[] bufferDescriptors;
    private com.ms.directX.DSCursors[] bufferCursors;

    public MicrosoftDirectSoundInitializer() throws Exception {
        int descriptorIndex = 0;
        int cursorIndex;
        this.bufferDescriptors = new com.ms.directX.DSBufferDesc[2];
        this.bufferCursors = new com.ms.directX.DSCursors[2];
        com.ms.directX.DirectSound discardedDirectSound = new com.ms.directX.DirectSound();
        com.ms.directX.WaveFormatEx discardedWaveFormat = new com.ms.directX.WaveFormatEx();
        for (descriptorIndex = 0; descriptorIndex < 2; descriptorIndex++) {
          this.bufferDescriptors[descriptorIndex] = new com.ms.directX.DSBufferDesc();
        }
        for (cursorIndex = 0; cursorIndex < 2; cursorIndex++) {
          this.bufferCursors[cursorIndex] = new com.ms.directX.DSCursors();
        }
    }
}
