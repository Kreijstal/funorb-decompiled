/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ka extends wf {
    static String field_k;
    private pk field_p;
    static mj field_o;
    static int field_n;
    bc field_m;
    rb field_l;

    final wf d() {
        kl var1;
        var1 = (kl) ((Object) this.field_m.a((byte) -52));
        if (var1 != null) {
          if (null != var1.field_i) {
            return (wf) ((Object) var1.field_i);
          } else {
            return this.c();
          }
        } else {
          return null;
        }
    }

    private final void a(int[] param0, int param1, int param2, kl param3, byte param4, int param5) {
        pk stackIn_13_0 = null;
        kl stackIn_13_1 = null;
        int stackIn_13_2 = 0;
        pk stackIn_14_0;
        kl stackIn_14_1;
        int stackIn_14_2;
        int stackIn_14_3;
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
        pi var11 = null;
        int var12 = 0;
        var12 = Bounce.field_N;
        try {
          L0: {
            L1: {
              if (-1 == (this.field_p.field_l[param3.field_E] & 4 ^ -1)) {
                break L1;
              } else {
                if (param3.field_C < 0) {
                  var7_int = this.field_p.field_K[param3.field_E] / e.field_r;
                  L2: while (true) {
                    var8 = (var7_int + 1048575 + -param3.field_u) / var7_int;
                    if (var8 <= param2) {
                      L3: {
                        param3.field_i.a(param0, param5, var8);
                        param2 = param2 - var8;
                        param3.field_u = param3.field_u + (var8 * var7_int - 1048576);
                        param5 = param5 + var8;
                        var9 = e.field_r / 100;
                        var10 = 262144 / var7_int;
                        if (var9 <= var10) {
                          break L3;
                        } else {
                          var9 = var10;
                          break L3;
                        }
                      }
                      L4: {
                        var11 = param3.field_i;
                        if (this.field_p.field_s[param3.field_E] != 0) {
                          L5: {
                            param3.field_i = pi.a(param3.field_w, var11.j(), 0, var11.h());
                            stackIn_13_0 = this.field_p;

                            stackIn_13_1 = (kl) (param3);

                            stackIn_13_2 = -115;

                            if (param3.field_D.field_n[param3.field_r] >= 0) {
                              stackIn_14_0 = (pk) ((Object) stackIn_13_0);
                              stackIn_14_1 = (kl) ((Object) stackIn_13_1);
                              stackIn_14_2 = stackIn_13_2;
                              stackIn_14_3 = 0;
                              break L5;
                            } else {
                              stackIn_14_0 = (pk) ((Object) stackIn_13_0);
                              stackIn_14_1 = (kl) ((Object) stackIn_13_1);
                              stackIn_14_2 = stackIn_13_2;
                              stackIn_14_3 = 1;
                              break L5;
                            }
                          }
                          ((pk) (Object) stackIn_14_0).a(stackIn_14_1, (byte) stackIn_14_2, stackIn_14_3 != 0);
                          param3.field_i.d(var9, var11.g());
                          break L4;
                        } else {
                          param3.field_i = pi.a(param3.field_w, var11.j(), var11.g(), var11.h());
                          break L4;
                        }
                      }
                      L6: {
                        if ((param3.field_D.field_n[param3.field_r] ^ -1) <= -1) {
                          break L6;
                        } else {
                          param3.field_i.f(-1);
                          break L6;
                        }
                      }
                      var11.i(var9);
                      var11.a(param0, param5, param1 + -param5);
                      if (var11.k()) {
                        this.field_l.a(var11);
                        continue L2;
                      } else {
                        continue L2;
                      }
                    } else {
                      param3.field_u = param3.field_u + param2 * var7_int;
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            param3.field_i.a(param0, param5, param2);
            if (param4 < -54) {
              break L0;
            } else {
              this.a(-79);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var7);

            stackIn_26_1 = new StringBuilder().append("ka.A(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L7;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L8;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L8;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_27_0), stackIn_30_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final void a(kl param0, int param1, int param2) {
        pk stackIn_8_0 = null;
        kl stackIn_8_1 = null;
        int stackIn_8_2 = 0;
        pk stackIn_9_0;
        kl stackIn_9_1;
        int stackIn_9_2;
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
              if ((this.field_p.field_l[param0.field_E] & 4) == 0) {
                break L1;
              } else {
                if (param0.field_C >= 0) {
                  break L1;
                } else {
                  var4_int = this.field_p.field_K[param0.field_E] / e.field_r;
                  var5 = (-param0.field_u + (1048575 - -var4_int)) / var4_int;
                  param0.field_u = param0.field_u - -(var4_int * param1) & 1048575;
                  if (var5 <= param1) {
                    L2: {
                      if (-1 != (this.field_p.field_s[param0.field_E] ^ -1)) {
                        L3: {
                          param0.field_i = pi.a(param0.field_w, param0.field_i.j(), 0, param0.field_i.h());
                          stackIn_8_0 = this.field_p;

                          stackIn_8_1 = (kl) (param0);

                          stackIn_8_2 = -128;

                          if (param0.field_D.field_n[param0.field_r] >= 0) {
                            stackIn_9_0 = (pk) ((Object) stackIn_8_0);
                            stackIn_9_1 = (kl) ((Object) stackIn_8_1);
                            stackIn_9_2 = stackIn_8_2;
                            stackIn_9_3 = 0;
                            break L3;
                          } else {
                            stackIn_9_0 = (pk) ((Object) stackIn_8_0);
                            stackIn_9_1 = (kl) ((Object) stackIn_8_1);
                            stackIn_9_2 = stackIn_8_2;
                            stackIn_9_3 = 1;
                            break L3;
                          }
                        }
                        ((pk) (Object) stackIn_9_0).a(stackIn_9_1, (byte) stackIn_9_2, stackIn_9_3 != 0);
                        break L2;
                      } else {
                        param0.field_i = pi.a(param0.field_w, param0.field_i.j(), param0.field_i.g(), param0.field_i.h());
                        break L2;
                      }
                    }
                    L4: {
                      if (0 > param0.field_D.field_n[param0.field_r]) {
                        param0.field_i.f(-1);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    param1 = param0.field_u / var4_int;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L5: {
              if (param2 < -58) {
                break L5;
              } else {
                field_k = (String) null;
                break L5;
              }
            }
            param0.field_i.a(param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var4);

            stackIn_20_1 = new StringBuilder().append("ka.E(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void d(int param0) {
        field_o = null;
        field_k = null;
        if (param0 == 0) {
            return;
        }
        field_n = 46;
    }

    final void a(int[] param0, int param1, int param2) {
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        kl var6 = null;
        int var7 = 0;
        var7 = Bounce.field_N;
        try {
          L0: {
            this.field_l.a(param0, param1, param2);
            var6 = (kl) ((Object) this.field_m.a((byte) -49));
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                stackIn_4_0 = this.field_p.a(var6, 8335400);
                L2: {
                  if (stackIn_4_0) {
                    break L2;
                  } else {
                    var5 = param2;
                    var4_int = param1;
                    L3: while (true) {
                      if (var5 <= var6.field_j) {
                        this.a(param0, var4_int + var5, var5, var6, (byte) -70, var4_int);
                        var6.field_j = var6.field_j - var5;
                        break L2;
                      } else {
                        this.a(param0, var4_int + var5, var6.field_j, var6, (byte) -109, var4_int);
                        var4_int = var4_int + var6.field_j;
                        var5 = var5 - var6.field_j;
                        if (this.field_p.a(param0, var5, var4_int, var6, (byte) 106)) {
                          break L2;
                        } else {
                          continue L3;
                        }
                      }
                    }
                  }
                }
                var6 = (kl) ((Object) this.field_m.d((byte) 127));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("ka.P(");

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
          throw ii.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(java.awt.Component param0, byte param1) {
        try {
            param0.removeMouseListener(nj.field_o);
            if (param1 > -72) {
                field_k = (String) null;
            }
            param0.removeMouseMotionListener(nj.field_o);
            param0.removeFocusListener(nj.field_o);
            c.field_c = 0;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "ka.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int b() {
        return 0;
    }

    final wf c() {
        kl var1;
        L0: while (true) {
          var1 = (kl) ((Object) this.field_m.d((byte) -94));
          if (var1 != null) {
            if (null != var1.field_i) {
              return (wf) ((Object) var1.field_i);
            } else {
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    final void a(int param0) {
        int var2;
        kl var3;
        int var4;
        boolean stackIn_4_0 = false;
        var4 = Bounce.field_N;
        this.field_l.a(param0);
        var3 = (kl) ((Object) this.field_m.a((byte) -91));
        L0: while (true) {
          if (var3 != null) {
            stackIn_4_0 = this.field_p.a(var3, 8335400);
            L1: {
              if (!stackIn_4_0) {
                var2 = param0;
                L2: while (true) {
                  if (var2 <= var3.field_j) {
                    this.a(var3, var2, -96);
                    var3.field_j = var3.field_j - var2;
                    break L1;
                  } else {
                    this.a(var3, var3.field_j, -124);
                    var2 = var2 - var3.field_j;
                    if (this.field_p.a((int[]) null, var2, 0, var3, (byte) 112)) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            var3 = (kl) ((Object) this.field_m.d((byte) -101));
            continue L0;
          } else {
            return;
          }
        }
    }

    ka(pk param0) {
        this.field_m = new bc();
        this.field_l = new rb();
        try {
            this.field_p = param0;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "ka.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = "Keys";
    }
}
