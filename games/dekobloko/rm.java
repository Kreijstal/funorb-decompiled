/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rm {
    static long field_c;
    static ui field_b;
    static ck[] field_a;

    final static boolean a(int param0, int param1, byte param2, int param3) {
        int var4 = 0;
        var4 = -27 % ((-37 - param2) / 37);
        if (!wc.field_n) {
          if (jh.field_h) {
            return tl.b(param0, 102, param3);
          } else {
            if (!dc.a(param3, param0, 6774)) {
              if (wl.field_p) {
                return false;
              } else {
                return nm.a(param1, 1, param3);
              }
            } else {
              return true;
            }
          }
        } else {
          return bc.field_E.a(wh.field_c, el.field_G, (byte) 126);
        }
    }

    final static void a(byte param0, String param1) {
        vh.field_f = param1;
        if (param0 != 73) {
            field_a = null;
        }
    }

    final static void a(int param0, ck[] param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = client.field_A ? 1 : 0;
        if (param1 != null) {
          if (-1 > (param3 ^ -1)) {
            var6 = param1[0].field_K;
            var7 = param1[2].field_K;
            var8 = param1[1].field_K;
            param1[0].a(param2, param0, param4);
            param1[2].a(-var7 + param2 - -param3, param0, param4);
            hk.b(kh.field_e);
            hk.f(var6 + param2, param0, -var7 + (param3 + param2), param1[1].field_C + param0);
            var9 = param2 + var6;
            var10 = param3 + param2 - var7;
            if (param5 >= -98) {
              field_a = null;
              param2 = var9;
              L0: while (true) {
                if (param2 >= var10) {
                  hk.a(kh.field_e);
                  return;
                } else {
                  param1[1].a(param2, param0, param4);
                  param2 = param2 + var8;
                  continue L0;
                }
              }
            } else {
              param2 = var9;
              L1: while (true) {
                if (param2 >= var10) {
                  hk.a(kh.field_e);
                  return;
                } else {
                  param1[1].a(param2, param0, param4);
                  param2 = param2 + var8;
                  continue L1;
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != 2) {
            field_c = 40L;
            field_a = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_b = null;
    }

    static {
    }
}
