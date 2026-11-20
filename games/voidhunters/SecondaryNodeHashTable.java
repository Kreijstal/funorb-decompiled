/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SecondaryNodeHashTable {
    static CommonGameState field_c;
    private DualLinkNode iteratorNode;
    private int iteratorBucket;
    private DualLinkNode[] buckets;
    private long lookupKey;
    private DualLinkNode lookupNode;
    private int bucketCount;
    static int field_d;

    final void put(DualLinkNode param0, byte param1, long param2) {
        DualLinkNode var5 = null;
        try {
          if (null != param0.secondaryPrevious) {
            param0.unlinkSecondary((byte) -35);
          }
          var5 = this.buckets[(int)(param2 & (long)(this.bucketCount - 1))];
          param0.secondaryPrevious = var5.secondaryPrevious;
          param0.secondaryNext = var5;
          if (param1 > -12) {
            field_d = -43;
          }
          param0.secondaryPrevious.secondaryNext = param0;
          param0.secondaryNext.secondaryPrevious = param0;
          param0.secondaryKey = param2;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "pr.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final DualLinkNode getNextSameKey(int param0) {
        DualLinkNode var4 = null;
        int var5 = VoidHunters.field_G;
        if (null == this.lookupNode) {
          return null;
        }
        int var2 = 40 % ((param0 + 45) / 39);
        DualLinkNode var3 = this.buckets[(int)((long)(this.bucketCount - 1) & this.lookupKey)];
        while (var3 != this.lookupNode) {
          if (~this.lookupNode.secondaryKey == ~this.lookupKey) {
            var4 = this.lookupNode;
            this.lookupNode = this.lookupNode.secondaryNext;
            return var4;
          }
          this.lookupNode = this.lookupNode.secondaryNext;
        }
        this.lookupNode = null;
        return null;
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != 1) {
          SecondaryNodeHashTable.continueAsGuest(-20);
          field_c = null;
          return;
        }
        field_c = null;
    }

    final DualLinkNode next(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int var3;
        DualLinkNode var4;
        DualLinkNode var8;
        DualLinkNode var11;
        var3 = VoidHunters.field_G;
        if (param0 <= ~this.iteratorBucket) {
          do {
            if (this.bucketCount <= this.iteratorBucket) {
              return null;
            }
            fieldTemp$1 = this.iteratorBucket;
            this.iteratorBucket = this.iteratorBucket + 1;
            var4 = this.buckets[fieldTemp$1].secondaryNext;
          } while (this.buckets[-1 + this.iteratorBucket] == var4);
          this.iteratorNode = var4.secondaryNext;
          return var4;
        }
        if (this.iteratorNode != this.buckets[-1 + this.iteratorBucket]) {
          var11 = this.iteratorNode;
          this.iteratorNode = var11.secondaryNext;
          return var11;
        }
        do {
          if (this.bucketCount <= this.iteratorBucket) {
            return null;
          }
          fieldTemp$0 = this.iteratorBucket;
          this.iteratorBucket = this.iteratorBucket + 1;
          var8 = this.buckets[fieldTemp$0].secondaryNext;
        } while (this.buckets[-1 + this.iteratorBucket] == var8);
        this.iteratorNode = var8.secondaryNext;
        return var8;
    }

    final DualLinkNode get(int param0, long param1) {
        DualLinkNode var5 = null;
        int var6 = VoidHunters.field_G;
        this.lookupKey = param1;
        DualLinkNode var4 = this.buckets[(int)(param1 & (long)(this.bucketCount + param0))];
        this.lookupNode = var4.secondaryNext;
        while (this.lookupNode != var4) {
          if (this.lookupNode.secondaryKey == param1) {
            var5 = this.lookupNode;
            this.lookupNode = this.lookupNode.secondaryNext;
            return var5;
          }
          this.lookupNode = this.lookupNode.secondaryNext;
        }
        this.lookupNode = null;
        return null;
    }

    final static void continueAsGuest(int param0) {
        GpuFaceAttachmentState.showProgressDialog((byte) -104);
        if (param0 != 17496) {
          return;
        }
        GetSelfDestructPrepareToggleCooldown.a(-29, 4);
    }

    final DualLinkNode first(int param0) {
        this.iteratorBucket = 0;
        if (param0 >= -18) {
          this.next(89);
          return this.next(-1);
        }
        return this.next(-1);
    }

    SecondaryNodeHashTable(int param0) {
        int var2 = 0;
        DualLinkNode dupTemp$1 = null;
        DualLinkNode var3;
        this.iteratorBucket = 0;
        this.bucketCount = param0;
        this.buckets = new DualLinkNode[param0];
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$1 = new DualLinkNode();
          var3 = dupTemp$1;
          this.buckets[var2] = dupTemp$1;
          var3.secondaryPrevious = var3;
          var3.secondaryNext = var3;
        }
    }

    static {
    }
}
