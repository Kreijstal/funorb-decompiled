/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p extends nm {
    private int field_o;
    static String field_p;
    boolean field_l;
    static String field_j;
    int[] field_n;
    int field_k;
    static jp field_i;
    int field_m;

    final boolean c(int param0) {
        if (param0 != 1) {
            return true;
        }
        return ((p) this).field_n.length == ((p) this).field_o ? true : false;
    }

    final int a(byte param0) {
        if (param0 != -104) {
          p.b(true);
          ((p) this).field_o = ((p) this).field_o + 1;
          return ((p) this).field_n[((p) this).field_o];
        } else {
          ((p) this).field_o = ((p) this).field_o + 1;
          return ((p) this).field_n[((p) this).field_o];
        }
    }

    final static boolean a(byte param0, int param1, int param2, int param3) {
        if (-1 >= (param3 ^ -1)) {
          if ((param3 ^ -1) >= -12) {
            if (param1 >= 1) {
              if (bg.a(param2, 29, param3) >= param1) {
                if (param0 != -49) {
                  field_j = null;
                  return true;
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

    final static String a(int param0) {
        String var1 = null;
        L0: {
          var1 = "";
          if (null == eo.field_k) {
            break L0;
          } else {
            var1 = eo.field_k.j((byte) -76);
            break L0;
          }
        }
        if (param0 >= -98) {
          L1: {
            field_i = null;
            if (0 != var1.length()) {
              break L1;
            } else {
              var1 = dg.b(100);
              break L1;
            }
          }
          L2: {
            if (-1 == var1.length()) {
              var1 = ud.field_t;
              break L2;
            } else {
              break L2;
            }
          }
          return var1;
        } else {
          L3: {
            if (0 != var1.length()) {
              break L3;
            } else {
              var1 = dg.b(100);
              break L3;
            }
          }
          L4: {
            if (-1 == var1.length()) {
              var1 = ud.field_t;
              break L4;
            } else {
              break L4;
            }
          }
          return var1;
        }
    }

    public static void b(boolean param0) {
        field_j = null;
        field_i = null;
        field_p = null;
        if (param0) {
            p.b(true);
        }
    }

    final static jp a(int param0, jp param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        jp var7 = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        var7 = new jp(param1.field_D + param2 * 2, param1.field_C + param2 * 2);
        var7.g();
        var5 = 0;
        L0: while (true) {
          if (param2 <= var5) {
            kc.field_q.a((byte) 104);
            var7.field_F = -param2 + param1.field_F;
            if (param0 != -12) {
              field_j = null;
              var7.field_E = param1.field_E + -param2;
              return var7;
            } else {
              var7.field_E = param1.field_E + -param2;
              return var7;
            }
          } else {
            param1.d(param2 - param1.field_E, -param1.field_F + param2, param3);
            lb.e(1, 1, 0, 0, var7.field_D, var7.field_C);
            var5++;
            continue L0;
          }
        }
    }

    public p() {
        ((p) this).field_n = new int[5];
        ((p) this).field_o = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Login: ";
        field_j = "Allow spectators?";
    }
}
