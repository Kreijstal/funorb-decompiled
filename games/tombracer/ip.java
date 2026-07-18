/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ip {
    private static String[] field_a;
    static boolean field_b;

    final int a(byte param0, long param1) {
        long var4 = 0L;
        var4 = ((ip) this).a((byte) 47);
        if (var4 <= 0L) {
          if (param0 <= 3) {
            return 67;
          } else {
            return ((ip) this).a(param1, 0);
          }
        } else {
          vja.a(0, var4);
          if (param0 <= 3) {
            return 67;
          } else {
            return ((ip) this).a(param1, 0);
          }
        }
    }

    abstract void a(int param0);

    final static void a(upa param0, int param1) {
        kh var3 = null;
        try {
            var3 = ql.field_k;
            var3.k(param1, -2988);
            var3.i(param0.field_n, 0);
            var3.i(param0.field_k, 0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ip.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + 2147 + ')');
        }
    }

    abstract int a(long param0, int param1);

    abstract long a(byte param0);

    public static void b() {
        field_a = null;
        int var1 = 63;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[1];
        field_a[0] = "Trap Spawner";
    }
}
