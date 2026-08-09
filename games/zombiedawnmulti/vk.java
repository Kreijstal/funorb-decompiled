/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk extends rg {
    static String field_K;
    static int[] field_J;
    private th field_H;
    static String field_F;
    static String field_G;
    static boolean field_E;
    static pd field_I;
    static String[] field_L;

    final void b(int param0, cf param1) {
        df var3 = null;
        if (!(param1 instanceof df)) {
            throw new IllegalArgumentException();
        }
        if (param0 != 3016) {
            return;
        }
        try {
            var3 = (df) ((Object) param1);
            this.field_H.a(-25612, var3);
            var3.field_R = true;
            var3.a((cf) (this), 0);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "vk.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean l(byte param0) {
        CharSequence var2;
        if (param0 <= -121) {
          if (fn.field_i >= 20) {
            if (ge.p(-86)) {
              if (qq.field_a > 0) {
                if (re.b(-118)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          var2 = (CharSequence) null;
          vk.a(-28, (CharSequence) null);
          if (fn.field_i >= 20) {
            if (ge.p(-86)) {
              if (qq.field_a > 0) {
                if (re.b(-118)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    final void h(byte param0) {
        ch var2;
        df var3;
        int var4;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = new ch(this.field_H);
        var3 = (df) ((Object) var2.c(-3));
        if (param0 > -84) {
          vk.l((byte) 127);
          L0: while (true) {
            if (var3 != null) {
              if (var4 == 0) {
                L1: {
                  if (!var3.i(-27388)) {
                    break L1;
                  } else {
                    var3.a(true);
                    break L1;
                  }
                }
                var3 = (df) ((Object) var2.a((byte) -113));
                if (var4 == 0) {
                  continue L0;
                } else {
                  this.field_B = (cf) ((Object) this.j((byte) -119));
                  return;
                }
              } else {
                return;
              }
            } else {
              this.field_B = (cf) ((Object) this.j((byte) -119));
              return;
            }
          }
        } else {
          L2: while (true) {
            if (var3 != null) {
              if (var4 == 0) {
                L3: {
                  if (!var3.i(-27388)) {
                    break L3;
                  } else {
                    var3.a(true);
                    break L3;
                  }
                }
                var3 = (df) ((Object) var2.a((byte) -113));
                if (var4 == 0) {
                  continue L2;
                } else {
                  this.field_B = (cf) ((Object) this.j((byte) -119));
                  return;
                }
              } else {
                return;
              }
            } else {
              this.field_B = (cf) ((Object) this.j((byte) -119));
              return;
            }
          }
        }
    }

    public static void k(byte param0) {
        field_K = null;
        field_I = null;
        int var1 = 90 / ((30 - param0) / 47);
        field_F = null;
        field_J = null;
        field_G = null;
        field_L = null;
    }

    final static void a(ka param0, byte param1) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$3 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 == 83) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_J = (int[]) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var2_int = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var2_int >= 3) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ub.field_ub[var2_int] = 0;
                        var2_int++;
                        if (var5 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var5 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var2_int = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (uf.field_g <= var2_int) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_15_0 = param0.field_l;
                        stackIn_11_0 = stackIn_15_0;
                        if (var5 != 0) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (stackIn_11_0 != uk.field_M[var2_int].field_l) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        dupTemp$0 = uk.field_M[var2_int].a(true);
                        ub.field_ub[dupTemp$0] = ub.field_ub[dupTemp$0] + 1;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var2_int++;
                        if (var5 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        dupTemp$1 = param0.a(true);
                        ub.field_ub[dupTemp$1] = ub.field_ub[dupTemp$1] + 1;
                        var2_int = 0;
                        stackIn_15_0 = 0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var3 = stackIn_15_0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var3 >= uf.field_g) {
                            statePc = 24;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_25_0 = uk.field_M[var3].field_l ^ -1;
                        stackIn_18_0 = stackIn_25_0;
                        if (var5 != 0) {
                            statePc = 25;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (stackIn_18_0 != (param0.field_l ^ -1)) {
                            statePc = 22;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var4 = uk.field_M[var3].a(true);
                        if (ub.field_ub[var4] <= sj.field_m) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        ub.field_ub[var4] = ub.field_ub[var4] - 1;
                        if (var5 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        incrementValue$2 = var2_int;
                        var2_int++;
                        uk.field_M[incrementValue$2] = uk.field_M[var3];
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var3++;
                        if (var5 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackIn_25_0 = var2_int;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        uf.field_g = stackIn_25_0;
                        fieldTemp$3 = uf.field_g;
                        uf.field_g = uf.field_g + 1;
                        uk.field_M[fieldTemp$3] = param0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 27: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_29_0 = (RuntimeException) (var2);
                    stackIn_28_0 = stackIn_29_0;
                    stackIn_29_1 = new StringBuilder().append("vk.E(");
                    stackIn_28_1 = stackIn_29_1;
                    if (param0 == null) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    stackIn_30_0 = (RuntimeException) ((Object) stackIn_28_0);
                    stackIn_30_1 = (StringBuilder) ((Object) stackIn_28_1);
                    stackIn_30_2 = "{...}";
                    statePc = 30;
                    continue stateLoop;
                }
                case 29: {
                    stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
                    stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
                    stackIn_30_2 = "null";
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    throw fa.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ')');
                }
                case 31: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static String a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 20) {
                break L1;
              } else {
                var3 = (int[]) null;
                vk.a((int[]) null, true, 94, 30, (byte) 84, (int[]) null, 90, 72, -73);
                break L1;
              }
            }
            stackIn_3_0 = so.a(false, -52, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("vk.P(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static boolean i(byte param0) {
        int[] var2;
        if (param0 == -39) {
          if (a.a(-107)) {
            if ((8 & wf.field_m) != 0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          var2 = (int[]) null;
          vk.a((int[]) null, false, -127, -95, (byte) -9, (int[]) null, -29, -30, -79);
          if (a.a(-107)) {
            if ((8 & wf.field_m) != 0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final void h(int param0) {
        ch var2 = null;
        df var3 = null;
        int var4 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = ZombieDawnMulti.field_E ? 1 : 0;
                    var2 = new ch(this.field_H);
                    var3 = (df) ((Object) var2.c(-3));
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var3 == null) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var3.field_R = false;
                    var3 = (df) ((Object) var2.a((byte) -112));
                    if (var4 != 0) {
                        statePc = 13;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var4 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 5: {
                    this.field_B = null;
                    if (param0 < -81) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    vk.i((byte) 56);
                    return;
                }
                case 7: {
                    return;
                }
                case 9: {
                    this.field_B = null;
                    if (param0 < -81) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    vk.i((byte) 56);
                    return;
                }
                case 11: {
                    return;
                }
                case 13: {
                    if (param0 < -81) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    vk.i((byte) 56);
                    return;
                }
                case 15: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final df j(byte param0) {
        ch var2;
        df var3;
        int var4;
        boolean stackIn_3_0 = false;
        int stackIn_8_0 = 0;
        boolean stackOut_2_0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = new ch(this.field_H);
        var3 = (df) ((Object) var2.c(-3));
        L0: while (true) {
          L1: {
            L2: {
              if (var3 == null) {
                break L2;
              } else {
                stackOut_2_0 = var3.field_R;
                stackIn_8_0 = stackOut_2_0 ? 1 : 0;
                stackIn_3_0 = stackOut_2_0;
                if (var4 != 0) {
                  break L1;
                } else {
                  if (stackIn_3_0) {
                    return var3;
                  } else {
                    var3 = (df) ((Object) var2.a((byte) -48));
                    if (var4 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            stackIn_8_0 = param0;
            break L1;
          }
          if (stackIn_8_0 < -118) {
            return null;
          } else {
            return (df) null;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var7 = ZombieDawnMulti.field_E ? 1 : 0;
        if (!(this.field_h == null)) {
            this.field_h.a(true, param1, -15112, param3, (cf) (this));
        }
        if (param0 != -2) {
            return;
        }
        ch var5 = new ch(this.field_H);
        cf var6 = (cf) ((Object) var5.a(32397));
        do {
            if (var6 == null) {
                return;
            }
            var6.a(-2, param1 - -this.field_i, param2, param3 + this.field_y);
            var6 = (cf) ((Object) var5.e(-3));
            if (var7 != 0) {
                return;
            }
        } while (var7 == 0);
    }

    final cf f(int param0) {
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        ch var2 = new ch(this.field_H);
        if (param0 != -1963) {
            return (cf) null;
        }
        df var3 = (df) ((Object) var2.c(-3));
        do {
            if (var3 == null) {
                return null;
            }
            if (!(!var3.field_R)) {
                return var3.g(122);
            }
            var3 = (df) ((Object) var2.a((byte) -38));
        } while (var4 == 0);
        return null;
    }

    final static ja[] a(int param0, int param1, ul param2, int param3) {
        RuntimeException var4 = null;
        ja[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (ud.a(param3, param2, param1, (byte) -42)) {
              L1: {
                if (param0 >= 32) {
                  break L1;
                } else {
                  vk.i((byte) -118);
                  break L1;
                }
              }
              stackIn_6_0 = eb.a(33);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("vk.N(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    final static void a(int[] param0, boolean param1, int param2, int param3, byte param4, int[] param5, int param6, int param7, int param8) {
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var9_int = 13 / ((param4 - 48) / 58);
                if ((param2 ^ -1) == -2) {
                  break L2;
                } else {
                  L3: {
                    if (3 != param2) {
                      break L3;
                    } else {
                      mj.field_Hb[param2] = (nc) ((Object) new fk(param2, param1, param3, param6, param8, param7, param5));
                      if (var10 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if ((param2 ^ -1) == -5) {
                      break L4;
                    } else {
                      L5: {
                        if (5 == param2) {
                          break L5;
                        } else {
                          if (-7 == (param2 ^ -1)) {
                            break L5;
                          } else {
                            L6: {
                              if (10 == param2) {
                                break L6;
                              } else {
                                L7: {
                                  if (param2 == 12) {
                                    break L7;
                                  } else {
                                    L8: {
                                      if (param2 == 14) {
                                        break L8;
                                      } else {
                                        L9: {
                                          if (-16 == (param2 ^ -1)) {
                                            break L9;
                                          } else {
                                            L10: {
                                              if (13 == param2) {
                                                break L10;
                                              } else {
                                                mj.field_Hb[param2] = new nc(param2, param1, param3, param6, param8, param7, param5);
                                                if (var10 == 0) {
                                                  break L1;
                                                } else {
                                                  break L10;
                                                }
                                              }
                                            }
                                            mj.field_Hb[param2] = (nc) ((Object) new kp(param2, param1, param3, param6, param8, param7, param5));
                                            if (var10 == 0) {
                                              break L1;
                                            } else {
                                              break L9;
                                            }
                                          }
                                        }
                                        mj.field_Hb[param2] = (nc) ((Object) new tk(param2, param1, param3, param6, param8, param7, param5));
                                        if (var10 == 0) {
                                          break L1;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                    mj.field_Hb[param2] = (nc) ((Object) new vj(param2, param1, param3, param6, param8, param7, param5));
                                    if (var10 == 0) {
                                      break L1;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                                mj.field_Hb[param2] = (nc) ((Object) new vo(param2, param1, param3, param6, param8, param7, param5));
                                if (var10 == 0) {
                                  break L1;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            mj.field_Hb[param2] = (nc) ((Object) new si(param2, param1, param3, param6, param8, param7, param5));
                            if (var10 == 0) {
                              break L1;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      mj.field_Hb[param2] = (nc) ((Object) new mq(param2, param1, param3, param6, param8, param7, param5));
                      if (var10 == 0) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  mj.field_Hb[param2] = (nc) ((Object) new ol(param2, param1, param3, param6, param8, param7, param5));
                  if (var10 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              mj.field_Hb[param2] = (nc) ((Object) new ho(param2, param1, param3, param6, param8, param7, param5));
              break L1;
            }
            ab.field_h = (si) ((Object) mj.field_Hb[10]);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var9 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var9);

            stackIn_34_1 = new StringBuilder().append("vk.R(");

            if (param0 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L11;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_37_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L12;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L12;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_35_0), stackIn_38_2 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    public vk() {
        super(0, 0, ub.field_wb, kc.field_a, (nl) null, (bj) null);
        this.field_H = new th();
    }

    final void g(byte param0) {
        ch var2;
        df var3;
        int var4;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = new ch(this.field_H);
        if (param0 == 118) {
          var3 = (df) ((Object) var2.c(-3));
          L0: while (true) {
            if (var3 != null) {
              if (var4 == 0) {
                L1: {
                  if (var3.h(-6134)) {
                    var3.a(true);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var3 = (df) ((Object) var2.a((byte) -30));
                if (var4 == 0) {
                  continue L0;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          field_J = (int[]) null;
          var3 = (df) ((Object) var2.c(-3));
          L2: while (true) {
            if (var3 != null) {
              if (var4 == 0) {
                L3: {
                  if (var3.h(-6134)) {
                    var3.a(true);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var3 = (df) ((Object) var2.a((byte) -30));
                if (var4 == 0) {
                  continue L2;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    static {
        field_F = "(Including <%0>)";
        field_G = "Achievements can only be earned in Rated games.";
        field_K = "Music: ";
        field_L = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_E = false;
    }
}
