/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class na extends rg {
    static ri field_I;
    static String field_F;
    int field_E;
    static ja[] field_G;
    static int[][] field_J;
    static int[] field_K;
    static ri[][] field_H;

    na(cf param0) {
        super(param0.field_y, param0.field_i, param0.field_n, param0.field_w, (nl) null, (bj) null);
        try {
            param0.b(0, 0, 28972, ((na) this).field_n, ((na) this).field_w);
            ((na) this).field_E = 256;
            ((na) this).field_B = param0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "na.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public static void g() {
        field_K = null;
        field_H = null;
        field_F = null;
        field_G = null;
        field_I = null;
        field_J = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param2 != 0) {
            return;
        }
        if (!(((na) this).field_B != null)) {
            return;
        }
        if (((na) this).field_E == 0) {
            return;
        }
        if (((na) this).field_E == 256) {
            ((na) this).field_B.a(-2, param1 + ((na) this).field_i, param2, param3 - -((na) this).field_y);
            return;
        }
        ja var6 = new ja(((na) this).field_B.field_n, ((na) this).field_B.field_w);
        r.a(0, var6);
        if (param0 != -2) {
            field_G = null;
        }
        ((na) this).field_B.a(param0, 0, param2, 0);
        int discarded$0 = 1;
        ql.a();
        var6.c(param3 - -((na) this).field_y, param1 + ((na) this).field_i, ((na) this).field_E);
    }

    public na() {
        super(0, 0, 0, 0, (nl) null, (bj) null);
        ((na) this).field_E = 256;
    }

    final static boolean b(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          if (!qj.field_p) {
            break L0;
          } else {
            if (!io.field_g) {
              break L0;
            } else {
              if (se.field_E <= 0) {
                break L0;
              } else {
                L1: {
                  var3 = (400 - se.field_E >> 1) + 10;
                  var4 = 20 + se.field_E + param1;
                  var5 = 40;
                  if (param0 <= var3) {
                    break L1;
                  } else {
                    if (var5 >= param2) {
                      break L1;
                    } else {
                      if (param0 >= var3 + var4) {
                        break L1;
                      } else {
                        if (var5 + hj.field_g <= param2) {
                          break L1;
                        } else {
                          iq.a(-14, (byte) 99);
                          return true;
                        }
                      }
                    }
                  }
                }
                return false;
              }
            }
          }
        }
        return false;
    }

    final static void a(byte param0, fh param1) {
        int[][] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[][] var6 = null;
        int[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var6 = param1.field_i.field_k;
            var2 = var6;
            dq.field_j = new int[var6.length][var6[0].length];
            var3 = 0;
            L1: while (true) {
              if (var3 >= var6.length) {
                break L0;
              } else {
                var4 = 0;
                L2: while (true) {
                  if (var4 >= var6[0].length) {
                    var3++;
                    continue L1;
                  } else {
                    L3: {
                      stackOut_5_0 = dq.field_j[var3];
                      stackOut_5_1 = var4;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      if (0 != tq.b(1, var6[var3][var4])) {
                        stackOut_7_0 = (int[]) (Object) stackIn_7_0;
                        stackOut_7_1 = stackIn_7_1;
                        stackOut_7_2 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        stackIn_8_2 = stackOut_7_2;
                        break L3;
                      } else {
                        stackOut_6_0 = (int[]) (Object) stackIn_6_0;
                        stackOut_6_1 = stackIn_6_1;
                        stackOut_6_2 = -1;
                        stackIn_8_0 = stackOut_6_0;
                        stackIn_8_1 = stackOut_6_1;
                        stackIn_8_2 = stackOut_6_2;
                        break L3;
                      }
                    }
                    stackIn_8_0[stackIn_8_1] = stackIn_8_2;
                    var4++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2_ref;
            stackOut_11_1 = new StringBuilder().append("na.A(").append(127).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
    }

    final static boolean a(int[] param0, byte param1, String param2, long param3, int param4) {
        ld var6 = null;
        RuntimeException var6_ref = null;
        CharSequence var7 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -35) {
                break L1;
              } else {
                boolean discarded$4 = na.b(-55, -5, 10);
                break L1;
              }
            }
            if (tn.a(param2, param3, (byte) -91, param4, param0)) {
              L2: {
                if (1 != param4) {
                  break L2;
                } else {
                  param4 = 0;
                  break L2;
                }
              }
              qf.field_g = param2;
              va.field_a = param4;
              var7 = (CharSequence) (Object) param2;
              int discarded$5 = 0;
              ql.field_a = tg.a(var7);
              jj.field_M = param3;
              var6 = id.a(kb.field_x, bb.field_k, (byte) -65, param0, tg.field_d);
              wi.a((byte) 4, var6);
              stackOut_7_0 = 1;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var6_ref;
            stackOut_9_1 = new StringBuilder().append("na.B(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44).append(param1).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
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
          throw fa.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param3 + 44 + param4 + 41);
        }
        return stackIn_8_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = "Confuse clueless humans with smoke and mirrors...";
        field_H = new ri[1][];
    }
}
