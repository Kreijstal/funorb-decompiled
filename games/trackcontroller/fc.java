/*
 * Decompiled by CFR-JS 0.4.0.
 */
class fc {
    static String field_a;
    static String field_g;
    fc field_e;
    static String field_f;
    static String[] field_c;
    static int field_d;
    fc field_h;
    long field_b;

    final static boolean c(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 >= 2) {
          L0: {
            L1: {
              if (-11 < (rl.field_N ^ -1)) {
                break L1;
              } else {
                if (ge.field_D) {
                  break L1;
                } else {
                  if (gh.a(3100)) {
                    break L1;
                  } else {
                    stackOut_5_0 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    break L0;
                  }
                }
              }
            }
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return false;
        }
    }

    final boolean b(int param0) {
        if (param0 != 10000536) {
            fc.a(20, 32, 14, (byte) -49, 34);
        }
        if (null == ((fc) this).field_e) {
            return false;
        }
        return true;
    }

    final static String a(boolean param0, boolean param1, boolean param2, int param3) {
        int var4 = 0;
        if (!(!param1)) {
            var4 += 4;
        }
        if (param3 != 12105912) {
            return null;
        }
        if (!(!param0)) {
            var4 += 2;
        }
        if (param2) {
            var4++;
        }
        return field_c[var4];
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = TrackController.field_F ? 1 : 0;
        if (param3 > -14) {
            field_a = null;
        }
        ll.a(param4, param1, param0 + 1, 10000536);
        ll.a(param4, param2 + param1, param0 + 1, 12105912);
        int var5 = 1;
        int var6 = param2;
        if (!(var5 + param1 >= ll.field_b)) {
            var5 = ll.field_b - param1;
        }
        if (!(param1 + var6 <= ll.field_g)) {
            var6 = -param1 + ll.field_g;
        }
        for (var7 = var5; var7 < var6; var7++) {
            var8 = 152 - -(var7 * 48 / param2);
            var9 = var8 << 1811903240 | var8 << -231469744 | var8;
            ll.field_i[param4 + (param1 - -var7) * ll.field_d] = var9;
            ll.field_i[param0 + (ll.field_d * (var7 + param1) - -param4)] = var9;
        }
    }

    final static void a(boolean param0) {
        if (param0) {
            field_a = null;
        }
        if (!(null == sb.field_b)) {
            sb.field_b.f();
        }
        if (g.field_x != null) {
            g.field_x.f();
        }
    }

    final static boolean b(boolean param0, String param1) {
        String var2 = null;
        Exception var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_16_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = TrackController.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (uf.field_b.startsWith("win")) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = 0;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        if (!param0) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        field_a = null;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param1.startsWith("http://")) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param1.startsWith("https://")) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 18;
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
                        statePc = 18;
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
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var3 >= param1.length()) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (-1 != var2.indexOf((int) param1.charAt(var3))) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return stackIn_14_0 != 0;
                }
                case 15: {
                    try {
                        var3++;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        Process discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                        stackOut_16_0 = 1;
                        stackIn_17_0 = stackOut_16_0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    return stackIn_17_0 != 0;
                }
                case 18: {
                    var2_ref = (Exception) (Object) caughtException;
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(byte param0) {
        field_g = null;
        field_f = null;
        field_a = null;
        if (param0 != 118) {
            field_d = 105;
        }
        field_c = null;
    }

    final void a(int param0) {
        if (param0 >= -22) {
            ((fc) this).field_b = 48L;
        }
        if (null == ((fc) this).field_e) {
            return;
        }
        ((fc) this).field_e.field_h = ((fc) this).field_h;
        ((fc) this).field_h.field_e = ((fc) this).field_e;
        ((fc) this).field_h = null;
        ((fc) this).field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Log in / Register";
        field_f = "Waiting for sound effects";
        field_c = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_d = 0;
    }
}
