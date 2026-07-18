/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld {
    static String field_a;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, boolean param13, int param14, int[] param15, int param16) {
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
          var42 = TrackController.field_F ? 1 : 0;
          if (0 > param9) {
            break L0;
          } else {
            if (param11 >= ig.field_d) {
              break L0;
            } else {
              L1: {
                if (param4 >= 0) {
                  break L1;
                } else {
                  if (param12 >= 0) {
                    break L1;
                  } else {
                    if (param5 >= 0) {
                      break L1;
                    } else {
                      return;
                    }
                  }
                }
              }
              L2: {
                if (ig.field_g > param4) {
                  break L2;
                } else {
                  if (~ig.field_g < ~param12) {
                    break L2;
                  } else {
                    if (~param5 > ~ig.field_g) {
                      break L2;
                    } else {
                      return;
                    }
                  }
                }
              }
              L3: {
                var34 = -param11 + param9;
                if (~param8 != ~param11) {
                  L4: {
                    var26 = param2 << 16;
                    var25 = param2 << 16;
                    var18 = param4 << 16;
                    var17_int = param4 << 16;
                    var22 = param6 << 16;
                    var21 = param6 << 16;
                    var30 = param10 << 16;
                    var29 = param10 << 16;
                    var35 = -param11 + param8;
                    var20 = (-param4 + param5 << 16) / var34;
                    var19 = (-param4 + param12 << 16) / var35;
                    if (~var20 < ~var19) {
                      var24 = (-param6 + param1 << 16) / var34;
                      var27 = (-param2 + param3 << 16) / var35;
                      var32 = (param16 + -param10 << 16) / var34;
                      var33 = 0;
                      var31 = (-param10 + param0 << 16) / var35;
                      var28 = (-param2 + param14 << 16) / var34;
                      var23 = (param7 + -param6 << 16) / var35;
                      break L4;
                    } else {
                      var28 = (-param2 + param3 << 16) / var35;
                      var31 = (param16 + -param10 << 16) / var34;
                      var36 = var19;
                      var19 = var20;
                      var20 = var36;
                      var27 = (-param2 + param14 << 16) / var34;
                      var23 = (param1 + -param6 << 16) / var34;
                      var33 = 1;
                      var24 = (param7 - param6 << 16) / var35;
                      var32 = (-param10 + param0 << 16) / var35;
                      break L4;
                    }
                  }
                  L5: {
                    L6: {
                      if (param11 < 0) {
                        if (param8 >= 0) {
                          param11 = -param11;
                          var18 = var18 + var20 * param11;
                          var30 = var30 + param11 * var32;
                          var26 = var26 + param11 * var28;
                          var25 = var25 + param11 * var27;
                          var22 = var22 + param11 * var24;
                          var17_int = var17_int + var19 * param11;
                          var29 = var29 + var31 * param11;
                          var21 = var21 + var23 * param11;
                          param11 = 0;
                          break L6;
                        } else {
                          param11 = -param11 + param8;
                          var21 = var21 + var23 * param11;
                          var18 = var18 + param11 * var20;
                          var25 = var25 + param11 * var27;
                          var22 = var22 + var24 * param11;
                          var26 = var26 + var28 * param11;
                          var30 = var30 + var32 * param11;
                          var29 = var29 + param11 * var31;
                          var17_int = var17_int + var19 * param11;
                          param11 = param8;
                          break L5;
                        }
                      } else {
                        break L6;
                      }
                    }
                    var36 = ig.field_i[param11];
                    L7: while (true) {
                      if (~param8 >= ~param11) {
                        break L5;
                      } else {
                        L8: {
                          var37 = var17_int >> 16;
                          if (var37 >= ig.field_g) {
                            break L8;
                          } else {
                            var38 = (var18 >> 16) - (var17_int >> 16);
                            if (0 != var38) {
                              L9: {
                                var39 = (-var21 + var22) / var38;
                                var40 = (-var25 + var26) / var38;
                                var41 = (-var29 + var30) / var38;
                                if (~ig.field_g < ~(var37 - -var38)) {
                                  break L9;
                                } else {
                                  var38 = -var37 + (ig.field_g - 1);
                                  break L9;
                                }
                              }
                              if (0 > var37) {
                                al.a(var41, var37 + var38, var21 - var37 * var39, var29 - var41 * var37, var40, var39, param15, -1, var36, -(var40 * var37) + var25);
                                break L8;
                              } else {
                                al.a(var41, var38, var21, var29, var40, var39, param15, -1, var37 + var36, var25);
                                break L8;
                              }
                            } else {
                              if (var37 < 0) {
                                break L8;
                              } else {
                                if (ig.field_g > var37) {
                                  al.a(0, var38, var21, var29, 0, 0, param15, -1, var37 - -var36, var25);
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                        }
                        param11++;
                        if (~param11 <= ~ig.field_d) {
                          return;
                        } else {
                          var17_int = var17_int + var19;
                          var36 = var36 + ll.field_d;
                          var25 = var25 + var27;
                          var29 = var29 + var31;
                          var30 = var30 + var32;
                          var18 = var18 + var20;
                          var26 = var26 + var28;
                          var21 = var21 + var23;
                          var22 = var22 + var24;
                          continue L7;
                        }
                      }
                    }
                  }
                  var36 = param9 - param8;
                  if (0 != var36) {
                    L10: {
                      var37 = param5 << 16;
                      var38 = param1 << 16;
                      var39 = param14 << 16;
                      if (var33 == 0) {
                        var17_int = param12 << 16;
                        var29 = param0 << 16;
                        var25 = param3 << 16;
                        var21 = param7 << 16;
                        break L10;
                      } else {
                        var26 = param3 << 16;
                        var30 = param0 << 16;
                        var18 = param12 << 16;
                        var22 = param7 << 16;
                        break L10;
                      }
                    }
                    var40 = param16 << 16;
                    var19 = (var37 - var17_int) / var36;
                    var27 = (-var25 + var39) / var36;
                    var24 = (var38 - var22) / var36;
                    var23 = (var38 + -var21) / var36;
                    var31 = (var40 - var29) / var36;
                    var32 = (-var30 + var40) / var36;
                    var20 = (-var18 + var37) / var36;
                    var28 = (var39 + -var26) / var36;
                    break L3;
                  } else {
                    var28 = 0;
                    var24 = 0;
                    var27 = 0;
                    var23 = 0;
                    var20 = 0;
                    var32 = 0;
                    var19 = 0;
                    var31 = 0;
                    break L3;
                  }
                } else {
                  L11: {
                    if (param9 != param11) {
                      var35 = -param8 + param9;
                      if (param12 <= param4) {
                        var18 = param4 << 16;
                        var25 = param3 << 16;
                        var27 = (-param3 + param14 << 16) / var35;
                        var30 = param10 << 16;
                        var32 = (-param10 + param16 << 16) / var34;
                        var29 = param0 << 16;
                        var21 = param7 << 16;
                        var20 = (param5 + -param4 << 16) / var34;
                        var31 = (param16 + -param0 << 16) / var35;
                        var28 = (param14 - param2 << 16) / var34;
                        var19 = (param5 - param12 << 16) / var35;
                        var23 = (param1 + -param7 << 16) / var35;
                        var17_int = param12 << 16;
                        var26 = param2 << 16;
                        var24 = (param1 - param6 << 16) / var34;
                        var22 = param6 << 16;
                        break L11;
                      } else {
                        var18 = param12 << 16;
                        var22 = param7 << 16;
                        var23 = (param1 - param6 << 16) / var34;
                        var25 = param2 << 16;
                        var31 = (-param10 + param16 << 16) / var34;
                        var32 = (param16 - param0 << 16) / var35;
                        var26 = param3 << 16;
                        var21 = param6 << 16;
                        var27 = (param14 + -param2 << 16) / var34;
                        var19 = (-param4 + param5 << 16) / var34;
                        var24 = (-param7 + param1 << 16) / var35;
                        var28 = (param14 + -param3 << 16) / var35;
                        var29 = param10 << 16;
                        var17_int = param4 << 16;
                        var20 = (param5 + -param12 << 16) / var35;
                        var30 = param0 << 16;
                        break L11;
                      }
                    } else {
                      var28 = 0;
                      var17_int = param4 << 16;
                      var18 = param12 << 16;
                      var20 = 0;
                      var24 = 0;
                      var30 = param0;
                      var26 = param3;
                      var29 = param10;
                      var23 = 0;
                      var27 = 0;
                      var32 = 0;
                      var25 = param2;
                      var31 = 0;
                      var19 = 0;
                      var21 = param6;
                      var22 = param7;
                      break L11;
                    }
                  }
                  var33 = 0;
                  if (0 > param11) {
                    param11 = Math.min(-param11, -param11 + param8);
                    var22 = var22 + param11 * var24;
                    var26 = var26 + var28 * param11;
                    var21 = var21 + param11 * var23;
                    var29 = var29 + param11 * var31;
                    var17_int = var17_int + var19 * param11;
                    var18 = var18 + var20 * param11;
                    var30 = var30 + var32 * param11;
                    var25 = var25 + param11 * var27;
                    param11 = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L12: {
                if (param11 >= 0) {
                  break L12;
                } else {
                  param11 = -param11;
                  var21 = var21 + var23 * param11;
                  var22 = var22 + var24 * param11;
                  var17_int = var17_int + param11 * var19;
                  var25 = var25 + var27 * param11;
                  var18 = var18 + var20 * param11;
                  var26 = var26 + param11 * var28;
                  var29 = var29 + var31 * param11;
                  var30 = var30 + param11 * var32;
                  param11 = 0;
                  break L12;
                }
              }
              var35 = ig.field_i[param11];
              L13: while (true) {
                if (param9 <= param11) {
                  return;
                } else {
                  L14: {
                    var36 = var17_int >> 16;
                    if (~var36 <= ~ig.field_g) {
                      break L14;
                    } else {
                      var37 = -(var17_int >> 16) + (var18 >> 16);
                      if (0 == var37) {
                        if (var36 < 0) {
                          break L14;
                        } else {
                          if (~var36 > ~ig.field_g) {
                            al.a(0, var37, var21, var29, 0, 0, param15, -1, var35 + var36, var25);
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                      } else {
                        L15: {
                          var38 = (-var21 + var22) / var37;
                          var39 = (var26 + -var25) / var37;
                          var40 = (-var29 + var30) / var37;
                          if (var37 + var36 >= ig.field_g) {
                            var37 = -1 + -var36 + ig.field_g;
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        if (var36 < 0) {
                          al.a(var40, var36 + var37, var21 + -(var36 * var38), -(var40 * var36) + var29, var39, var38, param15, -1, var35, -(var36 * var39) + var25);
                          break L14;
                        } else {
                          al.a(var40, var37, var21, var29, var39, var38, param15, -1, var36 - -var35, var25);
                          break L14;
                        }
                      }
                    }
                  }
                  param11++;
                  if (~ig.field_d >= ~param11) {
                    return;
                  } else {
                    var18 = var18 + var20;
                    var35 = var35 + ll.field_d;
                    var17_int = var17_int + var19;
                    var26 = var26 + var28;
                    var22 = var22 + var24;
                    var29 = var29 + var31;
                    var21 = var21 + var23;
                    var25 = var25 + var27;
                    var30 = var30 + var32;
                    continue L13;
                  }
                }
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
    }

    final static void a(boolean param0, boolean param1) {
        sa.field_Q.a(param0, true);
    }

    final static void a(int param0, byte param1) {
        ee.field_f = TrackController.field_E[param0];
        pc.field_t = ea.field_u[param0];
        jb.field_c = ff.field_c[param0];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Unpacking sound effects";
    }
}
