/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r extends ig {
    static int[] field_m;
    static int[] field_n;

    final static void c(byte param0) {
        hn.field_b = 0;
        jq.a((byte) -128);
        int var1 = 96 / ((param0 - 1) / 38);
    }

    final na a(String param0, boolean param1) {
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (mm.a(-1, param0) != null) {
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
        if (var3 == 0) {
          return gp.field_d;
        } else {
          if (!param1) {
            return null;
          } else {
            return kr.field_e;
          }
        }
    }

    public static void b(byte param0) {
        field_m = null;
        if (param0 <= 111) {
            field_m = null;
            field_n = null;
            return;
        }
        field_n = null;
    }

    final String a(String param0, int param1) {
        if (!(((r) this).a(param0, true) != gp.field_d)) {
            return fr.field_m;
        }
        if (param1 != 0) {
            r.c((byte) 12);
            return hb.field_d;
        }
        return hb.field_d;
    }

    r(sl param0) {
        super(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new int[256];
        field_n = new int[]{2, 3, 4, 5, 6, 7, 8};
    }
}
