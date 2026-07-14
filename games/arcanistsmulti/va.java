/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va implements pf {
    static String field_a;
    static eg field_c;
    static String field_b;
    static String field_d;
    static String field_e;

    public final void a(qm param0, int param1, int param2, int param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = ArcanistsMulti.field_G ? 1 : 0;
        var6 = 0;
        L0: while (true) {
          if (var6 > param0.field_k) {
            if (param1 == 5592405) {
              var6 = 1;
              L1: while (true) {
                if (5 < var6) {
                  return;
                } else {
                  L2: {
                    var7 = var6 + (-5 + -(param0.field_v >> -1245424703) + (param0.field_n + param2) - -param0.field_v);
                    var8 = (param0.field_v >> -687975071) + -(var6 * 2);
                    var9 = var6 + (param3 + param0.field_j - -(-4 + param0.field_k >> 1006381601));
                    if (var9 < de.field_c) {
                      break L2;
                    } else {
                      if (var9 >= de.field_k) {
                        break L2;
                      } else {
                        L3: {
                          if (var7 <= de.field_i) {
                            break L3;
                          } else {
                            de.field_l[-1 + (de.field_e * var9 + var7)] = dg.a(16711422, de.field_l[de.field_e * var9 + var7 + -1]) >> 782918177;
                            break L3;
                          }
                        }
                        if (de.field_h > var8 + var7) {
                          de.field_l[var9 * de.field_e - -var7 + var8] = dg.a(16711422, de.field_l[de.field_e * var9 + var7 + var8]) >> 1028993697;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  de.f(var7, var9, var8, 0);
                  var6++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          } else {
            var7 = 48 * var6 / param0.field_k + 152;
            var8 = var7 | (var7 << 1592779048 | var7 << 1985315888);
            de.f(param0.field_n + param2, param3 - (-param0.field_j - var6), param0.field_v, var8);
            var6++;
            continue L0;
          }
        }
    }

    final static boolean a(long param0, int param1, int[] param2, String param3, int param4) {
        if (!wj.a(param3, param2, param4, 2, param0)) {
            return false;
        }
        if (param4 == param1) {
            param4 = 0;
        }
        nj.field_c = param4;
        so.field_p = param3;
        CharSequence var7 = (CharSequence) (Object) param3;
        ua.field_S = gk.a(var7, param1 ^ -14);
        gg.field_e = param0;
        ij var6 = ff.a(param2, 49, gl.field_c, mj.field_z, ab.field_p);
        ag.a(var6, (byte) -104);
        return true;
    }

    public static void a(int param0) {
        field_c = null;
        field_e = null;
        if (param0 < 110) {
            field_a = null;
        }
        field_a = null;
        field_d = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "  If you don't like playing Team Games, just select the <col=ffffff>Free-For-All</col> button on the game creation screen.";
        field_b = "Imps can use the Self Destruct spell. This spell causes the Imp to explode, damaging anything nearby - the more health the Imp has, the more damage the explosion causes. It also has the effect of healing any other imps caught in the blast, which can lead to some very dangerous Imps...<br>Select an Imp's Self Destruct spell";
        field_d = "Only show private chat from my friends and opponents";
    }
}
