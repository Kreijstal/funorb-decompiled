/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk {
    private boolean field_d;
    private String field_a;
    static String field_e;
    static pb field_b;
    private boolean field_c;

    public static void a(int param0) {
        field_b = null;
        int var1 = 126 / ((-80 - param0) / 46);
        field_e = null;
    }

    final static void a(int param0, String param1, boolean param2, String param3) {
        va.field_a = param3;
        wb.field_c = param1;
        we.a(param2, 12757, ul.field_H);
        if (param0 != 12) {
            Object var5 = null;
            bk.a(20, (String) null, true, (String) null);
        }
    }

    final static void a(int param0, boolean param1, int param2, ka param3, int param4) {
        param3.a(param1, 12);
        param3.c(17, -117);
        param3.c(param0, -123);
        param3.c(param2, -117);
        param3.a(false, param4);
    }

    final void a(boolean param0, boolean param1) {
        ((bk) this).field_d = param0 ? true : false;
        ((bk) this).field_c = param1 ? true : false;
    }

    final boolean b(int param0) {
        if (param0 != 17) {
            ((bk) this).field_c = true;
            return ((bk) this).field_d;
        }
        return ((bk) this).field_d;
    }

    final String c(int param0) {
        if (param0 >= -106) {
            return null;
        }
        return ((bk) this).field_a;
    }

    final static hk a(int param0, int param1, int param2, int param3, int param4) {
        hk var5 = null;
        hk var5_ref = null;
        int var6 = 0;
        var6 = stellarshard.field_B;
        var5 = (hk) (Object) id.field_g.b(param3 + -133);
        L0: while (true) {
          if (var5 == null) {
            if (param3 != 17) {
              return null;
            } else {
              var5_ref = new hk();
              var5_ref.field_r = param2;
              var5_ref.field_q = param1;
              var5_ref.field_t = param4;
              id.field_g.b(param3 ^ -69, (gg) (Object) var5_ref);
              pd.a(param0, var5_ref, 31);
              return var5_ref;
            }
          } else {
            if (var5.field_t == param4) {
              return var5;
            } else {
              var5 = (hk) (Object) id.field_g.b((byte) 102);
              continue L0;
            }
          }
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
            return false;
        }
        return ((bk) this).field_c;
    }

    bk(String param0) {
        ((bk) this).field_d = false;
        ((bk) this).field_c = false;
        ((bk) this).field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Back";
    }
}
