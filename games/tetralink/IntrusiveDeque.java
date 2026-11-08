/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveDeque {
    static UiComponent field_e;
    static QuickChatCommandType field_d;
    static int[] field_b;
    IntrusiveNode sentinel;
    static int field_f;
    private IntrusiveNode current;
    static String field_g;
    static int[] field_h;

    final void clear(int param0) {
        IntrusiveNode var2;
        int var3;
        var3 = TetraLink.field_J;
        while (true) {
          var2 = this.sentinel.next;
          if (var2 != this.sentinel) {
            var2.unlink(false);
            continue;
          }
          break;
        }
        this.current = null;
        if (param0 != 1) {
          field_h = (int[]) null;
        }
        return;
    }

    final IntrusiveNode startBackwardFrom(byte param0, IntrusiveNode param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_6_0 = null;
        IntrusiveNode stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null) {
            var3 = param1;
          } else {
            var3 = this.sentinel.next;
          }
          if (this.sentinel == var3) {
            this.current = null;
            stackIn_6_0 = null;
            return (IntrusiveNode) (stackIn_6_0);
          }
          if (param0 != -10) {
            field_g = (String) null;
          }
          this.current = var3.next;
          stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("je.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final IntrusiveNode next(byte param0) {
        IntrusiveNode var2 = this.current;
        if (this.sentinel == var2) {
          this.current = null;
          return null;
        }
        this.current = var2.next;
        if (param0 != -70) {
          IntrusiveNode var3 = (IntrusiveNode) null;
          this.addFirst((IntrusiveNode) null, -40);
        }
        return var2;
    }

    final IntrusiveNode last(boolean param0) {
        if (!param0) {
          field_b = (int[]) null;
        }
        IntrusiveNode var2 = this.sentinel.previous;
        if (this.sentinel == var2) {
          this.current = null;
          return null;
        }
        this.current = var2.previous;
        return var2;
    }

    final IntrusiveNode removeLast(byte param0) {
        if (param0 < 123) {
          field_g = (String) null;
        }
        IntrusiveNode var2 = this.sentinel.previous;
        if (var2 == this.sentinel) {
          return null;
        }
        var2.unlink(false);
        return var2;
    }

    final IntrusiveNode first(boolean param0) {
        if (param0) {
          IntrusiveNode var3 = (IntrusiveNode) null;
          this.addFirst((IntrusiveNode) null, 0);
        }
        IntrusiveNode var2 = this.sentinel.next;
        if (this.sentinel == var2) {
          this.current = null;
          return null;
        }
        this.current = var2.next;
        return var2;
    }

    final boolean isEmpty(boolean param0) {
        if (!param0) {
          IntrusiveDeque.snapshotKeyState(-87);
        }
        return this.sentinel == this.sentinel.next ? true : false;
    }

    final static void writeSessionHeader(int param0, int param1, PacketBuffer param2, int param3, int param4) {
        param2.writeByte(12, false);
        param2.writeShort(17, false);
        param2.writeShort(param1, false);
        param2.writeShort(param4, false);
        if (param0 >= -32) {
          return;
        }
        try {
          param2.writeByte(param3, false);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "je.I(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_g = null;
        field_b = null;
        field_e = null;
        field_h = null;
        field_d = null;
        int var1 = -31 % ((param0 + 60) / 59);
    }

    final IntrusiveNode previous(byte param0) {
        IntrusiveNode var2 = this.current;
        if (var2 == this.sentinel) {
          this.current = null;
          return null;
        }
        this.current = var2.previous;
        if (param0 != 14) {
          this.isEmpty(true);
        }
        return var2;
    }

    final static void snapshotKeyState(int param0) {
        Object var1 = null;
        int var2 = 0;
        int var4 = 0;
        PacketBuffer var5 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        int var6 = 0;
        var4 = TetraLink.field_J;
        try {
          var1 = LoadingStatusHelpers.field_a;
          synchronized (var1) {
            LruTextureCache.field_m = MenuReturnHelpers.field_e;
            if (param0 != 13397) {
              var5 = (PacketBuffer) null;
              IntrusiveDeque.writeSessionHeader(15, 10, (PacketBuffer) null, 22, 69);
            }
            WidgetTheme.field_c = WidgetTheme.field_c + 1;
            if (GameRoomPanelHelpers.field_b < 0) {
              var6 = 0;
              var2 = var6;
              while (var6 < 112) {
                ErrorPrintHelpers.field_a[var6] = false;
                var6++;
              }
              GameRoomPanelHelpers.field_b = MenuThemeHelpers.field_d;
            } else {
              while (MenuThemeHelpers.field_d != GameRoomPanelHelpers.field_b) {
                var2 = Archive.field_g[MenuThemeHelpers.field_d];
                MenuThemeHelpers.field_d = 127 & 1 + MenuThemeHelpers.field_d;
                if (var2 < 0) {
                  ErrorPrintHelpers.field_a[~var2] = false;
                  continue;
                }
                ErrorPrintHelpers.field_a[var2] = true;
              }
            }
            MenuReturnHelpers.field_e = QueuedStatSubmission.field_n;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) var1_ref), "je.C(" + param0 + ')');
        }
    }

    final void addLast(IntrusiveNode param0, boolean param1) {
        try {
          if (null != param0.previous) {
            param0.unlink(false);
          }
          if (param1) {
            this.previous((byte) 106);
          }
          param0.next = this.sentinel;
          param0.previous = this.sentinel.previous;
          param0.previous.next = param0;
          param0.next.previous = param0;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "je.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final IntrusiveNode removeFirst(boolean param0) {
        IntrusiveNode var2 = this.sentinel.next;
        if (var2 == this.sentinel) {
          return null;
        }
        var2.unlink(param0);
        return var2;
    }

    final static void showMessageMenu(boolean param0, int param1, String param2, boolean param3, int param4) {
        String stackIn_4_0 = null;
        boolean stackIn_26_0 = false;
        int stackIn_39_0 = 0;
        int stackIn_40_1 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var7Lifetime1;
        int var9Lifetime1;
        int var8Lifetime1;
        int var8Lifetime2;
        var10 = TetraLink.field_J;
        try {
          AnimationPlayer.field_g = true;
          FullscreenCanvasHelpers.field_q = param1;
          var11 = param2;
          if (!param0) {
            stackIn_4_0 = LoadingProgressDialog.field_X;
          } else {
            stackIn_4_0 = UiComponent.field_ub;
          }
          var6 = stackIn_4_0;
          if (FullscreenCanvasHelpers.field_q == 0) {
            var7 = ArchiveIndex.wrapBalancedText(480, 118, var11, FontAndFrameStyleHelpers.field_d, PointerTrailBubble.field_u);
            var8 = 3 + var7;
            ArchiveProvider.field_b = new String[var8];
            PendingMove.field_c = new int[var8];
            for (var9 = 0; var8 > var9; var9++) {
              PendingMove.field_c[var9] = -1;
            }
            QuickChatPhraseDefinition.field_x = new int[2];
            for (var9 = 0; var9 < var7; var9++) {
              ArchiveProvider.field_b[var9] = FontAndFrameStyleHelpers.field_d[var9];
            }
            ArchiveProvider.field_b[var8 - 3] = "";
            ArchiveProvider.field_b[-2 + var8] = var6;
            PendingMove.field_c[var8 - 2] = 0;
            QuickChatPhraseDefinition.field_x[0] = 1;
            ArchiveProvider.field_b[var8 - 1] = DebouncedValidator.field_a;
            PendingMove.field_c[var8 - 1] = 1;
            QuickChatPhraseDefinition.field_x[1] = 2;
          } else {
            if (1 != FullscreenCanvasHelpers.field_q) {
              throw new IllegalArgumentException();
            }
            var7 = ArchiveIndex.wrapBalancedText(480, 108, var11, FontAndFrameStyleHelpers.field_d, PointerTrailBubble.field_u);
            var8 = 2 + var7;
            PendingMove.field_c = new int[var8];
            ArchiveProvider.field_b = new String[var8];
            for (var9 = 0; var8 > var9; var9++) {
              PendingMove.field_c[var9] = -1;
            }
            QuickChatPhraseDefinition.field_x = new int[1];
            for (var9 = 0; var7 > var9; var9++) {
              ArchiveProvider.field_b[var9] = FontAndFrameStyleHelpers.field_d[var9];
            }
            ArchiveProvider.field_b[var8 - 2] = "";
            ArchiveProvider.field_b[var8 - 1] = DebouncedValidator.field_a;
            PendingMove.field_c[var8 - 1] = 0;
            QuickChatPhraseDefinition.field_x[0] = 2;
          }
          ConditionalTextValue.field_a.field_g = QuickChatPhraseDefinition.field_x.length;
          var7Lifetime1 = 0;
          for (var8Lifetime1 = 0; ArchiveProvider.field_b.length > var8Lifetime1; var8Lifetime1++) {
            stackIn_26_0 = !(PendingMove.field_c[var8Lifetime1] < 0);
            var9Lifetime1 = ServerConnectionHelpers.measureText(stackIn_26_0, 1, ArchiveProvider.field_b[var8Lifetime1]);
            if (-1 != PendingMove.field_c[var8Lifetime1]) {
              var9Lifetime1 = var9Lifetime1 + 2 * ChatReceiveHelpers.field_a;
            }
            if (var9Lifetime1 > var7Lifetime1) {
              var7Lifetime1 = var9Lifetime1;
            }
          }
          if (param4 != -1381732671) {
            field_e = (UiComponent) null;
          }
          ArchiveProvider.field_a = (PacketDiagnosticsHelpers.field_q + MenuLabelGlobals.field_e << 1) * ConditionalTextValue.field_a.field_g;
          TextureCache.field_j = IconLabelItem.field_Nb - (var7Lifetime1 >> 1);
          EmailAvailabilityValidator.field_q = -(var7Lifetime1 >> 1) + (var7Lifetime1 + IconLabelItem.field_Nb);
          for (var8Lifetime2 = 0; var8Lifetime2 < ArchiveProvider.field_b.length; var8Lifetime2++) {
            stackIn_39_0 = ArchiveProvider.field_a;
            if (PendingMove.field_c[var8Lifetime2] < 0) {
              stackIn_40_1 = UiComponent.field_wb;
            } else {
              stackIn_40_1 = ViewportController.field_n;
            }
            ArchiveProvider.field_a = stackIn_39_0 + stackIn_40_1;
          }
          ValidationStatusIcon.field_Q = -(ArchiveProvider.field_a >> 1) + HotspotTextWidget.field_S;
          ConditionalTextValue.field_a.initializeSelection(ArchiveFactoryHelpers.findMenuOptionAt(ContextMenu.field_Nb, ClientProtocolStage.field_a, 126), 0, param3, -98);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_45_0 = var5;
          stackIn_45_1 = new StringBuilder().append("je.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void addFirst(IntrusiveNode param0, int param1) {
        try {
          if (null != param0.previous) {
            param0.unlink(false);
          }
          param0.previous = this.sentinel;
          param0.next = this.sentinel.next;
          param0.previous.next = param0;
          int var3_int = -56 / ((param1 - 37) / 58);
          param0.next.previous = param0;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "je.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public IntrusiveDeque() {
        this.sentinel = new IntrusiveNode();
        this.sentinel.previous = this.sentinel;
        this.sentinel.next = this.sentinel;
    }

    static {
        field_b = new int[256];
        field_d = new QuickChatCommandType(14, 0, 4, 1);
        field_g = "Data server full or too many connections from your address. Please try again in a few minutes.";
    }
}
