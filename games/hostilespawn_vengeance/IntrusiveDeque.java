/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveDeque {
    IntrusiveNode sentinel;
    static IntrusiveDeque field_c;
    private IntrusiveNode iterationCursor;

    final void clear(int param0) {
        IntrusiveNode var2;
        int var3;
        var3 = HostileSpawn.field_I ? 1 : 0;
        while (true) {
          var2 = this.sentinel.field_g;
          if (this.sentinel != var2) {
            var2.unlink(param0 - 5692);
            continue;
          }
          break;
        }
        this.iterationCursor = null;
        if (param0 == 5719) {
          return;
        }
        field_c = (IntrusiveDeque) null;
        return;
    }

    final IntrusiveNode beginForward(int param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 >= -2) {
          this.iterationCursor = (IntrusiveNode) null;
          var2 = this.sentinel.field_g;
          if (this.sentinel != var2) {
            this.iterationCursor = var2.field_g;
            return var2;
          }
          this.iterationCursor = null;
          return null;
        }
        var2Lifetime1 = this.sentinel.field_g;
        if (this.sentinel != var2Lifetime1) {
          this.iterationCursor = var2Lifetime1.field_g;
          return var2Lifetime1;
        }
        this.iterationCursor = null;
        return null;
    }

    final IntrusiveNode removeLast(int param0) {
        if (param0 != -27493) {
          return (IntrusiveNode) null;
        }
        IntrusiveNode var2 = this.sentinel.field_f;
        if (var2 != this.sentinel) {
          var2.unlink(27);
          return var2;
        }
        return null;
    }

    final IntrusiveNode beginBackward(byte param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 != 117) {
          this.removeFirst(-99);
          var2 = this.sentinel.field_f;
          if (this.sentinel == var2) {
            this.iterationCursor = null;
            return null;
          }
          this.iterationCursor = var2.field_f;
          return var2;
        }
        var2Lifetime1 = this.sentinel.field_f;
        if (this.sentinel == var2Lifetime1) {
          this.iterationCursor = null;
          return null;
        }
        this.iterationCursor = var2Lifetime1.field_f;
        return var2Lifetime1;
    }

    public static void clearStaticReferences(int param0) {
        if (param0 <= 46) {
          field_c = (IntrusiveDeque) null;
          field_c = null;
          return;
        }
        field_c = null;
    }

    final IntrusiveNode removeFirst(int param0) {
        IntrusiveNode var2 = this.sentinel.field_g;
        if (param0 != 18120) {
          return (IntrusiveNode) null;
        }
        if (this.sentinel != var2) {
          var2.unlink(106);
          return var2;
        }
        return null;
    }

    final void addLast(IntrusiveNode param0, int param1) {
        try {
          if (param0.field_f != null) {
            param0.unlink(123);
          }
          param0.field_g = this.sentinel;
          param0.field_f = this.sentinel.field_f;
          if (param1 <= 79) {
            this.sentinel = (IntrusiveNode) null;
          }
          param0.field_f.field_g = param0;
          param0.field_g.field_f = param0;
        } catch (RuntimeException runtimeException) {
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) runtimeException), "vl.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean isEmpty(int param0) {
        if (param0 == -20049) {
          return this.sentinel.field_g == this.sentinel ? true : false;
        }
        this.sentinel = (IntrusiveNode) null;
        return this.sentinel.field_g == this.sentinel ? true : false;
    }

    final IntrusiveNode nextBackward(byte param0) {
        IntrusiveNode var2 = this.iterationCursor;
        if (this.sentinel == var2) {
          this.iterationCursor = null;
          return null;
        }
        this.iterationCursor = var2.field_f;
        if (param0 > 4) {
          return var2;
        }
        this.removeLast(24);
        return var2;
    }

    public IntrusiveDeque() {
        this.sentinel = new IntrusiveNode();
        this.sentinel.field_f = this.sentinel;
        this.sentinel.field_g = this.sentinel;
    }

    final void addFirst(byte param0, IntrusiveNode param1) {
        try {
          if (param1.field_f != null) {
            param1.unlink(116);
          }
          if (param0 > -45) {
            this.sentinel = (IntrusiveNode) null;
          }
          param1.field_f = this.sentinel;
          param1.field_g = this.sentinel.field_g;
          param1.field_f.field_g = param1;
          param1.field_g.field_f = param1;
        } catch (RuntimeException runtimeException) {
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) runtimeException), "vl.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final IntrusiveNode nextForward(int param0) {
        if (param0 != 12684) {
          return (IntrusiveNode) null;
        }
        IntrusiveNode var2 = this.iterationCursor;
        if (this.sentinel == var2) {
          this.iterationCursor = null;
          return null;
        }
        this.iterationCursor = var2.field_g;
        return var2;
    }

    static {
        field_c = new IntrusiveDeque();
    }
}
