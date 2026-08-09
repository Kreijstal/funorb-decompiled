/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vh implements Iterable {
    static llb[] field_c;
    fh field_a;
    private fh field_b;

    final void a(byte param0) {
        int var3;
        var3 = VoidHunters.field_G;
        L0: while (true) {
          if (this.field_a.field_e == this.field_a) {
            if (param0 < 50) {
              this.a(-59);
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
        fh var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_7_0 = null;
        fh stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 <= -98) {
                break L1;
              } else {
                this.iterator();
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
              stackIn_9_0 = (fh) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.field_b = null;
              stackIn_7_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3_ref);

            stackIn_12_1 = new StringBuilder().append("vh.F(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
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
        fh var2;
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
        fh var2;
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
