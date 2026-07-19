/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh extends ej {
    static boolean field_l;
    static int field_p;
    private mf field_n;
    static int field_q;
    nc field_m;
    static da field_o;
    e field_r;
    static int field_s;

    final ej a() {
        hg var1 = (hg) ((Object) this.field_m.a((byte) 51));
        if (var1 == null) {
            return null;
        }
        if (!(null == var1.field_w)) {
            return (ej) ((Object) var1.field_w);
        }
        return this.b();
    }

    final static boolean a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = 42 % ((param1 - 47) / 54);
            var3 = param0.charAt(0);
            var4 = 1;
            L1: while (true) {
              L2: {
                L3: {
                  if (param0.length() <= var4) {
                    break L3;
                  } else {
                    stackOut_3_0 = var3 ^ -1;
                    stackIn_9_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      if (stackIn_4_0 == (param0.charAt(var4) ^ -1)) {
                        var4++;
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      } else {
                        stackOut_5_0 = 0;
                        stackIn_6_0 = stackOut_5_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                }
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                break L2;
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var2);
            stackOut_10_1 = new StringBuilder().append("lh.D(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    final void a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        hg var6 = null;
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
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            this.field_r.a(param0, param1, param2);
            var6 = (hg) ((Object) this.field_m.a((byte) 51));
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                if (var7 == 0) {
                  L2: {
                    L3: {
                      if (!this.field_n.b(var6, -1642423728)) {
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
                          if (var5 <= var6.field_t) {
                            break L6;
                          } else {
                            this.a(param0, var5 + var4_int, var6, var4_int, var6.field_t, (byte) -117);
                            var5 = var5 - var6.field_t;
                            var4_int = var4_int + var6.field_t;
                            if (!this.field_n.a(var4_int, param0, var5, 100, var6)) {
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
                        this.a(param0, var5 + var4_int, var6, var4_int, var5, (byte) -117);
                        break L5;
                      }
                      var6.field_t = var6.field_t - var5;
                      break L2;
                    }
                  }
                  var6 = (hg) ((Object) this.field_m.b(-51));
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
            stackOut_18_1 = new StringBuilder().append("lh.AA(");
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
          throw fc.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int d() {
        return 0;
    }

    public static void d(int param0) {
        if (param0 > -67) {
            return;
        }
        field_o = null;
    }

    private final void a(byte param0, hg param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        mf stackIn_7_0 = null;
        hg stackIn_7_1 = null;
        mf stackIn_8_0 = null;
        hg stackIn_8_1 = null;
        mf stackIn_9_0 = null;
        hg stackIn_9_1 = null;
        int stackIn_9_2 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        mf stackOut_6_0 = null;
        hg stackOut_6_1 = null;
        mf stackOut_8_0 = null;
        hg stackOut_8_1 = null;
        int stackOut_8_2 = 0;
        mf stackOut_7_0 = null;
        hg stackOut_7_1 = null;
        int stackOut_7_2 = 0;
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
            L1: {
              if (0 == (this.field_n.field_U[param1.field_z] & 4)) {
                break L1;
              } else {
                if (param1.field_k < 0) {
                  var4_int = this.field_n.field_J[param1.field_z] / gj.field_s;
                  var5 = (-param1.field_C + var4_int + 1048575) / var4_int;
                  param1.field_C = var4_int * param2 + param1.field_C & 1048575;
                  if (param2 >= var5) {
                    L2: {
                      L3: {
                        if (this.field_n.field_z[param1.field_z] == 0) {
                          break L3;
                        } else {
                          L4: {
                            param1.field_w = qi.a(param1.field_u, param1.field_w.j(), 0, param1.field_w.f());
                            stackOut_6_0 = this.field_n;
                            stackOut_6_1 = (hg) (param1);
                            stackIn_8_0 = stackOut_6_0;
                            stackIn_8_1 = stackOut_6_1;
                            stackIn_7_0 = stackOut_6_0;
                            stackIn_7_1 = stackOut_6_1;
                            if ((param1.field_p.field_s[param1.field_o] ^ -1) <= -1) {
                              stackOut_8_0 = (mf) ((Object) stackIn_8_0);
                              stackOut_8_1 = (hg) ((Object) stackIn_8_1);
                              stackOut_8_2 = 0;
                              stackIn_9_0 = stackOut_8_0;
                              stackIn_9_1 = stackOut_8_1;
                              stackIn_9_2 = stackOut_8_2;
                              break L4;
                            } else {
                              stackOut_7_0 = (mf) ((Object) stackIn_7_0);
                              stackOut_7_1 = (hg) ((Object) stackIn_7_1);
                              stackOut_7_2 = 1;
                              stackIn_9_0 = stackOut_7_0;
                              stackIn_9_1 = stackOut_7_1;
                              stackIn_9_2 = stackOut_7_2;
                              break L4;
                            }
                          }
                          ((mf) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_9_2 != 0, false);
                          if (!SolKnight.field_L) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      param1.field_w = qi.a(param1.field_u, param1.field_w.j(), param1.field_w.e(), param1.field_w.f());
                      break L2;
                    }
                    L5: {
                      if ((param1.field_p.field_s[param1.field_o] ^ -1) <= -1) {
                        break L5;
                      } else {
                        param1.field_w.d(-1);
                        break L5;
                      }
                    }
                    param2 = param1.field_C / var4_int;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
            }
            param1.field_w.a(param2);
            if (param0 < -43) {
              break L0;
            } else {
              field_q = 96;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var4);
            stackOut_17_1 = new StringBuilder().append("lh.C(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param2 + ')');
        }
    }

    private final void a(int[] param0, int param1, hg param2, int param3, int param4, byte param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        qi var11 = null;
        int var12 = 0;
        mf stackIn_15_0 = null;
        hg stackIn_15_1 = null;
        mf stackIn_16_0 = null;
        hg stackIn_16_1 = null;
        mf stackIn_17_0 = null;
        hg stackIn_17_1 = null;
        int stackIn_17_2 = 0;
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
        mf stackOut_14_0 = null;
        hg stackOut_14_1 = null;
        mf stackOut_16_0 = null;
        hg stackOut_16_1 = null;
        int stackOut_16_2 = 0;
        mf stackOut_15_0 = null;
        hg stackOut_15_1 = null;
        int stackOut_15_2 = 0;
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
        var12 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((4 & this.field_n.field_U[param2.field_z]) == 0) {
                break L1;
              } else {
                if (0 <= param2.field_k) {
                  break L1;
                } else {
                  var7_int = this.field_n.field_J[param2.field_z] / gj.field_s;
                  L2: while (true) {
                    L3: {
                      L4: {
                        var8 = (1048575 + (var7_int + -param2.field_C)) / var7_int;
                        if (param4 >= var8) {
                          break L4;
                        } else {
                          if (var12 != 0) {
                            break L3;
                          } else {
                            if (var12 == 0) {
                              param2.field_C = param2.field_C + var7_int * param4;
                              break L1;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      param2.field_w.a(param0, param3, var8);
                      param3 = param3 + var8;
                      param4 = param4 - var8;
                      param2.field_C = param2.field_C + (var8 * var7_int + -1048576);
                      break L3;
                    }
                    L5: {
                      var9 = gj.field_s / 100;
                      var10 = 262144 / var7_int;
                      if (var10 >= var9) {
                        break L5;
                      } else {
                        var9 = var10;
                        break L5;
                      }
                    }
                    L6: {
                      L7: {
                        var11 = param2.field_w;
                        if (0 != this.field_n.field_z[param2.field_z]) {
                          break L7;
                        } else {
                          param2.field_w = qi.a(param2.field_u, var11.j(), var11.e(), var11.f());
                          if (var12 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      L8: {
                        param2.field_w = qi.a(param2.field_u, var11.j(), 0, var11.f());
                        stackOut_14_0 = this.field_n;
                        stackOut_14_1 = (hg) (param2);
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        if ((param2.field_p.field_s[param2.field_o] ^ -1) <= -1) {
                          stackOut_16_0 = (mf) ((Object) stackIn_16_0);
                          stackOut_16_1 = (hg) ((Object) stackIn_16_1);
                          stackOut_16_2 = 0;
                          stackIn_17_0 = stackOut_16_0;
                          stackIn_17_1 = stackOut_16_1;
                          stackIn_17_2 = stackOut_16_2;
                          break L8;
                        } else {
                          stackOut_15_0 = (mf) ((Object) stackIn_15_0);
                          stackOut_15_1 = (hg) ((Object) stackIn_15_1);
                          stackOut_15_2 = 1;
                          stackIn_17_0 = stackOut_15_0;
                          stackIn_17_1 = stackOut_15_1;
                          stackIn_17_2 = stackOut_15_2;
                          break L8;
                        }
                      }
                      ((mf) (Object) stackIn_17_0).a(stackIn_17_1, stackIn_17_2 != 0, false);
                      param2.field_w.e(var9, var11.e());
                      break L6;
                    }
                    L9: {
                      if (-1 >= (param2.field_p.field_s[param2.field_o] ^ -1)) {
                        break L9;
                      } else {
                        param2.field_w.d(-1);
                        break L9;
                      }
                    }
                    L10: {
                      var11.e(var9);
                      var11.a(param0, param3, -param3 + param1);
                      if (!var11.h()) {
                        break L10;
                      } else {
                        this.field_r.a(var11);
                        break L10;
                      }
                    }
                    continue L2;
                  }
                }
              }
            }
            param2.field_w.a(param0, param3, param4);
            if (param5 == -117) {
              break L0;
            } else {
              this.field_m = (nc) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var7 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) (var7);
            stackOut_27_1 = new StringBuilder().append("lh.B(");
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
              break L11;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L11;
            }
          }
          L12: {
            stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',').append(param1).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param2 == null) {
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
          throw fc.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final ej b() {
        hg var1_ref = null;
        int var2 = SolKnight.field_L ? 1 : 0;
        do {
            var1_ref = (hg) ((Object) this.field_m.b(-60));
            if (var1_ref == null) {
                if (var2 == 0) {
                    return null;
                }
                return (ej) ((Object) var1_ref.field_w);
            }
        } while (var1_ref.field_w == null);
        return (ej) ((Object) var1_ref.field_w);
    }

    final void a(int param0) {
        int var2 = 0;
        hg var3 = null;
        int var4 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        boolean stackOut_5_0 = false;
        boolean stackOut_9_0 = false;
        var4 = SolKnight.field_L ? 1 : 0;
        this.field_r.a(param0);
        var3 = (hg) ((Object) this.field_m.a((byte) 51));
        L0: while (true) {
          if (var3 != null) {
            if (var4 == 0) {
              stackOut_5_0 = this.field_n.b(var3, -1642423728);
              stackIn_6_0 = stackOut_5_0;
              L1: while (true) {
                L2: {
                  if (stackIn_6_0) {
                    break L2;
                  } else {
                    var2 = param0;
                    L3: while (true) {
                      if (var2 <= var3.field_t) {
                        this.a((byte) -107, var3, var2);
                        var3.field_t = var3.field_t - var2;
                        break L2;
                      } else {
                        this.a((byte) -126, var3, var3.field_t);
                        var2 = var2 - var3.field_t;
                        stackOut_9_0 = this.field_n.a(0, (int[]) null, var2, 100, var3);
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
                var3 = (hg) ((Object) this.field_m.b(-126));
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

    lh(mf param0) {
        this.field_m = new nc();
        this.field_r = new e();
        try {
            this.field_n = param0;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "lh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = true;
    }
}
