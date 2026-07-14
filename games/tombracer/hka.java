/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hka {
    static jpa field_c;
    static lja field_b;
    static int field_a;

    final static taa a(int param0, uia param1) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        if (param0 != 0) {
          var4 = null;
          taa discarded$2 = hka.a(62, (uia) null);
          var2 = param1.h(255);
          var3 = param1.h(255);
          return new taa(var2, var3);
        } else {
          var2 = param1.h(255);
          var3 = param1.h(255);
          return new taa(var2, var3);
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        if (param0) {
            hka.a(true);
            field_b = null;
            return;
        }
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
    }
}
