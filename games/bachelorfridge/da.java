/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da {
    static String[] field_a;
    static q field_c;
    static nv field_d;
    static String field_b;

    final static void a(int param0, int param1, int param2, kv param3) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        try {
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
          }
          if (param2 > -12) {
            field_b = (String) null;
          }
          if (var6 + param1 > dg.field_k) {
            var6 = var6 - (-dg.field_k + (param1 + var6));
          }
          if (param0 < dg.field_f) {
            var10Lifetime1 = dg.field_f - param0;
            var4_int = var4_int + var10Lifetime1;
            var8 = var8 + var10Lifetime1;
            var7 = var7 - var10Lifetime1;
            var5 = var5 + var10Lifetime1;
            param0 = dg.field_f;
            var9 = var9 + var10Lifetime1;
          }
          if (dg.field_h < param0 + var7) {
            var10Lifetime2 = -dg.field_h + var7 + param0;
            var9 = var9 + var10Lifetime2;
            var7 = var7 - var10Lifetime2;
            var8 = var8 + var10Lifetime2;
          }
          if (var7 > 0 &&
            0 < var6) {
            dk.a(0, 0, var7, dg.field_e, var8, var9, 0, var4_int, param3.field_v, 455530063, var5, 0, var6);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("da.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 >= -11) {
          field_d = (nv) null;
        }
    }

    static {
        field_a = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
    }
}
