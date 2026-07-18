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
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        Object var6 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_4_0 = null;
        String stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
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
            return stackIn_5_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackOut_6_0 = "Cabbage";
            stackIn_7_0 = stackOut_6_0;
            return stackIn_7_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L2: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("bj.UB(").append(param0).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    boolean h(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var5 = 0;
        int var4 = 0;
        if (((bj) this).field_Z > 0) {
            var2 = ((bj) this).field_Q;
            var3 = ((bj) this).field_R;
            int fieldTemp$0 = ((bj) this).field_W + 1;
            ((bj) this).field_W = ((bj) this).field_W + 1;
            if (fieldTemp$0 < ((bj) this).field_Z) {
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
            boolean discarded$1 = ((bj) this).h(109);
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
                    var9 = var9 | (var9 << 16 | var9 << 8);
                    lb.c(param0, var8, 6, var9);
                    lb.c(param0 + ((bj) this).field_t + -6, var8, 6, var9);
                    var8++;
                    var7++;
                    continue L3;
                  }
                }
              } else {
                var9 = var7 * (-var5 + var6) / var4 + var5;
                var9 = var9 | (var9 << 16 | var9 << 8);
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
                            var13 = var13 | (var13 << 8 | var13 << 16);
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
                            if (var14 >= 420) {
                              var15 = var9 * (-var14 + 462) / 42;
                              var15 = var15 | (var15 << 8 | var15 << 16);
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
                var9 = var9 | (var9 << 16 | var9 << 8);
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

    public static void i() {
        field_P = null;
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
