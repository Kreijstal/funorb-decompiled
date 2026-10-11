/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jo {
    private gb field_d;
    static boolean field_a;
    static ah field_f;
    private gb field_c;
    static String field_b;
    static boolean field_e;

    final int d(int param0) {
        int var4 = TetraLink.field_J;
        int var2 = param0;
        gb var3 = this.field_d.field_o;
        while (var3 != this.field_d) {
          var3 = var3.field_o;
          var2++;
        }
        return var2;
    }

    final static boolean b(int param0) {
        if (param0 != 0) {
          return false;
        }
        if (hn.field_M == null) {
          return false;
        }
        if (!hn.field_M.d(0)) {
          return false;
        }
        return true;
    }

    public static void a(int param0) {
        if (param0 != 21332) {
          return;
        }
        field_b = null;
        field_f = null;
    }

    final gb a(boolean param0) {
        gb var2 = this.field_c;
        if (this.field_d == var2) {
          this.field_c = null;
          return null;
        }
        if (!param0) {
          this.field_c = var2.field_o;
          return var2;
        }
        field_a = true;
        this.field_c = var2.field_o;
        return var2;
    }

    final gb a(byte param0) {
        int var2 = 15 % ((param0 - 20) / 62);
        gb var3 = this.field_d.field_o;
        if (var3 != this.field_d) {
          this.field_c = var3.field_o;
          return var3;
        }
        this.field_c = null;
        return null;
    }

    final gb c(int param0) {
        if (param0 != -15464) {
          return (gb) null;
        }
        gb var2 = this.field_d.field_o;
        if (var2 != this.field_d) {
          var2.e(0);
          return var2;
        }
        return null;
    }

    final static void a(int[] param0, int param1, int param2) {
        try {
          hg.field_f[param1] = param0;
          kk.field_X[param1] = new cl(param1);
          if (param2 != -13850) {
            field_a = true;
          }
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "jo.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public jo() {
        this.field_d = new gb();
        this.field_d.field_o = this.field_d;
        this.field_d.field_s = this.field_d;
    }

    final void a(gb param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != param0.field_s) {
            param0.e(param1 + 0);
          }
          param0.field_s = this.field_d.field_s;
          param0.field_o = this.field_d;
          param0.field_s.field_o = param0;
          param0.field_o.field_s = param0;
          if (param1 == 0) {
            return;
          }
          field_b = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("jo.E(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_b = "You have not yet unlocked this option for use.";
    }
}
