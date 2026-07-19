/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va extends fe {
    static int[] field_T;
    private tc field_S;
    static int[] field_N;
    static String field_O;
    static int field_V;
    static String field_P;
    private int field_U;
    static int field_X;
    int field_R;
    static String[] field_W;
    int field_Q;

    final int g(int param0) {
        boolean discarded$2 = false;
        ei var3 = null;
        if (param0 != 0) {
          var3 = (ei) null;
          discarded$2 = this.a((ei) null, -110, false, -50, 44, -90, -14);
          return this.field_S.a((byte) 98);
        } else {
          return this.field_S.a((byte) 98);
        }
    }

    final boolean a(ei param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var14 = Pool.field_O;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
              stackOut_22_0 = 0;
              stackIn_23_0 = stackOut_22_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L1: {
                var8_int = -param1 + (param6 - this.field_Q);
                var9 = -(2 * this.field_Q) + this.field_l;
                if (var9 < var8_int) {
                  var8_int = var9;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (0 > var8_int) {
                  var8_int = 0;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                var8_int = var8_int * this.field_U / var9;
                if (-2 != (param3 ^ -1)) {
                  if ((param3 ^ -1) != -3) {
                    break L3;
                  } else {
                    var10 = 2147483647;
                    var11 = -1;
                    var12 = 0;
                    L4: while (true) {
                      if (this.field_S.a((byte) 87) <= var12) {
                        if (var11 >= 0) {
                          this.field_S.c(var11, 40);
                          break L3;
                        } else {
                          return true;
                        }
                      } else {
                        L5: {
                          var13 = -var8_int + this.field_S.a(var12, 2229);
                          var13 = var13 * var13;
                          if (var10 > var13) {
                            var11 = var12;
                            var10 = var13;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var12++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  this.field_S.a((byte) -2, var8_int);
                  break L3;
                }
              }
              stackOut_20_0 = 1;
              stackIn_21_0 = stackOut_20_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var8);
            stackOut_24_1 = new StringBuilder().append("va.AA(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L6;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L6;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_21_0 != 0;
        } else {
          return stackIn_23_0 != 0;
        }
    }

    public static void a(int param0) {
        boolean discarded$2 = false;
        field_P = null;
        field_W = null;
        field_N = null;
        field_O = null;
        if (param0 != 2) {
          discarded$2 = va.g((byte) 126);
          field_T = null;
          return;
        } else {
          field_T = null;
          return;
        }
    }

    final int f(int param0) {
        if (param0 != 0) {
            return 73;
        }
        return this.field_U;
    }

    final static String a(String param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        oq var6 = null;
        CharSequence var7 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        String stackIn_18_0 = null;
        String stackIn_22_0 = null;
        String stackIn_26_0 = null;
        Object stackIn_28_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        String stackOut_9_0 = null;
        String stackOut_17_0 = null;
        String stackOut_21_0 = null;
        String stackOut_25_0 = null;
        Object stackOut_27_0 = null;
        String stackOut_12_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            var7 = (CharSequence) ((Object) param0);
            if (gj.a(-25908, var7)) {
              if (2 != th.field_a) {
                stackOut_5_0 = ka.field_n;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (or.a((byte) 3, param0)) {
                  stackOut_9_0 = fn.field_Qb;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (!lq.a(param0, -1)) {
                    L1: {
                      if (-101 < (nr.field_S ^ -1)) {
                        break L1;
                      } else {
                        if (mp.field_V <= 0) {
                          stackOut_17_0 = wk.field_V;
                          stackIn_18_0 = stackOut_17_0;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          break L1;
                        }
                      }
                    }
                    if (nr.field_S >= 200) {
                      stackOut_21_0 = wk.field_V;
                      stackIn_22_0 = stackOut_21_0;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      if (ia.a(param0, 24552)) {
                        stackOut_25_0 = nr.a(new String[]{param0}, -1, jp.field_R);
                        stackIn_26_0 = stackOut_25_0;
                        decompiledRegionSelector0 = 6;
                        break L0;
                      } else {
                        var6 = ej.field_j;
                        var6.b(false, param1);
                        var6.field_v = var6.field_v + 1;
                        var4 = var6.field_v;
                        var6.a(0, false);
                        var5 = -59 % ((-53 - param2) / 33);
                        var6.a(-9946, param0);
                        var6.b(var6.field_v + -var4, true);
                        stackOut_27_0 = null;
                        stackIn_28_0 = stackOut_27_0;
                        decompiledRegionSelector0 = 7;
                        break L0;
                      }
                    }
                  } else {
                    stackOut_12_0 = nr.a(new String[]{param0}, -1, tl.field_H);
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
            } else {
              stackOut_1_0 = p.field_g;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var3);
            stackOut_29_1 = new StringBuilder().append("va.G(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L2;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_18_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_22_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_26_0;
                    } else {
                      return (String) ((Object) stackIn_28_0);
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static boolean g(byte param0) {
        ho var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        ho var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_2_0 = 0;
        var4 = Pool.field_O;
        try {
          L0: {
            var5 = (ho) ((Object) pj.field_H.c((byte) -88));
            var1 = var5;
            if (var1 != null) {
              var2 = 0;
              var3 = -7 % ((param0 - -62) / 57);
              L1: while (true) {
                if (var1.field_t <= var2) {
                  stackOut_17_0 = 1;
                  stackIn_18_0 = stackOut_17_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  L2: {
                    if (null == var5.field_n[var2]) {
                      break L2;
                    } else {
                      if (0 != var5.field_n[var2].field_f) {
                        break L2;
                      } else {
                        stackOut_8_0 = 0;
                        stackIn_9_0 = stackOut_8_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                  L3: {
                    if (null != var5.field_p[var2]) {
                      if (var5.field_p[var2].field_f == 0) {
                        stackOut_14_0 = 0;
                        stackIn_15_0 = stackOut_14_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  var2++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1_ref), "va.F(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0 != 0;
            } else {
              return stackIn_18_0 != 0;
            }
          }
        }
    }

    final static void a(boolean param0, vh param1, vh param2) {
        try {
            if (param0) {
                field_T = (int[]) null;
            }
            param2.field_eb = -param2.field_Db + param1.field_Db >> -1507683615;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "va.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final int b(byte param0, int param1) {
        vh var4 = null;
        if (param0 <= -22) {
          if (0 <= param1) {
            if (param1 >= this.field_S.a((byte) 127)) {
              return -1;
            } else {
              return this.field_S.a(param1, 2229);
            }
          } else {
            return -1;
          }
        } else {
          var4 = (vh) null;
          va.a(true, (vh) null, (vh) null);
          if (0 <= param1) {
            if (param1 >= this.field_S.a((byte) 127)) {
              return -1;
            } else {
              return this.field_S.a(param1, 2229);
            }
          } else {
            return -1;
          }
        }
    }

    private va() throws Throwable {
        throw new Error();
    }

    static {
        field_P = "Friends can be added in multiplayer<nbsp>games";
        field_O = "Just play";
    }
}
