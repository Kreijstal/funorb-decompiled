/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameKeyHandler implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static int field_c;
    static int[] field_b;
    static String field_a;

    final static void a(ResourceArchive param0, ResourceArchive param1, byte param2) {
        if (param2 > -68) {
          return;
        }
        try {
          SelectionMarkerSupport.field_d = param0;
          ListingRowCache.field_c = param1;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "de.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void b(int param0, byte param1) {
        if (param1 != -110) {
          return;
        }
        MatchTextInputOverlay.field_a = (param0 << 16) / 150;
        MatchTextInputOverlay.field_f = param0 * 400 / 150;
        MatchTextInputOverlay.field_c = param0 * 100 / 150;
    }

    final static int a(int param0, byte param1) {
        int var2 = 33 % ((param1 + 15) / 62);
        return DisplayNameUiSupport.a(param0, -524289) >> 8;
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (PlayerModelPreview.field_q != null) {
            GzipDecoder.field_d = -1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("de.focusLost(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
          if (PlayerModelPreview.field_q != null) {
            var2_int = param0.getKeyChar();
            if (0 != var2_int && 65535 != var2_int &&
              DebugConsole.a((char) var2_int, (byte) 80)) {
              var3 = MarkerSliderPainter.field_j + 1 & 127;
              if (var3 != LineupAgent.field_n) {
                QuickChatCategoryCache.field_a[MarkerSliderPainter.field_j] = -1;
                PlayerStats.field_a[MarkerSliderPainter.field_j] = (char)var2_int;
                MarkerSliderPainter.field_j = var3;
              }
            }
          }
          param0.consume();
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "de.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0) {
        int var24 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var25 = 0;
        int var26 = 0;
        int var22Lifetime1;
        int var22Lifetime2;
        var26 = Kickabout.field_G;
        try {
          var1_int = AuctionItem.field_f * 6 >> 8;
          var2 = 2 * DualLinkNode.field_h[0].field_i;
          var3 = 3 * DateInputValidator.field_e[0].field_a;
          var4 = 146 * InstrumentNoteMask.field_i >> 8;
          var5 = InstrumentNoteMask.field_i * 140 >> 8;
          stackIn_4_0 = (SessionUrlSupport.screenToWorldX(0, (byte) -1) >= -var2 + 896 >> 1) ? 0 : 1;
          var6 = stackIn_4_0;
          stackIn_7_0 = (MatchHudSupport.screenToWorldY(0, 4620) >= 1344 - var3 >> 1) ? 0 : 1;
          var7 = stackIn_7_0;
          stackIn_10_0 = (896 + var2 >> 1 >= SessionUrlSupport.screenToWorldX(640, (byte) -1)) ? 0 : 1;
          var8 = stackIn_10_0;
          stackIn_13_0 = (MatchHudSupport.screenToWorldY(480, 4620) <= 1344 + var3 >> 1) ? 0 : 1;
          var9 = stackIn_13_0;
          var10 = MySquadScreen.c(-75, 448);
          var11 = PitchProjectionSupport.worldToScreenY(672, (byte) -56);
          var12 = DualLinkNode.field_h[0].field_i * InstrumentNoteMask.field_i >> 8;
          var13 = InstrumentNoteMask.field_i * DateInputValidator.field_e[0].field_a >> 8;
          var14 = var10 + (-(1 * var12) + 0);
          var15 = -(1 * var13) + (var11 - (var13 >> 1));
          var16 = var12 * 2 + var14;
          var17 = var13 * 3 + var15;
          var18 = ClientPacketFlushSupport.field_f[0].field_v * InstrumentNoteMask.field_i >> 8;
          var20 = 84 % ((30 - param0) / 34);
          var19 = ClientPacketFlushSupport.field_f[0].field_o * InstrumentNoteMask.field_i >> 8;
          var21 = InstrumentNoteMask.field_i * (LoggedGoal.field_o.field_o + 78) >> 8;
          if (var6 != 0 &&
            var7 != 0) {
            ListRow.a(-12376, -var21 + var14, var15 - var5, FadingSoundPlayer.field_p);
            ListRow.a(-12376, var14 - var19, var15 - var18, ClientPacketFlushSupport.field_f[0]);
          }
          if (var8 != 0 &&
            var7 != 0) {
            ListRow.a(-12376, var16, var15 - var5, ConsoleCommand.field_z);
            ListRow.a(-12376, var16, -var18 + var15, ClientPacketFlushSupport.field_f[1]);
          }
          for (var22 = 0; var22 < 2; var22++) {
            if (var7 != 0) {
              ListRow.a(-12376, var14 + var12 * var22, -var5 + var15, PlayerValueSortCriterion.field_p);
              AuctionsScreen.a(-840618968, var12 * var22 + var14, DualLinkNode.field_h[var1_int], -var18 + var15);
            }
            if (var9 != 0) {
              ListRow.a(-12376, var12 * var22 + var14, var17, TextLayoutLine.field_a);
              AuctionsScreen.a(-840618968, var14 + var22 * var12, ModalPanel.field_G[var1_int], var17 + var5);
            }
          }
          for (var22Lifetime1 = 0; var22Lifetime1 < 3; var22Lifetime1++) {
            if (var6 != 0) {
              ListRow.a(-12376, -var21 + var14, var13 * var22Lifetime1 + var15, LoggedGoal.field_o);
              AuctionsScreen.a(-840618968, -var19 + var14, DateInputValidator.field_e[var1_int], var22Lifetime1 * var13 + var15);
            }
            if (var8 != 0) {
              ListRow.a(-12376, var16, var13 * var22Lifetime1 + var15, GoalSpriteLoader.field_d);
              AuctionsScreen.a(-840618968, var16 + var4, ClientInteractionSupport.field_e[var1_int], var15 + var22Lifetime1 * var13);
            }
          }
          if (var6 != 0 &&
            var9 != 0) {
            ListRow.a(-12376, -var21 + var14, var17, LineupView.field_x);
            ListRow.a(-12376, var14 - var19, var17, ClientPacketFlushSupport.field_f[2]);
          }
          if (var8 != 0 &&
            var9 != 0) {
            ListRow.a(-12376, var16, var17, ByteStorage.field_b);
            ListRow.a(-12376, var16, var17, ClientPacketFlushSupport.field_f[3]);
          }
          var22Lifetime2 = MySquadScreen.c(-82, -130);
          var23 = MySquadScreen.c(-70, 998);
          for (var24 = 0; var24 < 8; var24++) {
            var25 = PitchProjectionSupport.worldToScreenY(40 + (-22 + ManagerAction.field_f.field_v) * var24, (byte) -56);
            ListRow.a(-12376, var22Lifetime2, var25, ManagerAction.field_f);
            ListRow.a(-12376, var23, var25, MusicPatchNode.field_m);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var1), "de.A(" + param0 + ')');
        }
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3Lifetime1;
        try {
          if (null != PlayerModelPreview.field_q) {
            ConsoleLexer.field_c = 0;
            var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              NumericDateInputWidget.field_Q.length > var2_int) {
              var2_int = NumericDateInputWidget.field_Q[var2_int];
              if ((128 & var2_int) != 0) {
                var2_int = -1;
              }
            } else {
              var2_int = -1;
            }
            if (GzipDecoder.field_d >= 0 &&
              var2_int >= 0) {
              BlobSubmission.field_j[GzipDecoder.field_d] = var2_int;
              GzipDecoder.field_d = 127 & 1 + GzipDecoder.field_d;
              if (GzipDecoder.field_d == ChatMessage.field_i) {
                GzipDecoder.field_d = -1;
              }
            }
            if (var2_int >= 0) {
              var3 = 127 & MarkerSliderPainter.field_j + 1;
              if (var3 != LineupAgent.field_n) {
                QuickChatCategoryCache.field_a[MarkerSliderPainter.field_j] = var2_int;
                PlayerStats.field_a[MarkerSliderPainter.field_j] = (char)0;
                MarkerSliderPainter.field_j = var3;
              }
            }
            var3Lifetime1 = param0.getModifiers();
            if ((var3Lifetime1 & 10) != 0 ||
              var2_int == 85 ||
              var2_int == 10) {
              param0.consume();
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("de.keyPressed(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (PlayerModelPreview.field_q != null) {
            ConsoleLexer.field_c = 0;
            var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              NumericDateInputWidget.field_Q.length > var2_int) {
              var2_int = NumericDateInputWidget.field_Q[var2_int] & -129;
            } else {
              var2_int = -1;
            }
            if (GzipDecoder.field_d >= 0 &&
              var2_int >= 0) {
              BlobSubmission.field_j[GzipDecoder.field_d] = ~var2_int;
              GzipDecoder.field_d = GzipDecoder.field_d + 1 & 127;
              if (GzipDecoder.field_d == ChatMessage.field_i) {
                GzipDecoder.field_d = -1;
              }
            }
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("de.keyReleased(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static void b(int param0) {
        int var2 = 0;
        if (!(CachedListingRow.field_i <= 0)) {
          CachedListingRow.field_i = CachedListingRow.field_i - 1;
          return;
        }
        if (param0 != 40) {
          field_c = -21;
        }
        int var1 = SquadPickerDialog.field_Q.field_o + 5;
        if (LoginMethod.field_d &&
          -1 + SquadPickerDialog.field_L.length > AuctionListingDialog.field_I) {
          AuctionListingDialog.field_I = AuctionListingDialog.field_I + 1;
          PasswordLoginCredentials.field_i = SquadPickerDialog.field_L[AuctionListingDialog.field_I] * var1 >> 12;
        }
        if (!LoginMethod.field_d &&
          !(AuctionListingDialog.field_I <= 0)) {
          AuctionListingDialog.field_I = AuctionListingDialog.field_I - 1;
          var2 = -1 + SquadPickerDialog.field_L.length;
          PasswordLoginCredentials.field_i = var1 - (-AuctionListingDialog.field_I + var2) * ((var2 - AuctionListingDialog.field_I) * var1) / (var2 * var2);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 3902) {
          field_c = -54;
        }
    }

    static {
        field_a = "Press 'Esc' at any time to take an early bath.";
        field_b = new int[74];
        field_b[23] = 4;
        field_b[17] = -2;
        field_b[37] = -2;
        field_b[18] = 2;
        field_b[7] = 2;
        field_b[21] = 4;
        field_b[16] = -2;
        field_b[22] = 2;
        field_b[9] = 7;
        field_b[33] = 7;
        field_b[8] = 4;
        field_b[32] = 7;
        field_b[38] = 2;
        field_b[19] = -2;
        field_b[35] = -2;
        field_b[26] = 7;
        field_b[28] = 2;
        field_b[20] = 2;
        field_b[25] = 7;
        field_b[30] = 4;
        field_b[36] = 2;
        field_b[24] = 4;
        field_b[29] = 4;
        field_b[27] = 7;
        field_b[34] = -2;
        field_b[39] = 4;
        field_b[31] = 7;
    }
}
