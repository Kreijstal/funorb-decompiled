/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml {
    boolean field_a;
    String field_e;
    boolean field_f;
    String[] field_d;
    static int[] field_c;
    static int field_h;
    int field_g;
    static int field_b;

    final static bh a(java.applet.Applet param0, byte param1) {
        String var2 = null;
        bh[] var3 = null;
        int var4 = 0;
        bh var5 = null;
        int var6 = 0;
        var6 = stellarshard.field_B;
        var2 = bi.a(param0, "jagex-last-login-method", 61);
        if (var2 == null) {
          return ma.field_m;
        } else {
          var3 = jj.b(-1);
          var4 = 0;
          L0: while (true) {
            if (var3.length <= var4) {
              if (param1 > -7) {
                ml.a((byte) 46);
                return ma.field_m;
              } else {
                return ma.field_m;
              }
            } else {
              var5 = var3[var4];
              if (!var5.a(-114, var2)) {
                var4++;
                continue L0;
              } else {
                return var5;
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        if (param0 >= -92) {
            field_h = 125;
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static pb[] a(String param0, byte param1, pf param2, String param3) {
        int var4 = param2.b(param0, (byte) -118);
        int var5 = 102 / ((31 - param1) / 48);
        int var6 = param2.a(var4, param3, (byte) -11);
        return wb.a(var6, var4, param2, 55);
    }

    ml(boolean param0) {
        ((ml) this).field_f = param0 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_c = new int[256];
        for (var0 = 0; 256 > var0; var0++) {
            field_c[var0] = 65536 * var0 - -(257 * (var0 / 2));
        }
        field_b = 640;
    }
}
