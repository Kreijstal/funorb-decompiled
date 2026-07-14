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
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        StringBuilder var13 = null;
        StringBuilder var14 = null;
        var12 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var4 = param0.length();
        var5 = param3.length();
        var6 = var4;
        var7 = var5 + -1;
        if (0 != var7) {
          var8_int = 0;
          L0: while (true) {
            var8_int = param0.indexOf((int) param2, var8_int);
            if (var8_int >= 0) {
              var6 = var6 + var7;
              var8_int++;
              continue L0;
            } else {
              var14 = new StringBuilder(var6);
              var8 = var14;
              var10 = 115 / ((87 - param1) / 34);
              var9 = 0;
              L1: while (true) {
                var11 = param0.indexOf((int) param2, var9);
                if (-1 < (var11 ^ -1)) {
                  StringBuilder discarded$6 = var14.append(param0.substring(var9));
                  return var14.toString();
                } else {
                  StringBuilder discarded$7 = var14.append(param0.substring(var9, var11));
                  StringBuilder discarded$8 = var14.append(param3);
                  var9 = var11 + 1;
                  continue L1;
                }
              }
            }
          }
        } else {
          var13 = new StringBuilder(var6);
          var10 = 115 / ((87 - param1) / 34);
          var9 = 0;
          L2: while (true) {
            var11 = param0.indexOf((int) param2, var9);
            if (-1 < (var11 ^ -1)) {
              StringBuilder discarded$9 = var13.append(param0.substring(var9));
              return var13.toString();
            } else {
              StringBuilder discarded$10 = var13.append(param0.substring(var9, var11));
              StringBuilder discarded$11 = var13.append(param3);
              var9 = var11 + 1;
              continue L2;
            }
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_f = null;
        field_h = null;
        field_g = null;
        field_i = null;
        field_c = null;
        if (param0 != 1) {
          return;
        } else {
          field_d = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new he[3][];
        field_g = new long[32];
        field_i = "log in or create a free account.";
        field_d = "to keep fullscreen or";
        field_f = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
    }
}
