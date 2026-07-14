/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vca implements bo {
    private pi field_a;
    static int[] field_c;
    static jea field_e;
    static ur field_d;
    static String field_b;

    final pi a(byte param0) {
        if (param0 <= 71) {
            field_d = null;
            return ((vca) this).field_a;
        }
        return ((vca) this).field_a;
    }

    public final String toString() {
        return "S2CEventPacket";
    }

    public final void a(kh param0, byte param1) {
        ((vca) this).field_a = new pi(param0);
        if (param1 != -19) {
            field_e = null;
        }
    }

    public final void a(int param0, kh param1) {
        if (param0 != 200) {
            return;
        }
        ((vca) this).field_a.b(param1, -19733);
    }

    public static void a(int param0) {
        field_d = null;
        field_e = null;
        field_b = null;
        if (param0 != 256) {
            return;
        }
        field_c = null;
    }

    final static String a(String param0, String param1, cn param2, byte param3) {
        if (!(param2.b(-53))) {
            return param1;
        }
        int var4 = 45 / ((14 - param3) / 48);
        return param0 + " - " + param2.a(true) + "%";
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[256];
        field_b = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_d = new ur(0);
    }
}
