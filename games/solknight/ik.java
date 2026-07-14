/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ik implements Iterable {
    ec field_f;
    static kb field_e;
    static String field_d;
    static java.applet.Applet field_c;
    static nj field_b;
    static String field_a;

    public static void b(byte param0) {
        field_d = null;
        field_b = null;
        field_e = null;
        if (param0 != -61) {
          field_a = null;
          field_a = null;
          field_c = null;
          return;
        } else {
          field_a = null;
          field_c = null;
          return;
        }
    }

    final static o[] a(da param0, int param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        var4 = param0.c(91, param3);
        var5 = param0.a(param2, -1, var4);
        if (param1 != -18362) {
          ik.b((byte) -114);
          return ik.a(param0, param1 + -6521, var5, var4);
        } else {
          return ik.a(param0, param1 + -6521, var5, var4);
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        lc var4 = null;
        fj var5 = null;
        var3 = SolKnight.field_L ? 1 : 0;
        var4 = (lc) (Object) hc.field_a.a((byte) 51);
        L0: while (true) {
          if (var4 == null) {
            if (param1 == 18897) {
              var5 = (fj) (Object) ti.field_b.a((byte) 51);
              L1: while (true) {
                if (var5 == null) {
                  return;
                } else {
                  h.a(param0, var5, (byte) 78);
                  var5 = (fj) (Object) ti.field_b.b(param1 ^ -18853);
                  continue L1;
                }
              }
            } else {
              field_c = null;
              var5 = (fj) (Object) ti.field_b.a((byte) 51);
              L2: while (true) {
                if (var5 == null) {
                  return;
                } else {
                  h.a(param0, var5, (byte) 78);
                  var5 = (fj) (Object) ti.field_b.b(param1 ^ -18853);
                  continue L2;
                }
              }
            }
          } else {
            ud.a((byte) -109, var4, param0);
            var4 = (lc) (Object) hc.field_a.b(param1 + -18934);
            continue L0;
          }
        }
    }

    private final static o[] a(da param0, int param1, int param2, int param3) {
        if (param1 == -24883) {
          if (!l.a(param1 ^ -24921, param2, param3, param0)) {
            return null;
          } else {
            return fi.b(255);
          }
        } else {
          ik.b((byte) -114);
          if (!l.a(param1 ^ -24921, param2, param3, param0)) {
            return null;
          } else {
            return fi.b(255);
          }
        }
    }

    final void a(int param0, ec param1) {
        int var3 = 0;
        if (null != param1.field_k) {
          param1.a(97);
          param1.field_i = ((ik) this).field_f;
          var3 = -27 / ((-58 - param0) / 51);
          param1.field_k = ((ik) this).field_f.field_k;
          param1.field_k.field_i = param1;
          param1.field_i.field_k = param1;
          return;
        } else {
          param1.field_i = ((ik) this).field_f;
          var3 = -27 / ((-58 - param0) / 51);
          param1.field_k = ((ik) this).field_f.field_k;
          param1.field_k.field_i = param1;
          param1.field_i.field_k = param1;
          return;
        }
    }

    final ec a(byte param0) {
        ec var2 = null;
        Object var3 = null;
        var2 = ((ik) this).field_f.field_i;
        if (((ik) this).field_f != var2) {
          if (param0 > -105) {
            var3 = null;
            ((ik) this).a(-40, (ec) null);
            var2.a(97);
            return var2;
          } else {
            var2.a(97);
            return var2;
          }
        } else {
          return null;
        }
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new jl((ik) this);
    }

    private ik() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new kb();
        field_d = "To Customer Support";
        field_a = "Password is valid";
    }
}
