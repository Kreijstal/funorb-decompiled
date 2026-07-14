/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class upb implements dja {
    static boolean field_c;
    static int field_a;
    static String field_b;

    public static void b(int param0) {
        field_b = null;
        if (param0 != 50) {
            int[] discarded$0 = upb.a(-69);
        }
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            upb.b(105);
            return (tv[]) (Object) new cqb[param1];
        }
        return (tv[]) (Object) new cqb[param1];
    }

    final static int[] a(int param0) {
        int[] var1 = null;
        int[] var2 = null;
        if (mgb.field_o) {
          if (param0 < 97) {
            int[] discarded$2 = upb.a(-101);
            var2 = wba.field_o;
            var1 = var2;
            wba.field_o = null;
            return var2;
          } else {
            var2 = wba.field_o;
            var1 = var2;
            wba.field_o = null;
            return var2;
          }
        } else {
          return null;
        }
    }

    public final tv a(byte param0) {
        int var2 = -45 / ((param0 - -64) / 50);
        return (tv) (Object) new cqb();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = false;
        field_a = 50;
        field_b = "Show chat";
    }
}
