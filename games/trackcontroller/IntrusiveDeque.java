/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveDeque {
    static int[] field_a;
    static String[] field_c;
    IntrusiveNode field_d;
    private IntrusiveNode field_b;

    final IntrusiveNode next(int param0) {
        IntrusiveNode var2 = this.field_b;
        if (var2 == this.field_d) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2.next;
        if (param0 == 10) {
          return var2;
        }
        field_c = (String[]) null;
        return var2;
    }

    final IntrusiveNode last(byte param0) {
        IntrusiveNode var2 = this.field_d.previous;
        if (param0 != 95) {
          return (IntrusiveNode) null;
        }
        if (this.field_d == var2) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2.previous;
        return var2;
    }

    final IntrusiveNode first(int param0) {
        IntrusiveNode var2 = this.field_d.next;
        if (param0 != 2) {
          return (IntrusiveNode) null;
        }
        if (this.field_d == var2) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2.next;
        return var2;
    }

    final IntrusiveNode previous(int param0) {
        IntrusiveNode var2 = this.field_b;
        if (this.field_d == var2) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2.previous;
        if (param0 > 88) {
          return var2;
        }
        this.removeFirst((byte) 68);
        return var2;
    }

    final void addFirst(IntrusiveNode param0, byte param1) {
        try {
          if (param0.previous != null) {
            param0.unlink(-107);
          }
          param0.previous = this.field_d;
          param0.next = this.field_d.next;
          int var3_int = 26 / ((-14 - param1) / 45);
          param0.previous.next = param0;
          param0.next.previous = param0;
        } catch (RuntimeException runtimeException) {
          throw LevelGrid.toClientException((Throwable) ((Object) runtimeException), "ja.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final IntrusiveNode removeLast(byte param0) {
        IntrusiveNode var2 = this.field_d.previous;
        if (param0 >= -59) {
          return (IntrusiveNode) null;
        }
        if (var2 != this.field_d) {
          var2.unlink(-92);
          return var2;
        }
        return null;
    }

    final IntrusiveNode removeFirst(byte param0) {
        IntrusiveNode var2 = this.field_d.next;
        if (var2 == this.field_d) {
          return null;
        }
        var2.unlink(-101);
        if (param0 < -77) {
          return var2;
        }
        IntrusiveNode var3 = (IntrusiveNode) null;
        this.addLast((byte) -94, (IntrusiveNode) null);
        return var2;
    }

    final void addLast(byte param0, IntrusiveNode param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.previous != null) {
            param1.unlink(-31);
          }
          param1.previous = this.field_d.previous;
          param1.next = this.field_d;
          param1.previous.next = param1;
          param1.next.previous = param1;
          if (param0 <= -90) {
            return;
          }
          this.field_b = (IntrusiveNode) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ja.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw LevelGrid.toClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final boolean isEmpty(boolean param0) {
        if (!param0) {
          return this.field_d == this.field_d.next ? true : false;
        }
        this.size(false);
        return this.field_d == this.field_d.next ? true : false;
    }

    public static void c(boolean param0) {
        if (param0) {
          field_c = (String[]) null;
          field_c = null;
          field_a = null;
          return;
        }
        field_c = null;
        field_a = null;
    }

    final static void c(int param0) {
        String var2 = (String) null;
        oc.a(fi.field_l, (byte) 79, (String) null);
        if (param0 == 1) {
          return;
        }
        IntrusiveDeque.c(true);
    }

    final int size(boolean param0) {
        IntrusiveNode var3 = null;
        int var4 = TrackController.field_F ? 1 : 0;
        int var2 = 0;
        IntrusiveNode var3Lifetime1;
        if (param0) {
          var3 = this.field_d.next;
          while (this.field_d != var3) {
            var3 = var3.next;
            var2++;
          }
          return var2;
        }
        this.size(true);
        var3Lifetime1 = this.field_d.next;
        while (this.field_d != var3Lifetime1) {
          var3Lifetime1 = var3Lifetime1.next;
          var2++;
        }
        return var2;
    }

    public IntrusiveDeque() {
        this.field_d = new IntrusiveNode();
        this.field_d.previous = this.field_d;
        this.field_d.next = this.field_d;
    }

    final void clear(int param0) {
        IntrusiveNode var2;
        int var3;
        var3 = TrackController.field_F ? 1 : 0;
        if (param0 != 1) {
          return;
        }
        while (true) {
          var2 = this.field_d.next;
          if (var2 != this.field_d) {
            var2.unlink(-42);
            continue;
          }
          break;
        }
        this.field_b = null;
        return;
    }

    static {
        field_a = new int[]{10, 2, 1, 3};
        field_c = new String[29];
    }
}
