/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke extends wn {
    private dj field_L;
    static String field_E;
    private int field_G;
    static int[] field_M;
    static int field_K;
    private int field_I;
    static String field_F;
    private int field_H;
    private String field_N;
    private boolean field_J;

    final static void g(byte param0) {
        pm.field_e.f(param0 ^ -36);
        if (param0 == 94) {
          pm.field_e.b(new kn(pm.field_e), 15637);
          return;
        }
        ke.g((byte) 118);
        pm.field_e.b(new kn(pm.field_e), 15637);
    }

    final String b(boolean param0) {
        int var2 = this.field_B.field_w ? 1 : 0;
        this.field_B.field_w = this.field_w;
        String var3 = this.field_B.b(param0);
        this.field_B.field_w = var2 != 0 ? true : false;
        if (!param0) {
          return var3;
        }
        ke.f(-115);
        return var3;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (param0 > -52) {
          return;
        }
        int var5 = this.field_n + param1;
        int var6 = this.field_j + param3;
        super.a((byte) -60, param1, param2, param3);
        if (param2 != 0) {
          return;
        }
        int var7 = !this.field_J ? 0 : -this.field_H + (this.field_v - this.field_G * 2);
        this.field_L.a(this.field_N, this.field_G + (var7 + var5), this.field_G + var6, -this.field_G + this.field_H, this.field_k - this.field_G * 2, this.field_I, -1, this.field_J ? 0 : 2, 1, this.field_L.field_C);
    }

    public static void f(int param0) {
        field_E = null;
        field_M = null;
        if (param0 != 2) {
          return;
        }
        field_F = null;
    }

    final static void a(boolean param0, int param1) {
        la.a(param0, true, (byte) -96);
        if (param1 != 4474111) {
          field_M = (int[]) null;
        }
    }

    final static void a(qb[] param0, boolean param1, dj param2, int param3, qb[] param4, int param5, int param6, int param7, int param8, int param9, int param10, String param11, boolean param12, int param13, int param14) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15 = null;
        String var16 = null;
        try {
          if (param14 != -21071) {
            var16 = (String) null;
            ke.a((qb[]) null, true, (dj) null, -83, (qb[]) null, -13, 81, -125, 45, -81, 29, (String) null, true, 61, -12);
          }
          kh.a(param6, param3, mj.field_r, param7, param8, param10, param13, param9, true, new ec(param4), param8, param13, param2, pn.field_d, ol.field_f, ql.field_a, param2, tg.field_d, new ec(param0), wm.field_I);
          dk.a(param11, (byte) -72, param12, param5, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          stackIn_6_0 = var15;
          stackIn_6_1 = new StringBuilder().append("ke.G(");
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
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(')').toString());
        }
    }

    ke(int param0, int param1, int param2, int param3, qm param4, boolean param5, int param6, int param7, dj param8, int param9, String param10) {
        super(param0, param1, param2, param3, (pf) null, (wc) null);
        boolean stackIn_4_1 = false;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        try {
          this.field_B = param4;
          this.field_N = param10;
          this.field_H = param6;
          this.field_L = param8;
          stackIn_4_1 = (param5);
          this.field_J = stackIn_4_1;
          this.field_I = param9;
          this.field_G = param7;
          var12_int = -this.field_G + this.field_H;
          var13 = this.field_L.a(param10, var12_int, this.field_L.field_C) + this.field_G * 2;
          if (var13 > param3) {
            this.a(var13, param1, param2, param0, -59);
          } else {
            var13 = param3;
          }
          if (this.field_J) {
            stackIn_10_0 = 0;
          } else {
            stackIn_10_0 = this.field_H + this.field_G * 2;
          }
          var14 = stackIn_10_0;
          this.field_B.a(param3 - 2 * this.field_G, this.field_G + (-param3 + var13 >> 1), param2 - (this.field_H + 3 * this.field_G), var14, -60);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_14_0 = var12;
          stackIn_14_1 = new StringBuilder().append("ke.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static boolean g(int param0) {
        if (param0 > -8) {
          ke.a(false, 117);
          return true;
        }
        return true;
    }

    static {
        field_M = new int[]{16711680, 255, 16746496, 35071, 16729156, 4474111, 7829367};
        field_E = "Use less velocity than you did with Fire Ball, as this spell will bounce about wildly if travelling too fast.";
        field_F = "Remove <%0> from friend list";
    }
}
