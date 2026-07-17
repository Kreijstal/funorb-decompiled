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
          throw ma.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    final static int r(int param0) {
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
        Object stackIn_16_0 = null;
        Object stackIn_26_0 = null;
        java.awt.Frame stackIn_30_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_15_0 = null;
        Object stackOut_25_0 = null;
        java.awt.Frame stackOut_29_0 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var9 = Main.field_T;
        try {
          L0: {
            if (param2.b((byte) -124)) {
              L1: {
                if (0 == param4) {
                  var10 = gf.a(-2, param2);
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
              var11 = param2.a(param4, param5, param0, (byte) -30, param3);
              L4: while (true) {
                if (var11.field_a != 0) {
                  var7 = (java.awt.Frame) var11.field_e;
                  if (var7 != null) {
                    if (var11.field_a == 2) {
                      rl.a(false, param2, var7);
                      stackOut_25_0 = null;
                      stackIn_26_0 = stackOut_25_0;
                      return (java.awt.Frame) (Object) stackIn_26_0;
                    } else {
                      L5: {
                        if (param1 == -3428) {
                          break L5;
                        } else {
                          field_kb = -115;
                          break L5;
                        }
                      }
                      stackOut_29_0 = (java.awt.Frame) var7;
                      stackIn_30_0 = stackOut_29_0;
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
          L6: {
            var6 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var6;
            stackOut_31_1 = new StringBuilder().append("ej.EB(").append(param0).append(44).append(param1).append(44);
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param2 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L6;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L6;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_30_0;
    }

    final static void a(byte param0, String param1, String param2, boolean param3) {
        RuntimeException runtimeException = null;
        Object var5 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
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
              ng.field_y = param1;
              ja.field_a = param2;
              ca.a(kj.field_q, param3, 16777215);
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
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
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
          throw ma.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param3 + 41);
        }
    }

    final static void a(boolean param0, byte param1, boolean param2) {
        if (param1 != 55) {
            return;
        }
        if (!param0) {
            vj.d();
        } else {
            vj.a(0, 0, vj.field_l, vj.field_g, 0, 192);
        }
        ga.a(param0, param1 + 62);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_jb = 0L;
    }
}
