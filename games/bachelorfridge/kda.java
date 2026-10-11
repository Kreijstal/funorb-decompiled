/*
 * Decompiled by CFR-JS 0.4.0.
 */
class kda {
    static String field_a;
    static String field_b;

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        gb var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = BachelorFridge.field_y;
        try {
          var4 = (gb) (ja.field_s.b((byte) 90));
          while (var4 != null) {
            io.a(var4, true, param1);
            var4 = (gb) (ja.field_s.c(0));
          }
          if (param0 < -16) {
            return;
          }
          kda.b(5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "kda.G(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != -1) {
          field_b = (String) null;
          field_a = null;
          field_b = null;
          return;
        }
        field_a = null;
        field_b = null;
    }

    final static String b(int param0) {
        if (o.d((byte) 116)) {
          return null;
        }
        if (param0 <= 92) {
          kda.a(-99, -54);
        }
        if (bf.field_h[wca.field_n].c((byte) 95)) {
          if (!bf.field_h[wca.field_n].field_i) {
            return bf.field_h[wca.field_n].field_h[-1 + bf.field_h[wca.field_n].field_a];
          }
          return null;
        }
        if (bf.field_h[wca.field_n].field_i) {
          return bf.field_h[wca.field_n].field_h[bf.field_h[wca.field_n].field_e];
        }
        if (!bf.field_h[wca.field_n].field_i) {
          return bf.field_h[wca.field_n].field_h[-1 + bf.field_h[wca.field_n].field_a];
        }
        return null;
    }

    static {
        field_a = "Please try again in a few minutes.";
    }
}
