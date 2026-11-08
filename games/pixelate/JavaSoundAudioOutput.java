/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class JavaSoundAudioOutput extends AudioOutput {
    private javax.sound.sampled.AudioFormat field_y;
    private byte[] pcm16Bytes;
    private int lineCapacityFrames;
    private javax.sound.sampled.SourceDataLine line;
    private static String field_z;

    final void writeMixBlock() {
        int var2 = 0;
        int var3 = 0;
        int var1 = 256;
        if (field_o) {
          var1 = var1 << 1;
        }
        for (var2 = 0; var2 < var1; var2++) {
          var3 = this.mixBuffer[var2];
          if ((var3 + 8388608 & -16777216) != 0) {
            var3 = 8388607 ^ var3 >> 31;
          }
          this.pcm16Bytes[var2 * 2] = (byte)(var3 >> 8);
          this.pcm16Bytes[var2 * 2 + 1] = (byte)(var3 >> 16);
        }
        this.line.write(this.pcm16Bytes, 0, var1 << 1);
    }

    final void closeDevice() {
        if (this.line != null) {
          this.line.close();
          this.line = null;
        }
    }

    final int getQueuedFrames() {
        return this.lineCapacityFrames - (this.line.available() >> (field_o ? 2 : 1));
    }

    JavaSoundAudioOutput() {
    }

    final void initDevice(java.awt.Component param0) {
        int var4 = 0;
        javax.sound.sampled.Mixer.Info[] var2;
        javax.sound.sampled.Mixer.Info[] var3;
        javax.sound.sampled.Mixer.Info var5;
        Object stackIn_15_0;
        javax.sound.sampled.AudioFormat stackIn_15_1;
        javax.sound.sampled.AudioFormat stackIn_15_2;
        float stackIn_15_3;
        int stackIn_15_4;
        javax.sound.sampled.AudioFormat stackIn_16_1 = null;
        javax.sound.sampled.AudioFormat stackIn_16_2 = null;
        int stackIn_16_5 = 0;
        int stackIn_18_1 = 0;
        int stackIn_19_2 = 0;
        String var6;
        var2 = javax.sound.sampled.AudioSystem.getMixerInfo();
        if (var2 != null) {
          var3 = var2;
          for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.getName();
              if (var6 != null &&
                var6.toLowerCase().indexOf(field_z) >= 0) {
              }
            }
          }
        }
        stackIn_15_0 = this;
        stackIn_15_1 = null;
        stackIn_15_2 = null;
        stackIn_15_3 = (float)field_h;
        stackIn_15_4 = 16;
        if (!field_o) {
          stackIn_16_1 = null;
          stackIn_16_2 = null;
          stackIn_16_5 = 1;
        } else {
          stackIn_16_1 = null;
          stackIn_16_2 = null;
          stackIn_16_5 = 2;
        }
        this.field_y = new javax.sound.sampled.AudioFormat(stackIn_15_3, stackIn_15_4, stackIn_16_5, true, false);
        stackIn_18_1 = 256;
        if (!field_o) {
          stackIn_19_2 = 1;
        } else {
          stackIn_19_2 = 2;
        }
        this.pcm16Bytes = new byte[stackIn_18_1 << stackIn_19_2];
    }

    final void openDevice(int param0) throws javax.sound.sampled.LineUnavailableException {
        javax.sound.sampled.DataLine.Info var2 = null;
        try {
          var2 = new javax.sound.sampled.DataLine.Info(javax.sound.sampled.SourceDataLine.class, this.field_y, param0 << (field_o ? 2 : 1));
          this.line = (javax.sound.sampled.SourceDataLine) ((Object) javax.sound.sampled.AudioSystem.getLine((javax.sound.sampled.Line.Info) ((Object) var2)));
          this.line.open();
          this.line.start();
          this.lineCapacityFrames = param0;
        } catch (javax.sound.sampled.LineUnavailableException lineUnavailableException) {
          if (ni.bitCount((byte) -128, param0) != 1) {
            this.openDevice(DropTargetWidget.nextPowerOfTwo(-1879863704, param0));
            return;
          }
          this.line = null;
          throw lineUnavailableException;
        }
    }

    static {
        field_z = "soundmax";
    }
}
