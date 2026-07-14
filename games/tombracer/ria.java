/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ria extends dg {
    static fta field_o;
    static volatile int field_m;
    static String field_r;
    static String field_n;
    private int field_q;
    static String field_p;

    final void d(int param0) {
        if (param0 != -1) {
            ((ria) this).field_q = -76;
        }
    }

    final void a(gr param0, gma param1, byte param2) {
        super.a(param0, param1, param2);
    }

    final void h(int param0) {
        if (param0 < 0) {
            ((ria) this).field_q = 122;
            super.h(89);
            return;
        }
        super.h(89);
    }

    ria(int param0, la param1, kh param2) {
        super(param0, param1, param2);
    }

    final int k(byte param0) {
        if (param0 != -99) {
            return -101;
        }
        return 7;
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        int var6 = -26 / ((-38 - param4) / 47);
    }

    ria(int param0) {
        super(param0);
    }

    public static void i(int param0) {
        field_o = null;
        field_n = null;
        field_p = null;
        if (param0 != -30362) {
            ria.i(28);
            field_r = null;
            return;
        }
        field_r = null;
    }

    final void a(int param0, la param1, kh param2) {
        if (param0 > 119) {
          super.a(126, param1, param2);
          if (param1.field_E <= 17) {
            return;
          } else {
            ((ria) this).field_q = param2.b((byte) 44, 4);
            return;
          }
        } else {
          ((ria) this).field_q = -123;
          super.a(126, param1, param2);
          if (param1.field_E <= 17) {
            return;
          } else {
            ((ria) this).field_q = param2.b((byte) 44, 4);
            return;
          }
        }
    }

    final void a(byte param0, kh param1) {
        int var3 = 33 % ((param0 - -8) / 40);
        super.a((byte) 117, param1);
        param1.a((byte) -126, ((ria) this).field_q, 4);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = 0;
        field_r = "Owner";
        field_n = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_o = new fta();
        field_p = "<%0> has been removed.";
    }
}
