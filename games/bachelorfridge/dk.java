/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dk extends td {
    static String field_q;
    static String field_p;

    final ii a(op param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        av var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var16 = 0;
        aga var17 = null;
        Object stackIn_12_0 = null;
        av stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        av stackOut_21_0 = null;
        Object stackOut_11_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var16 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var17 = ((dk) this).field_h.a(18, param0);
              var4 = ((dk) this).field_k;
              var5 = ((dk) this).field_n;
              var4 = -2 + ((dk) this).field_k + kla.a(5, param0.field_w, -2147483648);
              if (var4 >= 0) {
                break L1;
              } else {
                var4 = 0;
                break L1;
              }
            }
            L2: {
              var5 = -2 + ((dk) this).field_n - -kla.a(5, param0.field_w, param1 + 2147483645);
              if (param0.field_z > var4) {
                break L2;
              } else {
                var4 = param0.field_z - 1;
                break L2;
              }
            }
            L3: {
              if (var5 < 0) {
                var5 = 0;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param0.field_B > var5) {
                break L4;
              } else {
                var5 = -1 + param0.field_B;
                break L4;
              }
            }
            var6 = new av(((dk) this).field_g, new nq(var17), ((dk) this).field_k, ((dk) this).field_n, var4, var5);
            if (param1 == 3) {
              var7 = -3;
              L5: while (true) {
                if (var7 > 3) {
                  stackOut_21_0 = (av) var6;
                  stackIn_22_0 = stackOut_21_0;
                  break L0;
                } else {
                  var8 = -3;
                  L6: while (true) {
                    if (var8 > 3) {
                      var7++;
                      continue L5;
                    } else {
                      L7: {
                        var9 = var7 + var4;
                        var10 = var8 + var5;
                        if (0 > var9) {
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var8++;
                      continue L6;
                    }
                  }
                }
              }
            } else {
              stackOut_11_0 = null;
              stackIn_12_0 = stackOut_11_0;
              return (ii) (Object) stackIn_12_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var3;
            stackOut_23_1 = new StringBuilder().append("dk.A(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param1 + ')');
        }
        return (ii) (Object) stackIn_22_0;
    }

    dk(int param0, aga param1, int param2, int param3) {
        super(param0, param1);
        try {
            ((dk) this).field_k = param2;
            ((dk) this).field_n = param3;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "dk.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7, byte param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
        int var17_int = 0;
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
        L0: {
          var42 = BachelorFridge.field_y;
          if (param4 < 0) {
            break L0;
          } else {
            if (~param3 > ~jb.field_n) {
              L1: {
                if (param13 >= 0) {
                  break L1;
                } else {
                  if (param14 >= 0) {
                    break L1;
                  } else {
                    if (param6 < 0) {
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (~jb.field_o < ~param13) {
                  break L2;
                } else {
                  if (~param14 > ~jb.field_o) {
                    break L2;
                  } else {
                    if (jb.field_o <= param6) {
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L3: {
                if (param8 == -68) {
                  break L3;
                } else {
                  dk.a(28, -88, 0, -108, 107, -93, 5, (int[]) null, (byte) 90, -118, -41, -89, 64, -56, 104, 76, -106);
                  break L3;
                }
              }
              L4: {
                var34 = param4 - param3;
                if (~param3 == ~param9) {
                  L5: {
                    if (~param3 != ~param4) {
                      var35 = param4 + -param9;
                      if (~param14 < ~param13) {
                        var32 = (-param2 + param12 << 16) / var35;
                        var31 = (param12 - param15 << 16) / var34;
                        var22 = param0 << 16;
                        var27 = (-param10 + param1 << 16) / var34;
                        var21 = param11 << 16;
                        var18 = param14 << 16;
                        var26 = param16 << 16;
                        var24 = (-param0 + param5 << 16) / var35;
                        var29 = param15 << 16;
                        var17_int = param13 << 16;
                        var23 = (-param11 + param5 << 16) / var34;
                        var28 = (param1 + -param16 << 16) / var35;
                        var25 = param10 << 16;
                        var30 = param2 << 16;
                        var19 = (-param13 + param6 << 16) / var34;
                        var20 = (-param14 + param6 << 16) / var35;
                        break L5;
                      } else {
                        var22 = param11 << 16;
                        var32 = (-param15 + param12 << 16) / var34;
                        var26 = param10 << 16;
                        var21 = param0 << 16;
                        var30 = param15 << 16;
                        var19 = (param6 + -param14 << 16) / var35;
                        var25 = param16 << 16;
                        var20 = (param6 - param13 << 16) / var34;
                        var24 = (param5 + -param11 << 16) / var34;
                        var28 = (-param10 + param1 << 16) / var34;
                        var23 = (-param0 + param5 << 16) / var35;
                        var17_int = param14 << 16;
                        var18 = param13 << 16;
                        var31 = (param12 - param2 << 16) / var35;
                        var29 = param2 << 16;
                        var27 = (param1 + -param16 << 16) / var35;
                        break L5;
                      }
                    } else {
                      var27 = 0;
                      var32 = 0;
                      var31 = 0;
                      var30 = param2;
                      var20 = 0;
                      var28 = 0;
                      var23 = 0;
                      var17_int = param13 << 16;
                      var19 = 0;
                      var21 = param11;
                      var22 = param0;
                      var25 = param10;
                      var29 = param15;
                      var26 = param16;
                      var18 = param14 << 16;
                      var24 = 0;
                      break L5;
                    }
                  }
                  var33 = 0;
                  if (param3 >= 0) {
                    break L4;
                  } else {
                    param3 = Math.min(-param3, -param3 + param9);
                    var25 = var25 + param3 * var27;
                    var17_int = var17_int + var19 * param3;
                    var29 = var29 + var31 * param3;
                    var22 = var22 + var24 * param3;
                    var18 = var18 + var20 * param3;
                    var26 = var26 + param3 * var28;
                    var21 = var21 + var23 * param3;
                    var30 = var30 + var32 * param3;
                    param3 = 0;
                    break L4;
                  }
                } else {
                  L6: {
                    var30 = param15 << 16;
                    var29 = param15 << 16;
                    var26 = param10 << 16;
                    var25 = param10 << 16;
                    var22 = param11 << 16;
                    var21 = param11 << 16;
                    var18 = param13 << 16;
                    var17_int = param13 << 16;
                    var35 = -param3 + param9;
                    var19 = (param14 + -param13 << 16) / var35;
                    var20 = (-param13 + param6 << 16) / var34;
                    if (var19 < var20) {
                      var32 = (param12 + -param15 << 16) / var34;
                      var33 = 0;
                      var27 = (-param10 + param16 << 16) / var35;
                      var31 = (-param15 + param2 << 16) / var35;
                      var24 = (param5 - param11 << 16) / var34;
                      var28 = (param1 - param10 << 16) / var34;
                      var23 = (param0 + -param11 << 16) / var35;
                      break L6;
                    } else {
                      var36 = var19;
                      var19 = var20;
                      var20 = var36;
                      var28 = (-param10 + param16 << 16) / var35;
                      var33 = 1;
                      var31 = (param12 - param15 << 16) / var34;
                      var27 = (param1 - param10 << 16) / var34;
                      var32 = (param2 - param15 << 16) / var35;
                      var23 = (param5 + -param11 << 16) / var34;
                      var24 = (-param11 + param0 << 16) / var35;
                      break L6;
                    }
                  }
                  L7: {
                    L8: {
                      if (param3 < 0) {
                        if (param9 >= 0) {
                          param3 = -param3;
                          var25 = var25 + param3 * var27;
                          var26 = var26 + var28 * param3;
                          var17_int = var17_int + param3 * var19;
                          var18 = var18 + var20 * param3;
                          var30 = var30 + param3 * var32;
                          var22 = var22 + param3 * var24;
                          var29 = var29 + param3 * var31;
                          var21 = var21 + param3 * var23;
                          param3 = 0;
                          break L8;
                        } else {
                          param3 = -param3 + param9;
                          var17_int = var17_int + param3 * var19;
                          var25 = var25 + param3 * var27;
                          var18 = var18 + param3 * var20;
                          var26 = var26 + var28 * param3;
                          var29 = var29 + param3 * var31;
                          var30 = var30 + var32 * param3;
                          var22 = var22 + param3 * var24;
                          var21 = var21 + var23 * param3;
                          param3 = param9;
                          break L7;
                        }
                      } else {
                        break L8;
                      }
                    }
                    var36 = jb.field_a[param3];
                    L9: while (true) {
                      if (~param3 <= ~param9) {
                        break L7;
                      } else {
                        L10: {
                          var37 = var17_int >> 16;
                          if (var37 < jb.field_o) {
                            var38 = -(var17_int >> 16) + (var18 >> 16);
                            if (var38 != 0) {
                              L11: {
                                var39 = (var22 - var21) / var38;
                                var40 = (-var25 + var26) / var38;
                                var41 = (-var29 + var30) / var38;
                                if (var38 + var37 < jb.field_o) {
                                  break L11;
                                } else {
                                  var38 = -1 + (-var37 + jb.field_o);
                                  break L11;
                                }
                              }
                              if (var37 < 0) {
                                oj.a(-(var39 * var37) + var21, var39, 92, var36, param7, var29 + -(var41 * var37), -(var40 * var37) + var25, var38 + var37, var40, var41);
                                break L10;
                              } else {
                                oj.a(var21, var39, 120, var36 + var37, param7, var29, var25, var38, var40, var41);
                                break L10;
                              }
                            } else {
                              if (var37 < 0) {
                                break L10;
                              } else {
                                if (~jb.field_o >= ~var37) {
                                  break L10;
                                } else {
                                  oj.a(var21, 0, 91, var36 + var37, param7, var29, var25, var38, 0, 0);
                                  break L10;
                                }
                              }
                            }
                          } else {
                            break L10;
                          }
                        }
                        param3++;
                        if (~jb.field_n < ~param3) {
                          var26 = var26 + var28;
                          var30 = var30 + var32;
                          var17_int = var17_int + var19;
                          var18 = var18 + var20;
                          var21 = var21 + var23;
                          var29 = var29 + var31;
                          var25 = var25 + var27;
                          var36 = var36 + dg.field_i;
                          var22 = var22 + var24;
                          continue L9;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  var36 = -param9 + param4;
                  if (var36 == 0) {
                    var19 = 0;
                    var24 = 0;
                    var31 = 0;
                    var20 = 0;
                    var23 = 0;
                    var28 = 0;
                    var32 = 0;
                    var27 = 0;
                    break L4;
                  } else {
                    L12: {
                      var37 = param6 << 16;
                      var38 = param5 << 16;
                      var39 = param1 << 16;
                      var40 = param12 << 16;
                      if (var33 == 0) {
                        var29 = param2 << 16;
                        var25 = param16 << 16;
                        var21 = param0 << 16;
                        var17_int = param14 << 16;
                        break L12;
                      } else {
                        var22 = param0 << 16;
                        var26 = param16 << 16;
                        var30 = param2 << 16;
                        var18 = param14 << 16;
                        break L12;
                      }
                    }
                    var28 = (var39 - var26) / var36;
                    var23 = (var38 - var21) / var36;
                    var19 = (-var17_int + var37) / var36;
                    var20 = (var37 + -var18) / var36;
                    var32 = (-var30 + var40) / var36;
                    var27 = (var39 + -var25) / var36;
                    var24 = (-var22 + var38) / var36;
                    var31 = (var40 + -var29) / var36;
                    break L4;
                  }
                }
              }
              L13: {
                if (param3 < 0) {
                  param3 = -param3;
                  var25 = var25 + param3 * var27;
                  var29 = var29 + param3 * var31;
                  var21 = var21 + param3 * var23;
                  var18 = var18 + param3 * var20;
                  var22 = var22 + var24 * param3;
                  var17_int = var17_int + param3 * var19;
                  var26 = var26 + var28 * param3;
                  var30 = var30 + param3 * var32;
                  param3 = 0;
                  break L13;
                } else {
                  break L13;
                }
              }
              var35 = jb.field_a[param3];
              L14: while (true) {
                if (param4 <= param3) {
                  return;
                } else {
                  L15: {
                    var36 = var17_int >> 16;
                    if (~jb.field_o < ~var36) {
                      var37 = (var18 >> 16) - (var17_int >> 16);
                      if (var37 != 0) {
                        L16: {
                          var38 = (-var21 + var22) / var37;
                          var39 = (var26 + -var25) / var37;
                          var40 = (var30 + -var29) / var37;
                          if (~jb.field_o >= ~(var37 + var36)) {
                            var37 = -var36 + jb.field_o - 1;
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                        if (var36 < 0) {
                          oj.a(-(var38 * var36) + var21, var38, 97, var35, param7, var29 + -(var40 * var36), -(var36 * var39) + var25, var37 + var36, var39, var40);
                          break L15;
                        } else {
                          oj.a(var21, var38, 123, var36 + var35, param7, var29, var25, var37, var39, var40);
                          break L15;
                        }
                      } else {
                        if (var36 < 0) {
                          break L15;
                        } else {
                          if (~var36 <= ~jb.field_o) {
                            break L15;
                          } else {
                            oj.a(var21, 0, 78, var36 + var35, param7, var29, var25, var37, 0, 0);
                            break L15;
                          }
                        }
                      }
                    } else {
                      break L15;
                    }
                  }
                  param3++;
                  if (~jb.field_n >= ~param3) {
                    return;
                  } else {
                    var17_int = var17_int + var19;
                    var26 = var26 + var28;
                    var22 = var22 + var24;
                    var18 = var18 + var20;
                    var21 = var21 + var23;
                    var25 = var25 + var27;
                    var30 = var30 + var32;
                    var29 = var29 + var31;
                    var35 = var35 + dg.field_i;
                    continue L14;
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int[] param3, int param4, int param5, int param6, int param7, int[] param8, int param9, int param10, int param11, int param12) {
        RuntimeException var13 = null;
        int var14 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var14 = BachelorFridge.field_y;
        try {
          L0: {
            param1 = -param12;
            L1: while (true) {
              if (0 <= param1) {
                break L0;
              } else {
                param11 = -param2;
                L2: while (true) {
                  if (param11 >= 0) {
                    param7 = param7 + param4;
                    param10 = param10 + param5;
                    param1++;
                    continue L1;
                  } else {
                    L3: {
                      int incrementValue$2 = param10;
                      param10++;
                      param6 = param8[incrementValue$2];
                      if ((param6 & -33554432) == 0) {
                        param7++;
                        break L3;
                      } else {
                        L4: {
                          param0 = (255 & param6) + (param6 >> 15 & 510);
                          param6 = ((param6 & 65347) >> 8) + param0 / 3 >> 1;
                          if (param6 != 0) {
                            break L4;
                          } else {
                            param6 = 1;
                            break L4;
                          }
                        }
                        param6 = (param6 << 8) + (param6 << 16) + param6;
                        int incrementValue$3 = param7;
                        param7++;
                        param3[incrementValue$3] = param6;
                        break L3;
                      }
                    }
                    param11++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var13 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var13;
            stackOut_13_1 = new StringBuilder().append("dk.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param8 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + 455530063 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    final static void a(Object[] param0, byte param1, int[] param2) {
        try {
            if (param1 <= 85) {
                field_q = null;
            }
            ea.a(-1 + param2.length, 0, (byte) 27, param2, param0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "dk.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        field_q = null;
        field_p = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Cancel rematch";
    }
}
