/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hs implements Iterable {
    wt field_c;
    private wt field_b;
    static int[] field_a;

    final static boolean a(boolean param0, int param1, int param2) {
        boolean discarded$2 = false;
        if (!param0) {
          discarded$2 = hs.a(true, -18, 122);
          return to.b(-7493, param1, param2) & la.a(param2, param1, (byte) 70);
        } else {
          return to.b(-7493, param1, param2) & la.a(param2, param1, (byte) 70);
        }
    }

    final void a(wt param0, byte param1) {
        try {
            if (!(null == param0.field_f)) {
                param0.d(-114);
            }
            param0.field_j = this.field_c;
            param0.field_f = this.field_c.field_f;
            param0.field_f.field_j = param0;
            int var3_int = 43 % ((-3 - param1) / 51);
            param0.field_j.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "hs.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 != -127) {
            return;
        }
        field_a = null;
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new js((hs) (this)));
    }

    final wt a(boolean param0) {
        wt var2 = null;
        var2 = this.field_b;
        if (var2 == this.field_c) {
          this.field_b = null;
          return null;
        } else {
          this.field_b = var2.field_j;
          if (!param0) {
            return (wt) null;
          } else {
            return var2;
          }
        }
    }

    private final wt a(wt param0, int param1) {
        wt var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        wt stackIn_10_0 = null;
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
        wt stackOut_9_0 = null;
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
              if (param1 == 128) {
                break L1;
              } else {
                this.field_c = (wt) null;
                break L1;
              }
            }
            L2: {
              if (param0 != null) {
                var3 = param0;
                break L2;
              } else {
                var3 = this.field_c.field_j;
                break L2;
              }
            }
            if (this.field_c == var3) {
              this.field_b = null;
              stackOut_7_0 = null;
              stackIn_8_0 = stackOut_7_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              this.field_b = var3.field_j;
              stackOut_9_0 = (wt) (var3);
              stackIn_10_0 = stackOut_9_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3_ref);
            stackOut_11_1 = new StringBuilder().append("hs.B(");
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
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (wt) ((Object) stackIn_8_0);
        } else {
          return stackIn_10_0;
        }
    }

    final wt a(int param0) {
        int var2 = -23 / ((param0 - -5) / 45);
        return this.a((wt) null, 128);
    }

    final wt b(boolean param0) {
        wt var2 = null;
        var2 = this.field_c.field_j;
        if (var2 != this.field_c) {
          var2.d(-119);
          if (param0) {
            return (wt) null;
          } else {
            return var2;
          }
        } else {
          return null;
        }
    }

    hs() {
        this.field_c = new wt();
        this.field_c.field_j = this.field_c;
        this.field_c.field_f = this.field_c;
    }

    static {
        field_a = new int[128];
    }
}
