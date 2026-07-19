/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj extends lk {
    ng field_n;
    static long[] field_q;
    private hl field_l;
    static String field_p;
    static boolean field_o;
    hk field_m;

    final lk b() {
        cb var1 = null;
        int var2 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_5_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_2_0 = null;
        var2 = Lexicominos.field_L ? 1 : 0;
        L0: while (true) {
          L1: {
            var1 = (cb) ((Object) this.field_n.f(2));
            if (var1 != null) {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              break L1;
            } else {
              stackOut_2_0 = null;
              stackIn_5_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (var2 != 0) {
                break L1;
              } else {
                return (lk) ((Object) stackIn_3_0);
              }
            }
          }
          if (stackIn_5_0 != var1.field_C) {
            return (lk) ((Object) var1.field_C);
          } else {
            continue L0;
          }
        }
    }

    private final void a(int param0, cb param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        hl stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        cb stackIn_7_2 = null;
        hl stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        cb stackIn_8_2 = null;
        hl stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        cb stackIn_9_2 = null;
        int stackIn_9_3 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        hl stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        cb stackOut_6_2 = null;
        hl stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        cb stackOut_8_2 = null;
        int stackOut_8_3 = 0;
        hl stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        cb stackOut_7_2 = null;
        int stackOut_7_3 = 0;
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
              if (param2 == 0) {
                break L1;
              } else {
                this.field_m = (hk) null;
                break L1;
              }
            }
            L2: {
              if (-1 == (this.field_l.field_q[param1.field_z] & 4 ^ -1)) {
                break L2;
              } else {
                if (0 <= param1.field_h) {
                  break L2;
                } else {
                  var4_int = this.field_l.field_O[param1.field_z] / b.field_r;
                  var5 = (-param1.field_E + (1048575 + var4_int)) / var4_int;
                  param1.field_E = param0 * var4_int + param1.field_E & 1048575;
                  if (var5 > param0) {
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        if (0 == this.field_l.field_u[param1.field_z]) {
                          break L4;
                        } else {
                          L5: {
                            param1.field_C = cc.a(param1.field_w, param1.field_C.l(), 0, param1.field_C.k());
                            stackOut_6_0 = this.field_l;
                            stackOut_6_1 = 92;
                            stackOut_6_2 = (cb) (param1);
                            stackIn_8_0 = stackOut_6_0;
                            stackIn_8_1 = stackOut_6_1;
                            stackIn_8_2 = stackOut_6_2;
                            stackIn_7_0 = stackOut_6_0;
                            stackIn_7_1 = stackOut_6_1;
                            stackIn_7_2 = stackOut_6_2;
                            if (param1.field_p.field_k[param1.field_q] >= 0) {
                              stackOut_8_0 = (hl) ((Object) stackIn_8_0);
                              stackOut_8_1 = stackIn_8_1;
                              stackOut_8_2 = (cb) ((Object) stackIn_8_2);
                              stackOut_8_3 = 0;
                              stackIn_9_0 = stackOut_8_0;
                              stackIn_9_1 = stackOut_8_1;
                              stackIn_9_2 = stackOut_8_2;
                              stackIn_9_3 = stackOut_8_3;
                              break L5;
                            } else {
                              stackOut_7_0 = (hl) ((Object) stackIn_7_0);
                              stackOut_7_1 = stackIn_7_1;
                              stackOut_7_2 = (cb) ((Object) stackIn_7_2);
                              stackOut_7_3 = 1;
                              stackIn_9_0 = stackOut_7_0;
                              stackIn_9_1 = stackOut_7_1;
                              stackIn_9_2 = stackOut_7_2;
                              stackIn_9_3 = stackOut_7_3;
                              break L5;
                            }
                          }
                          ((hl) (Object) stackIn_9_0).a((byte) stackIn_9_1, stackIn_9_2, stackIn_9_3 != 0);
                          if (!Lexicominos.field_L) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      param1.field_C = cc.a(param1.field_w, param1.field_C.l(), param1.field_C.j(), param1.field_C.k());
                      break L3;
                    }
                    L6: {
                      if (0 <= param1.field_p.field_k[param1.field_q]) {
                        break L6;
                      } else {
                        param1.field_C.e(-1);
                        break L6;
                      }
                    }
                    param0 = param1.field_E / var4_int;
                    break L2;
                  }
                }
              }
            }
            param1.field_C.a(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var4);
            stackOut_16_1 = new StringBuilder().append("kj.B(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, cb param3, int[] param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        cc var11 = null;
        int var12 = 0;
        hl stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        cb stackIn_13_2 = null;
        hl stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        cb stackIn_14_2 = null;
        hl stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        cb stackIn_15_2 = null;
        int stackIn_15_3 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        hl stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        cb stackOut_12_2 = null;
        hl stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        cb stackOut_14_2 = null;
        int stackOut_14_3 = 0;
        hl stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        cb stackOut_13_2 = null;
        int stackOut_13_3 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var12 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((4 & this.field_l.field_q[param3.field_z]) == 0) {
                break L1;
              } else {
                if (param3.field_h >= 0) {
                  break L1;
                } else {
                  var7_int = this.field_l.field_O[param3.field_z] / b.field_r;
                  L2: while (true) {
                    L3: {
                      L4: {
                        L5: {
                          var8 = (var7_int + 1048575 - param3.field_E) / var7_int;
                          if (var8 <= param5) {
                            break L5;
                          } else {
                            if (var12 != 0) {
                              break L4;
                            } else {
                              if (var12 == 0) {
                                break L3;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        param3.field_C.b(param4, param0, var8);
                        param3.field_E = param3.field_E + (var8 * var7_int + -1048576);
                        param0 = param0 + var8;
                        param5 = param5 - var8;
                        break L4;
                      }
                      L6: {
                        var9 = b.field_r / 100;
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
                          var11 = param3.field_C;
                          if (this.field_l.field_u[param3.field_z] == 0) {
                            break L8;
                          } else {
                            L9: {
                              param3.field_C = cc.a(param3.field_w, var11.l(), 0, var11.k());
                              stackOut_12_0 = this.field_l;
                              stackOut_12_1 = 92;
                              stackOut_12_2 = (cb) (param3);
                              stackIn_14_0 = stackOut_12_0;
                              stackIn_14_1 = stackOut_12_1;
                              stackIn_14_2 = stackOut_12_2;
                              stackIn_13_0 = stackOut_12_0;
                              stackIn_13_1 = stackOut_12_1;
                              stackIn_13_2 = stackOut_12_2;
                              if (-1 >= (param3.field_p.field_k[param3.field_q] ^ -1)) {
                                stackOut_14_0 = (hl) ((Object) stackIn_14_0);
                                stackOut_14_1 = stackIn_14_1;
                                stackOut_14_2 = (cb) ((Object) stackIn_14_2);
                                stackOut_14_3 = 0;
                                stackIn_15_0 = stackOut_14_0;
                                stackIn_15_1 = stackOut_14_1;
                                stackIn_15_2 = stackOut_14_2;
                                stackIn_15_3 = stackOut_14_3;
                                break L9;
                              } else {
                                stackOut_13_0 = (hl) ((Object) stackIn_13_0);
                                stackOut_13_1 = stackIn_13_1;
                                stackOut_13_2 = (cb) ((Object) stackIn_13_2);
                                stackOut_13_3 = 1;
                                stackIn_15_0 = stackOut_13_0;
                                stackIn_15_1 = stackOut_13_1;
                                stackIn_15_2 = stackOut_13_2;
                                stackIn_15_3 = stackOut_13_3;
                                break L9;
                              }
                            }
                            ((hl) (Object) stackIn_15_0).a((byte) stackIn_15_1, stackIn_15_2, stackIn_15_3 != 0);
                            param3.field_C.b(var9, var11.j());
                            if (var12 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        param3.field_C = cc.a(param3.field_w, var11.l(), var11.j(), var11.k());
                        break L7;
                      }
                      L10: {
                        if (param3.field_p.field_k[param3.field_q] < 0) {
                          param3.field_C.e(-1);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      L11: {
                        var11.h(var9);
                        var11.b(param4, param0, param1 - param0);
                        if (!var11.h()) {
                          break L11;
                        } else {
                          this.field_m.a(var11);
                          break L11;
                        }
                      }
                      if (var12 == 0) {
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                    param3.field_E = param3.field_E + var7_int * param5;
                    break L1;
                  }
                }
              }
            }
            param3.field_C.b(param4, param0, param5);
            if (param2 == 100) {
              break L0;
            } else {
              field_o = false;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var7 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) (var7);
            stackOut_27_1 = new StringBuilder().append("kj.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param3 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L12;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L12;
            }
          }
          L13: {
            stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param4 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L13;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L13;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param5 + ')');
        }
    }

    final void a(int param0) {
        int var2 = 0;
        cb var3 = null;
        int var4 = 0;
        var4 = Lexicominos.field_L ? 1 : 0;
        this.field_m.a(param0);
        var3 = (cb) ((Object) this.field_n.a(true));
        L0: while (true) {
          if (var3 != null) {
            if (var4 == 0) {
              L1: {
                L2: {
                  if (!this.field_l.b(var3, 0)) {
                    break L2;
                  } else {
                    if (var4 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var2 = param0;
                L3: while (true) {
                  if (var2 <= var3.field_m) {
                    this.a(var2, var3, 0);
                    var3.field_m = var3.field_m - var2;
                    break L1;
                  } else {
                    this.a(var3.field_m, var3, 0);
                    var2 = var2 - var3.field_m;
                    if (!this.field_l.a((int[]) null, 0, var3, var2, 120)) {
                      continue L3;
                    } else {
                      if (var4 != 0) {
                        var3.field_m = var3.field_m - var2;
                        break L1;
                      } else {
                        if (var4 == 0) {
                          break L1;
                        } else {
                          this.a(var2, var3, 0);
                          var3.field_m = var3.field_m - var2;
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
              var3 = (cb) ((Object) this.field_n.f(2));
              continue L0;
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final int a() {
        return 0;
    }

    final void b(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        cb var6 = null;
        int var7 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            this.field_m.b(param0, param1, param2);
            var6 = (cb) ((Object) this.field_n.a(true));
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                if (var7 == 0) {
                  L2: {
                    L3: {
                      if (!this.field_l.b(var6, 0)) {
                        break L3;
                      } else {
                        if (var7 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var5 = param2;
                    var4_int = param1;
                    L4: while (true) {
                      L5: {
                        L6: {
                          if (var5 <= var6.field_m) {
                            break L6;
                          } else {
                            this.a(var4_int, var4_int - -var5, 100, var6, param0, var6.field_m);
                            var5 = var5 - var6.field_m;
                            var4_int = var4_int + var6.field_m;
                            if (!this.field_l.a(param0, var4_int, var6, var5, 82)) {
                              continue L4;
                            } else {
                              if (var7 != 0) {
                                break L5;
                              } else {
                                if (var7 == 0) {
                                  break L2;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                        }
                        this.a(var4_int, var4_int - -var5, 100, var6, param0, var5);
                        break L5;
                      }
                      var6.field_m = var6.field_m - var5;
                      break L2;
                    }
                  }
                  var6 = (cb) ((Object) this.field_n.f(2));
                  continue L1;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var4);
            stackOut_18_1 = new StringBuilder().append("kj.I(");
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
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void c(byte param0) {
        if (param0 != 37) {
            return;
        }
        field_p = null;
        field_q = null;
    }

    final static void c(boolean param0) {
        if (!param0) {
            return;
        }
        qf.f(-28390);
    }

    final static void a(byte param0) {
        boolean discarded$43 = false;
        boolean discarded$44 = false;
        RuntimeException var1 = null;
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (!cg.a(75)) {
              L1: {
                if (null == ff.field_b) {
                  break L1;
                } else {
                  if (ff.field_b.field_d) {
                    af.a(-98);
                    ti.field_L.a(-14579, new ii(ti.field_L, qg.field_a));
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 == 22) {
                discarded$43 = ti.field_L.a(ha.field_d, true, wc.field_a, (byte) 124);
                ti.field_L.f(true);
                L2: while (true) {
                  if (!ji.a((byte) -72)) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    discarded$44 = ti.field_L.a((byte) 86, pe.field_b, da.field_b);
                    if (var2 == 0) {
                      continue L2;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var1), "kj.H(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final lk d() {
        cb var1 = null;
        var1 = (cb) ((Object) this.field_n.a(true));
        if (var1 != null) {
          if (var1.field_C != null) {
            return (lk) ((Object) var1.field_C);
          } else {
            return this.b();
          }
        } else {
          return null;
        }
    }

    kj(hl param0) {
        this.field_n = new ng();
        this.field_m = new hk();
        try {
            this.field_l = param0;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "kj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_p = "Loading sound effects";
        field_q = new long[32];
    }
}
