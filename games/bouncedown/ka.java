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
        kl var1 = null;
        var1 = (kl) (Object) ((ka) this).field_m.a((byte) -52);
        if (var1 != null) {
          if (null != var1.field_i) {
            return (wf) (Object) var1.field_i;
          } else {
            return ((ka) this).c();
          }
        } else {
          return null;
        }
    }

    private final void a(int[] param0, int param1, int param2, kl param3, byte param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        pi var11 = null;
        int var12 = 0;
        pk stackIn_12_0 = null;
        kl stackIn_12_1 = null;
        int stackIn_12_2 = 0;
        pk stackIn_13_0 = null;
        kl stackIn_13_1 = null;
        int stackIn_13_2 = 0;
        pk stackIn_14_0 = null;
        kl stackIn_14_1 = null;
        int stackIn_14_2 = 0;
        int stackIn_14_3 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        pk stackOut_11_0 = null;
        kl stackOut_11_1 = null;
        int stackOut_11_2 = 0;
        pk stackOut_13_0 = null;
        kl stackOut_13_1 = null;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        pk stackOut_12_0 = null;
        kl stackOut_12_1 = null;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var12 = Bounce.field_N;
        try {
          L0: {
            L1: {
              if ((((ka) this).field_p.field_l[param3.field_E] & 4) == 0) {
                break L1;
              } else {
                if (param3.field_C < 0) {
                  var7_int = ((ka) this).field_p.field_K[param3.field_E] / e.field_r;
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
                        if (((ka) this).field_p.field_s[param3.field_E] != 0) {
                          L5: {
                            param3.field_i = pi.a(param3.field_w, var11.j(), 0, var11.h());
                            stackOut_11_0 = ((ka) this).field_p;
                            stackOut_11_1 = (kl) param3;
                            stackOut_11_2 = -115;
                            stackIn_13_0 = stackOut_11_0;
                            stackIn_13_1 = stackOut_11_1;
                            stackIn_13_2 = stackOut_11_2;
                            stackIn_12_0 = stackOut_11_0;
                            stackIn_12_1 = stackOut_11_1;
                            stackIn_12_2 = stackOut_11_2;
                            if (param3.field_D.field_n[param3.field_r] >= 0) {
                              stackOut_13_0 = (pk) (Object) stackIn_13_0;
                              stackOut_13_1 = (kl) (Object) stackIn_13_1;
                              stackOut_13_2 = stackIn_13_2;
                              stackOut_13_3 = 0;
                              stackIn_14_0 = stackOut_13_0;
                              stackIn_14_1 = stackOut_13_1;
                              stackIn_14_2 = stackOut_13_2;
                              stackIn_14_3 = stackOut_13_3;
                              break L5;
                            } else {
                              stackOut_12_0 = (pk) (Object) stackIn_12_0;
                              stackOut_12_1 = (kl) (Object) stackIn_12_1;
                              stackOut_12_2 = stackIn_12_2;
                              stackOut_12_3 = 1;
                              stackIn_14_0 = stackOut_12_0;
                              stackIn_14_1 = stackOut_12_1;
                              stackIn_14_2 = stackOut_12_2;
                              stackIn_14_3 = stackOut_12_3;
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
                        if (param3.field_D.field_n[param3.field_r] >= 0) {
                          break L6;
                        } else {
                          param3.field_i.f(-1);
                          break L6;
                        }
                      }
                      var11.i(var9);
                      var11.a(param0, param5, param1 + -param5);
                      if (var11.k()) {
                        ((ka) this).field_l.a((wf) (Object) var11);
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
              ((ka) this).a(-79);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var7;
            stackOut_24_1 = new StringBuilder().append("ka.A(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          L8: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param3 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L8;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + param4 + 44 + param5 + 41);
        }
    }

    private final void a(kl param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        pk stackIn_7_0 = null;
        kl stackIn_7_1 = null;
        int stackIn_7_2 = 0;
        pk stackIn_8_0 = null;
        kl stackIn_8_1 = null;
        int stackIn_8_2 = 0;
        pk stackIn_9_0 = null;
        kl stackIn_9_1 = null;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        pk stackOut_6_0 = null;
        kl stackOut_6_1 = null;
        int stackOut_6_2 = 0;
        pk stackOut_8_0 = null;
        kl stackOut_8_1 = null;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        pk stackOut_7_0 = null;
        kl stackOut_7_1 = null;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              if ((((ka) this).field_p.field_l[param0.field_E] & 4) == 0) {
                break L1;
              } else {
                if (param0.field_C >= 0) {
                  break L1;
                } else {
                  var4_int = ((ka) this).field_p.field_K[param0.field_E] / e.field_r;
                  var5 = (-param0.field_u + (1048575 - -var4_int)) / var4_int;
                  param0.field_u = param0.field_u - -(var4_int * param1) & 1048575;
                  if (var5 <= param1) {
                    L2: {
                      if (((ka) this).field_p.field_s[param0.field_E] != 0) {
                        L3: {
                          param0.field_i = pi.a(param0.field_w, param0.field_i.j(), 0, param0.field_i.h());
                          stackOut_6_0 = ((ka) this).field_p;
                          stackOut_6_1 = (kl) param0;
                          stackOut_6_2 = -128;
                          stackIn_8_0 = stackOut_6_0;
                          stackIn_8_1 = stackOut_6_1;
                          stackIn_8_2 = stackOut_6_2;
                          stackIn_7_0 = stackOut_6_0;
                          stackIn_7_1 = stackOut_6_1;
                          stackIn_7_2 = stackOut_6_2;
                          if (param0.field_D.field_n[param0.field_r] >= 0) {
                            stackOut_8_0 = (pk) (Object) stackIn_8_0;
                            stackOut_8_1 = (kl) (Object) stackIn_8_1;
                            stackOut_8_2 = stackIn_8_2;
                            stackOut_8_3 = 0;
                            stackIn_9_0 = stackOut_8_0;
                            stackIn_9_1 = stackOut_8_1;
                            stackIn_9_2 = stackOut_8_2;
                            stackIn_9_3 = stackOut_8_3;
                            break L3;
                          } else {
                            stackOut_7_0 = (pk) (Object) stackIn_7_0;
                            stackOut_7_1 = (kl) (Object) stackIn_7_1;
                            stackOut_7_2 = stackIn_7_2;
                            stackOut_7_3 = 1;
                            stackIn_9_0 = stackOut_7_0;
                            stackIn_9_1 = stackOut_7_1;
                            stackIn_9_2 = stackOut_7_2;
                            stackIn_9_3 = stackOut_7_3;
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
                field_k = null;
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
            stackOut_18_0 = (RuntimeException) var4;
            stackOut_18_1 = new StringBuilder().append("ka.E(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    public static void d(int param0) {
        field_o = null;
        field_k = null;
    }

    final void a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        kl var6 = null;
        int var7 = 0;
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
        var7 = Bounce.field_N;
        try {
          L0: {
            ((ka) this).field_l.a(param0, param1, param2);
            var6 = (kl) (Object) ((ka) this).field_m.a((byte) -49);
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                L2: {
                  if (((ka) this).field_p.a(var6, 8335400)) {
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
                        if (((ka) this).field_p.a(param0, var5, var4_int, var6, (byte) 106)) {
                          break L2;
                        } else {
                          continue L3;
                        }
                      }
                    }
                  }
                }
                var6 = (kl) (Object) ((ka) this).field_m.d((byte) 127);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("ka.P(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
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
          throw ii.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static void a(java.awt.Component param0) {
        try {
            param0.removeMouseListener((java.awt.event.MouseListener) (Object) nj.field_o);
            param0.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) nj.field_o);
            param0.removeFocusListener((java.awt.event.FocusListener) (Object) nj.field_o);
            c.field_c = 0;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "ka.C(" + (param0 != null ? "{...}" : "null") + 44 + -80 + 41);
        }
    }

    final int b() {
        return 0;
    }

    final wf c() {
        kl var1 = null;
        L0: while (true) {
          var1 = (kl) (Object) ((ka) this).field_m.d((byte) -94);
          if (var1 != null) {
            if (null != var1.field_i) {
              return (wf) (Object) var1.field_i;
            } else {
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    final void a(int param0) {
        int var2 = 0;
        kl var3 = null;
        int var4 = 0;
        var4 = Bounce.field_N;
        ((ka) this).field_l.a(param0);
        var3 = (kl) (Object) ((ka) this).field_m.a((byte) -91);
        L0: while (true) {
          if (var3 != null) {
            L1: {
              if (!((ka) this).field_p.a(var3, 8335400)) {
                var2 = param0;
                L2: while (true) {
                  if (var2 <= var3.field_j) {
                    this.a(var3, var2, -96);
                    var3.field_j = var3.field_j - var2;
                    break L1;
                  } else {
                    this.a(var3, var3.field_j, -124);
                    var2 = var2 - var3.field_j;
                    if (((ka) this).field_p.a((int[]) null, var2, 0, var3, (byte) 112)) {
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
            var3 = (kl) (Object) ((ka) this).field_m.d((byte) -101);
            continue L0;
          } else {
            return;
          }
        }
    }

    ka(pk param0) {
        ((ka) this).field_m = new bc();
        ((ka) this).field_l = new rb();
        try {
            ((ka) this).field_p = param0;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "ka.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Keys";
    }
}
