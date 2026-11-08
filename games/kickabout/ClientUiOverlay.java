/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ClientUiOverlay implements OverlayLayer {
    private int field_a;
    static String field_g;
    static int[] field_e;
    private int field_h;
    static long field_d;
    static String field_c;
    static FullscreenFailureReason field_b;
    static String[] field_f;

    final static void pushRasterState(int param0) {
        RasterStateSnapshot var1 = (RasterStateSnapshot) (ScrollContainer.field_Ab.removeLast(-125));
        if (var1 == null) {
          var1 = new RasterStateSnapshot();
        }
        if (param0 != -12974) {
          ClientUiOverlay.releaseStatics(true);
        }
        var1.captureRasterState((byte) -96, SoftwareRasterizer.field_e, SoftwareRasterizer.field_b, SoftwareRasterizer.field_a, SoftwareRasterizer.field_g, SoftwareRasterizer.field_f, SoftwareRasterizer.field_h, SoftwareRasterizer.field_c);
        IntDoubleCommand.field_C.addLast(var1, 3);
    }

    public final boolean capturesInput(byte param0) {
        boolean stackIn_6_0 = false;
        if (param0 <= 63) {
          field_e = (int[]) null;
        }
        stackIn_6_0 = (PlayerValueSortCriterion.field_n) && (MainMenuScreen.isScreenShown(-3, -1));
        return stackIn_6_0;
    }

    public final void paint(int param0) {
        int var2;
        int var3;
        int var4;
        int stackIn_6_0 = 0;
        if (StrongCacheEntry.g(2368)) {
          stackIn_6_0 = ((8 & this.field_h) == 0) ? 1 : 0;
        } else {
          stackIn_6_0 = 0;
        }
        var2 = stackIn_6_0;
        var4 = 125 / ((param0 - 50) / 45);
        SortCriterion.a(var2 != 0, (byte) -89);
        var3 = GrayscalePaletteSupport.field_a.field_T;
        if (!this.capturesInput((byte) 103) &&
          480 > var3) {
          SoftwareRasterizer.drawHorizontalLineAlpha(0, var3, 640, 0, 128);
        }
    }

    final static String describeCurrentPacket(int param0) {
        int var2 = 0;
        String var7 = null;
        int var3 = 0;
        int var4 = 0;
        String var8 = null;
        int var5 = Kickabout.field_G;
        if (param0 != 0) {
          field_f = (String[]) null;
        }
        String var6 = "(" + PagedHelpScreen.field_A + " " + TeamSelectionView.field_n + " " + SquadSlotWidget.field_Ab + ") " + AppletContextSupport.field_b;
        String var1 = var6;
        if (MusicVolumeSupport.field_b > 0) {
          var1 = var6 + ":";
          for (var2 = 0; var2 < MusicVolumeSupport.field_b; var2++) {
            var7 = var1 + ' ';
            var3 = ByteArrayPool.field_e.field_f[var2] & 255;
            var4 = var3 >> 4;
            var3 = var3 & 15;
            if (10 <= var4) {
              var4 += 55;
            } else {
              var4 += 48;
            }
            if (var3 >= 10) {
              var3 += 55;
            } else {
              var3 += 48;
            }
            var8 = var7 + (char)var4;
            var1 = var8 + (char)var3;
          }
        }
        return var1;
    }

    final static int a(ColorQuantizationBox param0, boolean param1, ColorQuantizationBox param2) {
        int stackIn_12_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        var17 = Kickabout.field_G;
        try {
          var13 = NameSuggestionsPanel.a(param2, GameModesHelpScreen.field_F, true);
          var14 = NameSuggestionsPanel.a(param2, IntrusiveDeque.field_g, true);
          var15 = NameSuggestionsPanel.a(param2, RenderedFootballer.field_fb, true);
          var16 = NameSuggestionsPanel.a(param2, RandomAccessCacheFile.field_i, true);
          var7 = ServerMessageScreen.a(2, param2.field_l, (byte) -99, var15, param2, var13, var16, param2.field_c + 1, var14);
          var4 = ReceivedAuctionItemRow.field_Mb;
          var9 = ServerMessageScreen.a(1, param2.field_d, (byte) -99, var15, param2, var13, var16, 1 + param2.field_i, var14);
          var5 = ReceivedAuctionItemRow.field_Mb;
          var11 = ServerMessageScreen.a(0, param2.field_e, (byte) -99, var15, param2, var13, var16, 1 + param2.field_k, var14);
          var6 = ReceivedAuctionItemRow.field_Mb;
          if (var9 <= var7 &&
            var7 >= var11) {
            var3_int = 2;
            if (var4 < 0) {
              stackIn_12_0 = 0;
              return stackIn_12_0;
            }
          } else {
            if (var7 <= var9 &&
              var9 >= var11) {
              var3_int = 1;
            } else {
              var3_int = 0;
            }
          }
          param0.field_l = param2.field_l;
          param0.field_e = param2.field_e;
          param0.field_d = param2.field_d;
          if (var3_int == 2) {
            param0.field_k = param2.field_k;
            param2.field_l = var4;
            param0.field_c = var4;
            param0.field_i = param2.field_i;
          }
          if (param1) {
            ClientUiOverlay.releaseStatics(true);
          }
          if (var3_int == 1) {
            param0.field_k = param2.field_k;
            param0.field_c = param2.field_c;
            param2.field_d = var5;
            param0.field_i = var5;
          }
          if (var3_int == 0) {
            param0.field_c = param2.field_c;
            param0.field_i = param2.field_i;
            param2.field_e = var6;
            param0.field_k = var6;
          }
          param2.field_h = (param2.field_e - param2.field_k) * (-param2.field_c + param2.field_l) * (-param2.field_i + param2.field_d);
          param0.field_h = (-param0.field_k + param0.field_e) * (param0.field_l - param0.field_c) * (-param0.field_i + param0.field_d);
          stackIn_23_0 = 1;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_26_0 = var3;
          stackIn_26_1 = new StringBuilder().append("tr.A(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final static SocialPlayerRow a(String param0, byte param1) {
        String var2 = null;
        SocialPlayerRow var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_12_0 = null;
        SocialPlayerRow stackIn_19_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = Kickabout.field_G;
        try {
          if (AvailabilityCheckRequest.field_b == null) {
            return null;
          }
          if (param0 == null) {
            return null;
          }
          if (param0.length() == 0) {
            return null;
          }
          var6 = (CharSequence) ((Object) param0);
          var2 = MatchAgent.a(0, var6);
          if (param1 != 40) {
            field_g = (String) null;
          }
          if (var2 == null) {
            stackIn_12_0 = null;
            return (SocialPlayerRow) (stackIn_12_0);
          }
          var3 = (SocialPlayerRow) (AvailabilityCheckRequest.field_b.a(param1 ^ -3635, (long)var2.hashCode()));
          while (var3 != null) {
            var7 = (CharSequence) ((Object) var3.name);
            var4 = MatchAgent.a(param1 ^ 40, var7);
            if (var4.equals(var2)) {
              stackIn_19_0 = var3;
              return stackIn_19_0;
            }
            var3 = (SocialPlayerRow) (AvailabilityCheckRequest.field_b.a((byte) 103));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_24_0 = var2_ref;
          stackIn_24_1 = new StringBuilder().append("tr.D(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    private final boolean c(int param0) {
        boolean stackIn_9_0 = false;
        if (param0 != -1) {
          this.field_a = -6;
        }
        boolean decompiledFrameRemainder0 = true;
        if (!this.capturesInput((byte) 94) && (!QuickChatCategoryCache.field_e ||
          !MainMenuScreen.isScreenShown(-1, -1) &&
          !MainMenuScreen.isScreenShown(-2, -1))) {
          stackIn_9_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_9_0 = true;
        }
        return stackIn_9_0;
    }

    public final void update(int param0, boolean param1) {
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        boolean stackIn_22_3 = false;
        int stackIn_24_4;
        int stackIn_24_5;
        int stackIn_24_6;
        boolean stackIn_24_7;
        int stackIn_24_8;
        boolean stackIn_24_9;
        int stackIn_24_10;
        boolean stackIn_25_11 = false;
        int var3;
        int var4;
        int var5;
        if (param0 != -25) {
          field_e = (int[]) null;
        }
        if (PlayerValueSortCriterion.field_n) {
          if (this.c(-1) &&
            this.field_a < 20) {
            this.field_a = this.field_a + 1;
          }
          if (!this.c(-1) &&
            this.field_a > 0) {
            this.field_a = this.field_a - 1;
          }
          var3 = -(this.field_a * this.field_a) + 400;
          var4 = var3 * (-ScrollPane.field_Bb + 480) / 400 + ScrollPane.field_Bb;
          PlayerStats.a(var4, (byte) -124);
          this.field_h = this.field_h + 1;
          LobbyGameRecord.a(-121);
          if (null != PlayerContextMenu.field_i) {
            if (ShopPlayerSlot.a(PlayerContextMenu.field_i.field_Eb, -3, PlayerContextMenu.field_i.field_bc, PlayerContextMenu.field_i.field_gc)) {
              stackIn_19_0 = (GameLoopApplet.field_E.d((byte) 46)) ? 1 : 0;
            } else {
              stackIn_19_0 = 0;
            }
          } else {
            stackIn_19_0 = 0;
          }
          var5 = stackIn_19_0;
          stackIn_21_0 = 0;
          stackIn_21_1 = -117;
          stackIn_21_2 = 15;
          stackIn_22_3 = (TournamentChampionDialog.g(0) <= 50) ? false : true;
          stackIn_24_4 = 14;
          stackIn_24_5 = var5;
          stackIn_24_6 = StatefulTextPainter.field_v;
          stackIn_24_7 = param1;
          stackIn_24_8 = 11;
          stackIn_24_9 = true;
          stackIn_24_10 = 13;
          stackIn_25_11 = (this.capturesInput((byte) 121)) ? false : true;
          QuickChatMenuFactory.$cfr$intArgs$a$20586b1b86c8(stackIn_21_0, stackIn_21_1, stackIn_21_2, stackIn_22_3, stackIn_24_4, stackIn_24_5 != 0, stackIn_24_6, stackIn_24_7, stackIn_24_8, stackIn_24_9, stackIn_24_10, stackIn_25_11);
          if (SelectionMarkerSupport.field_e) {
            FootballerAiOverlaySupport.field_d.b(50, (byte) 105);
            SelectionMarkerSupport.field_e = false;
          }
          if (PlayerInputFactory.field_f) {
            FootballerAiOverlaySupport.field_d.b(10, (byte) -97);
            PlayerInputFactory.field_f = false;
          }
        } else {
          DirectByteStorage.c((byte) 51);
          this.field_a = 0;
        }
    }

    public static void releaseStatics(boolean param0) {
        field_e = null;
        field_f = null;
        field_g = null;
        field_b = null;
        field_c = null;
        if (param0) {
          String var2 = (String) null;
          ClientUiOverlay.a((String) null, (byte) -45);
        }
    }

    public final boolean handleKeyTyped(int param0, int param1, char param2) {
        if (param0 != 11516) {
          this.field_a = -5;
        }
        if ((ScrollContainer.field_Ib >= 2 || WeightedLruCache.field_d > 0) &&
          GameplayHelpScreen.field_G[86]) {
          if (84 != param1) {
          } else {
            if (null != SplashScreen.field_m) {
              UiWidget.h(0);
            } else {
              ConsoleEvaluationException.a(true, param0 - 11516);
            }
            return true;
          }
        }
        if (!this.capturesInput((byte) 73)) {
          return false;
        }
        return UiKeyRoutingSupport.routeKeyInput((byte) 88, 12, 15, 13);
    }

    static {
        int var0 = 0;
        field_g = "Profile";
        field_e = new int[16];
        for (var0 = 0; var0 < 16; var0++) {
          field_e[var0] = var0 * (var0 * 65793);
        }
        field_c = "In an Exhibition Game you don't play with your normal team, but with premade level 50 players instead.";
        field_f = new String[]{"Showing by rating", "Showing by win percentage"};
        field_b = new FullscreenFailureReason();
    }
}
