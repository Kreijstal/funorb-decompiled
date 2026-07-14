/*
 * Decompiled by CFR-JS 0.4.0.
 */
import javax.sound.sampled.AudioFormat;

final class kg extends la {
    private byte[] field_w;
    private javax.sound.sampled.AudioFormat field_y;
    private int field_z;
    private boolean field_x;
    private javax.sound.sampled.SourceDataLine field_v;
    private static String field_A;

    final void c() {
        if (((kg) this).field_v != null) {
            ((kg) this).field_v.close();
            ((kg) this).field_v = null;
        }
    }

    final void f() {
        try {
            int var2 = 0;
            int var3 = 0;
            int var1 = 256;
            if (field_h) {
                var1 = var1 << 1;
            }
            for (var2 = 0; var2 < var1; var2++) {
                var3 = ((kg) this).field_i[var2];
                if ((var3 + 8388608 & -16777216) != 0) {
                    var3 = 8388607 ^ var3 >> 31;
                }
                ((kg) this).field_w[var2 * 2] = (byte)(var3 >> 8);
                ((kg) this).field_w[var2 * 2 + 1] = (byte)(var3 >> 16);
            }
            int discarded$0 = ((kg) this).field_v.write(((kg) this).field_w, 0, var1 << 1);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int h() {
        return ((kg) this).field_z - (((kg) this).field_v.available() >> (field_h ? 2 : 1));
    }

    kg() {
        ((kg) this).field_x = false;
    }

    final void a(java.awt.Component param0) {
        javax.sound.sampled.Mixer.Info[] var2 = null;
        javax.sound.sampled.Mixer.Info[] var3 = null;
        int var4 = 0;
        javax.sound.sampled.Mixer.Info var5 = null;
        String var6 = null;
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
        Object stackIn_14_0 = null;
        javax.sound.sampled.AudioFormat stackIn_14_1 = null;
        javax.sound.sampled.AudioFormat stackIn_14_2 = null;
        float stackIn_14_3 = 0.0f;
        int stackIn_14_4 = 0;
        int stackIn_14_5 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        Object stackOut_11_0 = null;
        javax.sound.sampled.AudioFormat stackOut_11_1 = null;
        javax.sound.sampled.AudioFormat stackOut_11_2 = null;
        float stackOut_11_3 = 0.0f;
        int stackOut_11_4 = 0;
        Object stackOut_13_0 = null;
        javax.sound.sampled.AudioFormat stackOut_13_1 = null;
        javax.sound.sampled.AudioFormat stackOut_13_2 = null;
        float stackOut_13_3 = 0.0f;
        int stackOut_13_4 = 0;
        int stackOut_13_5 = 0;
        Object stackOut_12_0 = null;
        javax.sound.sampled.AudioFormat stackOut_12_1 = null;
        javax.sound.sampled.AudioFormat stackOut_12_2 = null;
        float stackOut_12_3 = 0.0f;
        int stackOut_12_4 = 0;
        int stackOut_12_5 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
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
                      ((kg) this).field_x = true;
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
          stackOut_11_0 = this;
          stackOut_11_1 = null;
          stackOut_11_2 = null;
          stackOut_11_3 = (float)field_a;
          stackOut_11_4 = 16;
          stackIn_13_0 = stackOut_11_0;
          stackIn_13_1 = stackOut_11_1;
          stackIn_13_2 = stackOut_11_2;
          stackIn_13_3 = stackOut_11_3;
          stackIn_13_4 = stackOut_11_4;
          stackIn_12_0 = stackOut_11_0;
          stackIn_12_1 = stackOut_11_1;
          stackIn_12_2 = stackOut_11_2;
          stackIn_12_3 = stackOut_11_3;
          stackIn_12_4 = stackOut_11_4;
          if (!field_h) {
            stackOut_13_0 = this;
            stackOut_13_1 = null;
            stackOut_13_2 = null;
            stackOut_13_3 = stackIn_13_3;
            stackOut_13_4 = stackIn_13_4;
            stackOut_13_5 = 1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            stackIn_14_2 = stackOut_13_2;
            stackIn_14_3 = stackOut_13_3;
            stackIn_14_4 = stackOut_13_4;
            stackIn_14_5 = stackOut_13_5;
            break L2;
          } else {
            stackOut_12_0 = this;
            stackOut_12_1 = null;
            stackOut_12_2 = null;
            stackOut_12_3 = stackIn_12_3;
            stackOut_12_4 = stackIn_12_4;
            stackOut_12_5 = 2;
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_14_2 = stackOut_12_2;
            stackIn_14_3 = stackOut_12_3;
            stackIn_14_4 = stackOut_12_4;
            stackIn_14_5 = stackOut_12_5;
            break L2;
          }
        }
        L3: {
          new javax.sound.sampled.AudioFormat(stackIn_14_3, stackIn_14_4, stackIn_14_5, true, false);
          ((kg) this).field_y = stackIn_14_1;
          stackOut_14_0 = this;
          stackOut_14_1 = 256;
          stackIn_16_0 = stackOut_14_0;
          stackIn_16_1 = stackOut_14_1;
          stackIn_15_0 = stackOut_14_0;
          stackIn_15_1 = stackOut_14_1;
          if (!field_h) {
            stackOut_16_0 = this;
            stackOut_16_1 = stackIn_16_1;
            stackOut_16_2 = 1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            stackIn_17_2 = stackOut_16_2;
            break L3;
          } else {
            stackOut_15_0 = this;
            stackOut_15_1 = stackIn_15_1;
            stackOut_15_2 = 2;
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_17_2 = stackOut_15_2;
            break L3;
          }
        }
        ((kg) this).field_w = new byte[stackIn_17_1 << stackIn_17_2];
    }

    final void b(int param0) throws javax.sound.sampled.LineUnavailableException {
        javax.sound.sampled.DataLine.Info var2 = null;
        try {
            var2 = new javax.sound.sampled.DataLine.Info(javax.sound.sampled.SourceDataLine.class, ((kg) this).field_y, param0 << (field_h ? 2 : 1));
            ((kg) this).field_v = (javax.sound.sampled.SourceDataLine) (Object) javax.sound.sampled.AudioSystem.getLine((javax.sound.sampled.Line.Info) (Object) var2);
            ((kg) this).field_v.open();
            ((kg) this).field_v.start();
            ((kg) this).field_z = param0;
        } catch (javax.sound.sampled.LineUnavailableException lineUnavailableException) {
            if (h.a(param0, -122) != 1) {
                ((kg) this).b(bf.a(true, param0));
                return;
            }
            ((kg) this).field_v = null;
            throw lineUnavailableException;
        }
    }

    final void e() throws javax.sound.sampled.LineUnavailableException {
        javax.sound.sampled.DataLine.Info var1 = null;
        ((kg) this).field_v.flush();
        if (((kg) this).field_x) {
            ((kg) this).field_v.close();
            ((kg) this).field_v = null;
            var1 = new javax.sound.sampled.DataLine.Info(javax.sound.sampled.SourceDataLine.class, ((kg) this).field_y, ((kg) this).field_z << (field_h ? 2 : 1));
            ((kg) this).field_v = (javax.sound.sampled.SourceDataLine) (Object) javax.sound.sampled.AudioSystem.getLine((javax.sound.sampled.Line.Info) (Object) var1);
            ((kg) this).field_v.open();
            ((kg) this).field_v.start();
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "soundmax";
    }
}
