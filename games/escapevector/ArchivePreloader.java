/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchivePreloader {
    private int currentTask;
    private int taskCount;
    static String field_d;
    private int progressCeiling;
    float progressPercent;
    String message;
    static BufferedRandomAccessFile field_h;
    private ArchiveLoadTask[] tasks;

    final static int fontMaxAscent(int guard, BinaryBitmapFont font) {
        String stackIn_7_2 = null;
        try {
          if (guard != -1) {
            BinaryBitmapFont var3 = (BinaryBitmapFont) null;
            ArchivePreloader.fontMaxAscent(88, (BinaryBitmapFont) null);
          }
          int stackIn_3_0 = font.maxAscent;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var2;
          StringBuilder stackIn_6_1 = new StringBuilder().append("uc.H(").append(guard).append(',');
          if (font == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static int booleanReplyLength(int guard) {
        if (guard < 65) {
          return 2;
        }
        return 1;
    }

    private final void addTask(int groupId, ResourceArchive archive, int guard, String waitingText, String progressText, String groupName) {
        try {
          if (this.tasks.length <= this.taskCount) {
            ArchiveLoadTask[] var9 = new ArchiveLoadTask[2 * this.taskCount];
            ArchiveLoadTask[] var7 = var9;
            ArraySupport.copy(this.tasks, 0, var9, 0, this.taskCount);
            this.tasks = var9;
          }
          ArchiveLoadTask var8 = new ArchiveLoadTask();
          ArchiveLoadTask var10 = var8;
          ArchiveLoadTask var7_ref = var10;
          if (guard != 1) {
            this.pollComplete(20);
          }
          var10.groupName = groupName;
          var10.progressText = progressText;
          var10.archive = archive;
          var10.waitingText = waitingText;
          var10.groupId = groupId;
          int fieldTemp$0 = this.taskCount;
          this.taskCount = this.taskCount + 1;
          this.tasks[fieldTemp$0] = var8;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "uc.G(" + groupId + ',' + (archive != null ? "{...}" : "null") + ',' + guard + ',' + (waitingText != null ? "{...}" : "null") + ',' + (progressText != null ? "{...}" : "null") + ',' + (groupName != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(byte guard) {
        if (guard != -59) {
          return;
        }
        field_h = null;
        field_d = null;
    }

    final static boolean loadSpriteSheet(ResourceArchive archive, int guard, int groupId, int fileId) {
        String stackIn_8_2 = null;
        try {
          byte[] var6 = archive.getFile(groupId, (byte) -97, fileId);
          byte[] var4 = var6;
          int var5 = -6 / ((guard - 6) / 55);
          if (var6 == null) {
            return false;
          }
          DialWidget.decodeSpriteSheet(var6, true);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4_ref = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var4_ref;
          StringBuilder stackIn_7_1 = new StringBuilder().append("uc.A(");
          if (archive == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(guard).append(',').append(groupId).append(',').append(fileId).append(')').toString());
        }
    }

    final boolean pollComplete(int guard) {
        int var3 = EscapeVector.obfuscationControl;
        if (guard != 7020) {
          return true;
        }
        while (this.taskCount > this.currentTask) {
          ArchiveLoadTask var4 = this.tasks[this.currentTask];
          if (!var4.archive.ensureIndex(0)) {
            this.updateProgress(0, -33, var4);
            return false;
          }
          if (0 <= var4.groupId &&
            !var4.archive.tryLoadGroup(118, var4.groupId)) {
            this.updateProgress(var4.archive.groupProgress(guard - 3810, var4.groupId), -102, var4);
            return false;
          }
          if (null != var4.groupName &&
            !var4.archive.tryLoadNamedGroup(0, var4.groupName)) {
            this.updateProgress(var4.archive.namedGroupProgress(var4.groupName, 0), guard - 7114, var4);
            return false;
          }
          if (var4.groupId < 0 &&
            null == var4.groupName &&
            var4.progressText != null &&
            !var4.archive.tryLoadAllGroups((byte) -119)) {
            this.updateProgress(var4.archive.overallProgress(-98), -17, var4);
            return false;
          }
          this.currentTask = this.currentTask + 1;
        }
        return true;
    }

    final void addNamedGroup(ResourceArchive archive, String waitingText, String progressText, String groupName, int guard) {
        try {
          this.addTask(-1, archive, 1, waitingText, progressText, groupName);
          if (guard != 14826) {
            field_h = (BufferedRandomAccessFile) null;
          }
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "uc.I(" + (archive != null ? "{...}" : "null") + ',' + (waitingText != null ? "{...}" : "null") + ',' + (progressText != null ? "{...}" : "null") + ',' + (groupName != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    private final void updateProgress(int percent, int guard, ArchiveLoadTask task) {
        try {
          float var4_float = (float)(this.currentTask + 1) + (float)percent / 100.0f;
          if (0 != percent) {
            this.message = task.progressText + " - " + percent + "%";
          } else {
            this.message = task.waitingText;
          }
          if (guard >= -7) {
            this.pollComplete(-63);
          }
          this.progressPercent = (float)this.progressCeiling * var4_float / (float)(this.taskCount + 1);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "uc.C(" + percent + ',' + guard + ',' + (task != null ? "{...}" : "null") + ')');
        }
    }

    final void addWholeArchive(String waitingText, byte guard, String progressText, ResourceArchive archive) {
        try {
          this.addTask(-1, archive, 1, waitingText, progressText, (String) null);
          if (guard > -114) {
            String var6 = (String) null;
            this.addTask(-32, (ResourceArchive) null, 21, (String) null, (String) null, (String) null);
          }
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "uc.F(" + (waitingText != null ? "{...}" : "null") + ',' + guard + ',' + (progressText != null ? "{...}" : "null") + ',' + (archive != null ? "{...}" : "null") + ')');
        }
    }

    ArchivePreloader(int param0) {
        this.tasks = new ArchiveLoadTask[16];
        this.progressCeiling = param0;
    }

    static {
        field_d = "Loading music";
    }
}
