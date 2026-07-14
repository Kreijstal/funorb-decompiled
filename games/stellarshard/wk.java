/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk {
    static String field_g;
    static boolean field_c;
    static pf field_a;
    private pf field_d;
    static vl[] field_b;
    private pf field_f;
    private wa field_e;

    final static boolean a(int param0) {
        if (param0 < 74) {
            field_a = null;
        }
        return id.b(-4);
    }

    public static void a(byte param0) {
        if (param0 != 31) {
            return;
        }
        field_a = null;
        field_g = null;
        field_b = null;
    }

    final static boolean b(int param0) {
        lb var1 = null;
        int var2 = 0;
        int var3 = 0;
        lb var4 = null;
        var3 = stellarshard.field_B;
        var4 = (lb) (Object) oc.field_c.b(-124);
        var1 = var4;
        if (var1 != null) {
          if (param0 == 1816) {
            var2 = 0;
            L0: while (true) {
              if (var2 >= var1.field_s) {
                return true;
              } else {
                L1: {
                  if (null == var4.field_r[var2]) {
                    break L1;
                  } else {
                    if (0 == var4.field_r[var2].field_f) {
                      return false;
                    } else {
                      break L1;
                    }
                  }
                }
                if (null != var4.field_q[var2]) {
                  if (-1 == (var4.field_q[var2].field_f ^ -1)) {
                    return false;
                  } else {
                    var2++;
                    continue L0;
                  }
                } else {
                  var2++;
                  continue L0;
                }
              }
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final od a(int param0, int param1) {
        byte[] var4 = null;
        od var3 = (od) ((wk) this).field_e.b((long)param1, (byte) 58);
        if (var3 != null) {
            return var3;
        }
        if (-32769 < (param1 ^ -1)) {
            var4 = ((wk) this).field_f.a(param1, 16, 1);
        } else {
            var4 = ((wk) this).field_d.a(32767 & param1, 16, 1);
        }
        od var3_ref = new od();
        if (var4 != null) {
            var3_ref.a(new ka(var4), 745);
        }
        if (!((param1 ^ -1) > -32769)) {
            var3_ref.f(20865);
        }
        ((wk) this).field_e.a((Object) (Object) var3_ref, (long)param1, -22424);
        if (param0 != 32767) {
            field_a = null;
        }
        return var3_ref;
    }

    private wk() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = false;
        field_b = new vl[3000];
        field_g = "Please wait for high scores";
    }
}
