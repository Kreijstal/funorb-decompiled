/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg {
    static aj field_a;
    static int field_f;
    static ci field_c;
    static String field_e;
    static vc field_d;
    static um field_b;

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (0 == param1) {
            var2 = sg.field_d;
        }
        int var3 = -37 % ((36 - param0) / 53);
        if (param1 == 1) {
            var2 = ii.field_Q;
        }
        if (!(param1 != 2)) {
            var2 = v.field_d;
        }
        return var2;
    }

    final static boolean a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 >= 68) {
                break L1;
              } else {
                int discarded$6 = lg.a((byte) -92);
                break L1;
              }
            }
            int discarded$7 = 10;
            int discarded$8 = -17;
            stackOut_2_0 = hf.a(true, param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("lg.B(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    final static int a(byte param0) {
        if (param0 != -122) {
            field_f = 52;
            return 1;
        }
        return 1;
    }

    final static void a(int[] param0, boolean param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
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
          var42 = Chess.field_G;
          if (param6 < 0) {
            break L0;
          } else {
            if (nh.field_l > param3) {
              L1: {
                if (param2 >= 0) {
                  break L1;
                } else {
                  if (param14 >= 0) {
                    break L1;
                  } else {
                    if (param15 >= 0) {
                      break L1;
                    } else {
                      return;
                    }
                  }
                }
              }
              L2: {
                if (~nh.field_o < ~param2) {
                  break L2;
                } else {
                  if (~param14 > ~nh.field_o) {
                    break L2;
                  } else {
                    if (~nh.field_o < ~param15) {
                      break L2;
                    } else {
                      return;
                    }
                  }
                }
              }
              L3: {
                lg.a((int[]) null, false, 99, -85, 76, 0, -23, 120, 25, 3, -33, 32, 68, 91, 124, 23, 71);
                var34 = -param3 + param6;
                if (~param12 != ~param3) {
                  L4: {
                    var30 = param9 << 16;
                    var29 = param9 << 16;
                    var18 = param2 << 16;
                    var17_int = param2 << 16;
                    var22 = param11 << 16;
                    var21 = param11 << 16;
                    var26 = param4 << 16;
                    var25 = param4 << 16;
                    var35 = param12 + -param3;
                    var20 = (-param2 + param15 << 16) / var34;
                    var19 = (param14 + -param2 << 16) / var35;
                    if (var19 >= var20) {
                      var23 = (-param11 + param13 << 16) / var34;
                      var28 = (param7 + -param4 << 16) / var35;
                      var27 = (-param4 + param5 << 16) / var34;
                      var31 = (param10 + -param9 << 16) / var34;
                      var33 = 1;
                      var32 = (param8 + -param9 << 16) / var35;
                      var24 = (param16 - param11 << 16) / var35;
                      var36 = var19;
                      var19 = var20;
                      var20 = var36;
                      break L4;
                    } else {
                      var31 = (-param9 + param8 << 16) / var35;
                      var27 = (param7 - param4 << 16) / var35;
                      var32 = (-param9 + param10 << 16) / var34;
                      var28 = (-param4 + param5 << 16) / var34;
                      var23 = (param16 - param11 << 16) / var35;
                      var33 = 0;
                      var24 = (param13 - param11 << 16) / var34;
                      break L4;
                    }
                  }
                  L5: {
                    L6: {
                      if (param3 < 0) {
                        if (param12 >= 0) {
                          param3 = -param3;
                          var21 = var21 + var23 * param3;
                          var29 = var29 + var31 * param3;
                          var26 = var26 + var28 * param3;
                          var17_int = var17_int + param3 * var19;
                          var30 = var30 + param3 * var32;
                          var25 = var25 + param3 * var27;
                          var22 = var22 + var24 * param3;
                          var18 = var18 + var20 * param3;
                          param3 = 0;
                          break L6;
                        } else {
                          param3 = -param3 + param12;
                          var17_int = var17_int + param3 * var19;
                          var30 = var30 + param3 * var32;
                          var25 = var25 + var27 * param3;
                          var18 = var18 + var20 * param3;
                          var26 = var26 + param3 * var28;
                          var29 = var29 + param3 * var31;
                          var22 = var22 + var24 * param3;
                          var21 = var21 + var23 * param3;
                          param3 = param12;
                          break L5;
                        }
                      } else {
                        break L6;
                      }
                    }
                    var36 = nh.field_p[param3];
                    L7: while (true) {
                      if (~param3 <= ~param12) {
                        break L5;
                      } else {
                        L8: {
                          var37 = var17_int >> 16;
                          if (nh.field_o > var37) {
                            var38 = (var18 >> 16) + -(var17_int >> 16);
                            if (var38 == 0) {
                              if (var37 < 0) {
                                break L8;
                              } else {
                                if (~var37 > ~nh.field_o) {
                                  pi.a(0, 0, var25, param0, 0, var38, var29, var36 + var37, var21, -127);
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                            } else {
                              L9: {
                                var39 = (-var21 + var22) / var38;
                                var40 = (var26 - var25) / var38;
                                var41 = (var30 + -var29) / var38;
                                if (~nh.field_o >= ~(var37 + var38)) {
                                  var38 = -1 + -var37 + nh.field_o;
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              if (var37 >= 0) {
                                pi.a(var41, var40, var25, param0, var39, var38, var29, var36 + var37, var21, 56);
                                break L8;
                              } else {
                                pi.a(var41, var40, -(var37 * var40) + var25, param0, var39, var37 + var38, var29 - var41 * var37, var36, -(var37 * var39) + var21, 90);
                                break L8;
                              }
                            }
                          } else {
                            break L8;
                          }
                        }
                        param3++;
                        if (~nh.field_l < ~param3) {
                          var36 = var36 + wb.field_h;
                          var22 = var22 + var24;
                          var17_int = var17_int + var19;
                          var29 = var29 + var31;
                          var21 = var21 + var23;
                          var26 = var26 + var28;
                          var25 = var25 + var27;
                          var18 = var18 + var20;
                          var30 = var30 + var32;
                          continue L7;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  var36 = -param12 + param6;
                  if (var36 == 0) {
                    var32 = 0;
                    var28 = 0;
                    var27 = 0;
                    var20 = 0;
                    var23 = 0;
                    var19 = 0;
                    var24 = 0;
                    var31 = 0;
                    break L3;
                  } else {
                    L10: {
                      var37 = param15 << 16;
                      var38 = param13 << 16;
                      var39 = param5 << 16;
                      if (var33 == 0) {
                        var17_int = param14 << 16;
                        var25 = param7 << 16;
                        var21 = param16 << 16;
                        var29 = param8 << 16;
                        break L10;
                      } else {
                        var22 = param16 << 16;
                        var26 = param7 << 16;
                        var30 = param8 << 16;
                        var18 = param14 << 16;
                        break L10;
                      }
                    }
                    var40 = param10 << 16;
                    var27 = (-var25 + var39) / var36;
                    var19 = (-var17_int + var37) / var36;
                    var20 = (-var18 + var37) / var36;
                    var24 = (-var22 + var38) / var36;
                    var28 = (-var26 + var39) / var36;
                    var31 = (-var29 + var40) / var36;
                    var23 = (var38 + -var21) / var36;
                    var32 = (var40 - var30) / var36;
                    break L3;
                  }
                } else {
                  L11: {
                    if (~param3 == ~param6) {
                      var31 = 0;
                      var29 = param9;
                      var22 = param16;
                      var17_int = param2 << 16;
                      var24 = 0;
                      var27 = 0;
                      var20 = 0;
                      var26 = param7;
                      var32 = 0;
                      var28 = 0;
                      var19 = 0;
                      var30 = param8;
                      var25 = param4;
                      var23 = 0;
                      var21 = param11;
                      var18 = param14 << 16;
                      break L11;
                    } else {
                      var35 = param6 - param12;
                      if (~param2 > ~param14) {
                        var26 = param7 << 16;
                        var29 = param9 << 16;
                        var17_int = param2 << 16;
                        var30 = param8 << 16;
                        var27 = (-param4 + param5 << 16) / var34;
                        var28 = (param5 - param7 << 16) / var35;
                        var18 = param14 << 16;
                        var32 = (-param8 + param10 << 16) / var35;
                        var23 = (param13 + -param11 << 16) / var34;
                        var22 = param16 << 16;
                        var31 = (param10 + -param9 << 16) / var34;
                        var21 = param11 << 16;
                        var20 = (-param14 + param15 << 16) / var35;
                        var25 = param4 << 16;
                        var24 = (param13 - param16 << 16) / var35;
                        var19 = (param15 + -param2 << 16) / var34;
                        break L11;
                      } else {
                        var19 = (param15 - param14 << 16) / var35;
                        var24 = (-param11 + param13 << 16) / var34;
                        var22 = param11 << 16;
                        var25 = param7 << 16;
                        var26 = param4 << 16;
                        var21 = param16 << 16;
                        var31 = (param10 + -param8 << 16) / var35;
                        var27 = (-param7 + param5 << 16) / var35;
                        var20 = (param15 - param2 << 16) / var34;
                        var29 = param8 << 16;
                        var17_int = param14 << 16;
                        var30 = param9 << 16;
                        var23 = (-param16 + param13 << 16) / var35;
                        var32 = (-param9 + param10 << 16) / var34;
                        var28 = (param5 - param4 << 16) / var34;
                        var18 = param2 << 16;
                        break L11;
                      }
                    }
                  }
                  var33 = 0;
                  if (param3 < 0) {
                    param3 = Math.min(-param3, -param3 + param12);
                    var21 = var21 + param3 * var23;
                    var22 = var22 + var24 * param3;
                    var26 = var26 + var28 * param3;
                    var25 = var25 + param3 * var27;
                    var18 = var18 + var20 * param3;
                    var17_int = var17_int + param3 * var19;
                    var30 = var30 + var32 * param3;
                    var29 = var29 + var31 * param3;
                    param3 = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L12: {
                if (param3 >= 0) {
                  break L12;
                } else {
                  param3 = -param3;
                  var30 = var30 + param3 * var32;
                  var17_int = var17_int + var19 * param3;
                  var26 = var26 + var28 * param3;
                  var29 = var29 + param3 * var31;
                  var21 = var21 + var23 * param3;
                  var22 = var22 + param3 * var24;
                  var18 = var18 + var20 * param3;
                  var25 = var25 + var27 * param3;
                  param3 = 0;
                  break L12;
                }
              }
              var35 = nh.field_p[param3];
              L13: while (true) {
                if (param6 <= param3) {
                  return;
                } else {
                  L14: {
                    var36 = var17_int >> 16;
                    if (nh.field_o <= var36) {
                      break L14;
                    } else {
                      var37 = -(var17_int >> 16) + (var18 >> 16);
                      if (var37 != 0) {
                        L15: {
                          var38 = (var22 + -var21) / var37;
                          var39 = (-var25 + var26) / var37;
                          var40 = (var30 + -var29) / var37;
                          if (~nh.field_o < ~(var37 + var36)) {
                            break L15;
                          } else {
                            var37 = -1 + nh.field_o + -var36;
                            break L15;
                          }
                        }
                        if (var36 < 0) {
                          pi.a(var40, var39, var25 - var36 * var39, param0, var38, var37 + var36, -(var40 * var36) + var29, var35, var21 - var36 * var38, 4);
                          break L14;
                        } else {
                          pi.a(var40, var39, var25, param0, var38, var37, var29, var36 - -var35, var21, 84);
                          break L14;
                        }
                      } else {
                        if (var36 < 0) {
                          break L14;
                        } else {
                          if (~var36 <= ~nh.field_o) {
                            break L14;
                          } else {
                            pi.a(0, 0, var25, param0, 0, var37, var29, var36 - -var35, var21, 8);
                            break L14;
                          }
                        }
                      }
                    }
                  }
                  param3++;
                  if (nh.field_l > param3) {
                    var26 = var26 + var28;
                    var22 = var22 + var24;
                    var18 = var18 + var20;
                    var29 = var29 + var31;
                    var25 = var25 + var27;
                    var17_int = var17_int + var19;
                    var35 = var35 + wb.field_h;
                    var30 = var30 + var32;
                    var21 = var21 + var23;
                    continue L13;
                  } else {
                    return;
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
    }

    public static void a() {
        field_b = null;
        field_a = null;
        field_c = null;
        field_e = null;
        int var1 = 0;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "white";
        field_d = new vc();
    }
}
