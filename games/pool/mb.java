/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mb {
    static String field_d;
    static int[] field_b;
    static int field_e;
    static vh field_f;
    static int field_a;
    static String field_g;
    static int[] field_c;

    public static void c(int param0) {
        field_c = null;
        field_d = null;
        field_g = null;
        field_b = null;
        field_f = null;
    }

    final static void b(int param0) {
        Object var2 = null;
        rf.a((String) null, -125, "");
        if (param0 != 3) {
            field_f = null;
        }
    }

    abstract void a(byte[] param0, byte param1);

    abstract byte[] a(int param0);

    final static void d(int param0) {
        if (un.field_e == 0) {
          dp.field_c.field_hb = dq.a(3, 0, jc.field_f);
          if (param0 <= -97) {
            return;
          } else {
            mb.b(111);
            return;
          }
        } else {
          dp.field_c.field_hb = dq.a(2, 0, il.field_e);
          if (param0 <= -97) {
            return;
          } else {
            mb.b(111);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[4];
        field_d = "Owner";
        field_a = 96;
        field_g = "No";
    }
}
