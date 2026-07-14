/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hw {
    static jea field_a;

    public static void a(int param0) {
        if (param0 > -44) {
            field_a = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(byte param0, int param1, int param2, bo param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        kh var9 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        if (vpa.a(38)) {
          return;
        } else {
          var9 = ql.field_k;
          var9.k(param2, -2988);
          if (param0 == -111) {
            var9.field_h = var9.field_h + param1;
            var5 = var9.field_h;
            param3.a(200, var9);
            var6 = -var5 + var9.field_h;
            var7 = param1;
            if (0 != var7) {
              if (-2 != (var7 ^ -1)) {
                if ((var7 ^ -1) != -3) {
                  return;
                } else {
                  var9.b(var6, (byte) -105);
                  return;
                }
              } else {
                var9.d(var6, (byte) -111);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    static {
    }
}
