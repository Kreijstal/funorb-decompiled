/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class smb extends le {
    private int[] field_l;
    private int field_i;
    private int field_k;
    private int field_j;

    final void a(int param0, int param1, ds param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = VoidHunters.field_G;
          if (param1 <= -60) {
            break L0;
          } else {
            ((smb) this).field_k = -104;
            break L0;
          }
        }
        L1: {
          var4 = param0;
          if (0 == var4) {
            ((smb) this).field_k = param2.e(1869);
            break L1;
          } else {
            if (var4 == 1) {
              ((smb) this).field_i = param2.e(1869);
              break L1;
            } else {
              if (2 != var4) {
                break L1;
              } else {
                ((smb) this).field_j = param2.e(1869);
                break L1;
              }
            }
          }
        }
    }

    final void c(byte param0) {
        this.d(-32307);
        if (param0 >= -35) {
            Object var3 = null;
            smb.a((int[]) null, 127, -20, (byte) 126, (int[]) null);
        }
    }

    private final void d(int param0) {
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var2 = Math.cos((double)((float)((smb) this).field_j / 4096.0f));
          ((smb) this).field_l[0] = (int)(4096.0 * (Math.sin((double)((float)((smb) this).field_i / 4096.0f)) * var2));
          ((smb) this).field_l[1] = (int)(var2 * Math.cos((double)((float)((smb) this).field_i / 4096.0f)) * 4096.0);
          ((smb) this).field_l[2] = (int)(Math.sin((double)((float)((smb) this).field_j / 4096.0f)) * 4096.0);
          var4 = ((smb) this).field_l[0] * ((smb) this).field_l[0] >> -397584052;
          var5 = ((smb) this).field_l[1] * ((smb) this).field_l[1] >> -1050948436;
          if (param0 == -32307) {
            break L0;
          } else {
            ((smb) this).field_k = 57;
            break L0;
          }
        }
        L1: {
          var6 = ((smb) this).field_l[2] * ((smb) this).field_l[2] >> -809277972;
          var7 = (int)(Math.sqrt((double)(var4 - -var5 - -var6 >> 985094092)) * 4096.0);
          if (var7 == 0) {
            break L1;
          } else {
            ((smb) this).field_l[0] = (((smb) this).field_l[0] << -55565684) / var7;
            ((smb) this).field_l[2] = (((smb) this).field_l[2] << -674709076) / var7;
            ((smb) this).field_l[1] = (((smb) this).field_l[1] << -328780276) / var7;
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
        int[] var9 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int[] var18 = null;
        int[] var25 = null;
        int[] var26 = null;
        var17 = VoidHunters.field_G;
        if (param1) {
          L0: {
            var18 = ((smb) this).field_f.a((byte) 127, param0);
            var3 = var18;
            if (!((smb) this).field_f.field_e) {
              break L0;
            } else {
              var7 = ((smb) this).field_k * tpa.field_b >> -494587508;
              var25 = ((smb) this).a(0, -1 + param0 & wf.field_d, 255);
              var9 = ((smb) this).a(0, param0, 255);
              var26 = ((smb) this).a(0, 1 + param0 & wf.field_d, 255);
              var11 = 0;
              L1: while (true) {
                if (var11 >= hob.field_d) {
                  break L0;
                } else {
                  L2: {
                    var12 = var7 * (-var25[var11] + var26[var11]) >> 1811174220;
                    var13 = (var9[-1 + var11 & gbb.field_q] - var9[var11 + 1 & gbb.field_q]) * var7 >> 2043761548;
                    var14 = var13 >> -211420572;
                    var15 = var12 >> 381119300;
                    if (-1 >= (var14 ^ -1)) {
                      break L2;
                    } else {
                      var14 = -var14;
                      break L2;
                    }
                  }
                  L3: {
                    if (0 > var15) {
                      var15 = -var15;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (255 >= var14) {
                      break L4;
                    } else {
                      var14 = 255;
                      break L4;
                    }
                  }
                  L5: {
                    if (-256 <= (var15 ^ -1)) {
                      break L5;
                    } else {
                      var15 = 255;
                      break L5;
                    }
                  }
                  var16 = rob.field_o[(var15 * (var15 - -1) >> -315103327) + var14] & 255;
                  var5 = var16 * var12 >> -402082520;
                  var6 = var16 * 4096 >> -40133848;
                  var4 = var16 * var13 >> -257801400;
                  var6 = var6 * ((smb) this).field_l[2] >> -715242836;
                  var4 = var4 * ((smb) this).field_l[0] >> 409347596;
                  var5 = ((smb) this).field_l[1] * var5 >> 1339196620;
                  var18[var11] = var6 + (var5 + var4);
                  var11++;
                  continue L1;
                }
              }
            }
          }
          return var18;
        } else {
          return null;
        }
    }

    final static void a(int[] param0, int param1, int param2, byte param3, int[] param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        L0: {
          var13 = VoidHunters.field_G;
          if (param1 >= param2) {
            break L0;
          } else {
            L1: {
              var5 = (param2 + param1) / 2;
              var6 = param1;
              var7 = param4[var5];
              param4[var5] = param4[param2];
              param4[param2] = var7;
              var8 = param0[var5];
              param0[var5] = param0[param2];
              param0[param2] = var8;
              if (var7 != 2147483647) {
                stackOut_3_0 = 1;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 0;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            var9 = stackIn_4_0;
            var10 = param1;
            L2: while (true) {
              if (var10 >= param2) {
                param4[param2] = param4[var6];
                param4[var6] = var7;
                param0[param2] = param0[var6];
                param0[var6] = var8;
                smb.a(param0, param1, -1 + var6, (byte) -54, param4);
                smb.a(param0, var6 - -1, param2, (byte) -119, param4);
                break L0;
              } else {
                if ((var9 & var10) + var7 > param4[var10]) {
                  var11 = param4[var10];
                  param4[var10] = param4[var6];
                  param4[var6] = var11;
                  var12 = param0[var10];
                  param0[var10] = param0[var6];
                  var6++;
                  param0[var6] = var12;
                  var10++;
                  continue L2;
                } else {
                  var10++;
                  continue L2;
                }
              }
            }
          }
        }
        if (param3 > -37) {
          return;
        } else {
          return;
        }
    }

    public smb() {
        super(1, true);
        ((smb) this).field_l = new int[3];
        ((smb) this).field_i = 3216;
        ((smb) this).field_k = 4096;
        ((smb) this).field_j = 3216;
    }

    final static boolean a(byte param0, int param1) {
        if (param0 != -26) {
            Object var3 = null;
            smb.a((int[]) null, -116, 50, (byte) -85, (int[]) null);
        }
        return true;
    }

    static {
    }
}
