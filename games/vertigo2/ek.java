/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek extends ji {
    static int field_E;
    static String field_C;
    static va field_F;
    private int field_A;
    private int field_z;
    private int field_D;
    static int[] field_y;

    public ek() {
        super(1, false);
        ((ek) this).field_A = 4096;
        ((ek) this).field_z = 4096;
        ((ek) this).field_D = 4096;
    }

    final void a(byte param0, int param1, ed param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = Vertigo2.field_L ? 1 : 0;
        var4 = param1;
        if (-1 != var4) {
          if (-2 != var4) {
            if (2 != var4) {
              if (param0 != 110) {
                ((ek) this).field_A = -105;
                return;
              } else {
                return;
              }
            } else {
              ((ek) this).field_A = param2.a((byte) -11);
              if (param0 != 110) {
                ((ek) this).field_A = -105;
                return;
              } else {
                return;
              }
            }
          } else {
            ((ek) this).field_z = param2.a((byte) -11);
            if (param0 == 110) {
              return;
            } else {
              ((ek) this).field_A = -105;
              return;
            }
          }
        } else {
          ((ek) this).field_D = param2.a((byte) -11);
          if (param0 == 110) {
            return;
          } else {
            ((ek) this).field_A = -105;
            return;
          }
        }
    }

    public static void g(int param0) {
        field_y = null;
        field_F = null;
        field_C = null;
        if (param0 > -50) {
            ek.g(43);
        }
    }

    final int[][] b(int param0, int param1) {
        int[][] var3 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[][] var16 = null;
        int[][] var18 = null;
        int[][] var23 = null;
        int[][] var28 = null;
        int[][] var32 = null;
        int[][] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        var15 = Vertigo2.field_L ? 1 : 0;
        if (param0 == -3780) {
          var33 = ((ek) this).field_v.a(param1, -2);
          var28 = var33;
          var23 = var28;
          var18 = var23;
          var16 = var18;
          var3 = var16;
          if (!((ek) this).field_v.field_c) {
            return var3;
          } else {
            var32 = ((ek) this).c(0, 3, param1);
            var34 = var32[0];
            var36 = var32[1];
            var35 = var32[2];
            var8 = var33[0];
            var9 = var33[1];
            var10 = var33[2];
            var11 = 0;
            L0: while (true) {
              if (we.field_M <= var11) {
                return var3;
              } else {
                L1: {
                  var12 = var34[var11];
                  var13 = var35[var11];
                  var14 = var36[var11];
                  if (var13 != var12) {
                    break L1;
                  } else {
                    if (var13 != var14) {
                      break L1;
                    } else {
                      var8[var11] = ((ek) this).field_D * var12 >> 958971180;
                      var9[var11] = ((ek) this).field_z * var13 >> -922777748;
                      var10[var11] = var14 * ((ek) this).field_A >> -666316340;
                      var11++;
                      var11++;
                      var11++;
                      continue L0;
                    }
                  }
                }
                var8[var11] = ((ek) this).field_D;
                var9[var11] = ((ek) this).field_z;
                var10[var11] = ((ek) this).field_A;
                var11++;
                var11++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = -1;
        field_C = "Time Attack";
        field_y = new int[8192];
    }
}
