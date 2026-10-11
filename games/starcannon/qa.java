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
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          uh.field_k = s.field_f;
          if (param0 == 255) {
            stackIn_9_0 = !(qb.field_a >= 13);
            gj.field_a = cf.a(stackIn_9_0, false);
          } else {
            if (param0 < 100) {
              gj.field_a = fb.a(param2, param0, 0);
            } else {
              if (105 < param0) {
                gj.field_a = fb.a(param2, param0, 0);
              } else {
                gj.field_a = hc.a(param1, 0);
              }
            }
          }
          if (param3 >= 24) {
            return;
          }
          field_a = (qb) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("qa.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 == -5504) {
          field_b = null;
          field_a = null;
          field_d = null;
          return;
        }
        qa.a(100);
        field_b = null;
        field_a = null;
        field_d = null;
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
