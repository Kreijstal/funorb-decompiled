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

    final static me a(java.applet.Applet param0, int param1) {
        String var2 = null;
        me[] var3 = null;
        int var4 = 0;
        me var5 = null;
        int var6 = 0;
        var6 = BrickABrac.field_J ? 1 : 0;
        var2 = ki.a(param0, 104, "jagex-last-login-method");
        if (var2 == null) {
          return bb.field_c;
        } else {
          var3 = bo.b(140);
          var4 = 0;
          L0: while (true) {
            if (var3.length <= var4) {
              if (param1 != -28432) {
                return null;
              } else {
                return bb.field_c;
              }
            } else {
              var5 = var3[var4];
              if (var5.b(var2, param1 + 28554)) {
                return var5;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        }
    }

    final int c(boolean param0) {
        if (param0) {
            field_N = null;
            return ((qi) this).field_O.b(true);
        }
        return ((qi) this).field_O.b(true);
    }

    public static void j(int param0) {
        field_K = null;
        field_N = null;
        if (param0 != 18724) {
            Object var2 = null;
            me discarded$0 = qi.a((java.applet.Applet) null, 5);
        }
    }

    final static void a(byte param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        var5 = ke.field_m;
        var1 = var5;
        var2 = 0;
        if (param0 != 109) {
          return;
        } else {
          var3 = var5.length;
          L0: while (true) {
            if (var3 <= var2) {
              return;
            } else {
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              continue L0;
            }
          }
        }
    }

    final int a(int param0, boolean param1) {
        c stackIn_3_0 = null;
        c stackIn_4_0 = null;
        c stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        c stackOut_2_0;
        c stackOut_4_0;
        int stackOut_4_1;
        c stackOut_3_0;
        int stackOut_3_1;
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
        var8 = BrickABrac.field_J ? 1 : 0;
        var14 = jl.field_e;
        var2 = var14.l(255);
        if (param0 == (var2 ^ -1)) {
          var11 = vn.d(8);
          var3 = var11;
          var10 = var11;
          var4 = var10;
          var5 = var14;
          var6 = ((wq) (Object) var5).l(255);
          var7 = 0;
          L0: while (true) {
            if (var6 <= var7) {
              var13 = (al) (Object) ej.field_F.d(param0 + -84);
              if (var13 == null) {
                hn.a((byte) 102);
                return;
              } else {
                var13.field_i = true;
                var13.field_k = var3;
                var13.b((byte) 111);
                return;
              }
            } else {
              var10[var7] = ((wq) (Object) var5).e(pn.a(param0, -256));
              var7++;
              continue L0;
            }
          }
        } else {
          if (1 != var2) {
            if ((var2 ^ -1) == -3) {
              var15 = (al) (Object) ej.field_F.d(-42);
              if (var15 == null) {
                hn.a((byte) 119);
                return;
              } else {
                var15.field_k = vn.d(8);
                var15.field_i = true;
                var15.b((byte) 111);
                return;
              }
            } else {
              rk.a("A1: " + eq.c((byte) -92), (Throwable) null, 88);
              hn.a((byte) 52);
              return;
            }
          } else {
            var12 = (e) (Object) na.field_Q.d(param0 ^ 86);
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

    final boolean a(oc param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = BrickABrac.field_J ? 1 : 0;
        if (super.a(param0, param1, param2, param3, param4, param5, param6 + param6)) {
          L0: {
            var8 = -((qi) this).field_L + (-param2 + param1);
            var9 = -(((qi) this).field_L * 2) + ((qi) this).field_t;
            if (var9 >= var8) {
              break L0;
            } else {
              var8 = var9;
              break L0;
            }
          }
          L1: {
            if ((var8 ^ -1) <= -1) {
              break L1;
            } else {
              var8 = 0;
              break L1;
            }
          }
          var8 = ((qi) this).field_P * var8 / var9;
          if (param4 != -2) {
            if (-3 == param4) {
              var10 = 2147483647;
              var11 = -1;
              var12 = 0;
              L2: while (true) {
                if (((qi) this).field_O.b(true) <= var12) {
                  if (var11 >= 0) {
                    ((qi) this).field_O.a((byte) 46, var11);
                    return true;
                  } else {
                    return true;
                  }
                } else {
                  var13 = -var8 + ((qi) this).field_O.a(var12, (byte) 64);
                  var13 = var13 * var13;
                  if (var10 > var13) {
                    var10 = var13;
                    var11 = var12;
                    var12++;
                    var12++;
                    continue L2;
                  } else {
                    var12++;
                    var12++;
                    continue L2;
                  }
                }
              }
            } else {
              return true;
            }
          } else {
            ((qi) this).field_O.a(false, var8);
            return true;
          }
        } else {
          return false;
        }
    }

    final static int i(int param0) {
        if (param0 != -29946) {
            return -15;
        }
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
