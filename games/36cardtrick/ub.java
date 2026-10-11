/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub extends mj {
    private int field_l;
    private int field_g;
    static String field_k;
    private String field_j;
    private boolean field_m;
    private ee field_h;
    private int field_f;
    private int field_i;
    private int field_n;

    final void a(String param0, int param1, ee param2, int param3, int param4) {
        di var7 = null;
        di var8 = null;
        if (param0 == null) {
          this.field_d = null;
          return;
        }
        if (param2 == this.field_h &&
          this.field_m &&
          this.field_i == 0 &&
          this.field_j != null &&
          this.field_j.equals(param0)) {
          return;
        }
        if (param1 != 1) {
          return;
        }
        try {
          this.field_h = param2;
          this.field_m = true;
          this.field_j = param0;
          this.field_i = 0;
          var7 = this.a(param3, (byte) -88, param2, param0);
          var8 = var7;
          var7.field_a[0] = param4;
          var8.field_a[param0.length()] = param4 + param2.a(param0);
          s.$cfr$intArgs$a$05bb3be3c57b(param2, 61, 0, var8, param0);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "ub.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(String param0, byte param1, int param2, ee param3, int param4) {
        di var8 = null;
        di var9 = null;
        if (param0 == null) {
          this.field_d = null;
          return;
        }
        if (param1 >= -86) {
          return;
        }
        if (param3 == this.field_h &&
          this.field_m &&
          2 == this.field_i &&
          this.field_j != null &&
          this.field_j.equals(param0)) {
          return;
        }
        try {
          this.field_h = param3;
          this.field_j = param0;
          this.field_m = true;
          this.field_i = 2;
          var8 = this.a(param2, (byte) -103, param3, param0);
          var9 = var8;
          var9.field_a[0] = -param3.a(param0) + param4;
          var9.field_a[param0.length()] = param4;
          s.$cfr$intArgs$a$05bb3be3c57b(param3, 61, 0, var9, param0);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "ub.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    private final di a(int param0, byte param1, ee param2, String param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        di var6 = null;
        di stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = -67 % ((-6 - param1) / 42);
          var6 = new di(-param2.field_s + param0, param0 + param2.field_x, param3.length());
          this.field_d = new di[]{var6};
          stackIn_1_0 = var6;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_4_0 = var5;
          stackIn_4_1 = new StringBuilder().append("ub.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void c(int param0) {
        if (param0 != 0) {
          ub.c(-117);
        }
        uk.a("", param0 - 23804, (String) null);
    }

    public static void d(int param0) {
        if (param0 > -112) {
          ub.c(-70);
        }
        field_k = null;
    }

    final void a(ee param0, int param1, String param2, int param3, int param4) {
        di var7 = null;
        int var8 = 0;
        if (param2 == null) {
          this.field_d = null;
          return;
        }
        if (param0 == this.field_h &&
          this.field_m &&
          1 == this.field_i &&
          null != this.field_j &&
          this.field_j.equals(param2)) {
          return;
        }
        try {
          this.field_h = param0;
          this.field_m = true;
          this.field_i = 1;
          int var6_int = 99 % ((35 - param3) / 59);
          var7 = this.a(param1, (byte) 41, param0, param2);
          var8 = param0.a(param2);
          var7.field_a[0] = param4 - (var8 >> 1);
          var7.field_a[param2.length()] = param4 + (var8 >> 1);
          s.$cfr$intArgs$a$05bb3be3c57b(param0, 61, 0, var7, param2);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "ub.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, ee param4, int param5, String param6, int param7) {
        di stackIn_37_0;
        di stackIn_37_1;
        int stackIn_37_2;
        int stackIn_37_3;
        di stackIn_38_0 = null;
        di stackIn_38_1 = null;
        int stackIn_38_4 = 0;
        ee stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_42_2 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_48_2 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        di var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        int var12Lifetime1;
        var15 = Main.field_T;
        try {
          if (0 == param7) {
            param7 = param4.field_E;
          }
          if (param6 == null) {
            this.field_d = null;
            return;
          }
          if (param4 == this.field_h &&
            !this.field_m &&
            param5 == this.field_i &&
            this.field_n == param2 &&
            param7 == this.field_g &&
            param0 == this.field_f &&
            param3 == this.field_l &&
            this.field_j != null &&
            this.field_j.equals(param6)) {
            return;
          }
          this.field_f = param0;
          this.field_l = param3;
          if (param1 != 841570337) {
            return;
          }
          this.field_h = param4;
          this.field_n = param2;
          this.field_i = param5;
          this.field_g = param7;
          this.field_j = param6;
          this.field_m = false;
          var16 = new String[1 + param4.b(param6, param3)];
          var17 = var16;
          var10 = Math.max(1, param4.a(param6, new int[]{param3}, var17));
          if (this.field_n == 3 &&
            var10 == 1) {
            this.field_n = 1;
          }
          if (this.field_n != 0) {
            if (this.field_n != 1) {
              if (this.field_n == 2) {
                var11 = this.field_f - (param4.field_x + var10 * this.field_g);
              } else {
                var12 = (this.field_f - var10 * this.field_g) / (var10 + 1);
                if (var12 < 0) {
                  var12 = 0;
                }
                var11 = param4.field_s + var12;
                this.field_g = this.field_g + var12;
              }
            } else {
              var11 = (-(this.field_g * var10) + this.field_f >> 1) + param4.field_s;
            }
          } else {
            var11 = param4.field_s;
          }
          this.field_d = new di[var10];
          for (var12Lifetime1 = 0; var12Lifetime1 < var10; var12Lifetime1++) {
            var13 = var16[var12Lifetime1];
            stackIn_37_0 = null;
            stackIn_37_1 = null;
            stackIn_37_2 = -param4.field_s + var11;
            stackIn_37_3 = param4.field_x + var11;
            if (var13 == null) {
              stackIn_38_0 = null;
              stackIn_38_1 = null;
              stackIn_38_4 = 0;
            } else {
              stackIn_38_0 = null;
              stackIn_38_1 = null;
              stackIn_38_4 = var13.length();
            }
            var14 = new di(stackIn_37_2, stackIn_37_3, stackIn_38_4);
            var14.field_a[0] = 0;
            if (var13 != null) {
              var14.field_a[var13.length()] = param4.a(var13);
              stackIn_41_0 = (ee) (param4);
              stackIn_41_1 = 61;
              if (param5 != 3) {
                stackIn_42_2 = 0;
              } else {
                stackIn_42_2 = this.a(param3, param4.a(var13), var13, -53);
              }
              s.$cfr$intArgs$a$05bb3be3c57b(stackIn_41_0, stackIn_41_1, stackIn_42_2, var14, var13);
            }
            this.field_d[var12Lifetime1] = var14;
            var11 = var11 + param7;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_47_0 = var9;
          stackIn_47_1 = new StringBuilder().append("ub.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_48_2 = "null";
          } else {
            stackIn_48_2 = "{...}";
          }
          stackIn_50_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_51_2 = "null";
          } else {
            stackIn_51_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_47_0), ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',').append(param7).append(')').toString());
        }
    }

    public ub() {
    }

    static {
        field_k = null;
    }
}
