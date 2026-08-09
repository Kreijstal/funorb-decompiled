/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej {
    static String field_b;
    static ok[] field_a;
    private ag field_e;
    private rh field_f;
    static int[] field_c;
    private rh field_d;

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        param1 = param1 * 16;
        param0 = param0 * 16;
        param5 = param5 * 16;
        param4 = param4 * 16;
        gb.g(param4, param1, param0, param5, 16711680, param2 + 96);
        gb.e(param4, param1, param0, param5, 16711680, param2 + 128);
        int var6 = 1 / ((17 - param3) / 34);
    }

    final aj a(int param0, int param1) {
        aj var3;
        byte[] var4;
        var3 = (aj) (this.field_e.a((byte) -92, (long)param1));
        if (var3 == null) {
          L0: {
            L1: {
              if (param1 < 32768) {
                break L1;
              } else {
                var4 = this.field_f.a(1, (byte) 123, 32767 & param1);
                if (!fleas.field_A) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var4 = this.field_d.a(1, (byte) 124, param1);
            break L0;
          }
          var3 = new aj();
          if (var4 == null) {
            if (param1 >= param0) {
              var3.h(0);
              this.field_e.a(var3, (byte) -122, (long)param1);
              return var3;
            } else {
              this.field_e.a(var3, (byte) -122, (long)param1);
              return var3;
            }
          } else {
            var3.a(new ni(var4), 4);
            if (param1 < param0) {
              this.field_e.a(var3, (byte) -122, (long)param1);
              return var3;
            } else {
              var3.h(0);
              this.field_e.a(var3, (byte) -122, (long)param1);
              return var3;
            }
          }
        } else {
          return var3;
        }
    }

    final static void a(byte param0) {
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        j.field_f = wi.field_p.field_b;
                        if (-1 != (fleas.field_E ^ -1)) {
                            statePc = 8;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (tj.field_a < 15) {
                            statePc = 8;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (qh.c((byte) 55)) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (-1 > (wc.field_q ^ -1)) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        bj.field_m = bc.field_V;
                        oa.a(7, false, -72);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return;
                }
                case 8: {
                    try {
                        var1_int = tj.field_a;
                        if (tj.field_a >= nl.field_c[fleas.field_E].length) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var1_int = -1 + nl.field_c[fleas.field_E].length;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var2 = hf.field_e.length * var1_int / ia.field_m[fleas.field_E].length;
                        if (param0 == -39) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return;
                }
                case 13: {
                    try {
                        k.a(0, hf.field_e[var2]);
                        lk.field_D.field_k = false;
                        si.field_y.field_k = true;
                        c.field_U = false;
                        uc.b((byte) 84);
                        rg.b(4);
                        em.field_b = 6000;
                        fb.field_e = new int[100];
                        oa.field_n = true;
                        pg.field_f = -60;
                        qh.field_y = -250;
                        jk.field_l = 0;
                        lj.field_c = new int[100];
                        mg.field_d = -1;
                        nc.field_a = new int[100];
                        uf.field_h = 0;
                        mh.field_u = 1;
                        var3 = 0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (100 <= var3) {
                            statePc = 21;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        nc.field_a[var3] = -1000;
                        var3++;
                        if (var4 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        return;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var4 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        return;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw pf.a((Throwable) ((Object) var1), "ej.A(" + param0 + ')');
                }
                case 21: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0) {
        ak.field_a.d(new rb(), 26034);
        if (param0 != 16) {
            ej.a(17);
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 1) {
            return;
        }
        field_c = null;
    }

    private ej() throws Throwable {
        throw new Error();
    }

    static {
        field_b = "You are unable to access this level yet.";
        field_a = new ok[15];
        field_c = new int[8192];
    }
}
