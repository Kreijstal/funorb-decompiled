/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gp implements Iterable {
    static op field_c;
    tk field_a;
    static mh field_d;
    static int field_b;

    final static boolean a(byte param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = BrickABrac.field_J ? 1 : 0;
        var2 = param1.charAt(0);
        if (param0 > 28) {
          var3 = 1;
          L0: while (true) {
            if (param1.length() > var3) {
              if (param1.charAt(var3) != var2) {
                return false;
              } else {
                var3++;
                continue L0;
              }
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    final static boolean a(int param0) {
        int stackIn_8_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_18_0;
        int stackOut_6_0;
        if (param0 == -4858) {
          if (null == bm.field_d) {
            if (!s.a(-121)) {
              if (no.field_p == null) {
                if (jg.b(true)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_18_0 = 1;
                stackIn_20_0 = stackOut_18_0;
                return stackIn_20_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          gp.a(-58, 65, -66, 54, -73);
          if (null == bm.field_d) {
            if (!s.a(-121)) {
              if (no.field_p == null) {
                if (jg.b(true)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                return stackIn_8_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        param2 -= 4;
        param4 += 2;
        param1 += 2;
        param0 -= 4;
        int var5 = lb.field_c * param1 + param4;
        int var6 = lb.field_c + -param2;
        la.a(lb.field_l, var5, 0, 0, 0, param3, param2, param0, var6);
    }

    final void a(tk param0, byte param1) {
        if (null == param0.field_n) {
          param0.field_s = ((gp) this).field_a;
          if (param1 > -112) {
            field_d = null;
            param0.field_n = ((gp) this).field_a.field_n;
            param0.field_n.field_s = param0;
            param0.field_s.field_n = param0;
            return;
          } else {
            param0.field_n = ((gp) this).field_a.field_n;
            param0.field_n.field_s = param0;
            param0.field_s.field_n = param0;
            return;
          }
        } else {
          param0.d(3);
          param0.field_s = ((gp) this).field_a;
          if (param1 <= -112) {
            param0.field_n = ((gp) this).field_a.field_n;
            param0.field_n.field_s = param0;
            param0.field_s.field_n = param0;
            return;
          } else {
            field_d = null;
            param0.field_n = ((gp) this).field_a.field_n;
            param0.field_n.field_s = param0;
            param0.field_s.field_n = param0;
            return;
          }
        }
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new ae((gp) this);
    }

    gp() {
        ((gp) this).field_a = new tk();
        ((gp) this).field_a.field_n = ((gp) this).field_a;
        ((gp) this).field_a.field_s = ((gp) this).field_a;
    }

    public static void b(int param0) {
        field_d = null;
        field_c = null;
        if (param0 != 2) {
            gp.a(-125, -106, -42, 126, 57);
        }
    }

    final tk a(boolean param0) {
        tk var2 = null;
        var2 = ((gp) this).field_a.field_s;
        if (var2 != ((gp) this).field_a) {
          var2.d(3);
          if (param0) {
            gp.a(-105, -93, 51, -34, -59);
            return var2;
          } else {
            return var2;
          }
        } else {
          return null;
        }
    }

    final static void a(boolean param0, boolean param1) {
        L0: {
          if (!gp.a(-4858)) {
            break L0;
          } else {
            param0 = false;
            break L0;
          }
        }
        L1: {
          oj.a(param0, (byte) 123);
          if (nf.field_V) {
            lb.b(sb.field_c.field_d.field_P, sb.field_c.field_d.field_zb, sb.field_c.field_d.field_Ib, sb.field_c.field_d.field_cb);
            sb.field_c.field_d.a(true, param0);
            break L1;
          } else {
            break L1;
          }
        }
        if (param1) {
          return;
        } else {
          si.a(7070, param0);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new op();
    }
}
