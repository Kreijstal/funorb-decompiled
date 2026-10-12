/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NodeIterator {
    private NodeDeque deque;
    static boolean field_a;
    static String field_d;
    static int field_c;
    private IntrusiveNode cursor;
    static RgbSprite[] field_b;

    final static byte[] a(int param0, String param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 50) {
            field_c = -105;
          }
          stackIn_3_0 = qk.field_e.getFileByName(param1, param0 ^ -72, "");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("bb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 > -68) {
          return;
        }
        field_b = null;
        field_d = null;
    }

    final IntrusiveNode a(boolean param0, IntrusiveNode param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        IntrusiveNode stackIn_2_0 = null;
        Object stackIn_9_0 = null;
        IntrusiveNode stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            stackIn_2_0 = (IntrusiveNode) null;
            return stackIn_2_0;
          }
          if (param1 == null) {
            var3 = this.deque.sentinel.previous;
          } else {
            var3 = param1;
          }
          if (this.deque.sentinel == var3) {
            this.cursor = null;
            stackIn_9_0 = null;
            return (IntrusiveNode) (stackIn_9_0);
          }
          this.cursor = var3.previous;
          stackIn_11_0 = var3;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("bb.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final IntrusiveNode next(int obfuscationGuard) {
        if (obfuscationGuard != 50) {
          return (IntrusiveNode) null;
        }
        IntrusiveNode var2 = this.cursor;
        if (var2 == this.deque.sentinel) {
          this.cursor = null;
          return null;
        }
        this.cursor = var2.next;
        return var2;
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        if (null == tn.field_Z) {
          if (null != Spell.field_b &&
            Spell.field_b.l(18585)) {
            Spell.field_b = null;
            ot.g(76);
            return true;
          }
          if (param3 != 50) {
            field_b = (RgbSprite[]) null;
          }
        } else {
          if (tn.field_Z.c((byte) -121)) {
            ot.g(76);
            return true;
          }
          if (null == Spell.field_b) {
            if (param3 != 50) {
              field_b = (RgbSprite[]) null;
            }
            if (jt.a((byte) -92)) {
              return true;
            }
            if (!vt.a(param1, param0, param2, (byte) 28)) {
              return false;
            }
            return true;
          }
          if (Spell.field_b.l(18585)) {
            Spell.field_b = null;
            ot.g(76);
            return true;
          }
          if (param3 == 50) {
            if (jt.a((byte) -92)) {
              return true;
            }
            if (!vt.a(param1, param0, param2, (byte) 28)) {
              return false;
            }
            return true;
          }
          field_b = (RgbSprite[]) null;
        }
        if (jt.a((byte) -92)) {
          return true;
        }
        if (vt.a(param1, param0, param2, (byte) 28)) {
          return true;
        }
        return false;
    }

    final IntrusiveNode previous(byte obfuscationGuard) {
        if (obfuscationGuard != -112) {
          return (IntrusiveNode) null;
        }
        IntrusiveNode var2 = this.cursor;
        if (var2 != this.deque.sentinel) {
          this.cursor = var2.previous;
          return var2;
        }
        this.cursor = null;
        return null;
    }

    final IntrusiveNode last(int obfuscationGuard) {
        IntrusiveNode var2 = this.deque.sentinel.previous;
        if (obfuscationGuard != 50) {
          field_d = (String) null;
          if (var2 != this.deque.sentinel) {
            this.cursor = var2.previous;
            return var2;
          }
          this.cursor = null;
          return null;
        }
        if (var2 != this.deque.sentinel) {
          this.cursor = var2.previous;
          return var2;
        }
        this.cursor = null;
        return null;
    }

    final IntrusiveNode first(int obfuscationGuard) {
        IntrusiveNode var2 = this.deque.sentinel.next;
        if (var2 == this.deque.sentinel) {
          this.cursor = null;
          return null;
        }
        if (obfuscationGuard == 50) {
          this.cursor = var2.next;
          return var2;
        }
        return (IntrusiveNode) null;
    }

    final IntrusiveNode a(IntrusiveNode param0, boolean param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        IntrusiveNode stackIn_2_0 = null;
        Object stackIn_9_0 = null;
        IntrusiveNode stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            stackIn_2_0 = (IntrusiveNode) null;
            return stackIn_2_0;
          }
          if (param0 != null) {
            var3 = param0;
          } else {
            var3 = this.deque.sentinel.next;
          }
          if (this.deque.sentinel == var3) {
            this.cursor = null;
            stackIn_9_0 = null;
            return (IntrusiveNode) (stackIn_9_0);
          }
          this.cursor = var3.next;
          stackIn_11_0 = var3;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("bb.B(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    NodeIterator(NodeDeque deque) {
        try {
          this.deque = deque;
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "bb.<init>(" + (deque != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = true;
        field_d = "Your email address is used to identify this account";
        field_c = 50;
    }
}
