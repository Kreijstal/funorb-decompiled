/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntNode extends IntrusiveNode {
    int value;
    static QuickChatParameterType field_i;
    static String field_n;
    static String field_k;
    static RgbSprite constructionSmokeSprite;
    static String field_m;
    static String field_l;
    static NodeDeque queuedLevelResults;

    public static void a(byte param0) {
        field_n = null;
        field_k = null;
        field_m = null;
        constructionSmokeSprite = null;
        int var1 = 119 / ((param0 - 71) / 51);
        field_l = null;
        queuedLevelResults = null;
        field_i = null;
    }

    public IntNode() {
    }

    final static void a(int param0, PlatformServices param1, Object param2) {
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
          if (param1.eventQueue == null) {
            return;
          }
          for (var3_int = 0; var3_int < 50; var3_int++) {
            if (null != param1.eventQueue.peekEvent()) {
              wj.sleepMillis(param0 + 4192, 1L);
              continue;
            }
            break;
          }
          if (param0 != -4317) {
            constructionSmokeSprite = (RgbSprite) null;
          }
          try {
            if (param2 != null) {
              param1.eventQueue.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param2, 1001, "dummy")));
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
          stackIn_16_1 = new StringBuilder().append("kq.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param2 == null) {
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
                var4_ref = rd.a(SaveResultsPromptScreen.field_x, new String[]{(String) (var2)}, (byte) 103);
              } else {
                var4_ref = rd.a(ek.field_fb, new String[]{(String) (var2)}, (byte) 103);
              }
            }
          } else {
            if (message.channel == 0 &&
              QuickChatParameterType.field_d) {
              var4_ref = "[" + ArcticBackground.field_u + "] ";
            }
            if (message.channel == 1) {
              var4_ref = "[" + rd.a(fm.field_a, new String[]{message.contextLabel}, (byte) 103) + "] ";
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

    final static void a(Ball param0, byte param1, int param2, int param3, int param4) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          if (0 >= param0.penetrationTicks) {
            if (param0.phaseTicks <= 0) {
              gr.field_c.drawTransparent(param3 + (param0.x256 >> 8) / param2, (param0.y256 >> 8) / param2 + param4);
            } else {
              gr.field_c.b(param3 + (param0.x256 >> 8) / param2, param4 + (param0.y256 >> 8) / param2, 128);
            }
          } else {
            jc.field_J.drawTransparent((param0.x256 >> 8) / param2 + param3, param4 + (param0.y256 >> 8) / param2);
          }
          if (param1 != -119) {
            var7 = (Object) null;
            IntNode.a(-14, (PlatformServices) null, (Object) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("kq.D(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    IntNode(int value) {
        this.value = value;
    }

    static {
        field_n = "Well done! <%0>";
        field_i = new QuickChatParameterType(14, 0, 4, 1);
        field_k = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_m = "<%0> has not yet unlocked this option for use.";
        field_l = "Email (Login):";
        queuedLevelResults = new NodeDeque();
    }
}
