/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class to extends de {
    static mm field_t;
    static boolean field_s;
    static vk field_r;
    static ti field_q;
    static String field_p;
    static String field_o;

    final static void g(byte param0) {
        if (el.field_b == 10) {
          tj.h(20);
          el.field_b = 11;
          go.field_f = true;
          if (param0 > 36) {
            return;
          } else {
            to.g((byte) 72);
            return;
          }
        } else {
          if (!ri.a(-88)) {
            tj.h(20);
            el.field_b = 11;
            go.field_f = true;
            if (param0 <= 36) {
              to.g((byte) 72);
              return;
            } else {
              return;
            }
          } else {
            go.field_f = true;
            if (param0 > 36) {
              return;
            } else {
              to.g((byte) 72);
              return;
            }
          }
        }
    }

    final void a(int param0) {
        gj.field_W[0].b(0, 45);
        if (param0 != 11) {
            return;
        }
        ((to) this).b((byte) -71);
    }

    public static void f(byte param0) {
        field_p = null;
        field_r = null;
        int var1 = 0;
        field_o = null;
        field_q = null;
        field_t = null;
    }

    to(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final void c(byte param0) {
        if (param0 > -13) {
            field_t = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "You have 1 unread message!";
        field_p = "Orb points: ";
    }
}
