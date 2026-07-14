/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk extends at {
    static String[] field_k;
    static String field_j;
    static String field_l;
    private int field_m;
    static String field_p;
    static po field_o;
    private mh field_n;
    private ad field_q;

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        un.field_i = param0;
        mha.field_g = param2;
        jo.field_t = param1;
        if (param3 != -64) {
            field_j = null;
            ah.field_l = param4;
            return;
        }
        ah.field_l = param4;
    }

    final static int d(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        var3 = BachelorFridge.field_y;
        var1 = 0;
        L0: while (true) {
          if (!kaa.b(127)) {
            L1: {
              fw.field_i.a(rh.a(nfa.field_a, (byte) -128, jc.field_r), -119, rh.a(mk.field_p, (byte) -123, gd.field_m));
              if (!fw.field_i.e(0)) {
                break L1;
              } else {
                var1 = 1;
                break L1;
              }
            }
            L2: {
              var2 = 0;
              if (var1 == 0) {
                break L2;
              } else {
                if ((fw.field_i.field_g ^ -1) <= -1) {
                  var2 = st.field_a[fw.field_i.field_g];
                  if (2 == var2) {
                    nh.b(param0 + -16);
                    break L2;
                  } else {
                    if (param0 == 2) {
                      return var2;
                    } else {
                      jk.a(-119, 95, 106, (byte) -117, -51);
                      return var2;
                    }
                  }
                } else {
                  if (param0 == 2) {
                    return var2;
                  } else {
                    jk.a(-119, 95, 106, (byte) -117, -51);
                    return var2;
                  }
                }
              }
            }
            if (param0 != 2) {
              jk.a(-119, 95, 106, (byte) -117, -51);
              return var2;
            } else {
              return var2;
            }
          } else {
            fw.field_i.b(true);
            if (fw.field_i.e(0)) {
              var1 = 1;
              continue L0;
            } else {
              continue L0;
            }
          }
        }
    }

    public static void d(byte param0) {
        field_p = null;
        field_k = null;
        field_j = null;
        field_l = null;
        field_o = null;
        if (param0 >= -77) {
            int discarded$0 = jk.d(-67);
        }
    }

    final boolean c(byte param0) {
        int var2 = 0;
        if ((((jk) this).field_m ^ -1) == -26) {
            if (((jk) this).field_q.field_s.i(-90)) {
                ((jk) this).field_m = ((jk) this).field_m - 1;
                if (!((((jk) this).field_m - 1 ^ -1) < -1)) {
                    return false;
                }
                var2 = 56 / ((71 - param0) / 47);
                return true;
            }
            if (((jk) this).field_n.field_i) {
                ((jk) this).field_q.b(-1, 7);
                ((jk) this).field_m = ((jk) this).field_m - 1;
                if (!((((jk) this).field_m - 1 ^ -1) < -1)) {
                    return false;
                }
                var2 = 56 / ((71 - param0) / 47);
                return true;
            }
            ((jk) this).field_q.b(-1, 5);
            ((jk) this).field_m = ((jk) this).field_m - 1;
            if (!((((jk) this).field_m - 1 ^ -1) < -1)) {
                return false;
            }
            var2 = 56 / ((71 - param0) / 47);
            return true;
        }
        ((jk) this).field_m = ((jk) this).field_m - 1;
        if (!((((jk) this).field_m - 1 ^ -1) < -1)) {
            return false;
        }
        var2 = 56 / ((71 - param0) / 47);
        return true;
    }

    jk(gj param0, ad param1, mh param2) {
        ((jk) this).field_m = 25;
        ((jk) this).field_q = param1;
        ((jk) this).field_n = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new String[]{"attack", "special attack", "jump", "charge", "buff"};
        field_l = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_p = "Game options changed (<%0>)";
        field_j = "Who can join";
    }
}
