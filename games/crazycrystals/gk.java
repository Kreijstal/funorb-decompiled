/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk implements wo {
    private int field_f;
    private int field_b;
    static e field_e;
    static ko field_j;
    static dl[] field_d;
    private int field_i;
    private int field_l;
    private vc field_h;
    private int field_a;
    static String[] field_k;
    private int field_g;
    private int field_c;

    public final void a(int param0, boolean param1, int param2, qm param3, boolean param4) {
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        pa var14 = null;
        qm stackIn_3_0 = null;
        qm stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          if (param3 instanceof pa) {
            stackOut_2_0 = (qm) param3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (qm) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var14 = (pa) (Object) stackIn_3_0;
          kh.f(param3.field_r + param2, param0 - -param3.field_j, param3.field_g, param3.field_f, ((gk) this).field_i);
          if (var14 == null) {
            break L1;
          } else {
            break L1;
          }
        }
        var7 = param3.field_r + param2 - -var14.field_J;
        if (param1) {
          return;
        } else {
          L2: {
            var8 = param0 - (-param3.field_j - var14.field_K);
            kh.b(var7, var8, var14.field_I, ((gk) this).field_f);
            if (0 != (var14.field_C ^ -1)) {
              var9 = (double)var14.field_C * 3.141592653589793 * 2.0 / (double)var14.field_D;
              var11 = (int)(-Math.sin(var9) * (double)var14.field_I);
              var12 = (int)(Math.cos(var9) * (double)var14.field_I);
              kh.b(var11 + var7, var12 + var8, 1, ((gk) this).field_b);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            kh.b(var7, var8, 2, 1);
            var9 = (double)var14.field_B * 3.141592653589793 * 2.0 / (double)var14.field_D;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_I);
            var12 = (int)(Math.cos(var9) * (double)var14.field_I);
            kh.e(var7, var8, var11 + var7, var8 + var12, 1);
            if (((gk) this).field_h != null) {
              var13 = ((gk) this).field_g + var14.field_I + var14.field_J;
              int discarded$1 = ((gk) this).field_h.a(param3.field_o, var13 + param2 + param3.field_r, param3.field_j + (param0 + ((gk) this).field_a), param3.field_g + -((gk) this).field_g + -var13, -(((gk) this).field_g << 1659925281) + param3.field_f, ((gk) this).field_c, ((gk) this).field_l, 1, 1, 0);
              break L3;
            } else {
              break L3;
            }
          }
          return;
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_k = null;
        if (param0 > -95) {
          gk.a(-93);
          field_j = null;
          field_d = null;
          return;
        } else {
          field_j = null;
          field_d = null;
          return;
        }
    }

    gk(vc param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((gk) this).field_g = param1;
        ((gk) this).field_f = param5;
        ((gk) this).field_i = param7;
        ((gk) this).field_h = param0;
        ((gk) this).field_b = param6;
        ((gk) this).field_a = param2;
        ((gk) this).field_l = param4;
        ((gk) this).field_c = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
