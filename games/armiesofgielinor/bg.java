/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg {
    private int field_c;
    private IntrusiveNode field_e;
    private int field_d;
    private IntrusiveNode field_f;
    private IntrusiveNode[] field_a;
    static String field_b;

    final int a(byte param0) {
        int var3 = 0;
        IntrusiveNode var4 = null;
        IntrusiveNode var5 = null;
        int var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var2 = 0;
        for (var3 = 0; var3 < this.field_c; var3++) {
          var4 = this.field_a[var3];
          var5 = var4.next;
          while (var4 != var5) {
            var2++;
            var5 = var5.next;
          }
        }
        if (param0 < 109) {
          return 109;
        }
        return var2;
    }

    final static void a(int param0, int param1) {
        fm.field_d[4] = param1;
        if (param0 != -1) {
          bg.a(87, 95);
        }
    }

    final IntrusiveNode b(int param0) {
        if (param0 != 1) {
          this.c((byte) -43);
        }
        this.field_d = 0;
        return this.b((byte) 85);
    }

    final IntrusiveNode a(int param0, long param1) {
        IntrusiveNode var5 = null;
        int var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        IntrusiveNode var4 = this.field_a[(int)((long)(this.field_c - 1) & param1)];
        this.field_e = var4.next;
        if (param0 > -8) {
          bg.a(-7);
        }
        while (var4 != this.field_e) {
          if (~param1 == ~this.field_e.key) {
            var5 = this.field_e;
            this.field_e = this.field_e.next;
            return var5;
          }
          this.field_e = this.field_e.next;
        }
        this.field_e = null;
        return null;
    }

    final void c(byte param0) {
        int var2;
        IntrusiveNode var3_ref_tc;
        IntrusiveNode var4;
        int var5;
        int var3;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var2 = 0;
        while (true) {
          if (var2 >= this.field_c) {
            var3 = -28 / ((param0 + 43) / 39);
            this.field_f = null;
            this.field_e = null;
            return;
          }
          var3_ref_tc = this.field_a[var2];
          while (true) {
            var4 = var3_ref_tc.next;
            if (var3_ref_tc != var4) {
              var4.unlink(-111);
              continue;
            }
            break;
          }
          var2++;
        }
    }

    bg(int param0) {
        int var2 = 0;
        IntrusiveNode dupTemp$0 = null;
        IntrusiveNode var3 = null;
        this.field_d = 0;
        this.field_a = new IntrusiveNode[param0];
        this.field_c = param0;
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$0 = new IntrusiveNode();
          var3 = dupTemp$0;
          this.field_a[var2] = dupTemp$0;
          var3.next = var3;
          var3.previous = var3;
        }
    }

    final IntrusiveNode b(byte param0) {
        int fieldTemp$0 = 0;
        IntrusiveNode var2;
        int var3;
        IntrusiveNode var4;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param0 <= 45) {
          this.a((byte) 90);
        }
        if (0 < this.field_d &&
          this.field_f != this.field_a[this.field_d - 1]) {
          var2 = this.field_f;
          this.field_f = var2.next;
          return var2;
        }
        do {
          if (this.field_c <= this.field_d) {
            return null;
          }
          fieldTemp$0 = this.field_d;
          this.field_d = this.field_d + 1;
          var4 = this.field_a[fieldTemp$0].next;
          var2 = var4;
        } while (var4 == this.field_a[this.field_d - 1]);
        this.field_f = var2.next;
        return var2;
    }

    public static void a(int param0) {
        if (param0 >= -2) {
          bg.a(-78);
        }
        field_b = null;
    }

    final void a(IntrusiveNode param0, long param1, int param2) {
        IntrusiveNode var5 = null;
        try {
          if (null != param0.previous) {
            param0.unlink(-128);
          }
          if (param2 < 14) {
            this.field_e = (IntrusiveNode) null;
          }
          var5 = this.field_a[(int)((long)(-1 + this.field_c) & param1)];
          param0.next = var5;
          param0.previous = var5.previous;
          param0.previous.next = param0;
          param0.key = param1;
          param0.next.previous = param0;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "bg.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_b = "Start Game";
    }
}
