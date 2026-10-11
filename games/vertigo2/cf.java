/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class cf implements Iterator {
    private gp field_c;
    private sr field_e;
    private gp field_d;
    static String field_b;
    static volatile int field_a;

    final static cr a(boolean param0) {
        if (!param0) {
          return (cr) null;
        }
        return pp.f(-126);
    }

    final static boolean a(int param0, int param1, int param2) {
        if (param0 != 31077) {
          return true;
        }
        if (de.field_f == 13) {
          on.a(9110);
          return true;
        }
        if (de.field_f == 102) {
          ji.field_n.a((byte) 34);
          return true;
        }
        if (ji.field_n == null) {
          return false;
        }
        if (ji.field_n.a(param1, false, param2)) {
          return true;
        }
        return false;
    }

    final static void a(int param0, int param1, int param2, byte param3) {
        if (param3 < 47) {
          return;
        }
        if (param0 == 0 &&
          rm.field_B != param1) {
          rm.field_B = param1;
          dc.field_B = true;
          jm.d(1, param2);
        }
        if (param0 == 1 &&
          param1 != oa.field_p) {
          oa.field_p = param1;
          dc.field_B = true;
          jm.d(1, param2);
        }
        if (2 != param0) {
          return;
        }
        if (param1 == mf.field_b) {
          return;
        }
        mf.field_b = param1;
        dc.field_B = true;
        jm.d(1, param2);
    }

    public final void remove() {
        if (null == this.field_c) {
          throw new IllegalStateException();
        }
        this.field_c.a(-105);
        this.field_c = null;
    }

    public static void a(int param0) {
        int var1 = 21 / ((36 - param0) / 55);
        field_b = null;
    }

    final static int a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > 68) {
            stackIn_4_0 = li.a(10, true, param1, true);
            return stackIn_4_0;
          }
          stackIn_2_0 = -31;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("cf.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public final Object next() {
        Object var1 = this.field_d;
        if (this.field_e.field_b == var1) {
          this.field_d = null;
          var1 = null;
        } else {
          this.field_d = ((gp) (var1)).field_p;
        }
        this.field_c = (gp) (var1);
        return var1;
    }

    final static int a(int param0, CharSequence param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 83 % ((param2 - 8) / 48);
          stackIn_1_0 = li.a(param0, true, param1, true);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("cf.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param2).append(')').toString());
        }
    }

    public final boolean hasNext() {
        return this.field_e.field_b != this.field_d;
    }

    cf(sr param0) {
        this.field_c = null;
        try {
          this.field_e = param0;
          this.field_c = null;
          this.field_d = this.field_e.field_b.field_p;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "cf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = 0;
        field_b = "Your request to join has been declined.";
    }
}
