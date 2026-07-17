/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h extends RuntimeException {
    String field_f;
    static volatile boolean field_h;
    static String field_a;
    static int[] field_b;
    static String field_d;
    static int[] field_c;
    static dd[] field_g;
    Throwable field_e;

    final static long b(int param0) {
        if (param0 <= 86) {
            field_a = null;
            return lj.a((byte) -35) + -ug.field_d;
        }
        return lj.a((byte) -35) + -ug.field_d;
    }

    public static void c(int param0) {
        field_d = null;
        field_g = null;
        int var1 = 112 % ((param0 - 13) / 62);
        field_c = null;
        field_a = null;
        field_b = null;
    }

    final static int[] a(byte param0) {
        if (param0 > -109) {
            h.a(7);
            return new int[8];
        }
        return new int[8];
    }

    final static void a(int param0) {
        int var1 = 0;
        L0: {
          if (224 > gf.field_d) {
            var1 = gf.field_d % 32;
            ia.a(true, -var1 + (gf.field_d - -32));
            break L0;
          } else {
            ia.a(true, 256);
            break L0;
          }
        }
        if (param0 != -32) {
          int[] discarded$2 = h.a((byte) 30);
          return;
        } else {
          return;
        }
    }

    final static int a(int param0, int param1) {
        param0 = ((param0 & -1431655766) >>> 1) + (param0 & 1431655765);
        int var2 = 0;
        param0 = (858993459 & param0) - -((-858993457 & param0) >>> 2);
        param0 = param0 + (param0 >>> 4) & 252645135;
        param0 = param0 + (param0 >>> 8);
        param0 = param0 + (param0 >>> 16);
        return 255 & param0;
    }

    h(Throwable param0, String param1) {
        ((h) this).field_e = param0;
        ((h) this).field_f = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Please enter your age in years";
        field_h = false;
        field_d = "Members' Benefits";
        field_c = new int[8192];
    }
}
