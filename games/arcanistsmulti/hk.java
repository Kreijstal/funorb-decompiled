/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk extends sg {
    static boolean field_s;
    private gh field_q;
    vn field_l;
    static wj[] field_p;
    static int field_o;
    static ch field_m;
    m field_n;
    static qb field_k;
    static String field_r;

    final void a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        o var6 = null;
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
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            ((hk) this).field_n.a(param0, param1, param2);
            var6 = (o) (Object) ((hk) this).field_l.b(12623);
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                if (!((hk) this).field_q.a(true, var6)) {
                  var5 = param2;
                  var4_int = param1;
                  L2: while (true) {
                    if (var5 <= var6.field_C) {
                      this.a(var6, var4_int, var5, var4_int - -var5, param0, 59);
                      var6.field_C = var6.field_C - var5;
                      var6 = (o) (Object) ((hk) this).field_l.a(0);
                      continue L1;
                    } else {
                      this.a(var6, var4_int, var6.field_C, var5 + var4_int, param0, 82);
                      var4_int = var4_int + var6.field_C;
                      var5 = var5 - var6.field_C;
                      if (((hk) this).field_q.a(var4_int, 24464, var5, param0, var6)) {
                        var6 = (o) (Object) ((hk) this).field_l.a(0);
                        continue L1;
                      } else {
                        continue L2;
                      }
                    }
                  }
                } else {
                  var6 = (o) (Object) ((hk) this).field_l.a(0);
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("hk.AA(");
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
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    public static void b(boolean param0) {
        field_m = null;
        if (param0) {
          field_o = 74;
          field_r = null;
          field_p = null;
          field_k = null;
          return;
        } else {
          field_r = null;
          field_p = null;
          field_k = null;
          return;
        }
    }

    final int c() {
        return 0;
    }

    private final void a(o param0, int param1, int param2, int param3, int[] param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        kd var11 = null;
        int var12 = 0;
        gh stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        gh stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        gh stackIn_13_0 = null;
        int stackIn_13_1 = 0;
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
        gh stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        gh stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        gh stackOut_11_0 = null;
        int stackOut_11_1 = 0;
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
        var12 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((4 & ((hk) this).field_q.field_Q[param0.field_H]) == 0) {
                break L1;
              } else {
                if (param0.field_y >= 0) {
                  break L1;
                } else {
                  var7_int = ((hk) this).field_q.field_s[param0.field_H] / lb.field_r;
                  L2: while (true) {
                    var8 = (-param0.field_l + var7_int + 1048575) / var7_int;
                    if (param2 >= var8) {
                      L3: {
                        param0.field_n.a(param4, param1, var8);
                        param1 = param1 + var8;
                        param0.field_l = param0.field_l + (-1048576 + var7_int * var8);
                        param2 = param2 - var8;
                        var9 = lb.field_r / 100;
                        var10 = 262144 / var7_int;
                        if (var9 > var10) {
                          var9 = var10;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        var11 = param0.field_n;
                        if (((hk) this).field_q.field_H[param0.field_H] == 0) {
                          param0.field_n = kd.a(param0.field_m, var11.i(), var11.f(), var11.g());
                          break L4;
                        } else {
                          L5: {
                            param0.field_n = kd.a(param0.field_m, var11.i(), 0, var11.g());
                            stackOut_10_0 = ((hk) this).field_q;
                            stackOut_10_1 = 11132;
                            stackIn_12_0 = stackOut_10_0;
                            stackIn_12_1 = stackOut_10_1;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            if (0 <= param0.field_D.field_m[param0.field_t]) {
                              stackOut_12_0 = (gh) (Object) stackIn_12_0;
                              stackOut_12_1 = stackIn_12_1;
                              stackOut_12_2 = 0;
                              stackIn_13_0 = stackOut_12_0;
                              stackIn_13_1 = stackOut_12_1;
                              stackIn_13_2 = stackOut_12_2;
                              break L5;
                            } else {
                              stackOut_11_0 = (gh) (Object) stackIn_11_0;
                              stackOut_11_1 = stackIn_11_1;
                              stackOut_11_2 = 1;
                              stackIn_13_0 = stackOut_11_0;
                              stackIn_13_1 = stackOut_11_1;
                              stackIn_13_2 = stackOut_11_2;
                              break L5;
                            }
                          }
                          ((gh) (Object) stackIn_13_0).a(stackIn_13_1, stackIn_13_2 != 0, param0);
                          param0.field_n.d(var9, var11.f());
                          break L4;
                        }
                      }
                      L6: {
                        if (param0.field_D.field_m[param0.field_t] < 0) {
                          param0.field_n.e(-1);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var11.d(var9);
                      var11.a(param4, param1, -param1 + param3);
                      if (!var11.h()) {
                        continue L2;
                      } else {
                        ((hk) this).field_n.b((sg) (Object) var11);
                        continue L2;
                      }
                    } else {
                      param0.field_l = param0.field_l + var7_int * param2;
                      break L1;
                    }
                  }
                }
              }
            }
            var7_int = -125 / ((21 - param5) / 35);
            param0.field_n.a(param4, param1, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var7;
            stackOut_23_1 = new StringBuilder().append("hk.D(");
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
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param4 == null) {
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
          throw aa.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 44 + param5 + 41);
        }
    }

    final sg b() {
        o var1 = null;
        int var2 = 0;
        var2 = ArcanistsMulti.field_G ? 1 : 0;
        L0: while (true) {
          var1 = (o) (Object) ((hk) this).field_l.a(0);
          if (var1 != null) {
            if (null != var1.field_n) {
              return (sg) (Object) var1.field_n;
            } else {
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    final static boolean c(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        boolean stackOut_6_0 = false;
        int stackOut_3_0 = 0;
        boolean stackOut_2_0 = false;
        if (param0 != 0) {
          L0: {
            boolean discarded$8 = hk.c(-43);
            if (null != ka.field_m) {
              stackOut_7_0 = 1;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = ie.field_Pb;
              stackIn_8_0 = stackOut_6_0 ? 1 : 0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (null != ka.field_m) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = ie.field_Pb;
              stackIn_4_0 = stackOut_2_0 ? 1 : 0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final sg a() {
        o var1 = (o) (Object) ((hk) this).field_l.b(12623);
        if (var1 == null) {
            return null;
        }
        if (!(var1.field_n == null)) {
            return (sg) (Object) var1.field_n;
        }
        return ((hk) this).b();
    }

    private final void a(o param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        gh stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        gh stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        gh stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        gh stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        gh stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        gh stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
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
              if ((((hk) this).field_q.field_Q[param0.field_H] & 4) == 0) {
                break L1;
              } else {
                if (0 > param0.field_y) {
                  var4_int = ((hk) this).field_q.field_s[param0.field_H] / lb.field_r;
                  var5 = (1048575 + (var4_int + -param0.field_l)) / var4_int;
                  param0.field_l = 1048575 & param0.field_l + var4_int * param2;
                  if (param2 < var5) {
                    break L1;
                  } else {
                    L2: {
                      if (0 != ((hk) this).field_q.field_H[param0.field_H]) {
                        L3: {
                          param0.field_n = kd.a(param0.field_m, param0.field_n.i(), 0, param0.field_n.g());
                          stackOut_6_0 = ((hk) this).field_q;
                          stackOut_6_1 = 11132;
                          stackIn_8_0 = stackOut_6_0;
                          stackIn_8_1 = stackOut_6_1;
                          stackIn_7_0 = stackOut_6_0;
                          stackIn_7_1 = stackOut_6_1;
                          if (0 <= param0.field_D.field_m[param0.field_t]) {
                            stackOut_8_0 = (gh) (Object) stackIn_8_0;
                            stackOut_8_1 = stackIn_8_1;
                            stackOut_8_2 = 0;
                            stackIn_9_0 = stackOut_8_0;
                            stackIn_9_1 = stackOut_8_1;
                            stackIn_9_2 = stackOut_8_2;
                            break L3;
                          } else {
                            stackOut_7_0 = (gh) (Object) stackIn_7_0;
                            stackOut_7_1 = stackIn_7_1;
                            stackOut_7_2 = 1;
                            stackIn_9_0 = stackOut_7_0;
                            stackIn_9_1 = stackOut_7_1;
                            stackIn_9_2 = stackOut_7_2;
                            break L3;
                          }
                        }
                        ((gh) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_9_2 != 0, param0);
                        break L2;
                      } else {
                        param0.field_n = kd.a(param0.field_m, param0.field_n.i(), param0.field_n.f(), param0.field_n.g());
                        break L2;
                      }
                    }
                    L4: {
                      if (0 > param0.field_D.field_m[param0.field_t]) {
                        param0.field_n.e(-1);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    param2 = param0.field_l / var4_int;
                    break L1;
                  }
                } else {
                  param0.field_n.a(param2);
                  return;
                }
              }
            }
            param0.field_n.a(param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var4;
            stackOut_16_1 = new StringBuilder().append("hk.E(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
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
          throw aa.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + 0 + 44 + param2 + 41);
        }
    }

    final void a(int param0) {
        int var2 = 0;
        o var3 = null;
        int var4 = 0;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        ((hk) this).field_n.a(param0);
        var3 = (o) (Object) ((hk) this).field_l.b(12623);
        L0: while (true) {
          if (var3 != null) {
            if (!((hk) this).field_q.a(true, var3)) {
              var2 = param0;
              L1: while (true) {
                if (var3.field_C >= var2) {
                  this.a(var3, 0, var2);
                  var3.field_C = var3.field_C - var2;
                  var3 = (o) (Object) ((hk) this).field_l.a(0);
                  continue L0;
                } else {
                  this.a(var3, 0, var3.field_C);
                  var2 = var2 - var3.field_C;
                  if (((hk) this).field_q.a(0, 24464, var2, (int[]) null, var3)) {
                    var3 = (o) (Object) ((hk) this).field_l.a(0);
                    continue L0;
                  } else {
                    continue L1;
                  }
                }
              }
            } else {
              var3 = (o) (Object) ((hk) this).field_l.a(0);
              continue L0;
            }
          } else {
            return;
          }
        }
    }

    final static void d(int param0) {
        u.field_k = false;
        field_s = false;
        ee.a(-1, (byte) 30);
        in.field_Gb = uj.field_h;
        hb.field_Gb = uj.field_h;
    }

    hk(gh param0) {
        ((hk) this).field_l = new vn();
        ((hk) this).field_n = new m();
        try {
            ((hk) this).field_q = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "hk.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new ch(2);
        field_r = "Password is valid";
    }
}
