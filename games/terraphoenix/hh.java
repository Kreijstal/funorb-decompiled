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

    public static void a() {
        field_l = null;
        field_p = null;
        field_k = null;
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
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException decompiledCaughtException = null;
        var13 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if (~l.field_b >= ~param3) {
                break L1;
              } else {
                param0 = param0 - (l.field_b + -param3);
                param3 = l.field_b;
                break L1;
              }
            }
            L2: {
              if (~param5 <= ~l.field_d) {
                break L2;
              } else {
                param2 = param2 - (-param5 + l.field_d);
                param5 = l.field_d;
                break L2;
              }
            }
            L3: {
              var6_int = -100 / ((72 - param1) / 38);
              if (param0 + param3 <= l.field_f) {
                break L3;
              } else {
                param0 = -param3 + l.field_f;
                break L3;
              }
            }
            L4: {
              if (~(param2 + param5) >= ~l.field_c) {
                break L4;
              } else {
                param2 = -param5 + l.field_c;
                break L4;
              }
            }
            L5: {
              if (param0 <= 0) {
                break L5;
              } else {
                if (param2 > 0) {
                  var7 = param3 - -(param5 * l.field_k);
                  var8 = -param0 + l.field_k;
                  param5 = -param2;
                  L6: while (true) {
                    if (param5 >= 0) {
                      break L0;
                    } else {
                      param3 = -param0;
                      L7: while (true) {
                        if (param3 >= 0) {
                          var7 = var7 + var8;
                          param5++;
                          continue L6;
                        } else {
                          L8: {
                            var9 = l.field_i[var7];
                            if (64 >= (255 & var9 >> 8)) {
                              break L8;
                            } else {
                              if (~((65280 & var9) >> 8) > ~(var9 >> 16 & 255)) {
                                break L8;
                              } else {
                                L9: {
                                  var10 = (var9 >> 15 & 510) + -60;
                                  if (var10 > 255) {
                                    var10 = 255;
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                                var11 = 65280 & var9;
                                var11 = -(var11 >> 5) + (var11 >> 1) & 65280;
                                var12 = 31 & var9 >> 3;
                                l.field_i[var7] = ei.b(var12, ei.b(var10 << 16, var11));
                                break L8;
                              }
                            }
                          }
                          var7++;
                          param3++;
                          continue L7;
                        }
                      }
                    }
                  }
                } else {
                  break L5;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var6, "hh.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + 64 + ',' + param5 + ')');
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
