/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ev implements Iterator {
    private eo field_c;
    private ou field_b;
    private eo field_a;

    public final void remove() {
        if (null == this.field_a) {
            throw new IllegalStateException();
        }
        this.field_a.b(0);
        this.field_a = null;
    }

    final static void a(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = BachelorFridge.field_y;
        try {
          L0: {
            pga.field_b = new js(128);
            if (param0 == 80) {
              var1_int = 0;
              L1: while (true) {
                if (fla.field_t.length <= var1_int) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  pga.field_b.a((long)fla.field_t[var1_int].hashCode(), (byte) 61, new ji(var1_int));
                  var1_int++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1), "ev.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final boolean hasNext() {
        return this.field_b.field_a != this.field_c;
    }

    final static sba a(int param0, int param1, vr param2, vr param3, int param4) {
        RuntimeException var5 = null;
        sba stackIn_2_0 = null;
        sba stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 128) {
              if (g.a(param4, param1, -30744, param2)) {
                stackIn_7_0 = wa.a(param0 + -21359, param3.b(-38, param4, param1));
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            } else {
              stackIn_2_0 = (sba) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("ev.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
    }

    public final Object next() {
        Object var1 = this.field_c;
        if (this.field_b.field_a != var1) {
            this.field_c = ((eo) (var1)).field_m;
        } else {
            this.field_c = null;
            var1 = null;
        }
        this.field_a = (eo) (var1);
        return var1;
    }

    ev(ou param0) {
        this.field_a = null;
        try {
            this.field_b = param0;
            this.field_c = this.field_b.field_a.field_m;
            this.field_a = null;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ev.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
