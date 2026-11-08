/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveDeque {
    static String field_e;
    static String field_a;
    IntrusiveNode sentinel;
    static String field_d;
    private IntrusiveNode field_c;
    static int field_b;

    final IntrusiveNode last(int param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 != 1504642273) {
          IntrusiveNode var3 = (IntrusiveNode) null;
          this.addLast(46, (IntrusiveNode) null);
          var2 = this.sentinel.previous;
          if (this.sentinel == var2) {
            this.field_c = null;
            return null;
          }
          this.field_c = var2.previous;
          return var2;
        }
        var2Lifetime1 = this.sentinel.previous;
        if (this.sentinel == var2Lifetime1) {
          this.field_c = null;
          return null;
        }
        this.field_c = var2Lifetime1.previous;
        return var2Lifetime1;
    }

    final IntrusiveNode removeFirst(int param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 != -28918) {
          this.field_c = (IntrusiveNode) null;
          var2 = this.sentinel.field_a;
          if (var2 != this.sentinel) {
            var2.unlink(param0 + 31697);
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.sentinel.field_a;
        if (var2Lifetime1 != this.sentinel) {
          var2Lifetime1.unlink(param0 + 31697);
          return var2Lifetime1;
        }
        return null;
    }

    final IntrusiveNode traverseFrom(IntrusiveNode param0, int param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        IntrusiveNode stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != null) {
            var3 = param0;
          } else {
            var3 = this.sentinel.field_a;
          }
          if (var3 == this.sentinel) {
            this.field_c = null;
            stackIn_5_0 = null;
            return (IntrusiveNode) (stackIn_5_0);
          }
          if (param1 != 1504642273) {
            this.sentinel = (IntrusiveNode) null;
          }
          this.field_c = var3.field_a;
          stackIn_9_0 = var3;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("bb.C(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final void clear(int param0) {
        IntrusiveNode var3 = null;
        int var4 = Pixelate.field_H ? 1 : 0;
        int var2 = -12 / ((param0 + 36) / 63);
        while (true) {
          var3 = this.sentinel.field_a;
          if (var3 == this.sentinel) {
            break;
          }
          var3.unlink(2779);
        }
        this.field_c = null;
    }

    final boolean isEmpty(int param0) {
        if (param0 == 0) {
          return this.sentinel == this.sentinel.field_a ? true : false;
        }
        field_d = (String) null;
        return this.sentinel == this.sentinel.field_a ? true : false;
    }

    final IntrusiveNode first(int param0) {
        IntrusiveNode var2 = this.sentinel.field_a;
        if (param0 != 1504642273) {
          this.clear(44);
          if (this.sentinel == var2) {
            this.field_c = null;
            return null;
          }
          this.field_c = var2.field_a;
          return var2;
        }
        if (this.sentinel == var2) {
          this.field_c = null;
          return null;
        }
        this.field_c = var2.field_a;
        return var2;
    }

    final IntrusiveNode next(int param0) {
        IntrusiveNode var2 = this.field_c;
        if (var2 == this.sentinel) {
          this.field_c = null;
          return null;
        }
        this.field_c = var2.field_a;
        if (param0 == 1504642273) {
          return var2;
        }
        return (IntrusiveNode) null;
    }

    final static void drawLegacyMenuWithFrame(int param0) {
        int var1 = 0;
        int var2 = 0;
        if (param0 < -13) {
          var1 = la.getLegacyMenuWidth((byte) -59);
          var2 = bl.getLegacyMenuWidth(true);
          he.field_a.draw(-PacketBuffer.field_n + MenuScreen.field_h, (PacketBuffer.field_n << 1) + var2, -1, var1 + (GradientOutlineTextPainter.field_t << 1), LoadingProgressDialog.field_cb - GradientOutlineTextPainter.field_t);
          Match.drawLegacyMenu(-14);
          return;
        }
    }

    final IntrusiveNode removeLast(int param0) {
        int var2 = -96 % ((-6 - param0) / 48);
        IntrusiveNode var3 = this.sentinel.previous;
        if (var3 != this.sentinel) {
          var3.unlink(2779);
          return var3;
        }
        return null;
    }

    public static void releaseStatics(byte param0) {
        field_e = null;
        if (param0 != 76) {
          IntrusiveDeque.releaseStatics((byte) -113);
          field_a = null;
          field_d = null;
          return;
        }
        field_a = null;
        field_d = null;
    }

    final IntrusiveNode previous(int param0) {
        IntrusiveNode var2 = this.field_c;
        if (var2 == this.sentinel) {
          this.field_c = null;
          return null;
        }
        this.field_c = var2.previous;
        if (param0 == 0) {
          return var2;
        }
        this.field_c = (IntrusiveNode) null;
        return var2;
    }

    final void addFirst(int param0, IntrusiveNode param1) {
        try {
          if (param1.previous != null) {
            param1.unlink(2779);
          }
          param1.field_a = this.sentinel.field_a;
          param1.previous = this.sentinel;
          if (param0 != 1392503105) {
            field_e = (String) null;
          }
          param1.previous.field_a = param1;
          param1.field_a.previous = param1;
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "bb.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int size(int param0) {
        int var4 = Pixelate.field_H ? 1 : 0;
        int var2 = param0;
        IntrusiveNode var3 = this.sentinel.field_a;
        while (this.sentinel != var3) {
          var2++;
          var3 = var3.field_a;
        }
        return var2;
    }

    final void addLast(int param0, IntrusiveNode param1) {
        try {
          if (param1.previous != null) {
            param1.unlink(2779);
          }
          if (param0 != 22125) {
            field_e = (String) null;
          }
          param1.field_a = this.sentinel;
          param1.previous = this.sentinel.previous;
          param1.previous.field_a = param1;
          param1.field_a.previous = param1;
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "bb.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public IntrusiveDeque() {
        this.sentinel = new IntrusiveNode();
        this.sentinel.field_a = this.sentinel;
        this.sentinel.previous = this.sentinel;
    }

    static {
        field_a = "Sorry, you were removed from the game you were in. This can happen if you are disconnected for too long or if the server is updated.";
        field_e = "Best: ";
        field_d = "Type your age in years";
    }
}
