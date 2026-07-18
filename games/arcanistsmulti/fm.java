/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm {
    static String field_e;
    static String field_a;
    String[] field_b;
    long field_f;
    static vh field_c;
    long field_d;

    final static void a(int param0, boolean param1) {
        int var3 = 0;
        ab var4 = null;
        ab var5 = null;
        if (!param1) {
          fm.a(48, false);
          var4 = he.field_e;
          var4.b((byte) -57, param0);
          var4.field_g = var4.field_g + 1;
          var3 = var4.field_g;
          var4.f(2, (byte) -12);
          var4.a(gh.field_E, 0, (byte) -86, gh.field_E.length);
          var4.f(q.field_L, (byte) -14);
          var4.f(q.field_N, (byte) -3);
          var4.a(ng.field_D, 0, (byte) -86, ng.field_D.length);
          var4.b(var4.field_g - var3, (byte) 43);
          return;
        } else {
          var5 = he.field_e;
          var5.b((byte) -57, param0);
          var5.field_g = var5.field_g + 1;
          var3 = var5.field_g;
          var5.f(2, (byte) -12);
          var5.a(gh.field_E, 0, (byte) -86, gh.field_E.length);
          var5.f(q.field_L, (byte) -14);
          var5.f(q.field_N, (byte) -3);
          var5.a(ng.field_D, 0, (byte) -86, ng.field_D.length);
          var5.b(var5.field_g - var3, (byte) 43);
          return;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_e = null;
        field_a = null;
    }

    private fm() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Match by...";
        field_a = "You have entered another game.";
    }
}
