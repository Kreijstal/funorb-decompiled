/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl {
    static String field_b;
    static int[] field_e;
    static String field_d;
    static String field_c;
    static t field_a;

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        if (param0 != -11784) {
          cl.a(101, -52, -57);
          field_e = null;
          field_b = null;
          field_a = null;
          return;
        } else {
          field_e = null;
          field_b = null;
          field_a = null;
          return;
        }
    }

    final static void a(int param0, boolean param1, uh param2, la param3) {
        if (param1) {
          field_c = null;
          pf.field_A = n.c((byte) 57) * param0 / 1000;
          ti.a(param3, 28922);
          le.a(6, param3);
          kl.a((byte) 66, param3);
          nb.g((byte) 96);
          af.a(true);
          jh.field_z = 0 - pf.field_A;
          return;
        } else {
          pf.field_A = n.c((byte) 57) * param0 / 1000;
          ti.a(param3, 28922);
          le.a(6, param3);
          kl.a((byte) 66, param3);
          nb.g((byte) 96);
          af.a(true);
          jh.field_z = 0 - pf.field_A;
          return;
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (param0 >= -64) {
            field_e = null;
            jo.field_b = param2;
            vk.field_A = param1;
            return;
        }
        jo.field_b = param2;
        vk.field_A = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[3];
        field_b = " ";
        field_c = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
    }
}
