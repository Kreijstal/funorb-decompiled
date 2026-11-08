/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TexturedPanelPainter extends NineSlicePanelPainter {
    static int field_h;
    static String field_g;

    final static boolean b(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        boolean stackIn_8_0 = false;
        Throwable decompiledCaughtException = null;
        var1 = PlayerModelPreview.field_q;
        synchronized (var1) {
          if (param0 != -59) {
            TexturedPanelPainter.a(114);
          }
          if (vb.field_b == LineupAgent.field_n) {
            return false;
          }
          FixedQuaternion.field_e = QuickChatCategoryCache.field_a[LineupAgent.field_n];
          ClassDescriptorSupport.field_c = PlayerStats.field_a[LineupAgent.field_n];
          LineupAgent.field_n = 127 & 1 + LineupAgent.field_n;
          stackIn_8_0 = true;
        }
        return stackIn_8_0;
    }

    final static LobbyPlayerRow a(int param0, long param1) {
        if (param0 != 31253) {
          return (LobbyPlayerRow) null;
        }
        return (LobbyPlayerRow) (TrinketSlot.field_Eb.a(param0 - 34864, param1));
    }

    final void drawPanel(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var8 = Kickabout.field_G;
        int var7Lifetime1;
        SoftwareDrawingSupport.drawSpriteClipped(mk.field_a, param0, param2, param3, param1, 256, mk.field_a.field_v - param1);
        int[] var11 = new int[4];
        int[] var10 = var11;
        int[] var9 = var10;
        int[] var6 = var9;
        SoftwareRasterizer.saveClip(var11);
        if (param4 != 3) {
          TexturedPanelPainter.$cfr$intArgs$b$c4997cb15529(94);
        } else {
          SoftwareRasterizer.setClip(param0, param2, param3 + param0, param2 + param1);
          AuctionLogEntry.field_j.drawAdditive(-40 + param0, param2 - 290, 32);
          SoftwareRasterizer.restoreClip(var11);
          for (var7 = 0; var7 < 2; var7++) {
            SoftwareRasterizer.e(var7 + param0, var7 + param2, -var7 - var7 + param3, param1 - var7 - var7, 65793);
          }
          return;
        }
        SoftwareRasterizer.setClip(param0, param2, param3 + param0, param2 + param1);
        AuctionLogEntry.field_j.drawAdditive(-40 + param0, param2 - 290, 32);
        SoftwareRasterizer.restoreClip(var11);
        for (var7Lifetime1 = 0; var7Lifetime1 < 2; var7Lifetime1++) {
          SoftwareRasterizer.e(var7Lifetime1 + param0, var7Lifetime1 + param2, -var7Lifetime1 - var7Lifetime1 + param3, param1 - var7Lifetime1 - var7Lifetime1, 65793);
        }
    }

    TexturedPanelPainter() {
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != -15207) {
          TexturedPanelPainter.$cfr$intArgs$b$c4997cb15529(110);
        }
    }

    final static void c(byte param0) {
        int var1_int = 0;
        ManagerAction var2 = null;
        int var3 = Kickabout.field_G;
        if (PlayArea.a(param0 + 156)) {
          ClubStateFactory.applyPendingManagerActions(50);
          return;
        }
        if (param0 != -56) {
          return;
        }
        try {
          or.field_d.b(81, (byte) 99);
          or.field_d.field_n = or.field_d.field_n + 2;
          var1_int = or.field_d.field_n;
          or.field_d.writeByte(109, MusicPatchNode.field_h.a(false));
          var2 = (ManagerAction) (MusicPatchNode.field_h.g(param0 + 24065));
          while (var2 != null) {
            var2.writeToPacket(1, or.field_d);
            var2 = (ManagerAction) (MusicPatchNode.field_h.c(param0 ^ -23));
          }
          or.field_d.backpatchShortLength(or.field_d.field_n - var1_int, param0 + 118);
          MusicPatchNode.field_h.clear(param0 + 23053);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "nk.F(" + param0 + ')');
        }
    }

    static {
        field_g = "players";
        field_h = 0;
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static boolean $cfr$intArgs$b$c4997cb15529(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        boolean stackIn_8_0 = false;
        Throwable decompiledCaughtException = null;
        var1 = PlayerModelPreview.field_q;
        synchronized (var1) {
          if (param0 != -59) {
            TexturedPanelPainter.a(114);
          }
          if (vb.field_b == LineupAgent.field_n) {
            return false;
          }
          FixedQuaternion.field_e = QuickChatCategoryCache.field_a[LineupAgent.field_n];
          ClassDescriptorSupport.field_c = PlayerStats.field_a[LineupAgent.field_n];
          LineupAgent.field_n = 127 & 1 + LineupAgent.field_n;
          stackIn_8_0 = true;
        }
        return stackIn_8_0;
    }
}
