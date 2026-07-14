/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gs implements dja {
    static oe field_e;
    static String field_d;
    static llb field_b;
    static apb[] field_a;
    static int field_c;

    public static void b(byte param0) {
        if (param0 <= 66) {
          gs.b((byte) -38);
          field_d = null;
          field_e = null;
          field_b = null;
          field_a = null;
          return;
        } else {
          field_d = null;
          field_e = null;
          field_b = null;
          field_a = null;
          return;
        }
    }

    public final tv a(byte param0) {
        int var2 = -113 % ((param0 - -64) / 50);
        return (tv) (Object) new so();
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            gs.b((byte) 40);
            return (tv[]) (Object) new so[param1];
        }
        return (tv[]) (Object) new so[param1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Set up new game";
        field_e = new oe();
        field_c = 262144;
    }
}
