/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ev {
    int field_a;
    int field_d;
    static String field_b;
    static String field_c;
    int field_e;

    abstract void a(byte param0, int param1, int param2);

    abstract void b(byte param0, int param1, int param2);

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        if (param0 != 28378) {
            ev.a(72);
        }
    }

    abstract void a(int param0, byte param1, int param2);

    ev(int param0, int param1, int param2) {
        this.field_a = param2;
        this.field_e = param0;
        this.field_d = param1;
    }

    static {
        field_b = "Play rated game";
        field_c = "Fighter chassis";
    }
}
