/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb {
    private String field_b;
    static String[] field_c;
    private boolean field_g;
    static of field_a;
    static String field_f;
    static String field_e;
    static int field_d;

    final String a(byte param0) {
        if (param0 >= -48) {
            return null;
        }
        return ((hb) this).field_b;
    }

    final boolean a(int param0) {
        if (param0 != 0) {
            ((hb) this).field_b = null;
            return ((hb) this).field_g;
        }
        return ((hb) this).field_g;
    }

    hb(String param0, boolean param1) {
        RuntimeException var3 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              ((hb) this).field_b = param0;
              if (null != ((hb) this).field_b) {
                break L1;
              } else {
                ((hb) this).field_b = "";
                break L1;
              }
            }
            L2: {
              stackOut_3_0 = this;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (!param1) {
                stackOut_5_0 = this;
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L2;
              } else {
                stackOut_4_0 = this;
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L2;
              }
            }
            ((hb) this).field_g = stackIn_6_1 != 0;
            if (0 != ((hb) this).field_b.length()) {
              break L0;
            } else {
              ((hb) this).field_g = false;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("hb.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 41);
        }
    }

    hb(String param0) {
        this(param0, false);
    }

    final static String c(int param0) {
        String var1 = "";
        if (!(ao.field_c == null)) {
            var1 = ao.field_c.e(false);
        }
        if (0 == var1.length()) {
            var1 = bd.a(6);
        }
        if (var1.length() == 0) {
            var1 = pm.field_a;
        }
        return var1;
    }

    public static void b(int param0) {
        field_c = null;
        field_a = null;
        field_e = null;
        field_f = null;
        if (param0 >= -107) {
            field_f = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_a = new of(1);
        field_f = "Please select an option in the '<%0>' row.";
        field_e = "<%0> has dropped out.";
    }
}
