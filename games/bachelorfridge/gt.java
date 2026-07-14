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

    public static void d(int param0) {
        field_l = null;
        int var1 = -120 / ((-48 - param0) / 58);
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
            var14 = ((gt) this).field_n * hh.field_d >> 654062380;
            var15 = hh.field_d * ((gt) this).field_p >> -145413140;
            var16 = ((gt) this).field_m * bi.field_g >> -1235488052;
            var17 = ((gt) this).field_k * bi.field_g >> -1540194164;
            if (-2 <= (var17 ^ -1)) {
              return var55[param0];
            } else {
              ((gt) this).field_q = hh.field_d / 8 * ((gt) this).field_t >> -119651028;
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
                      if (-1 < (var29_int ^ -1)) {
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
                                  if ((var30 ^ -1) > -1) {
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
                      var13++;
                      var45 = var19[var13];
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
                      if ((var28 ^ -1) <= -1) {
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
                  var13++;
                  var44 = var19[var13];
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
        int var8 = 0;
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
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int[] stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int[] stackIn_26_2 = null;
        int stackIn_26_3 = 0;
        int[] stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int[] stackIn_27_2 = null;
        int stackIn_27_3 = 0;
        int[] stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int[] stackIn_28_2 = null;
        int stackIn_28_3 = 0;
        int stackIn_28_4 = 0;
        int[] stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int[] stackIn_40_2 = null;
        int stackIn_40_3 = 0;
        int[] stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int[] stackIn_41_2 = null;
        int stackIn_41_3 = 0;
        int[] stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int[] stackIn_42_2 = null;
        int stackIn_42_3 = 0;
        int stackIn_42_4 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int[] stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int[] stackOut_25_2 = null;
        int stackOut_25_3 = 0;
        int[] stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int[] stackOut_27_2 = null;
        int stackOut_27_3 = 0;
        int stackOut_27_4 = 0;
        int[] stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int[] stackOut_26_2 = null;
        int stackOut_26_3 = 0;
        int stackOut_26_4 = 0;
        int[] stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int[] stackOut_39_2 = null;
        int stackOut_39_3 = 0;
        int[] stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int[] stackOut_41_2 = null;
        int stackOut_41_3 = 0;
        int stackOut_41_4 = 0;
        int[] stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        int[] stackOut_40_2 = null;
        int stackOut_40_3 = 0;
        int stackOut_40_4 = 0;
        L0: {
          var23 = BachelorFridge.field_y;
          if ((((gt) this).field_u ^ -1) < param2) {
            stackOut_2_0 = 4096 - kla.a(((gt) this).field_u, param3, -2147483648);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 4096;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var8 = stackIn_3_0;
          var9 = ((gt) this).field_q * ((gt) this).field_o >> 276144460;
          stackOut_3_0 = ((gt) this).field_q;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (0 >= var9) {
            stackOut_5_0 = stackIn_5_0;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = stackIn_4_0;
            stackOut_4_1 = kla.a(var9, param3, -2147483648);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        L2: {
          var10 = stackIn_6_0 - stackIn_6_1;
          if (hh.field_d > param1) {
            break L2;
          } else {
            param1 = param1 - hh.field_d;
            break L2;
          }
        }
        L3: {
          if (var10 <= 0) {
            if (hh.field_d >= param1 + param4) {
              var11 = 0;
              L4: while (true) {
                if (var11 >= param5) {
                  break L3;
                } else {
                  bl.a(param0[param6 + var11], param1, param4, var8);
                  var11++;
                  continue L4;
                }
              }
            } else {
              var11 = hh.field_d + -param1;
              var12 = 0;
              L5: while (true) {
                if (var12 >= param5) {
                  break L3;
                } else {
                  var13 = param0[param6 - -var12];
                  bl.a(var13, param1, var11, var8);
                  bl.a(var13, 0, param4 - var11, var8);
                  var12++;
                  continue L5;
                }
              }
            }
          } else {
            if (param5 <= 0) {
              return;
            } else {
              if (-1 > (param4 ^ -1)) {
                L6: {
                  var11 = param4 / 2;
                  var12 = param5 / 2;
                  if (var11 < var10) {
                    stackOut_14_0 = var11;
                    stackIn_15_0 = stackOut_14_0;
                    break L6;
                  } else {
                    stackOut_13_0 = var10;
                    stackIn_15_0 = stackOut_13_0;
                    break L6;
                  }
                }
                L7: {
                  var13_int = stackIn_15_0;
                  if (var12 >= var10) {
                    stackOut_17_0 = var10;
                    stackIn_18_0 = stackOut_17_0;
                    break L7;
                  } else {
                    stackOut_16_0 = var12;
                    stackIn_18_0 = stackOut_16_0;
                    break L7;
                  }
                }
                var14 = stackIn_18_0;
                var15 = param1 + var13_int;
                var16 = -(var13_int * 2) + param4;
                var17 = 0;
                L8: while (true) {
                  if (param5 <= var17) {
                    break L3;
                  } else {
                    var18 = param0[param6 + var17];
                    if (var14 > var17) {
                      L9: {
                        var19 = var17 * var8 / var14;
                        if (((gt) this).field_v == 0) {
                          var20 = 0;
                          L10: while (true) {
                            if (var13_int <= var20) {
                              break L9;
                            } else {
                              var21 = var8 * var20 / var13_int;
                              var18[dda.a(wp.field_r, -1 + param4 + (param1 - var20))] = var19 * var21 >> -1711849748;
                              var18[dda.a(wp.field_r, param1 - -var20)] = var19 * var21 >> -1711849748;
                              var20++;
                              continue L10;
                            }
                          }
                        } else {
                          var20 = 0;
                          L11: while (true) {
                            if (var20 >= var13_int) {
                              break L9;
                            } else {
                              L12: {
                                var21 = var20 * var8 / var13_int;
                                stackOut_25_0 = (int[]) var18;
                                stackOut_25_1 = dda.a(var20 + param1, wp.field_r);
                                stackOut_25_2 = (int[]) var18;
                                stackOut_25_3 = dda.a(-1 + -var20 + (param4 + param1), wp.field_r);
                                stackIn_27_0 = stackOut_25_0;
                                stackIn_27_1 = stackOut_25_1;
                                stackIn_27_2 = stackOut_25_2;
                                stackIn_27_3 = stackOut_25_3;
                                stackIn_26_0 = stackOut_25_0;
                                stackIn_26_1 = stackOut_25_1;
                                stackIn_26_2 = stackOut_25_2;
                                stackIn_26_3 = stackOut_25_3;
                                if (var21 >= var19) {
                                  stackOut_27_0 = (int[]) (Object) stackIn_27_0;
                                  stackOut_27_1 = stackIn_27_1;
                                  stackOut_27_2 = (int[]) (Object) stackIn_27_2;
                                  stackOut_27_3 = stackIn_27_3;
                                  stackOut_27_4 = var19;
                                  stackIn_28_0 = stackOut_27_0;
                                  stackIn_28_1 = stackOut_27_1;
                                  stackIn_28_2 = stackOut_27_2;
                                  stackIn_28_3 = stackOut_27_3;
                                  stackIn_28_4 = stackOut_27_4;
                                  break L12;
                                } else {
                                  stackOut_26_0 = (int[]) (Object) stackIn_26_0;
                                  stackOut_26_1 = stackIn_26_1;
                                  stackOut_26_2 = (int[]) (Object) stackIn_26_2;
                                  stackOut_26_3 = stackIn_26_3;
                                  stackOut_26_4 = var21;
                                  stackIn_28_0 = stackOut_26_0;
                                  stackIn_28_1 = stackOut_26_1;
                                  stackIn_28_2 = stackOut_26_2;
                                  stackIn_28_3 = stackOut_26_3;
                                  stackIn_28_4 = stackOut_26_4;
                                  break L12;
                                }
                              }
                              stackIn_28_2[stackIn_28_3] = stackIn_28_4;
                              stackIn_28_0[stackIn_28_1] = stackIn_28_4;
                              var20++;
                              continue L11;
                            }
                          }
                        }
                      }
                      if (var16 + var15 > hh.field_d) {
                        var20 = -var15 + hh.field_d;
                        bl.a(var18, var15, var20, var19);
                        bl.a(var18, 0, -var20 + var16, var19);
                        var17++;
                        continue L8;
                      } else {
                        bl.a(var18, var15, var16, var19);
                        var17++;
                        continue L8;
                      }
                    } else {
                      var19 = param5 + -var17 + -1;
                      if (var14 <= var19) {
                        var20 = 0;
                        L13: while (true) {
                          if (var13_int <= var20) {
                            if (var16 + var15 <= hh.field_d) {
                              bl.a(var18, var15, var16, var8);
                              var17++;
                              continue L8;
                            } else {
                              var20 = -var15 + hh.field_d;
                              bl.a(var18, var15, var20, var8);
                              bl.a(var18, 0, -var20 + var16, var8);
                              var17++;
                              continue L8;
                            }
                          } else {
                            var18[dda.a(-var20 + param1 - (-param4 - -1), wp.field_r)] = var8 * var20 / var13_int;
                            var18[dda.a(var20 + param1, wp.field_r)] = var8 * var20 / var13_int;
                            var20++;
                            continue L13;
                          }
                        }
                      } else {
                        L14: {
                          var20 = var19 * var8 / var14;
                          if (-1 == (((gt) this).field_v ^ -1)) {
                            var21 = 0;
                            L15: while (true) {
                              if (var21 >= var13_int) {
                                break L14;
                              } else {
                                var22 = var21 * var8 / var13_int;
                                var18[dda.a(wp.field_r, -var21 + param1 - -param4 - 1)] = var22 * var20 >> 569316140;
                                var18[dda.a(wp.field_r, param1 - -var21)] = var22 * var20 >> 569316140;
                                var21++;
                                continue L15;
                              }
                            }
                          } else {
                            var21 = 0;
                            L16: while (true) {
                              if (var13_int <= var21) {
                                break L14;
                              } else {
                                L17: {
                                  var22 = var21 * var8 / var13_int;
                                  stackOut_39_0 = (int[]) var18;
                                  stackOut_39_1 = dda.a(wp.field_r, param1 + var21);
                                  stackOut_39_2 = (int[]) var18;
                                  stackOut_39_3 = dda.a(wp.field_r, -1 + param4 + (param1 - var21));
                                  stackIn_41_0 = stackOut_39_0;
                                  stackIn_41_1 = stackOut_39_1;
                                  stackIn_41_2 = stackOut_39_2;
                                  stackIn_41_3 = stackOut_39_3;
                                  stackIn_40_0 = stackOut_39_0;
                                  stackIn_40_1 = stackOut_39_1;
                                  stackIn_40_2 = stackOut_39_2;
                                  stackIn_40_3 = stackOut_39_3;
                                  if (var22 >= var20) {
                                    stackOut_41_0 = (int[]) (Object) stackIn_41_0;
                                    stackOut_41_1 = stackIn_41_1;
                                    stackOut_41_2 = (int[]) (Object) stackIn_41_2;
                                    stackOut_41_3 = stackIn_41_3;
                                    stackOut_41_4 = var20;
                                    stackIn_42_0 = stackOut_41_0;
                                    stackIn_42_1 = stackOut_41_1;
                                    stackIn_42_2 = stackOut_41_2;
                                    stackIn_42_3 = stackOut_41_3;
                                    stackIn_42_4 = stackOut_41_4;
                                    break L17;
                                  } else {
                                    stackOut_40_0 = (int[]) (Object) stackIn_40_0;
                                    stackOut_40_1 = stackIn_40_1;
                                    stackOut_40_2 = (int[]) (Object) stackIn_40_2;
                                    stackOut_40_3 = stackIn_40_3;
                                    stackOut_40_4 = var22;
                                    stackIn_42_0 = stackOut_40_0;
                                    stackIn_42_1 = stackOut_40_1;
                                    stackIn_42_2 = stackOut_40_2;
                                    stackIn_42_3 = stackOut_40_3;
                                    stackIn_42_4 = stackOut_40_4;
                                    break L17;
                                  }
                                }
                                stackIn_42_2[stackIn_42_3] = stackIn_42_4;
                                stackIn_42_0[stackIn_42_1] = stackIn_42_4;
                                var21++;
                                continue L16;
                              }
                            }
                          }
                        }
                        if (hh.field_d >= var15 + var16) {
                          bl.a(var18, var15, var16, var20);
                          var17++;
                          continue L8;
                        } else {
                          var21 = -var15 + hh.field_d;
                          bl.a(var18, var15, var21, var20);
                          bl.a(var18, 0, -var21 + var16, var20);
                          var17++;
                          continue L8;
                        }
                      }
                    }
                  }
                }
              } else {
                return;
              }
            }
          }
        }
    }

    final void a(byte param0, lu param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = BachelorFridge.field_y;
          var4 = param2;
          if (0 != var4) {
            if (var4 == 1) {
              ((gt) this).field_n = param1.e((byte) 56);
              break L0;
            } else {
              if (-3 != var4) {
                if (-4 == var4) {
                  ((gt) this).field_m = param1.e((byte) 82);
                  break L0;
                } else {
                  if (4 != var4) {
                    if (-6 == var4) {
                      ((gt) this).field_t = param1.e((byte) 80);
                      break L0;
                    } else {
                      if (-7 != var4) {
                        if (-8 == (var4 ^ -1)) {
                          ((gt) this).field_o = param1.e((byte) 104);
                          break L0;
                        } else {
                          if (var4 != 8) {
                            break L0;
                          } else {
                            ((gt) this).field_u = param1.e((byte) 106);
                            break L0;
                          }
                        }
                      } else {
                        ((gt) this).field_v = param1.b(16711935);
                        break L0;
                      }
                    }
                  } else {
                    ((gt) this).field_k = param1.e((byte) 84);
                    break L0;
                  }
                }
              } else {
                ((gt) this).field_p = param1.e((byte) 64);
                break L0;
              }
            }
          } else {
            ((gt) this).field_w = param1.b(param0 ^ -16711866);
            break L0;
          }
        }
        L1: {
          if (param0 == -71) {
            break L1;
          } else {
            ((gt) this).field_k = -21;
            break L1;
          }
        }
    }

    final static String a(int param0, byte[] param1, byte param2, int param3) {
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        L0: {
          var9 = BachelorFridge.field_y;
          var12 = new char[param3];
          var11 = var12;
          var4 = var11;
          var5 = 0;
          if (param2 == 104) {
            break L0;
          } else {
            var10 = null;
            String discarded$2 = gt.a(15, (byte[]) null, (byte) 43, 15);
            break L0;
          }
        }
        var6 = 0;
        L1: while (true) {
          if (var6 >= param3) {
            return new String(var12, 0, var5);
          } else {
            var7 = 255 & param1[var6 + param0];
            if (-1 != (var7 ^ -1)) {
              L2: {
                if (var7 > -129) {
                  break L2;
                } else {
                  if (-161 > var7) {
                    L3: {
                      var8 = on.field_s[var7 - 128];
                      if (0 == var8) {
                        var8 = 63;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var7 = var8;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              var5++;
              var4[var5] = (char)var7;
              var6++;
              continue L1;
            } else {
              var6++;
              continue L1;
            }
          }
        }
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
