/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class IterableNodeHashTable implements Iterable {
    private IntrusiveNode lookupCursor;
    static gi[] field_d;
    static int field_c;
    int bucketCount;
    static String[] field_f;
    IntrusiveNode[] buckets;
    static String field_a;

    final IntrusiveNode get(int guard, long key) {
        int var6 = EscapeVector.obfuscationControl;
        if (guard != -2678) {
          this.bucketCount = -103;
        }
        IntrusiveNode var4 = this.buckets[(int)((long)(-1 + this.bucketCount) & key)];
        this.lookupCursor = var4.next;
        while (var4 != this.lookupCursor) {
          if (~key == ~this.lookupCursor.key) {
            IntrusiveNode var5 = this.lookupCursor;
            this.lookupCursor = this.lookupCursor.next;
            return var5;
          }
          this.lookupCursor = this.lookupCursor.next;
        }
        this.lookupCursor = null;
        return null;
    }

    final static int minimumButtonX(dk[] buttons, byte guard) {
        String stackIn_18_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          int var2_int = 2147483647;
          dk[] var3 = buttons;
          for (int var4 = 0; var4 < var3.length; var4++) {
            dk var5 = var3[var4];
            if (var5.field_f < var2_int) {
              var2_int = var5.field_f;
            }
          }
          if (guard <= 9) {
            dk[] var7 = (dk[]) null;
            IterableNodeHashTable.minimumButtonX((dk[]) null, (byte) 66);
          }
          if (var2_int != 2147483647) {
            int stackIn_14_0 = var2_int;
            return stackIn_14_0;
          }
          int stackIn_12_0 = 0;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_17_0 = var2;
          StringBuilder stackIn_17_1 = new StringBuilder().append("qm.A(");
          if (buttons == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(guard).append(')').toString());
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new NodeHashTableIterator(this));
    }

    final void put(long key, byte guard, IntrusiveNode node) {
        if (node.previous != null) {
          node.unlink((byte) -51);
        }
        if (guard != -106) {
          return;
        }
        try {
          IntrusiveNode var5 = this.buckets[(int)(key & (long)(-1 + this.bucketCount))];
          node.previous = var5.previous;
          node.next = var5;
          node.previous.next = node;
          node.next.previous = node;
          node.key = key;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "qm.B(" + key + ',' + guard + ',' + (node != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(byte guard) {
        field_d = null;
        field_a = null;
        field_f = null;
        if (guard < 86) {
          field_d = (gi[]) null;
        }
    }

    private IterableNodeHashTable() throws Throwable {
        throw new Error();
    }

    static {
        field_c = 64;
        field_a = "Age:";
    }
}
