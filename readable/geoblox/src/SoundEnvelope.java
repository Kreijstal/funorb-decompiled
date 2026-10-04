/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoundEnvelope {
    int endValue;
    private int segmentEndSample;
    private int[] segmentFractionsQ16;
    private int elapsedSamples;
    private int segmentCount;
    private int segmentIndex;
    private int amplitudeQ15;
    int waveform;
    private int amplitudeStepQ15;
    int startValue;
    private int[] segmentLevels;

    final void reset() {
        this.segmentEndSample = 0;
        this.segmentIndex = 0;
        this.amplitudeStepQ15 = 0;
        this.amplitudeQ15 = 0;
        this.elapsedSamples = 0;
    }

    final void decode(ByteArrayBuffer buffer) {
        this.waveform = buffer.readUnsignedByte((byte) 34);
        this.startValue = buffer.readIntBE((byte) -82);
        this.endValue = buffer.readIntBE((byte) -52);
        this.decodeSegments(buffer);
    }

    final void decodeSegments(ByteArrayBuffer buffer) {
        int segmentIndex = 0;
        this.segmentCount = buffer.readUnsignedByte((byte) 34);
        this.segmentFractionsQ16 = new int[this.segmentCount];
        this.segmentLevels = new int[this.segmentCount];
        for (segmentIndex = 0; segmentIndex < this.segmentCount; segmentIndex++) {
            this.segmentFractionsQ16[segmentIndex] = buffer.readUnsignedShortBE(true);
            this.segmentLevels[segmentIndex] = buffer.readUnsignedShortBE(true);
        }
    }

    final int advance(int totalSamples) {
        int previousSegmentIndex = 0;
        if (this.elapsedSamples >= this.segmentEndSample) {
            previousSegmentIndex = this.segmentIndex;
            this.segmentIndex = this.segmentIndex + 1;
            this.amplitudeQ15 = this.segmentLevels[previousSegmentIndex] << 15;
            if (this.segmentIndex >= this.segmentCount) {
                this.segmentIndex = this.segmentCount - 1;
            }
            this.segmentEndSample = (int)((double)this.segmentFractionsQ16[this.segmentIndex] / 65536.0 * (double)totalSamples);
            if (this.segmentEndSample > this.elapsedSamples) {
                this.amplitudeStepQ15 = ((this.segmentLevels[this.segmentIndex] << 15) - this.amplitudeQ15) / (this.segmentEndSample - this.elapsedSamples);
            }
        }
        this.amplitudeQ15 = this.amplitudeQ15 + this.amplitudeStepQ15;
        this.elapsedSamples = this.elapsedSamples + 1;
        return this.amplitudeQ15 - this.amplitudeStepQ15 >> 15;
    }

    SoundEnvelope() {
        this.segmentCount = 2;
        this.segmentFractionsQ16 = new int[2];
        this.segmentLevels = new int[2];
        this.segmentFractionsQ16[0] = 0;
        this.segmentFractionsQ16[1] = 65535;
        this.segmentLevels[0] = 0;
        this.segmentLevels[1] = 65535;
    }
}
