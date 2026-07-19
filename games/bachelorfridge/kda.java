/*
 * Decompiled by CFR-JS 0.4.0.
 */
class kda {
    static String field_a;
    static String field_b;

    final static void a(int param0, int param1) {
        String discarded$2 = null;
        RuntimeException var2 = null;
        int var3 = 0;
        gb var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = BachelorFridge.field_y;
        try {
          L0: {
            var4 = (gb) ((Object) ja.field_s.b((byte) 90));
            L1: while (true) {
              if (var4 == null) {
                if (param0 < -16) {
                  break L0;
                } else {
                  discarded$2 = kda.b(5);
                  return;
                }
              } else {
                io.a(var4, true, param1);
                var4 = (gb) ((Object) ja.field_s.c(0));
                continue L1;
              }
            }
          }
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
        if (!o.d((byte) 116)) {
          L0: {
            if (param0 > 92) {
              break L0;
            } else {
              kda.a(-99, -54);
              break L0;
            }
          }
          if (!bf.field_h[wca.field_n].c((byte) 95)) {
            if (!bf.field_h[wca.field_n].field_i) {
              if (bf.field_h[wca.field_n].field_i) {
                return null;
              } else {
                return bf.field_h[wca.field_n].field_h[-1 + bf.field_h[wca.field_n].field_a];
              }
            } else {
              return bf.field_h[wca.field_n].field_h[bf.field_h[wca.field_n].field_e];
            }
          } else {
            if (bf.field_h[wca.field_n].field_i) {
              return null;
            } else {
              return bf.field_h[wca.field_n].field_h[-1 + bf.field_h[wca.field_n].field_a];
            }
          }
        } else {
          return null;
        }
    }

    static {
        field_a = "Please try again in a few minutes.";
    }
}
