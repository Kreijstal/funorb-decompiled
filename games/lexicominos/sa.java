/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa {
    static String field_a;
    static ab field_g;
    int field_i;
    String field_f;
    String field_b;
    String field_e;
    sh field_d;
    static String field_h;
    static int field_c;

    final static ij[] a(int param0, ng param1) {
        int incrementValue$1 = 0;
        RuntimeException var2 = null;
        ij[] var2_array = null;
        int var3 = 0;
        ij var4 = null;
        mk var5 = null;
        int var6 = 0;
        Object stackIn_3_0 = null;
        ij stackIn_3_1 = null;
        ij[] stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        ij stackIn_8_1 = null;
        ij[] stackIn_25_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        ij stackOut_2_1 = null;
        ij[] stackOut_4_0 = null;
        Object stackOut_7_0 = null;
        ij stackOut_7_1 = null;
        ij[] stackOut_24_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var2_array = new ij[param1.b(2)];
            var3 = param0;
            var4 = (ij) ((Object) param1.a(true));
            L1: while (true) {
              stackOut_2_0 = null;
              stackOut_2_1 = (ij) (var4);
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              L2: while (true) {
                L3: {
                  L4: {
                    if (stackIn_3_0 == stackIn_3_1) {
                      break L4;
                    } else {
                      var4.field_i = var3;
                      stackOut_4_0 = (ij[]) (var2_array);
                      stackIn_25_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (var6 != 0) {
                        break L3;
                      } else {
                        incrementValue$1 = var3;
                        var3++;
                        stackIn_5_0[incrementValue$1] = var4;
                        var5 = (mk) ((Object) var4.field_k.a(true));
                        L5: while (true) {
                          L6: {
                            if (var5 == null) {
                              break L6;
                            } else {
                              L7: while (true) {
                                stackOut_7_0 = null;
                                stackOut_7_1 = var5.field_k.field_m;
                                stackIn_3_0 = stackOut_7_0;
                                stackIn_3_1 = stackOut_7_1;
                                stackIn_8_0 = stackOut_7_0;
                                stackIn_8_1 = stackOut_7_1;
                                if (var6 != 0) {
                                  continue L2;
                                } else {
                                  L8: {
                                    L9: {
                                      L10: {
                                        if (stackIn_8_0 == stackIn_8_1) {
                                          break L10;
                                        } else {
                                          var5.field_k = var5.field_k.field_m;
                                          if (var6 != 0) {
                                            break L9;
                                          } else {
                                            if (var6 == 0) {
                                              continue L7;
                                            } else {
                                              break L10;
                                            }
                                          }
                                        }
                                      }
                                      if (var5.field_k == var4) {
                                        break L9;
                                      } else {
                                        L11: {
                                          if (var5.field_k.field_r != var4) {
                                            break L11;
                                          } else {
                                            L12: {
                                              if (var5.field_k.field_t.field_i < var5.field_i) {
                                                break L12;
                                              } else {
                                                var5.field_k.field_t.b((byte) -124);
                                                var5.field_k.field_t = var5;
                                                if (var6 == 0) {
                                                  break L8;
                                                } else {
                                                  break L12;
                                                }
                                              }
                                            }
                                            var5.b((byte) -126);
                                            if (var6 == 0) {
                                              break L8;
                                            } else {
                                              break L11;
                                            }
                                          }
                                        }
                                        var5.field_k.field_r = var4;
                                        var5.field_k.field_t = var5;
                                        if (var6 == 0) {
                                          break L8;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                    var5.b((byte) -121);
                                    break L8;
                                  }
                                  var5 = (mk) ((Object) var4.field_k.f(param0 ^ 2));
                                  if (var6 == 0) {
                                    continue L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                          var4 = (ij) ((Object) param1.f(2));
                          if (var6 == 0) {
                            continue L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  stackOut_24_0 = (ij[]) (var2_array);
                  stackIn_25_0 = stackOut_24_0;
                  break L3;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var2 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) (var2);
            stackOut_26_1 = new StringBuilder().append("sa.A(").append(param0).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L13;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L13;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
        }
        return stackIn_25_0;
    }

    public static void a(int param0) {
        field_h = null;
        field_g = null;
        if (param0 != 0) {
            String var2 = (String) null;
            sa.a((byte) 48, (String) null);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(byte param0, java.applet.Applet param1) {
        pf.field_m = true;
        String var2 = "tuhstatbut";
        String var3 = "rvnadlm";
        long var4 = -1L;
        if (param0 <= 83) {
            return;
        }
        try {
            te.a(var2, var4, param1, var3, 1000);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "sa.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private sa() throws Throwable {
        throw new Error();
    }

    final static void a(byte param0, String param1) {
        try {
            if (param0 != 68) {
                java.applet.Applet var3 = (java.applet.Applet) null;
                sa.a((byte) 6, (java.applet.Applet) null);
            }
            og.field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "sa.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Email (Login):";
        field_c = 65;
        field_h = "Error connecting to server. Please try using a different server.";
    }
}
