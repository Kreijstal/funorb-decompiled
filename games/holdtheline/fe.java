/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe {
    static int[] field_b;
    static String field_a;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int[] param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
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
          var42 = HoldTheLine.field_D;
          if (param5 < ~param1) {
            break L0;
          } else {
            if (li.field_d > param15) {
              L1: {
                if (param9 >= 0) {
                  break L1;
                } else {
                  if (0 <= param3) {
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
                if (param9 < li.field_i) {
                  break L2;
                } else {
                  if (param3 < li.field_i) {
                    break L2;
                  } else {
                    if (li.field_i <= param6) {
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L3: {
                var34 = -param15 + param1;
                if (param15 != param12) {
                  L4: {
                    var26 = param10 << 16;
                    var25 = param10 << 16;
                    var30 = param13 << 16;
                    var29 = param13 << 16;
                    var22 = param0 << 16;
                    var21 = param0 << 16;
                    var18 = param9 << 16;
                    var17_int = param9 << 16;
                    var35 = param12 + -param15;
                    var19 = (-param9 + param3 << 16) / var35;
                    var20 = (-param9 + param6 << 16) / var34;
                    if (var20 > var19) {
                      var24 = (param2 - param0 << 16) / var34;
                      var31 = (param7 - param13 << 16) / var35;
                      var28 = (param11 + -param10 << 16) / var34;
                      var32 = (-param13 + param4 << 16) / var34;
                      var27 = (-param10 + param16 << 16) / var35;
                      var23 = (param14 - param0 << 16) / var35;
                      var33 = 0;
                      break L4;
                    } else {
                      var28 = (-param10 + param16 << 16) / var35;
                      var32 = (param7 - param13 << 16) / var35;
                      var27 = (param11 + -param10 << 16) / var34;
                      var36 = var19;
                      var19 = var20;
                      var20 = var36;
                      var33 = 1;
                      var24 = (param14 - param0 << 16) / var35;
                      var31 = (param4 - param13 << 16) / var34;
                      var23 = (param2 + -param0 << 16) / var34;
                      break L4;
                    }
                  }
                  L5: {
                    L6: {
                      if (param15 >= 0) {
                        break L6;
                      } else {
                        if (0 <= param12) {
                          param15 = -param15;
                          var30 = var30 + param15 * var32;
                          var25 = var25 + var27 * param15;
                          var21 = var21 + param15 * var23;
                          var17_int = var17_int + var19 * param15;
                          var26 = var26 + param15 * var28;
                          var22 = var22 + param15 * var24;
                          var18 = var18 + var20 * param15;
                          var29 = var29 + var31 * param15;
                          param15 = 0;
                          break L6;
                        } else {
                          param15 = param12 - param15;
                          var18 = var18 + var20 * param15;
                          var22 = var22 + param15 * var24;
                          var25 = var25 + var27 * param15;
                          var26 = var26 + param15 * var28;
                          var30 = var30 + param15 * var32;
                          var21 = var21 + param15 * var23;
                          var17_int = var17_int + var19 * param15;
                          var29 = var29 + param15 * var31;
                          param15 = param12;
                          break L5;
                        }
                      }
                    }
                    var36 = li.field_a[param15];
                    L7: while (true) {
                      if (param15 >= param12) {
                        break L5;
                      } else {
                        L8: {
                          var37 = var17_int >> 16;
                          if (li.field_i > var37) {
                            var38 = (var18 >> 16) + -(var17_int >> 16);
                            if (0 == var38) {
                              if (var37 < 0) {
                                break L8;
                              } else {
                                if (li.field_i <= var37) {
                                  break L8;
                                } else {
                                  sg.a(0, var37 - -var36, 0, var25, 0, param8, var38, var29, param5 ^ 122, var21);
                                  break L8;
                                }
                              }
                            } else {
                              L9: {
                                var39 = (var22 - var21) / var38;
                                var40 = (var26 + -var25) / var38;
                                var41 = (var30 + -var29) / var38;
                                if (li.field_i <= var37 - -var38) {
                                  var38 = -1 + (-var37 + li.field_i);
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              if (var37 >= 0) {
                                sg.a(var41, var36 + var37, var39, var25, var40, param8, var38, var29, -123, var21);
                                break L8;
                              } else {
                                sg.a(var41, var36, var39, -(var37 * var40) + var25, var40, param8, var38 - -var37, var29 - var41 * var37, param5 ^ 126, -(var37 * var39) + var21);
                                break L8;
                              }
                            }
                          } else {
                            break L8;
                          }
                        }
                        param15++;
                        if (li.field_d <= param15) {
                          return;
                        } else {
                          var17_int = var17_int + var19;
                          var30 = var30 + var32;
                          var21 = var21 + var23;
                          var36 = var36 + tc.field_j;
                          var26 = var26 + var28;
                          var22 = var22 + var24;
                          var25 = var25 + var27;
                          var29 = var29 + var31;
                          var18 = var18 + var20;
                          continue L7;
                        }
                      }
                    }
                  }
                  var36 = param1 - param12;
                  if (var36 == 0) {
                    var27 = 0;
                    var20 = 0;
                    var23 = 0;
                    var32 = 0;
                    var19 = 0;
                    var24 = 0;
                    var31 = 0;
                    var28 = 0;
                    break L3;
                  } else {
                    L10: {
                      var37 = param6 << 16;
                      var38 = param2 << 16;
                      var39 = param11 << 16;
                      var40 = param4 << 16;
                      if (var33 != 0) {
                        var18 = param3 << 16;
                        var22 = param14 << 16;
                        var26 = param16 << 16;
                        var30 = param7 << 16;
                        break L10;
                      } else {
                        var21 = param14 << 16;
                        var29 = param7 << 16;
                        var25 = param16 << 16;
                        var17_int = param3 << 16;
                        break L10;
                      }
                    }
                    var31 = (-var29 + var40) / var36;
                    var20 = (-var18 + var37) / var36;
                    var24 = (-var22 + var38) / var36;
                    var23 = (-var21 + var38) / var36;
                    var27 = (var39 - var25) / var36;
                    var19 = (var37 - var17_int) / var36;
                    var32 = (-var30 + var40) / var36;
                    var28 = (-var26 + var39) / var36;
                    break L3;
                  }
                } else {
                  L11: {
                    if (param15 != param1) {
                      var35 = -param12 + param1;
                      if (param9 >= param3) {
                        var26 = param10 << 16;
                        var30 = param13 << 16;
                        var17_int = param3 << 16;
                        var25 = param16 << 16;
                        var20 = (-param9 + param6 << 16) / var34;
                        var28 = (param11 - param10 << 16) / var34;
                        var24 = (param2 - param0 << 16) / var34;
                        var32 = (-param13 + param4 << 16) / var34;
                        var21 = param14 << 16;
                        var31 = (-param7 + param4 << 16) / var35;
                        var22 = param0 << 16;
                        var27 = (param11 + -param16 << 16) / var35;
                        var29 = param7 << 16;
                        var19 = (param6 + -param3 << 16) / var35;
                        var23 = (param2 - param14 << 16) / var35;
                        var18 = param9 << 16;
                        break L11;
                      } else {
                        var31 = (-param13 + param4 << 16) / var34;
                        var24 = (param2 - param14 << 16) / var35;
                        var17_int = param9 << 16;
                        var20 = (param6 - param3 << 16) / var35;
                        var32 = (-param7 + param4 << 16) / var35;
                        var27 = (-param10 + param11 << 16) / var34;
                        var18 = param3 << 16;
                        var25 = param10 << 16;
                        var26 = param16 << 16;
                        var22 = param14 << 16;
                        var28 = (-param16 + param11 << 16) / var35;
                        var23 = (-param0 + param2 << 16) / var34;
                        var21 = param0 << 16;
                        var29 = param13 << 16;
                        var19 = (param6 + -param9 << 16) / var34;
                        var30 = param7 << 16;
                        break L11;
                      }
                    } else {
                      var26 = param16;
                      var20 = 0;
                      var28 = 0;
                      var24 = 0;
                      var19 = 0;
                      var31 = 0;
                      var22 = param14;
                      var30 = param7;
                      var21 = param0;
                      var25 = param10;
                      var23 = 0;
                      var18 = param3 << 16;
                      var17_int = param9 << 16;
                      var27 = 0;
                      var29 = param13;
                      var32 = 0;
                      break L11;
                    }
                  }
                  var33 = 0;
                  if (param15 < 0) {
                    param15 = Math.min(-param15, -param15 + param12);
                    var18 = var18 + var20 * param15;
                    var21 = var21 + var23 * param15;
                    var17_int = var17_int + var19 * param15;
                    var22 = var22 + var24 * param15;
                    var30 = var30 + var32 * param15;
                    var25 = var25 + param15 * var27;
                    var29 = var29 + var31 * param15;
                    var26 = var26 + var28 * param15;
                    param15 = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L12: {
                if (param15 >= 0) {
                  break L12;
                } else {
                  param15 = -param15;
                  var18 = var18 + var20 * param15;
                  var21 = var21 + param15 * var23;
                  var26 = var26 + var28 * param15;
                  var22 = var22 + var24 * param15;
                  var25 = var25 + var27 * param15;
                  var17_int = var17_int + var19 * param15;
                  var30 = var30 + param15 * var32;
                  var29 = var29 + param15 * var31;
                  param15 = 0;
                  break L12;
                }
              }
              var35 = li.field_a[param15];
              L13: while (true) {
                if (param15 >= param1) {
                  return;
                } else {
                  L14: {
                    var36 = var17_int >> 16;
                    if (li.field_i <= var36) {
                      break L14;
                    } else {
                      var37 = (var18 >> 16) + -(var17_int >> 16);
                      if (var37 == 0) {
                        if (var36 < 0) {
                          break L14;
                        } else {
                          if (li.field_i > var36) {
                            sg.a(0, var36 - -var35, 0, var25, 0, param8, var37, var29, -127, var21);
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                      } else {
                        L15: {
                          var38 = (var22 + -var21) / var37;
                          var39 = (var26 + -var25) / var37;
                          var40 = (-var29 + var30) / var37;
                          if (li.field_i <= var37 + var36) {
                            var37 = li.field_i + (-var36 + -1);
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        if (0 > var36) {
                          sg.a(var40, var35, var38, var25 - var39 * var36, var39, param8, var37 - -var36, var29 + -(var40 * var36), -118, var21 - var36 * var38);
                          break L14;
                        } else {
                          sg.a(var40, var35 + var36, var38, var25, var39, param8, var37, var29, param5 ^ 121, var21);
                          break L14;
                        }
                      }
                    }
                  }
                  param15++;
                  if (param15 >= li.field_d) {
                    return;
                  } else {
                    var25 = var25 + var27;
                    var29 = var29 + var31;
                    var18 = var18 + var20;
                    var17_int = var17_int + var19;
                    var35 = var35 + tc.field_j;
                    var30 = var30 + var32;
                    var21 = var21 + var23;
                    var26 = var26 + var28;
                    var22 = var22 + var24;
                    continue L13;
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
    }

    final static k a(byte[] param0, int param1) {
        k var2 = null;
        RuntimeException var2_ref = null;
        Object var3 = null;
        k stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        k stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                if (param1 == 1092937296) {
                  break L1;
                } else {
                  var3 = null;
                  k discarded$2 = fe.a((byte[]) null, -47);
                  break L1;
                }
              }
              var2 = new k(param0, la.field_j, wb.field_g, nk.field_K, ad.field_d, dd.field_E, lk.field_e);
              tk.a(false);
              stackOut_5_0 = (k) var2;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2_ref;
            stackOut_7_1 = new StringBuilder().append("fe.A(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
        return stackIn_6_0;
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "SUV";
    }
}
