/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveDeque {
    IntrusiveNode field_b;
    static ed field_c;
    private IntrusiveNode field_a;

    final static Class a(byte param0, String param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_2_0 = null;
        Class stackIn_5_0 = null;
        Class stackIn_9_0 = null;
        Class stackIn_14_0 = null;
        Class stackIn_17_0 = null;
        Class stackIn_21_0 = null;
        Class stackIn_24_0 = null;
        Class stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.equals("B")) {
            stackIn_2_0 = Byte.TYPE;
            return stackIn_2_0;
          }
          if (param1.equals("I")) {
            stackIn_5_0 = Integer.TYPE;
            return stackIn_5_0;
          }
          if (param1.equals("S")) {
            stackIn_9_0 = Short.TYPE;
            return stackIn_9_0;
          }
          if (param0 > -102) {
            IntrusiveDeque.d(13);
          }
          if (param1.equals("J")) {
            stackIn_14_0 = Long.TYPE;
            return stackIn_14_0;
          }
          if (param1.equals("Z")) {
            stackIn_17_0 = Boolean.TYPE;
            return stackIn_17_0;
          }
          if (param1.equals("F")) {
            stackIn_21_0 = Float.TYPE;
            return stackIn_21_0;
          }
          if (param1.equals("D")) {
            stackIn_24_0 = Double.TYPE;
            return stackIn_24_0;
          }
          if (!param1.equals("C")) {
            return Class.forName(param1);
          }
          stackIn_28_0 = Character.TYPE;
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_31_0 = var2;
          stackIn_31_1 = new StringBuilder().append("ei.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw rb.wrapThrowable((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final int a(boolean param0) {
        int var2 = 0;
        IntrusiveNode var3 = null;
        int var4 = Torquing.field_u;
        if (!param0) {
          var2 = 0;
          var3 = this.field_b.previous;
          while (this.field_b != var3) {
            var2++;
            var3 = var3.previous;
          }
          return var2;
        }
        return -4;
    }

    final void a(byte param0, IntrusiveNode param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != param1.next) {
            param1.unlink(0);
          }
          param1.previous = this.field_b;
          param1.next = this.field_b.next;
          param1.next.previous = param1;
          param1.previous.next = param1;
          if (param0 == 54) {
            return;
          }
          this.f(-122);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ei.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rb.wrapThrowable((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final IntrusiveNode b(int param0) {
        IntrusiveNode var2 = this.field_b.previous;
        if (this.field_b == var2) {
          this.field_a = null;
          return null;
        }
        if (param0 == 0) {
          this.field_a = var2.previous;
          return var2;
        }
        return (IntrusiveNode) null;
    }

    final IntrusiveNode b(byte param0) {
        IntrusiveNode var2 = this.field_b.next;
        int var3 = 70 / ((param0 + 20) / 35);
        if (this.field_b != var2) {
          var2.unlink(0);
          return var2;
        }
        return null;
    }

    final IntrusiveNode c(int param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 != -6938) {
          field_c = (ed) null;
          var2 = this.field_b.next;
          if (var2 != this.field_b) {
            this.field_a = var2.next;
            return var2;
          }
          this.field_a = null;
          return null;
        }
        var2Lifetime1 = this.field_b.next;
        if (var2Lifetime1 != this.field_b) {
          this.field_a = var2Lifetime1.next;
          return var2Lifetime1;
        }
        this.field_a = null;
        return null;
    }

    final IntrusiveNode a(byte param0) {
        IntrusiveNode var2 = this.field_b.previous;
        if (var2 != this.field_b) {
          var2.unlink(0);
          int var3 = 93 / ((param0 + 47) / 35);
          return var2;
        }
        return null;
    }

    final IntrusiveNode f(int param0) {
        IntrusiveNode var2 = this.field_a;
        if (param0 != -24059) {
          IntrusiveNode var3 = (IntrusiveNode) null;
          this.a((byte) -22, (IntrusiveNode) null);
          if (var2 != this.field_b) {
            this.field_a = var2.previous;
            return var2;
          }
          this.field_a = null;
          return null;
        }
        if (var2 != this.field_b) {
          this.field_a = var2.previous;
          return var2;
        }
        this.field_a = null;
        return null;
    }

    final void a(int param0) {
        IntrusiveNode var5 = null;
        IntrusiveNode var4 = null;
        int var3 = Torquing.field_u;
        if (param0 != 0) {
          this.e(-39);
          while (true) {
            var5 = this.field_b.previous;
            if (this.field_b == var5) {
              break;
            }
            var5.unlink(0);
          }
          this.field_a = null;
          return;
        }
        while (true) {
          var4 = this.field_b.previous;
          if (this.field_b == var4) {
            break;
          }
          var4.unlink(0);
        }
        this.field_a = null;
    }

    final void b(byte param0, IntrusiveNode param1) {
        try {
          if (param1.next != null) {
            param1.unlink(0);
          }
          param1.previous = this.field_b.previous;
          param1.next = this.field_b;
          param1.next.previous = param1;
          if (param0 != 68) {
            this.e(11);
          }
          param1.previous.next = param1;
        } catch (RuntimeException runtimeException) {
          throw rb.wrapThrowable((Throwable) ((Object) runtimeException), "ei.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(int param0) {
        if (param0 < 25) {
          IntrusiveDeque.d(19);
          field_c = null;
          return;
        }
        field_c = null;
    }

    public IntrusiveDeque() {
        this.field_b = new IntrusiveNode();
        this.field_b.next = this.field_b;
        this.field_b.previous = this.field_b;
    }

    final boolean e(int param0) {
        if (param0 <= -84) {
          return this.field_b.previous == this.field_b ? true : false;
        }
        this.f(41);
        return this.field_b.previous == this.field_b ? true : false;
    }

    static {
        field_c = new ed();
    }
}
