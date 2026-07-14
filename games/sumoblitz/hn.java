/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hn extends kb implements fk {
    static String field_k;
    static int field_j;

    public final int a(int param0) {
        if (param0 != 2721) {
            return 47;
        }
        return ((hn) this).field_f;
    }

    final void b(int param0) {
        ((hn) this).field_g.a((fk) this, -127);
        if (param0 != 1735490466) {
            ((hn) this).b(52);
        }
    }

    final static void a(byte param0, String param1) {
        rb.field_c = param1;
        rd.a(12, -78);
        if (param0 < 62) {
            field_k = null;
        }
    }

    public static void b(boolean param0) {
        field_k = null;
        if (!param0) {
            field_j = -101;
        }
    }

    hn(fr param0, int param1, byte[] param2, int param3, boolean param4) {
        super(param0, 34962, param2, param3, param4);
    }

    final static int a(boolean param0, int param1) {
        param1--;
        if (param0) {
          return -71;
        } else {
          param1 = param1 | param1 >>> 1689604353;
          param1 = param1 | param1 >>> 1735490466;
          param1 = param1 | param1 >>> -222746364;
          param1 = param1 | param1 >>> 705284488;
          param1 = param1 | param1 >>> 1678969168;
          return param1 - -1;
        }
    }

    static {
    }
}
