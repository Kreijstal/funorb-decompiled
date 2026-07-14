/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class el extends ki {
    gi field_B;
    static String field_H;
    static int[] field_F;
    byte[] field_D;
    int field_C;
    static int field_I;
    static uc field_E;

    final static ek i(int param0) {
        ek var1 = null;
        if (param0 < 88) {
          return null;
        } else {
          var1 = new ek(nc.field_G, wd.field_b, ak.field_c[0], vi.field_c[0], vc.field_b[0], ih.field_d[0], ih.field_b[0], gj.field_w);
          tb.f((byte) -113);
          return var1;
        }
    }

    final int a(boolean param0) {
        if (!param0) {
            return 30;
        }
        if (!(!((el) this).field_w)) {
            return 0;
        }
        return 100;
    }

    public static void h(int param0) {
        field_E = null;
        field_F = null;
        int var1 = 27 % ((-59 - param0) / 48);
        field_H = null;
    }

    el() {
    }

    final static ek a(String param0, pf param1, byte param2, String param3) {
        int var4 = param1.b(param3, (byte) -118);
        int var6 = -52 % ((param2 - 71) / 55);
        int var5 = param1.a(var4, param0, (byte) -11);
        return fc.a(var4, param1, var5, true);
    }

    final byte[] g(int param0) {
        if (((el) this).field_w) {
          throw new RuntimeException();
        } else {
          if (param0 != -27203) {
            int discarded$2 = ((el) this).a(true);
            return ((el) this).field_D;
          } else {
            return ((el) this).field_D;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = new int[]{3, 6, 5, 6, 7, 4};
        field_H = "This password contains your email address, and would be easy to guess";
    }
}
