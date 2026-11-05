/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc {
    IntrusiveNode field_b;
    private IntrusiveNode field_c;
    static int field_a;

    final IntrusiveNode a(byte param0) {
        IntrusiveNode var2 = this.field_b.field_c;
        if (var2 == this.field_b) {
          this.field_c = null;
          return null;
        }
        this.field_c = var2.field_c;
        if (param0 > -44) {
          this.f((byte) 90);
        }
        return var2;
    }

    final IntrusiveNode c(byte param0) {
        if (param0 != -52) {
          this.b(108);
        }
        IntrusiveNode var2 = this.field_b.field_c;
        if (this.field_b == var2) {
          return null;
        }
        var2.c(param0 ^ -50);
        return var2;
    }

    final IntrusiveNode b(byte param0) {
        IntrusiveNode var2 = this.field_b.field_f;
        if (param0 <= 9) {
          return (IntrusiveNode) null;
        }
        if (var2 == this.field_b) {
          this.field_c = null;
          return null;
        }
        this.field_c = var2.field_f;
        return var2;
    }

    final IntrusiveNode d(byte param0) {
        IntrusiveNode var2 = this.field_c;
        if (var2 == this.field_b) {
          this.field_c = null;
          return null;
        }
        int var3 = 102 % ((15 - param0) / 33);
        this.field_c = var2.field_c;
        return var2;
    }

    final boolean f(byte param0) {
        if (param0 != -93) {
          this.c((byte) 40);
        }
        return this.field_b == this.field_b.field_c ? true : false;
    }

    final IntrusiveNode e(byte param0) {
        IntrusiveNode var2 = this.field_b.field_f;
        if (param0 <= 55) {
          return (IntrusiveNode) null;
        }
        if (var2 == this.field_b) {
          return null;
        }
        var2.c(2);
        return var2;
    }

    final void a(int param0, IntrusiveNode param1) {
        try {
          if (null != param1.field_f) {
            param1.c(2);
          }
          if (param0 != 1) {
            this.field_c = (IntrusiveNode) null;
          }
          param1.field_c = this.field_b;
          param1.field_f = this.field_b.field_f;
          param1.field_f.field_c = param1;
          param1.field_c.field_f = param1;
        } catch (RuntimeException runtimeException) {
          throw CipherPacketBuffer.a((Throwable) ((Object) runtimeException), "bc.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final IntrusiveNode a(int param0) {
        IntrusiveNode var2 = this.field_c;
        if (var2 == this.field_b) {
          this.field_c = null;
          return null;
        }
        this.field_c = var2.field_f;
        if (param0 != -18158) {
          this.field_c = (IntrusiveNode) null;
        }
        return var2;
    }

    final void a(byte param0, IntrusiveNode param1) {
        if (null != param1.field_f) {
          param1.c(param0 ^ 81);
        }
        param1.field_c = this.field_b.field_c;
        if (param0 != 83) {
          return;
        }
        try {
          param1.field_f = this.field_b;
          param1.field_f.field_c = param1;
          param1.field_c.field_f = param1;
        } catch (RuntimeException runtimeException) {
          throw CipherPacketBuffer.a((Throwable) ((Object) runtimeException), "bc.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0) {
        IntrusiveNode var3 = null;
        int var4 = Bounce.field_N;
        int var2 = 81 % ((-6 - param0) / 51);
        while (true) {
          var3 = this.field_b.field_c;
          if (var3 == this.field_b) {
            break;
          }
          var3.c(2);
        }
        this.field_c = null;
    }

    public bc() {
        this.field_b = new IntrusiveNode();
        this.field_b.field_f = this.field_b;
        this.field_b.field_c = this.field_b;
    }

    final static String a(String param0, int param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        char[] var4 = null;
        int var6 = 0;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Bounce.field_N;
        try {
          var3 = 4 / ((-61 - param1) / 32);
          var2_int = param0.length();
          var4 = new char[var2_int];
          for (var5 = 0; var5 < var2_int; var5++) {
            var4[var2_int - 1 - var5] = param0.charAt(var5);
          }
          stackIn_5_0 = new String(var4);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("bc.F(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw CipherPacketBuffer.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
