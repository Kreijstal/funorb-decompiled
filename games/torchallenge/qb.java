/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qb {
    static int[][] field_a;
    static int field_d;
    static String field_f;
    static String field_e;
    static String[] field_c;
    static int field_i;
    static int field_b;
    static volatile int field_g;
    static int field_h;

    final static void a(byte param0, ka[] param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = TorChallenge.field_F ? 1 : 0;
        var2 = 0;
        if (param0 <= 0) {
          field_i = 2;
          L0: while (true) {
            if (param1.length > var2) {
              param1[var2].h();
              var2++;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          L1: while (true) {
            if (param1.length > var2) {
              param1[var2].h();
              var2++;
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var7 = param3 % 32 - 32 * param0 / 256;
          var8 = -(param3 / 32) + param4;
          var9 = -var7 + 32 * var8;
          var10 = 328;
          if (var9 <= -1) {
            var11 = 1;
            break L0;
          } else {
            var11 = -1;
            break L0;
          }
        }
        L1: {
          var9 = var9 * var11;
          if (-1025 >= var9) {
            break L1;
          } else {
            if (var9 < 2048) {
              var11 = -var11;
              break L1;
            } else {
              break L1;
            }
          }
        }
        if (2048 <= var9) {
          L2: {
            // wide iinc 9 -2048
            if (var9 <= 1024) {
              break L2;
            } else {
              var11 = -var11;
              break L2;
            }
          }
          var12 = 320 + (fj.a(1870096848, wi.field_a[var9], var10 << -2140919664) >> -920221616) * var11;
          var13 = param5 * 64 / 256 + (param1 * 64 + -param2);
          dl.field_n[1] = var12;
          dl.field_n[0] = var12;
          if (param6 != -2140919664) {
            field_d = -116;
            dl.field_n[2] = var13;
            return;
          } else {
            dl.field_n[2] = var13;
            return;
          }
        } else {
          L3: {
            var12 = 320 + (fj.a(1870096848, wi.field_a[var9], var10 << -2140919664) >> -920221616) * var11;
            var13 = param5 * 64 / 256 + (param1 * 64 + -param2);
            dl.field_n[1] = var12;
            dl.field_n[0] = var12;
            if (param6 == -2140919664) {
              break L3;
            } else {
              field_d = -116;
              break L3;
            }
          }
          dl.field_n[2] = var13;
          return;
        }
    }

    final static boolean a(char param0, boolean param1) {
        if (param1) {
          if (param0 >= 48) {
            if (param0 > 57) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          qb.a(-29);
          if (param0 >= 48) {
            if (param0 > 57) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_c = null;
        if (param0 != 2316) {
          boolean discarded$2 = qb.a('', false);
          field_a = null;
          field_f = null;
          return;
        } else {
          field_a = null;
          field_f = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "That name is not available";
        field_d = 0;
        field_a = new int[][]{new int[2], new int[2], new int[2]};
        field_i = -1;
        field_g = -1;
        field_h = -1;
        field_b = 200;
        field_e = "Retry";
    }
}
