/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ti {
    static String field_g;
    static boolean field_d;
    static tc field_b;
    static rk field_a;
    static hl[] field_e;
    static vi field_f;
    static int field_c;

    abstract byte[] b(int param0, boolean param1);

    final static int b(int param0, int param1) {
        if (param1 != 2047) {
            field_f = null;
            return gl.field_b[param0 & 2047];
        }
        return gl.field_b[param0 & 2047];
    }

    public static void a(byte param0) {
        field_f = null;
        if (param0 != 13) {
          int discarded$2 = ti.b(-127, 29);
          field_b = null;
          field_g = null;
          field_a = null;
          field_e = null;
          return;
        } else {
          field_b = null;
          field_g = null;
          field_a = null;
          field_e = null;
          return;
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        rh var4 = null;
        var3 = StarCannon.field_A;
        var4 = (rh) (Object) a.field_f.c(-3905);
        L0: while (true) {
          if (var4 == null) {
            if (param0 <= 32) {
              field_d = false;
              return;
            } else {
              return;
            }
          } else {
            ha.a(param1, 121, var4);
            var4 = (rh) (Object) a.field_f.a(-16913);
            continue L0;
          }
        }
    }

    abstract int a(int param0, boolean param1);

    abstract ak b(byte param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Connection timed out. Please try using a different server.";
        field_d = false;
        field_c = -1;
    }
}
