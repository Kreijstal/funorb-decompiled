/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveDeque {
    IntrusiveNode sentinel;
    private IntrusiveNode iterationCursor;

    final static void a(int param0, BitmapFont param1, byte param2, BitmapFont param3) {
        try {
          int var4_int = 88 % ((35 - param2) / 55);
          DequeWidgetContainer.field_x = param0;
          fb.field_m = param1;
          pb.field_i = param3;
          Lexicominos.a(SoftwareRasterizer.field_f / 2, 67, SoftwareRasterizer.field_a / 2);
          vc.a(-5094, param1.field_t, param1.field_t + param1.field_G, param3.field_t, param3.field_G + param3.field_t);
        } catch (RuntimeException runtimeException) {
          throw ld.wrapClientException((Throwable) ((Object) runtimeException), "ng.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final IntrusiveNode removeFirst(byte param0) {
        int var3 = -7 / ((param0 - 3) / 33);
        IntrusiveNode var2 = this.sentinel.next;
        if (var2 != this.sentinel) {
          var2.unlink((byte) -120);
          return var2;
        }
        return null;
    }

    private final void moveSuffixTo(IntrusiveNode param0, IntrusiveDeque param1, byte param2) {
        IntrusiveNode var4 = null;
        RuntimeException var4_ref = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -9) {
            this.clear(-7);
          }
          var4 = this.sentinel.previous;
          this.sentinel.previous = param0.previous;
          param0.previous.next = this.sentinel;
          if (param0 == this.sentinel) {
            return;
          }
          param0.previous = param1.sentinel.previous;
          param0.previous.next = param0;
          param1.sentinel.previous = var4;
          var4.next = param1.sentinel;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_8_0 = var4_ref;
          stackIn_8_1 = new StringBuilder().append("ng.I(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ld.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    final static int integerPower(byte param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        BitmapFont var5 = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          var3_int = 1;
          while (1 < param1) {
            if (0 != (param1 & 1)) {
              var3_int = var3_int * param2;
            }
            param2 = param2 * param2;
            param1 = param1 >> 1;
          }
          if (param0 != -11) {
            var5 = (BitmapFont) null;
            IntrusiveDeque.a(56, (BitmapFont) null, (byte) 99, (BitmapFont) null);
          }
          if (param1 != 1) {
            stackIn_14_0 = var3_int;
            return stackIn_14_0;
          }
          stackIn_12_0 = var3_int * param2;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ld.wrapClientException((Throwable) ((Object) var3), "ng.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final IntrusiveNode nextBackward(int param0) {
        IntrusiveNode var2 = this.iterationCursor;
        if (var2 == this.sentinel) {
          this.iterationCursor = null;
          return null;
        }
        if (param0 == 0) {
          this.iterationCursor = var2.previous;
          return var2;
        }
        return (IntrusiveNode) null;
    }

    final void moveAllTo(IntrusiveDeque param0, int param1) {
        try {
          int var3_int = -10 / ((-70 - param1) / 50);
          this.moveSuffixTo(this.sentinel.next, param0, (byte) -9);
        } catch (RuntimeException runtimeException) {
          throw ld.wrapClientException((Throwable) ((Object) runtimeException), "ng.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void clear(int param0) {
        IntrusiveNode var2 = null;
        int var3 = Lexicominos.field_L ? 1 : 0;
        while (true) {
          var2 = this.sentinel.next;
          if (this.sentinel == var2) {
            break;
          }
          var2.unlink((byte) -117);
        }
        this.iterationCursor = null;
        if (param0 > -74) {
          IntrusiveDeque var4 = (IntrusiveDeque) null;
          this.moveAllTo((IntrusiveDeque) null, 9);
          return;
        }
    }

    final IntrusiveNode removeLast(int param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 != 31334) {
          this.nextForward(-3);
          var2 = this.sentinel.previous;
          if (var2 != this.sentinel) {
            var2.unlink((byte) -126);
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.sentinel.previous;
        if (var2Lifetime1 != this.sentinel) {
          var2Lifetime1.unlink((byte) -126);
          return var2Lifetime1;
        }
        return null;
    }

    final void addLast(int param0, IntrusiveNode param1) {
        if (param1.previous != null) {
          param1.unlink((byte) -117);
        }
        if (param0 < 98) {
          return;
        }
        try {
          param1.previous = this.sentinel.previous;
          param1.next = this.sentinel;
          param1.previous.next = param1;
          param1.next.previous = param1;
        } catch (RuntimeException runtimeException) {
          throw ld.wrapClientException((Throwable) ((Object) runtimeException), "ng.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void addFirst(int param0, IntrusiveNode param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != param1.previous) {
            param1.unlink((byte) -128);
          }
          param1.next = this.sentinel.next;
          param1.previous = this.sentinel;
          param1.previous.next = param1;
          param1.next.previous = param1;
          if (param0 <= -56) {
            return;
          }
          this.sentinel = (IntrusiveNode) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ng.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ld.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final IntrusiveNode beginBackward(int param0) {
        IntrusiveNode var2 = this.sentinel.previous;
        if (param0 != 2) {
          this.iterationCursor = (IntrusiveNode) null;
          if (this.sentinel != var2) {
            this.iterationCursor = var2.previous;
            return var2;
          }
          this.iterationCursor = null;
          return null;
        }
        if (this.sentinel != var2) {
          this.iterationCursor = var2.previous;
          return var2;
        }
        this.iterationCursor = null;
        return null;
    }

    final IntrusiveNode nextForward(int param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 != 2) {
          this.iterationCursor = (IntrusiveNode) null;
          var2 = this.iterationCursor;
          if (this.sentinel != var2) {
            this.iterationCursor = var2.next;
            return var2;
          }
          this.iterationCursor = null;
          return null;
        }
        var2Lifetime1 = this.iterationCursor;
        if (this.sentinel != var2Lifetime1) {
          this.iterationCursor = var2Lifetime1.next;
          return var2Lifetime1;
        }
        this.iterationCursor = null;
        return null;
    }

    final boolean isEmpty(int param0) {
        int var2 = 113 / ((31 - param0) / 57);
        return this.sentinel.next == this.sentinel ? true : false;
    }

    final IntrusiveNode beginForward(boolean param0) {
        IntrusiveNode var2 = this.sentinel.next;
        if (!param0) {
          this.iterationCursor = (IntrusiveNode) null;
          if (this.sentinel != var2) {
            this.iterationCursor = var2.next;
            return var2;
          }
          this.iterationCursor = null;
          return null;
        }
        if (this.sentinel != var2) {
          this.iterationCursor = var2.next;
          return var2;
        }
        this.iterationCursor = null;
        return null;
    }

    final int size(int param0) {
        int var4 = Lexicominos.field_L ? 1 : 0;
        int var2 = 0;
        IntrusiveNode var3 = this.sentinel.next;
        if (param0 != 2) {
          return 80;
        }
        while (var3 != this.sentinel) {
          var3 = var3.next;
          var2++;
        }
        return var2;
    }

    public IntrusiveDeque() {
        this.sentinel = new IntrusiveNode();
        this.sentinel.previous = this.sentinel;
        this.sentinel.next = this.sentinel;
    }

    static {
    }
}
