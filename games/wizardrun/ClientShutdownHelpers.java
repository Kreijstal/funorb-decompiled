/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ClientShutdownHelpers {
    final static void configureMembershipOffers(java.applet.Applet param0, String[] param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        String var6 = null;
        int var8 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref = null;
        var8 = wizardrun.field_H;
        try {
          KeyboardShutdownHelpers.field_d = param0.getParameter("overxgames");
          if (null == KeyboardShutdownHelpers.field_d) {
            KeyboardShutdownHelpers.field_d = "0";
          }
          ProgressSubmission.field_n = param0.getParameter("overxachievements");
          if (null == ProgressSubmission.field_n) {
            ProgressSubmission.field_n = "0";
          }
          var6 = param0.getParameter("currency");
          if (var6 == null) {
            UsernameLoginCredentials.field_k = 2;
          } else {
            if (!TextLayout.isDecimalInteger((CharSequence) ((Object) var6), (byte) 78)) {
              UsernameLoginCredentials.field_k = 2;
            } else {
              UsernameLoginCredentials.field_k = GameMenu.parseDecimalInteger(1124, (CharSequence) ((Object) var6));
            }
          }
          AlternateUsernameLoginCredentials.field_n = param2;
          NameAvailabilityRequest.field_g = param5;
          RadialSelectorWidget.field_H = param4;
          ProgressSubmission.field_s = new Sprite[param1.length];
          if (param3 != 34) {
            ClientShutdownHelpers.reverseLowBits(-99, 41, 24);
          }
          for (var7 = 0; param1.length > var7; var7++) {
            ProgressSubmission.field_s[var7] = new Sprite(317, 34);
          }
          SpriteState.field_w = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_20_0 = var6_ref;
          stackIn_20_1 = new StringBuilder().append("ck.A(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void shutdownClient(byte param0) {
        WeightedLruCache.exitFullscreen((byte) 60);
        if (param0 != 84) {
          return;
        }
        if (wizardrun.field_G == null) {
          KeyboardShutdownHelpers.clearKeyHandler(4);
          NodeHashTableIterator.releaseMouseHandler((byte) -104);
          SpriteButtonPainter.closeCacheResources(1);
          if (AccountFormText.canSendAccountPackets(22845)) {
            AccountPacketState.field_b.writeCipheredOpcode((byte) 88, 1);
            PasswordContentHelpers.flushAccountPackets((byte) -67, 0);
          }
          HuffmanDecoder.closeAccountConnection(param0 ^ -55);
          return;
        }
        EmailLoginCredentials.detachCanvasInput(wizardrun.field_G, 8053);
        KeyboardShutdownHelpers.clearKeyHandler(4);
        NodeHashTableIterator.releaseMouseHandler((byte) -104);
        SpriteButtonPainter.closeCacheResources(1);
        if (AccountFormText.canSendAccountPackets(22845)) {
          AccountPacketState.field_b.writeCipheredOpcode((byte) 88, 1);
          PasswordContentHelpers.flushAccountPackets((byte) -67, 0);
        }
        HuffmanDecoder.closeAccountConnection(param0 ^ -55);
    }

    final static int reverseLowBits(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = wizardrun.field_H;
        try {
          var3_int = 0;
          while (param0 > 0) {
            var3_int = param1 & 1 | var3_int << 1;
            param0--;
            param1 = param1 >>> 1;
          }
          if (param2 != 1685) {
            ClientShutdownHelpers.reverseLowBits(-93, -128, 3);
          }
          stackIn_7_0 = var3_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ExceptionSupport.wrapException((Throwable) ((Object) var3), "ck.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void readLoginFlagResetPacket(int param0) {
        WidgetPainterState.field_d = false;
        AccountCreationForm.field_N.readUnsignedByte(255);
        if (param0 != 2046877441) {
          return;
        }
    }

    static {
    }
}
