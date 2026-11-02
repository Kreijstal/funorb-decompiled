/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class IterableNodeHashTable implements Iterable {
    static String field_d;
    static boolean field_e;
    private IntrusiveNode field_b;
    int field_c;
    IntrusiveNode[] field_a;

    public final Iterator iterator() {
        return (Iterator) ((Object) new NodeHashTableIterator(this));
    }

    final static Sprite[] a(String param0, byte param1, String param2, Archive param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Archive var6 = null;
        Sprite[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -70) {
            var6 = (Archive) null;
            IterableNodeHashTable.a((String) null, (byte) 73, (String) null, (Archive) null);
          }
          var4_int = param3.c(-1, param2);
          var5 = param3.a(-103, var4_int, param0);
          stackIn_3_0 = SocketConnector.a(param3, var4_int, var5, true);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("ce.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static long b(int param0) {
        if (param0 != 1) {
          field_d = (String) null;
          return ll.a(1000) - dm.field_c;
        }
        return ll.a(1000) - dm.field_c;
    }

    public static void a(int param0) {
        if (param0 != -1) {
          IterableNodeHashTable.b(-112);
          field_d = null;
          return;
        }
        field_d = null;
    }

    final void a(IntrusiveNode param0, byte param1, long param2) {
        IntrusiveNode var5 = null;
        RuntimeException var5_ref = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.next != null) {
            param0.unlink((byte) 12);
          }
          var5 = this.field_a[(int)(param2 & (long)(this.field_c - 1))];
          param0.next = var5.next;
          param0.previous = var5;
          param0.next.previous = param0;
          param0.previous.next = param0;
          param0.key = param2;
          if (param1 <= -49) {
            return;
          }
          IterableNodeHashTable.a(-9);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("ce.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final IntrusiveNode a(long param0, byte param1) {
        IntrusiveNode var5 = null;
        int var6 = Terraphoenix.field_V;
        IntrusiveNode var4 = this.field_a[(int)((long)(-1 + this.field_c) & param0)];
        this.field_b = var4.previous;
        while (var4 != this.field_b) {
          if (param0 == this.field_b.key) {
            var5 = this.field_b;
            this.field_b = this.field_b.previous;
            return var5;
          }
          this.field_b = this.field_b.previous;
        }
        this.field_b = null;
        if (param1 != -21) {
          return (IntrusiveNode) null;
        }
        return null;
    }

    private IterableNodeHashTable() throws Throwable {
        throw new Error();
    }

    static {
        field_e = false;
        field_d = "ACT IV: ";
    }
}
