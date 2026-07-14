/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fb {
    static String field_e;
    static String field_b;
    static String field_d;
    fq field_a;
    static ko field_c;

    public static void a(byte param0) {
        field_b = null;
        if (param0 != -50) {
          fb.a((byte) -54);
          field_d = null;
          field_e = null;
          field_c = null;
          return;
        } else {
          field_d = null;
          field_e = null;
          field_c = null;
          return;
        }
    }

    final static void a(int param0, dl[] param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = CrazyCrystals.field_B;
        if (param1 != null) {
          if ((param2 ^ -1) >= -1) {
            return;
          } else {
            var5 = param1[0].field_n;
            var6 = param1[2].field_n;
            var7 = param1[1].field_n;
            param1[0].a(param3, param4);
            param1[2].a(-var6 + (param2 + param3), param4);
            kh.b(ob.field_b);
            kh.a(var5 + param3, param4, -var6 + param2 + param3, param1[param0].field_o + param4);
            var8 = param3 - -var5;
            var9 = param2 + param3 + -var6;
            param3 = var8;
            L0: while (true) {
              if (var9 <= param3) {
                kh.a(ob.field_b);
                return;
              } else {
                param1[1].a(param3, param4);
                param3 = param3 + var7;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    abstract void a(boolean param0, int param1, int param2, byte param3, boolean param4, int param5, int param6);

    abstract fb a(int param0);

    fb(fq param0) {
        ((fb) this).field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "'<%1>' levels complete<br><col=<%0>>Proceeding to '<%2>' levels";
        field_d = "Still Alive";
    }
}
