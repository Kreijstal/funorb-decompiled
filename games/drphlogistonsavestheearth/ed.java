/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ed extends id {
    private int field_v;
    private javax.sound.sampled.SourceDataLine field_x;
    private javax.sound.sampled.AudioFormat field_y;
    private boolean field_z;
    private byte[] field_w;
    private static String field_A;

    final void b() {
        int var2 = 0;
        int var3 = 0;
        int var1 = 256;
        if (field_f) {
          var1 = var1 << 1;
        }
        for (var2 = 0; var2 < var1; var2++) {
          var3 = this.field_a[var2];
          if ((var3 + 8388608 & -16777216) != 0) {
            var3 = 8388607 ^ var3 >> 31;
          }
          this.field_w[var2 * 2] = (byte)(var3 >> 8);
          this.field_w[var2 * 2 + 1] = (byte)(var3 >> 16);
        }
        this.field_x.write(this.field_w, 0, var1 << 1);
    }

    final int c() {
        return this.field_v - (this.field_x.available() >> (field_f ? 2 : 1));
    }

    final void f() {
        if (this.field_x != null) {
          this.field_x.close();
          this.field_x = null;
        }
    }

    ed() {
        this.field_z = false;
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
                this.field_z = true;
              }
            }
          }
        }
        stackIn_16_0 = this;
        stackIn_16_1 = null;
        stackIn_16_2 = null;
        stackIn_16_3 = (float)field_d;
        stackIn_16_4 = 16;
        if (!field_f) {
          stackIn_17_1 = null;
          stackIn_17_2 = null;
          stackIn_17_5 = 1;
        } else {
          stackIn_17_1 = null;
          stackIn_17_2 = null;
          stackIn_17_5 = 2;
        }
        this.field_y = new javax.sound.sampled.AudioFormat(stackIn_16_3, stackIn_16_4, stackIn_17_5, true, false);
        stackIn_19_1 = 256;
        if (!field_f) {
          stackIn_20_2 = 1;
        } else {
          stackIn_20_2 = 2;
        }
        this.field_w = new byte[stackIn_19_1 << stackIn_20_2];
    }

    final void d() throws javax.sound.sampled.LineUnavailableException {
        javax.sound.sampled.DataLine.Info var1 = null;
        this.field_x.flush();
        if (this.field_z) {
          this.field_x.close();
          this.field_x = null;
          var1 = new javax.sound.sampled.DataLine.Info(javax.sound.sampled.SourceDataLine.class, this.field_y, this.field_v << (field_f ? 2 : 1));
          this.field_x = (javax.sound.sampled.SourceDataLine) ((Object) javax.sound.sampled.AudioSystem.getLine((javax.sound.sampled.Line.Info) ((Object) var1)));
          this.field_x.open();
          this.field_x.start();
        }
    }

    final void a(int param0) throws javax.sound.sampled.LineUnavailableException {
        javax.sound.sampled.DataLine.Info var2 = null;
        try {
          var2 = new javax.sound.sampled.DataLine.Info(javax.sound.sampled.SourceDataLine.class, this.field_y, param0 << (field_f ? 2 : 1));
          this.field_x = (javax.sound.sampled.SourceDataLine) ((Object) javax.sound.sampled.AudioSystem.getLine((javax.sound.sampled.Line.Info) ((Object) var2)));
          this.field_x.open();
          this.field_x.start();
          this.field_v = param0;
        } catch (javax.sound.sampled.LineUnavailableException lineUnavailableException) {
          if (ig.a(param0, (byte) -121) != 1) {
            this.a(lg.a(2, param0));
            return;
          }
          this.field_x = null;
          throw lineUnavailableException;
        }
    }

    static {
        field_A = "soundmax";
    }
}
