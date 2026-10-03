/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SecondaryNodeHashTable {
    static String field_b;
    static int archivePort;
    static ProgressDialog field_i;
    private int bucketCount;
    static String pleaseWaitText;
    private long lookupKey;
    static boolean[] gameSoundPreparationFlags;
    private DualLinkNode[] buckets;
    private DualLinkNode lookupCursor;
    static Sprite[] silverStarShockFrames;

    final void put(long key, int methodGuard, DualLinkNode node) {
        DualLinkNode var5 = null;
        try {
            if (null != node.previousSecondaryNode) {
                node.unlinkSecondaryNode((byte) 65);
            }
            int var6 = -92 % ((methodGuard - 34) / 51);
            var5 = this.buckets[(int)(key & (long)(-1 + this.bucketCount))];
            node.nextSecondaryNode = var5;
            node.previousSecondaryNode = var5.previousSecondaryNode;
            node.previousSecondaryNode.nextSecondaryNode = node;
            node.secondaryKey = key;
            node.nextSecondaryNode.previousSecondaryNode = node;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "vg.B(" + key + ',' + methodGuard + ',' + (node != null ? "{...}" : "null") + ')');
        }
    }

    final DualLinkNode findNext(int methodGuard) {
        DualLinkNode var2;
        DualLinkNode var3;
        int var4;
        var4 = Geoblox.clientControlFlowFlag;
        if (null == this.lookupCursor) {
          return null;
        }
        var2 = this.buckets[(int)(this.lookupKey & (long)(-1 + this.bucketCount))];
        if (methodGuard == -29925) {
          while (true) {
            if (this.lookupCursor == var2) {
              this.lookupCursor = null;
              return null;
            }
            if (this.lookupKey != this.lookupCursor.secondaryKey) {
              this.lookupCursor = this.lookupCursor.nextSecondaryNode;
              continue;
            }
            var3 = this.lookupCursor;
            this.lookupCursor = this.lookupCursor.nextSecondaryNode;
            return var3;
          }
        }
        this.buckets = (DualLinkNode[]) null;
        while (true) {
          if (this.lookupCursor == var2) {
            this.lookupCursor = null;
            return null;
          }
          if (this.lookupKey != this.lookupCursor.secondaryKey) {
            this.lookupCursor = this.lookupCursor.nextSecondaryNode;
            continue;
          }
          var3 = this.lookupCursor;
          this.lookupCursor = this.lookupCursor.nextSecondaryNode;
          return var3;
        }
    }

    final DualLinkNode findFirst(long key, int bucketOffsetGuard) {
        DualLinkNode var4;
        DualLinkNode var5;
        int var6;
        var6 = Geoblox.clientControlFlowFlag;
        this.lookupKey = key;
        var4 = this.buckets[(int)(key & (long)(bucketOffsetGuard + this.bucketCount))];
        this.lookupCursor = var4.nextSecondaryNode;
        while (true) {
          if (var4 == this.lookupCursor) {
            this.lookupCursor = null;
            return null;
          }
          if (key != this.lookupCursor.secondaryKey) {
            this.lookupCursor = this.lookupCursor.nextSecondaryNode;
            continue;
          }
          var5 = this.lookupCursor;
          this.lookupCursor = this.lookupCursor.nextSecondaryNode;
          return var5;
        }
    }

    public static void a(boolean param0) {
        field_i = null;
        if (!param0) {
            return;
        }
        silverStarShockFrames = null;
        pleaseWaitText = null;
        gameSoundPreparationFlags = null;
        field_b = null;
    }

    SecondaryNodeHashTable(int bucketCount) {
        int var2 = 0;
        DualLinkNode dupTemp$1 = null;
        DualLinkNode var3;
        this.buckets = new DualLinkNode[bucketCount];
        this.bucketCount = bucketCount;
        for (var2 = 0; bucketCount > var2; var2++) {
          dupTemp$1 = new DualLinkNode();
          var3 = dupTemp$1;
          this.buckets[var2] = dupTemp$1;
          var3.nextSecondaryNode = var3;
          var3.previousSecondaryNode = var3;
        }
    }

    static {
        gameSoundPreparationFlags = new boolean[33];
        pleaseWaitText = "Please wait...";
    }
}
