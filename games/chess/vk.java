/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk {
    static int field_b;
    static int field_g;
    static String field_c;
    static byte[][] field_d;
    static String field_h;
    static ci field_i;
    static km field_a;
    static boolean field_e;
    static String field_f;

    final static void a(boolean param0, boolean param1) {
        if (param0) {
          return;
        } else {
          L0: {
            if (null != cd.field_x) {
              wb.g(wb.field_i, wb.field_a, wb.field_j - wb.field_i, -wb.field_a + wb.field_b);
              cd.field_x.a(param0, param1);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_h = null;
        field_c = null;
        field_d = null;
        field_i = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Waiting for music";
        field_g = 0;
        field_h = "This private message is prefixed with \"<col=9090FF>To <%1>:</col>\" on your screen.<br>On <%1>'s screen, it will be prefixed with \"<col=FF6060>From <%0>:</col>\", which is<br>a different length and may leave less room for the message itself.<br><br>This shading covers the area which is not available on <%1>'s screen.<br>Provided your message fits to the left of the shaded area,<br><%1> should be able to see it in full.<br><br>(Note: this may be inaccurate if <%1> is playing in a different<br>language from you.)";
        field_e = true;
        field_f = "Close";
    }
}
