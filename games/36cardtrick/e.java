/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e {
    static int field_i;
    static String field_a;
    int field_g;
    static int field_c;
    int field_h;
    static char[] field_b;
    static String field_f;
    int field_d;
    static tk field_e;

    final static void a(byte param0) {
        sd.field_c.k(119);
        if (ji.field_a == null) {
            ji.field_a = new rk(sd.field_c, rk.field_ab);
        }
        sd.field_c.b((lk) (Object) ji.field_a, (byte) 6);
    }

    public static void a(int param0) {
        field_a = null;
        field_e = null;
        field_f = null;
        field_b = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7, int param8, int param9, int param10, int param11, byte param12, int param13, int param14, int param15, int param16) {
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
          var42 = Main.field_T;
          if (param11 < 0) {
            break L0;
          } else {
            if (~jb.field_c >= ~param0) {
              break L0;
            } else {
              L1: {
                if (param2 >= 0) {
                  break L1;
                } else {
                  if (param5 >= 0) {
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
                if (~param2 > ~jb.field_i) {
                  break L2;
                } else {
                  if (~jb.field_i < ~param5) {
                    break L2;
                  } else {
                    if (~param9 > ~jb.field_i) {
                      break L2;
                    } else {
                      return;
                    }
                  }
                }
              }
              if (param12 > 12) {
                L3: {
                  var34 = -param0 + param11;
                  if (~param8 == ~param0) {
                    L4: {
                      if (~param0 == ~param11) {
                        var21 = param1;
                        var28 = 0;
                        var24 = 0;
                        var23 = 0;
                        var22 = param3;
                        var32 = 0;
                        var19 = 0;
                        var27 = 0;
                        var18 = param5 << 16;
                        var25 = param10;
                        var26 = param16;
                        var30 = param14;
                        var29 = param4;
                        var31 = 0;
                        var20 = 0;
                        var17_int = param2 << 16;
                        break L4;
                      } else {
                        var35 = param11 - param8;
                        if (~param2 <= ~param5) {
                          var30 = param4 << 16;
                          var27 = (param15 - param16 << 16) / var35;
                          var23 = (param6 - param3 << 16) / var35;
                          var26 = param10 << 16;
                          var25 = param16 << 16;
                          var28 = (param15 + -param10 << 16) / var34;
                          var32 = (param13 + -param4 << 16) / var34;
                          var19 = (param9 + -param5 << 16) / var35;
                          var31 = (-param14 + param13 << 16) / var35;
                          var21 = param3 << 16;
                          var20 = (-param2 + param9 << 16) / var34;
                          var17_int = param5 << 16;
                          var29 = param14 << 16;
                          var22 = param1 << 16;
                          var18 = param2 << 16;
                          var24 = (-param1 + param6 << 16) / var34;
                          break L4;
                        } else {
                          var24 = (-param3 + param6 << 16) / var35;
                          var29 = param4 << 16;
                          var21 = param1 << 16;
                          var26 = param16 << 16;
                          var20 = (-param5 + param9 << 16) / var35;
                          var25 = param10 << 16;
                          var32 = (-param14 + param13 << 16) / var35;
                          var17_int = param2 << 16;
                          var27 = (param15 + -param10 << 16) / var34;
                          var19 = (-param2 + param9 << 16) / var34;
                          var18 = param5 << 16;
                          var31 = (param13 - param4 << 16) / var34;
                          var30 = param14 << 16;
                          var22 = param3 << 16;
                          var28 = (-param16 + param15 << 16) / var35;
                          var23 = (param6 + -param1 << 16) / var34;
                          break L4;
                        }
                      }
                    }
                    var33 = 0;
                    if (0 > param0) {
                      param0 = Math.min(-param0, param8 + -param0);
                      var21 = var21 + var23 * param0;
                      var22 = var22 + param0 * var24;
                      var18 = var18 + var20 * param0;
                      var26 = var26 + var28 * param0;
                      var30 = var30 + var32 * param0;
                      var17_int = var17_int + var19 * param0;
                      var25 = var25 + param0 * var27;
                      var29 = var29 + var31 * param0;
                      param0 = 0;
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    L5: {
                      var18 = param2 << 16;
                      var17_int = param2 << 16;
                      var26 = param10 << 16;
                      var25 = param10 << 16;
                      var22 = param1 << 16;
                      var21 = param1 << 16;
                      var30 = param4 << 16;
                      var29 = param4 << 16;
                      var35 = param8 - param0;
                      var19 = (-param2 + param5 << 16) / var35;
                      var20 = (param9 + -param2 << 16) / var34;
                      if (~var20 >= ~var19) {
                        var32 = (param14 - param4 << 16) / var35;
                        var27 = (-param10 + param15 << 16) / var34;
                        var36 = var19;
                        var19 = var20;
                        var20 = var36;
                        var33 = 1;
                        var28 = (-param10 + param16 << 16) / var35;
                        var24 = (-param1 + param3 << 16) / var35;
                        var23 = (-param1 + param6 << 16) / var34;
                        var31 = (param13 + -param4 << 16) / var34;
                        break L5;
                      } else {
                        var23 = (param3 + -param1 << 16) / var35;
                        var32 = (-param4 + param13 << 16) / var34;
                        var31 = (param14 + -param4 << 16) / var35;
                        var28 = (param15 + -param10 << 16) / var34;
                        var33 = 0;
                        var27 = (param16 - param10 << 16) / var35;
                        var24 = (-param1 + param6 << 16) / var34;
                        break L5;
                      }
                    }
                    L6: {
                      L7: {
                        if (param0 < 0) {
                          if (param8 < 0) {
                            param0 = param8 - param0;
                            var30 = var30 + param0 * var32;
                            var29 = var29 + var31 * param0;
                            var22 = var22 + var24 * param0;
                            var21 = var21 + param0 * var23;
                            var26 = var26 + param0 * var28;
                            var18 = var18 + param0 * var20;
                            var17_int = var17_int + var19 * param0;
                            var25 = var25 + var27 * param0;
                            param0 = param8;
                            break L6;
                          } else {
                            param0 = -param0;
                            var29 = var29 + param0 * var31;
                            var18 = var18 + var20 * param0;
                            var21 = var21 + param0 * var23;
                            var22 = var22 + param0 * var24;
                            var17_int = var17_int + var19 * param0;
                            var25 = var25 + var27 * param0;
                            var26 = var26 + param0 * var28;
                            var30 = var30 + var32 * param0;
                            param0 = 0;
                            break L7;
                          }
                        } else {
                          break L7;
                        }
                      }
                      var36 = jb.field_e[param0];
                      L8: while (true) {
                        if (~param8 >= ~param0) {
                          break L6;
                        } else {
                          L9: {
                            var37 = var17_int >> 16;
                            if (var37 >= jb.field_i) {
                              break L9;
                            } else {
                              var38 = -(var17_int >> 16) + (var18 >> 16);
                              if (var38 == 0) {
                                if (var37 < 0) {
                                  break L9;
                                } else {
                                  if (~jb.field_i >= ~var37) {
                                    break L9;
                                  } else {
                                    gi.a(var36 + var37, var25, var21, 8355711, var29, 0, param7, var38, 0, 0);
                                    break L9;
                                  }
                                }
                              } else {
                                L10: {
                                  var39 = (-var21 + var22) / var38;
                                  var40 = (var26 - var25) / var38;
                                  var41 = (var30 + -var29) / var38;
                                  if (~jb.field_i >= ~(var37 + var38)) {
                                    var38 = jb.field_i - var37 + -1;
                                    break L10;
                                  } else {
                                    break L10;
                                  }
                                }
                                if (var37 < 0) {
                                  gi.a(var36, -(var37 * var40) + var25, var21 + -(var39 * var37), 8355711, -(var37 * var41) + var29, var40, param7, var37 + var38, var39, var41);
                                  break L9;
                                } else {
                                  gi.a(var37 - -var36, var25, var21, 8355711, var29, var40, param7, var38, var39, var41);
                                  break L9;
                                }
                              }
                            }
                          }
                          param0++;
                          if (param0 >= jb.field_c) {
                            return;
                          } else {
                            var29 = var29 + var31;
                            var21 = var21 + var23;
                            var22 = var22 + var24;
                            var26 = var26 + var28;
                            var17_int = var17_int + var19;
                            var25 = var25 + var27;
                            var36 = var36 + vj.field_l;
                            var30 = var30 + var32;
                            var18 = var18 + var20;
                            continue L8;
                          }
                        }
                      }
                    }
                    var36 = param11 + -param8;
                    if (0 != var36) {
                      L11: {
                        var37 = param9 << 16;
                        var38 = param6 << 16;
                        var39 = param15 << 16;
                        if (var33 == 0) {
                          var25 = param16 << 16;
                          var17_int = param5 << 16;
                          var29 = param14 << 16;
                          var21 = param3 << 16;
                          break L11;
                        } else {
                          var18 = param5 << 16;
                          var22 = param3 << 16;
                          var30 = param14 << 16;
                          var26 = param16 << 16;
                          break L11;
                        }
                      }
                      var40 = param13 << 16;
                      var23 = (-var21 + var38) / var36;
                      var31 = (-var29 + var40) / var36;
                      var19 = (-var17_int + var37) / var36;
                      var24 = (-var22 + var38) / var36;
                      var32 = (-var30 + var40) / var36;
                      var27 = (-var25 + var39) / var36;
                      var20 = (var37 + -var18) / var36;
                      var28 = (var39 - var26) / var36;
                      break L3;
                    } else {
                      var23 = 0;
                      var24 = 0;
                      var32 = 0;
                      var27 = 0;
                      var19 = 0;
                      var28 = 0;
                      var20 = 0;
                      var31 = 0;
                      break L3;
                    }
                  }
                }
                L12: {
                  if (param0 < 0) {
                    param0 = -param0;
                    var22 = var22 + param0 * var24;
                    var18 = var18 + var20 * param0;
                    var25 = var25 + var27 * param0;
                    var26 = var26 + param0 * var28;
                    var17_int = var17_int + param0 * var19;
                    var21 = var21 + var23 * param0;
                    var30 = var30 + param0 * var32;
                    var29 = var29 + var31 * param0;
                    param0 = 0;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                var35 = jb.field_e[param0];
                L13: while (true) {
                  if (param11 <= param0) {
                    return;
                  } else {
                    L14: {
                      var36 = var17_int >> 16;
                      if (var36 >= jb.field_i) {
                        break L14;
                      } else {
                        var37 = (var18 >> 16) - (var17_int >> 16);
                        if (0 != var37) {
                          L15: {
                            var38 = (var22 + -var21) / var37;
                            var39 = (-var25 + var26) / var37;
                            var40 = (-var29 + var30) / var37;
                            if (var36 + var37 >= jb.field_i) {
                              var37 = -var36 + (jb.field_i - 1);
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          if (var36 < 0) {
                            gi.a(var35, var25 - var36 * var39, var21 + -(var36 * var38), 8355711, -(var40 * var36) + var29, var39, param7, var36 + var37, var38, var40);
                            break L14;
                          } else {
                            gi.a(var35 + var36, var25, var21, 8355711, var29, var39, param7, var37, var38, var40);
                            break L14;
                          }
                        } else {
                          if (var36 < 0) {
                            break L14;
                          } else {
                            if (~jb.field_i >= ~var36) {
                              break L14;
                            } else {
                              gi.a(var35 + var36, var25, var21, 8355711, var29, 0, param7, var37, 0, 0);
                              break L14;
                            }
                          }
                        }
                      }
                    }
                    param0++;
                    if (jb.field_c <= param0) {
                      return;
                    } else {
                      var21 = var21 + var23;
                      var26 = var26 + var28;
                      var25 = var25 + var27;
                      var29 = var29 + var31;
                      var30 = var30 + var32;
                      var17_int = var17_int + var19;
                      var18 = var18 + var20;
                      var35 = var35 + vj.field_l;
                      var22 = var22 + var24;
                      continue L13;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new char[128];
        field_f = "Error connecting to server. Please try using a different server.";
    }
}
