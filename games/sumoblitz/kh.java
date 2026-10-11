/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh {
    static int field_e;
    static byte[][] field_f;
    static int[][] field_c;
    static wb field_a;
    static String field_d;
    static int[] field_b;

    final static boolean a(pl param0, boolean param1) {
        RuntimeException var2 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            field_b = (int[]) null;
          }
          stackIn_5_0 = (param0.b(1, (byte) -116) == 1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("kh.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String a(CharSequence param0, int param1) {
        int var4 = 0;
        int var2_int = 0;
        char[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_22_0 = null;
        String stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          var2_int = param0.length();
          if (var2_int > 20) {
            var2_int = 20;
          }
          var8 = new char[var2_int];
          var7 = var8;
          var3 = var7;
          for (var4 = 0; var4 < var2_int; var4++) {
            var5 = param0.charAt(var4);
            if (65 <= var5 &&
              90 >= var5) {
              var3[var4] = (char)(97 + (-65 + var5));
            } else if ((var5 < 97 ||
              var5 > 122) &&
              (var5 < 48 ||
              57 < var5)) {
              var3[var4] = (char)95;
            } else {
              var3[var4] = (char)var5;
            }
          }
          if (param1 == 1457) {
            stackIn_24_0 = new String(var8);
            return stackIn_24_0;
          }
          stackIn_22_0 = (String) null;
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_27_0 = var2;
          stackIn_27_1 = new StringBuilder().append("kh.C(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        lr.a(true, bi.field_d, (byte) 122, in.field_C);
        if (param0) {
          field_c = (int[][]) null;
        }
        ih.field_c = true;
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 2) {
          pl var2 = (pl) null;
          kh.a((pl) null, true);
        }
        field_c = (int[][]) null;
        field_a = null;
        field_f = (byte[][]) null;
        field_d = null;
    }

    static {
        field_f = new byte[1000][];
        field_b = new int[2];
    }
}
