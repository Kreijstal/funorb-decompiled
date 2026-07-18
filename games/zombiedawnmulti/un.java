/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class un extends gf implements fi {
    private pm field_m;
    static String field_n;
    static String field_p;
    static int field_k;
    static String field_o;
    static String field_l;

    un(pm param0) {
        try {
            ((un) this).field_m = param0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "un.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0, boolean param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        L0: {
          if (param1) {
            if (lb.field_c[param2] >= lb.field_c[param3]) {
              if (lb.field_c[param2] <= lb.field_c[param3]) {
                if (hn.field_f[param3] <= hn.field_f[param2]) {
                  if (hn.field_f[param3] >= hn.field_f[param2]) {
                    break L0;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            if (hn.field_f[param2] < hn.field_f[param3]) {
              return true;
            } else {
              if (hn.field_f[param2] <= hn.field_f[param3]) {
                if (lb.field_c[param2] < lb.field_c[param3]) {
                  return true;
                } else {
                  if (lb.field_c[param3] < lb.field_c[param2]) {
                    return false;
                  } else {
                    break L0;
                  }
                }
              } else {
                return false;
              }
            }
          }
        }
        var4 = ie.field_ob[param2] + (kj.field_p[param2] + vk.field_J[param2]);
        var5 = ie.field_ob[param3] + (vk.field_J[param3] + kj.field_p[param3]);
        if (var4 >= var5) {
          if (var4 > var5) {
            return false;
          } else {
            L1: {
              if (param2 >= param3) {
                stackOut_25_0 = 0;
                stackIn_26_0 = stackOut_25_0;
                break L1;
              } else {
                stackOut_24_0 = 1;
                stackIn_26_0 = stackOut_24_0;
                break L1;
              }
            }
            return stackIn_26_0 != 0;
          }
        } else {
          return true;
        }
    }

    abstract re a(boolean param0, String param1);

    public final void a(pm param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                ((un) this).field_m = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("un.I(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    abstract String a(String param0, int param1);

    public static void g(int param0) {
        field_n = null;
        field_l = null;
        field_o = null;
        field_p = null;
        if (param0 != -1317848592) {
            un.g(-41);
        }
    }

    public final boolean b(int param0) {
        Object var3 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -3) {
            break L0;
          } else {
            var3 = null;
            ((un) this).a((pm) null, true);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((un) this).field_m.field_j == null) {
              break L2;
            } else {
              if (((un) this).field_m.field_j.length() != 0) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
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
          var42 = ZombieDawnMulti.field_E ? 1 : 0;
          if (0 > param4) {
            break L0;
          } else {
            if (ep.field_h <= param9) {
              break L0;
            } else {
              L1: {
                if (0 <= param11) {
                  break L1;
                } else {
                  if (param12 >= 0) {
                    break L1;
                  } else {
                    if (0 > param1) {
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (ep.field_i > param11) {
                  break L2;
                } else {
                  if (ep.field_i > param12) {
                    break L2;
                  } else {
                    if (ep.field_i > param1) {
                      break L2;
                    } else {
                      return;
                    }
                  }
                }
              }
              var34 = param4 + -param9;
              if (param3 == -10423) {
                L3: {
                  if (param9 != param7) {
                    L4: {
                      var30 = param13 << 16;
                      var29 = param13 << 16;
                      var18 = param11 << 16;
                      var17_int = param11 << 16;
                      var26 = param6 << 16;
                      var25 = param6 << 16;
                      var22 = param5 << 16;
                      var21 = param5 << 16;
                      var35 = param7 + -param9;
                      var19 = (-param11 + param12 << 16) / var35;
                      var20 = (param1 + -param11 << 16) / var34;
                      if (var19 >= var20) {
                        var32 = (-param13 + param2 << 16) / var35;
                        var31 = (param10 + -param13 << 16) / var34;
                        var23 = (param15 - param5 << 16) / var34;
                        var36 = var19;
                        var19 = var20;
                        var20 = var36;
                        var27 = (-param6 + param16 << 16) / var34;
                        var28 = (-param6 + param14 << 16) / var35;
                        var24 = (param8 - param5 << 16) / var35;
                        var33 = 1;
                        break L4;
                      } else {
                        var27 = (-param6 + param14 << 16) / var35;
                        var33 = 0;
                        var32 = (-param13 + param10 << 16) / var34;
                        var24 = (-param5 + param15 << 16) / var34;
                        var31 = (-param13 + param2 << 16) / var35;
                        var28 = (-param6 + param16 << 16) / var34;
                        var23 = (param8 - param5 << 16) / var35;
                        break L4;
                      }
                    }
                    L5: {
                      L6: {
                        if (param9 < 0) {
                          if (0 > param7) {
                            param9 = param7 - param9;
                            var21 = var21 + param9 * var23;
                            var22 = var22 + var24 * param9;
                            var18 = var18 + var20 * param9;
                            var25 = var25 + param9 * var27;
                            var26 = var26 + param9 * var28;
                            var17_int = var17_int + var19 * param9;
                            var29 = var29 + param9 * var31;
                            var30 = var30 + var32 * param9;
                            param9 = param7;
                            break L5;
                          } else {
                            param9 = -param9;
                            var18 = var18 + param9 * var20;
                            var25 = var25 + var27 * param9;
                            var22 = var22 + var24 * param9;
                            var29 = var29 + param9 * var31;
                            var21 = var21 + param9 * var23;
                            var30 = var30 + param9 * var32;
                            var17_int = var17_int + param9 * var19;
                            var26 = var26 + param9 * var28;
                            param9 = 0;
                            break L6;
                          }
                        } else {
                          break L6;
                        }
                      }
                      var36 = ep.field_a[param9];
                      L7: while (true) {
                        if (param9 >= param7) {
                          break L5;
                        } else {
                          L8: {
                            var37 = var17_int >> 16;
                            if (var37 < ep.field_i) {
                              var38 = -(var17_int >> 16) + (var18 >> 16);
                              if (var38 != 0) {
                                L9: {
                                  var39 = (-var21 + var22) / var38;
                                  var40 = (-var25 + var26) / var38;
                                  var41 = (-var29 + var30) / var38;
                                  if (ep.field_i <= var37 + var38) {
                                    var38 = -1 + (ep.field_i - var37);
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                                if (var37 >= 0) {
                                  ub.a(var38, var21, var29, (byte) 116, param0, var40, var41, var25, var37 - -var36, var39);
                                  break L8;
                                } else {
                                  ub.a(var37 + var38, var21 - var39 * var37, var29 + -(var37 * var41), (byte) -126, param0, var40, var41, -(var37 * var40) + var25, var36, var39);
                                  break L8;
                                }
                              } else {
                                if (0 > var37) {
                                  break L8;
                                } else {
                                  if (var37 < ep.field_i) {
                                    ub.a(var38, var21, var29, (byte) 102, param0, 0, 0, var25, var37 - -var36, 0);
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
                          param9++;
                          if (param9 < ep.field_h) {
                            var25 = var25 + var27;
                            var17_int = var17_int + var19;
                            var36 = var36 + oo.field_b;
                            var21 = var21 + var23;
                            var29 = var29 + var31;
                            var26 = var26 + var28;
                            var30 = var30 + var32;
                            var18 = var18 + var20;
                            var22 = var22 + var24;
                            continue L7;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                    var36 = param4 - param7;
                    if (0 != var36) {
                      L10: {
                        var37 = param1 << 16;
                        var38 = param15 << 16;
                        var39 = param16 << 16;
                        if (var33 == 0) {
                          var25 = param14 << 16;
                          var21 = param8 << 16;
                          var17_int = param12 << 16;
                          var29 = param2 << 16;
                          break L10;
                        } else {
                          var30 = param2 << 16;
                          var18 = param12 << 16;
                          var22 = param8 << 16;
                          var26 = param14 << 16;
                          break L10;
                        }
                      }
                      var40 = param10 << 16;
                      var23 = (-var21 + var38) / var36;
                      var27 = (-var25 + var39) / var36;
                      var20 = (-var18 + var37) / var36;
                      var19 = (var37 + -var17_int) / var36;
                      var32 = (-var30 + var40) / var36;
                      var28 = (var39 + -var26) / var36;
                      var24 = (var38 - var22) / var36;
                      var31 = (var40 + -var29) / var36;
                      break L3;
                    } else {
                      var23 = 0;
                      var20 = 0;
                      var32 = 0;
                      var24 = 0;
                      var31 = 0;
                      var19 = 0;
                      var28 = 0;
                      var27 = 0;
                      break L3;
                    }
                  } else {
                    L11: {
                      if (param9 != param4) {
                        var35 = param4 - param7;
                        if (param12 > param11) {
                          var31 = (param10 + -param13 << 16) / var34;
                          var26 = param14 << 16;
                          var25 = param6 << 16;
                          var17_int = param11 << 16;
                          var22 = param8 << 16;
                          var32 = (param10 + -param2 << 16) / var35;
                          var27 = (param16 - param6 << 16) / var34;
                          var29 = param13 << 16;
                          var18 = param12 << 16;
                          var24 = (param15 - param8 << 16) / var35;
                          var30 = param2 << 16;
                          var23 = (-param5 + param15 << 16) / var34;
                          var28 = (-param14 + param16 << 16) / var35;
                          var19 = (-param11 + param1 << 16) / var34;
                          var21 = param5 << 16;
                          var20 = (-param12 + param1 << 16) / var35;
                          break L11;
                        } else {
                          var20 = (param1 + -param11 << 16) / var34;
                          var29 = param2 << 16;
                          var22 = param5 << 16;
                          var27 = (-param14 + param16 << 16) / var35;
                          var28 = (-param6 + param16 << 16) / var34;
                          var31 = (-param2 + param10 << 16) / var35;
                          var32 = (param10 + -param13 << 16) / var34;
                          var30 = param13 << 16;
                          var17_int = param12 << 16;
                          var24 = (-param5 + param15 << 16) / var34;
                          var25 = param14 << 16;
                          var26 = param6 << 16;
                          var19 = (-param12 + param1 << 16) / var35;
                          var23 = (-param8 + param15 << 16) / var35;
                          var18 = param11 << 16;
                          var21 = param8 << 16;
                          break L11;
                        }
                      } else {
                        var18 = param12 << 16;
                        var25 = param6;
                        var21 = param5;
                        var27 = 0;
                        var28 = 0;
                        var23 = 0;
                        var24 = 0;
                        var17_int = param11 << 16;
                        var30 = param2;
                        var22 = param8;
                        var26 = param14;
                        var20 = 0;
                        var19 = 0;
                        var31 = 0;
                        var29 = param13;
                        var32 = 0;
                        break L11;
                      }
                    }
                    L12: {
                      if (param9 >= 0) {
                        break L12;
                      } else {
                        param9 = Math.min(-param9, param7 + -param9);
                        var29 = var29 + var31 * param9;
                        var17_int = var17_int + param9 * var19;
                        var21 = var21 + var23 * param9;
                        var25 = var25 + var27 * param9;
                        var26 = var26 + var28 * param9;
                        var22 = var22 + var24 * param9;
                        var18 = var18 + param9 * var20;
                        var30 = var30 + var32 * param9;
                        param9 = 0;
                        break L12;
                      }
                    }
                    var33 = 0;
                    break L3;
                  }
                }
                L13: {
                  if (param9 < 0) {
                    param9 = -param9;
                    var29 = var29 + param9 * var31;
                    var21 = var21 + var23 * param9;
                    var22 = var22 + param9 * var24;
                    var17_int = var17_int + var19 * param9;
                    var30 = var30 + param9 * var32;
                    var18 = var18 + param9 * var20;
                    var25 = var25 + param9 * var27;
                    var26 = var26 + var28 * param9;
                    param9 = 0;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                var35 = ep.field_a[param9];
                L14: while (true) {
                  if (param9 >= param4) {
                    return;
                  } else {
                    L15: {
                      var36 = var17_int >> 16;
                      if (var36 < ep.field_i) {
                        var37 = (var18 >> 16) + -(var17_int >> 16);
                        if (var37 != 0) {
                          L16: {
                            var38 = (var22 - var21) / var37;
                            var39 = (var26 - var25) / var37;
                            var40 = (var30 + -var29) / var37;
                            if (var36 + var37 < ep.field_i) {
                              break L16;
                            } else {
                              var37 = -1 + (ep.field_i + -var36);
                              break L16;
                            }
                          }
                          if (var36 >= 0) {
                            ub.a(var37, var21, var29, (byte) -24, param0, var39, var40, var25, var35 + var36, var38);
                            break L15;
                          } else {
                            ub.a(var37 - -var36, var21 - var38 * var36, var29 + -(var36 * var40), (byte) 81, param0, var39, var40, -(var39 * var36) + var25, var35, var38);
                            break L15;
                          }
                        } else {
                          if (var36 < 0) {
                            break L15;
                          } else {
                            if (ep.field_i <= var36) {
                              break L15;
                            } else {
                              ub.a(var37, var21, var29, (byte) -84, param0, 0, 0, var25, var35 + var36, 0);
                              break L15;
                            }
                          }
                        }
                      } else {
                        break L15;
                      }
                    }
                    param9++;
                    if (param9 >= ep.field_h) {
                      return;
                    } else {
                      var35 = var35 + oo.field_b;
                      var22 = var22 + var24;
                      var26 = var26 + var28;
                      var18 = var18 + var20;
                      var21 = var21 + var23;
                      var25 = var25 + var27;
                      var29 = var29 + var31;
                      var17_int = var17_int + var19;
                      var30 = var30 + var32;
                      continue L14;
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

    public final void a(pm param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((un) this).a(-1306);
              if (param1 == 0) {
                break L1;
              } else {
                un.g(78);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("un.G(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final re f(int param0) {
        if (param0 != -3) {
            un.g(38);
        }
        return ((un) this).a(false, ((un) this).field_m.field_j);
    }

    final String e(int param0) {
        if (param0 != -3) {
            un.a((int[]) null, -99, -31, 9, -3, 10, 88, -54, -105, 27, -84, -122, -1, -93, -21, -86, 107);
        }
        return ((un) this).a(((un) this).field_m.field_j, -1276425040);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Cloak your zombies in pure fear.";
        field_k = 1;
        field_o = "Nimble Fingers";
        field_l = "<%0> has lost connection.";
    }
}
