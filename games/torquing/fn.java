/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fn {
    private t[] field_d;
    static boolean field_b;
    static int field_c;
    static String field_a;

    final static am a(int param0, fj param1) {
        int var2 = 0;
        am var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Torquing.field_u;
        int discarded$2 = param1.i((byte) -101);
        var2 = param1.i((byte) -101);
        var3 = tj.a(var2, 37);
        var3.field_k = param1.i((byte) -101);
        var4 = param1.i((byte) -101);
        if (param0 >= -46) {
          return null;
        } else {
          var5 = 0;
          L0: while (true) {
            if (var4 <= var5) {
              var3.a((byte) 125);
              return var3;
            } else {
              var6 = param1.i((byte) -101);
              var3.a(param1, 35, var6);
              var5++;
              continue L0;
            }
          }
        }
    }

    fn(t[] param0) {
        ((fn) this).field_d = param0;
    }

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
            Object var2 = null;
            am discarded$0 = fn.a(15, (fj) null);
        }
    }

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        int var6 = 84 / ((param3 - -59) / 54);
        rh.a(param0, param1, (byte) 71, param4, param2, ((fn) this).field_d);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
        field_a = "Waiting for sound effects";
    }
}
