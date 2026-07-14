/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gq extends go {
    static String field_l;
    static String field_m;
    static int field_n;

    final ea b(int param0) {
        if (param0 != -27096) {
            field_n = -3;
        }
        return da.field_o;
    }

    final static void a(int param0, int param1, int param2, String param3) {
        int var4 = 0;
        int var5 = Pixelate.field_H ? 1 : 0;
        for (var4 = param0; var4 < up.field_n.length; var4++) {
            if (up.field_n[var4].field_f) {
                up.field_n[var4].a(param3, param2, -1379417087, param1);
                return;
            }
        }
    }

    gq(long param0, String param1) {
        super(param0, param1);
    }

    public static void e(int param0) {
        if (param0 != 100) {
            field_n = 92;
        }
        field_l = null;
        field_m = null;
    }

    final static boolean d(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 > 55) {
            break L0;
          } else {
            field_m = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (jg.a((byte) 59)) {
              break L2;
            } else {
              if ((uo.field_j ^ -1) < -1) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "This game has started.";
        field_m = "Main Menu";
        field_n = 100;
    }
}
