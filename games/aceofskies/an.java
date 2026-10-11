/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class an {
    private kp field_c;
    static kp field_b;
    private wf field_a;

    final static sn[] a(boolean param0) {
        if (vs.field_c == null) {
          vs.field_c = mq.a((byte) 122, new int[]{1, 0});
          if (!param0) {
            return vs.field_c;
          }
          return (sn[]) null;
        }
        if (!param0) {
          return vs.field_c;
        }
        return (sn[]) null;
    }

    final wf a(byte param0) {
        wf var2 = this.field_a;
        if (this.field_c.field_e == var2) {
          this.field_a = null;
          return null;
        }
        this.field_a = var2.field_c;
        if (param0 == 120) {
          return var2;
        }
        this.a((byte) -65);
        return var2;
    }

    final wf a(int param0) {
        wf var2 = this.field_a;
        if (this.field_c.field_e == var2) {
          this.field_a = null;
          return null;
        }
        int var3 = -30 % ((param0 + 74) / 43);
        this.field_a = var2.field_a;
        return var2;
    }

    final wf a(wf param0, int param1) {
        wf var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        wf stackIn_8_0 = null;
        wf stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != null) {
            var3 = param0;
          } else {
            var3 = this.field_c.field_e.field_c;
          }
          if (this.field_c.field_e == var3) {
            this.field_a = null;
            stackIn_5_0 = null;
            return (wf) (stackIn_5_0);
          }
          if (param1 != 0) {
            stackIn_8_0 = (wf) null;
            return stackIn_8_0;
          }
          this.field_a = var3.field_c;
          stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("an.F(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final wf c(int param0) {
        wf var2 = this.field_c.field_e.field_a;
        if (this.field_c.field_e == var2) {
          this.field_a = null;
          return null;
        }
        this.field_a = var2.field_a;
        if (param0 == -1372) {
          return var2;
        }
        this.field_c = (kp) null;
        return var2;
    }

    public static void b(int param0) {
        if (param0 != 32041) {
          return;
        }
        field_b = null;
    }

    final wf a(int param0, wf param1) {
        wf var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        wf stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 40) {
            field_b = (kp) null;
          }
          if (param1 != null) {
            var3 = param1;
          } else {
            var3 = this.field_c.field_e.field_a;
          }
          if (var3 == this.field_c.field_e) {
            this.field_a = null;
            stackIn_8_0 = null;
            return (wf) (stackIn_8_0);
          }
          this.field_a = var3.field_a;
          stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("an.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final wf b(boolean param0) {
        if (!param0) {
          return (wf) null;
        }
        wf var2 = this.field_c.field_e.field_c;
        if (this.field_c.field_e == var2) {
          this.field_a = null;
          return null;
        }
        this.field_a = var2.field_c;
        return var2;
    }

    an(kp param0) {
        try {
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "an.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = new kp();
    }
}
