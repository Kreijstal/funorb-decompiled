/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.awt.Frame;
import java.lang.String;

final class ph extends di {
    static int[] field_t;
    private ej field_s;
    private ej field_p;
    static String[] field_n;
    static int field_o;
    static fa field_q;
    static wg field_v;
    static String[] field_r;
    static String field_u;
    static int[] field_m;

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5, int[] param6, int param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        var19 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if (param5 < 0) {
                break L1;
              } else {
                if (ob.field_h <= param0) {
                  break L1;
                } else {
                  L2: {
                    if (0 <= param2) {
                      break L2;
                    } else {
                      if (0 <= param7) {
                        break L2;
                      } else {
                        if (param8 >= 0) {
                          break L2;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  L3: {
                    if (param2 < ob.field_i) {
                      break L3;
                    } else {
                      if (ob.field_i > param7) {
                        break L3;
                      } else {
                        if (ob.field_i > param8) {
                          break L3;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  L4: {
                    var14 = param5 - param0;
                    if (~param0 == ~param1) {
                      L5: {
                        if (param0 != param5) {
                          var15 = param5 + -param1;
                          if (~param7 >= ~param2) {
                            var11 = (param8 + -param7 << 16) / var15;
                            var10 = param2 << 16;
                            var9_int = param7 << 16;
                            var12 = (-param2 + param8 << 16) / var14;
                            break L5;
                          } else {
                            var9_int = param2 << 16;
                            var12 = (-param7 + param8 << 16) / var15;
                            var10 = param7 << 16;
                            var11 = (param8 + -param2 << 16) / var14;
                            break L5;
                          }
                        } else {
                          var12 = 0;
                          var11 = 0;
                          var9_int = param2 << 16;
                          var10 = param7 << 16;
                          break L5;
                        }
                      }
                      var13 = 0;
                      if (param0 >= 0) {
                        break L4;
                      } else {
                        param0 = Math.min(-param0, param1 + -param0);
                        var10 = var10 + var12 * param0;
                        var9_int = var9_int + var11 * param0;
                        param0 = 0;
                        break L4;
                      }
                    } else {
                      L6: {
                        var10 = param2 << 16;
                        var9_int = param2 << 16;
                        var15 = -param0 + param1;
                        var11 = (-param2 + param7 << 16) / var15;
                        var12 = (-param2 + param8 << 16) / var14;
                        if (var11 >= var12) {
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
                          var13 = 1;
                          break L6;
                        } else {
                          var13 = 0;
                          break L6;
                        }
                      }
                      L7: {
                        L8: {
                          if (param0 < 0) {
                            if (param1 >= 0) {
                              param0 = -param0;
                              var9_int = var9_int + var11 * param0;
                              var10 = var10 + var12 * param0;
                              param0 = 0;
                              break L8;
                            } else {
                              param0 = -param0 + param1;
                              var10 = var10 + param0 * var12;
                              var9_int = var9_int + var11 * param0;
                              param0 = param1;
                              break L7;
                            }
                          } else {
                            break L8;
                          }
                        }
                        var16 = ob.field_d[param0];
                        L9: while (true) {
                          if (param1 <= param0) {
                            break L7;
                          } else {
                            L10: {
                              var17 = var9_int >> 16;
                              if (~var17 > ~ob.field_i) {
                                var18 = (var10 >> 16) + -(var9_int >> 16);
                                if (var18 == 0) {
                                  if (var17 < 0) {
                                    break L10;
                                  } else {
                                    if (var17 >= ob.field_i) {
                                      break L10;
                                    } else {
                                      ch.a(var17 + var16, var18, 15169, param6, param4);
                                      break L10;
                                    }
                                  }
                                } else {
                                  L11: {
                                    if (~ob.field_i < ~(var18 + var17)) {
                                      break L11;
                                    } else {
                                      var18 = -var17 + ob.field_i + -1;
                                      break L11;
                                    }
                                  }
                                  if (var17 >= 0) {
                                    ch.a(var16 + var17, var18, 15169, param6, param4);
                                    break L10;
                                  } else {
                                    ch.a(var16, var18 + var17, 15169, param6, param4);
                                    break L10;
                                  }
                                }
                              } else {
                                break L10;
                              }
                            }
                            param0++;
                            if (ob.field_h <= param0) {
                              return;
                            } else {
                              var16 = var16 + l.field_k;
                              var9_int = var9_int + var11;
                              var10 = var10 + var12;
                              continue L9;
                            }
                          }
                        }
                      }
                      var16 = param5 - param1;
                      if (var16 == 0) {
                        var12 = 0;
                        var11 = 0;
                        break L4;
                      } else {
                        L12: {
                          if (var13 != 0) {
                            var10 = param7 << 16;
                            break L12;
                          } else {
                            var9_int = param7 << 16;
                            break L12;
                          }
                        }
                        var17 = param8 << 16;
                        var11 = (-var9_int + var17) / var16;
                        var12 = (-var10 + var17) / var16;
                        break L4;
                      }
                    }
                  }
                  if (param3 <= -109) {
                    L13: {
                      if (0 <= param0) {
                        break L13;
                      } else {
                        param0 = -param0;
                        var10 = var10 + var12 * param0;
                        var9_int = var9_int + var11 * param0;
                        param0 = 0;
                        break L13;
                      }
                    }
                    var15 = ob.field_d[param0];
                    L14: while (true) {
                      if (param0 >= param5) {
                        break L0;
                      } else {
                        L15: {
                          var16 = var9_int >> 16;
                          if (~var16 <= ~ob.field_i) {
                            break L15;
                          } else {
                            var17 = -(var9_int >> 16) + (var10 >> 16);
                            if (0 == var17) {
                              if (var16 < 0) {
                                break L15;
                              } else {
                                if (~var16 > ~ob.field_i) {
                                  ch.a(var16 - -var15, var17, 15169, param6, param4);
                                  break L15;
                                } else {
                                  break L15;
                                }
                              }
                            } else {
                              L16: {
                                if (var16 + var17 < ob.field_i) {
                                  break L16;
                                } else {
                                  var17 = -var16 + (ob.field_i - 1);
                                  break L16;
                                }
                              }
                              if (var16 < 0) {
                                ch.a(var15, var16 + var17, 15169, param6, param4);
                                break L15;
                              } else {
                                ch.a(var15 + var16, var17, 15169, param6, param4);
                                break L15;
                              }
                            }
                          }
                        }
                        param0++;
                        if (~ob.field_h >= ~param0) {
                          return;
                        } else {
                          var15 = var15 + l.field_k;
                          var10 = var10 + var12;
                          var9_int = var9_int + var11;
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
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var9 = decompiledCaughtException;
            stackOut_76_0 = (RuntimeException) var9;
            stackOut_76_1 = new StringBuilder().append("ph.E(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_78_0 = stackOut_76_0;
            stackIn_78_1 = stackOut_76_1;
            stackIn_77_0 = stackOut_76_0;
            stackIn_77_1 = stackOut_76_1;
            if (param6 == null) {
              stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
              stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
              stackOut_78_2 = "null";
              stackIn_79_0 = stackOut_78_0;
              stackIn_79_1 = stackOut_78_1;
              stackIn_79_2 = stackOut_78_2;
              break L17;
            } else {
              stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "{...}";
              stackIn_79_0 = stackOut_77_0;
              stackIn_79_1 = stackOut_77_1;
              stackIn_79_2 = stackOut_77_2;
              break L17;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_79_0, stackIn_79_2 + 44 + param7 + 44 + param8 + 41);
        }
    }

    ph(ej param0, ej param1, ej param2) {
        super(param0);
        try {
            ((ph) this).field_s = param2;
            ((ph) this).field_p = param1;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "ph.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static java.awt.Frame a(he param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        ef[] var6_array = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        ef[] var10 = null;
        mf var11 = null;
        Object stackIn_16_0 = null;
        Object stackIn_25_0 = null;
        java.awt.Frame stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_15_0 = null;
        java.awt.Frame stackOut_26_0 = null;
        Object stackOut_24_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var9 = Terraphoenix.field_V;
        try {
          L0: {
            if (param0.b(2)) {
              L1: {
                if (0 == param5) {
                  int discarded$1 = 5;
                  var10 = of.a(param0);
                  var6_array = var10;
                  if (var6_array != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var8 >= var10.length) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          stackOut_15_0 = null;
                          stackIn_16_0 = stackOut_15_0;
                          return (java.awt.Frame) (Object) stackIn_16_0;
                        }
                      } else {
                        L3: {
                          if (var10[var8].field_d != param1) {
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        var8++;
                        continue L2;
                      }
                    }
                  } else {
                    return null;
                  }
                } else {
                  break L1;
                }
              }
              var11 = param0.a(param5, 0, true, param1, param3);
              L4: while (true) {
                if (var11.field_d != 0) {
                  var7 = (java.awt.Frame) var11.field_e;
                  if (var7 != null) {
                    if (var11.field_d != 2) {
                      stackOut_26_0 = (java.awt.Frame) var7;
                      stackIn_27_0 = stackOut_26_0;
                      break L0;
                    } else {
                      ck.a(param0, 112, var7);
                      stackOut_24_0 = null;
                      stackIn_25_0 = stackOut_24_0;
                      return (java.awt.Frame) (Object) stackIn_25_0;
                    }
                  } else {
                    return null;
                  }
                } else {
                  gi.a((byte) -63, 10L);
                  continue L4;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var6;
            stackOut_28_1 = new StringBuilder().append("ph.A(");
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L5;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L5;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 44 + param1 + 44 + 0 + 44 + param3 + 44 + 10 + 44 + param5 + 41);
        }
        return stackIn_27_0;
    }

    final im b(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        im stackIn_3_0 = null;
        im stackIn_7_0 = null;
        im stackIn_10_0 = null;
        im stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        im stackOut_2_0 = null;
        im stackOut_6_0 = null;
        im stackOut_11_0 = null;
        im stackOut_9_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            var3 = ((ph) this).field_p.field_o.toLowerCase();
            var4 = param0.toLowerCase();
            if (var4.length() == param1) {
              stackOut_2_0 = qf.field_d;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (!qc.a((byte) 80, var4, var3)) {
                stackOut_6_0 = qf.field_d;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                int discarded$2 = -1;
                if (!this.c(param0)) {
                  stackOut_11_0 = dg.field_c;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  stackOut_9_0 = qf.field_d;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("ph.C(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L1;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 41);
        }
        return stackIn_12_0;
    }

    final static void a(int param0, bm param1) {
        try {
            ck.field_a = param1;
            nb.field_e = 12;
            eb.field_D = 12;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "ph.G(" + 12 + 44 + (param1 != null ? "{...}" : "null") + 44 + 12 + 44 + -1 + 41);
        }
    }

    final String a(String param0, int param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        String var7 = null;
        Object stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_16_0 = null;
        String stackIn_21_0 = null;
        String stackIn_25_0 = null;
        String stackIn_29_0 = null;
        String stackIn_31_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_8_0 = null;
        String stackOut_12_0 = null;
        String stackOut_30_0 = null;
        String stackOut_20_0 = null;
        String stackOut_24_0 = null;
        String stackOut_28_0 = null;
        String stackOut_15_0 = null;
        String stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        try {
          L0: {
            var7 = ((ph) this).field_p.field_o.toLowerCase();
            var4 = param0.toLowerCase();
            if (var4.length() != 0) {
              var5 = var4;
              if (!f.a(var5, -51)) {
                int discarded$20 = 1;
                if (am.a(var5)) {
                  stackOut_8_0 = a.field_a;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                } else {
                  if (ef.a((byte) -102, var5)) {
                    stackOut_12_0 = ak.field_j;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  } else {
                    var6 = -107 / ((param1 - 26) / 56);
                    int discarded$21 = -1;
                    if (!this.c(param0)) {
                      if (var7.length() <= 0) {
                        stackOut_30_0 = nb.field_a;
                        stackIn_31_0 = stackOut_30_0;
                        break L0;
                      } else {
                        int discarded$22 = 0;
                        if (ak.a(var5, var7)) {
                          stackOut_20_0 = jd.field_i;
                          stackIn_21_0 = stackOut_20_0;
                          return stackIn_21_0;
                        } else {
                          if (a.a(var5, -19, var7)) {
                            stackOut_24_0 = tc.field_b;
                            stackIn_25_0 = stackOut_24_0;
                            return stackIn_25_0;
                          } else {
                            if (oh.a((byte) -85, var7, var5)) {
                              stackOut_28_0 = jd.field_i;
                              stackIn_29_0 = stackOut_28_0;
                              return stackIn_29_0;
                            } else {
                              return kh.field_M;
                            }
                          }
                        }
                      }
                    } else {
                      stackOut_15_0 = mj.field_a;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0;
                    }
                  }
                }
              } else {
                stackOut_4_0 = kh.field_M;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var3;
            stackOut_32_1 = new StringBuilder().append("ph.B(");
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param0 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L1;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L1;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + 44 + param1 + 41);
        }
        return stackIn_31_0;
    }

    private final boolean c(String param0) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              var3 = ((ph) this).field_s.field_o.toLowerCase();
              var4 = param0.toLowerCase();
              if (0 >= var3.length()) {
                break L1;
              } else {
                if (var4.length() < -1) {
                  var5 = var3.lastIndexOf("@");
                  if (-1 > var5) {
                    break L1;
                  } else {
                    if (-1 + var3.length() <= var5) {
                      break L1;
                    } else {
                      var6 = var3.substring(0, var5);
                      var7 = var3.substring(var5 - -1);
                      if (var4.indexOf(var6) <= -1) {
                        stackOut_7_0 = 1;
                        stackIn_8_0 = stackOut_7_0;
                        return stackIn_8_0 != 0;
                      } else {
                        L2: {
                          if (-1 <= var4.indexOf(var7)) {
                            stackOut_11_0 = 1;
                            stackIn_12_0 = stackOut_11_0;
                            break L2;
                          } else {
                            stackOut_10_0 = 0;
                            stackIn_12_0 = stackOut_10_0;
                            break L2;
                          }
                        }
                        return stackIn_12_0 != 0;
                      }
                    }
                  }
                } else {
                  return false;
                }
              }
            }
            stackOut_13_0 = 0;
            stackIn_14_0 = stackOut_13_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3_ref;
            stackOut_15_1 = new StringBuilder().append("ph.D(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + -1 + 41);
        }
        return stackIn_14_0 != 0;
    }

    public static void g() {
        field_t = null;
        field_u = null;
        field_n = null;
        field_v = null;
        field_m = null;
        field_q = null;
        field_r = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new String[]{"Helepad", "Barracks", "ResearchBase", "FactoryBase", "Hanger", "FuelDump", "UFO-Transport", "UFO-Invader", "UFO-Dominator", "MissileBase", "AB-Entrance", "AB-Corridors", "AB-Room0", "AB-Room1", "AB-Room2", "AB-Room3", "AB-Room4", "AB-CommandCenter", "AB-Hanger", "AB-Reactor", "AB-Maindoor", "AB-Hangerdoor", "AlienFactoryBase", "AlienHanger", "City1", "City2", "City3", "City4", "City5", "City6", "City7", "City8", "Tutorial"};
        field_u = "Move to ground level";
        field_r = new String[]{"Alan", "Alex", "Alexi", "Antony", "Andrew", "Ben", "Bill", "Bob", "Carl", "Charles", "Chris", "Daniel", "David", "Dermot", "Douglas", "Eric", "Fred", "Gary", "Gordon", "Greg", "Gunther", "Henry", "Harry", "Harvey", "Karl", "Ian", "Jack", "James", "Jim", "Jonathan", "John", "Joseph", "Justin", "Johannes", "Lincoln", "Lionel", "Luke", "Marcus", "Mark", "Mason", "Maurice", "Michael", "Mike", "Nathan", "Neil", "Noel", "Nigel", "Oliver", "Peter", "Paul", "Philip", "Ralph", "Raymond", "Richard", "Robert", "Roger", "Rupert", "Sagir", "Sam", "Shaun", "Simon", "Steve", "Stewart", "Thomas", "Tony", "Trevor", "Victor", "Vincent", "William", "Wilson", "Yuan", "Bruce", "Joshua", "Patrick"};
        field_m = new int[8192];
    }
}
