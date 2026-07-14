/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg extends hi {
    static boolean field_o;
    static int field_q;
    static String field_n;
    static int field_p;

    wg(vi param0) {
        super(param0);
    }

    final static void a(int param0, byte param1) {
        nc.field_Z = tb.field_b[param0];
        if (param1 > -100) {
          field_p = 109;
          de.field_b = jk.field_r[param0];
          mi.field_e = cc.field_h[param0];
          return;
        } else {
          de.field_b = jk.field_r[param0];
          mi.field_e = cc.field_h[param0];
          return;
        }
    }

    final String a(int param0, String param1) {
        if (param0 == -11300) {
          if (((wg) this).a(param1, (byte) -99) == vh.field_h) {
            return vg.field_j;
          } else {
            return wb.field_c;
          }
        } else {
          field_o = true;
          if (((wg) this).a(param1, (byte) -99) == vh.field_h) {
            return vg.field_j;
          } else {
            return wb.field_c;
          }
        }
    }

    final qd a(String param0, byte param1) {
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (null != uk.a(false, param0)) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var3 = stackIn_3_0;
        if (var3 != 0) {
          if (param1 != -99) {
            field_p = 62;
            return nc.field_bb;
          } else {
            return nc.field_bb;
          }
        } else {
          return vh.field_h;
        }
    }

    final static ba a(int param0, int param1) {
        ba[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        ba[] var5 = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        var5 = jl.a((byte) 60);
        var2 = var5;
        var3 = 0;
        L0: while (true) {
          if (var5.length > var3) {
            if (var5[var3].field_d != param0) {
              var3++;
              continue L0;
            } else {
              return var5[var3];
            }
          } else {
            var3 = -127 / ((-71 - param1) / 52);
            return null;
          }
        }
    }

    public static void j(int param0) {
        if (param0 != -24392) {
            field_q = -50;
            field_n = null;
            return;
        }
        field_n = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = 5;
        field_n = "Blocks Norbs";
        field_p = 0;
    }
}
