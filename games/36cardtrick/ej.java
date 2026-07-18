/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.awt.Frame;

final class ej extends ta {
    static volatile long field_jb;
    static int field_kb;

    final void c(lk param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              super.c(param0, (byte) 54);
              if (param1 >= 28) {
                break L1;
              } else {
                field_jb = 54L;
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
            stackOut_3_1 = new StringBuilder().append("ej.J(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
    }

    final static int r(int param0) {
        RuntimeException var1 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_68_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_42_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (g.field_A >= 2) {
              L1: {
                if (0 != hf.field_I) {
                  L2: {
                    if (null == lb.field_a) {
                      break L2;
                    } else {
                      if (lb.field_a.b(4)) {
                        if (lb.field_a.c(0, "")) {
                          if (!lb.field_a.b(4, "")) {
                            stackOut_42_0 = 29;
                            stackIn_43_0 = stackOut_42_0;
                            return stackIn_43_0;
                          } else {
                            break L2;
                          }
                        } else {
                          stackOut_37_0 = 29;
                          stackIn_38_0 = stackOut_37_0;
                          return stackIn_38_0;
                        }
                      } else {
                        stackOut_34_0 = 14;
                        stackIn_35_0 = stackOut_34_0;
                        return stackIn_35_0;
                      }
                    }
                  }
                  if (jk.field_c.b(4)) {
                    if (jk.field_c.b(4, "commonui")) {
                      if (aa.field_db.b(4)) {
                        if (aa.field_db.b(4, "commonui")) {
                          if (!sg.field_a.b(4)) {
                            stackOut_59_0 = 82;
                            stackIn_60_0 = stackOut_59_0;
                            return stackIn_60_0;
                          } else {
                            if (sg.field_a.a((byte) 32)) {
                              break L1;
                            } else {
                              stackOut_62_0 = 86;
                              stackIn_63_0 = stackOut_62_0;
                              return stackIn_63_0;
                            }
                          }
                        } else {
                          stackOut_54_0 = 80;
                          stackIn_55_0 = stackOut_54_0;
                          return stackIn_55_0;
                        }
                      } else {
                        stackOut_51_0 = 71;
                        stackIn_52_0 = stackOut_51_0;
                        return stackIn_52_0;
                      }
                    } else {
                      stackOut_48_0 = 57;
                      stackIn_49_0 = stackOut_48_0;
                      return stackIn_49_0;
                    }
                  } else {
                    stackOut_45_0 = 43;
                    stackIn_46_0 = stackOut_45_0;
                    return stackIn_46_0;
                  }
                } else {
                  if (jk.field_c.b(4)) {
                    if (!jk.field_c.b(4, "commonui")) {
                      stackOut_12_0 = 40;
                      stackIn_13_0 = stackOut_12_0;
                      return stackIn_13_0;
                    } else {
                      if (aa.field_db.b(param0 ^ -6549)) {
                        if (!aa.field_db.b(4, "commonui")) {
                          stackOut_20_0 = 60;
                          stackIn_21_0 = stackOut_20_0;
                          return stackIn_21_0;
                        } else {
                          if (sg.field_a.b(4)) {
                            if (!sg.field_a.a((byte) 109)) {
                              stackOut_28_0 = 80;
                              stackIn_29_0 = stackOut_28_0;
                              return stackIn_29_0;
                            } else {
                              break L1;
                            }
                          } else {
                            stackOut_23_0 = 70;
                            stackIn_24_0 = stackOut_23_0;
                            return stackIn_24_0;
                          }
                        }
                      } else {
                        stackOut_15_0 = 50;
                        stackIn_16_0 = stackOut_15_0;
                        return stackIn_16_0;
                      }
                    }
                  } else {
                    stackOut_7_0 = 20;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0;
                  }
                }
              }
              if (param0 == -6545) {
                stackOut_67_0 = 100;
                stackIn_68_0 = stackOut_67_0;
                break L0;
              } else {
                stackOut_65_0 = 97;
                stackIn_66_0 = stackOut_65_0;
                return stackIn_66_0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1, "ej.I(" + param0 + ')');
        }
        return stackIn_68_0;
    }

    ej(j param0, lk param1) {
        super(param0, param1, 33, 20, 30);
    }

    final static java.awt.Frame a(int param0, int param1, le param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        md[] var6_array = null;
        vi var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_17_0 = 0;
        int stackIn_38_0 = 0;
        Object stackIn_40_0 = null;
        Object stackIn_48_0 = null;
        Object stackIn_53_0 = null;
        java.awt.Frame stackIn_58_0 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_16_0 = 0;
        int stackOut_37_0 = 0;
        Object stackOut_39_0 = null;
        Object stackOut_47_0 = null;
        Object stackOut_52_0 = null;
        java.awt.Frame stackOut_57_0 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        var9 = Main.field_T;
        try {
          L0: {
            if (!param2.b((byte) -124)) {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (java.awt.Frame) (Object) stackIn_5_0;
            } else {
              L1: {
                if (0 == param4) {
                  var6_array = gf.a(-2, param2);
                  if (null == var6_array) {
                    stackOut_12_0 = null;
                    stackIn_13_0 = stackOut_12_0;
                    return (java.awt.Frame) (Object) stackIn_13_0;
                  } else {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      L3: {
                        L4: {
                          if (var8 >= var6_array.length) {
                            break L4;
                          } else {
                            stackOut_16_0 = ~var6_array[var8].field_b;
                            stackIn_38_0 = stackOut_16_0;
                            stackIn_17_0 = stackOut_16_0;
                            if (var9 != 0) {
                              break L3;
                            } else {
                              L5: {
                                if (stackIn_17_0 != ~param3) {
                                  break L5;
                                } else {
                                  if (~param5 != ~var6_array[var8].field_a) {
                                    break L5;
                                  } else {
                                    L6: {
                                      if (param0 == 0) {
                                        break L6;
                                      } else {
                                        if (param0 != var6_array[var8].field_c) {
                                          break L5;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                    L7: {
                                      if (var7_int == 0) {
                                        break L7;
                                      } else {
                                        if (~var6_array[var8].field_d >= ~param4) {
                                          break L5;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    var7_int = 1;
                                    param4 = var6_array[var8].field_d;
                                    break L5;
                                  }
                                }
                              }
                              var8++;
                              if (var9 == 0) {
                                continue L2;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        stackOut_37_0 = var7_int;
                        stackIn_38_0 = stackOut_37_0;
                        break L3;
                      }
                      if (stackIn_38_0 != 0) {
                        break L1;
                      } else {
                        stackOut_39_0 = null;
                        stackIn_40_0 = stackOut_39_0;
                        return (java.awt.Frame) (Object) stackIn_40_0;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
              var6_ref = param2.a(param4, param5, param0, (byte) -30, param3);
              L8: while (true) {
                L9: {
                  if (var6_ref.field_a != 0) {
                    break L9;
                  } else {
                    wk.a((byte) -121, 10L);
                    if (var9 == 0) {
                      continue L8;
                    } else {
                      break L9;
                    }
                  }
                }
                var7 = (java.awt.Frame) var6_ref.field_e;
                if (null == var7) {
                  stackOut_47_0 = null;
                  stackIn_48_0 = stackOut_47_0;
                  return (java.awt.Frame) (Object) stackIn_48_0;
                } else {
                  if (var6_ref.field_a == 2) {
                    rl.a(false, param2, var7);
                    stackOut_52_0 = null;
                    stackIn_53_0 = stackOut_52_0;
                    return (java.awt.Frame) (Object) stackIn_53_0;
                  } else {
                    L10: {
                      if (param1 == -3428) {
                        break L10;
                      } else {
                        field_kb = -115;
                        break L10;
                      }
                    }
                    stackOut_57_0 = (java.awt.Frame) var7;
                    stackIn_58_0 = stackOut_57_0;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6 = decompiledCaughtException;
            stackOut_59_0 = (RuntimeException) var6;
            stackOut_59_1 = new StringBuilder().append("ej.EB(").append(param0).append(',').append(param1).append(',');
            stackIn_62_0 = stackOut_59_0;
            stackIn_62_1 = stackOut_59_1;
            stackIn_60_0 = stackOut_59_0;
            stackIn_60_1 = stackOut_59_1;
            if (param2 == null) {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L11;
            } else {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "{...}";
              stackIn_63_0 = stackOut_60_0;
              stackIn_63_1 = stackOut_60_1;
              stackIn_63_2 = stackOut_60_2;
              break L11;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_58_0;
    }

    final static void a(byte param0, String param1, String param2, boolean param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              ng.field_y = param1;
              ja.field_a = param2;
              ca.a(kj.field_q, param3, 16777215);
              if (param0 <= -112) {
                break L1;
              } else {
                ej.a((byte) -128, (String) null, (String) null, false);
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
            stackOut_3_1 = new StringBuilder().append("ej.DB(").append(param0).append(',');
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L3;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param3 + ')');
        }
    }

    final static void a(boolean param0, byte param1, boolean param2) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 55) {
              L1: {
                L2: {
                  if (param0) {
                    break L2;
                  } else {
                    vj.d();
                    if (Main.field_T == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                vj.a(0, 0, vj.field_l, vj.field_g, 0, 192);
                break L1;
              }
              ga.a(param0, param1 + 62);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var3, "ej.FB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_jb = 0L;
    }
}
