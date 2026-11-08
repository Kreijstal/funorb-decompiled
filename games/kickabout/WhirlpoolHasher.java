/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WhirlpoolHasher {
    private long[] field_k;
    static double field_a;
    private long[] field_c;
    static String field_b;
    private byte[] field_e;
    private byte[] field_j;
    private int field_l;
    static UiLayoutNode field_m;
    static boolean[] field_f;
    static String field_i;
    private int field_o;
    private long[] field_p;
    private long[] field_g;
    static int[] field_d;
    static boolean field_h;
    private long[] field_n;

    private final void compressBlock(byte param0) {
        long dupTemp$0 = 0L;
        long arrayValue$1 = 0L;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var3Lifetime1Lifetime1;
        int var3Lifetime1Lifetime2;
        int var3Lifetime1Lifetime3;
        var6 = Kickabout.field_G;
        var2 = 0;
        var3 = 0;
        while (var2 < 8) {
          this.field_k[var2] = SpriteBackgroundSupport.xor(PlayerInputFactory.and(255L, (long)this.field_e[7 + var3]), SpriteBackgroundSupport.xor(PlayerInputFactory.and((long)this.field_e[var3 + 6], 255L) << 8, SpriteBackgroundSupport.xor(PlayerInputFactory.and(255L, (long)this.field_e[var3 + 5]) << 16, SpriteBackgroundSupport.xor(PlayerInputFactory.and((long)this.field_e[var3 + 4], 255L) << 24, SpriteBackgroundSupport.xor(SpriteBackgroundSupport.xor(PlayerInputFactory.and((long)this.field_e[var3 + 2], 255L) << 40, SpriteBackgroundSupport.xor(PlayerInputFactory.and(71776119061217280L, (long)this.field_e[1 + var3] << 48), (long)this.field_e[var3] << 56)), PlayerInputFactory.and(1095216660480L, (long)this.field_e[var3 + 3] << 32))))));
          var2++;
          var3 += 8;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          dupTemp$0 = this.field_n[var2Lifetime1];
          arrayValue$1 = this.field_k[var2Lifetime1];
          this.field_p[var2Lifetime1] = dupTemp$0;
          this.field_c[var2Lifetime1] = SpriteBackgroundSupport.xor(arrayValue$1, dupTemp$0);
        }
        if (param0 != 18) {
          field_b = (String) null;
        }
        for (var2Lifetime2 = 1; var2Lifetime2 <= 10; var2Lifetime2++) {
          for (var3Lifetime1 = 0; var3Lifetime1 < 8; var3Lifetime1++) {
            this.field_g[var3Lifetime1] = 0L;
            var4 = 0;
            var5 = 56;
            while (8 > var4) {
              this.field_g[var3Lifetime1] = SpriteBackgroundSupport.xor(this.field_g[var3Lifetime1], ValidationHelpWidget.field_W[var4][TextLayoutLine.bitwiseAnd((int)(this.field_p[TextLayoutLine.bitwiseAnd(-var4 + var3Lifetime1, 7)] >>> var5), 255)]);
              var5 -= 8;
              var4++;
            }
          }
          for (var3Lifetime1Lifetime1 = 0; var3Lifetime1Lifetime1 < 8; var3Lifetime1Lifetime1++) {
            this.field_p[var3Lifetime1Lifetime1] = this.field_g[var3Lifetime1Lifetime1];
          }
          this.field_p[0] = SpriteBackgroundSupport.xor(this.field_p[0], ValidationHelpWidget.field_V[var2Lifetime2]);
          for (var3Lifetime1Lifetime2 = 0; var3Lifetime1Lifetime2 < 8; var3Lifetime1Lifetime2++) {
            this.field_g[var3Lifetime1Lifetime2] = this.field_p[var3Lifetime1Lifetime2];
            var7 = 0;
            var4Lifetime1 = var7;
            var5Lifetime1 = 56;
            while (var7 < 8) {
              this.field_g[var3Lifetime1Lifetime2] = SpriteBackgroundSupport.xor(this.field_g[var3Lifetime1Lifetime2], ValidationHelpWidget.field_W[var7][TextLayoutLine.bitwiseAnd(255, (int)(this.field_c[TextLayoutLine.bitwiseAnd(-var7 + var3Lifetime1Lifetime2, 7)] >>> var5Lifetime1))]);
              var5Lifetime1 -= 8;
              var7++;
            }
          }
          for (var3Lifetime1Lifetime3 = 0; var3Lifetime1Lifetime3 < 8; var3Lifetime1Lifetime3++) {
            this.field_c[var3Lifetime1Lifetime3] = this.field_g[var3Lifetime1Lifetime3];
          }
        }
        for (var2Lifetime3 = 0; 8 > var2Lifetime3; var2Lifetime3++) {
          this.field_n[var2Lifetime3] = SpriteBackgroundSupport.xor(this.field_n[var2Lifetime3], SpriteBackgroundSupport.xor(this.field_k[var2Lifetime3], this.field_c[var2Lifetime3]));
        }
    }

    public static void releaseStatics(int param0) {
        field_d = null;
        field_f = null;
        if (param0 != 0) {
          String var2 = (String) null;
          WhirlpoolHasher.a(96, (LoginText) null, (LoginText) null, 12, false, (String) null, true);
        }
        field_b = null;
        field_m = null;
        field_i = null;
    }

    final static void a(byte param0, int param1, String param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        try {
          QuickChatMenuBuilder.field_e.field_E = param2;
          if (NodeHashTableIterator.field_b == 2) {
            MySquadScreen.field_N.field_E = IntrusiveNodeHashTable.field_f;
          } else {
            MySquadScreen.field_N.field_E = ListRow.field_Bb;
          }
          var9_int = 495;
          var10 = 5;
          Kickabout.field_H.setBounds(true, var9_int - 10, 5, var10, param6);
          RotaryDialPainter.field_b.setBounds(true, Kickabout.field_H.field_q - WeightedCacheEntry.field_s.field_q, 0, 0, param6);
          WeightedCacheEntry.field_s.setBounds(true, WeightedCacheEntry.field_s.field_q, RotaryDialPainter.field_b.field_q, 0, param6);
          var10 = var10 + (param7 + param6);
          InstrumentEnvelope.field_c.setBounds(true, InstrumentEnvelope.field_c.getPreferredWidth((byte) -99), 5, var10, param3);
          var11 = MySquadScreen.field_N.getPreferredWidth((byte) -19);
          MySquadScreen.field_N.setBounds(true, var11, -5 + (var9_int - var11), var10, param3);
          QuickChatMenuBuilder.field_e.setBounds(true, var9_int, 0, 0, param1);
          var12 = 5 + (var10 + param3);
          PagedHelpScreen.field_D.setBounds(true, var9_int, 0, param1, var12);
          var12 = var12 + param1;
          PagedHelpScreen.field_D.field_R = PanelSpriteFactory.createPanelSprites(PagedHelpScreen.field_D.field_mb, 3, 2105376, 11579568, 8421504, (byte) 118);
          ContentTransitionDialog.field_Y.setBounds(true, var9_int, param4 - var9_int / 2, -(var12 / 2) + param5, var12);
          if (param0 != 49) {
            field_f = (boolean[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_8_0 = var9;
          stackIn_8_1 = new StringBuilder().append("m.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    final static int a(int param0, LoginText param1, LoginText param2, int param3, boolean param4, String param5, boolean param6) {
        int var12 = 0;
        int stackIn_5_0 = 0;
        PacketBuffer stackIn_17_0 = null;
        String stackIn_18_1 = null;
        PacketBuffer stackIn_20_0 = null;
        String stackIn_21_1 = null;
        int stackIn_35_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_67_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        int var10Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        var13 = Kickabout.field_G;
        try {
          var14 = param2.getText(27939);
          var8 = param1.getText(27939);
          if (null == SpriteButtonPainter.field_y &&
            !EmailSyntaxValidator.a(false, (byte) 123)) {
            stackIn_5_0 = -1;
            return stackIn_5_0;
          }
          if (ByteArrayPool.field_c == SpriteBackgroundSupport.field_d) {
            TutorialMessages.field_f = null;
            FootballerAiOverlaySupport.field_d.field_n = 0;
            if (param5 == null) {
              InstrumentEnvelope.field_a.field_n = 0;
              InstrumentEnvelope.field_a.writeInt(-56, TrinketUnlockNotice.field_d.nextInt());
              InstrumentEnvelope.field_a.writeInt(-34, TrinketUnlockNotice.field_d.nextInt());
              stackIn_17_0 = InstrumentEnvelope.field_a;
              if (!param2.getFlag(-95)) {
                stackIn_18_1 = "";
              } else {
                stackIn_18_1 = var14;
              }
              ((PacketBuffer) (Object) stackIn_17_0).writeCircumfixedString(stackIn_18_1, (byte) -126);
              stackIn_20_0 = InstrumentEnvelope.field_a;
              if (!param1.getFlag(-94)) {
                stackIn_21_1 = "";
              } else {
                stackIn_21_1 = var8;
              }
              ((PacketBuffer) (Object) stackIn_20_0).writeCircumfixedString(stackIn_21_1, (byte) -128);
              FootballerAiOverlaySupport.field_d.writeByte(106, 16);
              FootballerAiOverlaySupport.field_d.field_n = FootballerAiOverlaySupport.field_d.field_n + 1;
              var9 = FootballerAiOverlaySupport.field_d.field_n;
              IconLabel.writeEncryptedLoginBuffer(ManagerAction.field_h, FootballerAiOverlaySupport.field_d, (byte) -89, InstrumentEnvelope.field_a, CascadingMenu.field_Nb);
              FootballerAiOverlaySupport.field_d.backpatchByteLength(62, -var9 + FootballerAiOverlaySupport.field_d.field_n);
            } else {
              var9 = 0;
              if (param4) {
                var9 = var9 | 1;
              }
              InstrumentEnvelope.field_a.field_n = 0;
              InstrumentEnvelope.field_a.writeInt(-62, TrinketUnlockNotice.field_d.nextInt());
              InstrumentEnvelope.field_a.writeInt(-42, TrinketUnlockNotice.field_d.nextInt());
              InstrumentEnvelope.field_a.writeCircumfixedString(var14, (byte) -126);
              InstrumentEnvelope.field_a.writeCircumfixedString(var8, (byte) -126);
              var15 = (CharSequence) ((Object) param5);
              InstrumentEnvelope.field_a.writeCircumfixedString(BeveledTextPainter.a(var15, (byte) -100), (byte) -125);
              InstrumentEnvelope.field_a.writeShort(-1207444472, param0);
              InstrumentEnvelope.field_a.writeByte(106, param3);
              InstrumentEnvelope.field_a.writeByte(125, var9);
              FootballerAiOverlaySupport.field_d.writeByte(123, 18);
              FootballerAiOverlaySupport.field_d.field_n = FootballerAiOverlaySupport.field_d.field_n + 2;
              var10 = FootballerAiOverlaySupport.field_d.field_n;
              var11_ref_String = DelegatingCanvas.a(AppletContextSupport.getActiveApplet(50), (byte) 123);
              if (var11_ref_String == null) {
                var11_ref_String = "";
              }
              FootballerAiOverlaySupport.field_d.writeString(14190, var11_ref_String);
              IconLabel.writeEncryptedLoginBuffer(ManagerAction.field_h, FootballerAiOverlaySupport.field_d, (byte) -94, InstrumentEnvelope.field_a, CascadingMenu.field_Nb);
              FootballerAiOverlaySupport.field_d.backpatchShortLength(-var10 + FootballerAiOverlaySupport.field_d.field_n, 62);
            }
            ClientPacketFlushSupport.flushPackets(-1, false);
            ByteArrayPool.field_c = ByteStorage.field_e;
          }
          if (ByteStorage.field_e == ByteArrayPool.field_c &&
            SetLagCommand.readPacketBytes((byte) 55, 1)) {
            var9Lifetime1 = ByteArrayPool.field_e.readUnsignedByte((byte) -116);
            ByteArrayPool.field_e.field_n = 0;
            if (var9Lifetime1 >= 100 &&
              var9Lifetime1 <= 105) {
              ByteArrayPool.field_c = StatefulTextPainter.field_t;
              ValidatedTextWidget.field_X = new String[-100 + var9Lifetime1];
            } else {
              if (var9Lifetime1 == 248) {
                WidgetTheme.a((byte) -50, AppletContextSupport.getActiveApplet(-71));
                ListingRowCache.field_b = AccountInputValidationResult.field_i;
                FormationView.b((byte) -116);
                ContextMenuItem.field_Db = false;
                stackIn_35_0 = var9Lifetime1;
                return stackIn_35_0;
              }
              if (var9Lifetime1 == 99) {
                SetLagCommand.readPacketBytes((byte) 51, PlayAreaMovementSupport.constantOne((byte) 40));
                TutorialMessages.field_f = new Boolean(PlayerInputEvent.a(ByteArrayPool.field_e, (byte) 93));
                ByteArrayPool.field_e.field_n = 0;
              } else {
                AppletContextSupport.field_b = var9Lifetime1;
                ByteArrayPool.field_c = TournamentLobbyScreen.field_N;
                MusicVolumeSupport.field_b = -1;
              }
            }
          }
          if (StatefulTextPainter.field_t == ByteArrayPool.field_c) {
            var9Lifetime2 = 2;
            if (SetLagCommand.readPacketBytes((byte) -96, var9Lifetime2)) {
              var10Lifetime1 = ByteArrayPool.field_e.readUnsignedShort((byte) 81);
              ByteArrayPool.field_e.field_n = 0;
              if (SetLagCommand.readPacketBytes((byte) -118, var10Lifetime1)) {
                var11 = ValidatedTextWidget.field_X.length;
                for (var12 = 0; var12 < var11; var12++) {
                  ValidatedTextWidget.field_X[var12] = ByteArrayPool.field_e.readCircumfixedString(17);
                }
                FormationView.b((byte) -116);
                ContextMenuItem.field_Db = false;
                stackIn_45_0 = var11 + 100;
                return stackIn_45_0;
              }
            }
          }
          if (TournamentLobbyScreen.field_N == ByteArrayPool.field_c &&
            LoginCredentials.ensureLoginPayloadAvailable(180)) {
            if (AppletContextSupport.field_b != 255) {
              ListingRowCache.field_b = ByteArrayPool.field_e.readString(61);
            } else {
              var9_ref_String = ByteArrayPool.field_e.readNullableString(true);
              if (var9_ref_String != null) {
                BlobSubmission.writeSettingsCookie(AppletContextSupport.getActiveApplet(62), true, var9_ref_String);
              }
            }
            FormationView.b((byte) -116);
            ContextMenuItem.field_Db = false;
            stackIn_53_0 = AppletContextSupport.field_b;
            return stackIn_53_0;
          }
          if (param6) {
            stackIn_56_0 = -108;
            return stackIn_56_0;
          }
          if (null == SpriteButtonPainter.field_y) {
            if (ContextMenuItem.field_Db) {
              if (30000L >= KeyedLoginCredentials.millisSinceSessionStart(29680)) {
                ListingRowCache.field_b = RegistrationRequestState.field_e;
              } else {
                ListingRowCache.field_b = CheatCodeListener.field_h;
              }
              ContextMenuItem.field_Db = false;
              stackIn_65_0 = 249;
              return stackIn_65_0;
            }
            var9Lifetime3 = PlayerArchetypeSortCriterion.field_o;
            PlayerArchetypeSortCriterion.field_o = StrongCacheEntry.field_y;
            StrongCacheEntry.field_y = var9Lifetime3;
            ContextMenuItem.field_Db = true;
          }
          stackIn_67_0 = -1;
          return stackIn_67_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_70_0 = var7;
          stackIn_70_1 = new StringBuilder().append("m.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',');
          if (param2 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          stackIn_76_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param6).append(')').toString());
        }
    }

    final void finishDigest(byte[] param0, int param1, int param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        String var9 = null;
        var8 = Kickabout.field_G;
        try {
          this.field_e[this.field_l] = (byte)PainterStyle.bitwiseOr((int) this.field_e[this.field_l], 128 >>> TextLayoutLine.bitwiseAnd(7, this.field_o));
          this.field_l = this.field_l + 1;
          if (this.field_l > 32) {
            while (this.field_l < 64) {
              fieldTemp$0 = this.field_l;
              this.field_l = this.field_l + 1;
              this.field_e[fieldTemp$0] = (byte) 0;
            }
            this.compressBlock((byte) 18);
            this.field_l = 0;
          }
          while (32 > this.field_l) {
            fieldTemp$1 = this.field_l;
            this.field_l = this.field_l + 1;
            this.field_e[fieldTemp$1] = (byte) 0;
          }
          if (param1 != 21024) {
            var9 = (String) null;
            WhirlpoolHasher.a(64, (LoginText) null, (LoginText) null, -29, false, (String) null, true);
          }
          ArrayOperations.copyBytes(this.field_j, 0, this.field_e, 32, 32);
          this.compressBlock((byte) 18);
          var4_int = 0;
          var5 = param2;
          while (var4_int < 8) {
            var6 = this.field_n[var4_int];
            param0[var5] = (byte)(int)(var6 >>> 56);
            param0[1 + var5] = (byte)(int)(var6 >>> 48);
            param0[var5 + 2] = (byte)(int)(var6 >>> 40);
            param0[var5 + 3] = (byte)(int)(var6 >>> 32);
            param0[var5 + 4] = (byte)(int)(var6 >>> 24);
            param0[5 + var5] = (byte)(int)(var6 >>> 16);
            param0[var5 + 6] = (byte)(int)(var6 >>> 8);
            param0[7 + var5] = (byte)(int)var6;
            var5 += 8;
            var4_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("m.D(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(ResourceArchive param0, ResourceArchive param1, int param2) {
        try {
          if (param2 != 5198) {
            field_a = 1.2037987668274452;
          }
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "m.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void updateBits(byte param0, long param1, byte[] param2) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var8Lifetime1;
        var13 = Kickabout.field_G;
        try {
          var5_int = 0;
          var6 = 8 - ((int)param1 & 7) & 7;
          var7 = this.field_o & 7;
          var9 = param1;
          if (param0 < 6) {
            field_a = 0.37608334077803834;
          }
          var11 = 31;
          var12 = 0;
          while (var11 >= 0) {
            var12 = var12 + ((this.field_j[var11] & 255) + ((int)var9 & 255));
            this.field_j[var11] = (byte)var12;
            var12 = var12 >>> 8;
            var9 = var9 >>> 8;
            var11--;
          }
          while (param1 > 8L) {
            var8 = 255 & param2[var5_int] << var6 | (255 & param2[1 + var5_int]) >>> -var6 + 8;
            if (var8 >= 0 &&
              var8 < 256) {
              this.field_e[this.field_l] = (byte)PainterStyle.bitwiseOr((int) this.field_e[this.field_l], var8 >>> var7);
              this.field_o = this.field_o + (8 - var7);
              this.field_l = this.field_l + 1;
              if (512 == this.field_o) {
                this.compressBlock((byte) 18);
                this.field_l = 0;
                this.field_o = 0;
              }
              this.field_e[this.field_l] = (byte)TextLayoutLine.bitwiseAnd(255, var8 << -var7 + 8);
              this.field_o = this.field_o + var7;
              var5_int++;
              param1 = param1 - 8L;
              continue;
            }
            throw new RuntimeException("LOGIC ERROR");
          }
          if (param1 <= 0L) {
            var8Lifetime1 = 0;
          } else {
            var8Lifetime1 = param2[var5_int] << var6 & 255;
            this.field_e[this.field_l] = (byte)PainterStyle.bitwiseOr((int) this.field_e[this.field_l], var8Lifetime1 >>> var7);
          }
          if (8L > param1 + (long)var7) {
            this.field_o = (int)((long)this.field_o + param1);
          } else {
            this.field_l = this.field_l + 1;
            param1 = param1 - (long)(8 - var7);
            this.field_o = this.field_o + (8 - var7);
            if (512 == this.field_o) {
              this.compressBlock((byte) 18);
              this.field_o = 0;
              this.field_l = 0;
            }
            this.field_e[this.field_l] = (byte)TextLayoutLine.bitwiseAnd(255, var8Lifetime1 << -var7 + 8);
            this.field_o = this.field_o + (int)param1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_25_0 = var5;
          stackIn_25_1 = new StringBuilder().append("m.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final void reset(boolean param0) {
        int var2 = 0;
        int var3 = Kickabout.field_G;
        int var2Lifetime1;
        if (!param0) {
          return;
        }
        for (var2 = 0; var2 < 32; var2++) {
          this.field_j[var2] = (byte) 0;
        }
        this.field_o = 0;
        this.field_e[0] = (byte) 0;
        this.field_l = 0;
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          this.field_n[var2Lifetime1] = 0L;
        }
    }

    WhirlpoolHasher() {
        this.field_e = new byte[64];
        this.field_l = 0;
        this.field_c = new long[8];
        this.field_j = new byte[32];
        this.field_p = new long[8];
        this.field_g = new long[8];
        this.field_k = new long[8];
        this.field_n = new long[8];
        this.field_o = 0;
    }

    static {
        field_a = 0.0;
        field_i = "Attacking";
        field_b = "<%0> cannot join; the game has started.";
    }
}
