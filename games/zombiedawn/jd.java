/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd {
    static int field_a;
    static int[] field_e;
    static int[] field_d;
    static String field_c;
    static int field_b;

    final static void a(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        var4 = ZombieDawn.field_J;
        if (param0 <= 74) {
          field_e = null;
          var8 = jp.field_f;
          var6 = var8;
          var5 = var6;
          var1 = var5;
          var2 = 0;
          var3 = var8.length;
          L0: while (true) {
            if (var2 >= var3) {
              return;
            } else {
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              continue L0;
            }
          }
        } else {
          var9 = jp.field_f;
          var7 = var9;
          var5 = var7;
          var1 = var5;
          var2 = 0;
          var3 = var9.length;
          L1: while (true) {
            if (var2 >= var3) {
              return;
            } else {
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              continue L1;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 < 29) {
            jd.a(-26);
            field_d = null;
            field_e = null;
            return;
        }
        field_d = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
