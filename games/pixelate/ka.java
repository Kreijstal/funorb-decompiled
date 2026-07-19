/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ka extends ud {
    private int field_Q;
    static tf field_P;
    private int field_T;
    private int field_U;
    static int field_X;
    static int field_V;
    private int field_Z;
    static ak field_W;
    private int field_S;
    private int field_Y;
    static String field_R;

    boolean a(byte param0) {
        this.e(false);
        if (param0 < 120) {
            this.field_Y = 17;
        }
        return super.a((byte) 124);
    }

    final static ak a(int param0, int param1, int param2, jl param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        int discarded$2 = 0;
        ak var13 = null;
        RuntimeException var13_ref = null;
        ak stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        ak stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var13 = new ak(0L, (ak) null);
              if (param8 == 21) {
                break L1;
              } else {
                discarded$2 = ka.m(40);
                break L1;
              }
            }
            var13.field_zb = wk.a(param9, param0, 1);
            var13.field_ab = wk.a(param6, param4, 1);
            var13.field_bb = wk.a(param10, param12, 1);
            var13.field_eb = wk.a(param11, param1, 1);
            var13.field_M = wk.a(param2, param7, 1);
            var13.field_Db = param3;
            var13.field_N = param5;
            stackOut_2_0 = (ak) (var13);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var13_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var13_ref);
            stackOut_4_1 = new StringBuilder().append("ka.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param3 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
        return stackIn_3_0;
    }

    boolean c(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var4 = 0;
        int var5 = 0;
        if ((this.field_Q ^ -1) >= -1) {
        } else {
            var2 = this.field_U;
            var3 = this.field_Z;
            fieldTemp$0 = this.field_S + 1;
            this.field_S = this.field_S + 1;
            if (this.field_Q <= fieldTemp$0) {
                this.field_Q = 0;
                this.f(true);
            } else {
                var4 = this.field_S * (-this.field_S + this.field_Q * 2);
                var5 = this.field_Q * this.field_Q;
                var2 = (-this.field_T + this.field_U) * var4 / var5 + this.field_T;
                var3 = var4 * (this.field_Z - this.field_Y) / var5 + this.field_Y;
            }
            this.a(var3, (byte) -110, var2);
        }
        if (param0) {
            this.e(false);
        }
        return super.c(param0);
    }

    public static void l(int param0) {
        int discarded$0 = 0;
        if (param0 != 127) {
            discarded$0 = ka.m(55);
        }
        field_R = null;
        field_P = null;
        field_W = null;
    }

    ka(kn param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_Q = 0;
        this.field_S = 0;
    }

    void e(boolean param0) {
        if (this.field_Q <= 0) {
            return;
        }
        this.a(this.field_Z, (byte) -110, this.field_U);
        this.field_Q = 0;
        this.f(!param0 ? true : false);
        if (param0) {
            this.e(false);
        }
    }

    final static int m(int param0) {
        ak discarded$0 = null;
        if (param0 != 22) {
            discarded$0 = ka.a(-69, 82, -115, (jl) null, -110, 125, 40, -83, 9, 8, -58, 81, 44);
        }
        return -qn.field_o + ia.field_e;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if ((param2 ^ -1) >= -1) {
            this.a(param0, (byte) -110, param1);
            return;
        }
        this.field_U = param1;
        this.field_S = 0;
        this.field_Q = param2;
        if (param3 != 57) {
            field_W = (ak) null;
        }
        this.field_Z = param0;
        this.field_T = this.field_E;
        this.field_Y = this.field_C;
    }

    void a(int param0, int param1, boolean param2) {
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
        var16 = Pixelate.field_H ? 1 : 0;
        t.g(param0 + 6, 35 + param1, -12 + this.field_E, -40 + this.field_C, 2105376, 0);
        var5 = 211;
        var4 = 35;
        var6 = 194;
        var7 = 0;
        var8 = param1;
        L0: while (true) {
          if (var7 >= var4) {
            var5 = 194;
            var6 = 169;
            var4 = 22;
            var7 = 0;
            var8 = 35 + param1;
            L1: while (true) {
              if (var7 >= var4) {
                L2: {
                  if (param2) {
                    break L2;
                  } else {
                    this.field_U = -54;
                    break L2;
                  }
                }
                ge.field_g.b(param0 + (this.field_E - 90), 10 + param1);
                ii.a(-10 + this.field_E, param1 + 35, 19571, 5 + param0, fk.field_s);
                ii.a(this.field_E, param1 + this.field_C + -22, 19571, param0, hd.field_v);
                var5 = 169;
                var6 = 127;
                var4 = -79 + this.field_C;
                var7 = 0;
                var8 = param1 + 57;
                L3: while (true) {
                  if (var7 >= var4) {
                    return;
                  } else {
                    var9 = (var6 - var5) * var7 / var4 + var5;
                    var9 = var9 | (var9 << 1706685296 | var9 << -1098009944);
                    t.b(param0, var8, 6, var9);
                    t.b(this.field_E + param0 + -6, var8, 6, var9);
                    var8++;
                    var7++;
                    continue L3;
                  }
                }
              } else {
                var9 = var5 + (-var5 + var6) * var7 / var4;
                var9 = var9 | (var9 << 276692912 | var9 << 983823112);
                t.b(param0, var8, 6, var9);
                t.b(-6 + (param0 - -this.field_E), var8, 6, var9);
                var7++;
                var8++;
                continue L1;
              }
            }
          } else {
            if (t.field_f <= var8) {
              if (t.field_a > var8) {
                L4: {
                  var9 = var5 + var7 * (var6 - var5) / var4;
                  var10 = 0;
                  var11 = this.field_E;
                  if (20 >= var7) {
                    L5: while (true) {
                      if (var10 > 20) {
                        break L4;
                      } else {
                        var12 = (20 + -var7) * (20 + -var7) - -((-var10 + 20) * (-var10 + 20));
                        if (462 >= var12) {
                          if ((var12 ^ -1) <= -421) {
                            var13 = var9 * (-var12 + 462) / 42;
                            var13 = var13 | (var13 << 219475728 | var13 << -1667248952);
                            t.field_k[var10 + (param0 + t.field_j * var8)] = var13;
                            var10++;
                            continue L5;
                          } else {
                            break L4;
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
                        if (-21 > (var13 ^ -1)) {
                          break L8;
                        } else {
                          var14 = (20 + -var7) * (20 + -var7) - -(var13 * var13);
                          if (-463 <= (var14 ^ -1)) {
                            if ((var14 ^ -1) <= -421) {
                              var15 = (462 - var14) * var9 / 42;
                              var15 = var15 | (var15 << -36527376 | var15 << 2128241512);
                              t.field_k[var8 * t.field_j + param0 - -var11] = var15;
                              var11++;
                              var13++;
                              continue L7;
                            } else {
                              var12 = 1 + var11;
                              var11++;
                              var13++;
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
                var9 = var9 | (var9 << -1388213808 | var9 << 648857480);
                t.b(var10 + param0, var8, -var10 + var11, var9);
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

    void f(boolean param0) {
        int discarded$0 = 0;
        if (!param0) {
            discarded$0 = ka.m(-1);
        }
    }

    static {
        field_R = "Passwords can only contain letters and numbers";
    }
}
