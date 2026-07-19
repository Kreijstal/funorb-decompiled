/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vh implements Iterable {
    static llb[] field_c;
    fh field_a;
    private fh field_b;

    final void a(byte param0) {
        fh discarded$2 = null;
        int var3 = 0;
        var3 = VoidHunters.field_G;
        L0: while (true) {
          if (this.field_a.field_e == this.field_a) {
            if (param0 < 50) {
              discarded$2 = this.a(-59);
              return;
            } else {
              return;
            }
          } else {
            this.field_a.field_e.d((byte) -35);
            continue L0;
          }
        }
    }

    private final fh a(fh param0, int param1) {
        Iterator discarded$2 = null;
        fh var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_7_0 = null;
        fh stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        fh stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -98) {
                break L1;
              } else {
                discarded$2 = this.iterator();
                break L1;
              }
            }
            L2: {
              if (param0 != null) {
                var3 = param0;
                break L2;
              } else {
                var3 = this.field_a.field_e;
                break L2;
              }
            }
            if (var3 != this.field_a) {
              this.field_b = var3.field_e;
              stackOut_8_0 = (fh) (var3);
              stackIn_9_0 = stackOut_8_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.field_b = null;
              stackOut_6_0 = null;
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3_ref);
            stackOut_10_1 = new StringBuilder().append("vh.F(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (fh) ((Object) stackIn_7_0);
        } else {
          return stackIn_9_0;
        }
    }

    final fh a(boolean param0) {
        if (param0) {
            return (fh) null;
        }
        return this.a((fh) null, -113);
    }

    final void a(int param0, fh param1) {
        if (param0 != -17569) {
            return;
        }
        try {
            if (!(null == param1.field_d)) {
                param1.d((byte) -35);
            }
            param1.field_e = this.field_a;
            param1.field_d = this.field_a.field_d;
            param1.field_d.field_e = param1;
            param1.field_e.field_d = param1;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "vh.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final fh b(int param0) {
        fh var2 = null;
        var2 = this.field_b;
        if (param0 == 8063) {
          if (var2 == this.field_a) {
            this.field_b = null;
            return null;
          } else {
            this.field_b = var2.field_e;
            return var2;
          }
        } else {
          return (fh) null;
        }
    }

    public static void b(boolean param0) {
        field_c = null;
        if (!param0) {
            vh.b(true);
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new jn((vh) (this)));
    }

    vh() {
        this.field_a = new fh();
        this.field_a.field_e = this.field_a;
        this.field_a.field_d = this.field_a;
    }

    final fh a(int param0) {
        fh var2 = null;
        var2 = this.field_a.field_e;
        if (param0 == -7481) {
          if (var2 == this.field_a) {
            return null;
          } else {
            var2.d((byte) -35);
            return var2;
          }
        } else {
          this.field_b = (fh) null;
          if (var2 == this.field_a) {
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
