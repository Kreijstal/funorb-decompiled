/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl extends cr {
    static String field_Nb;
    int field_Kb;
    static cr field_Ib;
    private cr[] field_Mb;
    private cr[] field_Lb;
    static String field_Jb;
    private cr field_Hb;

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        int var9 = 0;
        var7 = Vertigo2.field_L ? 1 : 0;
        var4 = 0;
        L0: while (true) {
          if (((kl) this).field_Mb.length <= var4) {
            L1: {
              if (param0 == -12320) {
                break L1;
              } else {
                var8 = null;
                String discarded$1 = kl.a((byte) -49, (String) null, (java.applet.Applet) null);
                break L1;
              }
            }
            ((kl) this).field_Hb.a(param0 ^ -12414, ((kl) this).field_Fb, ((kl) this).field_db - param1, param1, 0);
            var9 = 0;
            var4 = var9;
            L2: while (true) {
              if (((kl) this).field_Lb.length <= var9) {
                return;
              } else {
                ((kl) this).field_Lb[var9].a(121, -(2 * param2) + ((kl) this).field_Hb.field_Fb, -(param2 * 2) + ((kl) this).field_Hb.field_db, param2, param2);
                if (var9 != ((kl) this).field_Kb) {
                  ((kl) this).field_Lb[var9].field_wb = ((kl) this).field_Lb[var9].field_wb + 10000;
                  var9++;
                  continue L2;
                } else {
                  var9++;
                  continue L2;
                }
              }
            }
          } else {
            var5 = var4 * ((kl) this).field_Fb / ((kl) this).field_Mb.length;
            var6 = ((kl) this).field_Fb * (1 + var4) / ((kl) this).field_Mb.length;
            ((kl) this).field_Mb[var4].field_wb = var5;
            ((kl) this).field_Mb[var4].field_N = 0;
            ((kl) this).field_Mb[var4].field_Fb = -var5 + var6;
            ((kl) this).field_Mb[var4].field_db = param1;
            var4++;
            continue L0;
          }
        }
    }

    final static String a(byte param0, String param1, java.applet.Applet param2) {
        try {
            String var3 = null;
            Throwable var3_ref = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            Object var8 = null;
            String stackIn_7_0 = null;
            String stackOut_6_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = Vertigo2.field_L ? 1 : 0;
                        if (param0 == 70) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        var8 = null;
                        String discarded$2 = kl.a((byte) 75, (String) null, (java.applet.Applet) null);
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        try {
                            var3 = (String) je.a(param2, false, "getcookies");
                            var4 = jr.a((byte) -9, ';', var3);
                            var5 = 0;
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
                            if (var4.length <= var5) {
                                statePc = 11;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            if (-1 < (var6 ^ -1)) {
                                statePc = 8;
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
                            if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) param1)) {
                                statePc = 8;
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
                            stackOut_6_0 = var4[var5].substring(var6 - -1).trim();
                            stackIn_7_0 = stackOut_6_0;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        return stackIn_7_0;
                    }
                    case 8: {
                        try {
                            var5++;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        var3_ref = caughtException;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        return null;
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

    public static void b(boolean param0) {
        field_Jb = null;
        field_Nb = null;
        field_Ib = null;
        if (!param0) {
            kl.b(false);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((kl) this).field_Fb = param3;
        ((kl) this).field_db = param5;
        ((kl) this).field_N = param6;
        if (param1 != 12318) {
            ((kl) this).field_Hb = null;
        }
        ((kl) this).field_wb = param2;
        this.a(param1 ^ -2, param4, param0);
    }

    kl(long param0, cr param1, String[] param2, cr param3, cr[] param4, int param5) {
        super(param0, (cr) null);
        int var8 = 0;
        cr var9 = null;
        ((kl) this).field_Mb = new cr[param2.length];
        ((kl) this).field_Hb = new cr(0L, param3);
        ((kl) this).field_Lb = param4;
        for (var8 = 0; param2.length > var8; var8++) {
            var9 = new cr(0L, param1);
            var9.field_S = param2[var8];
            ((kl) this).field_Mb[var8] = var9;
            ((kl) this).b(var9, 119);
        }
        ((kl) this).b(((kl) this).field_Hb, 122);
        int var11 = 0;
        var8 = var11;
        while (var11 < param4.length) {
            ((kl) this).field_Hb.b(param4[var11], 122);
            var11++;
        }
        ((kl) this).field_Kb = param5;
        ((kl) this).field_Mb[param5].field_V = true;
    }

    final void k(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = Vertigo2.field_L ? 1 : 0;
        var2 = param0;
        L0: while (true) {
          if (((kl) this).field_Mb.length <= var2) {
            return;
          } else {
            if (((kl) this).field_Kb != var2) {
              if (0 != ((kl) this).field_Mb[var2].field_tb) {
                ((kl) this).field_Mb[((kl) this).field_Kb].field_V = false;
                ((kl) this).field_Lb[((kl) this).field_Kb].field_wb = ((kl) this).field_Lb[((kl) this).field_Kb].field_wb + 10000;
                ((kl) this).field_Kb = var2;
                ((kl) this).field_Mb[var2].field_V = true;
                ((kl) this).field_Lb[var2].field_wb = ((kl) this).field_Lb[var2].field_wb - 10000;
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Nb = "Press TAB to chat or F10 to open Quick Chat.";
        field_Jb = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
    }
}
