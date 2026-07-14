/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class iia extends ci {
    static String field_q;
    private int field_u;
    private int field_p;
    private int field_w;
    static int[] field_v;
    private int field_y;
    private int field_s;
    private int field_x;
    private int field_m;
    private int field_n;
    private int field_o;
    static jea field_r;
    private int field_t;

    private final void a(int param0, int param1, int[][] param2, byte param3, int param4, int param5, Random param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13_ref_int__ = null;
        int var13 = 0;
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
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int[] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int[] stackIn_38_2 = null;
        int stackIn_38_3 = 0;
        int[] stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int[] stackIn_39_2 = null;
        int stackIn_39_3 = 0;
        int[] stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int[] stackIn_40_2 = null;
        int stackIn_40_3 = 0;
        int stackIn_40_4 = 0;
        int[] stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        int[] stackIn_49_2 = null;
        int stackIn_49_3 = 0;
        int[] stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int[] stackIn_50_2 = null;
        int stackIn_50_3 = 0;
        int[] stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        int[] stackIn_51_2 = null;
        int stackIn_51_3 = 0;
        int stackIn_51_4 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int[] stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        int[] stackOut_48_2 = null;
        int stackOut_48_3 = 0;
        int[] stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        int[] stackOut_50_2 = null;
        int stackOut_50_3 = 0;
        int stackOut_50_4 = 0;
        int[] stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int[] stackOut_49_2 = null;
        int stackOut_49_3 = 0;
        int stackOut_49_4 = 0;
        int[] stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int[] stackOut_37_2 = null;
        int stackOut_37_3 = 0;
        int[] stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int[] stackOut_39_2 = null;
        int stackOut_39_3 = 0;
        int stackOut_39_4 = 0;
        int[] stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int[] stackOut_38_2 = null;
        int stackOut_38_3 = 0;
        int stackOut_38_4 = 0;
        L0: {
          var23 = TombRacer.field_G ? 1 : 0;
          if (((iia) this).field_m <= 0) {
            stackOut_2_0 = 4096;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 4096 + -jqa.a(((iia) this).field_m, param6, 66);
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var8 = stackIn_3_0;
          var9 = ((iia) this).field_u * ((iia) this).field_o >> -860281044;
          stackOut_3_0 = ((iia) this).field_o;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (var9 > 0) {
            stackOut_5_0 = stackIn_5_0;
            stackOut_5_1 = jqa.a(var9, param6, 83);
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = stackIn_4_0;
            stackOut_4_1 = 0;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        L2: {
          var10 = stackIn_6_0 - stackIn_6_1;
          if (param3 <= -30) {
            break L2;
          } else {
            ((iia) this).field_y = -123;
            break L2;
          }
        }
        L3: {
          if (ns.field_g <= param1) {
            param1 = param1 - ns.field_g;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (0 < var10) {
            if (param0 >= -1) {
              return;
            } else {
              if (-1 < param4) {
                L5: {
                  var11 = param4 / 2;
                  var12 = param0 / 2;
                  if (var11 < var10) {
                    stackOut_24_0 = var11;
                    stackIn_25_0 = stackOut_24_0;
                    break L5;
                  } else {
                    stackOut_23_0 = var10;
                    stackIn_25_0 = stackOut_23_0;
                    break L5;
                  }
                }
                L6: {
                  var13 = stackIn_25_0;
                  if (var12 < var10) {
                    stackOut_27_0 = var12;
                    stackIn_28_0 = stackOut_27_0;
                    break L6;
                  } else {
                    stackOut_26_0 = var10;
                    stackIn_28_0 = stackOut_26_0;
                    break L6;
                  }
                }
                var14 = stackIn_28_0;
                var15 = param1 - -var13;
                var16 = -(2 * var13) + param4;
                var17 = 0;
                L7: while (true) {
                  if (var17 >= param0) {
                    break L4;
                  } else {
                    var18 = param2[var17 + param5];
                    if (var14 <= var17) {
                      var19 = -var17 + param0 + -1;
                      if (var14 <= var19) {
                        var20 = 0;
                        L8: while (true) {
                          if (var13 <= var20) {
                            if (var16 + var15 > ns.field_g) {
                              var20 = ns.field_g - var15;
                              lua.a(var18, var15, var20, var8);
                              lua.a(var18, 0, -var20 + var16, var8);
                              var17++;
                              continue L7;
                            } else {
                              lua.a(var18, var15, var16, var8);
                              var17++;
                              continue L7;
                            }
                          } else {
                            var18[sea.c(una.field_b, -var20 + param4 + param1 - 1)] = var8 * var20 / var13;
                            var18[sea.c(una.field_b, param1 - -var20)] = var8 * var20 / var13;
                            var20++;
                            continue L8;
                          }
                        }
                      } else {
                        L9: {
                          var20 = var8 * var19 / var14;
                          if (((iia) this).field_t == 0) {
                            var21 = 0;
                            L10: while (true) {
                              if (var21 >= var13) {
                                break L9;
                              } else {
                                var22 = var21 * var8 / var13;
                                var18[sea.c(una.field_b, -1 + param4 + param1 - var21)] = var20 * var22 >> -901914740;
                                var18[sea.c(var21 + param1, una.field_b)] = var20 * var22 >> -901914740;
                                var21++;
                                continue L10;
                              }
                            }
                          } else {
                            var21 = 0;
                            L11: while (true) {
                              if (var13 <= var21) {
                                break L9;
                              } else {
                                L12: {
                                  var22 = var8 * var21 / var13;
                                  stackOut_48_0 = (int[]) var18;
                                  stackOut_48_1 = sea.c(param1 - -var21, una.field_b);
                                  stackOut_48_2 = (int[]) var18;
                                  stackOut_48_3 = sea.c(-1 + -var21 + param1 - -param4, una.field_b);
                                  stackIn_50_0 = stackOut_48_0;
                                  stackIn_50_1 = stackOut_48_1;
                                  stackIn_50_2 = stackOut_48_2;
                                  stackIn_50_3 = stackOut_48_3;
                                  stackIn_49_0 = stackOut_48_0;
                                  stackIn_49_1 = stackOut_48_1;
                                  stackIn_49_2 = stackOut_48_2;
                                  stackIn_49_3 = stackOut_48_3;
                                  if (var22 < var20) {
                                    stackOut_50_0 = (int[]) (Object) stackIn_50_0;
                                    stackOut_50_1 = stackIn_50_1;
                                    stackOut_50_2 = (int[]) (Object) stackIn_50_2;
                                    stackOut_50_3 = stackIn_50_3;
                                    stackOut_50_4 = var22;
                                    stackIn_51_0 = stackOut_50_0;
                                    stackIn_51_1 = stackOut_50_1;
                                    stackIn_51_2 = stackOut_50_2;
                                    stackIn_51_3 = stackOut_50_3;
                                    stackIn_51_4 = stackOut_50_4;
                                    break L12;
                                  } else {
                                    stackOut_49_0 = (int[]) (Object) stackIn_49_0;
                                    stackOut_49_1 = stackIn_49_1;
                                    stackOut_49_2 = (int[]) (Object) stackIn_49_2;
                                    stackOut_49_3 = stackIn_49_3;
                                    stackOut_49_4 = var20;
                                    stackIn_51_0 = stackOut_49_0;
                                    stackIn_51_1 = stackOut_49_1;
                                    stackIn_51_2 = stackOut_49_2;
                                    stackIn_51_3 = stackOut_49_3;
                                    stackIn_51_4 = stackOut_49_4;
                                    break L12;
                                  }
                                }
                                stackIn_51_2[stackIn_51_3] = stackIn_51_4;
                                stackIn_51_0[stackIn_51_1] = stackIn_51_4;
                                var21++;
                                continue L11;
                              }
                            }
                          }
                        }
                        if (var16 + var15 > ns.field_g) {
                          var21 = -var15 + ns.field_g;
                          lua.a(var18, var15, var21, var20);
                          lua.a(var18, 0, -var21 + var16, var20);
                          var17++;
                          continue L7;
                        } else {
                          lua.a(var18, var15, var16, var20);
                          var17++;
                          continue L7;
                        }
                      }
                    } else {
                      L13: {
                        var19 = var17 * var8 / var14;
                        if (-1 != (((iia) this).field_t ^ -1)) {
                          var20 = 0;
                          L14: while (true) {
                            if (var20 >= var13) {
                              break L13;
                            } else {
                              L15: {
                                var21 = var8 * var20 / var13;
                                stackOut_37_0 = (int[]) var18;
                                stackOut_37_1 = sea.c(var20 + param1, una.field_b);
                                stackOut_37_2 = (int[]) var18;
                                stackOut_37_3 = sea.c(-var20 + (param1 - -param4 + -1), una.field_b);
                                stackIn_39_0 = stackOut_37_0;
                                stackIn_39_1 = stackOut_37_1;
                                stackIn_39_2 = stackOut_37_2;
                                stackIn_39_3 = stackOut_37_3;
                                stackIn_38_0 = stackOut_37_0;
                                stackIn_38_1 = stackOut_37_1;
                                stackIn_38_2 = stackOut_37_2;
                                stackIn_38_3 = stackOut_37_3;
                                if (var21 < var19) {
                                  stackOut_39_0 = (int[]) (Object) stackIn_39_0;
                                  stackOut_39_1 = stackIn_39_1;
                                  stackOut_39_2 = (int[]) (Object) stackIn_39_2;
                                  stackOut_39_3 = stackIn_39_3;
                                  stackOut_39_4 = var21;
                                  stackIn_40_0 = stackOut_39_0;
                                  stackIn_40_1 = stackOut_39_1;
                                  stackIn_40_2 = stackOut_39_2;
                                  stackIn_40_3 = stackOut_39_3;
                                  stackIn_40_4 = stackOut_39_4;
                                  break L15;
                                } else {
                                  stackOut_38_0 = (int[]) (Object) stackIn_38_0;
                                  stackOut_38_1 = stackIn_38_1;
                                  stackOut_38_2 = (int[]) (Object) stackIn_38_2;
                                  stackOut_38_3 = stackIn_38_3;
                                  stackOut_38_4 = var19;
                                  stackIn_40_0 = stackOut_38_0;
                                  stackIn_40_1 = stackOut_38_1;
                                  stackIn_40_2 = stackOut_38_2;
                                  stackIn_40_3 = stackOut_38_3;
                                  stackIn_40_4 = stackOut_38_4;
                                  break L15;
                                }
                              }
                              stackIn_40_2[stackIn_40_3] = stackIn_40_4;
                              stackIn_40_0[stackIn_40_1] = stackIn_40_4;
                              var20++;
                              continue L14;
                            }
                          }
                        } else {
                          var20 = 0;
                          L16: while (true) {
                            if (var13 <= var20) {
                              break L13;
                            } else {
                              var21 = var8 * var20 / var13;
                              var18[sea.c(-var20 + (param4 + (param1 - 1)), una.field_b)] = var21 * var19 >> 148820524;
                              var18[sea.c(var20 + param1, una.field_b)] = var21 * var19 >> 148820524;
                              var20++;
                              continue L16;
                            }
                          }
                        }
                      }
                      if (ns.field_g >= var15 + var16) {
                        lua.a(var18, var15, var16, var19);
                        var17++;
                        continue L7;
                      } else {
                        var20 = -var15 + ns.field_g;
                        lua.a(var18, var15, var20, var19);
                        lua.a(var18, 0, var16 + -var20, var19);
                        var17++;
                        continue L7;
                      }
                    }
                  }
                }
              } else {
                return;
              }
            }
          } else {
            if (ns.field_g >= param1 - -param4) {
              var11 = 0;
              L17: while (true) {
                if (var11 >= param0) {
                  break L4;
                } else {
                  lua.a(param2[param5 + var11], param1, param4, var8);
                  var11++;
                  continue L17;
                }
              }
            } else {
              var11 = -param1 + ns.field_g;
              var12 = 0;
              L18: while (true) {
                if (param0 <= var12) {
                  break L4;
                } else {
                  var13_ref_int__ = param2[var12 + param5];
                  lua.a(var13_ref_int__, param1, var11, var8);
                  lua.a(var13_ref_int__, 0, param4 - var11, var8);
                  var12++;
                  continue L18;
                }
              }
            }
          }
        }
    }

    final static int d(int param0, int param1) {
        int var2 = 0;
        if (param1 == 22972) {
          var2 = 1;
          L0: while (true) {
            if (1 << var2 > param0) {
              return var2;
            } else {
              var2++;
              continue L0;
            }
          }
        } else {
          return -94;
        }
    }

    final static int d(int param0, int param1, int param2) {
        if (param2 != 2) {
            return 39;
        }
        if (param0 >= param1) {
            return param0;
        }
        return param1;
    }

    final void a(byte param0, uia param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = TombRacer.field_G ? 1 : 0;
          if (param0 == 107) {
            break L0;
          } else {
            ((iia) this).field_y = 101;
            break L0;
          }
        }
        L1: {
          var4 = param2;
          if (-1 != var4) {
            if (1 == var4) {
              ((iia) this).field_p = param1.d(param0 ^ 21);
              break L1;
            } else {
              if (2 != var4) {
                if (-4 != var4) {
                  if (4 == var4) {
                    ((iia) this).field_w = param1.d(126);
                    break L1;
                  } else {
                    if (5 == var4) {
                      ((iia) this).field_n = param1.d(122);
                      break L1;
                    } else {
                      if (-7 == var4) {
                        ((iia) this).field_t = param1.h(255);
                        break L1;
                      } else {
                        if (-8 == var4) {
                          ((iia) this).field_u = param1.d(125);
                          break L1;
                        } else {
                          if (8 == var4) {
                            ((iia) this).field_m = param1.d(126);
                            break L1;
                          } else {
                            break L1;
                          }
                        }
                      }
                    }
                  }
                } else {
                  ((iia) this).field_y = param1.d(param0 ^ 22);
                  break L1;
                }
              } else {
                ((iia) this).field_s = param1.d(124);
                break L1;
              }
            }
          } else {
            ((iia) this).field_x = param1.h(255);
            break L1;
          }
        }
    }

    public iia() {
        super(0, true);
        ((iia) this).field_s = 2048;
        ((iia) this).field_p = 1024;
        ((iia) this).field_x = 0;
        ((iia) this).field_w = 819;
        ((iia) this).field_y = 409;
        ((iia) this).field_n = 1024;
        ((iia) this).field_m = 1024;
        ((iia) this).field_t = 0;
        ((iia) this).field_u = 1024;
    }

    final void b(byte param0) {
        if (param0 != 116) {
            ((iia) this).field_t = 123;
        }
    }

    final int[] c(int param0, int param1) {
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
        int[][] var39 = null;
        int[] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        int[][] var44 = null;
        int[] var45 = null;
        int[][] var46 = null;
        int[][] var47 = null;
        int[][] var50 = null;
        int[][] var51 = null;
        int[][] var54 = null;
        int[][] var55 = null;
        int[] var56 = null;
        int[] var57 = null;
        var38 = TombRacer.field_G ? 1 : 0;
        if (param0 == 1) {
          L0: {
            var3 = ((iia) this).field_i.a((byte) 120, param1);
            if (((iia) this).field_i.field_d) {
              var54 = ((iia) this).field_i.a(param0 ^ 1);
              var50 = var54;
              var46 = var50;
              var39 = var46;
              var4 = var39;
              var5 = 0;
              var6 = 0;
              var7 = 0;
              var8 = 0;
              var9 = 0;
              var10 = 1;
              var11 = 1;
              var12 = 0;
              var13 = 0;
              var14 = ((iia) this).field_p * ns.field_g >> 1850047884;
              var15 = ns.field_g * ((iia) this).field_s >> 43974156;
              var16 = qda.field_i * ((iia) this).field_y >> -1955949556;
              var17 = ((iia) this).field_w * qda.field_i >> 2127772780;
              if (-2 <= (var17 ^ -1)) {
                return var54[param1];
              } else {
                ((iia) this).field_o = ns.field_g / 8 * ((iia) this).field_n >> 1588390636;
                var18 = ns.field_g / var14 + 1;
                var19 = new int[var18][3];
                var55 = new int[var18][3];
                var51 = var55;
                var47 = var51;
                var20 = var47;
                var21 = new Random((long)((iia) this).field_x);
                L1: while (true) {
                  L2: {
                    var23 = var14 - -jqa.a(-var14 + var15, var21, 126);
                    var24 = var16 + jqa.a(-var16 + var17, var21, 96);
                    var25 = var8 + var23;
                    if (ns.field_g < var25) {
                      var25 = ns.field_g;
                      var23 = ns.field_g - var8;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (var11 != 0) {
                      var22 = 0;
                      break L3;
                    } else {
                      L4: {
                        var26_int = var9;
                        var57 = var55[var9];
                        var28 = 0;
                        var29_int = var5 + var25;
                        if (0 <= var29_int) {
                          break L4;
                        } else {
                          var29_int = var29_int + ns.field_g;
                          break L4;
                        }
                      }
                      L5: {
                        if (ns.field_g < var29_int) {
                          var29_int = var29_int - ns.field_g;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L6: while (true) {
                        L7: {
                          var56 = var55[var26_int];
                          if (var29_int < var56[0]) {
                            break L7;
                          } else {
                            if (var56[1] >= var29_int) {
                              L8: {
                                var22 = var57[2];
                                if (var9 == var26_int) {
                                  break L8;
                                } else {
                                  L9: {
                                    var30 = var5 + var8;
                                    if (-1 >= (var30 ^ -1)) {
                                      break L9;
                                    } else {
                                      var30 = var30 + ns.field_g;
                                      break L9;
                                    }
                                  }
                                  L10: {
                                    if (ns.field_g >= var30) {
                                      break L10;
                                    } else {
                                      var30 = var30 - ns.field_g;
                                      break L10;
                                    }
                                  }
                                  var31 = 1;
                                  L11: while (true) {
                                    if (var31 > var28) {
                                      var31 = 0;
                                      L12: while (true) {
                                        if (var31 > var28) {
                                          break L8;
                                        } else {
                                          var42 = var20[(var9 - -var31) % var12];
                                          var33 = var42[2];
                                          if (var33 != var22) {
                                            L13: {
                                              var36 = var42[0];
                                              var37 = var42[1];
                                              if (var30 >= var29_int) {
                                                if (var36 == 0) {
                                                  var34 = 0;
                                                  var35 = Math.min(var29_int, var37);
                                                  break L13;
                                                } else {
                                                  var34 = Math.max(var30, var36);
                                                  var35 = ns.field_g;
                                                  break L13;
                                                }
                                              } else {
                                                var34 = Math.max(var30, var36);
                                                var35 = Math.min(var29_int, var37);
                                                break L13;
                                              }
                                            }
                                            this.a(-var33 + var22, var7 + var34, var4, (byte) -86, -var34 + var35, var33, var21);
                                            var31++;
                                            continue L12;
                                          } else {
                                            var31++;
                                            continue L12;
                                          }
                                        }
                                      }
                                    } else {
                                      var41 = var20[(var9 + var31) % var12];
                                      var22 = Math.max(var22, var41[2]);
                                      var31++;
                                      continue L11;
                                    }
                                  }
                                }
                              }
                              var9 = var26_int;
                              break L3;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var28++;
                        var26_int++;
                        if (var26_int >= var12) {
                          var26_int = 0;
                          continue L6;
                        } else {
                          continue L6;
                        }
                      }
                    }
                  }
                  L14: {
                    if (var24 + var22 > qda.field_i) {
                      var24 = qda.field_i - var22;
                      break L14;
                    } else {
                      var10 = 0;
                      break L14;
                    }
                  }
                  if (ns.field_g != var25) {
                    var13++;
                    var45 = var19[var13];
                    var26 = var45;
                    var45[0] = var8;
                    var45[1] = var25;
                    var26[2] = var22 + var24;
                    this.a(var24, var8 + var6, var54, (byte) -99, var23, var22, var21);
                    var8 = var25;
                    continue L1;
                  } else {
                    this.a(var24, var8 - -var6, var54, (byte) -81, var23, var22, var21);
                    if (var10 == 0) {
                      L15: {
                        var10 = 1;
                        var13++;
                        var43 = var19[var13];
                        var26 = var43;
                        var26[2] = var22 - -var24;
                        var43[0] = var8;
                        var43[1] = var25;
                        var27 = var20;
                        var44 = var19;
                        var19 = var27;
                        var12 = var13;
                        var7 = var6;
                        var13 = 0;
                        var6 = jqa.a(ns.field_g, var21, 71);
                        var5 = var6 - var7;
                        var8 = 0;
                        var28 = var5;
                        if (-1 < (var28 ^ -1)) {
                          var28 = var28 + ns.field_g;
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      L16: {
                        if (ns.field_g < var28) {
                          var28 = var28 - ns.field_g;
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                      var9 = 0;
                      var11 = 0;
                      L17: while (true) {
                        L18: {
                          var29 = var44[var9];
                          if (var28 < var29[0]) {
                            break L18;
                          } else {
                            if (var28 > var29[1]) {
                              break L18;
                            } else {
                              continue L1;
                            }
                          }
                        }
                        var9++;
                        if (var9 < var12) {
                          continue L17;
                        } else {
                          var9 = 0;
                          continue L17;
                        }
                      }
                    } else {
                      break L0;
                    }
                  }
                }
              }
            } else {
              break L0;
            }
          }
          return var3;
        } else {
          return null;
        }
    }

    public static void c(int param0) {
        field_r = null;
        if (param0 != -1) {
            return;
        }
        field_q = null;
        field_v = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "You cannot add yourself!";
        field_v = new int[8192];
    }
}
