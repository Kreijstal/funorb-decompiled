/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    static int field_a;
    static gh field_b;
    static int field_d;
    static gh field_c;
    static gh field_e;

    final static void a(int param0, mb param1, byte param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Object var13 = null;
        L0: {
          var12 = SteelSentinels.field_G;
          var6 = sb.field_bb.field_c * param5;
          if (param2 < -90) {
            break L0;
          } else {
            var13 = null;
            fl.a(48, (mb) null, (byte) -79, 76, -55, -81);
            break L0;
          }
        }
        var7 = param5;
        L1: while (true) {
          if (var7 >= param5 + param3) {
            return;
          } else {
            var8 = param4;
            L2: while (true) {
              if (var8 >= param4 + param0) {
                var6 = var6 + sb.field_bb.field_c;
                var7++;
                continue L1;
              } else {
                var9 = sb.field_bb.field_a[var6 + var8];
                if (var9 >> 437846504 == (65535 & var9)) {
                  var10 = param1.d((byte) 25);
                  var11 = 255 & var9;
                  if (var11 > 64) {
                    sb.field_bb.field_a[var8 - -var6] = ec.a(16711935, var11 * ec.a(16711935, var10) >> -1679136504) + ec.a(65280, var11 * ec.a(var10, 65280) >> 1048627944);
                    var8++;
                    continue L2;
                  } else {
                    var8++;
                    continue L2;
                  }
                } else {
                  var10 = 255 & var9;
                  var10 = var10 / 2;
                  if (-33 > (var10 ^ -1)) {
                    sb.field_bb.field_a[var8 + var6] = param1.field_ic * var10;
                    var8++;
                    continue L2;
                  } else {
                    var8++;
                    continue L2;
                  }
                }
              }
            }
          }
        }
    }

    final static void a(byte param0, boolean param1) {
        if (param0 < 75) {
            return;
        }
        gf.field_a.a(200, param1);
    }

    final static pc a(byte param0, sk param1, int param2) {
        if (param0 < 27) {
            fl.a((byte) -76, true);
        }
        return on.a(em.a(param1, 100, param2), -48);
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 <= 60) {
            field_e = null;
        }
        field_b = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = -1;
    }
}
