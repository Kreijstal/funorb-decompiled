/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ica {
    static boolean field_a;
    static long field_b;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
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
          var42 = TombRacer.field_G ? 1 : 0;
          if (0 > param15) {
            break L0;
          } else {
            if (param16 < uoa.field_b) {
              L1: {
                if (0 <= param14) {
                  break L1;
                } else {
                  if (0 <= param8) {
                    break L1;
                  } else {
                    if (param5 < 0) {
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (param14 < uoa.field_e) {
                  break L2;
                } else {
                  if (uoa.field_e > param8) {
                    break L2;
                  } else {
                    if (uoa.field_e <= param5) {
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L3: {
                var34 = param15 + -param16;
                if (param0 == param16) {
                  L4: {
                    if (param16 != param15) {
                      var35 = param15 + -param0;
                      if (param8 > param14) {
                        var17_int = param14 << 16;
                        var23 = (param10 - param1 << 16) / var34;
                        var25 = param7 << 16;
                        var22 = param2 << 16;
                        var27 = (param9 - param7 << 16) / var34;
                        var24 = (-param2 + param10 << 16) / var35;
                        var30 = param12 << 16;
                        var19 = (-param14 + param5 << 16) / var34;
                        var28 = (-param3 + param9 << 16) / var35;
                        var29 = param13 << 16;
                        var18 = param8 << 16;
                        var26 = param3 << 16;
                        var32 = (param11 + -param12 << 16) / var35;
                        var20 = (-param8 + param5 << 16) / var35;
                        var21 = param1 << 16;
                        var31 = (param11 + -param13 << 16) / var34;
                        break L4;
                      } else {
                        var22 = param1 << 16;
                        var32 = (-param13 + param11 << 16) / var34;
                        var29 = param12 << 16;
                        var28 = (-param7 + param9 << 16) / var34;
                        var19 = (param5 + -param8 << 16) / var35;
                        var27 = (param9 - param3 << 16) / var35;
                        var30 = param13 << 16;
                        var18 = param14 << 16;
                        var21 = param2 << 16;
                        var31 = (-param12 + param11 << 16) / var35;
                        var20 = (-param14 + param5 << 16) / var34;
                        var25 = param3 << 16;
                        var26 = param7 << 16;
                        var17_int = param8 << 16;
                        var23 = (param10 - param2 << 16) / var35;
                        var24 = (param10 + -param1 << 16) / var34;
                        break L4;
                      }
                    } else {
                      var17_int = param14 << 16;
                      var32 = 0;
                      var26 = param3;
                      var30 = param12;
                      var20 = 0;
                      var19 = 0;
                      var28 = 0;
                      var29 = param13;
                      var22 = param2;
                      var27 = 0;
                      var18 = param8 << 16;
                      var23 = 0;
                      var21 = param1;
                      var25 = param7;
                      var24 = 0;
                      var31 = 0;
                      break L4;
                    }
                  }
                  L5: {
                    if (param16 >= 0) {
                      break L5;
                    } else {
                      param16 = Math.min(-param16, param0 - param16);
                      var26 = var26 + var28 * param16;
                      var30 = var30 + param16 * var32;
                      var25 = var25 + param16 * var27;
                      var29 = var29 + param16 * var31;
                      var17_int = var17_int + param16 * var19;
                      var21 = var21 + var23 * param16;
                      var18 = var18 + param16 * var20;
                      var22 = var22 + param16 * var24;
                      param16 = 0;
                      break L5;
                    }
                  }
                  var33 = 0;
                  break L3;
                } else {
                  L6: {
                    var18 = param14 << 16;
                    var17_int = param14 << 16;
                    var26 = param7 << 16;
                    var25 = param7 << 16;
                    var30 = param13 << 16;
                    var29 = param13 << 16;
                    var22 = param1 << 16;
                    var21 = param1 << 16;
                    var35 = param0 - param16;
                    var20 = (-param14 + param5 << 16) / var34;
                    var19 = (param8 + -param14 << 16) / var35;
                    if (var19 >= var20) {
                      var23 = (-param1 + param10 << 16) / var34;
                      var27 = (param9 - param7 << 16) / var34;
                      var31 = (param11 + -param13 << 16) / var34;
                      var24 = (-param1 + param2 << 16) / var35;
                      var28 = (param3 + -param7 << 16) / var35;
                      var33 = 1;
                      var32 = (-param13 + param12 << 16) / var35;
                      var36 = var19;
                      var19 = var20;
                      var20 = var36;
                      break L6;
                    } else {
                      var31 = (param12 + -param13 << 16) / var35;
                      var33 = 0;
                      var27 = (-param7 + param3 << 16) / var35;
                      var23 = (-param1 + param2 << 16) / var35;
                      var28 = (-param7 + param9 << 16) / var34;
                      var32 = (param11 - param13 << 16) / var34;
                      var24 = (-param1 + param10 << 16) / var34;
                      break L6;
                    }
                  }
                  L7: {
                    L8: {
                      if (param16 >= 0) {
                        break L8;
                      } else {
                        if (0 <= param0) {
                          param16 = -param16;
                          var18 = var18 + param16 * var20;
                          var17_int = var17_int + param16 * var19;
                          var22 = var22 + param16 * var24;
                          var26 = var26 + param16 * var28;
                          var21 = var21 + param16 * var23;
                          var25 = var25 + var27 * param16;
                          var30 = var30 + var32 * param16;
                          var29 = var29 + param16 * var31;
                          param16 = 0;
                          break L8;
                        } else {
                          param16 = -param16 + param0;
                          var29 = var29 + param16 * var31;
                          var22 = var22 + param16 * var24;
                          var21 = var21 + param16 * var23;
                          var30 = var30 + param16 * var32;
                          var26 = var26 + var28 * param16;
                          var18 = var18 + var20 * param16;
                          var17_int = var17_int + param16 * var19;
                          var25 = var25 + var27 * param16;
                          param16 = param0;
                          break L7;
                        }
                      }
                    }
                    var36 = uoa.field_d[param16];
                    L9: while (true) {
                      if (param16 >= param0) {
                        break L7;
                      } else {
                        L10: {
                          var37 = var17_int >> 16;
                          if (uoa.field_e > var37) {
                            var38 = -(var17_int >> 16) + (var18 >> 16);
                            if (var38 != 0) {
                              L11: {
                                var39 = (-var21 + var22) / var38;
                                var40 = (var26 - var25) / var38;
                                var41 = (-var29 + var30) / var38;
                                if (uoa.field_e > var37 - -var38) {
                                  break L11;
                                } else {
                                  var38 = uoa.field_e + -var37 - 1;
                                  break L11;
                                }
                              }
                              if (var37 < 0) {
                                qga.a(-(var37 * var41) + var29, var25 + -(var37 * var40), param6, var39, var36, -116, var38 + var37, var40, -(var39 * var37) + var21, var41);
                                break L10;
                              } else {
                                qga.a(var29, var25, param6, var39, var36 + var37, -113, var38, var40, var21, var41);
                                break L10;
                              }
                            } else {
                              if (var37 < 0) {
                                break L10;
                              } else {
                                if (uoa.field_e <= var37) {
                                  break L10;
                                } else {
                                  qga.a(var29, var25, param6, 0, var37 - -var36, -108, var38, 0, var21, 0);
                                  break L10;
                                }
                              }
                            }
                          } else {
                            break L10;
                          }
                        }
                        param16++;
                        if (param16 >= uoa.field_b) {
                          return;
                        } else {
                          var25 = var25 + var27;
                          var18 = var18 + var20;
                          var30 = var30 + var32;
                          var17_int = var17_int + var19;
                          var26 = var26 + var28;
                          var29 = var29 + var31;
                          var22 = var22 + var24;
                          var36 = var36 + bea.field_g;
                          var21 = var21 + var23;
                          continue L9;
                        }
                      }
                    }
                  }
                  var36 = param15 - param0;
                  if (0 == var36) {
                    var27 = 0;
                    var20 = 0;
                    var31 = 0;
                    var24 = 0;
                    var28 = 0;
                    var32 = 0;
                    var19 = 0;
                    var23 = 0;
                    break L3;
                  } else {
                    L12: {
                      var37 = param5 << 16;
                      var38 = param10 << 16;
                      var39 = param9 << 16;
                      if (var33 != 0) {
                        var18 = param8 << 16;
                        var26 = param3 << 16;
                        var30 = param12 << 16;
                        var22 = param2 << 16;
                        break L12;
                      } else {
                        var17_int = param8 << 16;
                        var29 = param12 << 16;
                        var21 = param2 << 16;
                        var25 = param3 << 16;
                        break L12;
                      }
                    }
                    var40 = param11 << 16;
                    var23 = (-var21 + var38) / var36;
                    var31 = (-var29 + var40) / var36;
                    var32 = (var40 - var30) / var36;
                    var20 = (var37 + -var18) / var36;
                    var24 = (-var22 + var38) / var36;
                    var27 = (-var25 + var39) / var36;
                    var19 = (var37 + -var17_int) / var36;
                    var28 = (-var26 + var39) / var36;
                    break L3;
                  }
                }
              }
              L13: {
                if (param16 < 0) {
                  param16 = -param16;
                  var25 = var25 + param16 * var27;
                  var21 = var21 + var23 * param16;
                  var29 = var29 + var31 * param16;
                  var17_int = var17_int + var19 * param16;
                  var26 = var26 + var28 * param16;
                  var22 = var22 + param16 * var24;
                  var30 = var30 + param16 * var32;
                  var18 = var18 + param16 * var20;
                  param16 = 0;
                  break L13;
                } else {
                  break L13;
                }
              }
              var35 = uoa.field_d[param16];
              L14: while (true) {
                if (param15 <= param16) {
                  return;
                } else {
                  L15: {
                    var36 = var17_int >> 16;
                    if (var36 < uoa.field_e) {
                      var37 = -(var17_int >> 16) + (var18 >> 16);
                      if (var37 == 0) {
                        if (0 > var36) {
                          break L15;
                        } else {
                          if (uoa.field_e <= var36) {
                            break L15;
                          } else {
                            qga.a(var29, var25, param6, 0, var35 + var36, -112, var37, 0, var21, 0);
                            break L15;
                          }
                        }
                      } else {
                        L16: {
                          var38 = (-var21 + var22) / var37;
                          var39 = (var26 + -var25) / var37;
                          var40 = (-var29 + var30) / var37;
                          if (uoa.field_e <= var36 + var37) {
                            var37 = uoa.field_e + -var36 + -1;
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                        if (var36 >= 0) {
                          qga.a(var29, var25, param6, var38, var36 + var35, -123, var37, var39, var21, var40);
                          break L15;
                        } else {
                          qga.a(var29 - var36 * var40, -(var36 * var39) + var25, param6, var38, var35, -127, var36 + var37, var39, -(var36 * var38) + var21, var40);
                          break L15;
                        }
                      }
                    } else {
                      break L15;
                    }
                  }
                  param16++;
                  if (param16 >= uoa.field_b) {
                    return;
                  } else {
                    var18 = var18 + var20;
                    var22 = var22 + var24;
                    var21 = var21 + var23;
                    var26 = var26 + var28;
                    var17_int = var17_int + var19;
                    var30 = var30 + var32;
                    var29 = var29 + var31;
                    var35 = var35 + bea.field_g;
                    var25 = var25 + var27;
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

    final static void a() {
        iu var1 = null;
        iu var2 = null;
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        try {
            var1 = new iu(540, 140);
            nm.a(var1, (byte) 112);
            uoa.b();
            bea.a();
            tl.field_r = 0;
            int discarded$0 = 0;
            uw.a();
            var2 = var1.a();
            for (var3 = 0; 15 > var3; var3++) {
                var2.b(-2, -2, 16777215);
                bea.a(4, 4, 0, 0, 540, 140);
            }
            bw.field_a.c();
            var1.c(0, 0);
            pfa.a(1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ica.B(" + 16777215 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = true;
    }
}
