/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph {
    static ri[] field_a;
    static qu field_b;
    static String field_d;
    private pj field_e;
    private ro field_g;
    private int field_f;
    static String field_h;
    private te field_c;

    final pj a(byte param0, long param1) {
        pj var4 = (pj) (Object) ((ph) this).field_c.a(param0 ^ -60, param1);
        if (param0 != -88) {
            pj discarded$0 = ((ph) this).a((byte) -122, 80L);
        }
        if (var4 != null) {
            ((ph) this).field_g.a(var4, (byte) -114);
        }
        return var4;
    }

    final void a(long param0, pj param1, int param2) {
        pj var5 = null;
        RuntimeException var5_ref = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (((ph) this).field_f != 0) {
                ((ph) this).field_f = ((ph) this).field_f - 1;
                break L1;
              } else {
                var5 = ((ph) this).field_g.b((byte) 72);
                var5.b(false);
                var5.c(-5106);
                if (((ph) this).field_e == var5) {
                  var5 = ((ph) this).field_g.b((byte) 72);
                  var5.b(false);
                  var5.c(-5106);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              ((ph) this).field_c.a((ms) (Object) param1, -1, param0);
              if (param2 < -114) {
                break L2;
              } else {
                ((ph) this).field_g = null;
                break L2;
              }
            }
            ((ph) this).field_g.a(param1, (byte) -109);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5_ref;
            stackOut_9_1 = new StringBuilder().append("ph.B(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_h = null;
        field_d = null;
        field_a = null;
    }

    final static void a() {
        f.field_s = null;
        gf.field_a = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, byte param14, int param15, int param16) {
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
          var42 = Sumoblitz.field_L ? 1 : 0;
          if (param12 < 0) {
            break L0;
          } else {
            if (~param13 > ~nk.field_c) {
              L1: {
                if (param0 >= 0) {
                  break L1;
                } else {
                  if (param9 >= 0) {
                    break L1;
                  } else {
                    if (param10 < 0) {
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (~nk.field_i < ~param0) {
                  break L2;
                } else {
                  if (~nk.field_i < ~param9) {
                    break L2;
                  } else {
                    if (~param10 <= ~nk.field_i) {
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L3: {
                var34 = -param13 + param12;
                if (param13 == param16) {
                  L4: {
                    if (param13 == param12) {
                      var29 = param6;
                      var31 = 0;
                      var26 = param8;
                      var19 = 0;
                      var18 = param9 << 16;
                      var30 = param5;
                      var28 = 0;
                      var25 = param11;
                      var24 = 0;
                      var17_int = param0 << 16;
                      var21 = param15;
                      var27 = 0;
                      var23 = 0;
                      var32 = 0;
                      var20 = 0;
                      var22 = param7;
                      break L4;
                    } else {
                      var35 = -param16 + param12;
                      if (~param0 <= ~param9) {
                        var27 = (param2 + -param8 << 16) / var35;
                        var30 = param6 << 16;
                        var31 = (-param5 + param1 << 16) / var35;
                        var28 = (param2 - param11 << 16) / var34;
                        var23 = (param3 + -param7 << 16) / var35;
                        var22 = param15 << 16;
                        var26 = param11 << 16;
                        var24 = (param3 + -param15 << 16) / var34;
                        var18 = param0 << 16;
                        var21 = param7 << 16;
                        var32 = (param1 - param6 << 16) / var34;
                        var19 = (-param9 + param10 << 16) / var35;
                        var25 = param8 << 16;
                        var20 = (param10 - param0 << 16) / var34;
                        var17_int = param9 << 16;
                        var29 = param5 << 16;
                        break L4;
                      } else {
                        var21 = param15 << 16;
                        var31 = (param1 - param6 << 16) / var34;
                        var17_int = param0 << 16;
                        var28 = (param2 - param8 << 16) / var35;
                        var25 = param11 << 16;
                        var22 = param7 << 16;
                        var26 = param8 << 16;
                        var32 = (param1 - param5 << 16) / var35;
                        var24 = (param3 + -param7 << 16) / var35;
                        var23 = (-param15 + param3 << 16) / var34;
                        var30 = param5 << 16;
                        var27 = (param2 + -param11 << 16) / var34;
                        var20 = (-param9 + param10 << 16) / var35;
                        var18 = param9 << 16;
                        var29 = param6 << 16;
                        var19 = (-param0 + param10 << 16) / var34;
                        break L4;
                      }
                    }
                  }
                  var33 = 0;
                  if (param13 >= 0) {
                    break L3;
                  } else {
                    param13 = Math.min(-param13, -param13 + param16);
                    var22 = var22 + param13 * var24;
                    var21 = var21 + var23 * param13;
                    var30 = var30 + param13 * var32;
                    var17_int = var17_int + var19 * param13;
                    var26 = var26 + param13 * var28;
                    var18 = var18 + param13 * var20;
                    var25 = var25 + var27 * param13;
                    var29 = var29 + var31 * param13;
                    param13 = 0;
                    break L3;
                  }
                } else {
                  L5: {
                    var30 = param6 << 16;
                    var29 = param6 << 16;
                    var22 = param15 << 16;
                    var21 = param15 << 16;
                    var26 = param11 << 16;
                    var25 = param11 << 16;
                    var18 = param0 << 16;
                    var17_int = param0 << 16;
                    var35 = -param13 + param16;
                    var19 = (-param0 + param9 << 16) / var35;
                    var20 = (param10 + -param0 << 16) / var34;
                    if (var19 >= var20) {
                      var28 = (-param11 + param8 << 16) / var35;
                      var36 = var19;
                      var19 = var20;
                      var20 = var36;
                      var33 = 1;
                      var31 = (-param6 + param1 << 16) / var34;
                      var27 = (-param11 + param2 << 16) / var34;
                      var23 = (-param15 + param3 << 16) / var34;
                      var32 = (param5 - param6 << 16) / var35;
                      var24 = (-param15 + param7 << 16) / var35;
                      break L5;
                    } else {
                      var27 = (-param11 + param8 << 16) / var35;
                      var32 = (param1 + -param6 << 16) / var34;
                      var23 = (-param15 + param7 << 16) / var35;
                      var28 = (-param11 + param2 << 16) / var34;
                      var24 = (-param15 + param3 << 16) / var34;
                      var31 = (-param6 + param5 << 16) / var35;
                      var33 = 0;
                      break L5;
                    }
                  }
                  L6: {
                    L7: {
                      if (param13 < 0) {
                        if (0 <= param16) {
                          param13 = -param13;
                          var21 = var21 + param13 * var23;
                          var30 = var30 + var32 * param13;
                          var25 = var25 + var27 * param13;
                          var17_int = var17_int + var19 * param13;
                          var26 = var26 + var28 * param13;
                          var29 = var29 + param13 * var31;
                          var22 = var22 + var24 * param13;
                          var18 = var18 + param13 * var20;
                          param13 = 0;
                          break L7;
                        } else {
                          param13 = param16 + -param13;
                          var25 = var25 + param13 * var27;
                          var21 = var21 + var23 * param13;
                          var22 = var22 + param13 * var24;
                          var30 = var30 + var32 * param13;
                          var29 = var29 + var31 * param13;
                          var18 = var18 + param13 * var20;
                          var17_int = var17_int + param13 * var19;
                          var26 = var26 + param13 * var28;
                          param13 = param16;
                          break L6;
                        }
                      } else {
                        break L7;
                      }
                    }
                    var36 = nk.field_d[param13];
                    L8: while (true) {
                      if (param13 >= param16) {
                        break L6;
                      } else {
                        L9: {
                          var37 = var17_int >> 16;
                          if (~var37 <= ~nk.field_i) {
                            break L9;
                          } else {
                            var38 = -(var17_int >> 16) + (var18 >> 16);
                            if (var38 == 0) {
                              if (0 > var37) {
                                break L9;
                              } else {
                                if (nk.field_i > var37) {
                                  mn.a(0, 0, param4, var38, 0, var25, var21, var37 + var36, true, var29);
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                            } else {
                              L10: {
                                var39 = (var22 - var21) / var38;
                                var40 = (var26 - var25) / var38;
                                var41 = (-var29 + var30) / var38;
                                if (nk.field_i > var38 + var37) {
                                  break L10;
                                } else {
                                  var38 = -var37 + (nk.field_i + -1);
                                  break L10;
                                }
                              }
                              if (0 > var37) {
                                mn.a(var40, var39, param4, var37 + var38, var41, var25 - var37 * var40, var21 - var39 * var37, var36, true, -(var37 * var41) + var29);
                                break L9;
                              } else {
                                mn.a(var40, var39, param4, var38, var41, var25, var21, var37 + var36, true, var29);
                                break L9;
                              }
                            }
                          }
                        }
                        param13++;
                        if (~nk.field_c >= ~param13) {
                          return;
                        } else {
                          var29 = var29 + var31;
                          var18 = var18 + var20;
                          var26 = var26 + var28;
                          var36 = var36 + lk.field_b;
                          var30 = var30 + var32;
                          var17_int = var17_int + var19;
                          var25 = var25 + var27;
                          var21 = var21 + var23;
                          var22 = var22 + var24;
                          continue L8;
                        }
                      }
                    }
                  }
                  var36 = -param16 + param12;
                  if (var36 != 0) {
                    L11: {
                      var37 = param10 << 16;
                      var38 = param3 << 16;
                      var39 = param2 << 16;
                      if (var33 != 0) {
                        var18 = param9 << 16;
                        var30 = param5 << 16;
                        var26 = param8 << 16;
                        var22 = param7 << 16;
                        break L11;
                      } else {
                        var25 = param8 << 16;
                        var17_int = param9 << 16;
                        var21 = param7 << 16;
                        var29 = param5 << 16;
                        break L11;
                      }
                    }
                    var40 = param1 << 16;
                    var20 = (-var18 + var37) / var36;
                    var27 = (var39 + -var25) / var36;
                    var31 = (var40 + -var29) / var36;
                    var28 = (-var26 + var39) / var36;
                    var24 = (-var22 + var38) / var36;
                    var32 = (-var30 + var40) / var36;
                    var19 = (-var17_int + var37) / var36;
                    var23 = (-var21 + var38) / var36;
                    break L3;
                  } else {
                    var27 = 0;
                    var31 = 0;
                    var20 = 0;
                    var28 = 0;
                    var19 = 0;
                    var23 = 0;
                    var32 = 0;
                    var24 = 0;
                    break L3;
                  }
                }
              }
              L12: {
                if (0 <= param13) {
                  break L12;
                } else {
                  param13 = -param13;
                  var17_int = var17_int + param13 * var19;
                  var21 = var21 + var23 * param13;
                  var26 = var26 + param13 * var28;
                  var29 = var29 + param13 * var31;
                  var25 = var25 + var27 * param13;
                  var18 = var18 + param13 * var20;
                  var30 = var30 + param13 * var32;
                  var22 = var22 + param13 * var24;
                  param13 = 0;
                  break L12;
                }
              }
              var35 = nk.field_d[param13];
              L13: while (true) {
                if (~param13 <= ~param12) {
                  return;
                } else {
                  L14: {
                    var36 = var17_int >> 16;
                    if (var36 >= nk.field_i) {
                      break L14;
                    } else {
                      var37 = -(var17_int >> 16) + (var18 >> 16);
                      if (var37 == 0) {
                        if (var36 < 0) {
                          break L14;
                        } else {
                          if (~nk.field_i < ~var36) {
                            mn.a(0, 0, param4, var37, 0, var25, var21, var35 + var36, true, var29);
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                      } else {
                        L15: {
                          var38 = (-var21 + var22) / var37;
                          var39 = (var26 - var25) / var37;
                          var40 = (-var29 + var30) / var37;
                          if (nk.field_i > var37 + var36) {
                            break L15;
                          } else {
                            var37 = -1 + (nk.field_i - var36);
                            break L15;
                          }
                        }
                        if (var36 >= 0) {
                          mn.a(var39, var38, param4, var37, var40, var25, var21, var35 + var36, true, var29);
                          break L14;
                        } else {
                          mn.a(var39, var38, param4, var36 + var37, var40, var25 + -(var39 * var36), var21 + -(var38 * var36), var35, true, var29 + -(var40 * var36));
                          break L14;
                        }
                      }
                    }
                  }
                  param13++;
                  if (~param13 > ~nk.field_c) {
                    var29 = var29 + var31;
                    var26 = var26 + var28;
                    var25 = var25 + var27;
                    var30 = var30 + var32;
                    var21 = var21 + var23;
                    var35 = var35 + lk.field_b;
                    var22 = var22 + var24;
                    var18 = var18 + var20;
                    var17_int = var17_int + var19;
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

    ph(int param0) {
        ((ph) this).field_e = new pj();
        ((ph) this).field_g = new ro();
        ((ph) this).field_f = param0;
        int var2 = 1;
        while (param0 > var2 + var2) {
            var2 = var2 + var2;
        }
        ((ph) this).field_c = new te(var2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Username: ";
        field_d = "You have <%0> unread messages!";
    }
}
