/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf {
    static String[] field_c;
    static int field_a;
    static String[] field_b;

    final static void a(int param0) {
        RichTextWidget.a(param0 ^ 7);
        rc.a(param0 - 25541, param0);
    }

    public static void clearStaticReferences(int param0) {
        if (param0 != 4) {
          hf.clearStaticReferences(-106);
          field_c = null;
          field_b = null;
          return;
        }
        field_c = null;
        field_b = null;
    }

    static {
        field_b = new String[]{"crystalrocknroll", "metropolitation", "twinkle", "mysteriousmaze", "trickncheat", "tarantulum", "pluckyparade", "gardenersgauntlet", "megamix1", "megamix2"};
    }
}
