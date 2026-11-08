/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class LoginCredentials {
    static double field_b;
    static String field_c;
    static boolean field_a;
    static String field_d;

    abstract void writeTo(boolean param0, PacketBuffer param1);

    abstract LoginCredentialType getCredentialType(boolean param0);

    final static int handleConnectionFailure(int param0, int param1) {
        int var2;
        int var3;
        var3 = Virogrid.field_F ? 1 : 0;
        SoundPlaybackHelpers.field_b = null;
        ValidationMessageWidget.field_N = null;
        BackgroundParticle.field_q = 0;
        var2 = AccountTermsPanel.field_G;
        AccountTermsPanel.field_G = WidgetFactoryHelpers.field_c;
        if (51 != param0) {
          if (param0 != 50) {
            BoundedRandomAccessFile.field_e.field_b = 1;
          } else {
            BoundedRandomAccessFile.field_e.field_b = 5;
          }
          BoundedRandomAccessFile.field_e.field_l = BoundedRandomAccessFile.field_e.field_l + 1;
          WidgetFactoryHelpers.field_c = var2;
          if (BoundedRandomAccessFile.field_e.field_l >= 2 &&
            51 == param0) {
            return 2;
          }
          if (BoundedRandomAccessFile.field_e.field_l >= 2 &&
            50 == param0) {
            return 5;
          }
          if (BoundedRandomAccessFile.field_e.field_l >= 4) {
            return 1;
          }
          if (param1 == 1) {
            return -1;
          }
          field_a = false;
          return -1;
        }
        BoundedRandomAccessFile.field_e.field_b = 2;
        BoundedRandomAccessFile.field_e.field_l = BoundedRandomAccessFile.field_e.field_l + 1;
        WidgetFactoryHelpers.field_c = var2;
        if (BoundedRandomAccessFile.field_e.field_l >= 2 &&
          51 == param0) {
          return 2;
        }
        if (BoundedRandomAccessFile.field_e.field_l < 2) {
          if (BoundedRandomAccessFile.field_e.field_l >= 4) {
            return 1;
          }
          if (param1 == 1) {
            return -1;
          }
          field_a = false;
          return -1;
        }
        if (50 == param0) {
          return 5;
        }
        if (BoundedRandomAccessFile.field_e.field_l >= 4) {
          return 1;
        }
        if (param1 != 1) {
          field_a = false;
        }
        return -1;
    }

    final static IndexedSprite takeDecodedIndexedSprite(int param0) {
        int var2 = 66 % ((77 - param0) / 34);
        IndexedSprite var1 = new IndexedSprite(QuickChatMenu.field_Kb, LobbyJoinTextGlobals.field_d, BufferedSocket.field_w[0], ContentTransitionDialog.field_bb[0], Bzip2State.field_k[0], MarkerSlider.field_F[0], CheckboxPainter.field_j[0], GameEntryHelpers.field_c);
        PlayingSound.releaseDecodeArrays((byte) -28);
        return var1;
    }

    public static void releaseStatics(byte param0) {
        if (param0 <= 110) {
          return;
        }
        field_d = null;
        field_c = null;
    }

    static {
        field_d = "Updates will sent to the email address you've given";
        field_c = "Email is valid";
        field_a = false;
        field_b = Math.atan2(1.0, 0.0);
    }
}
