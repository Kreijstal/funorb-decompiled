/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class uc {
    static rh field_b;
    static int field_c;
    static int field_d;
    static boolean[] field_a;
    private static String field_z;

    abstract void a(int param0, java.awt.Component param1);

    abstract int a(int param0);

    abstract void a(java.awt.Component param0, byte param1);

    public static void b(int param0) {
        field_a = null;
        field_b = null;
        int var1 = 38 % ((25 - param0) / 56);
    }

    static {
        field_z = "uc.D(";
        field_b = new rh();
        field_c = 0;
        field_d = 0;
        field_a = new boolean[32];
    }
}
