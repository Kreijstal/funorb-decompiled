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
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        uu var6 = null;
        int var7 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        boolean stackOut_9_0 = false;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            this.field_o.b(param0, param1, param2);
            var6 = (uu) ((Object) this.field_t.b(-108));
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                if (var7 == 0) {
                  stackOut_5_0 = this.field_u.b(73, var6);
                  stackIn_6_0 = stackOut_5_0;
                  L2: while (true) {
                    L3: {
                      if (stackIn_6_0) {
                        break L3;
                      } else {
                        var5 = param2;
                        var4_int = param1;
                        L4: while (true) {
                          if (var5 <= var6.field_u) {
                            this.a(var6, param0, var4_int - -var5, 119, var4_int, var5);
                            var6.field_u = var6.field_u - var5;
                            break L3;
                          } else {
                            this.a(var6, param0, var5 + var4_int, 78, var4_int, var6.field_u);
                            var5 = var5 - var6.field_u;
                            var4_int = var4_int + var6.field_u;
                            stackOut_9_0 = this.field_u.a(param0, var4_int, var5, var6, 0);
                            stackIn_6_0 = stackOut_9_0;
                            stackIn_10_0 = stackOut_9_0;
                            if (var7 != 0) {
                              continue L2;
                            } else {
                              if (stackIn_10_0) {
                                break L3;
                              } else {
                                continue L4;
                              }
                            }
                          }
                        }
                      }
                    }
                    var6 = (uu) ((Object) this.field_t.d((byte) 18));
                    continue L1;
                  }
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var4);
            stackOut_15_1 = new StringBuilder().append("rh.J(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ')');
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
        uu var13 = null;
        bs stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        uu stackIn_17_2 = null;
        bs stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        uu stackIn_18_2 = null;
        bs stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        uu stackIn_19_2 = null;
        int stackIn_19_3 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        bs stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        uu stackOut_16_2 = null;
        bs stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        uu stackOut_18_2 = null;
        int stackOut_18_3 = 0;
        bs stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        uu stackOut_17_2 = null;
        int stackOut_17_3 = 0;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
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
                    L4: {
                      L5: {
                        var8 = (var7_int + (1048575 - param0.field_t)) / var7_int;
                        if (var8 <= param5) {
                          break L5;
                        } else {
                          if (var12 != 0) {
                            break L4;
                          } else {
                            if (var12 == 0) {
                              param0.field_t = param0.field_t + var7_int * param5;
                              break L2;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      param0.field_z.b(param1, param4, var8);
                      param4 = param4 + var8;
                      param0.field_t = param0.field_t + (-1048576 + var8 * var7_int);
                      param5 = param5 - var8;
                      break L4;
                    }
                    L6: {
                      var9 = du.field_k / 100;
                      var10 = 262144 / var7_int;
                      if (var10 >= var9) {
                        break L6;
                      } else {
                        var9 = var10;
                        break L6;
                      }
                    }
                    L7: {
                      L8: {
                        var11 = param0.field_z;
                        if (-1 != (this.field_u.field_R[param0.field_y] ^ -1)) {
                          break L8;
                        } else {
                          param0.field_z = mf.a(param0.field_B, var11.e(), var11.g(), var11.i());
                          if (var12 == 0) {
                            break L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                      L9: {
                        param0.field_z = mf.a(param0.field_B, var11.e(), 0, var11.i());
                        stackOut_16_0 = this.field_u;
                        stackOut_16_1 = 114;
                        stackOut_16_2 = (uu) (param0);
                        stackIn_18_0 = stackOut_16_0;
                        stackIn_18_1 = stackOut_16_1;
                        stackIn_18_2 = stackOut_16_2;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        stackIn_17_2 = stackOut_16_2;
                        if (param0.field_A.field_k[param0.field_E] >= 0) {
                          stackOut_18_0 = (bs) ((Object) stackIn_18_0);
                          stackOut_18_1 = stackIn_18_1;
                          stackOut_18_2 = (uu) ((Object) stackIn_18_2);
                          stackOut_18_3 = 0;
                          stackIn_19_0 = stackOut_18_0;
                          stackIn_19_1 = stackOut_18_1;
                          stackIn_19_2 = stackOut_18_2;
                          stackIn_19_3 = stackOut_18_3;
                          break L9;
                        } else {
                          stackOut_17_0 = (bs) ((Object) stackIn_17_0);
                          stackOut_17_1 = stackIn_17_1;
                          stackOut_17_2 = (uu) ((Object) stackIn_17_2);
                          stackOut_17_3 = 1;
                          stackIn_19_0 = stackOut_17_0;
                          stackIn_19_1 = stackOut_17_1;
                          stackIn_19_2 = stackOut_17_2;
                          stackIn_19_3 = stackOut_17_3;
                          break L9;
                        }
                      }
                      ((bs) (Object) stackIn_19_0).a((byte) stackIn_19_1, stackIn_19_2, stackIn_19_3 != 0);
                      param0.field_z.b(var9, var11.g());
                      break L7;
                    }
                    L10: {
                      if (-1 < (param0.field_A.field_k[param0.field_E] ^ -1)) {
                        param0.field_z.c(-1);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      var11.d(var9);
                      var11.b(param1, param4, -param4 + param2);
                      if (var11.k()) {
                        this.field_o.b(var11);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    continue L3;
                  }
                }
              }
            }
            param0.field_z.b(param1, param4, param5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var7 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) (var7);
            stackOut_30_1 = new StringBuilder().append("rh.F(");
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L12;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L12;
            }
          }
          L13: {
            stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
            stackOut_33_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param1 == null) {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L13;
            } else {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L13;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(int param0) {
        int var2 = 0;
        uu var3 = null;
        int var4 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        boolean stackOut_5_0 = false;
        boolean stackOut_9_0 = false;
        var4 = Sumoblitz.field_L ? 1 : 0;
        this.field_o.a(param0);
        var3 = (uu) ((Object) this.field_t.b(-103));
        L0: while (true) {
          if (var3 != null) {
            if (var4 == 0) {
              stackOut_5_0 = this.field_u.b(94, var3);
              stackIn_6_0 = stackOut_5_0;
              L1: while (true) {
                L2: {
                  if (stackIn_6_0) {
                    break L2;
                  } else {
                    var2 = param0;
                    L3: while (true) {
                      if (var2 <= var3.field_u) {
                        this.a(var3, var2, -23408);
                        var3.field_u = var3.field_u - var2;
                        break L2;
                      } else {
                        this.a(var3, var3.field_u, -23408);
                        var2 = var2 - var3.field_u;
                        stackOut_9_0 = this.field_u.a((int[]) null, 0, var2, var3, 0);
                        stackIn_6_0 = stackOut_9_0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var4 != 0) {
                          continue L1;
                        } else {
                          if (stackIn_10_0) {
                            break L2;
                          } else {
                            continue L3;
                          }
                        }
                      }
                    }
                  }
                }
                var3 = (uu) ((Object) this.field_t.d((byte) 18));
                continue L0;
              }
            } else {
              return;
            }
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
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int[] var6 = null;
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
              if ((4 & this.field_u.field_J[param0.field_y]) == 0) {
                break L1;
              } else {
                if ((param0.field_x ^ -1) > -1) {
                  var4_int = this.field_u.field_x[param0.field_y] / du.field_k;
                  var5 = (var4_int + 1048575 + -param0.field_t) / var4_int;
                  param0.field_t = param1 * var4_int + param0.field_t & 1048575;
                  if (param1 >= var5) {
                    L2: {
                      L3: {
                        if (-1 == (this.field_u.field_R[param0.field_y] ^ -1)) {
                          break L3;
                        } else {
                          L4: {
                            param0.field_z = mf.a(param0.field_B, param0.field_z.e(), 0, param0.field_z.i());
                            stackOut_6_0 = this.field_u;
                            stackOut_6_1 = -56;
                            stackOut_6_2 = (uu) (param0);
                            stackIn_8_0 = stackOut_6_0;
                            stackIn_8_1 = stackOut_6_1;
                            stackIn_8_2 = stackOut_6_2;
                            stackIn_7_0 = stackOut_6_0;
                            stackIn_7_1 = stackOut_6_1;
                            stackIn_7_2 = stackOut_6_2;
                            if ((param0.field_A.field_k[param0.field_E] ^ -1) <= -1) {
                              stackOut_8_0 = (bs) ((Object) stackIn_8_0);
                              stackOut_8_1 = stackIn_8_1;
                              stackOut_8_2 = (uu) ((Object) stackIn_8_2);
                              stackOut_8_3 = 0;
                              stackIn_9_0 = stackOut_8_0;
                              stackIn_9_1 = stackOut_8_1;
                              stackIn_9_2 = stackOut_8_2;
                              stackIn_9_3 = stackOut_8_3;
                              break L4;
                            } else {
                              stackOut_7_0 = (bs) ((Object) stackIn_7_0);
                              stackOut_7_1 = stackIn_7_1;
                              stackOut_7_2 = (uu) ((Object) stackIn_7_2);
                              stackOut_7_3 = 1;
                              stackIn_9_0 = stackOut_7_0;
                              stackIn_9_1 = stackOut_7_1;
                              stackIn_9_2 = stackOut_7_2;
                              stackIn_9_3 = stackOut_7_3;
                              break L4;
                            }
                          }
                          ((bs) (Object) stackIn_9_0).a((byte) stackIn_9_1, stackIn_9_2, stackIn_9_3 != 0);
                          if (!Sumoblitz.field_L) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      param0.field_z = mf.a(param0.field_B, param0.field_z.e(), param0.field_z.g(), param0.field_z.i());
                      break L2;
                    }
                    L5: {
                      if ((param0.field_A.field_k[param0.field_E] ^ -1) > -1) {
                        param0.field_z.c(-1);
                        break L5;
                      } else {
                        break L5;
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
          L6: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var4);
            stackOut_18_1 = new StringBuilder().append("rh.B(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final hj c() {
        uu var1_ref = null;
        int var2 = Sumoblitz.field_L ? 1 : 0;
        do {
            var1_ref = (uu) ((Object) this.field_t.d((byte) 18));
            if (var1_ref == null) {
                if (var2 == 0) {
                    return null;
                }
                return (hj) ((Object) var1_ref.field_z);
            }
        } while (var1_ref.field_z == null);
        return (hj) ((Object) var1_ref.field_z);
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
