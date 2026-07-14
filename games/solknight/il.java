/*
 * Decompiled by CFR-JS 0.4.0.
 */
class il extends aa {
    private long field_a;
    static va field_c;
    static String field_d;
    static int[] field_e;
    private String field_b;

    final static int a(CharSequence param0, int param1) {
        if (param1 != 6054) {
          il.c(10);
          return v.a(param1 + -6138, param0, 10, true);
        } else {
          return v.a(param1 + -6138, param0, 10, true);
        }
    }

    wb a(int param0) {
        if (param0 <= 30) {
            Object var3 = null;
            ((il) this).a(-115, (gb) null);
            return qb.field_L;
        }
        return qb.field_L;
    }

    final static boolean b(int param0) {
        if (param0 != 507) {
            boolean discarded$0 = il.b(-102);
            return lh.field_l;
        }
        return lh.field_l;
    }

    final void a(int param0, gb param1) {
        param1.a(((il) this).field_a, (byte) 89);
        param1.a(111, ((il) this).field_b);
        if (param0 != -12518) {
            Object var4 = null;
            ((il) this).a(-37, (gb) null);
        }
    }

    public static void c(int param0) {
        if (param0 != 2113536) {
            return;
        }
        field_c = null;
        field_d = null;
        field_e = null;
    }

    il(long param0, String param1) {
        ((il) this).field_a = param0;
        ((il) this).field_b = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[]{64, 8256, 16416, 2113536, 4202496, 4194368, 4194304, 4210752};
        field_d = "Connection timed out. Please try using a different server.";
    }
}
