/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he extends k {
    private fl field_t;
    static java.awt.Frame field_u;
    oi field_p;
    static int field_q;
    static int[] field_n;
    static int[] field_m;
    static String field_r;
    vi field_o;
    static int[] field_s;

    final void a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        vk var6 = null;
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
        var7 = wizardrun.field_H;
        try {
          L0: {
            ((he) this).field_o.a(param0, param1, param2);
            var6 = (vk) (Object) ((he) this).field_p.b((byte) 86);
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                L2: {
                  if (!((he) this).field_t.b(-1, var6)) {
                    var4_int = param1;
                    var5 = param2;
                    L3: while (true) {
                      if (var5 <= var6.field_E) {
                        this.a(var4_int, var5, param0, var6, var5 + var4_int, 66);
                        var6.field_E = var6.field_E - var5;
                        break L2;
                      } else {
                        this.a(var4_int, var6.field_E, param0, var6, var5 + var4_int, 124);
                        var5 = var5 - var6.field_E;
                        var4_int = var4_int + var6.field_E;
                        if (!((he) this).field_t.a(0, param0, var6, var5, var4_int)) {
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
                var6 = (vk) (Object) ((he) this).field_p.d(8192);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("he.D(");
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
          throw bd.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, vk param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        fl stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        fl stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        fl stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        fl stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        fl stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        fl stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if ((((he) this).field_t.field_y[param1.field_F] & 4) == 0) {
                break L1;
              } else {
                if (0 <= param1.field_j) {
                  break L1;
                } else {
                  var4_int = ((he) this).field_t.field_Q[param1.field_F] / c.field_l;
                  var5 = (-param1.field_H + var4_int + 1048575) / var4_int;
                  param1.field_H = var4_int * param0 + param1.field_H & 1048575;
                  if (param0 >= var5) {
                    L2: {
                      if (((he) this).field_t.field_o[param1.field_F] == 0) {
                        param1.field_w = uj.a(param1.field_v, param1.field_w.h(), param1.field_w.f(), param1.field_w.j());
                        break L2;
                      } else {
                        L3: {
                          param1.field_w = uj.a(param1.field_v, param1.field_w.h(), 0, param1.field_w.j());
                          stackOut_5_0 = ((he) this).field_t;
                          stackOut_5_1 = 15;
                          stackIn_7_0 = stackOut_5_0;
                          stackIn_7_1 = stackOut_5_1;
                          stackIn_6_0 = stackOut_5_0;
                          stackIn_6_1 = stackOut_5_1;
                          if (param1.field_C.field_r[param1.field_k] >= 0) {
                            stackOut_7_0 = (fl) (Object) stackIn_7_0;
                            stackOut_7_1 = stackIn_7_1;
                            stackOut_7_2 = 0;
                            stackIn_8_0 = stackOut_7_0;
                            stackIn_8_1 = stackOut_7_1;
                            stackIn_8_2 = stackOut_7_2;
                            break L3;
                          } else {
                            stackOut_6_0 = (fl) (Object) stackIn_6_0;
                            stackOut_6_1 = stackIn_6_1;
                            stackOut_6_2 = 1;
                            stackIn_8_0 = stackOut_6_0;
                            stackIn_8_1 = stackOut_6_1;
                            stackIn_8_2 = stackOut_6_2;
                            break L3;
                          }
                        }
                        ((fl) (Object) stackIn_8_0).a(stackIn_8_1, stackIn_8_2 != 0, param1);
                        break L2;
                      }
                    }
                    L4: {
                      if (param1.field_C.field_r[param1.field_k] < 0) {
                        param1.field_w.e(-1);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    param0 = param1.field_H / var4_int;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            param1.field_w.a(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var4;
            stackOut_16_1 = new StringBuilder().append("he.I(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + -1 + ')');
        }
    }

    public static void c(int param0) {
        field_n = null;
        field_u = null;
        field_r = null;
        field_m = null;
        field_s = null;
    }

    private final void a(int param0, int param1, int[] param2, vk param3, int param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        uj var11 = null;
        int var12 = 0;
        fl stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        fl stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        fl stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
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
        fl stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        fl stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        fl stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
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
        var12 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              if ((4 & ((he) this).field_t.field_y[param3.field_F]) == -1) {
                break L1;
              } else {
                if (-1 <= param3.field_j) {
                  break L1;
                } else {
                  var7_int = ((he) this).field_t.field_Q[param3.field_F] / c.field_l;
                  L2: while (true) {
                    var8 = (1048575 - (-var7_int + param3.field_H)) / var7_int;
                    if (param1 >= var8) {
                      L3: {
                        param3.field_w.a(param2, param0, var8);
                        param0 = param0 + var8;
                        param1 = param1 - var8;
                        param3.field_H = param3.field_H + (var8 * var7_int + -1048576);
                        var9 = c.field_l / 100;
                        var10 = 262144 / var7_int;
                        if (var10 < var9) {
                          var9 = var10;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        var11 = param3.field_w;
                        if (((he) this).field_t.field_o[param3.field_F] == 0) {
                          param3.field_w = uj.a(param3.field_v, var11.h(), var11.f(), var11.j());
                          break L4;
                        } else {
                          L5: {
                            param3.field_w = uj.a(param3.field_v, var11.h(), 0, var11.j());
                            stackOut_10_0 = ((he) this).field_t;
                            stackOut_10_1 = 15;
                            stackIn_12_0 = stackOut_10_0;
                            stackIn_12_1 = stackOut_10_1;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            if (param3.field_C.field_r[param3.field_k] >= 0) {
                              stackOut_12_0 = (fl) (Object) stackIn_12_0;
                              stackOut_12_1 = stackIn_12_1;
                              stackOut_12_2 = 0;
                              stackIn_13_0 = stackOut_12_0;
                              stackIn_13_1 = stackOut_12_1;
                              stackIn_13_2 = stackOut_12_2;
                              break L5;
                            } else {
                              stackOut_11_0 = (fl) (Object) stackIn_11_0;
                              stackOut_11_1 = stackIn_11_1;
                              stackOut_11_2 = 1;
                              stackIn_13_0 = stackOut_11_0;
                              stackIn_13_1 = stackOut_11_1;
                              stackIn_13_2 = stackOut_11_2;
                              break L5;
                            }
                          }
                          ((fl) (Object) stackIn_13_0).a(stackIn_13_1, stackIn_13_2 != 0, param3);
                          param3.field_w.c(var9, var11.f());
                          break L4;
                        }
                      }
                      L6: {
                        if (param3.field_C.field_r[param3.field_k] >= 0) {
                          break L6;
                        } else {
                          param3.field_w.e(-1);
                          break L6;
                        }
                      }
                      var11.f(var9);
                      var11.a(param2, param0, -param0 + param4);
                      if (!var11.i()) {
                        continue L2;
                      } else {
                        ((he) this).field_o.a((k) (Object) var11);
                        continue L2;
                      }
                    } else {
                      param3.field_H = param3.field_H + var7_int * param1;
                      break L1;
                    }
                  }
                }
              }
            }
            L7: {
              if (param5 > 55) {
                break L7;
              } else {
                k discarded$1 = ((he) this).a();
                break L7;
              }
            }
            param3.field_w.a(param2, param0, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var7;
            stackOut_24_1 = new StringBuilder().append("he.H(").append(param0).append(',').append(param1).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          L9: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
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
              break L9;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L9;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final k c() {
        vk var1_ref = null;
        do {
            var1_ref = (vk) (Object) ((he) this).field_p.d(8192);
            if (var1_ref == null) {
                return null;
            }
        } while (null == var1_ref.field_w);
        return (k) (Object) var1_ref.field_w;
    }

    final static ae a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ae stackIn_4_0 = null;
        ae stackIn_8_0 = null;
        ae stackIn_18_0 = null;
        ae stackIn_22_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        ae stackOut_3_0 = null;
        ae stackOut_7_0 = null;
        ae stackOut_17_0 = null;
        ae stackOut_21_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var5 = wizardrun.field_H;
        try {
          var2_int = param1.length();
          if (0 == var2_int) {
            stackOut_3_0 = ok.field_f;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          } else {
            if (var2_int > 63) {
              stackOut_7_0 = kj.field_c;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            } else {
              var3 = 0;
              L0: while (true) {
                if (var2_int > var3) {
                  L1: {
                    var4 = param1.charAt(var3);
                    if (45 == var4) {
                      L2: {
                        if (var3 == 0) {
                          break L2;
                        } else {
                          if (-1 + var2_int != var3) {
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                      stackOut_17_0 = tl.field_d;
                      stackIn_18_0 = stackOut_17_0;
                      return stackIn_18_0;
                    } else {
                      if (-1 == jg.field_r.indexOf(var4)) {
                        stackOut_21_0 = tl.field_d;
                        stackIn_22_0 = stackOut_21_0;
                        return stackIn_22_0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  var3++;
                  continue L0;
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var2;
            stackOut_25_1 = new StringBuilder().append("he.J(").append(80).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L3;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L3;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ')');
        }
    }

    final k a() {
        vk var1 = (vk) (Object) ((he) this).field_p.b((byte) 124);
        if (var1 == null) {
            return null;
        }
        if (!(null == var1.field_w)) {
            return (k) (Object) var1.field_w;
        }
        return ((he) this).c();
    }

    final int d() {
        return 0;
    }

    he(fl param0) {
        ((he) this).field_p = new oi();
        ((he) this).field_o = new vi();
        try {
            ((he) this).field_t = param0;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "he.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0) {
        int var2 = 0;
        vk var3 = null;
        int var4 = 0;
        var4 = wizardrun.field_H;
        ((he) this).field_o.a(param0);
        var3 = (vk) (Object) ((he) this).field_p.b((byte) 122);
        L0: while (true) {
          if (var3 != null) {
            L1: {
              if (!((he) this).field_t.b(-1, var3)) {
                var2 = param0;
                L2: while (true) {
                  if (var3.field_E >= var2) {
                    this.a(var2, var3, -1);
                    var3.field_E = var3.field_E - var2;
                    break L1;
                  } else {
                    this.a(var3.field_E, var3, -1);
                    var2 = var2 - var3.field_E;
                    if (((he) this).field_t.a(0, (int[]) null, var3, var2, 0)) {
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
            var3 = (vk) (Object) ((he) this).field_p.d(8192);
            continue L0;
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new int[8192];
        field_r = "Be careful of the three different creatures.";
        field_s = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    }
}
