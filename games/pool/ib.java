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
        pr var1;
        L0: while (true) {
          var1 = (pr) ((Object) this.field_t.f((byte) -5));
          if (var1 != null) {
            if (null != var1.field_o) {
              return (kd) ((Object) var1.field_o);
            } else {
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    final static void c(int param0) {
        if (param0 > -21) {
            field_s = (bp) null;
            lf.a(17, (byte) 77);
            return;
        }
        lf.a(17, (byte) 77);
    }

    private final void a(int param0, pr param1, int param2) {
        vk stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        pr stackIn_9_2 = null;
        vk stackIn_10_0;
        int stackIn_10_1;
        pr stackIn_10_2;
        int stackIn_10_3;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          L0: {
            if (param2 == 1048575) {
              L1: {
                if ((this.field_w.field_F[param1.field_t] & 4) == 0) {
                  break L1;
                } else {
                  if (param1.field_G < 0) {
                    var4_int = this.field_w.field_L[param1.field_t] / bp.field_h;
                    var5 = (-param1.field_y + (var4_int + 1048575)) / var4_int;
                    param1.field_y = param1.field_y - -(var4_int * param0) & 1048575;
                    if (var5 > param0) {
                      break L1;
                    } else {
                      L2: {
                        if (this.field_w.field_U[param1.field_t] == 0) {
                          param1.field_o = nb.b(param1.field_C, param1.field_o.m(), param1.field_o.j(), param1.field_o.f());
                          break L2;
                        } else {
                          L3: {
                            param1.field_o = nb.b(param1.field_C, param1.field_o.m(), 0, param1.field_o.f());
                            stackIn_9_0 = this.field_w;

                            stackIn_9_1 = param2 + -1048698;

                            stackIn_9_2 = (pr) (param1);

                            if (-1 >= (param1.field_u.field_s[param1.field_A] ^ -1)) {
                              stackIn_10_0 = (vk) ((Object) stackIn_9_0);
                              stackIn_10_1 = stackIn_9_1;
                              stackIn_10_2 = (pr) ((Object) stackIn_9_2);
                              stackIn_10_3 = 0;
                              break L3;
                            } else {
                              stackIn_10_0 = (vk) ((Object) stackIn_9_0);
                              stackIn_10_1 = stackIn_9_1;
                              stackIn_10_2 = (pr) ((Object) stackIn_9_2);
                              stackIn_10_3 = 1;
                              break L3;
                            }
                          }
                          ((vk) (Object) stackIn_10_0).a(stackIn_10_1, stackIn_10_2, stackIn_10_3 != 0);
                          break L2;
                        }
                      }
                      L4: {
                        if ((param1.field_u.field_s[param1.field_A] ^ -1) > -1) {
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
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var4);

            stackIn_20_1 = new StringBuilder().append("ib.I(").append(param0).append(',');

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
          throw wm.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, int param1, pr param2, int param3, int param4, int[] param5) {
        vk stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        pr stackIn_14_2 = null;
        vk stackIn_15_0;
        int stackIn_15_1;
        pr stackIn_15_2;
        int stackIn_15_3;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        nb var11 = null;
        int var12 = 0;
        var12 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (-1 == (4 & this.field_w.field_F[param2.field_t] ^ -1)) {
                break L1;
              } else {
                if ((param2.field_G ^ -1) > -1) {
                  var7_int = this.field_w.field_L[param2.field_t] / bp.field_h;
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
                        if (this.field_w.field_U[param2.field_t] != 0) {
                          L5: {
                            param2.field_o = nb.b(param2.field_C, var11.m(), 0, var11.f());
                            stackIn_14_0 = this.field_w;

                            stackIn_14_1 = -125;

                            stackIn_14_2 = (pr) (param2);

                            if ((param2.field_u.field_s[param2.field_A] ^ -1) <= -1) {
                              stackIn_15_0 = (vk) ((Object) stackIn_14_0);
                              stackIn_15_1 = stackIn_14_1;
                              stackIn_15_2 = (pr) ((Object) stackIn_14_2);
                              stackIn_15_3 = 0;
                              break L5;
                            } else {
                              stackIn_15_0 = (vk) ((Object) stackIn_14_0);
                              stackIn_15_1 = stackIn_14_1;
                              stackIn_15_2 = (pr) ((Object) stackIn_14_2);
                              stackIn_15_3 = 1;
                              break L5;
                            }
                          }
                          ((vk) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_15_2, stackIn_15_3 != 0);
                          param2.field_o.c(var9, var11.j());
                          break L4;
                        } else {
                          param2.field_o = nb.b(param2.field_C, var11.m(), var11.j(), var11.f());
                          break L4;
                        }
                      }
                      L6: {
                        if (-1 < (param2.field_u.field_s[param2.field_A] ^ -1)) {
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
                        this.field_p.b(var11);
                        continue L2;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            L7: {
              if (param3 == 1048575) {
                break L7;
              } else {
                ib.c(-60);
                break L7;
              }
            }
            param2.field_o.a(param5, param0, param4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var7);

            stackIn_28_1 = new StringBuilder().append("ib.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L8;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L9;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L9;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_29_0), stackIn_32_2 + ')');
        }
    }

    final int d() {
        return 0;
    }

    final kd a() {
        pr var1;
        var1 = (pr) ((Object) this.field_t.c((byte) 76));
        if (var1 != null) {
          if (null != var1.field_o) {
            return (kd) ((Object) var1.field_o);
          } else {
            return this.b();
          }
        } else {
          return null;
        }
    }

    final void a(int[] param0, int param1, int param2) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        pr var6 = null;
        int var7 = 0;
        var7 = Pool.field_O;
        try {
          L0: {
            this.field_p.a(param0, param1, param2);
            var6 = (pr) ((Object) this.field_t.c((byte) -67));
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                L2: {
                  if (!this.field_w.a(-16257, var6)) {
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
                        if (!this.field_w.a(var5, param0, var4_int, 1, var6)) {
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
                var6 = (pr) ((Object) this.field_t.f((byte) -5));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("ib.E(");

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
          throw wm.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void d(int param0) {
        field_s = null;
        if (param0 != -1) {
            field_q = (String[]) null;
            field_u = null;
            field_q = null;
            return;
        }
        field_u = null;
        field_q = null;
    }

    final static int[] a(double[] param0, int param1) {
        RuntimeException var2 = null;
        int[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -30100) {
                break L1;
              } else {
                ib.d(-75);
                break L1;
              }
            }
            stackIn_3_0 = tq.a(3, -20607, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("ib.J(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0) {
        int var2;
        pr var3;
        int var4;
        boolean stackIn_4_0 = false;
        var4 = Pool.field_O;
        this.field_p.a(param0);
        var3 = (pr) ((Object) this.field_t.c((byte) -20));
        L0: while (true) {
          if (var3 != null) {
            stackIn_4_0 = this.field_w.a(-16257, var3);
            L1: {
              if (stackIn_4_0) {
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
                    if (this.field_w.a(var2, (int[]) null, 0, 1, var3)) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  }
                }
              }
            }
            var3 = (pr) ((Object) this.field_t.f((byte) -5));
            continue L0;
          } else {
            return;
          }
        }
    }

    ib(vk param0) {
        this.field_t = new ko();
        this.field_p = new ai();
        try {
            this.field_w = param0;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "ib.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_q = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
    }
}
