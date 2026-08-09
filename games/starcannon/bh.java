/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bh implements Iterable {
    static mj field_b;
    uh field_f;
    static rk field_e;
    static int field_d;
    static int[] field_c;
    static int field_a;
    static boolean field_g;

    final uh b(int param0) {
        uh var2;
        int var3;
        var2 = this.field_f.field_m;
        var3 = -14 % ((param0 - 15) / 50);
        if (this.field_f == var2) {
          return null;
        } else {
          var2.a(-6242);
          return var2;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        int var1 = 48 % ((16 - param0) / 36);
        field_e = null;
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new ob((bh) (this)));
    }

    final static String a(String param0, ue param1, byte param2, String param3, String param4) {
        RuntimeException var5 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == -38) {
                break L1;
              } else {
                field_a = -82;
                break L1;
              }
            }
            if (param1.b((byte) 93)) {
              stackIn_6_0 = param3 + " - " + param1.a(param4, (byte) 75) + "%";
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = (String) (param0);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("bh.B(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param4 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_10_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    private bh() throws Throwable {
        throw new Error();
    }

    final void a(uh param0, int param1) {
        try {
            if (param1 != 25184) {
                this.b(-80);
            }
            if (!(null == param0.field_f)) {
                param0.a(param1 + -31426);
            }
            param0.field_m = this.field_f;
            param0.field_f = this.field_f.field_f;
            param0.field_f.field_m = param0;
            param0.field_m.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "bh.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_b = new mj("usename");
        field_d = -1;
        field_c = new int[8192];
        field_e = new rk();
    }
}
