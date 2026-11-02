/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveDeque {
    static String[] field_a;
    IntrusiveNode field_d;
    static String field_c;
    private IntrusiveNode field_b;

    final IntrusiveNode a(byte param0) {
        if (param0 != -95) {
          return (IntrusiveNode) null;
        }
        IntrusiveNode var2 = this.field_d.next;
        if (this.field_d == var2) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2.next;
        return var2;
    }

    final IntrusiveNode a(int param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 != -9424) {
          IntrusiveDeque.c((byte) 97);
          var2 = this.field_d.previous;
          if (this.field_d != var2) {
            var2.c(5);
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.field_d.previous;
        if (this.field_d != var2Lifetime1) {
          var2Lifetime1.c(5);
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
            return uj.a(31151);
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

    final IntrusiveNode a(boolean param0) {
        IntrusiveNode var2 = this.field_b;
        if (this.field_d == var2) {
          this.field_b = null;
          return null;
        }
        if (param0) {
          this.field_b = var2.next;
          return var2;
        }
        this.a(true);
        this.field_b = var2.next;
        return var2;
    }

    final void a(IntrusiveNode param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != param0.previous) {
            param0.c(5);
          }
          param0.previous = this.field_d.previous;
          param0.next = this.field_d;
          param0.previous.next = param0;
          param0.next.previous = param0;
          if (param1 <= -81) {
            return;
          }
          this.field_d = (IntrusiveNode) null;
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

    final IntrusiveNode b(int param0) {
        IntrusiveNode var2 = this.field_d.previous;
        if (param0 != -10231) {
          field_c = (String) null;
          if (this.field_d != var2) {
            this.field_b = var2.previous;
            return var2;
          }
          this.field_b = null;
          return null;
        }
        if (this.field_d != var2) {
          this.field_b = var2.previous;
          return var2;
        }
        this.field_b = null;
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

    final void g(int param0) {
        int var3;
        IntrusiveNode var5;
        IntrusiveNode var4;
        var3 = Transmogrify.field_A ? 1 : 0;
        if (param0 == -1) {
          while (true) {
            var4 = this.field_d.next;
            if (this.field_d != var4) {
              var4.c(5);
              continue;
            }
            break;
          }
          this.field_b = null;
          return;
        }
        IntrusiveDeque.b((byte) 115);
        while (true) {
          var5 = this.field_d.next;
          if (this.field_d != var5) {
            var5.c(5);
            continue;
          }
          break;
        }
        this.field_b = null;
        return;
    }

    public static void c(byte param0) {
        field_a = null;
        int var1 = -105 % ((-25 - param0) / 33);
        field_c = null;
    }

    final IntrusiveNode f(int param0) {
        IntrusiveNode var2 = this.field_b;
        if (var2 == this.field_d) {
          this.field_b = null;
          return null;
        }
        if (param0 == -33) {
          this.field_b = var2.previous;
          return var2;
        }
        this.field_d = (IntrusiveNode) null;
        this.field_b = var2.previous;
        return var2;
    }

    final void a(IntrusiveNode param0, byte param1) {
        if (param0.previous != null) {
          param0.c(5);
        }
        if (param1 != 33) {
          return;
        }
        try {
          param0.next = this.field_d.next;
          param0.previous = this.field_d;
          param0.previous.next = param0;
          param0.next.previous = param0;
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "qj.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean d(int param0) {
        if (param0 != -1) {
          return true;
        }
        return this.field_d == this.field_d.next ? true : false;
    }

    final IntrusiveNode c(int param0) {
        IntrusiveNode var2 = this.field_d.next;
        if (var2 == this.field_d) {
          return null;
        }
        if (param0 <= -71) {
          var2.c(5);
          return var2;
        }
        CharSequence var3 = (CharSequence) null;
        IntrusiveDeque.a((CharSequence) null, 11);
        var2.c(5);
        return var2;
    }

    public IntrusiveDeque() {
        this.field_d = new IntrusiveNode();
        this.field_d.previous = this.field_d;
        this.field_d.next = this.field_d;
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
