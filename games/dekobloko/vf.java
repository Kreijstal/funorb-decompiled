/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf {
    static String field_c;
    static boolean field_a;
    static String field_e;
    static int field_b;
    static String field_d;

    public static void a(int param0) {
        if (param0 != 27067) {
          field_a = false;
          field_e = null;
          field_d = null;
          field_c = null;
          return;
        } else {
          field_e = null;
          field_d = null;
          field_c = null;
          return;
        }
    }

    final static StringBuilder a(StringBuilder param0, int param1, int param2, char param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = client.field_A ? 1 : 0;
        var4 = param0.length();
        param0.setLength(param2);
        if (param1 != -23510) {
          field_c = null;
          var5 = var4;
          L0: while (true) {
            if (param2 <= var5) {
              return param0;
            } else {
              param0.setCharAt(var5, param3);
              var5++;
              continue L0;
            }
          }
        } else {
          var5 = var4;
          L1: while (true) {
            if (param2 <= var5) {
              return param0;
            } else {
              param0.setCharAt(var5, param3);
              var5++;
              continue L1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Please enter your date of birth to enable chat:";
        field_c = "Fruit";
        field_d = "This private message is prefixed with \"<col=9090FF>To <%1>:</col>\" on your screen.<br>On <%1>'s screen, it will be prefixed with \"<col=FF6060>From <%0>:</col>\", which is<br>a different length and may leave less room for the message itself.<br><br>This shading covers the area which is not available on <%1>'s screen.<br>Provided your message fits to the left of the shaded area,<br><%1> should be able to see it in full.<br><br>(Note: this may be inaccurate if <%1> is playing in a different<br>language from you.)";
    }
}
