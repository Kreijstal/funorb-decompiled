/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class NodeHashTableIterator implements Iterator {
    private IntrusiveNode nextNode;
    static int[] field_i;
    private int nextBucketIndex;
    private IntrusiveNode lastReturnedNode;
    static int pendingTooltipAnchorX;
    private IterableNodeHashTable table;
    static IntrusiveDeque pendingAchievementQueries;
    static String loginText;
    static String fullscreenFocusText;
    static MusicScore sportMusicTrack;
    static Sprite popSprite;

    public final void remove() {
        if (null == this.lastReturnedNode) {
            throw new IllegalStateException();
        }
        this.lastReturnedNode.unlinkNode(false);
        this.lastReturnedNode = null;
    }

    final static java.applet.Applet getActiveApplet(int methodGuard) {
        if (!(VisualPropertyNode.loaderApplet == null)) {
            return VisualPropertyNode.loaderApplet;
        }
        if (methodGuard <= 104) {
            NodeHashTableIterator.markInsetZeroOutlinePixels(83, 4, -82, 86, 115);
            return (java.applet.Applet) ((Object) PrefixCodeDecoder.activeGameApplet);
        }
        return (java.applet.Applet) ((Object) PrefixCodeDecoder.activeGameApplet);
    }

    final static void markInsetZeroOutlinePixels(int topY, int leftX, int width, int methodGuard, int height) {
        int firstPixelOffset = 0;
        int rowSkip = 0;
        topY += 2;
        leftX += 2;
        if (methodGuard == -27085) {
            height -= 4;
            width -= 4;
            firstPixelOffset = leftX + topY * SoftwareRasterizer.stride;
            rowSkip = SoftwareRasterizer.stride - width;
            SessionSocketSupport.markZeroOutlinePixels(SoftwareRasterizer.framebuffer, firstPixelOffset, 0, 0, 0, 0, width, height, rowSkip);
            return;
        }
        NodeHashTableIterator.releaseSharedResources(32);
        height -= 4;
        width -= 4;
        firstPixelOffset = leftX + topY * SoftwareRasterizer.stride;
        rowSkip = SoftwareRasterizer.stride - width;
        SessionSocketSupport.markZeroOutlinePixels(SoftwareRasterizer.framebuffer, firstPixelOffset, 0, 0, 0, 0, width, height, rowSkip);
    }

    public final Object next() {
        int bucketBeforeAdvance = 0;
        int clientControlSnapshot;
        IntrusiveNode firstNodeInNextBucket;
        IntrusiveNode nextNodeInCurrentBucket;
        clientControlSnapshot = Geoblox.clientControlFlowFlag;
        if (this.table.bucketSentinels[this.nextBucketIndex - 1] != this.nextNode) {
          nextNodeInCurrentBucket = this.nextNode;
          this.nextNode = nextNodeInCurrentBucket.nextNode;
          this.lastReturnedNode = nextNodeInCurrentBucket;
          return nextNodeInCurrentBucket;
        }
        do {
          if (this.nextBucketIndex >= this.table.bucketCount) {
            return null;
          }
          bucketBeforeAdvance = this.nextBucketIndex;
          this.nextBucketIndex = this.nextBucketIndex + 1;
          firstNodeInNextBucket = this.table.bucketSentinels[bucketBeforeAdvance].nextNode;
        } while (firstNodeInNextBucket == this.table.bucketSentinels[this.nextBucketIndex - 1]);
        this.nextNode = firstNodeInNextBucket.nextNode;
        this.lastReturnedNode = firstNodeInNextBucket;
        return firstNodeInNextBucket;
    }

    public static void releaseSharedResources(int methodGuard) {
        fullscreenFocusText = null;
        pendingAchievementQueries = null;
        if (methodGuard != 0) {
            return;
        }
        popSprite = null;
        sportMusicTrack = null;
        field_i = null;
        loginText = null;
    }

    NodeHashTableIterator(IterableNodeHashTable table) {
        this.lastReturnedNode = null;
        try {
            this.table = table;
            this.resetIteration(-1);
        } catch (RuntimeException iteratorInitializationFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) iteratorInitializationFailure), "k.<init>(" + (table != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean hasNext() {
        int bucketBeforeAdvance = 0;
        int clientControlSnapshot;
        clientControlSnapshot = Geoblox.clientControlFlowFlag;
        if (this.table.bucketSentinels[this.nextBucketIndex - 1] != this.nextNode) {
          return true;
        }
        while (this.table.bucketCount > this.nextBucketIndex) {
          bucketBeforeAdvance = this.nextBucketIndex;
          this.nextBucketIndex = this.nextBucketIndex + 1;
          if (this.table.bucketSentinels[bucketBeforeAdvance].nextNode != this.table.bucketSentinels[this.nextBucketIndex - 1]) {
            this.nextNode = this.table.bucketSentinels[-1 + this.nextBucketIndex].nextNode;
            return true;
          }
          this.nextNode = this.table.bucketSentinels[this.nextBucketIndex - 1];
        }
        return false;
    }

    private final void resetIteration(int methodGuard) {
        this.lastReturnedNode = null;
        this.nextBucketIndex = 1;
        this.nextNode = this.table.bucketSentinels[0].nextNode;
        if (methodGuard != -1) {
            this.remove();
            return;
        }
    }

    static {
        pendingTooltipAnchorX = -1;
        pendingAchievementQueries = new IntrusiveDeque();
        loginText = "Log in";
        fullscreenFocusText = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
    }
}
