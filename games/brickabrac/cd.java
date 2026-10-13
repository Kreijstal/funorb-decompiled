/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd {
    static ta field_c;
    static mh field_d;
    static vm field_g;
    static String field_f;
    static tp[] field_b;
    int field_a;
    static int field_e;
    static jp[] field_h;

    final static boolean a(int param0) {
        long var1;
        long var3;
        int var5;
        int var6;
        long var1Lifetime1;
        long var3Lifetime1;
        int var5Lifetime1;
        var6 = BrickABrac.field_J ? 1 : 0;
        if (param0 < -126) {
          var1 = ue.a(false);
          var3 = -ob.field_G + var1;
          if (var3 > 30000L) {
            GameplayScreen.field_h = 0;
            ob.field_G = var1;
            return true;
          }
          var5 = 3000;
          if (7 <= GameplayScreen.field_h) {
            var5 = 12000;
          } else {
            if (5 <= GameplayScreen.field_h) {
              var5 = 9000;
            } else {
              if (GameplayScreen.field_h >= 3) {
                var5 = 6000;
              }
            }
          }
          if (var3 <= (long)var5) {
            return false;
          }
          ob.field_G = var1;
          GameplayScreen.field_h = GameplayScreen.field_h + 1;
          return true;
        }
        field_d = (mh) null;
        var1Lifetime1 = ue.a(false);
        var3Lifetime1 = -ob.field_G + var1Lifetime1;
        if (var3Lifetime1 > 30000L) {
          GameplayScreen.field_h = 0;
          ob.field_G = var1Lifetime1;
          return true;
        }
        var5Lifetime1 = 3000;
        if (7 <= GameplayScreen.field_h) {
          var5Lifetime1 = 12000;
        } else {
          if (5 <= GameplayScreen.field_h) {
            var5Lifetime1 = 9000;
          } else {
            if (GameplayScreen.field_h >= 3) {
              var5Lifetime1 = 6000;
            }
          }
        }
        if (var3Lifetime1 <= (long)var5Lifetime1) {
          return false;
        }
        ob.field_G = var1Lifetime1;
        GameplayScreen.field_h = GameplayScreen.field_h + 1;
        return true;
    }

    final static oh a(boolean param0, boolean param1) {
        oh var2 = new oh(param0);
        var2.field_a = param1 ? true : false;
        return var2;
    }

    public static void a(byte param0) {
        field_c = null;
        field_h = null;
        field_d = null;
        int var1 = 123 / ((param0 + 23) / 38);
        field_f = null;
        field_b = null;
        field_g = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(ta param0, ta param1, int param2, int param3, int param4, int param5) {
        dj.field_g = param2;
        if (param3 != 7) {
          return;
        }
        try {
          uc.field_l = param1;
          ag.field_F = param0;
          wg.field_f = param4;
          ek.field_lb = param5;
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "cd.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    cd(int param0) {
        this.field_a = param0;
    }

    static {
        field_f = "Connecting to<br>friend server...";
    }
}
