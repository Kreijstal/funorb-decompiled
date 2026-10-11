/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ib {
    static int field_a;
    static String field_b;

    final static int a(int param0, byte param1) {
        int var2 = param0 >>> 1;
        var2 = var2 | var2 >>> 1;
        var2 = var2 | var2 >>> 2;
        var2 = var2 | var2 >>> 4;
        var2 = var2 | var2 >>> 8;
        if (param1 == 79) {
          var2 = var2 | var2 >>> 16;
          return param0 & ~var2;
        }
        field_b = (String) null;
        var2 = var2 | var2 >>> 16;
        return param0 & ~var2;
    }

    public static void a(byte param0) {
        if (param0 != -35) {
          field_a = 119;
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static void a(byte param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4Lifetime1;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          var3_int = 68 % ((9 - param0) / 62);
          if (param2 != we.field_M) {
            rh.field_O = new int[param2];
            for (var4 = 0; param2 > var4; var4++) {
              rh.field_O[var4] = (var4 << 12) / param2;
            }
            rm.field_z = -1 + param2;
            we.field_M = param2;
            h.field_y = param2 * 32;
          }
          if (aa.field_Vb == param1) {
            return;
          }
          if (param1 != we.field_M) {
            lf.field_y = new int[param1];
            var6 = 0;
            var4Lifetime1 = var6;
            while (param1 > var6) {
              lf.field_y[var6] = (var6 << 12) / param1;
              var6++;
            }
          } else {
            lf.field_y = rh.field_O;
          }
          aa.field_Vb = param1;
          fk.field_x = -1 + param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var3), "ib.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_b = "Waiting for graphics";
        field_a = 100;
    }
}
