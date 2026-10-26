/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ArchiveProvider {
    static int[][] classicWaveCompositions;
    static Sprite[] field_c;
    static int[] field_b;

    final static String a(byte param0, CharSequence param1) {
        String stackIn_27_2 = null;
        int var6 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          int var2_int = param1.length();
          if (20 < var2_int) {
            var2_int = 20;
          }
          char[] var9 = new char[var2_int];
          char[] var8 = var9;
          char[] var3 = var8;
          if (param0 != -81) {
            CharSequence var7 = (CharSequence) null;
            ArchiveProvider.a((byte) -114, (CharSequence) null);
          }
          for (int var4 = 0; var2_int > var4; var4++) {
            int var5 = param1.charAt(var4);
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
          String stackIn_23_0 = new String(var9);
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_26_0 = var2;
          StringBuilder stackIn_26_1 = new StringBuilder().append("ip.E(").append(param0).append(',');
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
          classicWaveCompositions = (int[][]) null;
          return;
        }
        field_c = (Sprite[]) null;
        field_c = null;
        classicWaveCompositions = (int[][]) null;
    }

    abstract ArchiveIndex a(boolean param0);

    abstract byte[] a(int param0, int param1);

    static {
        field_b = new int[8192];
        classicWaveCompositions = new int[][]{new int[]{3, 0, 0, 0, 0, 0, 0}, new int[]{4, 0, 0, 0, 0, 0, 1}, new int[]{4, 1, 0, 0, 0, 0, 2}, new int[]{8, 0, 0, 0, 0, 0, 3}, new int[]{6, 0, 1, 0, 0, 0, 2}, new int[]{4, 2, 0, 0, 0, 0, 3}, new int[]{0, 6, 0, 0, 0, 0, 3}, new int[]{2, 4, 0, 0, 0, 0, 3}, new int[]{6, 0, 0, 1, 0, 0, 2}, new int[]{0, 5, 2, 0, 0, 0, 3}, new int[]{0, 6, 0, 1, 0, 0, 3}, new int[]{0, 0, 0, 3, 0, 0, 1}, new int[]{0, 1, 0, 4, 0, 0, 2}, new int[]{6, 2, 0, 0, 1, 0, 3}, new int[]{0, 0, 1, 6, 0, 0, 2}, new int[]{0, 6, 0, 0, 1, 0, 3}, new int[]{0, 6, 0, 0, 2, 0, 3}, new int[]{0, 0, 0, 0, 4, 0, 2}, new int[]{0, 0, 0, 8, 0, 0, 3}, new int[]{0, 0, 2, 6, 0, 0, 3}, new int[]{0, 0, 0, 0, 4, 1, 2}};
    }
}
