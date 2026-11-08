/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj {
    static AccountNameCheckState field_a;
    static int field_b;

    final static void a(byte param0, int param1) {
        int var2_int = 0;
        ArgbSprite var3 = null;
        double[] var7 = null;
        double[] var6 = null;
        double[] var5 = null;
        int var4 = Kickabout.field_G;
        DateInputValidator.field_e = ServerTextTemplate.a(0, param1, param0 - 7, 11, true, 30);
        hq.field_e = ServerTextTemplate.a(30, param1, param0 ^ 111, 11, false, 60);
        DualLinkNode.field_h = SortCriterion.a(60, param1, true, (byte) -67, 80, 11);
        ModalPanel.field_G = SortCriterion.a(80, param1, false, (byte) -120, 95, 11);
        ClientPacketFlushSupport.field_f = (Sprite[]) ((Object) new ArgbSprite[4]);
        if (param0 != -39) {
          return;
        }
        try {
          for (var2_int = 0; var2_int < 4; var2_int++) {
            var3 = DiskCacheWorker.field_i[var2_int];
            ClientPacketFlushSupport.field_f[var2_int] = ih.field_c == 0 ? (Sprite) ((Object) var3) : (Sprite) ((Object) var3.copyArgb());
            LoginForm.a(ClientPacketFlushSupport.field_f[var2_int], 20684);
            DelayedServerPacket.a(100, 9863, var2_int + 96);
          }
          var7 = FriendsListPanel.field_Bb[ih.field_c];
          var6 = var7;
          var5 = var6;
          double[] var2 = var5;
          LineupView.field_x = Trinket.field_f.copyArgb();
          LoggedGoal.field_o = TrinketPickerDialog.field_J.copy();
          PlayerValueSortCriterion.field_p = LoginMethod.field_g.copy();
          SpritePixelSupport.adjustHsv(LineupView.field_x.field_y, var7[0], var7[1], var7[2]);
          SpritePixelSupport.adjustHsv(LoggedGoal.field_o.field_y, var7[0], var7[1], var7[2]);
          SpritePixelSupport.adjustHsv(PlayerValueSortCriterion.field_p.field_y, var7[0], var7[1], var7[2]);
          FadingSoundPlayer.field_p = SoftwareDrawingSupport.mirrorVertically(LineupView.field_x);
          ConsoleCommand.field_z = SoftwareDrawingSupport.mirrorHorizontally(FadingSoundPlayer.field_p);
          ByteStorage.field_b = SoftwareDrawingSupport.mirrorVertically(ConsoleCommand.field_z);
          mt.field_d = new Sprite(ConsoleCommand.field_z.field_o, LoggedGoal.field_o.field_v);
          TextLayoutLine.field_a = new Sprite(PlayerValueSortCriterion.field_p.field_o, LineupView.field_x.field_v);
          PacketBuffer.a(-70, mt.field_d);
          LoggedGoal.field_o.d(SoftwareRasterizer.field_g - LoggedGoal.field_o.field_o, 0);
          TeamManagementScreen.e(param0 + 158);
          PacketBuffer.a(-42, TextLayoutLine.field_a);
          PlayerValueSortCriterion.field_p.d(0, -PlayerValueSortCriterion.field_p.field_v + SoftwareRasterizer.field_f);
          TeamManagementScreen.e(118);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "mj.D(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
          field_b = 80;
        }
    }

    final static void a(boolean param0, PcmSampleStream param1) {
        try {
          if (!param0) {
            mj.a(-0.3391155972284911, 69, -1.3430351906994813, -0.23628554021572995);
          }
          PlayerMeshFactory.field_b.removeSubstream(param1);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "mj.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(double param0, int param1, double param2, double param3) {
        CachedArchiveSource.field_C = param2;
        AuctionLogEntry.field_f = param3;
        if (param1 != 60) {
          mj.a(49);
        }
        PlayArea.field_d = param0 * 8.0;
        if (FaceNormal.field_c) {
          CachedArchiveSource.field_C = 896.0 - CachedArchiveSource.field_C;
          AuctionLogEntry.field_f = 1344.0 - AuctionLogEntry.field_f;
        }
    }

    static {
    }
}
