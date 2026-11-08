/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntegerSyntaxSupport {
    static int field_c;
    static String tutorialShotModePower;
    static String connectionlostReconnecting;
    static ReflectionRequestSupport field_e;
    static int field_a;
    static int field_f;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(ChatMessage param0, int param1) {
        String stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        long stackIn_2_2 = 0L;
        int stackIn_3_3 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        PlayerContextMenu var6 = null;
        String var7 = null;
        PlayerContextMenu var8 = null;
        String var9 = null;
        PlayerContextMenu var10 = null;
        String var11 = null;
        PlayerContextMenu var12 = null;
        String var13 = null;
        PlayerContextMenu var14 = null;
        try {
          stackIn_2_0 = param0.field_j;
          stackIn_2_1 = param0.field_p;
          stackIn_2_2 = param0.field_b;
          if (1 == param0.field_p) {
            stackIn_3_3 = param0.field_o;
          } else {
            stackIn_3_3 = 0;
          }
          LogoFinalFrameLoader.openPlayerContextMenu(stackIn_2_0, stackIn_2_1, stackIn_2_2, stackIn_3_3, (ScrollPane) null, param0.field_q, param1 ^ 32614, param0.field_u, (int[]) null);
          if (param0.field_p == 0 &&
            !AccountStateQuery.c((byte) -75) &&
            HighscoresScreen.field_L == null &&
            LookupRetrySupport.field_e == null) {
            if (!ViewportController.field_y) {
              var6 = PlasmaBallSkin.field_m;
              var7 = PauseMenuScreen.messageLobby;
              var6.field_n.addAction(var7, 17130, 14);
            }
            var8 = PlasmaBallSkin.field_m;
            var9 = IntLookupQuery.quickchatLobby;
            var8.field_n.addAction(var9, 17130, 20);
          }
          if (1 == param0.field_p &&
            !AccountStateQuery.c((byte) -75) &&
            HighscoresScreen.field_L != null &&
            param0.field_o == HighscoresScreen.field_L.getGameId(20872)) {
            if (!ViewportController.field_y) {
              var10 = PlasmaBallSkin.field_m;
              var11 = DialRenderer.messageGame;
              var10.field_n.addAction(var11, 17130, 14);
            }
            var12 = PlasmaBallSkin.field_m;
            var13 = LoginRequiredScreen.quickchatGame;
            var12.field_n.addAction(var13, 17130, 20);
          }
          PlasmaBallSkin.field_m.addInviteActions(2616);
          PlasmaBallSkin.field_m.addGameInviteActions((byte) 124, false);
          if (param1 != 122) {
            IntegerSyntaxSupport.releaseStatics((byte) -50);
          }
          PlasmaBallSkin.field_m.buildPlayerMenu(param0.field_p, param0.field_d, (byte) 64);
          PlasmaBallSkin.field_m.addReportAbuseAction((byte) 95);
          PlasmaBallSkin.field_m.addChatFilterActions(param0, false);
          var14 = PlasmaBallSkin.field_m;
          var3 = DialogLayer.field_W;
          var4 = UsernameAvailabilityValidator.field_o;
          var14.field_n.layoutAtAnchor(0, 0, var3, param1 - 122, var4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("na.D(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean isValidInteger(int param0, boolean param1, CharSequence param2, int param3) {
        int var8 = 0;
        int stackIn_43_0 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        ChatMessage var11 = null;
        try {
          if (param0 >= 2 &&
            param0 <= 36) {
            var4_int = 0;
            if (param3 != 87) {
              var11 = (ChatMessage) null;
              IntegerSyntaxSupport.a((ChatMessage) null, -79);
            }
            var5 = 0;
            var6 = 0;
            var7 = param2.length();
            for (var8 = 0; var8 < var7; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param2.charAt(var8);
              if ((var8 == 0) &&
                (var9 == 45)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var8 != 0 || (var9 != 43 ||
                !param1))) {
                if (var9 >= 48 &&
                  var9 <= 57) {
                  var9 -= 48;
                } else if (var9 >= 65 &&
                  90 >= var9) {
                  var9 -= 55;
                } else {
                  if (97 > var9) {
                    return false;
                  }
                  if (122 < var9) {
                    return false;
                  }
                  var9 -= 87;
                }
                if (param0 <= var9) {
                  return false;
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = var9 + param0 * var6;
                if (var10 / param0 != var6) {
                  return false;
                }
                var6 = var10;
                var5 = 1;
              }
            }
            stackIn_43_0 = var5;
            return stackIn_43_0 != 0;
          }
          throw new IllegalArgumentException("" + param0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_46_0 = var4;
          stackIn_46_1 = new StringBuilder().append("na.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, String param1) {
        try {
          CheckboxWidget.field_N = param1;
          if (param0 != -58) {
            IntegerSyntaxSupport.releaseStatics((byte) -95);
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "na.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_e = null;
        tutorialShotModePower = null;
        connectionlostReconnecting = null;
        if (param0 != 43) {
          String var2 = (String) null;
          IntegerSyntaxSupport.a(-87, (String) null);
        }
    }

    static {
        tutorialShotModePower = "To set the <u=ffffff>power</u>, use the <img=1> <col=99ff99>mouse wheel</col>, or the <img=7> and <img=8> cursor keys, or <img=12> and <img=14>.";
        connectionlostReconnecting = "Connection lost - attempting to reconnect";
    }
}
