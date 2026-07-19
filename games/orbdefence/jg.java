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
        he var1 = (he) ((Object) this.field_k.b((byte) -75));
        if (var1 == null) {
            return null;
        }
        if (!(var1.field_l == null)) {
            return (di) ((Object) var1.field_l);
        }
        return this.d();
    }

    private final void a(int param0, he param1, int param2) {
        di discarded$1 = null;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        lj stackIn_9_0 = null;
        he stackIn_9_1 = null;
        lj stackIn_10_0 = null;
        he stackIn_10_1 = null;
        lj stackIn_11_0 = null;
        he stackIn_11_1 = null;
        int stackIn_11_2 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        lj stackOut_8_0 = null;
        he stackOut_8_1 = null;
        lj stackOut_10_0 = null;
        he stackOut_10_1 = null;
        int stackOut_10_2 = 0;
        lj stackOut_9_0 = null;
        he stackOut_9_1 = null;
        int stackOut_9_2 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            L1: {
              if (-1 == (this.field_j.field_o[param1.field_F] & 4 ^ -1)) {
                break L1;
              } else {
                if (0 > param1.field_n) {
                  var4_int = this.field_j.field_L[param1.field_F] / la.field_c;
                  var5 = (var4_int + (1048575 + -param1.field_i)) / var4_int;
                  param1.field_i = 1048575 & param0 * var4_int + param1.field_i;
                  if (var5 <= param0) {
                    L2: {
                      L3: {
                        if (-1 != (this.field_j.field_D[param1.field_F] ^ -1)) {
                          break L3;
                        } else {
                          param1.field_l = bb.a(param1.field_D, param1.field_l.g(), param1.field_l.j(), param1.field_l.l());
                          if (!OrbDefence.field_D) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L4: {
                        param1.field_l = bb.a(param1.field_D, param1.field_l.g(), 0, param1.field_l.l());
                        stackOut_8_0 = this.field_j;
                        stackOut_8_1 = (he) (param1);
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if ((param1.field_g.field_m[param1.field_h] ^ -1) <= -1) {
                          stackOut_10_0 = (lj) ((Object) stackIn_10_0);
                          stackOut_10_1 = (he) ((Object) stackIn_10_1);
                          stackOut_10_2 = 0;
                          stackIn_11_0 = stackOut_10_0;
                          stackIn_11_1 = stackOut_10_1;
                          stackIn_11_2 = stackOut_10_2;
                          break L4;
                        } else {
                          stackOut_9_0 = (lj) ((Object) stackIn_9_0);
                          stackOut_9_1 = (he) ((Object) stackIn_9_1);
                          stackOut_9_2 = 1;
                          stackIn_11_0 = stackOut_9_0;
                          stackIn_11_1 = stackOut_9_1;
                          stackIn_11_2 = stackOut_9_2;
                          break L4;
                        }
                      }
                      ((lj) (Object) stackIn_11_0).a(stackIn_11_1, stackIn_11_2 != 0, param2 + 33816);
                      break L2;
                    }
                    L5: {
                      if (param1.field_g.field_m[param1.field_h] < 0) {
                        param1.field_l.d(-1);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    param0 = param1.field_i / var4_int;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
            }
            L6: {
              if (param2 == -23887) {
                break L6;
              } else {
                discarded$1 = this.d();
                break L6;
              }
            }
            param1.field_l.c(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var4);
            stackOut_20_1 = new StringBuilder().append("jg.H(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param2 + ')');
        }
    }

    final di d() {
        he var1 = null;
        L0: while (true) {
          var1 = (he) ((Object) this.field_k.d(853));
          if (var1 != null) {
            if (var1.field_l != null) {
              return (di) ((Object) var1.field_l);
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
        lj stackIn_13_0 = null;
        he stackIn_13_1 = null;
        lj stackIn_14_0 = null;
        he stackIn_14_1 = null;
        lj stackIn_15_0 = null;
        he stackIn_15_1 = null;
        int stackIn_15_2 = 0;
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
        lj stackOut_12_0 = null;
        he stackOut_12_1 = null;
        lj stackOut_14_0 = null;
        he stackOut_14_1 = null;
        int stackOut_14_2 = 0;
        lj stackOut_13_0 = null;
        he stackOut_13_1 = null;
        int stackOut_13_2 = 0;
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
        var12 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3) {
                break L1;
              } else {
                this.field_j = (lj) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if ((4 & this.field_j.field_o[param4.field_F]) == 0) {
                  break L3;
                } else {
                  if (param4.field_n >= 0) {
                    break L3;
                  } else {
                    var7_int = this.field_j.field_L[param4.field_F] / la.field_c;
                    L4: while (true) {
                      L5: {
                        var8 = (-param4.field_i + (1048575 + var7_int)) / var7_int;
                        if (var8 > param5) {
                          break L5;
                        } else {
                          param4.field_l.b(param0, param2, var8);
                          param4.field_i = param4.field_i + (-1048576 + var8 * var7_int);
                          param2 = param2 + var8;
                          param5 = param5 - var8;
                          var9 = la.field_c / 100;
                          var10 = 262144 / var7_int;
                          if (var12 != 0) {
                            break L2;
                          } else {
                            L6: {
                              if (var9 > var10) {
                                var9 = var10;
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            L7: {
                              L8: {
                                var11 = param4.field_l;
                                if (0 == this.field_j.field_D[param4.field_F]) {
                                  break L8;
                                } else {
                                  L9: {
                                    param4.field_l = bb.a(param4.field_D, var11.g(), 0, var11.l());
                                    stackOut_12_0 = this.field_j;
                                    stackOut_12_1 = (he) (param4);
                                    stackIn_14_0 = stackOut_12_0;
                                    stackIn_14_1 = stackOut_12_1;
                                    stackIn_13_0 = stackOut_12_0;
                                    stackIn_13_1 = stackOut_12_1;
                                    if (param4.field_g.field_m[param4.field_h] >= 0) {
                                      stackOut_14_0 = (lj) ((Object) stackIn_14_0);
                                      stackOut_14_1 = (he) ((Object) stackIn_14_1);
                                      stackOut_14_2 = 0;
                                      stackIn_15_0 = stackOut_14_0;
                                      stackIn_15_1 = stackOut_14_1;
                                      stackIn_15_2 = stackOut_14_2;
                                      break L9;
                                    } else {
                                      stackOut_13_0 = (lj) ((Object) stackIn_13_0);
                                      stackOut_13_1 = (he) ((Object) stackIn_13_1);
                                      stackOut_13_2 = 1;
                                      stackIn_15_0 = stackOut_13_0;
                                      stackIn_15_1 = stackOut_13_1;
                                      stackIn_15_2 = stackOut_13_2;
                                      break L9;
                                    }
                                  }
                                  ((lj) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_15_2 != 0, 9929);
                                  param4.field_l.d(var9, var11.j());
                                  if (var12 == 0) {
                                    break L7;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              param4.field_l = bb.a(param4.field_D, var11.g(), var11.j(), var11.l());
                              break L7;
                            }
                            L10: {
                              if (param4.field_g.field_m[param4.field_h] < 0) {
                                param4.field_l.d(-1);
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                            L11: {
                              var11.f(var9);
                              var11.b(param0, param2, param1 + -param2);
                              if (var11.e()) {
                                this.field_m.a(var11);
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                            if (var12 == 0) {
                              continue L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      param4.field_i = param4.field_i + var7_int * param5;
                      break L3;
                    }
                  }
                }
              }
              param4.field_l.b(param0, param2, param5);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var7 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) (var7);
            stackOut_27_1 = new StringBuilder().append("jg.I(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
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
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
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
          throw dd.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param5 + ')');
        }
    }

    final int c() {
        return 0;
    }

    final void c(int param0) {
        int var2 = 0;
        he var3 = null;
        int var4 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        boolean stackOut_5_0 = false;
        boolean stackOut_9_0 = false;
        var4 = OrbDefence.field_D ? 1 : 0;
        this.field_m.c(param0);
        var3 = (he) ((Object) this.field_k.b((byte) 117));
        L0: while (true) {
          if (var3 != null) {
            if (var4 == 0) {
              stackOut_5_0 = this.field_j.a(var3, (byte) 90);
              stackIn_6_0 = stackOut_5_0;
              L1: while (true) {
                L2: {
                  if (stackIn_6_0) {
                    break L2;
                  } else {
                    var2 = param0;
                    L3: while (true) {
                      if (var3.field_w >= var2) {
                        this.a(var2, var3, -23887);
                        var3.field_w = var3.field_w - var2;
                        break L2;
                      } else {
                        this.a(var3.field_w, var3, -23887);
                        var2 = var2 - var3.field_w;
                        stackOut_9_0 = this.field_j.a(4160, var3, 0, var2, (int[]) null);
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
                var3 = (he) ((Object) this.field_k.d(853));
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

    final void b(int[] param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        he var6 = null;
        int var7 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            this.field_m.b(param0, param1, param2);
            var6 = (he) ((Object) this.field_k.b((byte) -96));
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                if (var7 == 0) {
                  L2: {
                    if (this.field_j.a(var6, (byte) 98)) {
                      break L2;
                    } else {
                      var4_int = param1;
                      var5 = param2;
                      L3: while (true) {
                        L4: {
                          L5: {
                            if (var6.field_w >= var5) {
                              break L5;
                            } else {
                              this.a(param0, var4_int + var5, var4_int, true, var6, var6.field_w);
                              var5 = var5 - var6.field_w;
                              var4_int = var4_int + var6.field_w;
                              if (!this.field_j.a(4160, var6, var4_int, var5, param0)) {
                                continue L3;
                              } else {
                                if (var7 != 0) {
                                  break L4;
                                } else {
                                  if (var7 == 0) {
                                    break L2;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                          }
                          this.a(param0, var4_int + var5, var4_int, true, var6, var5);
                          break L4;
                        }
                        var6.field_w = var6.field_w - var5;
                        break L2;
                      }
                    }
                  }
                  var6 = (he) ((Object) this.field_k.d(853));
                  continue L1;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var4);
            stackOut_16_1 = new StringBuilder().append("jg.B(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ')');
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
        this.field_k = new im();
        this.field_m = new v();
        try {
            this.field_j = param0;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "jg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = "FAST BLAST";
    }
}
