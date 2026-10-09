/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SecondaryNodeHashTable {
    static String normalizedSessionName;
    static int archivePort;
    static ProgressDialog accountProgressDialog;
    private int bucketCount;
    static String pleaseWaitText;
    private long lookupKey;
    static boolean[] gameSoundPreparationFlags;
    private DualLinkNode[] buckets;
    private DualLinkNode lookupCursor;
    static Sprite[] silverStarShockFrames;

    final void put(long key, int methodGuard, DualLinkNode node) {
        DualLinkNode bucketSentinel = null;
        try {
            if (null != node.previousSecondaryNode) {
                node.unlinkSecondaryNode((byte) 65);
            }
            int guardResidue = -92 % ((methodGuard - 34) / 51);
            bucketSentinel = this.buckets[(int)(key & (long)(-1 + this.bucketCount))];
            node.nextSecondaryNode = bucketSentinel;
            node.previousSecondaryNode = bucketSentinel.previousSecondaryNode;
            node.previousSecondaryNode.nextSecondaryNode = node;
            node.secondaryKey = key;
            node.nextSecondaryNode.previousSecondaryNode = node;
        } catch (RuntimeException insertionFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) insertionFailure), "vg.B(" + key + ',' + methodGuard + ',' + (node != null ? "{...}" : "null") + ')');
        }
    }

    final DualLinkNode findNext(int methodGuard) {
        DualLinkNode bucketSentinel;
        DualLinkNode matchingNode;
        int clientControlFlowSnapshot;
        DualLinkNode matchingNodeForReturn;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        if (null == this.lookupCursor) {
          return null;
        }
        bucketSentinel = this.buckets[(int)(this.lookupKey & (long)(-1 + this.bucketCount))];
        if (methodGuard == -29925) {
          while (true) {
            if (this.lookupCursor == bucketSentinel) {
              this.lookupCursor = null;
              return null;
            }
            if (this.lookupKey != this.lookupCursor.secondaryKey) {
              this.lookupCursor = this.lookupCursor.nextSecondaryNode;
              continue;
            }
            break;
          }
          matchingNode = this.lookupCursor;
          this.lookupCursor = this.lookupCursor.nextSecondaryNode;
          return matchingNode;
        }
        this.buckets = (DualLinkNode[]) null;
        while (true) {
          if (this.lookupCursor == bucketSentinel) {
            this.lookupCursor = null;
            return null;
          }
          if (this.lookupKey != this.lookupCursor.secondaryKey) {
            this.lookupCursor = this.lookupCursor.nextSecondaryNode;
            continue;
          }
          break;
        }
        matchingNodeForReturn = this.lookupCursor;
        this.lookupCursor = this.lookupCursor.nextSecondaryNode;
        return matchingNodeForReturn;
    }

    final DualLinkNode findFirst(long key, int bucketOffsetGuard) {
        DualLinkNode bucketSentinel;
        DualLinkNode matchingNode;
        int clientControlFlowSnapshot;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        this.lookupKey = key;
        bucketSentinel = this.buckets[(int)(key & (long)(bucketOffsetGuard + this.bucketCount))];
        this.lookupCursor = bucketSentinel.nextSecondaryNode;
        while (true) {
          if (bucketSentinel == this.lookupCursor) {
            this.lookupCursor = null;
            return null;
          }
          if (key != this.lookupCursor.secondaryKey) {
            this.lookupCursor = this.lookupCursor.nextSecondaryNode;
            continue;
          }
          break;
        }
        matchingNode = this.lookupCursor;
        this.lookupCursor = this.lookupCursor.nextSecondaryNode;
        return matchingNode;
    }

    public static void releaseSharedResources(boolean releaseRemainingResourcesGuard) {
        accountProgressDialog = null;
        if (!releaseRemainingResourcesGuard) {
            return;
        }
        silverStarShockFrames = null;
        pleaseWaitText = null;
        gameSoundPreparationFlags = null;
        normalizedSessionName = null;
    }

    SecondaryNodeHashTable(int bucketCount) {
        int bucketIndex = 0;
        DualLinkNode allocatedSentinel = null;
        DualLinkNode sentinelAlias;
        this.buckets = new DualLinkNode[bucketCount];
        this.bucketCount = bucketCount;
        for (bucketIndex = 0; bucketCount > bucketIndex; bucketIndex++) {
          allocatedSentinel = new DualLinkNode();
          sentinelAlias = allocatedSentinel;
          this.buckets[bucketIndex] = allocatedSentinel;
          sentinelAlias.nextSecondaryNode = sentinelAlias;
          sentinelAlias.previousSecondaryNode = sentinelAlias;
        }
    }

    static {
        gameSoundPreparationFlags = new boolean[33];
        pleaseWaitText = "Please wait...";
    }
}
