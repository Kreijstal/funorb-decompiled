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
        hg var1 = (hg) (Object) ((lh) this).field_m.a((byte) 51);
        if (var1 == null) {
            return null;
        }
        if (!(null == var1.field_w)) {
            return (ej) (Object) var1.field_w;
        }
        return ((lh) this).b();
    }

    final static boolean a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = 42 % ((param1 - 47) / 54);
            var3 = param0.charAt(0);
            var4 = 1;
            L1: while (true) {
              if (param0.length() <= var4) {
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                if (var3 == param0.charAt(var4)) {
                  var4++;
                  continue L1;
                } else {
                  stackOut_4_0 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2;
            stackOut_9_1 = new StringBuilder().append("lh.D(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_8_0 != 0;
    }

    final void a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        hg var6 = null;
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
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            ((lh) this).field_r.a(param0, param1, param2);
            var6 = (hg) (Object) ((lh) this).field_m.a((byte) 51);
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                L2: {
                  if (!((lh) this).field_n.b(var6, -1642423728)) {
                    var5 = param2;
                    var4_int = param1;
                    L3: while (true) {
                      if (var5 <= var6.field_t) {
                        int discarded$2 = -117;
                        this.a(param0, var5 + var4_int, var6, var4_int, var5);
                        var6.field_t = var6.field_t - var5;
                        break L2;
                      } else {
                        int discarded$3 = -117;
                        this.a(param0, var5 + var4_int, var6, var4_int, var6.field_t);
                        var5 = var5 - var6.field_t;
                        var4_int = var4_int + var6.field_t;
                        if (!((lh) this).field_n.a(var4_int, param0, var5, 100, var6)) {
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
                var6 = (hg) (Object) ((lh) this).field_m.b(-51);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("lh.AA(");
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
          throw fc.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int d() {
        return 0;
    }

    public static void d(int param0) {
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
              if (0 == (((lh) this).field_n.field_U[param1.field_z] & 4)) {
                break L1;
              } else {
                if (param1.field_k < 0) {
                  var4_int = ((lh) this).field_n.field_J[param1.field_z] / gj.field_s;
                  var5 = (-param1.field_C + var4_int + 1048575) / var4_int;
                  param1.field_C = var4_int * param2 + param1.field_C & 1048575;
                  if (param2 >= var5) {
                    L2: {
                      if (((lh) this).field_n.field_z[param1.field_z] == 0) {
                        param1.field_w = qi.a(param1.field_u, param1.field_w.j(), param1.field_w.e(), param1.field_w.f());
                        break L2;
                      } else {
                        L3: {
                          param1.field_w = qi.a(param1.field_u, param1.field_w.j(), 0, param1.field_w.f());
                          stackOut_6_0 = ((lh) this).field_n;
                          stackOut_6_1 = (hg) param1;
                          stackIn_8_0 = stackOut_6_0;
                          stackIn_8_1 = stackOut_6_1;
                          stackIn_7_0 = stackOut_6_0;
                          stackIn_7_1 = stackOut_6_1;
                          if (param1.field_p.field_s[param1.field_o] >= 0) {
                            stackOut_8_0 = (mf) (Object) stackIn_8_0;
                            stackOut_8_1 = (hg) (Object) stackIn_8_1;
                            stackOut_8_2 = 0;
                            stackIn_9_0 = stackOut_8_0;
                            stackIn_9_1 = stackOut_8_1;
                            stackIn_9_2 = stackOut_8_2;
                            break L3;
                          } else {
                            stackOut_7_0 = (mf) (Object) stackIn_7_0;
                            stackOut_7_1 = (hg) (Object) stackIn_7_1;
                            stackOut_7_2 = 1;
                            stackIn_9_0 = stackOut_7_0;
                            stackIn_9_1 = stackOut_7_1;
                            stackIn_9_2 = stackOut_7_2;
                            break L3;
                          }
                        }
                        ((mf) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_9_2 != 0, false);
                        break L2;
                      }
                    }
                    L4: {
                      if (param1.field_p.field_s[param1.field_o] >= 0) {
                        break L4;
                      } else {
                        param1.field_w.d(-1);
                        break L4;
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
          L5: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4;
            stackOut_17_1 = new StringBuilder().append("lh.C(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param2 + ')');
        }
    }

    private final void a(int[] param0, int param1, hg param2, int param3, int param4) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        qi var11 = null;
        int var12 = 0;
        mf stackIn_11_0 = null;
        hg stackIn_11_1 = null;
        mf stackIn_12_0 = null;
        hg stackIn_12_1 = null;
        mf stackIn_13_0 = null;
        hg stackIn_13_1 = null;
        int stackIn_13_2 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        mf stackOut_10_0 = null;
        hg stackOut_10_1 = null;
        mf stackOut_12_0 = null;
        hg stackOut_12_1 = null;
        int stackOut_12_2 = 0;
        mf stackOut_11_0 = null;
        hg stackOut_11_1 = null;
        int stackOut_11_2 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var12 = SolKnight.field_L ? 1 : 0;
        try {
          if ((4 & ((lh) this).field_n.field_U[param2.field_z]) == 0) {
            param2.field_w.a(param0, param3, param4);
            return;
          } else {
            if (0 <= param2.field_k) {
              param2.field_w.a(param0, param3, param4);
              return;
            } else {
              var7_int = ((lh) this).field_n.field_J[param2.field_z] / gj.field_s;
              L0: while (true) {
                var8 = (1048575 + (var7_int + -param2.field_C)) / var7_int;
                if (param4 >= var8) {
                  L1: {
                    param2.field_w.a(param0, param3, var8);
                    param3 = param3 + var8;
                    param4 = param4 - var8;
                    param2.field_C = param2.field_C + (var8 * var7_int + -1048576);
                    var9 = gj.field_s / 100;
                    var10 = 262144 / var7_int;
                    if (var10 >= var9) {
                      break L1;
                    } else {
                      var9 = var10;
                      break L1;
                    }
                  }
                  L2: {
                    var11 = param2.field_w;
                    if (0 != ((lh) this).field_n.field_z[param2.field_z]) {
                      L3: {
                        param2.field_w = qi.a(param2.field_u, var11.j(), 0, var11.f());
                        stackOut_10_0 = ((lh) this).field_n;
                        stackOut_10_1 = (hg) param2;
                        stackIn_12_0 = stackOut_10_0;
                        stackIn_12_1 = stackOut_10_1;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        if (param2.field_p.field_s[param2.field_o] >= 0) {
                          stackOut_12_0 = (mf) (Object) stackIn_12_0;
                          stackOut_12_1 = (hg) (Object) stackIn_12_1;
                          stackOut_12_2 = 0;
                          stackIn_13_0 = stackOut_12_0;
                          stackIn_13_1 = stackOut_12_1;
                          stackIn_13_2 = stackOut_12_2;
                          break L3;
                        } else {
                          stackOut_11_0 = (mf) (Object) stackIn_11_0;
                          stackOut_11_1 = (hg) (Object) stackIn_11_1;
                          stackOut_11_2 = 1;
                          stackIn_13_0 = stackOut_11_0;
                          stackIn_13_1 = stackOut_11_1;
                          stackIn_13_2 = stackOut_11_2;
                          break L3;
                        }
                      }
                      ((mf) (Object) stackIn_13_0).a(stackIn_13_1, stackIn_13_2 != 0, false);
                      param2.field_w.e(var9, var11.e());
                      break L2;
                    } else {
                      param2.field_w = qi.a(param2.field_u, var11.j(), var11.e(), var11.f());
                      break L2;
                    }
                  }
                  L4: {
                    if (param2.field_p.field_s[param2.field_o] >= 0) {
                      break L4;
                    } else {
                      param2.field_w.d(-1);
                      break L4;
                    }
                  }
                  var11.e(var9);
                  var11.a(param0, param3, -param3 + param1);
                  if (!var11.h()) {
                    continue L0;
                  } else {
                    ((lh) this).field_r.a((ej) (Object) var11);
                    continue L0;
                  }
                } else {
                  param2.field_C = param2.field_C + var7_int * param4;
                  param2.field_w.a(param0, param3, param4);
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var7 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var7;
            stackOut_23_1 = new StringBuilder().append("lh.B(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L5;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L5;
            }
          }
          L6: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param1).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param2 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L6;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L6;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param3 + ',' + param4 + ',' + -117 + ')');
        }
    }

    final ej b() {
        hg var1 = null;
        int var2 = 0;
        var2 = SolKnight.field_L ? 1 : 0;
        L0: while (true) {
          var1 = (hg) (Object) ((lh) this).field_m.b(-60);
          if (var1 != null) {
            if (var1.field_w != null) {
              return (ej) (Object) var1.field_w;
            } else {
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    final void a(int param0) {
        int var2 = 0;
        hg var3 = null;
        int var4 = 0;
        var4 = SolKnight.field_L ? 1 : 0;
        ((lh) this).field_r.a(param0);
        var3 = (hg) (Object) ((lh) this).field_m.a((byte) 51);
        L0: while (true) {
          if (var3 != null) {
            L1: {
              if (((lh) this).field_n.b(var3, -1642423728)) {
                break L1;
              } else {
                var2 = param0;
                L2: while (true) {
                  if (var2 <= var3.field_t) {
                    this.a((byte) -107, var3, var2);
                    var3.field_t = var3.field_t - var2;
                    break L1;
                  } else {
                    this.a((byte) -126, var3, var3.field_t);
                    var2 = var2 - var3.field_t;
                    if (((lh) this).field_n.a(0, (int[]) null, var2, 100, var3)) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  }
                }
              }
            }
            var3 = (hg) (Object) ((lh) this).field_m.b(-126);
            continue L0;
          } else {
            return;
          }
        }
    }

    lh(mf param0) {
        ((lh) this).field_m = new nc();
        ((lh) this).field_r = new e();
        try {
            ((lh) this).field_n = param0;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "lh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = true;
    }
}
