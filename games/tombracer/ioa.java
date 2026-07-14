/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ioa extends dg {
    static dq field_n;
    static String field_m;
    private ut field_p;
    static String field_o;

    final void a(gr param0, gma param1, byte param2) {
        super.a(param0, param1, param2);
        if (!(!(param0 instanceof ut))) {
            ((ioa) this).field_p = (ut) (Object) param0;
        }
    }

    final int k(byte param0) {
        if (param0 == -99) {
          if (((ioa) this).field_h.j(-1)) {
            return 2;
          } else {
            return 5;
          }
        } else {
          field_m = null;
          if (((ioa) this).field_h.j(-1)) {
            return 2;
          } else {
            return 5;
          }
        }
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = TombRacer.field_G ? 1 : 0;
        var7 = 0;
        if (null != ((ioa) this).field_p) {
          if (!((ioa) this).field_p.k((byte) -120).b(4)) {
            var6 = ((ioa) this).field_p.c(17832);
            var8 = ((ioa) this).field_h.c(-29) / 2;
            var9 = ((ioa) this).field_h.a((byte) 55) / 2;
            var10 = 86 % ((param4 - -38) / 47);
            oq.a(-var8 + param2, -var9 + param1, param3, 255, param2 + var8, var6, param1 + var9, true);
            return;
          } else {
            var6 = ((ioa) this).field_p.g((byte) -108);
            var8 = ((ioa) this).field_h.c(-29) / 2;
            var9 = ((ioa) this).field_h.a((byte) 55) / 2;
            var10 = 86 % ((param4 - -38) / 47);
            oq.a(-var8 + param2, -var9 + param1, param3, 255, param2 + var8, var6, param1 + var9, true);
            return;
          }
        } else {
          var6 = 6684672;
          var8 = ((ioa) this).field_h.c(-29) / 2;
          var9 = ((ioa) this).field_h.a((byte) 55) / 2;
          var10 = 86 % ((param4 - -38) / 47);
          oq.a(-var8 + param2, -var9 + param1, param3, 255, param2 + var8, var6, param1 + var9, true);
          return;
        }
    }

    ioa(int param0, la param1, kh param2) {
        super(param0, param1, param2);
    }

    ioa(int param0) {
        super(param0);
    }

    public static void i(int param0) {
        int var1 = -55 / ((param0 - -17) / 59);
        field_n = null;
        field_o = null;
        field_m = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new dq(0, 0);
        field_m = "<%0> has withdrawn the request to join.";
        field_o = "Run using the arrow keys or W, A, S and D.";
    }
}
