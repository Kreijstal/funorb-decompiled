/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd {
    static String[] field_c;
    static cj field_a;
    static int field_b;

    public static void a(int param0) {
        field_c = null;
        if (param0 != 2791) {
          return;
        }
        field_a = null;
    }

    final static int a(CharSequence param0, int param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var2_int = param0.length();
          var3 = 0;
          var4 = 96 / ((65 - param1) / 49);
          for (var5 = 0; var2_int > var5; var5++) {
            var3 = bd.a(param0.charAt(var5), (byte) -68) + (-var3 + (var3 << 5));
          }
          stackIn_5_0 = var3;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("kd.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_c = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_b = 0;
    }
}
