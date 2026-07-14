/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg implements ir {
    private int field_e;
    static String field_c;
    private int field_d;
    private hc field_a;
    static long field_b;

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_c = null;
    }

    public final void a(boolean param0, int param1, int param2, ea param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          var11 = AceOfSkies.field_G ? 1 : 0;
          if (param1 == -7592) {
            break L0;
          } else {
            wg.a(false);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((ea) param3).field_g) {
              break L2;
            } else {
              if (param3.e(28660)) {
                break L2;
              } else {
                stackOut_4_0 = 2188450;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 3249872;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        var6 = stackIn_6_0;
        int discarded$1 = ((wg) this).field_a.a("<u=" + Integer.toString(var6, 16) + ">" + ((ea) param3).field_f + "</u>", ((ea) param3).field_p + param2, ((ea) param3).field_h + param4, ((ea) param3).field_q, ((ea) param3).field_n, var6, -1, ((wg) this).field_e, ((wg) this).field_d, ((wg) this).field_a.field_I + ((wg) this).field_a.field_D);
        if (param3.e(param1 + 36252)) {
          var7 = ((wg) this).field_a.a(((ea) param3).field_f);
          var8 = ((wg) this).field_a.field_D + ((wg) this).field_a.field_I;
          var9 = ((ea) param3).field_p + param2;
          var10 = ((ea) param3).field_h + param4;
          if (-3 != (((wg) this).field_e ^ -1)) {
            L3: {
              if (1 != ((wg) this).field_e) {
                break L3;
              } else {
                var9 = var9 + (-var7 + ((ea) param3).field_q >> 1673308225);
                break L3;
              }
            }
            if (((wg) this).field_d != 2) {
              if (1 != ((wg) this).field_d) {
                co.a(2 + var10, var8, 4 + var7, -2 + var9, 119);
                return;
              } else {
                var10 = var10 + (-var8 + ((ea) param3).field_n >> 1956029377);
                co.a(2 + var10, var8, 4 + var7, -2 + var9, 119);
                return;
              }
            } else {
              var10 = var10 + (((ea) param3).field_n + -var8);
              co.a(2 + var10, var8, 4 + var7, -2 + var9, 119);
              return;
            }
          } else {
            L4: {
              var9 = var9 + (-var7 + ((ea) param3).field_q);
              if (((wg) this).field_d != 2) {
                if (1 == ((wg) this).field_d) {
                  var10 = var10 + (-var8 + ((ea) param3).field_n >> 1956029377);
                  break L4;
                } else {
                  break L4;
                }
              } else {
                var10 = var10 + (((ea) param3).field_n + -var8);
                break L4;
              }
            }
            co.a(2 + var10, var8, 4 + var7, -2 + var9, 119);
            return;
          }
        } else {
          return;
        }
    }

    public wg() {
        ((wg) this).field_a = qo.field_b;
        ((wg) this).field_d = 1;
        ((wg) this).field_e = 1;
    }

    wg(hc param0, int param1, int param2) {
        ((wg) this).field_d = param2;
        ((wg) this).field_e = param1;
        ((wg) this).field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "gun_overheat";
    }
}
