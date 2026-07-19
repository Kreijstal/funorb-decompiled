/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ib {
    static int field_b;
    static ah field_a;
    static String field_d;
    static String field_c;

    final static long a(byte param0) {
        if (param0 < 126) {
            return 28L;
        }
        return -sj.field_k + k.a(0);
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        field_d = null;
        if (param0 != 27204) {
            field_c = (String) null;
        }
    }

    static {
        field_d = "Won";
        field_c = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find a suitable opponent in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
    }
}
