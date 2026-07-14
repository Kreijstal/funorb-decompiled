/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd {
    static int[] field_c;
    static int[] field_a;
    static mf field_b;

    final static void a(int param0, wg param1, int param2) {
        jb.field_b.a(0, (le) (Object) param1);
        nd.a(param0, 1, param1);
        if (param2 > -6) {
            Object var4 = null;
            v[] discarded$0 = dd.a((String) null, (String) null, 118, (dj) null);
        }
    }

    final static v[] a(String param0, String param1, int param2, dj param3) {
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        if (param2 != -1864) {
          var6 = null;
          dd.a(34, (wg) null, 116);
          var4 = param3.a(param0, (byte) 8);
          var5 = param3.a(var4, param1, true);
          return h.a(param3, var4, -87, var5);
        } else {
          var4 = param3.a(param0, (byte) 8);
          var5 = param3.a(var4, param1, true);
          return h.a(param3, var4, -87, var5);
        }
    }

    public static void a(byte param0) {
        Object var2 = null;
        if (param0 != 68) {
          var2 = null;
          v[] discarded$2 = dd.a((String) null, (String) null, 95, (dj) null);
          field_a = null;
          field_c = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_c = null;
          field_b = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[4];
        field_a = new int[]{135, 135, 90, 120};
    }
}
