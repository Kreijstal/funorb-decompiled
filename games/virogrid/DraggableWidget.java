/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class DraggableWidget extends SingleChildWidget {
    private int field_J;
    static volatile boolean field_K;
    static int field_E;
    private boolean field_F;
    private int field_B;
    private boolean field_G;
    static int field_I;
    private int field_M;
    static String field_H;
    private int field_L;

    final boolean handlePointerPress(UiWidget param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2) {
            DraggableWidget.shutdownSession(-45);
          }
          var8_int = super.handlePointerPress(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
          if (var8_int != 0 &&
            this.field_G) {
            return true;
          }
          if (!this.containsPointer(param5, param6, param4, (byte) 94, param3)) {
            stackIn_8_0 = var8_int;
            return stackIn_8_0 != 0;
          }
          this.field_i = param1;
          if (param1 != 1) {
            return true;
          }
          ScoreSubmissionHelpers.field_b = this;
          this.field_B = -this.field_u + param4 - param5;
          this.field_L = -this.field_l + param6 - param3;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("ce.NA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void updatePointer(int param0, int param1, UiWidget param2, int param3) {
        int stackIn_18_1 = 0;
        int stackIn_19_2 = 0;
        int stackIn_26_1 = 0;
        int stackIn_27_2 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          if ((!(this.field_x instanceof TextButton) ||
            ((TextButton) (this.field_x)).field_C) &&
            this.field_i == 1) {
            var5_int = -param0 + (StatefulWidgetPainter.field_u - this.field_L);
            var6 = -param3 + IconTextComponent.field_Jb - this.field_B;
            if (var5_int != this.field_l ||
              var6 != this.field_u) {
              this.field_u = var6;
              this.field_l = var5_int;
              if (this.field_o instanceof WidgetDragListener) {
                ((WidgetDragListener) (this.field_o)).onDragged(param0, param3, this, 104);
              }
            }
          } else {
            if (this.field_F) {
              if (this.field_M != this.field_l) {
                var5_int = -this.field_l + this.field_M;
                stackIn_18_1 = this.field_l;
                if (Math.abs(var5_int) > 2) {
                  stackIn_19_2 = var5_int >> 1;
                } else {
                  if (var5_int <= 0) {
                    stackIn_19_2 = -1;
                  } else {
                    stackIn_19_2 = 1;
                  }
                }
                this.field_l = stackIn_18_1 + stackIn_19_2;
              }
              if (this.field_J != this.field_u) {
                var5_int = this.field_J - this.field_u;
                stackIn_26_1 = this.field_u;
                if (2 < Math.abs(var5_int)) {
                  stackIn_27_2 = var5_int >> 1;
                } else {
                  if (0 >= var5_int) {
                    stackIn_27_2 = -1;
                  } else {
                    stackIn_27_2 = 1;
                  }
                }
                this.field_u = stackIn_26_1 + stackIn_27_2;
              }
            }
          }
          if (param1 <= 113) {
            this.refreshChildLayout(33);
          }
          super.updatePointer(param0, 122, param2, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_34_0 = var5;
          stackIn_34_1 = new StringBuilder().append("ce.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean pollGameSocketConnection(int param0, boolean param1) {
        try {
          long dupTemp$1 = 0L;
          IOException var2 = null;
          Js5Archive var3 = null;
          CipherPacketBuffer var5 = null;
          CipherPacketBuffer var6 = null;
          int stackIn_13_0 = 0;
          Throwable decompiledCaughtException = null;
          if (param0 >= -35) {
            var3 = (Js5Archive) null;
            DraggableWidget.loadIndexedSprites(47, -49, (Js5Archive) null, -99);
          }
          if (CanvasPresentHelpers.field_b == null) {
            CanvasPresentHelpers.field_b = ArchiveLoadSequence.field_f.openSocket(ConditionalTextValue.field_b, 27402, RankingArraySupport.field_c);
          }
          if (CanvasPresentHelpers.field_b.field_a == 0) {
            return false;
          }
          dupTemp$1 = ClockAndTextHelpers.monotonicMillis(-9986);
          ViewModeNoticeGlobals.field_a = dupTemp$1;
          PendingSubmission.field_l = dupTemp$1;
          if (CanvasPresentHelpers.field_b.field_a != 1) {
            DigestHelpers.field_a = LoginMethodHelpers.field_d;
          } else {
            try {
              QuickChatMenu.field_Ub = new BufferedSocket((java.net.Socket) (CanvasPresentHelpers.field_b.field_f), ArchiveLoadSequence.field_f);
              var5 = ProgressMessageDialog.field_qb;
              var6 = var5;
              IterableNodeHashTable.field_g.position = 0;
              stackIn_13_0 = (param1) ? -2 : -1;
              IndexedSpriteState.field_e = stackIn_13_0;
              CredentialHelpers.field_c = stackIn_13_0;
              IntKeyLookup.field_b = stackIn_13_0;
              DigestHelpers.field_a = LoginCredentialType.field_c;
              var6.position = 0;
              AchievementNotice.writeServiceHeader(CellAnimator.field_m, IterableNodeHashTable.field_g, QuickChatCategoryCache.field_m, QuickChatMenu.field_Yb, 12);
              DateOfBirthValidator.flushPackets(-1, -1);
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = (IOException) (Object) decompiledCaughtException;
              DigestHelpers.field_a = LoginMethodHelpers.field_d;
              CanvasPresentHelpers.field_b = null;
              return true;
            }
          }
          CanvasPresentHelpers.field_b = null;
          return true;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 < 97) {
          return;
        }
        field_H = null;
    }

    final static IndexedSprite[] loadIndexedSprites(int param0, int param1, Js5Archive param2, int param3) {
        RuntimeException var4 = null;
        IndexedSprite[] stackIn_2_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1979) {
            stackIn_2_0 = (IndexedSprite[]) null;
            return stackIn_2_0;
          }
          if (PendingHighscoreRequest.decodeSpriteSheetFromArchive(param2, param3, param1, (byte) 109)) {
            return ScrollPane.createIndexedSprites((byte) 71);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("ce.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final StringBuilder appendDebugTree(Hashtable param0, byte param1, int param2, StringBuilder param3) {
        StringBuilder discarded$64 = null;
        StringBuilder discarded$65 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.beginWidgetDiagnosticVisit(param0, param2, 34, param3)) {
            this.appendWidgetDiagnosticProperties(param2, param0, (byte) 126, param3);
            this.appendChildDebugTrees(param0, param3, 8651, param2);
            discarded$64 = param3.append(" revert=").append(this.field_F);
            if (this.field_M != 2147483647 &&
              this.field_J != 2147483647) {
              discarded$65 = param3.append(" to ").append(this.field_M).append(',').append(this.field_J);
            }
          }
          if (param1 <= 118) {
            field_K = true;
          }
          stackIn_7_0 = (StringBuilder) (param3);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("ce.MA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private DraggableWidget(int param0, int param1, int param2, int param3, WidgetListener param4, UiListener param5, UiWidget param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_J = 2147483647;
        this.field_M = 2147483647;
        try {
          this.field_x = param6;
          this.field_G = param8 ? true : false;
          this.field_F = param7 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "ce.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static String getAccountNameError(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1) {
            DraggableWidget.releaseStatics((byte) -87);
          }
          stackIn_3_0 = LoginMethod.validateDisplayName(false, param1, (byte) -101);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ce.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void sendBirthDate(int param0, int param1, int param2, int param3) {
        int fieldTemp$0 = 0;
        int var4 = 0;
        int var4Lifetime1;
        FadingModalPanel.field_D.position = 0;
        if (param2 == -2) {
          FadingModalPanel.field_D.writeByte(12, 108);
          FadingModalPanel.field_D.writeInt(PopupInputHelpers.field_c.nextInt(), (byte) -42);
          FadingModalPanel.field_D.writeInt(PopupInputHelpers.field_c.nextInt(), (byte) -42);
          FadingModalPanel.field_D.writeByte(param0, 112);
          FadingModalPanel.field_D.writeByte(param1, param2 ^ -82);
          FadingModalPanel.field_D.writeShort((byte) 65, param3);
          FadingModalPanel.field_D.encryptRsa(LoginRsaKey.field_a, DisplayModeInfo.field_i, (byte) 86);
          IterableNodeHashTable.field_g.writeCipheredOpcode(18, 8);
          fieldTemp$0 = IterableNodeHashTable.field_g.position + 1;
          IterableNodeHashTable.field_g.position = IterableNodeHashTable.field_g.position + 1;
          var4 = fieldTemp$0;
          IterableNodeHashTable.field_g.writeBytes(FadingModalPanel.field_D.payload, FadingModalPanel.field_D.position, 0, (byte) -123);
          IterableNodeHashTable.field_g.backpatchByteLength(-var4 + IterableNodeHashTable.field_g.position, -1);
          return;
        }
        field_H = (String) null;
        FadingModalPanel.field_D.writeByte(12, 108);
        FadingModalPanel.field_D.writeInt(PopupInputHelpers.field_c.nextInt(), (byte) -42);
        FadingModalPanel.field_D.writeInt(PopupInputHelpers.field_c.nextInt(), (byte) -42);
        FadingModalPanel.field_D.writeByte(param0, 112);
        FadingModalPanel.field_D.writeByte(param1, param2 ^ -82);
        FadingModalPanel.field_D.writeShort((byte) 65, param3);
        FadingModalPanel.field_D.encryptRsa(LoginRsaKey.field_a, DisplayModeInfo.field_i, (byte) 86);
        IterableNodeHashTable.field_g.writeCipheredOpcode(18, 8);
        int fieldTemp$1 = IterableNodeHashTable.field_g.position + 1;
        IterableNodeHashTable.field_g.position = IterableNodeHashTable.field_g.position + 1;
        var4Lifetime1 = fieldTemp$1;
        IterableNodeHashTable.field_g.writeBytes(FadingModalPanel.field_D.payload, FadingModalPanel.field_D.position, 0, (byte) -123);
        IterableNodeHashTable.field_g.backpatchByteLength(-var4Lifetime1 + IterableNodeHashTable.field_g.position, -1);
    }

    final void refreshChildLayout(int param0) {
        super.refreshChildLayout(-78);
        this.field_x.setBounds(this.field_m, true, 0, 0, this.field_g);
        if (param0 <= -2) {
          this.field_J = this.field_u;
          this.field_M = this.field_l;
          return;
        }
    }

    final static void shutdownSession(int param0) {
        FullscreenSupport.exitFullscreen((byte) -16);
        if (UiWidget.field_v != null) {
          AccountCreationSupport.attachCanvasInput((byte) -103, UiWidget.field_v);
        }
        PopupMenuHelpers.detachKeyHandler(param0 ^ 13628);
        MouseHandlerSupport.detachMouseHandler(true);
        ClientServiceHelpers.closeArchiveConnections(0);
        if (ReportAbuseDialog.isConnected((byte) 121)) {
          IterableNodeHashTable.field_g.writeCipheredOpcode(1, 8);
          DateOfBirthValidator.flushPackets(-1, 0);
        }
        if (param0 == 13633) {
          MenuInputState.closeGameConnection(false);
          return;
        }
    }

    final void handlePointerRelease(int param0, int param1, int param2, UiWidget param3, int param4, int param5) {
        super.handlePointerRelease(param0, param1, param2, param3, param4, 108);
        if (param5 < 73) {
          return;
        }
        try {
          this.field_i = 0;
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "ce.JA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_H = "Connecting to<br>friend server...";
        field_I = 1;
        field_K = true;
    }
}
