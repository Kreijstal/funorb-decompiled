/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd extends dm {
    private boolean field_s;
    static ba field_q;
    static hj[] field_o;
    private int field_j;
    static int field_k;
    private int field_r;
    static int field_p;
    private int field_n;
    static mi field_u;
    private String field_t;
    private int field_l;
    private kc field_h;
    static String field_m;
    private int field_i;

    final static qg b(boolean param0) {
        qg var1 = null;
        qg var1Lifetime1;
        if (param0) {
          var1 = new qg(sg.field_B, he.field_r, jd.field_g[0], wc.field_a[0], wh.field_b[0], m.field_a[0], fl.field_a[0], vc.field_g);
          md.$cfr$intArgs$a$6121ff5511c4(-128);
          return var1;
        }
        bd.c(-19);
        var1Lifetime1 = new qg(sg.field_B, he.field_r, jd.field_g[0], wc.field_a[0], wh.field_b[0], m.field_a[0], fl.field_a[0], vc.field_g);
        md.$cfr$intArgs$a$6121ff5511c4(-128);
        return var1Lifetime1;
    }

    final void a(int param0, kc param1, int param2, String param3, int param4) {
        ed var8 = null;
        ed var9 = null;
        if (param3 == null) {
          this.field_c = null;
          return;
        }
        if (param1 == this.field_h &&
          this.field_s &&
          2 == this.field_l &&
          this.field_t != null &&
          this.field_t.equals(param3)) {
          return;
        }
        this.field_h = param1;
        this.field_l = 2;
        if (param2 <= 74) {
          return;
        }
        try {
          this.field_t = param3;
          this.field_s = true;
          var8 = this.a((byte) 121, param4, param3, param1);
          var9 = var8;
          var9.field_g[0] = -param1.a(param3) + param0;
          var9.field_g[param3.length()] = param0;
          ll.a(var9, 0, param3, param1, 404465128);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "bd.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final void a(int param0, String param1, int param2, int param3, kc param4) {
        ed var8 = null;
        ed var9 = null;
        if (param1 == null) {
          this.field_c = null;
          return;
        }
        if (param4 == this.field_h && this.field_s && this.field_l == 0 && this.field_t != null &&
          this.field_t.equals(param1)) {
          return;
        }
        try {
          this.field_l = 0;
          this.field_t = param1;
          this.field_h = param4;
          this.field_s = true;
          var8 = this.a((byte) 110, param3, param1, param4);
          var9 = var8;
          int var7 = -66 / ((8 - param2) / 61);
          var8.field_g[0] = param0;
          var9.field_g[param1.length()] = param4.a(param1) + param0;
          ll.a(var9, 0, param1, param4, 404465128);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "bd.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, String param3, kc param4) {
        ed var8 = null;
        int var7 = 0;
        if (param3 == null) {
          this.field_c = null;
          return;
        }
        if (param2 <= 31) {
          this.field_t = (String) null;
        }
        if (param4 == this.field_h && this.field_s && this.field_l == 1 && null != this.field_t &&
          this.field_t.equals(param3)) {
          return;
        }
        try {
          this.field_l = 1;
          this.field_s = true;
          this.field_h = param4;
          var8 = this.a((byte) 115, param1, param3, param4);
          var7 = param4.a(param3);
          var8.field_g[0] = param0 - (var7 >> 1);
          var8.field_g[param3.length()] = (var7 >> 1) + param0;
          ll.a(var8, 0, param3, param4, 404465128);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "bd.O(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, String param1, int param2, kc param3, int param4, int param5, int param6, int param7) {
        ed stackIn_36_0;
        ed stackIn_36_1;
        int stackIn_36_2;
        int stackIn_36_3;
        ed stackIn_37_0 = null;
        ed stackIn_37_1 = null;
        int stackIn_37_4 = 0;
        ed stackIn_40_0 = null;
        int stackIn_41_1 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        ed var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        int var12Lifetime1;
        var15 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param6 == param0) {
            param6 = param3.field_z;
          }
          if (param1 == null) {
            this.field_c = null;
            return;
          }
          if (param3 == this.field_h &&
            !this.field_s &&
            param2 == this.field_l &&
            this.field_r == param7 &&
            this.field_j == param6 &&
            param5 == this.field_i &&
            param4 == this.field_n &&
            null != this.field_t &&
            this.field_t.equals(param1)) {
            return;
          }
          this.field_t = param1;
          this.field_j = param6;
          this.field_n = param4;
          this.field_i = param5;
          this.field_s = false;
          this.field_h = param3;
          this.field_r = param7;
          this.field_l = param2;
          var16 = new String[1 + param3.b(param1, param4)];
          var17 = var16;
          var10 = Math.max(1, param3.a(param1, new int[]{param4}, var17));
          if (this.field_r == 3 &&
            var10 == 1) {
            this.field_r = 1;
          }
          this.field_c = new ed[var10];
          if (0 != this.field_r) {
            if (this.field_r != 1) {
              if (2 == this.field_r) {
                var11 = this.field_i - param3.field_B - var10 * this.field_j;
              } else {
                var12 = (-(var10 * this.field_j) + this.field_i) / (var10 + 1);
                if (var12 < 0) {
                  var12 = 0;
                }
                this.field_j = this.field_j + var12;
                var11 = param3.field_H + var12;
              }
            } else {
              var11 = (-(this.field_j * var10) + this.field_i >> 1) + param3.field_H;
            }
          } else {
            var11 = param3.field_H;
          }
          for (var12Lifetime1 = 0; var10 > var12Lifetime1; var12Lifetime1++) {
            var13 = var16[var12Lifetime1];
            stackIn_36_0 = null;
            stackIn_36_1 = null;
            stackIn_36_2 = -param3.field_H + var11;
            stackIn_36_3 = param3.field_B + var11;
            if (var13 == null) {
              stackIn_37_0 = null;
              stackIn_37_1 = null;
              stackIn_37_4 = 0;
            } else {
              stackIn_37_0 = null;
              stackIn_37_1 = null;
              stackIn_37_4 = var13.length();
            }
            var14 = new ed(stackIn_36_2, stackIn_36_3, stackIn_37_4);
            var14.field_g[0] = 0;
            if (var13 != null) {
              var14.field_g[var13.length()] = param3.a(var13);
              stackIn_40_0 = var14;
              if (param2 != 3) {
                stackIn_41_1 = 0;
              } else {
                stackIn_41_1 = this.a(var13, param4, param3.a(var13), (byte) 74);
              }
              ll.a(stackIn_40_0, stackIn_41_1, var13, param3, 404465128);
            }
            this.field_c[var12Lifetime1] = var14;
            var11 = var11 + param6;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_46_0 = var9;
          stackIn_46_1 = new StringBuilder().append("bd.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          stackIn_49_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    public static void c(int param0) {
        field_q = null;
        field_m = null;
        if (param0 != 0) {
          bd.c(15);
          field_u = null;
          field_o = null;
          return;
        }
        field_u = null;
        field_o = null;
    }

    private final ed a(byte param0, int param1, String param2, kc param3) {
        ed var5 = null;
        RuntimeException var5_ref = null;
        ed var6 = null;
        ed stackIn_2_0 = null;
        ed stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 109) {
            stackIn_2_0 = (ed) null;
            return stackIn_2_0;
          }
          var6 = new ed(-param3.field_H + param1, param3.field_B + param1, param2.length());
          var5 = var6;
          this.field_c = new ed[]{var6};
          stackIn_4_0 = var5;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("bd.P(").append(param0).append(',').append(param1).append(',');
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
          throw dd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public bd() {
    }

    static {
        field_q = new ba(15, 0, 1, 0);
        field_m = "Account created successfully!";
    }
}
