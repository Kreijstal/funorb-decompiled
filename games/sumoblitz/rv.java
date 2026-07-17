/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rv {
    static ck field_b;
    static String field_a;

    final static void a(byte param0) {
        ce.field_o = new js();
        if (param0 < 35) {
          field_a = null;
          vi.field_y.b((byte) -119, (pk) (Object) ce.field_o);
          return;
        } else {
          vi.field_y.b((byte) -119, (pk) (Object) ce.field_o);
          return;
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new ck();
        field_a = "Warning: if you quit, you will lose any game you are in the middle of!";
    }
}
