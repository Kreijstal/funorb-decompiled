/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb extends nk {
    pb field_x;
    int field_B;
    byte[] field_A;
    static k field_z;
    static int field_y;

    public static void c(int param0) {
        field_z = null;
        if (param0 != 0) {
            lb.c(-97);
        }
    }

    final byte[] c(byte param0) {
        if (!this.field_r) {
          if (param0 < 102) {
            this.field_x = (pb) null;
            return this.field_A;
          } else {
            return this.field_A;
          }
        } else {
          throw new RuntimeException();
        }
    }

    final static void a(int param0, t[] param1, t[] param2, int param3) {
        t[] var5 = null;
        try {
            wp.field_v = param2;
            ao.field_a = param1;
            wp.field_v[4] = null;
            var5 = ao.field_a;
            t[] var4 = var5;
            var5[param3] = null;
            bo.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "lb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final int b(int param0) {
        if (param0 <= 91) {
            t[] var3 = (t[]) null;
            lb.a(100, (t[]) null, (t[]) null, -50);
            if (!(!this.field_r)) {
                return 0;
            }
            return 100;
        }
        if (!(!this.field_r)) {
            return 0;
        }
        return 100;
    }

    lb() {
    }

    static {
        field_z = new k(9, 0, 4, 1);
    }
}
