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
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var12 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param0.length();
              var5 = param3.length();
              var6 = var4_int;
              var7 = var5 + -1;
              if (0 != var7) {
                var8_int = 0;
                L2: while (true) {
                  var8_int = param0.indexOf((int) param2, var8_int);
                  if (var8_int >= 0) {
                    var6 = var6 + var7;
                    var8_int++;
                    continue L2;
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            var8 = new StringBuilder(var6);
            var10 = 115 / ((87 - param1) / 34);
            var9 = 0;
            L3: while (true) {
              var11 = param0.indexOf((int) param2, var9);
              if (-1 < (var11 ^ -1)) {
                discarded$0 = var8.append(param0.substring(var9));
                stackIn_11_0 = var8.toString();
                break L0;
              } else {
                discarded$1 = var8.append(param0.substring(var9, var11));
                discarded$2 = var8.append(param3);
                var9 = var11 + 1;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("ph.A(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ')');
        }
        return stackIn_11_0;
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_f = null;
        field_h = null;
        field_g = null;
        field_i = null;
        field_c = (he[][]) null;
        if (param0 != 1) {
          return;
        } else {
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
