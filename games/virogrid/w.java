/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w extends tg {
    private le field_G;
    private int field_N;
    static String field_M;
    static kg field_I;
    static String field_F;
    static int field_K;
    static ld field_L;
    static boolean field_J;

    final static void a(byte param0, long param1, int param2) {
        int var5 = 0;
        hg var4 = gk.field_g;
        int var5Lifetime1;
        if (param0 == 74) {
          var4.g(param2, param0 ^ 66);
          var4.field_l = var4.field_l + 1;
          var5 = var4.field_l;
          var4.a(7, -114);
          var4.a((byte) 100, param1);
          var4.b(-var5 + var4.field_l, -1);
          return;
        }
        w.a((byte) -80, -70L, 4);
        var4.g(param2, param0 ^ 66);
        var4.field_l = var4.field_l + 1;
        var5Lifetime1 = var4.field_l;
        var4.a(7, -114);
        var4.a((byte) 100, param1);
        var4.b(-var5Lifetime1 + var4.field_l, -1);
    }

    final static void a(int param0, int param1) {
        hg var2 = null;
        if (param1 == -7093) {
          var2 = gk.field_g;
          var2.g(param0, 8);
          var2.a(1, -124);
          var2.a(0, -71);
          return;
        }
    }

    w(le param0) {
        try {
          this.field_G = param0;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "w.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_F = null;
        field_M = null;
        field_L = null;
        field_I = null;
        if (param0 >= -1) {
          field_I = (kg) null;
        }
    }

    final static boolean a(String param0, String param1, boolean param2) {
        String var3 = null;
        String var4 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param1 = re.a("", param2, '_', param1);
          if (param2) {
            var4 = (String) null;
            w.a((String) null, (String) null, false);
          }
          var3 = od.b(0, param1);
          stackIn_7_0 = (param0.indexOf(param1) != -1) || (param0.indexOf(var3) != -1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("w.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    final static mg a(eh param0, int param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        mg stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 74 % ((param1 + 29) / 48);
          if (hn.a(param0, param3, param2, (byte) 109)) {
            stackIn_4_0 = gn.c((byte) -9);
            return stackIn_4_0;
          }
          stackIn_2_0 = null;
          return (mg) (stackIn_2_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("w.K(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        mg var15 = null;
        mg var16 = null;
        mg var12 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = Virogrid.field_F ? 1 : 0;
        int var9Lifetime1;
        int var10Lifetime1;
        super.a(param0, param1, param2, param3);
        if (param3 != 0) {
          return;
        }
        int var5 = this.field_l + (param1 + (this.field_g >> 1));
        int var6 = this.field_u + (param2 + (this.field_m >> 1));
        wl var8 = this.field_G.a(-22243);
        if (gd.field_r == var8) {
          var15 = bf.field_p[0];
          var9 = var15.field_u << 1;
          var10 = var15.field_z << 1;
          if (null == hh.field_a) {
            hh.field_a = new mg(var9, var10);
            kb.a(hh.field_a, 16865);
            var15.a(112, 144, var15.field_u << 4, var15.field_z << 4, -this.field_N << 10, 4096);
            ai.a(true);
            hh.field_a.e(var5 - var15.field_u, -var15.field_z + var6, 256);
            return;
          }
          if (var9 > hh.field_a.field_w) {
            hh.field_a = new mg(var9, var10);
            kb.a(hh.field_a, 16865);
            var15.a(112, 144, var15.field_u << 4, var15.field_z << 4, -this.field_N << 10, 4096);
            ai.a(true);
            hh.field_a.e(var5 - var15.field_u, -var15.field_z + var6, 256);
            return;
          }
          if (hh.field_a.field_p < var10) {
            hh.field_a = new mg(var9, var10);
            kb.a(hh.field_a, 16865);
            var15.a(112, 144, var15.field_u << 4, var15.field_z << 4, -this.field_N << 10, 4096);
            ai.a(true);
            hh.field_a.e(var5 - var15.field_u, -var15.field_z + var6, 256);
            return;
          }
          kb.a(hh.field_a, 16865);
          df.c();
          var15.a(112, 144, var15.field_u << 4, var15.field_z << 4, -this.field_N << 10, 4096);
          ai.a(true);
          hh.field_a.e(var5 - var15.field_u, -var15.field_z + var6, 256);
          return;
        }
        if (var8 == te.field_d) {
          var16 = bf.field_p[0];
          var9Lifetime1 = var16.field_u << 1;
          var10Lifetime1 = var16.field_z << 1;
          if (null == hh.field_a) {
            hh.field_a = new mg(var9Lifetime1, var10Lifetime1);
            kb.a(hh.field_a, 16865);
            var16.a(112, 144, var16.field_u << 4, var16.field_z << 4, -this.field_N << 10, 4096);
            ai.a(true);
            hh.field_a.e(var5 - var16.field_u, -var16.field_z + var6, 256);
            return;
          }
          if (var9Lifetime1 > hh.field_a.field_w) {
            hh.field_a = new mg(var9Lifetime1, var10Lifetime1);
            kb.a(hh.field_a, 16865);
            var16.a(112, 144, var16.field_u << 4, var16.field_z << 4, -this.field_N << 10, 4096);
            ai.a(true);
            hh.field_a.e(var5 - var16.field_u, -var16.field_z + var6, 256);
            return;
          }
          if (hh.field_a.field_p < var10Lifetime1) {
            hh.field_a = new mg(var9Lifetime1, var10Lifetime1);
            kb.a(hh.field_a, 16865);
            var16.a(112, 144, var16.field_u << 4, var16.field_z << 4, -this.field_N << 10, 4096);
            ai.a(true);
            hh.field_a.e(var5 - var16.field_u, -var16.field_z + var6, 256);
            return;
          }
          kb.a(hh.field_a, 16865);
          df.c();
          var16.a(112, 144, var16.field_u << 4, var16.field_z << 4, -this.field_N << 10, 4096);
          ai.a(true);
          hh.field_a.e(var5 - var16.field_u, -var16.field_z + var6, 256);
          return;
        }
        if (var8 == ee.field_c) {
          var12 = bf.field_p[2];
          var12.e(-(var12.field_w >> 1) + var5, var6 - (var12.field_p >> 1), 256);
          return;
        }
        if (bm.field_i != var8) {
          return;
        }
        mg var13 = bf.field_p[1];
        var13.e(var5 - (var13.field_w >> 1), -(var13.field_p >> 1) + var6, 256);
    }

    final String d(int param0) {
        if (param0 < 35) {
          field_L = (ld) null;
          if (this.field_p) {
            return this.field_G.b(28433);
          }
          return null;
        }
        if (this.field_p) {
          return this.field_G.b(28433);
        }
        return null;
    }

    final void a(int param0, int param1, fi param2, int param3) {
        try {
          if (param1 <= 113) {
            w.a((byte) -19, -106L, -21);
          }
          this.field_N = this.field_N + 1;
          super.a(param0, 127, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "w.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final boolean a(fi param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -8515) {
            return false;
          }
          this.field_N = -119;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("w.G(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_M = "(1 player wants to join)";
        field_F = "Only show game chat from my friends";
        field_K = 0;
        field_L = new ld();
        field_J = false;
    }
}
