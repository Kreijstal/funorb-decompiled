/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class DualNodeIterator implements Iterator {
    static String field_d;
    private DualLinkedNode lastReturned;
    private IterableDualNodeDeque deque;
    static String field_g;
    static int field_b;
    private DualLinkedNode cursor;
    static double packetJitterMillis;

    final static java.awt.Container a(int param0) {
        if (null != ContextualRuntimeException.field_f) {
          return (java.awt.Container) ((Object) ContextualRuntimeException.field_f);
        }
        if (param0 != 0) {
          field_g = (String) null;
          return (java.awt.Container) ((Object) CombatEvent.d((byte) -124));
        }
        return (java.awt.Container) ((Object) CombatEvent.d((byte) -124));
    }

    final static d a(ResourceArchive param0, int param1, int param2, int param3, ResourceArchive param4) {
        RuntimeException var5 = null;
        d stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 0) {
            packetJitterMillis = 2.5194855074937275;
          }
          if (!kp.decodeSpriteSheetFromArchive(false, param3, param0, param1)) {
            return null;
          }
          stackIn_6_0 = LeaderEscortCondition.a(param4.getFile((byte) 58, param1, param3), 126);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("sp.C(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public final void remove() {
        if (null == this.lastReturned) {
          throw new IllegalStateException();
        }
        this.lastReturned.unlinkSecondary((byte) -76);
        this.lastReturned = null;
    }

    final static ClientUiComponent b(byte param0) {
        if (param0 >= -80) {
          DualNodeIterator.b((byte) -47);
          return CipherPacketBuffer.field_x.content;
        }
        return CipherPacketBuffer.field_x.content;
    }

    public final boolean hasNext() {
        return this.cursor != this.deque.sentinel;
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 > -60) {
          DualNodeIterator.b((byte) -85);
          field_g = null;
          return;
        }
        field_g = null;
    }

    public final Object next() {
        Object nextNode = this.cursor;
        if (this.deque.sentinel != nextNode) {
          this.cursor = ((DualLinkedNode) (nextNode)).secondaryNext;
        } else {
          nextNode = null;
          this.cursor = null;
        }
        this.lastReturned = (DualLinkedNode) (nextNode);
        return nextNode;
    }

    DualNodeIterator(IterableDualNodeDeque deque) {
        this.lastReturned = null;
        try {
          this.deque = deque;
          this.lastReturned = null;
          this.cursor = this.deque.sentinel.secondaryNext;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "sp.<init>(" + (deque != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = "This unit has no use for this accessory.";
        field_g = "Drawn";
        field_b = 0;
        packetJitterMillis = 0.0;
    }
}
