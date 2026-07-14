/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lsa extends ksa {
    static long field_f;
    int field_g;
    int field_d;
    static llb field_e;

    public static void c(byte param0) {
        if (param0 != -92) {
            field_f = 37L;
            field_e = null;
            return;
        }
        field_e = null;
    }

    private lsa() throws Throwable {
        throw new Error();
    }

    final static int a(String param0, int param1, boolean param2) {
        if (param1 <= -2) {
          if (!param2) {
            return oja.field_p.b(param0);
          } else {
            return bl.field_x.b(param0);
          }
        } else {
          lsa.c((byte) -36);
          if (!param2) {
            return oja.field_p.b(param0);
          } else {
            return bl.field_x.b(param0);
          }
        }
    }

    static {
    }
}
