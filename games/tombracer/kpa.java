/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kpa {
    static boolean field_c;
    static String field_b;
    static String field_d;
    private boolean[] field_a;

    final void a(int[] param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        int[] var7 = param0;
        int[] var3 = var7;
        for (var4 = param1; var4 < var7.length; var4++) {
            var5 = var7[var4];
            ((kpa) this).field_a[var5] = true;
        }
    }

    kpa(int param0, int param1, kh param2) {
        this(param0);
        int var5 = 0;
        int var4 = param2.b((byte) 44, param0);
        for (var5 = param0 - 1; 0 <= var5; var5--) {
            if (-1 > (1 & var4 ^ -1)) {
                ((kpa) this).field_a[var5] = true;
                var4--;
            }
            var4 = var4 >> 1;
        }
    }

    final void a(int param0, int param1, boolean param2) {
        if (param1 != -17075) {
            return;
        }
        ((kpa) this).field_a[param0] = param2;
    }

    final void a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        for (var3 = 0; ((kpa) this).field_a.length > var3; var3++) {
            ((kpa) this).field_a[var3] = param0;
        }
        if (param1 < 62) {
            ((kpa) this).field_a = null;
        }
    }

    final boolean a(int param0, int param1) {
        if (param0 != 0) {
            kpa.a(116);
        }
        return ((kpa) this).field_a[param1];
    }

    final void a(kh param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = TombRacer.field_G ? 1 : 0;
          if (param1 <= -113) {
            break L0;
          } else {
            String discarded$2 = ((kpa) this).toString();
            break L0;
          }
        }
        var3 = 0;
        var4 = 0;
        L1: while (true) {
          if (((kpa) this).field_a.length <= var4) {
            param0.a((byte) 112, var3, ((kpa) this).field_a.length);
            return;
          } else {
            var3 = var3 << 1;
            if (((kpa) this).field_a[var4]) {
              var3++;
              var4++;
              continue L1;
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    public final String toString() {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        var1 = "flags:";
        var2 = 0;
        L0: while (true) {
          if (var2 >= ((kpa) this).field_a.length) {
            return var1;
          } else {
            if (!((kpa) this).field_a[var2]) {
              var1 = var1 + "0";
              var2++;
              continue L0;
            } else {
              var1 = var1 + "1";
              var2++;
              continue L0;
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 <= 57) {
            field_b = null;
        }
        field_d = null;
        field_b = null;
    }

    kpa(int param0) {
        ((kpa) this).field_a = new boolean[param0];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Shortcut Reference";
        field_c = false;
        field_d = "<%0> must play 1 more rated game before playing with the current options.";
    }
}
