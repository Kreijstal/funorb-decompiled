/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveNodeHashTable {
    static String changeDisplayNameText;
    private IntrusiveNode[] bucketSentinels;
    static Boolean pendingLoginBooleanReply;
    private IntrusiveNode iterationCursor;
    private int bucketCount;
    private int nextIterationBucket;
    private IntrusiveNode lookupCursor;
    static MonochromeBitmapFont smallFont;

    final IntrusiveNode findByKey(long key, byte methodGuard) {
        IntrusiveNode matchingNode = null;
        IntrusiveNode bucketSentinel = this.bucketSentinels[(int)((long)(-1 + this.bucketCount) & key)];
        this.lookupCursor = bucketSentinel.nextNode;
        while (bucketSentinel != this.lookupCursor) {
            if (!(~this.lookupCursor.nodeKey != ~key)) {
                matchingNode = this.lookupCursor;
                this.lookupCursor = this.lookupCursor.nextNode;
                return matchingNode;
            }
            this.lookupCursor = this.lookupCursor.nextNode;
        }
        if (methodGuard >= -73) {
            this.firstForIteration((byte) -38);
            this.lookupCursor = null;
            return null;
        }
        this.lookupCursor = null;
        return null;
    }

    final static int cosineQ16(int angle8192, int methodGuard) {
        if (methodGuard != 2048) {
            changeDisplayNameText = (String) null;
            angle8192 = angle8192 & 8191;
            if (angle8192 >= 4096) {
                return angle8192 >= 6144 ? ScoreSubmission.quarterSineQ16[-6144 + angle8192] : -ScoreSubmission.quarterSineQ16[-angle8192 + 6144];
            }
            return 2048 <= angle8192 ? -ScoreSubmission.quarterSineQ16[angle8192 - 2048] : ScoreSubmission.quarterSineQ16[-angle8192 + 2048];
        }
        angle8192 = angle8192 & 8191;
        if (angle8192 >= 4096) {
            return angle8192 >= 6144 ? ScoreSubmission.quarterSineQ16[-6144 + angle8192] : -ScoreSubmission.quarterSineQ16[-angle8192 + 6144];
        }
        return 2048 <= angle8192 ? -ScoreSubmission.quarterSineQ16[angle8192 - 2048] : ScoreSubmission.quarterSineQ16[-angle8192 + 2048];
    }

    final void put(byte methodGuard, IntrusiveNode node, long key) {
        IntrusiveNode bucketSentinel = null;
        try {
            if (!(null == node.previousNode)) {
                node.unlinkNode(false);
            }
            bucketSentinel = this.bucketSentinels[(int)((long)(this.bucketCount - 1) & key)];
            node.nextNode = bucketSentinel;
            node.previousNode = bucketSentinel.previousNode;
            node.previousNode.nextNode = node;
            node.nodeKey = key;
            if (methodGuard != 102) {
                smallFont = (MonochromeBitmapFont) null;
            }
            node.nextNode.previousNode = node;
        } catch (RuntimeException insertionFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) insertionFailure), "fi.F(" + methodGuard + ',' + (node != null ? "{...}" : "null") + ',' + key + ')');
        }
    }

    final static void selectLoopingBackgroundMusic(int methodGuard, MusicScore track) {
        RuntimeException playbackFailureForContext = null;
        RuntimeException playbackFailureBeforeDescription = null;
        StringBuilder playbackMessagePrefix = null;
        String trackDescription = null;
        RuntimeException caughtPlaybackFailure = null;
        try {
          if (methodGuard != 0) {
            changeDisplayNameText = (String) null;
          }
          if ((track != null) &&
              (track != GzipInflater.currentMusicTrack)) {
            PasswordWidgetRenderer.gameMusicStream.stopMusicPlayback(-9268);
            CacheReference.gameMusicOutput.flushAndMarkDrainCheck();
            GzipInflater.currentMusicTrack = track;
            PasswordWidgetRenderer.gameMusicStream.startMusicScore(true, GzipInflater.currentMusicTrack, -1706);
            return;
          }
          return;
        } catch (java.lang.RuntimeException playbackFailure) {
          caughtPlaybackFailure = playbackFailure;
          playbackFailureForContext = caughtPlaybackFailure;
          playbackFailureBeforeDescription = playbackFailureForContext;
          playbackMessagePrefix = new StringBuilder().append("fi.D(").append(methodGuard).append(',');
          if (track == null) {
            trackDescription = "null";
          } else {
            trackDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) playbackFailureBeforeDescription), ((StringBuilder) (Object) playbackMessagePrefix).append(trackDescription).append(')').toString());
        }
    }

    final IntrusiveNode firstForIteration(byte methodGuard) {
        if (methodGuard != 125) {
            IntrusiveNodeHashTable.releaseSharedResources(103);
            this.nextIterationBucket = 0;
            return this.nextForIteration(methodGuard - 195);
        }
        this.nextIterationBucket = 0;
        return this.nextForIteration(methodGuard - 195);
    }

    public static void releaseSharedResources(int methodGuard) {
        changeDisplayNameText = null;
        if (methodGuard >= -113) {
            return;
        }
        pendingLoginBooleanReply = null;
        smallFont = null;
    }

    IntrusiveNodeHashTable(int bucketCount) {
        int bucketIndex = 0;
        IntrusiveNode allocatedSentinel = null;
        IntrusiveNode sentinelAlias;
        this.nextIterationBucket = 0;
        this.bucketCount = bucketCount;
        this.bucketSentinels = new IntrusiveNode[bucketCount];
        for (bucketIndex = 0; bucketIndex < bucketCount; bucketIndex++) {
          allocatedSentinel = new IntrusiveNode();
          sentinelAlias = allocatedSentinel;
          this.bucketSentinels[bucketIndex] = allocatedSentinel;
          sentinelAlias.nextNode = sentinelAlias;
          sentinelAlias.previousNode = sentinelAlias;
        }
    }

    final IntrusiveNode nextForIteration(int methodGuard) {
        int initialBucketBeforeAdvance = 0;
        int nextBucketBeforeAdvance = 0;
        int guardResidue;
        IntrusiveNode firstNonemptyBucketNode;
        IntrusiveNode nextNonemptyBucketNode;
        IntrusiveNode currentBucketNode;
        if (this.nextIterationBucket <= 0) {
          while (true) {
            if (this.bucketCount <= this.nextIterationBucket) {
              guardResidue = 47 % ((methodGuard - 28) / 38);
              return null;
            }
            initialBucketBeforeAdvance = this.nextIterationBucket;
            this.nextIterationBucket = this.nextIterationBucket + 1;
            firstNonemptyBucketNode = this.bucketSentinels[initialBucketBeforeAdvance].nextNode;
            if (this.bucketSentinels[-1 + this.nextIterationBucket] == firstNonemptyBucketNode) {
              continue;
            }
            this.iterationCursor = firstNonemptyBucketNode.nextNode;
            return firstNonemptyBucketNode;
          }
        }
        if (this.iterationCursor != this.bucketSentinels[this.nextIterationBucket - 1]) {
          currentBucketNode = this.iterationCursor;
          this.iterationCursor = currentBucketNode.nextNode;
          return currentBucketNode;
        }
        while (true) {
          if (this.bucketCount <= this.nextIterationBucket) {
            guardResidue = 47 % ((methodGuard - 28) / 38);
            return null;
          }
          nextBucketBeforeAdvance = this.nextIterationBucket;
          this.nextIterationBucket = this.nextIterationBucket + 1;
          nextNonemptyBucketNode = this.bucketSentinels[nextBucketBeforeAdvance].nextNode;
          if (this.bucketSentinels[-1 + this.nextIterationBucket] == nextNonemptyBucketNode) {
            continue;
          }
          this.iterationCursor = nextNonemptyBucketNode.nextNode;
          return nextNonemptyBucketNode;
        }
    }

    static {
        changeDisplayNameText = "Change display name";
    }
}
