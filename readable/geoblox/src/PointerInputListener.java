/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PointerInputListener implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static String[] field_b;
    static int field_a;

    final static void a(byte param0) {
        ArchiveNetworkClient.movingEntities.moveAllTo(SecondaryNodeDeque.availableEntities, (byte) -70);
        BoardEntityState.attachedEntities.moveAllTo(SecondaryNodeDeque.availableEntities, (byte) -70);
        SecondaryDeque.spawnQueue.moveAllTo(SecondaryNodeDeque.availableEntities, (byte) -70);
        DelegatingCanvas.transientEntities.moveAllTo(SecondaryNodeDeque.availableEntities, (byte) -70);
        BoardReconciliationSupport.ticksSinceLastEntityRelease = 0;
        HotspotTextWidget.spriteScratchRaster.setAsRasterTarget();
        SoftwareRasterizer.clearFramebuffer();
        SecondaryDeque.contactProbeRaster.setAsRasterTarget();
        SoftwareRasterizer.clearFramebuffer();
        SingleChildWidget.mainRasterBuffer.setAsRasterTarget(255);
        Bzip2DecoderState.avatarShockContactPending = false;
        FontLoadingSupport.kindFourRemovalCount = 0;
        EntityMotionSupport.boardContactStateDirty = false;
        MessageDialogSupport.entitiesDetachedThisTick = false;
        SessionSocketSupport.avatarShockPending = false;
        AttachmentPointerState.newAttachmentCount = 0;
        LoginPanel.endingEntityScanClear = false;
        RankedListQuery.connectivityDirty = false;
        if (param0 != -39) {
            PointerInputListener.a((byte) 97);
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent event) {
        RuntimeException callbackFailureForContext = null;
        RuntimeException callbackFailureBeforeEventDescription = null;
        StringBuilder callbackMessagePrefix = null;
        String eventArgumentDescription = null;
        RuntimeException caughtCallbackFailure = null;
        try {
          if (!event.isPopupTrigger()) {
            return;
          }
          event.consume();
          return;
        } catch (java.lang.RuntimeException callbackFailure) {
          caughtCallbackFailure = callbackFailure;
          callbackFailureForContext = caughtCallbackFailure;
          callbackFailureBeforeEventDescription = callbackFailureForContext;
          callbackMessagePrefix = new StringBuilder().append("le.mouseClicked(");
          if (event == null) {
            eventArgumentDescription = "null";
          } else {
            eventArgumentDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) callbackFailureBeforeEventDescription), ((StringBuilder) (Object) callbackMessagePrefix).append(eventArgumentDescription).append(')').toString());
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent event) {
        try {
            if (GameplaySetupSupport.pointerListener != null) {
                GameplaySession.pointerIdleTicks = 0;
                PointerMenuState.livePointerX = event.getX();
                ReflectionCheckRequest.livePointerY = event.getY();
                EndingAnimationSupport.pointerActivityPending = true;
            }
        } catch (RuntimeException callbackFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) callbackFailure), "le.mouseEntered(" + (event != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(IntrusiveNode param0, int param1, IntrusiveNode param2) {
        try {
            if (!(null == param2.previousNode)) {
                param2.unlinkNode(false);
            }
            if (param1 < 80) {
                field_b = (String[]) null;
            }
            param2.previousNode = param0.previousNode;
            param2.nextNode = param0;
            param2.previousNode.nextNode = param2;
            param2.nextNode.previousNode = param2;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "le.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent unusedFocusEvent) {
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent event) {
        int eventModifiers = 0;
        RuntimeException callbackFailureForContext = null;
        RuntimeException callbackFailureBeforeEventDescription = null;
        StringBuilder callbackMessagePrefix = null;
        String eventArgumentDescription = null;
        RuntimeException caughtCallbackFailure = null;
        try {
          if (null != GameplaySetupSupport.pointerListener) {
            GameplaySession.pointerIdleTicks = 0;
            Under13TermsPanel.liveHeldPointerButton = 0;
            EndingAnimationSupport.pointerActivityPending = true;
            eventModifiers = event.getModifiers();
            if (0 == (eventModifiers & 4)) {
            }
            if ((16 & eventModifiers) == 0) {
            }
            if (0 == (8 & eventModifiers)) {
            }
          }
          if (!event.isPopupTrigger()) {
            return;
          }
          event.consume();
          return;
        } catch (java.lang.RuntimeException callbackFailure) {
          caughtCallbackFailure = callbackFailure;
          callbackFailureForContext = caughtCallbackFailure;
          callbackFailureBeforeEventDescription = callbackFailureForContext;
          callbackMessagePrefix = new StringBuilder().append("le.mouseReleased(");
          if (event == null) {
            eventArgumentDescription = "null";
          } else {
            eventArgumentDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) callbackFailureBeforeEventDescription), ((StringBuilder) (Object) callbackMessagePrefix).append(eventArgumentDescription).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != -29313) {
            return;
        }
        field_b = null;
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent event) {
        try {
            if (null != GameplaySetupSupport.pointerListener) {
                GameplaySession.pointerIdleTicks = 0;
                PointerMenuState.livePointerX = event.getX();
                ReflectionCheckRequest.livePointerY = event.getY();
                EndingAnimationSupport.pointerActivityPending = true;
            }
        } catch (RuntimeException callbackFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) callbackFailure), "le.mouseDragged(" + (event != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent event) {
        RuntimeException callbackFailureForContext = null;
        RuntimeException callbackFailureBeforeEventDescription = null;
        StringBuilder callbackMessagePrefix = null;
        String eventArgumentDescription = null;
        RuntimeException caughtCallbackFailure = null;
        try {
          if (null == GameplaySetupSupport.pointerListener) {
            return;
          }
          GameplaySession.pointerIdleTicks = 0;
          PointerMenuState.livePointerX = -1;
          ReflectionCheckRequest.livePointerY = -1;
          EndingAnimationSupport.pointerActivityPending = true;
          return;
        } catch (java.lang.RuntimeException callbackFailure) {
          caughtCallbackFailure = callbackFailure;
          callbackFailureForContext = caughtCallbackFailure;
          callbackFailureBeforeEventDescription = callbackFailureForContext;
          callbackMessagePrefix = new StringBuilder().append("le.mouseExited(");
          if (event == null) {
            eventArgumentDescription = "null";
          } else {
            eventArgumentDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) callbackFailureBeforeEventDescription), ((StringBuilder) (Object) callbackMessagePrefix).append(eventArgumentDescription).append(')').toString());
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent event) {
        int eventModifiers = 0;
        RuntimeException callbackFailureForContext = null;
        RuntimeException callbackFailureBeforeEventDescription = null;
        StringBuilder callbackMessagePrefix = null;
        String eventArgumentDescription = null;
        RuntimeException caughtCallbackFailure = null;
        try {
          if (GameplaySetupSupport.pointerListener != null) {
            GameplaySession.pointerIdleTicks = 0;
            TextWidgetSupport.livePointerPressX = event.getX();
            DisplayNamePanel.livePointerPressY = event.getY();
            ClientClockSupport.correctedCurrentTimeMillis(-12520);
            if (javax.swing.SwingUtilities.isRightMouseButton(event)) {
              ClientSessionSnapshot.pendingPointerPressButton = 2;
              Under13TermsPanel.liveHeldPointerButton = 2;
            } else {
              ClientSessionSnapshot.pendingPointerPressButton = 1;
              Under13TermsPanel.liveHeldPointerButton = 1;
            }
            eventModifiers = event.getModifiers();
            if ((8 & eventModifiers) == 0) {
            }
            if (0 != (16 & eventModifiers)) {
            }
            if (0 != (eventModifiers & 4)) {
            }
            EndingAnimationSupport.pointerActivityPending = true;
          }
          if (!event.isPopupTrigger()) {
            return;
          }
          event.consume();
          return;
        } catch (java.lang.RuntimeException callbackFailure) {
          caughtCallbackFailure = callbackFailure;
          callbackFailureForContext = caughtCallbackFailure;
          callbackFailureBeforeEventDescription = callbackFailureForContext;
          callbackMessagePrefix = new StringBuilder().append("le.mousePressed(");
          if (event == null) {
            eventArgumentDescription = "null";
          } else {
            eventArgumentDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) callbackFailureBeforeEventDescription), ((StringBuilder) (Object) callbackMessagePrefix).append(eventArgumentDescription).append(')').toString());
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent event) {
        RuntimeException callbackFailureForContext = null;
        RuntimeException callbackFailureBeforeEventDescription = null;
        StringBuilder callbackMessagePrefix = null;
        String eventArgumentDescription = null;
        RuntimeException caughtCallbackFailure = null;
        try {
          if (null == GameplaySetupSupport.pointerListener) {
            return;
          }
          Under13TermsPanel.liveHeldPointerButton = 0;
          return;
        } catch (java.lang.RuntimeException callbackFailure) {
          caughtCallbackFailure = callbackFailure;
          callbackFailureForContext = caughtCallbackFailure;
          callbackFailureBeforeEventDescription = callbackFailureForContext;
          callbackMessagePrefix = new StringBuilder().append("le.focusLost(");
          if (event == null) {
            eventArgumentDescription = "null";
          } else {
            eventArgumentDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) callbackFailureBeforeEventDescription), ((StringBuilder) (Object) callbackMessagePrefix).append(eventArgumentDescription).append(')').toString());
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent event) {
        RuntimeException callbackFailureForContext = null;
        RuntimeException callbackFailureBeforeEventDescription = null;
        StringBuilder callbackMessagePrefix = null;
        String eventArgumentDescription = null;
        RuntimeException caughtCallbackFailure = null;
        try {
          if (null == GameplaySetupSupport.pointerListener) {
            return;
          }
          GameplaySession.pointerIdleTicks = 0;
          PointerMenuState.livePointerX = event.getX();
          ReflectionCheckRequest.livePointerY = event.getY();
          EndingAnimationSupport.pointerActivityPending = true;
          return;
        } catch (java.lang.RuntimeException callbackFailure) {
          caughtCallbackFailure = callbackFailure;
          callbackFailureForContext = caughtCallbackFailure;
          callbackFailureBeforeEventDescription = callbackFailureForContext;
          callbackMessagePrefix = new StringBuilder().append("le.mouseMoved(");
          if (event == null) {
            eventArgumentDescription = "null";
          } else {
            eventArgumentDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) callbackFailureBeforeEventDescription), ((StringBuilder) (Object) callbackMessagePrefix).append(eventArgumentDescription).append(')').toString());
        }
    }

    static {
        field_b = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_a = 1;
    }
}
