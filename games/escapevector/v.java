/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v {
    static ed[] field_a;
    static int[] field_b;

    final static void a(int param0, int param1) {
        if (!(null == bk.field_r)) {
            bk.field_r.b(param0 ^ -9, param1);
        }
        if (param0 != 8) {
            int[] discarded$0 = v.a(120);
            return;
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            java.net.URL var2 = null;
            try {
                if (param1 >= -29) {
                    v.a(-34, 33);
                }
                var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
                param0.getAppletContext().showDocument(sh.a((byte) 29, param0, var2), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int[] a(int param0) {
        if (param0 >= -43) {
            return null;
        }
        return new int[8];
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        if (param0 != -87) {
            int[] discarded$0 = v.a(79);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[]{5, 6, 7};
    }
}
