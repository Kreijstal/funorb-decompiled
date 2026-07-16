/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sf extends fd implements ta {
    static double field_M;
    private tg[] field_E;
    private String field_D;
    private int[] field_N;
    private int field_H;
    static String field_K;
    static eh field_O;
    static int field_I;
    static int field_F;
    static mg[][] field_J;
    private sh field_G;
    private e field_L;

    sf(sh param0, e param1, String param2) {
        super(0, 0, 288, 0, (ol) null);
        ((sf) this).field_H = 0;
        ((sf) this).field_D = param2;
        ((sf) this).field_L = param1;
        ((sf) this).field_G = param0;
        int var4 = ((sf) this).field_D != null ? ((sf) this).field_L.a(((sf) this).field_D, 260, ((sf) this).field_L.field_H) : 0;
        ((sf) this).a(var4 + 22, true, 0, 0, 288);
    }

    final tg a(cd param0, int param1, String param2) {
        tg var4 = new tg(param2, param0);
        var4.field_w = (ol) (Object) new hf();
        int var5 = ((sf) this).field_m - 2;
        ((sf) this).a(((sf) this).field_m - -34, true, 0, 0, ((sf) this).field_g);
        var4.a(30, true, var5, 7, -14 + ((sf) this).field_g);
        ((sf) this).a((fi) (Object) var4, (byte) -78);
        if (param1 != 260) {
            ((sf) this).field_L = null;
        }
        return var4;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        int discarded$0 = ((sf) this).field_L.a(((sf) this).field_D, param1 - (-((sf) this).field_l - 14), ((sf) this).field_u + param2 + 10, -28 + ((sf) this).field_g, ((sf) this).field_m, 16777215, -1, 0, 0, ((sf) this).field_L.field_H);
    }

    final static int a(byte param0, String param1, e param2, int param3, String[] param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = Virogrid.field_F ? 1 : 0;
          var5 = param2.a(param1);
          if (param3 < var5) {
            break L0;
          } else {
            if (param1.indexOf("<br>") == -1) {
              param4[0] = (String) (Object) param4;
              return 1;
            } else {
              break L0;
            }
          }
        }
        var6 = (param3 + var5 + -1) / param3;
        param3 = var5 / var6;
        var6 = 0;
        var7 = 0;
        var8 = param1.length();
        var9 = 0;
        L1: while (true) {
          if (var8 <= var9) {
            L2: {
              if (var7 < var8) {
                int incrementValue$3 = var6;
                var6++;
                param4[incrementValue$3] = param1.substring(var7, var8).trim();
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param0 >= 119) {
                break L3;
              } else {
                sf.a(-85);
                break L3;
              }
            }
            return var6;
          } else {
            L4: {
              L5: {
                var10 = param1.charAt(var9);
                if (var10 == 32) {
                  break L5;
                } else {
                  if (var10 == 45) {
                    break L5;
                  } else {
                    break L4;
                  }
                }
              }
              var11 = param1.substring(var7, var9 + 1).trim();
              var12 = param2.a(var11);
              if (var12 < param3) {
                break L4;
              } else {
                int incrementValue$4 = var6;
                var6++;
                param4[incrementValue$4] = var11;
                var7 = var9 - -1;
                break L4;
              }
            }
            if (var10 == 62) {
              if (param1.regionMatches(-3 + var9, "<br>", 0, 4)) {
                int incrementValue$5 = var6;
                var6++;
                param4[incrementValue$5] = param1.substring(var7, -3 + var9).trim();
                var7 = 1 + var9;
                var9++;
                continue L1;
              } else {
                var9++;
                continue L1;
              }
            } else {
              var9++;
              continue L1;
            }
          }
        }
    }

    public static void a(int param0) {
        field_K = null;
        field_O = null;
        if (param0 <= 52) {
            field_J = null;
        }
        field_J = null;
    }

    private final void a(int param0, int param1) {
        int var5 = 0;
        int var6 = Virogrid.field_F ? 1 : 0;
        if (!(((sf) this).field_H < param1)) {
            return;
        }
        tg[] var7 = new tg[param1];
        tg[] var3 = var7;
        if (param0 != 4) {
            ((sf) this).field_G = null;
        }
        int[] var4 = new int[param1];
        for (var5 = 0; var5 < ((sf) this).field_H; var5++) {
            var7[var5] = ((sf) this).field_E[var5];
            var4[var5] = ((sf) this).field_N[var5];
        }
        ((sf) this).field_E = var3;
        ((sf) this).field_N = var4;
        ((sf) this).field_H = param1;
    }

    public final void a(int param0, tg param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = Virogrid.field_F ? 1 : 0;
        for (var6 = 0; ((sf) this).field_H > var6; var6++) {
            if (((sf) this).field_E[var6] == param1) {
                var7 = ((sf) this).field_N[var6];
                if ((var7 ^ -1) == 0) {
                    ((sf) this).field_G.h(true);
                    break;
                }
                kf.a(((sf) this).field_N[var6], param0 + -12086);
                break;
            }
        }
        if (param0 != 12085) {
            ((sf) this).field_L = null;
        }
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
                  param1.getAppletContext().showDocument(og.a(-1, param1, var2), "_top");
                  if (param0) {
                    break L1;
                  } else {
                    field_M = -0.07399320021683413;
                    break L1;
                  }
                }
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, String param1, byte param2) {
        if (param2 <= 125) {
            field_I = -104;
        }
        int var4 = ((sf) this).field_H;
        this.a(4, 1 + var4);
        ((sf) this).field_E[var4] = ((sf) this).a((cd) this, 260, param1);
        ((sf) this).field_N[var4] = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "Names can only contain letters, numbers, spaces and underscores";
        field_F = -1;
    }
}
