/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj {
    static String[] field_c;
    static int[] field_a;
    static int field_b;

    final static void a(int param0) {
        if (!(eb.field_H)) {
            throw new IllegalStateException();
        }
    }

    public static void b(int param0) {
        field_a = null;
        field_c = null;
    }

    final static void a(boolean param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        mb var6 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var1_int = jb.field_j.length;
            jb.field_i = new mb[var1_int];
            var2 = 0;
            L1: while (true) {
              if (var2 >= var1_int) {
                field_b = 97;
                break L0;
              } else {
                var3 = jb.field_j[var2];
                var4 = jb.field_y[var2];
                var5 = jb.field_x[var2];
                var6 = new mb(var3, var4, var5);
                jb.field_i[var2] = var6;
                var2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "jj.B(" + false + ')');
        }
    }

    final static ed[] a(int param0, int param1) {
        ed[] var3 = new ed[9];
        ed[] var2 = var3;
        var3[4] = of.a(param0, (byte) 104, 64);
        if (param1 <= 33) {
            return null;
        }
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_b = -1;
    }
}
