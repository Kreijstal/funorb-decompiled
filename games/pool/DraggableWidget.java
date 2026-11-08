/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class DraggableWidget extends SingleChildWidget {
    private int grabOffsetY;
    private boolean childPressTakesPriority;
    private int layoutTargetX;
    static int field_T;
    private int layoutTargetY;
    static String playerYouFirstListHaveResigned;
    static int field_V;
    private int grabOffsetX;
    private boolean easeToLayoutPosition;
    static String[] field_S;

    final static void a(int param0, boolean param1) {
        if (NodeHashTableIterator.field_a > 0 &&
          LoginPayloadKind.field_d) {
          SoftwareRasterizer.darkenRectangle(0, 0, SoftwareRasterizer.width, IntLookupQuery.field_q.screenY);
          ModelOriginSupport.field_q.drawRoot((byte) -79, param1);
        }
        if (PoolMatchController.field_z > 0) {
          if (AccountWelcomePanel.field_bb) {
            SoftwareRasterizer.darkenRectangle(0, 0, SoftwareRasterizer.width, IntLookupQuery.field_q.screenY);
            DebugTuningSupport.field_b.drawRoot((byte) -79, param1);
          }
        } else {
          if (LogoMaterial.field_b > 0 &&
            AccountWelcomePanel.field_bb) {
            SoftwareRasterizer.darkenRectangle(0, 0, SoftwareRasterizer.width, IntLookupQuery.field_q.screenY);
            DebugTuningSupport.field_b.drawRoot((byte) -79, param1);
          }
        }
        if (param0 < -42) {
          return;
        }
        DraggableWidget.releaseStatics(-57);
    }

    final void refreshChildLayout(byte param0) {
        super.refreshChildLayout(param0);
        this.child.setWidgetBounds(this.widgetWidth, 0, this.widgetHeight, false, 0);
        this.layoutTargetY = this.widgetY;
        this.layoutTargetX = this.widgetX;
    }

    final static void initializeChatHistory(int capacity, int obfuscationGuard) {
        QuickChatPhraseDefinition.field_E = capacity;
        MusicPatch.field_l = new int[3];
        RankingsProtocolSupport.field_e = new ChatMessage[capacity * 15];
        IntrusiveDequeCursor.field_e = 0;
        if (obfuscationGuard > -43) {
          field_V = 16;
        }
    }

    final StringBuilder appendWidgetDiagnostics(StringBuilder param0, int param1, Hashtable param2, int param3) {
        StringBuilder discarded$62 = null;
        StringBuilder discarded$63 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 < 13) {
            playerYouFirstListHaveResigned = (String) null;
          }
          if (this.beginWidgetDiagnosticVisit(param1, param2, param0, -1)) {
            this.appendWidgetDiagnosticProperties(1, param2, param0, param1);
            this.appendChildDiagnostics(param2, 3, param0, param1);
            discarded$62 = param0.append(" revert=").append(this.easeToLayoutPosition);
            if (this.layoutTargetX != 2147483647 &&
              this.layoutTargetY != 2147483647) {
              discarded$63 = param0.append(" to ").append(this.layoutTargetX).append(',').append(this.layoutTargetY);
            }
          }
          stackIn_8_0 = (StringBuilder) (param0);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("wj.EA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_S = null;
        playerYouFirstListHaveResigned = null;
        if (param0 >= -33) {
          PcmStreamMixer var2 = (PcmStreamMixer) null;
          DraggableWidget.a((ResourceArchive) null, 96, false, (PcmStreamMixer) null);
        }
    }

    final void handlePointerRelease(int param0, int param1, int param2, int param3, byte param4, UiWidget param5) {
        if (param4 < 62) {
          return;
        }
        try {
          super.handlePointerRelease(param0, param1, param2, param3, (byte) 124, param5);
          this.pressedPointerButton = 0;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "wj.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    private DraggableWidget(int param0, int param1, int param2, int param3, WidgetPainter param4, WidgetListener param5, UiWidget param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.layoutTargetX = 2147483647;
        this.layoutTargetY = 2147483647;
        try {
          this.child = param6;
          this.childPressTakesPriority = param8 ? true : false;
          this.easeToLayoutPosition = param7 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "wj.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static void a(ResourceArchive param0, int param1, boolean param2, PcmStreamMixer param3) {
        try {
          ProjectedLineSupport.field_h = param1 * CachedArchiveSource.getTargetFramesPerSecond(-21282) / 1000;
          if (param2) {
            field_S = (String[]) null;
          }
          LogoJingleLoader.loadLogoJingle(param0, 102);
          HighScoreSubmission.loadLogoModel(param0, (byte) -106);
          LogoFinalFrameLoader.loadFinalFrame((byte) -65, param0);
          MessageDialogContent.a(-257);
          SpaceBallSkin.buildBlurredIntroSprite(23);
          LobbyPlayer.field_fc = 0 - ProjectedLineSupport.field_h;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "wj.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean handlePointerPress(UiWidget param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = super.handlePointerPress(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
          if (var8_int != 0 &&
            this.childPressTakesPriority) {
            return true;
          }
          if (!this.containsPointer(param1, param5, param6, -1, param4)) {
            stackIn_5_0 = var8_int;
            return stackIn_5_0 != 0;
          }
          this.pressedPointerButton = param3;
          if (param3 != 1) {
            return true;
          }
          this.grabOffsetY = -param5 - this.widgetY + param4;
          this.grabOffsetX = -param1 + (param6 - this.widgetX);
          PasswordValidator.field_u = this;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_14_0 = var8;
          stackIn_14_1 = new StringBuilder().append("wj.AA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void updatePointerState(UiWidget param0, int param1, int param2, int param3) {
        int stackIn_15_1 = 0;
        int stackIn_18_2 = 0;
        int stackIn_23_1 = 0;
        int stackIn_26_2 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          if ((!(this.child instanceof ButtonWidget) ||
            ((ButtonWidget) (this.child)).enabled) &&
            this.pressedPointerButton == 1) {
            var5_int = -this.grabOffsetX + ReflectionReplySupport.field_i - param2;
            var6 = DebouncedValidationProvider.field_f - this.grabOffsetY - param3;
            if (var5_int != this.widgetX ||
              this.widgetY != var6) {
              this.widgetY = var6;
              this.widgetX = var5_int;
              if (this.listener instanceof DragMovementListener) {
                ((DragMovementListener) (this.listener)).onDragMoved(this, (byte) 81, param3, param2);
              }
            }
          } else {
            if (this.easeToLayoutPosition) {
              if (this.layoutTargetX != this.widgetX) {
                var5_int = -this.widgetX + this.layoutTargetX;
                stackIn_15_1 = this.widgetX;
                if (Math.abs(var5_int) <= 2) {
                  if (0 < var5_int) {
                    stackIn_18_2 = 1;
                  } else {
                    stackIn_18_2 = -1;
                  }
                } else {
                  stackIn_18_2 = var5_int >> 1;
                }
                this.widgetX = stackIn_15_1 + stackIn_18_2;
              }
              if (this.layoutTargetY != this.widgetY) {
                var5_int = -this.widgetY + this.layoutTargetY;
                stackIn_23_1 = this.widgetY;
                if (Math.abs(var5_int) <= 2) {
                  if (var5_int <= 0) {
                    stackIn_26_2 = -1;
                  } else {
                    stackIn_26_2 = 1;
                  }
                } else {
                  stackIn_26_2 = var5_int >> 1;
                }
                this.widgetY = stackIn_23_1 + stackIn_26_2;
              }
            }
          }
          if (param1 != 958) {
            return;
          }
          super.updatePointerState(param0, param1 + 0, param2, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_33_0 = var5;
          stackIn_33_1 = new StringBuilder().append("wj.S(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean isQuickChatOverlayOpen(int obfuscationGuard) {
        if (obfuscationGuard != -1) {
          field_S = (String[]) null;
          if (null == CollisionContact.field_f) {
            return ArrayWidgetGroup.field_H ? true : false;
          }
          return true;
        }
        if (null != CollisionContact.field_f) {
          return true;
        }
        if (!ArrayWidgetGroup.field_H) {
          return false;
        }
        return true;
    }

    static {
        playerYouFirstListHaveResigned = "You<%0> have all resigned!";
    }
}
