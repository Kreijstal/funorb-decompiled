/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg extends le {
    private int field_l;
    private int field_k;
    static int field_j;
    private int field_i;

    final void c(byte param0) {
        taa.e((byte) -91);
        if (param0 >= -35) {
            ((gg) this).field_k = 85;
        }
    }

    final void a(int param0, int param1, ds param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = VoidHunters.field_G;
          var4 = param0;
          if (0 == var4) {
            ((gg) this).field_k = param2.e((byte) -105);
            break L0;
          } else {
            if (var4 != 1) {
              if (-4 != (var4 ^ -1)) {
                break L0;
              } else {
                ((gg) this).field_l = param2.e((byte) -107);
                break L0;
              }
            } else {
              ((gg) this).field_i = param2.e((byte) -104);
              break L0;
            }
          }
        }
        L1: {
          if (param1 < -60) {
            break L1;
          } else {
            ((gg) this).c((byte) 61);
            break L1;
          }
        }
    }

    final int[] a(int param0, boolean param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        L0: {
          var11 = VoidHunters.field_G;
          var16 = ((gg) this).field_f.a((byte) -80, param0);
          var15 = var16;
          var14 = var15;
          var13 = var14;
          var12 = var13;
          var3 = var12;
          if (((gg) this).field_f.field_e) {
            var4 = sj.field_p[param0];
            var5 = var4 - 2048 >> 1464326017;
            var6 = 0;
            L1: while (true) {
              if (var6 >= hob.field_d) {
                break L0;
              } else {
                L2: {
                  var8 = grb.field_l[var6];
                  var9 = var8 + -2048 >> -1734398271;
                  if (((gg) this).field_k == 0) {
                    var7 = ((gg) this).field_l * (var8 - var4);
                    break L2;
                  } else {
                    var10 = var5 * var5 + var9 * var9 >> 1482176652;
                    var7 = (int)(Math.sqrt((double)((float)var10 / 4096.0f)) * 4096.0);
                    var7 = (int)(3.141592653589793 * (double)(var7 * ((gg) this).field_l));
                    break L2;
                  }
                }
                L3: {
                  var7 = var7 - (-4096 & var7);
                  if (((gg) this).field_i == 0) {
                    var7 = 4096 + qta.field_o[255 & var7 >> 885122980] >> 785270529;
                    break L3;
                  } else {
                    if (2 == ((gg) this).field_i) {
                      L4: {
                        // wide iinc 7 -2048
                        if ((var7 ^ -1) <= -1) {
                          break L4;
                        } else {
                          var7 = -var7;
                          break L4;
                        }
                      }
                      var7 = -var7 + 2048 << -1650733919;
                      break L3;
                    } else {
                      var16[var6] = var7;
                      var6++;
                      continue L1;
                    }
                  }
                }
                var16[var6] = var7;
                var6++;
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        L5: {
          if (param1) {
            break L5;
          } else {
            ((gg) this).field_k = -110;
            break L5;
          }
        }
        return var3;
    }

    public gg() {
        super(0, true);
        ((gg) this).field_k = 0;
        ((gg) this).field_l = 1;
        ((gg) this).field_i = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 56;
    }
}
