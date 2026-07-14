/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk extends rqa {
    static oe field_o;
    static String field_p;

    final nc a(nc[] param0, int param1) {
        oaa.field_i = param0[0].a(8);
        if (param1 >= -119) {
            return null;
        }
        return new nc((Object) (Object) "void");
    }

    final static ij a(ij param0, ij param1, int param2, dja param3, int param4) {
        int var5 = 0;
        int var6_int = 0;
        tv var6 = null;
        int var7 = 0;
        tv var8 = null;
        int var9 = 0;
        tv var10 = null;
        tv var11 = null;
        int var12 = 0;
        var12 = VoidHunters.field_G;
        if (param1 != null) {
          L0: {
            if (param0 == null) {
              param0 = new ij();
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            var5 = param1.c(3) + -param0.c(3);
            if ((var5 ^ -1) < -1) {
              var6_int = 0;
              L2: while (true) {
                if (var5 <= var6_int) {
                  break L1;
                } else {
                  param0.b(-10258, (ksa) (Object) param3.a((byte) 6));
                  var6_int++;
                  continue L2;
                }
              }
            } else {
              if ((var5 ^ -1) > -1) {
                var5 = -var5;
                var6_int = 0;
                L3: while (true) {
                  if (var6_int >= var5) {
                    break L1;
                  } else {
                    ksa discarded$1 = param0.c((byte) -104);
                    var6_int++;
                    continue L3;
                  }
                }
              } else {
                break L1;
              }
            }
          }
          var6 = (tv) (Object) param0.d(0);
          var7 = 80 / ((param4 - -6) / 48);
          var8 = (tv) (Object) param1.d(0);
          L4: while (true) {
            if (var8 == null) {
              return param0;
            } else {
              L5: {
                var9 = param2;
                var10 = var8;
                var11 = var8;
                if (-2 != var9) {
                  if (-3 == var9) {
                    ((tva) (Object) var10).a(var11, 29106);
                    break L5;
                  } else {
                    if (var9 == 3) {
                      ((sjb) (Object) var10).a(var11, (byte) 39);
                      break L5;
                    } else {
                      var6 = (tv) (Object) param0.a((byte) 94);
                      var8 = (tv) (Object) param1.a((byte) 116);
                      continue L4;
                    }
                  }
                } else {
                  var10.b((byte) 105, var11);
                  break L5;
                }
              }
              var6 = (tv) (Object) param0.a((byte) 94);
              var8 = (tv) (Object) param1.a((byte) 116);
              continue L4;
            }
          }
        } else {
          return null;
        }
    }

    public static void e(byte param0) {
        field_o = null;
        field_p = null;
        if (param0 <= 94) {
            Object var2 = null;
            ij discarded$0 = kk.a((ij) null, (ij) null, 83, (dja) null, 17);
        }
    }

    kk(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Fighters";
        field_o = new oe();
    }
}
