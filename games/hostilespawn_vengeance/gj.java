/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gj {
    gb field_a;
    static int field_h;
    String field_c;
    String field_e;
    String field_g;
    static ub field_b;
    static bd field_d;
    int field_f;

    final static boolean a(int param0, int param1, int param2, int param3) {
        oc var4;
        int var5;
        int var6;
        boolean stackIn_10_0 = false;
        if (ln.field_a.field_i[param0] == 0) {
          return false;
        }
        var4 = mm.field_m[0].field_j;
        if (param2 > -89) {
          return true;
        }
        var5 = -param3 + var4.field_e;
        var6 = -param1 + var4.field_g;
        stackIn_10_0 = (-20 < var5) && (20 > var5) && (var6 > -17) && (var6 < 17);
        return stackIn_10_0;
    }

    final static void a(int param0, String param1, float param2) {
        try {
          bl.field_f = param2;
          if (param0 != 20) {
            gj.a(1.1003973141348942, -79);
          }
          wi.field_c = param1;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "gj.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static double a(double param0, int param1) {
        if (param1 >= 0) {
          gj.a(124, -103, 11, -7);
        }
        return -24.0 + (24.0 * param0 - (double)uj.field_p.field_e);
    }

    public static void a(byte param0) {
        if (param0 > -5) {
          field_d = (bd) null;
        }
        field_d = null;
        field_b = null;
    }

    final static nd[] a(int param0) {
        if (param0 != -17) {
          field_d = (bd) null;
        }
        return new nd[]{bh.field_c, ac.field_c, tf.field_b, li.field_x, lk.field_N, kd.field_G, ee.field_h, pl.field_q, lg.field_e, gb.field_f, fh.field_a, bc.field_j, oa.field_g, ee.field_a};
    }

    final static u[] a(boolean param0, en param1) {
        int var5 = 0;
        en stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        boolean stackIn_4_2 = false;
        Object stackIn_6_0 = null;
        en stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        boolean stackIn_15_2 = false;
        u[] stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        u[] var4 = null;
        int var6 = 0;
        u var6_ref_u = null;
        int var7 = 0;
        var7 = HostileSpawn.field_I ? 1 : 0;
        try {
          stackIn_3_0 = (en) (param1);
          stackIn_3_1 = 8;
          stackIn_4_2 = !(param0);
          var2_int = ((en) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_4_2);
          if (0 < var2_int) {
            stackIn_6_0 = null;
            return (u[]) (stackIn_6_0);
          }
          if (param0) {
            field_h = -34;
          }
          var3 = param1.a(12, true);
          var4 = new u[var3];
          for (var5 = 0; var5 < var3; var5++) {
            if (!vi.a((byte) 124, param1)) {
              var6 = param1.a(aa.a(4, var5 - 1), true);
              var4[var5] = var4[var6];
            } else {
              var6_ref_u = new u();
              param1.a(24, true);
              param1.a(24, true);
              var6_ref_u.field_i = param1.a(24, true);
              param1.a(9, true);
              param1.a(12, true);
              param1.a(12, true);
              stackIn_14_0 = (en) (param1);
              stackIn_14_1 = 12;
              stackIn_15_2 = !(param0);
              ((en) (Object) stackIn_14_0).a(stackIn_14_1, stackIn_15_2);
              var4[var5] = var6_ref_u;
            }
          }
          stackIn_19_0 = var4;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_22_0 = var2;
          stackIn_22_1 = new StringBuilder().append("gj.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    private gj() throws Throwable {
        throw new Error();
    }

    static {
        field_b = new ub();
    }
}
