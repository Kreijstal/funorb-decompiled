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
        eo var6 = null;
        eo var7 = null;
        eo var8 = null;
        eo var9 = null;
        if (param2 > 64) {
          if (0 == ((vi) this).field_b) {
            var8 = ((vi) this).field_c.a(true);
            var8.a(false);
            var8.b(0);
            if (var8 != ((vi) this).field_e) {
              ((vi) this).field_g.a(param1, (byte) -97, (bw) (Object) param0);
              ((vi) this).field_c.a(param0, (byte) -107);
              return;
            } else {
              var9 = ((vi) this).field_c.a(true);
              var9.a(false);
              var9.b(0);
              ((vi) this).field_g.a(param1, (byte) -97, (bw) (Object) param0);
              ((vi) this).field_c.a(param0, (byte) -107);
              return;
            }
          } else {
            ((vi) this).field_b = ((vi) this).field_b - 1;
            ((vi) this).field_g.a(param1, (byte) -97, (bw) (Object) param0);
            ((vi) this).field_c.a(param0, (byte) -107);
            return;
          }
        } else {
          vi.b(13);
          if (0 == ((vi) this).field_b) {
            var6 = ((vi) this).field_c.a(true);
            var6.a(false);
            var6.b(0);
            if (var6 != ((vi) this).field_e) {
              ((vi) this).field_g.a(param1, (byte) -97, (bw) (Object) param0);
              ((vi) this).field_c.a(param0, (byte) -107);
              return;
            } else {
              var7 = ((vi) this).field_c.a(true);
              var7.a(false);
              var7.b(0);
              ((vi) this).field_g.a(param1, (byte) -97, (bw) (Object) param0);
              ((vi) this).field_c.a(param0, (byte) -107);
              return;
            }
          } else {
            ((vi) this).field_b = ((vi) this).field_b - 1;
            ((vi) this).field_g.a(param1, (byte) -97, (bw) (Object) param0);
            ((vi) this).field_c.a(param0, (byte) -107);
            return;
          }
        }
    }

    final static void b(int param0) {
        int var1 = 0;
        int var2 = BachelorFridge.field_y;
        oi.field_v = new js(param0);
        for (var1 = 0; var1 < ia.field_j.length; var1++) {
            oi.field_v.a((long)ia.field_j[var1].toLowerCase().hashCode(), (byte) 102, (bw) (Object) new ji(var1));
        }
    }

    public static void a(int param0) {
        field_f = null;
        int var1 = 64 % ((param0 - -31) / 62);
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
