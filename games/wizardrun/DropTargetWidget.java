/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DropTargetWidget extends SingleChildWidget {
    static String field_G;
    static String[] field_I;
    static Sprite[] frameSprites;

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        boolean stackIn_15_0 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (param1 >= -86) {
            return true;
          }
          var3 = StrongCacheEntry.reverseString(param0, 1);
          if (-1 != param2.indexOf(param0)) {
            return true;
          }
          if (param2.indexOf(var3) != -1) {
            return true;
          }
          stackIn_15_0 = (param2.startsWith(param0)) || (param2.startsWith(var3)) || (param2.endsWith(param0)) || (param2.endsWith(var3));
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("pd.MA(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static void a(boolean param0, boolean param1) {
        int var2;
        int var3;
        var3 = wizardrun.field_H;
        if (ArchiveProvider.field_a <= 0) {
          var2 = (ThreePieceFrameHelpers.a(-89)) ? 0 : 1;
        } else {
          if (null == StringPaddingHelpers.field_c) {
            LoginChoicePanel.field_E = DelayedServerPacket.createFullscreenCanvas(0, 640, 0, 480, 0, MusicPatchLoader.field_g);
          } else {
            LoginChoicePanel.field_E = StringPaddingHelpers.field_c.c(0);
            AccountConnectionState.notifyBrowserResize(0, 2);
          }
          if (LoginChoicePanel.field_E != null) {
            var2 = 2;
            IndexedSpriteState.a(false, LoginChoicePanel.field_E);
          } else {
            var2 = 3;
          }
        }
        if (null == StringPaddingHelpers.field_c &&
          ArchiveContainerHelpers.field_b) {
          TriangleMesh.a(param0, var2, 15991);
        }
        if (param1) {
          DropTargetWidget.releaseStatics(-89);
        }
    }

    final static void readAchievementResponse(boolean param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        IsaacPacketBuffer var5 = null;
        int var6 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        AchievementSubmission var11 = null;
        IsaacPacketBuffer var12 = null;
        int[] var13 = null;
        AchievementStateRequest var14 = null;
        AchievementStateRequest var15 = null;
        int[] var16 = null;
        var8 = wizardrun.field_H;
        try {
          if (param0) {
            field_I = (String[]) null;
          }
          var12 = AccountCreationForm.field_N;
          var2 = var12.readUnsignedByte(255);
          if (var2 == 0) {
            var10 = AccountProgressDialog.createAchievementStateWords(-26421);
            var16 = var10;
            var13 = var16;
            var3 = var13;
            var9 = var10;
            var4 = var9;
            var5 = var12;
            var6 = ((PacketBuffer) ((Object) var5)).readUnsignedByte(255);
            for (var7 = 0; var7 < var6; var7++) {
              var9[var7] = ((PacketBuffer) ((Object) var5)).readInt(255);
            }
            var14 = (AchievementStateRequest) (AudioServiceThread.field_d.first((byte) 97));
            if (var14 == null) {
              HuffmanDecoder.closeAccountConnection(-113);
              return;
            }
            var14.stateWords = var3;
            var14.firstStateWord = var16[0];
            var14.complete = true;
            var14.unlink(false);
            return;
          }
          if (var2 == 1) {
            var11 = (AchievementSubmission) (EmailCheckRequest.field_j.first((byte) 123));
            if (var11 == null) {
              HuffmanDecoder.closeAccountConnection(-58);
              return;
            }
            var11.unlink(false);
          } else {
            if (var2 == 2) {
              var15 = (AchievementStateRequest) (AudioServiceThread.field_d.first((byte) 48));
              if (var15 == null) {
                HuffmanDecoder.closeAccountConnection(-34);
                return;
              }
              var15.stateWords = AccountProgressDialog.createAchievementStateWords(-26421);
              var15.complete = true;
              var15.firstStateWord = var15.stateWords[0];
              var15.unlink(false);
            } else {
              ResizableDialog.reportClientError((Throwable) null, "A1: " + LevelDecodingHelpers.describeAccountPacket(6), -562);
              HuffmanDecoder.closeAccountConnection(-109);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ExceptionSupport.wrapException((Throwable) ((Object) var1), "pd.OA(" + param0 + ')');
        }
    }

    final void handleMouseRelease(int param0, int param1, int param2, int param3, UiWidget param4, int param5) {
        DraggableWidget var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        try {
          super.handleMouseRelease(param0, param1, param2, param3, param4, param5 + param5);
          var7 = LevelData.field_h;
          if (var7 != null &&
            this.containsPoint(param1, param3, 0, param0, param2)) {
            if (this.listener instanceof DropListener) {
              ((DropListener) (this.listener)).onDrop(var7, -95, this);
              LevelData.field_h = null;
              return;
            }
            if (var7.listener instanceof DropListener) {
              ((DropListener) (var7.listener)).onDrop(var7, -106, this);
              LevelData.field_h = null;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_9_0 = var7_ref;
          stackIn_9_1 = new StringBuilder().append("pd.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param5).append(')').toString());
        }
    }

    private DropTargetWidget(int param0, int param1, int param2, int param3, WidgetRenderer param4, WidgetListener param5, UiWidget param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
          this.field_F = param6;
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "pd.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_I = null;
        field_G = null;
        if (param0 != -27864) {
          return;
        }
        frameSprites = null;
    }

    static {
        field_G = "You and your friends have not";
    }
}
