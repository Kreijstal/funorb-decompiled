/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj {
    static RgbSprite[][] field_c;
    static String field_b;
    static RgbSprite[][] chocSegsSprites;

    public static void b(int param0) {
        if (param0 == -789103103) {
          field_c = (RgbSprite[][]) null;
          chocSegsSprites = (RgbSprite[][]) null;
          field_b = null;
          return;
        }
        aj.a(57, -37, 115);
        field_c = (RgbSprite[][]) null;
        chocSegsSprites = (RgbSprite[][]) null;
        field_b = null;
    }

    final static ResourceArchive a(int param0, boolean param1) {
        if (param1) {
          return go.a(false, param0, false, 1, true, true);
        }
        field_b = (String) null;
        return go.a(false, param0, false, 1, true, true);
    }

    final static mh a(int param0) {
        if (param0 != 1345) {
          aj.b(94);
          return rl.field_e.field_Rb;
        }
        return rl.field_e.field_Rb;
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          var3_int = param0;
          var4 = mi.field_d;
          while (kn.field_E.length > var3_int) {
            var5 = MenuSelection.field_q[var3_int];
            if (0 > var5) {
              var4 = var4 + BufferedSocket.field_m;
            } else {
              var6 = pl.a(0, kn.field_E[var3_int], true);
              var7 = -(var6 >> 1) + NewAchievementsScreen.field_J;
              var4 = var4 + GameClock.field_g;
              if (bg.containsRectanglePoint(-ek.field_lb + var7, (GameCanvas.field_f << 1) + TooltipSprite.field_i, (ek.field_lb << 1) + var6, (byte) 80, param1, param2, var4)) {
                stackIn_7_0 = var5;
                return stackIn_7_0;
              }
              var4 = var4 + (GameClock.field_g + ((GameCanvas.field_f << 1) + TooltipSprite.field_i));
            }
            var3_int++;
          }
          stackIn_13_0 = -1;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var3), "aj.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_b = "Asking to join <%0>'s game...";
    }
}
