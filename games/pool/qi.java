/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qi implements Iterable {
    static String field_h;
    rg field_d;
    static int field_a;
    static int field_b;
    static int field_e;
    static int field_g;
    static boolean field_c;
    static jg field_f;

    final static dd[] a(int param0, int param1, boolean param2, int param3, int param4, boolean param5) {
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        dd var10 = null;
        dd var11 = null;
        int[] var12 = null;
        int[] var15 = null;
        int[] var16 = null;
        dd var17 = null;
        dd var18 = null;
        dd var19 = null;
        int[] var20 = null;
        dd var21 = null;
        dd var22 = null;
        dd var23 = null;
        int[] var24 = null;
        var24 = qh.field_d;
        var20 = var24;
        var16 = var20;
        var15 = var16;
        var12 = var15;
        var6 = var12;
        var7 = qh.field_l;
        if (param4 >= -84) {
          L0: {
            field_e = 98;
            var8 = qh.field_f;
            var17 = new dd(16, param3);
            var17.e();
            qh.d(0, 0, 16, param3, param0, param1);
            var10 = null;
            if (!param5) {
              break L0;
            } else {
              var18 = var17.d();
              var10 = var18;
              var18.e();
              qh.f(0, 0, 5, 0);
              qh.f(0, 1, 3, 0);
              qh.f(0, 2, 2, 0);
              qh.f(0, 3, 1, 0);
              qh.f(0, 4, 1, 0);
              break L0;
            }
          }
          L1: {
            var11 = null;
            if (param2) {
              var19 = var17.d();
              var11 = var19;
              var19.e();
              qh.f(11, 0, 5, 0);
              qh.f(13, 1, 3, 0);
              qh.f(14, 2, 2, 0);
              qh.f(15, 3, 1, 0);
              qh.f(15, 4, 1, 0);
              break L1;
            } else {
              break L1;
            }
          }
          qh.a(var24, var7, var8);
          return new dd[]{null, null, null, var10, var17, var11, null, null, null};
        } else {
          L2: {
            var8 = qh.field_f;
            var21 = new dd(16, param3);
            var21.e();
            qh.d(0, 0, 16, param3, param0, param1);
            var10 = null;
            if (!param5) {
              break L2;
            } else {
              var22 = var21.d();
              var10 = var22;
              var22.e();
              qh.f(0, 0, 5, 0);
              qh.f(0, 1, 3, 0);
              qh.f(0, 2, 2, 0);
              qh.f(0, 3, 1, 0);
              qh.f(0, 4, 1, 0);
              break L2;
            }
          }
          L3: {
            var11 = null;
            if (param2) {
              var23 = var21.d();
              var11 = var23;
              var23.e();
              qh.f(11, 0, 5, 0);
              qh.f(13, 1, 3, 0);
              qh.f(14, 2, 2, 0);
              qh.f(15, 3, 1, 0);
              qh.f(15, 4, 1, 0);
              break L3;
            } else {
              break L3;
            }
          }
          qh.a(var24, var7, var8);
          return new dd[]{null, null, null, var10, var21, var11, null, null, null};
        }
    }

    final static void a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        var1 = (-640 + fr.field_s) / 2;
        if (param0 >= -71) {
          field_b = 3;
          var2 = ir.field_h * ir.field_h;
          var3 = -(hb.field_a * hb.field_a) + var2;
          ir.field_a.b(90, 2147483647, -(199 * var3 / var2) + var1, 199, -90 + (qh.field_f - 120) - 4);
          oi.field_n.b(0, 2147483647, var1 + (202 - -(var3 * 438 / var2)), 438, qh.field_f + -120 + -4);
          return;
        } else {
          var2 = ir.field_h * ir.field_h;
          var3 = -(hb.field_a * hb.field_a) + var2;
          ir.field_a.b(90, 2147483647, -(199 * var3 / var2) + var1, 199, -90 + (qh.field_f - 120) - 4);
          oi.field_n.b(0, 2147483647, var1 + (202 - -(var3 * 438 / var2)), 438, qh.field_f + -120 + -4);
          return;
        }
    }

    final static void a(int param0, String param1) {
        if (param0 <= 68) {
            return;
        }
        na.a(-58, param1);
        wf.a(false, gg.field_a, -128);
    }

    public static void b(int param0) {
        field_f = null;
        if (param0 != 14676) {
            field_h = null;
            field_h = null;
            return;
        }
        field_h = null;
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new mn((qi) this);
    }

    final rg a(int param0) {
        rg var2 = null;
        if (param0 < -87) {
          var2 = ((qi) this).field_d.field_q;
          if (((qi) this).field_d == var2) {
            return null;
          } else {
            var2.a(false);
            return var2;
          }
        } else {
          qi.a((byte) -89);
          var2 = ((qi) this).field_d.field_q;
          if (((qi) this).field_d == var2) {
            return null;
          } else {
            var2.a(false);
            return var2;
          }
        }
    }

    final static boolean a(byte param0, CharSequence param1) {
        if (param0 != -64) {
            return false;
        }
        return w.a(false, param1, (byte) -37);
    }

    qi() {
        ((qi) this).field_d = new rg();
        ((qi) this).field_d.field_n = ((qi) this).field_d;
        ((qi) this).field_d.field_q = ((qi) this).field_d;
    }

    final void a(byte param0, rg param1) {
        if (param1.field_n == null) {
          if (param0 > -31) {
            field_g = -32;
            param1.field_n = ((qi) this).field_d.field_n;
            param1.field_q = ((qi) this).field_d;
            param1.field_n.field_q = param1;
            param1.field_q.field_n = param1;
            return;
          } else {
            param1.field_n = ((qi) this).field_d.field_n;
            param1.field_q = ((qi) this).field_d;
            param1.field_n.field_q = param1;
            param1.field_q.field_n = param1;
            return;
          }
        } else {
          param1.a(false);
          if (param0 <= -31) {
            param1.field_n = ((qi) this).field_d.field_n;
            param1.field_q = ((qi) this).field_d;
            param1.field_n.field_q = param1;
            param1.field_q.field_n = param1;
            return;
          } else {
            field_g = -32;
            param1.field_n = ((qi) this).field_d.field_n;
            param1.field_q = ((qi) this).field_d;
            param1.field_n.field_q = param1;
            param1.field_q.field_n = param1;
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Invite <%0> to this game";
    }
}
