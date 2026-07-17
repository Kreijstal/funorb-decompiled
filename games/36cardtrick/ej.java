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
          throw ma.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
    }

    final static int r() {
        if (g.field_A >= 2) {
          L0: {
            if (0 != hf.field_I) {
              L1: {
                if (null == lb.field_a) {
                  break L1;
                } else {
                  if (lb.field_a.b(4)) {
                    if (lb.field_a.c(0, "")) {
                      if (!lb.field_a.b(4, "")) {
                        return 29;
                      } else {
                        break L1;
                      }
                    } else {
                      return 29;
                    }
                  } else {
                    return 14;
                  }
                }
              }
              if (jk.field_c.b(4)) {
                if (jk.field_c.b(4, "commonui")) {
                  if (aa.field_db.b(4)) {
                    if (aa.field_db.b(4, "commonui")) {
                      if (!sg.field_a.b(4)) {
                        return 82;
                      } else {
                        if (sg.field_a.a((byte) 32)) {
                          break L0;
                        } else {
                          return 86;
                        }
                      }
                    } else {
                      return 80;
                    }
                  } else {
                    return 71;
                  }
                } else {
                  return 57;
                }
              } else {
                return 43;
              }
            } else {
              if (jk.field_c.b(4)) {
                if (!jk.field_c.b(4, "commonui")) {
                  return 40;
                } else {
                  if (aa.field_db.b(4)) {
                    if (!aa.field_db.b(4, "commonui")) {
                      return 60;
                    } else {
                      if (sg.field_a.b(4)) {
                        if (!sg.field_a.a((byte) 109)) {
                          return 80;
                        } else {
                          break L0;
                        }
                      } else {
                        return 70;
                      }
                    }
                  } else {
                    return 50;
                  }
                }
              } else {
                return 20;
              }
            }
          }
          return 100;
        } else {
          return 0;
        }
    }

    ej(j param0, lk param1) {
        super(param0, param1, 33, 20, 30);
    }

    final static java.awt.Frame a(int param0, int param1, le param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        md[] var6_array = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        md[] var10 = null;
        vi var11 = null;
        Object stackIn_19_0 = null;
        Object stackIn_31_0 = null;
        java.awt.Frame stackIn_35_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_18_0 = null;
        Object stackOut_30_0 = null;
        java.awt.Frame stackOut_34_0 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var9 = Main.field_T;
        try {
          L0: {
            if (param2.b((byte) -124)) {
              L1: {
                if (0 == param4) {
                  var10 = gf.a(-2, param2);
                  var6_array = var10;
                  if (null != var6_array) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var8 >= var10.length) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          stackOut_18_0 = null;
                          stackIn_19_0 = stackOut_18_0;
                          return (java.awt.Frame) (Object) stackIn_19_0;
                        }
                      } else {
                        L3: {
                          if (var10[var8].field_b != param3) {
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
              var11 = param2.a(param4, param5, 0, (byte) -30, param3);
              L4: while (true) {
                if (var11.field_a != 0) {
                  var7 = (java.awt.Frame) var11.field_e;
                  if (null != var7) {
                    if (var11.field_a == 2) {
                      rl.a(false, param2, var7);
                      stackOut_30_0 = null;
                      stackIn_31_0 = stackOut_30_0;
                      return (java.awt.Frame) (Object) stackIn_31_0;
                    } else {
                      stackOut_34_0 = (java.awt.Frame) var7;
                      stackIn_35_0 = stackOut_34_0;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                } else {
                  wk.a((byte) -121, 10L);
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
            stackOut_36_0 = (RuntimeException) var6;
            stackOut_36_1 = new StringBuilder().append("ej.EB(").append(0).append(44).append(-3428).append(44);
            stackIn_39_0 = stackOut_36_0;
            stackIn_39_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param2 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L5;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_40_0 = stackOut_37_0;
              stackIn_40_1 = stackOut_37_1;
              stackIn_40_2 = stackOut_37_2;
              break L5;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_35_0;
    }

    final static void a(byte param0, String param1, String param2, boolean param3) {
        RuntimeException runtimeException = null;
        Object var5 = null;
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
              int discarded$7 = 16777215;
              ca.a(kj.field_q, param3);
              if (param0 <= -112) {
                break L1;
              } else {
                var5 = null;
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
            stackOut_3_1 = new StringBuilder().append("ej.DB(").append(param0).append(44);
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
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
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
          throw ma.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param3 + 41);
        }
    }

    final static void a(boolean param0, byte param1, boolean param2) {
        L0: {
          if (param0) {
            vj.a(0, 0, vj.field_l, vj.field_g, 0, 192);
            break L0;
          } else {
            vj.d();
            break L0;
          }
        }
        ga.a(param0, 117);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_jb = 0L;
    }
}
