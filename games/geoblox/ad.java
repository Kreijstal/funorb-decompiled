/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad extends ia {
    private kj field_k;
    static String field_n;
    static boolean field_p;
    tf field_l;
    static int field_j;
    ob field_m;
    static int field_o;

    public static void c(int param0) {
        field_n = null;
    }

    final int d() {
        return 0;
    }

    final void a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        pc var6 = null;
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
        try {
          L0: {
            ((ad) this).field_m.a(param0, param1, param2);
            var6 = (pc) (Object) ((ad) this).field_l.g(0);
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                L2: {
                  if (!((ad) this).field_k.b(var6, -1)) {
                    var4_int = param1;
                    var5 = param2;
                    L3: while (true) {
                      if (var5 <= var6.field_g) {
                        this.a(var5, (byte) -69, var5 + var4_int, param0, var6, var4_int);
                        var6.field_g = var6.field_g - var5;
                        break L2;
                      } else {
                        this.a(var6.field_g, (byte) -37, var4_int + var5, param0, var6, var4_int);
                        var5 = var5 - var6.field_g;
                        var4_int = var4_int + var6.field_g;
                        if (!((ad) this).field_k.a(var5, var4_int, param0, var6, false)) {
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
                var6 = (pc) (Object) ((ad) this).field_l.d(1);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("ad.C(");
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
          throw t.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    private final void a(int param0, pc param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        kj stackIn_5_0 = null;
        pc stackIn_5_1 = null;
        int stackIn_5_2 = 0;
        kj stackIn_6_0 = null;
        pc stackIn_6_1 = null;
        int stackIn_6_2 = 0;
        kj stackIn_7_0 = null;
        pc stackIn_7_1 = null;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        kj stackOut_4_0 = null;
        pc stackOut_4_1 = null;
        int stackOut_4_2 = 0;
        kj stackOut_6_0 = null;
        pc stackOut_6_1 = null;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        kj stackOut_5_0 = null;
        pc stackOut_5_1 = null;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
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
              if ((((ad) this).field_k.field_m[param1.field_t] & 4) == 0) {
                break L1;
              } else {
                if (param1.field_y >= 0) {
                  break L1;
                } else {
                  var4_int = ((ad) this).field_k.field_n[param1.field_t] / qk.field_j;
                  var5 = (-param1.field_B + (1048575 + var4_int)) / var4_int;
                  param1.field_B = 1048575 & param1.field_B + param2 * var4_int;
                  if (param2 < var5) {
                    break L1;
                  } else {
                    L2: {
                      if (((ad) this).field_k.field_u[param1.field_t] == 0) {
                        param1.field_u = kl.a(param1.field_i, param1.field_u.h(), param1.field_u.i(), param1.field_u.k());
                        break L2;
                      } else {
                        L3: {
                          param1.field_u = kl.a(param1.field_i, param1.field_u.h(), 0, param1.field_u.k());
                          stackOut_4_0 = ((ad) this).field_k;
                          stackOut_4_1 = (pc) param1;
                          stackOut_4_2 = -70;
                          stackIn_6_0 = stackOut_4_0;
                          stackIn_6_1 = stackOut_4_1;
                          stackIn_6_2 = stackOut_4_2;
                          stackIn_5_0 = stackOut_4_0;
                          stackIn_5_1 = stackOut_4_1;
                          stackIn_5_2 = stackOut_4_2;
                          if (param1.field_z.field_j[param1.field_D] >= 0) {
                            stackOut_6_0 = (kj) (Object) stackIn_6_0;
                            stackOut_6_1 = (pc) (Object) stackIn_6_1;
                            stackOut_6_2 = stackIn_6_2;
                            stackOut_6_3 = 0;
                            stackIn_7_0 = stackOut_6_0;
                            stackIn_7_1 = stackOut_6_1;
                            stackIn_7_2 = stackOut_6_2;
                            stackIn_7_3 = stackOut_6_3;
                            break L3;
                          } else {
                            stackOut_5_0 = (kj) (Object) stackIn_5_0;
                            stackOut_5_1 = (pc) (Object) stackIn_5_1;
                            stackOut_5_2 = stackIn_5_2;
                            stackOut_5_3 = 1;
                            stackIn_7_0 = stackOut_5_0;
                            stackIn_7_1 = stackOut_5_1;
                            stackIn_7_2 = stackOut_5_2;
                            stackIn_7_3 = stackOut_5_3;
                            break L3;
                          }
                        }
                        ((kj) (Object) stackIn_7_0).a(stackIn_7_1, (byte) stackIn_7_2, stackIn_7_3 != 0);
                        break L2;
                      }
                    }
                    L4: {
                      if (param1.field_z.field_j[param1.field_D] >= 0) {
                        break L4;
                      } else {
                        param1.field_u.g(-1);
                        break L4;
                      }
                    }
                    param2 = param1.field_B / var4_int;
                    break L1;
                  }
                }
              }
            }
            if (param0 == -1) {
              param1.field_u.b(param2);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var4;
            stackOut_16_1 = new StringBuilder().append("ad.I(").append(param0).append(44);
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
          throw t.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param2 + 41);
        }
    }

    final static void a(byte param0) {
        dm var1 = null;
        dm var2 = null;
        int var3 = 0;
        int var4 = Geoblox.field_C;
        try {
            if (param0 != -32) {
                field_p = false;
            }
            var1 = new dm(540, 140);
            Geoblox.a(1, var1);
            mh.b();
            vb.c();
            gb.field_f = 0;
            ck.a((byte) -73);
            var2 = var1.b();
            for (var3 = 0; var3 < 15; var3++) {
                var2.a(-2, -2, 16777215);
                vb.e(4, 4, 0, 0, 540, 140);
            }
            cd.field_l.e();
            var1.d(0, 0);
            id.a(true);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "ad.H(" + param0 + 41);
        }
    }

    final void b(int param0) {
        int var2 = 0;
        pc var3 = null;
        ((ad) this).field_m.b(param0);
        var3 = (pc) (Object) ((ad) this).field_l.g(0);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              if (!((ad) this).field_k.b(var3, -1)) {
                var2 = param0;
                L2: while (true) {
                  if (var2 <= var3.field_g) {
                    this.a(-1, var3, var2);
                    var3.field_g = var3.field_g - var2;
                    break L1;
                  } else {
                    this.a(-1, var3, var3.field_g);
                    var2 = var2 - var3.field_g;
                    if (((ad) this).field_k.a(var2, 0, (int[]) null, var3, false)) {
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
            var3 = (pc) (Object) ((ad) this).field_l.d(1);
            continue L0;
          }
        }
    }

    final ia c() {
        pc var1 = null;
        int var2 = 0;
        var2 = Geoblox.field_C;
        L0: while (true) {
          var1 = (pc) (Object) ((ad) this).field_l.d(1);
          if (var1 != null) {
            if (var1.field_u != null) {
              return (ia) (Object) var1.field_u;
            } else {
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    final ia b() {
        pc var1 = (pc) (Object) ((ad) this).field_l.g(0);
        if (var1 == null) {
            return null;
        }
        if (!(null == var1.field_u)) {
            return (ia) (Object) var1.field_u;
        }
        return ((ad) this).c();
    }

    private final void a(int param0, byte param1, int param2, int[] param3, pc param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        kl var11 = null;
        kj stackIn_10_0 = null;
        pc stackIn_10_1 = null;
        int stackIn_10_2 = 0;
        kj stackIn_11_0 = null;
        pc stackIn_11_1 = null;
        int stackIn_11_2 = 0;
        kj stackIn_12_0 = null;
        pc stackIn_12_1 = null;
        int stackIn_12_2 = 0;
        int stackIn_12_3 = 0;
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
        kj stackOut_9_0 = null;
        pc stackOut_9_1 = null;
        int stackOut_9_2 = 0;
        kj stackOut_11_0 = null;
        pc stackOut_11_1 = null;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        kj stackOut_10_0 = null;
        pc stackOut_10_1 = null;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
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
        try {
          L0: {
            L1: {
              if ((4 & ((ad) this).field_k.field_m[param4.field_t]) == 0) {
                break L1;
              } else {
                if (param4.field_y >= 0) {
                  break L1;
                } else {
                  var7_int = ((ad) this).field_k.field_n[param4.field_t] / qk.field_j;
                  L2: while (true) {
                    var8 = (-param4.field_B + (var7_int + 1048575)) / var7_int;
                    if (param0 >= var8) {
                      L3: {
                        param4.field_u.a(param3, param5, var8);
                        param0 = param0 - var8;
                        param5 = param5 + var8;
                        param4.field_B = param4.field_B + (-1048576 + var7_int * var8);
                        var9 = qk.field_j / 100;
                        var10 = 262144 / var7_int;
                        if (var10 < var9) {
                          var9 = var10;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        var11 = param4.field_u;
                        if (((ad) this).field_k.field_u[param4.field_t] == 0) {
                          param4.field_u = kl.a(param4.field_i, var11.h(), var11.i(), var11.k());
                          break L4;
                        } else {
                          L5: {
                            param4.field_u = kl.a(param4.field_i, var11.h(), 0, var11.k());
                            stackOut_9_0 = ((ad) this).field_k;
                            stackOut_9_1 = (pc) param4;
                            stackOut_9_2 = -70;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            stackIn_10_0 = stackOut_9_0;
                            stackIn_10_1 = stackOut_9_1;
                            stackIn_10_2 = stackOut_9_2;
                            if (param4.field_z.field_j[param4.field_D] >= 0) {
                              stackOut_11_0 = (kj) (Object) stackIn_11_0;
                              stackOut_11_1 = (pc) (Object) stackIn_11_1;
                              stackOut_11_2 = stackIn_11_2;
                              stackOut_11_3 = 0;
                              stackIn_12_0 = stackOut_11_0;
                              stackIn_12_1 = stackOut_11_1;
                              stackIn_12_2 = stackOut_11_2;
                              stackIn_12_3 = stackOut_11_3;
                              break L5;
                            } else {
                              stackOut_10_0 = (kj) (Object) stackIn_10_0;
                              stackOut_10_1 = (pc) (Object) stackIn_10_1;
                              stackOut_10_2 = stackIn_10_2;
                              stackOut_10_3 = 1;
                              stackIn_12_0 = stackOut_10_0;
                              stackIn_12_1 = stackOut_10_1;
                              stackIn_12_2 = stackOut_10_2;
                              stackIn_12_3 = stackOut_10_3;
                              break L5;
                            }
                          }
                          ((kj) (Object) stackIn_12_0).a(stackIn_12_1, (byte) stackIn_12_2, stackIn_12_3 != 0);
                          param4.field_u.c(var9, var11.i());
                          break L4;
                        }
                      }
                      L6: {
                        if (param4.field_z.field_j[param4.field_D] < 0) {
                          param4.field_u.g(-1);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var11.c(var9);
                      var11.a(param3, param5, param2 + -param5);
                      if (!var11.g()) {
                        continue L2;
                      } else {
                        ((ad) this).field_m.a((ia) (Object) var11);
                        continue L2;
                      }
                    } else {
                      param4.field_B = param4.field_B + param0 * var7_int;
                      break L1;
                    }
                  }
                }
              }
            }
            if (param1 < -26) {
              param4.field_u.a(param3, param5, param0);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var7;
            stackOut_24_1 = new StringBuilder().append("ad.J(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param3 == null) {
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
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param4 == null) {
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
          throw t.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + param5 + 41);
        }
    }

    ad(kj param0) {
        ((ad) this).field_l = new tf();
        ((ad) this).field_m = new ob();
        try {
            ((ad) this).field_k = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "ad.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = false;
        field_n = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_j = 2;
        field_o = -1;
    }
}
