/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca implements uo {
    int field_b;
    int field_c;
    int field_d;
    static int[] field_a;
    static int[] field_h;
    int field_g;
    String field_e;
    static int[] field_f;
    static String field_i;

    public static void a(int param0) {
        field_f = null;
        field_a = null;
        field_i = null;
        field_h = null;
        if (param0 != 23582) {
          field_f = (int[]) null;
        }
    }

    public final void a(int param0, bv param1, String param2, byte param3) {
        int var6 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          if (param3 != 37) {
            ca.b(-94);
          }
          if (param2.equals("name")) {
            if (0 >= param0) {
              return;
            }
            this.field_e = up.a(param1, param0, (byte) -115);
          } else {
            if (!param2.equals("mf")) {
              if (param2.equals("ownr")) {
                if (0 >= param0) {
                  return;
                }
                this.field_b = (int)tn.a(false, param0, param1);
                return;
              }
              if (param2.equals("tag")) {
                if (param0 <= 0) {
                  return;
                }
                this.field_d = (int)tn.a(false, param0, param1);
                return;
              }
              if (!param2.equals("god")) {
                return;
              }
              if (0 >= param0) {
                return;
              }
              this.field_g = (int)tn.a(false, param0, param1);
              return;
            }
            if (param0 > 0) {
              this.field_c = (int)tn.a(false, param0, param1);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_26_0 = var5;
          stackIn_26_1 = new StringBuilder().append("ca.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(java.awt.Component param0, int param1, hd param2, boolean param3, int param4, nm param5, int param6, int param7) {
        try {
          rc.a(param7, param3, 10);
          l.field_a = rc.a(param2, param0, 0, param6);
          mt.field_e = rc.a(param2, param0, 1, param1);
          ig.field_n = new uv();
          ku.field_K = param1;
          if (param4 >= -38) {
            field_a = (int[]) null;
          }
          mt.field_e.b(ig.field_n);
          lk.field_e = param5;
          lk.field_e.b(te.field_n, -120);
          l.field_a.b(lk.field_e);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "ca.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static long b(int param0) {
        if (param0 != 0) {
          ca.a(-47, true);
        }
        return -iq.field_h + vi.b(-53);
    }

    final static pf[] c(int param0) {
        if (param0 != 0) {
          ca.c(-90);
        }
        return new pf[]{vn.field_j, ps.field_y, u.field_l};
    }

    final static void a(int param0, boolean param1) {
        if (gk.field_J > 0 &&
          bw.field_g) {
          qn.d(0, 0, qn.field_l, ag.field_I.field_D);
          qc.field_c.b(param1, 20);
        }
        if ((!(bd.field_r <= 0) ||
          !(0 >= rk.field_D)) &&
          vk.field_f) {
          qn.d(0, 0, qn.field_l, ag.field_I.field_D);
          ta.field_R.b(param1, 20);
        }
        if (param0 != 5295) {
          ca.a(88);
        }
    }

    ca() {
        this.field_g = -1;
        this.field_d = 0;
    }

    static {
        field_f = new int[8192];
        field_i = "Waiting for graphics";
    }
}
