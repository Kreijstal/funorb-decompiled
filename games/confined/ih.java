/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih {
    static String field_c;
    static int field_b;
    static mi field_d;
    static bi field_e;
    static int field_a;

    public static void a(int param0) {
        field_d = null;
        field_e = null;
        field_c = null;
    }

    final static boolean a(boolean param0, char param1) {
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          if (param0) {
            break L0;
          } else {
            ih.a(true, (int[]) null, 125, -111, -72, 48, 84, 24, -101, 87, -75, 13, 94, 63, -39, -22, 35);
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (param1 < 65) {
                break L3;
              } else {
                if (param1 <= 90) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (param1 < 97) {
                break L4;
              } else {
                if (param1 > 122) {
                  break L4;
                } else {
                  break L2;
                }
              }
            }
            stackOut_9_0 = 0;
            stackIn_10_0 = stackOut_9_0;
            break L1;
          }
          stackOut_8_0 = 1;
          stackIn_10_0 = stackOut_8_0;
          break L1;
        }
        return stackIn_10_0 != 0;
    }

    final static jb a(boolean param0, boolean param1, boolean param2, boolean param3, byte param4) {
        int var6 = 0;
        int var7 = 0;
        jb var8 = null;
        jb var9 = null;
        jb stackIn_1_0 = null;
        jb stackIn_2_0 = null;
        jb stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        jb stackIn_4_0 = null;
        jb stackIn_5_0 = null;
        jb stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        jb stackOut_0_0 = null;
        jb stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        jb stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        jb stackOut_3_0 = null;
        jb stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        jb stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        L0: {
          var8 = new jb(2);
          var9 = var8;
          stackOut_0_0 = (jb) var9;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param3) {
            stackOut_2_0 = (jb) (Object) stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (jb) (Object) stackIn_1_0;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          stackIn_3_0.field_n = stackIn_3_1 != 0;
          var9.field_i = false;
          stackOut_3_0 = (jb) var9;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (!param2) {
            stackOut_5_0 = (jb) (Object) stackIn_5_0;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = (jb) (Object) stackIn_4_0;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        L2: {
          stackIn_6_0.field_t = stackIn_6_1 != 0;
          var9.a((byte) -117, new bd(16, ba.field_Q, (ok) (Object) pn.field_a));
          var9.a((byte) -87, new bd(17, nh.field_a, (ok) (Object) pn.field_a));
          var8.field_h[0].field_b = 150;
          var8.field_h[0].field_j = 320 - var8.field_h[0].field_f / 2;
          var8.field_h[1].field_b = 250;
          var8.field_h[1].field_j = 320 + -(var8.field_h[1].field_f / 2);
          var9.a(false, 26206, -1);
          var6 = var8.field_h[0].field_f;
          var7 = var8.field_h[1].field_f;
          if (var7 <= var6) {
            break L2;
          } else {
            var6 = var7;
            break L2;
          }
        }
        L3: {
          var7 = pn.field_a.c(p.field_b);
          if (var7 > var6) {
            var6 = var7;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          var7 = pn.field_a.c(fb.a(param2, param3, 0, false));
          if (var6 < var7) {
            var6 = var7;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          var7 = pn.field_a.c(qc.a(param3, false, 2, param2));
          if (var7 > var6) {
            var6 = var7;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          var7 = pn.field_a.c(ah.a(false, param3, -108, param2));
          if (var6 < var7) {
            var6 = var7;
            break L6;
          } else {
            break L6;
          }
        }
        var9.field_c = 76;
        var9.field_s = 280 + -(var6 / 2);
        var9.field_k = 360 + var6 / 2 - var9.field_s;
        var9.field_b = 260;
        return var9;
    }

    final static void a(boolean param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
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
          var42 = Confined.field_J ? 1 : 0;
          if (0 > param6) {
            break L0;
          } else {
            if (~ti.field_g < ~param2) {
              L1: {
                if (param8 >= 0) {
                  break L1;
                } else {
                  if (param14 >= 0) {
                    break L1;
                  } else {
                    if (param12 < 0) {
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (~ti.field_e < ~param8) {
                  break L2;
                } else {
                  if (~ti.field_e < ~param14) {
                    break L2;
                  } else {
                    if (param12 >= ti.field_e) {
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L3: {
                var34 = -param2 + param6;
                if (~param2 != ~param10) {
                  L4: {
                    var22 = param15 << 16;
                    var21 = param15 << 16;
                    var18 = param8 << 16;
                    var17_int = param8 << 16;
                    var30 = param5 << 16;
                    var29 = param5 << 16;
                    var26 = param16 << 16;
                    var25 = param16 << 16;
                    var35 = -param2 + param10;
                    var20 = (-param8 + param12 << 16) / var34;
                    var19 = (-param8 + param14 << 16) / var35;
                    if (~var20 >= ~var19) {
                      var27 = (-param16 + param11 << 16) / var34;
                      var36 = var19;
                      var19 = var20;
                      var20 = var36;
                      var23 = (param9 - param15 << 16) / var34;
                      var24 = (param13 - param15 << 16) / var35;
                      var32 = (param4 - param5 << 16) / var35;
                      var28 = (-param16 + param3 << 16) / var35;
                      var31 = (-param5 + param7 << 16) / var34;
                      var33 = 1;
                      break L4;
                    } else {
                      var23 = (param13 - param15 << 16) / var35;
                      var24 = (param9 + -param15 << 16) / var34;
                      var32 = (param7 - param5 << 16) / var34;
                      var28 = (-param16 + param11 << 16) / var34;
                      var31 = (-param5 + param4 << 16) / var35;
                      var33 = 0;
                      var27 = (-param16 + param3 << 16) / var35;
                      break L4;
                    }
                  }
                  L5: {
                    L6: {
                      if (param2 < 0) {
                        if (param10 >= 0) {
                          param2 = -param2;
                          var22 = var22 + param2 * var24;
                          var26 = var26 + var28 * param2;
                          var25 = var25 + var27 * param2;
                          var17_int = var17_int + var19 * param2;
                          var29 = var29 + var31 * param2;
                          var21 = var21 + param2 * var23;
                          var30 = var30 + var32 * param2;
                          var18 = var18 + var20 * param2;
                          param2 = 0;
                          break L6;
                        } else {
                          param2 = -param2 + param10;
                          var22 = var22 + var24 * param2;
                          var17_int = var17_int + var19 * param2;
                          var29 = var29 + param2 * var31;
                          var21 = var21 + var23 * param2;
                          var18 = var18 + param2 * var20;
                          var26 = var26 + var28 * param2;
                          var30 = var30 + var32 * param2;
                          var25 = var25 + param2 * var27;
                          param2 = param10;
                          break L5;
                        }
                      } else {
                        break L6;
                      }
                    }
                    var36 = ti.field_l[param2];
                    L7: while (true) {
                      if (~param10 >= ~param2) {
                        break L5;
                      } else {
                        L8: {
                          var37 = var17_int >> 16;
                          if (ti.field_e > var37) {
                            var38 = (var18 >> 16) + -(var17_int >> 16);
                            if (var38 != 0) {
                              L9: {
                                var39 = (var22 + -var21) / var38;
                                var40 = (-var25 + var26) / var38;
                                var41 = (var30 + -var29) / var38;
                                if (ti.field_e > var38 + var37) {
                                  break L9;
                                } else {
                                  var38 = -1 + -var37 + ti.field_e;
                                  break L9;
                                }
                              }
                              if (0 > var37) {
                                oc.a(var36, param1, 104, var21 - var39 * var37, -(var37 * var40) + var25, var29 + -(var41 * var37), var41, var39, var38 - -var37, var40);
                                break L8;
                              } else {
                                oc.a(var36 + var37, param1, -112, var21, var25, var29, var41, var39, var38, var40);
                                break L8;
                              }
                            } else {
                              if (var37 < 0) {
                                break L8;
                              } else {
                                if (var37 < ti.field_e) {
                                  oc.a(var37 + var36, param1, 67, var21, var25, var29, 0, 0, var38, 0);
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          } else {
                            break L8;
                          }
                        }
                        param2++;
                        if (param2 >= ti.field_g) {
                          return;
                        } else {
                          var26 = var26 + var28;
                          var17_int = var17_int + var19;
                          var22 = var22 + var24;
                          var21 = var21 + var23;
                          var25 = var25 + var27;
                          var29 = var29 + var31;
                          var30 = var30 + var32;
                          var18 = var18 + var20;
                          var36 = var36 + fn.field_g;
                          continue L7;
                        }
                      }
                    }
                  }
                  var36 = param6 + -param10;
                  if (0 == var36) {
                    var28 = 0;
                    var20 = 0;
                    var24 = 0;
                    var31 = 0;
                    var19 = 0;
                    var32 = 0;
                    var23 = 0;
                    var27 = 0;
                    break L3;
                  } else {
                    L10: {
                      var37 = param12 << 16;
                      var38 = param9 << 16;
                      var39 = param11 << 16;
                      if (var33 != 0) {
                        var26 = param3 << 16;
                        var18 = param14 << 16;
                        var30 = param4 << 16;
                        var22 = param13 << 16;
                        break L10;
                      } else {
                        var21 = param13 << 16;
                        var25 = param3 << 16;
                        var17_int = param14 << 16;
                        var29 = param4 << 16;
                        break L10;
                      }
                    }
                    var40 = param7 << 16;
                    var31 = (-var29 + var40) / var36;
                    var27 = (var39 + -var25) / var36;
                    var24 = (var38 - var22) / var36;
                    var32 = (var40 + -var30) / var36;
                    var28 = (-var26 + var39) / var36;
                    var19 = (var37 + -var17_int) / var36;
                    var23 = (-var21 + var38) / var36;
                    var20 = (var37 + -var18) / var36;
                    break L3;
                  }
                } else {
                  L11: {
                    if (~param2 == ~param6) {
                      var31 = 0;
                      var26 = param3;
                      var19 = 0;
                      var28 = 0;
                      var30 = param4;
                      var20 = 0;
                      var21 = param15;
                      var17_int = param8 << 16;
                      var18 = param14 << 16;
                      var27 = 0;
                      var24 = 0;
                      var25 = param16;
                      var23 = 0;
                      var22 = param13;
                      var32 = 0;
                      var29 = param5;
                      break L11;
                    } else {
                      var35 = param6 - param10;
                      if (~param14 >= ~param8) {
                        var25 = param3 << 16;
                        var32 = (-param5 + param7 << 16) / var34;
                        var27 = (param11 + -param3 << 16) / var35;
                        var17_int = param14 << 16;
                        var30 = param5 << 16;
                        var19 = (param12 + -param14 << 16) / var35;
                        var29 = param4 << 16;
                        var28 = (param11 + -param16 << 16) / var34;
                        var26 = param16 << 16;
                        var21 = param13 << 16;
                        var22 = param15 << 16;
                        var18 = param8 << 16;
                        var24 = (-param15 + param9 << 16) / var34;
                        var31 = (param7 - param4 << 16) / var35;
                        var20 = (-param8 + param12 << 16) / var34;
                        var23 = (-param13 + param9 << 16) / var35;
                        break L11;
                      } else {
                        var17_int = param8 << 16;
                        var24 = (param9 + -param13 << 16) / var35;
                        var23 = (-param15 + param9 << 16) / var34;
                        var26 = param3 << 16;
                        var30 = param4 << 16;
                        var32 = (-param4 + param7 << 16) / var35;
                        var28 = (-param3 + param11 << 16) / var35;
                        var19 = (-param8 + param12 << 16) / var34;
                        var27 = (-param16 + param11 << 16) / var34;
                        var20 = (-param14 + param12 << 16) / var35;
                        var31 = (param7 - param5 << 16) / var34;
                        var21 = param15 << 16;
                        var25 = param16 << 16;
                        var22 = param13 << 16;
                        var29 = param5 << 16;
                        var18 = param14 << 16;
                        break L11;
                      }
                    }
                  }
                  var33 = 0;
                  if (param2 < 0) {
                    param2 = Math.min(-param2, -param2 + param10);
                    var25 = var25 + var27 * param2;
                    var30 = var30 + param2 * var32;
                    var26 = var26 + var28 * param2;
                    var18 = var18 + param2 * var20;
                    var21 = var21 + var23 * param2;
                    var17_int = var17_int + param2 * var19;
                    var22 = var22 + param2 * var24;
                    var29 = var29 + param2 * var31;
                    param2 = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L12: {
                if (0 <= param2) {
                  break L12;
                } else {
                  param2 = -param2;
                  var25 = var25 + param2 * var27;
                  var21 = var21 + var23 * param2;
                  var22 = var22 + param2 * var24;
                  var18 = var18 + param2 * var20;
                  var30 = var30 + param2 * var32;
                  var17_int = var17_int + var19 * param2;
                  var26 = var26 + param2 * var28;
                  var29 = var29 + var31 * param2;
                  param2 = 0;
                  break L12;
                }
              }
              var35 = ti.field_l[param2];
              L13: while (true) {
                if (param6 <= param2) {
                  return;
                } else {
                  L14: {
                    var36 = var17_int >> 16;
                    if (var36 >= ti.field_e) {
                      break L14;
                    } else {
                      var37 = -(var17_int >> 16) + (var18 >> 16);
                      if (var37 != 0) {
                        L15: {
                          var38 = (-var21 + var22) / var37;
                          var39 = (-var25 + var26) / var37;
                          var40 = (var30 + -var29) / var37;
                          if (var36 - -var37 < ti.field_e) {
                            break L15;
                          } else {
                            var37 = -1 + (-var36 + ti.field_e);
                            break L15;
                          }
                        }
                        if (var36 >= 0) {
                          oc.a(var35 + var36, param1, 57, var21, var25, var29, var40, var38, var37, var39);
                          break L14;
                        } else {
                          oc.a(var35, param1, 82, var21 + -(var38 * var36), var25 - var36 * var39, -(var40 * var36) + var29, var40, var38, var37 - -var36, var39);
                          break L14;
                        }
                      } else {
                        if (var36 < 0) {
                          break L14;
                        } else {
                          if (var36 < ti.field_e) {
                            oc.a(var36 - -var35, param1, 73, var21, var25, var29, 0, 0, var37, 0);
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                      }
                    }
                  }
                  param2++;
                  if (param2 >= ti.field_g) {
                    return;
                  } else {
                    var29 = var29 + var31;
                    var17_int = var17_int + var19;
                    var30 = var30 + var32;
                    var18 = var18 + var20;
                    var26 = var26 + var28;
                    var21 = var21 + var23;
                    var35 = var35 + fn.field_g;
                    var22 = var22 + var24;
                    var25 = var25 + var27;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Please enter your age in years";
    }
}
