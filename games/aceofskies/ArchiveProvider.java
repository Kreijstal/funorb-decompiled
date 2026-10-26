/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ArchiveProvider {
    static int[][] field_a;
    static ll[] field_c;
    static int[] field_b;

    final static String a(byte param0, CharSequence param1) {
        int var4 = 0;
        int var2_int = 0;
        char[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        CharSequence var7 = null;
        char[] var8 = null;
        char[] var9 = null;
        String stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          var2_int = param1.length();
          if (20 < var2_int) {
            var2_int = 20;
          }
          var9 = new char[var2_int];
          var8 = var9;
          var3 = var8;
          if (param0 != -81) {
            var7 = (CharSequence) null;
            ArchiveProvider.a((byte) -114, (CharSequence) null);
          }
          for (var4 = 0; var2_int > var4; var4++) {
            var5 = param1.charAt(var4);
            if (65 <= var5 &&
              var5 <= 90) {
              var3[var4] = (char)(-65 + (var5 + 97));
            } else if ((var5 < 97 ||
              122 < var5) &&
              (var5 < 48 ||
              var5 > 57)) {
              var3[var4] = (char)95;
            } else {
              var3[var4] = (char)var5;
            }
          }
          stackIn_23_0 = new String(var9);
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("ip.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    abstract int b(int param0, int param1);

    public static void a(int param0) {
        field_b = null;
        if (param0 < -3) {
          field_c = null;
          field_a = (int[][]) null;
          return;
        }
        field_c = (ll[]) null;
        field_c = null;
        field_a = (int[][]) null;
    }

    abstract ArchiveIndex a(boolean param0);

    abstract byte[] a(int param0, int param1);

    static {
        field_b = new int[8192];
        field_a = new int[][]{new int[]{3, 0, 0, 0, 0, 0, 0}, new int[]{4, 0, 0, 0, 0, 0, 1}, new int[]{4, 1, 0, 0, 0, 0, 2}, new int[]{8, 0, 0, 0, 0, 0, 3}, new int[]{6, 0, 1, 0, 0, 0, 2}, new int[]{4, 2, 0, 0, 0, 0, 3}, new int[]{0, 6, 0, 0, 0, 0, 3}, new int[]{2, 4, 0, 0, 0, 0, 3}, new int[]{6, 0, 0, 1, 0, 0, 2}, new int[]{0, 5, 2, 0, 0, 0, 3}, new int[]{0, 6, 0, 1, 0, 0, 3}, new int[]{0, 0, 0, 3, 0, 0, 1}, new int[]{0, 1, 0, 4, 0, 0, 2}, new int[]{6, 2, 0, 0, 1, 0, 3}, new int[]{0, 0, 1, 6, 0, 0, 2}, new int[]{0, 6, 0, 0, 1, 0, 3}, new int[]{0, 6, 0, 0, 2, 0, 3}, new int[]{0, 0, 0, 0, 4, 0, 2}, new int[]{0, 0, 0, 8, 0, 0, 3}, new int[]{0, 0, 2, 6, 0, 0, 3}, new int[]{0, 0, 0, 0, 4, 1, 2}};
    }
}
