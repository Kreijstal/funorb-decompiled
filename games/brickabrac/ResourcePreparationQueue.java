/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ResourcePreparationQueue {
    String statusText;
    static RgbSprite arcticNearSprite;
    private int entryCount;
    private int completedEntries;
    float scaledProgress;
    private int progressScale;
    private ResourcePreparationEntry[] entries;
    static String field_a;

    final void addArchive(ResourceArchive archive, boolean obfuscationGuard, String waitingCaption, String loadingCaption) {
        try {
          if (obfuscationGuard) {
            this.completedEntries = -45;
          }
          this.addEntry((String) null, waitingCaption, loadingCaption, archive, -1, 99);
        } catch (RuntimeException failure) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failure), "s.D(" + (archive != null ? "{...}" : "null") + ',' + obfuscationGuard + ',' + (waitingCaption != null ? "{...}" : "null") + ',' + (loadingCaption != null ? "{...}" : "null") + ')');
        }
    }

    final boolean pollReady(int obfuscationGuard) {
        int unusedGameFlag;
        ResourcePreparationEntry entry;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        if (obfuscationGuard > -94) {
          arcticNearSprite = (RgbSprite) null;
        }
        while (this.completedEntries < this.entryCount) {
          entry = this.entries[this.completedEntries];
          if (!entry.archive.ensureIndex((byte) -127)) {
            this.reportBlockedEntry(0, -22269, entry);
            return false;
          }
          if (0 <= entry.groupId &&
            !entry.archive.ensureGroupAvailable(-13083, entry.groupId)) {
            this.reportBlockedEntry(entry.archive.getGroupProgress(entry.groupId, -27509), -22269, entry);
            return false;
          }
          if (entry.groupName != null &&
            !entry.archive.ensureGroupAvailableByName(entry.groupName, -28138)) {
            this.reportBlockedEntry(entry.archive.getGroupProgressByName(0, entry.groupName), -22269, entry);
            return false;
          }
          if (entry.groupId < 0 &&
            null == entry.groupName &&
            entry.loadingCaption != null &&
            !entry.archive.ensureAllGroupsAvailable(108)) {
            this.reportBlockedEntry(entry.archive.getProgress(-4126), -22269, entry);
            return false;
          }
          this.completedEntries = this.completedEntries + 1;
        }
        return true;
    }

    final void addNamedGroup(String waitingCaption, String groupName, int obfuscationGuard, String loadingCaption, ResourceArchive archive) {
        try {
          this.addEntry(groupName, waitingCaption, loadingCaption, archive, -1, -90);
          int unusedGuardQuotient = -82 / ((73 - obfuscationGuard) / 51);
        } catch (RuntimeException failure) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failure), "s.A(" + (waitingCaption != null ? "{...}" : "null") + ',' + (groupName != null ? "{...}" : "null") + ',' + obfuscationGuard + ',' + (loadingCaption != null ? "{...}" : "null") + ',' + (archive != null ? "{...}" : "null") + ')');
        }
    }

    private final void addEntry(String groupName, String waitingCaption, String loadingCaption, ResourceArchive archive, int groupId, int obfuscationGuard) {
        ResourcePreparationEntry[] expandedEntries = null;
        ResourcePreparationEntry entry = null;
        ResourcePreparationEntry entryAlias = null;
        int appendIndex = 0;
        try {
          if (this.entryCount >= this.entries.length) {
            expandedEntries = new ResourcePreparationEntry[2 * this.entryCount];
            ResourcePreparationEntry[] expandedEntriesAlias = expandedEntries;
            ArrayOperations.copy(this.entries, 0, expandedEntries, 0, this.entryCount);
            this.entries = expandedEntries;
          }
          entry = new ResourcePreparationEntry();
          entryAlias = entry;
          ResourcePreparationEntry entryReference = entryAlias;
          entryAlias.waitingCaption = waitingCaption;
          int unusedGuardQuotient = 0 / ((26 - obfuscationGuard) / 51);
          entryAlias.loadingCaption = loadingCaption;
          entryAlias.archive = archive;
          entryAlias.groupName = groupName;
          entryAlias.groupId = groupId;
          appendIndex = this.entryCount;
          this.entryCount = this.entryCount + 1;
          this.entries[appendIndex] = entry;
        } catch (RuntimeException failure) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failure), "s.J(" + (groupName != null ? "{...}" : "null") + ',' + (waitingCaption != null ? "{...}" : "null") + ',' + (loadingCaption != null ? "{...}" : "null") + ',' + (archive != null ? "{...}" : "null") + ',' + groupId + ',' + obfuscationGuard + ')');
        }
    }

    final static void a(byte param0) {
        String var2 = (String) null;
        Mesh3D.a(true, (String) null, ReportAbuseDialog.field_cc);
        if (param0 == -30) {
          return;
        }
        field_a = (String) null;
    }

    final static void b(int param0) {
        FarmBackground.field_v.setBounds(18, 0, 0, -(!vd.field_e ? 0 : 2 + (DialogMessagePanel.uiScrollbarWidth + 2) + 40) + Ball.field_A.width, (byte) 64);
        GameUiController.field_a.setBounds(18, 0, -42 + Ball.field_A.width - DialogMessagePanel.uiScrollbarWidth, 42 + DialogMessagePanel.uiScrollbarWidth, (byte) 64);
        if (param0 >= 122) {
          IsaacGenerator.field_b.setScrollPaneBounds(2, (byte) -118, Ball.field_A.width, 0, 20, DialogMessagePanel.uiScrollbarWidth, Ball.field_A.height - 20);
          return;
        }
        RgbSprite var2 = (RgbSprite) null;
        ResourcePreparationQueue.a((RgbSprite) null, -53, 56, (RgbSprite) null, (RasterCacheSurface) null, -22, (byte) -5, (RgbSprite) null);
        IsaacGenerator.field_b.setScrollPaneBounds(2, (byte) -118, Ball.field_A.width, 0, 20, DialogMessagePanel.uiScrollbarWidth, Ball.field_A.height - 20);
    }

    final static boolean a(int param0) {
        int var1 = -86 / ((28 - param0) / 42);
        return MusicCrossfadeStream.nameEntryPopup != null ? true : false;
    }

    final static void a(RgbSprite param0, int param1, int param2, RgbSprite param3, RasterCacheSurface param4, int param5, byte param6, RgbSprite param7) {
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        try {
          IndexedSpriteGeometry.pushSpriteRaster(-72, param4.sprite);
          Rasterizer2D.fillVerticalGradient(0, 0, param4.width, param4.height, CacheIoWorker.halloweenBackgroundColors[param2], 22953);
          param3.drawTransparent((-param3.canvasWidth + param4.width) / 2 - 147 / param1, 480 + param5 - param7.canvasHeight);
          param0.b(-(80 / param1) + (param4.width - param0.canvasWidth) / 2, -(201 / param1) + (param4.height + param5) - param0.canvasHeight, 41, 110);
          var8_int = -97 / ((param6 - 54) / 61);
          sc.popRaster(-95);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_4_0 = var8;
          stackIn_4_1 = new StringBuilder().append("s.G(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    ResourcePreparationQueue(int progressScale) {
        this.entries = new ResourcePreparationEntry[16];
        this.progressScale = progressScale;
    }

    public static void c(int param0) {
        field_a = null;
        arcticNearSprite = null;
        if (param0 == 4862) {
          return;
        }
        ResourcePreparationQueue.c(25);
    }

    private final void reportBlockedEntry(int entryPercent, int obfuscationGuard, ResourcePreparationEntry entry) {
        float completedUnits = 0.0f;
        RuntimeException failure = null;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String entrySummary = null;
        RuntimeException caughtFailure = null;
        try {
          completedUnits = (float)entryPercent / 100.0f + (float)(this.completedEntries + 1);
          this.scaledProgress = (float)this.progressScale * completedUnits / (float)(1 + this.entryCount);
          if (obfuscationGuard != -22269) {
            ResourcePreparationQueue.b(116);
          }
          if (entryPercent == 0) {
            this.statusText = entry.waitingCaption;
            return;
          }
          this.statusText = entry.loadingCaption + " - " + entryPercent + "%";
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("s.F(").append(entryPercent).append(',').append(obfuscationGuard).append(',');
          if (entry == null) {
            entrySummary = "null";
          } else {
            entrySummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(entrySummary).append(')').toString());
        }
    }

    static {
        field_a = "Offer unrated rematch";
    }
}
