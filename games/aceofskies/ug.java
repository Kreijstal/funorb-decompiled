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
        try {
            int var2 = 0;
            int var3 = 0;
            int var1 = 256;
            if (field_r) {
                var1 = var1 << 1;
            }
            for (var2 = 0; var2 < var1; var2++) {
                var3 = ((ug) this).field_e[var2];
                if ((var3 + 8388608 & -16777216) != 0) {
                    var3 = 8388607 ^ var3 >> 31;
                }
                ((ug) this).field_y[var2 * 2] = (byte)(var3 >> 8);
                ((ug) this).field_y[var2 * 2 + 1] = (byte)(var3 >> 16);
            }
            int discarded$0 = ((ug) this).field_w.write(((ug) this).field_y, 0, var1 << 1);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void f() {
        if (((ug) this).field_w != null) {
            ((ug) this).field_w.close();
            ((ug) this).field_w = null;
        }
    }

    final int g() {
        return ((ug) this).field_x - (((ug) this).field_w.available() >> (field_r ? 2 : 1));
    }

    ug() {
        ((ug) this).field_z = false;
    }

    final void b() throws javax.sound.sampled.LineUnavailableException {
        javax.sound.sampled.DataLine.Info var1 = null;
        ((ug) this).field_w.flush();
        if (((ug) this).field_z) {
            ((ug) this).field_w.close();
            ((ug) this).field_w = null;
            var1 = new javax.sound.sampled.DataLine.Info(javax.sound.sampled.SourceDataLine.class, ((ug) this).field_v, ((ug) this).field_x << (field_r ? 2 : 1));
            ((ug) this).field_w = (javax.sound.sampled.SourceDataLine) javax.sound.sampled.AudioSystem.getLine((javax.sound.sampled.Line.Info) (Object) var1);
            ((ug) this).field_w.open();
            ((ug) this).field_w.start();
        }
    }

    final void a(int param0) throws javax.sound.sampled.LineUnavailableException {
        javax.sound.sampled.DataLine.Info var2 = null;
        try {
            var2 = new javax.sound.sampled.DataLine.Info(javax.sound.sampled.SourceDataLine.class, ((ug) this).field_v, param0 << (field_r ? 2 : 1));
            ((ug) this).field_w = (javax.sound.sampled.SourceDataLine) javax.sound.sampled.AudioSystem.getLine((javax.sound.sampled.Line.Info) (Object) var2);
            ((ug) this).field_w.open();
            ((ug) this).field_w.start();
            ((ug) this).field_x = param0;
        } catch (javax.sound.sampled.LineUnavailableException lineUnavailableException) {
            if (hh.a(0, param0) != 1) {
                ((ug) this).a(fk.a(param0, 36));
                return;
            }
            ((ug) this).field_w = null;
            throw lineUnavailableException;
        }
    }

    final void a(java.awt.Component param0) {
        javax.sound.sampled.Mixer.Info[] var2 = null;
        javax.sound.sampled.Mixer.Info[] var3 = null;
        int var4 = 0;
        javax.sound.sampled.Mixer.Info var5 = null;
        String var6 = null;
        Object stackIn_11_0 = null;
        javax.sound.sampled.AudioFormat stackIn_11_1 = null;
        javax.sound.sampled.AudioFormat stackIn_11_2 = null;
        float stackIn_11_3 = 0.0f;
        int stackIn_11_4 = 0;
        Object stackIn_12_0 = null;
        javax.sound.sampled.AudioFormat stackIn_12_1 = null;
        javax.sound.sampled.AudioFormat stackIn_12_2 = null;
        float stackIn_12_3 = 0.0f;
        int stackIn_12_4 = 0;
        Object stackIn_13_0 = null;
        javax.sound.sampled.AudioFormat stackIn_13_1 = null;
        javax.sound.sampled.AudioFormat stackIn_13_2 = null;
        float stackIn_13_3 = 0.0f;
        int stackIn_13_4 = 0;
        int stackIn_13_5 = 0;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        Object stackOut_10_0 = null;
        javax.sound.sampled.AudioFormat stackOut_10_1 = null;
        javax.sound.sampled.AudioFormat stackOut_10_2 = null;
        float stackOut_10_3 = 0.0f;
        int stackOut_10_4 = 0;
        Object stackOut_12_0 = null;
        javax.sound.sampled.AudioFormat stackOut_12_1 = null;
        javax.sound.sampled.AudioFormat stackOut_12_2 = null;
        float stackOut_12_3 = 0.0f;
        int stackOut_12_4 = 0;
        int stackOut_12_5 = 0;
        Object stackOut_11_0 = null;
        javax.sound.sampled.AudioFormat stackOut_11_1 = null;
        javax.sound.sampled.AudioFormat stackOut_11_2 = null;
        float stackOut_11_3 = 0.0f;
        int stackOut_11_4 = 0;
        int stackOut_11_5 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
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
                      ((ug) this).field_z = true;
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
          stackOut_10_0 = this;
          stackOut_10_1 = null;
          stackOut_10_2 = null;
          stackOut_10_3 = (float)field_f;
          stackOut_10_4 = 16;
          stackIn_12_0 = stackOut_10_0;
          stackIn_12_1 = stackOut_10_1;
          stackIn_12_2 = stackOut_10_2;
          stackIn_12_3 = stackOut_10_3;
          stackIn_12_4 = stackOut_10_4;
          stackIn_11_0 = stackOut_10_0;
          stackIn_11_1 = stackOut_10_1;
          stackIn_11_2 = stackOut_10_2;
          stackIn_11_3 = stackOut_10_3;
          stackIn_11_4 = stackOut_10_4;
          if (!field_r) {
            stackOut_12_0 = this;
            stackOut_12_1 = null;
            stackOut_12_2 = null;
            stackOut_12_3 = stackIn_12_3;
            stackOut_12_4 = stackIn_12_4;
            stackOut_12_5 = 1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            stackIn_13_2 = stackOut_12_2;
            stackIn_13_3 = stackOut_12_3;
            stackIn_13_4 = stackOut_12_4;
            stackIn_13_5 = stackOut_12_5;
            break L2;
          } else {
            stackOut_11_0 = this;
            stackOut_11_1 = null;
            stackOut_11_2 = null;
            stackOut_11_3 = stackIn_11_3;
            stackOut_11_4 = stackIn_11_4;
            stackOut_11_5 = 2;
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_13_2 = stackOut_11_2;
            stackIn_13_3 = stackOut_11_3;
            stackIn_13_4 = stackOut_11_4;
            stackIn_13_5 = stackOut_11_5;
            break L2;
          }
        }
        L3: {
          new javax.sound.sampled.AudioFormat(stackIn_13_3, stackIn_13_4, stackIn_13_5, true, false);
          ((ug) this).field_v = (javax.sound.sampled.AudioFormat) (Object) stackIn_13_1;
          stackOut_13_0 = this;
          stackOut_13_1 = 256;
          stackIn_15_0 = stackOut_13_0;
          stackIn_15_1 = stackOut_13_1;
          stackIn_14_0 = stackOut_13_0;
          stackIn_14_1 = stackOut_13_1;
          if (!field_r) {
            stackOut_15_0 = this;
            stackOut_15_1 = stackIn_15_1;
            stackOut_15_2 = 1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            stackIn_16_2 = stackOut_15_2;
            break L3;
          } else {
            stackOut_14_0 = this;
            stackOut_14_1 = stackIn_14_1;
            stackOut_14_2 = 2;
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_16_2 = stackOut_14_2;
            break L3;
          }
        }
        ((ug) this).field_y = new byte[stackIn_16_1 << stackIn_16_2];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "soundmax";
    }
}
