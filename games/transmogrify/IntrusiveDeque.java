/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveDeque {
    static String[] field_a;
    IntrusiveNode sentinel;
    static String field_c;
    private IntrusiveNode iterationCursor;

    final IntrusiveNode beginForward(byte param0) {
        if (param0 != -95) {
          return (IntrusiveNode) null;
        }
        IntrusiveNode var2 = this.sentinel.next;
        if (this.sentinel == var2) {
          this.iterationCursor = null;
          return null;
        }
        this.iterationCursor = var2.next;
        return var2;
    }

    final IntrusiveNode removeLast(int param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 != -9424) {
          IntrusiveDeque.c((byte) 97);
          var2 = this.sentinel.previous;
          if (this.sentinel != var2) {
            var2.unlink(5);
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.sentinel.previous;
        if (this.sentinel != var2Lifetime1) {
          var2Lifetime1.unlink(5);
          return var2Lifetime1;
        }
        return null;
    }

    final static Sprite[] a(int param0, int param1, ci param2, byte param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -57) {
            field_a = (String[]) null;
          }
          if (rl.a(param1, 0, param0, param2)) {
            return AccountServiceResult.a(31151);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("qj.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean b(byte param0) {
        if (param0 < 65) {
          field_c = (String) null;
          return ge.field_x;
        }
        return ge.field_x;
    }

    final IntrusiveNode nextForward(boolean param0) {
        IntrusiveNode var2 = this.iterationCursor;
        if (this.sentinel == var2) {
          this.iterationCursor = null;
          return null;
        }
        if (param0) {
          this.iterationCursor = var2.next;
          return var2;
        }
        this.nextForward(true);
        this.iterationCursor = var2.next;
        return var2;
    }

    final void addLast(IntrusiveNode param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != param0.previous) {
            param0.unlink(5);
          }
          param0.previous = this.sentinel.previous;
          param0.next = this.sentinel;
          param0.previous.next = param0;
          param0.next.previous = param0;
          if (param1 <= -81) {
            return;
          }
          this.sentinel = (IntrusiveNode) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("qj.O(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final IntrusiveNode beginBackward(int param0) {
        IntrusiveNode var2 = this.sentinel.previous;
        if (param0 != -10231) {
          field_c = (String) null;
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

    final static boolean a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= 36) {
            stackIn_4_0 = SessionGameApplet.a(10, false, true, param0);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("qj.F(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final void clear(int param0) {
        int var3;
        IntrusiveNode var5;
        IntrusiveNode var4;
        var3 = Transmogrify.field_A ? 1 : 0;
        if (param0 == -1) {
          while (true) {
            var4 = this.sentinel.next;
            if (this.sentinel != var4) {
              var4.unlink(5);
              continue;
            }
            break;
          }
          this.iterationCursor = null;
          return;
        }
        IntrusiveDeque.b((byte) 115);
        while (true) {
          var5 = this.sentinel.next;
          if (this.sentinel != var5) {
            var5.unlink(5);
            continue;
          }
          break;
        }
        this.iterationCursor = null;
        return;
    }

    public static void c(byte param0) {
        field_a = null;
        int var1 = -105 % ((-25 - param0) / 33);
        field_c = null;
    }

    final IntrusiveNode nextBackward(int param0) {
        IntrusiveNode var2 = this.iterationCursor;
        if (var2 == this.sentinel) {
          this.iterationCursor = null;
          return null;
        }
        if (param0 == -33) {
          this.iterationCursor = var2.previous;
          return var2;
        }
        this.sentinel = (IntrusiveNode) null;
        this.iterationCursor = var2.previous;
        return var2;
    }

    final void addFirst(IntrusiveNode param0, byte param1) {
        if (param0.previous != null) {
          param0.unlink(5);
        }
        if (param1 != 33) {
          return;
        }
        try {
          param0.next = this.sentinel.next;
          param0.previous = this.sentinel;
          param0.previous.next = param0;
          param0.next.previous = param0;
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "qj.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean isEmpty(int param0) {
        if (param0 != -1) {
          return true;
        }
        return this.sentinel == this.sentinel.next ? true : false;
    }

    final IntrusiveNode removeFirst(int param0) {
        IntrusiveNode var2 = this.sentinel.next;
        if (var2 == this.sentinel) {
          return null;
        }
        if (param0 <= -71) {
          var2.unlink(5);
          return var2;
        }
        CharSequence var3 = (CharSequence) null;
        IntrusiveDeque.a((CharSequence) null, 11);
        var2.unlink(5);
        return var2;
    }

    public IntrusiveDeque() {
        this.sentinel = new IntrusiveNode();
        this.sentinel.previous = this.sentinel;
        this.sentinel.next = this.sentinel;
    }

    final static void e(int param0) {
        int var1 = 0;
        int var1Lifetime1;
        if (param0 > -65) {
          field_a = (String[]) null;
          if (kc.field_g <= 32) {
            SocketConnector.a(0, 9956);
          } else {
            var1 = kc.field_g % 32;
            if (var1 == 0) {
              var1 = 32;
            }
            SocketConnector.a(-var1 + kc.field_g, 9956);
            return;
          }
          return;
        }
        if (kc.field_g <= 32) {
          SocketConnector.a(0, 9956);
        } else {
          var1Lifetime1 = kc.field_g % 32;
          if (var1Lifetime1 == 0) {
            var1Lifetime1 = 32;
          }
          SocketConnector.a(-var1Lifetime1 + kc.field_g, 9956);
          return;
        }
    }

    static {
        field_c = "This password is part of your Player Name, and would be easy to guess";
        field_a = new String[]{"Decent Score", "Great Score", "Anagram", "Super Anagram", "Recycler", "Supercycler", "Focus", "Double Focus", "Brave Effort", "Sterling Effort", "DIY Builder", "Word of Power", "Speedster", "Super Speedster", "Multitasker", "Monster Speller"};
    }
}
