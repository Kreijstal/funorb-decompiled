/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji {
    private IntrusiveNode field_b;
    private IntrusiveNode field_c;
    private IntrusiveNode[] field_f;
    private int field_e;
    private long field_h;
    static jea field_g;
    private int field_a;
    static String field_d;

    public static void f(int param0) {
        if (param0 < 123) {
          ji.a(-27, -70, -10);
        }
        field_g = null;
        field_d = null;
    }

    final IntrusiveNode b(int param0) {
        IntrusiveNode var3 = null;
        int var4 = TombRacer.field_G ? 1 : 0;
        if (this.field_b == null) {
          return null;
        }
        IntrusiveNode var2 = this.field_f[(int)(this.field_h & (long)(-1 + this.field_a))];
        if (param0 > -93) {
          this.field_a = 32;
        }
        while (this.field_b != var2) {
          if (~this.field_h == ~this.field_b.key) {
            var3 = this.field_b;
            this.field_b = this.field_b.next;
            return var3;
          }
          this.field_b = this.field_b.next;
        }
        this.field_b = null;
        return null;
    }

    final IntrusiveNode d(int param0) {
        this.field_e = param0;
        return this.c(20806);
    }

    final void e(int param0) {
        int var2 = 0;
        IntrusiveNode var3_ref_vg = null;
        IntrusiveNode var4 = null;
        int var5 = TombRacer.field_G ? 1 : 0;
        for (var2 = 0; var2 < this.field_a; var2++) {
          var3_ref_vg = this.field_f[var2];
          while (true) {
            var4 = var3_ref_vg.next;
            if (var4 == var3_ref_vg) {
              break;
            }
            var4.unlink(113);
          }
        }
        int var3 = -17 % ((35 - param0) / 42);
        this.field_c = null;
        this.field_b = null;
    }

    final IntrusiveNode c(int param0) {
        int fieldTemp$0 = 0;
        IntrusiveNode var2;
        int var3;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param0 != 20806) {
          this.c(17);
        }
        if (this.field_e > 0 &&
          this.field_f[this.field_e - 1] != this.field_c) {
          var2 = this.field_c;
          this.field_c = var2.next;
          return var2;
        }
        do {
          if (this.field_a <= this.field_e) {
            return null;
          }
          fieldTemp$0 = this.field_e;
          this.field_e = this.field_e + 1;
          var2 = this.field_f[fieldTemp$0].next;
        } while (this.field_f[this.field_e - 1] == var2);
        this.field_c = var2.next;
        return var2;
    }

    final void a(long param0, int param1, IntrusiveNode param2) {
        IntrusiveNode var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          if (null != param2.previous) {
            param2.unlink(48);
          }
          var5 = this.field_f[(int)(param0 & (long)(this.field_a - 1))];
          param2.next = var5;
          param2.previous = var5.previous;
          param2.previous.next = param2;
          param2.next.previous = param2;
          param2.key = param0;
          if (param1 < 100) {
            this.field_e = -124;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_8_0 = var5_ref;
          stackIn_8_1 = new StringBuilder().append("ji.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    ji(int param0) {
        int var2 = 0;
        IntrusiveNode dupTemp$0 = null;
        IntrusiveNode var3 = null;
        this.field_e = 0;
        this.field_a = param0;
        this.field_f = new IntrusiveNode[param0];
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$0 = new IntrusiveNode();
          var3 = dupTemp$0;
          this.field_f[var2] = dupTemp$0;
          var3.next = var3;
          var3.previous = var3;
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (param1 < 82) {
          field_d = (String) null;
        }
        return param0 << -param2 + 16;
    }

    final IntrusiveNode a(byte param0, long param1) {
        IntrusiveNode var5 = null;
        int var6 = TombRacer.field_G ? 1 : 0;
        if (param0 >= -78) {
          field_g = (jea) null;
        }
        this.field_h = param1;
        IntrusiveNode var4 = this.field_f[(int)(param1 & (long)(this.field_a - 1))];
        this.field_b = var4.next;
        while (var4 != this.field_b) {
          if (param1 == this.field_b.key) {
            var5 = this.field_b;
            this.field_b = this.field_b.next;
            return var5;
          }
          this.field_b = this.field_b.next;
        }
        this.field_b = null;
        return null;
    }

    final static void a(int param0) {
        int var1 = (-640 + ob.field_i) / 2;
        int var2 = pna.field_q * pna.field_q;
        int var3 = -(mla.field_a * mla.field_a) + var2;
        nra.field_a.a(199, -214 + bea.field_a, -23776, 90, -(199 * var3 / var2) + var1);
        if (param0 != 16) {
          return;
        }
        cka.field_fd.a(438, -4 + (-120 + bea.field_a), -23776, 0, 202 + var1 + 438 * var3 / var2);
    }

    static {
    }
}
