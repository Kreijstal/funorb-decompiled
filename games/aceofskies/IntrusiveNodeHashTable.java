/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveNodeHashTable {
    static String field_f;
    private IntrusiveNode[] bucketSentinels;
    private IntrusiveNode iterationCursor;
    private int bucketCount;
    private IntrusiveNode lookupCursor;
    private int nextIterationBucket;

    final IntrusiveNode firstForIteration(boolean obfuscationGuard) {
        if (obfuscationGuard) {
          return (IntrusiveNode) null;
        }
        this.nextIterationBucket = 0;
        return this.nextForIteration(0);
    }

    final IntrusiveNode findByKey(byte obfuscationGuard, long key) {
        IntrusiveNode var5 = null;
        int var6 = AceOfSkies.obfuscationControl ? 1 : 0;
        IntrusiveNode var4 = this.bucketSentinels[(int)((long)(this.bucketCount - 1) & key)];
        this.lookupCursor = var4.next;
        while (var4 != this.lookupCursor) {
          if (~key == ~this.lookupCursor.key) {
            var5 = this.lookupCursor;
            this.lookupCursor = this.lookupCursor.next;
            return var5;
          }
          this.lookupCursor = this.lookupCursor.next;
        }
        if (obfuscationGuard != 106) {
          String var7 = (String) null;
          IntrusiveNodeHashTable.a((String) null, 95);
        }
        this.lookupCursor = null;
        return null;
    }

    final static String a(String param0, int param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var5 = 0;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          var2_int = param0.length();
          var3 = new char[var2_int];
          for (var4 = param1; var2_int > var4; var4++) {
            var3[-1 + var2_int - var4] = param0.charAt(var4);
          }
          stackIn_5_0 = new String(var3);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("ph.E(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final void clearFromBucket(int firstBucket) {
        int var2 = 0;
        IntrusiveNode var3 = null;
        IntrusiveNode var4 = null;
        int var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        for (var2 = firstBucket; var2 < this.bucketCount; var2++) {
          var3 = this.bucketSentinels[var2];
          while (true) {
            var4 = var3.next;
            if (var3 == var4) {
              break;
            }
            var4.unlink(-123);
          }
        }
        this.iterationCursor = null;
        this.lookupCursor = null;
    }

    final void put(int obfuscationGuard, long key, IntrusiveNode node) {
        IntrusiveNode var5 = null;
        try {
          if (null != node.previous) {
            node.unlink(-123);
          }
          var5 = this.bucketSentinels[(int)(key & (long)(-1 + this.bucketCount))];
          node.next = var5;
          int var6 = -19 / ((obfuscationGuard - 43) / 54);
          node.previous = var5.previous;
          node.previous.next = node;
          node.next.previous = node;
          node.key = key;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ph.A(" + obfuscationGuard + ',' + key + ',' + (node != null ? "{...}" : "null") + ')');
        }
    }

    final IntrusiveNode nextForIteration(int obfuscationGuard) {
        int fieldTemp$0 = 0;
        IntrusiveNode var2;
        int var3;
        var3 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (this.nextIterationBucket > obfuscationGuard &&
          this.iterationCursor != this.bucketSentinels[this.nextIterationBucket - 1]) {
          var2 = this.iterationCursor;
          this.iterationCursor = var2.next;
          return var2;
        }
        do {
          if (this.nextIterationBucket >= this.bucketCount) {
            return null;
          }
          fieldTemp$0 = this.nextIterationBucket;
          this.nextIterationBucket = this.nextIterationBucket + 1;
          var2 = this.bucketSentinels[fieldTemp$0].next;
        } while (this.bucketSentinels[this.nextIterationBucket - 1] == var2);
        this.iterationCursor = var2.next;
        return var2;
    }

    public static void c(int param0) {
        field_f = null;
        if (param0 <= 67) {
          field_f = (String) null;
        }
    }

    IntrusiveNodeHashTable(int bucketCount) {
        int var2 = 0;
        IntrusiveNode dupTemp$0 = null;
        IntrusiveNode var3 = null;
        this.nextIterationBucket = 0;
        this.bucketCount = bucketCount;
        this.bucketSentinels = new IntrusiveNode[bucketCount];
        for (var2 = 0; bucketCount > var2; var2++) {
          dupTemp$0 = new IntrusiveNode();
          var3 = dupTemp$0;
          this.bucketSentinels[var2] = dupTemp$0;
          var3.next = var3;
          var3.previous = var3;
        }
    }

    static {
        field_f = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
