/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DualLinkDeque {
    static String field_d;
    static double field_e;
    private DualLinkNode field_a;
    private DualLinkNode field_c;
    static Sprite field_b;

    final DualLinkNode a(boolean param0) {
        DualLinkNode var2 = this.field_a.secondaryNext;
        if (this.field_a == var2) {
          return null;
        }
        var2.unlinkSecondary(0);
        if (param0) {
          return var2;
        }
        return (DualLinkNode) null;
    }

    final int b(boolean param0) {
        int var4 = BachelorFridge.field_y;
        int var2 = 0;
        DualLinkNode var3 = this.field_a.secondaryNext;
        while (var3 != this.field_a) {
          var3 = var3.secondaryNext;
          var2++;
        }
        if (param0) {
          return var2;
        }
        field_e = 0.13565851329759948;
        return var2;
    }

    final DualLinkNode a(int param0) {
        DualLinkNode var2 = this.field_a.secondaryNext;
        if (param0 >= -73) {
          return (DualLinkNode) null;
        }
        if (var2 != this.field_a) {
          this.field_c = var2.secondaryNext;
          return var2;
        }
        this.field_c = null;
        return null;
    }

    final DualLinkNode a(byte param0) {
        DualLinkNode var2 = this.field_c;
        if (var2 == this.field_a) {
          this.field_c = null;
          return null;
        }
        this.field_c = var2.secondaryNext;
        if (param0 >= 80) {
          return var2;
        }
        this.a((byte) 52);
        return var2;
    }

    public DualLinkDeque() {
        this.field_a = new DualLinkNode();
        this.field_a.secondaryPrevious = this.field_a;
        this.field_a.secondaryNext = this.field_a;
    }

    public static void b(int param0) {
        field_d = null;
        field_b = null;
        if (param0 != -1) {
          field_d = (String) null;
        }
    }

    final void a(DualLinkNode param0, byte param1) {
        try {
          if (param0.secondaryPrevious != null) {
            param0.unlinkSecondary(0);
          }
          param0.secondaryPrevious = this.field_a.secondaryPrevious;
          param0.secondaryNext = this.field_a;
          param0.secondaryPrevious.secondaryNext = param0;
          int var3_int = -71 / ((param1 - 20) / 55);
          param0.secondaryNext.secondaryPrevious = param0;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "in.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_e = -1.0;
        field_d = "<%0> is not a member, and cannot play with the current options.";
    }
}
