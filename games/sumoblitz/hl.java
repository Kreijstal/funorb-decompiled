/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hl implements Iterable {
    static ki field_d;
    pj field_c;
    static volatile int field_b;
    static boolean field_e;
    private pj field_a;

    final pj b(byte param0) {
        pj var2 = null;
        if (param0 == -61) {
          var2 = this.field_c.field_m;
          if (var2 == this.field_c) {
            return null;
          } else {
            var2.c(param0 + -5045);
            return var2;
          }
        } else {
          hl.a(102);
          var2 = this.field_c.field_m;
          if (var2 == this.field_c) {
            return null;
          } else {
            var2.c(param0 + -5045);
            return var2;
          }
        }
    }

    private final pj a(pj param0, int param1) {
        pj var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        pj stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        pj stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -1) {
                break L1;
              } else {
                hl.a(-51);
                break L1;
              }
            }
            L2: {
              L3: {
                if (param0 == null) {
                  break L3;
                } else {
                  var3 = param0;
                  if (!Sumoblitz.field_L) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var3 = this.field_c.field_m;
              break L2;
            }
            if (var3 == this.field_c) {
              this.field_a = null;
              stackOut_7_0 = null;
              stackIn_8_0 = stackOut_7_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              this.field_a = var3.field_m;
              stackOut_9_0 = (pj) (var3);
              stackIn_10_0 = stackOut_9_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3_ref);
            stackOut_11_1 = new StringBuilder().append("hl.A(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (pj) ((Object) stackIn_8_0);
        } else {
          return stackIn_10_0;
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new vv((hl) (this)));
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 >= -59) {
            hl.a(-11);
        }
    }

    final pj b(int param0) {
        if (param0 != -1) {
            return (pj) null;
        }
        return this.a((pj) null, param0 + 0);
    }

    final pj a(byte param0) {
        pj var2 = null;
        var2 = this.field_a;
        if (this.field_c == var2) {
          this.field_a = null;
          return null;
        } else {
          if (param0 != -122) {
            return (pj) null;
          } else {
            this.field_a = var2.field_m;
            return var2;
          }
        }
    }

    hl() {
        this.field_c = new pj();
        this.field_c.field_o = this.field_c;
        this.field_c.field_m = this.field_c;
    }

    final void a(pj param0, byte param1) {
        if (!(param0.field_o == null)) {
            param0.c(-5106);
        }
        param0.field_m = this.field_c;
        param0.field_o = this.field_c.field_o;
        if (param1 >= -103) {
            return;
        }
        try {
            param0.field_o.field_m = param0;
            param0.field_m.field_o = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "hl.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_b = -1;
    }
}
