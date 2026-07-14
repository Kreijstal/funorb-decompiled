/*
 * Decompiled by CFR-JS 0.4.0.
 */
import javax.sound.sampled.AudioFormat;

final class ca extends gj {
    private javax.sound.sampled.AudioFormat field_w;
    private javax.sound.sampled.SourceDataLine field_v;
    private boolean field_z;
    private int field_x;
    private byte[] field_y;
    private static String field_A;

    final void f() {
        try {
            int var2 = 0;
            int var3 = 0;
            int var1 = 256;
            if (field_u) {
                var1 = var1 << 1;
            }
            for (var2 = 0; var2 < var1; var2++) {
                var3 = ((ca) this).field_a[var2];
                if ((var3 + 8388608 & -16777216) != 0) {
                    var3 = 8388607 ^ var3 >> 31;
                }
                ((ca) this).field_y[var2 * 2] = (byte)(var3 >> 8);
                ((ca) this).field_y[var2 * 2 + 1] = (byte)(var3 >> 16);
            }
            int discarded$0 = ((ca) this).field_v.write(((ca) this).field_y, 0, var1 << 1);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int d() {
        return ((ca) this).field_x - (((ca) this).field_v.available() >> (field_u ? 2 : 1));
    }

    final void c() {
        if (((ca) this).field_v != null) {
            ((ca) this).field_v.close();
            ((ca) this).field_v = null;
        }
    }

    ca() {
        ((ca) this).field_z = false;
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
                      ((ca) this).field_z = true;
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
          stackOut_10_3 = (float)field_s;
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
          if (!field_u) {
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
          ((ca) this).field_w = stackIn_13_1;
          stackOut_13_0 = this;
          stackOut_13_1 = 256;
          stackIn_15_0 = stackOut_13_0;
          stackIn_15_1 = stackOut_13_1;
          stackIn_14_0 = stackOut_13_0;
          stackIn_14_1 = stackOut_13_1;
          if (!field_u) {
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
        ((ca) this).field_y = new byte[stackIn_16_1 << stackIn_16_2];
    }

    final void b(int param0) throws javax.sound.sampled.LineUnavailableException {
        javax.sound.sampled.DataLine.Info var2 = null;
        try {
            var2 = new javax.sound.sampled.DataLine.Info(javax.sound.sampled.SourceDataLine.class, ((ca) this).field_w, param0 << (field_u ? 2 : 1));
            ((ca) this).field_v = (javax.sound.sampled.SourceDataLine) (Object) javax.sound.sampled.AudioSystem.getLine((javax.sound.sampled.Line.Info) (Object) var2);
            ((ca) this).field_v.open();
            ((ca) this).field_v.start();
            ((ca) this).field_x = param0;
        } catch (javax.sound.sampled.LineUnavailableException lineUnavailableException) {
            if (ii.a(param0, 126) != 1) {
                ((ca) this).b(ac.a(param0, true));
                return;
            }
            ((ca) this).field_v = null;
            throw lineUnavailableException;
        }
    }

    final void g() throws javax.sound.sampled.LineUnavailableException {
        javax.sound.sampled.DataLine.Info var1 = null;
        ((ca) this).field_v.flush();
        if (((ca) this).field_z) {
            ((ca) this).field_v.close();
            ((ca) this).field_v = null;
            var1 = new javax.sound.sampled.DataLine.Info(javax.sound.sampled.SourceDataLine.class, ((ca) this).field_w, ((ca) this).field_x << (field_u ? 2 : 1));
            ((ca) this).field_v = (javax.sound.sampled.SourceDataLine) (Object) javax.sound.sampled.AudioSystem.getLine((javax.sound.sampled.Line.Info) (Object) var1);
            ((ca) this).field_v.open();
            ((ca) this).field_v.start();
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "soundmax";
    }
}
