/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class in extends bh {
    boolean field_p;
    static String field_u;
    static w field_o;
    private ck field_t;
    static String field_s;
    int field_r;
    private int[] field_q;
    static lm field_n;

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, boolean param14, boolean param15) {
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        Object var21 = null;
        Object var22 = null;
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
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var46 = 0;
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        int var57 = 0;
        int var58 = 0;
        Object var59 = null;
        int var60 = 0;
        Object stackIn_72_0 = null;
        Object stackIn_73_0 = null;
        Object stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        Object stackIn_79_0 = null;
        Object stackIn_79_1 = null;
        int stackIn_79_2 = 0;
        int stackIn_79_3 = 0;
        int stackIn_79_4 = 0;
        int stackIn_79_5 = 0;
        int stackIn_79_6 = 0;
        int stackIn_79_7 = 0;
        Object stackIn_80_0 = null;
        Object stackIn_80_1 = null;
        int stackIn_80_2 = 0;
        int stackIn_80_3 = 0;
        int stackIn_80_4 = 0;
        int stackIn_80_5 = 0;
        int stackIn_80_6 = 0;
        int stackIn_80_7 = 0;
        Object stackIn_81_0 = null;
        Object stackIn_81_1 = null;
        int stackIn_81_2 = 0;
        int stackIn_81_3 = 0;
        int stackIn_81_4 = 0;
        int stackIn_81_5 = 0;
        int stackIn_81_6 = 0;
        int stackIn_81_7 = 0;
        int stackIn_81_8 = 0;
        Object stackOut_71_0 = null;
        Object stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        Object stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        Object stackOut_78_0 = null;
        Object stackOut_78_1 = null;
        int stackOut_78_2 = 0;
        int stackOut_78_3 = 0;
        int stackOut_78_4 = 0;
        int stackOut_78_5 = 0;
        int stackOut_78_6 = 0;
        int stackOut_78_7 = 0;
        Object stackOut_80_0 = null;
        Object stackOut_80_1 = null;
        int stackOut_80_2 = 0;
        int stackOut_80_3 = 0;
        int stackOut_80_4 = 0;
        int stackOut_80_5 = 0;
        int stackOut_80_6 = 0;
        int stackOut_80_7 = 0;
        int stackOut_80_8 = 0;
        Object stackOut_79_0 = null;
        Object stackOut_79_1 = null;
        int stackOut_79_2 = 0;
        int stackOut_79_3 = 0;
        int stackOut_79_4 = 0;
        int stackOut_79_5 = 0;
        int stackOut_79_6 = 0;
        int stackOut_79_7 = 0;
        int stackOut_79_8 = 0;
        L0: {
          var17 = param9;
          var18 = -param7;
          var19 = this.field_t.field_D[param11 * this.field_t.field_K + param10];
          var20 = (var19 & 24) >> 3;
          var21 = null;
          var22 = null;
          var23 = 0;
          var24 = 2;
          var25 = Math.abs(param9);
          if (var20 != 1) {
            break L0;
          } else {
            L1: {
              if (param10 > 0) {
                L2: {
                  if (((this.field_t.field_D[param11 * this.field_t.field_K + (param10 - 1)] ^ var19) & 31) == 0) {
                    var23++;
                    if (param10 < this.field_t.field_K - 1) {
                      if (((this.field_t.field_D[param11 * this.field_t.field_K + (param10 + 1)] ^ var19) & 31) == 0) {
                        var23 += 2;
                        break L2;
                      } else {
                        if (param11 <= 0) {
                          break L1;
                        } else {
                          if (((this.field_t.field_D[(param11 - 1) * this.field_t.field_K + param10] ^ var19) & 31) != 0) {
                            break L1;
                          } else {
                            var23 += 4;
                            break L1;
                          }
                        }
                      }
                    } else {
                      if (param11 <= 0) {
                        break L1;
                      } else {
                        if (((this.field_t.field_D[(param11 - 1) * this.field_t.field_K + param10] ^ var19) & 31) != 0) {
                          break L1;
                        } else {
                          var23 += 4;
                          break L1;
                        }
                      }
                    }
                  } else {
                    if (param10 < this.field_t.field_K - 1) {
                      if (((this.field_t.field_D[param11 * this.field_t.field_K + (param10 + 1)] ^ var19) & 31) == 0) {
                        var23 += 2;
                        break L2;
                      } else {
                        if (param11 <= 0) {
                          break L1;
                        } else {
                          if (((this.field_t.field_D[(param11 - 1) * this.field_t.field_K + param10] ^ var19) & 31) != 0) {
                            break L1;
                          } else {
                            var23 += 4;
                            break L1;
                          }
                        }
                      }
                    } else {
                      if (param11 <= 0) {
                        break L1;
                      } else {
                        if (((this.field_t.field_D[(param11 - 1) * this.field_t.field_K + param10] ^ var19) & 31) != 0) {
                          break L1;
                        } else {
                          var23 += 4;
                          break L1;
                        }
                      }
                    }
                  }
                }
                if (param11 <= 0) {
                  break L1;
                } else {
                  if (((this.field_t.field_D[(param11 - 1) * this.field_t.field_K + param10] ^ var19) & 31) != 0) {
                    break L1;
                  } else {
                    var23 += 4;
                    break L1;
                  }
                }
              } else {
                if (param10 >= this.field_t.field_K - 1) {
                  if (param11 <= 0) {
                    break L1;
                  } else {
                    if (((this.field_t.field_D[(param11 - 1) * this.field_t.field_K + param10] ^ var19) & 31) == 0) {
                      var23 += 4;
                      break L1;
                    } else {
                      if (param11 <= 0) {
                        break L1;
                      } else {
                        if (((this.field_t.field_D[(param11 - 1) * this.field_t.field_K + param10] ^ var19) & 31) != 0) {
                          break L1;
                        } else {
                          var23 += 4;
                          break L1;
                        }
                      }
                    }
                  }
                } else {
                  if (param11 <= 0) {
                    break L1;
                  } else {
                    if (((this.field_t.field_D[(param11 - 1) * this.field_t.field_K + param10] ^ var19) & 31) != 0) {
                      break L1;
                    } else {
                      var23 += 4;
                      break L1;
                    }
                  }
                }
              }
            }
            L3: {
              if (param11 >= this.field_t.field_C - 1) {
                break L3;
              } else {
                if (((this.field_t.field_D[(param11 + 1) * this.field_t.field_K + param10] ^ var19) & 31) != 0) {
                  break L3;
                } else {
                  var23 += 8;
                  break L3;
                }
              }
            }
            var21 = ob.field_j[param0][var19 & 7];
            var22 = gf.field_f[var23];
            break L0;
          }
        }
        L4: {
          var26 = this.field_q[param11 * this.field_t.field_K + param10];
          var27 = (byte)var26;
          var28 = (byte)(var26 >> 8);
          var29 = var26 >> 16 & 255;
          var30 = var26 >> 24;
          var31 = (param13 + var30 - 60) * 1000 / 60;
          if (!param14) {
            break L4;
          } else {
            var32 = (int)(333.0 * Math.sin((double)(uf.field_A + var30) * 0.045));
            if (var31 <= var32) {
              break L4;
            } else {
              var31 = var32;
              break L4;
            }
          }
        }
        L5: {
          L6: {
            var31 = var31 * var31 / 1000;
            var32 = (param13 + var30 / 2 - 60) * 2000 / 60;
            if (!param14) {
              break L6;
            } else {
              if (var32 <= 0) {
                break L6;
              } else {
                var32 = 0;
                break L5;
              }
            }
          }
          var32 = var32 * var32 / 2000;
          var32 = var32 * var32 / 2000;
          var32 = var32 * var32 / 2000;
          break L5;
        }
        var33 = var29 * (var31 + var32) / 10;
        var34 = var33 * var27 / ((this.field_t.field_K + this.field_t.field_C) * 4);
        var35 = var33 * var28 / ((this.field_t.field_K + this.field_t.field_C) * 4) + (int)(100.0 * Math.sin((double)(uf.field_A + var30 * 4) * 0.07));
        var36 = 4000000 / param3;
        var37 = (var34 * param7 + var33 * param9) / (var36 * 2);
        var38 = (var34 * param9 - var33 * param7) / (var36 * 2);
        param4 = param4 + var37;
        param5 = param5 + var35;
        param6 = param6 + var38;
        if (var21 != null) {
          L7: {
            if (var25 >= param7 * 2) {
              break L7;
            } else {
              var24 = 1 + ((var24 - 1) * var25 + param7 / 2) / param7;
              break L7;
            }
          }
          var39 = 2147483647;
          var40 = -2147483648;
          var41 = 2147483647;
          var42 = -2147483648;
          var43 = -var24;
          L8: while (true) {
            if (var43 > var24) {
              L9: {
                if (var39 == 2147483647) {
                  break L9;
                } else {
                  hk.c(var39 - 2, var41 - 2, var40 - var39 + 4, var42 - var41 + 4, 2, 0);
                  break L9;
                }
              }
              return;
            } else {
              var44 = var43;
              var45 = var43;
              var46 = this.field_t.field_K * var24 * 2;
              var47 = param4 + (param10 * param7 * var24 * 2 + var17 * var44) / var46;
              var48 = param4 + ((param10 + 1) * param7 * var24 * 2 + var17 * var45) / var46;
              var49 = param5 + param11 * param8 / this.field_t.field_C;
              var50 = param5 + (param11 + 1) * param8 / this.field_t.field_C;
              var51 = param6 + (param10 * param9 * var24 * 2 + var18 * var44) / var46;
              var52 = param6 + ((param10 + 1) * param9 * var24 * 2 + var18 * var45) / var46;
              if (var51 >= 500) {
                if (var52 >= 500) {
                  var53 = param1 + var47 * param3 / var51;
                  var54 = param1 + var48 * param3 / var52;
                  var55 = param2 + var49 * param3 / var51;
                  var56 = param2 + var49 * param3 / var52;
                  var57 = param2 + var50 * param3 / var51;
                  var58 = param2 + var50 * param3 / var52;
                  if (!param15) {
                    L10: {
                      stackOut_71_0 = var21;
                      stackIn_73_0 = stackOut_71_0;
                      stackIn_72_0 = stackOut_71_0;
                      if (var43 != var24) {
                        stackOut_73_0 = stackIn_73_0;
                        stackOut_73_1 = var23 & 12;
                        stackIn_74_0 = stackOut_73_0;
                        stackIn_74_1 = stackOut_73_1;
                        break L10;
                      } else {
                        stackOut_72_0 = stackIn_72_0;
                        stackOut_72_1 = var23;
                        stackIn_74_0 = stackOut_72_0;
                        stackIn_74_1 = stackOut_72_1;
                        break L10;
                      }
                    }
                    L11: {
                      var59 = ((Object[]) ((Object) stackIn_74_0))[stackIn_74_1];
                      var60 = 0;
                      if (param10 >= param12) {
                        break L11;
                      } else {
                        var60 = (var24 - var43) * ((ck) (var59)).field_K / (var24 * 2);
                        break L11;
                      }
                    }
                    L12: {
                      if (param10 <= param12) {
                        break L12;
                      } else {
                        var60 = (var24 + var43) * ((ck) (var59)).field_K / (var24 * 2);
                        break L12;
                      }
                    }
                    L13: {
                      stackOut_78_0 = var59;
                      stackOut_78_1 = var22;
                      stackOut_78_2 = var53;
                      stackOut_78_3 = var54;
                      stackOut_78_4 = var55;
                      stackOut_78_5 = var56;
                      stackOut_78_6 = var57;
                      stackOut_78_7 = var58;
                      stackIn_80_0 = stackOut_78_0;
                      stackIn_80_1 = stackOut_78_1;
                      stackIn_80_2 = stackOut_78_2;
                      stackIn_80_3 = stackOut_78_3;
                      stackIn_80_4 = stackOut_78_4;
                      stackIn_80_5 = stackOut_78_5;
                      stackIn_80_6 = stackOut_78_6;
                      stackIn_80_7 = stackOut_78_7;
                      stackIn_79_0 = stackOut_78_0;
                      stackIn_79_1 = stackOut_78_1;
                      stackIn_79_2 = stackOut_78_2;
                      stackIn_79_3 = stackOut_78_3;
                      stackIn_79_4 = stackOut_78_4;
                      stackIn_79_5 = stackOut_78_5;
                      stackIn_79_6 = stackOut_78_6;
                      stackIn_79_7 = stackOut_78_7;
                      if (var43 >= var24) {
                        stackOut_80_0 = stackIn_80_0;
                        stackOut_80_1 = stackIn_80_1;
                        stackOut_80_2 = stackIn_80_2;
                        stackOut_80_3 = stackIn_80_3;
                        stackOut_80_4 = stackIn_80_4;
                        stackOut_80_5 = stackIn_80_5;
                        stackOut_80_6 = stackIn_80_6;
                        stackOut_80_7 = stackIn_80_7;
                        stackOut_80_8 = 0;
                        stackIn_81_0 = stackOut_80_0;
                        stackIn_81_1 = stackOut_80_1;
                        stackIn_81_2 = stackOut_80_2;
                        stackIn_81_3 = stackOut_80_3;
                        stackIn_81_4 = stackOut_80_4;
                        stackIn_81_5 = stackOut_80_5;
                        stackIn_81_6 = stackOut_80_6;
                        stackIn_81_7 = stackOut_80_7;
                        stackIn_81_8 = stackOut_80_8;
                        break L13;
                      } else {
                        stackOut_79_0 = stackIn_79_0;
                        stackOut_79_1 = stackIn_79_1;
                        stackOut_79_2 = stackIn_79_2;
                        stackOut_79_3 = stackIn_79_3;
                        stackOut_79_4 = stackIn_79_4;
                        stackOut_79_5 = stackIn_79_5;
                        stackOut_79_6 = stackIn_79_6;
                        stackOut_79_7 = stackIn_79_7;
                        stackOut_79_8 = 1;
                        stackIn_81_0 = stackOut_79_0;
                        stackIn_81_1 = stackOut_79_1;
                        stackIn_81_2 = stackOut_79_2;
                        stackIn_81_3 = stackOut_79_3;
                        stackIn_81_4 = stackOut_79_4;
                        stackIn_81_5 = stackOut_79_5;
                        stackIn_81_6 = stackOut_79_6;
                        stackIn_81_7 = stackOut_79_7;
                        stackIn_81_8 = stackOut_79_8;
                        break L13;
                      }
                    }
                    cg.a((ck) ((Object) stackIn_81_0), (pi) ((Object) stackIn_81_1), stackIn_81_2, stackIn_81_3, stackIn_81_4, stackIn_81_5, stackIn_81_6, stackIn_81_7, stackIn_81_8 != 0, false, var60, -1);
                    var43 += 2;
                    continue L8;
                  } else {
                    L14: {
                      if (var53 >= var39) {
                        break L14;
                      } else {
                        var39 = var53;
                        break L14;
                      }
                    }
                    L15: {
                      if (var54 <= var40) {
                        break L15;
                      } else {
                        var40 = var54;
                        break L15;
                      }
                    }
                    L16: {
                      if (var55 >= var41) {
                        break L16;
                      } else {
                        var41 = var55;
                        break L16;
                      }
                    }
                    L17: {
                      if (var56 >= var41) {
                        break L17;
                      } else {
                        var41 = var56;
                        break L17;
                      }
                    }
                    L18: {
                      if (var57 <= var42) {
                        break L18;
                      } else {
                        var42 = var57;
                        break L18;
                      }
                    }
                    if (var58 > var42) {
                      var42 = var58;
                      var43 += 2;
                      continue L8;
                    } else {
                      var43 += 2;
                      continue L8;
                    }
                  }
                } else {
                  var43 += 2;
                  continue L8;
                }
              } else {
                var43 += 2;
                continue L8;
              }
            }
          }
        } else {
          return;
        }
    }

    in(String param0, int param1, boolean param2) {
        int discarded$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
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
        int[] var29 = null;
        int[] var31 = null;
        int[] var33 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        var27 = client.field_A ? 1 : 0;
        this.field_r = 0;
        try {
          L0: {
            L1: {
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param2) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            ((in) (this)).field_p = stackIn_4_1 != 0;
            var4_int = field_n.b(param0, 2147483647);
            var5 = field_n.b(param0, 2147483647, 8);
            var4_int--;
            this.field_t = new ck(var4_int, var5);
            var33 = hk.field_l;
            var7 = hk.field_j;
            var8 = hk.field_i;
            this.field_t.a();
            discarded$6 = field_n.a(param0, 0, 0, 1 + var4_int, var5, param1, -1, 1, 1, 8);
            hk.a(var33, var7, var8);
            this.field_q = new int[var4_int * var5];
            var31 = new int[var5 * var4_int];
            var29 = var31;
            var9 = var29;
            var10 = 0;
            L2: while (true) {
              stackOut_5_0 = var10;
              stackOut_5_1 = var5;
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              L3: while (true) {
                L4: {
                  if (stackIn_6_0 >= stackIn_6_1) {
                    break L4;
                  } else {
                    if (var27 != 0) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var11 = 0;
                      L5: while (true) {
                        L6: {
                          if (var4_int <= var11) {
                            break L6;
                          } else {
                            stackOut_10_0 = -1;
                            stackOut_10_1 = this.field_q[var10 * var4_int + var11] ^ -1;
                            stackIn_6_0 = stackOut_10_0;
                            stackIn_6_1 = stackOut_10_1;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            if (var27 != 0) {
                              continue L3;
                            } else {
                              L7: {
                                L8: {
                                  L9: {
                                    if (stackIn_11_0 == stackIn_11_1) {
                                      break L9;
                                    } else {
                                      if (var27 == 0) {
                                        break L8;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  var12 = this.field_t.field_D[var4_int * var10 - -var11];
                                  if (-1 == (24 & var12 ^ -1)) {
                                    break L8;
                                  } else {
                                    L10: {
                                      L11: {
                                        var13 = var11;
                                        var14 = var11;
                                        var15 = var10;
                                        var16 = var10;
                                        var17 = 0;
                                        var18 = 1;
                                        var9[0] = var10 * var4_int + var11;
                                        this.field_t.field_D[var4_int * var10 + var11] = this.field_t.field_D[var4_int * var10 + var11] + -2147483648;
                                        if (-9 != (24 & var12 ^ -1)) {
                                          break L11;
                                        } else {
                                          var19 = 31 & var12;
                                          L12: while (true) {
                                            if (var17 >= var18) {
                                              break L11;
                                            } else {
                                              incrementValue$7 = var17;
                                              var17++;
                                              var20 = var9[incrementValue$7];
                                              var21 = var20 % var4_int;
                                              stackOut_17_0 = var21;
                                              stackOut_17_1 = var13;
                                              stackIn_40_0 = stackOut_17_0;
                                              stackIn_40_1 = stackOut_17_1;
                                              stackIn_18_0 = stackOut_17_0;
                                              stackIn_18_1 = stackOut_17_1;
                                              if (var27 != 0) {
                                                break L10;
                                              } else {
                                                L13: {
                                                  if (stackIn_18_0 >= stackIn_18_1) {
                                                    break L13;
                                                  } else {
                                                    var13 = var21;
                                                    break L13;
                                                  }
                                                }
                                                L14: {
                                                  if (var14 >= var21) {
                                                    break L14;
                                                  } else {
                                                    var14 = var21;
                                                    break L14;
                                                  }
                                                }
                                                L15: {
                                                  var22 = var20 / var4_int;
                                                  if (var16 >= var22) {
                                                    break L15;
                                                  } else {
                                                    var16 = var22;
                                                    break L15;
                                                  }
                                                }
                                                L16: {
                                                  if (var15 <= var22) {
                                                    break L16;
                                                  } else {
                                                    var15 = var22;
                                                    break L16;
                                                  }
                                                }
                                                L17: {
                                                  if (0 >= var21) {
                                                    break L17;
                                                  } else {
                                                    if ((-2147483617 & this.field_t.field_D[var20 + -1]) != var19) {
                                                      break L17;
                                                    } else {
                                                      incrementValue$8 = var18;
                                                      var18++;
                                                      var9[incrementValue$8] = -1 + var20;
                                                      this.field_t.field_D[-1 + var20] = this.field_t.field_D[-1 + var20] + -2147483648;
                                                      break L17;
                                                    }
                                                  }
                                                }
                                                L18: {
                                                  if (-1 + var4_int <= var21) {
                                                    break L18;
                                                  } else {
                                                    if ((this.field_t.field_D[1 + var20] & -2147483617) != var19) {
                                                      break L18;
                                                    } else {
                                                      incrementValue$9 = var18;
                                                      var18++;
                                                      var9[incrementValue$9] = 1 + var20;
                                                      this.field_t.field_D[var20 - -1] = this.field_t.field_D[var20 - -1] + -2147483648;
                                                      break L18;
                                                    }
                                                  }
                                                }
                                                L19: {
                                                  if (var22 <= 0) {
                                                    break L19;
                                                  } else {
                                                    if ((this.field_t.field_D[-var4_int + var20] & -2147483617) != var19) {
                                                      break L19;
                                                    } else {
                                                      incrementValue$10 = var18;
                                                      var18++;
                                                      var9[incrementValue$10] = var20 - var4_int;
                                                      this.field_t.field_D[-var4_int + var20] = this.field_t.field_D[-var4_int + var20] + -2147483648;
                                                      break L19;
                                                    }
                                                  }
                                                }
                                                L20: {
                                                  if (var22 >= var5 + -1) {
                                                    break L20;
                                                  } else {
                                                    if (var19 != (this.field_t.field_D[var20 + var4_int] & -2147483617)) {
                                                      break L20;
                                                    } else {
                                                      incrementValue$11 = var18;
                                                      var18++;
                                                      var9[incrementValue$11] = var20 - -var4_int;
                                                      this.field_t.field_D[var20 + var4_int] = this.field_t.field_D[var20 + var4_int] + -2147483648;
                                                      break L20;
                                                    }
                                                  }
                                                }
                                                continue L12;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var19 = -var4_int + (var13 - -var14 - -1);
                                      var20 = 1 + var16 + var15 - var5;
                                      stackOut_39_0 = 150;
                                      stackOut_39_1 = -ka.a((byte) 116, 51, tf.field_cb);
                                      stackIn_40_0 = stackOut_39_0;
                                      stackIn_40_1 = stackOut_39_1;
                                      break L10;
                                    }
                                    var21 = stackIn_40_0 - stackIn_40_1;
                                    var22 = var21;
                                    var23 = -8 + ka.a((byte) 50, 17, tf.field_cb);
                                    var24 = (var23 << 1645931960) + (var22 << 2006781008) + ((var20 << 1634433896 & 65280) + (255 & var19));
                                    var25 = 0;
                                    L21: while (true) {
                                      if (var25 >= var18) {
                                        break L8;
                                      } else {
                                        var26 = var31[var25];
                                        this.field_t.field_D[var26] = this.field_t.field_D[var26] - -2147483648;
                                        this.field_q[var26] = var24;
                                        var25++;
                                        if (var27 != 0) {
                                          break L7;
                                        } else {
                                          continue L21;
                                        }
                                      }
                                    }
                                  }
                                }
                                var11++;
                                break L7;
                              }
                              if (var27 == 0) {
                                continue L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        var10++;
                        if (var27 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var4 = decompiledCaughtException;
            stackOut_48_0 = (RuntimeException) (var4);
            stackOut_48_1 = new StringBuilder().append("in.<init>(");
            stackIn_50_0 = stackOut_48_0;
            stackIn_50_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param0 == null) {
              stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L22;
            } else {
              stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackOut_49_2 = "{...}";
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_51_2 = stackOut_49_2;
              break L22;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_51_0), stackIn_51_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, byte param5, boolean param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_12_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_36_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_22_0 = 0;
        L0: {
          L1: {
            var19 = client.field_A ? 1 : 0;
            param10 = param10 - param0;
            param8 = param8 - param12;
            param4 = param4 - param3;
            var14 = vl.a(23841, param4 * param4 - -(param8 * param8), this.field_t.field_K * -(param4 * param3 - -(param12 * param8)));
            var15 = vl.a(23841, param10, this.field_t.field_C * -param0);
            var16 = var14;
            if (var15 >= 0) {
              break L1;
            } else {
              var15 = 0;
              if (var19 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          if (this.field_t.field_C >= var15) {
            break L0;
          } else {
            var15 = this.field_t.field_C;
            break L0;
          }
        }
        L2: {
          L3: {
            if (-1 >= (var14 ^ -1)) {
              break L3;
            } else {
              var14 = 0;
              if (var19 == 0) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          if (this.field_t.field_K >= var14) {
            break L2;
          } else {
            var14 = this.field_t.field_K;
            break L2;
          }
        }
        if (param5 != 72) {
          return;
        } else {
          var17 = 0;
          L4: while (true) {
            L5: {
              L6: {
                if (var17 >= this.field_t.field_K) {
                  break L6;
                } else {
                  stackOut_11_0 = 0;
                  stackIn_20_0 = stackOut_11_0;
                  stackIn_12_0 = stackOut_11_0;
                  if (var19 != 0) {
                    break L5;
                  } else {
                    var18 = stackIn_12_0;
                    L7: while (true) {
                      L8: {
                        L9: {
                          if (this.field_t.field_C <= var18) {
                            break L9;
                          } else {
                            this.a(param9, param11, param1, param7, param3, param0, param12, param4, param10, param8, var17, var18, var16, param2, param6, true);
                            var18++;
                            if (var19 != 0) {
                              break L8;
                            } else {
                              if (var19 == 0) {
                                continue L7;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                        var17++;
                        break L8;
                      }
                      if (var19 == 0) {
                        continue L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
              }
              stackOut_19_0 = 0;
              stackIn_20_0 = stackOut_19_0;
              break L5;
            }
            var17 = stackIn_20_0;
            L10: while (true) {
              L11: {
                if (var14 <= var17) {
                  stackOut_35_0 = this.field_t.field_K + -1;
                  stackIn_36_0 = stackOut_35_0;
                  break L11;
                } else {
                  stackOut_22_0 = 0;
                  stackIn_36_0 = stackOut_22_0;
                  stackIn_23_0 = stackOut_22_0;
                  if (var19 != 0) {
                    break L11;
                  } else {
                    var18 = stackIn_23_0;
                    L12: while (true) {
                      L13: {
                        if (var18 >= var15) {
                          var18 = this.field_t.field_C + -1;
                          break L13;
                        } else {
                          this.a(param9, param11, param1, param7, param3, param0, param12, param4, param10, param8, var17, var18, var16, param2, param6, false);
                          var18++;
                          if (var19 != 0) {
                            break L13;
                          } else {
                            continue L12;
                          }
                        }
                      }
                      L14: while (true) {
                        L15: {
                          if (var15 > var18) {
                            var17++;
                            break L15;
                          } else {
                            this.a(param9, param11, param1, param7, param3, param0, param12, param4, param10, param8, var17, var18, var16, param2, param6, false);
                            var18--;
                            if (var19 != 0) {
                              break L15;
                            } else {
                              continue L14;
                            }
                          }
                        }
                        continue L10;
                      }
                    }
                  }
                }
              }
              var17 = stackIn_36_0;
              L16: while (true) {
                L17: {
                  if (var17 < var14) {
                    break L17;
                  } else {
                    if (var19 != 0) {
                      break L17;
                    } else {
                      var18 = 0;
                      L18: while (true) {
                        L19: {
                          if (var18 >= var15) {
                            var18 = this.field_t.field_C - 1;
                            break L19;
                          } else {
                            this.a(param9, param11, param1, param7, param3, param0, param12, param4, param10, param8, var17, var18, var16, param2, param6, false);
                            var18++;
                            if (var19 != 0) {
                              break L19;
                            } else {
                              continue L18;
                            }
                          }
                        }
                        L20: while (true) {
                          L21: {
                            if (var15 > var18) {
                              var17--;
                              break L21;
                            } else {
                              this.a(param9, param11, param1, param7, param3, param0, param12, param4, param10, param8, var17, var18, var16, param2, param6, false);
                              var18--;
                              if (var19 != 0) {
                                break L21;
                              } else {
                                continue L20;
                              }
                            }
                          }
                          continue L16;
                        }
                      }
                    }
                  }
                }
                return;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_s = null;
        field_n = null;
        field_u = null;
        if (param0 < 121) {
            return;
        }
        field_o = null;
    }

    final static void c(byte param0) {
        db.a(param0 + -76, te.field_q, ve.field_Gc, true);
        dc.field_d = true;
        if (param0 != -51) {
            ug var2 = (ug) null;
            in.a((ug) null, (byte) 121, -105);
        }
    }

    final void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var8 = 2000;
          var9 = 1500;
          if (param4) {
            var9 = 600;
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 != 1) {
          return;
        } else {
          L1: {
            L2: {
              if (var9 * this.field_t.field_K > this.field_t.field_C * var8) {
                break L2;
              } else {
                var8 = var9 * this.field_t.field_K / this.field_t.field_C;
                if (!client.field_A) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            var9 = this.field_t.field_C * var8 / this.field_t.field_K;
            break L1;
          }
          L3: {
            if (param4) {
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L3;
            } else {
              stackOut_8_0 = 1;
              stackIn_10_0 = stackOut_8_0;
              break L3;
            }
          }
          L4: {
            if (stackIn_10_0 != 0) {
              stackOut_12_0 = 0;
              stackIn_13_0 = stackOut_12_0;
              break L4;
            } else {
              stackOut_11_0 = 5 * this.field_r;
              stackIn_13_0 = stackOut_11_0;
              break L4;
            }
          }
          var10 = stackIn_13_0;
          this.a(-var9 + -var10, param2, param6, -var8, var8, (byte) 72, param4, param0, 10000, param5, -var10 + var9, param3, 10000);
          return;
        }
    }

    final static void a(ug param0, byte param1, int param2) {
        uf var3 = null;
        try {
            var3 = we.field_b;
            var3.f(param2, param1 ^ 70);
            if (param1 != -70) {
                ug var4 = (ug) null;
                in.a((ug) null, (byte) -31, 108);
            }
            var3.a(true, param0.field_o);
            var3.d(-1, param0.field_p);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "in.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_u = "All games";
        field_s = "<%0> is not a member, and cannot play with the current options.";
    }
}
