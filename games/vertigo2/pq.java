/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pq {
    static long field_e;
    static int[] field_c;
    static wk field_f;
    static String field_a;
    private int[] field_d;
    static String field_g;
    static String field_b;

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Vertigo2.field_L ? 1 : 0;
          var3 = -1 + (((pq) this).field_d.length >> 1);
          if (param1 == 1) {
            break L0;
          } else {
            field_f = null;
            break L0;
          }
        }
        var4 = param0 & var3;
        L1: while (true) {
          var5 = ((pq) this).field_d[var4 + (var4 - -1)];
          if (var5 != -1) {
            if (param0 != ((pq) this).field_d[var4 + var4]) {
              var4 = var3 & var4 + 1;
              continue L1;
            } else {
              return var5;
            }
          } else {
            return -1;
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_g = null;
        field_f = null;
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int[] param13, boolean param14, int param15, int param16) {
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
          var42 = Vertigo2.field_L ? 1 : 0;
          if (param3 < 0) {
            break L0;
          } else {
            if (~param7 > ~oo.field_b) {
              L1: {
                if (param2 >= 0) {
                  break L1;
                } else {
                  if (0 <= param12) {
                    break L1;
                  } else {
                    if (param8 < 0) {
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (param2 < oo.field_q) {
                  break L2;
                } else {
                  if (~oo.field_q < ~param12) {
                    break L2;
                  } else {
                    if (oo.field_q > param8) {
                      break L2;
                    } else {
                      return;
                    }
                  }
                }
              }
              if (param14) {
                L3: {
                  var34 = -param7 + param3;
                  if (~param16 != ~param7) {
                    L4: {
                      var30 = param15 << 16;
                      var29 = param15 << 16;
                      var22 = param5 << 16;
                      var21 = param5 << 16;
                      var26 = param0 << 16;
                      var25 = param0 << 16;
                      var18 = param2 << 16;
                      var17_int = param2 << 16;
                      var35 = param16 + -param7;
                      var19 = (-param2 + param12 << 16) / var35;
                      var20 = (-param2 + param8 << 16) / var34;
                      if (var19 >= var20) {
                        var36 = var19;
                        var19 = var20;
                        var20 = var36;
                        var33 = 1;
                        var28 = (param1 + -param0 << 16) / var35;
                        var24 = (-param5 + param9 << 16) / var35;
                        var23 = (param4 - param5 << 16) / var34;
                        var32 = (param6 - param15 << 16) / var35;
                        var27 = (-param0 + param11 << 16) / var34;
                        var31 = (-param15 + param10 << 16) / var34;
                        break L4;
                      } else {
                        var28 = (-param0 + param11 << 16) / var34;
                        var32 = (-param15 + param10 << 16) / var34;
                        var31 = (param6 - param15 << 16) / var35;
                        var33 = 0;
                        var24 = (-param5 + param4 << 16) / var34;
                        var27 = (param1 - param0 << 16) / var35;
                        var23 = (-param5 + param9 << 16) / var35;
                        break L4;
                      }
                    }
                    L5: {
                      L6: {
                        if (param7 >= 0) {
                          break L6;
                        } else {
                          if (param16 >= 0) {
                            param7 = -param7;
                            var21 = var21 + var23 * param7;
                            var22 = var22 + param7 * var24;
                            var17_int = var17_int + param7 * var19;
                            var30 = var30 + var32 * param7;
                            var29 = var29 + var31 * param7;
                            var25 = var25 + var27 * param7;
                            var18 = var18 + var20 * param7;
                            var26 = var26 + var28 * param7;
                            param7 = 0;
                            break L6;
                          } else {
                            param7 = param16 - param7;
                            var22 = var22 + param7 * var24;
                            var18 = var18 + var20 * param7;
                            var17_int = var17_int + param7 * var19;
                            var30 = var30 + var32 * param7;
                            var29 = var29 + var31 * param7;
                            var25 = var25 + param7 * var27;
                            var26 = var26 + var28 * param7;
                            var21 = var21 + param7 * var23;
                            param7 = param16;
                            break L5;
                          }
                        }
                      }
                      var36 = oo.field_a[param7];
                      L7: while (true) {
                        if (param16 <= param7) {
                          break L5;
                        } else {
                          L8: {
                            var37 = var17_int >> 16;
                            if (~oo.field_q >= ~var37) {
                              break L8;
                            } else {
                              var38 = (var18 >> 16) - (var17_int >> 16);
                              if (var38 == 0) {
                                if (var37 < 0) {
                                  break L8;
                                } else {
                                  if (var37 >= oo.field_q) {
                                    break L8;
                                  } else {
                                    hm.a(0, 0, var25, var38, (byte) 120, var21, var29, param13, var36 + var37, 0);
                                    break L8;
                                  }
                                }
                              } else {
                                L9: {
                                  var39 = (-var21 + var22) / var38;
                                  var40 = (var26 + -var25) / var38;
                                  var41 = (var30 - var29) / var38;
                                  if (var37 + var38 < oo.field_q) {
                                    break L9;
                                  } else {
                                    var38 = -var37 + (oo.field_q + -1);
                                    break L9;
                                  }
                                }
                                if (var37 >= 0) {
                                  hm.a(var41, var40, var25, var38, (byte) 52, var21, var29, param13, var37 + var36, var39);
                                  break L8;
                                } else {
                                  hm.a(var41, var40, var25 + -(var40 * var37), var37 + var38, (byte) 40, var21 - var37 * var39, -(var41 * var37) + var29, param13, var36, var39);
                                  break L8;
                                }
                              }
                            }
                          }
                          param7++;
                          if (~param7 > ~oo.field_b) {
                            var17_int = var17_int + var19;
                            var18 = var18 + var20;
                            var36 = var36 + bi.field_e;
                            var26 = var26 + var28;
                            var25 = var25 + var27;
                            var21 = var21 + var23;
                            var30 = var30 + var32;
                            var29 = var29 + var31;
                            var22 = var22 + var24;
                            continue L7;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                    var36 = -param16 + param3;
                    if (var36 == 0) {
                      var20 = 0;
                      var32 = 0;
                      var27 = 0;
                      var28 = 0;
                      var24 = 0;
                      var19 = 0;
                      var31 = 0;
                      var23 = 0;
                      break L3;
                    } else {
                      L10: {
                        var37 = param8 << 16;
                        var38 = param4 << 16;
                        var39 = param11 << 16;
                        if (var33 == 0) {
                          var29 = param6 << 16;
                          var25 = param1 << 16;
                          var17_int = param12 << 16;
                          var21 = param9 << 16;
                          break L10;
                        } else {
                          var30 = param6 << 16;
                          var18 = param12 << 16;
                          var22 = param9 << 16;
                          var26 = param1 << 16;
                          break L10;
                        }
                      }
                      var40 = param10 << 16;
                      var27 = (var39 - var25) / var36;
                      var31 = (var40 + -var29) / var36;
                      var23 = (-var21 + var38) / var36;
                      var20 = (-var18 + var37) / var36;
                      var24 = (-var22 + var38) / var36;
                      var32 = (-var30 + var40) / var36;
                      var28 = (var39 - var26) / var36;
                      var19 = (var37 - var17_int) / var36;
                      break L3;
                    }
                  } else {
                    L11: {
                      if (param7 == param3) {
                        var27 = 0;
                        var22 = param9;
                        var28 = 0;
                        var25 = param0;
                        var31 = 0;
                        var23 = 0;
                        var26 = param1;
                        var20 = 0;
                        var30 = param6;
                        var24 = 0;
                        var32 = 0;
                        var19 = 0;
                        var17_int = param2 << 16;
                        var29 = param15;
                        var18 = param12 << 16;
                        var21 = param5;
                        break L11;
                      } else {
                        var35 = param3 - param16;
                        if (param2 < param12) {
                          var25 = param0 << 16;
                          var23 = (param4 - param5 << 16) / var34;
                          var22 = param9 << 16;
                          var18 = param12 << 16;
                          var27 = (-param0 + param11 << 16) / var34;
                          var26 = param1 << 16;
                          var28 = (param11 + -param1 << 16) / var35;
                          var20 = (param8 - param12 << 16) / var35;
                          var17_int = param2 << 16;
                          var32 = (-param6 + param10 << 16) / var35;
                          var24 = (param4 + -param9 << 16) / var35;
                          var29 = param15 << 16;
                          var30 = param6 << 16;
                          var31 = (param10 - param15 << 16) / var34;
                          var19 = (-param2 + param8 << 16) / var34;
                          var21 = param5 << 16;
                          break L11;
                        } else {
                          var32 = (-param15 + param10 << 16) / var34;
                          var24 = (param4 - param5 << 16) / var34;
                          var21 = param9 << 16;
                          var31 = (param10 - param6 << 16) / var35;
                          var22 = param5 << 16;
                          var28 = (-param0 + param11 << 16) / var34;
                          var29 = param6 << 16;
                          var30 = param15 << 16;
                          var20 = (param8 - param2 << 16) / var34;
                          var26 = param0 << 16;
                          var17_int = param12 << 16;
                          var25 = param1 << 16;
                          var19 = (param8 + -param12 << 16) / var35;
                          var18 = param2 << 16;
                          var27 = (param11 - param1 << 16) / var35;
                          var23 = (-param9 + param4 << 16) / var35;
                          break L11;
                        }
                      }
                    }
                    L12: {
                      if (0 <= param7) {
                        break L12;
                      } else {
                        param7 = Math.min(-param7, param16 + -param7);
                        var26 = var26 + var28 * param7;
                        var30 = var30 + param7 * var32;
                        var18 = var18 + var20 * param7;
                        var29 = var29 + param7 * var31;
                        var22 = var22 + param7 * var24;
                        var25 = var25 + param7 * var27;
                        var21 = var21 + param7 * var23;
                        var17_int = var17_int + param7 * var19;
                        param7 = 0;
                        break L12;
                      }
                    }
                    var33 = 0;
                    break L3;
                  }
                }
                L13: {
                  if (param7 >= 0) {
                    break L13;
                  } else {
                    param7 = -param7;
                    var17_int = var17_int + var19 * param7;
                    var25 = var25 + var27 * param7;
                    var30 = var30 + param7 * var32;
                    var22 = var22 + var24 * param7;
                    var21 = var21 + param7 * var23;
                    var18 = var18 + var20 * param7;
                    var29 = var29 + param7 * var31;
                    var26 = var26 + param7 * var28;
                    param7 = 0;
                    break L13;
                  }
                }
                var35 = oo.field_a[param7];
                L14: while (true) {
                  if (~param7 <= ~param3) {
                    return;
                  } else {
                    L15: {
                      var36 = var17_int >> 16;
                      if (~var36 <= ~oo.field_q) {
                        break L15;
                      } else {
                        var37 = (var18 >> 16) - (var17_int >> 16);
                        if (var37 == 0) {
                          if (var36 < 0) {
                            break L15;
                          } else {
                            if (oo.field_q > var36) {
                              hm.a(0, 0, var25, var37, (byte) 68, var21, var29, param13, var36 + var35, 0);
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                        } else {
                          L16: {
                            var38 = (var22 + -var21) / var37;
                            var39 = (-var25 + var26) / var37;
                            var40 = (var30 - var29) / var37;
                            if (var36 - -var37 >= oo.field_q) {
                              var37 = -1 + -var36 + oo.field_q;
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          if (var36 < 0) {
                            hm.a(var40, var39, -(var39 * var36) + var25, var36 + var37, (byte) 107, var21 + -(var36 * var38), var29 + -(var36 * var40), param13, var35, var38);
                            break L15;
                          } else {
                            hm.a(var40, var39, var25, var37, (byte) 89, var21, var29, param13, var36 + var35, var38);
                            break L15;
                          }
                        }
                      }
                    }
                    param7++;
                    if (oo.field_b > param7) {
                      var18 = var18 + var20;
                      var35 = var35 + bi.field_e;
                      var17_int = var17_int + var19;
                      var30 = var30 + var32;
                      var29 = var29 + var31;
                      var22 = var22 + var24;
                      var26 = var26 + var28;
                      var25 = var25 + var27;
                      var21 = var21 + var23;
                      continue L14;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              break L0;
            }
          }
        }
    }

    pq(int[] param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            var2_int = 1;
            L1: while (true) {
              if ((param0.length >> 1) + param0.length < var2_int) {
                ((pq) this).field_d = new int[var2_int + var2_int];
                var3 = 0;
                L2: while (true) {
                  if (var2_int - -var2_int <= var3) {
                    var3 = 0;
                    L3: while (true) {
                      if (param0.length <= var3) {
                        break L0;
                      } else {
                        var4 = -1 + var2_int & param0[var3];
                        L4: while (true) {
                          if (((pq) this).field_d[var4 + (var4 - -1)] == -1) {
                            ((pq) this).field_d[var4 - -var4] = param0[var3];
                            ((pq) this).field_d[1 + (var4 + var4)] = var3;
                            var3++;
                            continue L3;
                          } else {
                            var4 = 1 + var4 & -1 + var2_int;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    ((pq) this).field_d[var3] = -1;
                    var3++;
                    continue L2;
                  }
                }
              } else {
                var2_int = var2_int << 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2;
            stackOut_14_1 = new StringBuilder().append("pq.<init>(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
    }

    final static boolean b(int param0) {
        if (param0 != 0) {
            field_e = 43L;
        }
        gl.field_k = true;
        aj.field_j = 15000L + gk.a(56);
        return hn.field_w == 11 ? true : false;
    }

    final static void a(byte param0) {
        pe.field_r = false;
        hj.field_b = id.field_f.h(-11) == 0 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "You are on <%0>";
        field_b = "Updates will sent to the email address you've given";
        field_g = "Open";
    }
}
