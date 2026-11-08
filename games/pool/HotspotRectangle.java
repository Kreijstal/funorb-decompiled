/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HotspotRectangle extends IntrusiveNode {
    int field_s;
    static String reject;
    HotspotRectangle field_l;
    static BitmapFont field_t;
    int field_p;
    static String rulePillar1;
    int field_q;
    static UiComponent field_v;
    int field_n;
    int field_w;
    static int field_r;
    static String playersXOfY;

    final static void a(int[][] param0, CushionSegment[] param1, Ball[] param2, int param3) {
        int dupTemp$1 = 0;
        Ball[] var4 = null;
        int var4_int = 0;
        int var5 = 0;
        Ball[] var6 = null;
        Ball[] var7 = null;
        int var8 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        Ball[] var4Lifetime1;
        int var5Lifetime1;
        try {
          NodeHashTableIterator.field_s = -1;
          Base37Support.field_b = 0;
          BallEvent.field_l = 0;
          var6 = param2;
          var4 = var6;
          for (var5 = 0; var6.length > var5; var5++) {
            var6[var5].lastAdvanceTime = 0;
          }
          var4_int = 0;
          do {
            dupTemp$1 = FadingDialog.detectAndApplyBallCollisions(param1, var4_int, param2, param0, param3 + 0);
            var4_int = dupTemp$1;
          } while (dupTemp$1 != -1);
          var7 = param2;
          var4Lifetime1 = var7;
          var8 = param3;
          var5Lifetime1 = var8;
          while (var8 < var7.length) {
            if (var7[var8].inPlay) {
              var7[var8].updateFrictionAndSpin(false);
            }
            var8++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_14_0 = var4_ref;
          stackIn_14_1 = new StringBuilder().append("qa.F(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        playersXOfY = null;
        field_t = null;
        rulePillar1 = null;
        reject = null;
        field_v = null;
        if (param0 < 4) {
          reject = (String) null;
        }
    }

    final static void a(boolean param0, String param1, int param2, String param3) {
        try {
          SpriteState.field_x = param1;
          VertexTransformSupport.field_a = param3;
          PacketAvailabilitySupport.a(param0, DebouncedValidationProvider.loggingIn, -126);
          int var4_int = -110 % ((param2 + 30) / 57);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "qa.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Pool.field_O;
        try {
          if (param0 != 1) {
            return false;
          }
          for (var2_int = 0; var2_int < param1.length(); var2_int++) {
            var3 = param1.charAt(var2_int);
            if (!ContextMenu.isAsciiLetter((char) var3, 22987) &&
              !LobbyGame.isAsciiDigit((char) var3, (byte) 120)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("qa.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void a(byte param0, boolean param1) {
        ClientException.drawLobbyPanels(param1, (byte) 80);
        if (param0 != 55) {
          String var3 = (String) null;
          HotspotRectangle.reverseString((String) null, 95);
        }
        Quaternion.drawGameOverlays(param1, param0 - 19268);
    }

    final static String reverseString(String param0, int param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param0.length();
          var3 = new char[var2_int];
          for (var4 = param1; var2_int > var4; var4++) {
            var3[var2_int + (-1 - var4)] = param0.charAt(var4);
          }
          stackIn_4_0 = new String(var3);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("qa.G(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(byte param0, int param1, BitmapFont param2, String param3, int param4, int param5) {
        int var11 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var8Lifetime1;
        int var9Lifetime1;
        var13 = Pool.field_O;
        try {
          var6_int = param2.stringWidth(param3);
          var7 = param2.maxDescent + param2.maxAscent;
          var8 = 1;
          if (var6_int > param1) {
            var9 = var6_int / param1;
            var10 = 2 * ((-1 + (var6_int % param1 + var9)) / var9) + param1;
            if (null == StateIconLabel.field_Mb) {
              StateIconLabel.field_Mb = new String[16];
            }
            var8Lifetime1 = param2.wrapText(param3, new int[]{var10}, StateIconLabel.field_Mb);
            var7 = var7 * var8Lifetime1;
            var6_int = 0;
            for (var11 = 0; var11 < var8Lifetime1; var11++) {
              var12 = param2.stringWidth(StateIconLabel.field_Mb[var11]);
              if (var12 > var6_int) {
                var6_int = var12;
              }
            }
          }
          if (param0 != 71) {
            return;
          }
          var9Lifetime1 = TimeTrialSelectScreen.field_H;
          if (var9Lifetime1 + var6_int + 6 > SoftwareRasterizer.width) {
            var9Lifetime1 = -6 - var6_int + SoftwareRasterizer.width;
          }
          var10 = -param2.field_L + (SceneNodeEntry.field_p + 32);
          if (SoftwareRasterizer.height < var7 + (var10 + 6)) {
            var10 = SceneNodeEntry.field_p + (-var7 - 6);
          }
          SoftwareRasterizer.drawRectangle(var9Lifetime1, var10, 6 + var6_int, 6 + var7, param4);
          SoftwareRasterizer.fillRectangle(1 + var9Lifetime1, 1 + var10, var6_int + 4, 4 + var7, param5);
          param2.drawParagraph(param3, 3 + var9Lifetime1, var10 + 3, var6_int, var7, param4, -1, 0, 0, param2.maxDescent + param2.maxAscent);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("qa.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    HotspotRectangle(int param0, int param1, int param2, int param3, int param4) {
        this.field_s = param0;
        this.field_q = param4;
        this.field_p = param2;
        this.field_n = param1;
        this.field_w = param3;
    }

    static {
        reject = "Reject";
        rulePillar1 = "Respect";
        playersXOfY = "Players: <%0>/<%1>";
    }
}
