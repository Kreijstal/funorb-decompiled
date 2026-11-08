/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CipherPacketBuffer extends PacketBuffer {
    static String[] field_s;
    private int field_u;
    static String[] field_t;
    static ArgbSprite field_q;
    private int field_o;
    static int[] field_r;
    private IsaacRandom field_p;
    static char field_v;

    public static void releaseStatics(int param0) {
        field_r = null;
        field_t = null;
        field_q = null;
        field_s = null;
        if (param0 != 0) {
          field_s = (String[]) null;
        }
    }

    final void beginBitRead(int param0) {
        if (param0 > -99) {
          field_t = (String[]) null;
        }
        this.field_o = this.field_n * 8;
    }

    final static void loadSplitFinalFrameSprites(int param0, ResourceArchive param1) {
        Sprite var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
          var2 = new Sprite(param1.takeFileByName("", "final_frame.jpg", 8), (java.awt.Component) ((Object) RegistrationRequestState.field_d));
          var3 = var2.field_q;
          var4 = var2.field_w;
          ClientUiOverlay.pushRasterState(-12974);
          AppScreen.field_a = new Sprite(var3, param0 * var4 / 4);
          AppScreen.field_a.setRasterTarget();
          var2.drawOpaque(0, 0);
          SocialRowOrderSupport.field_e = new Sprite(var3, var4 - AppScreen.field_a.field_w);
          SocialRowOrderSupport.field_e.setRasterTarget();
          var2.drawOpaque(0, -AppScreen.field_a.field_w);
          SocialRowOrderSupport.field_e.field_n = AppScreen.field_a.field_w;
          TeamManagementScreen.popRasterState(123);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "ml.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void writeIsaacByte(int param0, byte param1) {
        int fieldTemp$0 = this.field_n;
        this.field_n = this.field_n + 1;
        this.field_f[fieldTemp$0] = (byte)(param0 + this.field_p.nextInt((byte) 100));
        int var3 = -46 % ((param1 - 13) / 59);
    }

    final void writeBits(int param0, int param1, int param2) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int var5;
        var5 = Kickabout.field_G;
        if (param1 < 34) {
          CipherPacketBuffer.releaseStatics(35);
        }
        param2 = param2 & NamedValueContainer.field_b[param0];
        while (this.field_u < param0) {
          param0 = param0 - this.field_u;
          fieldTemp$1 = this.field_n;
          this.field_n = this.field_n + 1;
          this.field_f[fieldTemp$1] = (byte)(this.field_f[fieldTemp$1] + (param2 >>> param0));
          this.field_f[this.field_n] = (byte) 0;
          this.field_u = 8;
        }
        if (this.field_u == param0) {
          fieldTemp$0 = this.field_n;
          this.field_n = this.field_n + 1;
          this.field_f[fieldTemp$0] = (byte)(this.field_f[fieldTemp$0] + param2);
          this.field_f[this.field_n] = (byte) 0;
          this.field_u = 8;
        } else {
          this.field_u = this.field_u - param0;
          this.field_f[this.field_n] = (byte)(this.field_f[this.field_n] + (param2 << this.field_u));
        }
    }

    final static void initializeExtendedKeyMappings(int param0) {
        NumericDateInputWidget.field_Q[47] = 73;
        NumericDateInputWidget.field_Q[45] = 26;
        NumericDateInputWidget.field_Q[46] = 72;
        NumericDateInputWidget.field_Q[91] = 42;
        NumericDateInputWidget.field_Q[93] = 43;
        NumericDateInputWidget.field_Q[59] = 57;
        NumericDateInputWidget.field_Q[44] = 71;
        NumericDateInputWidget.field_Q[520] = 59;
        NumericDateInputWidget.field_Q[222] = 58;
        NumericDateInputWidget.field_Q[192] = 28;
        if (param0 != 255) {
          field_v = 'ￄ';
        }
        NumericDateInputWidget.field_Q[92] = 74;
        NumericDateInputWidget.field_Q[61] = 27;
    }

    final void finishBitRead(byte param0) {
        this.field_n = (7 + this.field_o) / 8;
        int var2 = 34 % ((param0 - 32) / 62);
    }

    final void readIsaacBytes(byte param0, int param1, byte[] param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = Kickabout.field_G;
        try {
          for (var5_int = 0; var5_int < param3; var5_int++) {
            fieldTemp$0 = this.field_n;
            this.field_n = this.field_n + 1;
            param2[param1 + var5_int] = (byte)(this.field_f[fieldTemp$0] - this.field_p.nextInt((byte) 119));
          }
          if (param0 != -30) {
            this.field_u = -126;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ml.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void layoutSharedChatControls(boolean param0) {
        UiLayoutNode stackIn_4_0 = null;
        boolean stackIn_5_1 = false;
        int stackIn_7_2;
        int stackIn_7_3;
        int stackIn_8_4 = 0;
        int stackIn_10_5;
        int stackIn_11_6 = 0;
        UiLayoutNode stackIn_13_0 = null;
        boolean stackIn_14_1 = false;
        int stackIn_17_0 = 0;
        UiLayoutNode stackIn_19_0 = null;
        boolean stackIn_20_1 = false;
        int var1;
        int var2;
        int var3;
        ResourceArchive var4;
        ColorQuantizationBox.field_a = SoftwareRasterizer.field_g;
        BufferedSocket.field_s = SoftwareRasterizer.field_f;
        GeneratedPanelPainter.positionSlidingLobbyPanels((byte) 92);
        SocialUiState.field_d.layout(0, UiKeyRoutingSupport.field_c.field_q, 0, -2 + UiKeyRoutingSupport.field_c.field_mb - 40, (byte) -123);
        ConsoleValue.field_a.setBounds(true, WhirlpoolHasher.field_m.field_q, 0, 0, LineupPositionSupport.field_c);
        var1 = LineupPositionSupport.field_c + 2;
        if (param0) {
          var4 = (ResourceArchive) null;
          CipherPacketBuffer.loadSplitFinalFrameSprites(-41, (ResourceArchive) null);
        }
        stackIn_4_0 = TickClock.field_d;
        stackIn_5_1 = (param0) ? false : true;
        stackIn_7_2 = WhirlpoolHasher.field_m.field_q;
        stackIn_7_3 = 0;
        if (!NetworkArchiveRequest.field_t) {
          stackIn_8_4 = 0;
        } else {
          stackIn_8_4 = var1;
        }
        stackIn_10_5 = WhirlpoolHasher.field_m.field_mb;
        if (!NetworkArchiveRequest.field_t) {
          stackIn_11_6 = 0;
        } else {
          stackIn_11_6 = var1;
        }
        ((UiLayoutNode) (Object) stackIn_4_0).setBounds(stackIn_5_1, stackIn_7_2, stackIn_7_3, stackIn_8_4, stackIn_10_5 - stackIn_11_6);
        ClientException.layoutPlayerListPanel(0);
        MouseWheelInput.field_a.setBounds(true, UiKeyRoutingSupport.field_c.field_q, 0, UiKeyRoutingSupport.field_c.field_mb - 40, 40);
        AuctionItem.field_o.setBounds(true, AuctionPriceLimits.field_d.field_q, 0, 0, 30);
        stackIn_13_0 = QuickChatCategoryCache.field_b;
        stackIn_14_1 = (param0) ? false : true;
        ((UiLayoutNode) (Object) stackIn_13_0).setBounds(stackIn_14_1, AuctionPriceLimits.field_d.field_q, 0, 30, -2 + (-40 + (AuctionPriceLimits.field_d.field_mb - 30)));
        PlayingView.field_w.setBounds(true, 68, 5, 5, 30);
        LoginRequiredDialog.field_G.setBounds(true, 78, 75, 5, 30);
        TextWidgetPainter.field_n.setBounds(true, 48, 155, 5, 30);
        AuctionsHelpScreen.field_G.setBounds(true, 48, 205, 5, 30);
        stackIn_17_0 = (NetworkArchiveRequest.field_t) ? 250 : 200;
        var2 = stackIn_17_0;
        stackIn_19_0 = DateInputWidget.field_D;
        stackIn_20_1 = (param0) ? false : true;
        ((UiLayoutNode) (Object) stackIn_19_0).setBounds(stackIn_20_1, -var2 + 363, var2 + 5, 5, 30);
        RegistrationRequestDialog.field_lb.setBounds(true, -370 + (-5 + AuctionPriceLimits.field_d.field_q), 370, 5, 30);
        ShopPlayerSlot.field_Jb.setLayout(2, 55, -10 + (QuickChatCategoryCache.field_b.field_mb - 32), 37, 5, -5 + QuickChatCategoryCache.field_b.field_q - 5, TeamSelectionAgent.field_f);
        var3 = (2 + AuctionPriceLimits.field_d.field_q) / 2;
        ClassNameSupport.field_d.setBounds(true, var3 - 2, 0, -40 + AuctionPriceLimits.field_d.field_mb, 40);
        if (!NetworkArchiveRequest.field_t) {
          var3 = 0;
        }
        LoginCredentials.field_b.setBounds(true, -var3 + AuctionPriceLimits.field_d.field_q, var3, -40 + AuctionPriceLimits.field_d.field_mb, 40);
    }

    final static void advanceLoadingProgress(int param0, int param1) {
        if (param0 != 61) {
          CipherPacketBuffer.releaseStatics(-70);
        }
        if (!(LoadingProgressSupport.field_c <= param1)) {
          return;
        }
        LoadingProgressSupport.field_c = param1;
        LoadingProgressSupport.reportStageProgress(101, 1, 0);
    }

    CipherPacketBuffer(byte[] param0) {
        super(param0);
    }

    CipherPacketBuffer(int param0) {
        super(param0);
    }

    final void beginBitWrite(int param0) {
        this.field_f[this.field_n] = (byte) 0;
        this.field_u = 8;
        if (param0 > -39) {
          this.field_o = 31;
        }
    }

    final void finishBitWrite(boolean param0) {
        if (this.field_u < 8) {
          this.field_u = 8;
          this.field_n = this.field_n + 1;
        }
        if (param0) {
          CipherPacketBuffer.advanceLoadingProgress(-89, 18);
        }
    }

    final int readIsaacByte(byte param0) {
        if (param0 <= 90) {
          this.finishBitRead((byte) 22);
        }
        int fieldTemp$0 = this.field_n;
        this.field_n = this.field_n + 1;
        return this.field_f[fieldTemp$0] - this.field_p.nextInt((byte) 126) & 255;
    }

    final int readBits(int param0, int param1) {
        int incrementValue$0 = 0;
        int var6 = Kickabout.field_G;
        int var3 = this.field_o >> 3;
        int var4 = 8 - (7 & this.field_o);
        int var5 = 0;
        if (param1 != 59) {
          return -66;
        }
        this.field_o = this.field_o + param0;
        while (param0 > var4) {
          incrementValue$0 = var3;
          var3++;
          var5 = var5 + ((this.field_f[incrementValue$0] & NamedValueContainer.field_b[var4]) << -var4 + param0);
          param0 = param0 - var4;
          var4 = 8;
        }
        if (var4 == param0) {
          var5 = var5 + (this.field_f[var3] & NamedValueContainer.field_b[var4]);
        } else {
          var5 = var5 + (this.field_f[var3] >> var4 - param0 & NamedValueContainer.field_b[param0]);
        }
        return var5;
    }

    final void installCipher(byte param0, int[] param1) {
        try {
          this.field_p = new IsaacRandom(param1);
          if (param0 <= 99) {
            this.field_u = 93;
          }
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "ml.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_t = new String[]{"Starting Price", "Buyout", "Duration"};
        field_s = new String[]{"<img=0>Exhibition games don't use your normal team, but premade level 50 players instead.", "<img=0>As it's not your own team, no <col=ffff00>EXP</col> or <col=ffff00>league points</col> are earnt, <col=ffff00>money</col> is still rewarded though.", "<img=0>Exhibition games are <col=ffff00>unrated</col> only", "<img=0>Exhibition games can be made when creating unrated games, or you can find the first Exhibition game available by clicking the 'Quickplay' button on the main menu."};
        field_r = new int[]{180, 220, 260, 300, 340};
        field_v = '/';
    }
}
