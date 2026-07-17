/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q extends oj {
    int field_z;
    static String field_y;
    int field_E;
    static float field_C;
    static int field_B;
    static boolean field_D;
    static int field_F;

    public static void g(int param0) {
        if (param0 >= -63) {
            q.g(6);
        }
        field_y = null;
    }

    final static void a(boolean param0, String param1) {
        try {
            fp.a(param1, (byte) -65);
            af.a(param0, lo.field_o, -1);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "q.D(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final String a(byte param0, boolean param1) {
        if (param1) {
            System.out.println("Teleport disappear event debug");
            System.out.println("Unit at " + ((q) this).field_z + "," + ((q) this).field_E);
        }
        String var3 = "EventTelepop: pos: (" + ((q) this).field_z + "," + ((q) this).field_E + ")";
        int var4 = -35 % ((param0 - 53) / 51);
        return var3;
    }

    q(int param0, int param1) {
        ((q) this).field_E = param1;
        ((q) this).field_z = param0;
        ((q) this).field_m = 6;
    }

    final boolean a(at param0, byte param1, ic param2) {
        RuntimeException var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -84) {
                break L1;
              } else {
                String discarded$2 = ((q) this).a((byte) -47, true);
                break L1;
              }
            }
            stackOut_2_0 = ((q) this).a((byte) -39, param2, param0, true);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("q.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param1).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_3_0;
    }

    final void a(ha param0, int param1) {
        jd var5 = null;
        jd var6 = null;
        try {
            if (param1 != -26661) {
                ((q) this).field_E = -18;
            }
            if (!((q) this).field_w.field_bb) {
                ((q) this).field_w.e(param1 + 26574);
            } else {
                var5 = param0.c(((q) this).field_E, true, ((q) this).field_z);
                var6 = var5;
                var6.field_bb = false;
                ((q) this).field_w.d(param1 ^ 26707);
            }
            fl.a(param0, -112);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "q.G(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, boolean param13, int param14, int param15, int param16) {
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
          var42 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param11 < 0) {
            break L0;
          } else {
            if (~param15 > ~tm.field_q) {
              L1: {
                if (param14 >= 0) {
                  break L1;
                } else {
                  if (param12 >= 0) {
                    break L1;
                  } else {
                    if (0 <= param9) {
                      break L1;
                    } else {
                      return;
                    }
                  }
                }
              }
              L2: {
                if (~param14 > ~tm.field_l) {
                  break L2;
                } else {
                  if (tm.field_l > param12) {
                    break L2;
                  } else {
                    if (~tm.field_l >= ~param9) {
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              if (param13) {
                L3: {
                  var34 = param11 - param15;
                  if (param10 != param15) {
                    L4: {
                      var18 = param14 << 16;
                      var17_int = param14 << 16;
                      var30 = param4 << 16;
                      var29 = param4 << 16;
                      var26 = param1 << 16;
                      var25 = param1 << 16;
                      var22 = param8 << 16;
                      var21 = param8 << 16;
                      var35 = -param15 + param10;
                      var20 = (param9 + -param14 << 16) / var34;
                      var19 = (-param14 + param12 << 16) / var35;
                      if (var19 < var20) {
                        var28 = (-param1 + param5 << 16) / var34;
                        var32 = (param3 - param4 << 16) / var34;
                        var33 = 0;
                        var23 = (param6 - param8 << 16) / var35;
                        var31 = (-param4 + param2 << 16) / var35;
                        var27 = (-param1 + param7 << 16) / var35;
                        var24 = (-param8 + param16 << 16) / var34;
                        break L4;
                      } else {
                        var36 = var19;
                        var19 = var20;
                        var20 = var36;
                        var23 = (param16 + -param8 << 16) / var34;
                        var27 = (-param1 + param5 << 16) / var34;
                        var32 = (param2 - param4 << 16) / var35;
                        var24 = (param6 + -param8 << 16) / var35;
                        var33 = 1;
                        var31 = (-param4 + param3 << 16) / var34;
                        var28 = (-param1 + param7 << 16) / var35;
                        break L4;
                      }
                    }
                    L5: {
                      L6: {
                        if (param15 >= 0) {
                          break L6;
                        } else {
                          if (param10 >= 0) {
                            param15 = -param15;
                            var18 = var18 + param15 * var20;
                            var17_int = var17_int + param15 * var19;
                            var29 = var29 + var31 * param15;
                            var25 = var25 + var27 * param15;
                            var30 = var30 + param15 * var32;
                            var21 = var21 + param15 * var23;
                            var22 = var22 + var24 * param15;
                            var26 = var26 + param15 * var28;
                            param15 = 0;
                            break L6;
                          } else {
                            param15 = -param15 + param10;
                            var30 = var30 + var32 * param15;
                            var21 = var21 + var23 * param15;
                            var18 = var18 + param15 * var20;
                            var29 = var29 + param15 * var31;
                            var22 = var22 + var24 * param15;
                            var26 = var26 + param15 * var28;
                            var25 = var25 + param15 * var27;
                            var17_int = var17_int + var19 * param15;
                            param15 = param10;
                            break L5;
                          }
                        }
                      }
                      var36 = tm.field_k[param15];
                      L7: while (true) {
                        if (param15 >= param10) {
                          break L5;
                        } else {
                          L8: {
                            var37 = var17_int >> 16;
                            if (var37 >= tm.field_l) {
                              break L8;
                            } else {
                              var38 = -(var17_int >> 16) + (var18 >> 16);
                              if (var38 == 0) {
                                if (0 > var37) {
                                  break L8;
                                } else {
                                  if (~tm.field_l < ~var37) {
                                    jn.a(var29, var21, 0, 33423424, var37 + var36, var38, var25, param0, 0, 0);
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                }
                              } else {
                                L9: {
                                  var39 = (var22 - var21) / var38;
                                  var40 = (-var25 + var26) / var38;
                                  var41 = (-var29 + var30) / var38;
                                  if (~tm.field_l >= ~(var38 + var37)) {
                                    var38 = tm.field_l - (var37 - -1);
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                                if (var37 >= 0) {
                                  jn.a(var29, var21, var39, 33423424, var36 + var37, var38, var25, param0, var40, var41);
                                  break L8;
                                } else {
                                  jn.a(var29 + -(var37 * var41), -(var37 * var39) + var21, var39, 33423424, var36, var37 + var38, var25 - var40 * var37, param0, var40, var41);
                                  break L8;
                                }
                              }
                            }
                          }
                          param15++;
                          if (~tm.field_q < ~param15) {
                            var18 = var18 + var20;
                            var26 = var26 + var28;
                            var22 = var22 + var24;
                            var30 = var30 + var32;
                            var17_int = var17_int + var19;
                            var25 = var25 + var27;
                            var21 = var21 + var23;
                            var36 = var36 + qn.field_l;
                            var29 = var29 + var31;
                            continue L7;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                    var36 = param11 - param10;
                    if (0 != var36) {
                      L10: {
                        var37 = param9 << 16;
                        var38 = param16 << 16;
                        var39 = param5 << 16;
                        var40 = param3 << 16;
                        if (var33 == 0) {
                          var21 = param6 << 16;
                          var25 = param7 << 16;
                          var17_int = param12 << 16;
                          var29 = param2 << 16;
                          break L10;
                        } else {
                          var22 = param6 << 16;
                          var18 = param12 << 16;
                          var30 = param2 << 16;
                          var26 = param7 << 16;
                          break L10;
                        }
                      }
                      var24 = (-var22 + var38) / var36;
                      var31 = (-var29 + var40) / var36;
                      var32 = (-var30 + var40) / var36;
                      var28 = (-var26 + var39) / var36;
                      var20 = (var37 - var18) / var36;
                      var27 = (var39 - var25) / var36;
                      var19 = (-var17_int + var37) / var36;
                      var23 = (var38 - var21) / var36;
                      break L3;
                    } else {
                      var28 = 0;
                      var19 = 0;
                      var23 = 0;
                      var24 = 0;
                      var20 = 0;
                      var27 = 0;
                      var32 = 0;
                      var31 = 0;
                      break L3;
                    }
                  } else {
                    L11: {
                      if (~param15 == ~param11) {
                        var20 = 0;
                        var28 = 0;
                        var25 = param1;
                        var19 = 0;
                        var23 = 0;
                        var31 = 0;
                        var29 = param4;
                        var32 = 0;
                        var22 = param6;
                        var26 = param7;
                        var18 = param12 << 16;
                        var21 = param8;
                        var30 = param2;
                        var24 = 0;
                        var27 = 0;
                        var17_int = param14 << 16;
                        break L11;
                      } else {
                        var35 = param11 - param10;
                        if (~param12 >= ~param14) {
                          var27 = (param5 - param7 << 16) / var35;
                          var20 = (-param14 + param9 << 16) / var34;
                          var24 = (-param8 + param16 << 16) / var34;
                          var17_int = param12 << 16;
                          var28 = (param5 + -param1 << 16) / var34;
                          var21 = param6 << 16;
                          var31 = (param3 + -param2 << 16) / var35;
                          var25 = param7 << 16;
                          var18 = param14 << 16;
                          var19 = (-param12 + param9 << 16) / var35;
                          var26 = param1 << 16;
                          var29 = param2 << 16;
                          var30 = param4 << 16;
                          var22 = param8 << 16;
                          var32 = (-param4 + param3 << 16) / var34;
                          var23 = (-param6 + param16 << 16) / var35;
                          break L11;
                        } else {
                          var31 = (-param4 + param3 << 16) / var34;
                          var32 = (-param2 + param3 << 16) / var35;
                          var21 = param8 << 16;
                          var24 = (-param6 + param16 << 16) / var35;
                          var19 = (-param14 + param9 << 16) / var34;
                          var22 = param6 << 16;
                          var17_int = param14 << 16;
                          var26 = param7 << 16;
                          var27 = (param5 + -param1 << 16) / var34;
                          var20 = (-param12 + param9 << 16) / var35;
                          var23 = (-param8 + param16 << 16) / var34;
                          var25 = param1 << 16;
                          var29 = param4 << 16;
                          var30 = param2 << 16;
                          var28 = (param5 + -param7 << 16) / var35;
                          var18 = param12 << 16;
                          break L11;
                        }
                      }
                    }
                    L12: {
                      if (param15 >= 0) {
                        break L12;
                      } else {
                        param15 = Math.min(-param15, param10 + -param15);
                        var29 = var29 + var31 * param15;
                        var26 = var26 + var28 * param15;
                        var22 = var22 + var24 * param15;
                        var21 = var21 + param15 * var23;
                        var18 = var18 + var20 * param15;
                        var30 = var30 + var32 * param15;
                        var25 = var25 + param15 * var27;
                        var17_int = var17_int + param15 * var19;
                        param15 = 0;
                        break L12;
                      }
                    }
                    var33 = 0;
                    break L3;
                  }
                }
                L13: {
                  if (param15 < 0) {
                    param15 = -param15;
                    var18 = var18 + var20 * param15;
                    var17_int = var17_int + param15 * var19;
                    var30 = var30 + param15 * var32;
                    var29 = var29 + param15 * var31;
                    var25 = var25 + param15 * var27;
                    var26 = var26 + param15 * var28;
                    var22 = var22 + var24 * param15;
                    var21 = var21 + var23 * param15;
                    param15 = 0;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                var35 = tm.field_k[param15];
                L14: while (true) {
                  if (param15 >= param11) {
                    return;
                  } else {
                    L15: {
                      var36 = var17_int >> 16;
                      if (var36 < tm.field_l) {
                        var37 = -(var17_int >> 16) + (var18 >> 16);
                        if (var37 != 0) {
                          L16: {
                            var38 = (var22 + -var21) / var37;
                            var39 = (-var25 + var26) / var37;
                            var40 = (var30 + -var29) / var37;
                            if (var37 + var36 >= tm.field_l) {
                              var37 = -var36 + (tm.field_l + -1);
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          if (var36 >= 0) {
                            jn.a(var29, var21, var38, 33423424, var35 + var36, var37, var25, param0, var39, var40);
                            break L15;
                          } else {
                            jn.a(-(var36 * var40) + var29, -(var36 * var38) + var21, var38, 33423424, var35, var36 + var37, var25 + -(var36 * var39), param0, var39, var40);
                            break L15;
                          }
                        } else {
                          if (var36 < 0) {
                            break L15;
                          } else {
                            if (~var36 <= ~tm.field_l) {
                              break L15;
                            } else {
                              jn.a(var29, var21, 0, 33423424, var35 + var36, var37, var25, param0, 0, 0);
                              break L15;
                            }
                          }
                        }
                      } else {
                        break L15;
                      }
                    }
                    param15++;
                    if (param15 >= tm.field_q) {
                      return;
                    } else {
                      var35 = var35 + qn.field_l;
                      var29 = var29 + var31;
                      var26 = var26 + var28;
                      var21 = var21 + var23;
                      var22 = var22 + var24;
                      var18 = var18 + var20;
                      var17_int = var17_int + var19;
                      var25 = var25 + var27;
                      var30 = var30 + var32;
                      continue L14;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "<%0> has withdrawn a draw offer";
        field_D = false;
    }
}
