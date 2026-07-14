/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei implements wwa {
    private int field_b;
    private int field_k;
    private int field_g;
    static ae field_c;
    private int field_l;
    private int field_h;
    private int field_d;
    private int field_m;
    static String field_f;
    static String field_e;
    static String[] field_i;
    private no field_j;
    static int field_a;

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_c = null;
        field_e = null;
        field_i = null;
        field_f = null;
    }

    public final void a(int param0, shb param1, int param2, int param3, boolean param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        ata var15 = null;
        shb stackIn_3_0 = null;
        shb stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          if (param1 instanceof ata) {
            stackOut_2_0 = (shb) param1;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (shb) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var15 = (ata) (Object) stackIn_3_0;
          dma.d(param1.field_g + param2, param1.field_r + param3, param1.field_h, param1.field_f, ((ei) this).field_h);
          if (var15 == null) {
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var7 = var15.field_J + param2 - -param1.field_g;
          var9 = 127 / ((-27 - param0) / 35);
          var8 = var15.field_B + (param1.field_r + param3);
          dma.f(var7, var8, var15.field_F, ((ei) this).field_m);
          if ((var15.field_E ^ -1) != 0) {
            var10 = 3.141592653589793 * (double)var15.field_E * 2.0 / (double)var15.field_I;
            var12 = (int)(-Math.sin(var10) * (double)var15.field_F);
            var13 = (int)(Math.cos(var10) * (double)var15.field_F);
            dma.f(var12 + var7, var8 - -var13, 1, ((ei) this).field_d);
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          dma.f(var7, var8, 2, 1);
          var10 = 2.0 * (3.141592653589793 * (double)var15.field_D) / (double)var15.field_I;
          var12 = (int)(-Math.sin(var10) * (double)var15.field_F);
          var13 = (int)(Math.cos(var10) * (double)var15.field_F);
          dma.a(var7, var8, var7 - -var12, var8 + var13, 1);
          if (null == ((ei) this).field_j) {
            break L3;
          } else {
            var14 = var15.field_J + var15.field_F + ((ei) this).field_k;
            int discarded$1 = ((ei) this).field_j.a(param1.field_j, var14 + param1.field_g + param2, param1.field_r + (param3 - -((ei) this).field_g), param1.field_h - var14 - ((ei) this).field_k, -(((ei) this).field_k << -1386778239) + param1.field_f, ((ei) this).field_l, ((ei) this).field_b, 1, 1, 0);
            break L3;
          }
        }
    }

    ei(no param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((ei) this).field_m = param5;
        ((ei) this).field_g = param2;
        ((ei) this).field_b = param4;
        ((ei) this).field_k = param1;
        ((ei) this).field_h = param7;
        ((ei) this).field_d = param6;
        ((ei) this).field_l = param3;
        ((ei) this).field_j = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new ae(1);
        field_f = "Rotate the mouse wheel or press plus & minus to zoom the camera";
        field_e = "Unable to delete friend - system busy";
        field_i = new String[]{"gametype_icons"};
        field_a = 500;
    }
}
