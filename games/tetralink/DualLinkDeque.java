/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DualLinkDeque {
    private DualLinkNode sentinel;
    static boolean field_a;
    static Archive field_f;
    private DualLinkNode field_c;
    static String field_b;
    static boolean field_e;

    final int size(int param0) {
        int var4 = TetraLink.field_J;
        int var2 = param0;
        DualLinkNode var3 = this.sentinel.secondaryNext;
        while (var3 != this.sentinel) {
          var3 = var3.secondaryNext;
          var2++;
        }
        return var2;
    }

    final static boolean b(int param0) {
        if (param0 != 0) {
          return false;
        }
        if (hn.field_M == null) {
          return false;
        }
        if (!hn.field_M.d(0)) {
          return false;
        }
        return true;
    }

    public static void a(int param0) {
        if (param0 != 21332) {
          return;
        }
        field_b = null;
        field_f = null;
    }

    final DualLinkNode a(boolean param0) {
        DualLinkNode var2 = this.field_c;
        if (this.sentinel == var2) {
          this.field_c = null;
          return null;
        }
        if (!param0) {
          this.field_c = var2.secondaryNext;
          return var2;
        }
        field_a = true;
        this.field_c = var2.secondaryNext;
        return var2;
    }

    final DualLinkNode a(byte param0) {
        int var2 = 15 % ((param0 - 20) / 62);
        DualLinkNode var3 = this.sentinel.secondaryNext;
        if (var3 != this.sentinel) {
          this.field_c = var3.secondaryNext;
          return var3;
        }
        this.field_c = null;
        return null;
    }

    final DualLinkNode removeFirst(int param0) {
        if (param0 != -15464) {
          return (DualLinkNode) null;
        }
        DualLinkNode var2 = this.sentinel.secondaryNext;
        if (var2 != this.sentinel) {
          var2.unlinkSecondary(0);
          return var2;
        }
        return null;
    }

    final static void a(int[] param0, int param1, int param2) {
        try {
          hg.field_f[param1] = param0;
          kk.field_X[param1] = new cl(param1);
          if (param2 != -13850) {
            field_a = true;
          }
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "jo.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public DualLinkDeque() {
        this.sentinel = new DualLinkNode();
        this.sentinel.secondaryNext = this.sentinel;
        this.sentinel.secondaryPrevious = this.sentinel;
    }

    final void addLast(DualLinkNode param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != param0.secondaryPrevious) {
            param0.unlinkSecondary(param1 + 0);
          }
          param0.secondaryPrevious = this.sentinel.secondaryPrevious;
          param0.secondaryNext = this.sentinel;
          param0.secondaryPrevious.secondaryNext = param0;
          param0.secondaryNext.secondaryPrevious = param0;
          if (param1 == 0) {
            return;
          }
          field_b = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("jo.E(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_b = "You have not yet unlocked this option for use.";
    }
}
