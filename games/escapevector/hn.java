/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hn implements db {
    private int field_a;
    private int field_p;
    private int field_m;
    private int field_j;
    static mf field_h;
    static ig field_l;
    private int field_g;
    static hf field_q;
    static String field_f;
    private int field_e;
    static boolean field_n;
    private int field_k;
    private wl field_o;
    private int field_d;
    private int field_i;
    static int field_s;
    static ed field_c;
    private int field_r;
    private int field_t;
    static byte[][] field_b;

    final static int a(ih param0, int param1) {
        String var2 = null;
        int var3 = 0;
        if (param1 != 0) {
          field_b = null;
          var2 = " ";
          var3 = param0.b(var2);
          return var3;
        } else {
          var2 = " ";
          var3 = param0.b(var2);
          return var3;
        }
    }

    public final void a(int param0, int param1, int param2, hm param3, boolean param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        bo var11 = null;
        hm stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        hm stackOut_1_0 = null;
        L0: {
          if (!(param3 instanceof bo)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (hm) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (hm) param3;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var11 = (bo) (Object) stackIn_3_0;
          if (var11 != null) {
            param4 = param4 & var11.field_y;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var7 = 5592405;
          em.a(param0 + param3.field_k, param1 + param3.field_j, param3.field_g, param3.field_x, ((hn) this).field_t);
          if (param4) {
            var7 = 16777215;
            break L2;
          } else {
            break L2;
          }
        }
        var8 = param3.field_k + param0 - -((hn) this).field_e;
        if (param2 > -14) {
          return;
        } else {
          L3: {
            var9 = ((hn) this).field_r + (param3.field_j + param1);
            em.e(var8, var9, ((hn) this).field_a, ((hn) this).field_k, 5592405);
            em.a(var8, var9, ((hn) this).field_a, ((hn) this).field_k, var7);
            if (var11.field_z) {
              em.d(var8, var9, var8 + ((hn) this).field_a, ((hn) this).field_k + var9, 1);
              em.d(var8 + ((hn) this).field_a, var9, var8, ((hn) this).field_k + var9, 1);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (((hn) this).field_o == null) {
              break L4;
            } else {
              var10 = ((hn) this).field_e + (((hn) this).field_a + ((hn) this).field_g);
              int discarded$1 = ((hn) this).field_o.a(param3.field_l, var10 + param0 + param3.field_k, ((hn) this).field_m + param3.field_j + param1, param3.field_g - (var10 + ((hn) this).field_g), -(((hn) this).field_g << -1089808351) + param3.field_x, ((hn) this).field_i, ((hn) this).field_d, ((hn) this).field_p, ((hn) this).field_j, 0);
              break L4;
            }
          }
          return;
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_f = null;
        if (param0 != -44) {
            return;
        }
        field_h = null;
        field_l = null;
        field_q = null;
        field_c = null;
    }

    hn(wl param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((hn) this).field_p = 1;
        ((hn) this).field_j = 1;
        ((hn) this).field_m = param2;
        ((hn) this).field_k = param7;
        ((hn) this).field_a = param8;
        ((hn) this).field_r = param6;
        ((hn) this).field_i = param3;
        ((hn) this).field_o = param0;
        ((hn) this).field_g = param1;
        ((hn) this).field_d = param4;
        ((hn) this).field_t = param9;
        ((hn) this).field_e = param5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Time: ";
        field_q = new hf();
    }
}
