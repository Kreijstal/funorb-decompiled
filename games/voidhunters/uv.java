/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uv implements wwa {
    private int field_c;
    private int field_m;
    private int field_l;
    private int field_n;
    private no field_j;
    private int field_e;
    private int field_k;
    private int field_b;
    private int field_d;
    private int field_i;
    static String field_f;
    static int[] field_a;
    private int field_g;
    private int field_h;

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var2 = kba.field_a.a(param1, (byte) 121) + -kba.field_a.field_d;
        var3 = param0 - -(var2 / 4);
        if (var3 <= 250) {
          if (-7 < (var3 ^ -1)) {
            var3 = 6;
            return var3;
          } else {
            return var3;
          }
        } else {
          var3 = 250;
          return var3;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (li.field_i) {
          if (fua.field_o) {
            og.field_r.a(-83, param3, param5, -16777216 | param4, param1, param2);
            if (param0 < 106) {
              field_f = (String) null;
              return;
            } else {
              return;
            }
          } else {
            if (param0 >= 106) {
              return;
            } else {
              field_f = (String) null;
              return;
            }
          }
        } else {
          dma.b(param1, param3, param5, param2, param4);
          if (param0 >= 106) {
            return;
          } else {
            field_f = (String) null;
            return;
          }
        }
    }

    public final void a(int param0, shb param1, int param2, int param3, boolean param4) {
        int discarded$1 = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        jla var12 = null;
        shb stackIn_3_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        shb stackOut_1_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (!(param1 instanceof jla)) {
                stackOut_2_0 = null;
                stackIn_3_0 = (shb) ((Object) stackOut_2_0);
                break L1;
              } else {
                stackOut_1_0 = (shb) (param1);
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var12 = (jla) ((Object) stackIn_3_0);
              if (var12 != null) {
                param4 = param4 & var12.field_x;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var7 = 5592405;
              if (param4) {
                var7 = 16777215;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              dma.d(param2 + param1.field_g, param3 + param1.field_r, param1.field_h, param1.field_f, this.field_k);
              var8 = this.field_d + (param2 + param1.field_g);
              var9 = param1.field_r + param3 + this.field_n;
              dma.c(var8, var9, this.field_l, this.field_i, 5592405);
              dma.d(var8, var9, this.field_l, this.field_i, var7);
              if (var12.field_u) {
                dma.a(var8, var9, var8 + this.field_l, this.field_i + var9, 1);
                dma.a(var8 + this.field_l, var9, var8, this.field_i + var9, 1);
                break L4;
              } else {
                break L4;
              }
            }
            var10 = 49 % ((param0 - -27) / 35);
            if (null != this.field_j) {
              var11 = this.field_l + this.field_d + this.field_m;
              discarded$1 = this.field_j.a(param1.field_j, var11 + (param2 - -param1.field_g), this.field_c + param3 - -param1.field_r, -this.field_m + (-var11 + param1.field_h), -(this.field_m << -1325802399) + param1.field_f, this.field_g, this.field_h, this.field_b, this.field_e, 0);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var6);
            stackOut_16_1 = new StringBuilder().append("uv.A(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_a = null;
        if (param0 != 22089) {
            field_f = (String) null;
        }
    }

    uv(no param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.field_e = 1;
        this.field_b = 1;
        try {
            this.field_m = param1;
            this.field_n = param6;
            this.field_c = param2;
            this.field_l = param8;
            this.field_j = param0;
            this.field_h = param4;
            this.field_d = param5;
            this.field_g = param3;
            this.field_k = param9;
            this.field_i = param7;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "uv.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        field_f = "Error connecting to server. Please try using a different server.";
        field_a = new int[8192];
    }
}
