/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk extends w {
    static String field_Nb;
    static w field_Rb;
    private w field_Pb;
    static String field_Qb;
    static String field_Ob;

    public static void e(int param0) {
        if (param0 != 15338) {
          field_Nb = (String) null;
          field_Nb = null;
          field_Ob = null;
          field_Qb = null;
          field_Rb = null;
          return;
        } else {
          field_Nb = null;
          field_Ob = null;
          field_Qb = null;
          field_Rb = null;
          return;
        }
    }

    bk(w param0, w param1, w param2, w param3, w param4, w param5) {
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        w var8 = null;
        w var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        w var13 = null;
        w var14 = null;
        int var15 = 0;
        int var16 = 0;
        w var17 = null;
        var16 = client.field_A ? 1 : 0;
        try {
          L0: {
            var17 = new w(0L, param1, gk.field_Gb.toUpperCase());
            var17.field_X = 1;
            this.field_Pb = new w(0L, param2);
            var8 = new w(0L, param3);
            var9 = new w(0L, param3, dc.field_c);
            var9.field_X = 1;
            var10 = 50;
            var11 = 0;
            var12 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var12 >= dk.field_j.length) {
                    break L3;
                  } else {
                    var13 = new w(0L, param3, uf.field_B[var12]);
                    var14 = new w(0L, param3, dk.field_j[var12]);
                    var15 = param3.field_J.a(dk.field_j[var12]);
                    stackIn_8_0 = var15;

                    stackIn_8_1 = var11;

                    if (var16 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_8_0 <= stackIn_8_1) {
                          break L4;
                        } else {
                          var11 = var15;
                          break L4;
                        }
                      }
                      var13.a(65, 0, var10, 15, 20);
                      var14.a(640, 0, var10, 15, 90);
                      var8.a(var13, -16834);
                      var8.a(var14, -16834);
                      var10 += 30;
                      var12++;
                      if (var16 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var17.a(20 + var11 - -90, 0, 0, 24, 0);
                var10 += 15;
                this.a(var17.field_mb, 0, 100, var10 - -var17.field_N, 100);
                this.field_Pb.a(15, 0, 5, 15, var17.field_mb + -20);
                var8.a(this.field_mb, 0, var17.field_N, this.field_N - var17.field_N, 0);
                var9.a(this.field_mb, 0, 20, 15, 0);
                var8.field_lb = ea.a(2105376, -20982, 3, var8.field_N, 8421504, 11579568);
                var17.a(this.field_Pb, -16834);
                var8.a(var9, -16834);
                this.a(var17, -16834);
                this.a(var8, -16834);
                this.field_vb = -(this.field_mb >> 1562314049) + 320;
                stackIn_8_0 = -(this.field_N >> 757186753);
                stackIn_8_1 = 240;
                break L2;
              }
              var10 = stackIn_8_0 + stackIn_8_1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var7 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var7);

            stackIn_12_1 = new StringBuilder().append("bk.<init>(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L6;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L7;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L8;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param4 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L9;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param5 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L10;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L10;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_13_0), stackIn_28_2 + ')');
        }
    }

    final boolean b(int param0, boolean param1) {
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        vj var4;
        if (param0 == -1) {
          this.a(false, true);
          if (-1 == (ig.field_Yb ^ -1)) {
            if (-1 != (this.field_Pb.field_ob ^ -1)) {
              return true;
            } else {
              return false;
            }
          } else {
            if (-1 != (this.field_ob ^ -1)) {
              L0: {
                if (-1 == (this.field_Pb.field_ob ^ -1)) {
                  stackIn_21_0 = 0;
                  break L0;
                } else {
                  stackIn_21_0 = 1;
                  break L0;
                }
              }
              return stackIn_21_0 != 0;
            } else {
              stackIn_17_0 = 1;
              return stackIn_17_0 != 0;
            }
          }
        } else {
          var4 = (vj) null;
          bk.a((byte) 4, 96, (vj) null);
          this.a(false, true);
          if (-1 != (ig.field_Yb ^ -1)) {
            if (-1 == (this.field_ob ^ -1)) {
              return true;
            } else {
              L1: {
                if (-1 == (this.field_Pb.field_ob ^ -1)) {
                  stackIn_10_0 = 0;
                  break L1;
                } else {
                  stackIn_10_0 = 1;
                  break L1;
                }
              }
              return stackIn_10_0 != 0;
            }
          } else {
            L2: {
              if (-1 == (this.field_Pb.field_ob ^ -1)) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final static void a(byte param0, int param1, vj param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        uk var5 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == -93) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        bk.e(40);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var5 = (uk) ((Object) param2.c((byte) -119));
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var5 == null) {
                            statePc = 14;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var5.b(11976, param1);
                        var5 = (uk) ((Object) param2.d(true));
                        if (var4 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        return;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var4 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        return;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_12_0 = (RuntimeException) (var3);
                    stackIn_11_0 = stackIn_12_0;
                    stackIn_12_1 = new StringBuilder().append("bk.C(").append(param0).append(',').append(param1).append(',');
                    stackIn_11_1 = stackIn_12_1;
                    if (param2 == null) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    stackIn_13_0 = (RuntimeException) ((Object) stackIn_11_0);
                    stackIn_13_1 = (StringBuilder) ((Object) stackIn_11_1);
                    stackIn_13_2 = "{...}";
                    statePc = 13;
                    continue stateLoop;
                }
                case 12: {
                    stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
                    stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                    stackIn_13_2 = "null";
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    throw dh.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_Nb = "Game options";
        field_Qb = "Elapsed time";
        field_Ob = "Waiting for extra data";
    }
}
