/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class id {
    static String field_b;
    d field_a;
    static int field_c;

    final static void a(byte param0) {
        if (param0 < 21) {
            id.a((byte) -89);
            hn.b(68);
            lj.a((byte) 19);
            return;
        }
        hn.b(68);
        lj.a((byte) 19);
    }

    final void a(int param0, int param1, int param2, int param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        var6 = 24;
        var7 = 5;
        ((id) this).field_a.a((byte) -86, param2, param0, param1, var7, var6, param3);
        if (!param4) {
          id.a((byte) 117);
          oj.field_c.a(0, hb.field_a.field_M, -2147483648, fe.field_g, 0);
          le.field_e.a(0, -82 + -sc.field_e + (hb.field_a.field_M + -2), -2147483648, 18, fe.field_g + 2);
          kf.field_t.a(-80 + (-2 + (-sc.field_e + hb.field_a.field_M)), 82 - -sc.field_e, -2147483648, 18, fe.field_g - -2);
          ea.field_bb.a(hb.field_a.field_M, 20, 20 + (2 + fe.field_g), -20 + (hb.field_a.field_pb + -fe.field_g + -2), 28267, sc.field_e, 2, 0);
          fg.field_d.a(20, 2, sc.field_e, 0);
          return;
        } else {
          oj.field_c.a(0, hb.field_a.field_M, -2147483648, fe.field_g, 0);
          le.field_e.a(0, -82 + -sc.field_e + (hb.field_a.field_M + -2), -2147483648, 18, fe.field_g + 2);
          kf.field_t.a(-80 + (-2 + (-sc.field_e + hb.field_a.field_M)), 82 - -sc.field_e, -2147483648, 18, fe.field_g - -2);
          ea.field_bb.a(hb.field_a.field_M, 20, 20 + (2 + fe.field_g), -20 + (hb.field_a.field_pb + -fe.field_g + -2), 28267, sc.field_e, 2, 0);
          fg.field_d.a(20, 2, sc.field_e, 0);
          return;
        }
    }

    id(String param0, ci param1) {
        String[] var3 = null;
        ci[] var4 = null;
        try {
            var3 = new String[]{param0, gg.field_g, ke.field_b};
            var4 = new ci[]{param1, hb.field_a, (ci) (Object) fg.field_d};
            ((id) this).field_a = new d(0L, ao.field_a, var3, hd.field_b, var4, 0);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "id.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, km[] param3, boolean param4, byte param5, lh param6, int param7, km[] param8, int param9, int param10, int param11) {
        try {
            int var12_int = 1;
            n.a(param6, 8, param4, param3, 320, 2, param10, param11, 240, param6, 8, 126, param10, param11, param8);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "id.A(" + 240 + ',' + 320 + ',' + 2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + -105 + ',' + (param6 != null ? "{...}" : "null") + ',' + 8 + ',' + (param8 != null ? "{...}" : "null") + ',' + 8 + ',' + param10 + ',' + param11 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Sorry, you were removed from the game you were in. This can happen if you are disconnected for too long or if the server is updated.";
    }
}
