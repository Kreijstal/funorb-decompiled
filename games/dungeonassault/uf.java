/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uf {
    static String[] field_d;
    static String field_c;
    static int field_a;
    static String field_b;

    public static void b(int param0) {
        field_d = null;
        field_b = null;
        field_c = null;
    }

    final static void a(int param0) {
        fl.field_m[param0] = 73;
        fl.field_m[92] = 74;
        fl.field_m[46] = 72;
        fl.field_m[59] = 57;
        fl.field_m[45] = 26;
        fl.field_m[91] = 42;
        fl.field_m[222] = 58;
        fl.field_m[520] = 59;
        fl.field_m[192] = 28;
        fl.field_m[44] = 71;
        fl.field_m[93] = 43;
        fl.field_m[61] = 27;
    }

    final static void c(int param0) {
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = DungeonAssault.field_K;
        try {
          L0: {
            var5 = hk.field_b;
            var1 = var5;
            var2 = 0;
            var3 = var5.length;
            L1: while (true) {
              if (var3 <= var2) {
                break L0;
              } else {
                int incrementValue$40 = var2;
                var2++;
                var5[incrementValue$40] = 0;
                int incrementValue$41 = var2;
                var2++;
                var5[incrementValue$41] = 0;
                int incrementValue$42 = var2;
                var2++;
                var5[incrementValue$42] = 0;
                int incrementValue$43 = var2;
                var2++;
                var5[incrementValue$43] = 0;
                int incrementValue$44 = var2;
                var2++;
                var5[incrementValue$44] = 0;
                int incrementValue$45 = var2;
                var2++;
                var5[incrementValue$45] = 0;
                int incrementValue$46 = var2;
                var2++;
                var5[incrementValue$46] = 0;
                int incrementValue$47 = var2;
                var2++;
                var5[incrementValue$47] = 0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var1_ref, "uf.B(" + 28 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Minotaur";
        field_b = "VIEW: ";
        field_a = 16;
        field_d = new String[]{"Intimidate", "<col=FF0000>Sneak -1</col> to raiders, <col=FF0000>Attack -1</col> to monsters."};
    }
}
