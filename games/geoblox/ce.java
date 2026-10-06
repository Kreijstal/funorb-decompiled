/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce extends qk {
    private javax.sound.sampled.SourceDataLine field_x;
    private int field_w;
    private byte[] field_z;
    private boolean field_v;
    private javax.sound.sampled.AudioFormat field_y;
    private static String field_A;

    final int g() {
        return this.field_w - (this.field_x.available() >> (field_q ? 2 : 1));
    }

    final void f() {
        if (this.field_x != null) {
            this.field_x.close();
            this.field_x = null;
        }
    }

    final void e() {
        int var2 = 0;
        int var3 = 0;
        int var1 = 256;
        if (field_q) {
            var1 = var1 << 1;
        }
        for (var2 = 0; var2 < var1; var2++) {
            var3 = this.field_c[var2];
            if ((var3 + 8388608 & -16777216) != 0) {
                var3 = 8388607 ^ var3 >> 31;
            }
            this.field_z[var2 * 2] = (byte)(var3 >> 8);
            this.field_z[var2 * 2 + 1] = (byte)(var3 >> 16);
        }
        this.field_x.write(this.field_z, 0, var1 << 1);
    }

    ce() {
        this.field_v = false;
    }

    final void a(java.awt.Component param0) {
        javax.sound.sampled.Mixer.Info[] var2;
        javax.sound.sampled.Mixer.Info[] var3;
        int var4;
        javax.sound.sampled.Mixer.Info var5;
        Object stackIn_12_0;
        javax.sound.sampled.AudioFormat stackIn_12_1;
        javax.sound.sampled.AudioFormat stackIn_12_2;
        float stackIn_12_3;
        int stackIn_12_4;
        javax.sound.sampled.AudioFormat stackIn_13_1 = null;
        javax.sound.sampled.AudioFormat stackIn_13_2 = null;
        int stackIn_13_5 = 0;
        int stackIn_15_1 = 0;
        int stackIn_16_2 = 0;
        String var6;
        var2 = javax.sound.sampled.AudioSystem.getMixerInfo();
        if (var2 != null) {
          var3 = var2;
          var4 = 0;
          while (var4 < var3.length) {
            var5 = var3[var4];
            if (var5 == null) {
              var4++;
              continue;
            }
            var6 = var5.getName();
            if (var6 == null) {
              var4++;
              continue;
            }
            if (var6.toLowerCase().indexOf(field_A) < 0) {
              var4++;
              continue;
            }
            this.field_v = true;
            var4++;
          }
        }
        stackIn_12_0 = this;
        stackIn_12_1 = null;
        stackIn_12_2 = null;
        stackIn_12_3 = (float)field_j;
        stackIn_12_4 = 16;
        if (!field_q) {
          stackIn_13_1 = null;
          stackIn_13_2 = null;
          stackIn_13_5 = 1;
        } else {
          stackIn_13_1 = null;
          stackIn_13_2 = null;
          stackIn_13_5 = 2;
        }
        this.field_y = new javax.sound.sampled.AudioFormat(stackIn_12_3, stackIn_12_4, stackIn_13_5, true, false);
        stackIn_15_1 = 256;
        if (!field_q) {
          stackIn_16_2 = 1;
        } else {
          stackIn_16_2 = 2;
        }
        this.field_z = new byte[stackIn_15_1 << stackIn_16_2];
    }

    final void a(int param0) throws javax.sound.sampled.LineUnavailableException {
        javax.sound.sampled.DataLine.Info var2 = null;
        try {
            var2 = new javax.sound.sampled.DataLine.Info(javax.sound.sampled.SourceDataLine.class, this.field_y, param0 << (field_q ? 2 : 1));
            this.field_x = (javax.sound.sampled.SourceDataLine) ((Object) javax.sound.sampled.AudioSystem.getLine((javax.sound.sampled.Line.Info) ((Object) var2)));
            this.field_x.open();
            this.field_x.start();
            this.field_w = param0;
        } catch (javax.sound.sampled.LineUnavailableException lineUnavailableException) {
            if (bl.a(param0, (byte) 70) != 1) {
                this.a(da.a((byte) 90, param0));
                return;
            }
            this.field_x = null;
            throw lineUnavailableException;
        }
    }

    final void d() throws javax.sound.sampled.LineUnavailableException {
        javax.sound.sampled.DataLine.Info var1 = null;
        this.field_x.flush();
        if (this.field_v) {
            this.field_x.close();
            this.field_x = null;
            var1 = new javax.sound.sampled.DataLine.Info(javax.sound.sampled.SourceDataLine.class, this.field_y, this.field_w << (field_q ? 2 : 1));
            this.field_x = (javax.sound.sampled.SourceDataLine) ((Object) javax.sound.sampled.AudioSystem.getLine((javax.sound.sampled.Line.Info) ((Object) var1)));
            this.field_x.open();
            this.field_x.start();
        }
    }

    static {
        field_A = "soundmax";
    }
}
