/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NodeIterator {
    static String field_j;
    static boolean field_k;
    private NodeDeque field_h;
    static int field_f;
    private IntrusiveNode field_a;
    static String field_i;
    static boolean field_d;
    static IndexedSprite[] field_c;
    static RgbSprite field_b;
    static String field_e;
    static String field_g;

    final IntrusiveNode a(int param0, IntrusiveNode param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        IntrusiveNode stackIn_8_0 = null;
        IntrusiveNode stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            var3 = this.field_h.sentinel.previous;
          } else {
            var3 = param1;
          }
          if (this.field_h.sentinel == var3) {
            this.field_a = null;
            stackIn_5_0 = null;
            return (IntrusiveNode) (stackIn_5_0);
          }
          this.field_a = var3.previous;
          if (param0 == 24192) {
            stackIn_10_0 = var3;
            return stackIn_10_0;
          }
          stackIn_8_0 = (IntrusiveNode) null;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("jc.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final IntrusiveNode b(int param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 != 2) {
          IntrusiveNode var3 = (IntrusiveNode) null;
          this.a(-4, (IntrusiveNode) null);
          var2 = this.field_h.sentinel.next;
          if (var2 == this.field_h.sentinel) {
            this.field_a = null;
            return null;
          }
          this.field_a = var2.next;
          return var2;
        }
        var2Lifetime1 = this.field_h.sentinel.next;
        if (var2Lifetime1 == this.field_h.sentinel) {
          this.field_a = null;
          return null;
        }
        this.field_a = var2Lifetime1.next;
        return var2Lifetime1;
    }

    final static String b(byte param0) {
        if (pg.field_A) {
          if (param0 != -122) {
            field_j = (String) null;
            return null;
          }
          return null;
        }
        if (si.field_m < ik.field_c) {
          if (param0 != -122) {
            field_j = (String) null;
            return null;
          }
          return null;
        }
        if (ik.field_c + ni.field_c > si.field_m) {
          return rc.field_b;
        }
        if (param0 != -122) {
          field_j = (String) null;
          return null;
        }
        return null;
    }

    final static boolean a(int param0) {
        if (param0 != 2) {
          field_c = (IndexedSprite[]) null;
          if (an.field_i != null) {
            return true;
          }
          if (fk.a(0)) {
            return true;
          }
          if (FunOrbClient.field_x != null) {
            return true;
          }
          if (!a.a(false)) {
            return false;
          }
          return true;
        }
        if (an.field_i != null) {
          return true;
        }
        if (fk.a(0)) {
          return true;
        }
        if (FunOrbClient.field_x != null) {
          return true;
        }
        if (!a.a(false)) {
          return false;
        }
        return true;
    }

    NodeIterator(NodeDeque param0) {
        try {
          this.field_h = param0;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "jc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final IntrusiveNode d(int param0) {
        if (param0 != 2) {
          return (IntrusiveNode) null;
        }
        IntrusiveNode var2 = this.field_a;
        if (this.field_h.sentinel != var2) {
          this.field_a = var2.next;
          return var2;
        }
        this.field_a = null;
        return null;
    }

    final static void a(byte param0) {
        nm.field_n = null;
        dj.field_j = null;
        vl.field_r = false;
        oc.field_d = null;
        a.field_g = null;
        if (param0 != -2) {
          NodeIterator.b((byte) 42);
        }
    }

    final IntrusiveNode c(int param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 != 2) {
          this.field_h = (NodeDeque) null;
          var2 = this.field_h.sentinel.previous;
          if (var2 == this.field_h.sentinel) {
            this.field_a = null;
            return null;
          }
          this.field_a = var2.previous;
          return var2;
        }
        var2Lifetime1 = this.field_h.sentinel.previous;
        if (var2Lifetime1 == this.field_h.sentinel) {
          this.field_a = null;
          return null;
        }
        this.field_a = var2Lifetime1.previous;
        return var2Lifetime1;
    }

    final IntrusiveNode a(boolean param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (!param0) {
          NodeIterator.a(-87);
          var2 = this.field_a;
          if (this.field_h.sentinel == var2) {
            this.field_a = null;
            return null;
          }
          this.field_a = var2.previous;
          return var2;
        }
        var2Lifetime1 = this.field_a;
        if (this.field_h.sentinel == var2Lifetime1) {
          this.field_a = null;
          return null;
        }
        this.field_a = var2Lifetime1.previous;
        return var2Lifetime1;
    }

    final IntrusiveNode a(boolean param0, IntrusiveNode param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        IntrusiveNode stackIn_8_0 = null;
        IntrusiveNode stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            var3 = this.field_h.sentinel.next;
          } else {
            var3 = param1;
          }
          if (this.field_h.sentinel == var3) {
            this.field_a = null;
            stackIn_5_0 = null;
            return (IntrusiveNode) (stackIn_5_0);
          }
          this.field_a = var3.next;
          if (!param0) {
            stackIn_10_0 = var3;
            return stackIn_10_0;
          }
          stackIn_8_0 = (IntrusiveNode) null;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("jc.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void e(int param0) {
        field_i = null;
        if (param0 == 5370) {
          field_j = null;
          field_b = null;
          field_g = null;
          field_e = null;
          field_c = null;
          return;
        }
        field_d = false;
        field_j = null;
        field_b = null;
        field_g = null;
        field_e = null;
        field_c = null;
    }

    static {
        field_j = "Movement and Navigation";
        field_f = 2;
        field_k = false;
        field_e = "RESIGNED";
        field_i = "Return to Main Menu";
        field_g = "Your ignore list is full. Max of 100 hit.";
    }
}
