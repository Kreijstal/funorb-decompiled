/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class VerticalScrollbar extends UiComponent {
    private UiComponent pageDownRegion;
    private UiComponent downButton;
    private UiComponent pageUpRegion;
    private UiComponent track;
    private UiComponent upButton;
    static long field_Pb;
    static UiComponent field_Nb;
    private UiComponent thumb;
    static NineSliceFrame field_Vb;
    static GzipDecoder field_Qb;
    static Sprite field_Wb;
    private int repeatDelay;
    static ClientInputResetSupport field_Ub;
    static UiTheme field_Sb;

    final void layoutScrollbar(int param0, int param1, boolean param2, int param3) {
        int var6 = 0;
        int var5 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        UiComponent var14 = null;
        UiComponent var15 = null;
        UiComponent var16 = null;
        UiComponent var17 = null;
        UiComponent var18 = null;
        UiComponent var19 = null;
        UiComponent var14Lifetime1;
        UiComponent var14Lifetime2;
        UiComponent var15Lifetime1;
        UiComponent var15Lifetime2;
        UiComponent var16Lifetime1;
        UiComponent var16Lifetime2;
        UiComponent var17Lifetime1;
        UiComponent var17Lifetime2;
        UiComponent var18Lifetime1;
        UiComponent var18Lifetime2;
        UiComponent var19Lifetime1;
        UiComponent var19Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var12Lifetime2;
        if (this.height >= 2 * this.width) {
          var6 = -this.width + this.height;
          var5 = this.width;
        } else {
          var6 = this.height / 2;
          var5 = this.height / 2;
        }
        int var7 = -var5 + var6;
        int var8 = var7;
        if (param0 <= 0) {
          var9 = -param1 + param0;
          var10 = var7 - var8;
          var11 = 0;
          if (var9 > 0) {
            var11 = (var9 / 2 + param3 * var10) / var9;
          }
          var12 = var11 + var8 / 2;
          var14 = this.upButton;
          var14.height = var5;
          var14.localX = 0;
          var14.width = this.width;
          var14.localY = 0;
          var15 = this.downButton;
          var15.localX = 0;
          var15.height = -var6 + this.height;
          var15.localY = var6;
          var15.width = this.width;
          var16 = this.track;
          var16.localX = 0;
          var16.width = this.width;
          var16.localY = var5;
          var16.height = var7;
          var17 = this.pageUpRegion;
          var17.height = var12;
          var17.localX = 0;
          var17.width = this.width;
          var17.localY = 0;
          var18 = this.pageDownRegion;
          var18.height = -var12 + var7;
          var18.localY = var12;
          var18.width = this.width;
          var18.localX = 0;
          var19 = this.thumb;
          var19.localX = 0;
          var19.height = var8;
          var19.localY = var11;
          var19.width = this.width;
          this.track.enabled = param1 < param0 ? true : false;
          this.downButton.enabled = param1 < param0 ? true : false;
          this.upButton.enabled = param1 < param0 ? true : false;
          if (param2) {
            field_Vb = (NineSliceFrame) null;
            return;
          }
          return;
        }
        var8 = param1 * var8 / param0;
        if (!(var8 >= this.width)) {
          var8 = this.width;
        }
        if (var7 >= var8) {
          var9Lifetime1 = -param1 + param0;
          var10Lifetime1 = var7 - var8;
          var11Lifetime1 = 0;
          if (var9Lifetime1 > 0) {
            var11Lifetime1 = (var9Lifetime1 / 2 + param3 * var10Lifetime1) / var9Lifetime1;
          }
          var12Lifetime1 = var11Lifetime1 + var8 / 2;
          var14Lifetime1 = this.upButton;
          var14Lifetime1.height = var5;
          var14Lifetime1.localX = 0;
          var14Lifetime1.width = this.width;
          var14Lifetime1.localY = 0;
          var15Lifetime1 = this.downButton;
          var15Lifetime1.localX = 0;
          var15Lifetime1.height = -var6 + this.height;
          var15Lifetime1.localY = var6;
          var15Lifetime1.width = this.width;
          var16Lifetime1 = this.track;
          var16Lifetime1.localX = 0;
          var16Lifetime1.width = this.width;
          var16Lifetime1.localY = var5;
          var16Lifetime1.height = var7;
          var17Lifetime1 = this.pageUpRegion;
          var17Lifetime1.height = var12Lifetime1;
          var17Lifetime1.localX = 0;
          var17Lifetime1.width = this.width;
          var17Lifetime1.localY = 0;
          var18Lifetime1 = this.pageDownRegion;
          var18Lifetime1.height = -var12Lifetime1 + var7;
          var18Lifetime1.localY = var12Lifetime1;
          var18Lifetime1.width = this.width;
          var18Lifetime1.localX = 0;
          var19Lifetime1 = this.thumb;
          var19Lifetime1.localX = 0;
          var19Lifetime1.height = var8;
          var19Lifetime1.localY = var11Lifetime1;
          var19Lifetime1.width = this.width;
          this.track.enabled = param1 < param0 ? true : false;
          this.downButton.enabled = param1 < param0 ? true : false;
          this.upButton.enabled = param1 < param0 ? true : false;
          if (param2) {
            field_Vb = (NineSliceFrame) null;
            return;
          }
          return;
        }
        var8 = var7;
        var9Lifetime2 = -param1 + param0;
        var10Lifetime2 = var7 - var8;
        var11Lifetime2 = 0;
        if (var9Lifetime2 > 0) {
          var11Lifetime2 = (var9Lifetime2 / 2 + param3 * var10Lifetime2) / var9Lifetime2;
        }
        var12Lifetime2 = var11Lifetime2 + var8 / 2;
        var14Lifetime2 = this.upButton;
        var14Lifetime2.height = var5;
        var14Lifetime2.localX = 0;
        var14Lifetime2.width = this.width;
        var14Lifetime2.localY = 0;
        var15Lifetime2 = this.downButton;
        var15Lifetime2.localX = 0;
        var15Lifetime2.height = -var6 + this.height;
        var15Lifetime2.localY = var6;
        var15Lifetime2.width = this.width;
        var16Lifetime2 = this.track;
        var16Lifetime2.localX = 0;
        var16Lifetime2.width = this.width;
        var16Lifetime2.localY = var5;
        var16Lifetime2.height = var7;
        var17Lifetime2 = this.pageUpRegion;
        var17Lifetime2.height = var12Lifetime2;
        var17Lifetime2.localX = 0;
        var17Lifetime2.width = this.width;
        var17Lifetime2.localY = 0;
        var18Lifetime2 = this.pageDownRegion;
        var18Lifetime2.height = -var12Lifetime2 + var7;
        var18Lifetime2.localY = var12Lifetime2;
        var18Lifetime2.width = this.width;
        var18Lifetime2.localX = 0;
        var19Lifetime2 = this.thumb;
        var19Lifetime2.localX = 0;
        var19Lifetime2.height = var8;
        var19Lifetime2.localY = var11Lifetime2;
        var19Lifetime2.width = this.width;
        this.track.enabled = param1 < param0 ? true : false;
        this.downButton.enabled = param1 < param0 ? true : false;
        this.upButton.enabled = param1 < param0 ? true : false;
        if (!param2) {
          return;
        }
        field_Vb = (NineSliceFrame) null;
    }

    public static void releaseStatics(byte param0) {
        field_Wb = null;
        field_Sb = null;
        field_Nb = null;
        field_Ub = null;
        if (param0 >= 12) {
          field_Qb = null;
          field_Vb = null;
          return;
        }
        MeshBuilder var2 = (MeshBuilder) null;
        VerticalScrollbar.swapMeshYAndZ(-122, (MeshBuilder) null);
        field_Qb = null;
        field_Vb = null;
    }

    final int getDraggedScrollOffset(boolean param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        if (param3 < 6) {
          return -68;
        }
        int var5 = 0;
        int var6 = -this.thumb.height + this.track.height;
        if (var6 > 0) {
          var7 = this.thumb.localY;
          var8 = -param2 + param1;
          var5 = (var7 * var8 + var6 / 2) / var6;
        }
        if (!param0) {
          if (-param2 + param1 < var5) {
            var5 = -param2 + param1;
          }
          if (0 > var5) {
            var5 = 0;
          }
          return var5;
        }
        if (var5 < 0) {
          var5 = 0;
        }
        if (var5 > -param2 + param1) {
          var5 = -param2 + param1;
          return var5;
        }
        return var5;
    }

    VerticalScrollbar(long param0, VerticalScrollbar param1) {
        this(param0, param1.upButton, param1.downButton, param1.pageUpRegion, param1.thumb);
    }

    final boolean pollPageDown(byte param0) {
        if (param0 < 121) {
          return false;
        }
        if (this.pageDownRegion.pressedButton != 0) {
          this.repeatDelay = 20;
          return true;
        }
        if (this.pageDownRegion.capturedButton == 0) {
          return false;
        }
        if (this.repeatDelay > 0) {
          this.repeatDelay = this.repeatDelay - 1;
        }
        if (this.repeatDelay != 0) {
          return false;
        }
        if (DebouncedValidationProvider.field_f >= this.thumb.remainingY + (this.thumb.screenY + this.thumb.height) + this.thumb.remainingHeight) {
          this.repeatDelay = 3;
          return true;
        }
        return false;
    }

    final static UiComponent getIgnoreListContent(byte obfuscationGuard) {
        if (obfuscationGuard != 13) {
          VerticalScrollbar.releaseStatics((byte) -72);
          return InputIdleSupport.field_c.content;
        }
        return InputIdleSupport.field_c.content;
    }

    final boolean pollLineDown(byte param0) {
        int var2 = 48 % ((param0 - 13) / 61);
        if (this.downButton.pressedButton != 0) {
          this.repeatDelay = 20;
          return true;
        }
        if (this.downButton.capturedButton == 0) {
          return false;
        }
        if (this.repeatDelay > 0) {
          this.repeatDelay = this.repeatDelay - 1;
          if (this.repeatDelay != 0) {
            return false;
          }
          this.repeatDelay = 3;
          return true;
        }
        if (this.repeatDelay != 0) {
          return false;
        }
        this.repeatDelay = 3;
        return true;
    }

    final boolean pollLineUp(int param0) {
        if (this.upButton.pressedButton != 0) {
          this.repeatDelay = 20;
          return true;
        }
        if (param0 != -4779) {
          return false;
        }
        if (this.upButton.capturedButton == 0) {
          return false;
        }
        if (0 < this.repeatDelay) {
          this.repeatDelay = this.repeatDelay - 1;
          if (this.repeatDelay == 0) {
            this.repeatDelay = 3;
            return true;
          }
          return false;
        }
        if (this.repeatDelay == 0) {
          this.repeatDelay = 3;
          return true;
        }
        return false;
    }

    VerticalScrollbar(long param0, UiComponent param1, UiComponent param2, UiComponent param3, UiComponent param4) {
        super(param0, (UiComponent) null);
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        UiComponent var9 = null;
        UiComponent var10 = null;
        try {
          this.upButton = new UiComponent(0L, param1);
          this.downButton = new UiComponent(0L, param2);
          this.addChild(7, this.upButton);
          this.addChild(-114, this.downButton);
          this.track = new UiComponent(0L, (UiComponent) null);
          this.addChild(126, this.track);
          this.pageUpRegion = new UiComponent(0L, param3);
          this.pageDownRegion = new UiComponent(0L, param3);
          this.pageDownRegion.useParentFrameBounds = true;
          var9 = this.pageUpRegion;
          var10 = var9;
          var10.useParentFrameBounds = true;
          this.track.addChild(65, this.pageUpRegion);
          this.track.addChild(110, this.pageDownRegion);
          this.thumb = new UiComponent(0L, param4);
          this.thumb.draggable = true;
          this.track.addChild(-126, this.thumb);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_5_0 = var7;
          stackIn_5_1 = new StringBuilder().append("db.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static void initializeGameChatPanels(int obfuscationGuard, boolean tutorial) {
        if (obfuscationGuard == 27194) {
          IntegerSyntaxSupport.field_e = !tutorial ? new ReflectionRequestSupport(Camera.muChatGame, ProjectedLineSupport.field_d) : new ReflectionRequestSupport(ArchiveBootstrapSupport.muChatTips, LimitedRandomAccessFile.field_j);
          SceneNode.field_k = new UiComponent(0L, (UiComponent) null);
          SceneNode.field_k.addChild(64, IntegerSyntaxSupport.field_e.field_i);
          SceneNode.field_k.addChild(-96, ContentTransitionDialog.field_ob);
          DebugTuningSupport.field_b = new UiComponent(0L, AccountStateQuery.field_m);
          IntrusiveDequeCursor.field_b = new UiComponent(0L, (UiComponent) null);
          DebugTuningSupport.field_b.addChild(obfuscationGuard ^ -27208, Pool.field_P);
          DebugTuningSupport.field_b.addChild(68, IntrusiveDequeCursor.field_b);
          IntrusiveDequeCursor.field_b.addChild(-96, QuickChatMenuSupport.field_e);
          IntrusiveDequeCursor.field_b.addChild(90, AccountContentDialog.field_vb);
          PoolGameModel.layoutLobbyAndChatPanels(tutorial, 0);
          return;
        }
        VerticalScrollbar.getIgnoreListContent((byte) 19);
        IntegerSyntaxSupport.field_e = !tutorial ? new ReflectionRequestSupport(Camera.muChatGame, ProjectedLineSupport.field_d) : new ReflectionRequestSupport(ArchiveBootstrapSupport.muChatTips, LimitedRandomAccessFile.field_j);
        SceneNode.field_k = new UiComponent(0L, (UiComponent) null);
        SceneNode.field_k.addChild(64, IntegerSyntaxSupport.field_e.field_i);
        SceneNode.field_k.addChild(-96, ContentTransitionDialog.field_ob);
        DebugTuningSupport.field_b = new UiComponent(0L, AccountStateQuery.field_m);
        IntrusiveDequeCursor.field_b = new UiComponent(0L, (UiComponent) null);
        DebugTuningSupport.field_b.addChild(obfuscationGuard ^ -27208, Pool.field_P);
        DebugTuningSupport.field_b.addChild(68, IntrusiveDequeCursor.field_b);
        IntrusiveDequeCursor.field_b.addChild(-96, QuickChatMenuSupport.field_e);
        IntrusiveDequeCursor.field_b.addChild(90, AccountContentDialog.field_vb);
        PoolGameModel.layoutLobbyAndChatPanels(tutorial, 0);
    }

    final void setScrollbarBounds(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.height = param2;
        this.width = param3;
        if (param5 == 8414) {
          this.localY = param1;
          this.localX = param6;
          this.layoutScrollbar(param0, param7, false, param4);
          return;
        }
        this.isThumbCaptured(-62);
        this.localY = param1;
        this.localX = param6;
        this.layoutScrollbar(param0, param7, false, param4);
    }

    final static void resendAchievementAndAccountQueries(byte obfuscationGuard, int opcode) {
        IntrusiveNode var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        AchievementSubmission var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Pool.field_O;
        try {
          var4 = (AchievementSubmission) (StartupInterfaceSupport.field_b.last((byte) 96));
          while (var4 != null) {
            AchievementProtocolSupport.a(opcode, var4, -6725);
            var4 = (AchievementSubmission) (StartupInterfaceSupport.field_b.previous((byte) -5));
          }
          var2 = NodeHashTableIterator.field_j.last((byte) 87);
          while (var2 != null) {
            MusicPatchEnvelope.a(obfuscationGuard ^ 59, opcode);
            var2 = NodeHashTableIterator.field_j.previous((byte) -5);
          }
          if (obfuscationGuard == 58) {
            return;
          }
          field_Qb = (GzipDecoder) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2_ref), "db.AA(" + obfuscationGuard + ',' + opcode + ')');
        }
    }

    final boolean isThumbCaptured(int param0) {
        if (param0 <= -41) {
          return 0 != this.thumb.capturedButton ? true : false;
        }
        this.pageDownRegion = (UiComponent) null;
        return 0 != this.thumb.capturedButton ? true : false;
    }

    final static void h(int param0) {
        LoginEncryptionSupport.setAccountDialogResult(4, (byte) 105);
        if (param0 == 15158) {
          return;
        }
        field_Pb = -100L;
    }

    final boolean pollPageUp(byte param0) {
        if (param0 >= -60) {
          this.downButton = (UiComponent) null;
        }
        if (this.pageUpRegion.pressedButton != 0) {
          this.repeatDelay = 20;
          return true;
        }
        if (this.pageUpRegion.capturedButton == 0) {
          return false;
        }
        if (0 < this.repeatDelay) {
          this.repeatDelay = this.repeatDelay - 1;
        }
        if (this.repeatDelay != 0) {
          return false;
        }
        if (DebouncedValidationProvider.field_f >= this.thumb.remainingY + this.thumb.screenY) {
          return false;
        }
        this.repeatDelay = 3;
        return true;
    }

    final static void swapMeshYAndZ(int obfuscationGuard, MeshBuilder mesh) {
        int[] var3 = null;
        try {
          var3 = mesh.vertexY;
          int[] var2 = var3;
          mesh.vertexY = mesh.vertexZ;
          if (obfuscationGuard != 0) {
            field_Vb = (NineSliceFrame) null;
          }
          mesh.vertexZ = var3;
          ImageProducerRasterBuffer.a(mesh, (byte) 38);
          mesh.clearCaches();
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "db.DA(" + obfuscationGuard + ',' + (mesh != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_Qb = new GzipDecoder();
        field_Ub = new ClientInputResetSupport();
    }
}
