/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoundEffect {
    private SoundTone[] tones;
    private int loopStartMillis;
    private int loopEndMillis;

    final static SoundEffect load(ResourceArchive archive, int groupId, int fileId) {
        byte[] data = archive.takeFile(fileId, groupId, 4);
        if (data == null) {
          return null;
        }
        return new SoundEffect(new PacketBuffer(data));
    }

    final PcmSound toPcmSound() {
        byte[] samples = this.mix();
        return new PcmSound(22050, samples, 22050 * this.loopStartMillis / 1000, 22050 * this.loopEndMillis / 1000);
    }

    private final byte[] mix() {
        int mixToneIndex = 0;
        int sampleIndex = 0;
        int durationMillis;
        int durationToneIndex;
        byte[] mixedSamples;
        int toneSampleCount;
        int offsetSamples;
        int mixedSample;
        int[] toneSamples;
        int sampleCount;
        durationMillis = 0;
        for (durationToneIndex = 0; durationToneIndex < 10; durationToneIndex++) {
          if (this.tones[durationToneIndex] != null &&
            this.tones[durationToneIndex].durationMillis + this.tones[durationToneIndex].offsetMillis > durationMillis) {
            durationMillis = this.tones[durationToneIndex].durationMillis + this.tones[durationToneIndex].offsetMillis;
          }
        }
        if (durationMillis == 0) {
          return new byte[]{};
        }
        sampleCount = 22050 * durationMillis / 1000;
        mixedSamples = new byte[sampleCount];
        for (mixToneIndex = 0; mixToneIndex < 10; mixToneIndex++) {
          if (this.tones[mixToneIndex] != null) {
            toneSampleCount = this.tones[mixToneIndex].durationMillis * 22050 / 1000;
            offsetSamples = this.tones[mixToneIndex].offsetMillis * 22050 / 1000;
            toneSamples = this.tones[mixToneIndex].synthesize(toneSampleCount, this.tones[mixToneIndex].durationMillis);
            for (sampleIndex = 0; sampleIndex < toneSampleCount; sampleIndex++) {
              mixedSample = mixedSamples[sampleIndex + offsetSamples] + (toneSamples[sampleIndex] >> 8);
              if ((mixedSample + 128 & -256) != 0) {
                mixedSample = mixedSample >> 31 ^ 127;
              }
              mixedSamples[sampleIndex + offsetSamples] = (byte)mixedSample;
            }
          }
        }
        return mixedSamples;
    }

    private SoundEffect(PacketBuffer packet) {
        int toneIndex = 0;
        int presentWaveform;
        this.tones = new SoundTone[10];
        for (toneIndex = 0; toneIndex < 10; toneIndex++) {
          presentWaveform = packet.readUnsignedByte(255);
          if (presentWaveform != 0) {
            packet.position = packet.position - 1;
            this.tones[toneIndex] = new SoundTone();
            this.tones[toneIndex].decode(packet);
          }
        }
        this.loopStartMillis = packet.readUnsignedShort(65280);
        this.loopEndMillis = packet.readUnsignedShort(65280);
    }
}
