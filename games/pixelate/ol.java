/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol extends de {
    static String[] field_p;
    static boolean field_o;
    static int field_q;

    final void c(byte param0) {
        if (param0 >= -13) {
            boolean discarded$0 = ol.b(false);
        }
    }

    final void e(byte param0) {
        int var2 = ro.b(-36, !pe.a(false) ? true : false);
        if (param0 >= -64) {
            return;
        }
        if (3 == var2) {
            if (null != ib.field_f) {
                ln.a(75);
            }
            m.a(ao.a(13867), -60);
        }
        if (var2 == 1) {
            la.a(ti.field_t, 0, false, -25528);
        }
        if (!(-3 != (var2 ^ -1))) {
            la.a(ti.field_t, 0, true, -25528);
        }
    }

    final void a(int param0) {
        if (!(!se.d(3782))) {
            mc.e(12);
        }
        if (param0 != 11) {
            field_q = 43;
        }
    }

    final static void e(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        am.field_b = new int[4];
        am.field_b[2] = 12554336;
        am.field_b[0] = 6322367;
        am.field_b[1] = 12542143;
        am.field_b[3] = 11321184;
        am.field_i = new int[512];
        if (param0 != 2071) {
            return;
        }
        for (var1 = 0; var1 < am.field_i.length; var1++) {
            var2 = var1 * 4 / am.field_i.length;
            var3 = -4 == (var2 ^ -1) ? 0 : var2 - -1;
            var3 = am.field_b[var3];
            var2 = am.field_b[var2];
            var4 = am.field_i.length >> -936953310;
            var5 = var1 % var4;
            var6 = var4 + -var5;
            am.field_i[var1] = cm.a(cm.a(var3, 65280) * var5 / var4, 65280) + (cm.a(16711935, var5 * cm.a(16711935, var3) / var4) + cm.a(var6 * cm.a(var2, 65280) / var4, 65280) + cm.a(16711935, cm.a(var2, 16711935) * var6 / var4));
        }
    }

    ol(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    public static void c(boolean param0) {
        if (param0) {
            return;
        }
        field_p = null;
    }

    final static boolean b(boolean param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0) {
            break L0;
          } else {
            field_p = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == sh.field_e) {
              break L2;
            } else {
              if (Pixelate.field_G != uk.field_s) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new String[]{"Hold '<col=ffff00>SPACE</col>' to make pieces drop quickly."};
        field_q = 0;
    }
}
