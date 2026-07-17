/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si {
    static int field_a;
    static int field_b;

    private final static double[] a(double[] param0, double[] param1) {
        return new double[]{param0[2] * param1[1] - param0[1] * param1[2], param0[0] * param1[2] - param0[2] * param1[0], param0[1] * param1[0] - param0[0] * param1[1]};
    }

    private final static int[] a(double[] param0, int param1) {
        int var3 = 0;
        int[] var2 = new int[param0.length];
        for (var3 = param0.length - 1; var3 >= 0; var3--) {
            var2[var3] = (int)Math.round(param0[var3] * (double)65536);
        }
        return var2;
    }

    private final static void b(int param0, int param1, int param2, mg param3, int param4, int param5, int param6) {
        if (param2 == 0) {
            return;
        }
        int var7 = (param6 - param5) / param2;
        int var8 = param5;
        if (param1 < 0) {
            param2 = param2 + param1;
            var8 = var8 - param1 * var7;
            param1 = 0;
        }
        if (param1 + param2 > df.field_f) {
            param2 = df.field_f - param1;
        }
        int var9 = df.field_e * param1 + param0;
        while (true) {
            param2--;
            if (param2 < 0) {
                break;
            }
            df.field_d[var9] = param3.field_B[(var8 >> 16) * param3.field_w + param4];
            var9 = var9 + df.field_e;
            var8 = var8 + var7;
        }
    }

    private final static void c(double[] param0, double[] param1) {
        param1[0] = param1[0] - param0[0];
        param1[1] = param1[1] - param0[1];
        param1[2] = param1[2] - param0[2];
        double var2 = param0[3] * param1[0] + param0[4] * param1[1] + param0[5] * param1[2];
        double var4 = param0[6] * param1[0] + param0[7] * param1[1] + param0[8] * param1[2];
        double var6 = param0[9] * param1[0] + param0[10] * param1[1] + param0[11] * param1[2];
        param1[0] = var2;
        param1[1] = var4;
        param1[2] = var6;
    }

    private final static void a(double[] param0, double[] param1, double[] param2, double param3, double param4, double[] param5) {
        param5[0] = param1[0] + param3 * param2[0] + param4 * param0[6];
        param5[1] = param1[1] + param3 * param2[1] + param4 * param0[7];
        param5[2] = param1[2] + param3 * param2[2] + param4 * param0[8];
    }

    final static double[] a(double[] param0, double[] param1, double[] param2) {
        double[] var3 = new double[]{param1[0] - param0[0], param1[1] - param0[1], param1[2] - param0[2]};
        double[] var11 = si.a(var3, param2);
        double[] var12 = si.a(var11, var3);
        si.a(var11);
        si.a(var12);
        si.a(var3);
        return new double[]{param0[0], param0[1], param0[2], var11[0], var11[1], var11[2], var12[0], var12[1], var12[2], var3[0], var3[1], var3[2]};
    }

    private final static void a(int param0, int param1, int param2, mg param3, int param4, int param5, int param6) {
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
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        if (param2 != 0) {
          L0: {
            var7 = (param6 - param5) / param2;
            var8 = param5;
            if (param1 >= 0) {
              break L0;
            } else {
              param2 = param2 + param1;
              var8 = var8 - param1 * var7;
              param1 = 0;
              break L0;
            }
          }
          L1: {
            if (param1 + param2 <= df.field_f) {
              break L1;
            } else {
              param2 = df.field_f - param1;
              break L1;
            }
          }
          var9 = df.field_e * param1 + param0;
          var13 = param4 >> 16;
          var14 = param4 >> 12 & 15;
          var15 = 16 - var14;
          L2: while (true) {
            param2--;
            if (param2 < 0) {
              return;
            } else {
              L3: {
                L4: {
                  var16 = var8 >> 16;
                  var17 = var8 >> 12 & 15;
                  var18 = 16 - var17;
                  var10 = param3.field_B[var16 * param3.field_w + var13];
                  var11 = var10 & 16711935;
                  var12 = var10 & 65280;
                  if (var10 == 0) {
                    break L4;
                  } else {
                    if (var14 == 0) {
                      break L4;
                    } else {
                      if (var13 >= param3.field_w - 1) {
                        break L4;
                      } else {
                        L5: {
                          var11 = var11 * var15;
                          var12 = var12 * var15;
                          var19 = param3.field_B[var16 * param3.field_w + var13 + 1];
                          var20 = (var19 & 16711935) * var14;
                          var21 = (var19 & 65280) * var14;
                          if (var17 == 0) {
                            break L5;
                          } else {
                            if (var16 >= param3.field_p - 1) {
                              break L5;
                            } else {
                              var11 = var11 * var18;
                              var12 = var12 * var18;
                              var20 = var20 * var18;
                              var21 = var21 * var18;
                              var22 = param3.field_B[(var16 + 1) * param3.field_w + var13];
                              var23 = (var22 & 16711935) * var15 * var17;
                              var24 = (var22 & 65280) * var15 * var17;
                              var25 = param3.field_B[(var16 + 1) * param3.field_w + var13 + 1];
                              var26 = (var25 & 16711935) * var14 * var17;
                              var27 = (var25 & 65280) * var14 * var17;
                              var11 = (var11 + var20 + var23 + var26 & -16711936) >>> 8;
                              var12 = (var12 + var21 + var24 + var27 & 16711680) >>> 8;
                              break L3;
                            }
                          }
                        }
                        var11 = (var11 + var20 & 267390960) >>> 4;
                        var12 = (var12 + var21 & 1044480) >>> 4;
                        break L3;
                      }
                    }
                  }
                }
                if (var17 == 0) {
                  break L3;
                } else {
                  if (var16 >= param3.field_p - 1) {
                    break L3;
                  } else {
                    var11 = var11 * var18;
                    var12 = var12 * var18;
                    var19 = param3.field_B[(var16 + 1) * param3.field_w + var13];
                    var20 = (var19 & 16711935) * var17;
                    var21 = (var19 & 65280) * var17;
                    var11 = (var11 + var20 & 267390960) >>> 4;
                    var12 = (var12 + var21 & 1044480) >>> 4;
                    break L3;
                  }
                }
              }
              var10 = var11 | var12;
              var10 = (var10 & 16579836) >> 2;
              var10 = var10 * 3;
              var10 = var10 + ((df.field_d[var9] & 16579836) >> 2);
              df.field_d[var9] = var10;
              var9 = var9 + df.field_e;
              var8 = var8 + var7;
              continue L2;
            }
          }
        } else {
          return;
        }
    }

    final static void a(double[] param0, double[] param1, double[] param2, double param3, double param4, mg param5, int param6, int param7, int param8, int param9, boolean param10) {
        double var17_double = 0.0;
        int var17 = 0;
        int var18 = 0;
        double var19_double = 0.0;
        int var19 = 0;
        int var20 = 0;
        double var21_double = 0.0;
        int var21 = 0;
        int var22 = 0;
        double var23 = 0.0;
        double var25 = 0.0;
        double var27 = 0.0;
        double var29 = 0.0;
        double var31 = 0.0;
        double var33 = 0.0;
        double var35 = 0.0;
        double var37 = 0.0;
        double var39 = 0.0;
        int var41 = 0;
        double var41_double = 0.0;
        double var43 = 0.0;
        double var45 = 0.0;
        double var47 = 0.0;
        int var49 = 0;
        double[] var62 = null;
        double[] var63 = null;
        double[] var64 = null;
        double[] var65 = null;
        L0: {
          L1: {
            var62 = new double[3];
            si.a(param0, param1, param2, -param3, -param4, var62);
            var64 = new double[3];
            var63 = new double[3];
            si.a(param0, param1, param2, param3, -param4, var63);
            var65 = new double[3];
            si.c(param0, var62);
            si.c(param0, var63);
            if (var62[2] < 32.0) {
              break L1;
            } else {
              if (var63[2] >= 32.0) {
                si.a(param0, param1, param2, -param3, param4, var64);
                si.a(param0, param1, param2, param3, param4, var65);
                si.a(param0, param1, param2, -param3, -param4, var62);
                si.a(param0, param1, param2, param3, -param4, var63);
                si.b(param0, var62);
                si.b(param0, var63);
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (var62[2] >= 32.0) {
              break L2;
            } else {
              if (var63[2] >= 32.0) {
                break L2;
              } else {
                return;
              }
            }
          }
          L3: {
            var17_double = param1[0] - param0[0];
            var19_double = param1[1] - param0[1];
            var21_double = param1[2] - param0[2];
            var23 = param0[9] * var17_double + param0[10] * var19_double + param0[11] * var21_double;
            var25 = 32.0 - var23;
            var27 = param0[9] * param2[0] + param0[10] * param2[1] + param0[11] * param2[2];
            var25 = var25 / var27;
            var29 = -param3;
            var31 = param3;
            if (var62[2] >= 32.0) {
              var31 = var25;
              param7 = param6 + (int)(0.5 * (1.0 + var25 / param3) * (double)(param7 - param6));
              break L3;
            } else {
              var29 = var25;
              param6 = param6 + (int)(0.5 * (1.0 + var25 / param3) * (double)(param7 - param6));
              break L3;
            }
          }
          si.a(param0, param1, param2, var29, -param4, var62);
          si.a(param0, param1, param2, var29, param4, var64);
          si.a(param0, param1, param2, var31, -param4, var63);
          si.a(param0, param1, param2, var31, param4, var65);
          si.b(param0, var62);
          si.b(param0, var63);
          break L0;
        }
        L4: {
          si.b(param0, var64);
          si.b(param0, var65);
          var17 = (int)var62[0];
          var18 = (int)var63[0];
          var19 = (int)var62[1];
          var20 = (int)var63[1];
          var21 = (int)(var64[1] - var62[1]);
          var22 = (int)(var65[1] - var63[1]);
          var23 = 1.0 / (double)(var18 - var17);
          var25 = (double)(var20 - var19) * var23;
          var27 = (double)(var22 - var21) * var23;
          var29 = (var63[2] - var62[2]) * var23;
          var31 = (double)var19;
          var33 = (double)var21;
          var35 = var62[2];
          var37 = (double)param6 * var35;
          var39 = ((double)param7 * var63[2] - (double)param6 * var62[2]) / (double)(var18 - var17);
          if (var17 <= var18) {
            break L4;
          } else {
            var41 = var17;
            var17 = var18;
            var18 = var41;
            var25 = -var25;
            var27 = -var27;
            var29 = -var29;
            var39 = -var39;
            var31 = (double)var20;
            var33 = (double)var22;
            var35 = var63[2];
            var37 = (double)param7 * var35;
            break L4;
          }
        }
        L5: {
          if (var17 >= 0) {
            break L5;
          } else {
            var31 = var31 - (double)var17 * var25;
            var33 = var33 - (double)var17 * var27;
            var35 = var35 - (double)var17 * var29;
            var37 = var37 - (double)var17 * var39;
            var17 = 0;
            break L5;
          }
        }
        L6: {
          if (var18 <= df.field_e - 1) {
            break L6;
          } else {
            var18 = df.field_e - 1;
            break L6;
          }
        }
        if (!param10) {
          var41 = var17;
          L7: while (true) {
            if (var41 > var18) {
              return;
            } else {
              si.b(var41, (int)var31, (int)var33, param5, (int)(var37 / var35) >> 16, param8, param9);
              var31 = var31 + var25;
              var33 = var33 + var27;
              var35 = var35 + var29;
              var37 = var37 + var39;
              var41++;
              continue L7;
            }
          }
        } else {
          var41_double = var31;
          var43 = var33;
          var45 = var35;
          var47 = var37;
          var49 = var17;
          L8: while (true) {
            if (var49 > var18) {
              var31 = var41_double;
              var33 = var43;
              var35 = var45;
              var37 = var47;
              var49 = var17;
              L9: while (true) {
                if (var49 > var18) {
                  return;
                } else {
                  si.a(var49, (int)var31, (int)var33, param5, (int)(var37 / var35), param8, param9);
                  var31 = var31 + var25;
                  var33 = var33 + var27;
                  var35 = var35 + var29;
                  var37 = var37 + var39;
                  var49++;
                  continue L9;
                }
              }
            } else {
              si.b(var49, (int)var31, (int)var33, param5, (int)(var37 / var35) >> 16, param8, param9);
              var31 = var31 + var25;
              var33 = var33 + var27;
              var35 = var35 + var29;
              var37 = var37 + var39;
              var49++;
              continue L8;
            }
          }
        }
    }

    final static void a(double[] param0, double[] param1, double[] param2, double param3, double param4, int[] param5, int param6, int param7) {
        int var14 = 0;
        double var15_double = 0.0;
        int var15 = 0;
        int var16 = 0;
        double var17_double = 0.0;
        int var17 = 0;
        int var18 = 0;
        double var19_double = 0.0;
        int var19 = 0;
        int var20 = 0;
        double[] var33 = null;
        double[] var34 = null;
        double[] var35 = null;
        double[] var36 = null;
        if (param6 >= 4) {
          L0: {
            L1: {
              var33 = new double[3];
              si.a(param0, param1, param2, -param3, -param4, var33);
              var35 = new double[3];
              var34 = new double[3];
              si.a(param0, param1, param2, param3, -param4, var34);
              var36 = new double[3];
              si.c(param0, var33);
              si.c(param0, var34);
              var14 = 0;
              if (var33[2] < 0.5) {
                break L1;
              } else {
                if (var34[2] >= 0.5) {
                  si.a(param0, param1, param2, -param3, param4, var35);
                  si.a(param0, param1, param2, param3, param4, var36);
                  si.a(param0, param1, param2, -param3, -param4, var33);
                  si.a(param0, param1, param2, param3, -param4, var34);
                  si.b(param0, var33);
                  si.b(param0, var34);
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (var33[2] >= 0.5) {
                break L2;
              } else {
                if (var34[2] >= 0.5) {
                  break L2;
                } else {
                  return;
                }
              }
            }
            L3: {
              var15_double = 0.5 - param0[9] * (param1[0] - param0[0]) + param0[10] * (param1[1] - param0[1]) + param0[11] * (param1[2] - param0[2]);
              var15_double = var15_double / (param0[9] * param2[0] + param0[10] * param2[1] + param0[11] * param2[2]);
              var17_double = -param3;
              var19_double = param3;
              if (var33[2] >= 0.5) {
                var19_double = var15_double;
                var14 = 2;
                break L3;
              } else {
                var17_double = var15_double;
                var14 = 1;
                break L3;
              }
            }
            si.a(param0, param1, param2, var17_double, -param4, var33);
            si.a(param0, param1, param2, var17_double, param4, var35);
            si.a(param0, param1, param2, var19_double, -param4, var34);
            si.a(param0, param1, param2, var19_double, param4, var36);
            si.b(param0, var33);
            si.b(param0, var34);
            break L0;
          }
          L4: {
            si.b(param0, var35);
            si.b(param0, var36);
            var15 = (int)var33[0];
            var16 = (int)var34[0];
            var17 = (int)var33[1];
            var18 = (int)var34[1];
            var19 = (int)(var35[1] - var33[1]);
            var20 = (int)(var36[1] - var34[1]);
            rk.a(var15, var17, var16, var18, (int)((double)(param6 << 7) * var33[2]), param7, param5);
            if (var14 == 1) {
              break L4;
            } else {
              rk.a(var15, var17, var15, var17 + var19, (int)((double)(param6 << 7) * var33[2]), param7, param5);
              break L4;
            }
          }
          rk.a(var15, var17 + var19, var16, var18 + var20, (int)((double)(param6 << 7) * var33[2]), param7, param5);
          if (var14 == 2) {
            return;
          } else {
            rk.a(var16, var18, var16, var18 + var20, (int)((double)(param6 << 7) * var34[2]), param7, param5);
            return;
          }
        } else {
          return;
        }
    }

    final static int a(int param0) {
        float var1 = 0.0f;
        float var2 = 0.0f;
        float var3 = 0.0f;
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float var8 = 0.0f;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        float stackIn_7_0 = 0.0f;
        float stackIn_14_0 = 0.0f;
        float stackIn_32_0 = 0.0f;
        float stackOut_6_0 = 0.0f;
        float stackOut_5_0 = 0.0f;
        float stackOut_3_0 = 0.0f;
        float stackOut_2_0 = 0.0f;
        float stackOut_13_0 = 0.0f;
        float stackOut_12_0 = 0.0f;
        float stackOut_10_0 = 0.0f;
        float stackOut_9_0 = 0.0f;
        float stackOut_31_0 = 0.0f;
        float stackOut_30_0 = 0.0f;
        float stackOut_28_0 = 0.0f;
        L0: {
          var1 = (float)128 / 255.0f;
          var2 = (float)191 / 255.0f;
          var3 = (float)255 / 255.0f;
          if (var1 <= var2) {
            if (var2 <= var3) {
              stackOut_6_0 = var3;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_5_0 = var2;
              stackIn_7_0 = stackOut_5_0;
              break L0;
            }
          } else {
            if (var1 <= var3) {
              stackOut_3_0 = var3;
              stackIn_7_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = var1;
              stackIn_7_0 = stackOut_2_0;
              break L0;
            }
          }
        }
        L1: {
          var4 = stackIn_7_0;
          if (var1 >= var2) {
            if (var2 >= var3) {
              stackOut_13_0 = var3;
              stackIn_14_0 = stackOut_13_0;
              break L1;
            } else {
              stackOut_12_0 = var2;
              stackIn_14_0 = stackOut_12_0;
              break L1;
            }
          } else {
            if (var1 >= var3) {
              stackOut_10_0 = var3;
              stackIn_14_0 = stackOut_10_0;
              break L1;
            } else {
              stackOut_9_0 = var1;
              stackIn_14_0 = stackOut_9_0;
              break L1;
            }
          }
        }
        L2: {
          var5 = stackIn_14_0;
          if (var4 != var5) {
            if (var4 != var1) {
              if (var4 != var2) {
                var6 = (var1 - var2) / (var4 - var5) + 4.0f;
                break L2;
              } else {
                var6 = (var3 - var1) / (var4 - var5) + 2.0f;
                break L2;
              }
            } else {
              var6 = (var2 - var3) / (var4 - var5);
              break L2;
            }
          } else {
            var6 = 0.0f;
            break L2;
          }
        }
        var6 = var6 / 6.0f;
        L3: while (true) {
          if (var6 >= 0.0f) {
            L4: while (true) {
              if (var6 <= 1.0f) {
                L5: {
                  L6: {
                    var8 = (var4 + var5) / 2.0f;
                    if (var8 == 0.0f) {
                      break L6;
                    } else {
                      if (var4 != var5) {
                        if (var8 >= 0.5f) {
                          stackOut_31_0 = (var4 - var5) / (2.0f - 2.0f * var8);
                          stackIn_32_0 = stackOut_31_0;
                          break L5;
                        } else {
                          stackOut_30_0 = (var4 - var5) / (2.0f * var8);
                          stackIn_32_0 = stackOut_30_0;
                          break L5;
                        }
                      } else {
                        break L6;
                      }
                    }
                  }
                  stackOut_28_0 = 0.0f;
                  stackIn_32_0 = stackOut_28_0;
                  break L5;
                }
                var7 = stackIn_32_0;
                var9 = (int)(var6 * 63.0f + 0.5f);
                var10 = (int)(var7 * 7.0f + 0.5f);
                var11 = (int)(var8 * 127.0f + 0.5f);
                return var9 << 10 | var10 << 7 | var11;
              } else {
                var6 = var6 - 1.0f;
                continue L4;
              }
            }
          } else {
            var6 = var6 + 1.0f;
            continue L3;
          }
        }
    }

    private final static void b(double[] param0, double[] param1) {
        param1[0] = param1[0] - param0[0];
        param1[1] = param1[1] - param0[1];
        param1[2] = param1[2] - param0[2];
        double var2 = param0[3] * param1[0] + param0[4] * param1[1] + param0[5] * param1[2];
        double var4 = param0[6] * param1[0] + param0[7] * param1[1] + param0[8] * param1[2];
        double var6 = param0[9] * param1[0] + param0[10] * param1[1] + param0[11] * param1[2];
        param1[0] = (double)field_a + 512.0 * var2 / var6;
        param1[1] = (double)field_b + 512.0 * var4 / var6;
        param1[2] = 1.0 / var6;
    }

    final static void a(int[] param0, int[] param1, int[] param2, int[] param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var4 = 0;
        L0: while (true) {
          if (var4 >= 3) {
            return;
          } else {
            param1[var4] = param1[var4] - (param0[0] << 4);
            param2[var4] = param2[var4] - (param0[1] << 4);
            param3[var4] = param3[var4] - (param0[2] << 4);
            var5 = param0[3] * param1[var4] + param0[4] * param2[var4] + param0[5] * param3[var4];
            var6 = param0[6] * param1[var4] + param0[7] * param2[var4] + param0[8] * param3[var4];
            var7 = param0[9] * param1[var4] + param0[10] * param2[var4] + param0[11] * param3[var4];
            param1[var4] = var5 >> 20;
            param2[var4] = var6 >> 20;
            param3[var4] = var7 >> 20;
            var4++;
            continue L0;
          }
        }
    }

    private final static void a(double[] param0) {
        double var1 = param0[0];
        double var3 = param0[1];
        double var5 = param0[2];
        double var7 = var1 * var1 + var3 * var3 + var5 * var5;
        if (Math.abs(var7 - 1.0) < 1e-16) {
            return;
        }
        var7 = Math.sqrt(var7);
        param0[0] = var1 / var7;
        param0[1] = var3 / var7;
        param0[2] = var5 / var7;
    }

    final static int[] b(double[] param0) {
        int[] var1 = si.a(param0, 16);
        var1[0] = (int)param0[0];
        var1[1] = (int)param0[1];
        var1[2] = (int)param0[2];
        return var1;
    }
}
