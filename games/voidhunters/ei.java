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
        field_c = null;
        field_e = null;
        field_i = null;
        field_f = null;
    }

    public final void a(int param0, shb param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        ata var15 = null;
        shb stackIn_3_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        shb stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param1 instanceof ata) {
                stackOut_2_0 = (shb) param1;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (shb) (Object) stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var15 = (ata) (Object) stackIn_3_0;
              dma.d(param1.field_g + param2, param1.field_r + param3, param1.field_h, param1.field_f, ((ei) this).field_h);
              if (var15 == null) {
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var7 = var15.field_J + param2 - -param1.field_g;
              var9 = 127 / ((-27 - param0) / 35);
              var8 = var15.field_B + (param1.field_r + param3);
              dma.f(var7, var8, var15.field_F, ((ei) this).field_m);
              if (var15.field_E != -1) {
                var10 = 3.141592653589793 * (double)var15.field_E * 2.0 / (double)var15.field_I;
                var12 = (int)(-Math.sin(var10) * (double)var15.field_F);
                var13 = (int)(Math.cos(var10) * (double)var15.field_F);
                dma.f(var12 + var7, var8 - -var13, 1, ((ei) this).field_d);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              dma.f(var7, var8, 2, 1);
              var10 = 2.0 * (3.141592653589793 * (double)var15.field_D) / (double)var15.field_I;
              var12 = (int)(-Math.sin(var10) * (double)var15.field_F);
              var13 = (int)(Math.cos(var10) * (double)var15.field_F);
              dma.a(var7, var8, var7 - -var12, var8 + var13, 1);
              if (null == ((ei) this).field_j) {
                break L4;
              } else {
                var14 = var15.field_J + var15.field_F + ((ei) this).field_k;
                int discarded$1 = ((ei) this).field_j.a(param1.field_j, var14 + param1.field_g + param2, param1.field_r + (param3 - -((ei) this).field_g), param1.field_h - var14 - ((ei) this).field_k, -(((ei) this).field_k << 1) + param1.field_f, ((ei) this).field_l, ((ei) this).field_b, 1, 1, 0);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var6;
            stackOut_10_1 = new StringBuilder().append("ei.A(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    ei(no param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            ((ei) this).field_m = param5;
            ((ei) this).field_g = param2;
            ((ei) this).field_b = param4;
            ((ei) this).field_k = param1;
            ((ei) this).field_h = param7;
            ((ei) this).field_d = param6;
            ((ei) this).field_l = param3;
            ((ei) this).field_j = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "ei.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
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
