/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb {
    static char[] field_a;

    public static void a(byte param0) {
        if (param0 <= 39) {
            return;
        }
        field_a = null;
    }

    final static cd a(sh param0, int param1, String param2, String param3, sh param4) {
        int var5 = 0;
        int var6 = 0;
        var5 = param4.c(param2, (byte) -89);
        if (param1 != 246) {
          return null;
        } else {
          var6 = param4.a(param3, -27964, var5);
          return dl.a(var5, param4, (byte) -44, param0, var6);
        }
    }

    final static void a(int param0, boolean param1) {
        if (!param1) {
            field_a = null;
            int discarded$0 = ka.a(2);
            return;
        }
        int discarded$1 = ka.a(2);
    }

    final static mj a(sh param0, String param1, String param2, sh param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        if (param4 != -2569) {
          field_a = null;
          var5 = param0.c(param2, (byte) -89);
          var6 = param0.a(param1, -27964, var5);
          return hc.a((byte) 110, param0, param3, var6, var5);
        } else {
          var5 = param0.c(param2, (byte) -89);
          var6 = param0.a(param1, -27964, var5);
          return hc.a((byte) 110, param0, param3, var6, var5);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
    }
}
