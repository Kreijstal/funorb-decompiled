/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class IterableNodeHashTable implements Iterable {
    int bucketCount;
    static int[] field_h;
    IntrusiveNode[] buckets;
    static volatile int field_e;
    static byte[] field_i;
    static Sprite field_b;
    static Sprite field_k;
    static String field_f;
    static int field_a;
    static long field_c;
    private IntrusiveNode lookupCursor;

    final void put(byte param0, IntrusiveNode param1, long param2) {
        IntrusiveNode var5 = null;
        try {
          if (param1.previous != null) {
            param1.unlink(0);
          }
          var5 = this.buckets[(int)(param2 & (long)(-1 + this.bucketCount))];
          param1.previous = var5.previous;
          param1.next = var5;
          param1.previous.next = param1;
          param1.key = param2;
          if (param0 != 27) {
            IterableNodeHashTable.clearSharedReferences(114);
          }
          param1.next.previous = param1;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "im.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final IntrusiveNode get(long param0, int param1) {
        IntrusiveNode var4;
        int var5_int;
        IntrusiveNode var5;
        int var6;
        var6 = HoldTheLine.field_D;
        var4 = this.buckets[(int)((long)(this.bucketCount - 1) & param0)];
        this.lookupCursor = var4.next;
        while (true) {
          if (this.lookupCursor == var4) {
            this.lookupCursor = null;
            var5_int = 104 / ((param1 - 83) / 36);
            return null;
          }
          if (~param0 != ~this.lookupCursor.key) {
            this.lookupCursor = this.lookupCursor.next;
            continue;
          }
          break;
        }
        var5 = this.lookupCursor;
        this.lookupCursor = this.lookupCursor.next;
        return var5;
    }

    public static void clearSharedReferences(int param0) {
        int var1 = -60 / ((param0 - 29) / 46);
        field_i = null;
        field_k = null;
        field_b = null;
        field_f = null;
        field_h = null;
    }

    final static boolean a(MovingEntity param0, MovingEntity param1, int param2) {
        boolean stackIn_19_0 = false;
        boolean stackIn_22_0 = false;
        boolean stackIn_27_0 = false;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (!param0.field_z) {
            return false;
          }
          if (!param1.field_z) {
            return false;
          }
          if (-param1.field_q + param0.field_q <= 1 &&
            -1 <= -param1.field_q + param0.field_q) {
            if ((param1.field_B + param0.field_B) * (param0.field_B + param1.field_B) < (-param0.position.y + param1.position.y) * (param1.position.y - param0.position.y) + (-param0.position.x + param1.position.x) * (-param0.position.x + param1.position.x)) {
              return false;
            }
            if (param2 != 32758) {
              return true;
            }
            if (param0.field_p &&
              param1.field_p) {
              stackIn_19_0 = l.a(0, param0.field_i, param1.field_k, param0.field_k, param0.direction, param1.field_i, param0.position, param1.direction, param1.position);
              return stackIn_19_0;
            }
            if (param0.field_p) {
              stackIn_22_0 = ArchiveRequest.a(param1.position, param0.field_i, param0.position, param1.field_B, param0.direction, param0.field_k, 107);
              return stackIn_22_0;
            }
            if (param1.field_p) {
              stackIn_27_0 = ArchiveRequest.a(param0.position, param1.field_i, param1.position, param0.field_B, param1.direction, param1.field_k, 109);
              return stackIn_27_0;
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("im.E(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, PacketBuffer param1) {
        int var2_int = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        try {
          StandardContentTransitionDialog.field_jb = param1.k(-70) << 5;
          var2_int = param1.f((byte) -28);
          FullscreenFocusCanvas.field_b = var2_int << 18 & 1835008;
          StandardContentTransitionDialog.field_jb = StandardContentTransitionDialog.field_jb + (var2_int >> 3);
          FullscreenFocusCanvas.field_b = FullscreenFocusCanvas.field_b + (param1.k(-125) << 2);
          var2_intLifetime1 = param1.f((byte) -48);
          ae.field_a = var2_intLifetime1 << 15 & 2064384;
          FullscreenFocusCanvas.field_b = FullscreenFocusCanvas.field_b + (var2_intLifetime1 >> 6);
          ae.field_a = ae.field_a + (param1.f((byte) -117) << 7);
          var2_intLifetime2 = param1.f((byte) -97);
          ae.field_a = ae.field_a + (var2_intLifetime2 >> 1);
          dk.field_l = (1 & var2_intLifetime2) << 16;
          if (param0 <= 70) {
            field_k = (Sprite) null;
          }
          dk.field_l = dk.field_l + param1.k(82);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "im.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private IterableNodeHashTable() throws Throwable {
        throw new Error();
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new NodeHashTableIterator(this));
    }

    static {
        field_e = 0;
        field_c = 0L;
        field_f = "(green)";
    }
}
