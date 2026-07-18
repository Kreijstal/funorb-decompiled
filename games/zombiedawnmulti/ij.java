/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij implements nl {
    private int field_p;
    static String field_f;
    private int field_i;
    private int field_h;
    static int field_d;
    private int field_e;
    private int field_l;
    private int field_o;
    private int field_c;
    private int field_j;
    static String field_a;
    private int field_m;
    private fm field_n;
    private int field_g;
    static cj[] field_k;
    private int field_b;

    public static void a(boolean param0) {
        field_a = null;
        field_k = null;
        field_f = null;
    }

    final static bm a(byte[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        bm stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        bm stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var2_int = 100;
            var3 = 100;
            var4 = new byte[param0.length - -8];
            var5 = 0;
            L1: while (true) {
              if (var5 >= 6) {
                br.a(6, var4, -93, var2_int);
                br.a(7, var4, -123, var3);
                var5 = 6;
                L2: while (true) {
                  if (param0.length / 4 <= var5) {
                    stackOut_7_0 = bo.a(var4, 24);
                    stackIn_8_0 = stackOut_7_0;
                    break L0;
                  } else {
                    br.a(2 + var5, var4, -72, re.a(param0, var5, (byte) 51));
                    var5++;
                    continue L2;
                  }
                }
              } else {
                br.a(var5, var4, -117, re.a(param0, var5, (byte) 110));
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2;
            stackOut_9_1 = new StringBuilder().append("ij.E(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + 7 + ')');
        }
        return stackIn_8_0;
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6, ja param7, int param8) {
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var9_int = -param2 + param5 + (param7.field_r - -param3);
              var10 = param1 + (param5 + (param3 + param7.field_r));
              var11 = (param7.field_w >> 1) + (param7.field_y - -param0);
              oo.e(var9_int, 0, var10, var11 + param6);
              param7.e(param3 + -1, -1 + param0, param8);
              param7.e(-1 + param3, 1 + param0, param8);
              oo.b(b.field_f);
              oo.e(1 + var9_int, 0, 1 + var10, param6 + var11);
              param7.e(1 + param3, param0 + -1, param8);
              param7.e(1 + param3, param0 - -1, param8);
              oo.b(b.field_f);
              var10 = param7.field_x + (param7.field_r + (param3 - param5)) - param2;
              var9_int = param7.field_r - -param7.field_x - (-param3 - (-param5 - param1));
              oo.e(var9_int, -param6 + var11, var10, 480);
              param7.e(-1 + param3, param0 - 1, param8);
              param7.e(param3 + -1, 1 + param0, param8);
              oo.b(b.field_f);
              oo.e(1 + var9_int, -param6 + var11, 1 + var10, 480);
              param7.e(1 + param3, param0 - 1, param8);
              param7.e(1 + param3, param0 - -1, param8);
              if (!param4) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            oo.b(b.field_f);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var9 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var9;
            stackOut_4_1 = new StringBuilder().append("ij.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param7 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param8 + ')');
        }
    }

    final static gh a(boolean param0, boolean param1) {
        gh var2 = new gh(true);
        var2.field_e = param1 ? true : false;
        return var2;
    }

    public final void a(boolean param0, int param1, int param2, int param3, cf param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        fj var12 = null;
        cf stackIn_3_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        cf stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              if (param4 instanceof fj) {
                stackOut_2_0 = (cf) param4;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (cf) (Object) stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var12 = (fj) (Object) stackIn_3_0;
              if (var12 != null) {
                param0 = param0 & var12.field_F;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var7 = 5592405;
              if (param0) {
                var7 = 16777215;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              oo.e(param4.field_y + param3, param1 + param4.field_i, param4.field_n, param4.field_w, ((ij) this).field_o);
              var8 = ((ij) this).field_g + (param4.field_y + param3);
              var9 = ((ij) this).field_e + (param1 + param4.field_i);
              oo.f(var8, var9, ((ij) this).field_l, ((ij) this).field_i, 5592405);
              oo.e(var8, var9, ((ij) this).field_l, ((ij) this).field_i, var7);
              if (param2 == -15112) {
                break L4;
              } else {
                var11 = null;
                ij.a(100, -43, 108, -70, true, -27, -48, (ja) null, -23);
                break L4;
              }
            }
            L5: {
              if (var12.field_G) {
                oo.g(var8, var9, ((ij) this).field_l + var8, var9 - -((ij) this).field_i, 1);
                oo.g(var8 + ((ij) this).field_l, var9, var8, var9 + ((ij) this).field_i, 1);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (((ij) this).field_n != null) {
                var10 = ((ij) this).field_b + ((ij) this).field_g + ((ij) this).field_l;
                int discarded$1 = ((ij) this).field_n.a(param4.field_j, param3 + param4.field_y - -var10, ((ij) this).field_p + param1 - -param4.field_i, param4.field_n - ((ij) this).field_b - var10, -(((ij) this).field_b << 1) + param4.field_w, ((ij) this).field_j, ((ij) this).field_m, ((ij) this).field_c, ((ij) this).field_h, 0);
                break L6;
              } else {
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var6;
            stackOut_18_1 = new StringBuilder().append("ij.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param4 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
    }

    ij(fm param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((ij) this).field_c = 1;
        ((ij) this).field_h = 1;
        try {
            ((ij) this).field_j = param3;
            ((ij) this).field_p = param2;
            ((ij) this).field_b = param1;
            ((ij) this).field_m = param4;
            ((ij) this).field_o = param9;
            ((ij) this).field_e = param6;
            ((ij) this).field_l = param8;
            ((ij) this).field_g = param5;
            ((ij) this).field_n = param0;
            ((ij) this).field_i = param7;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "ij.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = -1;
        field_f = "You must play <%1> more rated games before playing with the current options.";
        field_a = "Year";
    }
}
