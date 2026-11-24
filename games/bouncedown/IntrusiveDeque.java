/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveDeque {
    IntrusiveNode sentinel;
    private IntrusiveNode iterationCursor;
    static int field_a;

    final IntrusiveNode beginForward(byte param0) {
        IntrusiveNode var2 = this.sentinel.field_c;
        if (var2 == this.sentinel) {
          this.iterationCursor = null;
          return null;
        }
        this.iterationCursor = var2.field_c;
        if (param0 > -44) {
          this.isEmpty((byte) 90);
        }
        return var2;
    }

    final IntrusiveNode removeFirst(byte param0) {
        if (param0 != -52) {
          this.clear(108);
        }
        IntrusiveNode var2 = this.sentinel.field_c;
        if (this.sentinel == var2) {
          return null;
        }
        var2.unlink(param0 ^ -50);
        return var2;
    }

    final IntrusiveNode beginBackward(byte param0) {
        IntrusiveNode var2 = this.sentinel.field_f;
        if (param0 <= 9) {
          return (IntrusiveNode) null;
        }
        if (var2 == this.sentinel) {
          this.iterationCursor = null;
          return null;
        }
        this.iterationCursor = var2.field_f;
        return var2;
    }

    final IntrusiveNode nextForward(byte param0) {
        IntrusiveNode var2 = this.iterationCursor;
        if (var2 == this.sentinel) {
          this.iterationCursor = null;
          return null;
        }
        int var3 = 102 % ((15 - param0) / 33);
        this.iterationCursor = var2.field_c;
        return var2;
    }

    final boolean isEmpty(byte param0) {
        if (param0 != -93) {
          this.removeFirst((byte) 40);
        }
        return this.sentinel == this.sentinel.field_c ? true : false;
    }

    final IntrusiveNode removeLast(byte param0) {
        IntrusiveNode var2 = this.sentinel.field_f;
        if (param0 <= 55) {
          return (IntrusiveNode) null;
        }
        if (var2 == this.sentinel) {
          return null;
        }
        var2.unlink(2);
        return var2;
    }

    final void addLast(int param0, IntrusiveNode param1) {
        try {
          if (null != param1.field_f) {
            param1.unlink(2);
          }
          if (param0 != 1) {
            this.iterationCursor = (IntrusiveNode) null;
          }
          param1.field_c = this.sentinel;
          param1.field_f = this.sentinel.field_f;
          param1.field_f.field_c = param1;
          param1.field_c.field_f = param1;
        } catch (RuntimeException runtimeException) {
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) runtimeException), "bc.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final IntrusiveNode nextBackward(int param0) {
        IntrusiveNode var2 = this.iterationCursor;
        if (var2 == this.sentinel) {
          this.iterationCursor = null;
          return null;
        }
        this.iterationCursor = var2.field_f;
        if (param0 != -18158) {
          this.iterationCursor = (IntrusiveNode) null;
        }
        return var2;
    }

    final void addFirst(byte param0, IntrusiveNode param1) {
        if (null != param1.field_f) {
          param1.unlink(param0 ^ 81);
        }
        param1.field_c = this.sentinel.field_c;
        if (param0 != 83) {
          return;
        }
        try {
          param1.field_f = this.sentinel;
          param1.field_f.field_c = param1;
          param1.field_c.field_f = param1;
        } catch (RuntimeException runtimeException) {
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) runtimeException), "bc.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void clear(int param0) {
        IntrusiveNode var3 = null;
        int var4 = Bounce.field_N;
        int var2 = 81 % ((-6 - param0) / 51);
        while (true) {
          var3 = this.sentinel.field_c;
          if (var3 == this.sentinel) {
            break;
          }
          var3.unlink(2);
        }
        this.iterationCursor = null;
    }

    public IntrusiveDeque() {
        this.sentinel = new IntrusiveNode();
        this.sentinel.field_f = this.sentinel;
        this.sentinel.field_c = this.sentinel;
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
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
