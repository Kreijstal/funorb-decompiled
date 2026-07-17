/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa {
    static String field_g;
    static String[] field_b;
    static String field_h;
    static String field_i;
    static id[] field_f;
    static hl field_a;
    static int field_d;
    static wk field_c;
    static fl field_e;

    final static hl a(int param0) {
        return fl.field_n.field_Kb;
    }

    final static void a(int param0, boolean param1) {
        pb.field_b = wm.field_n[param0];
        eg.field_N = bb.field_a[param0];
        nj.field_e = hb.field_c[param0];
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int[] param16) {
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
          var42 = TetraLink.field_J;
          if (param9 < 0) {
            break L0;
          } else {
            if (~vn.field_n >= ~param11) {
              break L0;
            } else {
              L1: {
                if (param14 >= 0) {
                  break L1;
                } else {
                  if (param6 >= 0) {
                    break L1;
                  } else {
                    if (0 <= param4) {
                      break L1;
                    } else {
                      return;
                    }
                  }
                }
              }
              L2: {
                if (~vn.field_k < ~param14) {
                  break L2;
                } else {
                  if (param6 < vn.field_k) {
                    break L2;
                  } else {
                    if (~param4 > ~vn.field_k) {
                      break L2;
                    } else {
                      return;
                    }
                  }
                }
              }
              L3: {
                if (param0 == -1979588528) {
                  break L3;
                } else {
                  field_a = null;
                  break L3;
                }
              }
              L4: {
                var34 = -param11 + param9;
                if (param11 != param15) {
                  L5: {
                    var22 = param13 << 16;
                    var21 = param13 << 16;
                    var30 = param8 << 16;
                    var29 = param8 << 16;
                    var18 = param14 << 16;
                    var17_int = param14 << 16;
                    var26 = param10 << 16;
                    var25 = param10 << 16;
                    var35 = param15 - param11;
                    var19 = (param6 + -param14 << 16) / var35;
                    var20 = (param4 + -param14 << 16) / var34;
                    if (var20 > var19) {
                      var33 = 0;
                      var24 = (-param13 + param12 << 16) / var34;
                      var27 = (param7 - param10 << 16) / var35;
                      var28 = (param5 - param10 << 16) / var34;
                      var23 = (param3 + -param13 << 16) / var35;
                      var31 = (-param8 + param1 << 16) / var35;
                      var32 = (-param8 + param2 << 16) / var34;
                      break L5;
                    } else {
                      var31 = (param2 + -param8 << 16) / var34;
                      var23 = (-param13 + param12 << 16) / var34;
                      var27 = (param5 - param10 << 16) / var34;
                      var24 = (-param13 + param3 << 16) / var35;
                      var33 = 1;
                      var36 = var19;
                      var19 = var20;
                      var20 = var36;
                      var28 = (param7 - param10 << 16) / var35;
                      var32 = (param1 - param8 << 16) / var35;
                      break L5;
                    }
                  }
                  L6: {
                    L7: {
                      if (param11 < 0) {
                        if (param15 < 0) {
                          param11 = param15 + -param11;
                          var22 = var22 + param11 * var24;
                          var30 = var30 + param11 * var32;
                          var29 = var29 + param11 * var31;
                          var26 = var26 + var28 * param11;
                          var17_int = var17_int + var19 * param11;
                          var21 = var21 + param11 * var23;
                          var18 = var18 + var20 * param11;
                          var25 = var25 + param11 * var27;
                          param11 = param15;
                          break L6;
                        } else {
                          param11 = -param11;
                          var30 = var30 + param11 * var32;
                          var22 = var22 + param11 * var24;
                          var21 = var21 + var23 * param11;
                          var18 = var18 + param11 * var20;
                          var17_int = var17_int + param11 * var19;
                          var29 = var29 + param11 * var31;
                          var25 = var25 + var27 * param11;
                          var26 = var26 + var28 * param11;
                          param11 = 0;
                          break L7;
                        }
                      } else {
                        break L7;
                      }
                    }
                    var36 = vn.field_h[param11];
                    L8: while (true) {
                      if (~param11 <= ~param15) {
                        break L6;
                      } else {
                        L9: {
                          var37 = var17_int >> 16;
                          if (~vn.field_k < ~var37) {
                            var38 = (var18 >> 16) + -(var17_int >> 16);
                            if (0 == var38) {
                              if (var37 < 0) {
                                break L9;
                              } else {
                                if (var37 >= vn.field_k) {
                                  break L9;
                                } else {
                                  hc.a(0, param16, var38, var29, -32263, var36 + var37, var25, var21, 0, 0);
                                  break L9;
                                }
                              }
                            } else {
                              L10: {
                                var39 = (-var21 + var22) / var38;
                                var40 = (var26 + -var25) / var38;
                                var41 = (-var29 + var30) / var38;
                                if (~vn.field_k >= ~(var37 - -var38)) {
                                  var38 = vn.field_k - var37 + -1;
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              if (var37 >= 0) {
                                hc.a(var39, param16, var38, var29, -32263, var36 + var37, var25, var21, var40, var41);
                                break L9;
                              } else {
                                hc.a(var39, param16, var37 + var38, var29 - var37 * var41, param0 + 1979556265, var36, -(var37 * var40) + var25, var21 - var39 * var37, var40, var41);
                                break L9;
                              }
                            }
                          } else {
                            break L9;
                          }
                        }
                        param11++;
                        if (vn.field_n <= param11) {
                          return;
                        } else {
                          var26 = var26 + var28;
                          var17_int = var17_int + var19;
                          var18 = var18 + var20;
                          var29 = var29 + var31;
                          var30 = var30 + var32;
                          var22 = var22 + var24;
                          var36 = var36 + ra.field_f;
                          var21 = var21 + var23;
                          var25 = var25 + var27;
                          continue L8;
                        }
                      }
                    }
                  }
                  var36 = param9 + -param15;
                  if (var36 != 0) {
                    L11: {
                      var37 = param4 << 16;
                      var38 = param12 << 16;
                      var39 = param5 << 16;
                      if (var33 != 0) {
                        var26 = param7 << 16;
                        var30 = param1 << 16;
                        var22 = param3 << 16;
                        var18 = param6 << 16;
                        break L11;
                      } else {
                        var25 = param7 << 16;
                        var29 = param1 << 16;
                        var17_int = param6 << 16;
                        var21 = param3 << 16;
                        break L11;
                      }
                    }
                    var40 = param2 << 16;
                    var27 = (var39 + -var25) / var36;
                    var19 = (var37 - var17_int) / var36;
                    var28 = (var39 - var26) / var36;
                    var31 = (var40 - var29) / var36;
                    var20 = (-var18 + var37) / var36;
                    var24 = (-var22 + var38) / var36;
                    var32 = (-var30 + var40) / var36;
                    var23 = (-var21 + var38) / var36;
                    break L4;
                  } else {
                    var24 = 0;
                    var20 = 0;
                    var19 = 0;
                    var28 = 0;
                    var32 = 0;
                    var27 = 0;
                    var23 = 0;
                    var31 = 0;
                    break L4;
                  }
                } else {
                  L12: {
                    if (param11 == param9) {
                      var31 = 0;
                      var26 = param7;
                      var27 = 0;
                      var25 = param10;
                      var32 = 0;
                      var22 = param3;
                      var23 = 0;
                      var20 = 0;
                      var17_int = param14 << 16;
                      var18 = param6 << 16;
                      var21 = param13;
                      var19 = 0;
                      var24 = 0;
                      var30 = param1;
                      var29 = param8;
                      var28 = 0;
                      break L12;
                    } else {
                      var35 = param9 - param15;
                      if (param14 >= param6) {
                        var28 = (-param10 + param5 << 16) / var34;
                        var20 = (param4 - param14 << 16) / var34;
                        var29 = param1 << 16;
                        var17_int = param6 << 16;
                        var21 = param3 << 16;
                        var22 = param13 << 16;
                        var18 = param14 << 16;
                        var23 = (-param3 + param12 << 16) / var35;
                        var19 = (-param6 + param4 << 16) / var35;
                        var24 = (param12 + -param13 << 16) / var34;
                        var32 = (param2 - param8 << 16) / var34;
                        var25 = param7 << 16;
                        var26 = param10 << 16;
                        var30 = param8 << 16;
                        var31 = (-param1 + param2 << 16) / var35;
                        var27 = (param5 - param7 << 16) / var35;
                        break L12;
                      } else {
                        var22 = param3 << 16;
                        var25 = param10 << 16;
                        var24 = (param12 + -param3 << 16) / var35;
                        var28 = (-param7 + param5 << 16) / var35;
                        var23 = (-param13 + param12 << 16) / var34;
                        var17_int = param14 << 16;
                        var30 = param1 << 16;
                        var18 = param6 << 16;
                        var21 = param13 << 16;
                        var19 = (param4 - param14 << 16) / var34;
                        var27 = (-param10 + param5 << 16) / var34;
                        var26 = param7 << 16;
                        var29 = param8 << 16;
                        var31 = (param2 - param8 << 16) / var34;
                        var32 = (param2 - param1 << 16) / var35;
                        var20 = (-param6 + param4 << 16) / var35;
                        break L12;
                      }
                    }
                  }
                  L13: {
                    if (param11 < 0) {
                      param11 = Math.min(-param11, param15 - param11);
                      var17_int = var17_int + param11 * var19;
                      var29 = var29 + param11 * var31;
                      var18 = var18 + param11 * var20;
                      var26 = var26 + param11 * var28;
                      var25 = var25 + param11 * var27;
                      var30 = var30 + var32 * param11;
                      var22 = var22 + var24 * param11;
                      var21 = var21 + param11 * var23;
                      param11 = 0;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  var33 = 0;
                  break L4;
                }
              }
              L14: {
                if (param11 < 0) {
                  param11 = -param11;
                  var25 = var25 + var27 * param11;
                  var29 = var29 + var31 * param11;
                  var26 = var26 + param11 * var28;
                  var22 = var22 + param11 * var24;
                  var17_int = var17_int + var19 * param11;
                  var21 = var21 + param11 * var23;
                  var18 = var18 + param11 * var20;
                  var30 = var30 + var32 * param11;
                  param11 = 0;
                  break L14;
                } else {
                  break L14;
                }
              }
              var35 = vn.field_h[param11];
              L15: while (true) {
                if (param11 >= param9) {
                  return;
                } else {
                  L16: {
                    var36 = var17_int >> 16;
                    if (vn.field_k > var36) {
                      var37 = (var18 >> 16) - (var17_int >> 16);
                      if (var37 == 0) {
                        if (0 > var36) {
                          break L16;
                        } else {
                          if (~vn.field_k < ~var36) {
                            hc.a(0, param16, var37, var29, -32263, var35 + var36, var25, var21, 0, 0);
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                      } else {
                        L17: {
                          var38 = (-var21 + var22) / var37;
                          var39 = (-var25 + var26) / var37;
                          var40 = (var30 - var29) / var37;
                          if (var36 - -var37 >= vn.field_k) {
                            var37 = vn.field_k - var36 - 1;
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                        if (var36 < 0) {
                          hc.a(var38, param16, var36 + var37, -(var40 * var36) + var29, -32263, var35, -(var39 * var36) + var25, var21 - var38 * var36, var39, var40);
                          break L16;
                        } else {
                          hc.a(var38, param16, var37, var29, -32263, var36 - -var35, var25, var21, var39, var40);
                          break L16;
                        }
                      }
                    } else {
                      break L16;
                    }
                  }
                  param11++;
                  if (param11 >= vn.field_n) {
                    return;
                  } else {
                    var21 = var21 + var23;
                    var29 = var29 + var31;
                    var25 = var25 + var27;
                    var22 = var22 + var24;
                    var18 = var18 + var20;
                    var26 = var26 + var28;
                    var35 = var35 + ra.field_f;
                    var17_int = var17_int + var19;
                    var30 = var30 + var32;
                    continue L15;
                  }
                }
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_i = null;
        field_e = null;
        field_f = null;
        field_g = null;
        field_a = null;
        field_h = null;
        field_c = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Allow spectators?";
        field_h = "Hide players in <%0>'s game";
        field_g = "Accept";
    }
}
