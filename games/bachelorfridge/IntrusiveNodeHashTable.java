/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveNodeHashTable {
    private int field_a;
    private IntrusiveNode[] field_b;
    private IntrusiveNode field_c;
    private int field_e;
    private IntrusiveNode field_d;

    final IntrusiveNode c(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$1 = 0;
        IntrusiveNode var2;
        int var3;
        var3 = BachelorFridge.field_y;
        if (param0 == -21446) {
          if (this.field_a > 0 &&
            this.field_d != this.field_b[-1 + this.field_a]) {
            var2 = this.field_d;
            this.field_d = var2.next;
            return var2;
          }
          do {
            if (this.field_a >= this.field_e) {
              return null;
            }
            fieldTemp$0 = this.field_a;
            this.field_a = this.field_a + 1;
            var2 = this.field_b[fieldTemp$0].next;
          } while (this.field_b[this.field_a - 1] == var2);
          this.field_d = var2.next;
          return var2;
        }
        this.a(false, -79L);
        if (this.field_a <= 0) {
          do {
            if (this.field_a >= this.field_e) {
              return null;
            }
            fieldTemp$2 = this.field_a;
            this.field_a = this.field_a + 1;
            var2 = this.field_b[fieldTemp$2].next;
          } while (this.field_b[this.field_a - 1] == var2);
          this.field_d = var2.next;
          return var2;
        }
        if (this.field_d != this.field_b[-1 + this.field_a]) {
          var2 = this.field_d;
          this.field_d = var2.next;
          return var2;
        }
        do {
          if (this.field_a >= this.field_e) {
            return null;
          }
          fieldTemp$1 = this.field_a;
          this.field_a = this.field_a + 1;
          var2 = this.field_b[fieldTemp$1].next;
        } while (this.field_b[this.field_a - 1] == var2);
        this.field_d = var2.next;
        return var2;
    }

    final void a(long param0, byte param1, IntrusiveNode param2) {
        IntrusiveNode var5 = null;
        try {
          if (null != param2.previous) {
            param2.unlink(false);
          }
          var5 = this.field_b[(int)((long)(-1 + this.field_e) & param0)];
          param2.next = var5;
          param2.previous = var5.previous;
          param2.previous.next = param2;
          param2.next.previous = param2;
          param2.key = param0;
          int var6 = 41 / ((param1 - 13) / 45);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "js.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final IntrusiveNode a(boolean param0, long param1) {
        IntrusiveNode var4;
        IntrusiveNode var5;
        int var6;
        IntrusiveNode var4Lifetime1;
        IntrusiveNode var5Lifetime1;
        var6 = BachelorFridge.field_y;
        if (param0) {
          var4 = this.field_b[(int)(param1 & (long)(this.field_e - 1))];
          this.field_c = var4.next;
          while (true) {
            if (var4 == this.field_c) {
              this.field_c = null;
              return null;
            }
            if (this.field_c.key != param1) {
              this.field_c = this.field_c.next;
              continue;
            }
            break;
          }
          var5 = this.field_c;
          this.field_c = this.field_c.next;
          return var5;
        }
        IntrusiveNodeHashTable.a(93);
        var4Lifetime1 = this.field_b[(int)(param1 & (long)(this.field_e - 1))];
        this.field_c = var4Lifetime1.next;
        while (true) {
          if (var4Lifetime1 == this.field_c) {
            this.field_c = null;
            return null;
          }
          if (this.field_c.key != param1) {
            this.field_c = this.field_c.next;
            continue;
          }
          break;
        }
        var5Lifetime1 = this.field_c;
        this.field_c = this.field_c.next;
        return var5Lifetime1;
    }

    final IntrusiveNode b(int param0) {
        this.field_a = 0;
        if (param0 != -13023) {
          this.b(45);
          return this.c(-21446);
        }
        return this.c(-21446);
    }

    final static void a(int param0) {
        jea.field_c = new ofa(qaa.field_d, mda.field_c, sm.field_s, qs.field_m, nr.field_v, dla.field_k);
        int var1 = -49 % ((param0 - 46) / 59);
    }

    IntrusiveNodeHashTable(int param0) {
        int var2 = 0;
        IntrusiveNode dupTemp$0 = null;
        IntrusiveNode var3 = null;
        this.field_a = 0;
        this.field_b = new IntrusiveNode[param0];
        this.field_e = param0;
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$0 = new IntrusiveNode();
          var3 = dupTemp$0;
          this.field_b[var2] = dupTemp$0;
          var3.previous = var3;
          var3.next = var3;
        }
    }

    static {
    }
}
