/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh {
    static DraggableWidget activeDragWidget;
    static boolean field_d;
    static String nextText;
    static String createAccountSuccessText;

    final static void updatePendingActionPanel(int methodGuard) {
        int holdTicksBeforeIncrement = 0;
        int panelTopBeforeIncrement = 0;
        int holdTicksBeforeInvalidGuardIncrement = 0;
        int panelTopBeforeInvalidGuardIncrement = 0;
        int panelPhase;
        int unusedClientControlSnapshot;
        unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        if (methodGuard <= -78) {
          if (null != ArchiveRequest.pendingActionMarkers.firstForIteration(0)) {
            panelPhase = kj.pendingActionPanelPhase;
            if (panelPhase == 0) {
              eh.pendingActionPanelTop = eh.pendingActionPanelTop - 1;
              if (eh.pendingActionPanelTop <= -10 - (tl.pendingActionPanelHeight - 480)) {
                h.pendingActionPanelHoldTicks = 0;
                kj.pendingActionPanelPhase = 1;
                return;
              }
            } else {
              if (panelPhase == 1) {
                holdTicksBeforeIncrement = h.pendingActionPanelHoldTicks;
                h.pendingActionPanelHoldTicks = h.pendingActionPanelHoldTicks + 1;
                if (holdTicksBeforeIncrement <= 450) {
                  return;
                }
                kj.pendingActionPanelPhase = 2;
                return;
              }
              if (panelPhase == 2) {
                panelTopBeforeIncrement = eh.pendingActionPanelTop;
                eh.pendingActionPanelTop = eh.pendingActionPanelTop + 1;
                if (panelTopBeforeIncrement > 480) {
                  ArchiveRequest.pendingActionMarkers.removeFirst((byte) -118);
                  gf.preparePendingActionPanel((byte) -12);
                  return;
                }
              }
            }
          }
          return;
        }
        lh.b(-5);
        if (null == ArchiveRequest.pendingActionMarkers.firstForIteration(0)) {
          return;
        }
        panelPhase = kj.pendingActionPanelPhase;
        if (panelPhase == 0) {
          eh.pendingActionPanelTop = eh.pendingActionPanelTop - 1;
          if (eh.pendingActionPanelTop > -10 - (tl.pendingActionPanelHeight - 480)) {
            return;
          }
          h.pendingActionPanelHoldTicks = 0;
          kj.pendingActionPanelPhase = 1;
          return;
        }
        if (panelPhase == 1) {
          holdTicksBeforeInvalidGuardIncrement = h.pendingActionPanelHoldTicks;
          h.pendingActionPanelHoldTicks = h.pendingActionPanelHoldTicks + 1;
          if (holdTicksBeforeInvalidGuardIncrement <= 450) {
            return;
          }
          kj.pendingActionPanelPhase = 2;
          return;
        }
        if (panelPhase != 2) {
          return;
        }
        panelTopBeforeInvalidGuardIncrement = eh.pendingActionPanelTop;
        eh.pendingActionPanelTop = eh.pendingActionPanelTop + 1;
        if (panelTopBeforeInvalidGuardIncrement <= 480) {
          return;
        }
        ArchiveRequest.pendingActionMarkers.removeFirst((byte) -118);
        gf.preparePendingActionPanel((byte) -12);
        return;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void b(int param0) {
        activeDragWidget = null;
        if (param0 != -481) {
            lh.updatePendingActionPanel(90);
            nextText = null;
            createAccountSuccessText = null;
            return;
        }
        nextText = null;
        createAccountSuccessText = null;
    }

    static {
        nextText = "Next";
        createAccountSuccessText = "Account created successfully!";
    }
}
