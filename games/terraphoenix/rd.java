/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd extends ld {
    private int field_q;
    static boolean field_o;
    private String field_j;
    private int field_i;
    static ae field_s;
    static jj field_k;
    private int field_l;
    static int field_t;
    private pk field_n;
    private int field_m;
    private boolean field_p;
    private int field_r;

    final void a(int param0, int param1, pk param2, int param3, String param4) {
        if (param4 == null) {
          this.field_f = null;
          return;
        }
        if (param2 == this.field_n &&
          this.field_p &&
          this.field_l == 2 &&
          null != this.field_j &&
          this.field_j.equals(param4)) {
          return;
        }
        this.field_j = param4;
        this.field_n = param2;
        this.field_p = true;
        this.field_l = 2;
        em var7 = this.a(param2, 125, param4, param0);
        em var8 = var7;
        if (param1 < 33) {
          return;
        }
        try {
          var8.field_d[0] = -param2.b(param4) + param3;
          var7.field_d[param4.length()] = param3;
          hb.a(param2, 0, 114, param4, var8);
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "rd.O(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    private final em a(pk param0, int param1, String param2, int param3) {
        em var5 = null;
        RuntimeException var5_ref = null;
        em var6 = null;
        em stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 121) {
            this.field_n = (pk) null;
          }
          var6 = new em(-param0.field_s + param3, param0.field_p + param3, param2.length());
          var5 = var6;
          this.field_f = new em[]{var6};
          stackIn_3_0 = var5;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_6_0 = var5_ref;
          stackIn_6_1 = new StringBuilder().append("rd.M(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void d(int param0) {
        field_s = null;
        if (param0 < 121) {
          return;
        }
        field_k = null;
    }

    final void a(int param0, pk param1, String param2, int param3, int param4) {
        int var7 = 0;
        em var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param2 == null) {
            this.field_f = null;
            return;
          }
          if (this.field_n == param1 &&
            this.field_p &&
            this.field_l == 1 &&
            this.field_j != null &&
            this.field_j.equals(param2)) {
            return;
          }
          this.field_l = 1;
          this.field_n = param1;
          this.field_p = true;
          var8 = this.a(param1, 122, param2, param3);
          var7 = param1.b(param2);
          var8.field_d[0] = param0 - (var7 >> 1);
          var8.field_d[param2.length()] = param0 + (var7 >> 1);
          hb.a(param1, 0, 49, param2, var8);
          if (param4 != 960877057) {
            field_t = 59;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("rd.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, pk param3, int param4, String param5, int param6, int param7) {
        int var13 = 0;
        em stackIn_35_0;
        em stackIn_35_1;
        int stackIn_35_2;
        int stackIn_35_3;
        em stackIn_36_0 = null;
        em stackIn_36_1 = null;
        int stackIn_36_4 = 0;
        pk stackIn_39_0 = null;
        int stackIn_40_1 = 0;
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
        String var14 = null;
        em var15 = null;
        int var16 = 0;
        String[] var17 = null;
        String[] var18 = null;
        int var12Lifetime1;
        var16 = Terraphoenix.field_V;
        try {
          if (param7 == 0) {
            param7 = param3.field_w;
          }
          if (param5 == null) {
            this.field_f = null;
            return;
          }
          if (this.field_n == param3 &&
            !this.field_p &&
            this.field_l == param0 &&
            param1 == this.field_i &&
            param7 == this.field_q &&
            param2 == this.field_m &&
            this.field_r == param6 &&
            null != this.field_j &&
            this.field_j.equals(param5)) {
            return;
          }
          this.field_i = param1;
          this.field_m = param2;
          this.field_n = param3;
          this.field_p = false;
          this.field_l = param0;
          this.field_r = param6;
          this.field_j = param5;
          this.field_q = param7;
          var17 = new String[param3.c(param5, param6) + 1];
          var18 = var17;
          var10 = Math.max(1, param3.a(param5, new int[]{param6}, var18));
          if (this.field_i == 3 &&
            1 == var10) {
            this.field_i = 1;
          }
          if (this.field_i == 0) {
            var11 = param3.field_s;
          } else {
            if (1 != this.field_i) {
              if (this.field_i == 2) {
                var11 = -(var10 * this.field_q) + (-param3.field_p + this.field_m);
              } else {
                var12 = (this.field_m - this.field_q * var10) / (var10 + 1);
                if (var12 < 0) {
                  var12 = 0;
                }
                this.field_q = this.field_q + var12;
                var11 = param3.field_s + var12;
              }
            } else {
              var11 = param3.field_s + (this.field_m - this.field_q * var10 >> 1);
            }
          }
          var12Lifetime1 = 105 % ((-47 - param4) / 60);
          this.field_f = new em[var10];
          for (var13 = 0; var13 < var10; var13++) {
            var14 = var17[var13];
            stackIn_35_0 = null;
            stackIn_35_1 = null;
            stackIn_35_2 = -param3.field_s + var11;
            stackIn_35_3 = param3.field_p + var11;
            if (var14 == null) {
              stackIn_36_0 = null;
              stackIn_36_1 = null;
              stackIn_36_4 = 0;
            } else {
              stackIn_36_0 = null;
              stackIn_36_1 = null;
              stackIn_36_4 = var14.length();
            }
            var15 = new em(stackIn_35_2, stackIn_35_3, stackIn_36_4);
            var15.field_d[0] = 0;
            if (var14 != null) {
              var15.field_d[var14.length()] = param3.b(var14);
              stackIn_39_0 = (pk) (param3);
              if (3 == param0) {
                stackIn_40_1 = this.a(var14, true, param6, param3.b(var14));
              } else {
                stackIn_40_1 = 0;
              }
              hb.a(stackIn_39_0, stackIn_40_1, 43, var14, var15);
            }
            var11 = var11 + param7;
            this.field_f[var13] = var15;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_45_0 = var9;
          stackIn_45_1 = new StringBuilder().append("rd.R(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          stackIn_48_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final void a(int param0, pk param1, int param2, String param3, byte param4) {
        em var7 = null;
        em var8 = null;
        if (param3 == null) {
          this.field_f = null;
          return;
        }
        if (param1 == this.field_n && this.field_p && 0 == this.field_l && null != this.field_j &&
          this.field_j.equals(param3)) {
          return;
        }
        try {
          if (param4 != -112) {
            this.field_q = 89;
          }
          this.field_j = param3;
          this.field_n = param1;
          this.field_p = true;
          this.field_l = 0;
          var7 = this.a(param1, 123, param3, param2);
          var8 = var7;
          var7.field_d[0] = param0;
          var8.field_d[param3.length()] = param1.b(param3) + param0;
          hb.a(param1, 0, 59, param3, var8);
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "rd.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static Boolean b(byte param0) {
        Boolean var1 = ge.field_d;
        if (param0 < 14) {
          field_k = (jj) null;
        }
        ge.field_d = null;
        return var1;
    }

    public rd() {
    }

    static {
        field_o = false;
        field_k = new jj();
    }
}
