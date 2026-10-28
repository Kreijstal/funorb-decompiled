/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HighscoresScreen {
    private LegacyButton[] categoryButtons;
    private int[] actionCodes;
    static LoginStage field_d;
    private int[][] rowBoardIdsByColumn;
    private LegacyButton[] rankingButtons;
    private LegacyButton[] mainMenuButtons;
    private HighscoreTable table;
    boolean showSubmittedScore;
    int accountStateIndex;
    private int categoryCode;
    private int queryColumn;

    private final int[] numberSequence(int count, int firstValue, int startIndex) {
        int var6 = EscapeVector.obfuscationControl;
        int[] var7 = new int[count];
        int[] var4 = var7;
        for (int var5 = startIndex; count > var5; var5++) {
          var7[var5] = firstValue + var5;
        }
        return var4;
    }

    private final void drawTableAndStatus(int guard) {
        if (guard != -1) {
          this.drawButtons(true);
        }
        String var2 = this.queryStatusText(0);
        this.table = this.ensureTable((byte) -103, var2);
        if (null != this.table) {
          this.drawFilterFrame((byte) -96);
          this.table.draw(2);
        }
        if (var2 != null) {
          int var3 = 320;
          int var4 = 240;
          int var5 = 6340704;
          ByteStorage.gameFont.drawCentered(var2, var3, var4, var5, -1);
        }
    }

    private final void close(boolean pointerDriven, byte guard) {
        LegacyWidgetStyle.field_N = null;
        CheckboxPainter.field_n = false;
        AlternateUsernameCredentials.field_q.updatePointerSelection(guard - 26357, pointerDriven);
        di.field_d = null;
        mj.field_d = 0;
        if (guard != -123) {
          return;
        }
        ChatMessage.clearFrameOffsets((byte) -71);
    }

    private final int[] selectMergedInts(int[] right, int guard, int[] selectors, int[] left) {
        String stackIn_20_2 = null;
        String stackIn_23_2 = null;
        String stackIn_26_2 = null;
        int var9 = EscapeVector.obfuscationControl;
        try {
          if (guard != 10) {
            this.drawFilterFrame((byte) 114);
          }
          int[] var11 = new int[10];
          int[] var10 = var11;
          int[] var5 = var10;
          for (int var6 = 0; var6 < 10; var6++) {
            int var7 = selectors[var6];
            if (var7 >= 0) {
              int var8 = 0;
              if (0 == var7 / 10) {
                var7 = var7 % 10;
                var8 = left[var7];
              }
              if (var7 / 10 == 1) {
                var7 = var7 % 10;
                var8 = right[var7];
              }
              var11[var6] = var8;
            }
          }
          int[] stackIn_16_0 = var5;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5_ref = decompiledCaughtException;
          RuntimeException stackIn_19_0 = var5_ref;
          StringBuilder stackIn_19_1 = new StringBuilder().append("ak.T(");
          if (right == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          StringBuilder stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(guard).append(',');
          if (selectors == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          StringBuilder stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (left == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    private final boolean handleRankingAction(byte guard) {
        int var6 = EscapeVector.obfuscationControl;
        int var2 = this.selectedActionCode(-115);
        if (0 > var2) {
          return false;
        }
        if (guard > -103) {
          this.buildLayout((byte) -110);
        }
        for (int var3 = 0; var3 < ByteStorage.field_d.length; var3++) {
          int var4 = ByteStorage.field_d[var3];
          if (var4 == var2) {
            if (var3 >= ti.field_a.length) {
              return false;
            }
            int var5 = ti.field_a[var3];
            this.queryColumn = var5;
            return true;
          }
        }
        return false;
    }

    final int actionCount(int guard) {
        if (this.actionCodes == null) {
          return 0;
        }
        if (guard < 29) {
          this.showSubmittedScore = false;
        }
        return this.actionCodes.length;
    }

    private final boolean handleCategoryAction(int guard) {
        int var5 = EscapeVector.obfuscationControl;
        int var2 = this.selectedActionCode(guard ^ -17654);
        if (guard != 17592) {
          this.categoryButtons = (LegacyButton[]) null;
        }
        if (var2 < 0) {
          return false;
        }
        for (int var3 = 0; v.field_b.length > var3; var3++) {
          int var4 = v.field_b[var3];
          if (var4 == var2) {
            if (var4 == this.categoryCode) {
              return false;
            }
            LegacyWidgetStyle.field_N = null;
            this.categoryCode = var4;
            this.buildLayout((byte) -122);
            return true;
          }
        }
        return false;
    }

    private final int categoryIndex(byte guard) {
        int var4 = EscapeVector.obfuscationControl;
        int var2 = 0;
        if (guard > -60) {
          this.mainMenuButtons = (LegacyButton[]) null;
        }
        while (var2 < v.field_b.length) {
          int var3 = v.field_b[var2];
          if (this.categoryCode == var3) {
            return var2;
          }
          var2++;
        }
        return -1;
    }

    public static void releaseStatics(byte guard) {
        field_d = null;
        if (guard != 77) {
          field_d = (LoginStage) null;
        }
    }

    private final void mergeQueryBoards(int rightBoardId, HighscoreQuery left, HighscoreQuery right, int guard, int leftBoardId) {
        if (guard != 6144) {
          return;
        }
        try {
          int var6_int = ProxySocketConnector.a(102, leftBoardId);
          int var7 = ProxySocketConnector.a(guard - 6045, rightBoardId);
          int[] var21 = this.mergedRowOrder(var7, right, left, this.queryColumn, -17, this.queryColumn, var6_int);
          int[] var22 = this.selectMergedInts(right.intColumns[this.queryColumn], 10, var21, left.intColumns[this.queryColumn]);
          left.intColumns[this.queryColumn] = var22;
          String[] var10 = this.selectMergedNames((byte) 56, right.stringColumns[this.queryColumn], var21, left.stringColumns[this.queryColumn]);
          left.stringColumns[this.queryColumn] = var10;
          long[] var23 = this.selectMergedLongs(right.longColumns[this.queryColumn], left.longColumns[this.queryColumn], var21, true);
          left.longColumns[this.queryColumn] = var23;
          this.assignRowBoardIds((byte) 69, leftBoardId, var21, rightBoardId);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "ak.F(" + rightBoardId + ',' + (left != null ? "{...}" : "null") + ',' + (right != null ? "{...}" : "null") + ',' + guard + ',' + leftBoardId + ')');
        }
    }

    private final void clearMergedBoardIds(int start) {
        int var3 = EscapeVector.obfuscationControl;
        if (this.rowBoardIdsByColumn == null) {
          return;
        }
        for (int var2 = start; this.rowBoardIdsByColumn.length > var2; var2++) {
          this.rowBoardIdsByColumn[var2] = null;
        }
    }

    private final int[] filledValues(int count, int value, int startIndex) {
        int var6 = EscapeVector.obfuscationControl;
        int[] var7 = new int[count];
        int[] var4 = var7;
        for (int var5 = startIndex; var5 < var7.length; var5++) {
          var7[var5] = value;
        }
        return var4;
    }

    private final int tableTop(int guard) {
        int var2 = 115;
        if (null == this.categoryButtons ||
          this.categoryButtons.length == 0) {
          return var2;
        }
        LegacyButton var3 = this.categoryButtons[0];
        if (var3 == null) {
          return var2;
        }
        int var2Lifetime1 = 3 + var3.y + var3.height;
        if (guard <= 29) {
          String[] var4 = (String[]) null;
          String[] discarded$0 = this.selectMergedNames((byte) -18, (String[]) null, (int[]) null, (String[]) null);
        }
        return var2Lifetime1;
    }

    private final int selectedRankingAction(int guard) {
        int var5 = EscapeVector.obfuscationControl;
        if (0 <= this.queryColumn &&
          ti.field_a.length > this.queryColumn) {
          int var3 = -38 / ((29 - guard) / 43);
          for (int var2 = 0; var2 < ti.field_a.length; var2++) {
            if (this.queryColumn == ti.field_a[var2] &&
              ByteStorage.field_d.length >= var2) {
              int var4 = ByteStorage.field_d[var2];
              return var4;
            }
          }
          return -1;
        }
        return -1;
    }

    final void draw(boolean guard) {
        SoftwareRasterizer.clearFramebuffer();
        SelfDestructEffects.b(2);
        this.drawTableAndStatus(-1);
        pb.a(4);
        if (guard) {
          return;
        }
        this.drawButtons(true);
    }

    private final void mergeCompletedBoards(byte guard) {
        if (guard >= -52) {
          return;
        }
        HighscoreQuery[] var5 = LegacyWidgetStyle.field_N;
        HighscoreQuery[] var2 = var5;
        if (var2 != null) {
          if (var5.length == 0) {
            return;
          }
          int var3 = this.categoryIndex((byte) -92);
          int[] var4 = RasterBuffer.field_a[var3];
          if (1 == var5.length) {
            this.rowBoardIdsByColumn[this.queryColumn] = this.filledValues(10, var4[0], 0);
            return;
          }
          this.mergeQueryBoards(var4[1], var5[0], var5[1], 6144, var4[0]);
          return;
        }
    }

    private final int selectedActionCode(int guard) {
        int var2 = di.field_d.selectedIndex;
        if (var2 >= 0 &&
          var2 < this.actionCodes.length) {
          if (guard > -77) {
            return 85;
          }
          int var3 = this.actionCodes[var2];
          return var3;
        }
        return -1;
    }

    private final boolean allQueriesComplete(int start) {
        int var6 = EscapeVector.obfuscationControl;
        HighscoreQuery[] var7 = LegacyWidgetStyle.field_N;
        HighscoreQuery[] var2 = var7;
        if (var2 != null &&
          var7.length != 0) {
          HighscoreQuery[] var3 = var7;
          for (int var4 = start; var4 < var3.length; var4++) {
            HighscoreQuery var5 = var3[var4];
            if (var5 == null) {
              return false;
            }
            if (!var5.complete) {
              return false;
            }
          }
          return true;
        }
        return false;
    }

    private final long[] selectMergedLongs(long[] right, long[] left, int[] selectors, boolean guard) {
        String stackIn_18_2 = null;
        String stackIn_21_2 = null;
        String stackIn_24_2 = null;
        int var10 = EscapeVector.obfuscationControl;
        try {
          long[] var12 = new long[10];
          long[] var11 = var12;
          long[] var5 = var11;
          for (int var6 = 0; var6 < 10; var6++) {
            int var7 = selectors[var6];
            if (var7 >= 0) {
              long var8 = 0L;
              if (var7 / 10 == 0) {
                var7 = var7 % 10;
                var8 = left[var7];
              }
              if (var7 / 10 == 1) {
                var7 = var7 % 10;
                var8 = right[var7];
              }
              var12[var6] = var8;
            }
          }
          if (!guard) {
            this.accountStateIndex = -56;
          }
          long[] stackIn_14_0 = var5;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5_ref = decompiledCaughtException;
          RuntimeException stackIn_17_0 = var5_ref;
          StringBuilder stackIn_17_1 = new StringBuilder().append("ak.FA(");
          if (right == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          StringBuilder stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (left == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          StringBuilder stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (selectors == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(guard).append(')').toString());
        }
    }

    private final HighscoreTable ensureTable(byte guard, String statusText) {
        String stackIn_3_0 = null;
        String stackIn_35_2 = null;
        try {
          int var3_int = this.tableTop(77);
          if (AccountSessionSupport.isGuestSession(-123)) {
            stackIn_3_0 = IntrusiveNode.field_a;
          } else {
            stackIn_3_0 = DialogueScreen.field_G;
          }
          String var4 = stackIn_3_0;
          int stackIn_6_0 = (AccountSessionSupport.isGuestSession(-104)) ? 10551200 : 6340704;
          int var5 = stackIn_6_0;
          if (statusText == wk.field_f && (this.table == null ||
            this.table.dataState != 0)) {
            this.table = new HighscoreTable(this.categoryCode, var3_int, this.showSubmittedScore);
            this.table.configureFooter(3, var4, var5);
          }
          if (statusText == FrameworkLoadingStatus.field_b && (null == this.table ||
            this.table.dataState != 0)) {
            this.table = new HighscoreTable(this.categoryCode, var3_int, this.showSubmittedScore);
            this.table.configureFooter(3, var4, var5);
          }
          if (guard > -66) {
            this.rowBoardIdsByColumn = (int[][]) null;
          }
          if (SavedDataWrite.field_m == statusText && (this.table == null ||
            0 != this.table.dataState)) {
            this.table = new HighscoreTable(this.categoryCode, var3_int, this.showSubmittedScore);
            this.table.configureFooter(3, var4, var5);
          }
          if (statusText == null && (this.table == null ||
            this.table.dataState != 1 ||
            this.queryColumn != this.table.queryColumn)) {
            this.buildLoadedTable(var5, var3_int, var4, (byte) -10);
          }
          HighscoreTable stackIn_31_0 = this.table;
          return stackIn_31_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_34_0 = var3;
          StringBuilder stackIn_34_1 = new StringBuilder().append("ak.J(").append(guard).append(',');
          if (statusText == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    private final void playSelectionSound(boolean guard) {
        if (di.field_d.selectionChanged) {
          LegacyButton var2 = this.selectedButton((byte) 82);
          int var3 = PasswordValidator.a(-122, var2);
          ObjectSpriteSet.field_e.playSampleWithPan(ArchiveRequest.field_w, 100, 1536 * IterableNodeHashTable.field_c / 64, var3);
        }
        if (guard) {
          String discarded$0 = this.scoreColumnStatus((byte) 4);
        }
    }

    private final String nameColumnStatus(int guard) {
        int var13 = EscapeVector.obfuscationControl;
        Object var2 = wk.field_f;
        String var3 = SavedDataWrite.field_m;
        HighscoreQuery[] var4 = LegacyWidgetStyle.field_N;
        if (var4 != null &&
          var4.length != 0) {
          HighscoreQuery[] var5 = var4;
          int var6 = 0;
          int var7 = 80 / ((guard + 34) / 35);
          while (true) {
            if (var6 >= var5.length) {
              return (String) (var2);
            }
            HighscoreQuery var8 = var5[var6];
            if (var8 == null) {
              return var3;
            }
            String[][] var9 = var8.stringColumns;
            if (var9 == null) {
              return var3;
            }
            if (this.queryColumn >= 0 &&
              this.queryColumn < var9.length) {
              if (var9[this.queryColumn] == null) {
                return var3;
              }
              String[] var10 = var9[this.queryColumn];
              for (int var11 = 0; var11 < var10.length; var11++) {
                String var12 = var10[var11];
                if (var12 != null) {
                  var2 = null;
                }
              }
              var6++;
              continue;
            }
            break;
          }
          return var3;
        }
        return var3;
    }

    private final LegacyButton selectedButton(byte guard) {
        int var2 = di.field_d.selectedIndex;
        LegacyButton var3 = TetherHumStream.a(this.categoryButtons, var2, 0);
        if (var3 != null) {
          return var3;
        }
        if (guard <= 65) {
          boolean discarded$0 = this.handleCategoryAction(-122);
        }
        var3 = TetherHumStream.a(this.rankingButtons, var2, 0);
        if (var3 != null) {
          return var3;
        }
        var3 = TetherHumStream.a(this.mainMenuButtons, var2, 0);
        if (var3 == null) {
          return null;
        }
        return var3;
    }

    private final int[] mergedRowOrder(int rightMode, HighscoreQuery rightQuery, HighscoreQuery leftQuery, int rightColumn, int guard, int leftColumn, int leftMode) {
        String stackIn_9_2 = null;
        String stackIn_12_2 = null;
        int var15 = EscapeVector.obfuscationControl;
        try {
          int var10 = -77 / ((guard - 78) / 43);
          int[] var21 = ua.queryScoreValues(leftMode, true, leftColumn, leftQuery);
          int[] var17 = var21;
          int[] var8 = var17;
          int[] var22 = ua.queryScoreValues(rightMode, true, rightColumn, rightQuery);
          int[] var18 = var22;
          int[] var9 = var18;
          int var11 = var21.length + var22.length;
          int[] var24 = new int[var11];
          int[] var20 = var24;
          int[] var12 = var20;
          ArraySupport.copy(var8, 0, var12, 0, var21.length);
          ArraySupport.copy(var9, 0, var12, var21.length, var22.length);
          int[] var26 = new int[var11];
          for (int var14 = 0; var14 < var26.length; var14++) {
            var26[var14] = var14;
          }
          ShipHullGeometry.a(-1, var24, var26);
          int[] var16 = this.reverseIndices(var26, 12);
          int[] stackIn_5_0 = var16;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var8_ref = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var8_ref;
          StringBuilder stackIn_8_1 = new StringBuilder().append("ak.BA(").append(rightMode).append(',');
          if (rightQuery == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          StringBuilder stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (leftQuery == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(rightColumn).append(',').append(guard).append(',').append(leftColumn).append(',').append(leftMode).append(')').toString());
        }
    }

    private final int[] spacedValues(int step, int guard, int count, int firstValue) {
        int var8 = EscapeVector.obfuscationControl;
        int[] var9 = new int[count];
        int[] var5 = var9;
        int var6 = 40 % ((11 - guard) / 39);
        for (int var7 = 0; var7 < count; var7++) {
          var9[var7] = firstValue + var7 * step;
        }
        return var5;
    }

    private final void updateRevealEffects(int guard) {
        if (mj.field_d == 0) {
          StringNode.playFrameAppearSound(8192, (byte) 51);
        }
        IntValueNode.field_j = true;
        if (guard != 100) {
          this.mainMenuButtons = (LegacyButton[]) null;
        }
        if (!AccountSessionSupport.isGuestSession(-122)) {
          if (mj.field_d == 0) {
            ObjectSpriteSet.field_e.playSampleWithPan(pc.field_a, 100, IterableNodeHashTable.field_c * 6144 / 64, 5120);
          }
          if (10 == mj.field_d) {
            ObjectSpriteSet.field_e.playSampleWithPan(pc.field_a, 100, IterableNodeHashTable.field_c * 6144 / 64, 8192);
          }
          if (mj.field_d == 20) {
            ObjectSpriteSet.field_e.playSampleWithPan(pc.field_a, 100, 6144 * IterableNodeHashTable.field_c / 64, 11264);
          }
          if (30 == mj.field_d) {
            ObjectSpriteSet.field_e.playSampleWithPan(pc.field_a, 100, IterableNodeHashTable.field_c * 6144 / 64, 8192);
          }
        } else {
          if (mj.field_d == 0) {
            ObjectSpriteSet.field_e.playSampleWithPan(pc.field_a, 100, 6144 * IterableNodeHashTable.field_c / 64, 8192);
          }
          if (mj.field_d == 10) {
            ObjectSpriteSet.field_e.playSampleWithPan(pc.field_a, 100, 6144 * IterableNodeHashTable.field_c / 64, 8192);
          }
        }
        if (mj.field_d < 1000) {
          mj.field_d = mj.field_d + 1;
        }
    }

    final int hitTest(int x, int guard, int y) {
        int var4 = DebouncedValidator.a(y, -121, this.categoryButtons, x);
        if (0 <= var4) {
          return var4;
        }
        var4 = DebouncedValidator.a(y, -94, this.rankingButtons, x);
        if (0 <= var4) {
          return var4;
        }
        var4 = DebouncedValidator.a(y, guard ^ 108, this.mainMenuButtons, x);
        if (guard >= ~var4) {
          return var4;
        }
        return -1;
    }

    final boolean update(int guard) {
        int var2 = -60 / ((guard + 22) / 35);
        this.updateRevealEffects(100);
        boolean var3 = (this.handleKeyboard((byte) 3));
        if (var3) {
          return (var3);
        }
        di.field_d.updatePointer(this.hitTest(sf.field_c, -1, LoginDialog.field_ob), (byte) 120, this.hitTest(GzipDecoder.field_d, -1, UiContainer.field_y));
        this.playSelectionSound(false);
        boolean var3Lifetime1 = (this.handleActivation(true, Js5NetworkRequest.a((byte) 15, -1), (byte) 79));
        return (var3Lifetime1);
    }

    private final int[] createMainMenuButtons(int param0, int param1, int param2, int param3, int param4, int param5, int param6, BinaryBitmapFont param7, int param8) {
        String stackIn_7_2 = null;
        try {
          if (param5 >= -27) {
            String discarded$1 = this.scoreColumnStatus((byte) 98);
          }
          int[] var16 = new int[]{0};
          int[] var10 = var16;
          String[] var11 = new String[]{GameKeyHandler.field_a};
          int var12 = var16.length;
          int[] var26 = this.actionRange(var12, param3, 10);
          int[] var28 = this.spacedValues(param0, -47, var12, param4);
          int[] var27 = this.numberSequence(var12, param1, 0);
          this.mainMenuButtons = DynamicTerrainRenderer.createButtonRow(param2 + (-param8 + 1), var26, param6, param8, param7, var11, var27, false, var28);
          int[] stackIn_3_0 = var10;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var10_ref = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var10_ref;
          StringBuilder stackIn_6_1 = new StringBuilder().append("ak.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param8).append(')').toString());
        }
    }

    private final void openGuestLogin(int guard) {
        if (guard != -1) {
          return;
        }
        if (!AccountSessionSupport.isGuestSession(-119)) {
          return;
        }
        GuestLoginSupport.beginAccountLogin(true);
        mj.field_d = 0;
        ChatMessage.clearFrameOffsets((byte) -94);
    }

    private final void buildLayout(byte guard) {
        BinaryBitmapFont var18 = ByteStorage.gameFont;
        int var3 = 640;
        int var4 = 0;
        int var5 = 10;
        int var6 = 10;
        int var7 = 1;
        int var8 = 78;
        int var9 = var8;
        int[] var10 = this.createCategoryButtons(var7, 0, var9, 0, var5, var6, var18, var3 - 1, var4);
        LegacyButton var19 = this.categoryButtons[0];
        var9 = var9 + (var19.height + 3);
        this.table = new HighscoreTable(this.categoryCode, var9, this.showSubmittedScore);
        int var12 = (var3 - this.table.width) / 2;
        var9 = var9 + (3 + this.table.height);
        int var13 = var12 + this.table.width;
        int[] var28 = this.createCategoryButtons(var7, var12, var8, 0, var5, var6, var18, var13, var4);
        var5 = var5 + var28.length;
        var4 = var4 + var28.length;
        int[] var29 = this.createRankingButtons(var18, var6, var5, var13, var12, 98, var4, var7, var9);
        var5 = var5 + var29.length;
        var4 = var4 + var29.length;
        LegacyButton var21 = this.rankingButtons[0];
        var9 = var9 + (var21.height + 20);
        int[] var30 = this.createMainMenuButtons(var6, var7, var3 - 1, var4, var5, -28, var9, var18, 0);
        int var16 = var28.length - (-var29.length - var30.length);
        int var4Lifetime1 = 0;
        this.actionCodes = new int[var16];
        var4Lifetime1 = AnimatedPathMarker.appendInts(this.actionCodes, var4Lifetime1, true, var28);
        var4Lifetime1 = AnimatedPathMarker.appendInts(this.actionCodes, var4Lifetime1, true, var29);
        AnimatedPathMarker.appendInts(this.actionCodes, var4Lifetime1, true, var30);
        ModeProgress.configureButtonPalette(this.categoryButtons, true, (byte) 41);
        if (guard > -120) {
          this.actionCodes = (int[]) null;
        }
        ModeProgress.configureButtonPalette(this.rankingButtons, !AccountSessionSupport.isGuestSession(-102) ? true : false, (byte) 41);
        ModeProgress.configureButtonPalette(this.mainMenuButtons, false, (byte) 41);
        this.table = null;
    }

    private final int[] reverseIndices(int[] indices, int guard) {
        String stackIn_11_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          int[] var7 = new int[indices.length];
          int[] var3 = var7;
          int var4 = -1 + indices.length;
          int var5 = 0;
          while (var4 >= 0) {
            int incrementValue$1 = var5;
            var5++;
            var7[incrementValue$1] = indices[var4];
            var4--;
          }
          if (guard != 12) {
            this.updateRevealEffects(-32);
          }
          int[] stackIn_7_0 = var3;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_10_0 = var3_ref;
          StringBuilder stackIn_10_1 = new StringBuilder().append("ak.UA(");
          if (indices == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(guard).append(')').toString());
        }
    }

    private final void assignRowBoardIds(byte guard, int leftBoardId, int[] selectors, int rightBoardId) {
        String stackIn_17_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          this.rowBoardIdsByColumn[this.queryColumn] = new int[10];
          for (int var5_int = 0; var5_int < 10; var5_int++) {
            int var6 = selectors[var5_int];
            if (var6 >= 0) {
              int var7 = 0;
              if (var6 / 10 == 0) {
                var7 = leftBoardId;
              }
              if (1 == var6 / 10) {
                var7 = rightBoardId;
              }
              this.rowBoardIdsByColumn[this.queryColumn][var5_int] = var7;
            }
          }
          int var5_intLifetime1 = -68 % ((-21 - guard) / 61);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_16_0 = var5;
          StringBuilder stackIn_16_1 = new StringBuilder().append("ak.CA(").append(guard).append(',').append(leftBoardId).append(',');
          if (selectors == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(rightBoardId).append(')').toString());
        }
    }

    private final boolean handleKeyboard(byte guard) {
        int var4 = EscapeVector.obfuscationControl;
        if (guard != 3) {
          String var5 = (String) null;
          this.buildLoadedTable(-127, 66, (String) null, (byte) -74);
        }
        boolean var2 = false;
        while (AccountRequestDialog.pollKeyEvent(-110)) {
          di.field_d.handleKeyWithoutNavigation(127);
          ArchiveLoadTask.cycleSelectionFromArrowKey(this.actionCodes, guard ^ 3);
          if (PasswordValidator.field_n == 13) {
            int var3 = this.actionIndex(1, 0);
            di.field_d.selectFromKeyboard(false, var3);
          }
          boolean stackIn_10_0 = !(!this.handleActivation(false, Js5NetworkRequest.a((byte) 15, PasswordValidator.field_n), (byte) 96));
          var2 = stackIn_10_0;
          if (var2) {
            return (var2);
          }
        }
        return (var2);
    }

    private final int[] createCategoryButtons(int param0, int param1, int param2, int param3, int param4, int param5, BinaryBitmapFont param6, int param7, int param8) {
        int[] var10 = null;
        String[] var11 = null;
        String stackIn_8_2 = null;
        try {
          String[] var12 = KeyboardIdleSupport.highscoreCategoryNames;
          if (!UiContainer.hasMembership((byte) 103)) {
            var10 = new int[]{5};
            var11 = new String[]{var12[0]};
          } else {
            var10 = v.field_b;
            var11 = var12;
          }
          int var13 = var10.length;
          int[] var26 = this.actionRange(var13, param8, 10);
          int[] var28 = this.spacedValues(param5, param3 ^ 115, var13, param4);
          int[] var27 = this.numberSequence(var13, param0, param3 ^ param3);
          this.categoryButtons = DynamicTerrainRenderer.createButtonRow(param7 + (-param1 + 1), var26, param2, param1, param6, var11, var27, false, var28);
          int[] stackIn_4_0 = var10;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var10_ref = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var10_ref;
          StringBuilder stackIn_7_1 = new StringBuilder().append("ak.PA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    final int actionIndex(int guard, int actionCode) {
        int var4 = EscapeVector.obfuscationControl;
        if (guard != 1) {
          int[] var5 = (int[]) null;
          int[] discarded$0 = this.selectMergedInts((int[]) null, -63, (int[]) null, (int[]) null);
        }
        for (int var3 = 0; this.actionCodes.length > var3; var3++) {
          if (this.actionCodes[var3] == actionCode) {
            return var3;
          }
        }
        return -1;
    }

    private final String scoreColumnStatus(byte guard) {
        int var9 = EscapeVector.obfuscationControl;
        String var2 = SavedDataWrite.field_m;
        HighscoreQuery[] var3 = LegacyWidgetStyle.field_N;
        if (var3 != null &&
          var3.length != 0) {
          HighscoreQuery[] var4 = var3;
          int var5 = 73 / ((-1 - guard) / 44);
          int var6 = 0;
          while (true) {
            if (var4.length <= var6) {
              return null;
            }
            HighscoreQuery var7 = var4[var6];
            if (var7 == null) {
              return var2;
            }
            int[][] var11 = var7.intColumns;
            int[][] var10 = var11;
            int[][] var8 = var10;
            if (var8 == null) {
              return var2;
            }
            if (this.queryColumn >= 0 &&
              this.queryColumn < var11.length) {
              if (null == var8[this.queryColumn]) {
                return var2;
              }
              var6++;
              continue;
            }
            break;
          }
          return var2;
        }
        return var2;
    }

    private final void buildLoadedTable(int noticeColor, int y, String notice, byte guard) {
        String stackIn_17_2 = null;
        try {
          if (null == this.rowBoardIdsByColumn[this.queryColumn]) {
            this.mergeCompletedBoards((byte) -107);
          }
          HighscoreQuery[] var8 = LegacyWidgetStyle.field_N;
          HighscoreQuery[] var5 = var8;
          if (var5 != null &&
            var8.length != 0) {
            HighscoreQuery var6 = var8[0];
            if (var6 == null) {
              return;
            }
            ScoreSubmission var7 = IntValueNode.field_i;
            if (guard != -10) {
              return;
            }
            this.table = new HighscoreTable(var6, this.rowBoardIdsByColumn[this.queryColumn], var7, this.queryColumn, this.categoryCode, y, this.showSubmittedScore);
            this.table.configureFooter(3, notice, noticeColor);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_16_0 = runtimeException;
          StringBuilder stackIn_16_1 = new StringBuilder().append("ak.AB(").append(noticeColor).append(',').append(y).append(',');
          if (notice == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(guard).append(')').toString());
        }
    }

    private final String[] selectMergedNames(byte guard, String[] right, int[] selectors, String[] left) {
        String stackIn_18_2 = null;
        String stackIn_21_2 = null;
        String stackIn_24_2 = null;
        int var9 = EscapeVector.obfuscationControl;
        try {
          String[] var10 = new String[10];
          String[] var5 = var10;
          for (int var6 = 0; var6 < 10; var6++) {
            int var7 = selectors[var6];
            String var8 = "";
            if (var7 / 10 == 0) {
              var7 = var7 % 10;
              var8 = left[var7];
            }
            if (1 == var7 / 10) {
              var7 = var7 % 10;
              var8 = right[var7];
            }
            var10[var6] = var8;
          }
          if (guard != 56) {
            this.rowBoardIdsByColumn = (int[][]) null;
          }
          String[] stackIn_14_0 = var5;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5_ref = decompiledCaughtException;
          RuntimeException stackIn_17_0 = var5_ref;
          StringBuilder stackIn_17_1 = new StringBuilder().append("ak.QA(").append(guard).append(',');
          if (right == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          StringBuilder stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (selectors == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          StringBuilder stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (left == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    private final int[] createRankingButtons(BinaryBitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int[] var10 = null;
        String[] var11 = null;
        String stackIn_8_2 = null;
        try {
          if (!AccountSessionSupport.isGuestSession(-99)) {
            var10 = new int[]{2, 3, 4};
            var11 = AudioService.field_d;
          } else {
            var11 = new String[]{IntrusiveDeque.field_e};
            var10 = new int[]{1};
          }
          int var12 = var10.length;
          int var13 = -114 / ((-5 - param5) / 34);
          int[] var26 = this.actionRange(var12, param6, 10);
          int[] var28 = this.spacedValues(param1, -47, var12, param2);
          int[] var27 = this.numberSequence(var12, param7, 0);
          this.rankingButtons = DynamicTerrainRenderer.createButtonRow(1 + (-param4 + param3), var26, param8, param4, param0, var11, var27, false, var28);
          int[] stackIn_4_0 = var10;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var10_ref = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var10_ref;
          StringBuilder stackIn_7_1 = new StringBuilder().append("ak.SA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    private final void drawFilterFrame(byte guard) {
        int stackIn_15_0 = 0;
        boolean decompiledFrameRemainder0 = true;
        int var2 = 20;
        int var3 = 12;
        int var4 = 12;
        int var5 = this.table.x - var2;
        int var6 = this.table.width + var5 + 2 * var2;
        Object var7 = null;
        if (this.categoryButtons != null) {
          if (this.categoryButtons.length >= 1 &&
            null != this.categoryButtons[0]) {
            LegacyButton var15 = this.categoryButtons[0];
            if (guard >= -81) {
              this.queryColumn = -52;
            }
            int var8 = -var3 + var15.y;
            decompiledFrameRemainder0 = (this.rankingButtons != null);
            if (decompiledFrameRemainder0) {
              if (this.rankingButtons.length >= 1 &&
                this.rankingButtons[0] != null) {
                LegacyButton var16 = this.rankingButtons[0];
                int var9 = var16.y + var16.height + var4;
                int var10 = mj.field_d;
                stackIn_15_0 = (var10 < 40) ? (40 - var10) : (0);
                int var11 = stackIn_15_0;
                int var12 = 0;
                int var13 = 3162160;
                int var14 = 6324320;
                AccountNoticeKind.drawAnimatedPanelFrame(var11, var5, var6, var9, true, 29788, false, var14, var13, var12, var8, true);
                return;
              }
              return;
            }
          }
          if (decompiledFrameRemainder0) {
            return;
          }
        }

    }

    private final void selectInitialCategory(boolean guard, int gameMode) {
        this.categoryCode = 5;
        if (EmailSyntaxValidator.a(gameMode, -2)) {
          this.categoryCode = 5;
        }
        if (!UiContainer.hasMembership((byte) 98)) {
          return;
        }
        if (gameMode == 2) {
          this.categoryCode = 6;
        }
        if (!guard) {
          this.rankingButtons = (LegacyButton[]) null;
        }
        if (3 == gameMode) {
          this.categoryCode = 7;
        }
    }

    private final int[] actionRange(int count, int firstAction, int guard) {
        int var6 = EscapeVector.obfuscationControl;
        int[] var8 = new int[count];
        int[] var4 = var8;
        for (int var5 = 0; var5 < count; var5++) {
          var8[var5] = var5 + firstAction;
        }
        if (guard != 10) {
          BinaryBitmapFont var7 = (BinaryBitmapFont) null;
          int[] discarded$0 = this.createCategoryButtons(-63, -54, -8, -112, -7, -16, (BinaryBitmapFont) null, -12, -123);
        }
        return var4;
    }

    private final boolean handleActivation(boolean pointerDriven, boolean activate, byte guard) {
        boolean var4 = false;
        if (activate) {
          if (this.handleRankingAction((byte) -123)) {
            return (var4);
          }
          if (this.handleCategoryAction(17592)) {
            return (var4);
          }
          int var6 = this.selectedActionCode(-124);
          if (var6 == 0) {
            var4 = true;
            this.close(pointerDriven, (byte) -123);
            return (var4);
          }
          if (var6 == 1) {
            this.openGuestLogin(-1);
            var4 = true;
            return (var4);
          }
        }
        if (guard < 77) {
          this.selectInitialCategory(true, 117);
        }
        return (var4);
    }

    private final void requestHighscores(byte guard) {
        int var6 = EscapeVector.obfuscationControl;
        int var2 = this.categoryIndex((byte) -89);
        if (var2 < 0) {
          return;
        }
        if (!(var2 < RasterBuffer.field_a.length)) {
          return;
        }
        int[] var3 = RasterBuffer.field_a[var2];
        HighscoreQuery[] var4 = new HighscoreQuery[var3.length];
        for (int var5 = 0; var5 < var4.length; var5++) {
          var4[var5] = SocketJs5Transport.requestHighscores(var3[var5], true, 10, 3, 1);
          this.clearMergedBoardIds(0);
        }
        LegacyWidgetStyle.field_N = var4;
        if (guard >= -74) {
          this.rankingButtons = (LegacyButton[]) null;
        }
    }

    private final void drawButtons(boolean guard) {
        int var2 = this.actionIndex(1, this.categoryCode);
        if (!guard) {
          this.rowBoardIdsByColumn = (int[][]) null;
        }
        int var3 = this.selectedRankingAction(-74);
        int var4 = this.actionIndex(1, var3);
        int var5 = di.field_d.selectedIndex;
        HudMessage.a(this.categoryButtons, var2, var5, (byte) -55);
        HudMessage.a(this.rankingButtons, var4, var5, (byte) -114);
        HudMessage.a(this.mainMenuButtons, -1, var5, (byte) -97);
    }

    private final String queryStatusText(int start) {
        String var2 = wk.field_f;
        HighscoreQuery[] var3 = LegacyWidgetStyle.field_N;
        if (AccountSessionSupport.isGuestSession(-123)) {
          return var2;
        }
        if (var3 == null) {
          this.requestHighscores((byte) -83);
          this.table = null;
          return var2;
        }
        if (!this.allQueriesComplete(start)) {
          var2 = FrameworkLoadingStatus.field_b;
          return var2;
        }
        var2 = this.nameColumnStatus(48);
        if (var2 != null) {
          return var2;
        }
        var2 = this.scoreColumnStatus((byte) 86);
        return var2;
    }

    HighscoresScreen(boolean showSubmittedScore, int gameMode) {
        this.rowBoardIdsByColumn = new int[ti.field_a.length][];
        this.showSubmittedScore = showSubmittedScore ? true : false;
        this.queryColumn = 0;
        this.selectInitialCategory(true, gameMode);
        this.accountStateIndex = Bullet.accountStateIndex(121);
        this.buildLayout((byte) -126);
    }

    static {
        field_d = new LoginStage();
    }
}
