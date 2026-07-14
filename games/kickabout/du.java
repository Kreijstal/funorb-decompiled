/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class du implements gj {
    private int field_d;
    static int field_a;
    private int field_c;
    static int field_e;
    static int field_k;
    static ut field_i;
    private hu field_m;
    static hd field_f;
    static int field_j;
    private int field_l;
    private int field_h;
    private int field_o;
    static String field_g;
    private int field_b;
    static int field_n;

    public final void a(int param0, boolean param1, int param2, fd param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        nv var13 = null;
        fd stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        fd stackOut_1_0 = null;
        L0: {
          var12 = Kickabout.field_G;
          if (!(param3 instanceof nv)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (fd) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (fd) param3;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var13 = (nv) (Object) stackIn_3_0;
          on.a(param3.field_t + param4, param3.field_g + param2, param3.field_n, param3.field_i, ((du) this).field_b);
          if (var13 != null) {
            break L1;
          } else {
            break L1;
          }
        }
        var7 = param3.field_n - var13.field_H * 2;
        var8 = var13.field_H + param4 + param3.field_t;
        var9 = var13.field_J + (param2 + param3.field_g);
        on.b(var8, var9, var8 + var7, var9, ((du) this).field_h);
        var10 = 47 / ((59 - param0) / 53);
        var11 = var13.a((byte) 31) + -1;
        L2: while (true) {
          if (0 > var11) {
            if (null != ((du) this).field_m) {
              ((du) this).field_m.d(var13.field_q, var8 + var7 / 2, var13.field_J + ((du) this).field_m.field_x + var9, ((du) this).field_c, ((du) this).field_o);
              return;
            } else {
              return;
            }
          } else {
            on.d(var13.a((byte) -120, var11) * var7 / var13.h((byte) -88) + var8, var9, ((du) this).field_d, ((du) this).field_l);
            var11--;
            continue L2;
          }
        }
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 != -24229) {
            return;
        }
        field_g = null;
        field_i = null;
    }

    du(hu param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((du) this).field_b = param4;
        ((du) this).field_m = param0;
        ((du) this).field_o = param2;
        ((du) this).field_h = param3;
        ((du) this).field_c = param1;
        ((du) this).field_l = param6;
        ((du) this).field_d = param5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 0;
        field_g = "spectate";
    }
}
