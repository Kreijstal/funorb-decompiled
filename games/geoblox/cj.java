/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class cj {
    static int[] field_b;
    static String field_a;

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    public static void b(int param0) {
        field_a = null;
        if (param0 > -59) {
            return;
        }
        field_b = null;
    }

    final int a(byte param0, long param1) {
        long var4 = 0L;
        L0: {
          var4 = this.a((byte) -49);
          if (0L < var4) {
            bc.a(0, var4);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != -6) {
          return -30;
        } else {
          return this.a(true, param1);
        }
    }

    abstract void a(int param0);

    abstract long a(byte param0);

    abstract int a(boolean param0, long param1);

    static {
    }
}
