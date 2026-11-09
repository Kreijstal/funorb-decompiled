/*
 * Decompiled by CFR-JS 0.4.0.
 */
class UiStyleNode extends DualLinkNode {
    UiStyleNode() {
    }

    final static String formatGameTime(int ticks, int guard) {
        String var5 = null;
        int var6 = Sumoblitz.field_L ? 1 : 0;
        int var2 = ticks * 20;
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
        if (guard == -23620) {
          return var5Lifetime1;
        }
        UiStyleNode.droneTypeColor(-100, 64);
        return var5Lifetime1;
    }

    final static int droneTypeColor(int guard, int droneType) {
        int var2;
        int var3;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (guard != -26346) {
          UiStyleNode.droneTypeColor(47, 26);
        }
        var2 = droneType;
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
