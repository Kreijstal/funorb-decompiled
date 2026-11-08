/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StringCursor {
    static String field_e;
    static int field_a;
    static String field_g;
    static Sprite[] field_b;
    int field_c;
    static int[] field_h;
    private String field_f;
    private int field_d;

    public static void releaseStatics(int param0) {
        field_g = null;
        int var1 = -36 / ((24 - param0) / 54);
        field_b = null;
        field_h = null;
        field_e = null;
    }

    final static void a(boolean param0, boolean param1, int param2) {
        PlayerContextMenu var4 = null;
        String var5_ref_String = null;
        int var5 = 0;
        int var6 = 0;
        SocialPlayerRow var3 = ModalStack.a(param0, 2, param2);
        PlayerContextMenu var4Lifetime1;
        if (!param1) {
          if (var3 != null) {
            TextButton.field_v.addGameSetupMenuItems(false, 0);
            var4 = TextButton.field_v;
            var5_ref_String = ButtonMenuScreen.field_k;
            var4.field_j.addItem(0, 5, var5_ref_String);
            var4Lifetime1 = TextButton.field_v;
            var5 = HighScoreSubmission.field_q;
            var6 = ReceivedAuctionItem.field_y;
            var4Lifetime1.field_j.layoutItems(0, 0, var5, var6, 0);
          }
          SocialListLayoutSupport.layoutSocialRows(param2, 2, param0);
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        if (param4 == 5) {
          PlayerModelPreview.field_j = param1;
          InputLayoutState.field_d = param2;
          ConsoleExpression.field_g = param0;
          PlayArea.field_c = param3;
          return;
        }
        field_h = (int[]) null;
        PlayerModelPreview.field_j = param1;
        InputLayoutState.field_d = param2;
        ConsoleExpression.field_g = param0;
        PlayArea.field_c = param3;
    }

    final static void a(boolean param0, byte param1, int param2, int param3) {
        MachineTokenStorageSupport.field_b = true;
        ChatComposeSupport.field_g = param3;
        SquadGridWidget.field_Db = null;
        TeamSelectionView.field_j = param0 ? true : false;
        FullscreenFailureReason.field_f = param2;
        TextInputWidget.field_R = 0.0f;
        DelayedServerPacket.a(18, false, -2);
        if (param1 > -85) {
          StringCursor.b((byte) -66);
        }
    }

    public final String toString() {
        return this.field_f.substring(0, this.field_c) + "|" + this.field_f.substring(this.field_c);
    }

    final static int cosAngle(int param0, int param1) {
        if (param1 > -121) {
          field_g = (String) null;
          return TriangleRasterizer.field_o[2047 & param0];
        }
        return TriangleRasterizer.field_o[2047 & param0];
    }

    final static void b(byte param0) {
        BufferedSocket.field_i = new String[RenderedBall.field_B];
        BufferedSocket.field_i[6] = TextLine.field_j;
        BufferedSocket.field_i[15] = ShopPlayerSlot.field_Eb;
        BufferedSocket.field_i[16] = ListingRowCache.field_f;
        BufferedSocket.field_i[18] = ThreadSleepSupport.field_b;
        BufferedSocket.field_i[11] = TutorialChoiceDialog.field_F;
        BufferedSocket.field_i[19] = LoginMethod.field_f;
        if (param0 < -121) {
          BufferedSocket.field_i[9] = ClientUiUpdateSupport.field_e;
          BufferedSocket.field_i[20] = PitchSurfaceLoader.field_a;
          BufferedSocket.field_i[4] = AuctionItem.field_n;
          BufferedSocket.field_i[13] = ParticipantStatus.field_o;
          BufferedSocket.field_i[7] = GradientRasterSupport.field_b;
          BufferedSocket.field_i[21] = BlobSubmission.field_e;
          BufferedSocket.field_i[5] = PanelSpriteFactory.field_c;
          BufferedSocket.field_i[17] = ImageProducerRasterBuffer.field_k;
          return;
        }
        field_e = (String) null;
        BufferedSocket.field_i[9] = ClientUiUpdateSupport.field_e;
        BufferedSocket.field_i[20] = PitchSurfaceLoader.field_a;
        BufferedSocket.field_i[4] = AuctionItem.field_n;
        BufferedSocket.field_i[13] = ParticipantStatus.field_o;
        BufferedSocket.field_i[7] = GradientRasterSupport.field_b;
        BufferedSocket.field_i[21] = BlobSubmission.field_e;
        BufferedSocket.field_i[5] = PanelSpriteFactory.field_c;
        BufferedSocket.field_i[17] = ImageProducerRasterBuffer.field_k;
    }

    final char nextChar(int param0) {
        int fieldTemp$0 = 0;
        if (param0 < -50) {
          fieldTemp$0 = this.field_c;
          this.field_c = this.field_c + 1;
          return this.field_f.charAt(fieldTemp$0);
        }
        this.field_c = -38;
        int fieldTemp$1 = this.field_c;
        this.field_c = this.field_c + 1;
        return this.field_f.charAt(fieldTemp$1);
    }

    StringCursor(String param0) {
        this.field_c = 0;
        try {
          this.field_f = param0;
          this.field_d = this.field_f.length();
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "sb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean isAtEnd(byte param0) {
        if (param0 > 55) {
          return this.field_d <= this.field_c ? true : false;
        }
        field_a = 77;
        return this.field_d <= this.field_c ? true : false;
    }

    static {
        field_g = "The game options are not all set.";
        field_e = "Please enter a year between <%0> and <%1>";
        field_h = new int[5];
    }
}
