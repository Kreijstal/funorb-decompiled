/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class mj {
    private int[] field_a;
    static String field_i;
    private ma field_f;
    static int field_b;
    static pf field_c;
    static int field_j;
    private int field_d;
    static int field_k;
    static String field_g;
    static String field_h;
    static String field_e;

    final void a(byte param0) {
        ((mj) this).field_f.c(2);
        if (param0 != -8) {
            field_i = null;
        }
    }

    final void b(int param0) {
        ((mj) this).field_f.a(12804, false);
        ((mj) this).field_d = ((mj) this).field_d + 1;
        if (((mj) this).field_d == 60) {
          ((mj) this).field_a[0] = ok.a(ea.field_b, -100, 300) + 300;
          ((mj) this).field_a[1] = 0;
          if (param0 != 300) {
            mj.c(43);
            return;
          } else {
            return;
          }
        } else {
          if (120 < ((mj) this).field_d) {
            ((mj) this).field_a[0] = 0;
            ((mj) this).field_a[1] = 300 - -ok.a(ea.field_b, bn.a(param0, -327), 300);
            ((mj) this).field_d = 0;
            if (param0 == 300) {
              return;
            } else {
              mj.c(43);
              return;
            }
          } else {
            if (param0 == 300) {
              return;
            } else {
              mj.c(43);
              return;
            }
          }
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_c = null;
        field_g = null;
        field_h = null;
        if (param0 != 21651) {
          mj.c(-11);
          field_i = null;
          return;
        } else {
          field_i = null;
          return;
        }
    }

    final static void a(int param0, sb param1, int param2, int param3, int param4, sb param5) {
        Object var7 = null;
        uo.field_m = param1;
        uf.field_a = param2;
        lf.field_b = param4;
        wg.field_d = param5;
        if (param3 != 300) {
          var7 = null;
          mj.a(-68, (sb) null, -42, 67, -94, (sb) null);
          ki.field_e = param0;
          return;
        } else {
          ki.field_e = param0;
          return;
        }
    }

    final static String a(int param0, int param1) {
        Object var3 = null;
        if (param0 != 4067) {
          var3 = null;
          mj.a(112, (sb) null, -11, -57, 97, (sb) null);
          return param1 - -1 + "/" + ln.field_m.length;
        } else {
          return param1 - -1 + "/" + ln.field_m.length;
        }
    }

    final static String a(int param0, String param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        pc var6 = null;
        CharSequence var7 = null;
        var7 = (CharSequence) (Object) param1;
        if (!ai.a((byte) -128, var7)) {
          return qn.field_n;
        } else {
          if (!sm.a(param1, -1)) {
            if (gk.field_db == 2) {
              if (i.a(-640, param1)) {
                return sd.a(cf.field_H, 45, new String[1]);
              } else {
                if (-101 >= (aj.field_t ^ -1)) {
                  return co.field_k;
                } else {
                  if (ha.a(param1, (byte) 37)) {
                    return sd.a(jp.field_b, 89, new String[1]);
                  } else {
                    var6 = aa.field_f;
                    var6.g(param2, 15514);
                    var6.field_m = var6.field_m + 1;
                    var4 = var6.field_m;
                    var6.e(160, 2);
                    var6.b((byte) -41, param1);
                    var6.f(var6.field_m + -var4, -1);
                    var5 = 55 / ((param0 - 16) / 45);
                    return null;
                  }
                }
              }
            } else {
              return le.field_d;
            }
          } else {
            return wd.field_h;
          }
        }
    }

    public mj() {
        ((mj) this).field_a = new int[2];
        ((mj) this).field_a[0] = 0;
        ((mj) this).field_a[1] = 0;
        ((mj) this).field_f = new ma(((mj) this).field_a, false, 500, 330);
        ((mj) this).field_f.a(196608, -115);
    }

    final static void c(int param0) {
        ph.field_l.c((ng) (Object) new jh(), -115);
        if (param0 != 24496) {
            Object var2 = null;
            String discarded$0 = mj.a(-69, (String) null, 1);
        }
    }

    final static void a(boolean param0) {
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (!param0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        un.field_l = stackIn_3_0 != 0;
        if (null != bo.field_h) {
          L1: {
            bo.field_h.l(17872);
            if (0 != ce.field_d) {
              nd.a((byte) -124);
              break L1;
            } else {
              break L1;
            }
          }
          di.field_a = 0;
          return;
        } else {
          L2: {
            if (0 != ce.field_d) {
              nd.a((byte) -124);
              break L2;
            } else {
              break L2;
            }
          }
          di.field_a = 0;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Discard";
        field_h = "Create a free account to start using this feature";
        field_g = "Please wait while we search.<br>Games usually start within a minute, provided the server is busy enough.<br><br>The longer you are forced to wait, the earlier in the list of players you are likely to appear.<br><br>If the game doesn't start, click 'Cancel' and then try choosing 'Don't mind' for more options or switching to a busier lobby.";
        field_c = new pf(1);
        field_e = "Music: ";
    }
}
