/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vh implements Iterable {
    static llb[] field_c;
    fh field_a;
    private fh field_b;

    final void a(byte param0) {
        int var3 = 0;
        var3 = VoidHunters.field_G;
        L0: while (true) {
          if (((vh) this).field_a.field_e == ((vh) this).field_a) {
            if (param0 < 50) {
              fh discarded$2 = ((vh) this).a(-59);
              return;
            } else {
              return;
            }
          } else {
            ((vh) this).field_a.field_e.d((byte) -35);
            continue L0;
          }
        }
    }

    private final fh a(fh param0) {
        fh var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        fh stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        fh stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param0 != null) {
                var3 = param0;
                break L1;
              } else {
                var3 = ((vh) this).field_a.field_e;
                break L1;
              }
            }
            if (var3 != ((vh) this).field_a) {
              ((vh) this).field_b = var3.field_e;
              stackOut_6_0 = (fh) var3;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              ((vh) this).field_b = null;
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (fh) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("vh.F(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + -113 + ')');
        }
        return stackIn_7_0;
    }

    final fh a(boolean param0) {
        if (param0) {
            return null;
        }
        int discarded$0 = -113;
        return this.a((fh) null);
    }

    final void a(int param0, fh param1) {
        if (param0 != -17569) {
            return;
        }
        try {
            if (!(null == param1.field_d)) {
                param1.d((byte) -35);
            }
            param1.field_e = ((vh) this).field_a;
            param1.field_d = ((vh) this).field_a.field_d;
            param1.field_d.field_e = param1;
            param1.field_e.field_d = param1;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "vh.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final fh b(int param0) {
        fh var2 = null;
        var2 = ((vh) this).field_b;
        if (param0 == 8063) {
          if (var2 == ((vh) this).field_a) {
            ((vh) this).field_b = null;
            return null;
          } else {
            ((vh) this).field_b = var2.field_e;
            return var2;
          }
        } else {
          return null;
        }
    }

    public static void b(boolean param0) {
        field_c = null;
        if (!param0) {
            vh.b(true);
        }
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new jn((vh) this);
    }

    vh() {
        ((vh) this).field_a = new fh();
        ((vh) this).field_a.field_e = ((vh) this).field_a;
        ((vh) this).field_a.field_d = ((vh) this).field_a;
    }

    final fh a(int param0) {
        fh var2 = null;
        var2 = ((vh) this).field_a.field_e;
        if (param0 == -7481) {
          if (var2 == ((vh) this).field_a) {
            return null;
          } else {
            var2.d((byte) -35);
            return var2;
          }
        } else {
          ((vh) this).field_b = null;
          if (var2 == ((vh) this).field_a) {
            return null;
          } else {
            var2.d((byte) -35);
            return var2;
          }
        }
    }

    static {
    }
}
