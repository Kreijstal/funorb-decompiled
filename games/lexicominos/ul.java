/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul extends kd {
    int field_i;
    int field_l;
    static boolean field_k;
    int field_n;
    int[] field_h;
    static int field_o;
    int field_p;
    int field_m;
    int field_j;

    final static void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
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
          var42 = Lexicominos.field_L ? 1 : 0;
          if (param1 < 0) {
            break L0;
          } else {
            if (k.field_d > param3) {
              L1: {
                if (0 <= param13) {
                  break L1;
                } else {
                  if (param9 >= 0) {
                    break L1;
                  } else {
                    if (0 > param16) {
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (~k.field_f < ~param13) {
                  break L2;
                } else {
                  if (~k.field_f < ~param9) {
                    break L2;
                  } else {
                    if (param16 >= k.field_f) {
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              if (param12 == -1464114640) {
                L3: {
                  var34 = param1 - param3;
                  if (param6 == param3) {
                    L4: {
                      if (~param3 != ~param1) {
                        var35 = param1 - param6;
                        if (~param9 >= ~param13) {
                          var26 = param11 << 16;
                          var17_int = param9 << 16;
                          var24 = (param0 - param5 << 16) / var34;
                          var18 = param13 << 16;
                          var20 = (param16 + -param13 << 16) / var34;
                          var27 = (-param15 + param2 << 16) / var35;
                          var21 = param10 << 16;
                          var25 = param15 << 16;
                          var22 = param5 << 16;
                          var29 = param14 << 16;
                          var28 = (param2 - param11 << 16) / var34;
                          var19 = (-param9 + param16 << 16) / var35;
                          var23 = (-param10 + param0 << 16) / var35;
                          var32 = (-param7 + param8 << 16) / var34;
                          var31 = (param8 + -param14 << 16) / var35;
                          var30 = param7 << 16;
                          break L4;
                        } else {
                          var24 = (param0 - param10 << 16) / var35;
                          var30 = param14 << 16;
                          var26 = param15 << 16;
                          var25 = param11 << 16;
                          var21 = param5 << 16;
                          var23 = (-param5 + param0 << 16) / var34;
                          var17_int = param13 << 16;
                          var28 = (param2 + -param15 << 16) / var35;
                          var32 = (param8 + -param14 << 16) / var35;
                          var29 = param7 << 16;
                          var22 = param10 << 16;
                          var27 = (param2 + -param11 << 16) / var34;
                          var31 = (param8 + -param7 << 16) / var34;
                          var18 = param9 << 16;
                          var19 = (param16 + -param13 << 16) / var34;
                          var20 = (-param9 + param16 << 16) / var35;
                          break L4;
                        }
                      } else {
                        var18 = param9 << 16;
                        var26 = param15;
                        var28 = 0;
                        var27 = 0;
                        var25 = param11;
                        var30 = param14;
                        var31 = 0;
                        var32 = 0;
                        var23 = 0;
                        var19 = 0;
                        var20 = 0;
                        var21 = param5;
                        var24 = 0;
                        var17_int = param13 << 16;
                        var29 = param7;
                        var22 = param10;
                        break L4;
                      }
                    }
                    var33 = 0;
                    if (param3 >= 0) {
                      break L3;
                    } else {
                      param3 = Math.min(-param3, -param3 + param6);
                      var30 = var30 + param3 * var32;
                      var25 = var25 + param3 * var27;
                      var22 = var22 + var24 * param3;
                      var29 = var29 + param3 * var31;
                      var18 = var18 + param3 * var20;
                      var21 = var21 + param3 * var23;
                      var17_int = var17_int + param3 * var19;
                      var26 = var26 + param3 * var28;
                      param3 = 0;
                      break L3;
                    }
                  } else {
                    L5: {
                      var30 = param7 << 16;
                      var29 = param7 << 16;
                      var26 = param11 << 16;
                      var25 = param11 << 16;
                      var18 = param13 << 16;
                      var17_int = param13 << 16;
                      var22 = param5 << 16;
                      var21 = param5 << 16;
                      var35 = param6 - param3;
                      var19 = (param9 + -param13 << 16) / var35;
                      var20 = (param16 - param13 << 16) / var34;
                      if (var19 >= var20) {
                        var27 = (param2 - param11 << 16) / var34;
                        var31 = (-param7 + param8 << 16) / var34;
                        var24 = (-param5 + param10 << 16) / var35;
                        var36 = var19;
                        var19 = var20;
                        var20 = var36;
                        var33 = 1;
                        var23 = (param0 - param5 << 16) / var34;
                        var32 = (param14 + -param7 << 16) / var35;
                        var28 = (param15 + -param11 << 16) / var35;
                        break L5;
                      } else {
                        var32 = (param8 + -param7 << 16) / var34;
                        var23 = (param10 - param5 << 16) / var35;
                        var27 = (param15 + -param11 << 16) / var35;
                        var31 = (-param7 + param14 << 16) / var35;
                        var24 = (param0 + -param5 << 16) / var34;
                        var33 = 0;
                        var28 = (param2 + -param11 << 16) / var34;
                        break L5;
                      }
                    }
                    L6: {
                      L7: {
                        if (param3 < 0) {
                          if (param6 >= 0) {
                            param3 = -param3;
                            var29 = var29 + var31 * param3;
                            var26 = var26 + param3 * var28;
                            var22 = var22 + var24 * param3;
                            var21 = var21 + param3 * var23;
                            var30 = var30 + var32 * param3;
                            var17_int = var17_int + param3 * var19;
                            var25 = var25 + param3 * var27;
                            var18 = var18 + param3 * var20;
                            param3 = 0;
                            break L7;
                          } else {
                            param3 = -param3 + param6;
                            var18 = var18 + var20 * param3;
                            var25 = var25 + var27 * param3;
                            var21 = var21 + param3 * var23;
                            var30 = var30 + var32 * param3;
                            var26 = var26 + var28 * param3;
                            var17_int = var17_int + param3 * var19;
                            var29 = var29 + param3 * var31;
                            var22 = var22 + var24 * param3;
                            param3 = param6;
                            break L6;
                          }
                        } else {
                          break L7;
                        }
                      }
                      var36 = k.field_e[param3];
                      L8: while (true) {
                        if (~param6 >= ~param3) {
                          break L6;
                        } else {
                          L9: {
                            var37 = var17_int >> 16;
                            if (var37 < k.field_f) {
                              var38 = -(var17_int >> 16) + (var18 >> 16);
                              if (var38 == 0) {
                                if (0 > var37) {
                                  break L9;
                                } else {
                                  if (~k.field_f >= ~var37) {
                                    break L9;
                                  } else {
                                    vb.a(0, var25, var38, 0, var21, (byte) -95, param4, 0, var37 - -var36, var29);
                                    break L9;
                                  }
                                }
                              } else {
                                L10: {
                                  var39 = (var22 - var21) / var38;
                                  var40 = (var26 - var25) / var38;
                                  var41 = (-var29 + var30) / var38;
                                  if (var37 - -var38 < k.field_f) {
                                    break L10;
                                  } else {
                                    var38 = k.field_f - var37 - 1;
                                    break L10;
                                  }
                                }
                                if (var37 < 0) {
                                  vb.a(var39, -(var40 * var37) + var25, var38 - -var37, var41, var21 + -(var37 * var39), (byte) -95, param4, var40, var36, var29 + -(var41 * var37));
                                  break L9;
                                } else {
                                  vb.a(var39, var25, var38, var41, var21, (byte) -95, param4, var40, var36 + var37, var29);
                                  break L9;
                                }
                              }
                            } else {
                              break L9;
                            }
                          }
                          param3++;
                          if (~param3 > ~k.field_d) {
                            var21 = var21 + var23;
                            var22 = var22 + var24;
                            var26 = var26 + var28;
                            var30 = var30 + var32;
                            var29 = var29 + var31;
                            var17_int = var17_int + var19;
                            var36 = var36 + lf.field_f;
                            var18 = var18 + var20;
                            var25 = var25 + var27;
                            continue L8;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                    var36 = param1 - param6;
                    if (var36 != 0) {
                      L11: {
                        var37 = param16 << 16;
                        var38 = param0 << 16;
                        var39 = param2 << 16;
                        if (var33 != 0) {
                          var22 = param10 << 16;
                          var18 = param9 << 16;
                          var30 = param14 << 16;
                          var26 = param15 << 16;
                          break L11;
                        } else {
                          var21 = param10 << 16;
                          var29 = param14 << 16;
                          var17_int = param9 << 16;
                          var25 = param15 << 16;
                          break L11;
                        }
                      }
                      var40 = param8 << 16;
                      var20 = (var37 + -var18) / var36;
                      var24 = (-var22 + var38) / var36;
                      var31 = (-var29 + var40) / var36;
                      var27 = (-var25 + var39) / var36;
                      var28 = (var39 + -var26) / var36;
                      var19 = (-var17_int + var37) / var36;
                      var23 = (var38 + -var21) / var36;
                      var32 = (var40 - var30) / var36;
                      break L3;
                    } else {
                      var24 = 0;
                      var23 = 0;
                      var27 = 0;
                      var19 = 0;
                      var32 = 0;
                      var20 = 0;
                      var28 = 0;
                      var31 = 0;
                      break L3;
                    }
                  }
                }
                L12: {
                  if (param3 >= 0) {
                    break L12;
                  } else {
                    param3 = -param3;
                    var26 = var26 + var28 * param3;
                    var25 = var25 + var27 * param3;
                    var18 = var18 + var20 * param3;
                    var30 = var30 + var32 * param3;
                    var21 = var21 + param3 * var23;
                    var29 = var29 + param3 * var31;
                    var17_int = var17_int + var19 * param3;
                    var22 = var22 + var24 * param3;
                    param3 = 0;
                    break L12;
                  }
                }
                var35 = k.field_e[param3];
                L13: while (true) {
                  if (param1 <= param3) {
                    return;
                  } else {
                    L14: {
                      var36 = var17_int >> 16;
                      if (k.field_f > var36) {
                        var37 = (var18 >> 16) - (var17_int >> 16);
                        if (var37 != 0) {
                          L15: {
                            var38 = (var22 - var21) / var37;
                            var39 = (-var25 + var26) / var37;
                            var40 = (var30 - var29) / var37;
                            if (var37 + var36 >= k.field_f) {
                              var37 = k.field_f - var36 + -1;
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          if (var36 < 0) {
                            vb.a(var38, -(var39 * var36) + var25, var36 + var37, var40, var21 - var36 * var38, (byte) -95, param4, var39, var35, -(var36 * var40) + var29);
                            break L14;
                          } else {
                            vb.a(var38, var25, var37, var40, var21, (byte) -95, param4, var39, var35 + var36, var29);
                            break L14;
                          }
                        } else {
                          if (var36 < 0) {
                            break L14;
                          } else {
                            if (~var36 > ~k.field_f) {
                              vb.a(0, var25, var37, 0, var21, (byte) -95, param4, 0, var36 + var35, var29);
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                        }
                      } else {
                        break L14;
                      }
                    }
                    param3++;
                    if (~k.field_d >= ~param3) {
                      return;
                    } else {
                      var25 = var25 + var27;
                      var17_int = var17_int + var19;
                      var29 = var29 + var31;
                      var22 = var22 + var24;
                      var18 = var18 + var20;
                      var30 = var30 + var32;
                      var35 = var35 + lf.field_f;
                      var26 = var26 + var28;
                      var21 = var21 + var23;
                      continue L13;
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              break L0;
            }
          }
        }
    }

    final static int a(nc param0, sj param1, int param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_7_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (null == param1.field_n) {
                  break L1;
                } else {
                  if (param0 == null) {
                    break L1;
                  } else {
                    if (param1.field_h != param0.field_k) {
                      break L1;
                    } else {
                      L2: {
                        var4_int = param0.field_m.length;
                        var5 = param1.field_n[param3].length / var4_int;
                        if (param2 >= 44) {
                          break L2;
                        } else {
                          ul.a(-76, -113, 52, -107, (int[]) null, 3, 112, 69, -116, -97, 14, -59, 65, 10, -40, 3, 50);
                          break L2;
                        }
                      }
                      var6 = 0;
                      L3: while (true) {
                        if (var5 <= var6) {
                          stackOut_23_0 = -1;
                          stackIn_24_0 = stackOut_23_0;
                          break L0;
                        } else {
                          L4: {
                            if (param0.field_h == param1.field_i[param3][var6]) {
                              if (md.a(param1.field_j[param3][var6], -98)) {
                                var7 = 0;
                                L5: while (true) {
                                  if (var4_int <= var7) {
                                    stackOut_20_0 = var6;
                                    stackIn_21_0 = stackOut_20_0;
                                    return stackIn_21_0;
                                  } else {
                                    if (param1.field_n[param3][var7 + var4_int * var6] != param0.field_m[var7]) {
                                      break L4;
                                    } else {
                                      var7++;
                                      continue L5;
                                    }
                                  }
                                }
                              } else {
                                break L4;
                              }
                            } else {
                              break L4;
                            }
                          }
                          var6++;
                          continue L3;
                        }
                      }
                    }
                  }
                }
              }
            }
            stackOut_6_0 = -1;
            stackIn_7_0 = stackOut_6_0;
            return stackIn_7_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var4;
            stackOut_25_1 = new StringBuilder().append("ul.E(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L6;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L6;
            }
          }
          L7: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L7;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L7;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_24_0;
    }

    final void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((ul) this).field_n = param3;
        if (param2 != 0) {
            return;
        }
        try {
            ((ul) this).field_i = param4;
            ((ul) this).field_j = param5;
            ((ul) this).field_h = param0;
            ((ul) this).field_l = param7;
            ((ul) this).field_p = param1;
            ((ul) this).field_m = param6;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "ul.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void a(sh param0, sh param1, sh param2) {
        RuntimeException var4 = null;
        jb[] var5 = null;
        jb[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        jb[] var10 = null;
        db var11 = null;
        int var11_int = 0;
        int var12 = 0;
        db var13 = null;
        int var14 = 0;
        jb[] var15 = null;
        db var16 = null;
        int[][] var17 = null;
        db var18 = null;
        db var19 = null;
        int[][] var20 = null;
        int[][] var21 = null;
        int[][] var22 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var14 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            ti.field_I = td.a("commonui", "frame_top", param0, 22306);
            we.field_i = td.a("commonui", "frame_bottom", param0, 22306);
            Lexicominos.field_I = df.a("commonui", "jagex_logo_grey", param0, (byte) -123);
            uc.field_hb = td.a("commonui", "button", param0, 22306);
            be.field_b = uk.a("validation", "commonui", -909811167, param0);
            cl.field_T = (le) (Object) ee.a("commonui", "arezzo12", false, param1, param0);
            ql.field_Q = (le) (Object) ee.a("commonui", "arezzo14", false, param1, param0);
            ra.field_c = (le) (Object) ee.a("commonui", "arezzo14bold", false, param1, param0);
            var18 = new db(param2.a((byte) 127, "", "button.gif"), (java.awt.Component) (Object) ug.field_y);
            jb discarded$2 = nh.a("commonui", param0, false, "dropdown");
            var5 = wf.a(param0, "commonui", true, "screen_options");
            si.field_u = new jb[4];
            oc.field_d = new jb[4];
            uj.field_a = new jb[4];
            var6 = new jb[][]{uj.field_a, si.field_u, oc.field_d};
            var22 = new int[4][];
            var21 = var22;
            var20 = var21;
            var17 = var20;
            var7 = var17;
            var7[0] = var5[0].field_j;
            var8 = 1;
            L1: while (true) {
              if (var8 >= var22.length) {
                var8 = var5[0].field_i[0];
                var22[2][var8] = 16777215;
                var22[1][var8] = 2394342;
                var22[3][var8] = 4767999;
                var9 = 0;
                L2: while (true) {
                  if (3 <= var9) {
                    var9 = var18.field_u;
                    ja.b((byte) -116);
                    var18.b();
                    lf.b(0, 0, lf.field_f, lf.field_a);
                    var16 = new db(var9, var9);
                    var19 = var16;
                    var19.b();
                    var18.b(0, 0);
                    var11 = new db(var9, var9);
                    var11.b();
                    var18.b(-var18.field_p + var9, 0);
                    var12 = -33;
                    var13 = new db(var18.field_p + -(var9 * 2), var9);
                    var13.b();
                    var18.b(-var9, 0);
                    pd.a(-22949);
                    uc.field_hb = new db[]{var16, var13, var11};
                    break L0;
                  } else {
                    var15 = var6[var9];
                    var10 = var15;
                    var11_int = 0;
                    L3: while (true) {
                      if (var11_int >= var15.length) {
                        var9++;
                        continue L2;
                      } else {
                        int discarded$3 = 0;
                        var15[var11_int] = bf.a(var22[var11_int], var5[var9]);
                        var11_int++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                var7[var8] = (int[]) var22[0].clone();
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("ul.B(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
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
          throw ld.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + 109 + ')');
        }
    }

    final static boolean a(String param0) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          try {
            if (!ab.field_b.startsWith("win")) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0 != 0;
            } else {
              L0: {
                if (param0.startsWith("http://")) {
                  break L0;
                } else {
                  if (param0.startsWith("https://")) {
                    break L0;
                  } else {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0 != 0;
                  }
                }
              }
              var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
              var3 = 0;
              L1: while (true) {
                if (var3 >= param0.length()) {
                  Process discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                  stackOut_18_0 = 1;
                  stackIn_19_0 = stackOut_18_0;
                  return stackIn_19_0 != 0;
                } else {
                  if (var2.indexOf((int) param0.charAt(var3)) == -1) {
                    stackOut_15_0 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    return stackIn_16_0 != 0;
                  } else {
                    var3++;
                    continue L1;
                  }
                }
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            stackOut_20_0 = 0;
            stackIn_21_0 = stackOut_20_0;
            return stackIn_21_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L2: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2_ref2;
            stackOut_22_1 = new StringBuilder().append("ul.A(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L2;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L2;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + 14080 + ')');
        }
    }

    ul() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = true;
        field_o = 0;
    }
}
