/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qm extends oj {
    static String field_Q;
    static bd field_P;
    static int field_R;
    static float field_O;

    final static pg a(String param0, int param1, String param2, gb param3) {
        int var4 = 0;
        int var5 = 0;
        var4 = param3.a((byte) -2, param0);
        if (param1 != 0) {
          return null;
        } else {
          var5 = param3.a(var4, param2, -1);
          return hf.a((byte) 119, param3, var4, var5);
        }
    }

    public static void h(int param0) {
        field_P = null;
        field_Q = null;
        int var1 = -80 % ((param0 - 55) / 38);
    }

    final static void a(boolean param0) {
        gf.field_e = wl.c(11);
        if (param0) {
          qm.h(46);
          im.field_e = new gg();
          pc.a(true, true, param0);
          return;
        } else {
          im.field_e = new gg();
          pc.a(true, true, param0);
          return;
        }
    }

    qm() {
    }

    qm(id param0, oc param1, int param2, int param3, int param4, boolean param5) {
        ((qm) this).a(param5, param4, 21963, param2, param3, param1);
    }

    final static gb b(int param0, int param1) {
        if (param0 != 1) {
          field_P = null;
          return bf.a(false, true, param1, 1, false, 84);
        } else {
          return bf.a(false, true, param1, 1, false, 84);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = 0.0f;
        field_Q = "This entry doesn't match";
    }
}
