/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd extends lj {
    static String field_p;
    static String field_o;
    private wl field_q;
    static jj field_l;
    jj field_n;
    vg field_m;

    final lj c() {
        sh var1 = null;
        var1 = (sh) (Object) ((vd) this).field_n.d(9272);
        if (var1 != null) {
          if (var1.field_k != null) {
            return (lj) (Object) var1.field_k;
          } else {
            return ((vd) this).a();
          }
        } else {
          return null;
        }
    }

    final static int b(int param0, int param1) {
        param0--;
        param0 = param0 | param0 >>> 1;
        param0 = param0 | param0 >>> 2;
        param0 = param0 | param0 >>> 4;
        param0 = param0 | param0 >>> 8;
        param0 = param0 | param0 >>> 16;
        return param0 - -1;
    }

    public static void c(byte param0) {
        field_o = null;
        field_p = null;
        field_l = null;
    }

    final lj a() {
        sh var1 = null;
        L0: while (true) {
          var1 = (sh) (Object) ((vd) this).field_n.e((byte) -119);
          if (var1 != null) {
            if (var1.field_k != null) {
              return (lj) (Object) var1.field_k;
            } else {
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    final void a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        sh var6 = null;
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
        var7 = Terraphoenix.field_V;
        try {
          L0: {
            ((vd) this).field_m.a(param0, param1, param2);
            var6 = (sh) (Object) ((vd) this).field_n.d(9272);
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                L2: {
                  if (((vd) this).field_q.a(var6, 16384)) {
                    break L2;
                  } else {
                    var4_int = param1;
                    var5 = param2;
                    L3: while (true) {
                      if (var6.field_y >= var5) {
                        this.a(var6, param0, var5 + var4_int, var5, var4_int, (byte) 13);
                        var6.field_y = var6.field_y - var5;
                        break L2;
                      } else {
                        this.a(var6, param0, var4_int + var5, var6.field_y, var4_int, (byte) 3);
                        var4_int = var4_int + var6.field_y;
                        var5 = var5 - var6.field_y;
                        if (((vd) this).field_q.a((byte) 101, param0, var5, var6, var4_int)) {
                          break L2;
                        } else {
                          continue L3;
                        }
                      }
                    }
                  }
                }
                var6 = (sh) (Object) ((vd) this).field_n.e((byte) -119);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("vd.D(");
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
          throw qk.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0) {
        int var2 = 0;
        sh var3 = null;
        int var4 = 0;
        var4 = Terraphoenix.field_V;
        ((vd) this).field_m.a(param0);
        var3 = (sh) (Object) ((vd) this).field_n.d(9272);
        L0: while (true) {
          if (var3 != null) {
            L1: {
              if (((vd) this).field_q.a(var3, 16384)) {
                break L1;
              } else {
                var2 = param0;
                L2: while (true) {
                  if (var2 <= var3.field_y) {
                    this.a(var2, 10756, var3);
                    var3.field_y = var3.field_y - var2;
                    break L1;
                  } else {
                    this.a(var3.field_y, 10756, var3);
                    var2 = var2 - var3.field_y;
                    if (!((vd) this).field_q.a((byte) 77, (int[]) null, var2, var3, 0)) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            var3 = (sh) (Object) ((vd) this).field_n.e((byte) -119);
            continue L0;
          } else {
            return;
          }
        }
    }

    final int d() {
        return 0;
    }

    private final void a(sh param0, int[] param1, int param2, int param3, int param4, byte param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        lh var11 = null;
        int var12 = 0;
        wl stackIn_12_0 = null;
        wl stackIn_13_0 = null;
        wl stackIn_14_0 = null;
        int stackIn_14_1 = 0;
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
        wl stackOut_11_0 = null;
        wl stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        wl stackOut_12_0 = null;
        int stackOut_12_1 = 0;
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
        var12 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if ((((vd) this).field_q.field_q[param0.field_v] & 4) == 0) {
                break L1;
              } else {
                if (param0.field_h < 0) {
                  var7_int = ((vd) this).field_q.field_D[param0.field_v] / nk.field_u;
                  L2: while (true) {
                    var8 = (1048575 - -var7_int - param0.field_A) / var7_int;
                    if (var8 <= param3) {
                      L3: {
                        param0.field_k.a(param1, param4, var8);
                        param3 = param3 - var8;
                        param0.field_A = param0.field_A + (var7_int * var8 - 1048576);
                        param4 = param4 + var8;
                        var9 = nk.field_u / 100;
                        var10 = 262144 / var7_int;
                        if (var10 >= var9) {
                          break L3;
                        } else {
                          var9 = var10;
                          break L3;
                        }
                      }
                      L4: {
                        var11 = param0.field_k;
                        if (((vd) this).field_q.field_S[param0.field_v] != 0) {
                          L5: {
                            param0.field_k = lh.a(param0.field_F, var11.l(), 0, var11.g());
                            stackOut_11_0 = ((vd) this).field_q;
                            stackIn_13_0 = stackOut_11_0;
                            stackIn_12_0 = stackOut_11_0;
                            if (param0.field_B.field_p[param0.field_w] >= 0) {
                              stackOut_13_0 = (wl) (Object) stackIn_13_0;
                              stackOut_13_1 = 0;
                              stackIn_14_0 = stackOut_13_0;
                              stackIn_14_1 = stackOut_13_1;
                              break L5;
                            } else {
                              stackOut_12_0 = (wl) (Object) stackIn_12_0;
                              stackOut_12_1 = 1;
                              stackIn_14_0 = stackOut_12_0;
                              stackIn_14_1 = stackOut_12_1;
                              break L5;
                            }
                          }
                          ((wl) (Object) stackIn_14_0).a(stackIn_14_1 != 0, param0, 109);
                          param0.field_k.e(var9, var11.h());
                          break L4;
                        } else {
                          param0.field_k = lh.a(param0.field_F, var11.l(), var11.h(), var11.g());
                          break L4;
                        }
                      }
                      L6: {
                        if (0 > param0.field_B.field_p[param0.field_w]) {
                          param0.field_k.g(-1);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var11.c(var9);
                      var11.a(param1, param4, param2 - param4);
                      if (!var11.k()) {
                        continue L2;
                      } else {
                        ((vd) this).field_m.a((lj) (Object) var11);
                        continue L2;
                      }
                    } else {
                      param0.field_A = param0.field_A + param3 * var7_int;
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            var7_int = -8 % ((-49 - param5) / 44);
            param0.field_k.a(param1, param4, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var7;
            stackOut_23_1 = new StringBuilder().append("vd.I(");
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
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          L8: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L8;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final void a(int param0, int param1, sh param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        wl stackIn_6_0 = null;
        wl stackIn_7_0 = null;
        wl stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        wl stackOut_5_0 = null;
        wl stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        wl stackOut_6_0 = null;
        int stackOut_6_1 = 0;
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
              if (-1 == (4 & ((vd) this).field_q.field_q[param2.field_v])) {
                break L1;
              } else {
                if (-1 > param2.field_h) {
                  var4_int = ((vd) this).field_q.field_D[param2.field_v] / nk.field_u;
                  var5 = (1048575 + (var4_int - param2.field_A)) / var4_int;
                  param2.field_A = 1048575 & var4_int * param0 + param2.field_A;
                  if (var5 > param0) {
                    break L1;
                  } else {
                    L2: {
                      if (((vd) this).field_q.field_S[param2.field_v] == 0) {
                        param2.field_k = lh.a(param2.field_F, param2.field_k.l(), param2.field_k.h(), param2.field_k.g());
                        break L2;
                      } else {
                        L3: {
                          param2.field_k = lh.a(param2.field_F, param2.field_k.l(), 0, param2.field_k.g());
                          stackOut_5_0 = ((vd) this).field_q;
                          stackIn_7_0 = stackOut_5_0;
                          stackIn_6_0 = stackOut_5_0;
                          if (param2.field_B.field_p[param2.field_w] >= 0) {
                            stackOut_7_0 = (wl) (Object) stackIn_7_0;
                            stackOut_7_1 = 0;
                            stackIn_8_0 = stackOut_7_0;
                            stackIn_8_1 = stackOut_7_1;
                            break L3;
                          } else {
                            stackOut_6_0 = (wl) (Object) stackIn_6_0;
                            stackOut_6_1 = 1;
                            stackIn_8_0 = stackOut_6_0;
                            stackIn_8_1 = stackOut_6_1;
                            break L3;
                          }
                        }
                        ((wl) (Object) stackIn_8_0).a(stackIn_8_1 != 0, param2, 100);
                        break L2;
                      }
                    }
                    L4: {
                      if (param2.field_B.field_p[param2.field_w] < 0) {
                        param2.field_k.g(-1);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    param0 = param2.field_A / var4_int;
                    break L1;
                  }
                } else {
                  param2.field_k.a(param0);
                  return;
                }
              }
            }
            param2.field_k.a(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var4;
            stackOut_16_1 = new StringBuilder().append("vd.C(").append(param0).append(',').append(10756).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
    }

    vd(wl param0) {
        ((vd) this).field_n = new jj();
        ((vd) this).field_m = new vg();
        try {
            ((vd) this).field_q = param0;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "vd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Email is valid";
        field_o = "Please wait...";
        field_l = new jj();
    }
}
