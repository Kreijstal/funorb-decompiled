/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ch extends td {
    static eh field_p;
    static String field_q;

    final static ee a(vr param0, int param1, String param2, String param3) {
        if (param1 != -1) {
            Object var6 = null;
            ee discarded$0 = ch.a((vr) null, -47, (String) null, (String) null);
        }
        int var4 = param0.a(param2, false);
        int var5 = param0.a((byte) 6, var4, param3);
        return aj.a(var5, var4, 0, param0);
    }

    final ii a(op param0, int param1) {
        ir var4 = null;
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
        var17 = BachelorFridge.field_y;
        var18 = ((ch) this).field_h.a(49, param0);
        var4 = new ir(((ch) this).field_g, new nq(var18));
        ((ch) this).field_k = var18.field_x;
        ((ch) this).field_n = var18.field_J;
        var22 = var4.d(9);
        var6 = 17;
        var7 = 17;
        var8 = -1 + var6 >> -1048674911;
        var9 = -1 + var7 >> 1071393921;
        if (param1 == 3) {
          var10 = 0;
          L0: while (true) {
            if (var6 <= var10) {
              return (ii) (Object) var4;
            } else {
              var11 = 0;
              L1: while (true) {
                if (var11 >= var7) {
                  var10++;
                  continue L0;
                } else {
                  if ((var22[var10][var11] ^ -1) == -2) {
                    var12 = ((ch) this).field_k + var10 + -var8;
                    var13 = var11 + -var9 + ((ch) this).field_n;
                    if (var12 >= 0) {
                      if (var12 < param0.field_z) {
                        if (0 <= var13) {
                          if (param0.field_B > var13) {
                            var14 = param0.field_a[var12][var13];
                            var15 = var14.field_l;
                            if (var15 != null) {
                              var16 = new iv(new nq(var15), false, 1, 0, 40);
                              var4.field_o.a((bw) (Object) var16, true);
                              var11++;
                              continue L1;
                            } else {
                              var11++;
                              continue L1;
                            }
                          } else {
                            var11++;
                            continue L1;
                          }
                        } else {
                          var11++;
                          continue L1;
                        }
                      } else {
                        var11++;
                        continue L1;
                      }
                    } else {
                      var11++;
                      continue L1;
                    }
                  } else {
                    var11++;
                    continue L1;
                  }
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    final static int a(byte param0, int param1) {
        String var2 = lka.field_E[param1][14];
        String var2_ref = var2.trim();
        var2_ref = var2_ref.toLowerCase();
        if (param0 != 91) {
            return -119;
        }
        if (!(!var2_ref.equals((Object) (Object) ""))) {
            return -1;
        }
        return ((ji) (Object) i.field_h.a(true, (long)var2_ref.hashCode())).field_h;
    }

    public static void c(int param0) {
        field_p = null;
        field_q = null;
        if (param0 != 14) {
            boolean discarded$0 = ch.b(56);
        }
    }

    final static boolean b(int param0) {
        if (param0 <= 63) {
            field_q = null;
        }
        return gfa.field_i;
    }

    final static rj a(boolean param0, lu param1) {
        if (param0) {
            Object var3 = null;
            rj discarded$0 = ch.a(false, (lu) null);
        }
        return new rj(param1.c((byte) -85), param1.c((byte) -85), param1.c((byte) -85), param1.c((byte) -85), param1.c((byte) -85), param1.c((byte) -85), param1.c((byte) -85), param1.c((byte) -85), param1.a(3), param1.b(16711935));
    }

    ch(int param0, aga param1) {
        super(param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Previous";
    }
}
