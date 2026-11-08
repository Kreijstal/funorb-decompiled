/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ShopPlayerSlot extends ListRow {
    private int[] field_Pb;
    static Sprite[] field_Hb;
    int field_Fb;
    int field_Qb;
    PlayerStats field_Sb;
    private TrinketSlot[] field_Ib;
    static String field_Db;
    private boolean field_Lb;
    static int field_Ob;
    static String field_Kb;
    UiLayoutNode field_Mb;
    static ScrollPane field_Jb;
    static String field_Rb;
    int field_Gb;
    static String field_Eb;
    static String field_Cb;
    String field_Nb;

    final static void writeRequestAcknowledgement(int param0, PendingRequestAcknowledgement param1, int param2) {
        CipherPacketBuffer var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = FootballerAiOverlaySupport.field_d;
          var3.writeIsaacByte(param0, (byte) -117);
          var3.writeByte(113, param1.field_i);
          var3.writeShort(-1207444472, param1.field_f);
          if (param2 != -51265247) {
            field_Db = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("sp.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param2).append(')').toString());
        }
    }

    final static FadingSoundPlayer playDefaultFadingSound(int param0, int param1) {
        int var2 = 62 % ((-55 - param1) / 32);
        return ParticipantStatus.playFadingSound(false, 128, 126, param0);
    }

    final static void requestLeaguePlayerSearch(String param0, byte param1) {
        try {
          SquadPickerDialog.requestLeaguePlayerSearch(16, param0, true);
          if (param1 != 74) {
            PendingRequestAcknowledgement var3 = (PendingRequestAcknowledgement) null;
            ShopPlayerSlot.writeRequestAcknowledgement(40, (PendingRequestAcknowledgement) null, -96);
          }
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "sp.KA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void drawRow(int param0, int param1) {
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0;
        int stackIn_24_1;
        int stackIn_24_2;
        int stackIn_24_3;
        boolean stackIn_26_4;
        int var3;
        ArgbSprite var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var3Lifetime1;
        int var6Lifetime1;
        var10 = Kickabout.field_G;
        if (SoftwareRasterizer.field_h >= this.field_T &&
          SoftwareRasterizer.field_e <= this.field_T + this.field_mb) {
          if (this.field_Lb) {
            PlayerContextMenu.drawAnimatedPlayerMarker(56 + this.field_F, (byte) 95, 39 + this.field_T);
            var3 = ConsoleTokenCursor.field_d.stringWidth(WeightedLruCache.field_b);
            ConsoleTokenCursor.field_d.drawText(WeightedLruCache.field_b, 70 + this.field_F, this.field_T + 44, 16763955, 5583616);
            ClientPacketFlushSupport.drawAnimatedPlayerMarker(31, 28 + (this.field_F + 56 + var3), this.field_T + 39, 8000);
          }
          var3Lifetime1 = this.field_F;
          var4 = TriangleMesh.getPlayerPortraitWithClubDefaults(this.field_Sb, param0 + 0, false);
          if (var4 != null) {
            var4.draw(1 + var3Lifetime1, 4 + this.field_T);
          } else {
            ReceivedAuctionItemRow.a(19 + (1 + var3Lifetime1), -92, 23 + (this.field_T + 4));
          }
          this.field_X.drawText(this.field_Sb.getDisplayName(100), var3Lifetime1 + 40, 4 + (this.field_mb >> 1) + this.field_T, this.field_y, -1);
          var3Lifetime1 = var3Lifetime1 + this.field_Pb[param0];
          this.field_X.drawText(RegistrationUiSupport.field_e[this.field_Sb.archetype], 8 + var3Lifetime1, this.field_T + (this.field_mb >> 1) + 4, this.field_y, -1);
          var3Lifetime1 = var3Lifetime1 + this.field_Pb[1];
          var5 = 6 + var3Lifetime1;
          for (var6 = 0; 3 > var6; var6++) {
            var7 = this.field_T + 5 + 15 * var6;
            if (var6 != 0) {
              if (1 == var6) {
                stackIn_16_0 = this.field_Sb.speed;
              } else {
                stackIn_16_0 = this.field_Sb.tackle;
              }
            } else {
              stackIn_16_0 = this.field_Sb.power;
            }
            var8 = stackIn_16_0;
            if (0 == var6) {
              stackIn_21_0 = this.field_Sb.trinketPowerBonus(true, IntValueNode.b(-91));
            } else {
              if (var6 != 1) {
                stackIn_21_0 = this.field_Sb.trinketTackleBonus((byte) 84, IntValueNode.b(99));
              } else {
                stackIn_21_0 = this.field_Sb.trinketSpeedBonus(5205, IntValueNode.b(param0 + 118));
              }
            }
            var9 = stackIn_21_0;
            stackIn_24_0 = var5;
            stackIn_24_1 = var7;
            stackIn_24_2 = var8;
            stackIn_24_3 = var6;
            stackIn_26_4 = (this.field_gb) || (param1 == 2);
            SoftwareDrawingSupport.drawStatBar(stackIn_24_0, stackIn_24_1, stackIn_24_2, stackIn_24_3, stackIn_26_4, var9);
          }
          var3Lifetime1 = var3Lifetime1 + this.field_Pb[2];
          if (this.field_Sb.trinketIds.length == 0) {
            IsSixCommand.field_C.drawCentered(DiskCacheRequest.field_w, var3Lifetime1 + (this.field_Pb[3] >> 1), (this.field_mb >> 1) + this.field_T + 4, 16777215, -1);
          }
          var3Lifetime1 = var3Lifetime1 + this.field_Pb[3];
          var3Lifetime1 = var3Lifetime1 + (this.field_Pb[4] + IsSixCommand.field_C.stringWidth(this.field_Nb) >> 1);
          var6Lifetime1 = -5 + (this.field_q + this.field_F);
          if (var6Lifetime1 < var3Lifetime1) {
            var3Lifetime1 = var6Lifetime1;
          }
          IsSixCommand.field_C.drawRightAligned(this.field_Nb, var3Lifetime1, 17 + this.field_T, 16777215, -1);
          return;
        }
    }

    final static Sprite[] createSolidNineSliceSprites(byte param0, int param1) {
        if (param0 != 26) {
          return (Sprite[]) null;
        }
        Sprite[] var3 = new Sprite[9];
        Sprite[] var2 = var3;
        var3[4] = BroadcastServerCommand.createSolidSprite(param1, (byte) -96, 64);
        return var2;
    }

    final void updateRow(int param0, boolean param1) {
        int var3 = 0;
        int var4 = Kickabout.field_G;
        if (param1) {
          for (var3 = 0; this.field_Ib.length > var3; var3++) {
            this.field_Ib[var3].h((byte) 30);
          }
        }
        if (param0 != 0) {
          this.updateRow(-44, true);
        }
    }

    final static void clampCameraToPitch(int param0) {
        if (IsSixCommand.field_B) {
          return;
        }
        int var1 = param0 + 81920 / InstrumentNoteMask.field_i;
        int var2 = 61440 / InstrumentNoteMask.field_i - 240;
        int var3 = -var1 + 896;
        if ((double)var2 > ReceivedAuctionItemRow.field_Gb) {
          ReceivedAuctionItemRow.field_Gb = (double)var2;
        }
        if (UiLayoutNode.field_K < (double)var1) {
          UiLayoutNode.field_K = (double)var1;
        }
        int var4 = 1344 - var2;
        if (848.0 > InstrumentNoteMask.field_f) {
          InstrumentNoteMask.field_f = 848.0;
        }
        if ((double)var3 < UiLayoutNode.field_K) {
          UiLayoutNode.field_K = (double)var3;
        }
        if (ReceivedAuctionItemRow.field_Gb > (double)var4) {
          ReceivedAuctionItemRow.field_Gb = (double)var4;
        }
        if (2048.0 < InstrumentNoteMask.field_f) {
          InstrumentNoteMask.field_f = 2048.0;
        }
    }

    final static boolean canStartConfiguredGame(byte[] param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        String var5 = null;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -3) {
            var5 = (String) null;
            ShopPlayerSlot.requestLeaguePlayerSearch((String) null, (byte) -105);
          }
          boolean decompiledFrameRemainder0 = true;
          if (param3 >= 2 &&
            param3 <= param2 &&
            !NanoTickClock.matchesConfigurationRule(param3, 127, MusicPatchNode.field_k, param0) && (param0[3] == 0 ||
            param0[3] == 1 &&
            param3 >= 4)) {
            stackIn_11_0 = true;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_11_0 = false;
          }
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("sp.L(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_Jb = null;
        field_Cb = null;
        field_Kb = null;
        field_Hb = null;
        if (param0 != -240) {
          field_Hb = (Sprite[]) null;
        }
        field_Eb = null;
        field_Rb = null;
        field_Db = null;
    }

    ShopPlayerSlot(PlayerStats param0, int[] param1, int param2, int param3, boolean param4) {
        int var8 = 0;
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        Trinket var9 = null;
        TrinketSlot var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var6_intLifetime1;
        try {
          this.field_y = 16777215;
          stackIn_4_1 = (param4);
          this.field_Lb = stackIn_4_1;
          this.field_Sb = param0;
          this.field_mb = 50;
          this.field_Fb = param2;
          this.field_X = (BitmapFont) ((Object) IsSixCommand.field_C);
          this.field_Pb = param1;
          this.field_Qb = param3;
          this.field_Mb = SoftwareDrawingSupport.createDefaultButtonNode();
          this.addChild((byte) -121, this.field_Mb);
          this.field_Mb.field_s = this.field_Pb[-1 + this.field_Pb.length] - this.field_Mb.field_q >> 1;
          for (var6_int = 0; var6_int < this.field_Pb.length - 1; var6_int++) {
            this.field_Mb.field_s = this.field_Mb.field_s + this.field_Pb[var6_int];
          }
          this.field_Mb.field_J = 21;
          this.field_Gb = PasswordLoginCredentials.calculatePlayerValue(this.field_Sb, -576054046);
          if (this.field_Fb == -1) {
            this.field_Gb = 0;
          }
          this.field_Nb = LocalizedTextLoader.formatCurrencyAmount(this.field_Gb, 26300);
          var6_intLifetime1 = this.field_Pb[0] + this.field_Pb[1] + (this.field_Pb[2] + (this.field_Pb[3] >> 1));
          var7 = this.field_mb >> 1;
          this.field_Ib = new TrinketSlot[this.field_Sb.trinketIds.length];
          for (var8 = 0; var8 < this.field_Ib.length; var8++) {
            var9 = GeneratedPanelPainter.field_g[this.field_Sb.trinketIds[var8]];
            var10 = new TrinketSlot(var9, true);
            var11 = var6_intLifetime1;
            var12 = var7;
            if (this.field_Sb.trinketIds.length != 2) {
              if (3 == this.field_Sb.trinketIds.length) {
                if (var8 != 1) {
                  var12 += 10;
                  var11 = var8 / 2 * 20 - 10 + var11;
                } else {
                  var12 -= 10;
                }
              }
            } else {
              var11 = -10 + var11 + var8 * 20;
            }
            var10.field_J = var12 - (var10.field_mb >> 1);
            var10.field_s = -(var10.field_q >> 1) + var11;
            this.addChild((byte) -105, (UiLayoutNode) (var10));
            this.field_Ib[var8] = var10;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_21_0 = var6;
          stackIn_21_1 = new StringBuilder().append("sp.<init>(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_Db = "Unable to delete name - system busy";
        field_Ob = 0;
        field_Kb = "<%0> has entered a game.";
        field_Rb = "No Buyout";
        field_Cb = "Message lobby";
        field_Eb = "Scamming";
    }
}
