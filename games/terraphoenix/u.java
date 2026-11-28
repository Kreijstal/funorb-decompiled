/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u {
    static FullscreenNoticeType field_d;
    static Sprite[] field_e;
    static IntrusiveDeque field_c;
    static int field_g;
    static String field_f;
    static Sprite field_a;
    static String field_b;

    final static void a(String param0, int param1) {
        System.out.println("Error: " + FullscreenNoticeType.a(param0, 0, "%0a", "\n"));
        if (param1 <= 106) {
          u.clearStaticReferences(11);
        }
    }

    public static void clearStaticReferences(int param0) {
        field_f = null;
        field_e = null;
        field_d = null;
        field_b = null;
        field_a = null;
        if (param0 >= -71) {
          return;
        }
        field_c = null;
    }

    static {
        field_d = new FullscreenNoticeType();
        field_c = new IntrusiveDeque();
        field_f = "Unpacking levels";
        field_b = "Shielding: 20";
        field_g = 0;
        field_a = new Sprite(128, 160);
    }
}
