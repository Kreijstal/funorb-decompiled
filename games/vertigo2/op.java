/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class op {
    static String field_a;
    static int field_c;
    static String field_b;
    static si field_d;

    final static void a(int param0, int[] param1, int param2, byte[] param3, boolean param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = Vertigo2.field_L ? 1 : 0;
        if (param4) {
            return;
        }
        for (var5 = 0; var5 < eb.field_g.length; var5++) {
            param2 = eb.field_g[var5];
            var6 = var5 << 990596900;
            while (true) {
                param2--;
                if (0 == param2) {
                    break;
                }
                var6++;
                param0 = ac.field_K[var6];
                param1[param3[param0]] = param1[param3[param0]] + 1;
                ac.field_K[param1[param3[param0]]] = param0;
            }
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        if (param0 != 0) {
            field_b = null;
        }
        field_b = null;
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            java.net.URL var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              var4 = param1.getCodeBase();
              var3 = ar.a(param1, var4, param0 ^ param0).getFile();
              Object discarded$6 = je.a((byte) 83, "updatelinks", param1, new Object[2]);
              Object discarded$7 = je.a((byte) 55, "updatelinks", param1, new Object[2]);
              Object discarded$8 = je.a((byte) 120, "updatelinks", param1, new Object[2]);
              Object discarded$9 = je.a((byte) -72, "updatelinks", param1, new Object[2]);
              Object discarded$10 = je.a((byte) 126, "updatelinks", param1, new Object[2]);
              Object discarded$11 = je.a((byte) -117, "updatelinks", param1, new Object[2]);
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var2 = decompiledCaughtException;
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
        field_b = "<img=2> / <img=10><br><img=1> / <img=12><br><img=3> / <img=11><br><img=4> / <img=9><br><img=5> / <img=7><br><br><img=6> / <img=13><br><img=5><img=5><br><br><img=0><br><img=15> / <img=17><br><img=14> / <img=16><br><img=8><br><img=18>";
        field_a = null;
    }
}
