/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc {
    static int[] field_d;
    static om[] field_a;
    static String[][] field_b;
    static String field_c;

    public static void a(int param0) {
        field_b = (String[][]) null;
        field_d = null;
        field_c = null;
        if (param0 >= 23) {
          field_a = null;
          return;
        }
        CharSequence var2 = (CharSequence) null;
        mc.a(-23, (CharSequence) null, 81);
        field_a = null;
    }

    final static int a(int param0, CharSequence param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 12) {
            mc.a(77, false);
          }
          stackIn_3_0 = gl.a(true, param2, (byte) -107, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("mc.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1) {
        if (param0 != 0) {
          field_a = (om[]) null;
          fj.field_o.a(param1, 123);
          return;
        }
        fj.field_o.a(param1, 123);
    }

    static {
        int var1 = 0;
        int var2 = 0;
        int var0;
        field_d = new int[256];
        field_a = null;
        for (var1 = 0; var1 < 256; var1++) {
          var0 = var1;
          for (var2 = 0; var2 < 8; var2++) {
            if (1 != (var0 & 1)) {
              var0 = var0 >>> 1;
            } else {
              var0 = -306674912 ^ var0 >>> 1;
            }
          }
          field_d[var1] = var0;
        }
        field_c = "This password is part of your Player Name, and would be easy to guess";
    }
}
