/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei {
    static String[] field_a;

    public static void a(byte param0) {
        field_a = null;
    }

    final static void a(boolean param0, int param1, am param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        hj var7 = null;
        hj var8 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var7 = ff.field_D;
            var8 = var7;
            var8.a(false, 3);
            var8.field_h = var8.field_h + 1;
            var4 = var8.field_h;
            var8.f(6389, 1);
            var8.c(param2.field_p, -159688920);
            var8.c(param2.field_j, -159688920);
            var8.c(param2.field_i, -159688920);
            var8.a(-117, param2.field_g);
            var8.a(-124, param2.field_k);
            var8.a(-119, param2.field_h);
            var8.a(-119, param2.field_l);
            var8.f(6389, param2.field_m.length);
            var5 = 0;
            L1: while (true) {
              if (var5 >= param2.field_m.length) {
                int discarded$1 = var8.d(var4, -1323322296);
                var8.a((byte) -42, var8.field_h - var4);
                break L0;
              } else {
                var7.a(-117, param2.field_m[var5]);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("ei.B(").append(true).append(',').append(3).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
