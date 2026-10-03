/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SecondaryNodeDeque implements Iterable {
    static String ticketingUnreadCountText;
    DualLinkNode field_c;
    static int receivedAchievementMask;
    static IntrusiveDeque availableEntities;

    final void a(int param0, DualLinkNode param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.previousSecondaryNode != null) {
            param1.unlinkSecondaryNode((byte) 124);
          }
          param1.previousSecondaryNode = this.field_c.previousSecondaryNode;
          param1.nextSecondaryNode = this.field_c;
          param1.previousSecondaryNode.nextSecondaryNode = param1;
          param1.nextSecondaryNode.previousSecondaryNode = param1;
          if (param0 == -1) {
            return;
          }
          this.iterator();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ra.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void selectBackgroundMusic(int methodGuard, MusicScore track) {
        if (track == null || GzipInflater.field_e == track) {
            return;
        }
        try {
            if (methodGuard != 0) {
                receivedAchievementMask = -114;
            }
            PasswordWidgetRenderer.field_y.d(-9268);
            CacheReference.field_p.a();
            GzipInflater.field_e = track;
            PasswordWidgetRenderer.field_y.a(false, GzipInflater.field_e, -1706);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "ra.A(" + methodGuard + ',' + (track != null ? "{...}" : "null") + ')');
        }
    }

    final static void recordAchievement(int achievementCheckByte, int methodGuard, int achievementId) {
        int alreadyTrackedFlagValue = 0;
        int panelEmptyAfterNewTrackingInvalidGuard = 0;
        int panelEmptyAfterExistingTrackingInvalidGuard = 0;
        int panelEmptyAfterExistingTracking = 0;
        int panelEmptyAfterNewTracking = 0;
        int achievementBit;
        int achievementIdThenPanelEmptyFlag;
        int alreadyTrackedFlag;
        if (UiWidget.gameplaySession.tutorialMode) {
          return;
        }
        achievementBit = 1 << achievementId;
        if ((InstrumentPatch.earnedAchievementMask & achievementBit) != 0) {
          return;
        }
        ug.newAchievementMask = ug.newAchievementMask | achievementBit;
        UiWidget.gameplaySession.newActionCount = UiWidget.gameplaySession.newActionCount + 1;
        achievementIdThenPanelEmptyFlag = achievementId;
        alreadyTrackedFlagValue = ((1 << achievementIdThenPanelEmptyFlag & dc.achievementTrackingBits) == 0) ? 0 : 1;
        alreadyTrackedFlag = alreadyTrackedFlagValue;
        if (methodGuard < -47) {
          if (alreadyTrackedFlag != 0) {
            InstrumentPatch.earnedAchievementMask = InstrumentPatch.earnedAchievementMask | achievementBit;
            panelEmptyAfterExistingTracking = (!ArchiveRequest.pendingActionMarkers.isEmpty(13519)) ? 0 : 1;
            achievementIdThenPanelEmptyFlag = panelEmptyAfterExistingTracking;
          } else {
            dc.achievementTrackingBits = dc.achievementTrackingBits | 1 << achievementIdThenPanelEmptyFlag;
            UiWidget.achievementTrackingAccumulator = UiWidget.achievementTrackingAccumulator - (1 << achievementIdThenPanelEmptyFlag);
            InstrumentPatch.earnedAchievementMask = InstrumentPatch.earnedAchievementMask | achievementBit;
            panelEmptyAfterNewTracking = (!ArchiveRequest.pendingActionMarkers.isEmpty(13519)) ? 0 : 1;
            achievementIdThenPanelEmptyFlag = panelEmptyAfterNewTracking;
          }
        } else {
          ticketingUnreadCountText = (String) null;
          if (alreadyTrackedFlag != 0) {
            InstrumentPatch.earnedAchievementMask = InstrumentPatch.earnedAchievementMask | achievementBit;
            panelEmptyAfterExistingTrackingInvalidGuard = (!ArchiveRequest.pendingActionMarkers.isEmpty(13519)) ? 0 : 1;
            achievementIdThenPanelEmptyFlag = panelEmptyAfterExistingTrackingInvalidGuard;
          } else {
            dc.achievementTrackingBits = dc.achievementTrackingBits | 1 << achievementIdThenPanelEmptyFlag;
            UiWidget.achievementTrackingAccumulator = UiWidget.achievementTrackingAccumulator - (1 << achievementIdThenPanelEmptyFlag);
            InstrumentPatch.earnedAchievementMask = InstrumentPatch.earnedAchievementMask | achievementBit;
            panelEmptyAfterNewTrackingInvalidGuard = (!ArchiveRequest.pendingActionMarkers.isEmpty(13519)) ? 0 : 1;
            achievementIdThenPanelEmptyFlag = panelEmptyAfterNewTrackingInvalidGuard;
          }
        }
        ArchiveRequest.pendingActionMarkers.addLast(-35, new PendingActionMarker(achievementId));
        if (achievementIdThenPanelEmptyFlag != 0) {
          gf.preparePendingActionPanel((byte) -122);
        }
        if (!UiWidget.gameplaySession.submissionBlocked) {
          GameplayEntity.pendingAchievementSubmissions.addLast(-44, new AchievementSubmission(achievementId, achievementCheckByte, dc.achievementTrackingBits, UiWidget.achievementTrackingAccumulator, AwtRasterBuffer.primaryAchievementTrackingCounter, lb.secondaryAchievementTrackingCounter));
        }
        return;
    }

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Geoblox.clientControlFlowFlag;
        try {
          var2_int = param1.charAt(0);
          if (param0 != 18725) {
            var5 = (String) null;
            SecondaryNodeDeque.a(20, (String) null);
          }
          var3 = 1;
          while (true) {
            if (param1.length() <= var3) {
              return true;
            }
            if (var2_int == param1.charAt(var3)) {
              var3++;
              continue;
            }
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("ra.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new SecondaryNodeDequeIterator((SecondaryNodeDeque) (this)));
    }

    public static void a(int param0) {
        availableEntities = null;
        ticketingUnreadCountText = null;
        if (param0 != -1) {
            receivedAchievementMask = -36;
        }
    }

    final DualLinkNode a(byte param0) {
        DualLinkNode var2 = this.field_c.nextSecondaryNode;
        int var3 = -14 % ((72 - param0) / 46);
        if (this.field_c != var2) {
            var2.unlinkSecondaryNode((byte) 126);
            return var2;
        }
        return null;
    }

    private SecondaryNodeDeque() throws Throwable {
        throw new Error();
    }

    static {
        ticketingUnreadCountText = "You have <%0> unread messages!";
        availableEntities = new IntrusiveDeque();
    }
}
