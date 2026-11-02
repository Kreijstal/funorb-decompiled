/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveDeque {
    static int field_e;
    static String field_f;
    static int[] field_a;
    IntrusiveNode sentinel;
    static String[] field_i;
    static np field_b;
    static String field_c;
    static int field_d;
    private IntrusiveNode field_g;

    final IntrusiveNode removeLast(byte param0) {
        if (param0 != -43) {
          return (IntrusiveNode) null;
        }
        IntrusiveNode var2 = this.sentinel.previous;
        if (var2 != this.sentinel) {
          var2.unlink(2);
          return var2;
        }
        return null;
    }

    final void addFirst(IntrusiveNode param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.next != null) {
            param0.unlink(2);
          }
          param0.previous = this.sentinel;
          param0.next = this.sentinel.next;
          param0.next.previous = param0;
          param0.previous.next = param0;
          if (!param1) {
            return;
          }
          this.sentinel = (IntrusiveNode) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("nj.F(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(String param0, int param1, PacketBuffer param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] var4 = null;
        CharSequence var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = param2.position;
          var5 = (CharSequence) ((Object) param0);
          var4 = bo.a(var5, -711);
          param2.writeSmart(var4.length, (byte) -73);
          if (param1 != 7937) {
            field_f = (String) null;
          }
          param2.position = param2.position + ko.field_M.a(0, -56, param2.payload, param2.position, var4.length, var4);
          stackIn_3_0 = param2.position - var3_int;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("nj.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void clear(int param0) {
        IntrusiveNode var2 = null;
        int var3 = Vertigo2.field_L ? 1 : 0;
        while (true) {
          var2 = this.sentinel.previous;
          if (var2 == this.sentinel) {
            break;
          }
          var2.unlink(param0 + 2);
        }
        if (param0 == 0) {
          this.field_g = null;
          return;
        }
        this.field_g = (IntrusiveNode) null;
        this.field_g = null;
    }

    final IntrusiveNode b(boolean param0) {
        if (param0) {
          return (IntrusiveNode) null;
        }
        IntrusiveNode var2 = this.field_g;
        if (var2 != this.sentinel) {
          this.field_g = var2.next;
          return var2;
        }
        this.field_g = null;
        return null;
    }

    public static void a(int param0) {
        field_a = null;
        field_f = null;
        if (param0 == 0) {
          field_b = null;
          field_c = null;
          field_i = null;
          return;
        }
        field_c = (String) null;
        field_b = null;
        field_c = null;
        field_i = null;
    }

    final int size(boolean param0) {
        int var4 = Vertigo2.field_L ? 1 : 0;
        int var2 = 0;
        IntrusiveNode var3 = this.sentinel.previous;
        if (!param0) {
          field_e = -23;
          while (this.sentinel != var3) {
            var3 = var3.previous;
            var2++;
          }
          return var2;
        }
        while (this.sentinel != var3) {
          var3 = var3.previous;
          var2++;
        }
        return var2;
    }

    final IntrusiveNode a(byte param0) {
        if (param0 != 100) {
          return (IntrusiveNode) null;
        }
        IntrusiveNode var2 = this.sentinel.previous;
        if (this.sentinel == var2) {
          this.field_g = null;
          return null;
        }
        this.field_g = var2.previous;
        return var2;
    }

    final boolean isEmpty(boolean param0) {
        if (!param0) {
          return this.sentinel.previous == this.sentinel ? true : false;
        }
        field_f = (String) null;
        return this.sentinel.previous == this.sentinel ? true : false;
    }

    final IntrusiveNode b(int param0) {
        IntrusiveNode var2 = this.field_g;
        if (this.sentinel == var2) {
          this.field_g = null;
          return null;
        }
        this.field_g = var2.previous;
        if (param0 >= 23) {
          return var2;
        }
        return (IntrusiveNode) null;
    }

    final IntrusiveNode c(byte param0) {
        if (param0 >= -1) {
          return (IntrusiveNode) null;
        }
        IntrusiveNode var2 = this.sentinel.next;
        if (this.sentinel == var2) {
          this.field_g = null;
          return null;
        }
        this.field_g = var2.next;
        return var2;
    }

    final void addLast(IntrusiveNode param0, byte param1) {
        try {
          if (param1 != 27) {
            this.removeFirst((byte) 69);
          }
          if (null != param0.next) {
            param0.unlink(2);
          }
          param0.previous = this.sentinel.previous;
          param0.next = this.sentinel;
          param0.next.previous = param0;
          param0.previous.next = param0;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "nj.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final IntrusiveNode removeFirst(byte param0) {
        IntrusiveNode var2 = this.sentinel.next;
        if (this.sentinel == var2) {
          return null;
        }
        var2.unlink(2);
        if (param0 == 92) {
          return var2;
        }
        return (IntrusiveNode) null;
    }

    final IntrusiveNode b(IntrusiveNode param0, byte param1) {
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
          if (param0 != null) {
            var3 = param0;
          } else {
            var3 = this.sentinel.previous;
          }
          if (this.sentinel == var3) {
            this.field_g = null;
            stackIn_5_0 = null;
            return (IntrusiveNode) (stackIn_5_0);
          }
          this.field_g = var3.previous;
          var4 = -76 / ((54 - param1) / 55);
          stackIn_7_0 = var3;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("nj.G(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public IntrusiveDeque() {
        this.sentinel = new IntrusiveNode();
        this.sentinel.next = this.sentinel;
        this.sentinel.previous = this.sentinel;
    }

    static {
        field_i = new String[]{"Complete levels 1 to 10", "Achieve gold medal times in time trial mode across levels 1 to 10", "Complete levels 11 to 20", "Achieve gold medal times in time trial mode across levels 11 to 20", "Complete levels 21 to 30", "Achieve gold medal times in time trial mode across levels 21 to 30", "Complete levels 31 to 40", "Achieve gold medal times in time trial mode across levels 31 to 40", "Complete levels 41 to 50", "Achieve gold medal times in time trial mode across all levels", "Complete 15 levels in Co-op mode in one sitting", "Achieve a Rating of 1500 in Paint-off mode", "Win a Rated Paint-off round while in possession of the skull during Halloween"};
        field_f = "Passwords must be between 5 and 20 characters long";
        field_c = "ESC - cancel private message";
        field_a = new int[8192];
    }
}
