/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bpa implements wwa {
    private nva field_b;
    static int field_a;
    static llb field_c;
    static String field_d;

    public static void a(byte param0) {
        field_c = null;
        field_d = null;
        if (param0 <= 44) {
            bpa.a((byte) 122);
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
        if (param2 == -25) {
          if (param3 > param4) {
            ww.a(param0, param3, rba.field_b[param1], (byte) 75, param4);
            return;
          } else {
            ww.a(param0, param4, rba.field_b[param1], (byte) 75, param3);
            return;
          }
        } else {
          return;
        }
    }

    bpa(nva param0) {
        ((bpa) this).field_b = param0;
    }

    public final void a(int param0, shb param1, int param2, int param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var11 = 0;
        Object var12 = null;
        String var13 = null;
        Object var14 = null;
        String var15 = null;
        var6 = param1.field_g + param2;
        var7 = param3 + param1.field_r;
        npa.a(var7, (byte) 115, param1.field_f, param1.field_h, var6);
        if (!param1.e((byte) -120)) {
          dma.b(var6, var7, param1.field_h + (var6 - 2), param1.field_f + var7);
          var9 = 78 % ((-27 - param0) / 35);
          var14 = ((bpa) this).field_b.field_w.g((byte) 96);
          if (var14 != null) {
            var15 = var14.toString();
            ((bpa) this).field_b.field_v.c(var15, 2 + var6, -1 + ((((bpa) this).field_b.field_v.field_k + param1.field_f >> 2066420673) + var7), 10000536, -1);
            if (((bpa) this).field_b.e((byte) -120)) {
              if (var15.startsWith(((bpa) this).field_b.field_E)) {
                var11 = ((bpa) this).field_b.field_v.b(((bpa) this).field_b.field_E);
                dma.e(var6 - -2, var7 + 2, var11, -4 + param1.field_f, 2188450, 100);
                dma.d();
                return;
              } else {
                dma.d();
                return;
              }
            } else {
              dma.d();
              return;
            }
          } else {
            dma.d();
            return;
          }
        } else {
          aha.a(var7 - -2, param1.field_h + -4, 2 + var6, param1.field_f + -4, (byte) -100);
          dma.b(var6, var7, param1.field_h + (var6 - 2), param1.field_f + var7);
          var9 = 78 % ((-27 - param0) / 35);
          var12 = ((bpa) this).field_b.field_w.g((byte) 96);
          if (var12 != null) {
            var13 = var12.toString();
            ((bpa) this).field_b.field_v.c(var13, 2 + var6, -1 + ((((bpa) this).field_b.field_v.field_k + param1.field_f >> 2066420673) + var7), 10000536, -1);
            if (((bpa) this).field_b.e((byte) -120)) {
              if (var13.startsWith(((bpa) this).field_b.field_E)) {
                var11 = ((bpa) this).field_b.field_v.b(((bpa) this).field_b.field_E);
                dma.e(var6 - -2, var7 + 2, var11, -4 + param1.field_f, 2188450, 100);
                dma.d();
                return;
              } else {
                dma.d();
                return;
              }
            } else {
              dma.d();
              return;
            }
          } else {
            dma.d();
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 131072;
        field_d = "This game option is only available to members.";
    }
}
