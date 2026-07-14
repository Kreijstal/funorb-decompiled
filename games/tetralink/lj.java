/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lj implements Iterator {
    private mc field_d;
    private mc field_f;
    private ea field_e;
    static int[] field_a;
    static ah field_c;
    private int field_g;
    static int[] field_b;

    final static id a(int param0, bc param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        id var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TetraLink.field_J;
        var2 = param1.e(8, (byte) -112);
        if (-1 > (var2 ^ -1)) {
          throw new IllegalStateException("" + var2);
        } else {
          L0: {
            var3 = bc.a(91, param1) ? 1 : 0;
            var4 = bc.a(77, param1) ? 1 : 0;
            var5 = new id();
            var5.field_q = (short)param1.e(16, (byte) -112);
            var5.field_D = cc.a(var5.field_D, param1, 16, 0);
            var5.field_i = cc.a(var5.field_i, param1, 16, param0 ^ param0);
            var5.field_R = cc.a(var5.field_R, param1, 16, param0 ^ -16483);
            var5.field_s = (short)param1.e(16, (byte) -112);
            var5.field_K = cc.a(var5.field_K, param1, 16, 0);
            var5.field_I = cc.a(var5.field_I, param1, 16, param0 ^ -16483);
            var5.field_e = cc.a(var5.field_e, param1, 16, 0);
            if (var3 != 0) {
              var5.field_O = (short)param1.e(16, (byte) -112);
              var5.field_l = cc.a(var5.field_l, param1, 16, 0);
              var5.field_d = cc.a(var5.field_d, param1, 16, 0);
              var5.field_y = cc.a(var5.field_y, param1, 16, 0);
              var5.field_t = cc.a(var5.field_t, param1, 16, param0 + 16483);
              var5.field_b = cc.a(var5.field_b, param1, 16, 0);
              var5.field_N = cc.a(var5.field_N, param1, 16, param0 + 16483);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (var4 == 0) {
              break L1;
            } else {
              int discarded$1 = param1.e(16, (byte) -112);
              var5.field_k = cc.a(var5.field_k, param1, 16, param0 ^ -16483);
              var5.field_p = cc.a(var5.field_p, param1, 16, 0);
              var5.field_A = cc.a(var5.field_A, param1, 16, 0);
              var5.field_o = cc.a(var5.field_o, param1, 16, 0);
              var5.field_g = cc.a(var5.field_g, param1, 16, 0);
              break L1;
            }
          }
          L2: {
            if (bc.a(126, param1)) {
              var5.field_v = cc.a(var5.field_v, param1, 16, 0);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (bc.a(64, param1)) {
              var5.field_u = fi.a(16, var5.field_u, param1, (byte) 119);
              var6 = 0;
              var7 = 0;
              L4: while (true) {
                if (var7 >= var5.field_u.length) {
                  if (0 != var6) {
                    var5.field_Q = (byte)(1 + var6);
                    break L3;
                  } else {
                    var5.field_u = null;
                    break L3;
                  }
                } else {
                  if ((var5.field_u[var7] & 255) > var6) {
                    var6 = 255 & var5.field_u[var7];
                    var7++;
                    continue L4;
                  } else {
                    var7++;
                    continue L4;
                  }
                }
              }
            } else {
              break L3;
            }
          }
          return var5;
        }
    }

    public final Object next() {
        mc var1 = null;
        int var2 = 0;
        var2 = TetraLink.field_J;
        if (((lj) this).field_e.field_d[-1 + ((lj) this).field_g] != ((lj) this).field_f) {
          var1 = ((lj) this).field_f;
          ((lj) this).field_f = var1.field_j;
          ((lj) this).field_d = var1;
          return (Object) (Object) var1;
        } else {
          L0: while (true) {
            if (((lj) this).field_g < ((lj) this).field_e.field_i) {
              ((lj) this).field_g = ((lj) this).field_g + 1;
              var1 = ((lj) this).field_e.field_d[((lj) this).field_g].field_j;
              if (((lj) this).field_e.field_d[((lj) this).field_g - 1] != var1) {
                ((lj) this).field_f = var1.field_j;
                ((lj) this).field_d = var1;
                return (Object) (Object) var1;
              } else {
                continue L0;
              }
            } else {
              return null;
            }
          }
        }
    }

    public final boolean hasNext() {
        int var2 = 0;
        var2 = TetraLink.field_J;
        if (((lj) this).field_e.field_d[((lj) this).field_g + -1] != ((lj) this).field_f) {
          return true;
        } else {
          L0: while (true) {
            if (((lj) this).field_e.field_i <= ((lj) this).field_g) {
              return false;
            } else {
              ((lj) this).field_g = ((lj) this).field_g + 1;
              if (((lj) this).field_e.field_d[((lj) this).field_g].field_j != ((lj) this).field_e.field_d[-1 + ((lj) this).field_g]) {
                ((lj) this).field_f = ((lj) this).field_e.field_d[((lj) this).field_g + -1].field_j;
                return true;
              } else {
                ((lj) this).field_f = ((lj) this).field_e.field_d[-1 + ((lj) this).field_g];
                continue L0;
              }
            }
          }
        }
    }

    public static void b(byte param0) {
        field_b = null;
        field_c = null;
        if (param0 <= 116) {
            field_b = null;
        }
        field_a = null;
    }

    private final void a(int param0) {
        ((lj) this).field_f = ((lj) this).field_e.field_d[0].field_j;
        ((lj) this).field_g = 1;
        ((lj) this).field_d = null;
        if (param0 != -1) {
            field_c = null;
        }
    }

    public final void remove() {
        if (null == ((lj) this).field_d) {
            throw new IllegalStateException();
        }
        ((lj) this).field_d.b(false);
        ((lj) this).field_d = null;
    }

    final static void a(byte param0) {
        int var1 = (cf.field_n - 640) / 2;
        int var2 = ma.field_f * ma.field_f;
        int var3 = -(qd.field_ab * qd.field_ab) + var2;
        if (param0 >= -21) {
            Object var4 = null;
            rm[] discarded$0 = lj.a((bc) null, -52);
        }
        hn.field_P.a((byte) -92, 199, 90, -120 + ra.field_e + -94, var1 - var3 * 199 / var2);
        qe.field_c.a((byte) -124, 438, 0, -4 + ra.field_e - 120, 438 * var3 / var2 + (202 + var1));
    }

    final static rm[] a(bc param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        rm[] var4 = null;
        int var5 = 0;
        int var6_int = 0;
        rm var6 = null;
        int var7 = 0;
        var7 = TetraLink.field_J;
        var2 = param0.e(8, (byte) -112);
        if (param1 >= var2) {
          var3 = param0.e(12, (byte) -112);
          var4 = new rm[var3];
          var5 = 0;
          L0: while (true) {
            if (var3 <= var5) {
              return var4;
            } else {
              if (bc.a(100, param0)) {
                var6 = new rm();
                int discarded$6 = param0.e(24, (byte) -112);
                int discarded$7 = param0.e(24, (byte) -112);
                var6.field_j = param0.e(24, (byte) -112);
                int discarded$8 = param0.e(9, (byte) -112);
                int discarded$9 = param0.e(12, (byte) -112);
                int discarded$10 = param0.e(12, (byte) -112);
                int discarded$11 = param0.e(12, (byte) -112);
                var4[var5] = var6;
                var5++;
                continue L0;
              } else {
                var6_int = param0.e(rn.a((byte) -127, -1 + var5), (byte) -112);
                var4[var5] = var4[var6_int];
                var5++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    lj(ea param0) {
        ((lj) this).field_d = null;
        ((lj) this).field_e = param0;
        this.a(-1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[4];
        field_b = new int[8192];
    }
}
