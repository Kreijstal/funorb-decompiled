/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab implements td {
    private int field_m;
    private int field_d;
    private int field_b;
    private kc field_k;
    private int field_c;
    private int field_a;
    private int field_i;
    static ml field_j;
    private int field_e;
    static im field_h;
    static hj[] field_g;
    static int field_f;
    static int field_l;

    public final void a(int param0, int param1, pj param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        bj var15 = null;
        pj stackIn_3_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        pj stackOut_1_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (!(param2 instanceof bj)) {
                stackOut_2_0 = null;
                stackIn_3_0 = (pj) (Object) stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = (pj) param2;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var15 = (bj) (Object) stackIn_3_0;
              ul.h(param2.field_s + param1, param0 - -param2.field_n, param2.field_m, param2.field_r, ((ab) this).field_a);
              if (var15 != null) {
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var7 = var15.field_H + param1 + param2.field_s;
              var8 = param2.field_n + param0 - -var15.field_K;
              ul.f(var7, var8, var15.field_G, ((ab) this).field_d);
              if (var15.field_L == -1) {
                break L3;
              } else {
                var9 = 2.0 * ((double)var15.field_L * 3.141592653589793) / (double)var15.field_I;
                var11 = (int)(-Math.sin(var9) * (double)var15.field_G);
                var12 = (int)(Math.cos(var9) * (double)var15.field_G);
                ul.f(var7 - -var11, var12 + var8, 1, ((ab) this).field_i);
                break L3;
              }
            }
            L4: {
              ul.f(var7, var8, 2, 1);
              var9 = 2.0 * (3.141592653589793 * (double)var15.field_J) / (double)var15.field_I;
              var11 = (int)(-Math.sin(var9) * (double)var15.field_G);
              if (param3 == -4394) {
                break L4;
              } else {
                var14 = null;
                ((ab) this).a(19, 76, (pj) null, 43, true);
                break L4;
              }
            }
            L5: {
              var12 = (int)(Math.cos(var9) * (double)var15.field_G);
              ul.b(var7, var8, var7 - -var11, var12 + var8, 1);
              if (null == ((ab) this).field_k) {
                break L5;
              } else {
                var13 = ((ab) this).field_m + (var15.field_H + var15.field_G);
                int discarded$1 = ((ab) this).field_k.a(param2.field_l, param2.field_s + (param1 + var13), param0 - -param2.field_n - -((ab) this).field_b, param2.field_m - (var13 - -((ab) this).field_m), param2.field_r - (((ab) this).field_m << 1), ((ab) this).field_e, ((ab) this).field_c, 1, 1, 0);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("ab.A(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L6;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L6;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(boolean param0) {
        field_j = null;
        field_g = null;
        field_h = null;
    }

    final static void a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        Object var2 = null;
        int var3 = 0;
        Throwable var4 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          var1_int = 0;
          var2 = (Object) (Object) ad.field_b;
          synchronized (var2) {
            L0: {
              L1: {
                md.field_g = pk.field_H;
                ji.field_c = ji.field_c + 1;
                if (wg.field_p >= 0) {
                  L2: while (true) {
                    if (al.field_b == wg.field_p) {
                      break L1;
                    } else {
                      var3 = gl.field_i[al.field_b];
                      al.field_b = al.field_b + 1 & 127;
                      if (0 <= var3) {
                        ek.field_a[var3] = true;
                        continue L2;
                      } else {
                        ek.field_a[~var3] = false;
                        continue L2;
                      }
                    }
                  }
                } else {
                  var3 = 0;
                  L3: while (true) {
                    if (112 <= var3) {
                      wg.field_p = al.field_b;
                      break L1;
                    } else {
                      ek.field_a[var3] = false;
                      var3++;
                      continue L3;
                    }
                  }
                }
              }
              pk.field_H = uf.field_a;
              break L0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (RuntimeException) (Object) decompiledCaughtException;
          throw dd.a((Throwable) (Object) var1, "ab.B(" + -128 + ')');
        }
    }

    ab(kc param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            ((ab) this).field_d = param5;
            ((ab) this).field_c = param4;
            ((ab) this).field_k = param0;
            ((ab) this).field_b = param2;
            ((ab) this).field_e = param3;
            ((ab) this).field_m = param1;
            ((ab) this).field_i = param6;
            ((ab) this).field_a = param7;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "ab.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new ml(1);
        field_h = new im();
        field_l = -1;
    }
}
