/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fda extends pp {
    static java.awt.Frame field_j;
    static kv field_m;
    static vr field_l;
    static qh field_i;
    static vr field_k;

    fda(nq param0) {
        try {
            ((fda) this).field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "fda.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final static String[] a(int param0, char param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        String[] stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                int discarded$4 = fda.b(-55);
                break L1;
              }
            }
            var10 = (CharSequence) (Object) param2;
            var3_int = tea.a(var10, param1, 50);
            var4 = new String[var3_int - -1];
            var5 = 0;
            var6 = 0;
            var7 = 0;
            L2: while (true) {
              if (var7 >= var3_int) {
                var4[var3_int] = param2.substring(var6);
                stackOut_9_0 = (String[]) var4;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                var8 = var6;
                L3: while (true) {
                  if (param1 == param2.charAt(var8)) {
                    int incrementValue$5 = var5;
                    var5++;
                    var4[incrementValue$5] = param2.substring(var6, var8);
                    var6 = 1 + var8;
                    var7++;
                    continue L2;
                  } else {
                    var8++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("fda.E(").append(param0).append(44).append(param1).append(44);
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
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0;
    }

    final static int a(int param0) {
        return (int)(1000000000L / fe.field_h);
    }

    final static int b(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_5_0 = 0;
        var2 = BachelorFridge.field_y;
        try {
          L0: {
            boolean discarded$14 = gja.field_m.a(true, hk.field_e, tq.field_q, param0 ^ 6380);
            gja.field_m.i(0);
            L1: while (true) {
              if (!kaa.b(127)) {
                if (la.field_r == -1) {
                  if (eea.field_b) {
                    stackOut_9_0 = 3;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  } else {
                    if (kq.field_j == dka.field_G) {
                      stackOut_13_0 = 1;
                      stackIn_14_0 = stackOut_13_0;
                      return stackIn_14_0;
                    } else {
                      if (ut.field_m.a(false)) {
                        if (param0 == 1) {
                          if (kq.field_j == ola.field_p) {
                            stackOut_23_0 = 2;
                            stackIn_24_0 = stackOut_23_0;
                            break L0;
                          } else {
                            return -1;
                          }
                        } else {
                          stackOut_19_0 = -103;
                          stackIn_20_0 = stackOut_19_0;
                          return stackIn_20_0;
                        }
                      } else {
                        stackOut_16_0 = 1;
                        stackIn_17_0 = stackOut_16_0;
                        return stackIn_17_0;
                      }
                    }
                  }
                } else {
                  var1_int = la.field_r;
                  ep.a(-1, param0 + 8191);
                  stackOut_5_0 = var1_int;
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0;
                }
              } else {
                boolean discarded$15 = gja.field_m.a(dla.field_j, (byte) 7, gf.field_k);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1, "fda.D(" + param0 + 41);
        }
        return stackIn_24_0;
    }

    public static void d(byte param0) {
        field_m = null;
        field_l = null;
        field_i = null;
        field_k = null;
        field_j = null;
    }

    final void a(aga param0, op param1, int param2) {
        RuntimeException runtimeException = null;
        aga var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            var4 = ((fda) this).field_h.a(103, param1);
            if (var4 == null) {
              return;
            } else {
              L1: {
                var4.field_A = false;
                var4.j(param2 ^ -98);
                if (param2 == 12) {
                  break L1;
                } else {
                  field_l = null;
                  break L1;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) runtimeException;
            stackOut_6_1 = new StringBuilder().append("fda.C(");
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
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param2 + 41);
        }
    }

    final void a(lu param0, byte param1) {
        try {
            er.a(((fda) this).field_h, 109, param0);
            int var3_int = -94 % ((param1 - 34) / 58);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "fda.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static void a(gs param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        gs var3 = null;
        int var4 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            if (param0.field_n != null) {
              if (param1 == 3100) {
                L1: {
                  L2: {
                    if (param0.field_m != 0) {
                      break L2;
                    } else {
                      if (param0.field_j == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var2_int = 0;
                  L3: while (true) {
                    if (var2_int >= qs.field_n) {
                      break L1;
                    } else {
                      L4: {
                        var3 = kw.field_k[var2_int];
                        if (var3.field_p != 2) {
                          break L4;
                        } else {
                          if (var3.field_m != param0.field_m) {
                            break L4;
                          } else {
                            if (var3.field_j != param0.field_j) {
                              break L4;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                      var2_int++;
                      continue L3;
                    }
                  }
                }
                L5: {
                  if (param0.field_o != null) {
                    dda.field_l = param0.field_g;
                    cp.field_d = param0.field_p;
                    w.field_g = param0.field_a;
                    fl.field_p = param0.field_o;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                ija.a((byte) -100, param0);
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var2;
            stackOut_21_1 = new StringBuilder().append("fda.G(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param1 + 41);
        }
    }

    static {
    }
}
