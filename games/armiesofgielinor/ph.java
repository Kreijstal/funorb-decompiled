/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph {
    static lg field_c;
    static long field_d;
    static int[][][] field_e;
    static String[] field_b;
    static String field_a;
    static boolean field_f;

    final static boolean a(int param0, char param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (!(!Character.isISOControl(param1))) {
            return false;
        }
        if (!(!bi.a(param1, -31000))) {
            return true;
        }
        char[] var12 = ll.field_Nb;
        char[] var10 = var12;
        char[] var7 = var10;
        char[] var2 = var7;
        for (var3 = 0; var3 < var12.length; var3++) {
            var4 = var12[var3];
            if (!(var4 != param1)) {
                return true;
            }
        }
        if (param0 >= -8) {
            Object var6 = null;
            boolean discarded$0 = ph.a((String) null, (byte) -108);
        }
        char[] var13 = qv.field_i;
        char[] var11 = var13;
        char[] var8 = var11;
        var2 = var8;
        int var9 = 0;
        var3 = var9;
        while (var13.length > var9) {
            var4 = var13[var9];
            if (!(param1 != var4)) {
                return true;
            }
            var9++;
        }
        return false;
    }

    public static void a(byte param0) {
        field_e = null;
        if (param0 > -24) {
            return;
        }
        field_c = null;
        field_a = null;
        field_b = null;
    }

    final static boolean a(String param0, byte param1) {
        int var3 = 0;
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var2 = param0.charAt(0);
        for (var3 = 1; var3 < param0.length(); var3++) {
            if (var2 != param0.charAt(var3)) {
                return false;
            }
        }
        if (param1 < 41) {
            field_d = 88L;
            return true;
        }
        return true;
    }

    final static void a(String param0, java.applet.Applet param1, boolean param2) {
        try {
            String var6 = null;
            String var5 = null;
            String var4 = null;
            String var7 = null;
            sj.field_b = param0;
            try {
                var6 = param1.getParameter("cookieprefix");
                var5 = var6;
                var5 = var6;
                if (param2) {
                    boolean discarded$0 = ph.a(103, '');
                }
                var4 = param1.getParameter("cookiehost");
                var5 = var4;
                var5 = var4;
                var7 = var6 + "settings=" + param0 + "; version=1; path=/; domain=" + var4;
                var5 = var7;
                var5 = var7;
                if (-1 != (param0.length() ^ -1)) {
                    var5 = var7 + "; Expires=" + fq.a((byte) -82, vi.b(-118) + 94608000000L) + "; Max-Age=" + 94608000L;
                } else {
                    var5 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                lj.a((byte) -52, param1, "document.cookie=\"" + var5 + "\"");
            } catch (Throwable throwable) {
            }
            ld.a(16058, param1);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new lg();
        field_a = "Unpacking sound effects";
        field_b = new String[]{"1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th"};
        field_e = new int[][][]{new int[2][], new int[3][], new int[4][]};
    }
}
