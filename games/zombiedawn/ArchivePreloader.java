/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchivePreloader {
    private int field_c;
    static String field_h;
    static String field_g;
    private int field_f;
    float field_a;
    String field_b;
    private int field_d;
    private ArchiveLoadStep[] field_e;

    final void addArchiveIndexPreload(String param0, Js5Archive param1, int param2) {
        try {
          this.addPreloadEntry(param1, -1, (String) null, param0, 25324, (String) null);
          if (param2 != 1) {
            ArchivePreloader.drawDialogOverlay(false, true);
          }
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "jk.F(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void addPreloadEntry(Js5Archive param0, int param1, String param2, String param3, int param4, String param5) {
        ArchiveLoadStep[] var9 = null;
        ArchiveLoadStep var8 = null;
        ArchiveLoadStep var10 = null;
        int fieldTemp$0 = 0;
        if (this.field_e.length <= this.field_c) {
          var9 = new ArchiveLoadStep[2 * this.field_c];
          ArchiveLoadStep[] var7 = var9;
          ArraySupport.copy(this.field_e, 0, var9, 0, this.field_c);
          this.field_e = var9;
        }
        if (param4 != 25324) {
          return;
        }
        try {
          var8 = new ArchiveLoadStep();
          var10 = var8;
          ArchiveLoadStep var7_ref = var10;
          var10.field_i = param2;
          var10.field_k = param5;
          var10.field_f = param1;
          var10.field_g = param3;
          var10.field_c = param0;
          fieldTemp$0 = this.field_c;
          this.field_c = this.field_c + 1;
          this.field_e[fieldTemp$0] = var8;
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "jk.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static void resetTooltipState(int param0) {
        WeightedLruCache.field_i = -1;
        LevelSelectScreen.field_m = param0;
        GooPuddle.field_i = -1;
        StatefulWidgetRenderer.field_x = false;
        AchievementBanner.field_m = null;
    }

    final static void drawDialogOverlay(boolean param0, boolean param1) {
        if (!ArmySoldier.hasActiveDialog((byte) -80)) {
          return;
        }
        if (param0) {
          Rasterizer.fillRectangleBlended(0, 0, Rasterizer.width, Rasterizer.height, 0, 192);
        }
        if (!param1) {
          CivilianHuman.field_xb.drawAllLayers(0, 0, 0);
          return;
        }
        field_h = (String) null;
        CivilianHuman.field_xb.drawAllLayers(0, 0, 0);
    }

    final static void appendChatHistory(byte param0, ChatMessage param1) {
        int dupTemp$3 = 0;
        int dupTemp$0 = 0;
        int var3 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        ChatMessage var6 = null;
        int var2_intLifetime1;
        int var2_intLifetime2;
        var5 = ZombieDawn.field_J;
        try {
          for (var2_int = 0; var2_int < 3; var2_int++) {
            AchievementsScreen.field_o[var2_int] = 0;
          }
          for (var2_intLifetime1 = 0; EditableTextWidget.field_E > var2_intLifetime1; var2_intLifetime1++) {
            if (PowerupCard.field_m[var2_intLifetime1].field_j == param1.field_j) {
              dupTemp$3 = PowerupCard.field_m[var2_intLifetime1].getDisplayPriority((byte) -82);
              AchievementsScreen.field_o[dupTemp$3] = AchievementsScreen.field_o[dupTemp$3] + 1;
            }
          }
          if (param0 >= -57) {
            var6 = (ChatMessage) null;
            ArchivePreloader.appendChatHistory((byte) -114, (ChatMessage) null);
          }
          dupTemp$0 = param1.getDisplayPriority((byte) -80);
          AchievementsScreen.field_o[dupTemp$0] = AchievementsScreen.field_o[dupTemp$0] + 1;
          var2_intLifetime2 = 0;
          for (var3 = 0; EditableTextWidget.field_E > var3; var3++) {
            boolean decompiledFrameRemainder0 = true;
            if (PowerupCard.field_m[var3].field_j == param1.field_j) {
              var4 = PowerupCard.field_m[var3].getDisplayPriority((byte) -78);
              if (LevelNavigation.field_d < AchievementsScreen.field_o[var4]) {
                AchievementsScreen.field_o[var4] = AchievementsScreen.field_o[var4] - 1;
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0) {
              incrementValue$2 = var2_intLifetime2;
              var2_intLifetime2++;
              PowerupCard.field_m[incrementValue$2] = PowerupCard.field_m[var3];
            }
          }
          EditableTextWidget.field_E = var2_intLifetime2;
          fieldTemp$1 = EditableTextWidget.field_E;
          EditableTextWidget.field_E = EditableTextWidget.field_E + 1;
          PowerupCard.field_m[fieldTemp$1] = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_27_0 = var2;
          stackIn_27_1 = new StringBuilder().append("jk.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final void addArchivePreload(byte param0, Js5Archive param1, String param2, String param3) {
        try {
          this.addPreloadEntry(param1, -1, (String) null, param3, 25324, param2);
          if (param0 > -90) {
            ChatMessage var6 = (ChatMessage) null;
            ArchivePreloader.appendChatHistory((byte) -18, (ChatMessage) null);
          }
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "jk.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void updateProgress(int param0, int param1, ArchiveLoadStep param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            field_h = (String) null;
          }
          var4_float = (float)(1 + this.field_f) + (float)param1 / 100.0f;
          this.field_a = (float)this.field_d * var4_float / (float)(1 + this.field_c);
          if (param1 != 0) {
            this.field_b = param2.field_k + " - " + param1 + "%";
            return;
          }
          this.field_b = param2.field_g;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("jk.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_g = null;
        if (param0 <= 19) {
          field_g = (String) null;
          field_h = null;
          return;
        }
        field_h = null;
    }

    final void addNamedGroupPreload(String param0, String param1, String param2, Js5Archive param3, byte param4) {
        try {
          this.addPreloadEntry(param3, -1, param0, param1, param4 ^ -25280, param2);
          if (param4 != -84) {
            ArchivePreloader.resetTooltipState(-21);
          }
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "jk.J(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final boolean pollCompletion(int param0) {
        int var3;
        ArchiveLoadStep var4;
        var3 = ZombieDawn.field_J;
        while (this.field_c > this.field_f) {
          var4 = this.field_e[this.field_f];
          if (!var4.field_c.isIndexLoaded((byte) 73)) {
            this.updateProgress(~param0, 0, var4);
            return false;
          }
          if (var4.field_f >= 0 &&
            !var4.field_c.ensureGroupLoaded(-29092, var4.field_f)) {
            this.updateProgress(0, var4.field_c.getGroupProgress(var4.field_f, param0 - 5365), var4);
            return false;
          }
          if (var4.field_i != null &&
            !var4.field_c.loadGroupByName(-1, var4.field_i)) {
            this.updateProgress(0, var4.field_c.getGroupProgressByName(var4.field_i, 103), var4);
            return false;
          }
          if (var4.field_f < 0 &&
            var4.field_i == null &&
            var4.field_k != null &&
            !var4.field_c.areAllGroupsLoaded(9001)) {
            this.updateProgress(~param0, var4.field_c.percentLoaded(-102), var4);
            return false;
          }
          this.field_f = this.field_f + 1;
        }
        if (param0 == -1) {
          return true;
        }
        this.field_d = -49;
        return true;
    }

    ArchivePreloader(int param0) {
        this.field_e = new ArchiveLoadStep[16];
        this.field_d = param0;
    }

    static {
        field_g = "Back";
        field_h = "This is a members only level. If you are a member, log in to start at any members only level you've reached.";
    }
}
