/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wh implements Iterable {
    ug field_a;
    static String[] field_c;
    static volatile int field_d;
    static eh field_b;

    final void a(int param0, ug param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.field_i != null) {
            param1.a(param0 - 6875);
          }
          param1.field_l = this.field_a;
          param1.field_i = this.field_a.field_i;
          param1.field_i.field_l = param1;
          param1.field_l.field_i = param1;
          if (param0 == 6753) {
            return;
          }
          this.field_a = (ug) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("wh.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new di(this));
    }

    final ug a(int param0) {
        if (param0 != 14) {
          return (ug) null;
        }
        ug var2 = this.field_a.field_l;
        if (this.field_a != var2) {
          var2.a(92);
          return var2;
        }
        return null;
    }

    final static int a(int param0, CharSequence param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 1) {
            stackIn_4_0 = kf.a(param2, param1, true, 48);
            return stackIn_4_0;
          }
          stackIn_2_0 = 61;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("wh.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 >= -46) {
          field_b = (eh) null;
          field_c = null;
          field_b = null;
          return;
        }
        field_c = null;
        field_b = null;
    }

    private wh() throws Throwable {
        throw new Error();
    }

    final static void a(long param0, int param1) {
        if (0L >= param0) {
          return;
        }
        if (param1 != 19406) {
          wh.a((byte) -4);
          if (param0 % 10L == 0L) {
            ba.a((byte) -123, -1L + param0);
            ba.a((byte) -126, 1L);
            return;
          }
          ba.a((byte) -102, param0);
          return;
        }
        if (param0 % 10L == 0L) {
          ba.a((byte) -123, -1L + param0);
          ba.a((byte) -126, 1L);
          return;
        }
        ba.a((byte) -102, param0);
    }

    static {
        field_c = new String[255];
        field_d = 0;
        field_b = new eh(14, 0, 4, 1);
    }
}
