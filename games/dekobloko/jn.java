/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn extends en {
    private int field_z;
    private boolean field_x;
    private javax.sound.sampled.SourceDataLine field_w;
    private javax.sound.sampled.AudioFormat field_v;
    private byte[] field_y;
    private static String field_A;

    final void d() {
        if (this.field_w != null) {
            this.field_w.close();
            this.field_w = null;
        }
    }

    final void b() {
        int var2 = 0;
        int var3 = 0;
        int var1 = 256;
        if (field_u) {
            var1 = var1 << 1;
        }
        for (var2 = 0; var2 < var1; var2++) {
            var3 = this.field_k[var2];
            if ((var3 + 8388608 & -16777216) != 0) {
                var3 = 8388607 ^ var3 >> 31;
            }
            this.field_y[var2 * 2] = (byte)(var3 >> 8);
            this.field_y[var2 * 2 + 1] = (byte)(var3 >> 16);
        }
        this.field_w.write(this.field_y, 0, var1 << 1);
    }

    final int c() {
        return this.field_z - (this.field_w.available() >> (field_u ? 2 : 1));
    }

    jn() {
        this.field_x = false;
    }

    final void a(int param0) throws javax.sound.sampled.LineUnavailableException {
        javax.sound.sampled.DataLine.Info var2 = null;
        try {
            var2 = new javax.sound.sampled.DataLine.Info(javax.sound.sampled.SourceDataLine.class, this.field_v, param0 << (field_u ? 2 : 1));
            this.field_w = (javax.sound.sampled.SourceDataLine) ((Object) javax.sound.sampled.AudioSystem.getLine((javax.sound.sampled.Line.Info) ((Object) var2)));
            this.field_w.open();
            this.field_w.start();
            this.field_z = param0;
        } catch (javax.sound.sampled.LineUnavailableException lineUnavailableException) {
            if (h.a(param0, 101) != 1) {
                this.a(oe.b(-10498, param0));
                return;
            }
            this.field_w = null;
            throw lineUnavailableException;
        }
    }

    final void h() throws javax.sound.sampled.LineUnavailableException {
        javax.sound.sampled.DataLine.Info var1 = null;
        this.field_w.flush();
        if (this.field_x) {
            this.field_w.close();
            this.field_w = null;
            var1 = new javax.sound.sampled.DataLine.Info(javax.sound.sampled.SourceDataLine.class, this.field_v, this.field_z << (field_u ? 2 : 1));
            this.field_w = (javax.sound.sampled.SourceDataLine) ((Object) javax.sound.sampled.AudioSystem.getLine((javax.sound.sampled.Line.Info) ((Object) var1)));
            this.field_w.open();
            this.field_w.start();
        }
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
        Object stackIn_13_0 = null;
        javax.sound.sampled.AudioFormat stackIn_13_1 = null;
        javax.sound.sampled.AudioFormat stackIn_13_2 = null;
        float stackIn_13_3 = 0.0f;
        int stackIn_13_4 = 0;
        int stackIn_13_5 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        String var6;
        L0: {
          var2 = javax.sound.sampled.AudioSystem.getMixerInfo();
          if (var2 == null) {
            break L0;
          } else {
            var3 = var2;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var3.length) {
                break L0;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var6 = var5.getName();
                  if (var6 != null) {
                    if (var6.toLowerCase().indexOf(field_A) >= 0) {
                      this.field_x = true;
                      var4++;
                      continue L1;
                    } else {
                      var4++;
                      continue L1;
                    }
                  } else {
                    var4++;
                    continue L1;
                  }
                } else {
                  var4++;
                  continue L1;
                }
              }
            }
          }
        }
        L2: {
          stackIn_12_0 = this;

          stackIn_12_1 = null;

          stackIn_12_2 = null;

          stackIn_12_3 = (float)field_o;

          stackIn_12_4 = 16;

          if (!field_u) {
            stackIn_13_0 = this;
            stackIn_13_1 = null;
            stackIn_13_2 = null;
            stackIn_13_3 = stackIn_12_3;
            stackIn_13_4 = stackIn_12_4;
            stackIn_13_5 = 1;
            break L2;
          } else {
            stackIn_13_0 = this;
            stackIn_13_1 = null;
            stackIn_13_2 = null;
            stackIn_13_3 = stackIn_12_3;
            stackIn_13_4 = stackIn_12_4;
            stackIn_13_5 = 2;
            break L2;
          }
        }
        L3: {
          ((jn) (this)).field_v = new javax.sound.sampled.AudioFormat(stackIn_13_3, stackIn_13_4, stackIn_13_5, true, false);
          stackIn_15_0 = this;

          stackIn_15_1 = 256;

          if (!field_u) {
            stackIn_16_0 = this;
            stackIn_16_1 = stackIn_15_1;
            stackIn_16_2 = 1;
            break L3;
          } else {
            stackIn_16_0 = this;
            stackIn_16_1 = stackIn_15_1;
            stackIn_16_2 = 2;
            break L3;
          }
        }
        ((jn) (this)).field_y = new byte[stackIn_16_1 << stackIn_16_2];
    }

    static {
        field_A = "soundmax";
    }
}
