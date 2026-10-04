/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class JavaSoundAudioOutput extends AudioOutput {
    private javax.sound.sampled.SourceDataLine line;
    private int lineCapacityFrames;
    private byte[] pcm16Bytes;
    private boolean reopenLineAfterFlush;
    private javax.sound.sampled.AudioFormat audioFormat;
    private static String soundMaxMixerNameFragment;

    final int getQueuedFrames() {
        return this.lineCapacityFrames - (this.line.available() >> (stereoEnabled ? 2 : 1));
    }

    final void closeDevice() {
        if (this.line != null) {
            this.line.close();
            this.line = null;
        }
    }

    final void writeMixBlock() {
        int sampleIndex = 0;
        int sampleValue = 0;
        int sampleCount = 256;
        if (stereoEnabled) {
            sampleCount = sampleCount << 1;
        }
        for (sampleIndex = 0; sampleIndex < sampleCount; sampleIndex++) {
            sampleValue = this.mixBuffer[sampleIndex];
            if ((sampleValue + 8388608 & -16777216) != 0) {
                sampleValue = 8388607 ^ sampleValue >> 31;
            }
            this.pcm16Bytes[sampleIndex * 2] = (byte)(sampleValue >> 8);
            this.pcm16Bytes[sampleIndex * 2 + 1] = (byte)(sampleValue >> 16);
        }
        this.line.write(this.pcm16Bytes, 0, sampleCount << 1);
    }

    JavaSoundAudioOutput() {
        this.reopenLineAfterFlush = false;
    }

    final void initializeDevice(java.awt.Component unusedComponent) {
        javax.sound.sampled.Mixer.Info[] mixerInfos;
        javax.sound.sampled.Mixer.Info[] mixerInfosAlias;
        int mixerIndex;
        javax.sound.sampled.Mixer.Info mixerInfo;
        Object outputSnapshot;
        javax.sound.sampled.AudioFormat unusedNullFormatBeforeChannelChoice;
        javax.sound.sampled.AudioFormat unusedNullFormatAliasBeforeChannelChoice;
        float sampleRateFloat;
        int sampleBits;
        javax.sound.sampled.AudioFormat unusedNullFormatAfterChannelChoice = null;
        javax.sound.sampled.AudioFormat unusedNullFormatAliasAfterChannelChoice = null;
        int channelCount = 0;
        int mixBlockFrames = 0;
        int channelByteShift = 0;
        String mixerName;
        mixerInfos = javax.sound.sampled.AudioSystem.getMixerInfo();
        if (mixerInfos != null) {
          mixerInfosAlias = mixerInfos;
          mixerIndex = 0;
          while ((mixerIndex < mixerInfosAlias.length)) {
            mixerInfo = mixerInfosAlias[mixerIndex];
            if (mixerInfo == null) {
              mixerIndex++;
              continue;
            }
            mixerName = mixerInfo.getName();
            if (mixerName == null) {
              mixerIndex++;
              continue;
            }
            if (mixerName.toLowerCase().indexOf(soundMaxMixerNameFragment) < 0) {
              mixerIndex++;
              continue;
            }
            this.reopenLineAfterFlush = true;
            mixerIndex++;
            continue;
          }
        }
        outputSnapshot = this;
        unusedNullFormatBeforeChannelChoice = null;
        unusedNullFormatAliasBeforeChannelChoice = null;
        sampleRateFloat = (float)sampleRateHz;
        sampleBits = 16;
        if (!stereoEnabled) {
          unusedNullFormatAfterChannelChoice = null;
          unusedNullFormatAliasAfterChannelChoice = null;
          channelCount = 1;
        } else {
          unusedNullFormatAfterChannelChoice = null;
          unusedNullFormatAliasAfterChannelChoice = null;
          channelCount = 2;
        }
        ((JavaSoundAudioOutput) (this)).audioFormat = new javax.sound.sampled.AudioFormat(sampleRateFloat, sampleBits, channelCount, true, false);
        mixBlockFrames = 256;
        if (!stereoEnabled) {
          channelByteShift = 1;
        } else {
          channelByteShift = 2;
        }
        ((JavaSoundAudioOutput) (this)).pcm16Bytes = new byte[mixBlockFrames << channelByteShift];
    }

    final void openDevice(int capacityFrames) throws javax.sound.sampled.LineUnavailableException {
        javax.sound.sampled.DataLine.Info lineInfo = null;
        try {
            lineInfo = new javax.sound.sampled.DataLine.Info(javax.sound.sampled.SourceDataLine.class, this.audioFormat, capacityFrames << (stereoEnabled ? 2 : 1));
            this.line = (javax.sound.sampled.SourceDataLine) ((Object) javax.sound.sampled.AudioSystem.getLine((javax.sound.sampled.Line.Info) ((Object) lineInfo)));
            this.line.open();
            this.line.start();
            this.lineCapacityFrames = capacityFrames;
        } catch (javax.sound.sampled.LineUnavailableException lineUnavailableFailure) {
            if (BootstrapUiSupport.countSetBits(capacityFrames, (byte) 70) != 1) {
                this.openDevice(ClientOptionSupport.roundUpPowerOfTwo((byte) 90, capacityFrames));
                return;
            }
            this.line = null;
            throw lineUnavailableFailure;
        }
    }

    final void flushDevice() throws javax.sound.sampled.LineUnavailableException {
        javax.sound.sampled.DataLine.Info lineInfo = null;
        this.line.flush();
        if (this.reopenLineAfterFlush) {
            this.line.close();
            this.line = null;
            lineInfo = new javax.sound.sampled.DataLine.Info(javax.sound.sampled.SourceDataLine.class, this.audioFormat, this.lineCapacityFrames << (stereoEnabled ? 2 : 1));
            this.line = (javax.sound.sampled.SourceDataLine) ((Object) javax.sound.sampled.AudioSystem.getLine((javax.sound.sampled.Line.Info) ((Object) lineInfo)));
            this.line.open();
            this.line.start();
        }
    }

    static {
        soundMaxMixerNameFragment = "soundmax";
    }
}
