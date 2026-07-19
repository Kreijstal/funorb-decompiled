/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji {
    static int[] field_a;
    static li field_d;
    static int field_b;
    static volatile int field_c;

    final synchronized static long b(int param0) {
        long var1 = 0L;
        int var3 = 0;
        var1 = System.currentTimeMillis();
        var3 = 127 % ((43 - param0) / 60);
        if ((ck.field_e ^ -1L) < (var1 ^ -1L)) {
          da.field_F = da.field_F + (ck.field_e + -var1);
          ck.field_e = var1;
          return var1 - -da.field_F;
        } else {
          ck.field_e = var1;
          return var1 - -da.field_F;
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != -5046) {
            field_b = 20;
            field_d = null;
            return;
        }
        field_d = null;
    }

    final static void a(byte param0) {
        if (!d.field_k) {
          throw new IllegalStateException();
        } else {
          if (param0 <= 7) {
            return;
          } else {
            pa.field_b = true;
            qd.a(67, true);
            hi.field_k = 0;
            return;
          }
        }
    }

    static {
        field_a = new int[128];
        field_d = new li();
        field_c = 0;
    }
}
