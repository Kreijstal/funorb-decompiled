/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SynthesizedSoundEffect {
    private int loopEndMilliseconds;
    private hu[] voices;
    private int loopStartMilliseconds;

    final PcmSample toPcmSample() {
        byte[] samples = this.synthesize();
        return new PcmSample(22050, samples, 22050 * this.loopStartMilliseconds / 1000, 22050 * this.loopEndMilliseconds / 1000);
    }

    final static SynthesizedSoundEffect load(ResourceArchive archive, int groupId, int fileId) {
        byte[] encodedEffect = archive.getFile((byte) 119, fileId, groupId);
        if (encodedEffect == null) {
          return null;
        }
        return new SynthesizedSoundEffect(new PacketBuffer(encodedEffect));
    }

    private final byte[] synthesize() {
        int voiceIndex = 0;
        int sampleIndex = 0;
        int durationMilliseconds;
        int durationVoiceIndex;
        byte[] samples;
        int voiceSampleCount;
        int voiceSampleOffset;
        int mixedSample;
        int[] voiceSamples;
        int sampleCount;
        durationMilliseconds = 0;
        for (durationVoiceIndex = 0; durationVoiceIndex < 10; durationVoiceIndex++) {
          if (this.voices[durationVoiceIndex] != null &&
            this.voices[durationVoiceIndex].field_r + this.voices[durationVoiceIndex].field_e > durationMilliseconds) {
            durationMilliseconds = this.voices[durationVoiceIndex].field_r + this.voices[durationVoiceIndex].field_e;
          }
        }
        if (durationMilliseconds == 0) {
          return new byte[]{};
        }
        sampleCount = 22050 * durationMilliseconds / 1000;
        samples = new byte[sampleCount];
        for (voiceIndex = 0; voiceIndex < 10; voiceIndex++) {
          if (this.voices[voiceIndex] != null) {
            voiceSampleCount = this.voices[voiceIndex].field_r * 22050 / 1000;
            voiceSampleOffset = this.voices[voiceIndex].field_e * 22050 / 1000;
            voiceSamples = this.voices[voiceIndex].a(voiceSampleCount, this.voices[voiceIndex].field_r);
            for (sampleIndex = 0; sampleIndex < voiceSampleCount; sampleIndex++) {
              mixedSample = samples[sampleIndex + voiceSampleOffset] + (voiceSamples[sampleIndex] >> 8);
              if ((mixedSample + 128 & -256) != 0) {
                mixedSample = mixedSample >> 31 ^ 127;
              }
              samples[sampleIndex + voiceSampleOffset] = (byte)mixedSample;
            }
          }
        }
        return samples;
    }

    private SynthesizedSoundEffect(PacketBuffer buffer) {
        int voiceIndex = 0;
        int voiceMarker;
        this.voices = new hu[10];
        for (voiceIndex = 0; voiceIndex < 10; voiceIndex++) {
          voiceMarker = buffer.readUnsignedByte(0);
          if (voiceMarker != 0) {
            buffer.position = buffer.position - 1;
            this.voices[voiceIndex] = new hu();
            this.voices[voiceIndex].a(buffer);
          }
        }
        this.loopStartMilliseconds = buffer.readUnsignedShort((byte) -104);
        this.loopEndMilliseconds = buffer.readUnsignedShort((byte) -104);
    }
}
