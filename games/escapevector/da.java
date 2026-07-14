/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da {
    static tf field_c;
    static String[] field_d;
    static ta field_b;
    static String field_a;

    final static void a(byte param0) {
        if (!nf.field_u) {
          throw new IllegalStateException();
        } else {
          c.field_u = true;
          if (param0 != -112) {
            field_d = null;
            ic.a((byte) -123, false);
            ff.field_e = 0;
            return;
          } else {
            ic.a((byte) -123, false);
            ff.field_e = 0;
            return;
          }
        }
    }

    final static boolean c(byte param0) {
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        fh.field_a = true;
        tg.field_mb = td.b(128) - -15000L;
        if (param0 >= -19) {
          return false;
        } else {
          L0: {
            if (11 != ff.field_e) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static te b(byte param0) {
        int var2 = 85 % ((param0 - -46) / 39);
        te var1 = new te(on.field_e, hd.field_c, gn.field_k[0], gi.field_e[0], qh.field_k[0], bc.field_a[0], qe.field_a[0], qk.field_f);
        of.a(false);
        return var1;
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
            return;
        }
        field_d = null;
        field_a = null;
        field_c = null;
    }

    final static boolean a(c param0, byte param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param1 > -96) {
          L0: {
            field_b = null;
            if ((param0.j(1, 8) ^ -1) != -2) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((param0.j(1, 8) ^ -1) != -2) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[]{"redsandstone", "venus", "moon", "alien", "virtual", "tutorial"};
        field_a = "Achievements";
    }
}
