/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class DualLinkDequeIterator implements Iterator {
    private DualLinkNode field_c;
    private IterableDualLinkDeque field_b;
    private DualLinkNode field_a;

    public final void remove() {
        if (null == this.field_a) {
          throw new IllegalStateException();
        }
        this.field_a.unlinkSecondary(0);
        this.field_a = null;
    }

    final static void a(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = BachelorFridge.field_y;
        try {
          pga.field_b = new IntrusiveNodeHashTable(128);
          if (param0 != 80) {
            return;
          }
          for (var1_int = 0; fla.field_t.length > var1_int; var1_int++) {
            pga.field_b.a((long)fla.field_t[var1_int].hashCode(), (byte) 61, new ji(var1_int));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var1), "ev.A(" + param0 + ')');
        }
    }

    public final boolean hasNext() {
        return this.field_b.field_a != this.field_c;
    }

    final static AntialiasedBitmapFont a(int param0, int param1, vr param2, vr param3, int param4) {
        RuntimeException var5 = null;
        AntialiasedBitmapFont stackIn_2_0 = null;
        AntialiasedBitmapFont stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 128) {
            stackIn_2_0 = (AntialiasedBitmapFont) null;
            return stackIn_2_0;
          }
          if (!g.a(param4, param1, -30744, param2)) {
            return null;
          }
          stackIn_7_0 = wa.a(param0 - 21359, param3.b(-38, param4, param1));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("ev.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param4).append(')').toString());
        }
    }

    public final Object next() {
        Object var1 = this.field_c;
        if (this.field_b.field_a != var1) {
          this.field_c = ((DualLinkNode) (var1)).secondaryNext;
        } else {
          this.field_c = null;
          var1 = null;
        }
        this.field_a = (DualLinkNode) (var1);
        return var1;
    }

    DualLinkDequeIterator(IterableDualLinkDeque param0) {
        this.field_a = null;
        try {
          this.field_b = param0;
          this.field_c = this.field_b.field_a.secondaryNext;
          this.field_a = null;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "ev.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
