/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th {
    private boolean[][] field_c;
    static boolean[][] field_b;
    static String field_a;

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = MinerDisturbance.field_ab;
        if (param2 > -112) {
            field_a = null;
        }
        ((th) this).field_c[param0][param1] = true;
        if (!(!vd.field_s[param0])) {
            for (var4 = 0; var4 < 2; var4++) {
                ((th) this).field_c[param0][var4] = true;
            }
        }
    }

    th() {
        this.a((byte) -93);
    }

    final boolean a(int param0, int param1, byte param2) {
        int var4 = 70 % ((param2 - 63) / 34);
        return ((th) this).field_c[param0][param1];
    }

    final static int a(byte param0, int param1) {
        int var2 = 0;
        if ((param1 & 7) != 0) {
            var2 = 8 + -(7 & param1);
        }
        int var3 = param1 - -var2;
        return var3;
    }

    private final void a(int param0, ld param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        boolean[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        boolean[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        boolean[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        boolean[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        boolean[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = MinerDisturbance.field_ab;
        try {
          L0: {
            param1.f((byte) 16);
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= 35) {
                param1.o(105);
                break L0;
              } else {
                var4 = 0;
                L2: while (true) {
                  if (2 <= var4) {
                    var3_int++;
                    continue L1;
                  } else {
                    L3: {
                      stackOut_5_0 = ((th) this).field_c[var3_int];
                      stackOut_5_1 = var4;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      if (param1.c((byte) -107, 1) != 1) {
                        stackOut_7_0 = (boolean[]) (Object) stackIn_7_0;
                        stackOut_7_1 = stackIn_7_1;
                        stackOut_7_2 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        stackIn_8_2 = stackOut_7_2;
                        break L3;
                      } else {
                        stackOut_6_0 = (boolean[]) (Object) stackIn_6_0;
                        stackOut_6_1 = stackIn_6_1;
                        stackOut_6_2 = 1;
                        stackIn_8_0 = stackOut_6_0;
                        stackIn_8_1 = stackOut_6_1;
                        stackIn_8_2 = stackOut_6_2;
                        break L3;
                      }
                    }
                    stackIn_8_0[stackIn_8_1] = stackIn_8_2 != 0;
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
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("th.B(").append(33).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    th(ld param0) {
        try {
            this.a((byte) 126);
            this.a(33, param0);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "th.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, ld param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        ld stackIn_6_0 = null;
        ld stackIn_7_0 = null;
        ld stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        ld stackOut_5_0 = null;
        ld stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        ld stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = MinerDisturbance.field_ab;
        try {
          L0: {
            param1.c(true);
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= 35) {
                L2: {
                  param1.n(98);
                  if (param0 == 27437) {
                    break L2;
                  } else {
                    ((th) this).a(-96, 39, -5);
                    break L2;
                  }
                }
                break L0;
              } else {
                var4 = 0;
                L3: while (true) {
                  if (var4 >= 2) {
                    var3_int++;
                    continue L1;
                  } else {
                    L4: {
                      stackOut_5_0 = (ld) param1;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_6_0 = stackOut_5_0;
                      if (((th) this).field_c[var3_int][var4]) {
                        stackOut_7_0 = (ld) (Object) stackIn_7_0;
                        stackOut_7_1 = 1;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        break L4;
                      } else {
                        stackOut_6_0 = (ld) (Object) stackIn_6_0;
                        stackOut_6_1 = 0;
                        stackIn_8_0 = stackOut_6_0;
                        stackIn_8_1 = stackOut_6_1;
                        break L4;
                      }
                    }
                    ((ld) (Object) stackIn_8_0).a(stackIn_8_1, (byte) 14, 1);
                    var4++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("th.D(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    private final void a(byte param0) {
        ((th) this).field_c = new boolean[35][2];
        int var2 = 70 % ((-35 - param0) / 33);
    }

    final void a(int param0, th param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var5 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (param0 == 35) {
              var3_int = 0;
              L1: while (true) {
                if (35 <= var3_int) {
                  break L0;
                } else {
                  var4 = 0;
                  L2: while (true) {
                    if (var4 >= 2) {
                      var3_int++;
                      continue L1;
                    } else {
                      L3: {
                        if (!param1.field_c[var3_int][var4]) {
                          break L3;
                        } else {
                          ((th) this).field_c[var3_int][var4] = true;
                          break L3;
                        }
                      }
                      var4++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("th.E(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
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
          throw lj.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new boolean[35][2];
        field_b[0][0] = true;
        field_b[1][0] = true;
        field_b[2][0] = true;
        field_b[3][0] = true;
        field_b[4][0] = true;
        field_b[5][0] = true;
        field_b[6][0] = true;
        field_b[7][0] = true;
        field_b[8][0] = true;
        field_b[9][0] = true;
        field_b[10][0] = true;
        field_b[11][0] = true;
        field_b[12][0] = true;
        field_b[13][0] = true;
        field_b[14][0] = true;
        field_b[15][0] = true;
        field_b[16][0] = true;
        field_b[17][0] = true;
        field_b[18][0] = true;
        field_b[20][0] = true;
        field_b[21][0] = true;
        field_b[22][0] = true;
        field_b[23][0] = true;
        field_b[24][0] = false;
        field_b[25][0] = false;
        field_b[26][0] = false;
        field_b[27][0] = false;
        field_b[28][0] = false;
        field_b[29][0] = false;
        field_b[30][0] = false;
        field_b[31][0] = false;
        field_b[32][0] = false;
        field_b[33][0] = false;
        field_b[0][1] = true;
        field_b[1][1] = true;
        field_b[2][1] = true;
        field_b[3][1] = true;
        field_b[4][1] = true;
        field_b[5][1] = true;
        field_b[6][1] = true;
        field_b[7][1] = true;
        field_b[8][1] = true;
        field_b[9][1] = true;
        field_b[10][1] = true;
        field_b[11][1] = true;
        field_b[12][1] = true;
        field_b[13][1] = true;
        field_b[14][1] = true;
        field_b[15][1] = true;
        field_b[16][1] = true;
        field_b[17][1] = true;
        field_b[18][1] = true;
        field_b[20][1] = true;
        field_b[19][1] = true;
        field_b[21][1] = true;
        field_b[22][1] = true;
        field_b[23][1] = true;
        field_b[24][1] = true;
        field_b[25][1] = true;
        field_b[26][1] = true;
        field_b[27][1] = true;
        field_b[28][1] = true;
        field_b[29][1] = true;
        field_b[30][1] = true;
        field_b[31][1] = true;
        field_b[32][1] = true;
        field_b[33][1] = true;
        field_b[34][1] = true;
        field_a = "Greaseproof suit: Swim through oil as through water.";
    }
}
