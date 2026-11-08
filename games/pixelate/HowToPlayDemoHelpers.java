/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HowToPlayDemoHelpers {
    static String field_a;
    static SocialPanel field_b;
    static int[] field_c;

    final static void clearChatInput(byte param0) {
        ChatInputGlobals.field_a.setLength(0);
        ChatChannelGlobals.field_d = 0;
        int var1 = 117 / ((param0 + 84) / 38);
    }

    final static void buildHowToPlayDemo(byte param0) {
        PlayerBoard var5 = null;
        PlayerBoard var6 = null;
        int var8 = 0;
        int var4_int = 0;
        int var7 = 0;
        int var9 = Pixelate.field_H ? 1 : 0;
        int var4_intLifetime1;
        int var7Lifetime1;
        SoundVoice.field_m[7][3] = "mod_zeph";
        Puzzle var10 = new Puzzle(3, 3, 0, 0, 0, 262144, 0, 0, new IndexedSprite[]{});
        Puzzle var2 = new Puzzle(3, 3, 0, 0, 0, 65536, 0, 0, FallingPieceView.field_c[4][3]);
        var2.pictureIndex = 1;
        PlayerBoard var3 = new PlayerBoard(var10);
        var3.pieceTones = new boolean[]{true, false, false, true};
        for (var4_int = 0; 3 > var4_int; var4_int++) {
          var3.cells[5 + var4_int] = (byte) 1;
        }
        for (var4_intLifetime1 = 0; var4_intLifetime1 < 3; var4_intLifetime1++) {
          var3.cells[var4_intLifetime1 + 10] = (byte)2;
        }
        var3.pieceRow = 2;
        var3.cells[16] = (byte)2;
        var3.pieceColumn = 2;
        var3.cells[22] = (byte)2;
        var3.cells[17] = (byte) 1;
        var3.cells[21] = (byte)2;
        SpriteState.field_C = new BoardView(var3, 460, 285);
        QuickChatMenu.field_Qb = new FallingPieceView(var10, var3, SpriteState.field_C);
        LaggedPacket.field_q = new PictureStrip(var2, 150, 280);
        SpriteState.field_C.setAnimationTimers(0, 0, 0, (byte) -124, 0);
        LaggedPacket.field_q.snapToTarget(param0 - 18614);
        SpriteState.field_u = new TimerBarDemo();
        SpriteState.field_u.setScrollSpeed(262144, -76);
        IncomingPacketHelpers.field_c = new ScoreMarkerDemo();
        Puzzle var4 = new Puzzle(3, 4, 0, 0, 0, 262144, 0, 0, FallingPieceView.field_c[3][4]);
        if (param0 != 37) {
          return;
        }
        try {
          var4.pictureIndex = 1;
          var5 = new PlayerBoard(var4);
          var6 = new PlayerBoard(var4);
          var5.pieceTones = new boolean[]{false, false, true, false};
          var5.pieceColumn = 3;
          var5.pieceRow = 1;
          var6.pieceTones = new boolean[]{false, true, true, false};
          var6.pieceRow = 1;
          var6.pieceColumn = 1;
          for (var7 = 0; var7 < 4; var7++) {
            var5.cells[5 + var7] = (byte) 1;
            var5.cells[var7 + 10] = (byte)2;
          }
          var5.cells[13] = (byte) 1;
          var5.cells[14] = (byte) 1;
          var5.cells[19] = (byte) 1;
          var5.cells[18] = (byte) 1;
          var6.cells[12] = (byte)2;
          var6.cells[13] = (byte)2;
          var6.cells[18] = (byte)2;
          var6.cells[17] = (byte)2;
          var7Lifetime1 = 140;
          var8 = 370;
          PasswordValidator.field_r = new BoardView(var5, var7Lifetime1, var8);
          CaretLayoutHelpers.field_b = new BoardView(var6, 640 - var7Lifetime1, var8);
          BoundedRandomAccessFile.field_g = new FallingPieceView(var4, var5, PasswordValidator.field_r);
          DialWidgetPainter.field_a = new FallingPieceView(var4, var6, CaretLayoutHelpers.field_b);
          DiskCacheRequest.field_H = new PictureStrip(var4, 320, var8);
          PasswordValidator.field_r.setAnimationTimers(0, 0, 0, (byte) -69, 0);
          CaretLayoutHelpers.field_b.setAnimationTimers(0, 0, 0, (byte) -98, 0);
          DiskCacheRequest.field_H.snapToTarget(-18577);
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "nd.A(" + param0 + ')');
        }
    }

    final static void initializeMenuButtonWidths(int param0) {
        ConditionalTextValue.field_h = PieceTiming.field_e;
        Checkbox.field_T = 10 + ConditionalTextValue.field_h.textWidth(PacketBuffer.field_o[20]);
        if (param0 != 3) {
          field_c = (int[]) null;
        }
        int var1 = ConditionalTextValue.field_h.textWidth(PacketBuffer.field_o[21]);
        if (var1 > Checkbox.field_T) {
          Checkbox.field_T = var1;
        }
        ChatAppendHelpers.createFloatingSquares(true);
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 < 5) {
          HowToPlayDemoHelpers.buildHowToPlayDemo((byte) 108);
        }
    }

    static {
        field_c = new int[16384];
        field_a = "Report abuse";
    }
}
