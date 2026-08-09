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
        Object stackIn_73_0 = null;
        Object stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        Object stackIn_80_0;
        Object stackIn_80_1;
        int stackIn_80_2;
        int stackIn_80_3;
        int stackIn_80_4;
        int stackIn_80_5;
        int stackIn_80_6;
        int stackIn_80_7;
        Object stackIn_81_0;
        Object stackIn_81_1;
        int stackIn_81_2;
        int stackIn_81_3;
        int stackIn_81_4;
        int stackIn_81_5;
        int stackIn_81_6;
        int stackIn_81_7;
        int stackIn_81_8;
        int var17;
        int var18;
        int var19;
        int var20;
        Object var21;
        Object var22;
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
        int var33;
        int var34;
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
        int var48;
        int var49;
        int var50;
        int var51;
        int var52;
        int var53;
        int var54;
        int var55;
        int var56;
        int var57;
        int var58;
        Object var59;
        int var60;
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
                      stackIn_73_0 = var21;

                      if (var43 != var24) {
                        stackIn_74_0 = stackIn_73_0;
                        stackIn_74_1 = var23 & 12;
                        break L10;
                      } else {
                        stackIn_74_0 = stackIn_73_0;
                        stackIn_74_1 = var23;
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
                      stackIn_80_0 = var59;

                      stackIn_80_1 = var22;

                      stackIn_80_2 = var53;

                      stackIn_80_3 = var54;

                      stackIn_80_4 = var55;

                      stackIn_80_5 = var56;

                      stackIn_80_6 = var57;

                      stackIn_80_7 = var58;

                      if (var43 >= var24) {
                        stackIn_81_0 = stackIn_80_0;
                        stackIn_81_1 = stackIn_80_1;
                        stackIn_81_2 = stackIn_80_2;
                        stackIn_81_3 = stackIn_80_3;
                        stackIn_81_4 = stackIn_80_4;
                        stackIn_81_5 = stackIn_80_5;
                        stackIn_81_6 = stackIn_80_6;
                        stackIn_81_7 = stackIn_80_7;
                        stackIn_81_8 = 0;
                        break L13;
                      } else {
                        stackIn_81_0 = stackIn_80_0;
                        stackIn_81_1 = stackIn_80_1;
                        stackIn_81_2 = stackIn_80_2;
                        stackIn_81_3 = stackIn_80_3;
                        stackIn_81_4 = stackIn_80_4;
                        stackIn_81_5 = stackIn_80_5;
                        stackIn_81_6 = stackIn_80_6;
                        stackIn_81_7 = stackIn_80_7;
                        stackIn_81_8 = 1;
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
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
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
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var27 = client.field_A ? 1 : 0;
                    this.field_r = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        stackIn_3_0 = this;
                        stackIn_2_0 = stackIn_3_0;
                        if (!param2) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_4_0 = this;
                        stackIn_4_1 = 1;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_4_0 = this;
                        stackIn_4_1 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ((in) (this)).field_p = stackIn_4_1 != 0;
                        var4_int = field_n.b(param0, 2147483647);
                        var5 = field_n.b(param0, 2147483647, 8);
                        var4_int--;
                        this.field_t = new ck(var4_int, var5);
                        var33 = hk.field_l;
                        var7 = hk.field_j;
                        var8 = hk.field_i;
                        this.field_t.a();
                        field_n.a(param0, 0, 0, 1 + var4_int, var5, param1, -1, 1, 1, 8);
                        hk.a(var33, var7, var8);
                        this.field_q = new int[var4_int * var5];
                        var31 = new int[var5 * var4_int];
                        var29 = var31;
                        var9 = var29;
                        var10 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_6_0 = var10;
                        stackIn_6_1 = var5;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (stackIn_6_0 >= stackIn_6_1) {
                            statePc = 52;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var27 != 0) {
                            statePc = 53;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var11 = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var4_int <= var11) {
                            statePc = 46;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_6_0 = -1;
                        stackIn_11_0 = stackIn_6_0;
                        stackIn_6_1 = this.field_q[var10 * var4_int + var11] ^ -1;
                        stackIn_11_1 = stackIn_6_1;
                        if (var27 != 0) {
                            statePc = 6;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (stackIn_11_0 == stackIn_11_1) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var27 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var12 = this.field_t.field_D[var4_int * var10 - -var11];
                        if (-1 == (24 & var12 ^ -1)) {
                            statePc = 44;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var13 = var11;
                        var14 = var11;
                        var15 = var10;
                        var16 = var10;
                        var17 = 0;
                        var18 = 1;
                        var9[0] = var10 * var4_int + var11;
                        this.field_t.field_D[var4_int * var10 + var11] = this.field_t.field_D[var4_int * var10 + var11] + -2147483648;
                        if (-9 != (24 & var12 ^ -1)) {
                            statePc = 39;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var19 = 31 & var12;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var17 >= var18) {
                            statePc = 39;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        incrementValue$0 = var17;
                        var17++;
                        var20 = var9[incrementValue$0];
                        var21 = var20 % var4_int;
                        stackIn_40_0 = var21;
                        stackIn_18_0 = stackIn_40_0;
                        stackIn_40_1 = var13;
                        stackIn_18_1 = stackIn_40_1;
                        if (var27 != 0) {
                            statePc = 40;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (stackIn_18_0 >= stackIn_18_1) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var13 = var21;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var14 >= var21) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var14 = var21;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var22 = var20 / var4_int;
                        if (var16 >= var22) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var16 = var22;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var15 <= var22) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var15 = var22;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (0 >= var21) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if ((-2147483617 & this.field_t.field_D[var20 + -1]) != var19) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        incrementValue$1 = var18;
                        var18++;
                        var9[incrementValue$1] = -1 + var20;
                        this.field_t.field_D[-1 + var20] = this.field_t.field_D[-1 + var20] + -2147483648;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (-1 + var4_int <= var21) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if ((this.field_t.field_D[1 + var20] & -2147483617) != var19) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        incrementValue$2 = var18;
                        var18++;
                        var9[incrementValue$2] = 1 + var20;
                        this.field_t.field_D[var20 - -1] = this.field_t.field_D[var20 - -1] + -2147483648;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var22 <= 0) {
                            statePc = 35;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if ((this.field_t.field_D[-var4_int + var20] & -2147483617) != var19) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        incrementValue$3 = var18;
                        var18++;
                        var9[incrementValue$3] = var20 - var4_int;
                        this.field_t.field_D[-var4_int + var20] = this.field_t.field_D[-var4_int + var20] + -2147483648;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (var22 >= var5 + -1) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var19 != (this.field_t.field_D[var20 + var4_int] & -2147483617)) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        incrementValue$4 = var18;
                        var18++;
                        var9[incrementValue$4] = var20 - -var4_int;
                        this.field_t.field_D[var20 + var4_int] = this.field_t.field_D[var20 + var4_int] + -2147483648;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (var27 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var19 = -var4_int + (var13 - -var14 - -1);
                        var20 = 1 + var16 + var15 - var5;
                        stackIn_40_0 = 150;
                        stackIn_40_1 = -ka.a((byte) 116, 51, tf.field_cb);
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var21 = stackIn_40_0 - stackIn_40_1;
                        var22 = var21;
                        var23 = -8 + ka.a((byte) 50, 17, tf.field_cb);
                        var24 = (var23 << 1645931960) + (var22 << 2006781008) + ((var20 << 1634433896 & 65280) + (255 & var19));
                        var25 = 0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var25 >= var18) {
                            statePc = 44;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var26 = var31[var25];
                        this.field_t.field_D[var26] = this.field_t.field_D[var26] - -2147483648;
                        this.field_q[var26] = var24;
                        var25++;
                        if (var27 != 0) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (var27 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var11++;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (var27 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var10++;
                        if (var27 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 48: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_50_0 = (RuntimeException) (var4);
                    stackIn_49_0 = stackIn_50_0;
                    stackIn_50_1 = new StringBuilder().append("in.<init>(");
                    stackIn_49_1 = stackIn_50_1;
                    if (param0 == null) {
                        statePc = 50;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    stackIn_51_0 = (RuntimeException) ((Object) stackIn_49_0);
                    stackIn_51_1 = (StringBuilder) ((Object) stackIn_49_1);
                    stackIn_51_2 = "{...}";
                    statePc = 51;
                    continue stateLoop;
                }
                case 50: {
                    stackIn_51_0 = (RuntimeException) ((Object) stackIn_50_0);
                    stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
                    stackIn_51_2 = "null";
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    throw dh.a((Throwable) ((Object) stackIn_51_0), stackIn_51_2 + ',' + param1 + ',' + param2 + ')');
                }
                case 52: {
                    return;
                }
                case 53: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, byte param5, boolean param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        int stackIn_12_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_36_0 = 0;
        int statePc = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = client.field_A ? 1 : 0;
                    param10 = param10 - param0;
                    param8 = param8 - param12;
                    param4 = param4 - param3;
                    var14 = vl.a(23841, param4 * param4 - -(param8 * param8), this.field_t.field_K * -(param4 * param3 - -(param12 * param8)));
                    var15 = vl.a(23841, param10, this.field_t.field_C * -param0);
                    var16 = var14;
                    if (var15 >= 0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var15 = 0;
                    if (var19 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (this.field_t.field_C >= var15) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var15 = this.field_t.field_C;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (-1 >= (var14 ^ -1)) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var14 = 0;
                    if (var19 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (this.field_t.field_K >= var14) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var14 = this.field_t.field_K;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (param5 != 72) {
                        statePc = 53;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var17 = 0;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (var17 >= this.field_t.field_K) {
                        statePc = 19;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    stackIn_20_0 = 0;
                    stackIn_12_0 = stackIn_20_0;
                    if (var19 != 0) {
                        statePc = 20;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var18 = stackIn_12_0;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    if (this.field_t.field_C <= var18) {
                        statePc = 17;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    this.a(param9, param11, param1, param7, param3, param0, param12, param4, param10, param8, var17, var18, var16, param2, param6, true);
                    var18++;
                    if (var19 != 0) {
                        statePc = 18;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (var19 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var17++;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (var19 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    stackIn_20_0 = 0;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    var17 = stackIn_20_0;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    if (var14 <= var17) {
                        statePc = 35;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    stackIn_36_0 = 0;
                    stackIn_23_0 = stackIn_36_0;
                    if (var19 != 0) {
                        statePc = 36;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var18 = stackIn_23_0;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (var18 >= var15) {
                        statePc = 28;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    this.a(param9, param11, param1, param7, param3, param0, param12, param4, param10, param8, var17, var18, var16, param2, param6, false);
                    var18++;
                    if (var19 != 0) {
                        statePc = 29;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (var19 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var18 = this.field_t.field_C + -1;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    if (var15 > var18) {
                        statePc = 33;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    this.a(param9, param11, param1, param7, param3, param0, param12, param4, param10, param8, var17, var18, var16, param2, param6, false);
                    var18--;
                    if (var19 != 0) {
                        statePc = 34;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if (var19 == 0) {
                        statePc = 29;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var17++;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    if (var19 == 0) {
                        statePc = 21;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    stackIn_36_0 = this.field_t.field_K + -1;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    var17 = stackIn_36_0;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (var17 < var14) {
                        statePc = 52;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (var19 != 0) {
                        statePc = 52;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    var18 = 0;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if (var18 >= var15) {
                        statePc = 44;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    this.a(param9, param11, param1, param7, param3, param0, param12, param4, param10, param8, var17, var18, var16, param2, param6, false);
                    var18++;
                    if (var19 != 0) {
                        statePc = 45;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (var19 == 0) {
                        statePc = 40;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    var18 = this.field_t.field_C - 1;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    if (var15 > var18) {
                        statePc = 49;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    this.a(param9, param11, param1, param7, param3, param0, param12, param4, param10, param8, var17, var18, var16, param2, param6, false);
                    var18--;
                    if (var19 != 0) {
                        statePc = 50;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (var19 == 0) {
                        statePc = 45;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    var17--;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    if (var19 == 0) {
                        statePc = 37;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    return;
                }
                case 53: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
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
        int var8;
        int var9;
        int var10;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
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
              stackIn_10_0 = 0;
              break L3;
            } else {
              stackIn_10_0 = 1;
              break L3;
            }
          }
          L4: {
            if (stackIn_10_0 != 0) {
              stackIn_13_0 = 0;
              break L4;
            } else {
              stackIn_13_0 = 5 * this.field_r;
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
