/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj extends wl {
    static db[] field_k;
    int field_l;
    int field_o;
    String[][] field_n;
    long[][] field_q;
    int field_j;
    int[][] field_i;
    boolean field_m;
    static int field_r;
    static String field_p;

    public static void a(int param0) {
        field_k = null;
        field_p = null;
        if (param0 >= -86) {
            nj.a(-51);
        }
    }

    final static void a(int param0, String param1, int param2) {
        int var3 = 0;
        Object var4 = null;
        cf.field_i = false;
        lc.field_d = false;
        if (null != aa.field_lb) {
          if (aa.field_lb.field_H) {
            L0: {
              var3 = 1;
              if ((param2 ^ -1) != -9) {
                break L0;
              } else {
                L1: {
                  if (wi.field_J) {
                    param1 = i.field_f;
                    break L1;
                  } else {
                    param1 = fc.field_a;
                    break L1;
                  }
                }
                param2 = 2;
                r.field_b.a(param0 + 5980, rg.field_S);
                break L0;
              }
            }
            L2: {
              if ((param2 ^ -1) != -11) {
                break L2;
              } else {
                var3 = 0;
                ie.a(-3870);
                break L2;
              }
            }
            L3: {
              if (var3 != 0) {
                L4: {
                  if (!lc.field_d) {
                    break L4;
                  } else {
                    param1 = di.a(new String[1], (byte) 84, ca.field_d);
                    break L4;
                  }
                }
                L5: {
                  if (ga.field_a) {
                    param1 = ca.field_g;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                aa.field_lb.a(param1, 57, param2);
                break L3;
              } else {
                break L3;
              }
            }
            L6: {
              if (-257 == (param2 ^ -1)) {
                break L6;
              } else {
                if (10 != param2) {
                  if (!wi.field_J) {
                    r.field_b.h(-71);
                    break L6;
                  } else {
                    if (param0 != 10) {
                      var4 = null;
                      nj.a(-77, (String) null, 102);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  if (param0 != 10) {
                    var4 = null;
                    nj.a(-77, (String) null, 102);
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
            if (param0 != 10) {
              var4 = null;
              nj.a(-77, (String) null, 102);
              return;
            } else {
              return;
            }
          } else {
            if (param0 != 10) {
              var4 = null;
              nj.a(-77, (String) null, 102);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 != 10) {
            var4 = null;
            nj.a(-77, (String) null, 102);
            return;
          } else {
            return;
          }
        }
    }

    nj() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = 255;
        field_p = "World-Stage";
    }
}
