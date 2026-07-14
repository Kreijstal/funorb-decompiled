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
        int stackOut_9_0;
        int stackOut_4_0;
        int stackOut_3_0;
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
        int var4 = 0;
        int var5 = 0;
        jp var6 = null;
        jp var7 = null;
        jp var8 = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (param2 == -17912) {
          var7 = new jp(param1 * 2 + param0.field_D, 2 * param1 + param0.field_C);
          var7.g();
          lb.g(0, 0, var7.field_D, var7.field_C, 16777215);
          var4 = 0;
          L0: while (true) {
            if (param1 <= var4) {
              var7.h();
              param0.d(-param0.field_E + param1, param1 + -param0.field_F, 0);
              kc.field_q.a((byte) 109);
              var7.field_F = param0.field_F - param1;
              var7.field_E = -param1 + param0.field_E;
              return var7;
            } else {
              param0.d(-param0.field_E + param1, -param0.field_F + param1, 0);
              lb.e(1, 1, 0, 0, var7.field_D, var7.field_C);
              var4++;
              continue L0;
            }
          }
        } else {
          boolean discarded$1 = pg.c(-48);
          var8 = new jp(param1 * 2 + param0.field_D, 2 * param1 + param0.field_C);
          var6 = var8;
          var8.g();
          lb.g(0, 0, var8.field_D, var8.field_C, 16777215);
          var4 = 0;
          L1: while (true) {
            if (param1 <= var4) {
              var8.h();
              param0.d(-param0.field_E + param1, param1 + -param0.field_F, 0);
              kc.field_q.a((byte) 109);
              var8.field_F = param0.field_F - param1;
              var8.field_E = -param1 + param0.field_E;
              return var8;
            } else {
              param0.d(-param0.field_E + param1, -param0.field_F + param1, 0);
              lb.e(1, 1, 0, 0, var8.field_D, var8.field_C);
              var4++;
              continue L1;
            }
          }
        }
    }

    public static void a(int param0) {
        field_k = null;
        field_o = null;
        field_i = null;
        field_p = null;
        field_q = null;
        field_n = null;
        if (param0 > -123) {
            field_p = null;
        }
    }

    final static void d(int param0) {
        if (param0 != 0) {
            return;
        }
        nh.a(642, 482, -40, -1, cd.field_h, -1);
    }

    pg(long param0, int param1, byte[] param2) {
        ((pg) this).field_r = param1;
        ((pg) this).field_l = param2;
        ((pg) this).field_j = param0;
    }

    final static void a(boolean param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        var2 = pq.field_k;
        var3 = po.field_a;
        if (param0) {
          var9 = null;
          pg.a(false, (String) null);
          var4 = ad.field_l.field_O.a(param1, 500);
          var5 = ad.field_l.field_O.b(param1, 500) + 6;
          var6 = 2 + np.field_a * var4;
          var7 = fp.a(-1, var5, var2, 12);
          var8 = br.a(var6, var3, 20, -30);
          lb.e(var7, var8, var5, var6, 0);
          lb.g(var7 + 1, 1 + var8, -2 + var5, var6 - 2, 16777088);
          int discarded$2 = ad.field_l.field_O.a(param1, 3 + var7, -ad.field_l.field_O.field_F + (1 + var8) - -ok.field_f, 500, 1000, 0, -1, 0, 0, np.field_a);
          return;
        } else {
          var4 = ad.field_l.field_O.a(param1, 500);
          var5 = ad.field_l.field_O.b(param1, 500) + 6;
          var6 = 2 + np.field_a * var4;
          var7 = fp.a(-1, var5, var2, 12);
          var8 = br.a(var6, var3, 20, -30);
          lb.e(var7, var8, var5, var6, 0);
          lb.g(var7 + 1, 1 + var8, -2 + var5, var6 - 2, 16777088);
          int discarded$3 = ad.field_l.field_O.a(param1, 3 + var7, -ad.field_l.field_O.field_F + (1 + var8) - -ok.field_f, 500, 1000, 0, -1, 0, 0, np.field_a);
          return;
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
