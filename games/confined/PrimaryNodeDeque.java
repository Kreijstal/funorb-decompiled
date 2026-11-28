/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PrimaryNodeDeque {
    static String field_g;
    static ResourceArchive field_b;
    IntrusiveNode sentinel;
    static e field_f;
    private IntrusiveNode iterationCursor;
    static ResourceArchive field_e;
    static String field_c;

    final IntrusiveNode removeLast(byte param0) {
        if (param0 <= 83) {
          return (IntrusiveNode) null;
        }
        IntrusiveNode var2 = this.sentinel.field_a;
        if (this.sentinel != var2) {
          var2.unlink(true);
          return var2;
        }
        return null;
    }

    final IntrusiveNode nextForward(int param0) {
        IntrusiveNode var2 = this.iterationCursor;
        if (this.sentinel == var2) {
          this.iterationCursor = null;
          return null;
        }
        this.iterationCursor = var2.field_h;
        if (param0 == 2123) {
          return var2;
        }
        this.nextForward(48);
        return var2;
    }

    final IntrusiveNode removeFirst(int param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 != 1) {
          this.removeLast((byte) 116);
          var2 = this.sentinel.field_h;
          if (var2 != this.sentinel) {
            var2.unlink(true);
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.sentinel.field_h;
        if (var2Lifetime1 != this.sentinel) {
          var2Lifetime1.unlink(true);
          return var2Lifetime1;
        }
        return null;
    }

    final void addLast(IntrusiveNode param0, byte param1) {
        try {
          int var3_int = -8 / ((param1 - 0) / 61);
          if (param0.field_a != null) {
            param0.unlink(true);
          }
          param0.field_a = this.sentinel.field_a;
          param0.field_h = this.sentinel;
          param0.field_a.field_h = param0;
          param0.field_h.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "mn.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean isEmpty(int param0) {
        if (param0 != -1) {
          return false;
        }
        return this.sentinel.field_h == this.sentinel ? true : false;
    }

    final static void a(String param0, int param1, byte param2, int param3, int param4, int param5) {
        try {
          nn.field_t[param4].d(param1, param3);
          pn.field_a.drawString(param0, 2 + param1, 14 + param3, 16777215, -1);
          if (param2 != -30) {
            PrimaryNodeDeque.clearStaticReferences(-116);
          }
          pn.field_a.drawRightAligned(Integer.toString(param5), 39 + param1, 38 + param3, 16777215, -1);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "mn.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void addFirst(IntrusiveNode param0, int param1) {
        if (param1 != -1) {
          return;
        }
        try {
          if (param0.field_a != null) {
            param0.unlink(true);
          }
          param0.field_h = this.sentinel.field_h;
          param0.field_a = this.sentinel;
          param0.field_a.field_h = param0;
          param0.field_h.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "mn.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final IntrusiveNode nextBackward(byte param0) {
        IntrusiveNode var2 = this.iterationCursor;
        if (this.sentinel == var2) {
          this.iterationCursor = null;
          return null;
        }
        int var3 = -15 % ((param0 - 12) / 41);
        this.iterationCursor = var2.field_a;
        return var2;
    }

    final void clear(int param0) {
        IntrusiveNode var2;
        int var3;
        var3 = Confined.field_J ? 1 : 0;
        while (true) {
          var2 = this.sentinel.field_h;
          if (var2 != this.sentinel) {
            var2.unlink(true);
            continue;
          }
          break;
        }
        this.iterationCursor = null;
        if (param0 >= 29) {
          return;
        }
        field_b = (ResourceArchive) null;
        return;
    }

    final IntrusiveNode beginBackwardFrom(IntrusiveNode param0, boolean param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        IntrusiveNode stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            this.beginBackward(true);
          }
          if (param0 == null) {
            var3 = this.sentinel.field_a;
          } else {
            var3 = param0;
          }
          if (this.sentinel == var3) {
            this.iterationCursor = null;
            stackIn_8_0 = null;
            return (IntrusiveNode) (stackIn_8_0);
          }
          this.iterationCursor = var3.field_a;
          stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("mn.C(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final IntrusiveNode beginForward(int param0) {
        IntrusiveNode var2 = this.sentinel.field_h;
        if (var2 != this.sentinel) {
          int var3 = -59 / ((-54 - param0) / 59);
          this.iterationCursor = var2.field_h;
          return var2;
        }
        this.iterationCursor = null;
        return null;
    }

    final IntrusiveNode beginBackward(boolean param0) {
        IntrusiveNode var2 = this.sentinel.field_a;
        if (this.sentinel == var2) {
          this.iterationCursor = null;
          return null;
        }
        this.iterationCursor = var2.field_a;
        if (!param0) {
          return var2;
        }
        PrimaryNodeDeque.clearStaticReferences(-115);
        return var2;
    }

    public PrimaryNodeDeque() {
        this.sentinel = new IntrusiveNode();
        this.sentinel.field_a = this.sentinel;
        this.sentinel.field_h = this.sentinel;
    }

    public static void clearStaticReferences(int param0) {
        field_f = null;
        field_g = null;
        field_c = null;
        field_e = null;
        field_b = null;
        int var1 = -97 / ((param0 - 17) / 52);
    }

    static {
        field_g = "Waiting for textures";
        field_f = new e(4, 1, 1, 1);
        field_c = "Click to skip";
    }
}
