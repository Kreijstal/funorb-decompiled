/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi extends d {
    private int field_P;
    static String field_N;
    int field_M;
    private c field_O;
    static jp[] field_K;
    int field_L;

    final static me a(java.applet.Applet param0) {
        String var2 = null;
        RuntimeException var2_ref = null;
        me[] var3 = null;
        int var4 = 0;
        me var5 = null;
        int var6 = 0;
        me stackIn_4_0 = null;
        me stackIn_10_0 = null;
        me stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        me stackOut_3_0 = null;
        me stackOut_15_0 = null;
        me stackOut_9_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var2 = ki.a(param0, 104, "jagex-last-login-method");
            if (var2 == null) {
              stackOut_3_0 = bb.field_c;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              var3 = bo.b(140);
              var4 = 0;
              L1: while (true) {
                if (var3.length <= var4) {
                  stackOut_15_0 = bb.field_c;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (var5.b(var2, 122)) {
                    stackOut_9_0 = (me) var5;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var2_ref;
            stackOut_17_1 = new StringBuilder().append("qi.I(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L2;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + -28432 + ')');
        }
        return stackIn_16_0;
    }

    final int c(boolean param0) {
        if (param0) {
            field_N = null;
            return ((qi) this).field_O.b(true);
        }
        return ((qi) this).field_O.b(true);
    }

    public static void j() {
        field_K = null;
        field_N = null;
    }

    final static void a() {
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var5 = ke.field_m;
            var1 = var5;
            var2 = 0;
            var3 = var5.length;
            L1: while (true) {
              if (var3 <= var2) {
                break L0;
              } else {
                int incrementValue$40 = var2;
                var2++;
                var5[incrementValue$40] = 0;
                int incrementValue$41 = var2;
                var2++;
                var5[incrementValue$41] = 0;
                int incrementValue$42 = var2;
                var2++;
                var5[incrementValue$42] = 0;
                int incrementValue$43 = var2;
                var2++;
                var5[incrementValue$43] = 0;
                int incrementValue$44 = var2;
                var2++;
                var5[incrementValue$44] = 0;
                int incrementValue$45 = var2;
                var2++;
                var5[incrementValue$45] = 0;
                int incrementValue$46 = var2;
                var2++;
                var5[incrementValue$46] = 0;
                int incrementValue$47 = var2;
                var2++;
                var5[incrementValue$47] = 0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var1_ref, "qi.F(" + 109 + ')');
        }
    }

    final int a(int param0, boolean param1) {
        c stackIn_3_0 = null;
        c stackIn_4_0 = null;
        c stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        c stackOut_2_0 = null;
        c stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        c stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        if (0 <= param0) {
          L0: {
            stackOut_2_0 = ((qi) this).field_O;
            stackIn_4_0 = stackOut_2_0;
            stackIn_3_0 = stackOut_2_0;
            if (param1) {
              stackOut_4_0 = (c) (Object) stackIn_4_0;
              stackOut_4_1 = 0;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              break L0;
            } else {
              stackOut_3_0 = (c) (Object) stackIn_3_0;
              stackOut_3_1 = 1;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              break L0;
            }
          }
          if (((c) (Object) stackIn_5_0).b(stackIn_5_1 != 0) > param0) {
            if (param1) {
              ((qi) this).field_O = null;
              return ((qi) this).field_O.a(param0, (byte) 64);
            } else {
              return ((qi) this).field_O.a(param0, (byte) 64);
            }
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    final int h(int param0) {
        if (param0 >= -81) {
            ((qi) this).field_M = -5;
            return ((qi) this).field_P;
        }
        return ((qi) this).field_P;
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        pi var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var10 = null;
        int[] var11 = null;
        e var12 = null;
        al var13 = null;
        pi var14 = null;
        al var15 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var14 = jl.field_e;
            var2 = var14.l(255);
            if (var2 == 0) {
              var11 = vn.d(8);
              var3 = var11;
              var10 = var11;
              var4 = var10;
              var5 = var14;
              var6 = ((wq) (Object) var5).l(255);
              var7 = 0;
              L1: while (true) {
                if (var6 <= var7) {
                  var13 = (al) (Object) ej.field_F.d(-85);
                  if (var13 == null) {
                    hn.a((byte) 102);
                    return;
                  } else {
                    var13.field_i = true;
                    var13.field_k = var3;
                    var13.b((byte) 111);
                    break L0;
                  }
                } else {
                  var10[var7] = ((wq) (Object) var5).e(pn.a(-1, -256));
                  var7++;
                  continue L1;
                }
              }
            } else {
              if (1 != var2) {
                if (var2 == 2) {
                  var15 = (al) (Object) ej.field_F.d(-42);
                  if (var15 != null) {
                    var15.field_k = vn.d(8);
                    var15.field_i = true;
                    var15.b((byte) 111);
                    return;
                  } else {
                    hn.a((byte) 119);
                    return;
                  }
                } else {
                  rk.a("A1: " + eq.c((byte) -92), (Throwable) null, 88);
                  hn.a((byte) 52);
                  return;
                }
              } else {
                var12 = (e) (Object) na.field_Q.d(-87);
                if (var12 == null) {
                  hn.a((byte) 103);
                  return;
                } else {
                  var12.b((byte) 111);
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var1, "qi.A(" + -1 + ')');
        }
    }

    final boolean a(oc param0, int param1, int param2, int param3, int param4, int param5, int param6) {
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
        var14 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3, param4, param5, param6 + param6)) {
              stackOut_22_0 = 0;
              stackIn_23_0 = stackOut_22_0;
              break L0;
            } else {
              L1: {
                var8_int = -((qi) this).field_L + (-param2 + param1);
                var9 = -(((qi) this).field_L * 2) + ((qi) this).field_t;
                if (~var9 <= ~var8_int) {
                  break L1;
                } else {
                  var8_int = var9;
                  break L1;
                }
              }
              L2: {
                if (var8_int >= 0) {
                  break L2;
                } else {
                  var8_int = 0;
                  break L2;
                }
              }
              L3: {
                var8_int = ((qi) this).field_P * var8_int / var9;
                if (param4 == 1) {
                  ((qi) this).field_O.a(false, var8_int);
                  break L3;
                } else {
                  if (param4 != 2) {
                    break L3;
                  } else {
                    var10 = 2147483647;
                    var11 = -1;
                    var12 = 0;
                    L4: while (true) {
                      if (((qi) this).field_O.b(true) <= var12) {
                        if (var11 < 0) {
                          return true;
                        } else {
                          ((qi) this).field_O.a((byte) 46, var11);
                          break L3;
                        }
                      } else {
                        var13 = -var8_int + ((qi) this).field_O.a(var12, (byte) 64);
                        var13 = var13 * var13;
                        if (~var10 >= ~var13) {
                          var12++;
                          var12++;
                          continue L4;
                        } else {
                          var10 = var13;
                          var11 = var12;
                          var12++;
                          var12++;
                          continue L4;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_20_0 = 1;
              stackIn_21_0 = stackOut_20_0;
              return stackIn_21_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var8;
            stackOut_24_1 = new StringBuilder().append("qi.MA(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L5;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L5;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_23_0 != 0;
    }

    final static int i() {
        return ul.field_p;
    }

    private qi() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = "Cool!";
    }
}
