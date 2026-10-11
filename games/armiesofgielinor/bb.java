/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb {
    private NodeDeque field_e;
    static boolean field_a;
    static String field_d;
    static int field_c;
    private IntrusiveNode field_f;
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
          stackIn_3_0 = qk.field_e.a(param1, param0 ^ -72, "");
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
          throw ig.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
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
            var3 = this.field_e.sentinel.previous;
          } else {
            var3 = param1;
          }
          if (this.field_e.sentinel == var3) {
            this.field_f = null;
            stackIn_9_0 = null;
            return (IntrusiveNode) (stackIn_9_0);
          }
          this.field_f = var3.previous;
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
          throw ig.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final IntrusiveNode b(int param0) {
        if (param0 != 50) {
          return (IntrusiveNode) null;
        }
        IntrusiveNode var2 = this.field_f;
        if (var2 == this.field_e.sentinel) {
          this.field_f = null;
          return null;
        }
        this.field_f = var2.next;
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

    final IntrusiveNode b(byte param0) {
        if (param0 != -112) {
          return (IntrusiveNode) null;
        }
        IntrusiveNode var2 = this.field_f;
        if (var2 != this.field_e.sentinel) {
          this.field_f = var2.previous;
          return var2;
        }
        this.field_f = null;
        return null;
    }

    final IntrusiveNode a(int param0) {
        IntrusiveNode var2 = this.field_e.sentinel.previous;
        if (param0 != 50) {
          field_d = (String) null;
          if (var2 != this.field_e.sentinel) {
            this.field_f = var2.previous;
            return var2;
          }
          this.field_f = null;
          return null;
        }
        if (var2 != this.field_e.sentinel) {
          this.field_f = var2.previous;
          return var2;
        }
        this.field_f = null;
        return null;
    }

    final IntrusiveNode c(int param0) {
        IntrusiveNode var2 = this.field_e.sentinel.next;
        if (var2 == this.field_e.sentinel) {
          this.field_f = null;
          return null;
        }
        if (param0 == 50) {
          this.field_f = var2.next;
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
            var3 = this.field_e.sentinel.next;
          }
          if (this.field_e.sentinel == var3) {
            this.field_f = null;
            stackIn_9_0 = null;
            return (IntrusiveNode) (stackIn_9_0);
          }
          this.field_f = var3.next;
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
          throw ig.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    bb(NodeDeque param0) {
        try {
          this.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "bb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = true;
        field_d = "Your email address is used to identify this account";
        field_c = 50;
    }
}
