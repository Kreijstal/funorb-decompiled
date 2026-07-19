/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dba {
    static ws field_a;

    public static void a(byte param0) {
        if (param0 < 38) {
            dba.a((byte) 90);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static int b(byte param0) {
        ga.field_c.b((byte) 102);
        if (!aka.field_G.c((byte) 69)) {
          return sca.a(param0 ^ 72);
        } else {
          if (param0 != 72) {
            field_a = (ws) null;
            return 0;
          } else {
            return 0;
          }
        }
    }

    static {
        field_a = new ws();
    }
}
