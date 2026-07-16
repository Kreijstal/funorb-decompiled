/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug implements ci {
    private ee field_c;
    static int field_h;
    private int field_b;
    private int field_e;
    private int field_g;
    private int field_i;
    private int field_a;
    private int field_f;
    private int field_d;

    final static void a(float param0, int param1, String param2) {
        Object var4 = null;
        if (param1 <= 51) {
          var4 = null;
          ug.a(-0.46710100769996643f, 7, (String) null);
          he.field_g = param0;
          ck.field_G = param2;
          return;
        } else {
          he.field_g = param0;
          ck.field_G = param2;
          return;
        }
    }

    final static jg a(je param0, int param1, int param2) {
        Object var4 = null;
        if (param1 != 1) {
          var4 = null;
          ug.a(-0.6929006576538086f, 125, (String) null);
          return new jg(param0, gd.field_m * param2 / 1000);
        } else {
          return new jg(param0, gd.field_m * param2 / 1000);
        }
    }

    ug(ee param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((ug) this).field_f = param4;
        ((ug) this).field_g = param7;
        ((ug) this).field_a = param1;
        ((ug) this).field_c = param0;
        ((ug) this).field_e = param6;
        ((ug) this).field_d = param2;
        ((ug) this).field_b = param3;
        ((ug) this).field_i = param5;
    }

    public final void a(int param0, lk param1, int param2, int param3, boolean param4) {
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        se var14 = null;
        lk stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        lk stackOut_1_0 = null;
        L0: {
          if (!(param1 instanceof se)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (lk) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (lk) param1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var14 = (se) (Object) stackIn_3_0;
          if (var14 != null) {
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          vj.c(param1.field_o + param0, param3 - -param1.field_i, param1.field_h, param1.field_q, ((ug) this).field_g);
          var7 = param0 + param1.field_o + var14.field_E;
          var8 = param1.field_i + param3 + var14.field_M;
          vj.b(var7, var8, var14.field_H, ((ug) this).field_i);
          if (-1 != var14.field_I) {
            var9 = (double)var14.field_I * 3.141592653589793 * 2.0 / (double)var14.field_N;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_H);
            var12 = (int)(Math.cos(var9) * (double)var14.field_H);
            vj.b(var11 + var7, var8 + var12, 1, ((ug) this).field_e);
            break L2;
          } else {
            break L2;
          }
        }
        vj.b(var7, var8, 2, 1);
        var9 = (double)var14.field_L * 3.141592653589793 * 2.0 / (double)var14.field_N;
        var11 = (int)(-Math.sin(var9) * (double)var14.field_H);
        var12 = (int)(Math.cos(var9) * (double)var14.field_H);
        if (param2 != 11447) {
          L3: {
            ((ug) this).field_f = -46;
            vj.e(var7, var8, var11 + var7, var12 + var8, 1);
            if (((ug) this).field_c != null) {
              var13 = ((ug) this).field_a + (var14.field_H + var14.field_E);
              int discarded$2 = ((ug) this).field_c.a(param1.field_r, param1.field_o + param0 + var13, ((ug) this).field_d + param3 + param1.field_i, param1.field_h - var13 + -((ug) this).field_a, -(((ug) this).field_a << -273569375) + param1.field_q, ((ug) this).field_b, ((ug) this).field_f, 1, 1, 0);
              break L3;
            } else {
              break L3;
            }
          }
          return;
        } else {
          L4: {
            vj.e(var7, var8, var11 + var7, var12 + var8, 1);
            if (((ug) this).field_c != null) {
              var13 = ((ug) this).field_a + (var14.field_H + var14.field_E);
              int discarded$3 = ((ug) this).field_c.a(param1.field_r, param1.field_o + param0 + var13, ((ug) this).field_d + param3 + param1.field_i, param1.field_h - var13 + -((ug) this).field_a, -(((ug) this).field_a << -273569375) + param1.field_q, ((ug) this).field_b, ((ug) this).field_f, 1, 1, 0);
              break L4;
            } else {
              break L4;
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = -1;
    }
}
