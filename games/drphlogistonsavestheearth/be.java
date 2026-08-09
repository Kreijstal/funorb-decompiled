/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be {
    private static int[] field_a;
    private static int[] field_c;
    private static int[] field_b;

    final static void b(nh param0, int param1, int param2) {
        int var9 = 0;
        param1 = param1 + param0.field_D;
        param2 = param2 + param0.field_v;
        int var3 = param1 + param2 * wj.field_k;
        int var4 = 0;
        int var5 = param0.field_w;
        int var6 = param0.field_y;
        int var7 = wj.field_k - var6;
        int var8 = 0;
        if (param2 < wj.field_e) {
            var9 = wj.field_e - param2;
            var5 = var5 - var9;
            param2 = wj.field_e;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * wj.field_k;
        }
        if (param2 + var5 > wj.field_j) {
            var5 = var5 - (param2 + var5 - wj.field_j);
        }
        if (param1 < wj.field_g) {
            var9 = wj.field_g - param1;
            var6 = var6 - var9;
            param1 = wj.field_g;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (param1 + var6 > wj.field_b) {
            var9 = param1 + var6 - wj.field_b;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (var6 > 0) {
            if (var5 <= 0) {
                return;
            }
            be.a(wj.field_l, param0.field_B, 0, var4, var3, var6, var5, var7, var8);
            return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, double param4, int param5, double param6) {
        int var23 = 0;
        double var24 = 0.0;
        double var26 = 0.0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        double var9 = (double)(param2 - param0);
        double var11 = (double)(param3 - param1);
        double var13 = dl.a(true, var9, var11);
        double var15 = Math.atan2(var11, var9);
        double var17 = param4 / 3.0;
        double var19 = -param4 / 2.0;
        double var21 = param4 / 2.0;
        for (var23 = 0; var23 < 8; var23++) {
            var24 = var13 - (double)var23;
            if (var24 < 0.0) {
                var24 = 0.0;
            }
            for (var26 = var19; var26 < var21; var26 = var26 + var17) {
                var28 = param0 + (int)(var24 * pj.a(var15 + var26, 32768));
                var29 = param1 + (int)(var24 * ji.a(65535, var15 + var26));
                var30 = param0 + (int)(var24 * pj.a(var15 + var26 + var17, 32768));
                var31 = param1 + (int)(var24 * ji.a(65535, var15 + var26 + var17));
                wj.b(var28, var29, var30, var31, param5, 64 - 8 * var23);
            }
        }
    }

    final static void a(nh param0, int param1, int param2) {
        int var9 = 0;
        param1 = param1 + param0.field_D;
        param2 = param2 + param0.field_v;
        int var3 = param1 + param2 * wj.field_k;
        int var4 = 0;
        int var5 = param0.field_w;
        int var6 = param0.field_y;
        int var7 = wj.field_k - var6;
        int var8 = 0;
        if (param2 < wj.field_e) {
            var9 = wj.field_e - param2;
            var5 = var5 - var9;
            param2 = wj.field_e;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * wj.field_k;
        }
        if (param2 + var5 > wj.field_j) {
            var5 = var5 - (param2 + var5 - wj.field_j);
        }
        if (param1 < wj.field_g) {
            var9 = wj.field_g - param1;
            var6 = var6 - var9;
            param1 = wj.field_g;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (param1 + var6 > wj.field_b) {
            var9 = param1 + var6 - wj.field_b;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (var6 > 0) {
            if (var5 <= 0) {
                return;
            }
            be.b(wj.field_l, param0.field_B, 0, var4, var3, var6, var5, var7, var8);
            return;
        }
    }

    private final static he a(he param0, int param1, int param2, int param3, int param4) {
        return be.a(param0, param0.field_h << 3, param0.field_c << 3, param1 << 4, param2 << 4, param3, param4);
    }

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        for (var3 = wj.field_l.length - 1; var3 >= 0; var3--) {
            var4 = wj.field_l[var3] & 16711680;
            var5 = wj.field_l[var3] & 65280;
            var6 = wj.field_l[var3] & 255;
            var4 = (var4 >> 16) + param0;
            var5 = (var5 >> 8) + param1;
            var6 = var6 + param2;
            var4 = var4 > 255 ? 255 : var4;
            var4 = var4 < 1 ? 0 : var4;
            var5 = var5 > 255 ? 255 : var5;
            var5 = var5 < 1 ? 0 : var5;
            var6 = var6 > 255 ? 255 : var6;
            var6 = var6 < 1 ? 0 : var6;
            wj.field_l[var3] = var4 << 16 | var5 << 8 | var6;
        }
    }

    final static he[] a(he param0, int param1) {
        int var3 = 0;
        he[] var2 = new he[param1];
        for (var3 = 0; var3 < param1; var3++) {
            var2[var3] = param0;
        }
        return var2;
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int incrementValue$44 = 0;
        int incrementValue$45 = 0;
        int incrementValue$46 = 0;
        int incrementValue$47 = 0;
        int incrementValue$48 = 0;
        int incrementValue$49 = 0;
        int incrementValue$50 = 0;
        int incrementValue$51 = 0;
        int incrementValue$52 = 0;
        int incrementValue$53 = 0;
        int var9;
        int var10;
        int var11;
        var9 = -(param5 >> 2);
        param5 = -(param5 & 3);
        var10 = -param6;
        L0: while (true) {
          if (var10 >= 0) {
            return;
          } else {
            var11 = var9;
            L1: while (true) {
              if (var11 >= 0) {
                var11 = param5;
                L2: while (true) {
                  if (var11 >= 0) {
                    param4 = param4 + param7;
                    param3 = param3 + param8;
                    var10++;
                    continue L0;
                  } else {
                    incrementValue$44 = param3;
                    param3++;
                    param2 = param1[incrementValue$44];
                    if (param2 == 0) {
                      param4++;
                      var11++;
                      continue L2;
                    } else {
                      incrementValue$45 = param4;
                      param4++;
                      param0[incrementValue$45] = param2 << 16;
                      var11++;
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  incrementValue$46 = param3;
                  param3++;
                  param2 = param1[incrementValue$46];
                  if (param2 == 0) {
                    param4++;
                    break L3;
                  } else {
                    incrementValue$47 = param4;
                    param4++;
                    param0[incrementValue$47] = param2 << 16;
                    break L3;
                  }
                }
                L4: {
                  incrementValue$48 = param3;
                  param3++;
                  param2 = param1[incrementValue$48];
                  if (param2 == 0) {
                    param4++;
                    break L4;
                  } else {
                    incrementValue$49 = param4;
                    param4++;
                    param0[incrementValue$49] = param2 << 16;
                    break L4;
                  }
                }
                L5: {
                  incrementValue$50 = param3;
                  param3++;
                  param2 = param1[incrementValue$50];
                  if (param2 == 0) {
                    param4++;
                    break L5;
                  } else {
                    incrementValue$51 = param4;
                    param4++;
                    param0[incrementValue$51] = param2 << 16;
                    break L5;
                  }
                }
                incrementValue$52 = param3;
                param3++;
                param2 = param1[incrementValue$52];
                if (param2 == 0) {
                  param4++;
                  var11++;
                  continue L1;
                } else {
                  incrementValue$53 = param4;
                  param4++;
                  param0[incrementValue$53] = param2 << 16;
                  var11++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final static void b(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        for (var1 = wj.field_l.length - 1; var1 >= 0; var1--) {
            var2 = (wj.field_l[var1] & 16711680) >> 16;
            var3 = (wj.field_l[var1] & 65280) >> 8;
            var4 = wj.field_l[var1] & 255;
            var2 = ((var2 - 128) * param0 >> 8) + 128;
            var3 = ((var3 - 128) * param0 >> 8) + 128;
            var4 = ((var4 - 128) * param0 >> 8) + 128;
            var2 = var2 > 255 ? 255 : var2;
            var2 = var2 < 1 ? 0 : var2;
            var3 = var3 > 255 ? 255 : var3;
            var3 = var3 < 1 ? 0 : var3;
            var4 = var4 > 255 ? 255 : var4;
            var4 = var4 < 1 ? 0 : var4;
            wj.field_l[var1] = var2 << 16 | var3 << 8 | var4;
        }
    }

    private final static he a(he param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        he var7;
        int var8;
        int var9_int;
        byte[] var9;
        byte[] var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        double var16;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var27;
        int var28;
        int var29;
        int var30;
        int var31;
        int var32;
        double var33;
        int var35;
        int var36;
        int var37;
        int var38;
        int var39;
        int var40;
        int var41;
        int var42;
        int var43;
        int var44;
        int var45;
        int var46;
        int var47;
        var7 = new he(param0.field_h * 2, param0.field_c * 2, param0.field_l.length);
        var8 = var7.field_l.length;
        var9_int = 0;
        L0: while (true) {
          if (var9_int >= var8) {
            if (param6 != 0) {
              L1: {
                var9 = param0.field_m;
                var10 = var7.field_m;
                var11 = param0.field_a;
                var12 = param0.field_f;
                var13 = param0.field_d;
                var14 = param0.field_k;
                var15 = var7.field_d;
                param1 = param1 - (var11 << 4);
                param2 = param2 - (var12 << 4);
                var16 = (double)(param5 & 65535) * 0.00009587379924285257;
                var18 = (int)Math.floor(Math.sin(var16) * (double)param6 + 0.5);
                var19 = (int)Math.floor(Math.cos(var16) * (double)param6 + 0.5);
                var20 = -param1 * var19 + -param2 * var18;
                var21 = --param1 * var18 + -param2 * var19;
                var22 = ((var13 << 4) - param1) * var19 + -param2 * var18;
                var23 = -((var13 << 4) - param1) * var18 + -param2 * var19;
                var24 = -param1 * var19 + ((var14 << 4) - param2) * var18;
                var25 = --param1 * var18 + ((var14 << 4) - param2) * var19;
                var26 = ((var13 << 4) - param1) * var19 + ((var14 << 4) - param2) * var18;
                var27 = -((var13 << 4) - param1) * var18 + ((var14 << 4) - param2) * var19;
                if (var20 >= var22) {
                  var28 = var22;
                  var29 = var20;
                  break L1;
                } else {
                  var28 = var20;
                  var29 = var22;
                  break L1;
                }
              }
              L2: {
                if (var24 >= var28) {
                  break L2;
                } else {
                  var28 = var24;
                  break L2;
                }
              }
              L3: {
                if (var26 >= var28) {
                  break L3;
                } else {
                  var28 = var26;
                  break L3;
                }
              }
              L4: {
                if (var24 <= var29) {
                  break L4;
                } else {
                  var29 = var24;
                  break L4;
                }
              }
              L5: {
                if (var26 <= var29) {
                  break L5;
                } else {
                  var29 = var26;
                  break L5;
                }
              }
              L6: {
                if (var21 >= var23) {
                  var30 = var23;
                  var31 = var21;
                  break L6;
                } else {
                  var30 = var21;
                  var31 = var23;
                  break L6;
                }
              }
              L7: {
                if (var25 >= var30) {
                  break L7;
                } else {
                  var30 = var25;
                  break L7;
                }
              }
              L8: {
                if (var27 >= var30) {
                  break L8;
                } else {
                  var30 = var27;
                  break L8;
                }
              }
              L9: {
                if (var25 <= var31) {
                  break L9;
                } else {
                  var31 = var25;
                  break L9;
                }
              }
              L10: {
                if (var27 <= var31) {
                  break L10;
                } else {
                  var31 = var27;
                  break L10;
                }
              }
              L11: {
                var28 = var28 >> 12;
                var29 = var29 + 4095 >> 12;
                var30 = var30 >> 12;
                var31 = var31 + 4095 >> 12;
                var28 = var28 + param3;
                var29 = var29 + param3;
                var30 = var30 + param4;
                var31 = var31 + param4;
                var28 = var28 >> 4;
                var29 = var29 + 15 >> 4;
                var30 = var30 >> 4;
                var31 = var31 + 15 >> 4;
                if (var28 >= wj.field_g) {
                  break L11;
                } else {
                  var28 = wj.field_g;
                  break L11;
                }
              }
              L12: {
                if (var29 <= wj.field_b) {
                  break L12;
                } else {
                  var29 = wj.field_b;
                  break L12;
                }
              }
              L13: {
                if (var30 >= wj.field_e) {
                  break L13;
                } else {
                  var30 = wj.field_e;
                  break L13;
                }
              }
              L14: {
                if (var31 <= wj.field_j) {
                  break L14;
                } else {
                  var31 = wj.field_j;
                  break L14;
                }
              }
              var29 = var28 - var29;
              if (var29 < 0) {
                var31 = var30 - var31;
                if (var31 < 0) {
                  L15: {
                    var32 = var30 * var15 + var28;
                    var33 = 16777216.0 / (double)param6;
                    var35 = (int)Math.floor(Math.sin(var16) * var33 + 0.5);
                    var36 = (int)Math.floor(Math.cos(var16) * var33 + 0.5);
                    var37 = (var28 << 4) + 8 - param3;
                    var38 = (var30 << 4) + 8 - param4;
                    var39 = (param1 << 8) - (var38 * var35 >> 4);
                    var40 = (param2 << 8) + (var38 * var36 >> 4);
                    if (var36 != 0) {
                      if (var36 >= 0) {
                        if (var35 != 0) {
                          if (var35 >= 0) {
                            var42 = var31;
                            L16: while (true) {
                              if (var42 >= 0) {
                                break L15;
                              } else {
                                L17: {
                                  var43 = var32;
                                  var44 = var39 + (var37 * var36 >> 4);
                                  var45 = var40 + (var37 * var35 >> 4);
                                  var46 = var29;
                                  if (var44 >= 0) {
                                    break L17;
                                  } else {
                                    var41 = (var36 - 1 - var44) / var36;
                                    var46 = var46 + var41;
                                    var44 = var44 + var36 * var41;
                                    var45 = var45 + var35 * var41;
                                    var43 = var43 + var41;
                                    break L17;
                                  }
                                }
                                L18: {
                                  var41 = (1 + var44 - (var13 << 12) - var36) / var36;
                                  if ((1 + var44 - (var13 << 12) - var36) / var36 <= var46) {
                                    break L18;
                                  } else {
                                    var46 = var41;
                                    break L18;
                                  }
                                }
                                L19: {
                                  if (var45 >= 0) {
                                    break L19;
                                  } else {
                                    var41 = (var35 - 1 - var45) / var35;
                                    var46 = var46 + var41;
                                    var44 = var44 + var36 * var41;
                                    var45 = var45 + var35 * var41;
                                    var43 = var43 + var41;
                                    break L19;
                                  }
                                }
                                L20: {
                                  var41 = (1 + var45 - (var14 << 12) - var35) / var35;
                                  if ((1 + var45 - (var14 << 12) - var35) / var35 <= var46) {
                                    break L20;
                                  } else {
                                    var46 = var41;
                                    break L20;
                                  }
                                }
                                L21: while (true) {
                                  if (var46 >= 0) {
                                    var42++;
                                    var39 = var39 - var35;
                                    var40 = var40 + var36;
                                    var32 = var32 + var15;
                                    continue L16;
                                  } else {
                                    var47 = var9[(var45 >> 12) * var13 + (var44 >> 12)];
                                    incrementValue$0 = var43;
                                    var43++;
                                    var10[incrementValue$0] = (byte)var47;
                                    var44 = var44 + var36;
                                    var45 = var45 + var35;
                                    var46++;
                                    continue L21;
                                  }
                                }
                              }
                            }
                          } else {
                            var42 = var31;
                            L22: while (true) {
                              if (var42 >= 0) {
                                break L15;
                              } else {
                                L23: {
                                  var43 = var32;
                                  var44 = var39 + (var37 * var36 >> 4);
                                  var45 = var40 + (var37 * var35 >> 4);
                                  var46 = var29;
                                  if (var44 >= 0) {
                                    break L23;
                                  } else {
                                    var41 = (var36 - 1 - var44) / var36;
                                    var46 = var46 + var41;
                                    var44 = var44 + var36 * var41;
                                    var45 = var45 + var35 * var41;
                                    var43 = var43 + var41;
                                    break L23;
                                  }
                                }
                                L24: {
                                  var41 = (1 + var44 - (var13 << 12) - var36) / var36;
                                  if ((1 + var44 - (var13 << 12) - var36) / var36 <= var46) {
                                    break L24;
                                  } else {
                                    var46 = var41;
                                    break L24;
                                  }
                                }
                                L25: {
                                  var41 = var45 - (var14 << 12);
                                  if (var45 - (var14 << 12) < 0) {
                                    break L25;
                                  } else {
                                    var41 = (var35 - var41) / var35;
                                    var46 = var46 + var41;
                                    var44 = var44 + var36 * var41;
                                    var45 = var45 + var35 * var41;
                                    var43 = var43 + var41;
                                    break L25;
                                  }
                                }
                                L26: {
                                  var41 = (var45 - var35) / var35;
                                  if ((var45 - var35) / var35 <= var46) {
                                    break L26;
                                  } else {
                                    var46 = var41;
                                    break L26;
                                  }
                                }
                                L27: while (true) {
                                  if (var46 >= 0) {
                                    var42++;
                                    var39 = var39 - var35;
                                    var40 = var40 + var36;
                                    var32 = var32 + var15;
                                    continue L22;
                                  } else {
                                    var47 = var9[(var45 >> 12) * var13 + (var44 >> 12)];
                                    incrementValue$1 = var43;
                                    var43++;
                                    var10[incrementValue$1] = (byte)var47;
                                    var44 = var44 + var36;
                                    var45 = var45 + var35;
                                    var46++;
                                    continue L27;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var42 = var31;
                          L28: while (true) {
                            if (var42 >= 0) {
                              break L15;
                            } else {
                              L29: {
                                var43 = var32;
                                var44 = var39 + (var37 * var36 >> 4);
                                var45 = var40;
                                var46 = var29;
                                if (var45 >= 0) {
                                  if (var45 - (var14 << 12) < 0) {
                                    L30: {
                                      if (var44 >= 0) {
                                        break L30;
                                      } else {
                                        var41 = (var36 - 1 - var44) / var36;
                                        var46 = var46 + var41;
                                        var44 = var44 + var36 * var41;
                                        var43 = var43 + var41;
                                        break L30;
                                      }
                                    }
                                    L31: {
                                      var41 = (1 + var44 - (var13 << 12) - var36) / var36;
                                      if ((1 + var44 - (var13 << 12) - var36) / var36 <= var46) {
                                        break L31;
                                      } else {
                                        var46 = var41;
                                        break L31;
                                      }
                                    }
                                    L32: while (true) {
                                      if (var46 >= 0) {
                                        break L29;
                                      } else {
                                        var47 = var9[(var45 >> 12) * var13 + (var44 >> 12)];
                                        incrementValue$2 = var43;
                                        var43++;
                                        var10[incrementValue$2] = (byte)var47;
                                        var44 = var44 + var36;
                                        var46++;
                                        continue L32;
                                      }
                                    }
                                  } else {
                                    break L29;
                                  }
                                } else {
                                  break L29;
                                }
                              }
                              var42++;
                              var40 = var40 + var36;
                              var32 = var32 + var15;
                              continue L28;
                            }
                          }
                        }
                      } else {
                        if (var35 != 0) {
                          if (var35 >= 0) {
                            var42 = var31;
                            L33: while (true) {
                              if (var42 >= 0) {
                                break L15;
                              } else {
                                L34: {
                                  var43 = var32;
                                  var44 = var39 + (var37 * var36 >> 4);
                                  var45 = var40 + (var37 * var35 >> 4);
                                  var46 = var29;
                                  var41 = var44 - (var13 << 12);
                                  if (var44 - (var13 << 12) < 0) {
                                    break L34;
                                  } else {
                                    var41 = (var36 - var41) / var36;
                                    var46 = var46 + var41;
                                    var44 = var44 + var36 * var41;
                                    var45 = var45 + var35 * var41;
                                    var43 = var43 + var41;
                                    break L34;
                                  }
                                }
                                L35: {
                                  var41 = (var44 - var36) / var36;
                                  if ((var44 - var36) / var36 <= var46) {
                                    break L35;
                                  } else {
                                    var46 = var41;
                                    break L35;
                                  }
                                }
                                L36: {
                                  if (var45 >= 0) {
                                    break L36;
                                  } else {
                                    var41 = (var35 - 1 - var45) / var35;
                                    var46 = var46 + var41;
                                    var44 = var44 + var36 * var41;
                                    var45 = var45 + var35 * var41;
                                    var43 = var43 + var41;
                                    break L36;
                                  }
                                }
                                L37: {
                                  var41 = (1 + var45 - (var14 << 12) - var35) / var35;
                                  if ((1 + var45 - (var14 << 12) - var35) / var35 <= var46) {
                                    break L37;
                                  } else {
                                    var46 = var41;
                                    break L37;
                                  }
                                }
                                L38: while (true) {
                                  if (var46 >= 0) {
                                    var42++;
                                    var39 = var39 - var35;
                                    var40 = var40 + var36;
                                    var32 = var32 + var15;
                                    continue L33;
                                  } else {
                                    var47 = var9[(var45 >> 12) * var13 + (var44 >> 12)];
                                    incrementValue$3 = var43;
                                    var43++;
                                    var10[incrementValue$3] = (byte)var47;
                                    var44 = var44 + var36;
                                    var45 = var45 + var35;
                                    var46++;
                                    continue L38;
                                  }
                                }
                              }
                            }
                          } else {
                            var42 = var31;
                            L39: while (true) {
                              if (var42 >= 0) {
                                break L15;
                              } else {
                                L40: {
                                  var43 = var32;
                                  var44 = var39 + (var37 * var36 >> 4);
                                  var45 = var40 + (var37 * var35 >> 4);
                                  var46 = var29;
                                  var41 = var44 - (var13 << 12);
                                  if (var44 - (var13 << 12) < 0) {
                                    break L40;
                                  } else {
                                    var41 = (var36 - var41) / var36;
                                    var46 = var46 + var41;
                                    var44 = var44 + var36 * var41;
                                    var45 = var45 + var35 * var41;
                                    var43 = var43 + var41;
                                    break L40;
                                  }
                                }
                                L41: {
                                  var41 = (var44 - var36) / var36;
                                  if ((var44 - var36) / var36 <= var46) {
                                    break L41;
                                  } else {
                                    var46 = var41;
                                    break L41;
                                  }
                                }
                                L42: {
                                  var41 = var45 - (var14 << 12);
                                  if (var45 - (var14 << 12) < 0) {
                                    break L42;
                                  } else {
                                    var41 = (var35 - var41) / var35;
                                    var46 = var46 + var41;
                                    var44 = var44 + var36 * var41;
                                    var45 = var45 + var35 * var41;
                                    var43 = var43 + var41;
                                    break L42;
                                  }
                                }
                                L43: {
                                  var41 = (var45 - var35) / var35;
                                  if ((var45 - var35) / var35 <= var46) {
                                    break L43;
                                  } else {
                                    var46 = var41;
                                    break L43;
                                  }
                                }
                                L44: while (true) {
                                  if (var46 >= 0) {
                                    var42++;
                                    var39 = var39 - var35;
                                    var40 = var40 + var36;
                                    var32 = var32 + var15;
                                    continue L39;
                                  } else {
                                    var47 = var9[(var45 >> 12) * var13 + (var44 >> 12)];
                                    incrementValue$4 = var43;
                                    var43++;
                                    var10[incrementValue$4] = (byte)var47;
                                    var44 = var44 + var36;
                                    var45 = var45 + var35;
                                    var46++;
                                    continue L44;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var42 = var31;
                          L45: while (true) {
                            if (var42 >= 0) {
                              break L15;
                            } else {
                              L46: {
                                var43 = var32;
                                var44 = var39 + (var37 * var36 >> 4);
                                var45 = var40;
                                var46 = var29;
                                if (var45 >= 0) {
                                  if (var45 - (var14 << 12) < 0) {
                                    L47: {
                                      var41 = var44 - (var13 << 12);
                                      if (var44 - (var13 << 12) < 0) {
                                        break L47;
                                      } else {
                                        var41 = (var36 - var41) / var36;
                                        var46 = var46 + var41;
                                        var44 = var44 + var36 * var41;
                                        var43 = var43 + var41;
                                        break L47;
                                      }
                                    }
                                    L48: {
                                      var41 = (var44 - var36) / var36;
                                      if ((var44 - var36) / var36 <= var46) {
                                        break L48;
                                      } else {
                                        var46 = var41;
                                        break L48;
                                      }
                                    }
                                    L49: while (true) {
                                      if (var46 >= 0) {
                                        break L46;
                                      } else {
                                        var47 = var9[(var45 >> 12) * var13 + (var44 >> 12)];
                                        incrementValue$5 = var43;
                                        var43++;
                                        var10[incrementValue$5] = (byte)var47;
                                        var44 = var44 + var36;
                                        var46++;
                                        continue L49;
                                      }
                                    }
                                  } else {
                                    break L46;
                                  }
                                } else {
                                  break L46;
                                }
                              }
                              var42++;
                              var40 = var40 + var36;
                              var32 = var32 + var15;
                              continue L45;
                            }
                          }
                        }
                      }
                    } else {
                      if (var35 != 0) {
                        if (var35 >= 0) {
                          var42 = var31;
                          L50: while (true) {
                            if (var42 >= 0) {
                              break L15;
                            } else {
                              L51: {
                                var43 = var32;
                                var44 = var39;
                                var45 = var40 + (var37 * var35 >> 4);
                                var46 = var29;
                                if (var44 >= 0) {
                                  if (var44 - (var13 << 12) < 0) {
                                    L52: {
                                      if (var45 >= 0) {
                                        break L52;
                                      } else {
                                        var41 = (var35 - 1 - var45) / var35;
                                        var46 = var46 + var41;
                                        var45 = var45 + var35 * var41;
                                        var43 = var43 + var41;
                                        break L52;
                                      }
                                    }
                                    L53: {
                                      var41 = (1 + var45 - (var14 << 12) - var35) / var35;
                                      if ((1 + var45 - (var14 << 12) - var35) / var35 <= var46) {
                                        break L53;
                                      } else {
                                        var46 = var41;
                                        break L53;
                                      }
                                    }
                                    L54: while (true) {
                                      if (var46 >= 0) {
                                        break L51;
                                      } else {
                                        var47 = var9[(var45 >> 12) * var13 + (var44 >> 12)];
                                        incrementValue$6 = var43;
                                        var43++;
                                        var10[incrementValue$6] = (byte)var47;
                                        var45 = var45 + var35;
                                        var46++;
                                        continue L54;
                                      }
                                    }
                                  } else {
                                    break L51;
                                  }
                                } else {
                                  break L51;
                                }
                              }
                              var42++;
                              var39 = var39 - var35;
                              var32 = var32 + var15;
                              continue L50;
                            }
                          }
                        } else {
                          var42 = var31;
                          L55: while (true) {
                            if (var42 >= 0) {
                              break L15;
                            } else {
                              L56: {
                                var43 = var32;
                                var44 = var39;
                                var45 = var40 + (var37 * var35 >> 4);
                                var46 = var29;
                                if (var44 >= 0) {
                                  if (var44 - (var13 << 12) < 0) {
                                    L57: {
                                      var41 = var45 - (var14 << 12);
                                      if (var45 - (var14 << 12) < 0) {
                                        break L57;
                                      } else {
                                        var41 = (var35 - var41) / var35;
                                        var46 = var46 + var41;
                                        var45 = var45 + var35 * var41;
                                        var43 = var43 + var41;
                                        break L57;
                                      }
                                    }
                                    L58: {
                                      var41 = (var45 - var35) / var35;
                                      if ((var45 - var35) / var35 <= var46) {
                                        break L58;
                                      } else {
                                        var46 = var41;
                                        break L58;
                                      }
                                    }
                                    L59: while (true) {
                                      if (var46 >= 0) {
                                        break L56;
                                      } else {
                                        var47 = var9[(var45 >> 12) * var13 + (var44 >> 12)];
                                        incrementValue$7 = var43;
                                        var43++;
                                        var10[incrementValue$7] = (byte)var47;
                                        var45 = var45 + var35;
                                        var46++;
                                        continue L59;
                                      }
                                    }
                                  } else {
                                    var42++;
                                    var39 = var39 - var35;
                                    var32 = var32 + var15;
                                    continue L55;
                                  }
                                } else {
                                  break L56;
                                }
                              }
                              var42++;
                              var39 = var39 - var35;
                              var32 = var32 + var15;
                              continue L55;
                            }
                          }
                        }
                      } else {
                        var42 = var31;
                        L60: while (true) {
                          if (var42 >= 0) {
                            break L15;
                          } else {
                            var43 = var32;
                            var44 = var39;
                            var45 = var40;
                            var46 = var29;
                            if (var44 >= 0) {
                              L61: {
                                if (var45 >= 0) {
                                  if (var44 - (var13 << 12) < 0) {
                                    if (var45 - (var14 << 12) < 0) {
                                      L62: while (true) {
                                        if (var46 >= 0) {
                                          break L61;
                                        } else {
                                          var47 = var9[(var45 >> 12) * var13 + (var44 >> 12)];
                                          incrementValue$8 = var43;
                                          var43++;
                                          var10[incrementValue$8] = (byte)var47;
                                          var46++;
                                          continue L62;
                                        }
                                      }
                                    } else {
                                      break L61;
                                    }
                                  } else {
                                    break L61;
                                  }
                                } else {
                                  break L61;
                                }
                              }
                              var42++;
                              var32 = var32 + var15;
                              continue L60;
                            } else {
                              var42++;
                              var32 = var32 + var15;
                              continue L60;
                            }
                          }
                        }
                      }
                    }
                  }
                  return var7;
                } else {
                  return var7;
                }
              } else {
                return var7;
              }
            } else {
              return var7;
            }
          } else {
            var7.field_l[var9_int] = param0.field_l[var9_int];
            var9_int++;
            continue L0;
          }
        }
    }

    private final static void b(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int incrementValue$44 = 0;
        int incrementValue$45 = 0;
        int incrementValue$46 = 0;
        int incrementValue$47 = 0;
        int incrementValue$48 = 0;
        int incrementValue$49 = 0;
        int incrementValue$50 = 0;
        int incrementValue$51 = 0;
        int incrementValue$52 = 0;
        int incrementValue$53 = 0;
        int var9;
        int var10;
        int var11;
        var9 = -(param5 >> 2);
        param5 = -(param5 & 3);
        var10 = -param6;
        L0: while (true) {
          if (var10 >= 0) {
            return;
          } else {
            var11 = var9;
            L1: while (true) {
              if (var11 >= 0) {
                var11 = param5;
                L2: while (true) {
                  if (var11 >= 0) {
                    param4 = param4 + param7;
                    param3 = param3 + param8;
                    var10++;
                    continue L0;
                  } else {
                    incrementValue$44 = param3;
                    param3++;
                    param2 = param1[incrementValue$44];
                    if (param2 == 0) {
                      param4++;
                      var11++;
                      continue L2;
                    } else {
                      incrementValue$45 = param4;
                      param4++;
                      param0[incrementValue$45] = param2 << 8;
                      var11++;
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  incrementValue$46 = param3;
                  param3++;
                  param2 = param1[incrementValue$46];
                  if (param2 == 0) {
                    param4++;
                    break L3;
                  } else {
                    incrementValue$47 = param4;
                    param4++;
                    param0[incrementValue$47] = param2 << 8;
                    break L3;
                  }
                }
                L4: {
                  incrementValue$48 = param3;
                  param3++;
                  param2 = param1[incrementValue$48];
                  if (param2 == 0) {
                    param4++;
                    break L4;
                  } else {
                    incrementValue$49 = param4;
                    param4++;
                    param0[incrementValue$49] = param2 << 8;
                    break L4;
                  }
                }
                L5: {
                  incrementValue$50 = param3;
                  param3++;
                  param2 = param1[incrementValue$50];
                  if (param2 == 0) {
                    param4++;
                    break L5;
                  } else {
                    incrementValue$51 = param4;
                    param4++;
                    param0[incrementValue$51] = param2 << 8;
                    break L5;
                  }
                }
                incrementValue$52 = param3;
                param3++;
                param2 = param1[incrementValue$52];
                if (param2 == 0) {
                  param4++;
                  var11++;
                  continue L1;
                } else {
                  incrementValue$53 = param4;
                  param4++;
                  param0[incrementValue$53] = param2 << 8;
                  var11++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    public static void a() {
        field_b = null;
        field_c = null;
        field_a = null;
    }

    final static he[] b(he param0, int param1) {
        int var3 = 0;
        he[] var2 = new he[param1];
        for (var3 = 0; var3 < param1; var3++) {
            var2[var3] = be.a(param0, param0.field_h, param0.field_c, var3 * 65536 / param1 & 65535, 4096);
        }
        lb.field_C.a(101);
        return var2;
    }

    final static void a(he param0, int param1, double param2) {
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var4 = param0.field_l;
        byte[] var5 = param0.field_m;
        wj.f(0, 0, wj.field_k, param1);
        param0.e(0, 0);
        wj.a();
        int var6 = param1 * wj.field_k;
        for (var7 = param1; var7 < wj.field_c; var7++) {
            var8 = param1 - var7;
            var9 = 10.0 * (double)var8 / (double)(wj.field_c - param1);
            var11 = param1 + var8 + (int)(var9 * ji.a(65535, ((double)var7 - param2) / 2.5));
            var12 = var11 * wj.field_k;
            var13 = (var7 + 1) * wj.field_k;
            while (var6 < var13) {
                wj.field_l[var6] = var4[var5[var12]];
                var6++;
                var12++;
            }
            be.a(0, var7, wj.field_k, -65793 * var8);
        }
    }

    final static void a(int param0) {
        int var1;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        if (param0 >= 1) {
          L0: {
            var3 = 0;
            var6 = param0;
            if (var6 < wj.field_c) {
              break L0;
            } else {
              var6 = wj.field_c - 1;
              break L0;
            }
          }
          var4 = 0;
          var15 = 0;
          var16 = var6 * wj.field_k;
          var2 = 0;
          L1: while (true) {
            if (var2 >= wj.field_c) {
              return;
            } else {
              L2: {
                if (var4 == 0) {
                  break L2;
                } else {
                  var5 = param0 - var4;
                  var1 = 0;
                  L3: while (true) {
                    if (var1 >= wj.field_k) {
                      break L2;
                    } else {
                      var7 = wj.field_l[var1 + var15];
                      var8 = wj.field_l[var1 + var16];
                      var9 = ((var7 & 16711680) >> 16) * var5;
                      var10 = ((var7 & 65280) >> 8) * var5;
                      var11 = (var7 & 255) * var5;
                      var12 = ((var8 & 16711680) >> 16) * var4;
                      var13 = ((var8 & 65280) >> 8) * var4;
                      var14 = (var8 & 255) * var4;
                      wj.field_l[var1 + var3] = ((var9 + var12) / param0 << 16) + ((var10 + var13) / param0 << 8) + (var11 + var14) / param0;
                      var1++;
                      continue L3;
                    }
                  }
                }
              }
              L4: {
                var4++;
                if (var4 != param0) {
                  break L4;
                } else {
                  var4 = 0;
                  var15 = var16;
                  var6 = var6 + param0;
                  var16 = var16 + param0 * wj.field_k;
                  if (var6 < wj.field_c) {
                    break L4;
                  } else {
                    var6 = wj.field_c - 1;
                    var16 = var6 * wj.field_k;
                    break L4;
                  }
                }
              }
              var3 = var3 + wj.field_k;
              var2++;
              continue L1;
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
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
        int incrementValue$0 = 0;
        int var6 = param0 + param1 * wj.field_k;
        int var7 = 255 - param5;
        int var8 = param4 >> 16;
        int var9 = param4 >> 8 & 255;
        int var10 = param4 & 255;
        int var11 = wj.field_k - param2;
        for (var12 = param3 - 1; var12 >= 0; var12--) {
            for (var13 = param2 - 1; var13 >= 0; var13--) {
                var14 = wj.field_l[var6];
                var15 = var14 >> 16 & 255;
                var16 = var14 >> 8 & 255;
                var17 = var14 & 255;
                var18 = (var17 + (var15 << 1)) / 6 + (var16 >> 2);
                var19 = var18 * var8 >> 8;
                var20 = var18 * var9 >> 8;
                var21 = var18 * var10 >> 8;
                incrementValue$0 = var6;
                var6++;
                wj.field_l[incrementValue$0] = (var15 * var7 + var19 * param5 << 8 & 16711680) + (var16 * var7 + var20 * param5 & 65280) + (var17 * var7 + var21 * param5 >> 8);
            }
            var6 = var6 + var11;
        }
    }

    final static nh b() {
        nh var0 = new nh(wj.field_k, wj.field_c);
        kg.a(wj.field_l, 0, var0.field_B, 0, var0.field_B.length);
        return var0;
    }

    private final static void a(int param0, int param1, int param2, int param3) {
        int incrementValue$0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        if (param1 < wj.field_e) {
          return;
        } else {
          if (param1 < wj.field_j) {
            L0: {
              if (param0 >= wj.field_g) {
                break L0;
              } else {
                param2 = param2 - (wj.field_g - param0);
                param0 = wj.field_g;
                break L0;
              }
            }
            L1: {
              if (param0 + param2 <= wj.field_b) {
                break L1;
              } else {
                param2 = wj.field_b - param0;
                break L1;
              }
            }
            var4 = param3 >> 16;
            var5 = param3 >> 8 & 255;
            var6 = param3 & 255;
            var7 = param0 + param1 * wj.field_k;
            var8 = 0;
            L2: while (true) {
              if (var8 >= param2) {
                return;
              } else {
                L3: {
                  var9 = wj.field_l[var7];
                  var10 = var9 >> 16;
                  var11 = var9 >> 8 & 255;
                  var12 = var9 & 255;
                  var10 = var10 - var4;
                  var11 = var11 - var5;
                  var12 = var12 - var6;
                  if (var10 <= 255) {
                    stackIn_12_0 = var10;
                    break L3;
                  } else {
                    stackIn_12_0 = 255;
                    break L3;
                  }
                }
                L4: {
                  var10 = stackIn_12_0;
                  if (var10 >= 1) {
                    stackIn_15_0 = var10;
                    break L4;
                  } else {
                    stackIn_15_0 = 0;
                    break L4;
                  }
                }
                L5: {
                  var10 = stackIn_15_0;
                  if (var11 <= 255) {
                    stackIn_18_0 = var11;
                    break L5;
                  } else {
                    stackIn_18_0 = 255;
                    break L5;
                  }
                }
                L6: {
                  var11 = stackIn_18_0;
                  if (var11 >= 1) {
                    stackIn_21_0 = var11;
                    break L6;
                  } else {
                    stackIn_21_0 = 0;
                    break L6;
                  }
                }
                L7: {
                  var11 = stackIn_21_0;
                  if (var12 <= 255) {
                    stackIn_24_0 = var12;
                    break L7;
                  } else {
                    stackIn_24_0 = 255;
                    break L7;
                  }
                }
                L8: {
                  var12 = stackIn_24_0;
                  if (var12 >= 1) {
                    stackIn_27_0 = var12;
                    break L8;
                  } else {
                    stackIn_27_0 = 0;
                    break L8;
                  }
                }
                var12 = stackIn_27_0;
                incrementValue$0 = var7;
                var7++;
                wj.field_l[incrementValue$0] = var10 << 16 | var11 << 8 | var12;
                var8++;
                continue L2;
              }
            }
          } else {
            return;
          }
        }
    }

    final static he a(he param0) {
        int var4 = 0;
        int var3 = 0;
        param0.c();
        he var1 = new he(param0.field_h * 2, param0.field_c, param0.field_l.length);
        var1.field_h = param0.field_h * 2;
        var1.field_c = param0.field_c;
        var1.field_a = param0.field_a;
        var1.field_f = param0.field_f;
        int var2 = var1.field_l.length;
        for (var3 = 0; var3 < var2; var3++) {
            var1.field_l[var3] = param0.field_l[var3];
        }
        for (var3 = 0; var3 < param0.field_c; var3++) {
            for (var4 = 0; var4 < param0.field_h; var4++) {
                var1.field_m[var3 * var1.field_h + var4] = param0.field_m[var3 * param0.field_h + var4];
                var1.field_m[(1 + var3) * var1.field_h - (var4 + 1)] = param0.field_m[var3 * param0.field_h + var4];
            }
        }
        return var1;
    }

    static {
        int var0 = 0;
        field_c = new int[256];
        field_b = new int[256];
        field_a = new int[256];
        for (var0 = 0; var0 < 255; var0++) {
            field_a[var0] = var0;
            field_c[var0] = var0;
            field_b[var0] = var0;
        }
    }
}
