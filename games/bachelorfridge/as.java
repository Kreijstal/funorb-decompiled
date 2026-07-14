/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class as {
    static String field_b;
    static kv[] field_a;

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        if (param0 < 117) {
            field_b = null;
        }
    }

    final static short[] a(short[] param0, int param1, pf param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = BachelorFridge.field_y;
        var4 = param2.d(param3, (byte) -125);
        if (0 != var4) {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param0.length != var4) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            param0 = new short[var4];
            break L0;
          }
          L2: {
            var5 = param2.d(4, (byte) 102);
            var6 = (short)param2.d(16, (byte) 115);
            if (param1 > 58) {
              break L2;
            } else {
              field_b = null;
              break L2;
            }
          }
          L3: {
            if (0 < var5) {
              var7 = 0;
              L4: while (true) {
                if (var7 >= var4) {
                  break L3;
                } else {
                  param0[var7] = (short)(var6 + param2.d(var5, (byte) 65));
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
                  param0[var7] = (short)var6;
                  var7++;
                  continue L5;
                }
              }
            }
          }
          return param0;
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Cancel unrated rematch";
    }
}
