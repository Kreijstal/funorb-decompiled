/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc implements dja {
    static String field_a;
    static int field_b;

    final static boolean a(int param0, byte param1, int param2) {
        int var3 = 27;
        return (540800 & param2) != 0 ? true : false;
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            tv[] discarded$0 = ((rc) this).a(127, -95);
            return (tv[]) (Object) new qdb[param1];
        }
        return (tv[]) (Object) new qdb[param1];
    }

    public final tv a(byte param0) {
        int var2 = -31 % ((-64 - param0) / 50);
        return (tv) (Object) new qdb();
    }

    public static void a() {
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "This private message is prefixed with \"<col=9090FF>To <%1>:</col>\" on your screen.<br>On <%1>'s screen, it will be prefixed with \"<col=FF6060>From <%0>:</col>\", which is<br>a different length and may leave less room for the message itself.<br><br>This shading covers the area which is not available on <%1>'s screen.<br>Provided your message fits to the left of the shaded area,<br><%1> should be able to see it in full.<br><br>(Note: this may be inaccurate if <%1> is playing in a different<br>language from you.)";
        field_b = -1;
    }
}
