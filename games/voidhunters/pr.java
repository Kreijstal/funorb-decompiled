/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pr {
    static oma field_c;
    private DualLinkNode field_h;
    private int field_e;
    private DualLinkNode[] field_g;
    private long field_b;
    private DualLinkNode field_a;
    private int field_f;
    static int field_d;

    final void a(DualLinkNode param0, byte param1, long param2) {
        DualLinkNode var5 = null;
        try {
          if (null != param0.field_d) {
            param0.d((byte) -35);
          }
          var5 = this.field_g[(int)(param2 & (long)(this.field_f - 1))];
          param0.field_d = var5.field_d;
          param0.field_e = var5;
          if (param1 > -12) {
            field_d = -43;
          }
          param0.field_d.field_e = param0;
          param0.field_e.field_d = param0;
          param0.field_i = param2;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "pr.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final DualLinkNode e(int param0) {
        DualLinkNode var4 = null;
        int var5 = VoidHunters.field_G;
        if (null == this.field_a) {
          return null;
        }
        int var2 = 40 % ((param0 + 45) / 39);
        DualLinkNode var3 = this.field_g[(int)((long)(this.field_f - 1) & this.field_b)];
        while (var3 != this.field_a) {
          if (~this.field_a.field_i == ~this.field_b) {
            var4 = this.field_a;
            this.field_a = this.field_a.field_e;
            return var4;
          }
          this.field_a = this.field_a.field_e;
        }
        this.field_a = null;
        return null;
    }

    public static void b(int param0) {
        if (param0 != 1) {
          pr.a(-20);
          field_c = null;
          return;
        }
        field_c = null;
    }

    final DualLinkNode d(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int var3;
        DualLinkNode var4;
        DualLinkNode var8;
        DualLinkNode var11;
        var3 = VoidHunters.field_G;
        if (param0 <= ~this.field_e) {
          do {
            if (this.field_f <= this.field_e) {
              return null;
            }
            fieldTemp$1 = this.field_e;
            this.field_e = this.field_e + 1;
            var4 = this.field_g[fieldTemp$1].field_e;
          } while (this.field_g[-1 + this.field_e] == var4);
          this.field_h = var4.field_e;
          return var4;
        }
        if (this.field_h != this.field_g[-1 + this.field_e]) {
          var11 = this.field_h;
          this.field_h = var11.field_e;
          return var11;
        }
        do {
          if (this.field_f <= this.field_e) {
            return null;
          }
          fieldTemp$0 = this.field_e;
          this.field_e = this.field_e + 1;
          var8 = this.field_g[fieldTemp$0].field_e;
        } while (this.field_g[-1 + this.field_e] == var8);
        this.field_h = var8.field_e;
        return var8;
    }

    final DualLinkNode a(int param0, long param1) {
        DualLinkNode var5 = null;
        int var6 = VoidHunters.field_G;
        this.field_b = param1;
        DualLinkNode var4 = this.field_g[(int)(param1 & (long)(this.field_f + param0))];
        this.field_a = var4.field_e;
        while (this.field_a != var4) {
          if (this.field_a.field_i == param1) {
            var5 = this.field_a;
            this.field_a = this.field_a.field_e;
            return var5;
          }
          this.field_a = this.field_a.field_e;
        }
        this.field_a = null;
        return null;
    }

    final static void a(int param0) {
        gib.a((byte) -104);
        if (param0 != 17496) {
          return;
        }
        cea.a(-29, 4);
    }

    final DualLinkNode c(int param0) {
        this.field_e = 0;
        if (param0 >= -18) {
          this.d(89);
          return this.d(-1);
        }
        return this.d(-1);
    }

    pr(int param0) {
        int var2 = 0;
        DualLinkNode dupTemp$1 = null;
        DualLinkNode var3;
        this.field_e = 0;
        this.field_f = param0;
        this.field_g = new DualLinkNode[param0];
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$1 = new DualLinkNode();
          var3 = dupTemp$1;
          this.field_g[var2] = dupTemp$1;
          var3.field_d = var3;
          var3.field_e = var3;
        }
    }

    static {
    }
}
