/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb implements uk {
    private int field_r;
    private int field_j;
    private int field_p;
    static String[] field_k;
    private int field_o;
    private int field_e;
    private int field_a;
    static int field_d;
    static String field_h;
    private int field_q;
    private int field_b;
    private bd field_g;
    static li field_m;
    private int field_n;
    private int field_i;
    static String field_l;
    static String field_f;
    private int field_c;

    public static void a(boolean param0) {
        field_h = null;
        field_f = null;
        field_l = null;
        field_k = null;
        if (param0) {
            bb.a(true);
            field_m = null;
            return;
        }
        field_m = null;
    }

    public final void a(boolean param0, int param1, int param2, rj param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        nd var11 = null;
        rj stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        rj stackOut_1_0 = null;
        L0: {
          if (!(param3 instanceof nd)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (rj) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (rj) param3;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var11 = (nd) (Object) stackIn_3_0;
          if (var11 == null) {
            break L1;
          } else {
            param0 = param0 & var11.field_E;
            break L1;
          }
        }
        L2: {
          var7 = 5592405;
          if (!param0) {
            break L2;
          } else {
            var7 = 16777215;
            break L2;
          }
        }
        ti.f(param3.field_w + param1, param3.field_k + param2, param3.field_p, param3.field_t, ((bb) this).field_i);
        var8 = param1 + (param3.field_w + ((bb) this).field_e);
        if (param4 != 4549) {
          L3: {
            field_h = null;
            var9 = param2 + (param3.field_k - -((bb) this).field_j);
            ti.e(var8, var9, ((bb) this).field_b, ((bb) this).field_r, 5592405);
            ti.f(var8, var9, ((bb) this).field_b, ((bb) this).field_r, var7);
            if (var11.field_z) {
              ti.a(var8, var9, var8 + ((bb) this).field_b, var9 - -((bb) this).field_r, 1);
              ti.a(var8 + ((bb) this).field_b, var9, var8, ((bb) this).field_r + var9, 1);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (((bb) this).field_g == null) {
              break L4;
            } else {
              var10 = ((bb) this).field_q + (((bb) this).field_e + ((bb) this).field_b);
              int discarded$2 = ((bb) this).field_g.a(param3.field_m, param1 - (-param3.field_w - var10), param2 - -param3.field_k - -((bb) this).field_c, param3.field_p - (var10 + ((bb) this).field_q), -(((bb) this).field_q << -1731581439) + param3.field_t, ((bb) this).field_o, ((bb) this).field_a, ((bb) this).field_n, ((bb) this).field_p, 0);
              break L4;
            }
          }
          return;
        } else {
          L5: {
            var9 = param2 + (param3.field_k - -((bb) this).field_j);
            ti.e(var8, var9, ((bb) this).field_b, ((bb) this).field_r, 5592405);
            ti.f(var8, var9, ((bb) this).field_b, ((bb) this).field_r, var7);
            if (var11.field_z) {
              ti.a(var8, var9, var8 + ((bb) this).field_b, var9 - -((bb) this).field_r, 1);
              ti.a(var8 + ((bb) this).field_b, var9, var8, ((bb) this).field_r + var9, 1);
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            if (((bb) this).field_g == null) {
              break L6;
            } else {
              var10 = ((bb) this).field_q + (((bb) this).field_e + ((bb) this).field_b);
              int discarded$3 = ((bb) this).field_g.a(param3.field_m, param1 - (-param3.field_w - var10), param2 - -param3.field_k - -((bb) this).field_c, param3.field_p - (var10 + ((bb) this).field_q), -(((bb) this).field_q << -1731581439) + param3.field_t, ((bb) this).field_o, ((bb) this).field_a, ((bb) this).field_n, ((bb) this).field_p, 0);
              break L6;
            }
          }
          return;
        }
    }

    final static nf a(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6, int param7, int param8) {
        nf var9 = null;
        var9 = new nf(param0, param6, param3, param1, param8, param2, param5);
        wb.field_f.b(-113, (gg) (Object) var9);
        if (param7 != 0) {
          return null;
        } else {
          ea.a(param4, var9, (byte) 80);
          return var9;
        }
    }

    bb(bd param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((bb) this).field_p = 1;
        ((bb) this).field_n = 1;
        ((bb) this).field_e = param5;
        ((bb) this).field_r = param7;
        ((bb) this).field_a = param4;
        ((bb) this).field_g = param0;
        ((bb) this).field_i = param9;
        ((bb) this).field_j = param6;
        ((bb) this).field_q = param1;
        ((bb) this).field_c = param2;
        ((bb) this).field_b = param8;
        ((bb) this).field_o = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Orb points: <%0>";
        field_l = "Cancel";
        field_m = new li(8, 0, 4, 1);
        field_f = "Press escape for menu";
    }
}
