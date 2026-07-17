/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc extends ch implements om, vo {
    static oe field_M;
    private dm field_O;
    static int field_J;
    static lo[][] field_L;
    private db field_N;
    private qm field_K;

    final boolean a(int param0, int param1, ng param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        boolean stackOut_9_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              if (param0 == 98) {
                stackOut_5_0 = ((hc) this).a(0, param2);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                if (param0 == 99) {
                  stackOut_9_0 = ((hc) this).b(10, param2);
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  return false;
                }
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("hc.G(").append(param0).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param3 + 41);
        }
        return stackIn_10_0;
    }

    private final String a(int param0) {
        return "</col></u>";
    }

    public static void a() {
        field_M = null;
        field_L = null;
    }

    public final void a(qm param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == ((hc) this).field_K) {
                th.a(8191);
                ((hc) this).field_O.p(-128);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param2 == 11) {
                break L2;
              } else {
                field_L = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var6;
            stackOut_6_1 = new StringBuilder().append("hc.Q(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public final void a(int param0, int param1, int param2, db param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == -8894) {
                break L1;
              } else {
                var7 = null;
                ((hc) this).a(87, -45, 104, (db) null);
                break L1;
              }
            }
            L2: {
              if (param0 != 0) {
                if (param0 != 1) {
                  if (2 != param0) {
                    break L2;
                  } else {
                    jc.a("conduct.ws", -33);
                    break L2;
                  }
                } else {
                  jc.a("privacy.ws", -120);
                  break L2;
                }
              } else {
                jc.a("terms.ws", 113);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("hc.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    private final String e() {
        return "<u=2164A2><col=2164A2>";
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int[] param11, int param12, int param13, int param14, int param15, int param16) {
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
        Object var43 = null;
        L0: {
          var42 = Pixelate.field_H ? 1 : 0;
          if (param1 < 0) {
            break L0;
          } else {
            if (param10 < ja.field_e) {
              L1: {
                if (param2 >= 0) {
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
                if (param2 < ja.field_d) {
                  break L2;
                } else {
                  if (ja.field_d > param14) {
                    break L2;
                  } else {
                    if (param12 >= ja.field_d) {
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L3: {
                if (param4 == -94333456) {
                  break L3;
                } else {
                  var43 = null;
                  hc.a(80, -41, -34, 88, 46, 16, 32, -5, -28, 26, -84, (int[]) null, -10, 45, -83, 113, 56);
                  break L3;
                }
              }
              L4: {
                var34 = -param10 + param1;
                if (param13 != param10) {
                  L5: {
                    var26 = param5 << 16;
                    var25 = param5 << 16;
                    var18 = param2 << 16;
                    var17_int = param2 << 16;
                    var22 = param15 << 16;
                    var21 = param15 << 16;
                    var30 = param9 << 16;
                    var29 = param9 << 16;
                    var35 = -param10 + param13;
                    var20 = (param12 + -param2 << 16) / var34;
                    var19 = (-param2 + param14 << 16) / var35;
                    if (var20 > var19) {
                      var31 = (param8 - param9 << 16) / var35;
                      var32 = (-param9 + param0 << 16) / var34;
                      var28 = (param7 + -param5 << 16) / var34;
                      var27 = (param6 + -param5 << 16) / var35;
                      var23 = (-param15 + param3 << 16) / var35;
                      var33 = 0;
                      var24 = (param16 + -param15 << 16) / var34;
                      break L5;
                    } else {
                      var32 = (param8 + -param9 << 16) / var35;
                      var36 = var19;
                      var19 = var20;
                      var20 = var36;
                      var27 = (param7 - param5 << 16) / var34;
                      var28 = (param6 + -param5 << 16) / var35;
                      var31 = (param0 - param9 << 16) / var34;
                      var33 = 1;
                      var23 = (param16 - param15 << 16) / var34;
                      var24 = (-param15 + param3 << 16) / var35;
                      break L5;
                    }
                  }
                  L6: {
                    L7: {
                      if (0 <= param10) {
                        break L7;
                      } else {
                        if (param13 < 0) {
                          param10 = -param10 + param13;
                          var29 = var29 + param10 * var31;
                          var26 = var26 + var28 * param10;
                          var17_int = var17_int + param10 * var19;
                          var18 = var18 + var20 * param10;
                          var30 = var30 + param10 * var32;
                          var21 = var21 + var23 * param10;
                          var22 = var22 + param10 * var24;
                          var25 = var25 + var27 * param10;
                          param10 = param13;
                          break L6;
                        } else {
                          param10 = -param10;
                          var26 = var26 + var28 * param10;
                          var30 = var30 + param10 * var32;
                          var18 = var18 + param10 * var20;
                          var21 = var21 + var23 * param10;
                          var22 = var22 + param10 * var24;
                          var25 = var25 + param10 * var27;
                          var29 = var29 + param10 * var31;
                          var17_int = var17_int + param10 * var19;
                          param10 = 0;
                          break L7;
                        }
                      }
                    }
                    var36 = ja.field_g[param10];
                    L8: while (true) {
                      if (param13 <= param10) {
                        break L6;
                      } else {
                        L9: {
                          var37 = var17_int >> 16;
                          if (var37 >= ja.field_d) {
                            break L9;
                          } else {
                            var38 = (var18 >> 16) - (var17_int >> 16);
                            if (0 != var38) {
                              L10: {
                                var39 = (-var21 + var22) / var38;
                                var40 = (var26 + -var25) / var38;
                                var41 = (-var29 + var30) / var38;
                                if (var38 + var37 < ja.field_d) {
                                  break L10;
                                } else {
                                  var38 = -var37 + (ja.field_d - 1);
                                  break L10;
                                }
                              }
                              if (var37 < 0) {
                                rd.a(var37 + var38, var36, (byte) -105, param11, -(var40 * var37) + var25, var39, var41, var29 + -(var37 * var41), -(var37 * var39) + var21, var40);
                                break L9;
                              } else {
                                rd.a(var38, var37 - -var36, (byte) -108, param11, var25, var39, var41, var29, var21, var40);
                                break L9;
                              }
                            } else {
                              if (var37 < 0) {
                                break L9;
                              } else {
                                if (ja.field_d > var37) {
                                  rd.a(var38, var37 + var36, (byte) -104, param11, var25, 0, 0, var29, var21, 0);
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                        param10++;
                        if (param10 >= ja.field_e) {
                          return;
                        } else {
                          var18 = var18 + var20;
                          var29 = var29 + var31;
                          var21 = var21 + var23;
                          var25 = var25 + var27;
                          var22 = var22 + var24;
                          var26 = var26 + var28;
                          var17_int = var17_int + var19;
                          var30 = var30 + var32;
                          var36 = var36 + t.field_j;
                          continue L8;
                        }
                      }
                    }
                  }
                  var36 = param1 + -param13;
                  if (var36 == 0) {
                    var27 = 0;
                    var23 = 0;
                    var32 = 0;
                    var20 = 0;
                    var31 = 0;
                    var24 = 0;
                    var28 = 0;
                    var19 = 0;
                    break L4;
                  } else {
                    L11: {
                      var37 = param12 << 16;
                      var38 = param16 << 16;
                      var39 = param7 << 16;
                      if (var33 == 0) {
                        var25 = param6 << 16;
                        var17_int = param14 << 16;
                        var29 = param8 << 16;
                        var21 = param3 << 16;
                        break L11;
                      } else {
                        var30 = param8 << 16;
                        var26 = param6 << 16;
                        var18 = param14 << 16;
                        var22 = param3 << 16;
                        break L11;
                      }
                    }
                    var40 = param0 << 16;
                    var27 = (var39 + -var25) / var36;
                    var24 = (-var22 + var38) / var36;
                    var20 = (var37 - var18) / var36;
                    var19 = (-var17_int + var37) / var36;
                    var23 = (var38 + -var21) / var36;
                    var28 = (-var26 + var39) / var36;
                    var31 = (-var29 + var40) / var36;
                    var32 = (-var30 + var40) / var36;
                    break L4;
                  }
                } else {
                  L12: {
                    if (param1 != param10) {
                      var35 = param1 - param13;
                      if (param2 < param14) {
                        var23 = (param16 + -param15 << 16) / var34;
                        var28 = (param7 - param6 << 16) / var35;
                        var26 = param6 << 16;
                        var25 = param5 << 16;
                        var32 = (param0 - param8 << 16) / var35;
                        var22 = param3 << 16;
                        var29 = param9 << 16;
                        var27 = (-param5 + param7 << 16) / var34;
                        var31 = (param0 - param9 << 16) / var34;
                        var24 = (param16 + -param3 << 16) / var35;
                        var30 = param8 << 16;
                        var19 = (param12 + -param2 << 16) / var34;
                        var18 = param14 << 16;
                        var21 = param15 << 16;
                        var20 = (-param14 + param12 << 16) / var35;
                        var17_int = param2 << 16;
                        break L12;
                      } else {
                        var19 = (param12 - param14 << 16) / var35;
                        var23 = (-param3 + param16 << 16) / var35;
                        var17_int = param14 << 16;
                        var32 = (param0 - param9 << 16) / var34;
                        var28 = (-param5 + param7 << 16) / var34;
                        var22 = param15 << 16;
                        var21 = param3 << 16;
                        var18 = param2 << 16;
                        var27 = (param7 + -param6 << 16) / var35;
                        var24 = (param16 + -param15 << 16) / var34;
                        var26 = param5 << 16;
                        var20 = (-param2 + param12 << 16) / var34;
                        var30 = param9 << 16;
                        var29 = param8 << 16;
                        var31 = (-param8 + param0 << 16) / var35;
                        var25 = param6 << 16;
                        break L12;
                      }
                    } else {
                      var19 = 0;
                      var24 = 0;
                      var26 = param6;
                      var32 = 0;
                      var17_int = param2 << 16;
                      var30 = param8;
                      var25 = param5;
                      var31 = 0;
                      var23 = 0;
                      var27 = 0;
                      var22 = param3;
                      var21 = param15;
                      var18 = param14 << 16;
                      var28 = 0;
                      var29 = param9;
                      var20 = 0;
                      break L12;
                    }
                  }
                  L13: {
                    if (param10 < 0) {
                      param10 = Math.min(-param10, -param10 + param13);
                      var21 = var21 + param10 * var23;
                      var30 = var30 + var32 * param10;
                      var25 = var25 + param10 * var27;
                      var18 = var18 + param10 * var20;
                      var29 = var29 + var31 * param10;
                      var22 = var22 + var24 * param10;
                      var26 = var26 + var28 * param10;
                      var17_int = var17_int + param10 * var19;
                      param10 = 0;
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
                if (param10 < 0) {
                  param10 = -param10;
                  var22 = var22 + param10 * var24;
                  var29 = var29 + param10 * var31;
                  var25 = var25 + var27 * param10;
                  var30 = var30 + param10 * var32;
                  var26 = var26 + param10 * var28;
                  var17_int = var17_int + param10 * var19;
                  var21 = var21 + param10 * var23;
                  var18 = var18 + var20 * param10;
                  param10 = 0;
                  break L14;
                } else {
                  break L14;
                }
              }
              var35 = ja.field_g[param10];
              L15: while (true) {
                if (param1 <= param10) {
                  return;
                } else {
                  L16: {
                    var36 = var17_int >> 16;
                    if (ja.field_d <= var36) {
                      break L16;
                    } else {
                      var37 = (var18 >> 16) - (var17_int >> 16);
                      if (0 == var37) {
                        if (var36 < 0) {
                          break L16;
                        } else {
                          if (var36 < ja.field_d) {
                            rd.a(var37, var36 + var35, (byte) -114, param11, var25, 0, 0, var29, var21, 0);
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                      } else {
                        L17: {
                          var38 = (var22 - var21) / var37;
                          var39 = (var26 + -var25) / var37;
                          var40 = (-var29 + var30) / var37;
                          if (ja.field_d > var36 + var37) {
                            break L17;
                          } else {
                            var37 = -var36 + (ja.field_d + -1);
                            break L17;
                          }
                        }
                        if (var36 >= 0) {
                          rd.a(var37, var36 - -var35, (byte) -108, param11, var25, var38, var40, var29, var21, var39);
                          break L16;
                        } else {
                          rd.a(var36 + var37, var35, (byte) -118, param11, var25 - var36 * var39, var38, var40, -(var36 * var40) + var29, -(var38 * var36) + var21, var39);
                          break L16;
                        }
                      }
                    }
                  }
                  param10++;
                  if (ja.field_e > param10) {
                    var18 = var18 + var20;
                    var29 = var29 + var31;
                    var30 = var30 + var32;
                    var17_int = var17_int + var19;
                    var35 = var35 + t.field_j;
                    var25 = var25 + var27;
                    var26 = var26 + var28;
                    var22 = var22 + var24;
                    var21 = var21 + var23;
                    continue L15;
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

    hc(dm param0) {
        super(0, 0, 288, 0, (eb) null);
        RuntimeException var2 = null;
        int var3 = 0;
        uc var4 = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
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
            ((hc) this).field_O = param0;
            ((hc) this).field_K = new qm(vi.field_J, (fn) null);
            ((hc) this).field_K.field_y = (eb) (Object) new ad();
            int discarded$1 = 62;
            var7 = sd.a(sl.field_e, 102, new String[2]);
            var3 = 20;
            var4 = new uc(he.field_d, 0, 0, 0, 0, 16777215, -1, 3, 0, he.field_d.field_w, -1, 2147483647, true);
            ((hc) this).field_N = new db(var7, (eb) (Object) var4);
            ((hc) this).field_N.field_l = "";
            ((hc) this).field_N.a(fa.field_g, 0, 0);
            ((hc) this).field_N.a(fa.field_g, 0, 1);
            ((hc) this).field_N.field_n = (fn) this;
            ((hc) this).field_N.field_E = ((hc) this).field_E - 40;
            ((hc) this).field_N.a(26, ((hc) this).field_E - 40, var3, -118);
            var3 = var3 + (15 + ((hc) this).field_N.field_C);
            ((hc) this).b((ng) (Object) ((hc) this).field_N, 80);
            var5 = 4;
            var6 = 200;
            ((hc) this).field_K.a(var6, (byte) 105, var3, -var6 + 300 >> 1, 40);
            ((hc) this).field_K.field_n = (fn) this;
            ((hc) this).b((ng) (Object) ((hc) this).field_K, 80);
            ((hc) this).a(300, (byte) 117, 0, 0, var3 + 55 - -var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var2;
            stackOut_3_1 = new StringBuilder().append("hc.<init>(");
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
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    static {
    }
}
