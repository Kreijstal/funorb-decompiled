/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa {
    static String[] field_d;
    static qb field_a;
    static gg field_b;
    static boolean field_e;
    static int field_c;

    final static void a(int param0, String[] param1, String param2, byte param3) {
        int stackIn_9_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              uh.field_k = s.field_f;
              if ((param0 ^ -1) == -256) {
                L2: {
                  if (-14 >= (qb.field_a ^ -1)) {
                    stackIn_9_0 = 0;
                    break L2;
                  } else {
                    stackIn_9_0 = 1;
                    break L2;
                  }
                }
                gj.field_a = cf.a(stackIn_9_0 != 0, false);
                break L1;
              } else {
                if (-101 < (param0 ^ -1)) {
                  gj.field_a = fb.a(param2, param0, 0);
                  break L1;
                } else {
                  if (105 < param0) {
                    gj.field_a = fb.a(param2, param0, 0);
                    break L1;
                  } else {
                    gj.field_a = hc.a(param1, 0);
                    break L1;
                  }
                }
              }
            }
            if (param3 >= 24) {
              break L0;
            } else {
              field_a = (qb) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("qa.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param3 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != -5504) {
          qa.a(100);
          field_b = null;
          field_a = null;
          field_d = null;
          return;
        } else {
          field_b = null;
          field_a = null;
          field_d = null;
          return;
        }
    }

    final static void a(byte param0, String param1) {
        try {
            if (param0 >= -101) {
                String var3 = (String) null;
                qa.a((byte) 93, (String) null);
            }
            jk.field_b = param1;
            fd.a(12, 0);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "qa.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
