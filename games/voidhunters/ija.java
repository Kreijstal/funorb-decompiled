/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ija {
    int field_h;
    static String field_c;
    int field_d;
    int field_e;
    int field_a;
    static mob field_b;
    int field_g;
    int field_f;

    abstract void a(int param0, int param1);

    final static void a(int param0) {
        int var1 = 0;
        fh var2 = null;
        int var3 = 0;
        var3 = VoidHunters.field_G;
        vob.field_p = 0;
        mq.field_k = 0;
        kbb.field_q = null;
        mr.field_M.e(120);
        var1 = -31 % ((param0 - -31) / 39);
        st.field_o.e(97);
        var2 = ae.field_f.c(-43);
        L0: while (true) {
          if (var2 == null) {
            var2 = om.field_c.c(-94);
            L1: while (true) {
              if (var2 == null) {
                iwa.field_b = 0;
                return;
              } else {
                var2.d((byte) -35);
                var2 = om.field_c.d(-1);
                continue L1;
              }
            }
          } else {
            var2.d((byte) -35);
            var2 = ae.field_f.d(-1);
            continue L0;
          }
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        if (!param0) {
            field_b = null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static Object[] a(Object param0, Object[] param1, int param2, dja param3) {
        Object var5 = null;
        if (param2 != 0) {
          var5 = null;
          Object[] discarded$2 = ija.a(param1[1], (Object[]) null, ((int[]) param1[7])[7], (dja) null);
          return kn.a(param1, param0, false, param3, param2 + -110);
        } else {
          return kn.a(param1, param0, false, param3, param2 + -110);
        }
    }

    abstract void a(int param0, int param1, int param2);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Players: ";
    }
}
