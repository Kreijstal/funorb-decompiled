/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei {
    static String[] field_a;

    public static void a(byte param0) {
        field_a = null;
        if (param0 >= -50) {
            am var2 = (am) null;
            ei.a(true, -72, (am) null);
        }
    }

    final static void a(boolean param0, int param1, am param2) {
        int discarded$1 = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        hj var7 = null;
        hj var8 = null;
        hj stackIn_2_0 = null;
        hj stackIn_3_0 = null;
        hj stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        hj stackOut_1_0 = null;
        hj stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        hj stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var7 = ff.field_D;
              var8 = var7;
              stackOut_1_0 = (hj) (var8);
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (param0) {
                stackOut_3_0 = (hj) ((Object) stackIn_3_0);
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = (hj) ((Object) stackIn_2_0);
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((hj) (Object) stackIn_4_0).a(stackIn_4_1 != 0, param1);
              var8.field_h = var8.field_h + 1;
              var4 = var8.field_h;
              var8.f(6389, 1);
              var8.c(param2.field_p, -159688920);
              var8.c(param2.field_j, -159688920);
              var8.c(param2.field_i, -159688920);
              var8.a(-117, param2.field_g);
              if (param0) {
                break L2;
              } else {
                field_a = (String[]) null;
                break L2;
              }
            }
            var8.a(-124, param2.field_k);
            var8.a(-119, param2.field_h);
            var8.a(-119, param2.field_l);
            var8.f(6389, param2.field_m.length);
            var5 = 0;
            L3: while (true) {
              L4: {
                L5: {
                  if (var5 >= param2.field_m.length) {
                    break L5;
                  } else {
                    var7.a(-117, param2.field_m[var5]);
                    var5++;
                    if (var6 != 0) {
                      break L4;
                    } else {
                      if (var6 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                discarded$1 = var8.d(var4, -1323322296);
                var8.a((byte) -42, var8.field_h - var4);
                break L4;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3);
            stackOut_13_1 = new StringBuilder().append("ei.B(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    static {
        field_a = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
