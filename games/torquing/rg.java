/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rg extends am {
    private int field_B;
    static la field_v;
    private int field_A;
    private int field_s;
    private int field_w;
    private int field_y;
    private int field_z;
    private int field_u;
    private int field_x;
    static String field_C;
    private int field_D;
    private int field_t;

    final int[] a(byte param0, int param1) {
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
        Object var39 = null;
        int[][] var40 = null;
        int[] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        int[][] var45 = null;
        int[] var46 = null;
        int[][] var47 = null;
        int[][] var48 = null;
        int[][] var51 = null;
        int[][] var52 = null;
        int[][] var55 = null;
        int[][] var56 = null;
        int[] var57 = null;
        int[] var58 = null;
        L0: {
          var38 = Torquing.field_u;
          var3 = ((rg) this).field_l.a(param1, 25657);
          if (param0 >= 86) {
            break L0;
          } else {
            var39 = null;
            ((rg) this).a((fj) null, 116, -30);
            break L0;
          }
        }
        L1: {
          if (!((rg) this).field_l.field_b) {
            break L1;
          } else {
            var55 = ((rg) this).field_l.a(0);
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
            var14 = ci.field_c * ((rg) this).field_y >> -346424916;
            var15 = ((rg) this).field_t * ci.field_c >> -147669652;
            var16 = um.field_o * ((rg) this).field_A >> -473558708;
            var17 = um.field_o * ((rg) this).field_D >> 580186700;
            if (-2 <= (var17 ^ -1)) {
              return var55[param1];
            } else {
              ((rg) this).field_s = ci.field_c / 8 * ((rg) this).field_w >> 685155980;
              var18 = 1 + ci.field_c / var14;
              var19 = new int[var18][3];
              var56 = new int[var18][3];
              var52 = var56;
              var48 = var52;
              var20 = var48;
              var21 = new Random((long)((rg) this).field_B);
              L2: while (true) {
                L3: {
                  var23 = va.a(-var14 + var15, (byte) 126, var21) + var14;
                  var24 = va.a(-var16 + var17, (byte) 125, var21) + var16;
                  var25 = var8 - -var23;
                  if (var25 > ci.field_c) {
                    var23 = ci.field_c - var8;
                    var25 = ci.field_c;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (var11 == 0) {
                    L5: {
                      var56 = var52;
                      var26_int = var9;
                      var57 = var56[var9];
                      var28 = 0;
                      var29_int = var5 + var25;
                      if (-1 < (var29_int ^ -1)) {
                        var29_int = var29_int + ci.field_c;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      if (var29_int > ci.field_c) {
                        var29_int = var29_int - ci.field_c;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var22 = var57[2];
                    L7: while (true) {
                      L8: {
                        var58 = var56[var26_int];
                        if (var29_int < var58[0]) {
                          break L8;
                        } else {
                          if (var29_int <= var58[1]) {
                            L9: {
                              if (var26_int != var9) {
                                L10: {
                                  var30 = var5 + var8;
                                  if (0 > var30) {
                                    var30 = var30 + ci.field_c;
                                    break L10;
                                  } else {
                                    break L10;
                                  }
                                }
                                L11: {
                                  if (var30 > ci.field_c) {
                                    var30 = var30 - ci.field_c;
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                                var31 = 1;
                                L12: while (true) {
                                  if (var28 < var31) {
                                    var31 = 0;
                                    L13: while (true) {
                                      if (var31 > var28) {
                                        break L9;
                                      } else {
                                        var43 = var20[(var9 - -var31) % var12];
                                        var33 = var43[2];
                                        if (var33 != var22) {
                                          L14: {
                                            var36 = var43[0];
                                            var37 = var43[1];
                                            if (var29_int <= var30) {
                                              if (var36 == 0) {
                                                var34 = 0;
                                                var35 = Math.min(var29_int, var37);
                                                break L14;
                                              } else {
                                                var34 = Math.max(var30, var36);
                                                var35 = ci.field_c;
                                                break L14;
                                              }
                                            } else {
                                              var34 = Math.max(var30, var36);
                                              var35 = Math.min(var29_int, var37);
                                              break L14;
                                            }
                                          }
                                          this.a(var21, var34 - -var7, var33, -82, var4, var35 - var34, var22 + -var33);
                                          var31++;
                                          continue L13;
                                        } else {
                                          var31++;
                                          continue L13;
                                        }
                                      }
                                    }
                                  } else {
                                    var42 = var20[(var9 - -var31) % var12];
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
                  } else {
                    var22 = 0;
                    break L4;
                  }
                }
                L15: {
                  if (um.field_o < var24 + var22) {
                    var24 = um.field_o - var22;
                    break L15;
                  } else {
                    var10 = 0;
                    break L15;
                  }
                }
                if (var25 != ci.field_c) {
                  int incrementValue$2 = var13;
                  var13++;
                  var46 = var19[incrementValue$2];
                  var26 = var46;
                  var26[2] = var24 + var22;
                  var46[0] = var8;
                  var46[1] = var25;
                  this.a(var21, var8 + var6, var22, -84, var55, var23, var24);
                  var8 = var25;
                  continue L2;
                } else {
                  this.a(var21, var6 + var8, var22, 116, var55, var23, var24);
                  if (var10 != 0) {
                    break L1;
                  } else {
                    L16: {
                      var10 = 1;
                      int incrementValue$3 = var13;
                      var13++;
                      var44 = var19[incrementValue$3];
                      var26 = var44;
                      var44[1] = var25;
                      var44[0] = var8;
                      var26[2] = var24 + var22;
                      var27 = var20;
                      var45 = var19;
                      var19 = var27;
                      var12 = var13;
                      var13 = 0;
                      var7 = var6;
                      var6 = va.a(ci.field_c, (byte) 125, var21);
                      var8 = 0;
                      var5 = var6 - var7;
                      var28 = var5;
                      if (0 <= var28) {
                        break L16;
                      } else {
                        var28 = var28 + ci.field_c;
                        break L16;
                      }
                    }
                    L17: {
                      if (var28 > ci.field_c) {
                        var28 = var28 - ci.field_c;
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                    var9 = 0;
                    L18: while (true) {
                      L19: {
                        var29 = var45[var9];
                        if (var29[0] > var28) {
                          break L19;
                        } else {
                          if (var28 > var29[1]) {
                            break L19;
                          } else {
                            var11 = 0;
                            continue L2;
                          }
                        }
                      }
                      var9++;
                      if (var12 > var9) {
                        continue L18;
                      } else {
                        var9 = 0;
                        continue L18;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        return var3;
    }

    private final void a(Random param0, int param1, int param2, int param3, int[][] param4, int param5, int param6) {
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
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int[] stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int[] stackIn_34_2 = null;
        int stackIn_34_3 = 0;
        int[] stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int[] stackIn_35_2 = null;
        int stackIn_35_3 = 0;
        int[] stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int[] stackIn_36_2 = null;
        int stackIn_36_3 = 0;
        int stackIn_36_4 = 0;
        int[] stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        int[] stackIn_48_2 = null;
        int stackIn_48_3 = 0;
        int[] stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        int[] stackIn_49_2 = null;
        int stackIn_49_3 = 0;
        int[] stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int[] stackIn_50_2 = null;
        int stackIn_50_3 = 0;
        int stackIn_50_4 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int[] stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        int[] stackOut_47_2 = null;
        int stackOut_47_3 = 0;
        int[] stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int[] stackOut_49_2 = null;
        int stackOut_49_3 = 0;
        int stackOut_49_4 = 0;
        int[] stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        int[] stackOut_48_2 = null;
        int stackOut_48_3 = 0;
        int stackOut_48_4 = 0;
        int[] stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int[] stackOut_33_2 = null;
        int stackOut_33_3 = 0;
        int[] stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        int[] stackOut_35_2 = null;
        int stackOut_35_3 = 0;
        int stackOut_35_4 = 0;
        int[] stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        int[] stackOut_34_2 = null;
        int stackOut_34_3 = 0;
        int stackOut_34_4 = 0;
        L0: {
          var23 = Torquing.field_u;
          if ((((rg) this).field_u ^ -1) < -1) {
            stackOut_2_0 = -va.a(((rg) this).field_u, (byte) 125, param0) + 4096;
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
          var9 = ((rg) this).field_s * ((rg) this).field_z >> -447204468;
          stackOut_3_0 = ((rg) this).field_s;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (0 < var9) {
            stackOut_5_0 = stackIn_5_0;
            stackOut_5_1 = va.a(var9, (byte) 125, param0);
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
          var10 = stackIn_6_0 + -stackIn_6_1;
          if (ci.field_c <= param1) {
            param1 = param1 - ci.field_c;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if ((var10 ^ -1) < -1) {
            if (param6 <= 0) {
              return;
            } else {
              if (-1 <= (param5 ^ -1)) {
                return;
              } else {
                L4: {
                  var11 = param5 / 2;
                  var12 = param6 / 2;
                  if (var10 > var11) {
                    stackOut_23_0 = var11;
                    stackIn_24_0 = stackOut_23_0;
                    break L4;
                  } else {
                    stackOut_22_0 = var10;
                    stackIn_24_0 = stackOut_22_0;
                    break L4;
                  }
                }
                L5: {
                  var13 = stackIn_24_0;
                  if (var12 >= var10) {
                    stackOut_26_0 = var10;
                    stackIn_27_0 = stackOut_26_0;
                    break L5;
                  } else {
                    stackOut_25_0 = var12;
                    stackIn_27_0 = stackOut_25_0;
                    break L5;
                  }
                }
                var14 = stackIn_27_0;
                var15 = param1 + var13;
                var16 = -(var13 * 2) + param5;
                var17 = 0;
                L6: while (true) {
                  if (var17 >= param6) {
                    break L3;
                  } else {
                    var18 = param4[var17 - -param2];
                    if (var14 <= var17) {
                      var19 = param6 + (-var17 - 1);
                      if (var19 >= var14) {
                        var20 = 0;
                        L7: while (true) {
                          if (var20 >= var13) {
                            if (var16 + var15 > ci.field_c) {
                              var20 = -var15 + ci.field_c;
                              dk.a(var18, var15, var20, var8);
                              dk.a(var18, 0, var16 + -var20, var8);
                              var17++;
                              continue L6;
                            } else {
                              dk.a(var18, var15, var16, var8);
                              var17++;
                              continue L6;
                            }
                          } else {
                            int dupTemp$5 = ie.a(-1 + (param1 + param5) - var20, jh.field_A);
                            var18[dupTemp$5] = var8 * var20 / var13;
                            var18[ie.a(jh.field_A, var20 + param1)] = var8 * var20 / var13;
                            var20++;
                            continue L7;
                          }
                        }
                      } else {
                        L8: {
                          var20 = var8 * var19 / var14;
                          if (0 == ((rg) this).field_x) {
                            var21 = 0;
                            L9: while (true) {
                              if (var13 <= var21) {
                                break L8;
                              } else {
                                var22 = var8 * var21 / var13;
                                int dupTemp$6 = ie.a(jh.field_A, -1 + param1 - (-param5 + var21));
                                var18[dupTemp$6] = var20 * var22 >> -899229972;
                                var18[ie.a(jh.field_A, var21 + param1)] = var20 * var22 >> -899229972;
                                var21++;
                                continue L9;
                              }
                            }
                          } else {
                            var21 = 0;
                            L10: while (true) {
                              if (var21 >= var13) {
                                break L8;
                              } else {
                                L11: {
                                  var22 = var21 * var8 / var13;
                                  stackOut_47_0 = (int[]) var18;
                                  stackOut_47_1 = ie.a(var21 + param1, jh.field_A);
                                  stackOut_47_2 = (int[]) var18;
                                  stackOut_47_3 = ie.a(-var21 + (param1 - -param5 + -1), jh.field_A);
                                  stackIn_49_0 = stackOut_47_0;
                                  stackIn_49_1 = stackOut_47_1;
                                  stackIn_49_2 = stackOut_47_2;
                                  stackIn_49_3 = stackOut_47_3;
                                  stackIn_48_0 = stackOut_47_0;
                                  stackIn_48_1 = stackOut_47_1;
                                  stackIn_48_2 = stackOut_47_2;
                                  stackIn_48_3 = stackOut_47_3;
                                  if (var22 >= var20) {
                                    stackOut_49_0 = (int[]) (Object) stackIn_49_0;
                                    stackOut_49_1 = stackIn_49_1;
                                    stackOut_49_2 = (int[]) (Object) stackIn_49_2;
                                    stackOut_49_3 = stackIn_49_3;
                                    stackOut_49_4 = var20;
                                    stackIn_50_0 = stackOut_49_0;
                                    stackIn_50_1 = stackOut_49_1;
                                    stackIn_50_2 = stackOut_49_2;
                                    stackIn_50_3 = stackOut_49_3;
                                    stackIn_50_4 = stackOut_49_4;
                                    break L11;
                                  } else {
                                    stackOut_48_0 = (int[]) (Object) stackIn_48_0;
                                    stackOut_48_1 = stackIn_48_1;
                                    stackOut_48_2 = (int[]) (Object) stackIn_48_2;
                                    stackOut_48_3 = stackIn_48_3;
                                    stackOut_48_4 = var22;
                                    stackIn_50_0 = stackOut_48_0;
                                    stackIn_50_1 = stackOut_48_1;
                                    stackIn_50_2 = stackOut_48_2;
                                    stackIn_50_3 = stackOut_48_3;
                                    stackIn_50_4 = stackOut_48_4;
                                    break L11;
                                  }
                                }
                                stackIn_50_2[stackIn_50_3] = stackIn_50_4;
                                stackIn_50_0[stackIn_50_1] = stackIn_50_4;
                                var21++;
                                continue L10;
                              }
                            }
                          }
                        }
                        if (ci.field_c >= var16 + var15) {
                          dk.a(var18, var15, var16, var20);
                          var17++;
                          continue L6;
                        } else {
                          var21 = ci.field_c - var15;
                          dk.a(var18, var15, var21, var20);
                          dk.a(var18, 0, -var21 + var16, var20);
                          var17++;
                          continue L6;
                        }
                      }
                    } else {
                      L12: {
                        var19 = var8 * var17 / var14;
                        if (0 == ((rg) this).field_x) {
                          var20 = 0;
                          L13: while (true) {
                            if (var13 <= var20) {
                              break L12;
                            } else {
                              var21 = var8 * var20 / var13;
                              int dupTemp$7 = ie.a(param1 + (param5 + -var20 + -1), jh.field_A);
                              var18[dupTemp$7] = var21 * var19 >> -1924533044;
                              var18[ie.a(jh.field_A, param1 - -var20)] = var21 * var19 >> -1924533044;
                              var20++;
                              continue L13;
                            }
                          }
                        } else {
                          var20 = 0;
                          L14: while (true) {
                            if (var20 >= var13) {
                              break L12;
                            } else {
                              L15: {
                                var21 = var20 * var8 / var13;
                                stackOut_33_0 = (int[]) var18;
                                stackOut_33_1 = ie.a(param1 - -var20, jh.field_A);
                                stackOut_33_2 = (int[]) var18;
                                stackOut_33_3 = ie.a(-1 + (param1 - -param5) + -var20, jh.field_A);
                                stackIn_35_0 = stackOut_33_0;
                                stackIn_35_1 = stackOut_33_1;
                                stackIn_35_2 = stackOut_33_2;
                                stackIn_35_3 = stackOut_33_3;
                                stackIn_34_0 = stackOut_33_0;
                                stackIn_34_1 = stackOut_33_1;
                                stackIn_34_2 = stackOut_33_2;
                                stackIn_34_3 = stackOut_33_3;
                                if (var21 >= var19) {
                                  stackOut_35_0 = (int[]) (Object) stackIn_35_0;
                                  stackOut_35_1 = stackIn_35_1;
                                  stackOut_35_2 = (int[]) (Object) stackIn_35_2;
                                  stackOut_35_3 = stackIn_35_3;
                                  stackOut_35_4 = var19;
                                  stackIn_36_0 = stackOut_35_0;
                                  stackIn_36_1 = stackOut_35_1;
                                  stackIn_36_2 = stackOut_35_2;
                                  stackIn_36_3 = stackOut_35_3;
                                  stackIn_36_4 = stackOut_35_4;
                                  break L15;
                                } else {
                                  stackOut_34_0 = (int[]) (Object) stackIn_34_0;
                                  stackOut_34_1 = stackIn_34_1;
                                  stackOut_34_2 = (int[]) (Object) stackIn_34_2;
                                  stackOut_34_3 = stackIn_34_3;
                                  stackOut_34_4 = var21;
                                  stackIn_36_0 = stackOut_34_0;
                                  stackIn_36_1 = stackOut_34_1;
                                  stackIn_36_2 = stackOut_34_2;
                                  stackIn_36_3 = stackOut_34_3;
                                  stackIn_36_4 = stackOut_34_4;
                                  break L15;
                                }
                              }
                              stackIn_36_2[stackIn_36_3] = stackIn_36_4;
                              stackIn_36_0[stackIn_36_1] = stackIn_36_4;
                              var20++;
                              continue L14;
                            }
                          }
                        }
                      }
                      if (ci.field_c < var16 + var15) {
                        var20 = -var15 + ci.field_c;
                        dk.a(var18, var15, var20, var19);
                        dk.a(var18, 0, var16 + -var20, var19);
                        var17++;
                        continue L6;
                      } else {
                        dk.a(var18, var15, var16, var19);
                        var17++;
                        continue L6;
                      }
                    }
                  }
                }
              }
            }
          } else {
            if (ci.field_c < param5 + param1) {
              var11 = -param1 + ci.field_c;
              var12 = 0;
              L16: while (true) {
                if (param6 <= var12) {
                  break L3;
                } else {
                  var13_ref_int__ = param4[var12 + param2];
                  dk.a(var13_ref_int__, param1, var11, var8);
                  dk.a(var13_ref_int__, 0, -var11 + param5, var8);
                  var12++;
                  continue L16;
                }
              }
            } else {
              var11 = 0;
              L17: while (true) {
                if (param6 <= var11) {
                  break L3;
                } else {
                  dk.a(param4[param2 + var11], param1, param5, var8);
                  var11++;
                  continue L17;
                }
              }
            }
          }
        }
        var11 = 33 / ((70 - param3) / 45);
    }

    public rg() {
        super(0, true);
        ((rg) this).field_B = 0;
        ((rg) this).field_A = 409;
        ((rg) this).field_z = 1024;
        ((rg) this).field_w = 1024;
        ((rg) this).field_x = 0;
        ((rg) this).field_u = 1024;
        ((rg) this).field_D = 819;
        ((rg) this).field_t = 2048;
        ((rg) this).field_y = 1024;
    }

    final void a(byte param0) {
        if (param0 < 123) {
            rg.b(114);
        }
    }

    final void a(fj param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = Torquing.field_u;
        if (param1 == 35) {
          L0: {
            var4 = param2;
            if ((var4 ^ -1) != -1) {
              if (var4 == 1) {
                ((rg) this).field_y = param0.i(param1 + 7053);
                break L0;
              } else {
                if ((var4 ^ -1) == -3) {
                  ((rg) this).field_t = param0.i(7088);
                  break L0;
                } else {
                  if ((var4 ^ -1) == -4) {
                    ((rg) this).field_A = param0.i(param1 + 7053);
                    break L0;
                  } else {
                    if (-5 != (var4 ^ -1)) {
                      if (-6 != (var4 ^ -1)) {
                        if (-7 != (var4 ^ -1)) {
                          if ((var4 ^ -1) == -8) {
                            ((rg) this).field_z = param0.i(7088);
                            break L0;
                          } else {
                            if (8 != var4) {
                              break L0;
                            } else {
                              ((rg) this).field_u = param0.i(7088);
                              break L0;
                            }
                          }
                        } else {
                          ((rg) this).field_x = param0.i((byte) -101);
                          break L0;
                        }
                      } else {
                        ((rg) this).field_w = param0.i(7088);
                        break L0;
                      }
                    } else {
                      ((rg) this).field_D = param0.i(7088);
                      break L0;
                    }
                  }
                }
              }
            } else {
              ((rg) this).field_B = param0.i((byte) -101);
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final static uh a(boolean param0) {
        if (!param0) {
            return null;
        }
        return tn.field_l;
    }

    public static void b(int param0) {
        field_C = null;
        if (param0 != 31635) {
            field_C = null;
        }
        field_v = null;
    }

    final static void a(int param0, int param1, of param2, int param3, byte param4, int param5, int param6, int param7) {
        int[] var8 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        Object var21 = null;
        jb var21_ref = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        int var44 = 0;
        of var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        int[] var60 = null;
        byte[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int[] var66 = null;
        int[] var67 = null;
        int stackIn_14_0 = 0;
        int[] stackIn_15_0 = null;
        int[] stackIn_16_0 = null;
        int[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        jb stackIn_38_0 = null;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        short stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        short stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_30_0 = 0;
        short stackOut_29_0 = 0;
        jb stackOut_36_0 = null;
        Object stackOut_37_0 = null;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int[] stackOut_14_0 = null;
        int[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        L0: {
          L1: {
            var40 = Torquing.field_u;
            var45 = param2;
            if (var45.field_i == null) {
              break L1;
            } else {
              if ((var45.field_M ^ -1) >= -2) {
                break L1;
              } else {
                var62 = var45.field_i;
                rk.a(var62, a.field_f, 0, (byte) -122, 0);
                break L0;
              }
            }
          }
          mc.c(1559487076);
          break L0;
        }
        var66 = new int[param2.field_C];
        var60 = var66;
        var55 = var60;
        var50 = var55;
        var41 = var50;
        var8 = var41;
        var67 = new int[param2.field_C];
        var64 = m.field_c;
        var63 = pm.field_s;
        var65 = tm.field_e;
        var13 = 0;
        L2: while (true) {
          if ((param2.field_C ^ -1) >= (var13 ^ -1)) {
            L3: {
              if (param4 >= 120) {
                break L3;
              } else {
                field_v = null;
                break L3;
              }
            }
            var44 = 0;
            var13 = var44;
            L4: while (true) {
              if (var44 >= ui.field_k) {
                return;
              } else {
                L5: {
                  var14 = mn.field_bb[var44];
                  var15 = param2.field_G[var14];
                  var16 = param2.field_r[var14];
                  var17 = param2.field_I[var14];
                  if ((param2.field_O[var14] ^ -1) > (m.field_c.length ^ -1)) {
                    stackOut_24_0 = param2.field_O[var14];
                    stackIn_25_0 = stackOut_24_0;
                    break L5;
                  } else {
                    stackOut_23_0 = -1;
                    stackIn_25_0 = stackOut_23_0;
                    break L5;
                  }
                }
                L6: {
                  var18 = stackIn_25_0;
                  if ((m.field_c.length ^ -1) < (param2.field_J[var14] ^ -1)) {
                    stackOut_27_0 = param2.field_J[var14];
                    stackIn_28_0 = stackOut_27_0;
                    break L6;
                  } else {
                    stackOut_26_0 = -1;
                    stackIn_28_0 = stackOut_26_0;
                    break L6;
                  }
                }
                L7: {
                  var19 = stackIn_28_0;
                  if ((m.field_c.length ^ -1) >= (param2.field_F[var14] ^ -1)) {
                    stackOut_30_0 = -1;
                    stackIn_31_0 = stackOut_30_0;
                    break L7;
                  } else {
                    stackOut_29_0 = param2.field_F[var14];
                    stackIn_31_0 = stackOut_29_0;
                    break L7;
                  }
                }
                L8: {
                  L9: {
                    var20 = stackIn_31_0;
                    if (null == ha.field_d) {
                      break L9;
                    } else {
                      if (param2.field_c == null) {
                        break L9;
                      } else {
                        if ((param2.field_c.length ^ -1) >= (var14 ^ -1)) {
                          break L9;
                        } else {
                          if (param2.field_c[var14] == -1) {
                            break L9;
                          } else {
                            if (ha.field_d.length <= param2.field_c[var14]) {
                              break L9;
                            } else {
                              stackOut_36_0 = ha.field_d[param2.field_c[var14]];
                              stackIn_38_0 = stackOut_36_0;
                              break L8;
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_37_0 = null;
                  stackIn_38_0 = (jb) (Object) stackOut_37_0;
                  break L8;
                }
                L10: {
                  L11: {
                    var21_ref = stackIn_38_0;
                    var22 = kh.field_m[var15];
                    var23 = u.field_w[var15];
                    var24 = kh.field_m[var16];
                    var25 = u.field_w[var16];
                    var26 = kh.field_m[var17];
                    var27 = u.field_w[var17];
                    if ((var18 ^ -1) != (var19 ^ -1)) {
                      break L11;
                    } else {
                      if ((var20 ^ -1) == (var19 ^ -1)) {
                        L12: {
                          var28 = var66[var18];
                          var29 = var67[var18];
                          if (var21_ref != null) {
                            stackOut_47_0 = var21_ref.field_a;
                            stackIn_48_0 = stackOut_47_0;
                            break L12;
                          } else {
                            stackOut_46_0 = 8355711;
                            stackIn_48_0 = stackOut_46_0;
                            break L12;
                          }
                        }
                        var30 = stackIn_48_0;
                        var31 = 16711935 & var30;
                        var32 = 65280 & var30;
                        var33 = (var28 * var31 & -16711919) >>> -814340792 | (var32 * var28 & 16711700) >>> 804606824;
                        var33 = var33 + var29 * 65793;
                        te.a(var22, 8355711 & var33 >> 928757921, -87, var23, var24, var27, var25, var26);
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                  L13: {
                    var28 = var66[var18];
                    var29 = var66[var19];
                    var30 = var66[var20];
                    var31 = var67[var18];
                    var32 = var67[var19];
                    var33 = var67[var20];
                    if (var21_ref == null) {
                      stackOut_43_0 = 8355711;
                      stackIn_44_0 = stackOut_43_0;
                      break L13;
                    } else {
                      stackOut_42_0 = var21_ref.field_a;
                      stackIn_44_0 = stackOut_42_0;
                      break L13;
                    }
                  }
                  var34 = stackIn_44_0;
                  var35 = var34 & 16711935;
                  var36 = 65280 & var34;
                  var37 = (var28 * var36 & 16711735) >>> -885846072 | var28 * var35 >>> -339776440 & -738262785;
                  var38 = var35 * var29 >>> 286747240 & -922812161 | (16711930 & var29 * var36) >>> -1163295256;
                  var39 = var36 * var30 >>> -157501784 & -1828651264 | var35 * var30 >>> -1438992824 & 2080309503;
                  var37 = var37 + var31 * 65793;
                  var38 = var38 + var32 * 65793;
                  var39 = var39 + 65793 * var33;
                  th.a(var22, var39 >> 1882419920, (65465 & var38) >> -1860588792, 255 & var37, var38 >> 1532656368, var37 >> -756973392, var39 & 255, var23, 255 & var38, (var37 & 65328) >> 2050881256, -25, var24, var39 >> 1339075144 & 255, var25, var26, var27);
                  break L10;
                }
                var44++;
                continue L4;
              }
            }
          } else {
            L14: {
              var14 = var63[var13] * param7 + (var64[var13] * param0 - -(param3 * var65[var13])) >> 2080601480;
              if (-1 < (var14 ^ -1)) {
                var14 = -var14;
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              if (-1 < (var14 ^ -1)) {
                stackOut_13_0 = 128;
                stackIn_14_0 = stackOut_13_0;
                break L15;
              } else {
                if ((var14 ^ -1) <= -129) {
                  stackOut_12_0 = 256;
                  stackIn_14_0 = stackOut_12_0;
                  break L15;
                } else {
                  stackOut_11_0 = var14 + 128;
                  stackIn_14_0 = stackOut_11_0;
                  break L15;
                }
              }
            }
            L16: {
              var14 = stackIn_14_0;
              var15 = param1 * var65[var13] + param5 * var63[var13] + var64[var13] * param6 >> -1256029688;
              stackOut_14_0 = id.field_c;
              stackIn_16_0 = stackOut_14_0;
              stackIn_15_0 = stackOut_14_0;
              if (var15 >= 0) {
                stackOut_16_0 = (int[]) (Object) stackIn_16_0;
                stackOut_16_1 = var15;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                break L16;
              } else {
                stackOut_15_0 = (int[]) (Object) stackIn_15_0;
                stackOut_15_1 = -var15;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                break L16;
              }
            }
            var15 = stackIn_17_0[stackIn_17_1];
            var14 = (256 + -var15) * var14 >>> 1945866760;
            var66[var13] = var14;
            var67[var13] = var15;
            var13++;
            continue L2;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "Checking";
    }
}
