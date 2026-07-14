/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kcb extends rqa {
    static int field_o;
    static int field_p;

    final static tv[] a(int param0, dja param1, faa param2, int param3, int param4, tv[] param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        tv var9 = null;
        faa var10 = null;
        int var11 = 0;
        Object var12 = null;
        tv[] var13 = null;
        L0: {
          var11 = VoidHunters.field_G;
          if (param4 < -45) {
            break L0;
          } else {
            var12 = null;
            tv[] discarded$2 = kcb.a(-101, (dja) null, (faa) null, -50, 54, (tv[]) null);
            break L0;
          }
        }
        L1: {
          var6 = param2.i(0, param0);
          if (0 != var6) {
            L2: {
              L3: {
                if (param5 == null) {
                  break L3;
                } else {
                  if (param5.length == var6) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var13 = param1.a(11995, var6);
              param5 = var13;
              break L2;
            }
            var7 = 0;
            L4: while (true) {
              if (var7 >= var6) {
                break L1;
              } else {
                if (!kv.a(false, param2)) {
                  param5[var7] = null;
                  var7++;
                  continue L4;
                } else {
                  L5: {
                    if (param5[var7] != null) {
                      break L5;
                    } else {
                      param5[var7] = param1.a((byte) -122);
                      break L5;
                    }
                  }
                  L6: {
                    var8 = param3;
                    var9 = param5[var7];
                    var10 = param2;
                    if (1 != var8) {
                      break L6;
                    } else {
                      var9.a(var10, false);
                      break L6;
                    }
                  }
                  L7: {
                    if (2 != var8) {
                      break L7;
                    } else {
                      ((tva) (Object) var9).a(-81, var10);
                      break L7;
                    }
                  }
                  if (var8 == 3) {
                    ((sjb) (Object) var9).a(var10, 67);
                    var7++;
                    continue L4;
                  } else {
                    var7++;
                    continue L4;
                  }
                }
              }
            }
          } else {
            param5 = null;
            break L1;
          }
        }
        return param5;
    }

    final nc a(nc[] param0, int param1) {
        nda.field_q = param0[0].a(98);
        if (param1 >= -119) {
            return null;
        }
        return new nc((Object) (Object) "void");
    }

    kcb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 5;
        field_p = -1;
    }
}
