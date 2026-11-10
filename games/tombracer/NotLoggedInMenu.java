/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NotLoggedInMenu extends MenuScreen {
    static gb field_q;
    static boolean field_r;
    private dea field_s;

    final int getItemX(byte param0, int param1) {
        if (param0 > 111) {
          return aaa.a(false) / 2 - this.items.length * this.items[param1].e(-163) / 2 + this.items[param1].e(-163) * param1;
        }
        this.getItemY(16, -28);
        return aaa.a(false) / 2 - this.items.length * this.items[param1].e(-163) / 2 + this.items[param1].e(-163) * param1;
    }

    NotLoggedInMenu(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_s = new dea(0);
        try {
          this.field_o = false;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "vv.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final void update(boolean param0, boolean param1, int param2) {
        super.update(param0, param1, param2);
        this.field_s.a((byte) -117, param0, !param1 ? true : false);
    }

    final int getItemY(int param0, int param1) {
        if (param1 != 30) {
          this.update(true, false, -53);
          return this.firstItemY;
        }
        return this.firstItemY;
    }

    final static void a(int param0, byte param1, int param2, int param3, GameFont param4, String param5, int param6, int param7, int param8) {
        try {
          param4.a(jg.a(param2, (byte) -76, param3), -1, param8, jg.a(param0, (byte) -121, param7), param6, param5);
          int var9_int = -7 % ((66 - param1) / 47);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "vv.BA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    private final void h(int param0, int param1) {
        String var13 = null;
        int var8 = 0;
        String var10 = null;
        String var9 = null;
        int var3 = 500;
        int var4 = -(var3 / 2) + aaa.a(false) / 2;
        int var5 = param1 + 100;
        String var10Lifetime1;
        String var9Lifetime1;
        String var9Lifetime2;
        String var9Lifetime3;
        int var8Lifetime1;
        MembersUpsellMenu.a(ClampOperator.field_o.toUpperCase(), 2497287, SingleChildWidget.field_v, -1, gg.field_f.height() / 2 + var5 - 30, aaa.a(false) / 2, -1);
        GameFont var6 = kn.field_p;
        int var7 = kv.field_a.field_h + (kv.field_a.field_g + 4);
        if (param0 < -116) {
          var8 = var7 * 3;
          var13 = PitSnake.field_v + "<br>" + ConstrainToFacingArcLocomotor.a(GameClock.field_b, uma.field_c, 21297, SoftwareTransform3D.field_p);
          var10 = GameScreen.replaceCharacter('#', "<br>", var13, 0);
          var9 = var10;
          var9Lifetime3 = LegacyOpenGlFlowingWaterEffect.$cfr$intArgs$a$53ce4ab4c593(85, var10, new String[]{OpenGlSceneLight.field_q[32]});
          SocketConnector.a(var9Lifetime3, 1, var6, 2431750, var7, var8, 1, gg.field_f.height() / 2 + var5, var4, -1, (byte) 60, var3);
          return;
        }
        this.h(-40, -77);
        var8Lifetime1 = var7 * 3;
        String var12 = PitSnake.field_v + "<br>" + ConstrainToFacingArcLocomotor.a(GameClock.field_b, uma.field_c, 21297, SoftwareTransform3D.field_p);
        var10Lifetime1 = GameScreen.replaceCharacter('#', "<br>", var12, 0);
        var9Lifetime1 = var10Lifetime1;
        var9Lifetime2 = LegacyOpenGlFlowingWaterEffect.$cfr$intArgs$a$53ce4ab4c593(85, var10Lifetime1, new String[]{OpenGlSceneLight.field_q[32]});
        SocketConnector.a(var9Lifetime2, 1, var6, 2431750, var7, var8Lifetime1, 1, gg.field_f.height() / 2 + var5, var4, -1, (byte) 60, var3);
    }

    final void draw(byte param0, boolean param1) {
        int var3 = this.field_s.e(param0 ^ 103);
        gg.field_f.a(aaa.a(false) - gg.field_f.width() >> 1, var3 + gg.field_f.height() / 2);
        this.h(-127, var3);
        super.draw(param0, param1);
    }

    public static void releaseStatics(int param0) {
        int var1 = 121 % ((-79 - param0) / 34);
        field_q = null;
    }

    final int getItemRight(int param0, byte param1) {
        if (param1 == -48) {
          return this.getItemX((byte) 114, param0) + this.items[param0].e(param1 ^ 141);
        }
        field_r = true;
        return this.getItemX((byte) 114, param0) + this.items[param0].e(param1 ^ 141);
    }

    static {
        field_q = new gb();
    }
}
