/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud extends td {
    static String field_q;
    static int field_p;

    public static void c(boolean param0) {
        if (param0) {
            return;
        }
        field_q = null;
    }

    final ii a(op param0, int param1) {
        ica var4 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        wia var14 = null;
        aga var15 = null;
        iv var16 = null;
        int var17 = 0;
        aga var18 = null;
        int[][] var22 = null;
        L0: {
          var17 = BachelorFridge.field_y;
          var18 = ((ud) this).field_h.a(25, param0);
          var4 = new ica(((ud) this).field_g, new nq(var18));
          var4.field_q = ((ud) this).field_n;
          var4.field_s = ((ud) this).field_k;
          if (param1 == 3) {
            break L0;
          } else {
            field_p = -22;
            break L0;
          }
        }
        var22 = var4.a(param0, 0, -95, var18);
        var6 = 17;
        var7 = 17;
        var8 = var6 - 1 >> -399712671;
        var9 = -1 + var7 >> 2051560865;
        var10 = 0;
        L1: while (true) {
          if (var10 >= var6) {
            return (ii) (Object) var4;
          } else {
            var11 = 0;
            L2: while (true) {
              if (var11 >= var7) {
                var10++;
                continue L1;
              } else {
                if (1 == var22[var10][var11]) {
                  var12 = var10 - (var8 - ((ud) this).field_k);
                  var13 = -var9 + var11 + ((ud) this).field_n;
                  if (0 <= var12) {
                    if (param0.field_z > var12) {
                      if (0 <= var13) {
                        if (var13 < param0.field_B) {
                          var14 = param0.field_a[var12][var13];
                          var15 = var14.field_l;
                          if (var15 != null) {
                            var16 = new iv(new nq(var15), false, 1, 0, 53);
                            var4.field_o.a((bw) (Object) var16, true);
                            var11++;
                            continue L2;
                          } else {
                            var11++;
                            continue L2;
                          }
                        } else {
                          var11++;
                          continue L2;
                        }
                      } else {
                        var11++;
                        continue L2;
                      }
                    } else {
                      var11++;
                      continue L2;
                    }
                  } else {
                    var11++;
                    continue L2;
                  }
                } else {
                  var11++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    ud(int param0, aga param1, int param2, int param3) {
        super(param0, param1);
        ((ud) this).field_n = param3;
        ((ud) this).field_k = param2;
    }

    final static void a(java.applet.Applet param0, byte param1) {
        wn.field_p = true;
        if (param1 < 77) {
            return;
        }
        String var2 = "tuhstatbut";
        String var3 = "rvnadlm";
        long var4 = -1L;
        oc.a(param0, var2, var4, 122, var3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Allow spectators?";
    }
}
