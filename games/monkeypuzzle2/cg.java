/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg {
    private int field_j;
    private int field_i;
    static kg field_c;
    private ug[] field_e;
    private ug field_f;
    static cj field_a;
    static int field_g;
    static int[] field_d;
    static int field_h;
    private ug field_b;

    public static void b(byte param0) {
        field_a = null;
        field_c = null;
        if (param0 >= -107) {
            field_g = 123;
            field_d = null;
            return;
        }
        field_d = null;
    }

    final static void a(boolean param0) {
        if (ok.a(param0)) {
            return;
        }
        if (!(null != fj.field_E)) {
            fj.field_E = je.a(4, -128);
        }
    }

    final static boolean a(String param0, byte param1) {
        String var2 = null;
        Exception var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_17_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = MonkeyPuzzle2.field_F ? 1 : 0;
                    if (param1 == 30) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    cg.b((byte) -92);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    try {
                        if (!md.field_f.startsWith("win")) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = 0;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0 != 0;
                }
                case 6: {
                    try {
                        if (param0.startsWith("http://")) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param0.startsWith("https://")) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = 0;
                        stackIn_9_0 = stackOut_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return stackIn_9_0 != 0;
                }
                case 10: {
                    try {
                        var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        var3 = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (param0.length() <= var3) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (0 == (var2.indexOf((int) param0.charAt(var3)) ^ -1)) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = 0;
                        stackIn_15_0 = stackOut_14_0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return stackIn_15_0 != 0;
                }
                case 16: {
                    try {
                        var3++;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        Process discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                        stackOut_17_0 = 1;
                        stackIn_18_0 = stackOut_17_0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    return stackIn_18_0 != 0;
                }
                case 19: {
                    var2_ref = (Exception) (Object) caughtException;
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final ug a(byte param0, long param1) {
        ug var5 = null;
        int var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 < 111) {
            return null;
        }
        ug var4 = ((cg) this).field_e[(int)(param1 & (long)(-1 + ((cg) this).field_j))];
        ((cg) this).field_b = var4.field_d;
        while (((cg) this).field_b != var4) {
            if ((((cg) this).field_b.field_a ^ -1L) == (param1 ^ -1L)) {
                var5 = ((cg) this).field_b;
                ((cg) this).field_b = ((cg) this).field_b.field_d;
                return var5;
            }
            ((cg) this).field_b = ((cg) this).field_b.field_d;
        }
        ((cg) this).field_b = null;
        return null;
    }

    final void a(ug param0, long param1, byte param2) {
        ug var5 = null;
        ug var6 = null;
        ug var7 = null;
        if (null == param0.field_c) {
          var7 = ((cg) this).field_e[(int)(param1 & (long)(-1 + ((cg) this).field_j))];
          var5 = var7;
          if (param2 == -36) {
            param0.field_d = var5;
            param0.field_c = var7.field_c;
            param0.field_c.field_d = param0;
            param0.field_a = param1;
            param0.field_d.field_c = param0;
            return;
          } else {
            ug discarded$2 = ((cg) this).a((byte) -88);
            param0.field_d = var5;
            param0.field_c = var7.field_c;
            param0.field_c.field_d = param0;
            param0.field_a = param1;
            param0.field_d.field_c = param0;
            return;
          }
        } else {
          param0.c(-19822);
          var6 = ((cg) this).field_e[(int)(param1 & (long)(-1 + ((cg) this).field_j))];
          var5 = var6;
          if (param2 != -36) {
            ug discarded$3 = ((cg) this).a((byte) -88);
            param0.field_d = var5;
            param0.field_c = var6.field_c;
            param0.field_c.field_d = param0;
            param0.field_a = param1;
            param0.field_d.field_c = param0;
            return;
          } else {
            param0.field_d = var5;
            param0.field_c = var6.field_c;
            param0.field_c.field_d = param0;
            param0.field_a = param1;
            param0.field_d.field_c = param0;
            return;
          }
        }
    }

    final ug a(int param0) {
        ((cg) this).field_i = param0;
        return ((cg) this).a((byte) -55);
    }

    final ug a(byte param0) {
        int var3 = 0;
        ug var4 = null;
        ug var5 = null;
        ug var6 = null;
        ug var9 = null;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (0 < ((cg) this).field_i) {
          if (((cg) this).field_e[-1 + ((cg) this).field_i] != ((cg) this).field_f) {
            var9 = ((cg) this).field_f;
            ((cg) this).field_f = var9.field_d;
            return var9;
          } else {
            L0: while (true) {
              if (((cg) this).field_i >= ((cg) this).field_j) {
                if (param0 != -55) {
                  field_d = null;
                  return null;
                } else {
                  return null;
                }
              } else {
                ((cg) this).field_i = ((cg) this).field_i + 1;
                var4 = ((cg) this).field_e[((cg) this).field_i].field_d;
                var6 = var4;
                if (var4 != ((cg) this).field_e[-1 + ((cg) this).field_i]) {
                  ((cg) this).field_f = var6.field_d;
                  return var6;
                } else {
                  continue L0;
                }
              }
            }
          }
        } else {
          L1: while (true) {
            if (((cg) this).field_i >= ((cg) this).field_j) {
              if (param0 != -55) {
                field_d = null;
                return null;
              } else {
                return null;
              }
            } else {
              ((cg) this).field_i = ((cg) this).field_i + 1;
              var4 = ((cg) this).field_e[((cg) this).field_i].field_d;
              var5 = var4;
              if (var4 != ((cg) this).field_e[-1 + ((cg) this).field_i]) {
                ((cg) this).field_f = var5.field_d;
                return var5;
              } else {
                continue L1;
              }
            }
          }
        }
    }

    cg(int param0) {
        int var2 = 0;
        ug var3 = null;
        ((cg) this).field_i = 0;
        ((cg) this).field_j = param0;
        ((cg) this).field_e = new ug[param0];
        var2 = 0;
        L0: while (true) {
          if (var2 < param0) {
            var3 = new ug();
            ((cg) this).field_e[var2] = new ug();
            var3.field_c = var3;
            var3.field_d = var3;
            var2++;
            continue L0;
          } else {
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new kg();
        field_d = new int[4];
    }
}
