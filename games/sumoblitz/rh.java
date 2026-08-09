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
        uu var6 = null;
        int var7 = 0;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            this.field_o.b(param0, param1, param2);
            var6 = (uu) ((Object) this.field_t.b(-108));
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                stackIn_4_0 = this.field_u.b(73, var6);
                L2: {
                  if (stackIn_4_0) {
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
                        if (this.field_u.a(param0, var4_int, var5, var6, 0)) {
                          break L2;
                        } else {
                          continue L3;
                        }
                      }
                    }
                  }
                }
                var6 = (uu) ((Object) this.field_t.d((byte) 18));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("rh.J(");

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
          throw qo.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(uu param0, int[] param1, int param2, int param3, int param4, int param5) {
        bs stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        uu stackIn_14_2 = null;
        bs stackIn_15_0;
        int stackIn_15_1;
        uu stackIn_15_2;
        int stackIn_15_3;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        mf var11 = null;
        int var12 = 0;
        uu var13 = null;
        var12 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 >= 54) {
                break L1;
              } else {
                var13 = (uu) null;
                this.a((uu) null, -15, 29);
                break L1;
              }
            }
            L2: {
              if ((4 & this.field_u.field_J[param0.field_y]) == 0) {
                break L2;
              } else {
                if (-1 >= (param0.field_x ^ -1)) {
                  break L2;
                } else {
                  var7_int = this.field_u.field_x[param0.field_y] / du.field_k;
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
                        if (-1 != (this.field_u.field_R[param0.field_y] ^ -1)) {
                          L6: {
                            param0.field_z = mf.a(param0.field_B, var11.e(), 0, var11.i());
                            stackIn_14_0 = this.field_u;

                            stackIn_14_1 = 114;

                            stackIn_14_2 = (uu) (param0);

                            if (param0.field_A.field_k[param0.field_E] >= 0) {
                              stackIn_15_0 = (bs) ((Object) stackIn_14_0);
                              stackIn_15_1 = stackIn_14_1;
                              stackIn_15_2 = (uu) ((Object) stackIn_14_2);
                              stackIn_15_3 = 0;
                              break L6;
                            } else {
                              stackIn_15_0 = (bs) ((Object) stackIn_14_0);
                              stackIn_15_1 = stackIn_14_1;
                              stackIn_15_2 = (uu) ((Object) stackIn_14_2);
                              stackIn_15_3 = 1;
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
                        if (-1 < (param0.field_A.field_k[param0.field_E] ^ -1)) {
                          param0.field_z.c(-1);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var11.d(var9);
                      var11.b(param1, param4, -param4 + param2);
                      if (var11.k()) {
                        this.field_o.b(var11);
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
            stackIn_27_0 = (RuntimeException) (var7);

            stackIn_27_1 = new StringBuilder().append("rh.F(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L8;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L9;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L9;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_28_0), stackIn_31_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(int param0) {
        int var2;
        uu var3;
        int var4;
        boolean stackIn_4_0 = false;
        var4 = Sumoblitz.field_L ? 1 : 0;
        this.field_o.a(param0);
        var3 = (uu) ((Object) this.field_t.b(-103));
        L0: while (true) {
          if (var3 != null) {
            stackIn_4_0 = this.field_u.b(94, var3);
            L1: {
              if (stackIn_4_0) {
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
                    if (this.field_u.a((int[]) null, 0, var2, var3, 0)) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  }
                }
              }
            }
            var3 = (uu) ((Object) this.field_t.d((byte) 18));
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
        uu var1;
        var1 = (uu) ((Object) this.field_t.b(-127));
        if (var1 != null) {
          if (null != var1.field_z) {
            return (hj) ((Object) var1.field_z);
          } else {
            return this.c();
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
        bs stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        uu stackIn_8_2 = null;
        bs stackIn_9_0;
        int stackIn_9_1;
        uu stackIn_9_2;
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
        int[] var6 = null;
        try {
          L0: {
            L1: {
              if ((4 & this.field_u.field_J[param0.field_y]) == 0) {
                break L1;
              } else {
                if ((param0.field_x ^ -1) > -1) {
                  var4_int = this.field_u.field_x[param0.field_y] / du.field_k;
                  var5 = (var4_int + 1048575 + -param0.field_t) / var4_int;
                  param0.field_t = param1 * var4_int + param0.field_t & 1048575;
                  if (param1 >= var5) {
                    L2: {
                      if (-1 == (this.field_u.field_R[param0.field_y] ^ -1)) {
                        param0.field_z = mf.a(param0.field_B, param0.field_z.e(), param0.field_z.g(), param0.field_z.i());
                        break L2;
                      } else {
                        L3: {
                          param0.field_z = mf.a(param0.field_B, param0.field_z.e(), 0, param0.field_z.i());
                          stackIn_8_0 = this.field_u;

                          stackIn_8_1 = -56;

                          stackIn_8_2 = (uu) (param0);

                          if ((param0.field_A.field_k[param0.field_E] ^ -1) <= -1) {
                            stackIn_9_0 = (bs) ((Object) stackIn_8_0);
                            stackIn_9_1 = stackIn_8_1;
                            stackIn_9_2 = (uu) ((Object) stackIn_8_2);
                            stackIn_9_3 = 0;
                            break L3;
                          } else {
                            stackIn_9_0 = (bs) ((Object) stackIn_8_0);
                            stackIn_9_1 = stackIn_8_1;
                            stackIn_9_2 = (uu) ((Object) stackIn_8_2);
                            stackIn_9_3 = 1;
                            break L3;
                          }
                        }
                        ((bs) (Object) stackIn_9_0).a((byte) stackIn_9_1, stackIn_9_2, stackIn_9_3 != 0);
                        break L2;
                      }
                    }
                    L4: {
                      if ((param0.field_A.field_k[param0.field_E] ^ -1) > -1) {
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
              var6 = (int[]) null;
              this.a((uu) null, (int[]) null, 36, -113, -84, 67);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var4);

            stackIn_20_1 = new StringBuilder().append("rh.B(");

            if (param0 == null) {
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
          throw qo.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final hj c() {
        uu var1;
        int var2;
        var2 = Sumoblitz.field_L ? 1 : 0;
        L0: while (true) {
          var1 = (uu) ((Object) this.field_t.d((byte) 18));
          if (var1 != null) {
            if (var1.field_z != null) {
              return (hj) ((Object) var1.field_z);
            } else {
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    rh(bs param0) {
        this.field_t = new jn();
        this.field_o = new al();
        try {
            this.field_u = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "rh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_r = new boolean[]{true, false, false, false, true, false, true, false, true, false, false, false, true, false, false, false, true, false, true, false, true, false, false, false, true};
        field_s = new int[13];
    }
}
