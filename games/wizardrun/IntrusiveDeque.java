/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class IntrusiveDeque {
    static Random field_c;
    IntrusiveNode field_a;
    static int[] field_f;
    private IntrusiveNode field_b;
    static String[] field_e;
    static String field_d;

    final void a(IntrusiveNode param0, int param1) {
        try {
          if (param0.previous != null) {
            param0.a(false);
          }
          if (param1 != -5441) {
            field_d = (String) null;
          }
          param0.next = this.field_a.next;
          param0.previous = this.field_a;
          param0.previous.next = param0;
          param0.next.previous = param0;
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "oi.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final IntrusiveNode b(int param0) {
        IntrusiveNode var2 = this.field_a.next;
        if (var2 != this.field_a) {
          int var3 = -45 % ((param0 - 32) / 56);
          var2.a(false);
          return var2;
        }
        return null;
    }

    final IntrusiveNode c(int param0) {
        IntrusiveNode var2 = this.field_a.previous;
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
          return this.field_a.next == this.field_a ? true : false;
        }
        this.field_b = (IntrusiveNode) null;
        return this.field_a.next == this.field_a ? true : false;
    }

    final void a(boolean param0) {
        IntrusiveNode var2 = null;
        int var3 = wizardrun.field_H;
        while (true) {
          var2 = this.field_a.next;
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

    final void a(IntrusiveNode param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != param0.previous) {
            param0.a(param1);
          }
          param0.next = this.field_a;
          param0.previous = this.field_a.previous;
          param0.previous.next = param0;
          param0.next.previous = param0;
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

    final IntrusiveNode d(int param0) {
        IntrusiveNode var2 = this.field_b;
        if (var2 == this.field_a) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2.next;
        if (param0 == 8192) {
          return var2;
        }
        return (IntrusiveNode) null;
    }

    final IntrusiveNode a(byte param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 != 11) {
          this.field_a = (IntrusiveNode) null;
          var2 = this.field_a.previous;
          if (this.field_a == var2) {
            this.field_b = null;
            return null;
          }
          this.field_b = var2.previous;
          return var2;
        }
        var2Lifetime1 = this.field_a.previous;
        if (this.field_a == var2Lifetime1) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2Lifetime1.previous;
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

    final IntrusiveNode a(int param0) {
        IntrusiveNode var2 = this.field_b;
        if (this.field_a == var2) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2.previous;
        int var3 = -110 % ((param0 - 17) / 47);
        return var2;
    }

    public IntrusiveDeque() {
        this.field_a = new IntrusiveNode();
        this.field_a.next = this.field_a;
        this.field_a.previous = this.field_a;
    }

    final IntrusiveNode b(byte param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 < 45) {
          field_f = (int[]) null;
          var2 = this.field_a.next;
          if (var2 != this.field_a) {
            this.field_b = var2.next;
            return var2;
          }
          this.field_b = null;
          return null;
        }
        var2Lifetime1 = this.field_a.next;
        if (var2Lifetime1 != this.field_a) {
          this.field_b = var2Lifetime1.next;
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
