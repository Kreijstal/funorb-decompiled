/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SecondaryNodeDeque implements Iterable {
    static String ticketingUnreadCountText;
    DualLinkNode sentinel;
    static int receivedAchievementMask;
    static IntrusiveDeque availableEntities;

    final void addLast(int methodGuard, DualLinkNode node) {
        RuntimeException appendFailure = null;
        RuntimeException appendFailureForContext = null;
        StringBuilder appendMessagePrefix = null;
        String nodeDescription = null;
        RuntimeException caughtAppendFailure = null;
        try {
          if (node.previousSecondaryNode != null) {
            node.unlinkSecondaryNode((byte) 124);
          }
          node.previousSecondaryNode = this.sentinel.previousSecondaryNode;
          node.nextSecondaryNode = this.sentinel;
          node.previousSecondaryNode.nextSecondaryNode = node;
          node.nextSecondaryNode.previousSecondaryNode = node;
          if (methodGuard == -1) {
            return;
          }
          this.iterator();
          return;
        } catch (java.lang.RuntimeException appendFailureAtCatch) {
          caughtAppendFailure = appendFailureAtCatch;
          appendFailure = caughtAppendFailure;
          appendFailureForContext = appendFailure;
          appendMessagePrefix = new StringBuilder().append("ra.C(").append(methodGuard).append(',');
          if (node == null) {
            nodeDescription = "null";
          } else {
            nodeDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) appendFailureForContext), ((StringBuilder) (Object) appendMessagePrefix).append(nodeDescription).append(')').toString());
        }
    }

    final static void selectBackgroundMusic(int methodGuard, MusicScore track) {
        if (track == null || GzipInflater.currentMusicTrack == track) {
            return;
        }
        try {
            if (methodGuard != 0) {
                receivedAchievementMask = -114;
            }
            PasswordWidgetRenderer.gameMusicStream.stopMusicPlayback(-9268);
            CacheReference.gameMusicOutput.flushAndMarkDrainCheck();
            GzipInflater.currentMusicTrack = track;
            PasswordWidgetRenderer.gameMusicStream.startMusicScore(false, GzipInflater.currentMusicTrack, -1706);
        } catch (RuntimeException playbackFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) playbackFailure), "ra.A(" + methodGuard + ',' + (track != null ? "{...}" : "null") + ')');
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
        ScorePopupSupport.newAchievementMask = ScorePopupSupport.newAchievementMask | achievementBit;
        UiWidget.gameplaySession.newActionCount = UiWidget.gameplaySession.newActionCount + 1;
        achievementIdThenPanelEmptyFlag = achievementId;
        alreadyTrackedFlagValue = ((1 << achievementIdThenPanelEmptyFlag & AttachedEntityRenderer.achievementTrackingBits) == 0) ? 0 : 1;
        alreadyTrackedFlag = alreadyTrackedFlagValue;
        if (methodGuard < -47) {
          if (alreadyTrackedFlag != 0) {
            InstrumentPatch.earnedAchievementMask = InstrumentPatch.earnedAchievementMask | achievementBit;
            panelEmptyAfterExistingTracking = (!ArchiveRequest.pendingActionMarkers.isEmpty(13519)) ? 0 : 1;
            achievementIdThenPanelEmptyFlag = panelEmptyAfterExistingTracking;
          } else {
            AttachedEntityRenderer.achievementTrackingBits = AttachedEntityRenderer.achievementTrackingBits | 1 << achievementIdThenPanelEmptyFlag;
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
            AttachedEntityRenderer.achievementTrackingBits = AttachedEntityRenderer.achievementTrackingBits | 1 << achievementIdThenPanelEmptyFlag;
            UiWidget.achievementTrackingAccumulator = UiWidget.achievementTrackingAccumulator - (1 << achievementIdThenPanelEmptyFlag);
            InstrumentPatch.earnedAchievementMask = InstrumentPatch.earnedAchievementMask | achievementBit;
            panelEmptyAfterNewTrackingInvalidGuard = (!ArchiveRequest.pendingActionMarkers.isEmpty(13519)) ? 0 : 1;
            achievementIdThenPanelEmptyFlag = panelEmptyAfterNewTrackingInvalidGuard;
          }
        }
        ArchiveRequest.pendingActionMarkers.addLast(-35, new PendingActionMarker(achievementId));
        if (achievementIdThenPanelEmptyFlag != 0) {
          EntityCollisionSupport.preparePendingActionPanel((byte) -122);
        }
        if (!UiWidget.gameplaySession.submissionBlocked) {
          GameplayEntity.pendingAchievementSubmissions.addLast(-44, new AchievementSubmission(achievementId, achievementCheckByte, AttachedEntityRenderer.achievementTrackingBits, UiWidget.achievementTrackingAccumulator, AwtRasterBuffer.primaryAchievementTrackingCounter, SessionInstanceState.secondaryAchievementTrackingCounter));
        }
        return;
    }

    final static boolean hasUniformCharacters(int methodGuard, String text) {
        int firstCharacter = 0;
        RuntimeException comparisonFailure = null;
        int characterIndex = 0;
        int clientControlSnapshot = 0;
        String discardedNullText = null;
        RuntimeException failureForContext = null;
        StringBuilder failureMessagePrefix = null;
        String textDescription = null;
        RuntimeException caughtComparisonFailure = null;
        clientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          firstCharacter = text.charAt(0);
          if (methodGuard != 18725) {
            discardedNullText = (String) null;
            SecondaryNodeDeque.hasUniformCharacters(20, (String) null);
          }
          characterIndex = 1;
          while (true) {
            if (text.length() <= characterIndex) {
              return true;
            }
            if (firstCharacter == text.charAt(characterIndex)) {
              characterIndex++;
              continue;
            }
            return false;
          }
        } catch (java.lang.RuntimeException comparisonFailureAtCatch) {
          caughtComparisonFailure = comparisonFailureAtCatch;
          comparisonFailure = caughtComparisonFailure;
          failureForContext = comparisonFailure;
          failureMessagePrefix = new StringBuilder().append("ra.E(").append(methodGuard).append(',');
          if (text == null) {
            textDescription = "null";
          } else {
            textDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) failureMessagePrefix).append(textDescription).append(')').toString());
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new SecondaryNodeDequeIterator((SecondaryNodeDeque) (this)));
    }

    public static void releaseSharedResources(int methodGuard) {
        availableEntities = null;
        ticketingUnreadCountText = null;
        if (methodGuard != -1) {
            receivedAchievementMask = -36;
        }
    }

    final DualLinkNode removeFirst(byte methodGuard) {
        DualLinkNode firstNode = this.sentinel.nextSecondaryNode;
        int guardResidue = -14 % ((72 - methodGuard) / 46);
        if (this.sentinel != firstNode) {
            firstNode.unlinkSecondaryNode((byte) 126);
            return firstNode;
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
