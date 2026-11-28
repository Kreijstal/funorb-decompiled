/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class NodeHashTableIterator implements Iterator {
    static String field_f;
    static String field_c;
    static String field_i;
    private IntrusiveNode lastReturned;
    static String field_b;
    static String field_e;
    private IntrusiveNode nextNode;
    private IterableNodeHashTable table;
    private int nextBucketIndex;

    private final void reset(byte param0) {
        this.nextBucketIndex = 1;
        this.lastReturned = null;
        if (param0 <= 51) {
          field_i = (String) null;
        }
        this.nextNode = this.table.buckets[0].previous;
    }

    public final void remove() {
        if (this.lastReturned == null) {
          throw new IllegalStateException();
        }
        this.lastReturned.unlink(false);
        this.lastReturned = null;
    }

    public static void clearStaticReferences(int param0) {
        field_f = null;
        if (param0 != 0) {
          return;
        }
        field_b = null;
        field_i = null;
        field_c = null;
        field_e = null;
    }

    final static void b(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        pp stackIn_16_0 = null;
        boolean stackIn_17_1 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = DungeonAssault.field_K;
        try {
          if (param0 != -36) {
            return;
          }
          ac.field_s = 0;
          for (var1_int = 0; var1_int < 8; var1_int++) {
            if (um.field_i[var1_int] != null &&
              um.field_i[var1_int] != gm.field_d.field_a[var1_int]) {
              if (gm.field_d.field_a[var1_int] != null &&
                gm.field_d.field_a[var1_int].field_c == um.field_i[var1_int].field_c) {
                ac.field_s = ac.field_s + FrameTimer.a(-1704798751, um.field_i[var1_int].field_n);
              } else {
                ac.field_s = ac.field_s + ib.a(um.field_i[var1_int].field_n, 918);
              }
            }
          }
          stackIn_16_0 = sn.field_b;
          stackIn_17_1 = !(gm.field_d.field_s < ac.field_s);
          stackIn_16_0.field_w = stackIn_17_1;
          PlayerDungeonProfile.refreshRaiderStatusIndicators(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) var1), "ho.C(" + param0 + ')');
        }
    }

    public final Object next() {
        int fieldTemp$0 = 0;
        IntrusiveNode var1;
        int var2;
        var2 = DungeonAssault.field_K;
        if (this.table.buckets[-1 + this.nextBucketIndex] != this.nextNode) {
          var1 = this.nextNode;
          this.lastReturned = var1;
          this.nextNode = var1.previous;
          return var1;
        }
        do {
          if (this.table.bucketCount <= this.nextBucketIndex) {
            return null;
          }
          fieldTemp$0 = this.nextBucketIndex;
          this.nextBucketIndex = this.nextBucketIndex + 1;
          var1 = this.table.buckets[fieldTemp$0].previous;
        } while (this.table.buckets[this.nextBucketIndex - 1] == var1);
        this.lastReturned = var1;
        this.nextNode = var1.previous;
        return var1;
    }

    public final boolean hasNext() {
        int fieldTemp$0 = 0;
        int var2;
        var2 = DungeonAssault.field_K;
        if (this.table.buckets[this.nextBucketIndex - 1] != this.nextNode) {
          return true;
        }
        while (true) {
          if (this.nextBucketIndex >= this.table.bucketCount) {
            return false;
          }
          fieldTemp$0 = this.nextBucketIndex;
          this.nextBucketIndex = this.nextBucketIndex + 1;
          if (this.table.buckets[fieldTemp$0].previous == this.table.buckets[-1 + this.nextBucketIndex]) {
            this.nextNode = this.table.buckets[this.nextBucketIndex - 1];
            continue;
          }
          break;
        }
        this.nextNode = this.table.buckets[-1 + this.nextBucketIndex].previous;
        return true;
    }

    final static void a(PlatformTaskDispatcher param0, Object param1, byte param2) {
        int var3_int = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = DungeonAssault.field_K;
        try {
          if (param0.field_e == null) {
            return;
          }
          for (var3_int = 0; 50 > var3_int; var3_int++) {
            if (null != param0.field_e.peekEvent()) {
              CombatState.sleepMillis(0, 1L);
              continue;
            }
            break;
          }
          if (param2 != -32) {
            field_c = (String) null;
          }
          try {
            if (param1 != null) {
              param0.field_e.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param1, 1001, "dummy")));
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("ho.B(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(')').toString());
        }
    }

    NodeHashTableIterator(IterableNodeHashTable param0) {
        this.lastReturned = null;
        try {
          this.table = param0;
          this.reset((byte) 67);
        } catch (RuntimeException runtimeException) {
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) runtimeException), "ho.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = "Play free version";
        field_c = "Cost: <%0>";
        field_e = "<col=FF0000>Defence -3</col>";
        field_b = "Select a party leader, who will be first to enter the next room.";
    }
}
