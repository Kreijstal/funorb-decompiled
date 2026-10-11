/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph {
    static String field_i;
    static he field_h;
    static String[] field_f;
    static String field_d;
    static vj field_b;
    static long[] field_g;
    static he[][] field_c;
    static int field_e;
    static he[] field_a;

    final static String a(String param0, byte param1, char param2, String param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        int var12 = 0;
        String stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var12 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var4_int = param0.length();
          var5 = param3.length();
          var6 = var4_int;
          var7 = var5 - 1;
          if (0 != var7) {
            var8_int = 0;
            while (true) {
              var8_int = param0.indexOf((int) param2, var8_int);
              if (var8_int < 0) {
                break;
              }
              var6 = var6 + var7;
              var8_int++;
            }
          }
          var8 = new StringBuilder(var6);
          var10 = 115 / ((87 - param1) / 34);
          var9 = 0;
          while (true) {
            var11 = param0.indexOf((int) param2, var9);
            if (var11 < 0) {
              discarded$0 = var8.append(param0.substring(var9));
              stackIn_11_0 = var8.toString();
              return stackIn_11_0;
            }
            discarded$1 = var8.append(param0.substring(var9, var11));
            discarded$2 = var8.append(param3);
            var9 = var11 + 1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("ph.A(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_f = null;
        field_h = null;
        field_g = null;
        field_i = null;
        field_c = (he[][]) null;
        if (param0 == 1) {
          field_d = null;
          return;
        }
    }

    static {
        field_c = new he[3][];
        field_g = new long[32];
        field_i = "log in or create a free account.";
        field_d = "to keep fullscreen or";
        field_f = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
    }
}
