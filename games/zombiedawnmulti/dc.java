/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc extends cj {
    static long[] field_Ib;
    static int field_Hb;
    int field_Kb;
    private cj field_Mb;
    private cj[] field_Nb;
    private cj[] field_Jb;
    static int field_Fb;
    static th field_Gb;
    static fm field_Lb;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((dc) this).field_x = param1;
        if (param0 != 9736) {
            return;
        }
        ((dc) this).field_z = param5;
        ((dc) this).field_Q = param6;
        ((dc) this).field_zb = param2;
        this.a(param3, param4, (byte) 119);
    }

    public static void c(byte param0) {
        field_Lb = null;
        int var1 = -12 / ((8 - param0) / 54);
        field_Ib = null;
        field_Gb = null;
    }

    dc(long param0, cj param1, String[] param2, cj param3, cj[] param4, int param5) {
        super(param0, (cj) null);
        int var8 = 0;
        cj var9 = null;
        ((dc) this).field_Nb = new cj[param2.length];
        ((dc) this).field_Mb = new cj(0L, param3);
        ((dc) this).field_Jb = param4;
        for (var8 = 0; var8 < param2.length; var8++) {
            var9 = new cj(0L, param1);
            var9.field_wb = param2[var8];
            ((dc) this).field_Nb[var8] = var9;
            ((dc) this).a((byte) 50, var9);
        }
        ((dc) this).a((byte) 50, ((dc) this).field_Mb);
        int var11 = 0;
        var8 = var11;
        while (var11 < param4.length) {
            ((dc) this).field_Mb.a((byte) 50, param4[var11]);
            var11++;
        }
        ((dc) this).field_Kb = param5;
        ((dc) this).field_Nb[param5].field_Ab = true;
    }

    private final void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        var4 = 0;
        L0: while (true) {
          if (((dc) this).field_Nb.length <= var4) {
            L1: {
              if (param2 >= 72) {
                break L1;
              } else {
                ((dc) this).a(-74, 39, -109, 35, 100, -8, 71);
                break L1;
              }
            }
            ((dc) this).field_Mb.a(((dc) this).field_z + -param1, param1, ((dc) this).field_zb, 0, -3344);
            var8 = 0;
            var4 = var8;
            L2: while (true) {
              if (((dc) this).field_Jb.length <= var8) {
                return;
              } else {
                ((dc) this).field_Jb[var8].a(-(param0 * 2) + ((dc) this).field_Mb.field_z, param0, ((dc) this).field_Mb.field_zb - 2 * param0, param0, -3344);
                if (((dc) this).field_Kb != var8) {
                  ((dc) this).field_Jb[var8].field_x = ((dc) this).field_Jb[var8].field_x + 10000;
                  var8++;
                  continue L2;
                } else {
                  var8++;
                  continue L2;
                }
              }
            }
          } else {
            var5 = var4 * ((dc) this).field_zb / ((dc) this).field_Nb.length;
            var6 = (var4 - -1) * ((dc) this).field_zb / ((dc) this).field_Nb.length;
            ((dc) this).field_Nb[var4].field_x = var5;
            ((dc) this).field_Nb[var4].field_Q = 0;
            ((dc) this).field_Nb[var4].field_zb = -var5 + var6;
            ((dc) this).field_Nb[var4].field_z = param1;
            var4++;
            continue L0;
          }
        }
    }

    final static void a(long param0, java.applet.Applet param1, String param2, int param3, String param4) {
        try {
            Throwable var6 = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var8 = param1.getParameter("cookiehost");
                var7 = var8;
                var7 = var8;
                var9 = param2 + "=" + param4 + "; version=1; path=/; domain=" + var8;
                var7 = var9;
                var7 = var9;
                if (0L > param0) {
                  var7 = var9 + "; Discard;";
                  break L0;
                } else {
                  var7 = var9 + "; Expires=" + ke.a(-29971, bl.a((byte) 101) + 1000L * param0) + "; Max-Age=" + param0;
                  break L0;
                }
              }
              if (param3 < -91) {
                fo.a(param1, 14575, "document.cookie=\"" + var7 + "\"");
              } else {
                return;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var6 = decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 < -26) {
          var2 = 0;
          L0: while (true) {
            if (((dc) this).field_Nb.length <= var2) {
              return;
            } else {
              if (var2 != ((dc) this).field_Kb) {
                if (0 != ((dc) this).field_Nb[var2].field_T) {
                  ((dc) this).field_Nb[((dc) this).field_Kb].field_Ab = false;
                  ((dc) this).field_Jb[((dc) this).field_Kb].field_x = ((dc) this).field_Jb[((dc) this).field_Kb].field_x + 10000;
                  ((dc) this).field_Kb = var2;
                  ((dc) this).field_Nb[var2].field_Ab = true;
                  ((dc) this).field_Jb[var2].field_x = ((dc) this).field_Jb[var2].field_x - 10000;
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
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Ib = new long[32];
        field_Gb = new th();
    }
}
