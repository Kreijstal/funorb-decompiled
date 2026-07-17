/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg {
    static int field_d;
    static String field_b;
    static String field_a;
    static vh field_c;

    final static im a(int param0, long param1) {
        if (param0 != 0) {
            boolean discarded$0 = mg.a(-80);
            return (im) (Object) ln.field_n.a(param1, false);
        }
        return (im) (Object) ln.field_n.a(param1, false);
    }

    final static boolean a(int param0) {
        int var1 = 0;
        var1 = -30 / ((-4 - param0) / 49);
        if (jd.field_c != null) {
          if (ta.field_a != tl.field_J) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        field_b = null;
    }

    final static boolean a(boolean param0) {
        return hk.b(-18) || 0 >= mp.field_V;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "<%0> is already on your ignore list.";
        field_a = "<%0> and <%1> are out of lives!";
    }
}
