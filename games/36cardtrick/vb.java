/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb {
    private int field_d;
    static bk field_e;
    private IntrusiveNode field_i;
    private IntrusiveNode field_g;
    static int[] field_a;
    private int field_j;
    private IntrusiveNode[] field_f;
    static int field_b;
    static kc field_k;
    static ej field_h;
    static bk field_c;

    final IntrusiveNode b(int param0) {
        if (param0 >= -31) {
          return (IntrusiveNode) null;
        }
        this.field_j = 0;
        return this.a(true);
    }

    public static void a(int param0) {
        if (param0 != -1) {
          return;
        }
        field_k = null;
        field_a = null;
        field_c = null;
        field_e = null;
        field_h = null;
    }

    final IntrusiveNode a(boolean param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$2 = 0;
        int var3;
        IntrusiveNode var4;
        IntrusiveNode var5;
        IntrusiveNode var36;
        IntrusiveNode var37;
        IntrusiveNode var38;
        IntrusiveNode var39;
        IntrusiveNode var42;
        var3 = Main.field_T;
        if (param0) {
          if (this.field_j <= 0) {
            do {
              if (this.field_j >= this.field_d) {
                return null;
              }
              fieldTemp$1 = this.field_j;
              this.field_j = this.field_j + 1;
              var4 = this.field_f[fieldTemp$1].next;
              var38 = var4;
            } while (var4 == this.field_f[this.field_j - 1]);
            this.field_i = var38.next;
            return var38;
          }
          if (this.field_f[this.field_j - 1] != this.field_i) {
            var42 = this.field_i;
            this.field_i = var42.next;
            return var42;
          }
          do {
            if (this.field_j >= this.field_d) {
              return null;
            }
            fieldTemp$0 = this.field_j;
            this.field_j = this.field_j + 1;
            var4 = this.field_f[fieldTemp$0].next;
            var39 = var4;
          } while (var4 == this.field_f[this.field_j - 1]);
          this.field_i = var39.next;
          return var39;
        }
        this.field_g = (IntrusiveNode) null;
        if (this.field_j <= 0) {
          do {
            if (this.field_j >= this.field_d) {
              return null;
            }
            fieldTemp$3 = this.field_j;
            this.field_j = this.field_j + 1;
            var4 = this.field_f[fieldTemp$3].next;
            var5 = var4;
          } while (var4 == this.field_f[this.field_j - 1]);
          this.field_i = var5.next;
          return var5;
        }
        if (this.field_f[this.field_j - 1] != this.field_i) {
          var36 = this.field_i;
          this.field_i = var36.next;
          return var36;
        }
        do {
          if (this.field_j >= this.field_d) {
            return null;
          }
          fieldTemp$2 = this.field_j;
          this.field_j = this.field_j + 1;
          var4 = this.field_f[fieldTemp$2].next;
          var37 = var4;
        } while (var4 == this.field_f[this.field_j - 1]);
        this.field_i = var37.next;
        return var37;
    }

    final void a(long param0, byte param1, IntrusiveNode param2) {
        IntrusiveNode var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          if (param2.previous != null) {
            param2.unlink(106);
          }
          var5 = this.field_f[(int)((long)(-1 + this.field_d) & param0)];
          param2.next = var5;
          param2.previous = var5.previous;
          param2.previous.next = param2;
          param2.next.previous = param2;
          param2.key = param0;
          if (param1 < 24) {
            this.a(true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("vb.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        if (param0 < 1) {
          return;
        }
        Main.field_G = 0;
        ti.field_a = -1;
        t.field_e = null;
        k.field_b = false;
        p.field_k = -1;
    }

    final IntrusiveNode a(boolean param0, long param1) {
        IntrusiveNode var4;
        IntrusiveNode var5;
        int var6;
        IntrusiveNode var7;
        IntrusiveNode var4Lifetime1;
        IntrusiveNode var5Lifetime1;
        var6 = Main.field_T;
        if (!param0) {
          var4 = this.field_f[(int)(param1 & (long)(this.field_d - 1))];
          this.field_g = var4.next;
          while (true) {
            if (var4 == this.field_g) {
              this.field_g = null;
              return null;
            }
            if (~this.field_g.key != ~param1) {
              this.field_g = this.field_g.next;
              continue;
            }
            break;
          }
          var5 = this.field_g;
          this.field_g = this.field_g.next;
          return var5;
        }
        var7 = (IntrusiveNode) null;
        this.a(47L, (byte) 72, (IntrusiveNode) null);
        var4Lifetime1 = this.field_f[(int)(param1 & (long)(this.field_d - 1))];
        this.field_g = var4Lifetime1.next;
        while (true) {
          if (var4Lifetime1 == this.field_g) {
            this.field_g = null;
            return null;
          }
          if (~this.field_g.key != ~param1) {
            this.field_g = this.field_g.next;
            continue;
          }
          break;
        }
        var5Lifetime1 = this.field_g;
        this.field_g = this.field_g.next;
        return var5Lifetime1;
    }

    vb(int param0) {
        int var2 = 0;
        IntrusiveNode dupTemp$1 = null;
        IntrusiveNode var3;
        this.field_j = 0;
        this.field_f = new IntrusiveNode[param0];
        this.field_d = param0;
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$1 = new IntrusiveNode();
          var3 = dupTemp$1;
          this.field_f[var2] = dupTemp$1;
          var3.next = var3;
          var3.previous = var3;
        }
    }

    static {
        field_a = new int[]{65527, 65528};
        field_e = new bk();
        field_c = new bk();
    }
}
