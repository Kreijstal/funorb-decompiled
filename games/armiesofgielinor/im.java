/*
 * Decompiled by CFR-JS 0.4.0.
 */
class im extends ms {
    private static int[] field_u;
    static sn[] field_v;
    static je field_x;
    static wk field_y;
    static boolean field_w;

    final static int a(om param0, int param1) {
        if (param1 != 19) {
            im.b(49, 30);
        }
        int var2 = param0.field_G.field_r;
        int var3 = param0.field_v;
        return mh.a(var2, -125, var3);
    }

    final static void b(int param0, int param1) {
        ol.field_B = (param0 & 51) >> -194167164;
        if (param1 != -27498) {
            field_x = null;
        }
        va.field_D = (param0 & 13) >> 381048994;
        if (2 < ol.field_B) {
            ol.field_B = 2;
        }
        if ((va.field_D ^ -1) < -3) {
            va.field_D = 2;
        }
        cd.field_c = param0 & 3;
        if (!(cd.field_c <= 2)) {
            cd.field_c = 2;
        }
    }

    public static void g(int param0) {
        field_v = null;
        field_u = null;
        field_x = null;
        if (param0 != 31343) {
            return;
        }
        field_y = null;
    }

    im() {
    }

    final static int a(int param0, byte[] param1, int param2, int param3) {
        int var5 = 0;
        int var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var4 = -1;
        for (var5 = param2; var5 < param0; var5++) {
            var4 = var4 >>> -1115217432 ^ field_u[(param1[var5] ^ var4) & 255];
        }
        var4 = var4 ^ -1;
        if (param3 != -8779) {
            return -54;
        }
        return var4;
    }

    final static String a(int param0, String param1) {
        String var2 = null;
        String[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = param1;
        var3 = dj.a(14, ':', var2.substring(var2.indexOf('=') + 1));
        if (param0 > 88) {
          var4 = 0;
          L0: while (true) {
            if (var4 >= var3.length) {
              return "done.";
            } else {
              if (-1 == (var4 % 2 ^ -1)) {
                ah.field_a.a(119, Integer.parseInt(var3[var4]), var4 / 2);
                var4++;
                continue L0;
              } else {
                ah.field_a.a(var4 / 2, Integer.parseInt(var3[var4]), (byte) -128);
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_u = new int[256];
        var1 = 0;
        L0: while (true) {
          if (-257 >= (var1 ^ -1)) {
            field_v = new sn[19];
          } else {
            var0 = var1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 8) {
                field_u[var1] = var0;
                var1++;
                continue L0;
              } else {
                if (1 == (1 & var0)) {
                  var0 = -306674912 ^ var0 >>> -2097194463;
                  var2++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1;
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
