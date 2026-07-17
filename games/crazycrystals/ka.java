/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ka extends od {
    static boolean field_j;
    static int field_n;
    static db field_m;
    wb field_k;
    private wg field_o;
    tj field_l;

    final od a() {
        pl var1 = null;
        int var2 = 0;
        var2 = CrazyCrystals.field_B;
        L0: while (true) {
          var1 = (pl) (Object) ((ka) this).field_k.a(false);
          if (var1 != null) {
            if (null != var1.field_v) {
              return (od) (Object) var1.field_v;
            } else {
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    private final void a(pl param0, int param1, byte param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        wg stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        pl stackIn_7_2 = null;
        wg stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        pl stackIn_8_2 = null;
        wg stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        pl stackIn_9_2 = null;
        int stackIn_9_3 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        wg stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        pl stackOut_6_2 = null;
        wg stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        pl stackOut_8_2 = null;
        int stackOut_8_3 = 0;
        wg stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        pl stackOut_7_2 = null;
        int stackOut_7_3 = 0;
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
            if (param2 < -79) {
              L1: {
                if ((((ka) this).field_o.field_E[param0.field_i] & 4) == 0) {
                  break L1;
                } else {
                  if (param0.field_l >= 0) {
                    break L1;
                  } else {
                    var4_int = ((ka) this).field_o.field_G[param0.field_i] / id.field_m;
                    var5 = (var4_int + 1048575 + -param0.field_j) / var4_int;
                    param0.field_j = var4_int * param1 + param0.field_j & 1048575;
                    if (var5 > param1) {
                      break L1;
                    } else {
                      L2: {
                        if (((ka) this).field_o.field_v[param0.field_i] == 0) {
                          param0.field_v = kg.b(param0.field_t, param0.field_v.f(), param0.field_v.j(), param0.field_v.k());
                          break L2;
                        } else {
                          L3: {
                            param0.field_v = kg.b(param0.field_t, param0.field_v.f(), 0, param0.field_v.k());
                            stackOut_6_0 = ((ka) this).field_o;
                            stackOut_6_1 = 2;
                            stackOut_6_2 = (pl) param0;
                            stackIn_8_0 = stackOut_6_0;
                            stackIn_8_1 = stackOut_6_1;
                            stackIn_8_2 = stackOut_6_2;
                            stackIn_7_0 = stackOut_6_0;
                            stackIn_7_1 = stackOut_6_1;
                            stackIn_7_2 = stackOut_6_2;
                            if (param0.field_A.field_n[param0.field_y] >= 0) {
                              stackOut_8_0 = (wg) (Object) stackIn_8_0;
                              stackOut_8_1 = stackIn_8_1;
                              stackOut_8_2 = (pl) (Object) stackIn_8_2;
                              stackOut_8_3 = 0;
                              stackIn_9_0 = stackOut_8_0;
                              stackIn_9_1 = stackOut_8_1;
                              stackIn_9_2 = stackOut_8_2;
                              stackIn_9_3 = stackOut_8_3;
                              break L3;
                            } else {
                              stackOut_7_0 = (wg) (Object) stackIn_7_0;
                              stackOut_7_1 = stackIn_7_1;
                              stackOut_7_2 = (pl) (Object) stackIn_7_2;
                              stackOut_7_3 = 1;
                              stackIn_9_0 = stackOut_7_0;
                              stackIn_9_1 = stackOut_7_1;
                              stackIn_9_2 = stackOut_7_2;
                              stackIn_9_3 = stackOut_7_3;
                              break L3;
                            }
                          }
                          ((wg) (Object) stackIn_9_0).a((byte) stackIn_9_1, stackIn_9_2, stackIn_9_3 != 0);
                          break L2;
                        }
                      }
                      L4: {
                        if (0 > param0.field_A.field_n[param0.field_y]) {
                          param0.field_v.f(-1);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      param1 = param0.field_j / var4_int;
                      break L1;
                    }
                  }
                }
              }
              param0.field_v.a(param1);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4;
            stackOut_17_1 = new StringBuilder().append("ka.D(");
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
          throw dn.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final int c() {
        return 0;
    }

    final od d() {
        pl var1 = null;
        var1 = (pl) (Object) ((ka) this).field_k.g(32073);
        if (var1 != null) {
          if (var1.field_v != null) {
            return (od) (Object) var1.field_v;
          } else {
            return ((ka) this).a();
          }
        } else {
          return null;
        }
    }

    final void a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        pl var6 = null;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var7 = CrazyCrystals.field_B;
        try {
          L0: {
            ((ka) this).field_l.a(param0, param1, param2);
            var6 = (pl) (Object) ((ka) this).field_k.g(32073);
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                if (((ka) this).field_o.a(var6, (byte) 100)) {
                  var6 = (pl) (Object) ((ka) this).field_k.a(false);
                  continue L1;
                } else {
                  var4_int = param1;
                  var5 = param2;
                  L2: while (true) {
                    if (var5 <= var6.field_k) {
                      this.a(param0, var6, var4_int, -1048576, var5, var5 + var4_int);
                      var6.field_k = var6.field_k - var5;
                      var6 = (pl) (Object) ((ka) this).field_k.a(false);
                      continue L1;
                    } else {
                      this.a(param0, var6, var4_int, -1048576, var6.field_k, var5 + var4_int);
                      var5 = var5 - var6.field_k;
                      var4_int = var4_int + var6.field_k;
                      if (!((ka) this).field_o.a(var5, var4_int, param0, var6, (byte) 98)) {
                        continue L2;
                      } else {
                        var6 = (pl) (Object) ((ka) this).field_k.a(false);
                        continue L1;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("ka.N(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    public static void a(byte param0) {
        int var1 = 0;
        field_m = null;
    }

    private final void a(int[] param0, pl param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        kg var11 = null;
        int var12 = 0;
        wg stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        pl stackIn_13_2 = null;
        wg stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        pl stackIn_14_2 = null;
        wg stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        pl stackIn_15_2 = null;
        int stackIn_15_3 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        wg stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        pl stackOut_12_2 = null;
        wg stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        pl stackOut_14_2 = null;
        int stackOut_14_3 = 0;
        wg stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        pl stackOut_13_2 = null;
        int stackOut_13_3 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var12 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (param3 == -1048576) {
                break L1;
              } else {
                od discarded$1 = ((ka) this).a();
                break L1;
              }
            }
            L2: {
              if (0 == (4 & ((ka) this).field_o.field_E[param1.field_i])) {
                break L2;
              } else {
                if (param1.field_l < 0) {
                  var7_int = ((ka) this).field_o.field_G[param1.field_i] / id.field_m;
                  L3: while (true) {
                    var8 = (-param1.field_j + var7_int + 1048575) / var7_int;
                    if (var8 > param4) {
                      param1.field_j = param1.field_j + var7_int * param4;
                      break L2;
                    } else {
                      L4: {
                        param1.field_v.a(param0, param2, var8);
                        param4 = param4 - var8;
                        param2 = param2 + var8;
                        param1.field_j = param1.field_j + (-1048576 + var7_int * var8);
                        var9 = id.field_m / 100;
                        var10 = 262144 / var7_int;
                        if (var10 >= var9) {
                          break L4;
                        } else {
                          var9 = var10;
                          break L4;
                        }
                      }
                      L5: {
                        var11 = param1.field_v;
                        if (((ka) this).field_o.field_v[param1.field_i] != 0) {
                          L6: {
                            param1.field_v = kg.b(param1.field_t, var11.f(), 0, var11.k());
                            stackOut_12_0 = ((ka) this).field_o;
                            stackOut_12_1 = 2;
                            stackOut_12_2 = (pl) param1;
                            stackIn_14_0 = stackOut_12_0;
                            stackIn_14_1 = stackOut_12_1;
                            stackIn_14_2 = stackOut_12_2;
                            stackIn_13_0 = stackOut_12_0;
                            stackIn_13_1 = stackOut_12_1;
                            stackIn_13_2 = stackOut_12_2;
                            if (param1.field_A.field_n[param1.field_y] >= 0) {
                              stackOut_14_0 = (wg) (Object) stackIn_14_0;
                              stackOut_14_1 = stackIn_14_1;
                              stackOut_14_2 = (pl) (Object) stackIn_14_2;
                              stackOut_14_3 = 0;
                              stackIn_15_0 = stackOut_14_0;
                              stackIn_15_1 = stackOut_14_1;
                              stackIn_15_2 = stackOut_14_2;
                              stackIn_15_3 = stackOut_14_3;
                              break L6;
                            } else {
                              stackOut_13_0 = (wg) (Object) stackIn_13_0;
                              stackOut_13_1 = stackIn_13_1;
                              stackOut_13_2 = (pl) (Object) stackIn_13_2;
                              stackOut_13_3 = 1;
                              stackIn_15_0 = stackOut_13_0;
                              stackIn_15_1 = stackOut_13_1;
                              stackIn_15_2 = stackOut_13_2;
                              stackIn_15_3 = stackOut_13_3;
                              break L6;
                            }
                          }
                          ((wg) (Object) stackIn_15_0).a((byte) stackIn_15_1, stackIn_15_2, stackIn_15_3 != 0);
                          param1.field_v.b(var9, var11.j());
                          break L5;
                        } else {
                          param1.field_v = kg.b(param1.field_t, var11.f(), var11.j(), var11.k());
                          break L5;
                        }
                      }
                      L7: {
                        if (param1.field_A.field_n[param1.field_y] >= 0) {
                          break L7;
                        } else {
                          param1.field_v.f(-1);
                          break L7;
                        }
                      }
                      var11.d(var9);
                      var11.a(param0, param2, param5 + -param2);
                      if (!var11.e()) {
                        continue L3;
                      } else {
                        ((ka) this).field_l.b((od) (Object) var11);
                        continue L3;
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
            }
            param1.field_v.a(param0, param2, param4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var7;
            stackOut_23_1 = new StringBuilder().append("ka.C(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          L9: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L9;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L9;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final void a(int param0) {
        int var2 = 0;
        pl var3 = null;
        int var4 = 0;
        var4 = CrazyCrystals.field_B;
        ((ka) this).field_l.a(param0);
        var3 = (pl) (Object) ((ka) this).field_k.g(32073);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            if (!((ka) this).field_o.a(var3, (byte) 113)) {
              var2 = param0;
              L1: while (true) {
                if (var3.field_k >= var2) {
                  this.a(var3, var2, (byte) -101);
                  var3.field_k = var3.field_k - var2;
                  var3 = (pl) (Object) ((ka) this).field_k.a(false);
                  continue L0;
                } else {
                  this.a(var3, var3.field_k, (byte) -116);
                  var2 = var2 - var3.field_k;
                  if (!((ka) this).field_o.a(var2, 0, (int[]) null, var3, (byte) 94)) {
                    continue L1;
                  } else {
                    var3 = (pl) (Object) ((ka) this).field_k.a(false);
                    continue L0;
                  }
                }
              }
            } else {
              var3 = (pl) (Object) ((ka) this).field_k.a(false);
              continue L0;
            }
          }
        }
    }

    ka(wg param0) {
        ((ka) this).field_k = new wb();
        ((ka) this).field_l = new tj();
        try {
            ((ka) this).field_o = param0;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "ka.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = 128;
    }
}
