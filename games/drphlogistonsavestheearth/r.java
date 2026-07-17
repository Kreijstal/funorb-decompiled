/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r {
    static nh field_b;
    static ja[] field_c;
    static String field_a;
    static int field_d;
    static he[] field_e;

    final static void a(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, byte param15, int param16) {
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
          var42 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (0 > param11) {
            break L0;
          } else {
            if (param16 >= uc.field_h) {
              break L0;
            } else {
              L1: {
                if (param3 >= 0) {
                  break L1;
                } else {
                  if (param12 >= 0) {
                    break L1;
                  } else {
                    if (param14 < 0) {
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (uc.field_f > param3) {
                  break L2;
                } else {
                  if (param12 < uc.field_f) {
                    break L2;
                  } else {
                    if (param14 < uc.field_f) {
                      break L2;
                    } else {
                      return;
                    }
                  }
                }
              }
              if (param15 <= -23) {
                L3: {
                  var34 = -param16 + param11;
                  if (param8 != param16) {
                    L4: {
                      var18 = param3 << 16;
                      var17_int = param3 << 16;
                      var30 = param7 << 16;
                      var29 = param7 << 16;
                      var26 = param4 << 16;
                      var25 = param4 << 16;
                      var22 = param9 << 16;
                      var21 = param9 << 16;
                      var35 = param8 + -param16;
                      var19 = (param12 - param3 << 16) / var35;
                      var20 = (param14 + -param3 << 16) / var34;
                      if (var20 <= var19) {
                        var23 = (-param9 + param1 << 16) / var34;
                        var27 = (-param4 + param13 << 16) / var34;
                        var24 = (-param9 + param2 << 16) / var35;
                        var31 = (param6 - param7 << 16) / var34;
                        var32 = (-param7 + param10 << 16) / var35;
                        var36 = var19;
                        var19 = var20;
                        var20 = var36;
                        var33 = 1;
                        var28 = (param0 + -param4 << 16) / var35;
                        break L4;
                      } else {
                        var24 = (param1 + -param9 << 16) / var34;
                        var23 = (-param9 + param2 << 16) / var35;
                        var32 = (-param7 + param6 << 16) / var34;
                        var31 = (-param7 + param10 << 16) / var35;
                        var27 = (-param4 + param0 << 16) / var35;
                        var28 = (param13 - param4 << 16) / var34;
                        var33 = 0;
                        break L4;
                      }
                    }
                    L5: {
                      L6: {
                        if (param16 < 0) {
                          if (param8 < 0) {
                            param16 = param8 - param16;
                            var17_int = var17_int + param16 * var19;
                            var25 = var25 + param16 * var27;
                            var29 = var29 + param16 * var31;
                            var21 = var21 + param16 * var23;
                            var22 = var22 + var24 * param16;
                            var18 = var18 + param16 * var20;
                            var26 = var26 + param16 * var28;
                            var30 = var30 + var32 * param16;
                            param16 = param8;
                            break L5;
                          } else {
                            param16 = -param16;
                            var29 = var29 + param16 * var31;
                            var22 = var22 + param16 * var24;
                            var17_int = var17_int + var19 * param16;
                            var21 = var21 + var23 * param16;
                            var25 = var25 + param16 * var27;
                            var26 = var26 + param16 * var28;
                            var30 = var30 + param16 * var32;
                            var18 = var18 + param16 * var20;
                            param16 = 0;
                            break L6;
                          }
                        } else {
                          break L6;
                        }
                      }
                      var36 = uc.field_g[param16];
                      L7: while (true) {
                        if (param8 <= param16) {
                          break L5;
                        } else {
                          L8: {
                            var37 = var17_int >> 16;
                            if (uc.field_f <= var37) {
                              break L8;
                            } else {
                              var38 = (var18 >> 16) - (var17_int >> 16);
                              if (var38 != 0) {
                                L9: {
                                  var39 = (var22 + -var21) / var38;
                                  var40 = (var26 + -var25) / var38;
                                  var41 = (var30 + -var29) / var38;
                                  if (var37 + var38 >= uc.field_f) {
                                    var38 = -1 + (-var37 + uc.field_f);
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                                if (var37 >= 0) {
                                  ml.a(var39, var37 - -var36, var38, var25, param5, var40, (byte) -104, var29, var21, var41);
                                  break L8;
                                } else {
                                  ml.a(var39, var36, var37 + var38, var25 - var37 * var40, param5, var40, (byte) 109, -(var41 * var37) + var29, -(var37 * var39) + var21, var41);
                                  break L8;
                                }
                              } else {
                                if (0 > var37) {
                                  break L8;
                                } else {
                                  if (uc.field_f > var37) {
                                    ml.a(0, var37 + var36, var38, var25, param5, 0, (byte) -128, var29, var21, 0);
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                          }
                          param16++;
                          if (uc.field_h > param16) {
                            var30 = var30 + var32;
                            var26 = var26 + var28;
                            var17_int = var17_int + var19;
                            var18 = var18 + var20;
                            var25 = var25 + var27;
                            var21 = var21 + var23;
                            var36 = var36 + wj.field_k;
                            var29 = var29 + var31;
                            var22 = var22 + var24;
                            continue L7;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                    var36 = -param8 + param11;
                    if (var36 == 0) {
                      var20 = 0;
                      var31 = 0;
                      var27 = 0;
                      var23 = 0;
                      var32 = 0;
                      var19 = 0;
                      var24 = 0;
                      var28 = 0;
                      break L3;
                    } else {
                      L10: {
                        var37 = param14 << 16;
                        var38 = param1 << 16;
                        var39 = param13 << 16;
                        if (var33 == 0) {
                          var21 = param2 << 16;
                          var29 = param10 << 16;
                          var17_int = param12 << 16;
                          var25 = param0 << 16;
                          break L10;
                        } else {
                          var26 = param0 << 16;
                          var22 = param2 << 16;
                          var18 = param12 << 16;
                          var30 = param10 << 16;
                          break L10;
                        }
                      }
                      var40 = param6 << 16;
                      var20 = (var37 - var18) / var36;
                      var23 = (-var21 + var38) / var36;
                      var27 = (-var25 + var39) / var36;
                      var24 = (var38 + -var22) / var36;
                      var32 = (var40 - var30) / var36;
                      var19 = (-var17_int + var37) / var36;
                      var28 = (-var26 + var39) / var36;
                      var31 = (var40 + -var29) / var36;
                      break L3;
                    }
                  } else {
                    L11: {
                      if (param11 == param16) {
                        var24 = 0;
                        var22 = param2;
                        var18 = param12 << 16;
                        var19 = 0;
                        var26 = param0;
                        var23 = 0;
                        var30 = param10;
                        var32 = 0;
                        var20 = 0;
                        var28 = 0;
                        var31 = 0;
                        var21 = param9;
                        var27 = 0;
                        var17_int = param3 << 16;
                        var29 = param7;
                        var25 = param4;
                        break L11;
                      } else {
                        var35 = -param8 + param11;
                        if (param3 >= param12) {
                          var32 = (-param7 + param6 << 16) / var34;
                          var19 = (param14 + -param12 << 16) / var35;
                          var18 = param3 << 16;
                          var29 = param10 << 16;
                          var23 = (-param2 + param1 << 16) / var35;
                          var24 = (-param9 + param1 << 16) / var34;
                          var21 = param2 << 16;
                          var25 = param0 << 16;
                          var20 = (param14 + -param3 << 16) / var34;
                          var22 = param9 << 16;
                          var31 = (-param10 + param6 << 16) / var35;
                          var30 = param7 << 16;
                          var28 = (param13 - param4 << 16) / var34;
                          var17_int = param12 << 16;
                          var26 = param4 << 16;
                          var27 = (-param0 + param13 << 16) / var35;
                          break L11;
                        } else {
                          var20 = (-param12 + param14 << 16) / var35;
                          var25 = param4 << 16;
                          var29 = param7 << 16;
                          var27 = (-param4 + param13 << 16) / var34;
                          var30 = param10 << 16;
                          var17_int = param3 << 16;
                          var28 = (param13 - param0 << 16) / var35;
                          var18 = param12 << 16;
                          var19 = (param14 - param3 << 16) / var34;
                          var22 = param2 << 16;
                          var21 = param9 << 16;
                          var32 = (-param10 + param6 << 16) / var35;
                          var24 = (param1 - param2 << 16) / var35;
                          var31 = (-param7 + param6 << 16) / var34;
                          var26 = param0 << 16;
                          var23 = (-param9 + param1 << 16) / var34;
                          break L11;
                        }
                      }
                    }
                    L12: {
                      if (0 <= param16) {
                        break L12;
                      } else {
                        param16 = Math.min(-param16, param8 + -param16);
                        var25 = var25 + param16 * var27;
                        var17_int = var17_int + var19 * param16;
                        var29 = var29 + var31 * param16;
                        var26 = var26 + param16 * var28;
                        var30 = var30 + param16 * var32;
                        var18 = var18 + param16 * var20;
                        var21 = var21 + var23 * param16;
                        var22 = var22 + param16 * var24;
                        param16 = 0;
                        break L12;
                      }
                    }
                    var33 = 0;
                    break L3;
                  }
                }
                L13: {
                  if (0 <= param16) {
                    break L13;
                  } else {
                    param16 = -param16;
                    var17_int = var17_int + param16 * var19;
                    var21 = var21 + var23 * param16;
                    var29 = var29 + param16 * var31;
                    var26 = var26 + var28 * param16;
                    var22 = var22 + param16 * var24;
                    var18 = var18 + param16 * var20;
                    var30 = var30 + var32 * param16;
                    var25 = var25 + param16 * var27;
                    param16 = 0;
                    break L13;
                  }
                }
                var35 = uc.field_g[param16];
                L14: while (true) {
                  if (param16 >= param11) {
                    return;
                  } else {
                    L15: {
                      var36 = var17_int >> 16;
                      if (var36 < uc.field_f) {
                        var37 = -(var17_int >> 16) + (var18 >> 16);
                        if (var37 == 0) {
                          if (0 > var36) {
                            break L15;
                          } else {
                            if (var36 < uc.field_f) {
                              ml.a(0, var36 - -var35, var37, var25, param5, 0, (byte) 104, var29, var21, 0);
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                        } else {
                          L16: {
                            var38 = (-var21 + var22) / var37;
                            var39 = (var26 - var25) / var37;
                            var40 = (var30 + -var29) / var37;
                            if (uc.field_f > var36 + var37) {
                              break L16;
                            } else {
                              var37 = -1 + (uc.field_f - var36);
                              break L16;
                            }
                          }
                          if (var36 >= 0) {
                            ml.a(var38, var36 - -var35, var37, var25, param5, var39, (byte) 115, var29, var21, var40);
                            break L15;
                          } else {
                            ml.a(var38, var35, var37 + var36, -(var39 * var36) + var25, param5, var39, (byte) -104, -(var36 * var40) + var29, var21 - var36 * var38, var40);
                            break L15;
                          }
                        }
                      } else {
                        break L15;
                      }
                    }
                    param16++;
                    if (uc.field_h > param16) {
                      var21 = var21 + var23;
                      var30 = var30 + var32;
                      var22 = var22 + var24;
                      var29 = var29 + var31;
                      var35 = var35 + wj.field_k;
                      var18 = var18 + var20;
                      var26 = var26 + var28;
                      var17_int = var17_int + var19;
                      var25 = var25 + var27;
                      continue L14;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                return;
              }
            }
          }
        }
    }

    public static void a() {
        field_a = null;
        field_e = null;
        int var1 = 0;
        field_c = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Loading music";
    }
}
