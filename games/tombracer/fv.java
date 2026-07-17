/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fv {
    int field_c;
    private ab field_h;
    static int field_a;
    int field_i;
    static int field_e;
    int field_j;
    static String[] field_d;
    int field_f;
    int field_g;
    static String field_b;

    final static void a(byte param0, int param1, long param2) {
        kh var4 = ql.field_k;
        var4.k(param1, -2988);
        var4.field_h = var4.field_h + 1;
        int var5 = var4.field_h;
        var4.i(6, 0);
        var4.a(1736565456, param2);
        int var6 = -3 % ((param0 - 18) / 52);
        var4.d(-var5 + var4.field_h, (byte) -111);
    }

    final void a(int param0) {
        int var2 = 0;
        ha var3_ref_ha = null;
        int var3 = 0;
        int var4_int = 0;
        nh var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        nh[] var8 = null;
        L0: {
          var2 = ((fv) this).field_h.b((byte) -75).a(param0 ^ 28, ((fv) this).field_f);
          var3_ref_ha = tga.field_a;
          var4_int = ((fv) this).field_g;
          var5 = ((fv) this).field_c;
          var6 = ((fv) this).field_j;
          var7 = ((fv) this).field_i;
          var8 = dr.field_a;
          tra.a(1, var8, (byte) -51, var4_int, var3_ref_ha, var6, param0, var7, var5, 0);
          if (var2 == -1) {
            break L0;
          } else {
            var3 = bta.field_n[var2];
            var4 = eca.field_c[var3];
            var4.a((((fv) this).field_j >> 1) + ((fv) this).field_g - (var4.a() >> 1), (((fv) this).field_i >> 1) + (((fv) this).field_c + -(var4.c() >> 1)));
            break L0;
          }
        }
        if (0 > var2) {
          return;
        } else {
          sta.field_y[bta.field_f[var2]].a(-20 + (((fv) this).field_g + (((fv) this).field_j >> 1)), (((fv) this).field_i >> 1) + ((fv) this).field_c + -10);
          return;
        }
    }

    final boolean a(int param0, boolean param1, int param2) {
        if (!param1) {
          if (((fv) this).field_g <= param2) {
            if (param0 >= ((fv) this).field_c) {
              if (((fv) this).field_j + ((fv) this).field_g > param2) {
                if (param0 >= ((fv) this).field_i + ((fv) this).field_c) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    public static void a() {
        field_d = null;
        field_b = null;
        int var1 = -14;
    }

    fv(ab param0, int param1, int param2, int param3, int param4, int param5) {
        try {
            ((fv) this).field_f = param1;
            ((fv) this).field_j = param4;
            ((fv) this).field_c = param3;
            ((fv) this).field_g = param2;
            ((fv) this).field_i = param5;
            ((fv) this).field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "fv.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
        field_d = new String[]{"Looking for drums...", "Loading pistol", "Compressing orchestra", "Writing music score", "Decyphering cryptic maps", "Looking for Dad's journal", "Lost the Ark", "Evading evil forces", "Masterminding evil schemes", "Decoding hieroglyphs...", "Building ziggurats", "Digging pits", "Digging pits", "Cursing Tomb Libs", "Loading dart shooters", "Conducting historical research", "Hollowing out volcano", "Raising dead", "Buying precious idols"};
        field_b = "Precarious platforms";
    }
}
