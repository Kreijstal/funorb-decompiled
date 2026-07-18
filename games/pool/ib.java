/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ib extends kd {
    ko field_t;
    static bp field_s;
    static boolean field_v;
    static int field_r;
    private vk field_w;
    static di field_u;
    static String[] field_q;
    ai field_p;

    final kd b() {
        pr var1 = null;
        L0: while (true) {
          var1 = (pr) (Object) ((ib) this).field_t.f((byte) -5);
          if (var1 != null) {
            if (null != var1.field_o) {
              return (kd) (Object) var1.field_o;
            } else {
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    final static void c(int param0) {
        lf.a(17, (byte) 77);
    }

    private final void a(int param0, pr param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        vk stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        pr stackIn_8_2 = null;
        vk stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        pr stackIn_9_2 = null;
        vk stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        pr stackIn_10_2 = null;
        int stackIn_10_3 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        vk stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        pr stackOut_7_2 = null;
        vk stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        pr stackOut_9_2 = null;
        int stackOut_9_3 = 0;
        vk stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        pr stackOut_8_2 = null;
        int stackOut_8_3 = 0;
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
              if ((((ib) this).field_w.field_F[param1.field_t] & 4) == 0) {
                break L1;
              } else {
                if (param1.field_G < 0) {
                  var4_int = ((ib) this).field_w.field_L[param1.field_t] / bp.field_h;
                  var5 = (-param1.field_y + (var4_int + 1048575)) / var4_int;
                  param1.field_y = param1.field_y - -(var4_int * param0) & 1048575;
                  if (var5 > param0) {
                    break L1;
                  } else {
                    L2: {
                      if (((ib) this).field_w.field_U[param1.field_t] == 0) {
                        param1.field_o = nb.b(param1.field_C, param1.field_o.m(), param1.field_o.j(), param1.field_o.f());
                        break L2;
                      } else {
                        L3: {
                          param1.field_o = nb.b(param1.field_C, param1.field_o.m(), 0, param1.field_o.f());
                          stackOut_7_0 = ((ib) this).field_w;
                          stackOut_7_1 = -123;
                          stackOut_7_2 = (pr) param1;
                          stackIn_9_0 = stackOut_7_0;
                          stackIn_9_1 = stackOut_7_1;
                          stackIn_9_2 = stackOut_7_2;
                          stackIn_8_0 = stackOut_7_0;
                          stackIn_8_1 = stackOut_7_1;
                          stackIn_8_2 = stackOut_7_2;
                          if (param1.field_u.field_s[param1.field_A] >= 0) {
                            stackOut_9_0 = (vk) (Object) stackIn_9_0;
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = (pr) (Object) stackIn_9_2;
                            stackOut_9_3 = 0;
                            stackIn_10_0 = stackOut_9_0;
                            stackIn_10_1 = stackOut_9_1;
                            stackIn_10_2 = stackOut_9_2;
                            stackIn_10_3 = stackOut_9_3;
                            break L3;
                          } else {
                            stackOut_8_0 = (vk) (Object) stackIn_8_0;
                            stackOut_8_1 = stackIn_8_1;
                            stackOut_8_2 = (pr) (Object) stackIn_8_2;
                            stackOut_8_3 = 1;
                            stackIn_10_0 = stackOut_8_0;
                            stackIn_10_1 = stackOut_8_1;
                            stackIn_10_2 = stackOut_8_2;
                            stackIn_10_3 = stackOut_8_3;
                            break L3;
                          }
                        }
                        ((vk) (Object) stackIn_10_0).a(stackIn_10_1, stackIn_10_2, stackIn_10_3 != 0);
                        break L2;
                      }
                    }
                    L4: {
                      if (param1.field_u.field_s[param1.field_A] < 0) {
                        param1.field_o.e(-1);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    param0 = param1.field_y / var4_int;
                    break L1;
                  }
                } else {
                  param1.field_o.a(param0);
                  return;
                }
              }
            }
            param1.field_o.a(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var4;
            stackOut_18_1 = new StringBuilder().append("ib.I(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + 1048575 + ')');
        }
    }

    private final void a(int param0, int param1, pr param2, int param3, int param4, int[] param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        nb var11 = null;
        int var12 = 0;
        vk stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        pr stackIn_11_2 = null;
        vk stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        pr stackIn_12_2 = null;
        vk stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        pr stackIn_13_2 = null;
        int stackIn_13_3 = 0;
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
        vk stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        pr stackOut_10_2 = null;
        vk stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        pr stackOut_12_2 = null;
        int stackOut_12_3 = 0;
        vk stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        pr stackOut_11_2 = null;
        int stackOut_11_3 = 0;
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
        var12 = Pool.field_O;
        try {
          L0: {
            L1: {
              if ((4 & ((ib) this).field_w.field_F[param2.field_t]) == 0) {
                break L1;
              } else {
                if (param2.field_G < 0) {
                  var7_int = ((ib) this).field_w.field_L[param2.field_t] / bp.field_h;
                  L2: while (true) {
                    var8 = (1048575 + var7_int + -param2.field_y) / var7_int;
                    if (param4 < var8) {
                      param2.field_y = param2.field_y + param4 * var7_int;
                      break L1;
                    } else {
                      L3: {
                        param2.field_o.a(param5, param0, var8);
                        param4 = param4 - var8;
                        param2.field_y = param2.field_y + (-1048576 + var8 * var7_int);
                        param0 = param0 + var8;
                        var9 = bp.field_h / 100;
                        var10 = 262144 / var7_int;
                        if (var9 <= var10) {
                          break L3;
                        } else {
                          var9 = var10;
                          break L3;
                        }
                      }
                      L4: {
                        var11 = param2.field_o;
                        if (((ib) this).field_w.field_U[param2.field_t] != 0) {
                          L5: {
                            param2.field_o = nb.b(param2.field_C, var11.m(), 0, var11.f());
                            stackOut_10_0 = ((ib) this).field_w;
                            stackOut_10_1 = -125;
                            stackOut_10_2 = (pr) param2;
                            stackIn_12_0 = stackOut_10_0;
                            stackIn_12_1 = stackOut_10_1;
                            stackIn_12_2 = stackOut_10_2;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            if (param2.field_u.field_s[param2.field_A] >= 0) {
                              stackOut_12_0 = (vk) (Object) stackIn_12_0;
                              stackOut_12_1 = stackIn_12_1;
                              stackOut_12_2 = (pr) (Object) stackIn_12_2;
                              stackOut_12_3 = 0;
                              stackIn_13_0 = stackOut_12_0;
                              stackIn_13_1 = stackOut_12_1;
                              stackIn_13_2 = stackOut_12_2;
                              stackIn_13_3 = stackOut_12_3;
                              break L5;
                            } else {
                              stackOut_11_0 = (vk) (Object) stackIn_11_0;
                              stackOut_11_1 = stackIn_11_1;
                              stackOut_11_2 = (pr) (Object) stackIn_11_2;
                              stackOut_11_3 = 1;
                              stackIn_13_0 = stackOut_11_0;
                              stackIn_13_1 = stackOut_11_1;
                              stackIn_13_2 = stackOut_11_2;
                              stackIn_13_3 = stackOut_11_3;
                              break L5;
                            }
                          }
                          ((vk) (Object) stackIn_13_0).a(stackIn_13_1, stackIn_13_2, stackIn_13_3 != 0);
                          param2.field_o.c(var9, var11.j());
                          break L4;
                        } else {
                          param2.field_o = nb.b(param2.field_C, var11.m(), var11.j(), var11.f());
                          break L4;
                        }
                      }
                      L6: {
                        if (param2.field_u.field_s[param2.field_A] < 0) {
                          param2.field_o.e(-1);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var11.c(var9);
                      var11.a(param5, param0, param1 + -param0);
                      if (!var11.g()) {
                        continue L2;
                      } else {
                        ((ib) this).field_p.b((kd) (Object) var11);
                        continue L2;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            param2.field_o.a(param5, param0, param4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var7;
            stackOut_24_1 = new StringBuilder().append("ib.A(").append(param0).append(',').append(param1).append(',');
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
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(1048575).append(',').append(param4).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param5 == null) {
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
          throw wm.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ')');
        }
    }

    final int d() {
        return 0;
    }

    final kd a() {
        pr var1 = null;
        var1 = (pr) (Object) ((ib) this).field_t.c((byte) 76);
        if (var1 != null) {
          if (null != var1.field_o) {
            return (kd) (Object) var1.field_o;
          } else {
            return ((ib) this).b();
          }
        } else {
          return null;
        }
    }

    final void a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        pr var6 = null;
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
        var7 = Pool.field_O;
        try {
          L0: {
            ((ib) this).field_p.a(param0, param1, param2);
            var6 = (pr) (Object) ((ib) this).field_t.c((byte) -67);
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                L2: {
                  if (!((ib) this).field_w.a(-16257, var6)) {
                    var5 = param2;
                    var4_int = param1;
                    L3: while (true) {
                      if (var6.field_D >= var5) {
                        this.a(var4_int, var4_int + var5, var6, 1048575, var5, param0);
                        var6.field_D = var6.field_D - var5;
                        break L2;
                      } else {
                        this.a(var4_int, var4_int - -var5, var6, 1048575, var6.field_D, param0);
                        var5 = var5 - var6.field_D;
                        var4_int = var4_int + var6.field_D;
                        if (!((ib) this).field_w.a(var5, param0, var4_int, 1, var6)) {
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
                var6 = (pr) (Object) ((ib) this).field_t.f((byte) -5);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("ib.E(");
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
          throw wm.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void d(int param0) {
        field_s = null;
        field_u = null;
        field_q = null;
    }

    final static int[] a(double[] param0, int param1) {
        RuntimeException var2 = null;
        int[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = tq.a(3, -20607, param0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("ib.J(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + -30100 + ')');
        }
        return stackIn_1_0;
    }

    final void a(int param0) {
        int var2 = 0;
        pr var3 = null;
        int var4 = 0;
        var4 = Pool.field_O;
        ((ib) this).field_p.a(param0);
        var3 = (pr) (Object) ((ib) this).field_t.c((byte) -20);
        L0: while (true) {
          if (var3 != null) {
            L1: {
              if (((ib) this).field_w.a(-16257, var3)) {
                break L1;
              } else {
                var2 = param0;
                L2: while (true) {
                  if (var2 <= var3.field_D) {
                    this.a(var2, var3, 1048575);
                    var3.field_D = var3.field_D - var2;
                    break L1;
                  } else {
                    this.a(var3.field_D, var3, 1048575);
                    var2 = var2 - var3.field_D;
                    if (((ib) this).field_w.a(var2, (int[]) null, 0, 1, var3)) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  }
                }
              }
            }
            var3 = (pr) (Object) ((ib) this).field_t.f((byte) -5);
            continue L0;
          } else {
            return;
          }
        }
    }

    ib(vk param0) {
        ((ib) this).field_t = new ko();
        ((ib) this).field_p = new ai();
        try {
            ((ib) this).field_w = param0;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "ib.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
    }
}
