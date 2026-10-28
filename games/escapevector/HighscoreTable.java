/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HighscoreTable {
    private LegacyMenuColumn toLevelColumn;
    private LegacyMenuColumn fromLevelColumn;
    private int y;
    private LegacyMenuColumn nameColumn;
    private HighscoreQuery query;
    static String field_u;
    private LegacyMenuColumn scoreColumn;
    private LegacyMenuColumn difficultyColumn;
    private int footerColor;
    private int highlightedRow;
    int x;
    private boolean[] visibleRows;
    int dataState;
    private ScoreSubmission submittedScore;
    private IntrusiveDeque columns;
    int width;
    int queryColumn;
    private LegacyMenuColumn rankColumn;
    static String field_a;
    private boolean appendSubmittedScore;
    private int rowCount;
    int height;
    static String field_g;
    private String footerText;
    private int categoryCode;

    private final void configureColumns(byte guard) {
        int var4 = EscapeVector.obfuscationControl;
        IntrusiveNode var2_ref_hg = this.columns.first(false);
        while (var2_ref_hg != null) {
          LegacyMenuColumn var3 = (LegacyMenuColumn) (var2_ref_hg);
          this.configureColumn(-23672, var3);
          var2_ref_hg = this.columns.next((byte) 70);
        }
        int var2 = -40 % ((15 - guard) / 47);
    }

    private final int[] fromLevelValues(byte guard) {
        int var8 = EscapeVector.obfuscationControl;
        int[] var10 = this.query.intColumns[this.queryColumn];
        int[] var2 = var10;
        int var3 = ProxySocketConnector.a(92, this.query.boardId);
        if (guard <= 19) {
          int[] var9 = (int[]) null;
          int[] discarded$0 = this.scoreValues(false, (int[]) null, 43);
        }
        int var4 = SpriteFactorySupport.levelCount(false, var3);
        int[] var12 = new int[this.rowCount];
        int[] var11 = var12;
        int[] var5 = var11;
        for (int var6 = 0; var10.length > var6; var6++) {
          int var7 = this.decodeFromLevel(var10[var6], var4, false);
          var12[var6] = var7;
        }
        if (this.appendSubmittedScore) {
          int var6Lifetime1 = this.decodeFromLevel(this.submittedScore.field_q[0], var4, false);
          var5[-1 + this.rowCount] = var6Lifetime1;
        }
        return var5;
    }

    final void draw(int guard) {
        if (guard != 2) {
          String discarded$0 = this.difficultyLabel(-16, -82);
        }
        this.drawColumns(-111);
        this.drawFooter((byte) -85);
    }

    private final int[] toLevelValues(byte guard) {
        int var8 = EscapeVector.obfuscationControl;
        int[] var10 = this.query.intColumns[this.queryColumn];
        int[] var2 = var10;
        int var3 = ProxySocketConnector.a(105, this.query.boardId);
        if (guard <= 120) {
          int[] var9 = (int[]) null;
          int[] discarded$0 = this.scoreValues(true, (int[]) null, -69);
        }
        int var4 = SpriteFactorySupport.levelCount(false, var3);
        int[] var12 = new int[this.rowCount];
        int[] var11 = var12;
        int[] var5 = var11;
        for (int var6 = 0; var6 < var10.length; var6++) {
          int var7 = this.decodeToLevel(-1, var10[var6], var4);
          var12[var6] = var7;
        }
        if (this.appendSubmittedScore) {
          int var6Lifetime1 = this.decodeToLevel(-1, this.submittedScore.field_q[0], var4);
          var5[-1 + this.rowCount] = var6Lifetime1;
        }
        return var5;
    }

    private final int[] missingValues(int guard, int count) {
        int var5 = EscapeVector.obfuscationControl;
        int[] var3 = new int[count];
        int var4 = 0;
        if (guard != -27531) {
          String[] var6 = (String[]) null;
          String[] discarded$0 = this.nameValues((String[]) null, -110);
        }
        while (var4 < var3.length) {
          var3[var4] = -1;
          var4++;
        }
        return var3;
    }

    final static void archiveInitializationHook(byte guard, ResourceArchive firstArchive, ResourceArchive secondArchive) {
        try {
          if (guard < 55) {
            field_u = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "gj.D(" + guard + ',' + (firstArchive != null ? "{...}" : "null") + ',' + (secondArchive != null ? "{...}" : "null") + ')');
        }
    }

    private final void drawFooter(byte guard) {
        int var2 = 640;
        int var3 = var2 / 2;
        int var4 = this.y + this.height - 2;
        BinaryBitmapFont var5 = ByteStorage.gameFont;
        int var7 = -42 % ((45 - guard) / 61);
        int var6 = PasswordFieldPainter.fontLineHeight(var5, 31512);
        var4 = var4 - var6;
        int var8 = ArchivePreloader.fontMaxAscent(-1, var5);
        var4 = var4 + var8;
        if (this.footerText != null) {
          var5.drawCentered(this.footerText, var3, var4, this.footerColor, -1);
        }
    }

    private final void configureColumn(int guard, LegacyMenuColumn column) {
        String stackIn_9_2 = null;
        try {
          if (column == null) {
            return;
          }
          BinaryBitmapFont var3 = ByteStorage.gameFont;
          int var4 = 10551200;
          int var5 = 16777215;
          column.configure(var3, var5, (byte) -107, var4);
          if (guard != -23672) {
            int[] discarded$1 = this.missingValues(58, -116);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var3_ref;
          StringBuilder stackIn_8_1 = new StringBuilder().append("gj.K(").append(guard).append(',');
          if (column == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final void setVisibleRows(String[] names, int guard) {
        String stackIn_20_2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          if (guard >= -105) {
            this.difficultyColumn = (LegacyMenuColumn) null;
          }
          this.visibleRows = new boolean[this.rowCount];
          if (names == null) {
            return;
          }
          int var3_int = 0;
          String[] var4 = names;
          for (int var5 = 0; var5 < var4.length; var5++) {
            String var6 = var4[var5];
            if (var6 != null) {
              if (this.visibleRows.length <= var3_int) {
                return;
              }
              this.visibleRows[var3_int] = true;
            }
            var3_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_19_0 = var3;
          StringBuilder stackIn_19_1 = new StringBuilder().append("gj.P(");
          if (names == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(guard).append(')').toString());
        }
    }

    private final void drawColumns(int guard) {
        int var5 = EscapeVector.obfuscationControl;
        int var2 = -64 / ((guard + 50) / 50);
        IntrusiveNode var3 = this.columns.first(false);
        while (var3 != null) {
          LegacyMenuColumn var4 = (LegacyMenuColumn) (var3);
          if (this.visibleRows != null) {
            var4.drawVisibleRows(this.highlightedRow, this.visibleRows, (byte) 48);
          } else {
            var4.draw(-6131, this.highlightedRow);
          }
          var3 = this.columns.next((byte) 70);
        }
    }

    public static void releaseStatics(int guard) {
        field_u = null;
        field_a = null;
        if (guard != 3355) {
          return;
        }
        field_g = null;
    }

    private final int measureHeight(int guard) {
        int var2 = this.nameColumn.height((byte) 87);
        BinaryBitmapFont var3 = ByteStorage.gameFont;
        if (guard > -33) {
          int discarded$0 = this.findSubmittedScoreRow(-73);
        }
        int var4 = PasswordFieldPainter.fontLineHeight(var3, 31512);
        var2 = var2 + (2 + var4);
        return var2;
    }

    private final int decodeToLevel(int guard, int packedScore, int levelCount) {
        int var4 = packedScore / 50 % 50;
        if (guard < ~var4) {
          var4 = 0;
        }
        if (var4 >= levelCount) {
          var4 = levelCount - 1;
        }
        return 1 + var4;
    }

    final static boolean wrapMinimapAtSpawn(int levelIndex, int mode, byte guard) {
        if (mode < 0) {
          return false;
        }
        if (!(MarkerSlider.field_E.length > mode)) {
          return false;
        }
        if (levelIndex < 0) {
          return false;
        }
        if (guard < 23) {
          return true;
        }
        if (!(levelIndex < MarkerSlider.field_E[mode].length)) {
          return false;
        }
        return MarkerSlider.field_E[mode][levelIndex];
    }

    private final void layoutColumns(byte guard) {
        int var6 = EscapeVector.obfuscationControl;
        int var2 = this.x;
        int var3 = this.y;
        if (guard != 52) {
          return;
        }
        IntrusiveNode var4 = this.columns.first(false);
        while (var4 != null) {
          LegacyMenuColumn var5 = (LegacyMenuColumn) (var4);
          var5.setPosition(var2, var3, 0);
          var2 = var2 + var5.width((byte) -127);
          var4 = this.columns.next((byte) 70);
        }
    }

    private final String difficultyLabel(int guard, int mode) {
        if (mode == 1) {
          return LoginDialog.field_lb;
        }
        if (guard != -17651) {
          this.submittedScore = (ScoreSubmission) null;
        }
        if (mode == 0) {
          return MenuInputState.field_b;
        }
        if (mode == 2) {
          return LoginDialog.field_lb;
        }
        if (mode == 3) {
          return LoginDialog.field_lb;
        }
        return LoginDialog.field_lb;
    }

    final void configureFooter(int guard, String text, int color) {
        try {
          this.footerText = text;
          this.footerColor = color;
          if (guard != 3) {
            int[] discarded$0 = this.fromLevelValues((byte) -24);
          }
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "gj.T(" + guard + ',' + (text != null ? "{...}" : "null") + ',' + color + ')');
        }
    }

    private final int findSubmittedScoreRow(int guard) {
        int var9 = EscapeVector.obfuscationControl;
        if (guard <= 123) {
          return -15;
        }
        int var2 = this.query.boardId;
        int var3 = this.categoryIndexForMode(var2, false);
        if (0 > var3 ||
          RasterBuffer.field_a.length <= var3) {
          return -1;
        }
        int[] var4 = RasterBuffer.field_a[var3];
        int[] var5 = var4;
        for (int var6 = 0; var5.length > var6; var6++) {
          int var7 = var5[var6];
          this.query.boardId = var7;
          int var8 = UsernameCredentials.findSubmittedScoreRow(this.submittedScore, this.queryColumn, 0, this.query);
          if (0 <= var8) {
            this.query.boardId = var2;
            return var8;
          }
        }
        return -1;
    }

    private final String[] difficultyValues(int[] boardIds, boolean guard) {
        String stackIn_14_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          if (!guard) {
            this.nameColumn = (LegacyMenuColumn) null;
          }
          String[] var7 = new String[this.rowCount];
          String[] var3 = var7;
          for (int var4 = 0; var4 < boardIds.length; var4++) {
            int var5 = ProxySocketConnector.a(107, boardIds[var4]);
            var7[var4] = this.difficultyLabel(-17651, var5);
          }
          if (this.appendSubmittedScore) {
            int var4Lifetime1 = ProxySocketConnector.a(115, this.submittedScore.boardId);
            var3[this.rowCount - 1] = this.difficultyLabel(-17651, var4Lifetime1);
          }
          String[] stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var3_ref;
          StringBuilder stackIn_13_1 = new StringBuilder().append("gj.V(");
          if (boardIds == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(guard).append(')').toString());
        }
    }

    private final String[] nameValues(String[] names, int guard) {
        String stackIn_10_2 = null;
        try {
          String[] var4 = new String[this.rowCount];
          String[] var3 = var4;
          if (guard != -1) {
            String[] stackIn_2_0 = (String[]) null;
            return stackIn_2_0;
          }
          ArraySupport.copy(names, 0, var3, 0, names.length);
          if (this.appendSubmittedScore) {
            var4[-1 + this.rowCount] = ThreeSliceButtonPainter.field_r;
          }
          String[] stackIn_6_0 = var3;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var3_ref;
          StringBuilder stackIn_9_1 = new StringBuilder().append("gj.M(");
          if (names == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(guard).append(')').toString());
        }
    }

    private final int[] scoreValues(boolean guard, int[] packedScores, int mode) {
        String stackIn_13_2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          int[] var8 = new int[this.rowCount];
          int[] var4 = var8;
          for (int var5 = 0; packedScores.length > var5; var5++) {
            int var6 = UiContainer.scoreFromPacked(-56, mode, packedScores[var5]);
            var8[var5] = var6;
          }
          if (!guard) {
            this.layoutColumns((byte) -108);
          }
          if (this.appendSubmittedScore) {
            int var5Lifetime1 = UiContainer.scoreFromPacked(-49, mode, this.submittedScore.field_q[0]);
            var4[-1 + this.rowCount] = var5Lifetime1;
          }
          int[] stackIn_9_0 = var4;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4_ref = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var4_ref;
          StringBuilder stackIn_12_1 = new StringBuilder().append("gj.Q(").append(guard).append(',');
          if (packedScores == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(mode).append(')').toString());
        }
    }

    private final int measureWidth(int guard) {
        int var5 = EscapeVector.obfuscationControl;
        int var2 = 0;
        IntrusiveNode var3 = this.columns.first(false);
        if (guard >= -115) {
          this.draw(117);
        }
        while (var3 != null) {
          LegacyMenuColumn var4 = (LegacyMenuColumn) (var3);
          var2 = var2 + var4.width((byte) -127);
          var3 = this.columns.next((byte) 70);
        }
        return var2;
    }

    private final int decodeFromLevel(int packedScore, int levelCount, boolean guard) {
        if (guard) {
          ResourceArchive var7 = (ResourceArchive) null;
          HighscoreTable.archiveInitializationHook((byte) -44, (ResourceArchive) null, (ResourceArchive) null);
        }
        int var4 = this.decodeToLevel(-1, packedScore, levelCount);
        int var5 = packedScore % 50;
        int var6 = -var5 + var4;
        if (var6 < 1) {
          var6 = 1;
        }
        if (var6 > levelCount) {
          var6 = levelCount;
        }
        return var6;
    }

    private final int categoryCodeForMode(int guard, int mode) {
        if (guard != -1) {
          return 0;
        }
        if (mode == 0) {
          return 5;
        }
        if (1 == mode) {
          return 5;
        }
        if (mode == 2) {
          return 6;
        }
        if (mode == 3) {
          return 7;
        }
        return -1;
    }

    HighscoreTable(HighscoreQuery query, int[] boardIds, ScoreSubmission submittedScore, int queryColumn, int categoryCode, int y, boolean showSubmittedScore) {
        int stackIn_12_1 = 0;
        String stackIn_21_2 = null;
        String stackIn_24_2 = null;
        String stackIn_27_2 = null;
        try {
          this.queryColumn = queryColumn;
          this.query = query;
          this.categoryCode = categoryCode;
          this.highlightedRow = -1;
          this.submittedScore = submittedScore;
          this.dataState = 1;
          if (null != this.submittedScore) {
            this.highlightedRow = this.findSubmittedScoreRow(124);
          }
          boolean stackIn_9_1 = (showSubmittedScore) && (this.highlightedRow < 0) && (null != this.submittedScore) && (this.categoryCodeForMode(-1, this.submittedScore.boardId) == this.categoryCode);
          this.appendSubmittedScore = stackIn_9_1;
          stackIn_12_1 = (!this.appendSubmittedScore) ? (0) : (1);
          this.rowCount = stackIn_12_1 + this.query.stringColumns[this.queryColumn].length;
          if (this.appendSubmittedScore) {
            this.highlightedRow = this.rowCount - 1;
          }
          this.columns = new IntrusiveDeque();
          int var8_int = this.query.stringColumns[this.queryColumn].length;
          this.rankColumn = new LegacyMenuColumn(var8_int);
          this.columns.addLast(-12328, this.rankColumn);
          String[] var9 = this.nameValues(this.query.stringColumns[this.queryColumn], -1);
          this.setVisibleRows(var9, -117);
          this.nameColumn = new LegacyMenuColumn(IndexedSpriteState.field_b, var9, 1);
          this.columns.addLast(-12328, this.nameColumn);
          String[] var10 = new String[this.rowCount];
          if (5 == this.categoryCode) {
            var10 = this.difficultyValues(boardIds, true);
          }
          this.difficultyColumn = new LegacyMenuColumn(NanoTickClock.field_o, var10, 2);
          this.columns.addLast(-12328, this.difficultyColumn);
          int[] var24 = this.fromLevelValues((byte) 39);
          this.fromLevelColumn = new LegacyMenuColumn(Checkbox.field_D, var24);
          this.columns.addLast(-12328, this.fromLevelColumn);
          int[] var25 = this.toLevelValues((byte) 127);
          this.toLevelColumn = new LegacyMenuColumn(ByteArrayPoolSupport.field_c, var25);
          this.columns.addLast(-12328, this.toLevelColumn);
          int[] var26 = this.scoreValues(true, this.query.intColumns[this.queryColumn], ProxySocketConnector.a(90, this.query.boardId));
          this.scoreColumn = new LegacyMenuColumn(GrowableIntList.field_f, var26);
          this.columns.addLast(-12328, this.scoreColumn);
          this.configureColumns((byte) -113);
          int var14 = 640;
          this.width = this.measureWidth(-128);
          this.height = this.measureHeight(-98);
          this.y = y;
          this.x = (var14 - this.width) / 2;
          this.layoutColumns((byte) 52);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var8 = decompiledCaughtException;
          RuntimeException stackIn_20_0 = var8;
          StringBuilder stackIn_20_1 = new StringBuilder().append("gj.<init>(");
          if (query == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          StringBuilder stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (boardIds == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          StringBuilder stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (submittedScore == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(queryColumn).append(',').append(categoryCode).append(',').append(y).append(',').append(showSubmittedScore).append(')').toString());
        }
    }

    HighscoreTable(int categoryCode, int y, boolean showSubmittedScore) {
        this.categoryCode = categoryCode;
        this.dataState = 0;
        this.rowCount = 10;
        if (showSubmittedScore) {
          this.rowCount = this.rowCount + 1;
        }
        this.columns = new IntrusiveDeque();
        this.rankColumn = new LegacyMenuColumn(this.rowCount);
        this.columns.addLast(-12328, this.rankColumn);
        String[] var10 = new String[this.rowCount];
        this.nameColumn = new LegacyMenuColumn(IndexedSpriteState.field_b, var10, 1);
        this.columns.addLast(-12328, this.nameColumn);
        String[] var5 = new String[this.rowCount];
        this.difficultyColumn = new LegacyMenuColumn(NanoTickClock.field_o, var5, 2);
        this.columns.addLast(-12328, this.difficultyColumn);
        int[] var20 = this.missingValues(-27531, this.rowCount);
        this.fromLevelColumn = new LegacyMenuColumn(Checkbox.field_D, var20);
        this.columns.addLast(-12328, this.fromLevelColumn);
        int[] var21 = this.missingValues(-27531, this.rowCount);
        this.toLevelColumn = new LegacyMenuColumn(ByteArrayPoolSupport.field_c, var21);
        this.columns.addLast(-12328, this.toLevelColumn);
        int[] var22 = this.missingValues(-27531, this.rowCount);
        this.scoreColumn = new LegacyMenuColumn(GrowableIntList.field_f, var22);
        this.columns.addLast(-12328, this.scoreColumn);
        this.configureColumns((byte) -41);
        int var9 = 640;
        this.width = this.measureWidth(-124);
        this.height = this.measureHeight(-102);
        this.y = y;
        this.x = (-this.width + var9) / 2;
        this.layoutColumns((byte) 52);
    }

    private final int categoryIndexForMode(int mode, boolean guard) {
        if (mode == 0) {
          return 0;
        }
        if (1 == mode) {
          return 0;
        }
        if (mode == 2) {
          return 1;
        }
        if (mode == 3) {
          return 2;
        }
        if (guard) {
          int discarded$0 = this.categoryCodeForMode(-56, 63);
        }
        return -1;
    }

    static {
        field_u = "Return to game";
        field_a = "This game has been updated! Please reload this page.";
    }
}
