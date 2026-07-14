/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lqb extends rqa {
    static int[][] field_o;

    final static String a(int param0, String param1) {
        int var2 = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var6 = VoidHunters.field_G;
          if (param1 != null) {
            stackOut_2_0 = param1.length();
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 0;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var2 = stackIn_3_0;
        if (var2 == 0) {
          return param1;
        } else {
          var8 = new char[var2];
          var7 = var8;
          var3 = var7;
          var4 = 0;
          var5 = 0;
          L1: while (true) {
            if (var2 <= var5) {
              if (param0 != -1) {
                field_o = null;
                return new String(var8);
              } else {
                return new String(var8);
              }
            } else {
              var3[var5] = param1.charAt(var5);
              if (60 != var8[var5]) {
                L2: {
                  if (62 != var8[var5]) {
                    break L2;
                  } else {
                    if (-1 <= (var4 ^ -1)) {
                      break L2;
                    } else {
                      var4--;
                      var5++;
                      var5++;
                      continue L1;
                    }
                  }
                }
                if (var4 == 0) {
                  var3[var5] = Character.toUpperCase(var8[var5]);
                  var5++;
                  continue L1;
                } else {
                  var5++;
                  var5++;
                  continue L1;
                }
              } else {
                var4++;
                var5++;
                var5++;
                continue L1;
              }
            }
          }
        }
    }

    lqb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 < 101) {
            lqb.a(-22);
        }
    }

    final nc a(nc[] param0, int param1) {
        si.a(47, 62, param0[0].a(109));
        if (param1 > -119) {
          lqb.a(115);
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new int[][]{new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2]};
    }
}
