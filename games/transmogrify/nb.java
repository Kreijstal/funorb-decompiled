/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb {
    static String field_c;
    int field_a;
    int field_b;
    int field_e;
    int field_d;

    final static void a(int param0, gh param1, int param2) {
        hj var6 = null;
        int var4 = 0;
        try {
            var6 = ff.field_D;
            hj var3 = var6;
            var6.a(false, param0);
            var6.field_h = var6.field_h + 1;
            var4 = var6.field_h;
            var6.f(6389, 1);
            if (null != param1.field_k) {
                var6.f(6389, param1.field_k.length);
                var6.a((byte) -65, param1.field_k, param1.field_k.length, 0);
            } else {
                var6.f(6389, 0);
            }
            int discarded$8 = var6.d(var4, param2 ^ -1323322296);
            if (param2 != 0) {
                Object var5 = null;
                nb.a(-41, (gh) null, 68);
            }
            var6.field_h = var6.field_h - 4;
            param1.field_j = var6.c((byte) -121);
            var6.a((byte) -42, -var4 + var6.field_h);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "nb.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        int var1 = -24 % ((param0 - -46) / 43);
        field_c = null;
    }

    final static e a(boolean param0, hj param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        e var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        e stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        e stackOut_19_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = param1.k(8, 1522829539);
            if (var2_int <= 0) {
              L1: {
                var3 = w.a(-1, param1) ? 1 : 0;
                var4 = w.a(-1, param1) ? 1 : 0;
                var5 = new e();
                var5.field_M = (short)param1.k(16, 1522829539);
                var5.field_v = lb.a(var5.field_v, 256, 16, param1);
                var5.field_d = lb.a(var5.field_d, 256, 16, param1);
                var5.field_B = lb.a(var5.field_B, 256, 16, param1);
                var5.field_C = (short)param1.k(16, 1522829539);
                var5.field_o = lb.a(var5.field_o, 256, 16, param1);
                var5.field_s = lb.a(var5.field_s, 256, 16, param1);
                var5.field_G = lb.a(var5.field_G, 256, 16, param1);
                if (var3 != 0) {
                  var5.field_l = (short)param1.k(16, 1522829539);
                  var5.field_e = lb.a(var5.field_e, 256, 16, param1);
                  var5.field_F = lb.a(var5.field_F, 256, 16, param1);
                  var5.field_L = lb.a(var5.field_L, 256, 16, param1);
                  var5.field_b = lb.a(var5.field_b, 256, 16, param1);
                  var5.field_n = lb.a(var5.field_n, 256, 16, param1);
                  var5.field_J = lb.a(var5.field_J, 256, 16, param1);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var4 == 0) {
                  break L2;
                } else {
                  int discarded$1 = param1.k(16, 1522829539);
                  var5.field_N = lb.a(var5.field_N, 256, 16, param1);
                  var5.field_H = lb.a(var5.field_H, 256, 16, param1);
                  var5.field_h = lb.a(var5.field_h, 256, 16, param1);
                  var5.field_A = lb.a(var5.field_A, 256, 16, param1);
                  var5.field_r = lb.a(var5.field_r, 256, 16, param1);
                  break L2;
                }
              }
              L3: {
                if (!w.a(-1, param1)) {
                  break L3;
                } else {
                  var5.field_f = lb.a(var5.field_f, 256, 16, param1);
                  break L3;
                }
              }
              L4: {
                if (!w.a(-1, param1)) {
                  break L4;
                } else {
                  var5.field_y = dj.a(-39, param1, var5.field_y, 16);
                  var6 = 0;
                  var7 = 0;
                  L5: while (true) {
                    if (var7 >= var5.field_y.length) {
                      if (0 != var6) {
                        var5.field_w = (byte)(var6 + 1);
                        break L4;
                      } else {
                        var5.field_y = null;
                        break L4;
                      }
                    } else {
                      L6: {
                        if (var6 >= (var5.field_y[var7] & 255)) {
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var7++;
                      continue L5;
                    }
                  }
                }
              }
              stackOut_19_0 = (e) var5;
              stackIn_20_0 = stackOut_19_0;
              break L0;
            } else {
              throw new IllegalStateException("" + var2_int);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var2;
            stackOut_21_1 = new StringBuilder().append("nb.A(").append(true).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
        }
        return stackIn_20_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
