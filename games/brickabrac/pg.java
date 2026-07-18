/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg extends nm {
    static jp field_p;
    static String field_i;
    static String field_q;
    static String field_n;
    int field_r;
    static int field_m;
    static String field_o;
    byte[] field_l;
    long field_j;
    static km[] field_k;

    final static boolean c(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 > 57) {
          if (!og.h(-26090)) {
            if (0 >= go.field_c) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          field_o = null;
          if (og.h(-26090)) {
            return true;
          } else {
            L0: {
              if (0 < go.field_c) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final static jp a(jp param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        jp var6 = null;
        jp stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        jp stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == -17912) {
                break L1;
              } else {
                boolean discarded$1 = pg.c(-48);
                break L1;
              }
            }
            var6 = new jp(40 + param0.field_D, 40 + param0.field_C);
            var6.g();
            lb.g(0, 0, var6.field_D, var6.field_C, 16777215);
            var4 = 0;
            L2: while (true) {
              if (var4 >= 20) {
                var6.h();
                param0.d(-param0.field_E + 20, 20 + -param0.field_F, 0);
                kc.field_q.a((byte) 109);
                var6.field_F = param0.field_F - 20;
                var6.field_E = -20 + param0.field_E;
                stackOut_6_0 = (jp) var6;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                param0.d(-param0.field_E + 20, -param0.field_F + 20, 0);
                lb.e(1, 1, 0, 0, var6.field_D, var6.field_C);
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("pg.D(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + 20 + ',' + param2 + ')');
        }
        return stackIn_7_0;
    }

    public static void a(int param0) {
        field_k = null;
        field_o = null;
        field_i = null;
        field_p = null;
        field_q = null;
        field_n = null;
    }

    final static void d(int param0) {
        nh.a(642, 482, -40, -1, cd.field_h, -1);
    }

    pg(long param0, int param1, byte[] param2) {
        try {
            ((pg) this).field_r = param1;
            ((pg) this).field_l = param2;
            ((pg) this).field_j = param0;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "pg.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, String param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            var2_int = pq.field_k;
            var3 = po.field_a;
            var4 = ad.field_l.field_O.a(param1, 500);
            var5 = ad.field_l.field_O.b(param1, 500) + 6;
            var6 = 2 + np.field_a * var4;
            var7 = fp.a(-1, var5, var2_int, 12);
            var8 = br.a(var6, var3, 20, -30);
            lb.e(var7, var8, var5, var6, 0);
            lb.g(var7 + 1, 1 + var8, -2 + var5, var6 - 2, 16777088);
            int discarded$0 = ad.field_l.field_O.a(param1, 3 + var7, -ad.field_l.field_O.field_F + (1 + var8) - -ok.field_f, 500, 1000, 0, -1, 0, 0, np.field_a);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "pg.A(" + false + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Rated game";
        field_q = "Player Two";
        field_i = "Buying or selling an account";
        field_o = "Confirm Email:";
    }
}
