/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am {
    static int field_e;
    static gd field_f;
    static int field_d;
    static int field_c;
    static int field_g;
    static cn field_a;
    static ad field_b;

    final static void b(int param0) {
        if (param0 <= 34) {
          StringBuilder var2 = (StringBuilder) null;
          am.a((StringBuilder) null, 'ﾍ', -124, false);
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_f = null;
        if (param0 != 30111) {
          am.b(93);
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static StringBuilder a(StringBuilder param0, char param1, int param2, boolean param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        StringBuilder stackIn_3_0 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = DungeonAssault.field_K;
        try {
          var4_int = param0.length();
          param0.setLength(param2);
          if (param3) {
            stackIn_3_0 = (StringBuilder) null;
            return stackIn_3_0;
          }
          for (var5 = var4_int; param2 > var5; var5++) {
            param0.setCharAt(var5, param1);
          }
          stackIn_8_0 = (StringBuilder) (param0);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("am.B(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        mc.b(50, 150);
        field_b = new ad(1, 2, 2, 0);
    }
}
