/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveDeque {
    IntrusiveNode sentinel;
    static String field_e;
    static Archive field_c;
    static int field_f;
    static String field_d;
    private IntrusiveNode cursor;

    final IntrusiveNode c(byte param0) {
        int var2 = 31 % ((param0 - 36) / 56);
        IntrusiveNode var3 = this.sentinel.next;
        if (this.sentinel == var3) {
          this.cursor = null;
          return null;
        }
        this.cursor = var3.next;
        return var3;
    }

    final IntrusiveNode d(byte param0) {
        IntrusiveNode var2 = this.sentinel.previous;
        if (var2 != this.sentinel) {
          var2.unlink((byte) 12);
          int var3 = -85 / ((param0 + 37) / 50);
          return var2;
        }
        return null;
    }

    final static void e(int param0) {
        ag.field_a = null;
        if (param0 >= -94) {
          field_e = (String) null;
          t.field_e = null;
          return;
        }
        t.field_e = null;
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != -22208) {
          return;
        }
        field_e = null;
        field_c = null;
    }

    final boolean isEmpty(byte obfuscationGuard) {
        if (obfuscationGuard > -34) {
          return false;
        }
        return this.sentinel == this.sentinel.previous ? true : false;
    }

    final void clear(int obfuscationGuard) {
        IntrusiveNode var5 = null;
        IntrusiveNode var4 = null;
        int var3 = Terraphoenix.field_V;
        if (obfuscationGuard != 21480) {
          this.beginBackward(-102);
          while (true) {
            var5 = this.sentinel.previous;
            if (var5 == this.sentinel) {
              break;
            }
            var5.unlink((byte) 12);
          }
          this.cursor = null;
          return;
        }
        while (true) {
          var4 = this.sentinel.previous;
          if (var4 == this.sentinel) {
            break;
          }
          var4.unlink((byte) 12);
        }
        this.cursor = null;
    }

    final static IndexedSprite a(Archive param0, int param1, byte param2, int param3) {
        RuntimeException var4 = null;
        IndexedSprite stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 18) {
            field_d = (String) null;
          }
          if (!DualLinkNode.a(param3, param1, param0, true)) {
            return null;
          }
          stackIn_6_0 = ArchiveIndex.a(param2 + 97);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("jj.I(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qk.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final IntrusiveNode nextBackward(byte obfuscationGuard) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (obfuscationGuard != -119) {
          this.b((byte) -7);
          var2 = this.cursor;
          if (var2 != this.sentinel) {
            this.cursor = var2.previous;
            return var2;
          }
          this.cursor = null;
          return null;
        }
        var2Lifetime1 = this.cursor;
        if (var2Lifetime1 != this.sentinel) {
          this.cursor = var2Lifetime1.previous;
          return var2Lifetime1;
        }
        this.cursor = null;
        return null;
    }

    final IntrusiveNode nextForward(int obfuscationGuard) {
        IntrusiveNode var2 = this.cursor;
        if (var2 == this.sentinel) {
          this.cursor = null;
          return null;
        }
        this.cursor = var2.next;
        if (obfuscationGuard <= -67) {
          return var2;
        }
        Archive var3 = (Archive) null;
        IntrusiveDeque.a((Archive) null, 85, (byte) 51, 81);
        return var2;
    }

    final IntrusiveNode beginBackward(int obfuscationGuard) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (obfuscationGuard != 9272) {
          field_f = 56;
          var2 = this.sentinel.previous;
          if (var2 == this.sentinel) {
            this.cursor = null;
            return null;
          }
          this.cursor = var2.previous;
          return var2;
        }
        var2Lifetime1 = this.sentinel.previous;
        if (var2Lifetime1 == this.sentinel) {
          this.cursor = null;
          return null;
        }
        this.cursor = var2Lifetime1.previous;
        return var2Lifetime1;
    }

    final void a(IntrusiveNode param0, byte param1) {
        try {
          if (param0.next != null) {
            param0.unlink((byte) 12);
          }
          param0.previous = this.sentinel.previous;
          param0.next = this.sentinel;
          if (param1 != 0) {
            this.clear(-11);
          }
          param0.next.previous = param0;
          param0.previous.next = param0;
        } catch (RuntimeException runtimeException) {
          throw qk.wrapException((Throwable) ((Object) runtimeException), "jj.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final IntrusiveNode b(byte param0) {
        int var2 = -86 % ((53 - param0) / 47);
        IntrusiveNode var3 = this.sentinel.next;
        if (this.sentinel != var3) {
          var3.unlink((byte) 12);
          return var3;
        }
        return null;
    }

    final void a(IntrusiveNode param0, int param1) {
        if (null != param0.next) {
          param0.unlink((byte) 12);
        }
        param0.next = this.sentinel.next;
        param0.previous = this.sentinel;
        param0.next.previous = param0;
        if (param1 != -16611) {
          return;
        }
        try {
          param0.previous.next = param0;
        } catch (RuntimeException runtimeException) {
          throw qk.wrapException((Throwable) ((Object) runtimeException), "jj.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public IntrusiveDeque() {
        this.sentinel = new IntrusiveNode();
        this.sentinel.previous = this.sentinel;
        this.sentinel.next = this.sentinel;
    }

    static {
        field_d = "Waiting for extra data";
    }
}
