/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia extends e {
    private byte[] field_z;
    private javax.sound.sampled.AudioFormat field_w;
    private javax.sound.sampled.SourceDataLine field_v;
    private int field_x;
    private boolean field_y;
    private static String field_A;

    final int b() {
        return this.field_x - (this.field_v.available() >> (field_s ? 2 : 1));
    }

    final void f() {
        int var2 = 0;
        int var3 = 0;
        int var1 = 256;
        if (field_s) {
          var1 = var1 << 1;
        }
        for (var2 = 0; var2 < var1; var2++) {
          var3 = this.field_m[var2];
          if ((var3 + 8388608 & -16777216) != 0) {
            var3 = 8388607 ^ var3 >> 31;
          }
          this.field_z[var2 * 2] = (byte)(var3 >> 8);
          this.field_z[var2 * 2 + 1] = (byte)(var3 >> 16);
        }
        this.field_v.write(this.field_z, 0, var1 << 1);
    }

    final void g() {
        if (this.field_v != null) {
          this.field_v.close();
          this.field_v = null;
        }
    }

    ia() {
        this.field_y = false;
    }

    final void a(java.awt.Component param0) {
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
                this.field_y = true;
              }
            }
          }
        }
        stackIn_16_0 = this;
        stackIn_16_1 = null;
        stackIn_16_2 = null;
        stackIn_16_3 = (float)field_r;
        stackIn_16_4 = 16;
        if (!field_s) {
          stackIn_17_1 = null;
          stackIn_17_2 = null;
          stackIn_17_5 = 1;
        } else {
          stackIn_17_1 = null;
          stackIn_17_2 = null;
          stackIn_17_5 = 2;
        }
        this.field_w = new javax.sound.sampled.AudioFormat(stackIn_16_3, stackIn_16_4, stackIn_17_5, true, false);
        stackIn_19_1 = 256;
        if (!field_s) {
          stackIn_20_2 = 1;
        } else {
          stackIn_20_2 = 2;
        }
        this.field_z = new byte[stackIn_19_1 << stackIn_20_2];
    }

    final void b(int param0) throws javax.sound.sampled.LineUnavailableException {
        javax.sound.sampled.DataLine.Info var2 = null;
        try {
          var2 = new javax.sound.sampled.DataLine.Info(javax.sound.sampled.SourceDataLine.class, this.field_w, param0 << (field_s ? 2 : 1));
          this.field_v = (javax.sound.sampled.SourceDataLine) ((Object) javax.sound.sampled.AudioSystem.getLine((javax.sound.sampled.Line.Info) ((Object) var2)));
          this.field_v.open();
          this.field_v.start();
          this.field_x = param0;
        } catch (javax.sound.sampled.LineUnavailableException lineUnavailableException) {
          if (gd.a(false, param0) != 1) {
            this.b(ke.a(param0, 24636));
            return;
          }
          this.field_v = null;
          throw lineUnavailableException;
        }
    }

    final void c() throws javax.sound.sampled.LineUnavailableException {
        javax.sound.sampled.DataLine.Info var1 = null;
        this.field_v.flush();
        if (this.field_y) {
          this.field_v.close();
          this.field_v = null;
          var1 = new javax.sound.sampled.DataLine.Info(javax.sound.sampled.SourceDataLine.class, this.field_w, this.field_x << (field_s ? 2 : 1));
          this.field_v = (javax.sound.sampled.SourceDataLine) ((Object) javax.sound.sampled.AudioSystem.getLine((javax.sound.sampled.Line.Info) ((Object) var1)));
          this.field_v.open();
          this.field_v.start();
        }
    }

    static {
        field_A = "soundmax";
    }
}
