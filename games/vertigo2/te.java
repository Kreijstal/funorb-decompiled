/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te extends ji {
    static nj field_z;
    private int field_A;
    static int[][] field_D;
    static int[] field_F;
    private int field_G;
    private int field_K;
    static String field_y;
    static String[] field_H;
    static String field_I;
    static int[] field_B;

    public te() {
        this(0);
    }

    private final void d(int param0, int param1) {
        if (param0 != -17016) {
          field_y = null;
          ((te) this).field_K = 4080 & param1 >> 300287300;
          ((te) this).field_G = (16711680 & param1) >> -688124244;
          ((te) this).field_A = (255 & param1) << -1977088540;
          return;
        } else {
          ((te) this).field_K = 4080 & param1 >> 300287300;
          ((te) this).field_G = (16711680 & param1) >> -688124244;
          ((te) this).field_A = (255 & param1) << -1977088540;
          return;
        }
    }

    private te(int param0) {
        super(0, false);
        this.d(-17016, param0);
    }

    final void a(byte param0, int param1, ed param2) {
        int var4 = 0;
        if (param0 != 110) {
          L0: {
            field_z = null;
            var4 = param1;
            if (0 != var4) {
              break L0;
            } else {
              this.d(-17016, param2.m(0));
              break L0;
            }
          }
          return;
        } else {
          L1: {
            var4 = param1;
            if (0 != var4) {
              break L1;
            } else {
              this.d(-17016, param2.m(0));
              break L1;
            }
          }
          return;
        }
    }

    final int[][] b(int param0, int param1) {
        int[][] var3 = null;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int[][] var9 = null;
        int[][] var10 = null;
        int[][] var11 = null;
        var8 = Vertigo2.field_L ? 1 : 0;
        var11 = ((te) this).field_v.a(param1, param0 + 3778);
        var10 = var11;
        var9 = var10;
        var3 = var9;
        if (param0 == -3780) {
          if (!((te) this).field_v.field_c) {
            return var9;
          } else {
            var4 = var11[0];
            var5 = var11[1];
            var6 = var11[2];
            var7 = 0;
            L0: while (true) {
              if (we.field_M <= var7) {
                return var9;
              } else {
                var4[var7] = ((te) this).field_G;
                var5[var7] = ((te) this).field_K;
                var6[var7] = ((te) this).field_A;
                var7++;
                continue L0;
              }
            }
          }
        } else {
          field_I = null;
          if (((te) this).field_v.field_c) {
            var4 = var11[0];
            var5 = var11[1];
            var6 = var11[2];
            var7 = 0;
            L1: while (true) {
              if (we.field_M > var7) {
                var4[var7] = ((te) this).field_G;
                var5[var7] = ((te) this).field_K;
                var6[var7] = ((te) this).field_A;
                var7++;
                continue L1;
              } else {
                return var9;
              }
            }
          } else {
            return var9;
          }
        }
    }

    public static void g(int param0) {
        field_F = null;
        field_B = null;
        field_z = null;
        if (param0 != -30443) {
          field_z = null;
          field_I = null;
          field_D = null;
          field_y = null;
          field_H = null;
          return;
        } else {
          field_I = null;
          field_D = null;
          field_y = null;
          field_H = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = new int[8192];
        field_y = "Accept <%0> into this game";
        field_H = new String[]{"Low", "Medium", "High"};
        field_z = new nj();
        field_I = "Accept draw";
        field_B = new int[]{250, 300, 500, 250, 400, 500, 1050, 900, 1500, 1500, 600, 1250, 800, 2000, 3500, 3500, 2700, 4500, 2250, 2500, 2750, 2400, 2000, 4250, 3400, 3000, 1600, 3750, 8000, 2500, 2500, 4600, 4250, 2250, 3750, 4350, 4500, 3000, 3000, 3500, 3250, 4500, 2750, 3500, 2000, 3000, 3750, 6500, 2750, 4000};
    }
}
