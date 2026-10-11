/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh extends ue {
    static ti field_h;
    private String field_d;
    static pd field_n;
    private int field_e;
    private int field_j;
    private boolean field_f;
    private int field_i;
    private int field_m;
    static String field_g;
    private kg field_k;
    private int field_l;

    final void a(kg param0, int param1, byte param2, String param3, int param4) {
        ol var9 = null;
        ol var10 = null;
        if (param3 == null) {
          this.field_b = null;
          return;
        }
        if (this.field_k == param0 && this.field_f && this.field_l == 2 && this.field_d != null &&
          this.field_d.equals(param3)) {
          return;
        }
        try {
          this.field_d = param3;
          this.field_f = true;
          if (param2 >= -63) {
            kg var7 = (kg) null;
            this.a((String) null, (byte) -90, (kg) null, -10, 16);
          }
          this.field_l = 2;
          this.field_k = param0;
          var9 = this.a((byte) 107, param4, param0, param3);
          var10 = var9;
          var10.field_g[0] = param1 - param0.a(param3);
          var10.field_g[param3.length()] = param1;
          eh.$cfr$intArgs$a$d8024809bc20(var10, 79, param3, param0, 0);
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "jh.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static void a(boolean param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        if (param0) {
          return;
        }
        if (null != el.field_n) {
          var1 = el.field_n;
          synchronized (var1) {
            el.field_n = null;
          }
        }
    }

    final void a(int param0, int param1, int param2, kg param3, String param4) {
        ol var8 = null;
        int var7 = 0;
        if (param4 == null) {
          this.field_b = null;
          return;
        }
        if (param3 == this.field_k &&
          this.field_f &&
          this.field_l == 1 &&
          null != this.field_d &&
          this.field_d.equals(param4)) {
          return;
        }
        try {
          this.field_l = 1;
          this.field_f = true;
          this.field_k = param3;
          var8 = this.a((byte) 34, param2, param3, param4);
          var7 = param3.a(param4);
          if (param1 != 7531) {
            this.field_i = 41;
          }
          var8.field_g[0] = param0 - (var7 >> 1);
          var8.field_g[param4.length()] = (var7 >> 1) + param0;
          eh.$cfr$intArgs$a$d8024809bc20(var8, 79, param4, param3, 0);
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "jh.O(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, String param4, kg param5, int param6, int param7) {
        ol stackIn_35_0;
        ol stackIn_35_1;
        int stackIn_35_2;
        int stackIn_35_3;
        ol stackIn_36_0 = null;
        ol stackIn_36_1 = null;
        int stackIn_36_4 = 0;
        ol stackIn_39_0;
        int stackIn_39_1;
        String stackIn_39_2;
        kg stackIn_39_3;
        int stackIn_40_4;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        ol var15 = null;
        int var16 = 0;
        String[] var17 = null;
        String[] var18 = null;
        int var13Lifetime1;
        var16 = Transmogrify.field_A ? 1 : 0;
        try {
          if (param2 == 0) {
            param2 = param5.field_C;
          }
          if (param4 == null) {
            this.field_b = null;
            return;
          }
          if (param5 == this.field_k &&
            !this.field_f &&
            this.field_l == param1 &&
            param7 == this.field_i &&
            this.field_m == param2 &&
            param6 == this.field_e &&
            param3 == this.field_j &&
            this.field_d != null &&
            this.field_d.equals(param4)) {
            return;
          }
          this.field_m = param2;
          this.field_d = param4;
          this.field_i = param7;
          this.field_e = param6;
          this.field_k = param5;
          this.field_f = false;
          this.field_l = param1;
          this.field_j = param3;
          var17 = new String[1 + param5.b(param4, param3)];
          var18 = var17;
          var10 = Math.max(1, param5.a(param4, new int[]{param3}, var18));
          var11 = -73 / ((-6 - param0) / 50);
          if (this.field_i == 3 &&
            1 == var10) {
            this.field_i = 1;
          }
          this.field_b = new ol[var10];
          if (this.field_i == 0) {
            var12 = param5.field_y;
          } else {
            if (1 == this.field_i) {
              var12 = param5.field_y + (-(this.field_m * var10) + this.field_e >> 1);
            } else {
              if (2 == this.field_i) {
                var12 = -param5.field_t + this.field_e - this.field_m * var10;
              } else {
                var13 = (-(var10 * this.field_m) + this.field_e) / (1 + var10);
                if (0 > var13) {
                  var13 = 0;
                }
                var12 = var13 + param5.field_y;
                this.field_m = this.field_m + var13;
              }
            }
          }
          for (var13Lifetime1 = 0; var13Lifetime1 < var10; var13Lifetime1++) {
            var14 = var17[var13Lifetime1];
            stackIn_35_0 = null;
            stackIn_35_1 = null;
            stackIn_35_2 = var12 - param5.field_y;
            stackIn_35_3 = var12 + param5.field_t;
            if (var14 != null) {
              stackIn_36_0 = null;
              stackIn_36_1 = null;
              stackIn_36_4 = var14.length();
            } else {
              stackIn_36_0 = null;
              stackIn_36_1 = null;
              stackIn_36_4 = 0;
            }
            var15 = new ol(stackIn_35_2, stackIn_35_3, stackIn_36_4);
            var15.field_g[0] = 0;
            if (var14 != null) {
              var15.field_g[var14.length()] = param5.a(var14);
              stackIn_39_0 = var15;
              stackIn_39_1 = 79;
              stackIn_39_2 = var14;
              stackIn_39_3 = (kg) (param5);
              if (param1 != 3) {
                stackIn_40_4 = 0;
              } else {
                stackIn_40_4 = this.a(param3, var14, param5.a(var14), 12);
              }
              eh.$cfr$intArgs$a$d8024809bc20(stackIn_39_0, stackIn_39_1, stackIn_39_2, stackIn_39_3, stackIn_40_4);
            }
            this.field_b[var13Lifetime1] = var15;
            var12 = var12 + param2;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_45_0 = var9;
          stackIn_45_1 = new StringBuilder().append("jh.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          stackIn_48_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',');
          if (param5 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final void a(String param0, byte param1, kg param2, int param3, int param4) {
        ol var7 = null;
        if (param0 == null) {
          this.field_b = null;
          return;
        }
        if (this.field_k == param2 &&
          this.field_f &&
          this.field_l == 0 &&
          this.field_d != null &&
          this.field_d.equals(param0)) {
          return;
        }
        try {
          this.field_l = 0;
          this.field_f = true;
          this.field_k = param2;
          this.field_d = param0;
          int var6_int = -37 / ((param1 + 50) / 49);
          var7 = this.a((byte) 52, param3, param2, param0);
          var7.field_g[0] = param4;
          var7.field_g[param0.length()] = param2.a(param0) + param4;
          eh.$cfr$intArgs$a$d8024809bc20(var7, 79, param0, param2, 0);
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "jh.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void c(int param0) {
        field_n = null;
        if (param0 != -1) {
          field_h = (ti) null;
        }
        field_g = null;
        field_h = null;
    }

    private final ol a(byte param0, int param1, kg param2, String param3) {
        ol var5 = null;
        RuntimeException var5_ref = null;
        ol var6 = null;
        ol stackIn_2_0 = null;
        ol stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 17) {
            stackIn_2_0 = (ol) null;
            return stackIn_2_0;
          }
          var6 = new ol(-param2.field_y + param1, param1 + param2.field_t, param3.length());
          var5 = var6;
          this.field_b = new ol[]{var6};
          stackIn_4_0 = var5;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("jh.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(sg param0, int param1) {
        int var2_int = 0;
        sg var3 = null;
        int var4 = 0;
        sg var5 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          if (null == param0.field_h) {
            return;
          }
          if (param0.field_l != 0 ||
            param0.field_f != 0) {
            for (var2_int = 0; q.field_b > var2_int; var2_int++) {
              var3 = eg.field_a[var2_int];
              if (2 == var3.field_i &&
                var3.field_l == param0.field_l &&
                param0.field_f == var3.field_f) {
                return;
              }
            }
          }
          if (param1 < 11) {
            var5 = (sg) null;
            jh.a((sg) null, -103);
          }
          if (param0.field_j == null) {
          }
          mh.a(-27968, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("jh.N(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    public jh() {
    }

    static {
        field_n = new pd();
    }
}
