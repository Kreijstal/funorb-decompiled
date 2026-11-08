/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PuzzlePieceQueue {
    int field_a;
    boolean field_f;
    private int field_o;
    private int field_j;
    private int field_g;
    int field_m;
    boolean field_h;
    int field_k;
    private int field_l;
    private int[] field_i;
    boolean field_n;
    private int field_p;
    int field_e;
    static Sprite[] field_d;
    static int[][] field_c;
    private int field_b;

    final int takeNextPiece(int param0) {
        if (this.field_p == this.field_i.length) {
          this.field_h = true;
          return -1;
        }
        if (param0 != 0) {
          this.field_n = true;
        }
        if (this.field_p > 0) {
          this.field_l = this.field_l + 37;
        }
        int fieldTemp$0 = this.field_p;
        this.field_p = this.field_p + 1;
        return this.field_i[fieldTemp$0];
    }

    final int getPieceCount(byte param0) {
        if (param0 >= -88) {
          this.field_a = -66;
        }
        return this.field_i.length;
    }

    final void animateListScroll(int param0) {
        if (this.field_l > this.field_g) {
          this.field_g = this.field_g + 3;
        }
        if (this.field_g > this.field_l) {
          this.field_g = this.field_l;
        }
        if (param0 != 27420) {
          PuzzlePieceQueue.releaseStatics(true);
        }
    }

    final Puzzle createPuzzle(int param0) {
        if (param0 != -3060) {
          this.field_a = 17;
        }
        return new Puzzle(this.field_m, this.field_k, this.field_j, 60, 30, DriftingParticle.field_d, 0, 0, new IndexedSprite[]{AcidSunsetBackground.field_o[this.field_e]});
    }

    final void reset(boolean param0) {
        this.field_p = 0;
        this.field_n = false;
        this.field_h = false;
        this.field_f = param0 ? true : false;
        this.field_o = 240 - (37 * this.field_i.length - 5) / 2;
        this.field_g = this.field_o;
        this.field_l = this.field_g;
    }

    final static void pollAchievementSyncRequests(int param0) {
        if (param0 != 4478) {
          field_d = (Sprite[]) null;
        }
        if (!LoadingStep.field_a) {
          if (null == pk.field_f) {
            pk.field_f = Matrix3.queueAchievementMaskRequest(255, 4);
          }
          if (pk.field_f.field_p) {
            EmailCredentials.field_k = EmailCredentials.field_k & ~pk.field_f.field_s;
            MenuScreen.field_n = MenuScreen.field_n | pk.field_f.field_s;
            LoadingStep.field_a = true;
            pk.field_f = null;
          }
        }
        if (!TextHotspotWidget.field_U) {
          if (null == PuzzleThumbnail.field_g) {
            PuzzleThumbnail.field_g = ni.queueSavedDataRequest(6, -90);
          }
          if (PuzzleThumbnail.field_g.field_p) {
            TextHotspotWidget.applyCompletedPuzzleMask(false, PuzzleThumbnail.field_g.field_n);
            if (ef.field_a) {
              QuickChatPhraseDefinition.saveProgress((byte) 74);
            }
            PuzzleThumbnail.field_g = null;
            TextHotspotWidget.field_U = true;
          }
        }
        if (LoadingStep.field_a &&
          TextHotspotWidget.field_U) {
          SocketConnector.stopAudioService(5);
          ni.refreshScreenItems(-31470);
          if (fc.field_e == 9 &&
            EmailCredentials.field_k == 0) {
            fc.field_e = 5;
            la.changeScreen(MidiPcmStream.field_t, 5, false, -25528);
          }
        }
    }

    final void markPuzzleCompleted(int param0) {
        this.field_n = true;
        long var2 = 1L << this.field_e | CheckboxPainter.field_h;
        if (param0 != 20604) {
          return;
        }
        if (var2 != CheckboxPainter.field_h) {
          CheckboxPainter.field_h = var2;
          QuickChatPhraseDefinition.saveProgress((byte) 74);
        }
    }

    public static void releaseStatics(boolean param0) {
        if (!param0) {
          field_d = (Sprite[]) null;
        }
        field_d = null;
        field_c = (int[][]) null;
    }

    final void draw(int param0) {
        int var3 = 0;
        Sprite[] stackIn_6_0 = null;
        int stackIn_7_1 = 0;
        Sprite[] stackIn_9_0 = null;
        int stackIn_10_1 = 0;
        Sprite[] stackIn_12_0 = null;
        int stackIn_13_1 = 0;
        Sprite[] stackIn_15_0 = null;
        int stackIn_16_1 = 0;
        int var2;
        boolean[] var4;
        int var5;
        var5 = Pixelate.field_H ? 1 : 0;
        SoftwareRasterizer.drawRoundedRectangle(535, -15 + this.field_o, 62, 15 + this.field_b + 15, 6, 0);
        SoftwareRasterizer.fillRoundedRectangleBlended(535, -15 + this.field_o, 62, 15 + (this.field_b + 15), 6, 0, 128);
        FireworkDisplay.field_d.drawAdditive(542, this.field_g - 8, 256);
        var2 = this.field_o;
        if (param0 != 550) {
          this.field_l = -112;
        }
        for (var3 = 0; var3 < this.field_i.length; var3++) {
          var4 = RisingBubble.field_e[this.field_i[var3]];
          stackIn_6_0 = LoginCredentials.field_e.field_a;
          if (!var4[0]) {
            stackIn_7_1 = 0;
          } else {
            stackIn_7_1 = 1;
          }
          ((Sprite) (Object) stackIn_6_0[stackIn_7_1]).drawTransparent(550, var2);
          stackIn_9_0 = LoginCredentials.field_e.field_a;
          if (var4[1]) {
            stackIn_10_1 = 1;
          } else {
            stackIn_10_1 = 0;
          }
          ((Sprite) (Object) stackIn_9_0[stackIn_10_1]).drawTransparent(566, var2);
          stackIn_12_0 = LoginCredentials.field_e.field_a;
          if (var4[2]) {
            stackIn_13_1 = 1;
          } else {
            stackIn_13_1 = 0;
          }
          ((Sprite) (Object) stackIn_12_0[stackIn_13_1]).drawTransparent(550, var2 + 16);
          stackIn_15_0 = LoginCredentials.field_e.field_a;
          if (!var4[3]) {
            stackIn_16_1 = 0;
          } else {
            stackIn_16_1 = 1;
          }
          ((Sprite) (Object) stackIn_15_0[stackIn_16_1]).drawTransparent(566, 16 + var2);
          if (var3 < -1 + this.field_p) {
            SoftwareRasterizer.fillRectangleAlpha(550, var2, 32, 32, 0, 128);
          }
          var2 += 37;
        }
        PieceTiming.field_e.drawText("Puzzle " + (this.field_e + 1), 30, 50, 0, -1);
    }

    PuzzlePieceQueue(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        this.field_f = false;
        this.field_p = 0;
        try {
          this.field_a = param4;
          this.field_e = param0;
          this.field_i = param5;
          this.field_k = param2;
          this.field_m = param1;
          this.field_j = param3;
          this.field_b = this.field_i.length * 37 - 5;
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "so.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
