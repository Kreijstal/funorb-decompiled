/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gt extends k {
    private int field_u;
    private int field_t;
    private int field_q;
    static java.util.zip.CRC32 field_l;
    private int field_p;
    private int field_n;
    static kv field_s;
    static String field_r;
    private int field_m;
    private int field_o;
    private int field_w;
    private int field_k;
    private int field_v;

    public static void d() {
        field_l = null;
        int var1 = -120;
        field_s = null;
        field_r = null;
    }

    public gt() {
        super(0, true);
        ((gt) this).field_t = 1024;
        ((gt) this).field_p = 2048;
        ((gt) this).field_u = 1024;
        ((gt) this).field_n = 1024;
        ((gt) this).field_m = 409;
        ((gt) this).field_o = 1024;
        ((gt) this).field_w = 0;
        ((gt) this).field_k = 819;
        ((gt) this).field_v = 0;
    }

    final int[] a(int param0, int param1) {
        int[] var3 = null;
        int[][] var4 = null;
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
        int[][] var19 = null;
        int[][] var20 = null;
        Random var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26_int = 0;
        int[] var26 = null;
        int[][] var27 = null;
        int var28 = 0;
        int var29_int = 0;
        int[] var29 = null;
        int var30 = 0;
        int var31 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int[][] var40 = null;
        int[] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        int[] var45 = null;
        int[][] var46 = null;
        int[][] var47 = null;
        int[][] var48 = null;
        int[][] var51 = null;
        int[][] var52 = null;
        int[][] var55 = null;
        int[][] var56 = null;
        int[] var57 = null;
        int[] var58 = null;
        L0: {
          var38 = BachelorFridge.field_y;
          if (param1 == 0) {
            break L0;
          } else {
            ((gt) this).field_p = 43;
            break L0;
          }
        }
        L1: {
          var3 = ((gt) this).field_j.a(param0, -1);
          if (((gt) this).field_j.field_m) {
            var55 = ((gt) this).field_j.a(false);
            var51 = var55;
            var47 = var51;
            var40 = var47;
            var4 = var40;
            var5 = 0;
            var6 = 0;
            var7 = 0;
            var8 = 0;
            var9 = 0;
            var10 = 1;
            var11 = 1;
            var12 = 0;
            var13 = 0;
            var14 = ((gt) this).field_n * hh.field_d >> 12;
            var15 = hh.field_d * ((gt) this).field_p >> 12;
            var16 = ((gt) this).field_m * bi.field_g >> 12;
            var17 = ((gt) this).field_k * bi.field_g >> 12;
            if (var17 <= 1) {
              return var55[param0];
            } else {
              ((gt) this).field_q = hh.field_d / 8 * ((gt) this).field_t >> 12;
              var18 = hh.field_d / var14 + 1;
              var19 = new int[var18][3];
              var56 = new int[var18][3];
              var52 = var56;
              var48 = var52;
              var20 = var48;
              var21 = new Random((long)((gt) this).field_w);
              L2: while (true) {
                L3: {
                  var23 = kla.a(-var14 + var15, var21, -2147483648) + var14;
                  var24 = kla.a(-var16 + var17, var21, -2147483648) + var16;
                  var25 = var8 + var23;
                  if (hh.field_d >= var25) {
                    break L3;
                  } else {
                    var23 = -var8 + hh.field_d;
                    var25 = hh.field_d;
                    break L3;
                  }
                }
                L4: {
                  if (var11 != 0) {
                    var22 = 0;
                    break L4;
                  } else {
                    L5: {
                      var26_int = var9;
                      var58 = var56[var9];
                      var28 = 0;
                      var29_int = var25 - -var5;
                      if (var29_int < 0) {
                        var29_int = var29_int + hh.field_d;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      if (hh.field_d >= var29_int) {
                        break L6;
                      } else {
                        var29_int = var29_int - hh.field_d;
                        break L6;
                      }
                    }
                    L7: while (true) {
                      L8: {
                        var57 = var56[var26_int];
                        if (var57[0] > var29_int) {
                          break L8;
                        } else {
                          if (var29_int <= var57[1]) {
                            L9: {
                              var22 = var58[2];
                              if (var26_int != var9) {
                                L10: {
                                  var30 = var8 + var5;
                                  if (var30 < 0) {
                                    var30 = var30 + hh.field_d;
                                    break L10;
                                  } else {
                                    break L10;
                                  }
                                }
                                L11: {
                                  if (hh.field_d < var30) {
                                    var30 = var30 - hh.field_d;
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                                var31 = 1;
                                L12: while (true) {
                                  if (var31 > var28) {
                                    var39 = 0;
                                    var31 = var39;
                                    L13: while (true) {
                                      if (var39 > var28) {
                                        break L9;
                                      } else {
                                        var43 = var20[(var9 + var39) % var12];
                                        var33 = var43[2];
                                        if (var33 != var22) {
                                          L14: {
                                            var36 = var43[0];
                                            var37 = var43[1];
                                            if (var29_int > var30) {
                                              var34 = Math.max(var30, var36);
                                              var35 = Math.min(var29_int, var37);
                                              break L14;
                                            } else {
                                              if (var36 != 0) {
                                                var34 = Math.max(var30, var36);
                                                var35 = hh.field_d;
                                                break L14;
                                              } else {
                                                var34 = 0;
                                                var35 = Math.min(var29_int, var37);
                                                break L14;
                                              }
                                            }
                                          }
                                          this.a(var4, var7 + var34, -1, var21, -var34 + var35, -var33 + var22, var33);
                                          var39++;
                                          continue L13;
                                        } else {
                                          var39++;
                                          continue L13;
                                        }
                                      }
                                    }
                                  } else {
                                    var42 = var20[(var9 + var31) % var12];
                                    var22 = Math.max(var22, var42[2]);
                                    var31++;
                                    continue L12;
                                  }
                                }
                              } else {
                                break L9;
                              }
                            }
                            var9 = var26_int;
                            break L4;
                          } else {
                            break L8;
                          }
                        }
                      }
                      var28++;
                      var26_int++;
                      if (var12 > var26_int) {
                        continue L7;
                      } else {
                        var26_int = 0;
                        continue L7;
                      }
                    }
                  }
                }
                L15: {
                  if (var24 + var22 <= bi.field_g) {
                    var10 = 0;
                    break L15;
                  } else {
                    var24 = bi.field_g + -var22;
                    break L15;
                  }
                }
                if (hh.field_d == var25) {
                  this.a(var55, var8 + var6, -1, var21, var23, var24, var22);
                  if (var10 != 0) {
                    break L1;
                  } else {
                    L16: {
                      var10 = 1;
                      int incrementValue$2 = var13;
                      var13++;
                      var45 = var19[incrementValue$2];
                      var26 = var45;
                      var45[1] = var25;
                      var45[0] = var8;
                      var26[2] = var24 + var22;
                      var27 = var20;
                      var46 = var19;
                      var19 = var27;
                      var12 = var13;
                      var13 = 0;
                      var7 = var6;
                      var6 = kla.a(hh.field_d, var21, param1 + -2147483648);
                      var5 = var6 - var7;
                      var8 = 0;
                      var28 = var5;
                      if (var28 >= 0) {
                        break L16;
                      } else {
                        var28 = var28 + hh.field_d;
                        break L16;
                      }
                    }
                    L17: {
                      if (hh.field_d >= var28) {
                        break L17;
                      } else {
                        var28 = var28 - hh.field_d;
                        break L17;
                      }
                    }
                    var9 = 0;
                    var11 = 0;
                    L18: while (true) {
                      L19: {
                        var29 = var46[var9];
                        if (var29[0] > var28) {
                          break L19;
                        } else {
                          if (var28 > var29[1]) {
                            break L19;
                          } else {
                            var9 = var9;
                            continue L2;
                          }
                        }
                      }
                      var9++;
                      if (var9 >= var12) {
                        var9 = 0;
                        continue L18;
                      } else {
                        continue L18;
                      }
                    }
                  }
                } else {
                  int incrementValue$3 = var13;
                  var13++;
                  var44 = var19[incrementValue$3];
                  var26 = var44;
                  var44[0] = var8;
                  var26[2] = var24 + var22;
                  var44[1] = var25;
                  this.a(var55, var6 + var8, -1, var21, var23, var24, var22);
                  var8 = var25;
                  continue L2;
                }
              }
            }
          } else {
            break L1;
          }
        }
        return var3;
    }

    private final void a(int[][] param0, int param1, int param2, Random param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int var13_int = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int[] stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int[] stackIn_28_2 = null;
        int stackIn_28_3 = 0;
        int[] stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int[] stackIn_29_2 = null;
        int stackIn_29_3 = 0;
        int[] stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        int[] stackIn_30_2 = null;
        int stackIn_30_3 = 0;
        int stackIn_30_4 = 0;
        int[] stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int[] stackIn_42_2 = null;
        int stackIn_42_3 = 0;
        int[] stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int[] stackIn_43_2 = null;
        int stackIn_43_3 = 0;
        int[] stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int[] stackIn_44_2 = null;
        int stackIn_44_3 = 0;
        int stackIn_44_4 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int[] stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int[] stackOut_27_2 = null;
        int stackOut_27_3 = 0;
        int[] stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int[] stackOut_29_2 = null;
        int stackOut_29_3 = 0;
        int stackOut_29_4 = 0;
        int[] stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int[] stackOut_28_2 = null;
        int stackOut_28_3 = 0;
        int stackOut_28_4 = 0;
        int[] stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int[] stackOut_41_2 = null;
        int stackOut_41_3 = 0;
        int[] stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        int[] stackOut_43_2 = null;
        int stackOut_43_3 = 0;
        int stackOut_43_4 = 0;
        int[] stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        int[] stackOut_42_2 = null;
        int stackOut_42_3 = 0;
        int stackOut_42_4 = 0;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        var23 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (((gt) this).field_u > 0) {
                stackOut_3_0 = 4096 - kla.a(((gt) this).field_u, param3, -2147483648);
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 4096;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var8_int = stackIn_4_0;
              var9 = ((gt) this).field_q * ((gt) this).field_o >> 12;
              stackOut_4_0 = ((gt) this).field_q;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (0 >= var9) {
                stackOut_6_0 = stackIn_6_0;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = stackIn_5_0;
                stackOut_5_1 = kla.a(var9, param3, -2147483648);
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              var10 = stackIn_7_0 - stackIn_7_1;
              if (hh.field_d > param1) {
                break L3;
              } else {
                param1 = param1 - hh.field_d;
                break L3;
              }
            }
            L4: {
              if (var10 <= 0) {
                if (hh.field_d >= param1 + param4) {
                  var11 = 0;
                  L5: while (true) {
                    if (var11 >= param5) {
                      break L4;
                    } else {
                      bl.a(param0[param6 + var11], param1, param4, var8_int);
                      var11++;
                      continue L5;
                    }
                  }
                } else {
                  var11 = hh.field_d + -param1;
                  var12 = 0;
                  L6: while (true) {
                    if (var12 >= param5) {
                      break L4;
                    } else {
                      var13 = param0[param6 - -var12];
                      bl.a(var13, param1, var11, var8_int);
                      bl.a(var13, 0, param4 - var11, var8_int);
                      var12++;
                      continue L6;
                    }
                  }
                }
              } else {
                L7: {
                  if (param5 <= 0) {
                    break L7;
                  } else {
                    if (param4 > 0) {
                      L8: {
                        var11 = param4 / 2;
                        var12 = param5 / 2;
                        if (var11 < var10) {
                          stackOut_16_0 = var11;
                          stackIn_17_0 = stackOut_16_0;
                          break L8;
                        } else {
                          stackOut_15_0 = var10;
                          stackIn_17_0 = stackOut_15_0;
                          break L8;
                        }
                      }
                      L9: {
                        var13_int = stackIn_17_0;
                        if (var12 >= var10) {
                          stackOut_19_0 = var10;
                          stackIn_20_0 = stackOut_19_0;
                          break L9;
                        } else {
                          stackOut_18_0 = var12;
                          stackIn_20_0 = stackOut_18_0;
                          break L9;
                        }
                      }
                      var14 = stackIn_20_0;
                      var15 = param1 + var13_int;
                      var16 = -(var13_int * 2) + param4;
                      var17 = 0;
                      L10: while (true) {
                        if (param5 <= var17) {
                          break L4;
                        } else {
                          L11: {
                            var18 = param0[param6 + var17];
                            if (var14 > var17) {
                              L12: {
                                var19 = var17 * var8_int / var14;
                                if (((gt) this).field_v == 0) {
                                  var20 = 0;
                                  L13: while (true) {
                                    if (var13_int <= var20) {
                                      break L12;
                                    } else {
                                      var21 = var8_int * var20 / var13_int;
                                      int dupTemp$5 = dda.a(wp.field_r, -1 + param4 + (param1 - var20));
                                      var18[dupTemp$5] = var19 * var21 >> 12;
                                      var18[dda.a(wp.field_r, param1 - -var20)] = var19 * var21 >> 12;
                                      var20++;
                                      continue L13;
                                    }
                                  }
                                } else {
                                  var20 = 0;
                                  L14: while (true) {
                                    if (var20 >= var13_int) {
                                      break L12;
                                    } else {
                                      L15: {
                                        var21 = var20 * var8_int / var13_int;
                                        stackOut_27_0 = (int[]) var18;
                                        stackOut_27_1 = dda.a(var20 + param1, wp.field_r);
                                        stackOut_27_2 = (int[]) var18;
                                        stackOut_27_3 = dda.a(-1 + -var20 + (param4 + param1), wp.field_r);
                                        stackIn_29_0 = stackOut_27_0;
                                        stackIn_29_1 = stackOut_27_1;
                                        stackIn_29_2 = stackOut_27_2;
                                        stackIn_29_3 = stackOut_27_3;
                                        stackIn_28_0 = stackOut_27_0;
                                        stackIn_28_1 = stackOut_27_1;
                                        stackIn_28_2 = stackOut_27_2;
                                        stackIn_28_3 = stackOut_27_3;
                                        if (var21 >= var19) {
                                          stackOut_29_0 = (int[]) (Object) stackIn_29_0;
                                          stackOut_29_1 = stackIn_29_1;
                                          stackOut_29_2 = (int[]) (Object) stackIn_29_2;
                                          stackOut_29_3 = stackIn_29_3;
                                          stackOut_29_4 = var19;
                                          stackIn_30_0 = stackOut_29_0;
                                          stackIn_30_1 = stackOut_29_1;
                                          stackIn_30_2 = stackOut_29_2;
                                          stackIn_30_3 = stackOut_29_3;
                                          stackIn_30_4 = stackOut_29_4;
                                          break L15;
                                        } else {
                                          stackOut_28_0 = (int[]) (Object) stackIn_28_0;
                                          stackOut_28_1 = stackIn_28_1;
                                          stackOut_28_2 = (int[]) (Object) stackIn_28_2;
                                          stackOut_28_3 = stackIn_28_3;
                                          stackOut_28_4 = var21;
                                          stackIn_30_0 = stackOut_28_0;
                                          stackIn_30_1 = stackOut_28_1;
                                          stackIn_30_2 = stackOut_28_2;
                                          stackIn_30_3 = stackOut_28_3;
                                          stackIn_30_4 = stackOut_28_4;
                                          break L15;
                                        }
                                      }
                                      stackIn_30_2[stackIn_30_3] = stackIn_30_4;
                                      stackIn_30_0[stackIn_30_1] = stackIn_30_4;
                                      var20++;
                                      continue L14;
                                    }
                                  }
                                }
                              }
                              if (var16 + var15 > hh.field_d) {
                                var20 = -var15 + hh.field_d;
                                bl.a(var18, var15, var20, var19);
                                bl.a(var18, 0, -var20 + var16, var19);
                                break L11;
                              } else {
                                bl.a(var18, var15, var16, var19);
                                break L11;
                              }
                            } else {
                              var19 = param5 + -var17 + -1;
                              if (var14 <= var19) {
                                var20 = 0;
                                L16: while (true) {
                                  if (var13_int <= var20) {
                                    if (var16 + var15 <= hh.field_d) {
                                      bl.a(var18, var15, var16, var8_int);
                                      break L11;
                                    } else {
                                      var20 = -var15 + hh.field_d;
                                      bl.a(var18, var15, var20, var8_int);
                                      bl.a(var18, 0, -var20 + var16, var8_int);
                                      break L11;
                                    }
                                  } else {
                                    int dupTemp$6 = dda.a(-var20 + param1 - (-param4 - -1), wp.field_r);
                                    var18[dupTemp$6] = var8_int * var20 / var13_int;
                                    var18[dda.a(var20 + param1, wp.field_r)] = var8_int * var20 / var13_int;
                                    var20++;
                                    continue L16;
                                  }
                                }
                              } else {
                                L17: {
                                  var20 = var19 * var8_int / var14;
                                  if (((gt) this).field_v == 0) {
                                    var21 = 0;
                                    L18: while (true) {
                                      if (var21 >= var13_int) {
                                        break L17;
                                      } else {
                                        var22 = var21 * var8_int / var13_int;
                                        int dupTemp$7 = dda.a(wp.field_r, -var21 + param1 - -param4 - 1);
                                        var18[dupTemp$7] = var22 * var20 >> 12;
                                        var18[dda.a(wp.field_r, param1 - -var21)] = var22 * var20 >> 12;
                                        var21++;
                                        continue L18;
                                      }
                                    }
                                  } else {
                                    var21 = 0;
                                    L19: while (true) {
                                      if (var13_int <= var21) {
                                        break L17;
                                      } else {
                                        L20: {
                                          var22 = var21 * var8_int / var13_int;
                                          stackOut_41_0 = (int[]) var18;
                                          stackOut_41_1 = dda.a(wp.field_r, param1 + var21);
                                          stackOut_41_2 = (int[]) var18;
                                          stackOut_41_3 = dda.a(wp.field_r, -1 + param4 + (param1 - var21));
                                          stackIn_43_0 = stackOut_41_0;
                                          stackIn_43_1 = stackOut_41_1;
                                          stackIn_43_2 = stackOut_41_2;
                                          stackIn_43_3 = stackOut_41_3;
                                          stackIn_42_0 = stackOut_41_0;
                                          stackIn_42_1 = stackOut_41_1;
                                          stackIn_42_2 = stackOut_41_2;
                                          stackIn_42_3 = stackOut_41_3;
                                          if (var22 >= var20) {
                                            stackOut_43_0 = (int[]) (Object) stackIn_43_0;
                                            stackOut_43_1 = stackIn_43_1;
                                            stackOut_43_2 = (int[]) (Object) stackIn_43_2;
                                            stackOut_43_3 = stackIn_43_3;
                                            stackOut_43_4 = var20;
                                            stackIn_44_0 = stackOut_43_0;
                                            stackIn_44_1 = stackOut_43_1;
                                            stackIn_44_2 = stackOut_43_2;
                                            stackIn_44_3 = stackOut_43_3;
                                            stackIn_44_4 = stackOut_43_4;
                                            break L20;
                                          } else {
                                            stackOut_42_0 = (int[]) (Object) stackIn_42_0;
                                            stackOut_42_1 = stackIn_42_1;
                                            stackOut_42_2 = (int[]) (Object) stackIn_42_2;
                                            stackOut_42_3 = stackIn_42_3;
                                            stackOut_42_4 = var22;
                                            stackIn_44_0 = stackOut_42_0;
                                            stackIn_44_1 = stackOut_42_1;
                                            stackIn_44_2 = stackOut_42_2;
                                            stackIn_44_3 = stackOut_42_3;
                                            stackIn_44_4 = stackOut_42_4;
                                            break L20;
                                          }
                                        }
                                        stackIn_44_2[stackIn_44_3] = stackIn_44_4;
                                        stackIn_44_0[stackIn_44_1] = stackIn_44_4;
                                        var21++;
                                        continue L19;
                                      }
                                    }
                                  }
                                }
                                if (hh.field_d >= var15 + var16) {
                                  bl.a(var18, var15, var16, var20);
                                  break L11;
                                } else {
                                  var21 = -var15 + hh.field_d;
                                  bl.a(var18, var15, var21, var20);
                                  bl.a(var18, 0, -var21 + var16, var20);
                                  break L11;
                                }
                              }
                            }
                          }
                          var17++;
                          continue L10;
                        }
                      }
                    } else {
                      break L7;
                    }
                  }
                }
                return;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var8 = decompiledCaughtException;
            stackOut_66_0 = (RuntimeException) var8;
            stackOut_66_1 = new StringBuilder().append("gt.F(");
            stackIn_68_0 = stackOut_66_0;
            stackIn_68_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param0 == null) {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L21;
            } else {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "{...}";
              stackIn_69_0 = stackOut_67_0;
              stackIn_69_1 = stackOut_67_1;
              stackIn_69_2 = stackOut_67_2;
              break L21;
            }
          }
          L22: {
            stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
            stackOut_69_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_69_2).append(',').append(param1).append(',').append(-1).append(',');
            stackIn_71_0 = stackOut_69_0;
            stackIn_71_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param3 == null) {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L22;
            } else {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "{...}";
              stackIn_72_0 = stackOut_70_0;
              stackIn_72_1 = stackOut_70_1;
              stackIn_72_2 = stackOut_70_2;
              break L22;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_72_0, stackIn_72_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void a(byte param0, lu param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var4_int = param2;
              if (0 != var4_int) {
                if (var4_int == 1) {
                  ((gt) this).field_n = param1.e((byte) 56);
                  break L1;
                } else {
                  if (var4_int != 2) {
                    if (var4_int == 3) {
                      ((gt) this).field_m = param1.e((byte) 82);
                      break L1;
                    } else {
                      if (4 != var4_int) {
                        if (var4_int == 5) {
                          ((gt) this).field_t = param1.e((byte) 80);
                          break L1;
                        } else {
                          if (var4_int != 6) {
                            if (var4_int == 7) {
                              ((gt) this).field_o = param1.e((byte) 104);
                              break L1;
                            } else {
                              if (var4_int != 8) {
                                break L1;
                              } else {
                                ((gt) this).field_u = param1.e((byte) 106);
                                break L1;
                              }
                            }
                          } else {
                            ((gt) this).field_v = param1.b(16711935);
                            break L1;
                          }
                        }
                      } else {
                        ((gt) this).field_k = param1.e((byte) 84);
                        break L1;
                      }
                    }
                  } else {
                    ((gt) this).field_p = param1.e((byte) 64);
                    break L1;
                  }
                }
              } else {
                ((gt) this).field_w = param1.b(param0 ^ -16711866);
                break L1;
              }
            }
            L2: {
              if (param0 == -71) {
                break L2;
              } else {
                ((gt) this).field_k = -21;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var4;
            stackOut_27_1 = new StringBuilder().append("gt.E(").append(param0).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L3;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param2 + ')');
        }
    }

    final static String a(int param0, byte[] param1, byte param2, int param3) {
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        char[] var13 = null;
        char[] var14 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_16_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var14 = new char[param3];
              var13 = var14;
              var12 = var13;
              var11 = var12;
              var4 = var11;
              var5 = 0;
              if (param2 == 104) {
                break L1;
              } else {
                var10 = null;
                String discarded$4 = gt.a(15, (byte[]) null, (byte) 43, 15);
                break L1;
              }
            }
            var6 = 0;
            L2: while (true) {
              if (var6 >= param3) {
                stackOut_16_0 = new String(var14, 0, var5);
                stackIn_17_0 = stackOut_16_0;
                break L0;
              } else {
                L3: {
                  var7 = 255 & param1[var6 + param0];
                  if (var7 != 0) {
                    L4: {
                      if (var7 < 128) {
                        break L4;
                      } else {
                        if (var7 < 160) {
                          L5: {
                            var8 = on.field_s[var7 - 128];
                            if (0 == var8) {
                              var8 = 63;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          var7 = var8;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    int incrementValue$5 = var5;
                    var5++;
                    var4[incrementValue$5] = (char)var7;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var6++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var4_ref;
            stackOut_18_1 = new StringBuilder().append("gt.C(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_17_0;
    }

    final void d(byte param0) {
        if (param0 != -68) {
            field_s = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Accept draw";
        field_l = new java.util.zip.CRC32();
    }
}
