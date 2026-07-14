/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class m {
    static String field_c;
    static String field_b;
    static he[] field_a;

    abstract long a(int param0);

    public static void a(boolean param0) {
        field_b = null;
        if (!param0) {
            field_a = null;
        }
        field_c = null;
        field_a = null;
    }

    abstract int a(long param0, int param1);

    abstract void b(boolean param0);

    final static ej[] a(int param0, lh param1) {
        int var2 = 0;
        int var3 = 0;
        ej[] var4 = null;
        int var5 = 0;
        ej var6_ref = null;
        int var6 = 0;
        int var7 = 0;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = param1.e(8, (byte) 48);
        if (var2 <= 0) {
          if (param0 >= 13) {
            var3 = param1.e(12, (byte) -123);
            var4 = new ej[var3];
            var5 = 0;
            L0: while (true) {
              if (var5 >= var3) {
                return var4;
              } else {
                if (!ti.a(param1, false)) {
                  var6 = param1.e(jl.a(109, var5 - 1), (byte) 53);
                  var4[var5] = var4[var6];
                  var5++;
                  continue L0;
                } else {
                  var6_ref = new ej();
                  int discarded$156 = param1.e(24, (byte) 40);
                  int discarded$157 = param1.e(24, (byte) 95);
                  var6_ref.field_d = param1.e(24, (byte) 114);
                  int discarded$158 = param1.e(9, (byte) 62);
                  int discarded$159 = param1.e(12, (byte) 42);
                  int discarded$160 = param1.e(12, (byte) 75);
                  int discarded$161 = param1.e(12, (byte) -115);
                  var4[var5] = var6_ref;
                  var5++;
                  continue L0;
                }
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static sa a(int param0, byte param1) {
        int var3 = 0;
        int var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        sa[] var5 = ug.c((byte) -23);
        sa[] var2 = var5;
        for (var3 = 0; var5.length > var3; var3++) {
            if (param0 == var5[var3].field_d) {
                return var5[var3];
            }
        }
        if (param1 == 46) {
            return null;
        }
        field_b = null;
        return null;
    }

    final int b(long param0, int param1) {
        if (param1 != 1) {
            field_a = null;
        }
        long var4 = ((m) this).a(param1 + 0);
        if (0L < var4) {
            kk.a(var4, true);
        }
        return ((m) this).a(param0, -110);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_b = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
