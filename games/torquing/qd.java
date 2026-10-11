/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd {
    static int field_g;
    static int field_d;
    static k field_f;
    static sm[] field_c;
    static double[] field_h;
    static int[][] field_a;
    static long field_e;
    static String field_i;
    static pi field_b;

    public static void c(int param0) {
        field_c = null;
        field_h = null;
        field_a = (int[][]) null;
        field_i = null;
        if (param0 != 15) {
          return;
        }
        field_b = null;
        field_f = null;
    }

    final static void b(int param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        if (ef.field_b != null) {
          var1 = ef.field_b;
          synchronized (var1) {
            ef.field_b = null;
          }
        }
        if (param0 != 1) {
          qd.b(60);
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Torquing.field_u;
        try {
          var3_int = 0;
          var4 = a.field_d;
          if (param0 != 16452) {
            field_g = 47;
          }
          while (var3_int < wh.field_z.length) {
            var5 = mn.field_Z[var3_int];
            if (var5 >= 0) {
              var6 = mh.a(true, -90, wh.field_z[var3_int]);
              var4 = var4 + hn.field_z;
              var7 = -(var6 >> 1) + vk.field_A;
              if (l.a((ln.field_D << 1) + kp.field_d, param2, param0 + 6821, param1, (aq.field_b << 1) + var6, var7 - aq.field_b, var4)) {
                stackIn_9_0 = var5;
                return stackIn_9_0;
              }
              var4 = var4 + (kp.field_d + (ln.field_D << 1) + hn.field_z);
            } else {
              var4 = var4 + bp.field_e;
            }
            var3_int++;
          }
          stackIn_13_0 = -1;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var3), "qd.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static Boolean a(int param0) {
        Boolean var1 = jl.field_T;
        jl.field_T = null;
        if (param0 >= -12) {
          field_g = 126;
        }
        return var1;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_h = new double[3];
        field_i = "Close";
        field_f = new k(15, 0, 1, 0);
    }
}
