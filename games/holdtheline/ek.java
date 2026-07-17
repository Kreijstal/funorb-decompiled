/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek implements dh {
    private int field_k;
    private int field_e;
    static String field_q;
    private int field_g;
    static int field_o;
    static String field_u;
    private qi field_h;
    private int field_t;
    private int field_r;
    private int field_s;
    static String field_w;
    private int field_p;
    static int field_x;
    static String field_d;
    static hj field_m;
    static int field_l;
    private int field_f;
    static int[] field_n;
    private int field_i;
    static int field_j;
    private int field_b;
    static float[] field_c;
    private int field_a;
    static String field_v;

    public final void a(boolean param0, int param1, int param2, n param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        sj var11 = null;
        n stackIn_3_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        n stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (param3 instanceof sj) {
                stackOut_2_0 = (n) param3;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (n) (Object) stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var11 = (sj) (Object) stackIn_3_0;
              if (var11 == null) {
                break L2;
              } else {
                param0 = param0 & var11.field_D;
                break L2;
              }
            }
            L3: {
              var7 = 5592405;
              if (!param0) {
                break L3;
              } else {
                var7 = 16777215;
                break L3;
              }
            }
            if (param2 < -48) {
              L4: {
                tc.f(param1 + param3.field_k, param3.field_o + param4, param3.field_x, param3.field_u, ((ek) this).field_k);
                var8 = ((ek) this).field_t + (param3.field_k + param1);
                var9 = param3.field_o + param4 - -((ek) this).field_g;
                tc.e(var8, var9, ((ek) this).field_s, ((ek) this).field_i, 5592405);
                tc.f(var8, var9, ((ek) this).field_s, ((ek) this).field_i, var7);
                if (!var11.field_B) {
                  break L4;
                } else {
                  tc.d(var8, var9, var8 - -((ek) this).field_s, ((ek) this).field_i + var9, 1);
                  tc.d(((ek) this).field_s + var8, var9, var8, ((ek) this).field_i + var9, 1);
                  break L4;
                }
              }
              if (((ek) this).field_h != null) {
                var10 = ((ek) this).field_r + ((ek) this).field_s + ((ek) this).field_t;
                int discarded$1 = ((ek) this).field_h.a(param3.field_q, param1 - (-param3.field_k + -var10), ((ek) this).field_f + param3.field_o + param4, param3.field_x + (-var10 + -((ek) this).field_r), -(((ek) this).field_r << 1) + param3.field_u, ((ek) this).field_a, ((ek) this).field_p, ((ek) this).field_e, ((ek) this).field_b, 0);
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var6;
            stackOut_15_1 = new StringBuilder().append("ek.C(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param4 + 41);
        }
    }

    public static void a(boolean param0) {
        field_n = null;
        field_c = null;
        field_u = null;
        field_q = null;
        field_v = null;
        field_w = null;
        field_d = null;
        field_m = null;
    }

    final static void a(int param0, int param1, hj param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var12 = HoldTheLine.field_D;
        try {
          L0: {
            if (param1 == 1024) {
              dd.a(param0 + 7091, param5, param2, param3, param4);
              return;
            } else {
              param5 = param5 - ((-1024 + param1) * param2.field_y >> 11);
              param3 = param3 - (param2.field_s * (-1024 + param1) >> 11);
              var6_int = param0 + tc.field_j * param5 - -param3;
              var8 = 0;
              var9 = 0;
              var10 = param1 * param2.field_y >> 10;
              L1: while (true) {
                if (var10 <= 0) {
                  break L0;
                } else {
                  var8 = param2.field_s * (var9 >> 10) << 10;
                  var7 = var6_int - 1;
                  var11 = param1 * param2.field_s >> 10;
                  L2: while (true) {
                    if (0 >= var11) {
                      var9 = var9 + 1048576 / param1;
                      var6_int = var6_int + tc.field_j;
                      var10--;
                      continue L1;
                    } else {
                      L3: {
                        if (param2.field_z[var8 >> 10] != 0) {
                          if (16777215 == param2.field_z[var8 >> 10]) {
                            var7++;
                            tc.field_b[var7] = param4;
                            break L3;
                          } else {
                            var7++;
                            tc.field_b[var7] = param2.field_z[var8 >> 10];
                            break L3;
                          }
                        } else {
                          var7++;
                          break L3;
                        }
                      }
                      var8 = var8 + 1048576 / param1;
                      var11--;
                      continue L2;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var6;
            stackOut_17_1 = new StringBuilder().append("ek.B(").append(param0).append(44).append(param1).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    ek(qi param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((ek) this).field_e = 1;
        ((ek) this).field_b = 1;
        try {
            ((ek) this).field_h = param0;
            ((ek) this).field_t = param5;
            ((ek) this).field_i = param7;
            ((ek) this).field_s = param8;
            ((ek) this).field_g = param6;
            ((ek) this).field_p = param4;
            ((ek) this).field_f = param2;
            ((ek) this).field_r = param1;
            ((ek) this).field_k = param9;
            ((ek) this).field_a = param3;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "ek.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "To server list";
        field_q = "Loading";
        field_d = "From only <%0>/month";
        field_j = 500;
        field_w = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_c = new float[]{1.0f, 4.0f, 10.0f, 50.0f};
        field_v = "Create";
    }
}
