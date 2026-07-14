/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh extends ks {
    static String field_H;
    static boolean[] field_D;
    byte[] field_F;
    static wk[] field_G;
    static String field_J;
    static String field_I;
    static volatile int field_B;
    int field_L;
    bc field_C;
    static int field_E;
    static tp field_K;

    final static wk a(String param0, String param1, kl param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        var4 = param2.a(param1, 96);
        if (param3) {
          field_G = null;
          var5 = param2.a((byte) -107, var4, param0);
          return vh.a(-1, var4, param2, var5);
        } else {
          var5 = param2.a((byte) -107, var4, param0);
          return vh.a(-1, var4, param2, var5);
        }
    }

    final byte[] d(byte param0) {
        int var2 = 125 / ((param0 - -35) / 45);
        if (!(!((nh) this).field_x)) {
            throw new RuntimeException();
        }
        return ((nh) this).field_F;
    }

    public static void h(int param0) {
        field_J = null;
        field_G = null;
        field_I = null;
        field_D = null;
        if (param0 < 107) {
            return;
        }
        field_H = null;
        field_K = null;
    }

    nh() {
    }

    final int g(int param0) {
        if (((nh) this).field_x) {
            return 0;
        }
        if (param0 != 0) {
            field_J = null;
            return 100;
        }
        return 100;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = -1;
        field_I = "Open in popup window";
        field_H = "Magic robes help to protect against magic damage.";
        field_J = "Error";
    }
}
