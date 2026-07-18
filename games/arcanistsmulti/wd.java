/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd implements qi {
    static qb field_e;
    static String field_i;
    static qb[] field_h;
    static long field_b;
    static kc field_a;
    static int[] field_c;
    static volatile int field_j;
    static kc[] field_g;
    static String field_k;
    static String field_f;
    static int field_d;

    public static void a(int param0) {
        field_f = null;
        field_c = null;
        field_k = null;
        field_g = null;
        field_a = null;
        field_e = null;
        field_h = null;
        field_i = null;
    }

    public final void a(int param0, int param1, int param2) {
        no.b(param1, (byte) -61, param0);
        int var4 = -97 / ((param2 - 59) / 47);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Enter name of player to delete from list";
        field_k = "This is the Book of Overlight. Overlight spells focus on healing and the defence of your forces. You require 5 wands to purchase this spellbook; you currently have ";
        field_b = 0L;
        field_f = "You have withdrawn your request to join.";
        field_j = 0;
        field_c = new int[5];
    }
}
