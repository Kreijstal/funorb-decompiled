/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ViewportController {
    private int field_l;
    private int field_x;
    private int field_i;
    private int field_j;
    static int field_e;
    private int field_p;
    private int field_h;
    private boolean field_v;
    private int field_b;
    private int field_q;
    private int field_o;
    static boolean field_w;
    private int field_d;
    private int field_c;
    private int field_g;
    static int[] field_t;
    private int field_s;
    static int field_n;
    private int field_r;
    static int field_f;
    private int field_m;
    private CanvasResizeListener field_u;
    private float field_k;
    static TransitionPhase field_a;

    final static void drawOverlays(boolean param0, boolean param1) {
        WidgetStyleLayer.drawLobbyAndChatPanels(param1, (byte) -88);
        if (!param0) {
          ViewportController.sendGameSettings(false, 64);
        }
        DialWidgetPainter.drawLobbyOverlays(param0, param1);
    }

    private final void applyDesiredSize(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        QueuedStatSubmission var6;
        var5 = TetraLink.field_J;
        var2 = this.field_l;
        if (param0 > -54) {
          var6 = (QueuedStatSubmission) null;
          ViewportController.writeQueuedRecordPacket(78, (QueuedStatSubmission) null, -43);
        }
        var3 = this.field_s;
        if (!this.isResizeAllowed(0)) {
          this.field_v = false;
          return;
        }
        if (this.field_q >= var3) {
          if (var3 < this.field_j) {
            var3 = this.field_j;
          }
        } else {
          var3 = this.field_q;
        }
        if (var2 > this.field_i) {
          var2 = this.field_i;
        } else {
          if (var2 < this.field_c) {
            var2 = this.field_c;
          }
        }
        if (this.field_k > 0.0f) {
          var4 = (int)(0.5f + this.field_k * (float)var3);
          if (var4 <= var2) {
            if (var2 > var4) {
              var2 = var4;
            }
          } else {
            var3 = (int)((float)var2 / this.field_k);
          }
        }
        if (var2 != NameSuggestionsPanel.field_M ||
          var3 != DebouncedValidator.field_h) {
          this.field_u.onCanvasResize(var3, -13325, var2);
        }
        if (this.field_l > 0) {
          RandomAccessCacheFile.field_g = (this.field_l - NameSuggestionsPanel.field_M) / 2;
        }
    }

    final void setDesiredSize(int param0, int param1, byte param2) {
        this.field_s = param0;
        if (param2 < 16) {
          return;
        }
        this.field_l = param1;
    }

    final void restoreWindowedSize(byte param0) {
        if (param0 != 36) {
          return;
        }
        this.field_u.onCanvasResize(this.field_x, -13325, this.field_d);
    }

    final static void sendGameSettings(boolean param0, int param1) {
        BitPacketBuffer var2 = QuickChatHelpDialog.field_Lb;
        var2.writeCipheredByte(param1, (byte) -92);
        var2.position = var2.position + 1;
        int var3 = var2.position;
        var2.writeByte(5, !param0 ? true : false);
        if (!param0) {
          return;
        }
        var2.writeByte(AccountWelcomePanel.field_N.field_rc, false);
        int var4 = AccountWelcomePanel.field_N.field_ic + (AccountWelcomePanel.field_N.field_Zb << 6);
        var2.writeByte(var4, false);
        var2.writeBytes(0, 128, AccountWelcomePanel.field_N.field_sc, AccountWelcomePanel.field_N.field_sc.length);
        var2.backpatchByteLength(-var3 + var2.position, -2);
    }

    final static void handleRankingResponse(int param0) {
        int var8_int = 0;
        int var19 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        HighscoreSubmission var4 = null;
        HighscoreQuery var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        BitPacketBuffer var27 = null;
        long[][] var34 = null;
        int[][] var35 = null;
        int var3Lifetime1;
        int var25Lifetime1;
        int var25Lifetime2;
        var26 = TetraLink.field_J;
        try {
          var27 = BackgroundSparkle.field_q;
          var2 = var27.readUnsignedByte((byte) -99);
          if (param0 != 1) {
            field_n = 56;
          }
          if (var2 == 0) {
            var3 = var27.readUnsignedShort(127);
            var4_ref = (HighscoreQuery) (StrongCacheEntry.field_E.first(false));
            while (var4_ref != null) {
              if (var4_ref.field_C != var3) {
                var4_ref = (HighscoreQuery) (StrongCacheEntry.field_E.next((byte) -70));
                continue;
              }
              break;
            }
            if (var4_ref == null) {
              SocialTabsPanel.closeGameSocket(false);
              return;
            }
            var5 = var27.readUnsignedByte((byte) -99);
            if (var5 == 0) {
              var4_ref.unlink(false);
              return;
            }
            var6 = var4_ref.field_z;
            EmailSyntaxValidator.field_v[0].field_e = NetworkGameClient.field_w;
            var7 = var4_ref.field_s;
            EmailSyntaxValidator.field_v[0].field_a = false;
            EmailSyntaxValidator.field_v[0].field_g = null;
            for (var8_int = 1; var8_int < var5; var8_int++) {
              EmailSyntaxValidator.field_v[var8_int].field_e = var27.readString((byte) 81);
              EmailSyntaxValidator.field_v[var8_int].field_a = false;
              if (var27.readUnsignedByte((byte) -99) != 1) {
                EmailSyntaxValidator.field_v[var8_int].field_g = null;
              } else {
                EmailSyntaxValidator.field_v[var8_int].field_g = var27.readString((byte) 81);
              }
            }
            var8 = new String[3][var6];
            var9 = new String[3][var6];
            var34 = new long[3][var6];
            var35 = new int[3][var6 * var7];
            var12 = 0;
            var13 = 0;
            var14 = 0;
            var15 = 0;
            var16 = 0;
            var17 = 0;
            var18 = var27.readUnsignedByte((byte) -99);
            if (var18 <= 0) {
              var4_ref.unlink(false);
              return;
            }
            for (var19 = 0; var19 < var18; var19++) {
              var20 = var27.readUnsignedByte((byte) -99);
              var21 = EmailSyntaxValidator.field_v[var20].field_e;
              var22 = var27.readLong(255);
              var24 = var27.position;
              if (var19 < var6) {
                var8[0][var12] = var21;
                var9[0][var12] = EmailSyntaxValidator.field_v[var20].field_g;
                var34[0][var12] = var22;
                for (var25 = 0; var7 > var25; var25++) {
                  incrementValue$0 = var15;
                  var15++;
                  var35[0][incrementValue$0] = var27.readInt(-116);
                }
                var12++;
              }
              if (var21 != null &&
                PieceDropAnimation.matchesNormalizedSessionName(var21, param0 ^ 5)) {
                var8[1][var13] = NetworkGameClient.field_w;
                var9[1][var13] = null;
                var34[1][var13] = var22;
                var13++;
                var27.position = var24;
                for (var25Lifetime1 = 0; var7 > var25Lifetime1; var25Lifetime1++) {
                  incrementValue$1 = var16;
                  var16++;
                  var35[1][incrementValue$1] = var27.readInt(param0 + 118);
                }
              }
              if (var6 > var14 &&
                !EmailSyntaxValidator.field_v[var20].field_a) {
                EmailSyntaxValidator.field_v[var20].field_a = true;
                var8[2][var14] = var21;
                var9[2][var14] = EmailSyntaxValidator.field_v[var20].field_g;
                var34[2][var14] = var22;
                var27.position = var24;
                var14++;
                for (var25Lifetime2 = 0; var7 > var25Lifetime2; var25Lifetime2++) {
                  incrementValue$2 = var17;
                  var17++;
                  var35[2][incrementValue$2] = var27.readInt(-111);
                }
              }
            }
            var4_ref.unlink(false);
            return;
          }
          if (var2 == 1) {
            var3Lifetime1 = var27.readUnsignedShort(param0 ^ 126);
            var27.readLong(255);
            var4 = (HighscoreSubmission) (HighscoreRowName.field_f.first(false));
            while (var4 != null) {
              if (var3Lifetime1 != var4.field_q) {
                var4 = (HighscoreSubmission) (HighscoreRowName.field_f.next((byte) -70));
                continue;
              }
              break;
            }
            if (var4 == null) {
              SocialTabsPanel.closeGameSocket(false);
              return;
            }
            var4.unlink(false);
            return;
          }
          HotspotTextWidget.reportClientError(-104, (Throwable) null, "HS1: " + PacketDiagnosticsHelpers.describeCurrentPacket(false));
          SocialTabsPanel.closeGameSocket(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) var1), "i.C(" + param0 + ')');
        }
    }

    final static boolean isValidDisplayName(boolean param0, boolean param1, CharSequence param2) {
        int var6 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TetraLink.field_J;
        try {
          if (param2 == null) {
            return false;
          }
          var3_int = param2.length();
          if (var3_int < 1) {
            return false;
          }
          if (var3_int > 12) {
            return false;
          }
          var4 = DialWidgetPainter.normalizeDisplayName(param2, (byte) 111);
          if (var4 != null &&
            var4.length() >= 1) {
            if (!NameSeparatorHelpers.isNameSeparator((byte) 81, var4.charAt(0)) &&
              !NameSeparatorHelpers.isNameSeparator((byte) 81, var4.charAt(var4.length() - 1))) {
              if (param1) {
                field_a = (TransitionPhase) null;
              }
              var5 = 0;
              for (var6 = 0; var6 < param2.length(); var6++) {
                var7 = param2.charAt(var6);
                if (NameSeparatorHelpers.isNameSeparator((byte) 81, (char) var7)) {
                  var5++;
                } else {
                  var5 = 0;
                }
                if (2 <= var5 &&
                  !param0) {
                  return false;
                }
              }
              if (0 >= var5) {
                return true;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_37_0 = var3;
          stackIn_37_1 = new StringBuilder().append("i.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    final static String getCurrentAccountName(int param0) {
        if (ArchiveRequest.field_C == AnimationPlayer.field_d) {
          return StatusRequestHelpers.field_e;
        }
        if (!HighscoreQuery.field_y.hasChanged(false)) {
          return HighscoreQuery.field_y.getText((byte) 72);
        }
        if (ArchiveRequest.field_C == PasswordLengthHelpers.field_a) {
          return HighscoreQuery.field_y.getText((byte) 72);
        }
        int var1 = 64 % ((68 - param0) / 43);
        return SocialTabsPanel.field_d;
    }

    final static void drawRootWidgets(boolean param0, int param1) {
        InsetTextPainter.field_s.drawAllLayers(0, 0, -23452);
        if (param1 < 73) {
          field_f = 106;
        }
    }

    final void updateViewport(int param0) {
        int fieldTemp$1 = 0;
        if (EmailAvailabilityValidator.field_u != null) {
          return;
        }
        if (0 >= CacheEntry.field_C) {
          this.field_v = false;
        }
        if (param0 != 29768) {
          ViewportController.handleRankingResponse(38);
        }
        if (this.field_v) {
          fieldTemp$1 = this.field_p - 1;
          this.field_p = this.field_p - 1;
          if (fieldTemp$1 > 0) {
            return;
          }
          this.field_p = this.field_b;
          if (this.field_h > TextureCache.field_a) {
            this.field_v = false;
          } else {
            this.applyDesiredSize(-84);
          }
          return;
        }
        if (this.field_l <= NameSuggestionsPanel.field_M) {
          if (this.field_l > 0) {
            RandomAccessCacheFile.field_g = 0;
          }
        } else {
          RandomAccessCacheFile.field_g = (-NameSuggestionsPanel.field_M + this.field_l) / 2;
        }
        if (this.field_g != NameSuggestionsPanel.field_M ||
          this.field_m != DebouncedValidator.field_h) {
          this.field_u.onCanvasResize(this.field_m, -13325, this.field_g);
        }
    }

    final FullscreenFocusCanvas enterFullscreen(boolean param0) {
        this.field_d = NameSuggestionsPanel.field_M;
        this.field_x = DebouncedValidator.field_h;
        this.field_u.onCanvasResize(this.field_o, -13325, this.field_r);
        MouseInputHandler.field_h = param0 ? true : false;
        FullscreenFocusCanvas var2 = FullscreenCanvasHelpers.createFullscreenCanvas(this.field_o, 0, 0, this.field_r, 0, QuickChatHelpDialog.field_Pb);
        if (var2 == null) {
          this.restoreWindowedSize((byte) 36);
        }
        return var2;
    }

    public static void releaseStatics(boolean param0) {
        field_a = null;
        field_t = null;
        if (param0) {
          field_t = (int[]) null;
        }
    }

    private ViewportController() throws Throwable {
        throw new Error();
    }

    final static void writeQueuedRecordPacket(int param0, QueuedStatSubmission param1, int param2) {
        int var4 = 0;
        BitPacketBuffer var5 = QuickChatHelpDialog.field_Lb;
        var5.writeCipheredByte(param0, (byte) -92);
        if (param2 != 0) {
          return;
        }
        try {
          var5.position = var5.position + 1;
          var4 = var5.position;
          var5.writeByte(1, false);
          var5.writeByte(param1.field_r, false);
          var5.writeByte(param1.field_y, false);
          var5.writeInt(param1.field_o, (byte) -124);
          var5.writeInt(param1.field_x, (byte) -124);
          var5.writeInt(param1.field_u, (byte) -124);
          var5.writeInt(param1.field_t, (byte) -124);
          var5.writeCrc32(var4, param2 ^ -71);
          var5.backpatchByteLength(var5.position - var4, param2 ^ -2);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "i.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean isResizeAllowed(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 0) {
          return false;
        }
        stackIn_6_0 = (TextureCache.field_a >= this.field_h) && (CacheEntry.field_C > 0);
        return stackIn_6_0;
    }

    static {
        field_e = 640;
        field_f = 0;
        field_a = new TransitionPhase();
    }
}
