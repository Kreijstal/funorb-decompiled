/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj extends cj implements ij {
    static int[] field_M;
    static int field_N;
    static int[] field_F;
    static int[][] field_O;
    private nc field_J;
    static int[] field_H;
    static fe field_L;
    private d[] field_G;
    static int[] field_I;
    private String[] field_E;
    static boolean[] field_Q;
    static boolean field_P;

    final boolean a(char param0, int param1, int param2, iq param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        boolean stackOut_9_0 = false;
        int stackOut_13_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              if (param2 == 98) {
                stackOut_5_0 = ((oj) this).a(32345, param3);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                if (99 == param2) {
                  stackOut_9_0 = ((oj) this).b((byte) -122, param3);
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  if (param1 == 13) {
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    break L0;
                  } else {
                    field_P = true;
                    return false;
                  }
                }
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("oj.M(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L1;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L1;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
        return stackIn_14_0 != 0;
    }

    public final void a(int param0, d param1, byte param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              if (((oj) this).field_E.length <= var6_int) {
                L2: {
                  var6_int = 84 % ((-63 - param2) / 51);
                  if (param1 == ((oj) this).field_G[((oj) this).field_E.length]) {
                    ((oj) this).field_J.a(-4384);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  if (param1 == ((oj) this).field_G[var6_int]) {
                    ((oj) this).field_J.a(((oj) this).field_E[var6_int], 4944);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var6_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("oj.C(").append(param0).append(44);
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
          throw wn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6, int param7) {
        int var9 = 0;
        L0: {
          var9 = Vertigo2.field_L ? 1 : 0;
          if (param5 >= param6) {
            if (param5 >= param0) {
              if (param6 < param0) {
                hm.a(bi.field_l, param6, param3, param5, param1, (byte) -29, param0, param7, param2);
                break L0;
              } else {
                hm.a(bi.field_l, param0, param2, param5, param1, (byte) -73, param6, param7, param3);
                break L0;
              }
            } else {
              hm.a(bi.field_l, param6, param1, param0, param3, (byte) -125, param5, param7, param2);
              break L0;
            }
          } else {
            if (param0 <= param6) {
              if (param5 < param0) {
                hm.a(bi.field_l, param5, param3, param6, param2, (byte) -54, param0, param7, param1);
                break L0;
              } else {
                hm.a(bi.field_l, param0, param1, param6, param2, (byte) -43, param5, param7, param3);
                break L0;
              }
            } else {
              hm.a(bi.field_l, param5, param2, param0, param3, (byte) -125, param6, param7, param1);
              break L0;
            }
          }
        }
    }

    oj(nc param0) {
        super(0, 0, 0, 0, (ur) null);
        try {
            ((oj) this).field_J = param0;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "oj.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(String[] param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4_int = 0;
        jc var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              ((oj) this).field_C.c(0);
              if (param0 == null) {
                break L1;
              } else {
                if (0 == param0.length) {
                  break L1;
                } else {
                  var3_int = param0.length;
                  ((oj) this).field_E = new String[var3_int];
                  var4_int = 0;
                  L2: while (true) {
                    if (var3_int <= var4_int) {
                      var4 = new jc(qc.field_x, 0, 1);
                      if (param1 == -1546) {
                        ((oj) this).field_G = new d[1 + var3_int];
                        var5 = 0;
                        L3: while (true) {
                          if (var5 >= var3_int) {
                            ((oj) this).field_G[var3_int] = new d(pl.field_p, (uf) this);
                            ((oj) this).field_G[var3_int].field_B = (ur) (Object) var4;
                            ((oj) this).field_G[var3_int].a(false, 0, 20 + (16 * var3_int - -16), 15, 100);
                            ((oj) this).c((byte) -39, (iq) (Object) ((oj) this).field_G[var3_int]);
                            break L0;
                          } else {
                            ((oj) this).field_G[var5] = new d(((oj) this).field_E[var5], (uf) this);
                            ((oj) this).field_G[var5].field_B = (ur) (Object) var4;
                            ((oj) this).field_G[var5].field_q = og.field_k;
                            ((oj) this).field_G[var5].a(false, 0, 20 - -(var5 * 16), 15, 80);
                            ((oj) this).c((byte) -29, (iq) (Object) ((oj) this).field_G[var5]);
                            var5++;
                            continue L3;
                          }
                        }
                      } else {
                        return;
                      }
                    } else {
                      ((oj) this).field_E[var4_int] = vj.a((CharSequence) (Object) param0[var4_int], (byte) 8).replace(' ', ' ');
                      var4_int++;
                      continue L2;
                    }
                  }
                }
              }
            }
            ((oj) this).field_E = null;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("oj.A(");
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
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param1 + 41);
        }
    }

    public static void a() {
        field_I = null;
        field_O = null;
        field_H = null;
        field_F = null;
        field_Q = null;
        field_L = null;
        field_M = null;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (param1 != 0) {
            return;
        }
        cc var5 = qc.field_x;
        if (!(null == ((oj) this).field_E)) {
            int discarded$0 = var5.a(jd.field_a, ((oj) this).field_o + param2, param3 + ((oj) this).field_t, ((oj) this).field_n, 20, 16777215, -1, 0, 0, var5.field_M + var5.field_z);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = new int[23];
        field_O = new int[23][];
        field_M = new int[23];
        field_H = new int[23];
        field_I = new int[23];
        field_Q = new boolean[23];
        tj.a(new int[8], 600, 36, 360, (byte) -116, 0, 175);
        tj.a(new int[6], 440, 36, 200, (byte) -118, 12, 175);
        tj.a(new int[5], 460, 36, 180, (byte) -96, 1, 180);
        tj.a(new int[6], 460, 36, 180, (byte) -95, 2, 180);
        tj.a(new int[4], 460, 36, 180, (byte) -105, 22, 180);
        tj.a(new int[5], 460, 36, 180, (byte) -65, 3, 180);
        tj.a(new int[4], 460, 36, 180, (byte) -69, 4, 180);
        tj.a(new int[2], 632, 36, 392, (byte) -120, 5, 115);
        cl.a(430, 192, (byte) 83, 220, new int[2], 620, 6);
        cl.a(430, 150, (byte) 124, 320, new int[3], 620, 7);
        tj.a(new int[2], 440, 30, 200, (byte) -110, 8, 320);
        cl.a(430, 150, (byte) 84, 245, new int[2], 620, 9);
        tj.a(new int[2], 440, 100, 200, (byte) -86, 10, 240);
        tj.a(new int[1], 460, 30, 180, (byte) -119, 11, 400);
        cl.a(430, 300, (byte) 126, 20, new int[3], 620, 13);
        tj.a(new int[1], 440, 30, 200, (byte) -80, 14, 400);
        tj.a(new int[1], 440, 30, 200, (byte) -110, 15, 400);
        tj.a(new int[1], 440, 30, 200, (byte) -91, 20, 400);
        tj.a(new int[1], 440, 30, 200, (byte) -117, 16, 400);
        tj.a(new int[5], 440, 36, 200, (byte) -84, 17, 175);
        tj.a(new int[4], 440, 36, 200, (byte) -116, 18, 175);
        cl.a(430, 300, (byte) 81, 20, new int[2], 620, 19);
        tj.a(new int[3], 440, 36, 200, (byte) -127, 21, 210);
    }
}
