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
        ah.field_l = param4;
    }

    final static int d(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        var3 = BachelorFridge.field_y;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              if (!kaa.b(127)) {
                L2: {
                  fw.field_i.a(rh.a(nfa.field_a, (byte) -128, jc.field_r), -119, rh.a(mk.field_p, (byte) -123, gd.field_m));
                  if (!fw.field_i.e(0)) {
                    break L2;
                  } else {
                    var1_int = 1;
                    break L2;
                  }
                }
                L3: {
                  var2 = 0;
                  if (var1_int == 0) {
                    break L3;
                  } else {
                    if (fw.field_i.field_g >= 0) {
                      var2 = st.field_a[fw.field_i.field_g];
                      if (2 == var2) {
                        nh.b(-14);
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                stackOut_14_0 = var2;
                stackIn_15_0 = stackOut_14_0;
                break L0;
              } else {
                fw.field_i.b(true);
                if (fw.field_i.e(0)) {
                  var1_int = 1;
                  continue L1;
                } else {
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1, "jk.C(" + 2 + ')');
        }
        return stackIn_15_0;
    }

    public static void d() {
        field_p = null;
        field_k = null;
        field_j = null;
        field_l = null;
        field_o = null;
    }

    final boolean c(byte param0) {
        int var2 = 0;
        if (((jk) this).field_m == 25) {
            if (((jk) this).field_q.field_s.i(-90)) {
                int fieldTemp$0 = ((jk) this).field_m - 1;
                ((jk) this).field_m = ((jk) this).field_m - 1;
                if (!(fieldTemp$0 > 0)) {
                    return false;
                }
                var2 = 56 / ((71 - param0) / 47);
                return true;
            }
            if (((jk) this).field_n.field_i) {
                ((jk) this).field_q.b(-1, 7);
                int fieldTemp$1 = ((jk) this).field_m - 1;
                ((jk) this).field_m = ((jk) this).field_m - 1;
                if (!(fieldTemp$1 > 0)) {
                    return false;
                }
                var2 = 56 / ((71 - param0) / 47);
                return true;
            }
            ((jk) this).field_q.b(-1, 5);
            int fieldTemp$2 = ((jk) this).field_m - 1;
            ((jk) this).field_m = ((jk) this).field_m - 1;
            if (!(fieldTemp$2 > 0)) {
                return false;
            }
            var2 = 56 / ((71 - param0) / 47);
            return true;
        }
        int fieldTemp$3 = ((jk) this).field_m - 1;
        ((jk) this).field_m = ((jk) this).field_m - 1;
        if (!(fieldTemp$3 > 0)) {
            return false;
        }
        var2 = 56 / ((71 - param0) / 47);
        return true;
    }

    jk(gj param0, ad param1, mh param2) {
        try {
            ((jk) this).field_m = 25;
            ((jk) this).field_q = param1;
            ((jk) this).field_n = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "jk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
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
