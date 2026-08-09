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
        RuntimeException var2_ref = null;
        me[] var3 = null;
        int var4 = 0;
        me var5 = null;
        int var6 = 0;
        me stackIn_4_0 = null;
        me stackIn_10_0 = null;
        me stackIn_14_0 = null;
        me stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var2 = ki.a(param0, 104, "jagex-last-login-method");
            if (var2 == null) {
              stackIn_4_0 = bb.field_c;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3 = bo.b(140);
              var4 = 0;
              L1: while (true) {
                if (var3.length <= var4) {
                  if (param1 == -28432) {
                    stackIn_16_0 = bb.field_c;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    stackIn_14_0 = (me) null;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  var5 = var3[var4];
                  if (var5.b(var2, param1 + 28554)) {
                    stackIn_10_0 = (me) (var5);
                    decompiledRegionSelector0 = 1;
                    break L0;
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
            stackIn_19_0 = (RuntimeException) (var2_ref);

            stackIn_19_1 = new StringBuilder().append("qi.I(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L2;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0;
            } else {
              return stackIn_16_0;
            }
          }
        }
    }

    final int c(boolean param0) {
        if (param0) {
            field_N = (String) null;
            return this.field_O.b(true);
        }
        return this.field_O.b(true);
    }

    public static void j(int param0) {
        field_K = null;
        field_N = null;
        if (param0 != 18724) {
            java.applet.Applet var2 = (java.applet.Applet) null;
            qi.a((java.applet.Applet) null, 5);
        }
    }

    final static void a(byte param0) {
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var5 = ke.field_m;
            var1 = var5;
            var2 = 0;
            if (param0 == 109) {
              var3 = var5.length;
              L1: while (true) {
                if (var3 <= var2) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  incrementValue$16 = var2;
                  var2++;
                  var5[incrementValue$16] = 0;
                  incrementValue$17 = var2;
                  var2++;
                  var5[incrementValue$17] = 0;
                  incrementValue$18 = var2;
                  var2++;
                  var5[incrementValue$18] = 0;
                  incrementValue$19 = var2;
                  var2++;
                  var5[incrementValue$19] = 0;
                  incrementValue$20 = var2;
                  var2++;
                  var5[incrementValue$20] = 0;
                  incrementValue$21 = var2;
                  var2++;
                  var5[incrementValue$21] = 0;
                  incrementValue$22 = var2;
                  var2++;
                  var5[incrementValue$22] = 0;
                  incrementValue$23 = var2;
                  var2++;
                  var5[incrementValue$23] = 0;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var1_ref), "qi.F(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int a(int param0, boolean param1) {
        c stackIn_4_0 = null;
        c stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        if (0 <= param0) {
          L0: {
            stackIn_4_0 = this.field_O;

            if (param1) {
              stackIn_5_0 = (c) ((Object) stackIn_4_0);
              stackIn_5_1 = 0;
              break L0;
            } else {
              stackIn_5_0 = (c) ((Object) stackIn_4_0);
              stackIn_5_1 = 1;
              break L0;
            }
          }
          if (((c) (Object) stackIn_5_0).b(stackIn_5_1 != 0) > param0) {
            if (param1) {
              this.field_O = (c) null;
              return this.field_O.a(param0, (byte) 64);
            } else {
              return this.field_O.a(param0, (byte) 64);
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
            this.field_M = -5;
            return this.field_P;
        }
        return this.field_P;
    }

    final static void a(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var14 = jl.field_e;
            var2 = var14.l(255);
            if (param0 == (var2 ^ -1)) {
              var11 = vn.d(8);
              var3 = var11;
              var10 = var11;
              var4 = var10;
              var5 = var14;
              var6 = ((wq) ((Object) var5)).l(255);
              var7 = 0;
              L1: while (true) {
                if (var6 <= var7) {
                  var13 = (al) ((Object) ej.field_F.d(param0 + -84));
                  if (var13 == null) {
                    hn.a((byte) 102);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var13.field_i = true;
                    var13.field_k = var3;
                    var13.b((byte) 111);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  var10[var7] = ((wq) ((Object) var5)).e(pn.a(param0, -256));
                  var7++;
                  continue L1;
                }
              }
            } else {
              if (1 != var2) {
                if ((var2 ^ -1) == -3) {
                  var15 = (al) ((Object) ej.field_F.d(-42));
                  if (var15 != null) {
                    var15.field_k = vn.d(8);
                    var15.field_i = true;
                    var15.b((byte) 111);
                    return;
                  } else {
                    hn.a((byte) 119);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  rk.a("A1: " + eq.c((byte) -92), (Throwable) null, 88);
                  hn.a((byte) 52);
                  return;
                }
              } else {
                var12 = (e) ((Object) na.field_Q.d(param0 ^ 86));
                if (var12 == null) {
                  hn.a((byte) 103);
                  decompiledRegionSelector0 = 0;
                  break L0;
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
          throw qb.a((Throwable) ((Object) var1), "qi.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final boolean a(oc param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3, param4, param5, param6 + param6)) {
              stackIn_21_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L1: {
                var8_int = -this.field_L + (-param2 + param1);
                var9 = -(this.field_L * 2) + this.field_t;
                if (var9 >= var8_int) {
                  break L1;
                } else {
                  var8_int = var9;
                  break L1;
                }
              }
              L2: {
                if ((var8_int ^ -1) <= -1) {
                  break L2;
                } else {
                  var8_int = 0;
                  break L2;
                }
              }
              L3: {
                var8_int = this.field_P * var8_int / var9;
                if ((param4 ^ -1) == -2) {
                  this.field_O.a(false, var8_int);
                  break L3;
                } else {
                  if (-3 != (param4 ^ -1)) {
                    break L3;
                  } else {
                    var10 = 2147483647;
                    var11 = -1;
                    var12 = 0;
                    L4: while (true) {
                      if (this.field_O.b(true) <= var12) {
                        if (var11 < 0) {
                          return true;
                        } else {
                          this.field_O.a((byte) 46, var11);
                          break L3;
                        }
                      } else {
                        L5: {
                          var13 = -var8_int + this.field_O.a(var12, (byte) 64);
                          var13 = var13 * var13;
                          if (var10 <= var13) {
                            break L5;
                          } else {
                            var10 = var13;
                            var11 = var12;
                            break L5;
                          }
                        }
                        var12++;
                        continue L4;
                      }
                    }
                  }
                }
              }
              stackIn_19_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var8);

            stackIn_24_1 = new StringBuilder().append("qi.MA(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L6;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L6;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_19_0 != 0;
        } else {
          return stackIn_21_0 != 0;
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
        field_N = "Cool!";
    }
}
