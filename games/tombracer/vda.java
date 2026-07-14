/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vda extends ci {
    private int field_r;
    static boolean field_q;
    private int field_p;
    private int field_o;
    static String field_n;
    static iu[] field_m;

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
        L0: {
          var15 = TombRacer.field_G ? 1 : 0;
          if (param1 == -1) {
            break L0;
          } else {
            ((vda) this).field_r = 10;
            break L0;
          }
        }
        L1: {
          var33 = ((vda) this).field_h.a(param0, (byte) 123);
          var28 = var33;
          var23 = var28;
          var18 = var23;
          var16 = var18;
          var3 = var16;
          if (((vda) this).field_h.field_f) {
            var32 = ((vda) this).a(param0, 0, -1);
            var34 = var32[0];
            var36 = var32[1];
            var35 = var32[2];
            var8 = var33[0];
            var9 = var33[1];
            var10 = var33[2];
            var11 = 0;
            L2: while (true) {
              if (var11 >= ns.field_g) {
                break L1;
              } else {
                L3: {
                  var12 = var34[var11];
                  var13 = var35[var11];
                  var14 = var36[var11];
                  if (var12 != var13) {
                    break L3;
                  } else {
                    if (var13 == var14) {
                      var8[var11] = ((vda) this).field_r * var12 >> 1754141132;
                      var9[var11] = ((vda) this).field_p * var13 >> -1035565524;
                      var10[var11] = var14 * ((vda) this).field_o >> -1317739860;
                      var11++;
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var8[var11] = ((vda) this).field_r;
                var9[var11] = ((vda) this).field_p;
                var10[var11] = ((vda) this).field_o;
                var11++;
                continue L2;
              }
            }
          } else {
            break L1;
          }
        }
        return var3;
    }

    final void a(byte param0, uia param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = TombRacer.field_G ? 1 : 0;
          if (param0 == 107) {
            break L0;
          } else {
            field_m = null;
            break L0;
          }
        }
        L1: {
          var4 = param2;
          if (var4 != 0) {
            if (-2 != (var4 ^ -1)) {
              if (2 == var4) {
                ((vda) this).field_o = param1.d(127);
                break L1;
              } else {
                break L1;
              }
            } else {
              ((vda) this).field_p = param1.d(123);
              break L1;
            }
          } else {
            ((vda) this).field_r = param1.d(125);
            break L1;
          }
        }
    }

    public vda() {
        super(1, false);
        ((vda) this).field_p = 4096;
        ((vda) this).field_r = 4096;
        ((vda) this).field_o = 4096;
    }

    public static void d(byte param0) {
        if (param0 != 90) {
            return;
        }
        field_m = null;
        field_n = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Press <img=12><img=13><img=14><img=15> to continue...";
    }
}
