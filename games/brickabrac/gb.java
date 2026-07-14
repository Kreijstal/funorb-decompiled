/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb {
    int field_a;
    static int field_h;
    static int[] field_i;
    int field_o;
    int field_d;
    mh field_b;
    int[] field_g;
    static mh[] field_l;
    String field_q;
    String field_m;
    int field_c;
    String field_p;
    String field_j;
    long field_k;
    int field_f;
    static int field_n;
    boolean field_e;

    final static String a(CharSequence param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = BrickABrac.field_J ? 1 : 0;
        if (param0 != null) {
          var2 = 0;
          var3 = param0.length();
          L0: while (true) {
            L1: {
              if (var2 >= var3) {
                break L1;
              } else {
                if (!ik.a((byte) -9, param0.charAt(var2))) {
                  break L1;
                } else {
                  var2++;
                  continue L0;
                }
              }
            }
            L2: while (true) {
              L3: {
                if (var3 <= var2) {
                  break L3;
                } else {
                  if (!ik.a((byte) -9, param0.charAt(var3 - 1))) {
                    break L3;
                  } else {
                    var3--;
                    continue L2;
                  }
                }
              }
              var4 = -var2 + var3;
              if (-2 >= (var4 ^ -1)) {
                if (var4 <= 12) {
                  L4: {
                    var5 = new StringBuilder(var4);
                    if (param1 >= 46) {
                      break L4;
                    } else {
                      gb.a(-114);
                      break L4;
                    }
                  }
                  var6 = var2;
                  L5: while (true) {
                    if (var6 >= var3) {
                      if (0 != var5.length()) {
                        return var5.toString();
                      } else {
                        return null;
                      }
                    } else {
                      var7 = param0.charAt(var6);
                      if (m.a(true, (char) var7)) {
                        var8 = ah.a(207, (char) var7);
                        if (0 != var8) {
                          StringBuilder discarded$1 = var5.append(var8);
                          var6++;
                          continue L5;
                        } else {
                          var6++;
                          continue L5;
                        }
                      } else {
                        var6++;
                        continue L5;
                      }
                    }
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          return null;
        }
    }

    final int a(boolean param0) {
        if (!param0) {
            Object var3 = null;
            String discarded$0 = gb.a((CharSequence) null, -7);
        }
        if (!((gb) this).field_e) {
            // if_icmpne L49
            // if_icmplt L47
        } else {
            return 2;
        }
        if (((gb) this).field_k == oc.field_p) {
            return 1;
        }
        if (-3 == (wk.field_m ^ -1)) {
            if (nc.a(0, ((gb) this).field_m)) {
                return 1;
            }
        }
        return 0;
    }

    public static void a(int param0) {
        field_l = null;
        if (param0 != 0) {
            field_h = -77;
        }
        field_i = null;
    }

    gb(boolean param0) {
        ((gb) this).field_o = ka.field_E;
        ((gb) this).field_f = field_h;
        if (param0) {
            ((gb) this).field_g = rn.field_m;
        } else {
            ((gb) this).field_g = null;
        }
        ((gb) this).field_q = dp.field_t;
        ((gb) this).field_p = sl.field_y;
        ((gb) this).field_a = nh.field_b;
        ((gb) this).field_k = an.field_k;
        ((gb) this).field_m = nd.field_g;
        ((gb) this).field_e = ji.field_f;
        ((gb) this).field_j = gd.field_d;
        ((gb) this).field_c = gj.field_a;
        ((gb) this).field_d = vq.field_H;
    }

    gb(int param0, String param1, int param2, String param3, String param4) {
        ((gb) this).field_k = 0L;
        ((gb) this).field_f = 0;
        ((gb) this).field_q = param1;
        ((gb) this).field_g = null;
        ((gb) this).field_e = true;
        ((gb) this).field_d = 0;
        ((gb) this).field_p = param3;
        ((gb) this).field_j = param4;
        ((gb) this).field_c = param0;
        ((gb) this).field_m = param1;
        ((gb) this).field_o = param2;
        ((gb) this).field_a = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new int[]{33, 34, 35};
    }
}
