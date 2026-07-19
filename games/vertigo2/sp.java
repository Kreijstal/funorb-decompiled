/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sp extends nm {
    private int field_L;
    static String field_K;
    private int field_S;
    static String field_U;
    static String field_Q;
    static int field_O;
    static String field_P;
    private int field_T;
    private int field_R;
    private int field_M;
    static boolean field_V;
    private int field_N;

    boolean j(int param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var4 = 0;
        int var5 = 0;
        if (0 >= this.field_L) {
        } else {
            var2 = this.field_S;
            var3 = this.field_T;
            fieldTemp$0 = this.field_R + 1;
            this.field_R = this.field_R + 1;
            if (fieldTemp$0 >= this.field_L) {
                this.field_L = 0;
                this.a((byte) -24);
            } else {
                var4 = this.field_R * (this.field_L * 2 + -this.field_R);
                var5 = this.field_L * this.field_L;
                var3 = (-this.field_N + this.field_T) * var4 / var5 + this.field_N;
                var2 = (this.field_S + -this.field_M) * var4 / var5 + this.field_M;
            }
            this.b(-1535749535, var2, var3);
        }
        if (param0 != 17) {
            field_P = (String) null;
        }
        return super.j(17);
    }

    void a(byte param0) {
        if (param0 > -19) {
            this.field_S = 15;
        }
    }

    final static gg a(ra param0, int param1) {
        gg var2 = null;
        RuntimeException var2_ref = null;
        gg stackIn_2_0 = null;
        gg stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        gg stackOut_3_0 = null;
        gg stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 <= -59) {
              var2 = new gg(param0, param0);
              fm.field_b.a(var2, false);
              il.field_g.a(param0);
              stackOut_3_0 = (gg) (var2);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (gg) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2_ref);
            stackOut_5_1 = new StringBuilder().append("sp.IA(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    void f(byte param0) {
        if (!((this.field_L ^ -1) < -1)) {
            return;
        }
        this.b(param0 ^ 1535749512, this.field_S, this.field_T);
        if (param0 != -23) {
            return;
        }
        this.field_L = 0;
        this.a((byte) -56);
    }

    void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var16 = Vertigo2.field_L ? 1 : 0;
        bi.e(param1 - -6, param2 + 35, -12 + this.field_n, -40 + this.field_s, 2105376, 0);
        var5 = 211;
        var4 = 35;
        var6 = 194;
        var7 = 0;
        var8 = param2;
        L0: while (true) {
          if (var4 <= var7) {
            L1: {
              var6 = 169;
              var4 = 22;
              var5 = 194;
              if (param0 < -92) {
                break L1;
              } else {
                this.a((byte) -71);
                break L1;
              }
            }
            var7 = 0;
            var8 = 35 + param2;
            L2: while (true) {
              if (var4 <= var7) {
                qo.field_y.e(-90 + (param1 + this.field_n), 10 + param2);
                kj.a(1, this.field_n + -10, param1 + 5, bh.field_a, param2 - -35);
                kj.a(1, this.field_n, param1, ki.field_b, -22 + (this.field_s + param2));
                var4 = -79 + this.field_s;
                var5 = 169;
                var6 = 127;
                var7 = 0;
                var8 = param2 - -57;
                L3: while (true) {
                  if (var7 >= var4) {
                    return;
                  } else {
                    var9 = var5 - -(var7 * (-var5 + var6) / var4);
                    var9 = var9 | (var9 << 827531784 | var9 << 436822288);
                    bi.b(param1, var8, 6, var9);
                    bi.b(-6 + (param1 - -this.field_n), var8, 6, var9);
                    var8++;
                    var7++;
                    continue L3;
                  }
                }
              } else {
                var9 = (-var5 + var6) * var7 / var4 + var5;
                var9 = var9 | (var9 << -1815592344 | var9 << -183724720);
                bi.b(param1, var8, 6, var9);
                bi.b(-6 + this.field_n + param1, var8, 6, var9);
                var7++;
                var8++;
                continue L2;
              }
            }
          } else {
            if (bi.field_f <= var8) {
              if (bi.field_c > var8) {
                L4: {
                  var9 = (var6 - var5) * var7 / var4 + var5;
                  var10 = 0;
                  var11 = this.field_n;
                  if (var7 <= 20) {
                    L5: while (true) {
                      if (var10 > 20) {
                        break L4;
                      } else {
                        var12 = (-var10 + 20) * (20 - var10) + (20 + -var7) * (20 + -var7);
                        if ((var12 ^ -1) >= -463) {
                          if (var12 < 420) {
                            break L4;
                          } else {
                            var13 = var9 * (-var12 + 462) / 42;
                            var13 = var13 | (var13 << -2066890064 | var13 << -1211259608);
                            bi.field_l[var10 + (bi.field_e * var8 - -param1)] = var13;
                            var10++;
                            continue L5;
                          }
                        } else {
                          var10++;
                          continue L5;
                        }
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                L6: {
                  if ((var7 ^ -1) >= -21) {
                    var12 = var11;
                    var11 -= 21;
                    var13 = 0;
                    L7: while (true) {
                      L8: {
                        if ((var13 ^ -1) < -21) {
                          break L8;
                        } else {
                          var14 = (-var7 + 20) * (-var7 + 20) + var13 * var13;
                          if (462 >= var14) {
                            if (-421 < (var14 ^ -1)) {
                              var12 = var11 - -1;
                              var13++;
                              var11++;
                              continue L7;
                            } else {
                              var15 = (-var14 + 462) * var9 / 42;
                              var15 = var15 | (var15 << -2100380056 | var15 << 1824125680);
                              bi.field_l[param1 + (bi.field_e * var8 - -var11)] = var15;
                              var13++;
                              var11++;
                              continue L7;
                            }
                          } else {
                            break L8;
                          }
                        }
                      }
                      var11 = var12;
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
                var9 = var9 | (var9 << -632263152 | var9 << -1191228728);
                bi.b(param1 + var10, var8, var11 - var10, var9);
                var8++;
                var7++;
                continue L0;
              } else {
                var8++;
                var7++;
                continue L0;
              }
            } else {
              var8++;
              var7++;
              continue L0;
            }
          }
        }
    }

    sp(sd param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_R = 0;
        this.field_L = 0;
    }

    boolean a(int param0) {
        if (param0 != -1) {
            return true;
        }
        this.f((byte) -23);
        return super.a(-1);
    }

    public static void l(int param0) {
        field_P = null;
        field_Q = null;
        if (param0 != -6) {
            field_O = 103;
        }
        field_U = null;
        field_K = null;
    }

    final static ud e(byte param0) {
        int var1 = 0;
        int var2_int = 0;
        IllegalArgumentException var2 = null;
        ud var3 = null;
        ud stackIn_5_0 = null;
        Throwable decompiledCaughtException = null;
        ud stackOut_4_0 = null;
        var1 = -5 / ((param0 - 60) / 44);
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              var3 = ni.field_d.a(var2_int, true);
              if (var3.field_y) {
                stackOut_4_0 = (ud) (var3);
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.IllegalArgumentException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (IllegalArgumentException) (Object) decompiledCaughtException;
          return null;
        }
        return stackIn_5_0;
    }

    final void a(int param0, int param1, int param2, byte param3) {
        if (0 >= param0) {
            this.b(-1535749535, param1, param2);
            return;
        }
        this.field_R = 0;
        this.field_S = param1;
        this.field_T = param2;
        this.field_M = this.field_n;
        if (param3 <= 36) {
            this.field_N = 65;
        }
        this.field_N = this.field_s;
        this.field_L = param0;
    }

    static {
        field_K = "This game has started.";
        field_P = "Hide game chat";
        field_Q = "Log in / Create account";
    }
}
