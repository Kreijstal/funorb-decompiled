/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd {
    static int field_c;
    private IntrusiveNode field_d;
    private bk field_e;
    static String field_b;
    static volatile int field_a;

    final IntrusiveNode b(byte param0) {
        IntrusiveNode var2 = this.field_e.field_a.next;
        if (var2 == this.field_e.field_a) {
          this.field_d = null;
          return null;
        }
        this.field_d = var2.next;
        if (param0 != -33) {
          return (IntrusiveNode) null;
        }
        return var2;
    }

    public static void c(int param0) {
        field_b = null;
        if (param0 != -2057) {
          field_a = 11;
        }
    }

    final IntrusiveNode a(int param0, IntrusiveNode param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        IntrusiveNode var4 = null;
        Object stackIn_8_0 = null;
        IntrusiveNode stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null) {
            var3 = param1;
          } else {
            var3 = this.field_e.field_a.next;
          }
          if (param0 != 25755) {
            var4 = (IntrusiveNode) null;
            this.a((byte) 72, (IntrusiveNode) null);
          }
          if (this.field_e.field_a == var3) {
            this.field_d = null;
            stackIn_8_0 = null;
            return (IntrusiveNode) (stackIn_8_0);
          }
          this.field_d = var3.next;
          stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("qd.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final IntrusiveNode a(byte param0, IntrusiveNode param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Object stackIn_5_0 = null;
        IntrusiveNode stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            var3 = this.field_e.field_a.previous;
          } else {
            var3 = param1;
          }
          if (var3 == this.field_e.field_a) {
            this.field_d = null;
            stackIn_5_0 = null;
            return (IntrusiveNode) (stackIn_5_0);
          }
          this.field_d = var3.previous;
          var4 = 95 / ((param0 + 78) / 33);
          stackIn_7_0 = var3;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("qd.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static int a(byte param0, char param1, CharSequence param2) {
        int var5 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var6 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Main.field_T;
        try {
          var3_int = 0;
          var4 = param2.length();
          if (param0 > -54) {
            qd.c(-56);
          }
          for (var5 = 0; var5 < var4; var5++) {
            if (param1 == param2.charAt(var5)) {
              var3_int++;
            }
          }
          stackIn_10_0 = var3_int;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("qd.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final IntrusiveNode a(byte param0) {
        IntrusiveNode var2 = this.field_d;
        if (this.field_e.field_a == var2) {
          this.field_d = null;
          return null;
        }
        this.field_d = var2.previous;
        if (param0 < 55) {
          return (IntrusiveNode) null;
        }
        return var2;
    }

    final IntrusiveNode c(byte param0) {
        IntrusiveNode var2 = this.field_e.field_a.previous;
        if (this.field_e.field_a == var2) {
          this.field_d = null;
          return null;
        }
        if (param0 != -13) {
          this.field_e = (bk) null;
        }
        this.field_d = var2.previous;
        return var2;
    }

    final IntrusiveNode a(int param0) {
        IntrusiveNode var2 = this.field_d;
        if (param0 != 28869) {
          return (IntrusiveNode) null;
        }
        if (this.field_e.field_a == var2) {
          this.field_d = null;
          return null;
        }
        this.field_d = var2.next;
        return var2;
    }

    final static nk b(int param0) {
        if (tj.field_F == jc.field_P) {
          throw new IllegalStateException();
        }
        int var1 = -14 % ((param0 + 25) / 60);
        if (gg.field_b != jc.field_P) {
          return null;
        }
        jc.field_P = tj.field_F;
        return mh.field_a;
    }

    qd(bk param0) {
        try {
          this.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "qd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Accept";
        field_a = 0;
    }
}
