/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji {
    static int[] field_b;
    static String field_a;

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 0) {
          field_b = (int[]) null;
        }
    }

    final static void a(int param0, int param1, byte param2) {
        int var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param2 != 37) {
            return;
          }
          if (ms.field_d != param1) {
            NetworkGameClient.field_v = new int[param1];
            for (int var3_int = 0; param1 > var3_int; var3_int++) {
              NetworkGameClient.field_v[var3_int] = (var3_int << 12) / param1;
            }
            ms.field_d = param1;
          }
          if (IndexedSpriteState.field_f != param0) {
            if (ms.field_d != param0) {
              mo.field_c = new int[param0];
              int var5 = 0;
              int var3_intLifetime1 = var5;
              while (param0 > var5) {
                mo.field_c[var5] = (var5 << 12) / param0;
                var5++;
              }
            } else {
              mo.field_c = NetworkGameClient.field_v;
            }
            IndexedSpriteState.field_f = param0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var3), "ji.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
    }
}
