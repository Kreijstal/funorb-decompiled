/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi {
    static ee field_f;
    static int[] field_d;
    static long field_a;
    private eo field_e;
    private js field_g;
    private in field_c;
    private int field_b;

    final void a(eo param0, long param1, int param2) {
        eo var5 = null;
        try {
            if (param2 <= 64) {
                vi.b(13);
            }
            if (0 != ((vi) this).field_b) {
                ((vi) this).field_b = ((vi) this).field_b - 1;
            } else {
                var5 = ((vi) this).field_c.a(true);
                var5.a(false);
                var5.b(0);
                if (var5 == ((vi) this).field_e) {
                    var5 = ((vi) this).field_c.a(true);
                    var5.a(false);
                    var5.b(0);
                }
            }
            ((vi) this).field_g.a(param1, (byte) -97, (bw) (Object) param0);
            ((vi) this).field_c.a(param0, (byte) -107);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "vi.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void b(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = BachelorFridge.field_y;
        try {
          L0: {
            oi.field_v = new js(param0);
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= ia.field_j.length) {
                break L0;
              } else {
                oi.field_v.a((long)ia.field_j[var1_int].toLowerCase().hashCode(), (byte) 102, (bw) (Object) new ji(var1_int));
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1, "vi.A(" + param0 + ')');
        }
    }

    public static void a() {
        field_f = null;
        int var1 = 0;
        field_d = null;
    }

    final eo a(int param0, long param1) {
        if (param0 < 98) {
            return null;
        }
        eo var4 = (eo) (Object) ((vi) this).field_g.a(true, param1);
        if (!(var4 == null)) {
            ((vi) this).field_c.a(var4, (byte) 115);
        }
        return var4;
    }

    vi(int param0) {
        ((vi) this).field_e = new eo();
        ((vi) this).field_c = new in();
        ((vi) this).field_b = param0;
        int var2 = 1;
        while (param0 > var2 + var2) {
            var2 = var2 + var2;
        }
        ((vi) this).field_g = new js(var2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[]{300, 500, 100, 300, 100, 100, 100, 100, 200, 100, 100, 100, 300, 500, 200, 100, 100, 100, 500, 100, 200, 200, 100, 100, 100, 500, 300, 300, 200, 200, 1000, 500, 300, 500, 300, 500, 500, 300, 1000, 500, 500, 500, 300, 500, 300, 300, 200, 500, 300, 100};
    }
}
