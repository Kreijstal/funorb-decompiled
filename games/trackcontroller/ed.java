/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ed extends rh {
    static kk field_I;

    private ed(String param0, tg param1) {
        this(param0, lb.field_O.field_h, param1);
        ((ed) this).field_y = lb.field_O.field_j;
    }

    private ed(String param0, t param1, tg param2) {
        super(param0, param1, param2);
        ((ed) this).field_y = lb.field_O.field_j;
    }

    final static void a(String[] args, int param1, String param2, byte param3) {
        int var4 = 0;
        String[] var5 = null;
        int var6 = 0;
        Object var7 = null;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var6 = TrackController.field_F ? 1 : 0;
        var4 = 67 / ((param3 - -20) / 57);
        rk.field_X = cj.field_e;
        if (-256 != (param1 ^ -1)) {
          if (100 <= param1) {
            if ((param1 ^ -1) >= -106) {
              var5 = args;
              gk.a(var5, (byte) -98);
              fh.field_c = qg.a(args, 74);
              return;
            } else {
              fh.field_c = wg.a((byte) -118, param1, param2);
              return;
            }
          } else {
            fh.field_c = wg.a((byte) -118, param1, param2);
            return;
          }
        } else {
          L0: {
            if ((da.field_o ^ -1) <= -14) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          fh.field_c = oc.a(stackIn_4_0 != 0, -21017);
          var7 = null;
          gk.a((String[]) null, (byte) -93);
          return;
        }
    }

    final static void a(byte param0) {
        if (!(ag.b(15))) {
            return;
        }
        ij.a((byte) 111, 4, false);
        if (param0 > -91) {
            field_I = null;
        }
    }

    public static void j(int param0) {
        field_I = null;
        if (param0 != -3621) {
            Object var2 = null;
            ed.a((String[]) null, 26, (String) null, (byte) 99);
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        ((ed) this).field_G = !((ed) this).field_G ? true : false;
        super.b(param0, param1, param2, param3);
    }

    ed(String param0, tg param1, boolean param2) {
        this(param0, param1);
        ((ed) this).field_G = param2 ? true : false;
    }

    static {
    }
}
