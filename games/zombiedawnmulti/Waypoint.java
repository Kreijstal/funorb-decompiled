/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Waypoint extends IntrusiveNode {
    static String field_f;
    static int field_j;
    int y;
    static String field_i;
    int x;

    final static GameEvent readScoreUpdateEvent(CipherPacketBuffer param0, byte param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int[] var4 = null;
        int var6 = 0;
        ScoreUpdateEvent stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var2_int = param0.readUnsignedShort((byte) 69);
          var3 = param0.readUnsignedByte(param1 ^ -31477);
          var4 = new int[var3];
          for (var5 = 0; var3 > var5; var5++) {
            var4[var5] = param0.readUnsignedShort((byte) 69);
          }
          if (param1 != -114) {
            Waypoint.releaseStatics(true);
          }
          stackIn_7_0 = new ScoreUpdateEvent(var2_int, var4);
          return (GameEvent) ((Object) stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("qk.C(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void releaseStatics(boolean param0) {
        if (param0) {
          return;
        }
        field_f = null;
        field_i = null;
    }

    final static void drawTooltip(String param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          var2_int = MouseInputHandler.field_g;
          var3 = LoginMethod.field_d;
          var4 = IntroScreen.field_m.field_yb.countWrappedLines(param0, 500);
          var5 = IntroScreen.field_m.field_yb.maxLineWidth(param0, 500) + 6;
          var6 = 2 + var4 * UpgradeAccessHelpers.field_f;
          var7 = MatchingTextValidator.clampPopupX(var2_int, (byte) 126, var5, 12);
          var8 = IntrusiveNode.placePopupVertically(true, var3, 20, var6);
          SoftwareRasterizer.drawRect(var7, var8, var5, var6, 0);
          SoftwareRasterizer.fillRect(var7 + 1, var8 + 1, -2 + var5, var6 - 2, 16777088);
          if (param1 > -109) {
            field_j = 23;
          }
          IntroScreen.field_m.field_yb.drawParagraph(param0, var7 + 3, -IntroScreen.field_m.field_yb.maxAscent + 1 + (var8 + ChatPromptHelpers.field_f), 500, 1000, 0, -1, 0, 0, UpgradeAccessHelpers.field_f);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "qk.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final Waypoint copy(int param0) {
        if (param0 != 30544) {
          return (Waypoint) null;
        }
        return new Waypoint(this.x, this.y);
    }

    Waypoint(int param0, int param1) {
        this.y = param1;
        this.x = param0;
    }

    static {
        field_f = "Start Game";
        field_i = "<%0> has dropped out.";
    }
}
