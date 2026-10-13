/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class GameScreen {
    static wp field_e;
    int screenId;
    static String field_d;
    static n field_c;
    static String field_b;
    static hj field_f;
    static String field_g;

    abstract void drawScreen(byte obfuscationGuard);

    final boolean a(byte param0) {
        if (param0 != -51) {
          return true;
        }
        return true;
    }

    abstract boolean handleKey(char character, int keyCode, int obfuscationGuard);

    abstract void advanceScreen(boolean updateFlag, boolean inputEnabled, int obfuscationGuard);

    GameScreen(int screenId) {
        this.screenId = screenId;
    }

    public static void c(byte param0) {
        field_g = null;
        field_b = null;
        field_d = null;
        field_f = null;
        field_c = null;
        field_e = null;
        if (param0 != -91) {
          GameScreen.a(119, 39, -126, (byte) 48);
          return;
        }
    }

    final static cq a(int param0, int param1, int param2, byte param3) {
        cq var4;
        int var5;
        cq var6;
        cq var7;
        cq var4Lifetime1;
        var5 = BrickABrac.field_J ? 1 : 0;
        var4 = (cq) (fk.field_f.first(-55));
        if (param3 < -102) {
          while (var4 != null) {
            if (param1 == var4.field_m) {
              return var4;
            }
            var4 = (cq) (fk.field_f.next((byte) 116));
          }
          var6 = new cq();
          var4 = var6;
          var6.field_s = param2;
          var6.field_m = param1;
          fk.field_f.addLast(var6, (byte) 3);
          gn.a(-21167, var6, param0);
          return var6;
        }
        GameScreen.c((byte) -109);
        while (var4 != null) {
          if (param1 == var4.field_m) {
            return var4;
          }
          var4 = (cq) (fk.field_f.next((byte) 116));
        }
        var7 = new cq();
        var4Lifetime1 = var7;
        var7.field_s = param2;
        var7.field_m = param1;
        fk.field_f.addLast(var7, (byte) 3);
        gn.a(-21167, var7, param0);
        return var7;
    }

    static {
        field_c = new n();
        field_b = "Connection lost - attempting to reconnect";
        field_g = "Charge: instantly charges the ball.";
    }
}
