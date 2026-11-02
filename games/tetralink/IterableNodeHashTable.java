/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class IterableNodeHashTable implements Iterable {
    static hl field_f;
    IntrusiveNode[] buckets;
    private IntrusiveNode field_g;
    static java.awt.Frame field_h;
    int bucketCount;
    static String field_c;
    static int field_e;
    static volatile int field_a;
    static int[] field_b;

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        if (param0 != -4099) {
          return;
        }
        field_h = null;
        field_f = null;
    }

    final void put(long param0, IntrusiveNode param1, boolean param2) {
        IntrusiveNode var5 = null;
        try {
          if (null != param1.previous) {
            param1.unlink(false);
          }
          if (param2) {
            this.field_g = (IntrusiveNode) null;
          }
          var5 = this.buckets[(int)(param0 & (long)(-1 + this.bucketCount))];
          param1.next = var5;
          param1.previous = var5.previous;
          param1.previous.next = param1;
          param1.next.previous = param1;
          param1.key = param0;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "ea.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final IntrusiveNode get(long param0, int param1) {
        IntrusiveNode var6 = null;
        int var7 = TetraLink.field_J;
        IntrusiveNode var4 = this.buckets[(int)((long)(-1 + this.bucketCount) & param0)];
        int var5 = -105 % ((param1 - 41) / 63);
        this.field_g = var4.next;
        while (var4 != this.field_g) {
          if (this.field_g.key == param0) {
            var6 = this.field_g;
            this.field_g = this.field_g.next;
            return var6;
          }
          this.field_g = this.field_g.next;
        }
        this.field_g = null;
        return null;
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new NodeHashTableIterator(this));
    }

    IterableNodeHashTable(int param0) {
        int var2 = 0;
        IntrusiveNode dupTemp$0 = null;
        IntrusiveNode var3 = null;
        this.bucketCount = param0;
        this.buckets = new IntrusiveNode[param0];
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$0 = new IntrusiveNode();
          var3 = dupTemp$0;
          this.buckets[var2] = dupTemp$0;
          var3.next = var3;
          var3.previous = var3;
        }
    }

    static {
        field_c = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_a = 0;
        field_b = new int[4];
    }
}
