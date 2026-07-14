/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh {
    static o field_c;
    static String field_a;
    static int field_b;

    final static void a(byte param0, int param1, int param2) {
        el.field_d = param2;
        rd.field_f = param1;
        if (param0 < 106) {
            sh.a((byte) 102, -98, 95);
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        field_c = null;
        if (param0) {
            sh.a(false);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = null;
        field_a = "<u>Tutorial: lesson 1<br>Type your word with the keyboard or use the mouse to drag letters. Then press 'ENTER' or click the 'Submit' button.<br><br>";
    }
}
