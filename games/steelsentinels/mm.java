/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm {
    static String field_c;
    static gh field_a;
    static ul field_b;
    static String[] field_d;
    static String field_f;
    static ml field_e;
    static kj field_g;

    final synchronized static long a(int param0) {
        long var1 = System.currentTimeMillis();
        if (!(co.field_f <= var1)) {
            be.field_d = be.field_d + (-var1 + co.field_f);
        }
        co.field_f = var1;
        int var3 = 23 / ((-10 - param0) / 47);
        return be.field_d + var1;
    }

    final static boolean a(boolean param0) {
        if (param0) {
            return false;
        }
        return cf.c((byte) 89);
    }

    final static byte[] a(byte param0, String param1) {
        if (param0 != 9) {
            int discarded$0 = mm.a((byte) 11, -108);
        }
        return ok.field_e.a(param1, -742, "");
    }

    final static int a(byte param0, int param1) {
        param1 = (1431655765 & param1) + ((param1 & -1431655766) >>> 2096884577);
        param1 = (858993459 & param1) - -((param1 & -858993459) >>> -423750110);
        param1 = (param1 >>> -235892316) + param1 & 252645135;
        if (param0 < 100) {
            return -11;
        }
        param1 = param1 + (param1 >>> 1863617800);
        param1 = param1 + (param1 >>> 569464720);
        return 255 & param1;
    }

    final static void a(String param0, byte param1, String param2, java.applet.Applet param3, long param4) {
        try {
            Throwable var6 = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var8 = param3.getParameter("cookiehost");
                var7 = var8;
                var7 = var8;
                if (param1 >= 88) {
                  break L0;
                } else {
                  boolean discarded$1 = mm.a(true);
                  break L0;
                }
              }
              L1: {
                var9 = param0 + "=" + param2 + "; version=1; path=/; domain=" + var8;
                var7 = var9;
                var7 = var9;
                if (0L > param4) {
                  var7 = var9 + "; Discard;";
                  break L1;
                } else {
                  var7 = var9 + "; Expires=" + mj.b(param4 * 1000L + mm.a(-75), 0) + "; Max-Age=" + param4;
                  break L1;
                }
              }
              hn.a(param3, 27781, "document.cookie=\"" + var7 + "\"");
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

    final static boolean a(int param0, nk param1) {
        int var3 = 0;
        int var4 = SteelSentinels.field_G;
        if (!nk.f((byte) -23)) {
            if (!(!oc.a(param1.field_N, param0 + 16155, false))) {
                return false;
            }
        }
        if (t.a(rn.field_D, param1.field_N, -20370)) {
            return true;
        }
        if ((param1.field_Q ^ -1) == -2) {
            return false;
        }
        int[] var5 = nl.a(uc.field_b[0], (byte) 125);
        int[] var2 = var5;
        for (var3 = 0; var3 < var5.length + -8; var3++) {
            if (var5[var3] == param1.field_N) {
                return true;
            }
        }
        if (param0 != -16242) {
            return true;
        }
        return false;
    }

    public static void b(int param0) {
        field_b = null;
        field_e = null;
        field_d = null;
        field_f = null;
        field_a = null;
        field_g = null;
        int var1 = 54 % ((param0 - 28) / 55);
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "% engineered";
        field_d = new String[]{"PURPLE TEAM", "ORANGE TEAM", "GREEN TEAM"};
        field_b = new ul();
        field_f = "Cubes needed: ";
        field_e = new ml();
    }
}
