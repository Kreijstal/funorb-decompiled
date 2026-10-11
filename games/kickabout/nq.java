/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nq extends i {
    static ut field_G;
    static int field_I;
    static String field_H;
    static int field_J;
    static al field_F;

    final static boolean i(int param0) {
        if (param0 >= -55) {
          field_H = (String) null;
        }
        return 250 < up.field_p ? true : false;
    }

    final static boolean a(boolean param0, String param1, long param2) {
        gg var4 = null;
        RuntimeException var4_ref = null;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = tr.a(param1, (byte) 40);
          if (param0) {
            return true;
          }
          if (var4 != null &&
            var4.field_zb != null) {
            return true;
          }
          stackIn_11_0 = (null != uv.field_i) && (nk.a(31253, param2) != null);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_14_0 = var4_ref;
          stackIn_14_1 = new StringBuilder().append("nq.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    final static short[] a(short[] param0, ml param1, int param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        short[] stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var9 = Kickabout.field_G;
        try {
          var4_int = 46 % ((-4 - param3) / 47);
          var5 = param1.l(param2, 59);
          if (0 == var5) {
            return null;
          }
          if (param0 == null ||
            param0.length != var5) {
            param0 = new short[var5];
          }
          var6 = param1.l(4, 59);
          var7 = (short)param1.l(16, 59);
          if (var6 > 0) {
            for (var8 = 0; var5 > var8; var8++) {
              param0[var8] = (short)(var7 + param1.l(var6, 59));
            }
          } else {
            for (var8 = 0; var8 < var5; var8++) {
              param0[var8] = (short)var7;
            }
          }
          stackIn_16_0 = (short[]) (param0);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("nq.E(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    nq(String param0) {
        super(42);
        String var2 = null;
        ut var3 = null;
        try {
          var2 = vo.$cfr$intArgs$a$53ce4ab4c593(-18, gd.field_e[42], new String[]{param0});
          var3 = kb.field_E[6];
          this.a(var2, this.field_t, var3, -99, this.field_u);
          this.a(ds.a(this.field_y, 1), pg.a(false, 42), 1054928844);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "nq.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, nl param2, int param3, byte param4, int param5) {
        int var6_int = 0;
        int var7 = 0;
        nl stackIn_4_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_11_3 = 0;
        int stackIn_13_2 = 0;
        int stackIn_14_3 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param4 <= 36) {
            field_G = (ut) null;
          }
          var6_int = param2.f(-95);
          var7 = param2.a(true);
          stackIn_4_0 = (nl) (param2);
          if (param1 + param0 < var7) {
            stackIn_5_1 = 4;
          } else {
            stackIn_5_1 = 0;
          }
          if (var6_int >= param5 - param0) {
            stackIn_8_2 = 0;
          } else {
            stackIn_8_2 = 8;
          }
          if (var6_int > param5 + param0) {
            stackIn_11_3 = 2;
          } else {
            stackIn_11_3 = 0;
          }
          stackIn_13_2 = stackIn_8_2 | stackIn_11_3;
          if (-param0 + param1 > var7) {
            stackIn_14_3 = 1;
          } else {
            stackIn_14_3 = 0;
          }
          stackIn_4_0.field_G = stackIn_5_1 | (stackIn_13_2 | stackIn_14_3);
          if (param2.field_G == 0) {
            param2.a(param3, 26214);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_19_0 = var6;
          stackIn_19_1 = new StringBuilder().append("nq.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void b(int param0, int param1) {
        if (la.a(100)) {
          return;
        }
        if (uv.field_f) {
          return;
        }
        or.field_d.b(77, (byte) 85);
        or.field_d.a(105, param0);
        ri.field_t = param1;
        uv.field_f = true;
    }

    final static void b(int param0, int param1, int param2) {
        lj.field_h = param0;
        ji.field_Hb = param2;
        if (param1 != 0) {
          nq.h(-29);
        }
    }

    public static void h(int param0) {
        if (param0 != 0) {
          field_G = (ut) null;
        }
        field_H = null;
        field_G = null;
        field_F = null;
    }

    final static int g(int param0) {
        if (param0 != 0) {
          return 9;
        }
        return tl.a(-127);
    }

    static {
        field_I = 0;
        field_H = "Experience cannot be used when a player is in an auction.";
    }
}
