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
            field_a = (String) null;
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
        int[] discarded$6 = null;
        int[] discarded$7 = null;
        int[] discarded$8 = null;
        int var1 = 0;
        if (224 > gf.field_d) {
          var1 = gf.field_d % 32;
          ia.a(true, -var1 + (gf.field_d - -32));
          if (param0 == -32) {
            return;
          } else {
            discarded$6 = h.a((byte) 30);
            return;
          }
        } else {
          ia.a(true, 256);
          if (!fleas.field_A) {
            if (param0 != -32) {
              discarded$7 = h.a((byte) 30);
              return;
            } else {
              return;
            }
          } else {
            var1 = gf.field_d % 32;
            ia.a(true, -var1 + (gf.field_d - -32));
            if (param0 == -32) {
              return;
            } else {
              discarded$8 = h.a((byte) 30);
              return;
            }
          }
        }
    }

    final static int a(int param0, int param1) {
        param0 = ((param0 & -1431655766) >>> 1687952609) + (param0 & 1431655765);
        int var2 = -97 % ((-51 - param1) / 42);
        param0 = (858993459 & param0) - -((-858993457 & param0) >>> 854086306);
        param0 = param0 + (param0 >>> 1033602532) & 252645135;
        param0 = param0 + (param0 >>> -1623321272);
        param0 = param0 + (param0 >>> -1723567056);
        return 255 & param0;
    }

    h(Throwable param0, String param1) {
        this.field_e = param0;
        this.field_f = param1;
    }

    static {
        field_a = "Please enter your age in years";
        field_h = false;
        field_d = "Members' Benefits";
        field_c = new int[8192];
    }
}
