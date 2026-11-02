/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh {
    private int field_f;
    private IntrusiveNode field_g;
    private IntrusiveNode field_c;
    static pf[] field_e;
    private int field_d;
    private IntrusiveNode[] field_b;
    static CipherPacketBuffer field_a;

    public static void b(boolean param0) {
        field_e = null;
        if (param0) {
          vh.b(false);
          field_a = null;
          return;
        }
        field_a = null;
    }

    final void a(IntrusiveNode param0, int param1, long param2) {
        IntrusiveNode var5 = null;
        try {
          if (null != param0.field_a) {
            param0.a(true);
          }
          if (param1 != 11) {
            vh.b(false);
          }
          var5 = this.field_b[(int)((long)(this.field_d - 1) & param2)];
          param0.field_h = var5;
          param0.field_a = var5.field_a;
          param0.field_a.field_h = param0;
          param0.field_h.field_a = param0;
          param0.field_i = param2;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "vh.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void b(int param0) {
        if (param0 != -4749) {
          field_e = (pf[]) null;
        }
        if (IntrusiveNode.field_e == 10) {
          ClientException.a((byte) 126);
          IntrusiveNode.field_e = 11;
        } else {
          if (!ja.c((byte) -126)) {
            ClientException.a((byte) 126);
            IntrusiveNode.field_e = 11;
          }
        }
        mk.field_o = true;
    }

    final IntrusiveNode a(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int var3;
        IntrusiveNode var4;
        IntrusiveNode var5;
        IntrusiveNode var9;
        IntrusiveNode var12;
        var3 = Confined.field_J ? 1 : 0;
        if (param0 < 66) {
          return (IntrusiveNode) null;
        }
        if (0 >= this.field_f) {
          do {
            if (this.field_f >= this.field_d) {
              return null;
            }
            fieldTemp$1 = this.field_f;
            this.field_f = this.field_f + 1;
            var4 = this.field_b[fieldTemp$1].field_h;
            var5 = var4;
          } while (var4 == this.field_b[-1 + this.field_f]);
          this.field_c = var5.field_h;
          return var5;
        }
        if (this.field_b[this.field_f - 1] != this.field_c) {
          var12 = this.field_c;
          this.field_c = var12.field_h;
          return var12;
        }
        do {
          if (this.field_f >= this.field_d) {
            return null;
          }
          fieldTemp$0 = this.field_f;
          this.field_f = this.field_f + 1;
          var4 = this.field_b[fieldTemp$0].field_h;
          var9 = var4;
        } while (var4 == this.field_b[-1 + this.field_f]);
        this.field_c = var9.field_h;
        return var9;
    }

    final IntrusiveNode a(int param0, long param1) {
        IntrusiveNode var5 = null;
        int var6 = Confined.field_J ? 1 : 0;
        IntrusiveNode var4 = this.field_b[(int)((long)(-1 + this.field_d) & param1)];
        IntrusiveNode var5Lifetime1;
        this.field_g = var4.field_h;
        if (param0 == 1) {
          while (this.field_g != var4) {
            if (~this.field_g.field_i == ~param1) {
              var5 = this.field_g;
              this.field_g = this.field_g.field_h;
              return var5;
            }
            this.field_g = this.field_g.field_h;
          }
          this.field_g = null;
          return null;
        }
        this.field_f = -115;
        while (this.field_g != var4) {
          if (~this.field_g.field_i == ~param1) {
            var5Lifetime1 = this.field_g;
            this.field_g = this.field_g.field_h;
            return var5Lifetime1;
          }
          this.field_g = this.field_g.field_h;
        }
        this.field_g = null;
        return null;
    }

    final IntrusiveNode a(boolean param0) {
        this.field_f = 0;
        if (!param0) {
          vh.b(-33);
          return this.a(110);
        }
        return this.a(110);
    }

    final static int a(int param0, int param1) {
        param1 = param1 & 8191;
        if (param0 != 21872) {
          vh.a(-94, 118);
          if (param1 >= 4096) {
            return param1 >= 6144 ? -vj.field_e[8192 - param1] : -vj.field_e[-4096 + param1];
          }
          return 2048 <= param1 ? vj.field_e[4096 - param1] : vj.field_e[param1];
        }
        if (param1 >= 4096) {
          return param1 >= 6144 ? -vj.field_e[8192 - param1] : -vj.field_e[-4096 + param1];
        }
        return 2048 <= param1 ? vj.field_e[4096 - param1] : vj.field_e[param1];
    }

    vh(int param0) {
        int var2 = 0;
        IntrusiveNode dupTemp$1 = null;
        IntrusiveNode var3;
        this.field_f = 0;
        this.field_d = param0;
        this.field_b = new IntrusiveNode[param0];
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$1 = new IntrusiveNode();
          var3 = dupTemp$1;
          this.field_b[var2] = dupTemp$1;
          var3.field_a = var3;
          var3.field_h = var3;
        }
    }

    static {
    }
}
