/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fq extends jh {
    static dg field_F;
    int field_D;
    static byte[][] field_G;
    static boolean field_E;

    fq(gm param0) {
        super(param0.field_w, param0.field_k, param0.field_p, param0.field_o, (el) null, (ca) null);
        param0.a((byte) -83, 0, 0, ((fq) this).field_o, ((fq) this).field_p);
        ((fq) this).field_D = 256;
        ((fq) this).field_C = param0;
    }

    public fq() {
        super(0, 0, 0, 0, (el) null, (ca) null);
        ((fq) this).field_D = 256;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        t var5 = null;
        if (0 == param0) {
          if (((fq) this).field_C != null) {
            if (((fq) this).field_D == 0) {
              return;
            } else {
              if (256 != ((fq) this).field_D) {
                if (param1 > -7) {
                  return;
                } else {
                  var5 = new t(((fq) this).field_C.field_p, ((fq) this).field_C.field_o);
                  tm.a((byte) 34, var5);
                  ((fq) this).field_C.a(param0, (byte) -61, 0, 0);
                  r.a(122);
                  var5.e(param3 + ((fq) this).field_w, ((fq) this).field_k + param2, ((fq) this).field_D);
                  return;
                }
              } else {
                ((fq) this).field_C.a(param0, (byte) -70, param2 - -((fq) this).field_k, ((fq) this).field_w + param3);
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void g(byte param0) {
        field_G = null;
        if (param0 > -64) {
            return;
        }
        field_F = null;
    }

    final static void a(boolean param0, int param1, gg param2, int param3) {
        if (param0) {
          field_F = null;
          tb.field_l.a(param2, param1, on.field_c * param3 / 160);
          return;
        } else {
          tb.field_l.a(param2, param1, on.field_c * param3 / 160);
          return;
        }
    }

    final static sm[] a(la param0, int param1, int param2, int param3) {
        if (nd.a(param3, param0, -1, param2)) {
          if (param1 != -25960) {
            fq.g((byte) -70);
            return rf.a((byte) 66);
          } else {
            return rf.a((byte) 66);
          }
        } else {
          return null;
        }
    }

    final static boolean a(String param0, int param1) {
        String var2 = null;
        Exception var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_15_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Torquing.field_u;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!vh.field_i.startsWith("win")) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = 0;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0 != 0;
                }
                case 5: {
                    try {
                        if (param0.startsWith("http://")) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param0.startsWith("https://")) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0 != 0;
                }
                case 9: {
                    try {
                        var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        var3 = param1;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (param0.length() <= var3) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((var2.indexOf((int) param0.charAt(var3)) ^ -1) != 0) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return stackIn_13_0 != 0;
                }
                case 14: {
                    try {
                        var3++;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        Process discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                        stackOut_15_0 = 1;
                        stackIn_16_0 = stackOut_15_0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return stackIn_16_0 != 0;
                }
                case 17: {
                    var2_ref = (Exception) (Object) caughtException;
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = false;
    }
}
