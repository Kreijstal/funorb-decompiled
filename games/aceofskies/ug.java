/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug extends tk {
    private javax.sound.sampled.SourceDataLine field_w;
    private boolean field_z;
    private byte[] field_y;
    private javax.sound.sampled.AudioFormat field_v;
    private int field_x;
    private static String field_A;

    final void c() {
        int var1 = 256;
        if (field_r) {
          var1 = var1 << 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
          int var3 = this.field_e[var2];
          if ((var3 + 8388608 & -16777216) != 0) {
            var3 = 8388607 ^ var3 >> 31;
          }
          this.field_y[var2 * 2] = (byte)(var3 >> 8);
          this.field_y[var2 * 2 + 1] = (byte)(var3 >> 16);
        }
        this.field_w.write(this.field_y, 0, var1 << 1);
    }

    final void f() {
        if (this.field_w != null) {
          this.field_w.close();
          this.field_w = null;
        }
    }

    final int g() {
        return this.field_x - (this.field_w.available() >> (field_r ? 2 : 1));
    }

    ug() {
        this.field_z = false;
    }

    final void b() throws javax.sound.sampled.LineUnavailableException {
        this.field_w.flush();
        if (this.field_z) {
          this.field_w.close();
          this.field_w = null;
          javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(javax.sound.sampled.SourceDataLine.class, this.field_v, this.field_x << (field_r ? 2 : 1));
          this.field_w = (javax.sound.sampled.SourceDataLine) ((Object) javax.sound.sampled.AudioSystem.getLine((javax.sound.sampled.Line.Info) ((Object) var1)));
          this.field_w.open();
          this.field_w.start();
        }
    }

    final void a(int param0) throws javax.sound.sampled.LineUnavailableException {
        try {
          javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(javax.sound.sampled.SourceDataLine.class, this.field_v, param0 << (field_r ? 2 : 1));
          this.field_w = (javax.sound.sampled.SourceDataLine) ((Object) javax.sound.sampled.AudioSystem.getLine((javax.sound.sampled.Line.Info) ((Object) var2)));
          this.field_w.open();
          this.field_w.start();
          this.field_x = param0;
        } catch (javax.sound.sampled.LineUnavailableException lineUnavailableException) {
          if (hh.a(0, param0) != 1) {
            this.a(fk.a(param0, 36));
            return;
          }
          this.field_w = null;
          throw lineUnavailableException;
        }
    }

    final void a(java.awt.Component param0) {
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
        float stackIn_16_3 = (float)field_f;
        int stackIn_16_4 = 16;
        if (!field_r) {
          stackIn_17_5 = 1;
        } else {
          javax.sound.sampled.AudioFormat stackIn_17_1 = null;
          javax.sound.sampled.AudioFormat stackIn_17_2 = null;
          stackIn_17_5 = 2;
        }
        this.field_v = new javax.sound.sampled.AudioFormat(stackIn_16_3, stackIn_16_4, stackIn_17_5, true, false);
        int stackIn_19_1 = 256;
        if (!field_r) {
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
