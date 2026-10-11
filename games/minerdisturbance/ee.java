/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee extends em {
    static String field_K;
    sb field_G;
    static int field_J;
    static String field_E;
    static String field_H;
    int field_D;
    byte field_I;

    final byte[] c(byte param0) {
        if (param0 != -115) {
          String[] var3 = (String[]) null;
          ee.a((String) null, (String[]) null, (byte) -97, -80);
          if (this.field_C) {
            throw new RuntimeException();
          }
          if (this.field_G.field_o >= this.field_G.field_u.length - this.field_I) {
            return this.field_G.field_u;
          }
          throw new RuntimeException();
        }
        if (this.field_C) {
          throw new RuntimeException();
        }
        if (this.field_G.field_o >= this.field_G.field_u.length - this.field_I) {
          return this.field_G.field_u;
        }
        throw new RuntimeException();
    }

    final int f(int param0) {
        if (null == this.field_G) {
          return 0;
        }
        if (param0 == 100) {
          return this.field_G.field_o * 100 / (-this.field_I + this.field_G.field_u.length);
        }
        return -24;
    }

    public static void h(int param0) {
        field_H = null;
        if (param0 != 256) {
          field_K = (String) null;
          field_E = null;
          field_K = null;
          return;
        }
        field_E = null;
        field_K = null;
    }

    final static void i(int param0) {
        int var1 = ma.o(-14933);
        int var2 = ei.n(param0 ^ param0);
        rb.field_e.a(var2 + (rf.field_b << 1), lj.field_p - rf.field_b, var1 + (pm.field_c << 1), 26202, cg.field_o - pm.field_c);
        ik.n(-107);
    }

    final static void a(String param0, String[] param1, byte param2, int param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = MinerDisturbance.field_ab;
        try {
          if (param2 != -98) {
            field_E = (String) null;
          }
          ic.field_l = kd.field_p;
          if (param3 == 255) {
            stackIn_7_0 = !(me.field_j >= 13);
            vk.field_g = hn.a(stackIn_7_0, (byte) 105);
            return;
          }
          if (100 > param3) {
            vk.field_g = ij.a(param3, param0, true);
            return;
          }
          if (param3 <= 105) {
            vk.field_g = rh.a(124, param1);
            return;
          }
          vk.field_g = ij.a(param3, param0, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("ee.B(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean e(byte param0) {
        int var1_int = 0;
        int var3 = 0;
        boolean stackIn_5_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        tc var2 = null;
        var3 = MinerDisturbance.field_ab;
        try {
          if (53 == lj.field_t) {
            stackIn_5_0 = !(fn.field_o);
            fn.field_o = stackIn_5_0;
            return true;
          }
          if (!fn.field_o) {
            return false;
          }
          if (lj.field_t == 13) {
            fn.field_o = false;
            return true;
          }
          var1_int = 0;
          if (qd.field_O[86] &&
            qd.field_O[82]) {
            var1_int = 3;
          } else if (!qd.field_O[86] &&
            qd.field_O[82]) {
            var1_int = 1;
          } else {
            if (qd.field_O[86] &&
              !qd.field_O[82]) {
              var1_int = 2;
            }
          }
          var2 = (tc) (ii.field_b.b(103));
          while (var2 != null) {
            if (var1_int == var2.field_q &&
              var2.field_w == lj.field_t) {
              var2.field_u.a(false);
              fn.field_o = false;
              return true;
            }
            var2 = (tc) (ii.field_b.b((byte) 56));
          }
          if (param0 == 75) {
            return false;
          }
          field_J = -10;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var1), "ee.D(" + param0 + ')');
        }
    }

    ee() {
    }

    static {
        field_E = "Discard";
        field_J = 256;
        field_H = "Reset Tips";
        field_K = "Return to game";
    }
}
