/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea extends cf {
    private boolean field_w;
    private int field_B;
    static int field_p;
    private int field_s;
    static w field_A;
    static String field_u;
    private int field_v;
    private String field_m;
    static int field_n;
    static java.math.BigInteger field_k;
    static int field_r;
    static ck field_l;
    static w field_D;
    private mm field_o;
    static int field_t;
    private int field_z;
    private int field_q;
    static String field_y;
    static String field_C;
    static cd field_x;

    final void a(int param0, int param1, String param2, byte param3, mm param4) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        nf var8 = null;
        try {
          if (param2 == null) {
            this.field_a = null;
            return;
          }
          if (param4 == this.field_o &&
            this.field_w &&
            this.field_s == 1 &&
            null != this.field_m &&
            this.field_m.equals(param2)) {
            return;
          }
          this.field_o = param4;
          this.field_s = 1;
          if (param3 != 8) {
            ea.a(54, 119, -124, -51, 32, 28);
          }
          this.field_w = true;
          var8 = this.a(-95, param0, param4, param2);
          var7 = param4.a(param2);
          var8.field_a[0] = param1 - (var7 >> 1);
          var8.field_a[param2.length()] = param1 + (var7 >> 1);
          hm.a(var8, param4, 0, param2, param3 ^ -9);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("ea.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static boolean c(byte param0) {
        if (param0 >= -23) {
          return false;
        }
        if (hc.field_d < 10) {
          return false;
        }
        if (!v.field_d) {
          return !si.c(-12851) ? true : false;
        }
        return false;
    }

    final static ck[] a(int param0, int param1, int param2, int param3, int param4, int param5) {
        ck var12 = null;
        ck var13 = null;
        Object var14 = null;
        ck var16 = null;
        int[] var18 = hk.field_l;
        int[] var17 = var18;
        int[] var15 = var17;
        int[] var6 = var15;
        int var7 = hk.field_j;
        int var8 = hk.field_i;
        ck var9 = new ck(param2, param3 - param2 * 2);
        var9.a();
        hk.d(0, 0, param2, param3 - 2 * param2, param5, param4);
        ck var10 = new ck(param2, param2);
        var10.a();
        hk.a(0, 0, param2, param2, param5);
        ck var11 = new ck(16, param2);
        if (param1 == -20982) {
          var11.a();
          hk.a(0, 0, 16, param2, param5);
          var12 = new ck(param2, param2);
          var12.a();
          hk.a(0, 0, param2, param2, param4);
          var13 = new ck(16, param2);
          var13.a();
          hk.a(0, 0, 16, param2, param4);
          var14 = null;
          if (param0 > 0) {
            var16 = new ck(16, 16);
            var14 = var16;
            var16.a();
            hk.a(0, 0, 16, 16, param0);
          }
          hk.a(var18, var7, var8);
          return new ck[]{var10, var11, var10, var9, (ck) (var14), var9, var12, var13, var12};
        }
        return (ck[]) null;
    }

    final void a(int param0, mm param1, String param2, int param3, int param4) {
        nf var7 = null;
        nf var8 = null;
        if (param2 == null) {
          this.field_a = null;
          return;
        }
        if (param4 <= 11) {
          field_r = -109;
        }
        if (param1 == this.field_o && this.field_w && this.field_s == 0 && null != this.field_m &&
          this.field_m.equals(param2)) {
          return;
        }
        try {
          this.field_w = true;
          this.field_o = param1;
          this.field_m = param2;
          this.field_s = 0;
          var7 = this.a(-27, param3, param1, param2);
          var8 = var7;
          var7.field_a[0] = param0;
          var8.field_a[param2.length()] = param1.a(param2) + param0;
          hm.a(var8, param1, 0, param2, -1);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "ea.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(String param0, int param1, mm param2, int param3, int param4, int param5, int param6, int param7) {
        nf stackIn_37_0;
        nf stackIn_37_1;
        int stackIn_37_2;
        int stackIn_37_3;
        nf stackIn_38_0 = null;
        nf stackIn_38_1 = null;
        int stackIn_38_4 = 0;
        nf stackIn_42_0 = null;
        mm stackIn_42_1 = null;
        int stackIn_43_2 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        nf var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        int var12Lifetime1;
        var15 = client.field_A ? 1 : 0;
        try {
          if (param7 == 0) {
            param7 = param2.field_S;
          }
          if (param0 == null) {
            this.field_a = null;
            return;
          }
          if (this.field_o == param2 &&
            !this.field_w &&
            this.field_s == param5 &&
            this.field_q == param1 &&
            param7 == this.field_B &&
            this.field_v == param4 &&
            param3 == this.field_z &&
            null != this.field_m &&
            this.field_m.equals(param0)) {
            return;
          }
          this.field_B = param7;
          this.field_m = param0;
          this.field_q = param1;
          this.field_z = param3;
          this.field_o = param2;
          this.field_v = param4;
          this.field_w = false;
          this.field_s = param5;
          var16 = new String[param2.a(param0, param3) + 1];
          var17 = var16;
          var10 = Math.max(1, param2.a(param0, new int[]{param3}, var17));
          if (this.field_q == 3 &&
            var10 == 1) {
            this.field_q = 1;
          }
          if (param6 < 8) {
            ea.b(true);
          }
          this.field_a = new nf[var10];
          if (this.field_q != 0) {
            if (this.field_q == 1) {
              var11 = (-(var10 * this.field_B) + this.field_v >> 1) + param2.field_R;
            } else {
              if (this.field_q == 2) {
                var11 = -(this.field_B * var10) - param2.field_K + this.field_v;
              } else {
                var12 = (-(var10 * this.field_B) + this.field_v) / (1 + var10);
                if (var12 < 0) {
                  var12 = 0;
                }
                var11 = var12 + param2.field_R;
                this.field_B = this.field_B + var12;
              }
            }
          } else {
            var11 = param2.field_R;
          }
          for (var12Lifetime1 = 0; var10 > var12Lifetime1; var12Lifetime1++) {
            var13 = var16[var12Lifetime1];
            stackIn_37_0 = null;
            stackIn_37_1 = null;
            stackIn_37_2 = -param2.field_R + var11;
            stackIn_37_3 = param2.field_K + var11;
            if (var13 != null) {
              stackIn_38_0 = null;
              stackIn_38_1 = null;
              stackIn_38_4 = var13.length();
            } else {
              stackIn_38_0 = null;
              stackIn_38_1 = null;
              stackIn_38_4 = 0;
            }
            var14 = new nf(stackIn_37_2, stackIn_37_3, stackIn_38_4);
            var14.field_a[0] = 0;
            if (var13 != null) {
              var14.field_a[var13.length()] = param2.a(var13);
              stackIn_42_0 = var14;
              stackIn_42_1 = (mm) (param2);
              if (param5 == 3) {
                stackIn_43_2 = this.a((byte) 64, param2.a(var13), var13, param3);
              } else {
                stackIn_43_2 = 0;
              }
              hm.a(stackIn_42_0, stackIn_42_1, stackIn_43_2, var13, -1);
            }
            this.field_a[var12Lifetime1] = var14;
            var11 = var11 + param7;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_48_0 = var9;
          stackIn_48_1 = new StringBuilder().append("ea.R(");
          if (param0 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          stackIn_51_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_48_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final static String b(boolean param0) {
        if (wd.field_d) {
          if (!param0) {
            ea.b(true);
            return null;
          }
          return null;
        }
        if (jc.field_g < o.field_b) {
          if (!param0) {
            ea.b(true);
            return null;
          }
          return null;
        }
        if (he.field_gb + o.field_b > jc.field_g) {
          return k.field_e;
        }
        if (!param0) {
          ea.b(true);
          return null;
        }
        return null;
    }

    final void a(int param0, mm param1, int param2, int param3, String param4) {
        nf var8 = null;
        nf var9 = null;
        if (param4 == null) {
          this.field_a = null;
          return;
        }
        if (this.field_o == param1 &&
          this.field_w &&
          this.field_s == 2 &&
          this.field_m != null &&
          this.field_m.equals(param4)) {
          return;
        }
        try {
          this.field_m = param4;
          this.field_o = param1;
          this.field_w = true;
          this.field_s = 2;
          var8 = this.a(88, param3, param1, param4);
          var9 = var8;
          var9.field_a[param0] = -param1.a(param4) + param2;
          var9.field_a[param4.length()] = param2;
          hm.a(var9, param1, 0, param4, -1);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "ea.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(byte param0) {
        if (param0 == -37) {
          field_y = null;
          field_x = null;
          field_u = null;
          field_k = null;
          field_A = null;
          field_l = null;
          field_D = null;
          field_C = null;
          return;
        }
    }

    public ea() {
    }

    private final nf a(int param0, int param1, mm param2, String param3) {
        nf var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        nf var7 = null;
        nf stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = new nf(param1 - param2.field_R, param1 + param2.field_K, param3.length());
          var5 = var7;
          var6 = -31 / ((27 - param0) / 34);
          this.field_a = new nf[]{var7};
          stackIn_1_0 = var5;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_4_0 = var5_ref;
          stackIn_4_1 = new StringBuilder().append("ea.L(").append(param0).append(',').append(param1).append(',');
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
          throw dh.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static boolean d(byte param0) {
        if (param0 <= 34) {
          field_y = (String) null;
          if (w.field_H != null) {
            return true;
          }
          if (qd.e(-6)) {
            return true;
          }
          if (pd.field_f != null) {
            return true;
          }
          if (!ab.c(48)) {
            return false;
          }
          return true;
        }
        if (w.field_H != null) {
          return true;
        }
        if (qd.e(-6)) {
          return true;
        }
        if (pd.field_f != null) {
          return true;
        }
        if (!ab.c(48)) {
          return false;
        }
        return true;
    }

    static {
        field_n = 0;
        field_u = "Invite players";
        field_y = "Under the Sea";
        field_t = 0;
        field_p = 360;
        field_C = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_k = new java.math.BigInteger("65537");
    }
}
