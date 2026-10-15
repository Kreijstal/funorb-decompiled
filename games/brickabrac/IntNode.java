/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntNode extends IntrusiveNode {
    int value;
    static QuickChatParameterType field_i;
    static String field_n;
    static String emailDomainAlphanumerics;
    static RgbSprite constructionSmokeSprite;
    static String field_m;
    static String field_l;
    static NodeDeque queuedLevelResults;

    public static void a(byte param0) {
        field_n = null;
        emailDomainAlphanumerics = null;
        field_m = null;
        constructionSmokeSprite = null;
        int var1 = 119 / ((param0 - 71) / 51);
        field_l = null;
        queuedLevelResults = null;
        field_i = null;
    }

    public IntNode() {
    }

    final static void pumpPlatformEvents(int obfuscationGuard, PlatformServices services, Object source) {
        int var3_int = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          if (services.eventQueue == null) {
            return;
          }
          for (var3_int = 0; var3_int < 50; var3_int++) {
            if (null != services.eventQueue.peekEvent()) {
              BytePayloadRequest.sleepMillis(obfuscationGuard + 4192, 1L);
              continue;
            }
            break;
          }
          if (obfuscationGuard != -4317) {
            constructionSmokeSprite = (RgbSprite) null;
          }
          try {
            if (source != null) {
              services.eventQueue.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(source, 1001, "dummy")));
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("kq.B(").append(obfuscationGuard).append(',');
          if (services == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (source == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static String formatChatPrefix(ChatMessage message, byte obfuscationGuard) {
        String stackIn_31_0 = null;
        Object stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        int var3 = 0;
        Object var4 = null;
        String var4_ref = null;
        int var5 = 0;
        String var6 = null;
        Object var4Lifetime1;
        Object var4Lifetime1Lifetime1;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          var2 = null;
          var3 = 13 % ((-28 - obfuscationGuard) / 42);
          if (message.senderDisplayName != null) {
            var6 = message.senderDisplayName;
            var2 = var6;
            var4 = var2;
            var2 = var6;
            var2 = var6;
            if (1 == message.badgeId) {
              var2 = "<img=0>" + var6;
            }
            if (message.badgeId == 2) {
              var2 = "<img=1>" + (String) (var2);
              var4Lifetime1 = var2;
              var4Lifetime1Lifetime1 = var2;
            }
          }
          var4_ref = "";
          if (message.channel == 2) {
            if (!message.systemMessage) {
              if (message.messageKeyHigh16 == 0 &&
                message.messageKeyLow24 == 0) {
                var4_ref = GamePresentationHelpers.formatIndexedText(SaveResultsPromptScreen.field_x, new String[]{(String) (var2)}, (byte) 103);
              } else {
                var4_ref = GamePresentationHelpers.formatIndexedText(FullscreenFailureDialog.field_fb, new String[]{(String) (var2)}, (byte) 103);
              }
            }
          } else {
            if (message.channel == 0 &&
              QuickChatParameterType.field_d) {
              var4_ref = "[" + ArcticBackground.field_u + "] ";
            }
            if (message.channel == 1) {
              var4_ref = "[" + GamePresentationHelpers.formatIndexedText(fm.field_a, new String[]{message.contextLabel}, (byte) 103) + "] ";
            }
            if (message.channel == 4 &&
              jd.field_b != null) {
              var4_ref = "[" + jd.field_b + "] ";
            }
            if (message.channel == 3) {
              var4_ref = "[#" + message.contextLabel + "] ";
            }
            if (!message.systemMessage) {
              var4_ref = var4_ref + (String) (var2) + ": ";
            }
          }
          stackIn_31_0 = var4_ref;
          return stackIn_31_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_34_0 = var2;
          stackIn_34_1 = new StringBuilder().append("kq.A(");
          if (message == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) (stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void drawBall(Ball ball, byte obfuscationGuard, int scaleDivisor, int destinationX, int destinationY) {
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String ballSummary = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        int unusedGameFlag = 0;
        Object unusedEventPayload = null;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          if (0 >= ball.penetrationTicks) {
            if (ball.phaseTicks <= 0) {
              GameplaySpriteHelpers.activeBallSprite.drawTransparent(destinationX + (ball.x256 >> 8) / scaleDivisor, (ball.y256 >> 8) / scaleDivisor + destinationY);
            } else {
              GameplaySpriteHelpers.activeBallSprite.b(destinationX + (ball.x256 >> 8) / scaleDivisor, destinationY + (ball.y256 >> 8) / scaleDivisor, 128);
            }
          } else {
            WidgetLayer.activeSteelBallSprite.drawTransparent((ball.x256 >> 8) / scaleDivisor + destinationX, destinationY + (ball.y256 >> 8) / scaleDivisor);
          }
          if (obfuscationGuard != -119) {
            unusedEventPayload = (Object) null;
            IntNode.pumpPlatformEvents(-14, (PlatformServices) null, (Object) null);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("kq.D(");
          if (ball == null) {
            ballSummary = "null";
          } else {
            ballSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(ballSummary).append(',').append(obfuscationGuard).append(',').append(scaleDivisor).append(',').append(destinationX).append(',').append(destinationY).append(')').toString());
        }
    }

    IntNode(int value) {
        this.value = value;
    }

    static {
        field_n = "Well done! <%0>";
        field_i = new QuickChatParameterType(14, 0, 4, 1);
        emailDomainAlphanumerics = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_m = "<%0> has not yet unlocked this option for use.";
        field_l = "Email (Login):";
        queuedLevelResults = new NodeDeque();
    }
}
