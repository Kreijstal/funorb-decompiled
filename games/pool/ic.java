/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ic {
    static he field_c;
    static int field_a;
    static String field_b;

    final static void a(byte param0, int param1) {
        hj.field_g = 400 * param1 / 150;
        hj.field_f = (param1 << -1550258064) / 150;
        hj.field_l = param1 * 100 / 150;
        int var2 = 59 / ((-23 - param0) / 46);
    }

    public static void a(int param0) {
        if (param0 != -512) {
            return;
        }
        field_b = null;
        field_c = null;
    }

    final static byte a(int[] param0, int param1, int[] param2, int[] param3, int[] param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var6 = param2[1 + param1] + -param2[param1];
          var7 = -param0[param1] + param0[param1 + 1];
          var8 = -param4[param1] + param4[1 + param1];
          if (param3 == null) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = -param3[param1] + param3[1 + param1];
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var9 = stackIn_3_0;
          var10 = 0;
          var17 = 0;
          var11 = -fb.field_q + qh.field_j;
          var13 = -512;
          var18 = 256;
          var15 = var11;
          var16 = -(512 * var6) + var11 * var8;
          if (var16 == 0) {
            break L1;
          } else {
            var19 = (512 * param2[param1] + -(var11 * param4[param1]) << -367253624) / var16;
            if (var19 <= var17) {
              break L1;
            } else {
              if (var18 > var19) {
                var20 = ((param4[param1] << 1498939240) - -(var8 * var19)) / 512;
                if (var20 > 0) {
                  if (0 >= var6 * var13 + var8 * var15) {
                    var18 = var19;
                    var10 = (byte)(var10 | 16);
                    break L1;
                  } else {
                    var17 = var19;
                    var10 = (byte)(var10 | 1);
                    break L1;
                  }
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
          }
        }
        L2: {
          var13 = 512;
          var11 = qh.field_b - fb.field_q;
          var15 = -var11;
          var16 = var11 * var8 + -(var6 * 512);
          var14 = -512;
          if (var16 != 0) {
            var19 = (512 * param2[param1] - param4[param1] * var11 << -879032824) / var16;
            if (var19 <= var17) {
              break L2;
            } else {
              if (var18 <= var19) {
                break L2;
              } else {
                var20 = ((param4[param1] << 2047727400) - -(var8 * var19)) / 512;
                if (var20 > 0) {
                  if ((var15 * var8 + var13 * var6 ^ -1) >= -1) {
                    var18 = var19;
                    var10 = (byte)(var10 | 32);
                    break L2;
                  } else {
                    var10 = (byte)(var10 | 2);
                    var17 = var19;
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
            }
          } else {
            break L2;
          }
        }
        L3: {
          if (param5 == 4) {
            break L3;
          } else {
            field_a = -4;
            break L3;
          }
        }
        L4: {
          var12 = -fb.field_d + qh.field_g;
          var15 = var12;
          var16 = var12 * var8 - var7 * 512;
          if (0 == var16) {
            break L4;
          } else {
            var19 = (-(var12 * param4[param1]) + 512 * param0[param1] << -555616952) / var16;
            if (var17 >= var19) {
              break L4;
            } else {
              if (var19 >= var18) {
                break L4;
              } else {
                var20 = (var8 * var19 + (param4[param1] << -1672796728)) / 512;
                if (0 < var20) {
                  if (-1 > (var8 * var15 + var14 * var7 ^ -1)) {
                    var17 = var19;
                    var10 = (byte)(var10 | 4);
                    break L4;
                  } else {
                    var18 = var19;
                    var10 = (byte)(var10 | 64);
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
            }
          }
        }
        L5: {
          var14 = 512;
          var12 = qh.field_c + -fb.field_d;
          var15 = -var12;
          var16 = -(512 * var7) + var12 * var8;
          if (var16 != 0) {
            var19 = (512 * param0[param1] - var12 * param4[param1] << 515976232) / var16;
            if (var17 >= var19) {
              break L5;
            } else {
              if (var19 >= var18) {
                break L5;
              } else {
                var20 = ((param4[param1] << 1655812936) - -(var19 * var8)) / 512;
                if (var20 <= 0) {
                  break L5;
                } else {
                  if ((var15 * var8 + var14 * var7 ^ -1) < -1) {
                    var17 = var19;
                    var10 = (byte)(var10 | 8);
                    break L5;
                  } else {
                    var18 = var19;
                    var10 = (byte)(var10 | 128);
                    break L5;
                  }
                }
              }
            }
          } else {
            break L5;
          }
        }
        L6: {
          if (var17 != 0) {
            param2[param1] = param2[param1] + (var6 * var17 >> 1640748040);
            param0[param1] = param0[param1] + (var7 * var17 >> 1320985512);
            param4[param1] = param4[param1] + (var17 * var8 >> -1706531608);
            if (param3 == null) {
              break L6;
            } else {
              param3[param1] = param3[param1] + (var17 * var9 >> -985015320);
              break L6;
            }
          } else {
            break L6;
          }
        }
        L7: {
          if (256 != var18) {
            param2[param1 + 1] = param2[param1 + 1] - (var6 * (256 + -var18) >> -1115115416);
            param0[param1 - -1] = param0[param1 - -1] - (var7 * (-var18 + 256) >> 493515944);
            param4[1 + param1] = param4[1 + param1] - ((-var18 + 256) * var8 >> 334247144);
            if (param3 != null) {
              param3[1 + param1] = param3[1 + param1] - (var9 * (-var18 + 256) >> 2091789480);
              break L7;
            } else {
              break L7;
            }
          } else {
            break L7;
          }
        }
        return (byte) var10;
    }

    final static dd a(int param0, boolean param1, int param2, String param3, int param4) {
        int var5 = mc.field_e.b(param3, param2);
        int var6 = var5 * mc.field_e.field_G - -mc.field_e.field_w;
        if (!param1) {
            ic.a(-50);
        }
        dd var7 = new dd(param2 + 4, 4 + var6);
        var7.field_B = -2;
        var7.field_G = -2;
        int[] var19 = new int[4];
        int[] var20 = qh.field_d;
        int var10 = qh.field_l;
        int var11 = qh.field_f;
        qh.a(var19);
        var7.e();
        int discarded$0 = mc.field_e.a(param3, 2, 2, param2, var6, param4, -1, param0, 0, mc.field_e.field_G * 3 / 4);
        var7.e(4144959);
        var7.e(65793);
        qh.a(var20, var10, var11);
        qh.b(var19);
        var7.b();
        var7.field_y = var7.field_A;
        var7.field_w = var7.field_z;
        var7.field_B = 0;
        dd var12 = var7;
        var12.field_G = 0;
        return var7;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new he();
        field_b = "Who can join";
    }
}
