/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NodeHashTable {
    static lb field_j;
    static int field_e;
    static String[] field_i;
    private IntrusiveNode[] buckets;
    static String field_f;
    static String field_h;
    static RgbSprite field_k;
    private IntrusiveNode iterationCursor;
    private int bucketCount;
    private int nextBucketIndex;
    private IntrusiveNode lookupCursor;

    public static void c(int param0) {
        field_h = null;
        int var1 = 54 / ((-11 - param0) / 35);
        field_k = null;
        field_j = null;
        field_f = null;
        field_i = null;
    }

    final void put(long key, IntrusiveNode node, int obfuscationGuard) {
        IntrusiveNode var5 = null;
        try {
          if (node.previous != null) {
            node.unlink(obfuscationGuard + 1820);
          }
          var5 = this.buckets[(int)(key & (long)(this.bucketCount - 1))];
          node.previous = var5.previous;
          node.next = var5;
          node.previous.next = node;
          if (obfuscationGuard != -1816) {
            NodeHashTable.c(30);
          }
          node.key = key;
          node.next.previous = node;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "uh.C(" + key + ',' + (node != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    final static void a(int param0) {
        ca.field_r = null;
        dl.field_L = (byte[][]) null;
        rl.field_a = null;
        ba.field_d = null;
        oa.field_M = null;
        le.field_L = null;
        if (param0 != 9324) {
          field_i = (String[]) null;
          return;
        }
    }

    final IntrusiveNode next(byte obfuscationGuard) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$2 = 0;
        int var3;
        IntrusiveNode var4;
        IntrusiveNode var35;
        IntrusiveNode var36;
        IntrusiveNode var37;
        IntrusiveNode var38;
        IntrusiveNode var41;
        var3 = SteelSentinels.obfuscationControl;
        if (obfuscationGuard > 92) {
          if (this.nextBucketIndex <= 0) {
            do {
              if (this.nextBucketIndex >= this.bucketCount) {
                return null;
              }
              fieldTemp$1 = this.nextBucketIndex;
              this.nextBucketIndex = this.nextBucketIndex + 1;
              var37 = this.buckets[fieldTemp$1].next;
            } while (this.buckets[this.nextBucketIndex - 1] == var37);
            this.iterationCursor = var37.next;
            return var37;
          }
          if (this.iterationCursor != this.buckets[-1 + this.nextBucketIndex]) {
            var41 = this.iterationCursor;
            this.iterationCursor = var41.next;
            return var41;
          }
          do {
            if (this.nextBucketIndex >= this.bucketCount) {
              return null;
            }
            fieldTemp$0 = this.nextBucketIndex;
            this.nextBucketIndex = this.nextBucketIndex + 1;
            var38 = this.buckets[fieldTemp$0].next;
          } while (this.buckets[this.nextBucketIndex - 1] == var38);
          this.iterationCursor = var38.next;
          return var38;
        }
        this.buckets = (IntrusiveNode[]) null;
        if (this.nextBucketIndex <= 0) {
          do {
            if (this.nextBucketIndex >= this.bucketCount) {
              return null;
            }
            fieldTemp$3 = this.nextBucketIndex;
            this.nextBucketIndex = this.nextBucketIndex + 1;
            var4 = this.buckets[fieldTemp$3].next;
          } while (this.buckets[this.nextBucketIndex - 1] == var4);
          this.iterationCursor = var4.next;
          return var4;
        }
        if (this.iterationCursor != this.buckets[-1 + this.nextBucketIndex]) {
          var35 = this.iterationCursor;
          this.iterationCursor = var35.next;
          return var35;
        }
        do {
          if (this.nextBucketIndex >= this.bucketCount) {
            return null;
          }
          fieldTemp$2 = this.nextBucketIndex;
          this.nextBucketIndex = this.nextBucketIndex + 1;
          var36 = this.buckets[fieldTemp$2].next;
        } while (this.buckets[this.nextBucketIndex - 1] == var36);
        this.iterationCursor = var36.next;
        return var36;
    }

    final static int nonnegativeRemainder(boolean obfuscationGuard, int value, int divisor) {
        int var3 = 0;
        int var3Lifetime1;
        if (!obfuscationGuard) {
          var3 = value >> 31 & -1 + divisor;
          return var3 + (value + (value >>> 31)) % divisor;
        }
        field_k = (RgbSprite) null;
        var3Lifetime1 = value >> 31 & -1 + divisor;
        return var3Lifetime1 + (value + (value >>> 31)) % divisor;
    }

    final static void a(int param0, RgbSprite[] param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 1) {
            return;
          }
          Explosion.field_S = param1;
          if (null != Explosion.field_S &&
            param1.length < 3) {
            throw new IllegalArgumentException("");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("uh.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final IntrusiveNode first(int startBucketIndex) {
        this.nextBucketIndex = startBucketIndex;
        return this.next((byte) 113);
    }

    final IntrusiveNode get(long key, int obfuscationGuard) {
        IntrusiveNode var5 = null;
        int var6 = SteelSentinels.obfuscationControl;
        IntrusiveNode var4 = this.buckets[(int)(key & (long)(-1 + this.bucketCount))];
        this.lookupCursor = var4.next;
        while (var4 != this.lookupCursor) {
          if (~this.lookupCursor.key == ~key) {
            var5 = this.lookupCursor;
            this.lookupCursor = this.lookupCursor.next;
            return var5;
          }
          this.lookupCursor = this.lookupCursor.next;
        }
        if (obfuscationGuard >= 122) {
          this.lookupCursor = null;
          return null;
        }
        return (IntrusiveNode) null;
    }

    final static IndexedSprite a(IndexedSprite param0, int[] param1, boolean param2) {
        IndexedSprite var3 = null;
        RuntimeException var3_ref = null;
        IndexedSprite stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new IndexedSprite(0, 0, 0);
          var3.field_a = param0.field_a;
          var3.field_i = param0.field_i;
          if (param2) {
            field_f = (String) null;
          }
          var3.field_g = param0.field_g;
          var3.field_j = param0.field_j;
          var3.field_d = param0.field_d;
          var3.field_p = param0.field_p;
          var3.field_o = param1;
          var3.field_n = param0.field_n;
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("uh.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    NodeHashTable(int bucketCount) {
        int var2 = 0;
        IntrusiveNode dupTemp$1 = null;
        IntrusiveNode var3;
        this.nextBucketIndex = 0;
        this.buckets = new IntrusiveNode[bucketCount];
        this.bucketCount = bucketCount;
        for (var2 = 0; bucketCount > var2; var2++) {
          dupTemp$1 = new IntrusiveNode();
          var3 = dupTemp$1;
          this.buckets[var2] = dupTemp$1;
          var3.next = var3;
          var3.previous = var3;
        }
    }

    static {
        field_i = new String[]{"Flak repeater", "Minigun", "Fire bomb launcher", "Gauss gun", "Pulse laser", "Plasma spray", "Rapier missile", "Piercer rocket", "EMP rocket", "Airburst rocket", "Electron cannon", "Flak cannon", "Heavy gun", "Heavy cannon", "Mortar", "Rifled sniper cannon", "Rail repeater", "Laser beam", "Plasma cannon", "Multirocket", "Heavy rocket", "Lightning cannon", "Magno claw", "Flame cannon", "Bio rocket", "Air mine", "Ultra gun", "Doomsday cannon", "Howitzer", "Rail cannon", "Solaris laser", "Fusion cannon", "DEATH nuke", "Destructor rocket", "Air death missile", "EMP cannon"};
        field_h = "D";
        field_f = "Close";
        field_e = 1;
    }
}
