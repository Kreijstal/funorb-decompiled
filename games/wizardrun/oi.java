/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class oi {
    static Random field_c;
    wl field_a;
    static int[] field_f;
    private wl field_b;
    static String[] field_e;
    static String field_d;

    final void a(wl param0, int param1) {
        try {
          if (param0.field_c != null) {
            param0.a(false);
          }
          if (param1 != -5441) {
            field_d = (String) null;
          }
          param0.field_b = this.field_a.field_b;
          param0.field_c = this.field_a;
          param0.field_c.field_b = param0;
          param0.field_b.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "oi.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final wl b(int param0) {
        wl var2 = this.field_a.field_b;
        if (var2 != this.field_a) {
          int var3 = -45 % ((param0 - 32) / 56);
          var2.a(false);
          return var2;
        }
        return null;
    }

    final wl c(int param0) {
        wl var2 = this.field_a.field_c;
        if (param0 != 8192) {
          field_f = (int[]) null;
          if (this.field_a != var2) {
            var2.a(false);
            return var2;
          }
          return null;
        }
        if (this.field_a != var2) {
          var2.a(false);
          return var2;
        }
        return null;
    }

    final boolean f(int param0) {
        if (param0 == 8192) {
          return this.field_a.field_b == this.field_a ? true : false;
        }
        this.field_b = (wl) null;
        return this.field_a.field_b == this.field_a ? true : false;
    }

    final void a(boolean param0) {
        wl var2 = null;
        int var3 = wizardrun.field_H;
        while (true) {
          var2 = this.field_a.field_b;
          if (var2 == this.field_a) {
            break;
          }
          var2.a(false);
        }
        if (!param0) {
          this.field_b = null;
          return;
        }
    }

    final void a(wl param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != param0.field_c) {
            param0.a(param1);
          }
          param0.field_b = this.field_a;
          param0.field_c = this.field_a.field_c;
          param0.field_c.field_b = param0;
          param0.field_b.field_c = param0;
          if (!param1) {
            return;
          }
          field_e = (String[]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("oi.E(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final wl d(int param0) {
        wl var2 = this.field_b;
        if (var2 == this.field_a) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2.field_b;
        if (param0 == 8192) {
          return var2;
        }
        return (wl) null;
    }

    final wl a(byte param0) {
        wl var2 = null;
        wl var2Lifetime1;
        if (param0 != 11) {
          this.field_a = (wl) null;
          var2 = this.field_a.field_c;
          if (this.field_a == var2) {
            this.field_b = null;
            return null;
          }
          this.field_b = var2.field_c;
          return var2;
        }
        var2Lifetime1 = this.field_a.field_c;
        if (this.field_a == var2Lifetime1) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2Lifetime1.field_c;
        return var2Lifetime1;
    }

    public static void e(int param0) {
        field_d = null;
        if (param0 <= 9) {
          return;
        }
        field_e = null;
        field_c = null;
        field_f = null;
    }

    final wl a(int param0) {
        wl var2 = this.field_b;
        if (this.field_a == var2) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2.field_c;
        int var3 = -110 % ((param0 - 17) / 47);
        return var2;
    }

    public oi() {
        this.field_a = new wl();
        this.field_a.field_b = this.field_a;
        this.field_a.field_c = this.field_a;
    }

    final wl b(byte param0) {
        wl var2 = null;
        wl var2Lifetime1;
        if (param0 < 45) {
          field_f = (int[]) null;
          var2 = this.field_a.field_b;
          if (var2 != this.field_a) {
            this.field_b = var2.field_b;
            return var2;
          }
          this.field_b = null;
          return null;
        }
        var2Lifetime1 = this.field_a.field_b;
        if (var2Lifetime1 != this.field_a) {
          this.field_b = var2Lifetime1.field_b;
          return var2Lifetime1;
        }
        this.field_b = null;
        return null;
    }

    static {
        field_f = new int[8192];
        field_c = new Random();
        field_d = "[Hold to charge]";
        field_e = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
