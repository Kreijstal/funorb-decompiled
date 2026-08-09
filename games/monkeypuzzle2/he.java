/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he extends ug {
    static String[] field_f;
    int field_h;
    static te field_e;
    static int[] field_g;

    final static void e(int param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        ki var2 = null;
        int var3 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1_int = param0;
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
                        if (1000 <= var1_int) {
                            statePc = 6;
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
                        var2 = new ki(-1, 0, var1_int);
                        ri.field_b.a(-8212, var2);
                        e.field_a[var1_int] = var2;
                        aj.field_b.a(param0 ^ -8212, new il((ki) null, (ki) null, 32.0f));
                        var1_int++;
                        if (var3 != 0) {
                            statePc = 9;
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
                        if (var3 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        nd.field_b.e();
                        ge.f(nd.field_b.field_m >> 201508321, nd.field_b.field_n >> 1889488833, (nd.field_b.field_m >> 1731254689) + -1, 16711680);
                        ac.field_a.a((byte) 115);
                        ek.field_b = 0;
                        dc.field_e = 0;
                        ok.field_d = false;
                        sc.field_c = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw la.a((Throwable) ((Object) runtimeException), "he.C(" + param0 + ')');
                }
                case 9: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    he(int param0) {
        this.field_h = param0;
    }

    final static void f(int param0) {
        if (param0 != 0) {
            field_f = (String[]) null;
            ne.a(true);
            return;
        }
        ne.a(true);
    }

    public static void a(int param0) {
        field_e = null;
        field_f = null;
        if (param0 != 4) {
            return;
        }
        field_g = null;
    }

    final static le[] a(byte param0, int param1, int param2, int param3, int param4) {
        le dupTemp$4 = null;
        le dupTemp$5 = null;
        le dupTemp$6 = null;
        le dupTemp$7 = null;
        le[] var5;
        le[] var6;
        if (param0 != 67) {
          L0: {
            he.f(3);
            var6 = new le[9];
            var5 = var6;
            dupTemp$4 = sj.a(param1, 74, param3);
            var6[6] = dupTemp$4;
            var5[3] = dupTemp$4;
            var5[2] = dupTemp$4;
            var5[1] = dupTemp$4;
            var5[0] = dupTemp$4;
            dupTemp$5 = sj.a(param1, 74, param2);
            var6[8] = dupTemp$5;
            var5[7] = dupTemp$5;
            var5[5] = dupTemp$5;
            if (0 != param4) {
              var6[4] = sj.a(64, 74, param4);
              break L0;
            } else {
              break L0;
            }
          }
          return var5;
        } else {
          L1: {
            var6 = new le[9];
            var5 = var6;
            dupTemp$6 = sj.a(param1, 74, param3);
            var6[6] = dupTemp$6;
            var5[3] = dupTemp$6;
            var5[2] = dupTemp$6;
            var5[1] = dupTemp$6;
            var5[0] = dupTemp$6;
            dupTemp$7 = sj.a(param1, 74, param2);
            var6[8] = dupTemp$7;
            var5[7] = dupTemp$7;
            var5[5] = dupTemp$7;
            if (0 != param4) {
              var6[4] = sj.a(64, 74, param4);
              break L1;
            } else {
              break L1;
            }
          }
          return var5;
        }
    }

    static {
        field_f = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_e = new te(15, 0, 1, 0);
        field_g = new int[8192];
    }
}
