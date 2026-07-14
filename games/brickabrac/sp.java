/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sp extends nm {
    int field_j;
    static int field_l;
    int field_n;
    long field_p;
    static String field_s;
    int field_m;
    int field_q;
    int field_k;
    int field_r;
    int[] field_i;
    int field_o;

    public static void a(int param0) {
        field_s = null;
        if (param0 != -241) {
            field_l = -95;
        }
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int[] param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        L0: {
          var14 = BrickABrac.field_J ? 1 : 0;
          if (param7 == -1) {
            break L0;
          } else {
            sp.a(-117);
            break L0;
          }
        }
        var12 = -param4;
        L1: while (true) {
          if (-1 >= var12) {
            return;
          } else {
            var13 = -param6;
            L2: while (true) {
              if (var13 >= 0) {
                param3 = param3 + param5;
                param8 = param8 + param1;
                var12++;
                continue L1;
              } else {
                param3++;
                param2 = param9[param3] & 255;
                if (param2 != 0) {
                  if (-241 >= param2) {
                    var11 = 255 & param2;
                    var10 = param0[param8];
                    param8++;
                    param0[param8] = ud.d(ik.a(var11 * ik.a(var10, 65280) >> 1305355080, 65280), ud.d(ik.a(-16777216, var10), ik.a(16711935, ik.a(var10, 16711935) * var11 >> 1370804936)));
                    var13++;
                    continue L2;
                  } else {
                    param8++;
                    var13++;
                    continue L2;
                  }
                } else {
                  param8++;
                  var13++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    sp(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        ((sp) this).field_o = param0;
        ((sp) this).field_n = param3;
        ((sp) this).field_r = param4;
        ((sp) this).field_j = param5;
        ((sp) this).field_k = param2;
        ((sp) this).field_q = param1;
        ((sp) this).field_i = param6;
        qf.field_Cb = qf.field_Cb + 1;
        ((sp) this).field_m = 65535 & qf.field_Cb;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = 0;
        field_s = "Off";
    }
}
