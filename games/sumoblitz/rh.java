/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh extends hj {
    static int field_p;
    static ri[] field_q;
    jn field_t;
    static int[] field_s;
    static boolean[] field_r;
    private bs field_u;
    al field_o;

    final void b(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        uu var6 = null;
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
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            ((rh) this).field_o.b(param0, param1, param2);
            var6 = (uu) (Object) ((rh) this).field_t.b(-108);
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                L2: {
                  if (((rh) this).field_u.b(73, var6)) {
                    break L2;
                  } else {
                    var5 = param2;
                    var4_int = param1;
                    L3: while (true) {
                      if (var5 <= var6.field_u) {
                        this.a(var6, param0, var4_int - -var5, 119, var4_int, var5);
                        var6.field_u = var6.field_u - var5;
                        break L2;
                      } else {
                        this.a(var6, param0, var5 + var4_int, 78, var4_int, var6.field_u);
                        var5 = var5 - var6.field_u;
                        var4_int = var4_int + var6.field_u;
                        if (((rh) this).field_u.a(param0, var4_int, var5, var6, 0)) {
                          break L2;
                        } else {
                          continue L3;
                        }
                      }
                    }
                  }
                }
                var6 = (uu) (Object) ((rh) this).field_t.d((byte) 18);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("rh.J(");
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
          throw qo.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    private final void a(uu param0, int[] param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        mf var11 = null;
        int var12 = 0;
        Object var13 = null;
        bs stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        uu stackIn_13_2 = null;
        bs stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        uu stackIn_14_2 = null;
        bs stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        uu stackIn_15_2 = null;
        int stackIn_15_3 = 0;
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
        bs stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        uu stackOut_12_2 = null;
        bs stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        uu stackOut_14_2 = null;
        int stackOut_14_3 = 0;
        bs stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        uu stackOut_13_2 = null;
        int stackOut_13_3 = 0;
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
        var12 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 >= 54) {
                break L1;
              } else {
                var13 = null;
                this.a((uu) null, -15, 29);
                break L1;
              }
            }
            L2: {
              if ((4 & ((rh) this).field_u.field_J[param0.field_y]) == -1) {
                break L2;
              } else {
                if (-1 <= param0.field_x) {
                  break L2;
                } else {
                  var7_int = ((rh) this).field_u.field_x[param0.field_y] / du.field_k;
                  L3: while (true) {
                    var8 = (var7_int + (1048575 - param0.field_t)) / var7_int;
                    if (var8 <= param5) {
                      L4: {
                        param0.field_z.b(param1, param4, var8);
                        param4 = param4 + var8;
                        param0.field_t = param0.field_t + (-1048576 + var8 * var7_int);
                        param5 = param5 - var8;
                        var9 = du.field_k / 100;
                        var10 = 262144 / var7_int;
                        if (var10 >= var9) {
                          break L4;
                        } else {
                          var9 = var10;
                          break L4;
                        }
                      }
                      L5: {
                        var11 = param0.field_z;
                        if (((rh) this).field_u.field_R[param0.field_y] != 0) {
                          L6: {
                            param0.field_z = mf.a(param0.field_B, var11.e(), 0, var11.i());
                            stackOut_12_0 = ((rh) this).field_u;
                            stackOut_12_1 = 114;
                            stackOut_12_2 = (uu) param0;
                            stackIn_14_0 = stackOut_12_0;
                            stackIn_14_1 = stackOut_12_1;
                            stackIn_14_2 = stackOut_12_2;
                            stackIn_13_0 = stackOut_12_0;
                            stackIn_13_1 = stackOut_12_1;
                            stackIn_13_2 = stackOut_12_2;
                            if (param0.field_A.field_k[param0.field_E] >= 0) {
                              stackOut_14_0 = (bs) (Object) stackIn_14_0;
                              stackOut_14_1 = stackIn_14_1;
                              stackOut_14_2 = (uu) (Object) stackIn_14_2;
                              stackOut_14_3 = 0;
                              stackIn_15_0 = stackOut_14_0;
                              stackIn_15_1 = stackOut_14_1;
                              stackIn_15_2 = stackOut_14_2;
                              stackIn_15_3 = stackOut_14_3;
                              break L6;
                            } else {
                              stackOut_13_0 = (bs) (Object) stackIn_13_0;
                              stackOut_13_1 = stackIn_13_1;
                              stackOut_13_2 = (uu) (Object) stackIn_13_2;
                              stackOut_13_3 = 1;
                              stackIn_15_0 = stackOut_13_0;
                              stackIn_15_1 = stackOut_13_1;
                              stackIn_15_2 = stackOut_13_2;
                              stackIn_15_3 = stackOut_13_3;
                              break L6;
                            }
                          }
                          ((bs) (Object) stackIn_15_0).a((byte) stackIn_15_1, stackIn_15_2, stackIn_15_3 != 0);
                          param0.field_z.b(var9, var11.g());
                          break L5;
                        } else {
                          param0.field_z = mf.a(param0.field_B, var11.e(), var11.g(), var11.i());
                          break L5;
                        }
                      }
                      L7: {
                        if (param0.field_A.field_k[param0.field_E] < 0) {
                          param0.field_z.c(-1);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var11.d(var9);
                      var11.b(param1, param4, -param4 + param2);
                      if (var11.k()) {
                        ((rh) this).field_o.b((hj) (Object) var11);
                        continue L3;
                      } else {
                        continue L3;
                      }
                    } else {
                      param0.field_t = param0.field_t + var7_int * param5;
                      break L2;
                    }
                  }
                }
              }
            }
            param0.field_z.b(param1, param4, param5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var7;
            stackOut_25_1 = new StringBuilder().append("rh.F(");
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
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(44);
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
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
          throw qo.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final void a(int param0) {
        int var2 = 0;
        uu var3 = null;
        int var4 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        ((rh) this).field_o.a(param0);
        var3 = (uu) (Object) ((rh) this).field_t.b(-103);
        L0: while (true) {
          if (var3 != null) {
            L1: {
              if (((rh) this).field_u.b(94, var3)) {
                break L1;
              } else {
                var2 = param0;
                L2: while (true) {
                  if (var2 <= var3.field_u) {
                    this.a(var3, var2, -23408);
                    var3.field_u = var3.field_u - var2;
                    break L1;
                  } else {
                    this.a(var3, var3.field_u, -23408);
                    var2 = var2 - var3.field_u;
                    if (((rh) this).field_u.a((int[]) null, 0, var2, var3, 0)) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  }
                }
              }
            }
            var3 = (uu) (Object) ((rh) this).field_t.d((byte) 18);
            continue L0;
          } else {
            return;
          }
        }
    }

    final int d() {
        return 0;
    }

    final hj a() {
        uu var1 = null;
        var1 = (uu) (Object) ((rh) this).field_t.b(-127);
        if (var1 != null) {
          if (null != var1.field_z) {
            return (hj) (Object) var1.field_z;
          } else {
            return ((rh) this).c();
          }
        } else {
          return null;
        }
    }

    public static void a(byte param0) {
        if (param0 <= 47) {
          rh.a((byte) 45);
          field_s = null;
          field_q = null;
          field_r = null;
          return;
        } else {
          field_s = null;
          field_q = null;
          field_r = null;
          return;
        }
    }

    private final void a(uu param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        Object var6 = null;
        bs stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        uu stackIn_7_2 = null;
        bs stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        uu stackIn_8_2 = null;
        bs stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        uu stackIn_9_2 = null;
        int stackIn_9_3 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        bs stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        uu stackOut_6_2 = null;
        bs stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        uu stackOut_8_2 = null;
        int stackOut_8_3 = 0;
        bs stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        uu stackOut_7_2 = null;
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
              if ((4 & ((rh) this).field_u.field_J[param0.field_y]) == 0) {
                break L1;
              } else {
                if (param0.field_x < 0) {
                  var4_int = ((rh) this).field_u.field_x[param0.field_y] / du.field_k;
                  var5 = (var4_int + 1048575 + -param0.field_t) / var4_int;
                  param0.field_t = param1 * var4_int + param0.field_t & 1048575;
                  if (param1 >= var5) {
                    L2: {
                      if (((rh) this).field_u.field_R[param0.field_y] == 0) {
                        param0.field_z = mf.a(param0.field_B, param0.field_z.e(), param0.field_z.g(), param0.field_z.i());
                        break L2;
                      } else {
                        L3: {
                          param0.field_z = mf.a(param0.field_B, param0.field_z.e(), 0, param0.field_z.i());
                          stackOut_6_0 = ((rh) this).field_u;
                          stackOut_6_1 = -56;
                          stackOut_6_2 = (uu) param0;
                          stackIn_8_0 = stackOut_6_0;
                          stackIn_8_1 = stackOut_6_1;
                          stackIn_8_2 = stackOut_6_2;
                          stackIn_7_0 = stackOut_6_0;
                          stackIn_7_1 = stackOut_6_1;
                          stackIn_7_2 = stackOut_6_2;
                          if (param0.field_A.field_k[param0.field_E] >= 0) {
                            stackOut_8_0 = (bs) (Object) stackIn_8_0;
                            stackOut_8_1 = stackIn_8_1;
                            stackOut_8_2 = (uu) (Object) stackIn_8_2;
                            stackOut_8_3 = 0;
                            stackIn_9_0 = stackOut_8_0;
                            stackIn_9_1 = stackOut_8_1;
                            stackIn_9_2 = stackOut_8_2;
                            stackIn_9_3 = stackOut_8_3;
                            break L3;
                          } else {
                            stackOut_7_0 = (bs) (Object) stackIn_7_0;
                            stackOut_7_1 = stackIn_7_1;
                            stackOut_7_2 = (uu) (Object) stackIn_7_2;
                            stackOut_7_3 = 1;
                            stackIn_9_0 = stackOut_7_0;
                            stackIn_9_1 = stackOut_7_1;
                            stackIn_9_2 = stackOut_7_2;
                            stackIn_9_3 = stackOut_7_3;
                            break L3;
                          }
                        }
                        ((bs) (Object) stackIn_9_0).a((byte) stackIn_9_1, stackIn_9_2, stackIn_9_3 != 0);
                        break L2;
                      }
                    }
                    L4: {
                      if (param0.field_A.field_k[param0.field_E] < 0) {
                        param0.field_z.c(-1);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    param1 = param0.field_t / var4_int;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
            }
            param0.field_z.a(param1);
            if (param2 == -23408) {
              break L0;
            } else {
              var6 = null;
              this.a((uu) null, (int[]) null, 36, -113, -84, 67);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var4;
            stackOut_18_1 = new StringBuilder().append("rh.B(");
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
          throw qo.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final hj c() {
        uu var1 = null;
        int var2 = 0;
        var2 = Sumoblitz.field_L ? 1 : 0;
        L0: while (true) {
          var1 = (uu) (Object) ((rh) this).field_t.d((byte) 18);
          if (var1 != null) {
            if (var1.field_z != null) {
              return (hj) (Object) var1.field_z;
            } else {
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    rh(bs param0) {
        ((rh) this).field_t = new jn();
        ((rh) this).field_o = new al();
        try {
            ((rh) this).field_u = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "rh.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new boolean[]{true, false, false, false, true, false, true, false, true, false, false, false, true, false, false, false, true, false, true, false, true, false, false, false, true};
        field_s = new int[13];
    }
}
