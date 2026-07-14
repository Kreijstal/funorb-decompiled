/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bj extends jc {
    private int field_X;
    static String field_U;
    private int field_O;
    private int field_W;
    private int field_Q;
    private int field_R;
    private int field_Z;
    static cd field_Y;
    static byte[][] field_S;
    static eh field_T;
    static String field_V;
    static long field_ab;
    static ck field_P;

    void j(int param0) {
        if (0 >= ((bj) this).field_Z) {
            return;
        }
        if (param0 != 20) {
            field_S = null;
        }
        ((bj) this).a(true, ((bj) this).field_R, ((bj) this).field_Q);
        ((bj) this).field_Z = 0;
        ((bj) this).k(-13717);
    }

    boolean a(int param0) {
        ((bj) this).j(20);
        if (param0 > -22) {
            ((bj) this).field_Q = 2;
        }
        return super.a(-81);
    }

    void k(int param0) {
        if (param0 != -13717) {
            ((bj) this).field_X = -40;
        }
    }

    bj(cp param0, int param1, int param2) {
        super(param0, param1, param2);
        ((bj) this).field_W = 0;
        ((bj) this).field_Z = 0;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (param1 <= 0) {
            ((bj) this).a(true, param2, param3);
            return;
        }
        ((bj) this).field_R = param2;
        if (param0 != -116) {
            boolean discarded$0 = ((bj) this).a(97);
        }
        ((bj) this).field_X = ((bj) this).field_s;
        ((bj) this).field_Z = param1;
        ((bj) this).field_Q = param3;
        ((bj) this).field_W = 0;
        ((bj) this).field_O = ((bj) this).field_t;
    }

    final static String a(int param0, byte param1, wq param2) {
        int var3_int = 0;
        Exception var3 = null;
        byte[] var4 = null;
        String var5 = null;
        Object var6 = null;
        String stackIn_5_0 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_4_0;
        try {
          L0: {
            if (param1 >= 36) {
              break L0;
            } else {
              var6 = null;
              String discarded$2 = bj.a(61, (byte) 3, (wq) null);
              break L0;
            }
          }
          L1: {
            var3_int = param2.k(-32768);
            if (param0 >= var3_int) {
              break L1;
            } else {
              var3_int = param0;
              break L1;
            }
          }
          var4 = new byte[var3_int];
          param2.field_l = param2.field_l + so.field_d.a(var3_int, 0, param2.field_l, true, var4, param2.field_k);
          var5 = df.a(var3_int, -110, var4, 0);
          stackOut_4_0 = (String) var5;
          stackIn_5_0 = stackOut_4_0;
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return (String) (Object) stackIn_5_0;
        }
        return null;
    }

    boolean h(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var5 = 0;
        int var4 = 0;
        if ((((bj) this).field_Z ^ -1) < -1) {
            var2 = ((bj) this).field_Q;
            var3 = ((bj) this).field_R;
            ((bj) this).field_W = ((bj) this).field_W + 1;
            if (((bj) this).field_W + 1 < ((bj) this).field_Z) {
                var4 = ((bj) this).field_W * (2 * ((bj) this).field_Z - ((bj) this).field_W);
                var5 = ((bj) this).field_Z * ((bj) this).field_Z;
                var2 = var4 * (((bj) this).field_Q - ((bj) this).field_O) / var5 + ((bj) this).field_O;
                var3 = (((bj) this).field_R - ((bj) this).field_X) * var4 / var5 + ((bj) this).field_X;
            } else {
                ((bj) this).field_Z = 0;
                ((bj) this).k(-13717);
            }
            ((bj) this).a(true, var3, var2);
        }
        if (param0 != 0) {
            boolean discarded$0 = ((bj) this).h(109);
        }
        return super.h(0);
    }

    void b(int param0, int param1, int param2) {
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
        var16 = BrickABrac.field_J ? 1 : 0;
        lb.g(param0 + 6, param2 + 35, -12 + ((bj) this).field_t, ((bj) this).field_s + -40, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        var7 = 0;
        var8 = param2;
        L0: while (true) {
          if (var4 <= var7) {
            var5 = 194;
            var4 = 22;
            var6 = 169;
            var7 = 0;
            var8 = param2 + 35;
            L1: while (true) {
              if (var4 <= var7) {
                L2: {
                  if (param1 == 274) {
                    break L2;
                  } else {
                    field_P = null;
                    break L2;
                  }
                }
                ka.field_n.c(param0 - -((bj) this).field_t - 90, 10 + param2);
                fq.a(((bj) this).field_t + -10, 35 + param2, param1 ^ 1013, nf.field_W, 5 + param0);
                fq.a(((bj) this).field_t, -22 + param2 - -((bj) this).field_s, param1 + 469, qc.field_l, param0);
                var5 = 169;
                var4 = ((bj) this).field_s - 79;
                var6 = 127;
                var7 = 0;
                var8 = param2 - -57;
                L3: while (true) {
                  if (var4 <= var7) {
                    return;
                  } else {
                    var9 = var5 - -(var7 * (-var5 + var6) / var4);
                    var9 = var9 | (var9 << -1799647760 | var9 << -1257626648);
                    lb.c(param0, var8, 6, var9);
                    lb.c(param0 + ((bj) this).field_t + -6, var8, 6, var9);
                    var8++;
                    var7++;
                    continue L3;
                  }
                }
              } else {
                var9 = var7 * (-var5 + var6) / var4 + var5;
                var9 = var9 | (var9 << 136598768 | var9 << 1117005832);
                lb.c(param0, var8, 6, var9);
                lb.c(((bj) this).field_t + param0 + -6, var8, 6, var9);
                var7++;
                var8++;
                continue L1;
              }
            }
          } else {
            if (lb.field_b <= var8) {
              if (var8 < lb.field_j) {
                L4: {
                  var9 = var7 * (-var5 + var6) / var4 + var5;
                  var10 = 0;
                  var11 = ((bj) this).field_t;
                  if (var7 <= 20) {
                    L5: while (true) {
                      if (var10 > 20) {
                        break L4;
                      } else {
                        var12 = (20 + -var10) * (-var10 + 20) + (20 - var7) * (-var7 + 20);
                        if (462 >= var12) {
                          if (var12 < 420) {
                            break L4;
                          } else {
                            var13 = (462 - var12) * var9 / 42;
                            var13 = var13 | (var13 << 2041726600 | var13 << -1043380176);
                            lb.field_l[var10 + var8 * lb.field_c + param0] = var13;
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
                  if (var7 > 20) {
                    break L6;
                  } else {
                    var12 = var11;
                    var11 -= 21;
                    var13 = 0;
                    L7: while (true) {
                      L8: {
                        if (var13 > 20) {
                          break L8;
                        } else {
                          var14 = var13 * var13 + (-var7 + 20) * (20 - var7);
                          if (var14 > 462) {
                            break L8;
                          } else {
                            if (-421 >= (var14 ^ -1)) {
                              var15 = var9 * (-var14 + 462) / 42;
                              var15 = var15 | (var15 << 862036072 | var15 << -1906583472);
                              lb.field_l[var11 + (lb.field_c * var8 + param0)] = var15;
                              var11++;
                              var13++;
                              continue L7;
                            } else {
                              var12 = var11 - -1;
                              var11++;
                              var13++;
                              continue L7;
                            }
                          }
                        }
                      }
                      var11 = var12;
                      break L6;
                    }
                  }
                }
                var9 = var9 | (var9 << 254665488 | var9 << 270462696);
                lb.c(var10 + param0, var8, -var10 + var11, var9);
                var7++;
                var8++;
                continue L0;
              } else {
                var7++;
                var8++;
                continue L0;
              }
            } else {
              var7++;
              var8++;
              continue L0;
            }
          }
        }
    }

    public static void i(int param0) {
        field_P = null;
        if (param0 <= 110) {
            return;
        }
        field_V = null;
        field_T = null;
        field_S = null;
        field_U = null;
        field_Y = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_U = "The hearts above are your lives.<br>Outside of the tutorial level, you will lose one life if all your balls fall out of play.";
        field_Y = new cd(0);
        field_V = "Hide chat";
    }
}
