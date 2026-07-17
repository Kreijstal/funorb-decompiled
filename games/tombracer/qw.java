/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qw extends vg {
    static hea field_f;
    static String field_g;
    static d field_j;
    private hca field_h;
    private int field_i;

    final hca b(int param0) {
        if (param0 != -14065) {
            qw.a(-124);
            return ((qw) this).field_h;
        }
        return ((qw) this).field_h;
    }

    final static void a(int param0) {
        int var1 = 0;
        if (param0 != 256) {
          L0: {
            qw.a(false);
            if (224 > ff.field_w) {
              var1 = ff.field_w % 32;
              cf.a(ff.field_w - (-32 + var1), -127);
              break L0;
            } else {
              cf.a(256, -116);
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (224 > ff.field_w) {
              var1 = ff.field_w % 32;
              cf.a(ff.field_w - (-32 + var1), -127);
              break L1;
            } else {
              cf.a(256, -116);
              break L1;
            }
          }
          return;
        }
    }

    public static void a(boolean param0) {
        field_g = null;
        field_f = null;
        if (!param0) {
            return;
        }
        field_j = null;
    }

    final int c(int param0) {
        if (param0 <= 4) {
            return -38;
        }
        return ((qw) this).field_i;
    }

    qw(hca param0, la param1, int param2, int param3, int param4) {
        try {
            ((qw) this).field_i = param3;
            ((qw) this).field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "qw.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static void a(byte param0, int param1) {
        if (param1 != msa.field_a) {
            return;
        }
        if (null == rba.field_a) {
            return;
        }
        v.b(15, 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Friend's Best Score:<br> <%0> - <%1>";
    }
}
