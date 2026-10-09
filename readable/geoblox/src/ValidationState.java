/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidationState {
    static DraggableWidget activeDragWidget;
    static boolean updateFocusSnapshot;
    static String nextText;
    static String createAccountSuccessText;

    final static void updatePendingActionPanel(int methodGuard) {
        int holdTicksBeforeIncrement = 0;
        int panelTopBeforeIncrement = 0;
        int holdTicksBeforeInvalidGuardIncrement = 0;
        int panelTopBeforeInvalidGuardIncrement = 0;
        int panelPhase;
        int unusedClientControlSnapshot;
        int panelPhasePhase2;
        unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        if (methodGuard <= -78) {
          if (null != ArchiveRequest.pendingActionMarkers.firstForIteration(0)) {
            panelPhase = MidiPcmStream.pendingActionPanelPhase;
            if (panelPhase == 0) {
              LogoCompositor.pendingActionPanelTop = LogoCompositor.pendingActionPanelTop - 1;
              if (LogoCompositor.pendingActionPanelTop <= -10 - (RasterTargetSnapshot.pendingActionPanelHeight - 480)) {
                EmailAvailabilityQuery.pendingActionPanelHoldTicks = 0;
                MidiPcmStream.pendingActionPanelPhase = 1;
                return;
              }
            } else {
              if (panelPhase == 1) {
                holdTicksBeforeIncrement = EmailAvailabilityQuery.pendingActionPanelHoldTicks;
                EmailAvailabilityQuery.pendingActionPanelHoldTicks = EmailAvailabilityQuery.pendingActionPanelHoldTicks + 1;
                if (holdTicksBeforeIncrement <= 450) {
                  return;
                }
                MidiPcmStream.pendingActionPanelPhase = 2;
                return;
              }
              if (panelPhase == 2) {
                panelTopBeforeIncrement = LogoCompositor.pendingActionPanelTop;
                LogoCompositor.pendingActionPanelTop = LogoCompositor.pendingActionPanelTop + 1;
                if (panelTopBeforeIncrement > 480) {
                  ArchiveRequest.pendingActionMarkers.removeFirst((byte) -118);
                  EntityCollisionSupport.preparePendingActionPanel((byte) -12);
                  return;
                }
              }
            }
          }
          return;
        }
        ValidationState.releaseStaticReferences(-5);
        if (null == ArchiveRequest.pendingActionMarkers.firstForIteration(0)) {
          return;
        }
        panelPhasePhase2 = MidiPcmStream.pendingActionPanelPhase;
        if (panelPhasePhase2 == 0) {
          LogoCompositor.pendingActionPanelTop = LogoCompositor.pendingActionPanelTop - 1;
          if (LogoCompositor.pendingActionPanelTop > -10 - (RasterTargetSnapshot.pendingActionPanelHeight - 480)) {
            return;
          }
          EmailAvailabilityQuery.pendingActionPanelHoldTicks = 0;
          MidiPcmStream.pendingActionPanelPhase = 1;
          return;
        }
        if (panelPhasePhase2 == 1) {
          holdTicksBeforeInvalidGuardIncrement = EmailAvailabilityQuery.pendingActionPanelHoldTicks;
          EmailAvailabilityQuery.pendingActionPanelHoldTicks = EmailAvailabilityQuery.pendingActionPanelHoldTicks + 1;
          if (holdTicksBeforeInvalidGuardIncrement <= 450) {
            return;
          }
          MidiPcmStream.pendingActionPanelPhase = 2;
          return;
        }
        if (panelPhasePhase2 != 2) {
          return;
        }
        panelTopBeforeInvalidGuardIncrement = LogoCompositor.pendingActionPanelTop;
        LogoCompositor.pendingActionPanelTop = LogoCompositor.pendingActionPanelTop + 1;
        if (panelTopBeforeInvalidGuardIncrement <= 480) {
          return;
        }
        ArchiveRequest.pendingActionMarkers.removeFirst((byte) -118);
        EntityCollisionSupport.preparePendingActionPanel((byte) -12);
        return;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void releaseStaticReferences(int methodGuard) {
        activeDragWidget = null;
        if (methodGuard != -481) {
            ValidationState.updatePendingActionPanel(90);
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
