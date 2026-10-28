/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class JavaSoundAudioOutput extends AudioOutput {
    private boolean field_z;
    private int field_v;
    private javax.sound.sampled.AudioFormat field_y;
    private byte[] field_w;
    private javax.sound.sampled.SourceDataLine field_x;
    private static String field_A;

    final void closeDevice() {
        if (this.field_x != null) {
          this.field_x.close();
          this.field_x = null;
        }
    }

    final int bufferedSamples() {
        return this.field_v - (this.field_x.available() >> (field_o ? 2 : 1));
    }

    final void writeDeviceBlock() {
        int var1 = 256;
        if (field_o) {
          var1 = var1 << 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
          int var3 = this.field_f[var2];
          if ((var3 + 8388608 & -16777216) != 0) {
            var3 = 8388607 ^ var3 >> 31;
          }
          this.field_w[var2 * 2] = (byte)(var3 >> 8);
          this.field_w[var2 * 2 + 1] = (byte)(var3 >> 16);
        }
        this.field_x.write(this.field_w, 0, var1 << 1);
    }

    JavaSoundAudioOutput() {
        this.field_z = false;
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
                var6.toLowerCase().indexOf(field_A) >= 0) {
                this.field_z = true;
              }
            }
          }
        }
        Object stackIn_16_0 = this;
        javax.sound.sampled.AudioFormat stackIn_16_1 = null;
        javax.sound.sampled.AudioFormat stackIn_16_2 = null;
        float stackIn_16_3 = (float)field_q;
        int stackIn_16_4 = 16;
        if (!field_o) {
          stackIn_17_5 = 1;
        } else {
          javax.sound.sampled.AudioFormat stackIn_17_1 = null;
          javax.sound.sampled.AudioFormat stackIn_17_2 = null;
          stackIn_17_5 = 2;
        }
        this.field_y = new javax.sound.sampled.AudioFormat(stackIn_16_3, stackIn_16_4, stackIn_17_5, true, false);
        int stackIn_19_1 = 256;
        stackIn_20_2 = (!field_o) ? (1) : (2);
        this.field_w = new byte[stackIn_19_1 << stackIn_20_2];
    }

    final void openDevice(int capacity) throws javax.sound.sampled.LineUnavailableException {
        try {
          javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(javax.sound.sampled.SourceDataLine.class, this.field_y, capacity << (field_o ? 2 : 1));
          this.field_x = (javax.sound.sampled.SourceDataLine) ((Object) javax.sound.sampled.AudioSystem.getLine((javax.sound.sampled.Line.Info) ((Object) var2)));
          this.field_x.open();
          this.field_x.start();
          this.field_v = capacity;
        } catch (javax.sound.sampled.LineUnavailableException lineUnavailableException) {
          if (ej.a(858993459, capacity) != 1) {
            this.openDevice(md.a((byte) 127, capacity));
            return;
          }
          this.field_x = null;
          throw lineUnavailableException;
        }
    }

    final void flushDevice() throws javax.sound.sampled.LineUnavailableException {
        this.field_x.flush();
        if (this.field_z) {
          this.field_x.close();
          this.field_x = null;
          javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(javax.sound.sampled.SourceDataLine.class, this.field_y, this.field_v << (field_o ? 2 : 1));
          this.field_x = (javax.sound.sampled.SourceDataLine) ((Object) javax.sound.sampled.AudioSystem.getLine((javax.sound.sampled.Line.Info) ((Object) var1)));
          this.field_x.open();
          this.field_x.start();
        }
    }

    static {
        field_A = "soundmax";
    }
}
