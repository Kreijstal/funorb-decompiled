/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lj implements Iterable {
    static int[] field_c;
    static String field_b;
    ta field_a;
    static int field_d;

    public static void b(int param0) {
        field_b = null;
        field_c = null;
        int var1 = -71 / ((param0 - 70) / 43);
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new wo((lj) (this)));
    }

    final void a(ta param0, byte param1) {
        try {
            if (!(param0.field_j == null)) {
                param0.h(0);
            }
            param0.field_p = this.field_a;
            param0.field_j = this.field_a.field_j;
            param0.field_j.field_p = param0;
            if (param1 >= -13) {
                field_b = (String) null;
            }
            param0.field_p.field_j = param0;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "lj.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(nj param0, byte param1) {
        synchronized (Torquing.field_v) {
            int var3 = 127 / ((17 - param1) / 41);
            Torquing.field_v.field_r.a(param0);
        }
    }

    final static String a(byte[] param0, boolean param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param1) {
              stackIn_4_0 = hk.a(param0.length, true, 0, param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("lj.B(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final ta a(int param0) {
        ta var2;
        var2 = this.field_a.field_p;
        if (param0 == 4) {
          if (var2 == this.field_a) {
            return null;
          } else {
            var2.h(0);
            return var2;
          }
        } else {
          this.a(121);
          if (var2 == this.field_a) {
            return null;
          } else {
            var2.h(0);
            return var2;
          }
        }
    }

    private lj() throws Throwable {
        throw new Error();
    }

    static {
        field_c = new int[4];
        field_b = "LEVEL:";
    }
}
