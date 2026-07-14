/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class k {
    private java.util.zip.Inflater field_a;
    static String field_d;
    static er field_c;
    static String field_b;

    final static void a(boolean param0) {
        bs var3 = null;
        int var2 = Vertigo2.field_L ? 1 : 0;
        sj.field_d = null;
        gd.field_j = null;
        qn.field_q = param0 ? true : false;
        if (!(mk.field_J == null)) {
            mk.field_J.c(0);
            mk.field_J = null;
        }
        kd.field_l = null;
        if (!(null == nr.field_p)) {
            nr.field_p.c(0);
            nr.field_p = null;
        }
        lh.field_b = null;
        if (null != kq.field_Rb) {
            kq.field_Rb.c(0);
            kq.field_Rb = null;
            ck.field_I = null;
            if (!(null == kd.field_l)) {
                var3 = (bs) (Object) kd.field_l.b(29);
                while (var3 != null) {
                    var3.a(-123);
                    var3 = (bs) (Object) kd.field_l.a((byte) -60);
                }
                kd.field_l = null;
                return;
            }
            return;
        }
        ck.field_I = null;
        if (!(null == kd.field_l)) {
            var3 = (bs) (Object) kd.field_l.b(29);
            while (var3 != null) {
                var3.a(-123);
                var3 = (bs) (Object) kd.field_l.a((byte) -60);
            }
            kd.field_l = null;
            return;
        }
    }

    public k() {
        this(-1, 1000000, 1000000);
    }

    public static void b(int param0) {
        field_d = null;
        if (param0 >= -4) {
            field_d = null;
            field_c = null;
            field_b = null;
            return;
        }
        field_c = null;
        field_b = null;
    }

    final static ve[] a(int param0) {
        if (param0 != -15922) {
            return null;
        }
        return new ve[]{g.field_f, dk.field_o, gi.field_t, ti.field_b, f.field_H, kk.field_e, br.field_Y, bd.field_e, bj.field_g, tg.field_c, bp.field_y, kq.field_Lb, rp.field_f, nb.field_B};
    }

    final void a(ed param0, byte param1, byte[] param2) {
        try {
            Exception exception = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if ((param0.field_p[param0.field_u] ^ -1) != -32) {
                break L0;
              } else {
                if ((param0.field_p[param0.field_u + 1] ^ -1) == 116) {
                  L1: {
                    if (((k) this).field_a != null) {
                      break L1;
                    } else {
                      ((k) this).field_a = new java.util.zip.Inflater(true);
                      break L1;
                    }
                  }
                  try {
                    if (param1 == 88) {
                      ((k) this).field_a.setInput(param0.field_p, 10 + param0.field_u, -8 + (-10 + -param0.field_u + param0.field_p.length));
                      int discarded$2 = ((k) this).field_a.inflate(param2);
                    } else {
                      return;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                  }
                  exception = (Exception) (Object) decompiledCaughtException;
                  ((k) this).field_a.reset();
                  throw new RuntimeException("");
                } else {
                  break L0;
                }
              }
            }
            throw new RuntimeException("");
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private k(int param0, int param1, int param2) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "<%0> has withdrawn the request to join.";
        field_b = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
