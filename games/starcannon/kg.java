/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg {
    static ka field_d;
    static int field_a;
    static String[] field_c;
    static int field_b;

    final static void a(String param0, String param1, byte param2) {
        try {
            if (null != fa.field_G) {
                fa.field_G.n(-104);
            }
            wi.field_c = new rg(param1, param0, false, true, true);
            if (param2 != 92) {
                String var4 = (String) null;
                kg.a((String) null, (String) null, (byte) 89);
            }
            t.field_h.c(20317, wi.field_c);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "kg.D(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static long b(byte param0) {
        String var2 = null;
        if (param0 != -71) {
          var2 = (String) null;
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
        try {
            mh.field_k = wc.a(-43) * param2 / 1000;
            dh.a((byte) 115, param3);
            nb.a(param3, (byte) 124);
            lc.a(false, param3);
            p.a((byte) -68);
            fi.c((byte) -96);
            qb.field_h = -mh.field_k + param1;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "kg.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_a = 0;
    }
}
