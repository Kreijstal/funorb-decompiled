/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg {
    static ka field_d;
    static int field_a;
    static String[] field_c;
    static int field_b;

    final static void a(String param0, String param1, byte param2) {
        Object var4 = null;
        if (null == fa.field_G) {
          wi.field_c = new rg(param1, param0, false, true, true);
          if (param2 != 92) {
            var4 = null;
            kg.a((String) null, (String) null, (byte) 89);
            t.field_h.c(20317, (uj) (Object) wi.field_c);
            return;
          } else {
            t.field_h.c(20317, (uj) (Object) wi.field_c);
            return;
          }
        } else {
          fa.field_G.n(-104);
          wi.field_c = new rg(param1, param0, false, true, true);
          if (param2 == 92) {
            t.field_h.c(20317, (uj) (Object) wi.field_c);
            return;
          } else {
            var4 = null;
            kg.a((String) null, (String) null, (byte) 89);
            t.field_h.c(20317, (uj) (Object) wi.field_c);
            return;
          }
        }
    }

    final static long b(byte param0) {
        Object var2 = null;
        if (param0 != -71) {
          var2 = null;
          kg.a((String) null, (String) null, (byte) 108);
          return dd.b(param0 + 150) - ik.field_p;
        } else {
          return dd.b(param0 + 150) - ik.field_p;
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_d = null;
        if (param0 < 83) {
            kg.a((byte) -5);
        }
    }

    final static void a(vi param0, int param1, int param2, ue param3) {
        mh.field_k = wc.a(-43) * param2 / 1000;
        dh.a((byte) 115, param3);
        nb.a(param3, (byte) 124);
        lc.a(false, param3);
        p.a((byte) -68);
        fi.c((byte) -96);
        qb.field_h = -mh.field_k + param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_a = 0;
    }
}
