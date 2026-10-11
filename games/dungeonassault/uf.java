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
        if (param0 != 0) {
          field_c = (String) null;
          field_c = null;
          return;
        }
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
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = DungeonAssault.field_K;
        try {
          var5 = hk.field_b;
          var1 = var5;
          var2 = 0;
          if (param0 != 28) {
            return;
          }
          var3 = var5.length;
          while (var3 > var2) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var1_ref), "uf.B(" + param0 + ')');
        }
    }

    static {
        field_c = "Minotaur";
        field_b = "VIEW: ";
        field_a = 16;
        field_d = new String[]{"Intimidate", "<col=FF0000>Sneak -1</col> to raiders, <col=FF0000>Attack -1</col> to monsters."};
    }
}
