/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb {
    static kh field_c;
    private DualLinkNode field_a;
    private DualLinkNode field_b;

    final void a(byte param0, DualLinkNode param1) {
        if (null != param1.field_j) {
          param1.unlinkSecondary(0);
        }
        param1.field_j = this.field_a.field_j;
        if (param0 <= 116) {
          return;
        }
        try {
          param1.field_p = this.field_a;
          param1.field_j.field_p = param1;
          param1.field_p.field_j = param1;
        } catch (RuntimeException runtimeException) {
          throw rb.wrapThrowable((Throwable) ((Object) runtimeException), "gb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final DualLinkNode c(int param0) {
        DualLinkNode var2 = null;
        DualLinkNode var2Lifetime1;
        if (param0 != 24542) {
          this.field_a = (DualLinkNode) null;
          var2 = this.field_b;
          if (this.field_a != var2) {
            this.field_b = var2.field_p;
            return var2;
          }
          this.field_b = null;
          return null;
        }
        var2Lifetime1 = this.field_b;
        if (this.field_a != var2Lifetime1) {
          this.field_b = var2Lifetime1.field_p;
          return var2Lifetime1;
        }
        this.field_b = null;
        return null;
    }

    final int b(int param0) {
        int var2 = 0;
        DualLinkNode var3 = null;
        int var4 = Torquing.field_u;
        DualLinkNode var3Lifetime1;
        int var2Lifetime1;
        if (param0 == -24088) {
          var2 = 0;
          var3 = this.field_a.field_p;
          while (this.field_a != var3) {
            var3 = var3.field_p;
            var2++;
          }
          return var2;
        }
        DualLinkNode var5 = (DualLinkNode) null;
        this.a((byte) -124, (DualLinkNode) null);
        var2Lifetime1 = 0;
        var3Lifetime1 = this.field_a.field_p;
        while (this.field_a != var3Lifetime1) {
          var3Lifetime1 = var3Lifetime1.field_p;
          var2Lifetime1++;
        }
        return var2Lifetime1;
    }

    final DualLinkNode a(int param0) {
        int var2 = 25 / ((69 - param0) / 55);
        DualLinkNode var3 = this.field_a.field_p;
        if (var3 != this.field_a) {
          var3.unlinkSecondary(0);
          return var3;
        }
        return null;
    }

    final DualLinkNode a(byte param0) {
        DualLinkNode var2 = this.field_a.field_p;
        if (var2 == this.field_a) {
          this.field_b = null;
          return null;
        }
        if (param0 < -35) {
          this.field_b = var2.field_p;
          return var2;
        }
        return (DualLinkNode) null;
    }

    public static void d(int param0) {
        field_c = null;
        int var1 = -51 / ((-42 - param0) / 39);
    }

    public gb() {
        this.field_a = new DualLinkNode();
        this.field_a.field_p = this.field_a;
        this.field_a.field_j = this.field_a;
    }

    static {
    }
}
