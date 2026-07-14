/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl extends oh {
    int[] field_i;
    int field_r;
    int field_o;
    static int field_n;
    static gq field_p;
    int field_l;
    int field_h;
    int field_j;
    int field_k;
    static String[] field_q;
    static String field_m;

    final void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7) {
        ((cl) this).field_r = param6;
        ((cl) this).field_i = param2;
        ((cl) this).field_j = param7;
        ((cl) this).field_h = param4;
        ((cl) this).field_k = param3;
        ((cl) this).field_o = param0;
        ((cl) this).field_l = param1;
        if (param5 != 5) {
            field_q = null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        var16 = ShatteredPlansClient.field_F ? 1 : 0;
        var9 = 0;
        L0: while (true) {
          if (var9 >= param4) {
            L1: {
              gf.f(param8 + param0, param7, -param8 + param3, 16777215);
              gf.f(param0, param4 + (param7 + -1), 1 + -param8 + param3, 16777215);
              if (param2 == -22466) {
                break L1;
              } else {
                cl.a(73, -126, -112, 94, -98, 98, 92, 119, -99);
                break L1;
              }
            }
            var9 = 1;
            L2: while (true) {
              if (var9 >= -1 + param4) {
                return;
              } else {
                L3: {
                  var10 = param7 - -var9;
                  var11 = (var9 + -1) * 256 / (param4 + -2);
                  if (var9 >= 2) {
                    stackOut_15_0 = ui.a(param6, param1, param2 + 22363, var11);
                    stackIn_16_0 = stackOut_15_0;
                    break L3;
                  } else {
                    stackOut_14_0 = param5;
                    stackIn_16_0 = stackOut_14_0;
                    break L3;
                  }
                }
                L4: {
                  var12 = stackIn_16_0;
                  var13 = param8 + -var9;
                  if (var13 < 0) {
                    var13 = 0;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  var14 = -param8 + (param4 + param3 - var9);
                  if (var14 > param3) {
                    var14 = param3;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var15 = var14 + -var13;
                var13 = var13 + param0;
                var14 = var14 + param0;
                gf.a(var13, var10, 16777215);
                gf.f(1 + var13, var10, var15 + -4, var12);
                gf.f(-4 + var14, var10, 3, param5);
                gf.a(var14 + -1, var10, 16777215);
                var9++;
                continue L2;
              }
            }
          } else {
            L6: {
              var10 = var9 + param7;
              var11 = param8 + -var9;
              if (-1 < (var11 ^ -1)) {
                var11 = 0;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              var12 = -var9 + (param3 + param4) - param8;
              if (param3 < var12) {
                var12 = param3;
                break L7;
              } else {
                break L7;
              }
            }
            var13 = var12 + -var11;
            var11 = var11 + param0;
            var12 = var12 + param0;
            gf.f(5 + var11, 5 + var10, var13, 0, 128);
            var9++;
            continue L0;
          }
        }
    }

    public static void a(int param0) {
        field_p = null;
        field_q = null;
        if (param0 != 16777215) {
            cl.a(-104);
        }
        field_m = null;
    }

    cl() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_p = new gq(6, 0, 4, 2);
        field_m = "Objective";
    }
}
