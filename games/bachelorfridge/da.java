/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da {
    static String[] field_a;
    static q field_c;
    static nv field_d;
    static String field_b;

    final static void a(int param0, int param1, int param2, kv param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            L1: {
              param0 = param0 + param3.field_t;
              param1 = param1 + param3.field_u;
              var4_int = param1 * dg.field_i + param0;
              var5 = 0;
              var6 = param3.field_p;
              var7 = param3.field_q;
              var8 = -var7 + dg.field_i;
              var9 = 0;
              if (param1 < dg.field_j) {
                var10 = -param1 + dg.field_j;
                var6 = var6 - var10;
                var4_int = var4_int + var10 * dg.field_i;
                param1 = dg.field_j;
                var5 = var5 + var7 * var10;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param2 <= -12) {
                break L2;
              } else {
                field_b = null;
                break L2;
              }
            }
            L3: {
              if (var6 + param1 > dg.field_k) {
                var6 = var6 - (-dg.field_k + (param1 + var6));
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param0 < dg.field_f) {
                var10 = dg.field_f + -param0;
                var4_int = var4_int + var10;
                var8 = var8 + var10;
                var7 = var7 - var10;
                var5 = var5 + var10;
                param0 = dg.field_f;
                var9 = var9 + var10;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (dg.field_h >= param0 + var7) {
                break L5;
              } else {
                var10 = -dg.field_h + var7 + param0;
                var9 = var9 + var10;
                var7 = var7 - var10;
                var8 = var8 + var10;
                break L5;
              }
            }
            L6: {
              if (var7 <= 0) {
                break L6;
              } else {
                if (0 >= var6) {
                  break L6;
                } else {
                  dk.a(0, 0, var7, dg.field_e, var8, var9, 0, var4_int, param3.field_v, 455530063, var5, 0, var6);
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4;
            stackOut_19_1 = new StringBuilder().append("da.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_a = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
    }
}
