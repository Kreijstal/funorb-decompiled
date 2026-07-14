/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg implements qk {
    private int field_d;
    private mi field_b;
    static String field_i;
    private int field_k;
    static String field_g;
    private int field_c;
    static wk[] field_f;
    private int field_e;
    static String field_o;
    static String field_l;
    static boolean[][] field_j;
    private int field_m;
    static int field_a;
    static je field_n;
    private int field_h;
    static String field_p;

    final static void a(byte param0) {
        int var1 = 45 / ((param0 - 70) / 41);
        tc.a((byte) -113);
        hc.a(4, 0);
    }

    final static int a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = SteelSentinels.field_G;
        var2 = param1;
        if (96 != var2) {
          if (var2 != 97) {
            if (var2 != 98) {
              if (-100 != (var2 ^ -1)) {
                if (100 != var2) {
                  if (102 != var2) {
                    if (103 != var2) {
                      if (var2 != 104) {
                        if ((var2 ^ -1) != -106) {
                          if (var2 != 106) {
                            if (param0 != -60) {
                              return 104;
                            } else {
                              return -1;
                            }
                          } else {
                            return 93;
                          }
                        } else {
                          return 89;
                        }
                      } else {
                        return 85;
                      }
                    } else {
                      return 80;
                    }
                  } else {
                    return 76;
                  }
                } else {
                  return 70;
                }
              } else {
                return 66;
              }
            } else {
              return 58;
            }
          } else {
            return 56;
          }
        } else {
          return 2;
        }
    }

    public static void b(byte param0) {
        field_f = null;
        field_n = null;
        field_o = null;
        field_g = null;
        if (param0 != 105) {
          field_i = null;
          field_i = null;
          field_j = null;
          field_l = null;
          field_p = null;
          return;
        } else {
          field_i = null;
          field_j = null;
          field_l = null;
          field_p = null;
          return;
        }
    }

    public final void a(int param0, lh param1, byte param2, boolean param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        um var12 = null;
        lh stackIn_3_0 = null;
        lh stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          var11 = SteelSentinels.field_G;
          if (param1 instanceof um) {
            stackOut_2_0 = (lh) param1;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (lh) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var12 = (um) (Object) stackIn_3_0;
          pb.a(param0 + param1.field_o, param1.field_z + param4, param1.field_x, param1.field_E, ((qg) this).field_m);
          if (var12 != null) {
            break L1;
          } else {
            break L1;
          }
        }
        var7 = -(2 * var12.field_Y) + param1.field_x;
        var8 = var12.field_Y + (param1.field_o + param0);
        var9 = var12.field_ab + (param1.field_z + param4);
        pb.d(var8, var9, var7 + var8, var9, ((qg) this).field_k);
        var10 = -1 + var12.h(24129);
        L2: while (true) {
          if (-1 < (var10 ^ -1)) {
            L3: {
              if (null != ((qg) this).field_b) {
                ((qg) this).field_b.a(var12.field_y, var8 - -(var7 / 2), var12.field_ab + ((qg) this).field_b.field_W + var9, ((qg) this).field_e, ((qg) this).field_d);
                break L3;
              } else {
                break L3;
              }
            }
            if (param2 != -30) {
              field_o = null;
              return;
            } else {
              return;
            }
          } else {
            pb.e(var8 + var7 * var12.a(var10, -128) / var12.g((byte) 64), var9, ((qg) this).field_c, ((qg) this).field_h);
            var10--;
            continue L2;
          }
        }
    }

    qg(mi param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((qg) this).field_e = param1;
        ((qg) this).field_h = param6;
        ((qg) this).field_k = param3;
        ((qg) this).field_d = param2;
        ((qg) this).field_m = param4;
        ((qg) this).field_b = param0;
        ((qg) this).field_c = param5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Your rating is <%0>";
        field_l = "COMPONENTS:";
        field_j = new boolean[][]{null, new boolean[3], new boolean[6]};
        field_i = "Add friend";
        field_o = "We have scanned the <%0> you managed to destroy and succeeded in reverse engineering it. You may now select this chassis in the 'Configuration' screen.";
        field_p = "Training";
    }
}
