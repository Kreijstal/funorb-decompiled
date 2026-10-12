/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sp implements Iterator {
    static String field_d;
    private DualLinkedNode field_a;
    private wg field_c;
    static String field_g;
    static int field_b;
    private DualLinkedNode field_f;
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
          if (!kp.a(false, param3, param0, param1)) {
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
        if (null == this.field_a) {
          throw new IllegalStateException();
        }
        this.field_a.unlinkSecondary((byte) -76);
        this.field_a = null;
    }

    final static je b(byte param0) {
        if (param0 >= -80) {
          sp.b((byte) -47);
          return CipherPacketBuffer.field_x.field_Jb;
        }
        return CipherPacketBuffer.field_x.field_Jb;
    }

    public final boolean hasNext() {
        return this.field_f != this.field_c.field_f;
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 > -60) {
          sp.b((byte) -85);
          field_g = null;
          return;
        }
        field_g = null;
    }

    public final Object next() {
        Object var1 = this.field_f;
        if (this.field_c.field_f != var1) {
          this.field_f = ((DualLinkedNode) (var1)).secondaryNext;
        } else {
          var1 = null;
          this.field_f = null;
        }
        this.field_a = (DualLinkedNode) (var1);
        return var1;
    }

    sp(wg param0) {
        this.field_a = null;
        try {
          this.field_c = param0;
          this.field_a = null;
          this.field_f = this.field_c.field_f.secondaryNext;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "sp.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = "This unit has no use for this accessory.";
        field_g = "Drawn";
        field_b = 0;
        packetJitterMillis = 0.0;
    }
}
