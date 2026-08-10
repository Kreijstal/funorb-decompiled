/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl extends sh {
    vc field_n;
    private ei field_p;
    static bi field_m;
    ke field_o;

    final void b(int[] param0, int param1, int param2) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        tk var6 = null;
        int var7 = 0;
        var7 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            this.field_o.b(param0, param1, param2);
            var6 = (tk) ((Object) this.field_n.c((byte) 47));
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                L2: {
                  if (!this.field_p.a(var6, -1)) {
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
                        if (!this.field_p.a(var5, var4_int, -30686, var6, param0)) {
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
                var6 = (tk) ((Object) this.field_n.b((byte) -105));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("gl.G(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 != 112) {
            String var2 = (String) null;
            gl.a((String) null, -95, (String) null);
            field_m = null;
            return;
        }
        field_m = null;
    }

    final void a(int param0) {
        int var2;
        tk var3;
        int var4;
        boolean stackIn_4_0 = false;
        var4 = fleas.field_A ? 1 : 0;
        this.field_o.a(param0);
        var3 = (tk) ((Object) this.field_n.c((byte) 47));
        L0: while (true) {
          if (var3 != null) {
            stackIn_4_0 = this.field_p.a(var3, -1);
            L1: {
              if (stackIn_4_0) {
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
                    if (this.field_p.a(var2, 0, -30686, var3, (int[]) null)) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  }
                }
              }
            }
            var3 = (tk) ((Object) this.field_n.b((byte) -105));
            continue L0;
          } else {
            return;
          }
        }
    }

    final sh c() {
        tk var1_ref = null;
        do {
            var1_ref = (tk) ((Object) this.field_n.b((byte) -105));
            if (var1_ref == null) {
                return null;
            }
        } while (null == var1_ref.field_k);
        return (sh) ((Object) var1_ref.field_k);
    }

    private final void a(int param0, tk param1, int param2) {
        ei stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        tk stackIn_8_2 = null;
        ei stackIn_9_0;
        int stackIn_9_1;
        tk stackIn_9_2;
        int stackIn_9_3;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          L0: {
            L1: {
              if ((this.field_p.field_q[param1.field_o] & 4) == 0) {
                break L1;
              } else {
                if (0 > param1.field_q) {
                  var4_int = this.field_p.field_p[param1.field_o] / la.field_a;
                  var5 = (1048575 - -var4_int + -param1.field_x) / var4_int;
                  param1.field_x = param1.field_x - -(param0 * var4_int) & 1048575;
                  if (var5 <= param0) {
                    L2: {
                      if (this.field_p.field_n[param1.field_o] == 0) {
                        param1.field_k = ie.a(param1.field_z, param1.field_k.f(), param1.field_k.g(), param1.field_k.k());
                        break L2;
                      } else {
                        L3: {
                          param1.field_k = ie.a(param1.field_z, param1.field_k.f(), 0, param1.field_k.k());
                          stackIn_8_0 = this.field_p;

                          stackIn_8_1 = -32730;

                          stackIn_8_2 = (tk) (param1);

                          if (0 <= param1.field_D.field_l[param1.field_F]) {
                            stackIn_9_0 = (ei) ((Object) stackIn_8_0);
                            stackIn_9_1 = stackIn_8_1;
                            stackIn_9_2 = (tk) ((Object) stackIn_8_2);
                            stackIn_9_3 = 0;
                            break L3;
                          } else {
                            stackIn_9_0 = (ei) ((Object) stackIn_8_0);
                            stackIn_9_1 = stackIn_8_1;
                            stackIn_9_2 = (tk) ((Object) stackIn_8_2);
                            stackIn_9_3 = 1;
                            break L3;
                          }
                        }
                        ((ei) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_9_2, stackIn_9_3 != 0);
                        break L2;
                      }
                    }
                    L4: {
                      if (0 > param1.field_D.field_l[param1.field_F]) {
                        param1.field_k.g(-1);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    param0 = param1.field_x / var4_int;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
            }
            param1.field_k.a(param0);
            if (param2 >= 124) {
              break L0;
            } else {
              this.c();
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var4);

            stackIn_20_1 = new StringBuilder().append("gl.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param2 + ')');
        }
    }

    private final void a(tk param0, int param1, int[] param2, int param3, int param4, int param5) {
        ei stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        tk stackIn_14_2 = null;
        ei stackIn_15_0;
        int stackIn_15_1;
        tk stackIn_15_2;
        int stackIn_15_3;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ie var11 = null;
        int var12 = 0;
        var12 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 == -21345) {
                break L1;
              } else {
                this.d();
                break L1;
              }
            }
            L2: {
              if ((this.field_p.field_q[param0.field_o] & 4) == 0) {
                break L2;
              } else {
                if ((param0.field_q ^ -1) <= -1) {
                  break L2;
                } else {
                  var7_int = this.field_p.field_p[param0.field_o] / la.field_a;
                  L3: while (true) {
                    var8 = (-param0.field_x + 1048575 + var7_int) / var7_int;
                    if (var8 > param1) {
                      param0.field_x = param0.field_x + var7_int * param1;
                      break L2;
                    } else {
                      L4: {
                        param0.field_k.b(param2, param4, var8);
                        param4 = param4 + var8;
                        param1 = param1 - var8;
                        param0.field_x = param0.field_x + (-1048576 + var8 * var7_int);
                        var9 = la.field_a / 100;
                        var10 = 262144 / var7_int;
                        if (var9 > var10) {
                          var9 = var10;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        var11 = param0.field_k;
                        if (-1 != (this.field_p.field_n[param0.field_o] ^ -1)) {
                          L6: {
                            param0.field_k = ie.a(param0.field_z, var11.f(), 0, var11.k());
                            stackIn_14_0 = this.field_p;

                            stackIn_14_1 = -32730;

                            stackIn_14_2 = (tk) (param0);

                            if ((param0.field_D.field_l[param0.field_F] ^ -1) <= -1) {
                              stackIn_15_0 = (ei) ((Object) stackIn_14_0);
                              stackIn_15_1 = stackIn_14_1;
                              stackIn_15_2 = (tk) ((Object) stackIn_14_2);
                              stackIn_15_3 = 0;
                              break L6;
                            } else {
                              stackIn_15_0 = (ei) ((Object) stackIn_14_0);
                              stackIn_15_1 = stackIn_14_1;
                              stackIn_15_2 = (tk) ((Object) stackIn_14_2);
                              stackIn_15_3 = 1;
                              break L6;
                            }
                          }
                          ((ei) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_15_2, stackIn_15_3 != 0);
                          param0.field_k.d(var9, var11.g());
                          break L5;
                        } else {
                          param0.field_k = ie.a(param0.field_z, var11.f(), var11.g(), var11.k());
                          break L5;
                        }
                      }
                      L7: {
                        if ((param0.field_D.field_l[param0.field_F] ^ -1) <= -1) {
                          break L7;
                        } else {
                          param0.field_k.g(-1);
                          break L7;
                        }
                      }
                      var11.f(var9);
                      var11.b(param2, param4, -param4 + param5);
                      if (var11.i()) {
                        this.field_o.a(var11);
                        continue L3;
                      } else {
                        continue L3;
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
          L8: {
            var7 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var7);

            stackIn_26_1 = new StringBuilder().append("gl.E(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L9;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L9;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_27_0), stackIn_30_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
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
                  if (0 == (param2.indexOf(var3) ^ -1)) {
                    stackIn_7_0 = 0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_7_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("gl.F(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    gl(ei param0) {
        this.field_n = new vc();
        this.field_o = new ke();
        try {
            this.field_p = param0;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "gl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final int a() {
        return 0;
    }

    final sh d() {
        tk var1 = (tk) ((Object) this.field_n.c((byte) 47));
        if (var1 == null) {
            return null;
        }
        if (!(null == var1.field_k)) {
            return (sh) ((Object) var1.field_k);
        }
        return this.c();
    }

    static {
    }
}
