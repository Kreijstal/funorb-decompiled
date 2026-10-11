/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg extends rk {
    int field_t;
    bc[] field_q;
    int[] field_u;
    int field_r;
    byte[][][] field_s;
    static ej field_p;
    bc[] field_m;
    int[] field_o;
    int[] field_v;
    static ad field_n;

    final static char a(boolean param0, byte param1) {
        int var3 = 0;
        if (param0) {
          return '\b';
        }
        int var2 = 255 & param1;
        if (0 == var2) {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (var2 < 128) {
          return (char)var2;
        }
        if (var2 < 160) {
          var3 = cd.field_m[var2 - 128];
          if (var3 == 0) {
            var3 = 63;
          }
          var2 = var3;
          return (char)var2;
        }
        return (char)var2;
    }

    public static void b(boolean param0) {
        field_n = null;
        field_p = null;
        if (param0) {
          dg.b(false);
        }
    }

    dg() {
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Confined.field_J ? 1 : 0;
        try {
          var3_int = param0;
          while (param1 > 1) {
            if (0 != (param1 & 1)) {
              var3_int = var3_int * param2;
            }
            param1 = param1 >> 1;
            param2 = param2 * param2;
          }
          if (param1 != 1) {
            stackIn_12_0 = var3_int;
            return stackIn_12_0;
          }
          stackIn_10_0 = var3_int * param2;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var3), "dg.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_p = new ej();
    }
}
