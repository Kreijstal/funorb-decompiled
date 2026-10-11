/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti {
    static byte[] field_a;

    final static hh a(int param0) {
        int var1 = 57 % ((param0 - 33) / 52);
        return new hh(tt.e(21240), aj.a((byte) -65));
    }

    final static String a(byte param0, int param1, long param2, int param3, boolean param4) {
        StringBuilder discarded$1 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$3 = null;
        int var6;
        int var7;
        int var8;
        int var9;
        StringBuilder var10;
        int var11;
        int var12;
        int var13;
        int var11Lifetime1;
        int var12Lifetime1;
        var13 = BachelorFridge.field_y;
        var6 = 44;
        var7 = 46;
        if (param3 == 0) {
          var6 = 46;
          var7 = 44;
        }
        if (param3 == 2) {
          var7 = 160;
        }
        var9 = 0 / ((param0 - 60) / 39);
        var8 = 0;
        if (param2 < 0L) {
          param2 = -param2;
          var8 = 1;
        }
        var10 = new StringBuilder(26);
        if (0 < param1) {
          for (var11 = 0; var11 < param1; var11++) {
            var12 = (int)param2;
            param2 = param2 / 10L;
            discarded$1 = var10.append((char)(-(10 * (int)param2) + var12 + 48));
          }
          discarded$0 = var10.append((char) var6);
        }
        var11Lifetime1 = 0;
        while (true) {
          var12Lifetime1 = (int)param2;
          param2 = param2 / 10L;
          discarded$2 = var10.append((char)(48 + (var12Lifetime1 - 10 * (int)param2)));
          if (0L == param2) {
            if (var8 != 0) {
              discarded$4 = var10.append('-');
            }
            return var10.reverse().toString();
          }
          if (!param4) {
            continue;
          }
          var11Lifetime1++;
          if (var11Lifetime1 % 3 != 0) {
            continue;
          }
          discarded$3 = var10.append((char) var7);
        }
    }

    public static void b(int param0) {
        if (param0 != 3) {
          return;
        }
        field_a = null;
    }

    static {
        int var1 = 0;
        int var2 = 0;
        int incrementValue$0 = 0;
        int var0 = 0;
        field_a = new byte[32896];
        for (var1 = 0; var1 < 256; var1++) {
          for (var2 = 0; var2 <= var1; var2++) {
            incrementValue$0 = var0;
            var0++;
            field_a[incrementValue$0] = (byte)(int)(255.0 / Math.sqrt((double)((float)(65535 + (var2 * var2 + var1 * var1)) / 65535.0f)));
          }
        }
    }
}
