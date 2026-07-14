/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh extends da {
    int field_j;
    static int field_k;
    static int field_m;
    static ne field_p;
    static int field_o;
    static int field_l;
    byte[] field_i;
    static int field_n;

    final static boolean a(int param0, int param1, int[] param2, int param3, qe param4) {
        qe var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        qe var14 = null;
        qe var15 = null;
        qe var16 = null;
        if (param1 == -30917) {
          if (param2[param3] >= 0) {
            if (ea.field_g.length > param2[param3]) {
              var16 = ea.field_g[param2[param3]];
              var14 = var16;
              var5 = var14;
              if (var5 != param4) {
                if (var5 != null) {
                  var6 = var16.field_e;
                  var7 = -var16.field_w + var16.field_z;
                  var8 = var16.field_I;
                  var9 = var16.field_w;
                  var10 = param4.field_e;
                  var11 = -param4.field_w + param4.field_z;
                  var12 = param4.field_I;
                  var13 = param4.field_w;
                  if (!o.a(var13, var7, var12, var8, var9, var10, var6, (byte) 9, var11)) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          field_o = 49;
          if (param2[param3] >= 0) {
            if (ea.field_g.length > param2[param3]) {
              var15 = ea.field_g[param2[param3]];
              var14 = var15;
              var5 = var14;
              if (var5 != param4) {
                if (var5 != null) {
                  var6 = var15.field_e;
                  var7 = -var15.field_w + var15.field_z;
                  var8 = var15.field_I;
                  var9 = var15.field_w;
                  var10 = param4.field_e;
                  var11 = -param4.field_w + param4.field_z;
                  var12 = param4.field_I;
                  var13 = param4.field_w;
                  if (!o.a(var13, var7, var12, var8, var9, var10, var6, (byte) 9, var11)) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final static boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 50) {
          L0: {
            field_o = 9;
            if (-251 <= jc.field_c) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-251 >= jc.field_c) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void c(byte param0) {
        field_p = null;
        if (param0 != 121) {
            Object var2 = null;
            boolean discarded$0 = eh.a(65, 6, (int[]) null, 124, (qe) null);
        }
    }

    final static void b(byte param0) {
        if (param0 >= -45) {
            field_l = -119;
            pf.field_d = new sl();
            return;
        }
        pf.field_d = new sl();
    }

    eh(byte[] param0) {
        ((eh) this).field_i = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        o.a(28, 50);
        field_n = 0;
    }
}
