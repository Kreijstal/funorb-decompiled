/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em {
    static boolean field_e;
    private long field_f;
    private DualLinkNode[] field_b;
    private DualLinkNode field_h;
    private int field_a;
    private DualLinkNode field_i;
    static String field_c;
    static hd field_d;
    private int field_g;

    public static void c(byte param0) {
        field_d = null;
        if (param0 != 36) {
          field_d = (hd) null;
          field_c = null;
          return;
        }
        field_c = null;
    }

    final DualLinkNode a(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int var3;
        DualLinkNode var4;
        DualLinkNode var5;
        DualLinkNode var9;
        DualLinkNode var12;
        var3 = Kickabout.field_G;
        if (param0 >= this.field_g) {
          do {
            if (this.field_a <= this.field_g) {
              return null;
            }
            fieldTemp$1 = this.field_g;
            this.field_g = this.field_g + 1;
            var4 = this.field_b[fieldTemp$1].field_f;
            var5 = var4;
          } while (var4 == this.field_b[this.field_g - 1]);
          this.field_i = var5.field_f;
          return var5;
        }
        if (this.field_i != this.field_b[-1 + this.field_g]) {
          var12 = this.field_i;
          this.field_i = var12.field_f;
          return var12;
        }
        do {
          if (this.field_a <= this.field_g) {
            return null;
          }
          fieldTemp$0 = this.field_g;
          this.field_g = this.field_g + 1;
          var4 = this.field_b[fieldTemp$0].field_f;
          var9 = var4;
        } while (var4 == this.field_b[this.field_g - 1]);
        this.field_i = var9.field_f;
        return var9;
    }

    final void a(DualLinkNode param0, byte param1, long param2) {
        DualLinkNode var5 = null;
        if (param0.field_e != null) {
          param0.unlinkSecondary(param1 ^ 74);
        }
        if (param1 != -4) {
          return;
        }
        try {
          var5 = this.field_b[(int)((long)(-1 + this.field_a) & param2)];
          param0.field_e = var5.field_e;
          param0.field_f = var5;
          param0.field_e.field_f = param0;
          param0.field_l = param2;
          param0.field_f.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "em.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final DualLinkNode b(byte param0) {
        this.field_g = 0;
        if (param0 != 72) {
          return (DualLinkNode) null;
        }
        return this.a(0);
    }

    final DualLinkNode a(byte param0) {
        DualLinkNode var2;
        DualLinkNode var3;
        int var4;
        DualLinkNode var2Lifetime1;
        DualLinkNode var3Lifetime1;
        var4 = Kickabout.field_G;
        if (null == this.field_h) {
          return null;
        }
        if (param0 > 19) {
          var2 = this.field_b[(int)((long)(-1 + this.field_a) & this.field_f)];
          while (true) {
            if (var2 == this.field_h) {
              this.field_h = null;
              return null;
            }
            if (~this.field_f != ~this.field_h.field_l) {
              this.field_h = this.field_h.field_f;
              continue;
            }
            break;
          }
          var3 = this.field_h;
          this.field_h = this.field_h.field_f;
          return var3;
        }
        field_d = (hd) null;
        var2Lifetime1 = this.field_b[(int)((long)(-1 + this.field_a) & this.field_f)];
        while (true) {
          if (var2Lifetime1 == this.field_h) {
            this.field_h = null;
            return null;
          }
          if (~this.field_f != ~this.field_h.field_l) {
            this.field_h = this.field_h.field_f;
            continue;
          }
          break;
        }
        var3Lifetime1 = this.field_h;
        this.field_h = this.field_h.field_f;
        return var3Lifetime1;
    }

    em(int param0) {
        int var2 = 0;
        DualLinkNode dupTemp$1 = null;
        DualLinkNode var3;
        this.field_g = 0;
        this.field_a = param0;
        this.field_b = new DualLinkNode[param0];
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$1 = new DualLinkNode();
          var3 = dupTemp$1;
          this.field_b[var2] = dupTemp$1;
          var3.field_e = var3;
          var3.field_f = var3;
        }
    }

    final DualLinkNode a(int param0, long param1) {
        DualLinkNode var4;
        DualLinkNode var5;
        int var6;
        DualLinkNode var5Lifetime1;
        var6 = Kickabout.field_G;
        this.field_f = param1;
        var4 = this.field_b[(int)((long)(this.field_a - 1) & param1)];
        if (param0 == -3611) {
          this.field_h = var4.field_f;
          while (true) {
            if (var4 == this.field_h) {
              this.field_h = null;
              return null;
            }
            if (~param1 != ~this.field_h.field_l) {
              this.field_h = this.field_h.field_f;
              continue;
            }
            break;
          }
          var5 = this.field_h;
          this.field_h = this.field_h.field_f;
          return var5;
        }
        this.field_h = (DualLinkNode) null;
        this.field_h = var4.field_f;
        while (true) {
          if (var4 == this.field_h) {
            this.field_h = null;
            return null;
          }
          if (~param1 != ~this.field_h.field_l) {
            this.field_h = this.field_h.field_f;
            continue;
          }
          break;
        }
        var5Lifetime1 = this.field_h;
        this.field_h = this.field_h.field_f;
        return var5Lifetime1;
    }

    static {
        field_e = false;
        field_c = "Quick Chat lobby";
    }
}
