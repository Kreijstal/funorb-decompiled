/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dj {
    static int field_d;
    static String field_h;
    static jp[] field_f;
    static jp field_e;
    static jp field_a;
    static int field_g;
    static bn field_c;
    static int field_b;

    final int a(long param0, byte param1) {
        long var4 = 0L;
        var4 = ((dj) this).d((byte) 107);
        if (var4 <= 0L) {
          if (param1 != -71) {
            return 106;
          } else {
            return ((dj) this).a(15, param0);
          }
        } else {
          wj.a(-124, var4);
          if (param1 != -71) {
            return 106;
          } else {
            return ((dj) this).a(15, param0);
          }
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (0 == param0) {
          return 0;
        } else {
          if (0 < param0) {
            L0: {
              var2 = 1;
              if (param0 <= 65535) {
                break L0;
              } else {
                param0 = param0 >> 16;
                var2 += 16;
                break L0;
              }
            }
            L1: {
              if ((param0 ^ -1) >= -256) {
                break L1;
              } else {
                param0 = param0 >> 8;
                var2 += 8;
                break L1;
              }
            }
            L2: {
              if (15 < param0) {
                var2 += 4;
                param0 = param0 >> 4;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (-4 > (param0 ^ -1)) {
                var2 += 2;
                param0 = param0 >> 2;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (1 < param0) {
                var2++;
                param0 = param0 >> 1;
                break L4;
              } else {
                break L4;
              }
            }
            return var2;
          } else {
            L5: {
              var2 = 2;
              if ((param0 ^ -1) <= 65535) {
                break L5;
              } else {
                var2 += 16;
                param0 = param0 >> 16;
                break L5;
              }
            }
            L6: {
              if (param0 < -256) {
                param0 = param0 >> 8;
                var2 += 8;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (param1 >= param0) {
                break L7;
              } else {
                param0 = param0 >> 4;
                var2 += 4;
                break L7;
              }
            }
            L8: {
              if (-4 > param0) {
                var2 += 2;
                param0 = param0 >> 2;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (1 <= param0) {
                break L9;
              } else {
                var2++;
                param0 = param0 >> 1;
                break L9;
              }
            }
            return var2;
          }
        }
    }

    abstract void a(int param0);

    final static boolean c(byte param0) {
        int var1 = 15 % ((81 - param0) / 36);
        hk.field_R = true;
        cg.field_i = 15000L + ue.a(false);
        return -12 == (i.field_j ^ -1) ? true : false;
    }

    public static void a(byte param0) {
        field_a = null;
        field_f = null;
        field_c = null;
        field_h = null;
        field_e = null;
        int var1 = 25 % ((param0 - -34) / 58);
    }

    abstract long d(byte param0);

    abstract int a(int param0, long param1);

    final static String a(boolean param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            Object var9 = null;
            String var10 = null;
            String stackIn_8_0 = null;
            String stackOut_7_0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = BrickABrac.field_J ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var10 = param1.getParameter("cookieprefix");
                            if (param0) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var9 = null;
                            String discarded$2 = dj.a(true, (java.applet.Applet) null);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var3 = var10 + "settings";
                            var4 = (String) ne.a("getcookies", -125, param1);
                            var5 = qb.a((byte) 123, var4, ';');
                            var6 = 0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (var5.length <= var6) {
                                statePc = 12;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var7 = var5[var6].indexOf('=');
                            if (0 > var7) {
                                statePc = 9;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (!var5[var6].substring(0, var7).trim().equals((Object) (Object) var3)) {
                                statePc = 9;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            stackOut_7_0 = var5[var6].substring(1 + var7).trim();
                            stackIn_8_0 = stackOut_7_0;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        return (String) (Object) stackIn_8_0;
                    }
                    case 9: {
                        try {
                            var6++;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        var2 = caughtException;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        if (wp.field_d != null) {
                            statePc = 14;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        return wp.field_d;
                    }
                    case 15: {
                        return param1.getParameter("settings");
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(byte param0) {
        kd.field_d = new String[rg.field_a];
        kd.field_d[18] = ta.field_c;
        kd.field_d[4] = fd.field_a;
        kd.field_d[16] = oj.field_o;
        kd.field_d[21] = br.field_Rb;
        kd.field_d[5] = k.field_i;
        kd.field_d[15] = tk.field_i;
        kd.field_d[9] = sh.field_b;
        kd.field_d[6] = pg.field_i;
        kd.field_d[20] = c.field_n;
        kd.field_d[7] = nk.field_i;
        kd.field_d[17] = pb.field_l;
        kd.field_d[19] = tq.field_g;
        kd.field_d[param0] = ed.field_a;
        kd.field_d[11] = bl.field_I;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Player names can be up to 12 letters, numbers and underscores";
    }
}
