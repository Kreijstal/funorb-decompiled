/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn {
    static int field_b;
    static hr field_d;
    static hr[] field_c;
    IntrusiveNode field_e;
    private IntrusiveNode field_a;

    final IntrusiveNode a(int param0) {
        IntrusiveNode var2 = this.field_e.previous;
        if (this.field_e == var2) {
          this.field_a = null;
          return null;
        }
        this.field_a = var2.previous;
        if (param0 == 9) {
          return var2;
        }
        this.a((byte) 19);
        return var2;
    }

    final IntrusiveNode d(byte param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 != 18) {
          this.b((byte) -83);
          var2 = this.field_a;
          if (var2 != this.field_e) {
            this.field_a = var2.next;
            return var2;
          }
          this.field_a = null;
          return null;
        }
        var2Lifetime1 = this.field_a;
        if (var2Lifetime1 != this.field_e) {
          this.field_a = var2Lifetime1.next;
          return var2Lifetime1;
        }
        this.field_a = null;
        return null;
    }

    final void a(IntrusiveNode param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.previous != null) {
            param0.b(false);
          }
          param0.previous = this.field_e;
          param0.next = this.field_e.next;
          param0.previous.next = param0;
          param0.next.previous = param0;
          if (param1 == -10295) {
            return;
          }
          this.field_a = (IntrusiveNode) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("jn.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final IntrusiveNode d(int param0) {
        IntrusiveNode var2 = this.field_a;
        if (var2 == this.field_e) {
          this.field_a = null;
          return null;
        }
        if (param0 == 9) {
          this.field_a = var2.previous;
          return var2;
        }
        this.d((byte) 68);
        this.field_a = var2.previous;
        return var2;
    }

    final boolean a(byte param0) {
        if (param0 <= -65) {
          return this.field_e.next == this.field_e ? true : false;
        }
        this.e(-106);
        return this.field_e.next == this.field_e ? true : false;
    }

    final void a(IntrusiveNode param0, byte param1) {
        if (param0.previous != null) {
          param0.b(false);
        }
        param0.next = this.field_e;
        param0.previous = this.field_e.previous;
        param0.previous.next = param0;
        if (param1 != 39) {
          return;
        }
        try {
          param0.next.previous = param0;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "jn.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final IntrusiveNode b(byte param0) {
        if (param0 >= -98) {
          return (IntrusiveNode) null;
        }
        IntrusiveNode var2 = this.field_e.previous;
        if (this.field_e != var2) {
          var2.b(false);
          return var2;
        }
        return null;
    }

    final IntrusiveNode c(int param0) {
        IntrusiveNode var2 = this.field_e.next;
        if (var2 == this.field_e) {
          return null;
        }
        if (param0 == 9) {
          var2.b(false);
          return var2;
        }
        IntrusiveNode var3 = (IntrusiveNode) null;
        this.a((IntrusiveNode) null, (byte) 81);
        var2.b(false);
        return var2;
    }

    public static void c(byte param0) {
        field_d = null;
        if (param0 != 117) {
          field_b = 93;
          field_c = null;
          return;
        }
        field_c = null;
    }

    final IntrusiveNode b(int param0) {
        int var3 = 64 % ((5 - param0) / 61);
        IntrusiveNode var2 = this.field_e.next;
        if (this.field_e != var2) {
          this.field_a = var2.next;
          return var2;
        }
        this.field_a = null;
        return null;
    }

    final void e(int param0) {
        IntrusiveNode var2 = null;
        int var3 = Sumoblitz.field_L ? 1 : 0;
        while (true) {
          var2 = this.field_e.next;
          if (this.field_e == var2) {
            break;
          }
          var2.b(false);
        }
        if (param0 >= 114) {
          this.field_a = null;
          return;
        }
        field_d = (hr) null;
        this.field_a = null;
    }

    public jn() {
        this.field_e = new IntrusiveNode();
        this.field_e.previous = this.field_e;
        this.field_e.next = this.field_e;
    }

    static {
        field_b = 9;
    }
}
