/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg {
    static fh field_b;
    static boolean field_a;

    final static void a(int param0, bd[] param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var10 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (0 >= param2) {
                  break L1;
                } else {
                  L2: {
                    if (param0 > 91) {
                      break L2;
                    } else {
                      field_a = true;
                      break L2;
                    }
                  }
                  var5_int = param1[0].field_u;
                  var6 = param1[2].field_u;
                  var7 = param1[1].field_u;
                  param1[0].e(param4, param3);
                  param1[2].e(param2 + param4 - var6, param3);
                  si.b(ia.field_i);
                  si.f(param4 + var5_int, param3, param4 - (-param2 + var6), param1[1].field_r + param3);
                  var8 = param4 - -var5_int;
                  var9 = param4 + param2 + -var6;
                  param4 = var8;
                  L3: while (true) {
                    if (param4 >= var9) {
                      si.a(ia.field_i);
                      break L0;
                    } else {
                      param1[1].e(param4, param3);
                      param4 = param4 + var7;
                      continue L3;
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("tg.C(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static void b(int param0) {
        cl var1 = (cl) (Object) ne.field_q.g(-64);
        if (!(var1 != null)) {
            le.c((byte) 113);
            return;
        }
        en var2 = sc.field_g;
        int discarded$0 = var2.d(8195);
        int discarded$1 = var2.d(8195);
        int discarded$2 = var2.d(8195);
        int discarded$3 = var2.d(8195);
        var1.b(-96);
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
        L0: {
          var42 = HostileSpawn.field_I ? 1 : 0;
          if (param16 < 0) {
            break L0;
          } else {
            if (param8 < ge.field_f) {
              L1: {
                if (0 <= param15) {
                  break L1;
                } else {
                  if (param6 >= 0) {
                    break L1;
                  } else {
                    if (0 > param5) {
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (param15 < ge.field_h) {
                  break L2;
                } else {
                  if (param6 < ge.field_h) {
                    break L2;
                  } else {
                    if (ge.field_h > param5) {
                      break L2;
                    } else {
                      return;
                    }
                  }
                }
              }
              if (param10 == 1299210768) {
                L3: {
                  var34 = param16 + -param8;
                  if (param4 == param8) {
                    L4: {
                      if (param8 == param16) {
                        var23 = 0;
                        var24 = 0;
                        var31 = 0;
                        var26 = param12;
                        var30 = param7;
                        var19 = 0;
                        var28 = 0;
                        var22 = param9;
                        var20 = 0;
                        var18 = param6 << 16;
                        var21 = param3;
                        var32 = 0;
                        var17_int = param15 << 16;
                        var29 = param1;
                        var25 = param2;
                        var27 = 0;
                        break L4;
                      } else {
                        var35 = param16 - param4;
                        if (param15 < param6) {
                          var18 = param6 << 16;
                          var30 = param7 << 16;
                          var32 = (param0 - param7 << 16) / var35;
                          var26 = param12 << 16;
                          var24 = (-param9 + param14 << 16) / var35;
                          var25 = param2 << 16;
                          var31 = (param0 + -param1 << 16) / var34;
                          var22 = param9 << 16;
                          var20 = (-param6 + param5 << 16) / var35;
                          var23 = (param14 - param3 << 16) / var34;
                          var29 = param1 << 16;
                          var17_int = param15 << 16;
                          var28 = (-param12 + param13 << 16) / var35;
                          var27 = (-param2 + param13 << 16) / var34;
                          var19 = (param5 + -param15 << 16) / var34;
                          var21 = param3 << 16;
                          break L4;
                        } else {
                          var25 = param12 << 16;
                          var21 = param9 << 16;
                          var32 = (-param1 + param0 << 16) / var34;
                          var29 = param7 << 16;
                          var19 = (-param6 + param5 << 16) / var35;
                          var31 = (-param7 + param0 << 16) / var35;
                          var28 = (param13 + -param2 << 16) / var34;
                          var18 = param15 << 16;
                          var17_int = param6 << 16;
                          var26 = param2 << 16;
                          var22 = param3 << 16;
                          var24 = (param14 + -param3 << 16) / var34;
                          var20 = (param5 + -param15 << 16) / var34;
                          var27 = (param13 + -param12 << 16) / var35;
                          var23 = (-param9 + param14 << 16) / var35;
                          var30 = param1 << 16;
                          break L4;
                        }
                      }
                    }
                    var33 = 0;
                    if (param8 >= 0) {
                      break L3;
                    } else {
                      param8 = Math.min(-param8, -param8 + param4);
                      var18 = var18 + var20 * param8;
                      var26 = var26 + param8 * var28;
                      var29 = var29 + param8 * var31;
                      var22 = var22 + var24 * param8;
                      var21 = var21 + param8 * var23;
                      var30 = var30 + param8 * var32;
                      var25 = var25 + var27 * param8;
                      var17_int = var17_int + var19 * param8;
                      param8 = 0;
                      break L3;
                    }
                  } else {
                    L5: {
                      var18 = param15 << 16;
                      var17_int = param15 << 16;
                      var22 = param3 << 16;
                      var21 = param3 << 16;
                      var30 = param1 << 16;
                      var29 = param1 << 16;
                      var26 = param2 << 16;
                      var25 = param2 << 16;
                      var35 = param4 + -param8;
                      var19 = (-param15 + param6 << 16) / var35;
                      var20 = (param5 - param15 << 16) / var34;
                      if (var20 <= var19) {
                        var36 = var19;
                        var19 = var20;
                        var20 = var36;
                        var27 = (-param2 + param13 << 16) / var34;
                        var31 = (-param1 + param0 << 16) / var34;
                        var32 = (-param1 + param7 << 16) / var35;
                        var28 = (-param2 + param12 << 16) / var35;
                        var23 = (-param3 + param14 << 16) / var34;
                        var33 = 1;
                        var24 = (-param3 + param9 << 16) / var35;
                        break L5;
                      } else {
                        var24 = (-param3 + param14 << 16) / var34;
                        var32 = (-param1 + param0 << 16) / var34;
                        var28 = (-param2 + param13 << 16) / var34;
                        var27 = (-param2 + param12 << 16) / var35;
                        var31 = (-param1 + param7 << 16) / var35;
                        var23 = (param9 + -param3 << 16) / var35;
                        var33 = 0;
                        break L5;
                      }
                    }
                    L6: {
                      L7: {
                        if (param8 < 0) {
                          if (0 > param4) {
                            param8 = param4 - param8;
                            var29 = var29 + param8 * var31;
                            var25 = var25 + var27 * param8;
                            var26 = var26 + param8 * var28;
                            var22 = var22 + var24 * param8;
                            var21 = var21 + param8 * var23;
                            var17_int = var17_int + var19 * param8;
                            var30 = var30 + var32 * param8;
                            var18 = var18 + param8 * var20;
                            param8 = param4;
                            break L6;
                          } else {
                            param8 = -param8;
                            var26 = var26 + param8 * var28;
                            var18 = var18 + param8 * var20;
                            var22 = var22 + param8 * var24;
                            var29 = var29 + param8 * var31;
                            var30 = var30 + param8 * var32;
                            var25 = var25 + param8 * var27;
                            var17_int = var17_int + param8 * var19;
                            var21 = var21 + param8 * var23;
                            param8 = 0;
                            break L7;
                          }
                        } else {
                          break L7;
                        }
                      }
                      var36 = ge.field_e[param8];
                      L8: while (true) {
                        if (param8 >= param4) {
                          break L6;
                        } else {
                          L9: {
                            var37 = var17_int >> 16;
                            if (ge.field_h <= var37) {
                              break L9;
                            } else {
                              var38 = (var18 >> 16) + -(var17_int >> 16);
                              if (0 == var38) {
                                if (0 > var37) {
                                  break L9;
                                } else {
                                  if (var37 < ge.field_h) {
                                    sb.a(param11, var21, var36 + var37, var38, var25, 0, 0, 0, var29, (byte) 3);
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                              } else {
                                L10: {
                                  var39 = (var22 + -var21) / var38;
                                  var40 = (-var25 + var26) / var38;
                                  var41 = (-var29 + var30) / var38;
                                  if (var38 + var37 >= ge.field_h) {
                                    var38 = -1 + -var37 + ge.field_h;
                                    break L10;
                                  } else {
                                    break L10;
                                  }
                                }
                                if (0 <= var37) {
                                  sb.a(param11, var21, var36 + var37, var38, var25, var41, var39, var40, var29, (byte) 3);
                                  break L9;
                                } else {
                                  sb.a(param11, var21 + -(var37 * var39), var36, var37 + var38, var25 + -(var40 * var37), var41, var39, var40, var29 + -(var37 * var41), (byte) 3);
                                  break L9;
                                }
                              }
                            }
                          }
                          param8++;
                          if (param8 >= ge.field_f) {
                            return;
                          } else {
                            var18 = var18 + var20;
                            var36 = var36 + si.field_e;
                            var25 = var25 + var27;
                            var29 = var29 + var31;
                            var17_int = var17_int + var19;
                            var21 = var21 + var23;
                            var22 = var22 + var24;
                            var30 = var30 + var32;
                            var26 = var26 + var28;
                            continue L8;
                          }
                        }
                      }
                    }
                    var36 = param16 - param4;
                    if (0 == var36) {
                      var28 = 0;
                      var19 = 0;
                      var20 = 0;
                      var24 = 0;
                      var32 = 0;
                      var31 = 0;
                      var23 = 0;
                      var27 = 0;
                      break L3;
                    } else {
                      L11: {
                        var37 = param5 << 16;
                        var38 = param14 << 16;
                        var39 = param13 << 16;
                        var40 = param0 << 16;
                        if (var33 != 0) {
                          var18 = param6 << 16;
                          var26 = param12 << 16;
                          var22 = param9 << 16;
                          var30 = param7 << 16;
                          break L11;
                        } else {
                          var29 = param7 << 16;
                          var17_int = param6 << 16;
                          var25 = param12 << 16;
                          var21 = param9 << 16;
                          break L11;
                        }
                      }
                      var24 = (-var22 + var38) / var36;
                      var20 = (var37 - var18) / var36;
                      var28 = (-var26 + var39) / var36;
                      var27 = (-var25 + var39) / var36;
                      var31 = (var40 + -var29) / var36;
                      var23 = (-var21 + var38) / var36;
                      var32 = (var40 + -var30) / var36;
                      var19 = (-var17_int + var37) / var36;
                      break L3;
                    }
                  }
                }
                L12: {
                  if (0 > param8) {
                    param8 = -param8;
                    var30 = var30 + param8 * var32;
                    var21 = var21 + var23 * param8;
                    var26 = var26 + var28 * param8;
                    var25 = var25 + param8 * var27;
                    var29 = var29 + param8 * var31;
                    var18 = var18 + param8 * var20;
                    var22 = var22 + param8 * var24;
                    var17_int = var17_int + var19 * param8;
                    param8 = 0;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                var35 = ge.field_e[param8];
                L13: while (true) {
                  if (param8 >= param16) {
                    return;
                  } else {
                    L14: {
                      var36 = var17_int >> 16;
                      if (var36 >= ge.field_h) {
                        break L14;
                      } else {
                        var37 = -(var17_int >> 16) + (var18 >> 16);
                        if (var37 != 0) {
                          L15: {
                            var38 = (var22 + -var21) / var37;
                            var39 = (var26 - var25) / var37;
                            var40 = (-var29 + var30) / var37;
                            if (ge.field_h > var36 + var37) {
                              break L15;
                            } else {
                              var37 = ge.field_h - (var36 - -1);
                              break L15;
                            }
                          }
                          if (var36 < 0) {
                            sb.a(param11, var21 - var36 * var38, var35, var36 + var37, var25 - var39 * var36, var40, var38, var39, var29 + -(var36 * var40), (byte) 3);
                            break L14;
                          } else {
                            sb.a(param11, var21, var35 + var36, var37, var25, var40, var38, var39, var29, (byte) 3);
                            break L14;
                          }
                        } else {
                          if (var36 < 0) {
                            break L14;
                          } else {
                            if (ge.field_h <= var36) {
                              break L14;
                            } else {
                              sb.a(param11, var21, var35 + var36, var37, var25, 0, 0, 0, var29, (byte) 3);
                              break L14;
                            }
                          }
                        }
                      }
                    }
                    param8++;
                    if (ge.field_f <= param8) {
                      return;
                    } else {
                      var22 = var22 + var24;
                      var25 = var25 + var27;
                      var29 = var29 + var31;
                      var18 = var18 + var20;
                      var17_int = var17_int + var19;
                      var30 = var30 + var32;
                      var21 = var21 + var23;
                      var26 = var26 + var28;
                      var35 = var35 + si.field_e;
                      continue L13;
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

    public static void a(int param0) {
        field_b = null;
        int var1 = -104 % ((36 - param0) / 62);
    }

    final static void a(byte param0) {
        tb.f((byte) -85);
        if (null != se.field_h) {
            v.a(67, se.field_h);
        }
        qc.c((byte) -118);
        lj.d((byte) 114);
        md.b(51);
        if (bj.c((byte) -29)) {
            s.field_b.i(19319, 1);
            mb.d(0, -22370);
        }
        le.c((byte) 99);
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var2_int = ln.field_a.field_d;
            if (param1 == 30427) {
              var3 = param0 % var2_int;
              var4 = var3;
              var5 = param0 / var2_int;
              var6 = var5;
              ln.field_a.field_f[param0] = 3;
              var7 = 0;
              L1: while (true) {
                if (var7 != 0) {
                  pc.a(2);
                  break L0;
                } else {
                  var7 = 1;
                  var8 = var3;
                  L2: while (true) {
                    if (var4 < var8) {
                      continue L1;
                    } else {
                      var9 = var5;
                      L3: while (true) {
                        if (var6 < var9) {
                          var8++;
                          continue L2;
                        } else {
                          L4: {
                            if (ln.field_a.field_f[var9 * var2_int + var8] != 3) {
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          var9++;
                          continue L3;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "tg.B(" + param0 + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new fh();
    }
}
