/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SecondaryNodeDequeIterator implements Iterator {
    private DualLinkNode lastReturnedNode;
    private SecondaryNodeDeque deque;
    private DualLinkNode nextNode;
    static String instructionsText;
    static boolean archiveLoadingComplete;

    final static void startLogin(String password, byte methodGuard, String loginIdentifier) {
        try {
            if (methodGuard != 66) {
                instructionsText = (String) null;
            }
            AccountCreationDialog.a(loginIdentifier, (byte) 87, false, password);
        } catch (RuntimeException loginFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) loginFailure), "ef.C(" + (password != null ? "{...}" : "null") + ',' + methodGuard + ',' + (loginIdentifier != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean hasNext() {
        return this.deque.sentinel != this.nextNode;
    }

    public final void remove() {
        if (null == this.lastReturnedNode) {
            throw new IllegalStateException();
        }
        this.lastReturnedNode.unlinkSecondaryNode((byte) 92);
        this.lastReturnedNode = null;
    }

    final static void advanceActiveEntityAnimations(byte methodGuard) {
        float boardAngleRadians = 0.0f;
        RuntimeException animationFailure = null;
        GameplayEntity transientEntity = null;
        int clientControlSnapshot = 0;
        RuntimeException caughtAnimationFailure = null;
        clientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          boardAngleRadians = UiWidget.gameplaySession.boardAngleRadians;
          EntityMotionSupport.moveEntitiesAndCollectContacts(methodGuard - 22, boardAngleRadians);
          ResourceArchive.updateAttachedEntities((byte) 123);
          if (methodGuard != -15) {
            SecondaryNodeDequeIterator.releaseSharedResources((byte) -11);
          }
          transientEntity = (GameplayEntity) ((Object) DelegatingCanvas.transientEntities.firstForIteration(0));
          while (transientEntity != null) {
            transientEntity.advanceEntityAnimation(true);
            if (transientEntity.animationFrameIndex >= 3) {
              transientEntity.entityQueue = SecondaryNodeDeque.availableEntities;
              transientEntity.animationFrameIndex = 0;
            }
            transientEntity = (GameplayEntity) ((Object) DelegatingCanvas.transientEntities.nextForIteration(1));
          }
          if (UiWidget.gameplaySession.tutorialPromptActive) {
            return;
          }
          HighscoreNameEntry.updateSpawnQueue(255);
          return;
        } catch (java.lang.RuntimeException animationFailureAtCatch) {
          caughtAnimationFailure = animationFailureAtCatch;
          animationFailure = caughtAnimationFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) animationFailure), "ef.A(" + methodGuard + ')');
        }
    }

    SecondaryNodeDequeIterator(SecondaryNodeDeque deque) {
        this.lastReturnedNode = null;
        try {
            this.deque = deque;
            this.nextNode = this.deque.sentinel.nextSecondaryNode;
            this.lastReturnedNode = null;
        } catch (RuntimeException iteratorInitializationFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) iteratorInitializationFailure), "ef.<init>(" + (deque != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseSharedResources(byte methodGuard) {
        instructionsText = null;
        if (methodGuard != 101) {
            archiveLoadingComplete = false;
        }
    }

    final static Sprite createPartiallyFilledSquareSprite(int firstFilledPixelIndex, int fillColor, int sideLength) {
        int pixelIndex = 0;
        int clientControlSnapshot = Geoblox.clientControlFlowFlag;
        Sprite allocatedSprite = new Sprite(sideLength, sideLength);
        Sprite spriteAlias = allocatedSprite;
        for (pixelIndex = firstFilledPixelIndex; spriteAlias.pixels.length > pixelIndex; pixelIndex++) {
            allocatedSprite.pixels[pixelIndex] = fillColor;
        }
        return spriteAlias;
    }

    public final Object next() {
        Object returnedNodeOrNull = this.nextNode;
        if (returnedNodeOrNull != this.deque.sentinel) {
            this.nextNode = ((DualLinkNode) (returnedNodeOrNull)).nextSecondaryNode;
        } else {
            returnedNodeOrNull = null;
            this.nextNode = null;
        }
        this.lastReturnedNode = (DualLinkNode) (returnedNodeOrNull);
        return returnedNodeOrNull;
    }

    static {
        instructionsText = "Instructions";
        archiveLoadingComplete = false;
    }
}
