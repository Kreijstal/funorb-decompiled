/*
 * Decompiled by CFR-JS 0.4.0.
 */
class dp extends pj {
    dp() {
    }

    final static String b(int param0, int param1) {
        String var5 = null;
        int var6 = Sumoblitz.field_L ? 1 : 0;
        int var2 = param0 * 20;
        int var3 = var2 / 1000;
        int var4 = var3 / 60;
        String var5Lifetime1;
        var3 = var3 % 60;
        if (var4 >= 10) {
          var5 = "" + var4;
        } else {
          var5 = "0" + var4;
        }
        String var7 = var5 + ":";
        if (10 > var3) {
          var5Lifetime1 = var7 + "0" + var3;
        } else {
          var5Lifetime1 = var7 + var3;
        }
        if (param1 == -23620) {
          return var5Lifetime1;
        }
        dp.a(-100, 64);
        return var5Lifetime1;
    }

    final static int a(int param0, int param1) {
        int var2;
        int var3;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (param0 != -26346) {
          dp.a(47, 26);
        }
        var2 = param1;
        if (0 == var2) {
          return 3394611;
        }
        if (var2 == 1) {
          return 13382451;
        }
        if (var2 == 2) {
          return 3355596;
        }
        if (var2 == 3) {
          return 13421619;
        }
        if (var2 == 4) {
          return 13382604;
        }
        if (var2 != 5) {
          return 6710886;
        }
        return 3394764;
    }

    static {
    }
}
