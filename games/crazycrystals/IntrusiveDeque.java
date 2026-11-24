/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveDeque {
    static String field_b;
    IntrusiveNode sentinel;
    static int field_d;
    static IntrusiveDeque field_e;
    private IntrusiveNode iterationCursor;

    final void addFirst(int param0, IntrusiveNode param1) {
        try {
          if (null != param1.field_d) {
            param1.unlink(false);
          }
          param1.field_b = this.sentinel.field_b;
          param1.field_d = this.sentinel;
          if (param0 <= 74) {
            field_d = 72;
          }
          param1.field_d.field_b = param1;
          param1.field_b.field_d = param1;
        } catch (RuntimeException runtimeException) {
          throw dn.wrapClientException((Throwable) ((Object) runtimeException), "wb.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void clear(int param0) {
        IntrusiveNode var2 = null;
        int var3 = CrazyCrystals.field_B;
        while (true) {
          var2 = this.sentinel.field_b;
          if (var2 == this.sentinel) {
            break;
          }
          var2.unlink(false);
        }
        this.iterationCursor = null;
        if (param0 == 22800) {
          return;
        }
        IntrusiveNode var4 = (IntrusiveNode) null;
        this.addLast(44, (IntrusiveNode) null);
    }

    final IntrusiveNode beginBackward(byte param0) {
        IntrusiveNode var2 = this.sentinel.field_d;
        if (this.sentinel == var2) {
          this.iterationCursor = null;
          return null;
        }
        if (param0 < -23) {
          this.iterationCursor = var2.field_d;
          return var2;
        }
        this.beginBackward((byte) -78);
        this.iterationCursor = var2.field_d;
        return var2;
    }

    public static void clearStaticReferences(int param0) {
        if (param0 < 1) {
          return;
        }
        field_e = null;
        field_b = null;
    }

    final IntrusiveNode nextForward(boolean param0) {
        IntrusiveNode var2 = this.iterationCursor;
        if (param0) {
          return (IntrusiveNode) null;
        }
        if (var2 != this.sentinel) {
          this.iterationCursor = var2.field_b;
          return var2;
        }
        this.iterationCursor = null;
        return null;
    }

    final IntrusiveNode beginForward(int param0) {
        IntrusiveNode var2 = this.sentinel.field_b;
        if (var2 == this.sentinel) {
          this.iterationCursor = null;
          return null;
        }
        if (param0 == 32073) {
          this.iterationCursor = var2.field_b;
          return var2;
        }
        this.sentinel = (IntrusiveNode) null;
        this.iterationCursor = var2.field_b;
        return var2;
    }

    final static void a(int param0, dl param1, String param2) {
        try {
          gh.field_A = param2;
          wl.field_o = param1;
          if (param0 != 0) {
            String var4 = (String) null;
            IntrusiveDeque.a(21, (dl) null, (String) null);
          }
        } catch (RuntimeException runtimeException) {
          throw dn.wrapClientException((Throwable) ((Object) runtimeException), "wb.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final IntrusiveNode removeLast(int param0) {
        int var3 = -76 % ((-55 - param0) / 57);
        IntrusiveNode var2 = this.sentinel.field_d;
        if (var2 != this.sentinel) {
          var2.unlink(false);
          return var2;
        }
        return null;
    }

    final void addLast(int param0, IntrusiveNode param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.field_d != null) {
            param1.unlink(false);
          }
          param1.field_d = this.sentinel.field_d;
          param1.field_b = this.sentinel;
          param1.field_d.field_b = param1;
          param1.field_b.field_d = param1;
          if (param0 == 0) {
            return;
          }
          this.removeFirst(-27);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("wb.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dn.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final boolean isEmpty(int param0) {
        if (param0 == -16497) {
          return this.sentinel.field_b == this.sentinel ? true : false;
        }
        field_e = (IntrusiveDeque) null;
        return this.sentinel.field_b == this.sentinel ? true : false;
    }

    final IntrusiveNode nextBackward(int param0) {
        IntrusiveNode var2 = this.iterationCursor;
        if (var2 == this.sentinel) {
          this.iterationCursor = null;
          return null;
        }
        this.iterationCursor = var2.field_d;
        if (param0 == 0) {
          return var2;
        }
        return (IntrusiveNode) null;
    }

    final IntrusiveNode removeFirst(int param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 != 0) {
          IntrusiveNode var3 = (IntrusiveNode) null;
          this.addFirst(4, (IntrusiveNode) null);
          var2 = this.sentinel.field_b;
          if (var2 != this.sentinel) {
            var2.unlink(false);
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.sentinel.field_b;
        if (var2Lifetime1 != this.sentinel) {
          var2Lifetime1.unlink(false);
          return var2Lifetime1;
        }
        return null;
    }

    public IntrusiveDeque() {
        this.sentinel = new IntrusiveNode();
        this.sentinel.field_b = this.sentinel;
        this.sentinel.field_d = this.sentinel;
    }

    static {
        field_b = "Suggested names: ";
        field_d = 0;
        field_e = new IntrusiveDeque();
    }
}
