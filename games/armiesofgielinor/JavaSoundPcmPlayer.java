/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class JavaSoundPcmPlayer extends PcmPlayer {
    private int lineCapacityFrames;
    private javax.sound.sampled.SourceDataLine line;
    private byte[] encodedSamples;
    private boolean reopenOnFlush;
    private javax.sound.sampled.AudioFormat format;
    private static String mixerNameMarker;

    final void writeDevice() {
        int sampleIndex = 0;
        int accumulator = 0;
        int sampleCount = 256;
        if (stereo) {
          sampleCount = sampleCount << 1;
        }
        for (sampleIndex = 0; sampleIndex < sampleCount; sampleIndex++) {
          accumulator = this.samples[sampleIndex];
          if ((accumulator + 8388608 & -16777216) != 0) {
            accumulator = 8388607 ^ accumulator >> 31;
          }
          this.encodedSamples[sampleIndex * 2] = (byte)(accumulator >> 8);
          this.encodedSamples[sampleIndex * 2 + 1] = (byte)(accumulator >> 16);
        }
        this.line.write(this.encodedSamples, 0, sampleCount << 1);
    }

    final int getQueuedFrames() {
        return this.lineCapacityFrames - (this.line.available() >> (stereo ? 2 : 1));
    }

    final void closeDevice() {
        if (this.line != null) {
          this.line.close();
          this.line = null;
        }
    }

    JavaSoundPcmPlayer() {
        this.reopenOnFlush = false;
    }

    final void initDevice(java.awt.Component component) {
        int mixerIndex = 0;
        javax.sound.sampled.Mixer.Info[] mixerInfos;
        javax.sound.sampled.Mixer.Info[] mixerInfosAlias;
        javax.sound.sampled.Mixer.Info mixerInfo;
        Object unusedFormatOwner;
        javax.sound.sampled.AudioFormat unusedFormatReference;
        javax.sound.sampled.AudioFormat unusedFormatAlias;
        float sampleRate;
        int sampleBits;
        javax.sound.sampled.AudioFormat unusedChannelFormat = null;
        javax.sound.sampled.AudioFormat unusedChannelFormatAlias = null;
        int channels = 0;
        int blockFrames = 0;
        int bytesPerFrameShift = 0;
        String mixerName;
        mixerInfos = javax.sound.sampled.AudioSystem.getMixerInfo();
        if (mixerInfos != null) {
          mixerInfosAlias = mixerInfos;
          for (mixerIndex = 0; mixerIndex < mixerInfosAlias.length; mixerIndex++) {
            mixerInfo = mixerInfosAlias[mixerIndex];
            if (mixerInfo != null) {
              mixerName = mixerInfo.getName();
              if (mixerName != null &&
                mixerName.toLowerCase().indexOf(mixerNameMarker) >= 0) {
                this.reopenOnFlush = true;
              }
            }
          }
        }
        unusedFormatOwner = this;
        unusedFormatReference = null;
        unusedFormatAlias = null;
        sampleRate = (float)outputSampleRate;
        sampleBits = 16;
        if (!stereo) {
          unusedChannelFormat = null;
          unusedChannelFormatAlias = null;
          channels = 1;
        } else {
          unusedChannelFormat = null;
          unusedChannelFormatAlias = null;
          channels = 2;
        }
        this.format = new javax.sound.sampled.AudioFormat(sampleRate, sampleBits, channels, true, false);
        blockFrames = 256;
        if (!stereo) {
          bytesPerFrameShift = 1;
        } else {
          bytesPerFrameShift = 2;
        }
        this.encodedSamples = new byte[blockFrames << bytesPerFrameShift];
    }

    final void flushDevice() throws javax.sound.sampled.LineUnavailableException {
        javax.sound.sampled.DataLine.Info lineInfo = null;
        this.line.flush();
        if (this.reopenOnFlush) {
          this.line.close();
          this.line = null;
          lineInfo = new javax.sound.sampled.DataLine.Info(javax.sound.sampled.SourceDataLine.class, this.format, this.lineCapacityFrames << (stereo ? 2 : 1));
          this.line = (javax.sound.sampled.SourceDataLine) ((Object) javax.sound.sampled.AudioSystem.getLine((javax.sound.sampled.Line.Info) ((Object) lineInfo)));
          this.line.open();
          this.line.start();
        }
    }

    final void openDevice(int capacityFrames) throws javax.sound.sampled.LineUnavailableException {
        javax.sound.sampled.DataLine.Info lineInfo = null;
        try {
          lineInfo = new javax.sound.sampled.DataLine.Info(javax.sound.sampled.SourceDataLine.class, this.format, capacityFrames << (stereo ? 2 : 1));
          this.line = (javax.sound.sampled.SourceDataLine) ((Object) javax.sound.sampled.AudioSystem.getLine((javax.sound.sampled.Line.Info) ((Object) lineInfo)));
          this.line.open();
          this.line.start();
          this.lineCapacityFrames = capacityFrames;
        } catch (javax.sound.sampled.LineUnavailableException lineFailure) {
          if (eb.bitCount((byte) -110, capacityFrames) != 1) {
            this.openDevice(rs.nextPowerOfTwo((byte) 84, capacityFrames));
            return;
          }
          this.line = null;
          throw lineFailure;
        }
    }

    static {
        mixerNameMarker = "soundmax";
    }
}
