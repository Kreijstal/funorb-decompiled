/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba extends gq {
    private gd field_n;
    static String field_j;
    th field_k;
    static String field_p;
    static int field_q;
    static String field_l;
    static int field_m;
    vp field_o;

    final void b(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        mb var6 = null;
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
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            ((ba) this).field_o.b(param0, param1, param2);
            var6 = (mb) (Object) ((ba) this).field_k.c(76);
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                L2: {
                  if (((ba) this).field_n.a(-1, var6)) {
                    break L2;
                  } else {
                    var4_int = param1;
                    var5 = param2;
                    L3: while (true) {
                      if (var5 <= var6.field_D) {
                        this.a(var4_int, 14531, var5, var6, param0, var4_int + var5);
                        var6.field_D = var6.field_D - var5;
                        break L2;
                      } else {
                        this.a(var4_int, 14531, var6.field_D, var6, param0, var5 + var4_int);
                        var5 = var5 - var6.field_D;
                        var4_int = var4_int + var6.field_D;
                        if (((ba) this).field_n.a(var6, var5, var4_int, param0, -115)) {
                          break L2;
                        } else {
                          continue L3;
                        }
                      }
                    }
                  }
                }
                var6 = (mb) (Object) ((ba) this).field_k.b(6);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("ba.F(");
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
          throw fa.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    private final void a(int param0, int param1, int param2, mb param3, int[] param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        uj var11 = null;
        int var12 = 0;
        gd stackIn_12_0 = null;
        gd stackIn_13_0 = null;
        gd stackIn_14_0 = null;
        int stackIn_14_1 = 0;
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
        gd stackOut_11_0 = null;
        gd stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        gd stackOut_12_0 = null;
        int stackOut_12_1 = 0;
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
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((4 & ((ba) this).field_n.field_H[param3.field_o]) == 0) {
                break L1;
              } else {
                if (param3.field_l < 0) {
                  var7_int = ((ba) this).field_n.field_n[param3.field_o] / gp.field_p;
                  L2: while (true) {
                    var8 = (var7_int + 1048575 + -param3.field_w) / var7_int;
                    if (param2 < var8) {
                      param3.field_w = param3.field_w + var7_int * param2;
                      break L1;
                    } else {
                      L3: {
                        param3.field_C.b(param4, param0, var8);
                        param3.field_w = param3.field_w + (-1048576 + var7_int * var8);
                        param0 = param0 + var8;
                        param2 = param2 - var8;
                        var9 = gp.field_p / 100;
                        var10 = 262144 / var7_int;
                        if (var10 >= var9) {
                          break L3;
                        } else {
                          var9 = var10;
                          break L3;
                        }
                      }
                      L4: {
                        var11 = param3.field_C;
                        if (((ba) this).field_n.field_y[param3.field_o] == 0) {
                          param3.field_C = uj.a(param3.field_f, var11.l(), var11.h(), var11.g());
                          break L4;
                        } else {
                          L5: {
                            param3.field_C = uj.a(param3.field_f, var11.l(), 0, var11.g());
                            stackOut_11_0 = ((ba) this).field_n;
                            stackIn_13_0 = stackOut_11_0;
                            stackIn_12_0 = stackOut_11_0;
                            if (param3.field_x.field_g[param3.field_p] >= 0) {
                              stackOut_13_0 = (gd) (Object) stackIn_13_0;
                              stackOut_13_1 = 0;
                              stackIn_14_0 = stackOut_13_0;
                              stackIn_14_1 = stackOut_13_1;
                              break L5;
                            } else {
                              stackOut_12_0 = (gd) (Object) stackIn_12_0;
                              stackOut_12_1 = 1;
                              stackIn_14_0 = stackOut_12_0;
                              stackIn_14_1 = stackOut_12_1;
                              break L5;
                            }
                          }
                          ((gd) (Object) stackIn_14_0).a(stackIn_14_1 != 0, (byte) -76, param3);
                          param3.field_C.a(var9, var11.h());
                          break L4;
                        }
                      }
                      L6: {
                        if (param3.field_x.field_g[param3.field_p] < 0) {
                          param3.field_C.g(-1);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var11.e(var9);
                      var11.b(param4, param0, param5 + -param0);
                      if (var11.j()) {
                        ((ba) this).field_o.b((gq) (Object) var11);
                        continue L2;
                      } else {
                        continue L2;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            param3.field_C.b(param4, param0, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var7;
            stackOut_25_1 = new StringBuilder().append("ba.C(").append(param0).append(44).append(14531).append(44).append(param2).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L7;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L7;
            }
          }
          L8: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(44);
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
              break L8;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L8;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 44 + param5 + 41);
        }
    }

    final gq b() {
        mb var1 = (mb) (Object) ((ba) this).field_k.c(76);
        if (var1 == null) {
            return null;
        }
        if (!(null == var1.field_C)) {
            return (gq) (Object) var1.field_C;
        }
        return ((ba) this).d();
    }

    private final void a(mb param0, int param1) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        gd stackIn_6_0 = null;
        gd stackIn_7_0 = null;
        gd stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        gd stackOut_5_0 = null;
        gd stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        gd stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          if ((4 & ((ba) this).field_n.field_H[param0.field_o]) == -1) {
            param0.field_C.a(param1);
            return;
          } else {
            if (-1 <= param0.field_l) {
              param0.field_C.a(param1);
              return;
            } else {
              var4_int = ((ba) this).field_n.field_n[param0.field_o] / gp.field_p;
              var5 = (-param0.field_w + (1048575 - -var4_int)) / var4_int;
              param0.field_w = param0.field_w + var4_int * param1 & 1048575;
              if (param1 < var5) {
                param0.field_C.a(param1);
                return;
              } else {
                L0: {
                  if (0 != ((ba) this).field_n.field_y[param0.field_o]) {
                    L1: {
                      param0.field_C = uj.a(param0.field_f, param0.field_C.l(), 0, param0.field_C.g());
                      stackOut_5_0 = ((ba) this).field_n;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_6_0 = stackOut_5_0;
                      if (0 <= param0.field_x.field_g[param0.field_p]) {
                        stackOut_7_0 = (gd) (Object) stackIn_7_0;
                        stackOut_7_1 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        break L1;
                      } else {
                        stackOut_6_0 = (gd) (Object) stackIn_6_0;
                        stackOut_6_1 = 1;
                        stackIn_8_0 = stackOut_6_0;
                        stackIn_8_1 = stackOut_6_1;
                        break L1;
                      }
                    }
                    ((gd) (Object) stackIn_8_0).a(stackIn_8_1 != 0, (byte) -80, param0);
                    break L0;
                  } else {
                    param0.field_C = uj.a(param0.field_f, param0.field_C.l(), param0.field_C.h(), param0.field_C.g());
                    break L0;
                  }
                }
                L2: {
                  if (param0.field_x.field_g[param0.field_p] >= 0) {
                    break L2;
                  } else {
                    param0.field_C.g(-1);
                    break L2;
                  }
                }
                param1 = param0.field_w / var4_int;
                param0.field_C.a(param1);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4;
            stackOut_17_1 = new StringBuilder().append("ba.E(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param1 + 44 + 0 + 41);
        }
    }

    public static void d(int param0) {
        field_j = null;
        field_p = null;
        field_l = null;
    }

    final void a(int param0) {
        int var2 = 0;
        mb var3 = null;
        int var4 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        ((ba) this).field_o.a(param0);
        var3 = (mb) (Object) ((ba) this).field_k.c(91);
        L0: while (true) {
          if (var3 != null) {
            L1: {
              if (((ba) this).field_n.a(-1, var3)) {
                break L1;
              } else {
                var2 = param0;
                L2: while (true) {
                  if (var3.field_D >= var2) {
                    int discarded$9 = 0;
                    this.a(var3, var2);
                    var3.field_D = var3.field_D - var2;
                    break L1;
                  } else {
                    int discarded$10 = 0;
                    this.a(var3, var3.field_D);
                    var2 = var2 - var3.field_D;
                    if (!((ba) this).field_n.a(var3, var2, 0, (int[]) null, 22)) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            var3 = (mb) (Object) ((ba) this).field_k.b(6);
            continue L0;
          } else {
            return;
          }
        }
    }

    final int a() {
        return 0;
    }

    final gq d() {
        mb var1 = null;
        L0: while (true) {
          var1 = (mb) (Object) ((ba) this).field_k.b(6);
          if (var1 != null) {
            if (var1.field_C != null) {
              return (gq) (Object) var1.field_C;
            } else {
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    final static boolean c(int param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        var1_ref = (Object) (Object) um.field_c;
        synchronized (var1_ref) {
          L0: {
            if (lp.field_j != kj.field_j) {
              sj.field_p = td.field_a[lp.field_j];
              pn.field_d = ta.field_pb[lp.field_j];
              lp.field_j = lp.field_j + 1 & 127;
              stackOut_4_0 = 1;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        }
        return stackIn_5_0 != 0;
    }

    ba(gd param0) {
        ((ba) this).field_k = new th();
        ((ba) this).field_o = new vp();
        try {
            ((ba) this).field_n = param0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "ba.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = 2;
        field_l = "If you do nothing the game will revert to normal view in <%0> second.";
        field_j = "Name is available";
        field_p = "Unfortunately you are not eligible to create an account.";
    }
}
