/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc extends c implements nh {
    static int field_V;
    private int field_X;
    static double field_Y;
    private jb field_W;

    final String g(int param0) {
        if (((bc) this).field_x) {
          if (((bc) this).field_m != null) {
            if (param0 != 4) {
              ((bc) this).field_X = 39;
              cd.a(-25343, kc.field_b, ag.field_f + (-((bc) this).field_X + ((bc) this).field_u));
              return ((bc) this).field_m;
            } else {
              cd.a(-25343, kc.field_b, ag.field_f + (-((bc) this).field_X + ((bc) this).field_u));
              return ((bc) this).field_m;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final void i(int param0) {
        super.i(param0);
        if (null != ((bc) this).field_W) {
            ((bc) this).field_W.a(-1283);
        }
    }

    final static void s(int param0) {
        ok.field_w = false;
        c.field_S = 0;
        gf.field_b = null;
        if (param0 > -17) {
          field_Y = -0.41482136694826427;
          gg.field_f = -1;
          aa.field_t = -1;
          return;
        } else {
          gg.field_f = -1;
          aa.field_t = -1;
          return;
        }
    }

    public final jb a(byte param0) {
        int var2 = -113 % ((param0 - -50) / 46);
        return ((bc) this).field_W;
    }

    final static void a(dd[] param0, int param1, int param2, byte param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = fleas.field_A ? 1 : 0;
        if (param0 != null) {
          if (0 >= param4) {
            return;
          } else {
            var5 = param0[0].field_x;
            var6 = param0[2].field_x;
            var7 = param0[1].field_x;
            var8 = -61 % ((13 - param3) / 44);
            param0[0].d(param2, param1);
            param0[2].d(-var6 + param4 + param2, param1);
            gb.a(ng.field_a);
            gb.g(param2 - -var5, param1, param4 + param2 - var6, param0[1].field_r + param1);
            var9 = param2 - -var5;
            var10 = param2 + param4 + -var6;
            param2 = var9;
            L0: while (true) {
              if (var10 <= param2) {
                gb.b(ng.field_a);
                return;
              } else {
                param0[1].d(param2, param1);
                param2 = param2 + var7;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    bc(String param0, kd param1, int param2) {
        super(param0, param1, param2);
    }

    final void a(int param0, int param1, qa param2, byte param3) {
        super.a(param0, param1, param2, (byte) -93);
        ((bc) this).field_X = ag.field_f - ((bc) this).field_y + -param1;
        if (param3 >= -85) {
            Object var6 = null;
            ((bc) this).a(-113, 27, (qa) null, (byte) 36);
        }
    }

    final static void a(rh param0, int param1, rh param2) {
        if (param1 != 1) {
            field_Y = 0.266666013076163;
            wf.field_b = param0;
            ub.field_b = param2;
            return;
        }
        wf.field_b = param0;
        ub.field_b = param2;
    }

    final void a(boolean param0, jb param1) {
        ((bc) this).field_W = param1;
        if (!param0) {
            field_V = -41;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Y = 0.1;
    }
}
