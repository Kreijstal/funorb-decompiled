/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveDeque {
    static int[] field_a;
    static String field_b;
    IntrusiveNode sentinel;
    private IntrusiveNode iterationCursor;

    final IntrusiveNode removeLast(byte param0) {
        IntrusiveNode var2 = this.sentinel.field_c;
        if (this.sentinel == var2) {
          return null;
        }
        int var3 = -80 / ((param0 + 14) / 34);
        var2.unlink(57);
        return var2;
    }

    final IntrusiveNode nextForward(int param0) {
        IntrusiveNode var2 = this.iterationCursor;
        if (this.sentinel == var2) {
          this.iterationCursor = null;
          return null;
        }
        this.iterationCursor = var2.field_e;
        if (param0 != 853) {
          field_b = (String) null;
        }
        return var2;
    }

    final IntrusiveNode beginForward(byte param0) {
        IntrusiveNode var2 = this.sentinel.field_e;
        if (var2 == this.sentinel) {
          this.iterationCursor = null;
          return null;
        }
        int var3 = -122 / ((58 - param0) / 56);
        this.iterationCursor = var2.field_e;
        return var2;
    }

    final boolean isEmpty(int param0) {
        if (param0 != -3088) {
          field_a = (int[]) null;
        }
        return this.sentinel.field_e == this.sentinel ? true : false;
    }

    final IntrusiveNode beginBackward(byte param0) {
        IntrusiveNode var2 = this.sentinel.field_c;
        if (var2 == this.sentinel) {
          this.iterationCursor = null;
          return null;
        }
        this.iterationCursor = var2.field_c;
        if (param0 != -122) {
          this.iterationCursor = (IntrusiveNode) null;
        }
        return var2;
    }

    final void addLast(int param0, IntrusiveNode param1) {
        if (null != param1.field_c) {
          param1.unlink(57);
        }
        if (param0 >= -68) {
          return;
        }
        try {
          param1.field_c = this.sentinel.field_c;
          param1.field_e = this.sentinel;
          param1.field_c.field_e = param1;
          param1.field_e.field_c = param1;
        } catch (RuntimeException runtimeException) {
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) runtimeException), "im.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(char param0, int param1, int param2) {
        int var4 = 0;
        int var5 = OrbDefence.field_D ? 1 : 0;
        char[] var6 = new char[param1];
        char[] var3 = var6;
        int var4Lifetime1;
        for (var4 = 0; var4 < param1; var4++) {
          var6[var4] = param0;
        }
        var4Lifetime1 = 70 / ((0 - param2) / 53);
        return new String(var3);
    }

    final int size(byte param0) {
        int var4 = OrbDefence.field_D ? 1 : 0;
        int var2 = 0;
        IntrusiveNode var3 = this.sentinel.field_e;
        if (param0 != 52) {
          this.sentinel = (IntrusiveNode) null;
        }
        while (this.sentinel != var3) {
          var2++;
          var3 = var3.field_e;
        }
        return var2;
    }

    public static void a(int param0) {
        if (param0 != 9) {
          IntrusiveDeque.a('O', 32, 30);
        }
        field_b = null;
        field_a = null;
    }

    final IntrusiveNode nextBackward(int param0) {
        IntrusiveNode var2 = this.iterationCursor;
        if (param0 != 10708) {
          this.removeLast((byte) 52);
        }
        if (var2 == this.sentinel) {
          this.iterationCursor = null;
          return null;
        }
        this.iterationCursor = var2.field_c;
        return var2;
    }

    public IntrusiveDeque() {
        this.sentinel = new IntrusiveNode();
        this.sentinel.field_e = this.sentinel;
        this.sentinel.field_c = this.sentinel;
    }

    final void addFirst(IntrusiveNode param0, int param1) {
        if (param0.field_c != null) {
          param0.unlink(57);
        }
        if (param1 != 9) {
          return;
        }
        try {
          param0.field_e = this.sentinel.field_e;
          param0.field_c = this.sentinel;
          param0.field_c.field_e = param0;
          param0.field_e.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) runtimeException), "im.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void clear(boolean param0) {
        IntrusiveNode var2 = null;
        int var3 = OrbDefence.field_D ? 1 : 0;
        while (true) {
          var2 = this.sentinel.field_e;
          if (var2 == this.sentinel) {
            break;
          }
          var2.unlink(57);
        }
        if (param0) {
          this.nextForward(79);
        }
        this.iterationCursor = null;
    }

    final IntrusiveNode removeFirst(int param0) {
        if (param0 != 0) {
          this.iterationCursor = (IntrusiveNode) null;
        }
        IntrusiveNode var2 = this.sentinel.field_e;
        if (this.sentinel == var2) {
          return null;
        }
        var2.unlink(param0 ^ 57);
        return var2;
    }

    static {
        field_b = "Names cannot contain consecutive spaces";
        field_a = new int[9];
    }
}
