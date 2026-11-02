/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ls {
    static String[] field_b;
    static Sprite[] field_a;
    static Sprite field_c;
    static String field_d;
    private static String field_z;

    public static void releaseStatics(int param0) {
        field_a = null;
        field_b = null;
        if (param0 <= -28) {
          field_d = null;
          field_c = null;
          return;
        }
        ls.releaseStatics(91);
        field_d = null;
        field_c = null;
    }

    static {
        field_z = "ls.A(";
        field_b = new String[]{"meaty", "dairy", "sweet", "bread", "spooky", "bouncy", "fizzy", "fishy", "spicy", "savoury"};
        field_d = "You won! Here are your battle-stats.";
    }
}
