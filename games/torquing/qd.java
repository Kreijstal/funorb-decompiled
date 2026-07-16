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
        field_a = null;
        field_i = null;
        if (param0 != 15) {
            return;
        }
        field_b = null;
        field_f = null;
    }

    final static void b(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (ef.field_b != null) {
            var1 = (Object) (Object) ef.field_b;
            synchronized (var1) {
              L1: {
                ef.field_b = null;
                break L1;
              }
            }
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          if (param0 == 1) {
            break L2;
          } else {
            qd.b(60);
            break L2;
          }
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = Torquing.field_u;
          var3 = 0;
          var4 = a.field_d;
          if (param0 == 16452) {
            break L0;
          } else {
            field_g = 47;
            break L0;
          }
        }
        L1: while (true) {
          if (var3 >= wh.field_z.length) {
            return -1;
          } else {
            var5 = mn.field_Z[var3];
            if (-1 >= (var5 ^ -1)) {
              var6 = mh.a(true, -90, wh.field_z[var3]);
              var4 = var4 + hn.field_z;
              var7 = -(var6 >> -1377499807) + vk.field_A;
              if (l.a((ln.field_D << -1610520607) + kp.field_d, param2, param0 + 6821, param1, (aq.field_b << -919387679) + var6, var7 - aq.field_b, var4)) {
                return var5;
              } else {
                var4 = var4 + (kp.field_d + (ln.field_D << -2056109855) + hn.field_z);
                var3++;
                continue L1;
              }
            } else {
              var4 = var4 + bp.field_e;
              var3++;
              continue L1;
            }
          }
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new double[3];
        field_i = "Close";
        field_f = new k(15, 0, 1, 0);
    }
}
