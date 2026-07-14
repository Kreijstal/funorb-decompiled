/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class im implements Iterable {
    int field_g;
    static int[] field_h;
    hl[] field_j;
    static volatile int field_e;
    static byte[] field_i;
    static hj field_b;
    static hj field_k;
    static String field_f;
    static int field_a;
    static long field_c;
    private hl field_d;

    final void a(byte param0, hl param1, long param2) {
        hl var5 = null;
        L0: {
          if (param1.field_a != null) {
            param1.d(0);
            break L0;
          } else {
            break L0;
          }
        }
        var5 = ((im) this).field_j[(int)(param2 & (long)(-1 + ((im) this).field_g))];
        param1.field_a = var5.field_a;
        param1.field_h = var5;
        param1.field_a.field_h = param1;
        param1.field_f = param2;
        if (param0 != 27) {
          im.a(114);
          param1.field_h.field_a = param1;
          return;
        } else {
          param1.field_h.field_a = param1;
          return;
        }
    }

    final hl a(long param0, int param1) {
        hl var4 = null;
        int var5_int = 0;
        hl var5 = null;
        int var6 = 0;
        var6 = HoldTheLine.field_D;
        var4 = ((im) this).field_j[(int)((long)(((im) this).field_g - 1) & param0)];
        ((im) this).field_d = var4.field_h;
        L0: while (true) {
          if (((im) this).field_d != var4) {
            if ((param0 ^ -1L) != (((im) this).field_d.field_f ^ -1L)) {
              ((im) this).field_d = ((im) this).field_d.field_h;
              continue L0;
            } else {
              var5 = ((im) this).field_d;
              ((im) this).field_d = ((im) this).field_d.field_h;
              return var5;
            }
          } else {
            ((im) this).field_d = null;
            var5_int = 104 / ((param1 - 83) / 36);
            return null;
          }
        }
    }

    public static void a(int param0) {
        int var1 = -60 / ((param0 - 29) / 46);
        field_i = null;
        field_k = null;
        field_b = null;
        field_f = null;
        field_h = null;
    }

    final static boolean a(ee param0, ee param1, int param2) {
        if (param0.field_z) {
          if (param1.field_z) {
            if (-2 <= (-param1.field_q + param0.field_q ^ -1)) {
              if (-1 <= -param1.field_q + param0.field_q) {
                if ((param1.field_B + param0.field_B) * (param0.field_B + param1.field_B) >= (-param0.field_A.field_f + param1.field_A.field_f) * (param1.field_A.field_f + -param0.field_A.field_f) + (-param0.field_A.field_h + param1.field_A.field_h) * (-param0.field_A.field_h + param1.field_A.field_h)) {
                  if (param2 == 32758) {
                    L0: {
                      if (!param0.field_p) {
                        break L0;
                      } else {
                        if (!param1.field_p) {
                          break L0;
                        } else {
                          return l.a(0, param0.field_i, param1.field_k, param0.field_k, param0.field_w, param1.field_i, param0.field_A, param1.field_w, param1.field_A);
                        }
                      }
                    }
                    if (!param0.field_p) {
                      if (param1.field_p) {
                        return ca.a(param0.field_A, param1.field_i, param1.field_A, param0.field_B, param1.field_w, param1.field_k, 109);
                      } else {
                        return true;
                      }
                    } else {
                      return ca.a(param1.field_A, param0.field_i, param0.field_A, param1.field_B, param0.field_w, param0.field_k, 107);
                    }
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
        } else {
          return false;
        }
    }

    final static void a(int param0, th param1) {
        int var2 = 0;
        si.field_jb = param1.k(-70) << -151264891;
        var2 = param1.f((byte) -28);
        ef.field_b = var2 << 992085810 & 1835008;
        si.field_jb = si.field_jb + (var2 >> -297339101);
        ef.field_b = ef.field_b + (param1.k(-125) << 1881959458);
        var2 = param1.f((byte) -48);
        ae.field_a = var2 << 40035791 & 2064384;
        ef.field_b = ef.field_b + (var2 >> 356415942);
        ae.field_a = ae.field_a + (param1.f((byte) -117) << 1002409159);
        var2 = param1.f((byte) -97);
        ae.field_a = ae.field_a + (var2 >> 1337706721);
        dk.field_l = (1 & var2) << -1784153328;
        if (param0 <= 70) {
          field_k = null;
          dk.field_l = dk.field_l + param1.k(82);
          return;
        } else {
          dk.field_l = dk.field_l + param1.k(82);
          return;
        }
    }

    private im() throws Throwable {
        throw new Error();
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new nc((im) this);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
        field_c = 0L;
        field_f = "(green)";
    }
}
