/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PointerInputHandler implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static cr field_a;
    static aj field_f;
    static String field_e;
    static ScrollContainer contextMenuScrollContainer;
    static String field_d;
    static String field_c;

    public final synchronized void mouseExited(java.awt.event.MouseEvent event) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (BattleCharacter.pointerInputHandler == null) {
            return;
          }
          av.pointerIdleTicks = 0;
          DiskCacheRequest.livePointerX = -1;
          ResourceArchive.livePointerY = -1;
          DropTargetWidgetContainer.pointerChanged = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("pq.mouseExited(");
          if (event == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void writeRoomAdmissionCancellation(int obfuscationGuard, int roomId, int packetOpcode) {
        CipherPacketBuffer var3 = EmailValidator.outgoingPacket;
        var3.writeCipheredOpcode(32161, packetOpcode);
        var3.writeByte(1, 3);
        int var4 = -78 % ((obfuscationGuard - 10) / 46);
        var3.writeByte(1, 9);
        var3.writeShort(true, roomId);
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent event) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (BattleCharacter.pointerInputHandler != null) {
            av.pointerIdleTicks = 0;
            QuickChatMenu.lastPointerPressX = event.getX();
            BoundedFile.lastPointerPressY = event.getY();
            vi.monotonicMillis(-112);
            if (javax.swing.SwingUtilities.isRightMouseButton(event)) {
              ArchiveIndex.pressedPointerButton = 2;
              GridWidgetContainer.heldPointerButton = 2;
            } else {
              ArchiveIndex.pressedPointerButton = 1;
              GridWidgetContainer.heldPointerButton = 1;
            }
            var2_int = event.getModifiers();
            if ((var2_int & 16) != 0) {
              EffectPresentation.livePointerButtonMask = EffectPresentation.livePointerButtonMask | 1;
            }
            if ((var2_int & 8) != 0) {
              EffectPresentation.livePointerButtonMask = EffectPresentation.livePointerButtonMask | 2;
            }
            if ((4 & var2_int) != 0) {
              EffectPresentation.livePointerButtonMask = EffectPresentation.livePointerButtonMask | 4;
            }
            DropTargetWidgetContainer.pointerChanged = true;
          }
          if (!event.isPopupTrigger()) {
            return;
          }
          event.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("pq.mousePressed(");
          if (event == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent event) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (BattleCharacter.pointerInputHandler == null) {
            return;
          }
          av.pointerIdleTicks = 0;
          DiskCacheRequest.livePointerX = event.getX();
          ResourceArchive.livePointerY = event.getY();
          DropTargetWidgetContainer.pointerChanged = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("pq.mouseMoved(");
          if (event == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent event) {
        try {
          if (event.isPopupTrigger()) {
            event.consume();
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "pq.mouseClicked(" + (event != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        if (param0 == 4) {
          PaletteRegionMap.field_g.advance(-99);
          ug.field_b = ug.field_b + 1;
          return;
        }
        field_a = (cr) null;
        PaletteRegionMap.field_g.advance(-99);
        ug.field_b = ug.field_b + 1;
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent event) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (BattleCharacter.pointerInputHandler == null) {
            return;
          }
          av.pointerIdleTicks = 0;
          DiskCacheRequest.livePointerX = event.getX();
          ResourceArchive.livePointerY = event.getY();
          DropTargetWidgetContainer.pointerChanged = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("pq.mouseDragged(");
          if (event == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final void focusGained(java.awt.event.FocusEvent event) {
    }

    public static void a(byte param0) {
        if (param0 != -79) {
          return;
        }
        field_e = null;
        field_f = null;
        field_c = null;
        contextMenuScrollContainer = null;
        field_d = null;
        field_a = null;
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent event) {
        try {
          if (BattleCharacter.pointerInputHandler != null) {
            av.pointerIdleTicks = 0;
            DiskCacheRequest.livePointerX = event.getX();
            ResourceArchive.livePointerY = event.getY();
            DropTargetWidgetContainer.pointerChanged = true;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "pq.mouseEntered(" + (event != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent event) {
        try {
          if (BattleCharacter.pointerInputHandler != null) {
            GridWidgetContainer.heldPointerButton = 0;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "pq.focusLost(" + (event != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent event) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != BattleCharacter.pointerInputHandler) {
            av.pointerIdleTicks = 0;
            GridWidgetContainer.heldPointerButton = 0;
            DropTargetWidgetContainer.pointerChanged = true;
            var2_int = event.getModifiers();
            if ((var2_int & 16) != 0) {
              EffectPresentation.livePointerButtonMask = EffectPresentation.livePointerButtonMask & -2;
            }
            if ((var2_int & 8) != 0) {
              EffectPresentation.livePointerButtonMask = EffectPresentation.livePointerButtonMask & -3;
            }
            if ((var2_int & 4) != 0) {
              EffectPresentation.livePointerButtonMask = EffectPresentation.livePointerButtonMask & -5;
            }
          }
          if (!event.isPopupTrigger()) {
            return;
          }
          event.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("pq.mouseReleased(");
          if (event == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_c = "<%0> level <%1>";
        field_e = "Toggle chat";
        field_f = null;
        field_d = "Instructions";
    }
}
