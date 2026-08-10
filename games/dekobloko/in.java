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
        Object stackIn_70_0 = null;
        Object stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        Object stackIn_77_0;
        Object stackIn_77_1;
        int stackIn_77_2;
        int stackIn_77_3;
        int stackIn_77_4;
        int stackIn_77_5;
        int stackIn_77_6;
        int stackIn_77_7;
        Object stackIn_78_0;
        Object stackIn_78_1;
        int stackIn_78_2;
        int stackIn_78_3;
        int stackIn_78_4;
        int stackIn_78_5;
        int stackIn_78_6;
        int stackIn_78_7;
        int stackIn_78_8;
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
              L2: {
                if (param10 > 0) {
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
        if (var21 == null) {
          return;
        } else {
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
                      stackIn_70_0 = var21;

                      if (var43 != var24) {
                        stackIn_71_0 = stackIn_70_0;
                        stackIn_71_1 = var23 & 12;
                        break L10;
                      } else {
                        stackIn_71_0 = stackIn_70_0;
                        stackIn_71_1 = var23;
                        break L10;
                      }
                    }
                    L11: {
                      var59 = ((Object[]) ((Object) stackIn_71_0))[stackIn_71_1];
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
                      stackIn_77_0 = var59;

                      stackIn_77_1 = var22;

                      stackIn_77_2 = var53;

                      stackIn_77_3 = var54;

                      stackIn_77_4 = var55;

                      stackIn_77_5 = var56;

                      stackIn_77_6 = var57;

                      stackIn_77_7 = var58;

                      if (var43 >= var24) {
                        stackIn_78_0 = stackIn_77_0;
                        stackIn_78_1 = stackIn_77_1;
                        stackIn_78_2 = stackIn_77_2;
                        stackIn_78_3 = stackIn_77_3;
                        stackIn_78_4 = stackIn_77_4;
                        stackIn_78_5 = stackIn_77_5;
                        stackIn_78_6 = stackIn_77_6;
                        stackIn_78_7 = stackIn_77_7;
                        stackIn_78_8 = 0;
                        break L13;
                      } else {
                        stackIn_78_0 = stackIn_77_0;
                        stackIn_78_1 = stackIn_77_1;
                        stackIn_78_2 = stackIn_77_2;
                        stackIn_78_3 = stackIn_77_3;
                        stackIn_78_4 = stackIn_77_4;
                        stackIn_78_5 = stackIn_77_5;
                        stackIn_78_6 = stackIn_77_6;
                        stackIn_78_7 = stackIn_77_7;
                        stackIn_78_8 = 1;
                        break L13;
                      }
                    }
                    cg.a((ck) ((Object) stackIn_78_0), (pi) ((Object) stackIn_78_1), stackIn_78_2, stackIn_78_3, stackIn_78_4, stackIn_78_5, stackIn_78_6, stackIn_78_7, stackIn_78_8 != 0, false, var60, -1);
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
        }
    }

    in(String param0, int param1, boolean param2) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
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
        int[] var29 = null;
        int[] var31 = null;
        int[] var33 = null;
        this.field_r = 0;
        try {
          L0: {
            L1: {
              stackIn_3_0 = this;

              if (!param2) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
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
            field_n.a(param0, 0, 0, 1 + var4_int, var5, param1, -1, 1, 1, 8);
            hk.a(var33, var7, var8);
            this.field_q = new int[var4_int * var5];
            var31 = new int[var5 * var4_int];
            var29 = var31;
            var9 = var29;
            var10 = 0;
            L2: while (true) {
              if (var10 >= var5) {
                break L0;
              } else {
                var11 = 0;
                L3: while (true) {
                  if (var4_int <= var11) {
                    var10++;
                    continue L2;
                  } else {
                    L4: {
                      if (-1 != (this.field_q[var10 * var4_int + var11] ^ -1)) {
                        break L4;
                      } else {
                        var12 = this.field_t.field_D[var4_int * var10 - -var11];
                        if (-1 == (24 & var12 ^ -1)) {
                          break L4;
                        } else {
                          L5: {
                            var13 = var11;
                            var14 = var11;
                            var15 = var10;
                            var16 = var10;
                            var17 = 0;
                            var18 = 1;
                            var9[0] = var10 * var4_int + var11;
                            this.field_t.field_D[var4_int * var10 + var11] = this.field_t.field_D[var4_int * var10 + var11] + -2147483648;
                            if (-9 != (24 & var12 ^ -1)) {
                              break L5;
                            } else {
                              var19 = 31 & var12;
                              L6: while (true) {
                                if (var17 >= var18) {
                                  break L5;
                                } else {
                                  L7: {
                                    incrementValue$0 = var17;
                                    var17++;
                                    var20 = var9[incrementValue$0];
                                    var21 = var20 % var4_int;
                                    if (var21 >= var13) {
                                      break L7;
                                    } else {
                                      var13 = var21;
                                      break L7;
                                    }
                                  }
                                  L8: {
                                    if (var14 >= var21) {
                                      break L8;
                                    } else {
                                      var14 = var21;
                                      break L8;
                                    }
                                  }
                                  L9: {
                                    var22 = var20 / var4_int;
                                    if (var16 >= var22) {
                                      break L9;
                                    } else {
                                      var16 = var22;
                                      break L9;
                                    }
                                  }
                                  L10: {
                                    if (var15 <= var22) {
                                      break L10;
                                    } else {
                                      var15 = var22;
                                      break L10;
                                    }
                                  }
                                  L11: {
                                    if (0 >= var21) {
                                      break L11;
                                    } else {
                                      if ((-2147483617 & this.field_t.field_D[var20 + -1]) != var19) {
                                        break L11;
                                      } else {
                                        incrementValue$1 = var18;
                                        var18++;
                                        var9[incrementValue$1] = -1 + var20;
                                        this.field_t.field_D[-1 + var20] = this.field_t.field_D[-1 + var20] + -2147483648;
                                        break L11;
                                      }
                                    }
                                  }
                                  L12: {
                                    if (-1 + var4_int <= var21) {
                                      break L12;
                                    } else {
                                      if ((this.field_t.field_D[1 + var20] & -2147483617) != var19) {
                                        break L12;
                                      } else {
                                        incrementValue$2 = var18;
                                        var18++;
                                        var9[incrementValue$2] = 1 + var20;
                                        this.field_t.field_D[var20 - -1] = this.field_t.field_D[var20 - -1] + -2147483648;
                                        break L12;
                                      }
                                    }
                                  }
                                  L13: {
                                    if (var22 <= 0) {
                                      break L13;
                                    } else {
                                      if ((this.field_t.field_D[-var4_int + var20] & -2147483617) != var19) {
                                        break L13;
                                      } else {
                                        incrementValue$3 = var18;
                                        var18++;
                                        var9[incrementValue$3] = var20 - var4_int;
                                        this.field_t.field_D[-var4_int + var20] = this.field_t.field_D[-var4_int + var20] + -2147483648;
                                        break L13;
                                      }
                                    }
                                  }
                                  if (var22 >= var5 + -1) {
                                    continue L6;
                                  } else {
                                    if (var19 != (this.field_t.field_D[var20 + var4_int] & -2147483617)) {
                                      continue L6;
                                    } else {
                                      incrementValue$4 = var18;
                                      var18++;
                                      var9[incrementValue$4] = var20 - -var4_int;
                                      this.field_t.field_D[var20 + var4_int] = this.field_t.field_D[var20 + var4_int] + -2147483648;
                                      continue L6;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var19 = -var4_int + (var13 - -var14 - -1);
                          var20 = 1 + var16 + var15 - var5;
                          var21 = 150 - -ka.a((byte) 116, 51, tf.field_cb);
                          var22 = var21;
                          var23 = -8 + ka.a((byte) 50, 17, tf.field_cb);
                          var24 = (var23 << 1645931960) + (var22 << 2006781008) + ((var20 << 1634433896 & 65280) + (255 & var19));
                          var25 = 0;
                          L14: while (true) {
                            if (var25 >= var18) {
                              break L4;
                            } else {
                              var26 = var31[var25];
                              this.field_t.field_D[var26] = this.field_t.field_D[var26] - -2147483648;
                              this.field_q[var26] = var24;
                              var25++;
                              continue L14;
                            }
                          }
                        }
                      }
                    }
                    var11++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var4 = decompiledCaughtException;
            stackIn_41_0 = (RuntimeException) (var4);

            stackIn_41_1 = new StringBuilder().append("in.<init>(");

            if (param0 == null) {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "null";
              break L15;
            } else {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "{...}";
              break L15;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, byte param5, boolean param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        L0: {
          var19 = client.field_A ? 1 : 0;
          param10 = param10 - param0;
          param8 = param8 - param12;
          param4 = param4 - param3;
          var14 = vl.a(23841, param4 * param4 - -(param8 * param8), this.field_t.field_K * -(param4 * param3 - -(param12 * param8)));
          var15 = vl.a(23841, param10, this.field_t.field_C * -param0);
          var16 = var14;
          if (var15 >= 0) {
            if (this.field_t.field_C >= var15) {
              break L0;
            } else {
              var15 = this.field_t.field_C;
              break L0;
            }
          } else {
            var15 = 0;
            break L0;
          }
        }
        L1: {
          if (-1 >= (var14 ^ -1)) {
            if (this.field_t.field_K >= var14) {
              break L1;
            } else {
              var14 = this.field_t.field_K;
              break L1;
            }
          } else {
            var14 = 0;
            break L1;
          }
        }
        if (param5 == 72) {
          var17 = 0;
          L2: while (true) {
            if (var17 >= this.field_t.field_K) {
              var17 = 0;
              L3: while (true) {
                if (var14 <= var17) {
                  var17 = this.field_t.field_K + -1;
                  L4: while (true) {
                    if (var17 < var14) {
                      return;
                    } else {
                      var18 = 0;
                      L5: while (true) {
                        if (var18 >= var15) {
                          var18 = this.field_t.field_C - 1;
                          L6: while (true) {
                            if (var15 > var18) {
                              var17--;
                              continue L4;
                            } else {
                              this.a(param9, param11, param1, param7, param3, param0, param12, param4, param10, param8, var17, var18, var16, param2, param6, false);
                              var18--;
                              continue L6;
                            }
                          }
                        } else {
                          this.a(param9, param11, param1, param7, param3, param0, param12, param4, param10, param8, var17, var18, var16, param2, param6, false);
                          var18++;
                          continue L5;
                        }
                      }
                    }
                  }
                } else {
                  var18 = 0;
                  L7: while (true) {
                    if (var18 >= var15) {
                      var18 = this.field_t.field_C + -1;
                      L8: while (true) {
                        if (var15 > var18) {
                          var17++;
                          continue L3;
                        } else {
                          this.a(param9, param11, param1, param7, param3, param0, param12, param4, param10, param8, var17, var18, var16, param2, param6, false);
                          var18--;
                          continue L8;
                        }
                      }
                    } else {
                      this.a(param9, param11, param1, param7, param3, param0, param12, param4, param10, param8, var17, var18, var16, param2, param6, false);
                      var18++;
                      continue L7;
                    }
                  }
                }
              }
            } else {
              var18 = 0;
              L9: while (true) {
                if (this.field_t.field_C <= var18) {
                  var17++;
                  continue L2;
                } else {
                  this.a(param9, param11, param1, param7, param3, param0, param12, param4, param10, param8, var17, var18, var16, param2, param6, true);
                  var18++;
                  continue L9;
                }
              }
            }
          }
        } else {
          return;
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
        int var8 = 2000;
        int var9 = 1500;
        if (!(!param4)) {
            var9 = 600;
        }
        if (param1 != 1) {
            return;
        }
        if (var9 * this.field_t.field_K <= this.field_t.field_C * var8) {
            var8 = var9 * this.field_t.field_K / this.field_t.field_C;
        } else {
            var9 = this.field_t.field_C * var8 / this.field_t.field_K;
        }
        int var10 = !(!param4) ? 5 * this.field_r : 0;
        this.a(-var9 + -var10, param2, param6, -var8, var8, (byte) 72, param4, param0, 10000, param5, -var10 + var9, param3, 10000);
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
