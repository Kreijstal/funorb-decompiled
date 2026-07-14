/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wt {
    static String field_b;
    static String field_c;
    static volatile int field_a;

    final synchronized static long a(boolean param0) {
        long var1 = 0L;
        var1 = System.currentTimeMillis();
        if ((dfb.field_q ^ -1L) >= (var1 ^ -1L)) {
          dfb.field_q = var1;
          if (param0) {
            field_b = null;
            return var1 + eib.field_p;
          } else {
            return var1 + eib.field_p;
          }
        } else {
          eib.field_p = eib.field_p + (-var1 + dfb.field_q);
          dfb.field_q = var1;
          if (!param0) {
            return var1 + eib.field_p;
          } else {
            field_b = null;
            return var1 + eib.field_p;
          }
        }
    }

    final static void a(int param0, int param1, String[] param2, String param3) {
        int var5 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        var5 = VoidHunters.field_G;
        dn.field_r = gka.field_o;
        if (param0 == 255) {
          L0: {
            if ((iua.field_p ^ -1) <= -14) {
              stackOut_18_0 = 0;
              stackIn_19_0 = stackOut_18_0;
              break L0;
            } else {
              stackOut_17_0 = 1;
              stackIn_19_0 = stackOut_17_0;
              break L0;
            }
          }
          cjb.field_b = rv.a(stackIn_19_0 != 0, param1 ^ -19341);
          if (param1 != -19342) {
            field_c = null;
            return;
          } else {
            return;
          }
        } else {
          if (param0 < 100) {
            cjb.field_b = tma.a(param0, param3, (byte) -124);
            if (param1 == -19342) {
              return;
            } else {
              field_c = null;
              return;
            }
          } else {
            if ((param0 ^ -1) >= -106) {
              cjb.field_b = wm.a(param2, (byte) -122);
              if (param1 != -19342) {
                field_c = null;
                return;
              } else {
                return;
              }
            } else {
              cjb.field_b = tma.a(param0, param3, (byte) -124);
              if (param1 == -19342) {
                return;
              } else {
                field_c = null;
                return;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        if (param0 > -97) {
            wt.a(-106);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        bcb discarded$0 = new bcb();
        field_b = "<%0>'s game";
        field_c = "Full";
        field_a = -1;
    }
}
