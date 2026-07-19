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
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
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
        fj var39 = null;
        int[][] var40 = null;
        int[] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        int[][] var45 = null;
        int[] var46 = null;
        int[][] var47 = null;
        int[][] var48 = null;
        int[] var53 = null;
        int[] var54 = null;
        L0: {
          var38 = Torquing.field_u;
          var3 = this.field_l.a(param1, 25657);
          if (param0 >= 86) {
            break L0;
          } else {
            var39 = (fj) null;
            this.a((fj) null, 116, -30);
            break L0;
          }
        }
        L1: {
          if (!this.field_l.field_b) {
            break L1;
          } else {
            var47 = this.field_l.a(0);
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
            var14 = ci.field_c * this.field_y >> -346424916;
            var15 = this.field_t * ci.field_c >> -147669652;
            var16 = um.field_o * this.field_A >> -473558708;
            var17 = um.field_o * this.field_D >> 580186700;
            if (-2 <= (var17 ^ -1)) {
              return var47[param1];
            } else {
              this.field_s = ci.field_c / 8 * this.field_w >> 685155980;
              var18 = 1 + ci.field_c / var14;
              var19 = new int[var18][3];
              var48 = new int[var18][3];
              var20 = var48;
              var21 = new Random((long)this.field_B);
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
                      var48 = var20;
                      var26_int = var9;
                      var53 = var48[var9];
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
                    var22 = var53[2];
                    L7: while (true) {
                      L8: {
                        var54 = var48[var26_int];
                        if (var29_int < var54[0]) {
                          break L8;
                        } else {
                          if (var29_int <= var54[1]) {
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
                  incrementValue$2 = var13;
                  var13++;
                  var46 = var19[incrementValue$2];
                  var26 = var46;
                  var26[2] = var24 + var22;
                  var46[0] = var8;
                  var46[1] = var25;
                  this.a(var21, var8 + var6, var22, -84, var47, var23, var24);
                  var8 = var25;
                  continue L2;
                } else {
                  this.a(var21, var6 + var8, var22, 116, var47, var23, var24);
                  if (var10 != 0) {
                    break L1;
                  } else {
                    L16: {
                      var10 = 1;
                      incrementValue$3 = var13;
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
        int dupTemp$5 = 0;
        int dupTemp$6 = 0;
        int dupTemp$7 = 0;
        RuntimeException var8 = null;
        int var8_int = 0;
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
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int[] stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int[] stackIn_35_2 = null;
        int stackIn_35_3 = 0;
        int[] stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int[] stackIn_36_2 = null;
        int stackIn_36_3 = 0;
        int[] stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int[] stackIn_37_2 = null;
        int stackIn_37_3 = 0;
        int stackIn_37_4 = 0;
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
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
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
        int[] stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        int[] stackOut_34_2 = null;
        int stackOut_34_3 = 0;
        int[] stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int[] stackOut_36_2 = null;
        int stackOut_36_3 = 0;
        int stackOut_36_4 = 0;
        int[] stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        int[] stackOut_35_2 = null;
        int stackOut_35_3 = 0;
        int stackOut_35_4 = 0;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        var23 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if ((this.field_u ^ -1) < -1) {
                stackOut_3_0 = -va.a(this.field_u, (byte) 125, param0) + 4096;
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
              var9 = this.field_s * this.field_z >> -447204468;
              stackOut_4_0 = this.field_s;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (0 < var9) {
                stackOut_6_0 = stackIn_6_0;
                stackOut_6_1 = va.a(var9, (byte) 125, param0);
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = stackIn_5_0;
                stackOut_5_1 = 0;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              var10 = stackIn_7_0 + -stackIn_7_1;
              if (ci.field_c <= param1) {
                param1 = param1 - ci.field_c;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if ((var10 ^ -1) < -1) {
                L5: {
                  if (param6 <= 0) {
                    break L5;
                  } else {
                    if (-1 <= (param5 ^ -1)) {
                      break L5;
                    } else {
                      L6: {
                        var11 = param5 / 2;
                        var12 = param6 / 2;
                        if (var10 > var11) {
                          stackOut_24_0 = var11;
                          stackIn_25_0 = stackOut_24_0;
                          break L6;
                        } else {
                          stackOut_23_0 = var10;
                          stackIn_25_0 = stackOut_23_0;
                          break L6;
                        }
                      }
                      L7: {
                        var13 = stackIn_25_0;
                        if (var12 >= var10) {
                          stackOut_27_0 = var10;
                          stackIn_28_0 = stackOut_27_0;
                          break L7;
                        } else {
                          stackOut_26_0 = var12;
                          stackIn_28_0 = stackOut_26_0;
                          break L7;
                        }
                      }
                      var14 = stackIn_28_0;
                      var15 = param1 + var13;
                      var16 = -(var13 * 2) + param5;
                      var17 = 0;
                      L8: while (true) {
                        if (var17 >= param6) {
                          break L4;
                        } else {
                          L9: {
                            var18 = param4[var17 - -param2];
                            if (var14 <= var17) {
                              var19 = param6 + (-var17 - 1);
                              if (var19 >= var14) {
                                var20 = 0;
                                L10: while (true) {
                                  if (var20 >= var13) {
                                    if (var16 + var15 > ci.field_c) {
                                      var20 = -var15 + ci.field_c;
                                      dk.a(var18, var15, var20, var8_int);
                                      dk.a(var18, 0, var16 + -var20, var8_int);
                                      break L9;
                                    } else {
                                      dk.a(var18, var15, var16, var8_int);
                                      break L9;
                                    }
                                  } else {
                                    dupTemp$5 = ie.a(-1 + (param1 + param5) - var20, jh.field_A);
                                    var18[dupTemp$5] = var8_int * var20 / var13;
                                    var18[ie.a(jh.field_A, var20 + param1)] = var8_int * var20 / var13;
                                    var20++;
                                    continue L10;
                                  }
                                }
                              } else {
                                L11: {
                                  var20 = var8_int * var19 / var14;
                                  if (0 == this.field_x) {
                                    var21 = 0;
                                    L12: while (true) {
                                      if (var13 <= var21) {
                                        break L11;
                                      } else {
                                        var22 = var8_int * var21 / var13;
                                        dupTemp$6 = ie.a(jh.field_A, -1 + param1 - (-param5 + var21));
                                        var18[dupTemp$6] = var20 * var22 >> -899229972;
                                        var18[ie.a(jh.field_A, var21 + param1)] = var20 * var22 >> -899229972;
                                        var21++;
                                        continue L12;
                                      }
                                    }
                                  } else {
                                    var21 = 0;
                                    L13: while (true) {
                                      if (var21 >= var13) {
                                        break L11;
                                      } else {
                                        L14: {
                                          var22 = var21 * var8_int / var13;
                                          stackOut_48_0 = (int[]) (var18);
                                          stackOut_48_1 = ie.a(var21 + param1, jh.field_A);
                                          stackOut_48_2 = (int[]) (var18);
                                          stackOut_48_3 = ie.a(-var21 + (param1 - -param5 + -1), jh.field_A);
                                          stackIn_50_0 = stackOut_48_0;
                                          stackIn_50_1 = stackOut_48_1;
                                          stackIn_50_2 = stackOut_48_2;
                                          stackIn_50_3 = stackOut_48_3;
                                          stackIn_49_0 = stackOut_48_0;
                                          stackIn_49_1 = stackOut_48_1;
                                          stackIn_49_2 = stackOut_48_2;
                                          stackIn_49_3 = stackOut_48_3;
                                          if (var22 >= var20) {
                                            stackOut_50_0 = (int[]) ((Object) stackIn_50_0);
                                            stackOut_50_1 = stackIn_50_1;
                                            stackOut_50_2 = (int[]) ((Object) stackIn_50_2);
                                            stackOut_50_3 = stackIn_50_3;
                                            stackOut_50_4 = var20;
                                            stackIn_51_0 = stackOut_50_0;
                                            stackIn_51_1 = stackOut_50_1;
                                            stackIn_51_2 = stackOut_50_2;
                                            stackIn_51_3 = stackOut_50_3;
                                            stackIn_51_4 = stackOut_50_4;
                                            break L14;
                                          } else {
                                            stackOut_49_0 = (int[]) ((Object) stackIn_49_0);
                                            stackOut_49_1 = stackIn_49_1;
                                            stackOut_49_2 = (int[]) ((Object) stackIn_49_2);
                                            stackOut_49_3 = stackIn_49_3;
                                            stackOut_49_4 = var22;
                                            stackIn_51_0 = stackOut_49_0;
                                            stackIn_51_1 = stackOut_49_1;
                                            stackIn_51_2 = stackOut_49_2;
                                            stackIn_51_3 = stackOut_49_3;
                                            stackIn_51_4 = stackOut_49_4;
                                            break L14;
                                          }
                                        }
                                        stackIn_51_2[stackIn_51_3] = stackIn_51_4;
                                        stackIn_51_0[stackIn_51_1] = stackIn_51_4;
                                        var21++;
                                        continue L13;
                                      }
                                    }
                                  }
                                }
                                if (ci.field_c >= var16 + var15) {
                                  dk.a(var18, var15, var16, var20);
                                  break L9;
                                } else {
                                  var21 = ci.field_c - var15;
                                  dk.a(var18, var15, var21, var20);
                                  dk.a(var18, 0, -var21 + var16, var20);
                                  break L9;
                                }
                              }
                            } else {
                              L15: {
                                var19 = var8_int * var17 / var14;
                                if (0 == this.field_x) {
                                  var20 = 0;
                                  L16: while (true) {
                                    if (var13 <= var20) {
                                      break L15;
                                    } else {
                                      var21 = var8_int * var20 / var13;
                                      dupTemp$7 = ie.a(param1 + (param5 + -var20 + -1), jh.field_A);
                                      var18[dupTemp$7] = var21 * var19 >> -1924533044;
                                      var18[ie.a(jh.field_A, param1 - -var20)] = var21 * var19 >> -1924533044;
                                      var20++;
                                      continue L16;
                                    }
                                  }
                                } else {
                                  var20 = 0;
                                  L17: while (true) {
                                    if (var20 >= var13) {
                                      break L15;
                                    } else {
                                      L18: {
                                        var21 = var20 * var8_int / var13;
                                        stackOut_34_0 = (int[]) (var18);
                                        stackOut_34_1 = ie.a(param1 - -var20, jh.field_A);
                                        stackOut_34_2 = (int[]) (var18);
                                        stackOut_34_3 = ie.a(-1 + (param1 - -param5) + -var20, jh.field_A);
                                        stackIn_36_0 = stackOut_34_0;
                                        stackIn_36_1 = stackOut_34_1;
                                        stackIn_36_2 = stackOut_34_2;
                                        stackIn_36_3 = stackOut_34_3;
                                        stackIn_35_0 = stackOut_34_0;
                                        stackIn_35_1 = stackOut_34_1;
                                        stackIn_35_2 = stackOut_34_2;
                                        stackIn_35_3 = stackOut_34_3;
                                        if (var21 >= var19) {
                                          stackOut_36_0 = (int[]) ((Object) stackIn_36_0);
                                          stackOut_36_1 = stackIn_36_1;
                                          stackOut_36_2 = (int[]) ((Object) stackIn_36_2);
                                          stackOut_36_3 = stackIn_36_3;
                                          stackOut_36_4 = var19;
                                          stackIn_37_0 = stackOut_36_0;
                                          stackIn_37_1 = stackOut_36_1;
                                          stackIn_37_2 = stackOut_36_2;
                                          stackIn_37_3 = stackOut_36_3;
                                          stackIn_37_4 = stackOut_36_4;
                                          break L18;
                                        } else {
                                          stackOut_35_0 = (int[]) ((Object) stackIn_35_0);
                                          stackOut_35_1 = stackIn_35_1;
                                          stackOut_35_2 = (int[]) ((Object) stackIn_35_2);
                                          stackOut_35_3 = stackIn_35_3;
                                          stackOut_35_4 = var21;
                                          stackIn_37_0 = stackOut_35_0;
                                          stackIn_37_1 = stackOut_35_1;
                                          stackIn_37_2 = stackOut_35_2;
                                          stackIn_37_3 = stackOut_35_3;
                                          stackIn_37_4 = stackOut_35_4;
                                          break L18;
                                        }
                                      }
                                      stackIn_37_2[stackIn_37_3] = stackIn_37_4;
                                      stackIn_37_0[stackIn_37_1] = stackIn_37_4;
                                      var20++;
                                      continue L17;
                                    }
                                  }
                                }
                              }
                              if (ci.field_c < var16 + var15) {
                                var20 = -var15 + ci.field_c;
                                dk.a(var18, var15, var20, var19);
                                dk.a(var18, 0, var16 + -var20, var19);
                                break L9;
                              } else {
                                dk.a(var18, var15, var16, var19);
                                break L9;
                              }
                            }
                          }
                          var17++;
                          continue L8;
                        }
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                if (ci.field_c < param5 + param1) {
                  var11 = -param1 + ci.field_c;
                  var12 = 0;
                  L19: while (true) {
                    if (param6 <= var12) {
                      break L4;
                    } else {
                      var13_ref_int__ = param4[var12 + param2];
                      dk.a(var13_ref_int__, param1, var11, var8_int);
                      dk.a(var13_ref_int__, 0, -var11 + param5, var8_int);
                      var12++;
                      continue L19;
                    }
                  }
                } else {
                  var11 = 0;
                  L20: while (true) {
                    if (param6 <= var11) {
                      break L4;
                    } else {
                      dk.a(param4[param2 + var11], param1, param5, var8_int);
                      var11++;
                      continue L20;
                    }
                  }
                }
              }
            }
            var11 = 33 / ((70 - param3) / 45);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var8 = decompiledCaughtException;
            stackOut_67_0 = (RuntimeException) (var8);
            stackOut_67_1 = new StringBuilder().append("rg.A(");
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param0 == null) {
              stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L21;
            } else {
              stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackOut_68_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L21;
            }
          }
          L22: {
            stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
            stackOut_70_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param4 == null) {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L22;
            } else {
              stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L22;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_73_0), stackIn_73_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public rg() {
        super(0, true);
        this.field_B = 0;
        this.field_A = 409;
        this.field_z = 1024;
        this.field_w = 1024;
        this.field_x = 0;
        this.field_u = 1024;
        this.field_D = 819;
        this.field_t = 2048;
        this.field_y = 1024;
    }

    final void a(byte param0) {
        if (param0 < 123) {
            rg.b(114);
        }
    }

    final void a(fj param0, int param1, int param2) {
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var5 = Torquing.field_u;
        try {
          L0: {
            if (param1 == 35) {
              L1: {
                var4_int = param2;
                if (var4_int != 0) {
                  if (var4_int == 1) {
                    this.field_y = param0.i(param1 + 7053);
                    break L1;
                  } else {
                    if ((var4_int ^ -1) == -3) {
                      this.field_t = param0.i(7088);
                      break L1;
                    } else {
                      if ((var4_int ^ -1) == -4) {
                        this.field_A = param0.i(param1 + 7053);
                        break L1;
                      } else {
                        if (-5 != (var4_int ^ -1)) {
                          if (-6 != (var4_int ^ -1)) {
                            if (-7 != (var4_int ^ -1)) {
                              if ((var4_int ^ -1) == -8) {
                                this.field_z = param0.i(7088);
                                break L1;
                              } else {
                                if (8 != var4_int) {
                                  break L1;
                                } else {
                                  this.field_u = param0.i(7088);
                                  break L1;
                                }
                              }
                            } else {
                              this.field_x = param0.i((byte) -101);
                              break L1;
                            }
                          } else {
                            this.field_w = param0.i(7088);
                            break L1;
                          }
                        } else {
                          this.field_D = param0.i(7088);
                          break L1;
                        }
                      }
                    }
                  }
                } else {
                  this.field_B = param0.i((byte) -101);
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) (var4);
            stackOut_27_1 = new StringBuilder().append("rg.H(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L2;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L2;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static uh a(boolean param0) {
        if (!param0) {
            return (uh) null;
        }
        return tn.field_l;
    }

    public static void b(int param0) {
        field_C = null;
        if (param0 != 31635) {
            field_C = (String) null;
        }
        field_v = null;
    }

    final static void a(int param0, int param1, of param2, int param3, byte param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        int[] var8_array = null;
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
        byte[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int stackIn_15_0 = 0;
        int[] stackIn_16_0 = null;
        int[] stackIn_17_0 = null;
        int[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        jb stackIn_39_0 = null;
        int stackIn_45_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        short stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        short stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_31_0 = 0;
        short stackOut_30_0 = 0;
        jb stackOut_37_0 = null;
        Object stackOut_38_0 = null;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int[] stackOut_15_0 = null;
        int[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        var40 = Torquing.field_u;
        try {
          L0: {
            L1: {
              L2: {
                var45 = param2;
                if (var45.field_i == null) {
                  break L2;
                } else {
                  if ((var45.field_M ^ -1) >= -2) {
                    break L2;
                  } else {
                    var61 = var45.field_i;
                    rk.a(var61, a.field_f, 0, (byte) -122, 0);
                    break L1;
                  }
                }
              }
              mc.c(1559487076);
              break L1;
            }
            var55 = new int[param2.field_C];
            var50 = var55;
            var41 = var50;
            var8_array = var41;
            var65 = new int[param2.field_C];
            var63 = m.field_c;
            var62 = pm.field_s;
            var64 = tm.field_e;
            var13 = 0;
            L3: while (true) {
              if (param2.field_C <= var13) {
                L4: {
                  if (param4 >= 120) {
                    break L4;
                  } else {
                    field_v = (la) null;
                    break L4;
                  }
                }
                var44 = 0;
                var13 = var44;
                L5: while (true) {
                  if (var44 >= ui.field_k) {
                    break L0;
                  } else {
                    L6: {
                      var14 = mn.field_bb[var44];
                      var15 = param2.field_G[var14];
                      var16 = param2.field_r[var14];
                      var17 = param2.field_I[var14];
                      if (param2.field_O[var14] < m.field_c.length) {
                        stackOut_25_0 = param2.field_O[var14];
                        stackIn_26_0 = stackOut_25_0;
                        break L6;
                      } else {
                        stackOut_24_0 = -1;
                        stackIn_26_0 = stackOut_24_0;
                        break L6;
                      }
                    }
                    L7: {
                      var18 = stackIn_26_0;
                      if (m.field_c.length > param2.field_J[var14]) {
                        stackOut_28_0 = param2.field_J[var14];
                        stackIn_29_0 = stackOut_28_0;
                        break L7;
                      } else {
                        stackOut_27_0 = -1;
                        stackIn_29_0 = stackOut_27_0;
                        break L7;
                      }
                    }
                    L8: {
                      var19 = stackIn_29_0;
                      if (m.field_c.length <= param2.field_F[var14]) {
                        stackOut_31_0 = -1;
                        stackIn_32_0 = stackOut_31_0;
                        break L8;
                      } else {
                        stackOut_30_0 = param2.field_F[var14];
                        stackIn_32_0 = stackOut_30_0;
                        break L8;
                      }
                    }
                    L9: {
                      L10: {
                        var20 = stackIn_32_0;
                        if (null == ha.field_d) {
                          break L10;
                        } else {
                          if (param2.field_c == null) {
                            break L10;
                          } else {
                            if (param2.field_c.length <= var14) {
                              break L10;
                            } else {
                              if (param2.field_c[var14] == -1) {
                                break L10;
                              } else {
                                if (ha.field_d.length <= param2.field_c[var14]) {
                                  break L10;
                                } else {
                                  stackOut_37_0 = ha.field_d[param2.field_c[var14]];
                                  stackIn_39_0 = stackOut_37_0;
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_38_0 = null;
                      stackIn_39_0 = (jb) ((Object) stackOut_38_0);
                      break L9;
                    }
                    L11: {
                      L12: {
                        var21_ref = stackIn_39_0;
                        var22 = kh.field_m[var15];
                        var23 = u.field_w[var15];
                        var24 = kh.field_m[var16];
                        var25 = u.field_w[var16];
                        var26 = kh.field_m[var17];
                        var27 = u.field_w[var17];
                        if (var18 != var19) {
                          break L12;
                        } else {
                          if (var20 == var19) {
                            L13: {
                              var28 = var55[var18];
                              var29 = var65[var18];
                              if (var21_ref != null) {
                                stackOut_48_0 = var21_ref.field_a;
                                stackIn_49_0 = stackOut_48_0;
                                break L13;
                              } else {
                                stackOut_47_0 = 8355711;
                                stackIn_49_0 = stackOut_47_0;
                                break L13;
                              }
                            }
                            var30 = stackIn_49_0;
                            var31 = 16711935 & var30;
                            var32 = 65280 & var30;
                            var33 = (var28 * var31 & -16711919) >>> -814340792 | (var32 * var28 & 16711700) >>> 804606824;
                            var33 = var33 + var29 * 65793;
                            te.a(var22, 8355711 & var33 >> 928757921, -87, var23, var24, var27, var25, var26);
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      L14: {
                        var28 = var55[var18];
                        var29 = var55[var19];
                        var30 = var55[var20];
                        var31 = var65[var18];
                        var32 = var65[var19];
                        var33 = var65[var20];
                        if (var21_ref == null) {
                          stackOut_44_0 = 8355711;
                          stackIn_45_0 = stackOut_44_0;
                          break L14;
                        } else {
                          stackOut_43_0 = var21_ref.field_a;
                          stackIn_45_0 = stackOut_43_0;
                          break L14;
                        }
                      }
                      var34 = stackIn_45_0;
                      var35 = var34 & 16711935;
                      var36 = 65280 & var34;
                      var37 = (var28 * var36 & 16711735) >>> -885846072 | var28 * var35 >>> -339776440 & -738262785;
                      var38 = var35 * var29 >>> 286747240 & -922812161 | (16711930 & var29 * var36) >>> -1163295256;
                      var39 = var36 * var30 >>> -157501784 & -1828651264 | var35 * var30 >>> -1438992824 & 2080309503;
                      var37 = var37 + var31 * 65793;
                      var38 = var38 + var32 * 65793;
                      var39 = var39 + 65793 * var33;
                      th.a(var22, var39 >> 1882419920, (65465 & var38) >> -1860588792, 255 & var37, var38 >> 1532656368, var37 >> -756973392, var39 & 255, var23, 255 & var38, (var37 & 65328) >> 2050881256, -25, var24, var39 >> 1339075144 & 255, var25, var26, var27);
                      break L11;
                    }
                    var44++;
                    continue L5;
                  }
                }
              } else {
                L15: {
                  var14 = var62[var13] * param7 + (var63[var13] * param0 - -(param3 * var64[var13])) >> 2080601480;
                  if (-1 < (var14 ^ -1)) {
                    var14 = -var14;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if (-1 < (var14 ^ -1)) {
                    stackOut_14_0 = 128;
                    stackIn_15_0 = stackOut_14_0;
                    break L16;
                  } else {
                    if ((var14 ^ -1) <= -129) {
                      stackOut_13_0 = 256;
                      stackIn_15_0 = stackOut_13_0;
                      break L16;
                    } else {
                      stackOut_12_0 = var14 + 128;
                      stackIn_15_0 = stackOut_12_0;
                      break L16;
                    }
                  }
                }
                L17: {
                  var14 = stackIn_15_0;
                  var15 = param1 * var64[var13] + param5 * var62[var13] + var63[var13] * param6 >> -1256029688;
                  stackOut_15_0 = id.field_c;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_16_0 = stackOut_15_0;
                  if (var15 >= 0) {
                    stackOut_17_0 = (int[]) ((Object) stackIn_17_0);
                    stackOut_17_1 = var15;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    break L17;
                  } else {
                    stackOut_16_0 = (int[]) ((Object) stackIn_16_0);
                    stackOut_16_1 = -var15;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    break L17;
                  }
                }
                var15 = stackIn_18_0[stackIn_18_1];
                var14 = (256 + -var15) * var14 >>> 1945866760;
                var55[var13] = var14;
                var65[var13] = var15;
                var13++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var8 = decompiledCaughtException;
            stackOut_52_0 = (RuntimeException) (var8);
            stackOut_52_1 = new StringBuilder().append("rg.C(").append(param0).append(',').append(param1).append(',');
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param2 == null) {
              stackOut_54_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackOut_54_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L18;
            } else {
              stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackOut_53_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L18;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_55_0), stackIn_55_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        field_C = "Checking";
    }
}
