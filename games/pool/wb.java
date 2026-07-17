/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wb {
    static boolean field_a;
    static String field_d;
    static String field_b;
    static pn[] field_e;
    static so field_c;
    static String field_f;

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
            aj.a(param1, -18788, "");
            gg.a(param1, (byte) -85);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "wb.C(" + 0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(ea param0, int param1) {
        oq var3 = null;
        try {
            var3 = ej.field_j;
            var3.b(false, param1);
            var3.a(param0.field_s, false);
            var3.a(param0.field_o, false);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "wb.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + -96 + 41);
        }
    }

    public static void a() {
        field_e = null;
        field_c = null;
        field_b = null;
        field_f = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = true;
        field_d = "This game has started.";
        field_b = "This private message is prefixed with \"<col=9090FF>To <%1>:</col>\" on your screen.<br>On <%1>'s screen, it will be prefixed with \"<col=FF6060>From <%0>:</col>\", which is<br>a different length and may leave less room for the message itself.<br><br>This shading covers the area which is not available on <%1>'s screen.<br>Provided your message fits to the left of the shaded area,<br><%1> should be able to see it in full.<br><br>(Note: this may be inaccurate if <%1> is playing in a different<br>language from you.)";
        field_f = "Send private message";
    }
}
