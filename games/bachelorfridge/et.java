/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class et extends k {
    static java.awt.Image field_m;
    private int field_o;
    static int field_l;
    private int field_k;
    static kv field_p;
    private int field_n;

    final void d(byte param0) {
        gea.a(4231);
        if (param0 != -68) {
            int[] discarded$0 = ((et) this).a(-5, -83);
        }
    }

    public static void d(int param0) {
        field_p = null;
        if (param0 >= -40) {
            et.d(-100);
        }
        field_m = null;
    }

    final int[] a(int param0, int param1) {
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
          var11 = BachelorFridge.field_y;
          if (param1 == 0) {
            break L0;
          } else {
            ((et) this).field_o = -26;
            break L0;
          }
        }
        L1: {
          var16 = ((et) this).field_j.a(param0, -1);
          var15 = var16;
          var14 = var15;
          var13 = var14;
          var12 = var13;
          var3 = var12;
          if (((et) this).field_j.field_m) {
            var4 = tj.field_f[param0];
            var5 = -2048 + var4 >> 1914696353;
            var6 = 0;
            L2: while (true) {
              if (var6 >= hh.field_d) {
                break L1;
              } else {
                L3: {
                  var8 = jq.field_k[var6];
                  var9 = -2048 + var8 >> 1437591073;
                  if (((et) this).field_k != 0) {
                    var10 = var9 * var9 - -(var5 * var5) >> 831162476;
                    var7 = (int)(Math.sqrt((double)((float)var10 / 4096.0f)) * 4096.0);
                    var7 = (int)(3.141592653589793 * (double)(((et) this).field_n * var7));
                    break L3;
                  } else {
                    var7 = ((et) this).field_n * (var8 + -var4);
                    break L3;
                  }
                }
                L4: {
                  var7 = var7 - (var7 & -4096);
                  if (((et) this).field_o == -1) {
                    var7 = 4096 + baa.field_z[var7 >> 1807660068 & 255] >> -1266543263;
                    break L4;
                  } else {
                    if (((et) this).field_o == 2) {
                      L5: {
                        // wide iinc 7 -2048
                        if (-1 <= var7) {
                          break L5;
                        } else {
                          var7 = -var7;
                          break L5;
                        }
                      }
                      var7 = 2048 - var7 << -1188395071;
                      break L4;
                    } else {
                      var16[var6] = var7;
                      var6++;
                      continue L2;
                    }
                  }
                }
                var16[var6] = var7;
                var6++;
                continue L2;
              }
            }
          } else {
            break L1;
          }
        }
        return var12;
    }

    final void a(byte param0, lu param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        if (param0 == -71) {
          L0: {
            var4 = param2;
            if (var4 == 0) {
              ((et) this).field_k = param1.b(16711935);
              break L0;
            } else {
              if (var4 != 1) {
                if (-4 != (var4 ^ -1)) {
                  break L0;
                } else {
                  ((et) this).field_n = param1.b(16711935);
                  break L0;
                }
              } else {
                ((et) this).field_o = param1.b(16711935);
                break L0;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    public et() {
        super(0, true);
        ((et) this).field_o = 0;
        ((et) this).field_k = 0;
        ((et) this).field_n = 1;
    }

    static {
    }
}
