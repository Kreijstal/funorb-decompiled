/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iab implements nka {
    static oe field_a;

    public static void a(int param0) {
        if (param0 != 2) {
            field_a = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    public final void a(int param0, int param1, int param2) {
        int var4 = 103 / ((22 - param0) / 42);
        pab.a(param2, param1, (byte) -95);
    }

    final static String a(int param0, String param1, String param2, byte param3) {
        faa var5 = null;
        int var6 = 0;
        vu var7 = null;
        CharSequence var8 = null;
        var8 = (CharSequence) (Object) param2;
        if (!mn.a(var8, (byte) -114)) {
          return tjb.field_Cb;
        } else {
          if (2 == iwa.field_b) {
            var7 = nf.a(param1, false);
            if (var7 == null) {
              return isa.a(mr.field_L, new String[1], 122);
            } else {
              var7.b(param3 ^ 3918);
              var7.d((byte) -35);
              mq.field_k = mq.field_k - 1;
              var5 = dpa.field_p;
              if (param3 != -76) {
                iab.a(76);
                var5.h(24335, param0);
                var5.field_e = var5.field_e + 1;
                var6 = var5.field_e;
                var5.c(param3 ^ -76, 3);
                var5.a(true, param2);
                var5.e(var5.field_e + -var6, param3 + -53);
                return null;
              } else {
                var5.h(24335, param0);
                var5.field_e = var5.field_e + 1;
                var6 = var5.field_e;
                var5.c(param3 ^ -76, 3);
                var5.a(true, param2);
                var5.e(var5.field_e + -var6, param3 + -53);
                return null;
              }
            }
          } else {
            return nf.field_b;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new oe();
    }
}
