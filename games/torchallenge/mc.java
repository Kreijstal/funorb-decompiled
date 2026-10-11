/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc implements j {
    private int field_h;
    private eg field_b;
    static sl field_k;
    private int field_n;
    private int field_e;
    private int field_c;
    static String field_o;
    private int field_i;
    private int field_f;
    private int field_a;
    private int field_j;
    private int field_d;
    private int field_l;
    static int[][][] field_g;
    private int field_m;

    final static void a(int param0, int param1) {
        int var2 = 64 / ((24 - param1) / 57);
        lh.e(0);
    }

    final static void a(int param0) {
        int var1;
        int var2;
        var2 = TorChallenge.field_F ? 1 : 0;
        hl.field_e = false;
        if (param0 <= 86) {
          return;
        }
        jh.field_a = null;
        if (eb.field_m) {
          da.field_c.m(13);
        } else {
          var1 = uk.field_H;
          if (0 < var1) {
            if (var1 == 1) {
              jh.field_a = cl.field_A;
            } else {
              jh.field_a = ni.a(new String[]{Integer.toString(var1)}, 0, gh.field_r);
            }
            jh.field_a = qa.a(119, new CharSequence[]{(CharSequence) ((Object) jh.field_a), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) bd.field_j)});
          }
          da.field_c.o(77);
          ba.c((byte) 15);
        }
    }

    final static java.net.URL a(java.net.URL param0, int param1, java.applet.Applet param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_2_0 = null;
        java.net.URL stackIn_11_0 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = null;
          var4 = null;
          if (param1 != -1) {
            stackIn_2_0 = (java.net.URL) null;
            return stackIn_2_0;
          }
          if (null != ah.field_g &&
            !ah.field_g.equals(param2.getParameter("settings"))) {
            var3 = ah.field_g;
            var4 = var3;
            var4 = var3;
          }
          if (e.field_i != null &&
            !e.field_i.equals(param2.getParameter("session"))) {
            var4 = e.field_i;
          }
          stackIn_11_0 = rk.a((String) (var4), -1, (String) (var3), -1, param0);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("mc.C(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw oj.a((Throwable) (stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public final void a(ee param0, int param1, int param2, byte param3, boolean param4) {
        ee stackIn_3_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        hc var11 = null;
        try {
          if (param0 instanceof hc) {
            stackIn_3_0 = (ee) (param0);
          } else {
            stackIn_3_0 = null;
          }
          var11 = (hc) (stackIn_3_0);
          if (var11 != null) {
            param4 = param4 & var11.field_F;
          }
          var7 = 5592405;
          if (param4) {
            var7 = 16777215;
          }
          qg.f(param0.field_m + param2, param0.field_i + param1, param0.field_p, param0.field_l, this.field_f);
          var8 = this.field_h + param0.field_m + param2;
          if (param3 != 97) {
            field_o = (String) null;
          }
          var9 = param1 + (param0.field_i + this.field_a);
          qg.a(var8, var9, this.field_n, this.field_j, 5592405);
          qg.f(var8, var9, this.field_n, this.field_j, var7);
          if (var11.field_D) {
            qg.d(var8, var9, this.field_n + var8, var9 + this.field_j, 1);
            qg.d(var8 + this.field_n, var9, var8, this.field_j + var9, 1);
          }
          if (this.field_b != null) {
            var10 = this.field_n + this.field_h + this.field_c;
            this.field_b.a(param0.field_v, param0.field_m + (param2 + var10), this.field_d + (param1 + param0.field_i), -this.field_c + (-var10 + param0.field_p), -(this.field_c << 1) + param0.field_l, this.field_m, this.field_l, this.field_i, this.field_e, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_18_0 = var6;
          stackIn_18_1 = new StringBuilder().append("mc.A(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_o = null;
        field_g = (int[][][]) null;
        field_k = null;
        if (param0) {
          mc.a(103);
        }
    }

    mc(eg param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.field_e = 1;
        this.field_i = 1;
        try {
          this.field_l = param4;
          this.field_c = param1;
          this.field_f = param9;
          this.field_d = param2;
          this.field_h = param5;
          this.field_n = param8;
          this.field_m = param3;
          this.field_j = param7;
          this.field_b = param0;
          this.field_a = param6;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "mc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        field_k = new sl();
        field_g = new int[][][]{new int[][]{new int[]{6, 6, 6, 6, 6, 6}, new int[]{0}, new int[]{0}, new int[]{6, 6, 6, 6, 6, 6}, new int[]{0}, new int[]{0}, new int[]{0}}, new int[][]{new int[]{5, 5, 5, 5, 5, 5}, new int[]{5, 5, 5, 5, 5}, new int[]{5, 5, 5, 5}, new int[]{0}, new int[]{0}, new int[]{5, 5, 5, 15, 5, 5, 5}, new int[]{0}}, new int[][]{new int[]{5, 5, 5, 5, 5, 5}, new int[]{0}, new int[]{0}, new int[]{0}, new int[]{5, 5, 5, 5, 5, 5, 5}, new int[]{0}, new int[]{5, 5, 5, 5, 5, 5}}};
    }
}
