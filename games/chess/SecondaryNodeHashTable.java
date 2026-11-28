/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SecondaryNodeHashTable {
    static String field_e;
    static java.math.BigInteger field_k;
    private DualLinkNode lookupCursor;
    static ci field_h;
    private int bucketCount;
    private DualLinkNode iterationCursor;
    private DualLinkNode[] buckets;
    private int nextBucketIndex;
    static boolean field_g;
    static tk field_f;
    static String field_a;
    private long lookupKey;
    static String field_l;

    final DualLinkNode nextWithSameKey(boolean param0) {
        DualLinkNode var2;
        DualLinkNode var3;
        int var4;
        var4 = Chess.field_G;
        if (!param0) {
          return (DualLinkNode) null;
        }
        if (this.lookupCursor == null) {
          return null;
        }
        var2 = this.buckets[(int)(this.lookupKey & (long)(-1 + this.bucketCount))];
        while (true) {
          if (this.lookupCursor == var2) {
            this.lookupCursor = null;
            return null;
          }
          if (~this.lookupCursor.secondaryKey != ~this.lookupKey) {
            this.lookupCursor = this.lookupCursor.secondaryNext;
            continue;
          }
          break;
        }
        var3 = this.lookupCursor;
        this.lookupCursor = this.lookupCursor.secondaryNext;
        return var3;
    }

    final DualLinkNode first(boolean param0) {
        if (!param0) {
          this.nextBucketIndex = 0;
          return this.next(0);
        }
        SecondaryNodeHashTable.c(false);
        this.nextBucketIndex = 0;
        return this.next(0);
    }

    final DualLinkNode get(long param0, int param1) {
        DualLinkNode var4;
        DualLinkNode var5;
        int var6;
        DualLinkNode var4Lifetime1;
        DualLinkNode var5Lifetime1;
        var6 = Chess.field_G;
        this.lookupKey = param0;
        if (param1 == 3000) {
          var4 = this.buckets[(int)((long)(-1 + this.bucketCount) & param0)];
          this.lookupCursor = var4.secondaryNext;
          while (true) {
            if (var4 == this.lookupCursor) {
              this.lookupCursor = null;
              return null;
            }
            if (~this.lookupCursor.secondaryKey != ~param0) {
              this.lookupCursor = this.lookupCursor.secondaryNext;
              continue;
            }
            break;
          }
          var5 = this.lookupCursor;
          this.lookupCursor = this.lookupCursor.secondaryNext;
          return var5;
        }
        this.lookupKey = 72L;
        var4Lifetime1 = this.buckets[(int)((long)(-1 + this.bucketCount) & param0)];
        this.lookupCursor = var4Lifetime1.secondaryNext;
        while (true) {
          if (var4Lifetime1 == this.lookupCursor) {
            this.lookupCursor = null;
            return null;
          }
          if (~this.lookupCursor.secondaryKey != ~param0) {
            this.lookupCursor = this.lookupCursor.secondaryNext;
            continue;
          }
          break;
        }
        var5Lifetime1 = this.lookupCursor;
        this.lookupCursor = this.lookupCursor.secondaryNext;
        return var5Lifetime1;
    }

    final void put(boolean param0, DualLinkNode param1, long param2) {
        DualLinkNode var5 = null;
        try {
          if (!param0) {
            this.put(false, (DualLinkNode) null, -111L);
          }
          if (null != param1.secondaryPrevious) {
            param1.unlinkSecondary(-1);
          }
          var5 = this.buckets[(int)(param2 & (long)(this.bucketCount - 1))];
          param1.secondaryPrevious = var5.secondaryPrevious;
          param1.secondaryNext = var5;
          param1.secondaryPrevious.secondaryNext = param1;
          param1.secondaryKey = param2;
          param1.secondaryNext.secondaryPrevious = param1;
        } catch (RuntimeException runtimeException) {
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) runtimeException), "dk.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final DualLinkNode next(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int var3;
        DualLinkNode var4;
        DualLinkNode var5;
        DualLinkNode var9;
        DualLinkNode var12;
        var3 = Chess.field_G;
        if (this.nextBucketIndex <= 0) {
          do {
            if (this.bucketCount <= this.nextBucketIndex) {
              if (param0 == 0) {
                return null;
              }
              SecondaryNodeHashTable.clearStaticReferences(40);
              return null;
            }
            fieldTemp$1 = this.nextBucketIndex;
            this.nextBucketIndex = this.nextBucketIndex + 1;
            var4 = this.buckets[fieldTemp$1].secondaryNext;
            var5 = var4;
          } while (var4 == this.buckets[-1 + this.nextBucketIndex]);
          this.iterationCursor = var5.secondaryNext;
          return var5;
        }
        if (this.iterationCursor != this.buckets[this.nextBucketIndex - 1]) {
          var12 = this.iterationCursor;
          this.iterationCursor = var12.secondaryNext;
          return var12;
        }
        do {
          if (this.bucketCount <= this.nextBucketIndex) {
            if (param0 == 0) {
              return null;
            }
            SecondaryNodeHashTable.clearStaticReferences(40);
            return null;
          }
          fieldTemp$0 = this.nextBucketIndex;
          this.nextBucketIndex = this.nextBucketIndex + 1;
          var4 = this.buckets[fieldTemp$0].secondaryNext;
          var9 = var4;
        } while (var4 == this.buckets[-1 + this.nextBucketIndex]);
        this.iterationCursor = var9.secondaryNext;
        return var9;
    }

    final static boolean c(boolean param0) {
        long var1;
        long var3;
        int var5;
        int var6;
        var6 = Chess.field_G;
        if (param0) {
          SecondaryNodeHashTable.c(false);
        }
        var1 = ud.correctedCurrentTimeMillis(2);
        var3 = -cf.field_Jb + var1;
        if (var3 > 30000L) {
          cf.field_Jb = var1;
          DisplayNameSelectionPanel.field_K = 0;
          return true;
        }
        var5 = 3000;
        if (7 <= DisplayNameSelectionPanel.field_K) {
          var5 = 12000;
        } else {
          if (DisplayNameSelectionPanel.field_K >= 5) {
            var5 = 9000;
          } else {
            if (DisplayNameSelectionPanel.field_K >= 3) {
              var5 = 6000;
            }
          }
        }
        if (var3 <= (long)var5) {
          return false;
        }
        cf.field_Jb = var1;
        DisplayNameSelectionPanel.field_K = DisplayNameSelectionPanel.field_K + 1;
        return true;
    }

    public static void clearStaticReferences(int param0) {
        if (param0 == 12000) {
          field_l = null;
          field_e = null;
          field_f = null;
          field_k = null;
          field_h = null;
          field_a = null;
          return;
        }
        field_l = (String) null;
        field_l = null;
        field_e = null;
        field_f = null;
        field_k = null;
        field_h = null;
        field_a = null;
    }

    SecondaryNodeHashTable(int param0) {
        int var2 = 0;
        DualLinkNode dupTemp$1 = null;
        DualLinkNode var3;
        this.nextBucketIndex = 0;
        this.buckets = new DualLinkNode[param0];
        this.bucketCount = param0;
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$1 = new DualLinkNode();
          var3 = dupTemp$1;
          this.buckets[var2] = dupTemp$1;
          var3.secondaryPrevious = var3;
          var3.secondaryNext = var3;
        }
    }

    static {
        field_e = "Chat view has been scrolled up. Scroll down to chat.";
        field_k = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_f = new tk();
        field_a = "Players: <%0>/<%1>";
        field_l = "You can join this game";
    }
}
