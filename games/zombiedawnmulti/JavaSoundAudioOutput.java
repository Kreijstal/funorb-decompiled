/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class JavaSoundAudioOutput extends PcmPlayerService {
    private javax.sound.sampled.AudioFormat audioFormat;
    private int lineCapacityFrames;
    private byte[] field_y;
    private boolean reopenLineAfterFlush;
    private javax.sound.sampled.SourceDataLine line;
    private static String field_A;

    final void closeDevice() {
        if (this.line != null) {
          this.line.close();
          this.line = null;
        }
    }

    final int queuedFrames() {
        return this.lineCapacityFrames - (this.line.available() >> (field_j ? 2 : 1));
    }

    final void writeFrames() {
        int var2 = 0;
        int var3 = 0;
        int var1 = 256;
        if (field_j) {
          var1 = var1 << 1;
        }
        for (var2 = 0; var2 < var1; var2++) {
          var3 = this.field_l[var2];
          if ((var3 + 8388608 & -16777216) != 0) {
            var3 = 8388607 ^ var3 >> 31;
          }
          this.field_y[var2 * 2] = (byte)(var3 >> 8);
          this.field_y[var2 * 2 + 1] = (byte)(var3 >> 16);
        }
        this.line.write(this.field_y, 0, var1 << 1);
    }

    JavaSoundAudioOutput() {
        this.reopenLineAfterFlush = false;
    }

    final void flushDevice() throws javax.sound.sampled.LineUnavailableException {
        javax.sound.sampled.DataLine.Info var1 = null;
        this.line.flush();
        if (this.reopenLineAfterFlush) {
          this.line.close();
          this.line = null;
          var1 = new javax.sound.sampled.DataLine.Info(javax.sound.sampled.SourceDataLine.class, this.audioFormat, this.lineCapacityFrames << (field_j ? 2 : 1));
          this.line = (javax.sound.sampled.SourceDataLine) ((Object) javax.sound.sampled.AudioSystem.getLine((javax.sound.sampled.Line.Info) ((Object) var1)));
          this.line.open();
          this.line.start();
        }
    }

    final void openDevice(int param0) throws javax.sound.sampled.LineUnavailableException {
        javax.sound.sampled.DataLine.Info var2 = null;
        try {
          var2 = new javax.sound.sampled.DataLine.Info(javax.sound.sampled.SourceDataLine.class, this.audioFormat, param0 << (field_j ? 2 : 1));
          this.line = (javax.sound.sampled.SourceDataLine) ((Object) javax.sound.sampled.AudioSystem.getLine((javax.sound.sampled.Line.Info) ((Object) var2)));
          this.line.open();
          this.line.start();
          this.lineCapacityFrames = param0;
        } catch (javax.sound.sampled.LineUnavailableException lineUnavailableException) {
          if (cm.a(param0, true) != 1) {
            this.openDevice(cb.nextPowerOfTwo(-113, param0));
            return;
          }
          this.line = null;
          throw lineUnavailableException;
        }
    }

    final void initDevice(java.awt.Component param0) {
        int var4 = 0;
        javax.sound.sampled.Mixer.Info[] var2;
        javax.sound.sampled.Mixer.Info[] var3;
        javax.sound.sampled.Mixer.Info var5;
        Object stackIn_16_0;
        javax.sound.sampled.AudioFormat stackIn_16_1;
        javax.sound.sampled.AudioFormat stackIn_16_2;
        float stackIn_16_3;
        int stackIn_16_4;
        javax.sound.sampled.AudioFormat stackIn_17_1 = null;
        javax.sound.sampled.AudioFormat stackIn_17_2 = null;
        int stackIn_17_5 = 0;
        int stackIn_19_1 = 0;
        int stackIn_20_2 = 0;
        String var6;
        var2 = javax.sound.sampled.AudioSystem.getMixerInfo();
        if (var2 != null) {
          var3 = var2;
          for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.getName();
              if (var6 != null &&
                var6.toLowerCase().indexOf(field_A) >= 0) {
                this.reopenLineAfterFlush = true;
              }
            }
          }
        }
        stackIn_16_0 = this;
        stackIn_16_1 = null;
        stackIn_16_2 = null;
        stackIn_16_3 = (float)sampleRate;
        stackIn_16_4 = 16;
        if (!field_j) {
          stackIn_17_1 = null;
          stackIn_17_2 = null;
          stackIn_17_5 = 1;
        } else {
          stackIn_17_1 = null;
          stackIn_17_2 = null;
          stackIn_17_5 = 2;
        }
        this.audioFormat = new javax.sound.sampled.AudioFormat(stackIn_16_3, stackIn_16_4, stackIn_17_5, true, false);
        stackIn_19_1 = 256;
        if (!field_j) {
          stackIn_20_2 = 1;
        } else {
          stackIn_20_2 = 2;
        }
        this.field_y = new byte[stackIn_19_1 << stackIn_20_2];
    }

    static {
        field_A = "soundmax";
    }
}
