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
        if (!param0) {
            byte[] var2 = (byte[]) null;
            ij.a((byte[]) null, 45);
        }
    }

    final static bm a(byte[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        bm stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var2_int = 100;
            var3 = 100;
            var4 = new byte[param0.length - -8];
            var5 = 0;
            L1: while (true) {
              if ((var5 ^ -1) <= -7) {
                br.a(6, var4, -93, var2_int);
                br.a(param1, var4, -123, var3);
                var5 = 6;
                L2: while (true) {
                  if (param0.length / 4 <= var5) {
                    stackIn_8_0 = bo.a(var4, param1 + 17);
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
            stackIn_11_0 = (RuntimeException) (var2);

            stackIn_11_1 = new StringBuilder().append("ij.E(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_8_0;
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6, ja param7, int param8) {
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        try {
            var9_int = -param2 + param5 + (param7.field_r - -param3);
            var10 = param1 + (param5 + (param3 + param7.field_r));
            var11 = (param7.field_w >> 1585933505) + (param7.field_y - -param0);
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
            if (param4) {
                field_a = (String) null;
            }
            oo.b(b.field_f);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ij.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ',' + param8 + ')');
        }
    }

    final static gh a(boolean param0, boolean param1) {
        gh var2 = new gh(true);
        if (param0) {
            byte[] var3 = (byte[]) null;
            ij.a((byte[]) null, 33);
        }
        var2.field_e = param1 ? true : false;
        return var2;
    }

    public final void a(boolean param0, int param1, int param2, int param3, cf param4) {
        cf stackIn_3_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ja var11 = null;
        fj var12 = null;
        try {
          L0: {
            L1: {
              if (param4 instanceof fj) {
                stackIn_3_0 = (cf) (param4);
                break L1;
              } else {
                stackIn_3_0 = null;
                break L1;
              }
            }
            L2: {
              var12 = (fj) ((Object) stackIn_3_0);
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
              oo.e(param4.field_y + param3, param1 + param4.field_i, param4.field_n, param4.field_w, this.field_o);
              var8 = this.field_g + (param4.field_y + param3);
              var9 = this.field_e + (param1 + param4.field_i);
              oo.f(var8, var9, this.field_l, this.field_i, 5592405);
              oo.e(var8, var9, this.field_l, this.field_i, var7);
              if (param2 == -15112) {
                break L4;
              } else {
                var11 = (ja) null;
                ij.a(100, -43, 108, -70, true, -27, -48, (ja) null, -23);
                break L4;
              }
            }
            L5: {
              if (var12.field_G) {
                oo.g(var8, var9, this.field_l + var8, var9 - -this.field_i, 1);
                oo.g(var8 + this.field_l, var9, var8, var9 + this.field_i, 1);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (this.field_n != null) {
                var10 = this.field_b + this.field_g + this.field_l;
                this.field_n.a(param4.field_j, param3 + param4.field_y - -var10, this.field_p + param1 - -param4.field_i, param4.field_n - this.field_b - var10, -(this.field_b << 1042141249) + param4.field_w, this.field_j, this.field_m, this.field_c, this.field_h, 0);
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
            stackIn_20_0 = (RuntimeException) (var6);

            stackIn_20_1 = new StringBuilder().append("ij.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L7;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L7;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
    }

    ij(fm param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.field_c = 1;
        this.field_h = 1;
        try {
            this.field_j = param3;
            this.field_p = param2;
            this.field_b = param1;
            this.field_m = param4;
            this.field_o = param9;
            this.field_e = param6;
            this.field_l = param8;
            this.field_g = param5;
            this.field_n = param0;
            this.field_i = param7;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ij.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        field_d = -1;
        field_f = "You must play <%1> more rated games before playing with the current options.";
        field_a = "Year";
    }
}
