/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol extends lu {
    static int field_B;
    static int field_A;
    static wk field_y;
    static og[] field_w;
    static volatile boolean field_z;
    static String field_x;
    static boolean field_C;

    final String d(int param0, kb param1) {
        if (param0 != 0) {
          ol.b((byte) 38);
          return no.a('*', true, param1.field_v.length());
        } else {
          return no.a('*', true, param1.field_v.length());
        }
    }

    ol(int param0) {
        this(ArmiesOfGielinor.field_J, param0);
    }

    public static void b(byte param0) {
        field_y = null;
        if (param0 <= 30) {
            ol.b((byte) -13);
            field_x = null;
            field_w = null;
            return;
        }
        field_x = null;
        field_w = null;
    }

    private ol(ka param0, int param1) {
        super(param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = 5;
        field_x = "Please select options in the following rows:  ";
        field_z = true;
    }
}
