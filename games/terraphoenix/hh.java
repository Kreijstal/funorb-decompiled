/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh extends uf {
    static String field_l;
    static String field_p;
    int field_h;
    hh field_j;
    int field_q;
    int field_n;
    int field_o;
    int field_i;
    static ci field_m;
    static String field_k;

    public static void a(int param0) {
        field_l = null;
        field_p = null;
        field_k = null;
        if (param0 != 255) {
            return;
        }
        field_m = null;
    }

    hh(int param0, int param1, int param2, int param3, int param4) {
        ((hh) this).field_q = param3;
        ((hh) this).field_h = param4;
        ((hh) this).field_n = param1;
        ((hh) this).field_o = param2;
        ((hh) this).field_i = param0;
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = Terraphoenix.field_V;
          if (l.field_b <= param3) {
            break L0;
          } else {
            param0 = param0 - (l.field_b + -param3);
            param3 = l.field_b;
            break L0;
          }
        }
        L1: {
          if (param5 >= l.field_d) {
            break L1;
          } else {
            param2 = param2 - (-param5 + l.field_d);
            param5 = l.field_d;
            break L1;
          }
        }
        L2: {
          var6 = -100 / ((72 - param1) / 38);
          if (param0 + param3 <= l.field_f) {
            break L2;
          } else {
            param0 = -param3 + l.field_f;
            break L2;
          }
        }
        L3: {
          if (param2 + param5 <= l.field_c) {
            break L3;
          } else {
            param2 = -param5 + l.field_c;
            break L3;
          }
        }
        L4: {
          if ((param0 ^ -1) >= -1) {
            break L4;
          } else {
            if ((param2 ^ -1) < -1) {
              var7 = param3 - -(param5 * l.field_k);
              var8 = -param0 + l.field_k;
              param5 = -param2;
              L5: while (true) {
                if (param5 <= -1) {
                  return;
                } else {
                  param3 = -param0;
                  L6: while (true) {
                    if (-1 <= param3) {
                      var7 = var7 + var8;
                      param5++;
                      continue L5;
                    } else {
                      var9 = l.field_i[var7];
                      if (param4 < (255 & var9 >> -902491064)) {
                        if ((65280 & var9) >> 819022664 >= (var9 >> -1689844400 & 255)) {
                          L7: {
                            var10 = (var9 >> -193362545 & 510) + -60;
                            if (var10 > 255) {
                              var10 = 255;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          var11 = 65280 & var9;
                          var11 = -(var11 >> 1240101317) + (var11 >> 2122417857) & 65280;
                          var12 = 31 & var9 >> 173740195;
                          l.field_i[var7] = ei.b(var12, ei.b(var10 << 265456272, var11));
                          var7++;
                          param3++;
                          continue L6;
                        } else {
                          var7++;
                          param3++;
                          continue L6;
                        }
                      } else {
                        var7++;
                        param3++;
                        continue L6;
                      }
                    }
                  }
                }
              }
            } else {
              break L4;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "P-1 PG";
        field_l = "pts";
        field_k = "Loading...";
        field_m = null;
    }
}
