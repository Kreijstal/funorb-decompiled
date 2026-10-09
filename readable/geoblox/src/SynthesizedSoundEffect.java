/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SynthesizedSoundEffect {
    private int loopStartMillis;
    private int loopEndMillis;
    private SynthesizedSoundInstrument[] instruments;

    final PcmSample toPcmSample() {
        byte[] samples = this.mixSamples();
        return new PcmSample(22050, samples, 22050 * this.loopStartMillis / 1000, 22050 * this.loopEndMillis / 1000);
    }

    private final byte[] mixSamples() {
        int sampleIndex = 0;
        int totalDurationMillis;
        int instrumentScanIndex;
        byte[] samples;
        int instrumentIndex;
        int instrumentSampleCount;
        int startSample;
        int mixedSample;
        int[] instrumentSamples;
        int mixedSampleCount;
        totalDurationMillis = 0;
        for (instrumentScanIndex = 0; instrumentScanIndex < 10; instrumentScanIndex++) {
          if (this.instruments[instrumentScanIndex] == null) {
            continue;
          }
          if (this.instruments[instrumentScanIndex].durationMillis + this.instruments[instrumentScanIndex].startDelayMillis <= totalDurationMillis) {
            continue;
          }
          totalDurationMillis = this.instruments[instrumentScanIndex].durationMillis + this.instruments[instrumentScanIndex].startDelayMillis;
        }
        if (totalDurationMillis == 0) {
          return new byte[]{};
        }
        mixedSampleCount = 22050 * totalDurationMillis / 1000;
        samples = new byte[mixedSampleCount];
        instrumentIndex = 0;
        while (true) {
          if (instrumentIndex >= 10) {
            return samples;
          }
          if (this.instruments[instrumentIndex] == null) {
            instrumentIndex++;
            continue;
          }
          instrumentSampleCount = this.instruments[instrumentIndex].durationMillis * 22050 / 1000;
          startSample = this.instruments[instrumentIndex].startDelayMillis * 22050 / 1000;
          instrumentSamples = this.instruments[instrumentIndex].synthesize(instrumentSampleCount, this.instruments[instrumentIndex].durationMillis);
          for (sampleIndex = 0; sampleIndex < instrumentSampleCount; sampleIndex++) {
            mixedSample = samples[sampleIndex + startSample] + (instrumentSamples[sampleIndex] >> 8);
            if ((mixedSample + 128 & -256) != 0) {
              mixedSample = mixedSample >> 31 ^ 127;
            }
            samples[sampleIndex + startSample] = (byte)mixedSample;
          }
          instrumentIndex++;
        }
    }

    private SynthesizedSoundEffect(ByteArrayBuffer buffer) {
        int instrumentIndex = 0;
        int instrumentMarker;
        this.instruments = new SynthesizedSoundInstrument[10];
        for (instrumentIndex = 0; instrumentIndex < 10; instrumentIndex++) {
          instrumentMarker = buffer.readUnsignedByte((byte) 34);
          if (instrumentMarker == 0) {
            continue;
          }
          buffer.position = buffer.position - 1;
          this.instruments[instrumentIndex] = new SynthesizedSoundInstrument();
          this.instruments[instrumentIndex].decode(buffer);
        }
        this.loopStartMillis = buffer.readUnsignedShortBE(true);
        this.loopEndMillis = buffer.readUnsignedShortBE(true);
    }

    final static SynthesizedSoundEffect load(ResourceArchive archive, int groupId, int fileId) {
        byte[] encodedEffect = archive.getFile(groupId, -28153, fileId);
        if (encodedEffect == null) {
            return null;
        }
        return new SynthesizedSoundEffect(new ByteArrayBuffer(encodedEffect));
    }
}
