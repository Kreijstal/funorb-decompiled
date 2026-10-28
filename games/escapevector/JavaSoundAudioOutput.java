/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class JavaSoundAudioOutput extends AudioOutput {
    private boolean reopenOnFlush;
    private int deviceCapacity;
    private javax.sound.sampled.AudioFormat audioFormat;
    private byte[] deviceBytes;
    private javax.sound.sampled.SourceDataLine line;
    private static String affectedMixerName;

    final void closeDevice() {
        if (this.line != null) {
          this.line.close();
          this.line = null;
        }
    }

    final int bufferedSamples() {
        return this.deviceCapacity - (this.line.available() >> (stereo ? 2 : 1));
    }

    final void writeDeviceBlock() {
        int var1 = 256;
        if (stereo) {
          var1 = var1 << 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
          int var3 = this.mixBuffer[var2];
          if ((var3 + 8388608 & -16777216) != 0) {
            var3 = 8388607 ^ var3 >> 31;
          }
          this.deviceBytes[var2 * 2] = (byte)(var3 >> 8);
          this.deviceBytes[var2 * 2 + 1] = (byte)(var3 >> 16);
        }
        this.line.write(this.deviceBytes, 0, var1 << 1);
    }

    JavaSoundAudioOutput() {
        this.reopenOnFlush = false;
    }

    final void initializeDevice(java.awt.Component component) {
        int stackIn_17_5 = 0;
        int stackIn_20_2 = 0;
        javax.sound.sampled.Mixer.Info[] var2 = javax.sound.sampled.AudioSystem.getMixerInfo();
        if (var2 != null) {
          javax.sound.sampled.Mixer.Info[] var3 = var2;
          for (int var4 = 0; var4 < var3.length; var4++) {
            javax.sound.sampled.Mixer.Info var5 = var3[var4];
            if (var5 != null) {
              String var6 = var5.getName();
              if (var6 != null &&
                var6.toLowerCase().indexOf(affectedMixerName) >= 0) {
                this.reopenOnFlush = true;
              }
            }
          }
        }
        Object stackIn_16_0 = this;
        javax.sound.sampled.AudioFormat stackIn_16_1 = null;
        javax.sound.sampled.AudioFormat stackIn_16_2 = null;
        float stackIn_16_3 = (float)sampleRate;
        int stackIn_16_4 = 16;
        if (!stereo) {
          stackIn_17_5 = 1;
        } else {
          javax.sound.sampled.AudioFormat stackIn_17_1 = null;
          javax.sound.sampled.AudioFormat stackIn_17_2 = null;
          stackIn_17_5 = 2;
        }
        this.audioFormat = new javax.sound.sampled.AudioFormat(stackIn_16_3, stackIn_16_4, stackIn_17_5, true, false);
        int stackIn_19_1 = 256;
        stackIn_20_2 = (!stereo) ? (1) : (2);
        this.deviceBytes = new byte[stackIn_19_1 << stackIn_20_2];
    }

    final void openDevice(int capacity) throws javax.sound.sampled.LineUnavailableException {
        try {
          javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(javax.sound.sampled.SourceDataLine.class, this.audioFormat, capacity << (stereo ? 2 : 1));
          this.line = (javax.sound.sampled.SourceDataLine) ((Object) javax.sound.sampled.AudioSystem.getLine((javax.sound.sampled.Line.Info) ((Object) var2)));
          this.line.open();
          this.line.start();
          this.deviceCapacity = capacity;
        } catch (javax.sound.sampled.LineUnavailableException lineUnavailableException) {
          if (ej.a(858993459, capacity) != 1) {
            this.openDevice(AlphaContainer.nextPowerOfTwo((byte) 127, capacity));
            return;
          }
          this.line = null;
          throw lineUnavailableException;
        }
    }

    final void flushDevice() throws javax.sound.sampled.LineUnavailableException {
        this.line.flush();
        if (this.reopenOnFlush) {
          this.line.close();
          this.line = null;
          javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(javax.sound.sampled.SourceDataLine.class, this.audioFormat, this.deviceCapacity << (stereo ? 2 : 1));
          this.line = (javax.sound.sampled.SourceDataLine) ((Object) javax.sound.sampled.AudioSystem.getLine((javax.sound.sampled.Line.Info) ((Object) var1)));
          this.line.open();
          this.line.start();
        }
    }

    static {
        affectedMixerName = "soundmax";
    }
}
