/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class NodeHashTableIterator implements Iterator {
    static String field_j;
    static he field_d;
    private IntrusiveNode nextNode;
    private IntrusiveNode lastReturned;
    static he[] field_h;
    static int field_g;
    static he[] field_i;
    static int field_e;
    private IterableNodeHashTable table;
    static String field_c;
    private int nextBucketIndex;

    private final void reset(int param0) {
        int var2 = -6 / ((-2 - param0) / 38);
        this.lastReturned = null;
        this.nextBucketIndex = 1;
        this.nextNode = this.table.buckets[0].next;
    }

    public static void clearStaticReferences(int param0) {
        if (param0 != 967) {
          return;
        }
        field_j = null;
        field_h = null;
        field_i = null;
        field_c = null;
        field_d = null;
    }

    public final boolean hasNext() {
        int fieldTemp$0 = 0;
        int var2;
        var2 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (this.table.buckets[this.nextBucketIndex - 1] != this.nextNode) {
          return true;
        }
        while (this.table.bucketCount > this.nextBucketIndex) {
          fieldTemp$0 = this.nextBucketIndex;
          this.nextBucketIndex = this.nextBucketIndex + 1;
          if (this.table.buckets[fieldTemp$0].next != this.table.buckets[-1 + this.nextBucketIndex]) {
            this.nextNode = this.table.buckets[-1 + this.nextBucketIndex].next;
            return true;
          }
          this.nextNode = this.table.buckets[-1 + this.nextBucketIndex];
        }
        return false;
    }

    public final Object next() {
        int fieldTemp$0 = 0;
        int var2;
        IntrusiveNode var3;
        IntrusiveNode var4;
        var2 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (this.table.buckets[-1 + this.nextBucketIndex] != this.nextNode) {
          var4 = this.nextNode;
          this.lastReturned = var4;
          this.nextNode = var4.next;
          return var4;
        }
        do {
          if (this.table.bucketCount <= this.nextBucketIndex) {
            return null;
          }
          fieldTemp$0 = this.nextBucketIndex;
          this.nextBucketIndex = this.nextBucketIndex + 1;
          var3 = this.table.buckets[fieldTemp$0].next;
        } while (this.table.buckets[this.nextBucketIndex - 1] == var3);
        this.lastReturned = var3;
        this.nextNode = var3.next;
        return var3;
    }

    final static void a(boolean param0) {
        SoundCache.a((byte) -107);
        sg.field_a = param0 ? true : false;
        DequeWidgetContainer.field_F = true;
        PcmResampler.field_c.closeAllDialogs(300);
        nc.a(field_c, false, (byte) 79);
    }

    public final void remove() {
        if (null == this.lastReturned) {
          throw new IllegalStateException();
        }
        this.lastReturned.unlink(-16175);
        this.lastReturned = null;
    }

    final static byte[] a(String param0, int param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 121) {
            NodeHashTableIterator.a(true);
          }
          stackIn_3_0 = RichTextLayout.field_l.getFileByName("", param0, 24874);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("re.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ie.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    NodeHashTableIterator(IterableNodeHashTable param0) {
        this.lastReturned = null;
        try {
          this.table = param0;
          this.reset(-116);
        } catch (RuntimeException runtimeException) {
          throw ie.wrapClientException((Throwable) ((Object) runtimeException), "re.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_j = "Mouse over an icon for details";
        field_c = "Connection lost - attempting to reconnect";
    }
}
