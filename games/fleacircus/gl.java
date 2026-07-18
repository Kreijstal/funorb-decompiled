/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl extends sh {
    vc field_n;
    private ei field_p;
    static bi field_m;
    ke field_o;

    final void b(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        tk var6 = null;
        int var7 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            ((gl) this).field_o.b(param0, param1, param2);
            var6 = (tk) (Object) ((gl) this).field_n.c((byte) 47);
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                L2: {
                  if (!((gl) this).field_p.a(var6, -1)) {
                    var4_int = param1;
                    var5 = param2;
                    L3: while (true) {
                      if (var6.field_u >= var5) {
                        this.a(var6, var5, param0, -21345, var4_int, var4_int - -var5);
                        var6.field_u = var6.field_u - var5;
                        break L2;
                      } else {
                        this.a(var6, var6.field_u, param0, -21345, var4_int, var4_int - -var5);
                        var4_int = var4_int + var6.field_u;
                        var5 = var5 - var6.field_u;
                        if (!((gl) this).field_p.a(var5, var4_int, -30686, var6, param0)) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                var6 = (tk) (Object) ((gl) this).field_n.b((byte) -105);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("gl.G(");
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
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 != 112) {
            Object var2 = null;
            boolean discarded$0 = gl.a((String) null, -95, (String) null);
            field_m = null;
            return;
        }
        field_m = null;
    }

    final void a(int param0) {
        int var2 = 0;
        tk var3 = null;
        int var4 = 0;
        var4 = fleas.field_A ? 1 : 0;
        ((gl) this).field_o.a(param0);
        var3 = (tk) (Object) ((gl) this).field_n.c((byte) 47);
        L0: while (true) {
          if (var3 != null) {
            L1: {
              if (((gl) this).field_p.a(var3, -1)) {
                break L1;
              } else {
                var2 = param0;
                L2: while (true) {
                  if (var3.field_u >= var2) {
                    this.a(var2, var3, 126);
                    var3.field_u = var3.field_u - var2;
                    break L1;
                  } else {
                    this.a(var3.field_u, var3, 126);
                    var2 = var2 - var3.field_u;
                    if (((gl) this).field_p.a(var2, 0, -30686, var3, (int[]) null)) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  }
                }
              }
            }
            var3 = (tk) (Object) ((gl) this).field_n.b((byte) -105);
            continue L0;
          } else {
            return;
          }
        }
    }

    final sh c() {
        tk var1_ref = null;
        do {
            var1_ref = (tk) (Object) ((gl) this).field_n.b((byte) -105);
            if (var1_ref == null) {
                return null;
            }
        } while (null == var1_ref.field_k);
        return (sh) (Object) var1_ref.field_k;
    }

    private final void a(int param0, tk param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        ei stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        tk stackIn_7_2 = null;
        ei stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        tk stackIn_8_2 = null;
        ei stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        tk stackIn_9_2 = null;
        int stackIn_9_3 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        ei stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        tk stackOut_6_2 = null;
        ei stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        tk stackOut_8_2 = null;
        int stackOut_8_3 = 0;
        ei stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        tk stackOut_7_2 = null;
        int stackOut_7_3 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          if ((((gl) this).field_p.field_q[param1.field_o] & 4) == 0) {
            param1.field_k.a(param0);
            return;
          } else {
            if (0 > param1.field_q) {
              var4_int = ((gl) this).field_p.field_p[param1.field_o] / la.field_a;
              var5 = (1048575 - -var4_int + -param1.field_x) / var4_int;
              param1.field_x = param1.field_x - -(param0 * var4_int) & 1048575;
              if (var5 <= param0) {
                L0: {
                  if (((gl) this).field_p.field_n[param1.field_o] == 0) {
                    param1.field_k = ie.a(param1.field_z, param1.field_k.f(), param1.field_k.g(), param1.field_k.k());
                    break L0;
                  } else {
                    L1: {
                      param1.field_k = ie.a(param1.field_z, param1.field_k.f(), 0, param1.field_k.k());
                      stackOut_6_0 = ((gl) this).field_p;
                      stackOut_6_1 = -32730;
                      stackOut_6_2 = (tk) param1;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      stackIn_8_2 = stackOut_6_2;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      stackIn_7_2 = stackOut_6_2;
                      if (0 <= param1.field_D.field_l[param1.field_F]) {
                        stackOut_8_0 = (ei) (Object) stackIn_8_0;
                        stackOut_8_1 = stackIn_8_1;
                        stackOut_8_2 = (tk) (Object) stackIn_8_2;
                        stackOut_8_3 = 0;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        stackIn_9_2 = stackOut_8_2;
                        stackIn_9_3 = stackOut_8_3;
                        break L1;
                      } else {
                        stackOut_7_0 = (ei) (Object) stackIn_7_0;
                        stackOut_7_1 = stackIn_7_1;
                        stackOut_7_2 = (tk) (Object) stackIn_7_2;
                        stackOut_7_3 = 1;
                        stackIn_9_0 = stackOut_7_0;
                        stackIn_9_1 = stackOut_7_1;
                        stackIn_9_2 = stackOut_7_2;
                        stackIn_9_3 = stackOut_7_3;
                        break L1;
                      }
                    }
                    ((ei) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_9_2, stackIn_9_3 != 0);
                    break L0;
                  }
                }
                L2: {
                  if (0 > param1.field_D.field_l[param1.field_F]) {
                    param1.field_k.g(-1);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                param0 = param1.field_x / var4_int;
                param1.field_k.a(param0);
                return;
              } else {
                param1.field_k.a(param0);
                return;
              }
            } else {
              param1.field_k.a(param0);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var4;
            stackOut_20_1 = new StringBuilder().append("gl.B(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L3;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L3;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + 126 + ')');
        }
    }

    private final void a(tk param0, int param1, int[] param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ie var11 = null;
        int var12 = 0;
        ei stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        tk stackIn_11_2 = null;
        ei stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        tk stackIn_12_2 = null;
        ei stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        tk stackIn_13_2 = null;
        int stackIn_13_3 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        ei stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        tk stackOut_10_2 = null;
        ei stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        tk stackOut_12_2 = null;
        int stackOut_12_3 = 0;
        ei stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        tk stackOut_11_2 = null;
        int stackOut_11_3 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var12 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((((gl) this).field_p.field_q[param0.field_o] & 4) == 0) {
                break L1;
              } else {
                if (param0.field_q >= 0) {
                  break L1;
                } else {
                  var7_int = ((gl) this).field_p.field_p[param0.field_o] / la.field_a;
                  L2: while (true) {
                    var8 = (-param0.field_x + 1048575 + var7_int) / var7_int;
                    if (var8 > param1) {
                      param0.field_x = param0.field_x + var7_int * param1;
                      break L1;
                    } else {
                      L3: {
                        param0.field_k.b(param2, param4, var8);
                        param4 = param4 + var8;
                        param1 = param1 - var8;
                        param0.field_x = param0.field_x + (-1048576 + var8 * var7_int);
                        var9 = la.field_a / 100;
                        var10 = 262144 / var7_int;
                        if (var9 > var10) {
                          var9 = var10;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        var11 = param0.field_k;
                        if (((gl) this).field_p.field_n[param0.field_o] != 0) {
                          L5: {
                            param0.field_k = ie.a(param0.field_z, var11.f(), 0, var11.k());
                            stackOut_10_0 = ((gl) this).field_p;
                            stackOut_10_1 = -32730;
                            stackOut_10_2 = (tk) param0;
                            stackIn_12_0 = stackOut_10_0;
                            stackIn_12_1 = stackOut_10_1;
                            stackIn_12_2 = stackOut_10_2;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            if (param0.field_D.field_l[param0.field_F] >= 0) {
                              stackOut_12_0 = (ei) (Object) stackIn_12_0;
                              stackOut_12_1 = stackIn_12_1;
                              stackOut_12_2 = (tk) (Object) stackIn_12_2;
                              stackOut_12_3 = 0;
                              stackIn_13_0 = stackOut_12_0;
                              stackIn_13_1 = stackOut_12_1;
                              stackIn_13_2 = stackOut_12_2;
                              stackIn_13_3 = stackOut_12_3;
                              break L5;
                            } else {
                              stackOut_11_0 = (ei) (Object) stackIn_11_0;
                              stackOut_11_1 = stackIn_11_1;
                              stackOut_11_2 = (tk) (Object) stackIn_11_2;
                              stackOut_11_3 = 1;
                              stackIn_13_0 = stackOut_11_0;
                              stackIn_13_1 = stackOut_11_1;
                              stackIn_13_2 = stackOut_11_2;
                              stackIn_13_3 = stackOut_11_3;
                              break L5;
                            }
                          }
                          ((ei) (Object) stackIn_13_0).a(stackIn_13_1, stackIn_13_2, stackIn_13_3 != 0);
                          param0.field_k.d(var9, var11.g());
                          break L4;
                        } else {
                          param0.field_k = ie.a(param0.field_z, var11.f(), var11.g(), var11.k());
                          break L4;
                        }
                      }
                      L6: {
                        if (param0.field_D.field_l[param0.field_F] >= 0) {
                          break L6;
                        } else {
                          param0.field_k.g(-1);
                          break L6;
                        }
                      }
                      var11.f(var9);
                      var11.b(param2, param4, -param4 + param5);
                      if (var11.i()) {
                        ((gl) this).field_o.a((sh) (Object) var11);
                        continue L2;
                      } else {
                        continue L2;
                      }
                    }
                  }
                }
              }
            }
            param0.field_k.b(param2, param4, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var7;
            stackOut_22_1 = new StringBuilder().append("gl.E(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          L8: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param1).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + -21345 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
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
            L1: {
              param0 = uj.a('_', param0, param1 + 2, "");
              if (param1 == -1) {
                break L1;
              } else {
                gl.a((byte) -13);
                break L1;
              }
            }
            L2: {
              L3: {
                var3 = rk.a(param0, 5);
                if (param2.indexOf(param0) != -1) {
                  break L3;
                } else {
                  if (param2.indexOf(var3) == -1) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("gl.F(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          L5: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');
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
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    gl(ei param0) {
        ((gl) this).field_n = new vc();
        ((gl) this).field_o = new ke();
        try {
            ((gl) this).field_p = param0;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "gl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final int a() {
        return 0;
    }

    final sh d() {
        tk var1 = (tk) (Object) ((gl) this).field_n.c((byte) 47);
        if (var1 == null) {
            return null;
        }
        if (!(null == var1.field_k)) {
            return (sh) (Object) var1.field_k;
        }
        return ((gl) this).c();
    }

    static {
    }
}
