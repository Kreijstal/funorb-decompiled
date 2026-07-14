/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn implements ur {
    private int field_e;
    private int field_c;
    static ed[][] field_h;
    private cc field_b;
    private int field_j;
    private int field_d;
    private int field_n;
    private int field_i;
    private int field_o;
    static lg field_p;
    static String field_m;
    private int field_f;
    private int field_g;
    static String field_a;
    private int field_k;
    private int field_l;

    public final void a(boolean param0, int param1, boolean param2, iq param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ck var11 = null;
        iq stackIn_3_0 = null;
        iq stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          if (param3 instanceof ck) {
            stackOut_2_0 = (iq) param3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (iq) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var11 = (ck) (Object) stackIn_3_0;
          if (var11 != null) {
            param0 = param0 & var11.field_F;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var7 = 5592405;
          bi.b(param1 - -param3.field_o, param3.field_t + param4, param3.field_n, param3.field_s, ((kn) this).field_k);
          if (!param0) {
            break L2;
          } else {
            var7 = 16777215;
            break L2;
          }
        }
        L3: {
          var8 = ((kn) this).field_i + (param1 - -param3.field_o);
          var9 = ((kn) this).field_c + (param3.field_t + param4);
          bi.f(var8, var9, ((kn) this).field_d, ((kn) this).field_f, 5592405);
          bi.b(var8, var9, ((kn) this).field_d, ((kn) this).field_f, var7);
          if (var11.field_G) {
            bi.a(var8, var9, var8 - -((kn) this).field_d, ((kn) this).field_f + var9, 1);
            bi.a(((kn) this).field_d + var8, var9, var8, var9 + ((kn) this).field_f, 1);
            break L3;
          } else {
            break L3;
          }
        }
        if (!param2) {
          L4: {
            kn.a(true);
            if (null == ((kn) this).field_b) {
              break L4;
            } else {
              var10 = ((kn) this).field_d + (((kn) this).field_i + ((kn) this).field_n);
              int discarded$2 = ((kn) this).field_b.a(param3.field_w, var10 + (param1 + param3.field_o), ((kn) this).field_g + param4 + param3.field_t, param3.field_n - (var10 - -((kn) this).field_n), -(((kn) this).field_n << 2029325761) + param3.field_s, ((kn) this).field_e, ((kn) this).field_j, ((kn) this).field_o, ((kn) this).field_l, 0);
              break L4;
            }
          }
          return;
        } else {
          L5: {
            if (null == ((kn) this).field_b) {
              break L5;
            } else {
              var10 = ((kn) this).field_d + (((kn) this).field_i + ((kn) this).field_n);
              int discarded$3 = ((kn) this).field_b.a(param3.field_w, var10 + (param1 + param3.field_o), ((kn) this).field_g + param4 + param3.field_t, param3.field_n - (var10 - -((kn) this).field_n), -(((kn) this).field_n << 2029325761) + param3.field_s, ((kn) this).field_e, ((kn) this).field_j, ((kn) this).field_o, ((kn) this).field_l, 0);
              break L5;
            }
          }
          return;
        }
    }

    public static void a(boolean param0) {
        field_p = null;
        field_m = null;
        field_h = null;
        field_a = null;
        if (!param0) {
            field_a = null;
        }
    }

    kn(cc param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((kn) this).field_o = 1;
        ((kn) this).field_l = 1;
        ((kn) this).field_d = param8;
        ((kn) this).field_n = param1;
        ((kn) this).field_j = param4;
        ((kn) this).field_b = param0;
        ((kn) this).field_i = param5;
        ((kn) this).field_g = param2;
        ((kn) this).field_f = param7;
        ((kn) this).field_e = param3;
        ((kn) this).field_c = param6;
        ((kn) this).field_k = param9;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new ed[][]{new ed[50], new ed[30], new ed[40], new ed[50]};
        field_a = "You have <%0> unread messages!";
        field_m = "This password contains your Player Name, and would be easy to guess";
    }
}
