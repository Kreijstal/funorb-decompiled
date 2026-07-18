/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj extends id {
    private boolean field_G;
    private int field_R;
    private int field_H;
    boolean field_O;
    static String field_I;
    static ef field_L;
    private int field_N;
    private int field_K;
    int field_Q;
    int field_P;
    static ja[] field_F;
    private int field_J;
    static long field_M;

    public static void i() {
        field_L = null;
        field_I = null;
        field_F = null;
    }

    final void f(byte param0) {
        Object var3 = null;
        int fieldTemp$9 = ((jj) this).field_P - 1;
        ((jj) this).field_P = ((jj) this).field_P - 1;
        if (fieldTemp$9 > 0) {
          if (((jj) this).field_G) {
            L0: {
              int fieldTemp$10 = ((jj) this).field_H;
              ((jj) this).field_H = ((jj) this).field_H + 1;
              if (fieldTemp$10 > 17) {
                L1: {
                  int fieldTemp$11 = ((jj) this).field_R + 1;
                  ((jj) this).field_R = ((jj) this).field_R + 1;
                  if (fieldTemp$11 >= 2) {
                    ((jj) this).field_R = 0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ((jj) this).field_H = 0;
                break L0;
              } else {
                break L0;
              }
            }
            if (param0 > -79) {
              var3 = null;
              jj.a(45, 6, (String) null, -22, 31, (go) null, -49, 13, (byte) 76);
              return;
            } else {
              return;
            }
          } else {
            ((jj) this).field_N = ((jj) this).field_N + ((jj) this).field_K;
            if (((jj) this).field_N > 160) {
              L2: {
                ((jj) this).field_K = -((jj) this).field_K;
                int fieldTemp$12 = ((jj) this).field_H;
                ((jj) this).field_H = ((jj) this).field_H + 1;
                if (fieldTemp$12 > 17) {
                  L3: {
                    int fieldTemp$13 = ((jj) this).field_R + 1;
                    ((jj) this).field_R = ((jj) this).field_R + 1;
                    if (fieldTemp$13 >= 2) {
                      ((jj) this).field_R = 0;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  ((jj) this).field_H = 0;
                  break L2;
                } else {
                  break L2;
                }
              }
              if (param0 <= -79) {
                return;
              } else {
                var3 = null;
                jj.a(45, 6, (String) null, -22, 31, (go) null, -49, 13, (byte) 76);
                return;
              }
            } else {
              if (-81 < ((jj) this).field_N) {
                L4: {
                  ((jj) this).field_K = -((jj) this).field_K;
                  int fieldTemp$14 = ((jj) this).field_H;
                  ((jj) this).field_H = ((jj) this).field_H + 1;
                  if (fieldTemp$14 > 17) {
                    L5: {
                      int fieldTemp$15 = ((jj) this).field_R + 1;
                      ((jj) this).field_R = ((jj) this).field_R + 1;
                      if (fieldTemp$15 >= 2) {
                        ((jj) this).field_R = 0;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    ((jj) this).field_H = 0;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if (param0 > -79) {
                  var3 = null;
                  jj.a(45, 6, (String) null, -22, 31, (go) null, -49, 13, (byte) 76);
                  return;
                } else {
                  return;
                }
              } else {
                L6: {
                  int fieldTemp$16 = ((jj) this).field_H;
                  ((jj) this).field_H = ((jj) this).field_H + 1;
                  if (-18 < fieldTemp$16) {
                    L7: {
                      int fieldTemp$17 = ((jj) this).field_R + 1;
                      ((jj) this).field_R = ((jj) this).field_R + 1;
                      if (fieldTemp$17 >= 2) {
                        ((jj) this).field_R = 0;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    ((jj) this).field_H = 0;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                if (param0 <= -79) {
                  return;
                } else {
                  var3 = null;
                  jj.a(45, 6, (String) null, -22, 31, (go) null, -49, 13, (byte) 76);
                  return;
                }
              }
            }
          }
        } else {
          ((jj) this).a(true);
          ((jj) this).a(-4564);
          return;
        }
    }

    final boolean a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var4 = ((jj) this).field_z >> 16;
        if (param0 == 7) {
          var5 = ((jj) this).field_E >> 16;
          if (param1 < 24 + var4 - 7) {
            if (7 + var4 + -24 < param1) {
              if (param2 > -48 + (var5 - -5)) {
                if (param2 >= 2 + var5) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          ((jj) this).field_K = -42;
          var5 = ((jj) this).field_E >> 16;
          if (param1 < 24 + var4 - 7) {
            if (7 + var4 + -24 < param1) {
              if (param2 > -48 + (var5 - -5)) {
                if (param2 >= 2 + var5) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final static String a(String param0, byte param1, ul param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (param2.a((byte) -123)) {
              var4_int = -2 / ((44 - param1) / 46);
              stackOut_3_0 = param0 + " - " + param2.b(0) + "%";
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = (String) param3;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("jj.L(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');
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
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(int param0, int param1, String param2, int param3, int param4, go param5, int param6, int param7, byte param8) {
        kk.field_q = param0;
        if (param8 > -84) {
            return;
        }
        try {
            db.field_e = param4;
            qe.field_f = param1;
            o.field_b = param6;
            p.field_a = param5;
            vg.field_r = param2;
            ej.field_q = param3;
            ll.field_b = param7;
            i.field_a = (qb) (Object) new ap();
            rn.field_d = new ai(param5);
            tj.field_a = new eq(i.field_a, rn.field_d);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "jj.K(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    jj(int param0, int param1, int param2, int param3, boolean param4) {
        super(param0, param1, param2);
        ((jj) this).field_R = 0;
        ((jj) this).field_H = 0;
        ((jj) this).field_Q = param3;
        ((jj) this).field_N = ((jj) this).field_G ? 255 : 96;
        ((jj) this).field_K = 3;
        ((jj) this).field_P = null == op.field_m ? 3000 : op.field_m.a((byte) 32, ((jj) this).field_Q, 3000);
        ((jj) this).field_G = param4 ? true : false;
        ((jj) this).field_J = 1;
    }

    final void a(int param0, nm param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ja var8 = null;
        ja stackIn_8_0 = null;
        ja stackIn_9_0 = null;
        ja stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        ja stackOut_7_0 = null;
        ja stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        ja stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              var3_int = param1.c(((jj) this).g(-43), -20126) - 24;
              if (param0 == -10136) {
                break L1;
              } else {
                ((jj) this).field_P = -6;
                break L1;
              }
            }
            var4 = -48 + param1.d(((jj) this).h(118), 119);
            if (!io.a(var3_int, var4, (byte) -86, param1)) {
              return;
            } else {
              L2: {
                var5 = ((jj) this).field_Q;
                var6 = op.field_m.field_D[var5][0];
                var7 = op.field_m.field_D[var5][1];
                var8 = am.a(((jj) this).field_R, var7, ((jj) this).field_C, param0 ^ -10135, var6);
                if (((jj) this).field_G) {
                  L3: {
                    stackOut_7_0 = ig.field_d[1];
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_8_0 = stackOut_7_0;
                    if (3 != ((jj) this).field_J) {
                      stackOut_9_0 = (ja) (Object) stackIn_9_0;
                      stackOut_9_1 = var3_int;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      break L3;
                    } else {
                      stackOut_8_0 = (ja) (Object) stackIn_8_0;
                      stackOut_8_1 = -5 + var3_int;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      break L3;
                    }
                  }
                  g.a(stackIn_10_0, stackIn_10_1 + 12, 43 + var4);
                  var8.g(var3_int, var4);
                  break L2;
                } else {
                  var8.c(var3_int, var4, ((jj) this).field_N);
                  break L2;
                }
              }
              if (!((jj) this).field_O) {
                break L0;
              } else {
                ig.field_d[0].e(1 + var3_int, 2 + var4, 128, 16711680);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("jj.H(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = "Mute this player for 48 hours";
    }
}
