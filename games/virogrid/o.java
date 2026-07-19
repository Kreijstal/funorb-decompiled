/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class o {
    static String field_c;
    static int[] field_d;
    static String field_a;
    static String[] field_b;
    static String field_f;
    static int field_e;

    final static void a(int param0, byte param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        hn var4 = null;
        oc var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 >= 23) {
                break L1;
              } else {
                field_f = (String) null;
                break L1;
              }
            }
            var4 = (hn) ((Object) qn.field_P.a((byte) -49));
            L2: while (true) {
              if (var4 == null) {
                var5 = (oc) ((Object) fn.field_a.a((byte) -27));
                L3: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    ak.a(-26039, var5, param0);
                    var5 = (oc) ((Object) fn.field_a.a(16213));
                    continue L3;
                  }
                }
              } else {
                ra.a(param0, 1, var4);
                var4 = (hn) ((Object) qn.field_P.a(16213));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var2), "o.B(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 <= 45) {
          field_e = -104;
          field_c = null;
          field_b = null;
          field_a = null;
          field_f = null;
          return;
        } else {
          field_c = null;
          field_b = null;
          field_a = null;
          field_f = null;
          return;
        }
    }

    static {
        field_c = "Please remove <%0> from your friend list first.";
        field_a = "2D mode";
        field_e = 0;
        field_f = "To Customer Support";
        field_b = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
