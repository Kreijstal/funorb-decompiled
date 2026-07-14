/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg extends ji {
    private byte[] field_B;
    static uj field_G;
    private int field_C;
    private short[] field_z;
    private short[] field_K;
    private int field_A;
    private int field_F;
    private int field_E;
    private int field_H;
    private boolean field_D;
    static String field_I;
    static int field_y;

    final int[] c(int param0, int param1) {
        if (param1 < 91) {
            ((kg) this).field_C = -94;
        }
        int[] var4 = ((kg) this).field_x.a(param0, (byte) -74);
        int[] var3 = var4;
        if (((kg) this).field_x.field_i) {
            this.a(var4, param0, -107);
        }
        return var4;
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = Vertigo2.field_L ? 1 : 0;
        ((kg) this).field_B = kk.a(((kg) this).field_C, (byte) 38);
        this.g(5865);
        if (param0 > -98) {
            return;
        }
        for (var2 = ((kg) this).field_E + -1; 1 <= var2; var2--) {
            var3 = ((kg) this).field_K[var2];
            // if_icmplt L84
            if ((var3 ^ -1) > 7) {
                break;
            }
            ((kg) this).field_E = ((kg) this).field_E - 1;
        }
    }

    final static void c(byte param0) {
        int var1 = ld.field_b * ld.field_b;
        int var2 = -(da.field_i * da.field_i) + var1;
        int var3 = var2 * (-tc.field_b + ce.field_b) / var1 + tc.field_b;
        td.field_c.a(82, 640, 120, var3, ml.field_w);
        int var4 = 65 % ((param0 - -14) / 47);
        rg.a(640, r.field_j, 0, ce.field_b - 24, -4803, ia.field_G, 5);
    }

    private final void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
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
        L0: {
          var20 = Vertigo2.field_L ? 1 : 0;
          var5 = ((kg) this).field_A * lf.field_y[param1];
          var19 = -123 / ((param2 - -45) / 52);
          if (-2 != (((kg) this).field_E ^ -1)) {
            L1: {
              L2: {
                var9 = ((kg) this).field_K[0];
                if ((var9 ^ -1) < -9) {
                  break L2;
                } else {
                  if (var9 >= -8) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                var8 = ((kg) this).field_z[0] << -1897567764;
                var13 = var8 * ((kg) this).field_A >> 1005759308;
                var11 = var8 * var5 >> -2066267828;
                var12 = ((kg) this).field_F * var8 >> -183405300;
                var15 = var11 >> 800018188;
                var16 = var15 + 1;
                var11 = var11 & 4095;
                if (var13 <= var16) {
                  var16 = 0;
                  break L3;
                } else {
                  break L3;
                }
              }
              var18 = ((kg) this).field_B[255 & var16] & 255;
              var14 = ue.field_G[var11];
              var17 = ((kg) this).field_B[255 & var15] & 255;
              var10 = 0;
              L4: while (true) {
                if (we.field_M <= var10) {
                  break L1;
                } else {
                  var4 = ((kg) this).field_F * rh.field_O[var10];
                  var6 = this.a(var8 * var4 >> -140734324, 255, var18, var12, var14, var11, var17);
                  param0[var10] = var6 * var9 >> 1290680620;
                  var10++;
                  continue L4;
                }
              }
            }
            var7 = 1;
            L5: while (true) {
              if (var7 >= ((kg) this).field_E) {
                break L0;
              } else {
                L6: {
                  var9 = ((kg) this).field_K[var7];
                  if (8 < var9) {
                    break L6;
                  } else {
                    if (-8 > var9) {
                      break L6;
                    } else {
                      var7++;
                      continue L5;
                    }
                  }
                }
                L7: {
                  var8 = ((kg) this).field_z[var7] << -691051572;
                  var13 = var8 * ((kg) this).field_A >> -991570036;
                  var11 = var5 * var8 >> -1225958644;
                  var12 = ((kg) this).field_F * var8 >> 1267698316;
                  var15 = var11 >> 603092876;
                  var16 = var15 - -1;
                  var11 = var11 & 4095;
                  if (var13 > var16) {
                    break L7;
                  } else {
                    var16 = 0;
                    break L7;
                  }
                }
                L8: {
                  var17 = ((kg) this).field_B[255 & var15] & 255;
                  var14 = ue.field_G[var11];
                  var18 = ((kg) this).field_B[255 & var16] & 255;
                  if (!((kg) this).field_D) {
                    break L8;
                  } else {
                    if (var7 != -1 + ((kg) this).field_E) {
                      break L8;
                    } else {
                      var10 = 0;
                      L9: while (true) {
                        if (we.field_M > var10) {
                          var4 = rh.field_O[var10] * ((kg) this).field_F;
                          var6 = this.a(var8 * var4 >> 2146311276, 255, var18, var12, var14, var11, var17);
                          var6 = param0[var10] + (var6 * var9 >> 2045288908);
                          param0[var10] = (var6 >> 1400964385) + 2048;
                          var10++;
                          continue L9;
                        } else {
                          var7++;
                          continue L5;
                        }
                      }
                    }
                  }
                }
                var10 = 0;
                L10: while (true) {
                  if (we.field_M > var10) {
                    var4 = ((kg) this).field_F * rh.field_O[var10];
                    var6 = this.a(var8 * var4 >> -2004408500, 255, var18, var12, var14, var11, var17);
                    param0[var10] = param0[var10] + (var9 * var6 >> -5616564);
                    var10++;
                    continue L10;
                  } else {
                    var7++;
                    continue L5;
                  }
                }
              }
            }
          } else {
            L11: {
              var9 = ((kg) this).field_K[0];
              var8 = ((kg) this).field_z[0] << 1146148716;
              var11 = var5 * var8 >> 78513260;
              var13 = var8 * ((kg) this).field_A >> -1878899988;
              var12 = ((kg) this).field_F * var8 >> 912009100;
              var15 = var11 >> -483530036;
              var16 = var15 - -1;
              if (var13 > var16) {
                break L11;
              } else {
                var16 = 0;
                break L11;
              }
            }
            var11 = var11 & 4095;
            var14 = ue.field_G[var11];
            var17 = ((kg) this).field_B[255 & var15] & 255;
            var18 = 255 & ((kg) this).field_B[255 & var16];
            if (((kg) this).field_D) {
              var10 = 0;
              L12: while (true) {
                if (we.field_M <= var10) {
                  break L0;
                } else {
                  var4 = ((kg) this).field_F * rh.field_O[var10];
                  var6 = this.a(var8 * var4 >> 205551500, 255, var18, var12, var14, var11, var17);
                  var6 = var6 * var9 >> 740601708;
                  param0[var10] = (var6 >> -706297375) + 2048;
                  var10++;
                  continue L12;
                }
              }
            } else {
              var10 = 0;
              L13: while (true) {
                if (var10 >= we.field_M) {
                  break L0;
                } else {
                  var4 = rh.field_O[var10] * ((kg) this).field_F;
                  var6 = this.a(var4 * var8 >> -664942036, 255, var18, var12, var14, var11, var17);
                  param0[var10] = var9 * var6 >> 253779148;
                  var10++;
                  continue L13;
                }
              }
            }
          }
        }
    }

    public static void b(byte param0) {
        if (param0 >= -75) {
            field_I = null;
        }
        field_G = null;
        field_I = null;
    }

    private final int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
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
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_37_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        L0: {
          var18 = Vertigo2.field_L ? 1 : 0;
          var13 = param0 >> 2000135916;
          var12 = 1 + var13;
          param0 = param0 & 4095;
          var13 = var13 & param1;
          if (param3 > var12) {
            break L0;
          } else {
            var12 = 0;
            break L0;
          }
        }
        L1: {
          var11 = param0 + -4096;
          var12 = var12 & 255;
          var10 = -4096 + param5;
          var15 = ue.field_G[param0];
          var14 = ((kg) this).field_B[var13 - -param6] & 3;
          if (var14 <= 1) {
            L2: {
              if (-1 == var14) {
                stackOut_9_0 = param5 + param0;
                stackIn_10_0 = stackOut_9_0;
                break L2;
              } else {
                stackOut_8_0 = param5 - param0;
                stackIn_10_0 = stackOut_8_0;
                break L2;
              }
            }
            var8 = stackIn_10_0;
            break L1;
          } else {
            L3: {
              if (var14 == -3) {
                stackOut_5_0 = param0 + -param5;
                stackIn_6_0 = stackOut_5_0;
                break L3;
              } else {
                stackOut_4_0 = -param0 + -param5;
                stackIn_6_0 = stackOut_4_0;
                break L3;
              }
            }
            var8 = stackIn_6_0;
            break L1;
          }
        }
        L4: {
          var14 = ((kg) this).field_B[var12 - -param6] & 3;
          if ((var14 ^ -1) >= -2) {
            L5: {
              if (var14 != 0) {
                stackOut_18_0 = param5 + -var11;
                stackIn_19_0 = stackOut_18_0;
                break L5;
              } else {
                stackOut_17_0 = var11 - -param5;
                stackIn_19_0 = stackOut_17_0;
                break L5;
              }
            }
            var9 = stackIn_19_0;
            break L4;
          } else {
            L6: {
              if ((var14 ^ -1) == -3) {
                stackOut_14_0 = -param5 + var11;
                stackIn_15_0 = stackOut_14_0;
                break L6;
              } else {
                stackOut_13_0 = -var11 - param5;
                stackIn_15_0 = stackOut_13_0;
                break L6;
              }
            }
            var9 = stackIn_15_0;
            break L4;
          }
        }
        L7: {
          var14 = 3 & ((kg) this).field_B[param2 + var13];
          var16 = ((var9 + -var8) * var15 >> 1661033740) + var8;
          if (-2 <= (var14 ^ -1)) {
            L8: {
              if (var14 != 0) {
                stackOut_27_0 = var10 + -param0;
                stackIn_28_0 = stackOut_27_0;
                break L8;
              } else {
                stackOut_26_0 = var10 + param0;
                stackIn_28_0 = stackOut_26_0;
                break L8;
              }
            }
            var8 = stackIn_28_0;
            break L7;
          } else {
            L9: {
              if ((var14 ^ -1) != -3) {
                stackOut_23_0 = -var10 + -param0;
                stackIn_24_0 = stackOut_23_0;
                break L9;
              } else {
                stackOut_22_0 = -var10 + param0;
                stackIn_24_0 = stackOut_22_0;
                break L9;
              }
            }
            var8 = stackIn_24_0;
            break L7;
          }
        }
        L10: {
          var14 = 3 & ((kg) this).field_B[param2 + var12];
          if (1 >= var14) {
            L11: {
              if (var14 == 0) {
                stackOut_36_0 = var10 + var11;
                stackIn_37_0 = stackOut_36_0;
                break L11;
              } else {
                stackOut_35_0 = var10 + -var11;
                stackIn_37_0 = stackOut_35_0;
                break L11;
              }
            }
            var9 = stackIn_37_0;
            break L10;
          } else {
            L12: {
              if (2 != var14) {
                stackOut_32_0 = -var10 + -var11;
                stackIn_33_0 = stackOut_32_0;
                break L12;
              } else {
                stackOut_31_0 = var11 + -var10;
                stackIn_33_0 = stackOut_31_0;
                break L12;
              }
            }
            var9 = stackIn_33_0;
            break L10;
          }
        }
        var17 = (var15 * (var9 - var8) >> -1548424756) + var8;
        return ((var17 - var16) * param4 >> 132508044) + var16;
    }

    final void a(byte param0, int param1, ed param2) {
        int var4 = 0;
        int var5 = 0;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackOut_14_0 = null;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        L0: {
          var5 = Vertigo2.field_L ? 1 : 0;
          if (param0 == 110) {
            break L0;
          } else {
            this.g(-114);
            break L0;
          }
        }
        L1: {
          var4 = param1;
          if (var4 != -1) {
            if (1 == var4) {
              ((kg) this).field_E = param2.h(-11);
              break L1;
            } else {
              if (-3 != var4) {
                if (-4 != (var4 ^ -1)) {
                  if (var4 == 4) {
                    ((kg) this).field_C = param2.h(-11);
                    break L1;
                  } else {
                    if (var4 != 5) {
                      if (var4 != 6) {
                        break L1;
                      } else {
                        ((kg) this).field_A = param2.h(param0 + -121);
                        break L1;
                      }
                    } else {
                      ((kg) this).field_F = param2.h(-11);
                      break L1;
                    }
                  }
                } else {
                  ((kg) this).field_A = param2.h(param0 ^ -101);
                  ((kg) this).field_F = param2.h(param0 ^ -101);
                  break L1;
                }
              } else {
                ((kg) this).field_H = param2.n(param0 + -108);
                if (((kg) this).field_H < 0) {
                  ((kg) this).field_K = new short[((kg) this).field_E];
                  var4 = 0;
                  L2: while (true) {
                    if (((kg) this).field_E <= var4) {
                      break L1;
                    } else {
                      ((kg) this).field_K[var4] = (short)param2.n(2);
                      var4++;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
          } else {
            L3: {
              stackOut_14_0 = this;
              stackIn_16_0 = stackOut_14_0;
              stackIn_15_0 = stackOut_14_0;
              if (-2 != (param2.h(-11) ^ -1)) {
                stackOut_16_0 = this;
                stackOut_16_1 = 0;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                break L3;
              } else {
                stackOut_15_0 = this;
                stackOut_15_1 = 1;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                break L3;
              }
            }
            ((kg) this).field_D = stackIn_17_1 != 0;
            break L1;
          }
        }
    }

    private final void g(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = Vertigo2.field_L ? 1 : 0;
          if (param0 == 5865) {
            break L0;
          } else {
            field_I = null;
            break L0;
          }
        }
        L1: {
          if (-1 <= (((kg) this).field_H ^ -1)) {
            if (null == ((kg) this).field_K) {
              break L1;
            } else {
              if (((kg) this).field_E == ((kg) this).field_K.length) {
                ((kg) this).field_z = new short[((kg) this).field_E];
                var2 = 0;
                L2: while (true) {
                  if (var2 >= ((kg) this).field_E) {
                    break L1;
                  } else {
                    ((kg) this).field_z[var2] = (short)(int)Math.pow(2.0, (double)var2);
                    var2++;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
          } else {
            ((kg) this).field_K = new short[((kg) this).field_E];
            ((kg) this).field_z = new short[((kg) this).field_E];
            var2 = 0;
            L3: while (true) {
              if (((kg) this).field_E <= var2) {
                break L1;
              } else {
                ((kg) this).field_K[var2] = (short)(int)(Math.pow((double)((float)((kg) this).field_H / 4096.0f), (double)var2) * 4096.0);
                ((kg) this).field_z[var2] = (short)(int)Math.pow(2.0, (double)var2);
                var2++;
                continue L3;
              }
            }
          }
        }
    }

    final static boolean h(int param0) {
        int var1 = -55 % ((51 - param0) / 47);
        return nm.field_J;
    }

    public kg() {
        super(0, true);
        ((kg) this).field_B = new byte[512];
        ((kg) this).field_F = 4;
        ((kg) this).field_A = 4;
        ((kg) this).field_E = 4;
        ((kg) this).field_H = 1638;
        ((kg) this).field_C = 0;
        ((kg) this).field_D = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = new uj(1);
        field_I = "Asking to join <%0>'s game...";
    }
}
