/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg extends di {
    static String field_l;
    im field_k;
    static String[] field_n;
    private lj field_j;
    v field_m;

    final di a() {
        he var1 = (he) (Object) ((jg) this).field_k.b((byte) -75);
        if (var1 == null) {
            return null;
        }
        if (!(var1.field_l == null)) {
            return (di) (Object) var1.field_l;
        }
        return ((jg) this).d();
    }

    private final void a(int param0, he param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        lj stackIn_8_0 = null;
        he stackIn_8_1 = null;
        lj stackIn_9_0 = null;
        he stackIn_9_1 = null;
        lj stackIn_10_0 = null;
        he stackIn_10_1 = null;
        int stackIn_10_2 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        lj stackOut_7_0 = null;
        he stackOut_7_1 = null;
        lj stackOut_9_0 = null;
        he stackOut_9_1 = null;
        int stackOut_9_2 = 0;
        lj stackOut_8_0 = null;
        he stackOut_8_1 = null;
        int stackOut_8_2 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              if ((((jg) this).field_j.field_o[param1.field_F] & 4) == 0) {
                break L1;
              } else {
                if (0 > param1.field_n) {
                  var4_int = ((jg) this).field_j.field_L[param1.field_F] / la.field_c;
                  var5 = (var4_int + (1048575 + -param1.field_i)) / var4_int;
                  param1.field_i = 1048575 & param0 * var4_int + param1.field_i;
                  if (var5 <= param0) {
                    L2: {
                      if (((jg) this).field_j.field_D[param1.field_F] != 0) {
                        L3: {
                          param1.field_l = bb.a(param1.field_D, param1.field_l.g(), 0, param1.field_l.l());
                          stackOut_7_0 = ((jg) this).field_j;
                          stackOut_7_1 = (he) param1;
                          stackIn_9_0 = stackOut_7_0;
                          stackIn_9_1 = stackOut_7_1;
                          stackIn_8_0 = stackOut_7_0;
                          stackIn_8_1 = stackOut_7_1;
                          if (param1.field_g.field_m[param1.field_h] >= 0) {
                            stackOut_9_0 = (lj) (Object) stackIn_9_0;
                            stackOut_9_1 = (he) (Object) stackIn_9_1;
                            stackOut_9_2 = 0;
                            stackIn_10_0 = stackOut_9_0;
                            stackIn_10_1 = stackOut_9_1;
                            stackIn_10_2 = stackOut_9_2;
                            break L3;
                          } else {
                            stackOut_8_0 = (lj) (Object) stackIn_8_0;
                            stackOut_8_1 = (he) (Object) stackIn_8_1;
                            stackOut_8_2 = 1;
                            stackIn_10_0 = stackOut_8_0;
                            stackIn_10_1 = stackOut_8_1;
                            stackIn_10_2 = stackOut_8_2;
                            break L3;
                          }
                        }
                        ((lj) (Object) stackIn_10_0).a(stackIn_10_1, stackIn_10_2 != 0, 9929);
                        break L2;
                      } else {
                        param1.field_l = bb.a(param1.field_D, param1.field_l.g(), param1.field_l.j(), param1.field_l.l());
                        break L2;
                      }
                    }
                    L4: {
                      if (param1.field_g.field_m[param1.field_h] < 0) {
                        param1.field_l.d(-1);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    param0 = param1.field_i / var4_int;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  param1.field_l.c(param0);
                  return;
                }
              }
            }
            param1.field_l.c(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4;
            stackOut_17_1 = new StringBuilder().append("jg.H(").append(param0).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + -23887 + 41);
        }
    }

    final di d() {
        he var1 = null;
        L0: while (true) {
          var1 = (he) (Object) ((jg) this).field_k.d(853);
          if (var1 != null) {
            if (var1.field_l != null) {
              return (di) (Object) var1.field_l;
            } else {
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    private final void a(int[] param0, int param1, int param2, boolean param3, he param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        bb var11 = null;
        int var12 = 0;
        lj stackIn_12_0 = null;
        he stackIn_12_1 = null;
        lj stackIn_13_0 = null;
        he stackIn_13_1 = null;
        lj stackIn_14_0 = null;
        he stackIn_14_1 = null;
        int stackIn_14_2 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        lj stackOut_11_0 = null;
        he stackOut_11_1 = null;
        lj stackOut_13_0 = null;
        he stackOut_13_1 = null;
        int stackOut_13_2 = 0;
        lj stackOut_12_0 = null;
        he stackOut_12_1 = null;
        int stackOut_12_2 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var12 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3) {
                break L1;
              } else {
                ((jg) this).field_j = null;
                break L1;
              }
            }
            L2: {
              if ((4 & ((jg) this).field_j.field_o[param4.field_F]) == 0) {
                break L2;
              } else {
                if (param4.field_n >= 0) {
                  break L2;
                } else {
                  var7_int = ((jg) this).field_j.field_L[param4.field_F] / la.field_c;
                  L3: while (true) {
                    var8 = (-param4.field_i + (1048575 + var7_int)) / var7_int;
                    if (var8 > param5) {
                      param4.field_i = param4.field_i + var7_int * param5;
                      break L2;
                    } else {
                      L4: {
                        param4.field_l.b(param0, param2, var8);
                        param4.field_i = param4.field_i + (-1048576 + var8 * var7_int);
                        param2 = param2 + var8;
                        param5 = param5 - var8;
                        var9 = la.field_c / 100;
                        var10 = 262144 / var7_int;
                        if (var9 > var10) {
                          var9 = var10;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        var11 = param4.field_l;
                        if (0 == ((jg) this).field_j.field_D[param4.field_F]) {
                          param4.field_l = bb.a(param4.field_D, var11.g(), var11.j(), var11.l());
                          break L5;
                        } else {
                          L6: {
                            param4.field_l = bb.a(param4.field_D, var11.g(), 0, var11.l());
                            stackOut_11_0 = ((jg) this).field_j;
                            stackOut_11_1 = (he) param4;
                            stackIn_13_0 = stackOut_11_0;
                            stackIn_13_1 = stackOut_11_1;
                            stackIn_12_0 = stackOut_11_0;
                            stackIn_12_1 = stackOut_11_1;
                            if (param4.field_g.field_m[param4.field_h] >= 0) {
                              stackOut_13_0 = (lj) (Object) stackIn_13_0;
                              stackOut_13_1 = (he) (Object) stackIn_13_1;
                              stackOut_13_2 = 0;
                              stackIn_14_0 = stackOut_13_0;
                              stackIn_14_1 = stackOut_13_1;
                              stackIn_14_2 = stackOut_13_2;
                              break L6;
                            } else {
                              stackOut_12_0 = (lj) (Object) stackIn_12_0;
                              stackOut_12_1 = (he) (Object) stackIn_12_1;
                              stackOut_12_2 = 1;
                              stackIn_14_0 = stackOut_12_0;
                              stackIn_14_1 = stackOut_12_1;
                              stackIn_14_2 = stackOut_12_2;
                              break L6;
                            }
                          }
                          ((lj) (Object) stackIn_14_0).a(stackIn_14_1, stackIn_14_2 != 0, 9929);
                          param4.field_l.d(var9, var11.j());
                          break L5;
                        }
                      }
                      L7: {
                        if (param4.field_g.field_m[param4.field_h] < 0) {
                          param4.field_l.d(-1);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var11.f(var9);
                      var11.b(param0, param2, param1 + -param2);
                      if (var11.e()) {
                        ((jg) this).field_m.a((di) (Object) var11);
                        continue L3;
                      } else {
                        continue L3;
                      }
                    }
                  }
                }
              }
            }
            param4.field_l.b(param0, param2, param5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var7;
            stackOut_25_1 = new StringBuilder().append("jg.I(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
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
          L9: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param4 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L9;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L9;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 44 + param5 + 41);
        }
    }

    final int c() {
        return 0;
    }

    final void c(int param0) {
        int var2 = 0;
        he var3 = null;
        int var4 = 0;
        var4 = OrbDefence.field_D ? 1 : 0;
        ((jg) this).field_m.c(param0);
        var3 = (he) (Object) ((jg) this).field_k.b((byte) 117);
        L0: while (true) {
          if (var3 != null) {
            L1: {
              if (((jg) this).field_j.a(var3, (byte) 90)) {
                break L1;
              } else {
                var2 = param0;
                L2: while (true) {
                  if (var3.field_w >= var2) {
                    this.a(var2, var3, -23887);
                    var3.field_w = var3.field_w - var2;
                    break L1;
                  } else {
                    this.a(var3.field_w, var3, -23887);
                    var2 = var2 - var3.field_w;
                    if (((jg) this).field_j.a(4160, var3, 0, var2, (int[]) null)) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  }
                }
              }
            }
            var3 = (he) (Object) ((jg) this).field_k.d(853);
            continue L0;
          } else {
            return;
          }
        }
    }

    final void b(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        he var6 = null;
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
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            ((jg) this).field_m.b(param0, param1, param2);
            var6 = (he) (Object) ((jg) this).field_k.b((byte) -96);
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                L2: {
                  if (((jg) this).field_j.a(var6, (byte) 98)) {
                    break L2;
                  } else {
                    var4_int = param1;
                    var5 = param2;
                    L3: while (true) {
                      if (var6.field_w >= var5) {
                        this.a(param0, var4_int + var5, var4_int, true, var6, var5);
                        var6.field_w = var6.field_w - var5;
                        break L2;
                      } else {
                        this.a(param0, var4_int + var5, var4_int, true, var6, var6.field_w);
                        var5 = var5 - var6.field_w;
                        var4_int = var4_int + var6.field_w;
                        if (!((jg) this).field_j.a(4160, var6, var4_int, var5, param0)) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                var6 = (he) (Object) ((jg) this).field_k.d(853);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("jg.B(");
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
          throw dd.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    public static void d(int param0) {
        field_l = null;
        if (param0 < 34) {
            jg.d(-51);
            field_n = null;
            return;
        }
        field_n = null;
    }

    jg(lj param0) {
        ((jg) this).field_k = new im();
        ((jg) this).field_m = new v();
        try {
            ((jg) this).field_j = param0;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "jg.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "FAST BLAST";
    }
}
