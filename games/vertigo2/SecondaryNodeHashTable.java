/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SecondaryNodeHashTable {
    private DualLinkNode lookupCursor;
    static String field_j;
    static byte[] field_c;
    static tj field_b;
    private long lookupKey;
    static String field_e;
    private int iterationBucketIndex;
    private int bucketCount;
    private DualLinkNode iterationCursor;
    private DualLinkNode[] buckets;

    final static void a(int param0, boolean param1, String param2) {
        try {
          bf.field_a = param1;
          PacketBuffer.field_t = true;
          df.field_l = new fj(AccountServiceResult.field_e, sg.field_a, param2, tk.field_e, bf.field_a);
          AccountServiceResult.field_e.b(df.field_l, param0 ^ param0);
        } catch (RuntimeException runtimeException) {
          throw wn.wrapClientException((Throwable) ((Object) runtimeException), "fi.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void put(DualLinkNode param0, long param1, int param2) {
        DualLinkNode var5 = null;
        try {
          if (null != param0.secondaryNext) {
            param0.unlinkSecondary(-107);
          }
          int var6 = 118 / ((param2 + 20) / 35);
          var5 = this.buckets[(int)(param1 & (long)(-1 + this.bucketCount))];
          param0.secondaryPrevious = var5;
          param0.secondaryNext = var5.secondaryNext;
          param0.secondaryNext.secondaryPrevious = param0;
          param0.secondaryKey = param1;
          param0.secondaryPrevious.secondaryNext = param0;
        } catch (RuntimeException runtimeException) {
          throw wn.wrapClientException((Throwable) ((Object) runtimeException), "fi.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void clearStaticReferences(int param0) {
        if (param0 != 0) {
          return;
        }
        field_j = null;
        field_e = null;
        field_b = null;
        field_c = null;
    }

    final DualLinkNode next(byte param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$2 = 0;
        int var3;
        DualLinkNode var4;
        DualLinkNode var5;
        DualLinkNode var29;
        DualLinkNode var57;
        DualLinkNode var58;
        DualLinkNode var59;
        var3 = Vertigo2.field_L ? 1 : 0;
        if (this.iterationBucketIndex <= 0) {
          if (param0 == -60) {
            do {
              if (this.bucketCount <= this.iterationBucketIndex) {
                return null;
              }
              fieldTemp$1 = this.iterationBucketIndex;
              this.iterationBucketIndex = this.iterationBucketIndex + 1;
              var4 = this.buckets[fieldTemp$1].secondaryPrevious;
              var58 = var4;
            } while (var4 == this.buckets[-1 + this.iterationBucketIndex]);
            this.iterationCursor = var58.secondaryPrevious;
            return var58;
          }
          this.nextWithSameKey(-90);
          do {
            if (this.bucketCount <= this.iterationBucketIndex) {
              return null;
            }
            fieldTemp$0 = this.iterationBucketIndex;
            this.iterationBucketIndex = this.iterationBucketIndex + 1;
            var4 = this.buckets[fieldTemp$0].secondaryPrevious;
            var59 = var4;
          } while (var4 == this.buckets[-1 + this.iterationBucketIndex]);
          this.iterationCursor = var59.secondaryPrevious;
          return var59;
        }
        if (this.iterationCursor != this.buckets[this.iterationBucketIndex - 1]) {
          var57 = this.iterationCursor;
          this.iterationCursor = var57.secondaryPrevious;
          return var57;
        }
        if (param0 == -60) {
          do {
            if (this.bucketCount <= this.iterationBucketIndex) {
              return null;
            }
            fieldTemp$3 = this.iterationBucketIndex;
            this.iterationBucketIndex = this.iterationBucketIndex + 1;
            var4 = this.buckets[fieldTemp$3].secondaryPrevious;
            var5 = var4;
          } while (var4 == this.buckets[-1 + this.iterationBucketIndex]);
          this.iterationCursor = var5.secondaryPrevious;
          return var5;
        }
        this.nextWithSameKey(-90);
        do {
          if (this.bucketCount <= this.iterationBucketIndex) {
            return null;
          }
          fieldTemp$2 = this.iterationBucketIndex;
          this.iterationBucketIndex = this.iterationBucketIndex + 1;
          var4 = this.buckets[fieldTemp$2].secondaryPrevious;
          var29 = var4;
        } while (var4 == this.buckets[-1 + this.iterationBucketIndex]);
        this.iterationCursor = var29.secondaryPrevious;
        return var29;
    }

    final static co a(int param0, Archive param1, Archive param2, int param3, byte param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        co stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = 34 % ((-6 - param4) / 33);
          if (hq.a(124, param0, param3, param1)) {
            stackIn_4_0 = m.a(param2.a(param0, param3, (byte) -103), 0);
            return stackIn_4_0;
          }
          stackIn_2_0 = null;
          return (co) (stackIn_2_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("fi.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wn.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final DualLinkNode first(int param0) {
        int var2 = 59 / ((-72 - param0) / 53);
        this.iterationBucketIndex = 0;
        return this.next((byte) -60);
    }

    final DualLinkNode get(int param0, long param1) {
        DualLinkNode var4;
        DualLinkNode var5;
        int var6;
        var6 = Vertigo2.field_L ? 1 : 0;
        this.lookupKey = param1;
        if (param0 != 3661) {
          return (DualLinkNode) null;
        }
        var4 = this.buckets[(int)((long)(this.bucketCount - 1) & param1)];
        this.lookupCursor = var4.secondaryPrevious;
        while (true) {
          if (var4 == this.lookupCursor) {
            this.lookupCursor = null;
            return null;
          }
          if (~param1 != ~this.lookupCursor.secondaryKey) {
            this.lookupCursor = this.lookupCursor.secondaryPrevious;
            continue;
          }
          break;
        }
        var5 = this.lookupCursor;
        this.lookupCursor = this.lookupCursor.secondaryPrevious;
        return var5;
    }

    final DualLinkNode nextWithSameKey(int param0) {
        DualLinkNode var2;
        DualLinkNode var3;
        int var4;
        var4 = Vertigo2.field_L ? 1 : 0;
        if (null == this.lookupCursor) {
          return null;
        }
        if (param0 > -89) {
          return (DualLinkNode) null;
        }
        var2 = this.buckets[(int)(this.lookupKey & (long)(-1 + this.bucketCount))];
        while (true) {
          if (this.lookupCursor == var2) {
            this.lookupCursor = null;
            return null;
          }
          if (~this.lookupCursor.secondaryKey != ~this.lookupKey) {
            this.lookupCursor = this.lookupCursor.secondaryPrevious;
            continue;
          }
          break;
        }
        var3 = this.lookupCursor;
        this.lookupCursor = this.lookupCursor.secondaryPrevious;
        return var3;
    }

    SecondaryNodeHashTable(int param0) {
        int var2 = 0;
        DualLinkNode dupTemp$1 = null;
        DualLinkNode var3;
        this.iterationBucketIndex = 0;
        this.bucketCount = param0;
        this.buckets = new DualLinkNode[param0];
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$1 = new DualLinkNode();
          var3 = dupTemp$1;
          this.buckets[var2] = dupTemp$1;
          var3.secondaryPrevious = var3;
          var3.secondaryNext = var3;
        }
    }

    static {
        field_j = "Average rating";
        field_b = new tj();
    }
}
