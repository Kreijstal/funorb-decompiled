/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi {
    static lda field_a;

    final static void a(int param0) {
        Object var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            var1 = (Object) (Object) vv.field_e;
            synchronized (var1) {
              L1: {
                ce.field_x = ce.field_x + 1;
                gha.field_q = jaa.field_s;
                L2: {
                  if (0 > gfa.field_c) {
                    var5 = 0;
                    var2 = var5;
                    L3: while (true) {
                      if (var5 >= 112) {
                        gfa.field_c = cj.field_i;
                        break L2;
                      } else {
                        wga.field_q[var5] = false;
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    L4: while (true) {
                      if (cj.field_i == gfa.field_c) {
                        break L2;
                      } else {
                        var2 = wd.field_x[cj.field_i];
                        cj.field_i = 1 + cj.field_i & 127;
                        if (var2 < 0) {
                          wga.field_q[~var2] = false;
                          continue L4;
                        } else {
                          wga.field_q[var2] = true;
                          continue L4;
                        }
                      }
                    }
                  }
                }
                jaa.field_s = lma.field_x;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1_ref, "hi.A(" + 116 + ')');
        }
    }

    final static void a(boolean param0, int[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            var2_int = param1.length;
            ik.field_d = new int[2 + var2_int];
            ik.field_d[0] = 50;
            var3 = 590;
            ik.field_d[1 + var2_int] = var3;
            var4 = var2_int;
            L1: while (true) {
              if (0 >= var4) {
                break L0;
              } else {
                var3 = var3 - param1[var4 + -1];
                ik.field_d[var4] = var3;
                var4--;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("hi.B(").append(true).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 < 17) {
            hi.a((byte) -70);
        }
    }

    static {
    }
}
