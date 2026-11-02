/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb {
    private IntrusiveNode field_g;
    private int field_d;
    static String field_c;
    static String field_h;
    private IntrusiveNode field_a;
    private int field_e;
    static int field_f;
    private IntrusiveNode[] field_b;

    final static void a(int param0) {
        if (param0 > -57) {
          return;
        }
        if (!kb.field_h) {
          throw new IllegalStateException();
        }
        r.field_c = true;
        cb.a(true, 73);
        op.field_i = 0;
    }

    final IntrusiveNode c(byte param0) {
        this.field_e = 0;
        if (param0 >= -118) {
          return (IntrusiveNode) null;
        }
        return this.b((byte) -120);
    }

    final void a(boolean param0, long param1, IntrusiveNode param2) {
        IntrusiveNode var5 = null;
        try {
          if (param2.next != null) {
            param2.f(0);
          }
          var5 = this.field_b[(int)(param1 & (long)(this.field_d - 1))];
          if (param0) {
            this.b((byte) -2);
          }
          param2.previous = var5;
          param2.next = var5.next;
          param2.next.previous = param2;
          param2.previous.next = param2;
          param2.key = param1;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "eb.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final IntrusiveNode a(long param0, byte param1) {
        IntrusiveNode var4;
        IntrusiveNode var5;
        int var6;
        IntrusiveNode var4Lifetime1;
        IntrusiveNode var5Lifetime1;
        var6 = Torquing.field_u;
        if (param1 > 80) {
          var4 = this.field_b[(int)((long)(-1 + this.field_d) & param0)];
          this.field_g = var4.previous;
          while (true) {
            if (this.field_g == var4) {
              this.field_g = null;
              return null;
            }
            if (this.field_g.key != param0) {
              this.field_g = this.field_g.previous;
              continue;
            }
            break;
          }
          var5 = this.field_g;
          this.field_g = this.field_g.previous;
          return var5;
        }
        field_c = (String) null;
        var4Lifetime1 = this.field_b[(int)((long)(-1 + this.field_d) & param0)];
        this.field_g = var4Lifetime1.previous;
        while (true) {
          if (this.field_g == var4Lifetime1) {
            this.field_g = null;
            return null;
          }
          if (this.field_g.key != param0) {
            this.field_g = this.field_g.previous;
            continue;
          }
          break;
        }
        var5Lifetime1 = this.field_g;
        this.field_g = this.field_g.previous;
        return var5Lifetime1;
    }

    final IntrusiveNode b(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var2;
        IntrusiveNode var2_ref_q;
        int var4;
        IntrusiveNode var5;
        IntrusiveNode var6;
        var4 = Torquing.field_u;
        if (0 >= this.field_e) {
          var2 = 33 % ((-56 - param0) / 49);
          do {
            if (this.field_d <= this.field_e) {
              return null;
            }
            fieldTemp$0 = this.field_e;
            this.field_e = this.field_e + 1;
            var6 = this.field_b[fieldTemp$0].previous;
          } while (this.field_b[-1 + this.field_e] == var6);
          this.field_a = var6.previous;
          return var6;
        }
        if (this.field_a != this.field_b[-1 + this.field_e]) {
          var2_ref_q = this.field_a;
          this.field_a = var2_ref_q.previous;
          return var2_ref_q;
        }
        var2 = 33 % ((-56 - param0) / 49);
        do {
          if (this.field_d <= this.field_e) {
            return null;
          }
          fieldTemp$1 = this.field_e;
          this.field_e = this.field_e + 1;
          var5 = this.field_b[fieldTemp$1].previous;
        } while (this.field_b[-1 + this.field_e] == var5);
        this.field_a = var5.previous;
        return var5;
    }

    public static void a(byte param0) {
        field_c = null;
        field_h = null;
        if (param0 != -31) {
          eb.a((byte) -21);
        }
    }

    eb(int param0) {
        int var2 = 0;
        IntrusiveNode dupTemp$0 = null;
        IntrusiveNode var3 = null;
        this.field_e = 0;
        this.field_b = new IntrusiveNode[param0];
        this.field_d = param0;
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$0 = new IntrusiveNode();
          var3 = dupTemp$0;
          this.field_b[var2] = dupTemp$0;
          var3.previous = var3;
          var3.next = var3;
        }
    }

    static {
        field_c = null;
        field_h = "Connection timed out. Please try using a different server.";
        field_f = -1;
    }
}
