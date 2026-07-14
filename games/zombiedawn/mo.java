/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mo {
    static int field_b;
    static vn field_a;
    private int[] field_c;

    final static String a(int param0, int param1, char param2) {
        int var4 = 0;
        int var5 = ZombieDawn.field_J;
        char[] var6 = new char[param1];
        char[] var3 = var6;
        for (var4 = 0; param1 > var4; var4++) {
            var6[var4] = param2;
        }
        var4 = -98 % ((param0 - 11) / 59);
        return new String(var3);
    }

    public static void a(int param0) {
        if (param0 > -74) {
            mo.a(-60);
        }
        field_a = null;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var3 = (((mo) this).field_c.length >> -874884895) - param0;
        var4 = var3 & param1;
        L0: while (true) {
          var5 = ((mo) this).field_c[1 + (var4 - -var4)];
          if ((var5 ^ -1) == 0) {
            return -1;
          } else {
            if (param1 != ((mo) this).field_c[var4 + var4]) {
              var4 = 1 + var4 & var3;
              continue L0;
            } else {
              return var5;
            }
          }
        }
    }

    mo(int[] param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = 1;
        while (var2 <= param0.length - -(param0.length >> 50571009)) {
            var2 = var2 << 1;
        }
        ((mo) this).field_c = new int[var2 + var2];
        for (var3 = 0; var2 + var2 > var3; var3++) {
            ((mo) this).field_c[var3] = -1;
        }
        for (var3 = 0; param0.length > var3; var3++) {
            var4 = var2 - 1 & param0[var3];
            while (((mo) this).field_c[var4 - -var4 + 1] != -1) {
                var4 = -1 + var2 & 1 + var4;
            }
            ((mo) this).field_c[var4 - -var4] = param0[var3];
            ((mo) this).field_c[var4 - (-var4 - 1)] = var3;
        }
    }

    final static StringBuilder a(int param0, int param1, char param2, StringBuilder param3) {
        int var5 = 0;
        int var6 = ZombieDawn.field_J;
        int var4 = param3.length();
        if (param0 != 0) {
            Object var7 = null;
            StringBuilder discarded$0 = mo.a(19, -61, 'ￊ', (StringBuilder) null);
        }
        param3.setLength(param1);
        for (var5 = var4; var5 < param1; var5++) {
            param3.setCharAt(var5, param2);
        }
        return param3;
    }

    static {
    }
}
