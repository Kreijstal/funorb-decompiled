/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wda extends rqa {
    static String field_r;
    static int field_q;
    static int field_p;
    static int field_s;
    static kba field_o;

    final nc a(nc[] param0, int param1) {
        hb.a((String) param0[0].field_b, 32);
        if (param1 > -119) {
            return null;
        }
        return new nc((Object) (Object) "void");
    }

    final static void a(rsb param0, int param1, lta param2, byte param3, lbb param4) {
        bba[] var6 = null;
        int var7 = 0;
        bba var8 = null;
        wm[] var9 = null;
        rna[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        una var13 = null;
        var12 = VoidHunters.field_G;
        if (param3 <= 0) {
          L0: {
            chb.a(0);
            var13 = param0.field_g.e(0);
            if (var13 != null) {
              var6 = var13.b(1);
              if (var6 != null) {
                var7 = 0;
                L1: while (true) {
                  if (var7 >= var6.length) {
                    break L0;
                  } else {
                    var8 = var6[var7];
                    var9 = var8.a((byte) -126);
                    var10 = var8.c((byte) -42);
                    if (var9 != null) {
                      if (var10 != null) {
                        var11 = ada.a(param0, param4, false, var10);
                        if ((var11 ^ -1) <= -1) {
                          if (var11 < glb.field_c.length) {
                            aba.a(param4, var9, param2, var11, (byte) 51, param1, param0);
                            var7++;
                            continue L1;
                          } else {
                            var7++;
                            continue L1;
                          }
                        } else {
                          var7++;
                          continue L1;
                        }
                      } else {
                        var7++;
                        continue L1;
                      }
                    } else {
                      var7++;
                      continue L1;
                    }
                  }
                }
              } else {
                break L0;
              }
            } else {
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void e(byte param0) {
        if (param0 >= -16) {
            field_r = null;
        }
        field_o = null;
        field_r = null;
    }

    wda(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "As a team, reach a total size of 100 components to win";
        field_p = 80;
        field_s = 0;
        field_q = 5;
        field_o = new kba();
    }
}
