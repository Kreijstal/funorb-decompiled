/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg extends br {
    static th field_i;
    static java.awt.Frame field_m;
    static cj field_f;
    private th field_k;
    private int field_g;
    static ul field_n;
    static String field_j;
    private int field_h;
    static boolean field_l;

    final void a(int param0) {
        if (param0 != -1) {
            field_f = (cj) null;
            this.a(true);
            return;
        }
        this.a(true);
    }

    final void b(boolean param0) {
        int var3 = 0;
        rq var4 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = ZombieDawnMulti.field_E ? 1 : 0;
                    var4 = (rq) ((Object) this.field_k.c(125));
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var4 == null) {
                        statePc = 9;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var4.a((byte) 95);
                    var4 = (rq) ((Object) this.field_k.b(6));
                    if (var3 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    if (var3 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (!param0) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    cg.a(80, -116, 26L);
                    return;
                }
                case 7: {
                    return;
                }
                case 9: {
                    if (param0) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    return;
                }
                case 11: {
                    cg.a(80, -116, 26L);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(byte param0, int param1, int param2) {
        int var5;
        rq var6;
        boolean stackIn_7_0 = false;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 >= 54) {
          var6 = (rq) ((Object) this.field_k.c(87));
          L0: while (true) {
            if (var6 != null) {
              stackIn_7_0 = var6.a(param1, (byte) 5, param2);

              if (var5 == 0) {
                if (stackIn_7_0) {
                  return true;
                } else {
                  var6 = (rq) ((Object) this.field_k.b(6));
                  if (var5 == 0) {
                    continue L0;
                  } else {
                    return false;
                  }
                }
              } else {
                return stackIn_7_0;
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    final static void a(int param0, int param1, long param2) {
        ga var4;
        int var5;
        var4 = ma.field_a;
        var4.b((byte) -35, param0);
        if (param1 != -27404) {
          cg.a(-60, -93, 81L);
          var4.field_j = var4.field_j + 1;
          var5 = var4.field_j;
          var4.a(-59, 7);
          var4.a(param2, true);
          var4.e(29, -var5 + var4.field_j);
          return;
        } else {
          var4.field_j = var4.field_j + 1;
          var5 = var4.field_j;
          var4.a(-59, 7);
          var4.a(param2, true);
          var4.e(29, -var5 + var4.field_j);
          return;
        }
    }

    cg(int param0, int param1, int param2) {
        this.field_h = param1;
        this.field_g = param2;
        if (oq.field_u != null) {
            this.a((byte) 108);
        }
    }

    public static void c(byte param0) {
        if (param0 > -33) {
          cg.c((byte) -103);
          field_m = null;
          field_j = null;
          field_f = null;
          field_n = null;
          field_i = null;
          return;
        } else {
          field_m = null;
          field_j = null;
          field_f = null;
          field_n = null;
          field_i = null;
          return;
        }
    }

    final void a(nm param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        rq var4 = null;
        int var5 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = 81 / ((param1 - -32) / 51);
                        var4 = (rq) ((Object) this.field_k.c(123));
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var4 == null) {
                            statePc = 12;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var4.a(param0, (byte) -75);
                        var4 = (rq) ((Object) this.field_k.b(6));
                        if (var5 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        return;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var5 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        return;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_10_0 = (RuntimeException) (var3);
                    stackIn_9_0 = stackIn_10_0;
                    stackIn_10_1 = new StringBuilder().append("cg.A(");
                    stackIn_9_1 = stackIn_10_1;
                    if (param0 == null) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    stackIn_11_0 = (RuntimeException) ((Object) stackIn_9_0);
                    stackIn_11_1 = (StringBuilder) ((Object) stackIn_9_1);
                    stackIn_11_2 = "{...}";
                    statePc = 11;
                    continue stateLoop;
                }
                case 10: {
                    stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
                    stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
                    stackIn_11_2 = "null";
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    throw fa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
                }
                case 12: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(gm param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        rq var5 = null;
        int var6 = 0;
        boolean stackIn_6_0 = false;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = param0.g(73);
              if (!param1) {
                break L1;
              } else {
                field_l = true;
                break L1;
              }
            }
            var4 = param0.h(81);
            var5 = (rq) ((Object) this.field_k.c(80));
            L2: while (true) {
              L3: {
                L4: {
                  if (var5 == null) {
                    break L4;
                  } else {
                    stackOut_5_0 = var5.a(var4, (byte) 111, var3_int);
                    stackIn_11_0 = stackOut_5_0 ? 1 : 0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var6 != 0) {
                      break L3;
                    } else {
                      if (!stackIn_6_0) {
                        var5 = (rq) ((Object) this.field_k.b(6));
                        if (var6 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      } else {
                        stackIn_8_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                }
                stackIn_11_0 = 0;
                break L3;
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("cg.D(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    final void a(byte param0) {
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        boolean[][] var4 = null;
        int var5 = 0;
        boolean[][] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        boolean[][] var10_ref_boolean____ = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        boolean[][] var15 = null;
        boolean[][] var16 = null;
        boolean[][] var17 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = ZombieDawnMulti.field_E ? 1 : 0;
                    if (this.field_k != null) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return;
                }
                case 3: {
                    var2 = this.field_h / 24;
                    var3 = this.field_g / 24;
                    var5 = 109 / ((param0 - 55) / 47);
                    var17 = new boolean[1 + 2 * wn.field_t][1 + 2 * wn.field_t];
                    var16 = var17;
                    var15 = var16;
                    var4 = var15;
                    var6 = new boolean[var17.length][var17[0].length];
                    var7 = -wn.field_t + var2;
                    var8 = var3 - wn.field_t;
                    var15[wn.field_t][wn.field_t] = true;
                    var9 = 0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    stackIn_5_0 = var9;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (stackIn_5_0 >= wn.field_t) {
                        statePc = 36;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    stackIn_37_0 = 0;
                    stackIn_7_0 = stackIn_37_0;
                    if (var14 != 0) {
                        statePc = 37;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var10 = stackIn_7_0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    stackIn_9_0 = var10;
                    stackIn_9_1 = var4.length;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (stackIn_9_0 >= stackIn_9_1) {
                        statePc = 35;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackIn_5_0 = 0;
                    stackIn_11_0 = stackIn_5_0;
                    if (var14 != 0) {
                        statePc = 5;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var11 = stackIn_11_0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (var11 >= var4[0].length) {
                        statePc = 34;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var12 = var11 + var7;
                    var13 = var8 + var10;
                    stackIn_9_0 = var12 ^ -1;
                    stackIn_14_0 = stackIn_9_0;
                    stackIn_9_1 = -1;
                    stackIn_14_1 = stackIn_9_1;
                    if (var14 != 0) {
                        statePc = 9;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (stackIn_14_0 >= stackIn_14_1) {
                        statePc = 33;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (var13 <= 0) {
                        statePc = 33;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (oq.field_u[0].length <= var12) {
                        statePc = 33;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (oq.field_u.length <= var13) {
                        statePc = 33;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (-1 == (oq.field_u[var13][var12] & 1 ^ -1)) {
                        statePc = 33;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (var4[var10][var11]) {
                        statePc = 32;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (0 >= var11) {
                        statePc = 23;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (var4[var10][-1 + var11]) {
                        statePc = 32;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if ((var10 ^ -1) >= -1) {
                        statePc = 26;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (var4[-1 + var10][var11]) {
                        statePc = 32;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (var11 >= -1 + var4[0].length) {
                        statePc = 29;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (var4[var10][var11 - -1]) {
                        statePc = 32;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (var10 >= var4.length - 1) {
                        statePc = 33;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (var4[var10 + 1][var11]) {
                        statePc = 32;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var6[var10][var11] = true;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    var11++;
                    if (var14 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var10++;
                    if (var14 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    var10_ref_boolean____ = var4;
                    var4 = var6;
                    var6 = var10_ref_boolean____;
                    var9++;
                    if (var14 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    this.field_k = new th();
                    stackIn_37_0 = 0;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    var9 = stackIn_37_0;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    stackIn_39_0 = var9;
                    stackIn_39_1 = var4.length;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (stackIn_39_0 < stackIn_39_1) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    return;
                }
                case 41: {
                    if (var14 == 0) {
                        statePc = 43;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    return;
                }
                case 43: {
                    var10 = 0;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    if (var4[0].length <= var10) {
                        statePc = 51;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    var11 = var7 + var10;
                    var12 = var9 + var8;
                    var13 = (var3 + -var12) * (var3 - var12) + (var2 + -var11) * (var2 - var11);
                    stackIn_39_0 = var13;
                    stackIn_46_0 = stackIn_39_0;
                    stackIn_39_1 = 81;
                    stackIn_46_1 = stackIn_39_1;
                    if (var14 != 0) {
                        statePc = 39;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (stackIn_46_0 >= stackIn_46_1) {
                        statePc = 50;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (var4[var9][var10]) {
                        statePc = 49;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 49: {
                    this.field_k.a(new rq(var11, var12, var13), false);
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    var10++;
                    if (var14 == 0) {
                        statePc = 44;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    var9++;
                    if (var14 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_j = "Rating";
    }
}
