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
        uh var2 = this.field_f.field_m;
        int var3 = -14 % ((param0 - 15) / 50);
        if (this.field_f != var2) {
          var2.a(-6242);
          return var2;
        }
        return null;
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        int var1 = 48 % ((16 - param0) / 36);
        field_e = null;
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new ob(this));
    }

    final static String a(String param0, ue param1, byte param2, String param3, String param4) {
        RuntimeException var5 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -38) {
            field_a = -82;
          }
          if (param1.b((byte) 93)) {
            stackIn_6_0 = param3 + " - " + param1.a(param4, (byte) 75) + "%";
            return stackIn_6_0;
          }
          stackIn_4_0 = (String) (param0);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("bh.B(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
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
          if (null != param0.field_f) {
            param0.a(param1 - 31426);
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
