/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj extends ok {
    static int field_Gb;

    private aj() throws Throwable {
        super(0L, (ok) null);
        throw new Error();
    }

    final static short[] a(wj param0, short[] param1, byte param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        var8 = DungeonAssault.field_K;
        var4 = param0.j(param2 ^ 116, param3);
        if (0 != var4) {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length == var4) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            param1 = new short[var4];
            break L0;
          }
          L2: {
            var5 = param0.j(84, 4);
            if (param2 == 31) {
              break L2;
            } else {
              var9 = null;
              short[] discarded$2 = aj.a((wj) null, (short[]) null, (byte) 18, -27);
              break L2;
            }
          }
          L3: {
            var6 = (short)param0.j(-93, 16);
            if (0 >= var5) {
              var7 = 0;
              L4: while (true) {
                if (var7 >= var4) {
                  break L3;
                } else {
                  param1[var7] = (short)var6;
                  var7++;
                  continue L4;
                }
              }
            } else {
              var7 = 0;
              L5: while (true) {
                if (var4 <= var7) {
                  break L3;
                } else {
                  param1[var7] = (short)(param0.j(87, var5) + var6);
                  var7++;
                  continue L5;
                }
              }
            }
          }
          return param1;
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Gb = 0;
    }
}
