/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PointerInputListener implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static String[] field_b;
    static int field_a;

    final static void a(byte param0) {
        ArchiveNetworkClient.movingEntities.moveAllTo(ra.availableEntities, (byte) -70);
        a.attachedEntities.moveAllTo(ra.availableEntities, (byte) -70);
        SecondaryDeque.spawnQueue.moveAllTo(ra.availableEntities, (byte) -70);
        bh.transientEntities.moveAllTo(ra.availableEntities, (byte) -70);
        kc.ticksSinceLastEntityRelease = 0;
        vf.spriteScratchRaster.setAsRasterTarget();
        SoftwareRasterizer.clearFramebuffer();
        SecondaryDeque.contactProbeRaster.setAsRasterTarget();
        SoftwareRasterizer.clearFramebuffer();
        sh.mainRasterBuffer.setAsRasterTarget(255);
        jl.avatarShockContactPending = false;
        rb.kindFourRemovalCount = 0;
        ab.boardContactStateDirty = false;
        fa.entitiesDetachedThisTick = false;
        w.avatarShockPending = false;
        wb.newAttachmentCount = 0;
        pf.field_D = false;
        re.connectivityDirty = false;
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
          callbackFailureBeforeEventDescription = (RuntimeException) (callbackFailureForContext);
          callbackMessagePrefix = new StringBuilder().append("le.mouseClicked(");
          if (event == null) {
            eventArgumentDescription = "null";
          } else {
            eventArgumentDescription = "{...}";
          }
          throw t.a((Throwable) ((Object) callbackFailureBeforeEventDescription), ((StringBuilder) (Object) callbackMessagePrefix).append(eventArgumentDescription).append(')').toString());
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent event) {
        try {
            if (pg.pointerListener != null) {
                GameplaySession.pointerIdleTicks = 0;
                lj.livePointerX = event.getX();
                eg.livePointerY = event.getY();
                fc.pointerActivityPending = true;
            }
        } catch (RuntimeException callbackFailure) {
            throw t.a((Throwable) ((Object) callbackFailure), "le.mouseEntered(" + (event != null ? "{...}" : "null") + ')');
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
            throw t.a((Throwable) ((Object) runtimeException), "le.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
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
          if (null != pg.pointerListener) {
            GameplaySession.pointerIdleTicks = 0;
            s.liveHeldPointerButton = 0;
            fc.pointerActivityPending = true;
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
          callbackFailureBeforeEventDescription = (RuntimeException) (callbackFailureForContext);
          callbackMessagePrefix = new StringBuilder().append("le.mouseReleased(");
          if (event == null) {
            eventArgumentDescription = "null";
          } else {
            eventArgumentDescription = "{...}";
          }
          throw t.a((Throwable) ((Object) callbackFailureBeforeEventDescription), ((StringBuilder) (Object) callbackMessagePrefix).append(eventArgumentDescription).append(')').toString());
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
            if (null != pg.pointerListener) {
                GameplaySession.pointerIdleTicks = 0;
                lj.livePointerX = event.getX();
                eg.livePointerY = event.getY();
                fc.pointerActivityPending = true;
            }
        } catch (RuntimeException callbackFailure) {
            throw t.a((Throwable) ((Object) callbackFailure), "le.mouseDragged(" + (event != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent event) {
        RuntimeException callbackFailureForContext = null;
        RuntimeException callbackFailureBeforeEventDescription = null;
        StringBuilder callbackMessagePrefix = null;
        String eventArgumentDescription = null;
        RuntimeException caughtCallbackFailure = null;
        try {
          if (null == pg.pointerListener) {
            return;
          }
          GameplaySession.pointerIdleTicks = 0;
          lj.livePointerX = -1;
          eg.livePointerY = -1;
          fc.pointerActivityPending = true;
          return;
        } catch (java.lang.RuntimeException callbackFailure) {
          caughtCallbackFailure = callbackFailure;
          callbackFailureForContext = caughtCallbackFailure;
          callbackFailureBeforeEventDescription = (RuntimeException) (callbackFailureForContext);
          callbackMessagePrefix = new StringBuilder().append("le.mouseExited(");
          if (event == null) {
            eventArgumentDescription = "null";
          } else {
            eventArgumentDescription = "{...}";
          }
          throw t.a((Throwable) ((Object) callbackFailureBeforeEventDescription), ((StringBuilder) (Object) callbackMessagePrefix).append(eventArgumentDescription).append(')').toString());
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
          if (pg.pointerListener != null) {
            GameplaySession.pointerIdleTicks = 0;
            ah.livePointerPressX = event.getX();
            hi.livePointerPressY = event.getY();
            oa.a(-12520);
            if (javax.swing.SwingUtilities.isRightMouseButton(event)) {
              vd.pendingPointerPressButton = 2;
              s.liveHeldPointerButton = 2;
            } else {
              vd.pendingPointerPressButton = 1;
              s.liveHeldPointerButton = 1;
            }
            eventModifiers = event.getModifiers();
            if ((8 & eventModifiers) == 0) {
            }
            if (0 != (16 & eventModifiers)) {
            }
            if (0 != (eventModifiers & 4)) {
            }
            fc.pointerActivityPending = true;
          }
          if (!event.isPopupTrigger()) {
            return;
          }
          event.consume();
          return;
        } catch (java.lang.RuntimeException callbackFailure) {
          caughtCallbackFailure = callbackFailure;
          callbackFailureForContext = caughtCallbackFailure;
          callbackFailureBeforeEventDescription = (RuntimeException) (callbackFailureForContext);
          callbackMessagePrefix = new StringBuilder().append("le.mousePressed(");
          if (event == null) {
            eventArgumentDescription = "null";
          } else {
            eventArgumentDescription = "{...}";
          }
          throw t.a((Throwable) ((Object) callbackFailureBeforeEventDescription), ((StringBuilder) (Object) callbackMessagePrefix).append(eventArgumentDescription).append(')').toString());
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent event) {
        RuntimeException callbackFailureForContext = null;
        RuntimeException callbackFailureBeforeEventDescription = null;
        StringBuilder callbackMessagePrefix = null;
        String eventArgumentDescription = null;
        RuntimeException caughtCallbackFailure = null;
        try {
          if (null == pg.pointerListener) {
            return;
          }
          s.liveHeldPointerButton = 0;
          return;
        } catch (java.lang.RuntimeException callbackFailure) {
          caughtCallbackFailure = callbackFailure;
          callbackFailureForContext = caughtCallbackFailure;
          callbackFailureBeforeEventDescription = (RuntimeException) (callbackFailureForContext);
          callbackMessagePrefix = new StringBuilder().append("le.focusLost(");
          if (event == null) {
            eventArgumentDescription = "null";
          } else {
            eventArgumentDescription = "{...}";
          }
          throw t.a((Throwable) ((Object) callbackFailureBeforeEventDescription), ((StringBuilder) (Object) callbackMessagePrefix).append(eventArgumentDescription).append(')').toString());
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent event) {
        RuntimeException callbackFailureForContext = null;
        RuntimeException callbackFailureBeforeEventDescription = null;
        StringBuilder callbackMessagePrefix = null;
        String eventArgumentDescription = null;
        RuntimeException caughtCallbackFailure = null;
        try {
          if (null == pg.pointerListener) {
            return;
          }
          GameplaySession.pointerIdleTicks = 0;
          lj.livePointerX = event.getX();
          eg.livePointerY = event.getY();
          fc.pointerActivityPending = true;
          return;
        } catch (java.lang.RuntimeException callbackFailure) {
          caughtCallbackFailure = callbackFailure;
          callbackFailureForContext = caughtCallbackFailure;
          callbackFailureBeforeEventDescription = (RuntimeException) (callbackFailureForContext);
          callbackMessagePrefix = new StringBuilder().append("le.mouseMoved(");
          if (event == null) {
            eventArgumentDescription = "null";
          } else {
            eventArgumentDescription = "{...}";
          }
          throw t.a((Throwable) ((Object) callbackFailureBeforeEventDescription), ((StringBuilder) (Object) callbackMessagePrefix).append(eventArgumentDescription).append(')').toString());
        }
    }

    static {
        field_b = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_a = 1;
    }
}
