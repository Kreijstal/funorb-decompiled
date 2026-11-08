/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TeamSelectionView extends MatchPhaseView {
    static String field_m;
    private UiLayoutNode[] field_k;
    private UiLayoutNode field_t;
    static boolean field_j;
    static int field_n;
    static int field_u;
    private UiLayoutNode field_s;
    static int field_q;
    private UiLayoutNode field_o;
    static WidgetTheme field_p;
    private CheckboxLabelWidget field_l;
    static int[] field_r;

    final void drawContent(int param0) {
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        String stackIn_22_0 = null;
        CheckboxLabelWidget stackIn_24_0 = null;
        boolean stackIn_25_1 = false;
        int var2;
        int var3;
        int var4;
        String var4_ref_String;
        String var5_ref_String;
        UiLayoutNode var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var4Lifetime1;
        var10 = Kickabout.field_G;
        this.drawPanelBackground(108);
        this.drawTitle(false, ValidationIndicator.field_H);
        this.drawCountdown(-2351, this.field_a.phaseTime);
        if (~this.field_g != param0) {
          stackIn_6_0 = (this.field_a.field_n.isReadyOrInactive(8658, this.field_g)) ? 1 : 0;
        } else {
          stackIn_6_0 = 0;
        }
        var2 = stackIn_6_0;
        if (!this.isLocalParticipantActive((byte) 13)) {
          stackIn_9_0 = -1;
        } else {
          stackIn_9_0 = this.field_g;
        }
        var3 = stackIn_9_0;
        for (var4 = 0; var4 < 3; var4++) {
          if (var4 == 1) {
            var5_ref_String = FadingSoundPlayer.field_e;
          } else {
            if (var4 == 0) {
              var5_ref_String = LobbyPlayerRow.field_Ub;
            } else {
              var5_ref_String = CommonGame.field_a;
            }
          }
          WidgetContainer.drawParticipantPanelBackground(var3, 8, var5_ref_String, var4 * 162 + 78, 105, 126);
        }
        if (this.isLocalParticipantActive((byte) 13)) {
          if (var2 != 0) {
            stackIn_22_0 = LobbyGameRecord.field_a;
          } else {
            stackIn_22_0 = TriangleMesh.field_A;
          }
          var4_ref_String = stackIn_22_0;
          TeamSelectionView.a(var4_ref_String, 302, 46, 316, 88, 0);
          stackIn_24_0 = this.field_l;
          stackIn_25_1 = (var2 != 0) ? false : true;
          ((CheckboxLabelWidget) (Object) stackIn_24_0).a(stackIn_25_1, (byte) 46);
        }
        this.field_t.draw(96, false);
        var4Lifetime1 = 128;
        for (var5 = 0; var5 < this.field_a.playerCount; var5++) {
          var6 = this.field_k[var5];
          if (!this.field_a.participantStatus[var5].isActive(3511)) {
            var7 = ByteArrayPool.field_d.stringWidth(var6.field_E);
            var8 = (var6.field_q - var7 >> 1) + var6.field_F;
            var9 = 20;
            SoftwareRasterizer.drawLine(var8, 6 + var4Lifetime1, var7 + var8, var4Lifetime1 + var9 - 2, 13382451);
            SoftwareRasterizer.drawLine(var8 + var7, var4Lifetime1 + 6, var8, -2 + var4Lifetime1 + var9, 13382451);
          }
          AuctionListing.pushRasterClip(76, -22914, 0, 480, 0);
          SoftwareRasterizer.fillRoundedRectangleBlended(52, var4Lifetime1, 486, 21, 7, 65793, 128);
          TeamManagementScreen.e(120);
          MySquadScreen.field_U[this.field_a.field_g[var5].field_f].draw(55, 1 + var4Lifetime1);
          AuctionListing.pushRasterClip(640, -22914, 564, 480, 0);
          SoftwareRasterizer.fillRoundedRectangleBlended(78, var4Lifetime1, 512, 21, 7, 65793, 128);
          TeamManagementScreen.e(121);
          var4Lifetime1 += 23;
          if (this.field_a.field_n.isReadyOrInactive(param0 ^ 8659, var5)) {
            PitchDecorationSupport.field_l.draw(564, var6.field_T - 4);
          }
        }
        if (this.field_a.field_f) {
          ByteArrayPool.field_d.drawText("FB", 5, 17, 16777215, -1);
        }
    }

    final static void f(int param0) {
        int var1 = 113 % ((-88 - param0) / 32);
        MusicPatchNode.field_h.clear(22997);
    }

    final void onButtonClick(int param0, int param1) {
        if (param0 < 98) {
          TeamSelectionView.f(77);
        }
    }

    public static void g(int param0) {
        field_r = null;
        if (param0 >= -20) {
          return;
        }
        field_p = null;
        field_m = null;
    }

    final static void a(int param0, String param1, boolean param2, int param3, int param4, int param5, int param6, int param7) {
        String var9 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        try {
          if (DebugConsole.field_z.field_sb != 0 &&
            !PacketBuffer.field_l) {
            if (!WriteIntegersCommand.field_C) {
              TextFieldNode.field_Wb = true;
            } else {
              ChatComposeMode.setComposeMode(0);
            }
          }
          if (TextFieldNode.field_Wb) {
            WhirlpoolHasher.a((byte) 49, 20, param1, param4, param3, param6, param4, param7, param0);
            ContentTransitionDialog.field_Y.updateInput(0, param2);
            if (param2) {
              if (0 != InstrumentEnvelope.field_c.field_sb) {
                TextFieldNode.field_Wb = false;
              }
              if (0 != MySquadScreen.field_N.field_sb) {
                TrinketCatalog.resetChatComposition(76);
                TextFieldNode.field_Wb = false;
              }
            }
          }
          if (param5 <= 70) {
            var9 = (String) null;
            TeamSelectionView.a(27, (String) null, 93);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_21_0 = var8;
          stackIn_21_1 = new StringBuilder().append("wb.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final static boolean h(int param0) {
        if (param0 > -35) {
          field_r = (int[]) null;
        }
        return FriendsListPanel.field_Ab.pollMasterIndex((byte) -45);
    }

    private final void a(byte param0, int param1) {
        this.field_a.enqueueEvent(PlayerInputFactory.createTeamEvent(this.field_g, (byte) 0, param1), -125);
        if (param0 >= -95) {
          return;
        }
        if (this.field_f) {
          FootballerAiOverlaySupport.field_d.writeIsaacByte(72, (byte) -47);
          FootballerAiOverlaySupport.field_d.writeByte(117, param1);
        }
    }

    TeamSelectionView(CommonGame param0, int param1, boolean param2) {
        super(param0, param1, param2, (int[]) null);
        int var4_int = 0;
        RuntimeException runtimeException = null;
        UiLayoutNode var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_t = new UiLayoutNode();
          this.field_t.setBounds(true, 640, 0, 0, 480);
          this.field_k = new UiLayoutNode[param0.playerCount];
          for (var4_int = 0; param0.playerCount > var4_int; var4_int++) {
            var5 = new UiLayoutNode();
            var5.field_E = param0.field_S[var4_int].toLowerCase();
            var5.field_y = 16777215;
            var5.field_X = (BitmapFont) ((Object) ByteArrayPool.field_d);
            var5.field_A = 1;
            var5.field_q = 158;
            var5.field_mb = 21;
            var5.field_J = 105 + 23 * (1 + var4_int);
            var5.field_s = PlayerShopScreen.field_P[0] - (var5.field_q >> 1) + 1;
            if (this.isLocalParticipantActive((byte) 13) &&
              var4_int == param1) {
              this.a(var5, (byte) -64);
            }
            this.field_k[var4_int] = var5;
            this.field_t.addChild((byte) -126, this.field_k[var4_int]);
          }
          if (this.isLocalParticipantActive((byte) 13)) {
            this.field_l = new CheckboxLabelWidget(HoverTooltip.field_Ab, ByteArrayPool.field_d, 120);
            this.field_l.field_s = 442;
            this.field_l.field_J = 322;
            this.field_t.addChild((byte) -121, (UiLayoutNode) (this.field_l));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_12_0 = runtimeException;
          stackIn_12_1 = new StringBuilder().append("wb.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final boolean handleKey(char param0, int param1, int param2) {
        if (this.isLocalParticipantActive((byte) 13) &&
          !this.field_a.field_n.isReadyOrInactive(8658, this.field_g)) {
          if (param2 == 96 &&
            this.field_a.field_n.canJoinTeamZero((byte) 107, this.field_g)) {
            this.a((byte) -119, 0);
          }
          if (param2 == 97 &&
            this.field_a.field_n.canJoinTeamOne((byte) 100, this.field_g)) {
            this.a((byte) -103, 1);
          }
          if (param2 == 84) {
            this.a((byte) -127, 2);
          }
        }
        if (param1 == 1670) {
        }
        return true;
    }

    final static void b(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = Kickabout.field_G;
        try {
          MusicPatchNode.field_u = new ArgbSprite[32];
          for (var1_int = 0; var1_int < 32; var1_int++) {
            var2 = -(var1_int << 11) / 32;
            MusicPatchNode.field_u[var1_int] = SpriteResourceSupport.createRingSprite(-116, var2);
          }
          if (param0 != -47) {
            field_u = 99;
          }
          BrowserUiSupport.field_c = EmailSyntaxValidator.g(-22976);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "wb.J(" + param0 + ')');
        }
    }

    final static AccountRegistrationResponse a(int param0, String param1, int param2) {
        AccountRegistrationResponse var3 = null;
        RuntimeException var3_ref = null;
        AccountRegistrationResponse stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new AccountRegistrationResponse(false);
          var3.responseCode = param2;
          if (param0 >= -118) {
            field_m = (String) null;
          }
          var3.message = param1;
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("wb.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(UiLayoutNode param0, byte param1) {
        UiLayoutNode var5 = null;
        try {
          this.field_o = new UiLayoutNode();
          this.field_s = new UiLayoutNode();
          var5 = new UiLayoutNode(0L, param0);
          var5.field_S = ShopPlayerSlot.a((byte) 26, 12303291);
          var5.field_B = -2;
          var5.field_hb = 5592405;
          var5.field_ub = 65793;
          var5.field_y = 16777215;
          this.field_o.applyStyle(var5, (byte) -80);
          this.field_s.applyStyle(var5, (byte) 107);
          this.field_o.field_E = "<lt>";
          this.field_s.field_E = "<gt>";
          param0.addChild((byte) -106, this.field_o);
          param0.addChild((byte) -112, this.field_s);
          this.field_o.field_R = null;
          this.field_s.field_R = null;
          int var4 = 100 / ((87 - param1) / 37);
          this.field_o.setBounds(true, 21, 2, 0, 21);
          this.field_s.setBounds(true, 21, -21 + param0.field_q - 2, 0, 21);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "wb.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void update(int param0, boolean param1) {
        UiLayoutNode stackIn_4_0 = null;
        boolean stackIn_5_1 = false;
        UiLayoutNode stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_22_2 = 0;
        int var3;
        UiLayoutNode var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var3Lifetime1;
        var8 = Kickabout.field_G;
        super.update(-103, param1);
        for (var3 = 0; this.field_a.playerCount > var3; var3++) {
          stackIn_4_0 = this.field_k[var3];
          stackIn_5_1 = (~(this.field_k[var3].field_s + (this.field_k[var3].field_q >> 1)) == ~PlayerShopScreen.field_P[this.field_a.field_n.selection[var3] + 1]);
          stackIn_4_0.field_lb = stackIn_5_1;
        }
        if (param0 >= -92) {
          this.onButtonClick(-102, 73);
        }
        this.field_t.updateInput(0, param1);
        var9 = 0;
        var3Lifetime1 = var9;
        while (this.field_a.playerCount > var9) {
          var4 = this.field_k[var9];
          var5 = 1 + this.field_a.field_n.selection[var9];
          var6 = PlayerShopScreen.field_P[var5] - (var4.field_q >> 1);
          if (~var6 != ~var4.field_s) {
            var7 = var4.field_s;
            var4.field_s = var4.field_s * 3 + var6 >> 2;
            if (var4.field_s == var7 &&
              var4.field_s != var6) {
              stackIn_21_0 = var4;
              stackIn_21_1 = var4.field_s;
              if (var6 >= var4.field_s) {
                stackIn_22_2 = 1;
              } else {
                stackIn_22_2 = -1;
              }
              stackIn_21_0.field_s = stackIn_21_1 + stackIn_22_2;
            }
          }
          var9++;
        }
        if (this.isLocalParticipantActive((byte) 13)) {
          this.field_o.field_lb = this.field_a.field_n.canJoinTeamZero((byte) 50, this.field_g);
          this.field_s.field_lb = this.field_a.field_n.canJoinTeamOne((byte) 79, this.field_g);
          if (0 != this.field_o.field_sb) {
            this.field_o.updateInput(0, param1);
            this.a((byte) -109, 0);
            LoginKind.a((byte) 98);
          }
          if (this.field_s.field_sb != 0) {
            this.field_s.updateInput(0, param1);
            this.a((byte) -111, 1);
            LoginKind.a((byte) -105);
          }
          if (0 != this.field_l.field_sb) {
            this.a((byte) -118, 2);
            ShopPlayerSlot.c(61, -126);
          }
          this.field_l.field_Gb = this.field_a.field_n.isReadyOrInactive(8658, this.field_g);
        }
    }

    final static void a(String param0, int param1, int param2, int param3, int param4, int param5) {
        if (param5 != 0) {
          return;
        }
        try {
          TextInputUiSupport.drawWrappedTextPanel(param2, 1, param3, true, (byte) -120, param1, 16, param4, 1, param0);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "wb.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_m = "Names should contain a maximum of 12 characters";
        field_q = 500;
        field_u = 0;
        field_n = -1;
        field_r = new int[74];
        field_r[36] = 4;
        field_r[39] = 7;
        field_r[38] = 7;
        field_r[23] = -2;
        field_r[26] = 2;
        field_r[14] = 2;
        field_r[27] = 4;
        field_r[13] = -2;
        field_r[5] = 4;
        field_r[42] = 4;
        field_r[40] = 2;
        field_r[15] = 4;
        field_r[12] = 2;
        field_r[25] = -2;
        field_r[34] = 2;
        field_r[22] = -2;
        field_r[44] = 7;
        field_r[35] = 4;
        field_r[10] = -2;
        field_r[37] = 7;
        field_r[11] = -2;
        field_r[6] = 7;
        field_r[41] = 4;
        field_r[4] = 2;
        field_r[24] = 2;
        field_r[45] = 7;
        field_r[43] = 7;
    }
}
