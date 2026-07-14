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
        aj.a(param1, -18788, "");
        if (param0) {
            wb.a((byte) 31);
            gg.a(param1, (byte) -85);
            return;
        }
        gg.a(param1, (byte) -85);
    }

    final static void a(ea param0, int param1, byte param2) {
        oq var3 = null;
        if (param2 != -96) {
          return;
        } else {
          var3 = ej.field_j;
          var3.b(false, param1);
          var3.a(param0.field_s, false);
          var3.a(param0.field_o, false);
          return;
        }
    }

    public static void a(byte param0) {
        Object var2 = null;
        field_e = null;
        if (param0 != 118) {
          var2 = null;
          wb.a((ea) null, 39, (byte) 43);
          field_c = null;
          field_b = null;
          field_f = null;
          field_d = null;
          return;
        } else {
          field_c = null;
          field_b = null;
          field_f = null;
          field_d = null;
          return;
        }
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
