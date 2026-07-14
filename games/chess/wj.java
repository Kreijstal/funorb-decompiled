/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj implements jm {
    private lh field_a;
    static rh field_c;
    static int[] field_d;
    private int field_b;
    static String field_e;
    private int field_f;
    static ci field_g;

    final static void a(le param0, int param1, int param2, le param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, lh param11, int param12, le param13, int param14, int param15, int param16, int param17, lh param18, int param19, int param20) {
        cg.a(0, param17, param11, param18);
        g.a((byte) -81, param2, param10, param4, param9);
        di.a(param12, -121, param6);
        gi.a(param15, param0, param19, false, param13, param8);
        int var21 = -109 % ((param14 - -27) / 45);
        td.a(param3, param1, param20, 200);
        fd.a(param7, 7, param5, param16);
    }

    public final void a(byte param0, int param1, int param2, boolean param3, mf param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_24_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_23_0 = 0;
        var11 = Chess.field_G;
        if (param0 >= 58) {
          L0: {
            if (param4.field_w) {
              stackOut_22_0 = 3249872;
              stackIn_24_0 = stackOut_22_0;
              break L0;
            } else {
              if (!param4.d((byte) -67)) {
                stackOut_23_0 = 2188450;
                stackIn_24_0 = stackOut_23_0;
                break L0;
              } else {
                var6 = 3249872;
                int discarded$2 = ((wj) this).field_a.a("<u=" + Integer.toString(var6, 16) + ">" + param4.field_v + "</u>", param1 + param4.field_u, param2 + param4.field_r, param4.field_y, param4.field_C, var6, -1, ((wj) this).field_b, ((wj) this).field_f, ((wj) this).field_a.field_t + ((wj) this).field_a.field_C);
                if (param4.d((byte) -67)) {
                  L1: {
                    var7 = ((wj) this).field_a.b(param4.field_v);
                    var8 = ((wj) this).field_a.field_C + ((wj) this).field_a.field_t;
                    var9 = param1 + param4.field_u;
                    if (((wj) this).field_b == 2) {
                      var9 = var9 + (-var7 + param4.field_y);
                      break L1;
                    } else {
                      if ((((wj) this).field_b ^ -1) != -2) {
                        break L1;
                      } else {
                        var9 = var9 + (param4.field_y + -var7 >> -1530812543);
                        var10 = param4.field_r + param2;
                        if (((wj) this).field_f != -3) {
                          if (-2 == ((wj) this).field_f) {
                            var10 = var10 + (-var8 + param4.field_C >> 1088572577);
                            rc.a(var8, false, -2 + var9, 4 + var7, 2 + var10);
                            return;
                          } else {
                            rc.a(var8, false, -2 + var9, 4 + var7, 2 + var10);
                            return;
                          }
                        } else {
                          var10 = var10 + (-var8 + param4.field_C);
                          rc.a(var8, false, -2 + var9, 4 + var7, 2 + var10);
                          return;
                        }
                      }
                    }
                  }
                  var10 = param4.field_r + param2;
                  if (((wj) this).field_f != -3) {
                    if (-2 == ((wj) this).field_f) {
                      var10 = var10 + (-var8 + param4.field_C >> 1088572577);
                      rc.a(var8, false, -2 + var9, 4 + var7, 2 + var10);
                      return;
                    } else {
                      rc.a(var8, false, -2 + var9, 4 + var7, 2 + var10);
                      return;
                    }
                  } else {
                    var10 = var10 + (-var8 + param4.field_C);
                    rc.a(var8, false, -2 + var9, 4 + var7, 2 + var10);
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
          var6 = stackIn_24_0;
          int discarded$3 = ((wj) this).field_a.a("<u=" + Integer.toString(var6, 16) + ">" + param4.field_v + "</u>", param1 + param4.field_u, param2 + param4.field_r, param4.field_y, param4.field_C, var6, -1, ((wj) this).field_b, ((wj) this).field_f, ((wj) this).field_a.field_t + ((wj) this).field_a.field_C);
          if (param4.d((byte) -67)) {
            L2: {
              var7 = ((wj) this).field_a.b(param4.field_v);
              var8 = ((wj) this).field_a.field_C + ((wj) this).field_a.field_t;
              var9 = param1 + param4.field_u;
              if (((wj) this).field_b == 2) {
                var9 = var9 + (-var7 + param4.field_y);
                break L2;
              } else {
                if ((((wj) this).field_b ^ -1) != -2) {
                  break L2;
                } else {
                  var9 = var9 + (param4.field_y + -var7 >> -1530812543);
                  var10 = param4.field_r + param2;
                  if (((wj) this).field_f != -3) {
                    if (-2 == ((wj) this).field_f) {
                      var10 = var10 + (-var8 + param4.field_C >> 1088572577);
                      rc.a(var8, false, -2 + var9, 4 + var7, 2 + var10);
                      return;
                    } else {
                      rc.a(var8, false, -2 + var9, 4 + var7, 2 + var10);
                      return;
                    }
                  } else {
                    var10 = var10 + (-var8 + param4.field_C);
                    rc.a(var8, false, -2 + var9, 4 + var7, 2 + var10);
                    return;
                  }
                }
              }
            }
            var10 = param4.field_r + param2;
            if (((wj) this).field_f != -3) {
              if (-2 == ((wj) this).field_f) {
                var10 = var10 + (-var8 + param4.field_C >> 1088572577);
                rc.a(var8, false, -2 + var9, 4 + var7, 2 + var10);
                return;
              } else {
                rc.a(var8, false, -2 + var9, 4 + var7, 2 + var10);
                return;
              }
            } else {
              var10 = var10 + (-var8 + param4.field_C);
              rc.a(var8, false, -2 + var9, 4 + var7, 2 + var10);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != -3) {
            return;
        }
        field_e = null;
        field_d = null;
        field_c = null;
        field_g = null;
    }

    public wj() {
        ((wj) this).field_b = 1;
        ((wj) this).field_a = rb.field_b;
        ((wj) this).field_f = 1;
    }

    wj(lh param0, int param1, int param2) {
        ((wj) this).field_b = param1;
        ((wj) this).field_f = param2;
        ((wj) this).field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[8192];
        field_e = "black";
    }
}
