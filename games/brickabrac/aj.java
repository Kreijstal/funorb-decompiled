/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj {
    static jp[][] field_c;
    static String field_b;
    static jp[][] field_a;

    public static void b(int param0) {
        int discarded$2 = 0;
        if (param0 != -789103103) {
          discarded$2 = aj.a(57, -37, 115);
          field_c = (jp[][]) null;
          field_a = (jp[][]) null;
          field_b = null;
          return;
        } else {
          field_c = (jp[][]) null;
          field_a = (jp[][]) null;
          field_b = null;
          return;
        }
    }

    final static mf a(int param0, boolean param1) {
        if (!param1) {
          field_b = (String) null;
          return go.a(false, param0, false, 1, true, true);
        } else {
          return go.a(false, param0, false, 1, true, true);
        }
    }

    final static mh a(int param0) {
        if (param0 != 1345) {
            aj.b(94);
            return rl.field_e.field_Rb;
        }
        return rl.field_e.field_Rb;
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_6_0 = 0;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var3_int = param0;
            var4 = mi.field_d;
            L1: while (true) {
              if (kn.field_E.length <= var3_int) {
                stackOut_12_0 = -1;
                stackIn_13_0 = stackOut_12_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L2: {
                  var5 = re.field_q[var3_int];
                  if (0 > var5) {
                    var4 = var4 + wh.field_m;
                    break L2;
                  } else {
                    var6 = pl.a(0, kn.field_E[var3_int], true);
                    var7 = -(var6 >> -789103103) + cc.field_J;
                    var4 = var4 + dj.field_g;
                    if (bg.a(-ek.field_lb + var7, (wg.field_f << 1214339297) + nq.field_i, (ek.field_lb << 256028001) + var6, (byte) 80, param1, param2, var4)) {
                      stackOut_6_0 = var5;
                      stackIn_7_0 = stackOut_6_0;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var4 = var4 + (dj.field_g + ((wg.field_f << -1129312959) - -nq.field_i));
                      break L2;
                    }
                  }
                }
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var3), "aj.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return stackIn_13_0;
        }
    }

    static {
        field_b = "Asking to join <%0>'s game...";
    }
}
