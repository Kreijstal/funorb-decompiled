/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi {
    static lda field_a;

    final static void a(int param0) {
        int var2 = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        RuntimeException var1_ref = null;
        int var5 = 0;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            var1 = vv.field_e;
            synchronized (var1) {
              L1: {
                ce.field_x = ce.field_x + 1;
                gha.field_q = jaa.field_s;
                if (param0 >= 82) {
                  L2: {
                    if (0 > gfa.field_c) {
                      var5 = 0;
                      var2 = var5;
                      L3: while (true) {
                        if ((var5 ^ -1) <= -113) {
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
                          if (-1 < (var2 ^ -1)) {
                            wga.field_q[var2 ^ -1] = false;
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
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1_ref), "hi.A(" + param0 + ')');
        }
    }

    final static void a(boolean param0, int[] param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var2_int = param1.length;
              ik.field_d = new int[2 + var2_int];
              ik.field_d[0] = 50;
              var3 = 590;
              ik.field_d[1 + var2_int] = var3;
              if (param0) {
                break L1;
              } else {
                field_a = (lda) null;
                break L1;
              }
            }
            var4 = var2_int;
            L2: while (true) {
              if (0 >= var4) {
                break L0;
              } else {
                var3 = var3 - param1[var4 + -1];
                ik.field_d[var4] = var3;
                var4--;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("hi.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
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
