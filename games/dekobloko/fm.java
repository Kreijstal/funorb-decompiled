/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fm {
    static boolean field_e;
    static String field_c;
    static boolean field_b;
    static long field_d;
    static boolean field_f;
    static String field_a;

    final static void a(byte param0, bh param1, bh param2) {
        try {
            int var3_int = 32 % ((param0 - 60) / 49);
            if (!(null == param1.field_a)) {
                param1.b((byte) 113);
            }
            param1.field_b = param2;
            param1.field_a = param2.field_a;
            param1.field_a.field_b = param1;
            param1.field_b.field_a = param1;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "fm.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, int param1, kn param2) {
        int discarded$1 = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        uf var7 = null;
        uf var8 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = client.field_A ? 1 : 0;
        try {
          L0: {
            var7 = we.field_b;
            var8 = var7;
            var8.f(param1, -4);
            var8.field_n = var8.field_n + 1;
            var4 = var8.field_n;
            var8.a(true, 1);
            var8.d(-1, param2.field_u);
            var8.d(-1, param2.field_x);
            var8.d(-1, param2.field_q);
            var8.a(param2.field_t, false);
            var8.a(param2.field_v, false);
            var8.a(param2.field_w, false);
            var8.a(param2.field_y, false);
            var8.a(true, param2.field_s.length);
            var5 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var5 >= param2.field_s.length) {
                    break L3;
                  } else {
                    var7.a(param2.field_s[var5], false);
                    var5++;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                discarded$1 = var8.a((byte) -15, var4);
                var8.b(var8.field_n - var4, true);
                break L2;
              }
              if (param0 <= -90) {
                break L0;
              } else {
                field_b = true;
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3);
            stackOut_10_1 = new StringBuilder().append("fm.I(").append(param0).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    abstract void a(wl param0, byte param1);

    public static void a(boolean param0) {
        field_a = null;
        field_c = null;
        if (!param0) {
            kn var2 = (kn) null;
            fm.a((byte) 8, -15, (kn) null);
        }
    }

    abstract gh a(int param0);

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var10 = client.field_A ? 1 : 0;
          if (80 > param4) {
            stackOut_2_0 = param4 / 20 * 18;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 54;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var7 = stackIn_3_0;
        var8 = 0;
        if (60 > param4) {
          var7 = var7 + vl.a(23841, 80, param3 * 18 - -40);
          if (var10 != 0) {
            if ((param4 ^ -1) <= -81) {
              if (param4 >= 93) {
                hk.a(param1 + -36 + -3, param2 + 36 - 3, 78, 60, 4, 65280, 100);
                if (var10 == 0) {
                  cg.a(param0, 2, 5, param1 - -18, param2 + 73, -2, -2);
                  cg.a(param0, 2, 12, 18 + param1, param2 - -55, -2, -1);
                  cg.a(param0, 2, 8, 18 + param1, 36 + (param2 - -1), -2, -1);
                  cg.a(param0, 2, 2, param1, 1 + param2 + 72, -1, -2);
                  fb.field_c[param0][2].c(param1 + -18, 72 + param2, 18, 18);
                  fb.field_c[param0][2].c(-36 + param1, param2 + 72, 18, 18);
                  var9 = 16 / ((59 - param5) / 43);
                  fb.field_c[param0][2].c(param1, param2 - -54, 18, 18);
                  fb.field_c[param0][2].c(param1 + -18, param2 - -var7 + var8, 18, 18 + -var8);
                  return;
                } else {
                  var8 = vl.a(23841, 80, 18 * ve.field_ic[1 + param4 - 80] - -40);
                  var7 = var7 + vl.a(23841, 80, param6 * 18 - -40);
                  cg.a(param0, 2, 5, param1 - -18, param2 + 73, -2, -2);
                  cg.a(param0, 2, 12, 18 + param1, param2 - -55, -2, -1);
                  cg.a(param0, 2, 8, 18 + param1, 36 + (param2 - -1), -2, -1);
                  cg.a(param0, 2, 2, param1, 1 + param2 + 72, -1, -2);
                  fb.field_c[param0][2].c(param1 + -18, 72 + param2, 18, 18);
                  fb.field_c[param0][2].c(-36 + param1, param2 + 72, 18, 18);
                  var9 = 16 / ((59 - param5) / 43);
                  fb.field_c[param0][2].c(param1, param2 - -54, 18, 18);
                  fb.field_c[param0][2].c(param1 + -18, param2 - -var7 + var8, 18, 18 + -var8);
                  return;
                }
              } else {
                L1: {
                  var8 = vl.a(23841, 80, 18 * ve.field_ic[1 + param4 - 80] - -40);
                  if (var10 == 0) {
                    break L1;
                  } else {
                    var7 = var7 + vl.a(23841, 80, param6 * 18 - -40);
                    break L1;
                  }
                }
                cg.a(param0, 2, 5, param1 - -18, param2 + 73, -2, -2);
                cg.a(param0, 2, 12, 18 + param1, param2 - -55, -2, -1);
                cg.a(param0, 2, 8, 18 + param1, 36 + (param2 - -1), -2, -1);
                cg.a(param0, 2, 2, param1, 1 + param2 + 72, -1, -2);
                fb.field_c[param0][2].c(param1 + -18, 72 + param2, 18, 18);
                fb.field_c[param0][2].c(-36 + param1, param2 + 72, 18, 18);
                var9 = 16 / ((59 - param5) / 43);
                fb.field_c[param0][2].c(param1, param2 - -54, 18, 18);
                fb.field_c[param0][2].c(param1 + -18, param2 - -var7 + var8, 18, 18 + -var8);
                return;
              }
            } else {
              var7 = var7 + vl.a(23841, 80, param6 * 18 - -40);
              cg.a(param0, 2, 5, param1 - -18, param2 + 73, -2, -2);
              cg.a(param0, 2, 12, 18 + param1, param2 - -55, -2, -1);
              cg.a(param0, 2, 8, 18 + param1, 36 + (param2 - -1), -2, -1);
              cg.a(param0, 2, 2, param1, 1 + param2 + 72, -1, -2);
              fb.field_c[param0][2].c(param1 + -18, 72 + param2, 18, 18);
              fb.field_c[param0][2].c(-36 + param1, param2 + 72, 18, 18);
              var9 = 16 / ((59 - param5) / 43);
              fb.field_c[param0][2].c(param1, param2 - -54, 18, 18);
              fb.field_c[param0][2].c(param1 + -18, param2 - -var7 + var8, 18, 18 + -var8);
              return;
            }
          } else {
            cg.a(param0, 2, 5, param1 - -18, param2 + 73, -2, -2);
            cg.a(param0, 2, 12, 18 + param1, param2 - -55, -2, -1);
            cg.a(param0, 2, 8, 18 + param1, 36 + (param2 - -1), -2, -1);
            cg.a(param0, 2, 2, param1, 1 + param2 + 72, -1, -2);
            fb.field_c[param0][2].c(param1 + -18, 72 + param2, 18, 18);
            fb.field_c[param0][2].c(-36 + param1, param2 + 72, 18, 18);
            var9 = 16 / ((59 - param5) / 43);
            fb.field_c[param0][2].c(param1, param2 - -54, 18, 18);
            fb.field_c[param0][2].c(param1 + -18, param2 - -var7 + var8, 18, 18 + -var8);
            return;
          }
        } else {
          if ((param4 ^ -1) <= -81) {
            if (param4 >= 93) {
              hk.a(param1 + -36 + -3, param2 + 36 - 3, 78, 60, 4, 65280, 100);
              if (var10 == 0) {
                cg.a(param0, 2, 5, param1 - -18, param2 + 73, -2, -2);
                cg.a(param0, 2, 12, 18 + param1, param2 - -55, -2, -1);
                cg.a(param0, 2, 8, 18 + param1, 36 + (param2 - -1), -2, -1);
                cg.a(param0, 2, 2, param1, 1 + param2 + 72, -1, -2);
                fb.field_c[param0][2].c(param1 + -18, 72 + param2, 18, 18);
                fb.field_c[param0][2].c(-36 + param1, param2 + 72, 18, 18);
                var9 = 16 / ((59 - param5) / 43);
                fb.field_c[param0][2].c(param1, param2 - -54, 18, 18);
                fb.field_c[param0][2].c(param1 + -18, param2 - -var7 + var8, 18, 18 + -var8);
                return;
              } else {
                var8 = vl.a(23841, 80, 18 * ve.field_ic[1 + param4 - 80] - -40);
                var7 = var7 + vl.a(23841, 80, param6 * 18 - -40);
                cg.a(param0, 2, 5, param1 - -18, param2 + 73, -2, -2);
                cg.a(param0, 2, 12, 18 + param1, param2 - -55, -2, -1);
                cg.a(param0, 2, 8, 18 + param1, 36 + (param2 - -1), -2, -1);
                cg.a(param0, 2, 2, param1, 1 + param2 + 72, -1, -2);
                fb.field_c[param0][2].c(param1 + -18, 72 + param2, 18, 18);
                fb.field_c[param0][2].c(-36 + param1, param2 + 72, 18, 18);
                var9 = 16 / ((59 - param5) / 43);
                fb.field_c[param0][2].c(param1, param2 - -54, 18, 18);
                fb.field_c[param0][2].c(param1 + -18, param2 - -var7 + var8, 18, 18 + -var8);
                return;
              }
            } else {
              L2: {
                var8 = vl.a(23841, 80, 18 * ve.field_ic[1 + param4 - 80] - -40);
                if (var10 == 0) {
                  break L2;
                } else {
                  var7 = var7 + vl.a(23841, 80, param6 * 18 - -40);
                  break L2;
                }
              }
              cg.a(param0, 2, 5, param1 - -18, param2 + 73, -2, -2);
              cg.a(param0, 2, 12, 18 + param1, param2 - -55, -2, -1);
              cg.a(param0, 2, 8, 18 + param1, 36 + (param2 - -1), -2, -1);
              cg.a(param0, 2, 2, param1, 1 + param2 + 72, -1, -2);
              fb.field_c[param0][2].c(param1 + -18, 72 + param2, 18, 18);
              fb.field_c[param0][2].c(-36 + param1, param2 + 72, 18, 18);
              var9 = 16 / ((59 - param5) / 43);
              fb.field_c[param0][2].c(param1, param2 - -54, 18, 18);
              fb.field_c[param0][2].c(param1 + -18, param2 - -var7 + var8, 18, 18 + -var8);
              return;
            }
          } else {
            var7 = var7 + vl.a(23841, 80, param6 * 18 - -40);
            cg.a(param0, 2, 5, param1 - -18, param2 + 73, -2, -2);
            cg.a(param0, 2, 12, 18 + param1, param2 - -55, -2, -1);
            cg.a(param0, 2, 8, 18 + param1, 36 + (param2 - -1), -2, -1);
            cg.a(param0, 2, 2, param1, 1 + param2 + 72, -1, -2);
            fb.field_c[param0][2].c(param1 + -18, 72 + param2, 18, 18);
            fb.field_c[param0][2].c(-36 + param1, param2 + 72, 18, 18);
            var9 = 16 / ((59 - param5) / 43);
            fb.field_c[param0][2].c(param1, param2 - -54, 18, 18);
            fb.field_c[param0][2].c(param1 + -18, param2 - -var7 + var8, 18, 18 + -var8);
            return;
          }
        }
    }

    static {
        field_c = "In Single-player";
        field_a = "Connection restored.";
    }
}
