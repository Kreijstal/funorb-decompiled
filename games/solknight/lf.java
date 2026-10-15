/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lf {
    static String field_e;
    static volatile int field_c;
    static aa field_a;
    static ad field_d;
    static char[] field_f;
    static String field_b;

    abstract void a(java.awt.Component param0, int param1);

    final static boolean a(int[] param0, int param1) {
        int var5_int = 0;
        int var6 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        sa var4_ref_sa = null;
        int var4 = 0;
        sa var5 = null;
        int var7 = 0;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          if (jj.field_Y != ef.field_e) {
            return false;
          }
          if (param1 != 122) {
            return false;
          }
          var2_long = je.a(1);
          if (0 != rh.field_i &&
            qg.field_a < 0) {
            var4_ref_sa = (sa) (jl.field_h.a((byte) 51));
            if (var4_ref_sa != null &&
              var2_long > var4_ref_sa.field_h) {
              var4_ref_sa.c(10);
              te.field_O = var4_ref_sa.field_k.length;
              te.field_N.field_m = 0;
              for (var5_int = 0; var5_int < te.field_O; var5_int++) {
                te.field_N.field_l[var5_int] = var4_ref_sa.field_k[var5_int];
              }
              nf.field_U = kl.field_b;
              kl.field_b = jg.field_e;
              jg.field_e = ob.field_h;
              ob.field_h = var4_ref_sa.field_j;
              return true;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_42_0 = var2;
          stackIn_42_1 = new StringBuilder().append("lf.E(");
          if (param0 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param1).append(')').toString());
        }
        stackIn_21_0 = qg.field_a;
        try {
          while (true) {
            if (stackIn_21_0 < 0) {
              te.field_N.field_m = 0;
              if (!bf.c(114, 1)) {
                return false;
              }
              qg.field_a = te.field_N.l(27310);
              te.field_N.field_m = 0;
              te.field_O = param0[qg.field_a];
            }
            if (!qd.b((byte) 127)) {
              return false;
            }
            if (rh.field_i == 0) {
              nf.field_U = kl.field_b;
              kl.field_b = jg.field_e;
              jg.field_e = ob.field_h;
              ob.field_h = qg.field_a;
              qg.field_a = -1;
              return true;
            }
            var4 = rh.field_i;
            if (hb.field_n != 0.0) {
              var4 = (int)((double)var4 + ib.field_i.nextGaussian() * hb.field_n);
              if (0 > var4) {
                var4 = 0;
              }
            }
            var5 = new sa(var2_long + (long)var4, qg.field_a, new byte[te.field_O]);
            for (var6 = 0; var6 < te.field_O; var6++) {
              var5.field_k[var6] = te.field_N.field_l[var6];
            }
            jl.field_h.a(var5, -7044);
            qg.field_a = -1;
            stackIn_21_0 = qg.field_a;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2 = decompiledCaughtException;
          stackIn_42_0 = var2;
          stackIn_42_1 = new StringBuilder().append("lf.E(");
          if (param0 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void b(int param0) {
        if (param0 != 18609) {
          java.applet.Applet var2 = (java.applet.Applet) null;
          lf.a((byte) -36, (java.applet.Applet) null);
        }
        field_a = null;
        field_f = null;
        field_e = null;
        field_b = null;
        field_d = null;
    }

    abstract int a(int param0);

    abstract void a(java.awt.Component param0, boolean param1);

    final static fg a(byte param0, java.applet.Applet param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        fg[] var4 = null;
        int var5 = 0;
        fg var6 = null;
        int var7 = 0;
        fg stackIn_4_0 = null;
        fg stackIn_9_0 = null;
        fg stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          var2_int = -56 % ((param0 - 51) / 35);
          var3 = na.a("jagex-last-login-method", param1, -32574);
          if (var3 == null) {
            stackIn_4_0 = SolKnight.field_D;
            return stackIn_4_0;
          }
          var4 = cl.d((byte) -30);
          var5 = 0;
          while (true) {
            if (var5 >= var4.length) {
              stackIn_12_0 = SolKnight.field_D;
              return stackIn_12_0;
            }
            var6 = var4[var5];
            if (!var6.a(-126, var3)) {
              var5++;
              continue;
            }
            break;
          }
          stackIn_9_0 = var6;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("lf.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_c = 0;
        field_a = null;
        field_f = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_b = "Not yet achieved";
    }
}
