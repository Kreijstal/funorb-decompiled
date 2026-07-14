/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj extends ck {
    int field_o;
    static int[] field_v;
    static cm field_x;
    int field_z;
    int field_t;
    int field_w;
    static wk[] field_r;
    int field_y;
    int[] field_q;
    static int field_u;
    int field_p;
    static int field_s;

    final static boolean a(int[] param0, byte param1, int[] param2, int param3, boolean param4) {
        int[] var5_ref_int__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int[] var14 = null;
        int[] var15 = null;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        var10 = SteelSentinels.field_G;
        if (49 == param3) {
          L0: {
            L1: {
              if (!param4) {
                break L1;
              } else {
                if (!ve.a(param0, 1, 25)) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          var14 = n.field_z;
          var12 = var14;
          var11 = var12;
          var5_ref_int__ = var11;
          var6 = 0;
          L2: while (true) {
            if (var6 >= var14.length) {
              var5 = -62 / ((76 - param1) / 47);
              return false;
            } else {
              L3: {
                var7 = var14[var6];
                if (t.a(param2, var7, -20370)) {
                  break L3;
                } else {
                  if (bj.a(param2, var7, param4, (byte) 86)) {
                    break L3;
                  } else {
                    var6++;
                    continue L2;
                  }
                }
              }
              var15 = nl.a(var7, (byte) 124);
              var9 = 0;
              L4: while (true) {
                if (var9 < -8 + var15.length) {
                  if (var15[var9] != param3) {
                    var9++;
                    continue L4;
                  } else {
                    return true;
                  }
                } else {
                  var6++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    public static void d(int param0) {
        field_v = null;
        field_r = null;
        field_x = null;
        if (param0 != -1) {
            field_s = -23;
        }
    }

    final static Boolean a(boolean param0) {
        if (!param0) {
            Boolean discarded$0 = aj.a(true);
        }
        Boolean var1 = ma.field_bb;
        ma.field_bb = null;
        return var1;
    }

    final void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, byte param7) {
        ((aj) this).field_w = param6;
        ((aj) this).field_z = param2;
        if (param7 > -53) {
            ((aj) this).field_q = null;
        }
        ((aj) this).field_p = param1;
        ((aj) this).field_q = param4;
        ((aj) this).field_o = param3;
        ((aj) this).field_t = param5;
        ((aj) this).field_y = param0;
    }

    aj() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = new int[4];
        field_r = new wk[3];
        field_u = -1;
    }
}
