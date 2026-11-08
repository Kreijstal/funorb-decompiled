/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HuffmanTextSupport {
    static UiLayoutNode field_a;
    static String field_e;
    static MeshData[] field_f;
    static Sprite[] field_d;
    static int field_c;
    static String field_b;

    final static void b(int param0) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        CipherPacketBuffer var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        var3 = Kickabout.field_G;
        try {
          var1 = FootballerAiOverlaySupport.field_d;
          while (ConsoleCommand.isReflectionCheckReady(-16000)) {
            var1.writeIsaacByte(8, (byte) 94);
            fieldTemp$0 = var1.field_n + 1;
            var1.field_n = var1.field_n + 1;
            var2 = fieldTemp$0;
            MatchAgent.writeReflectionCheckReply(var1, 0);
            FootballerAiOverlaySupport.field_d.backpatchByteLength(param0 ^ 59, -var2 + var1.field_n);
          }
          if (param0 == 5) {
            return;
          }
          field_c = 84;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var1_ref), "gw.B(" + param0 + ')');
        }
    }

    final static String readHuffmanString(int param0, byte param1, PacketBuffer param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            var3_int = param2.readUnsignedSmart(-32768);
            if (param0 < var3_int) {
              var3_int = param0;
            }
            if (param1 >= -68) {
              HuffmanTextSupport.enqueueLeagueWinnerDialog(-32);
            }
            var4 = new byte[var3_int];
            param2.field_n = param2.field_n + Bzip2State.field_I.decompress(param2.field_n, var4, var3_int, param2.field_f, 0, false);
            var5 = PainterStyle.decodeCp1252((byte) -121, var3_int, 0, var4);
            stackIn_6_0 = var5;
            return stackIn_6_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackIn_8_0 = "Cabbage";
            return stackIn_8_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("gw.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_e = null;
        int var1 = -113 / ((-15 - param0) / 44);
        field_f = null;
        field_d = null;
        field_a = null;
        field_b = null;
    }

    final static void enqueueLeagueWinnerDialog(int param0) {
        if (param0 != 0) {
          HuffmanTextSupport.b(-31);
          ScrollPane.field_Jb.addLast(new LeagueWinnerDialog(), 3);
          return;
        }
        ScrollPane.field_Jb.addLast(new LeagueWinnerDialog(), 3);
    }

    final static void drawThreeSliceStrip(int param0, int param1, int param2, int param3, int param4, Sprite[] param5) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Kickabout.field_G;
        try {
          if (param5 != null &&
            param3 > 0) {
            var6_int = param5[0].field_o;
            if (param1 != -27981) {
              field_d = (Sprite[]) null;
            }
            var7 = param5[2].field_o;
            var8 = param5[1].field_o;
            param5[0].drawTinted(param2, param0, param4);
            param5[2].drawTinted(-var7 + param2 + param3, param0, param4);
            SoftwareRasterizer.saveClip(NanoTickClock.field_q);
            SoftwareRasterizer.intersectClip(param2 + var6_int, param0, param2 - (-param3 + var7), param5[1].field_v + param0);
            var9 = param2 + var6_int;
            var10 = param3 + (param2 - var7);
            for (param2 = var9; var10 > param2; param2 = param2 + var8) {
              param5[1].drawTinted(param2, param0, param4);
            }
            SoftwareRasterizer.restoreClip(NanoTickClock.field_q);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("gw.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void createQuickChatKeysHelpPanel(int param0) {
        NumericDateInputWidget.field_J = new QuickChatKeysHelpPanel(ChatMessage.field_e, AccountTermsPanel.field_H, DateInputValidator.field_f, ConsoleEvaluationException.field_e, MatchPhaseView.field_d, TextInputUiSupport.field_c);
        if (param0 != 8) {
          field_a = (UiLayoutNode) null;
        }
    }

    static {
        field_f = new MeshData[5];
        field_e = "Cancel rematch";
        field_b = "You";
    }
}
