/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf extends a {
    static tf field_db;
    static e[] field_eb;
    static String[] field_cb;

    rf(da param0, qg param1) {
        super(param0, param1, 33, 20, 30);
    }

    final static int[] c(boolean param0) {
        return new int[8];
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
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
          var42 = Transmogrify.field_A ? 1 : 0;
          if (param5 < param8) {
            break L0;
          } else {
            if (ka.field_a <= param16) {
              break L0;
            } else {
              L1: {
                if (param0 >= 0) {
                  break L1;
                } else {
                  if (0 <= param15) {
                    break L1;
                  } else {
                    if (param9 >= 0) {
                      break L1;
                    } else {
                      return;
                    }
                  }
                }
              }
              L2: {
                if (~param0 > ~ka.field_i) {
                  break L2;
                } else {
                  if (~param15 > ~ka.field_i) {
                    break L2;
                  } else {
                    if (ka.field_i <= param9) {
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L3: {
                var34 = param5 - param16;
                if (param16 != param12) {
                  L4: {
                    var18 = param0 << 16;
                    var17_int = param0 << 16;
                    var22 = param2 << 16;
                    var21 = param2 << 16;
                    var26 = param11 << 16;
                    var25 = param11 << 16;
                    var30 = param6 << 16;
                    var29 = param6 << 16;
                    var35 = -param16 + param12;
                    var19 = (param15 - param0 << 16) / var35;
                    var20 = (param9 - param0 << 16) / var34;
                    if (var20 <= var19) {
                      var33 = 1;
                      var28 = (-param11 + param1 << 16) / var35;
                      var24 = (-param2 + param10 << 16) / var35;
                      var23 = (-param2 + param14 << 16) / var34;
                      var32 = (param13 - param6 << 16) / var35;
                      var36 = var19;
                      var19 = var20;
                      var20 = var36;
                      var31 = (-param6 + param3 << 16) / var34;
                      var27 = (param4 + -param11 << 16) / var34;
                      break L4;
                    } else {
                      var31 = (-param6 + param13 << 16) / var35;
                      var24 = (param14 - param2 << 16) / var34;
                      var23 = (param10 + -param2 << 16) / var35;
                      var32 = (param3 - param6 << 16) / var34;
                      var27 = (-param11 + param1 << 16) / var35;
                      var28 = (param4 - param11 << 16) / var34;
                      var33 = 0;
                      break L4;
                    }
                  }
                  L5: {
                    L6: {
                      if (param16 < 0) {
                        if (param12 >= 0) {
                          param16 = -param16;
                          var25 = var25 + var27 * param16;
                          var30 = var30 + var32 * param16;
                          var22 = var22 + param16 * var24;
                          var17_int = var17_int + var19 * param16;
                          var26 = var26 + param16 * var28;
                          var21 = var21 + param16 * var23;
                          var18 = var18 + param16 * var20;
                          var29 = var29 + var31 * param16;
                          param16 = 0;
                          break L6;
                        } else {
                          param16 = param12 - param16;
                          var29 = var29 + var31 * param16;
                          var21 = var21 + param16 * var23;
                          var22 = var22 + param16 * var24;
                          var18 = var18 + param16 * var20;
                          var25 = var25 + param16 * var27;
                          var17_int = var17_int + var19 * param16;
                          var30 = var30 + param16 * var32;
                          var26 = var26 + param16 * var28;
                          param16 = param12;
                          break L5;
                        }
                      } else {
                        break L6;
                      }
                    }
                    var36 = ka.field_d[param16];
                    L7: while (true) {
                      if (~param16 <= ~param12) {
                        break L5;
                      } else {
                        L8: {
                          var37 = var17_int >> 16;
                          if (var37 >= ka.field_i) {
                            break L8;
                          } else {
                            var38 = -(var17_int >> 16) + (var18 >> 16);
                            if (var38 != 0) {
                              L9: {
                                var39 = (var22 - var21) / var38;
                                var40 = (var26 + -var25) / var38;
                                var41 = (var30 + -var29) / var38;
                                if (var37 - -var38 >= ka.field_i) {
                                  var38 = -1 + ka.field_i + -var37;
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              if (var37 >= 0) {
                                dh.a(var40, var39, param8 ^ 99, param7, var21, var36 + var37, var25, var41, var29, var38);
                                break L8;
                              } else {
                                dh.a(var40, var39, param8 + 99, param7, -(var39 * var37) + var21, var36, var25 + -(var37 * var40), var41, -(var41 * var37) + var29, var37 + var38);
                                break L8;
                              }
                            } else {
                              if (var37 < 0) {
                                break L8;
                              } else {
                                if (ka.field_i <= var37) {
                                  break L8;
                                } else {
                                  dh.a(0, 0, 99, param7, var21, var36 + var37, var25, 0, var29, var38);
                                  break L8;
                                }
                              }
                            }
                          }
                        }
                        param16++;
                        if (ka.field_a > param16) {
                          var21 = var21 + var23;
                          var29 = var29 + var31;
                          var36 = var36 + sb.field_c;
                          var26 = var26 + var28;
                          var18 = var18 + var20;
                          var17_int = var17_int + var19;
                          var25 = var25 + var27;
                          var30 = var30 + var32;
                          var22 = var22 + var24;
                          continue L7;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  var36 = -param12 + param5;
                  if (var36 == 0) {
                    var24 = 0;
                    var32 = 0;
                    var23 = 0;
                    var19 = 0;
                    var27 = 0;
                    var20 = 0;
                    var31 = 0;
                    var28 = 0;
                    break L3;
                  } else {
                    L10: {
                      var37 = param9 << 16;
                      var38 = param14 << 16;
                      var39 = param4 << 16;
                      if (var33 == 0) {
                        var17_int = param15 << 16;
                        var25 = param1 << 16;
                        var29 = param13 << 16;
                        var21 = param10 << 16;
                        break L10;
                      } else {
                        var26 = param1 << 16;
                        var18 = param15 << 16;
                        var30 = param13 << 16;
                        var22 = param10 << 16;
                        break L10;
                      }
                    }
                    var40 = param3 << 16;
                    var32 = (-var30 + var40) / var36;
                    var24 = (var38 - var22) / var36;
                    var19 = (var37 - var17_int) / var36;
                    var27 = (var39 + -var25) / var36;
                    var31 = (-var29 + var40) / var36;
                    var23 = (-var21 + var38) / var36;
                    var20 = (var37 + -var18) / var36;
                    var28 = (var39 - var26) / var36;
                    break L3;
                  }
                } else {
                  L11: {
                    if (~param5 == ~param16) {
                      var25 = param11;
                      var22 = param10;
                      var19 = 0;
                      var18 = param15 << 16;
                      var28 = 0;
                      var20 = 0;
                      var27 = 0;
                      var32 = 0;
                      var23 = 0;
                      var21 = param2;
                      var17_int = param0 << 16;
                      var26 = param1;
                      var31 = 0;
                      var29 = param6;
                      var24 = 0;
                      var30 = param13;
                      break L11;
                    } else {
                      var35 = param5 - param12;
                      if (~param15 < ~param0) {
                        var25 = param11 << 16;
                        var22 = param10 << 16;
                        var32 = (-param13 + param3 << 16) / var35;
                        var23 = (param14 + -param2 << 16) / var34;
                        var28 = (param4 + -param1 << 16) / var35;
                        var24 = (param14 + -param10 << 16) / var35;
                        var17_int = param0 << 16;
                        var21 = param2 << 16;
                        var18 = param15 << 16;
                        var30 = param13 << 16;
                        var31 = (-param6 + param3 << 16) / var34;
                        var19 = (-param0 + param9 << 16) / var34;
                        var29 = param6 << 16;
                        var20 = (param9 - param15 << 16) / var35;
                        var26 = param1 << 16;
                        var27 = (-param11 + param4 << 16) / var34;
                        break L11;
                      } else {
                        var23 = (param14 - param10 << 16) / var35;
                        var29 = param13 << 16;
                        var30 = param6 << 16;
                        var18 = param0 << 16;
                        var22 = param2 << 16;
                        var27 = (-param1 + param4 << 16) / var35;
                        var21 = param10 << 16;
                        var28 = (-param11 + param4 << 16) / var34;
                        var17_int = param15 << 16;
                        var25 = param1 << 16;
                        var20 = (-param0 + param9 << 16) / var34;
                        var19 = (param9 - param15 << 16) / var35;
                        var32 = (-param6 + param3 << 16) / var34;
                        var24 = (param14 + -param2 << 16) / var34;
                        var31 = (param3 - param13 << 16) / var35;
                        var26 = param11 << 16;
                        break L11;
                      }
                    }
                  }
                  var33 = 0;
                  if (param16 >= 0) {
                    break L3;
                  } else {
                    param16 = Math.min(-param16, -param16 + param12);
                    var18 = var18 + var20 * param16;
                    var22 = var22 + param16 * var24;
                    var30 = var30 + param16 * var32;
                    var17_int = var17_int + param16 * var19;
                    var26 = var26 + param16 * var28;
                    var29 = var29 + var31 * param16;
                    var25 = var25 + param16 * var27;
                    var21 = var21 + var23 * param16;
                    param16 = 0;
                    break L3;
                  }
                }
              }
              L12: {
                if (param16 >= 0) {
                  break L12;
                } else {
                  param16 = -param16;
                  var18 = var18 + var20 * param16;
                  var17_int = var17_int + var19 * param16;
                  var26 = var26 + param16 * var28;
                  var29 = var29 + var31 * param16;
                  var22 = var22 + var24 * param16;
                  var21 = var21 + var23 * param16;
                  var30 = var30 + var32 * param16;
                  var25 = var25 + param16 * var27;
                  param16 = 0;
                  break L12;
                }
              }
              var35 = ka.field_d[param16];
              L13: while (true) {
                if (param5 <= param16) {
                  return;
                } else {
                  L14: {
                    var36 = var17_int >> 16;
                    if (~ka.field_i >= ~var36) {
                      break L14;
                    } else {
                      var37 = -(var17_int >> 16) + (var18 >> 16);
                      if (0 != var37) {
                        L15: {
                          var38 = (var22 + -var21) / var37;
                          var39 = (var26 - var25) / var37;
                          var40 = (-var29 + var30) / var37;
                          if (ka.field_i <= var37 + var36) {
                            var37 = ka.field_i + (-var36 + -1);
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        if (var36 >= 0) {
                          dh.a(var39, var38, 99, param7, var21, var35 + var36, var25, var40, var29, var37);
                          break L14;
                        } else {
                          dh.a(var39, var38, 99, param7, var21 + -(var38 * var36), var35, var25 - var36 * var39, var40, var29 - var40 * var36, var36 + var37);
                          break L14;
                        }
                      } else {
                        if (var36 < 0) {
                          break L14;
                        } else {
                          if (~ka.field_i >= ~var36) {
                            break L14;
                          } else {
                            dh.a(0, 0, param8 ^ 99, param7, var21, var35 + var36, var25, 0, var29, var37);
                            break L14;
                          }
                        }
                      }
                    }
                  }
                  param16++;
                  if (~ka.field_a >= ~param16) {
                    return;
                  } else {
                    var22 = var22 + var24;
                    var17_int = var17_int + var19;
                    var21 = var21 + var23;
                    var29 = var29 + var31;
                    var30 = var30 + var32;
                    var25 = var25 + var27;
                    var18 = var18 + var20;
                    var35 = var35 + sb.field_c;
                    var26 = var26 + var28;
                    continue L13;
                  }
                }
              }
            }
          }
        }
    }

    final void b(int param0, qg param1) {
        try {
            super.b(-52, param1);
            int var3_int = 83 / ((34 - param0) / 54);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "rf.RB(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void r(int param0) {
        field_eb = null;
        field_cb = null;
        if (param0 != -2391) {
            field_cb = null;
        }
        field_db = null;
    }

    final static void q(int param0) {
        hc.field_t = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_db = new tf(8, 0, 4, 1);
        field_cb = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
    }
}
