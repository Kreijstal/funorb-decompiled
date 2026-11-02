/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ha {
    private IntrusiveNode[] field_e;
    private int field_b;
    private IntrusiveNode field_f;
    static int field_d;
    private IntrusiveNode field_c;
    private int field_a;

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var8 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param2 > -21) {
            ha.a(-128, -24, 80);
          }
          var3_int = 0;
          var4 = jl.field_e;
          while (gf.field_s.length > var3_int) {
            var5 = dl.field_s[var3_int];
            if (var5 < 0) {
              var4 = var4 + ok.field_e;
            } else {
              var6 = ki.$cfr$intArgs$a$62abead39cee(-18, true, gf.field_s[var3_int]);
              var7 = -(var6 >> 1) + dg.field_ab;
              var4 = var4 + uc.field_Y;
              if (kg.a((byte) -121, var4, var6 + (ni.field_i << 1), var7 - ni.field_i, param1, param0, (ai.field_a << 1) + IntrusiveDeque.field_f)) {
                stackIn_9_0 = var5;
                return stackIn_9_0;
              }
              var4 = var4 + (IntrusiveDeque.field_f + (uc.field_Y + (ai.field_a << 1)));
            }
            var3_int++;
          }
          stackIn_15_0 = -1;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oj.wrapException((Throwable) ((Object) var3), "ha.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final IntrusiveNode a(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int var3;
        IntrusiveNode var4;
        IntrusiveNode var5;
        IntrusiveNode var6;
        IntrusiveNode var9;
        var3 = TorChallenge.field_F ? 1 : 0;
        if (0 >= this.field_a) {
          do {
            if (this.field_a >= this.field_b) {
              if (param0 == -27377) {
                return null;
              }
              ha.a(-111, 26, -58);
              return null;
            }
            fieldTemp$1 = this.field_a;
            this.field_a = this.field_a + 1;
            var4 = this.field_e[fieldTemp$1].next;
            var5 = var4;
          } while (var4 == this.field_e[-1 + this.field_a]);
          this.field_c = var5.next;
          return var5;
        }
        if (this.field_e[this.field_a - 1] != this.field_c) {
          var9 = this.field_c;
          this.field_c = var9.next;
          return var9;
        }
        do {
          if (this.field_a >= this.field_b) {
            if (param0 == -27377) {
              return null;
            }
            ha.a(-111, 26, -58);
            return null;
          }
          fieldTemp$0 = this.field_a;
          this.field_a = this.field_a + 1;
          var4 = this.field_e[fieldTemp$0].next;
          var6 = var4;
        } while (var4 == this.field_e[-1 + this.field_a]);
        this.field_c = var6.next;
        return var6;
    }

    ha(int param0) {
        int var2 = 0;
        IntrusiveNode dupTemp$1 = null;
        IntrusiveNode var3;
        this.field_a = 0;
        this.field_b = param0;
        this.field_e = new IntrusiveNode[param0];
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$1 = new IntrusiveNode();
          var3 = dupTemp$1;
          this.field_e[var2] = dupTemp$1;
          var3.next = var3;
          var3.previous = var3;
        }
    }

    final IntrusiveNode a(byte param0) {
        if (param0 != -73) {
          return (IntrusiveNode) null;
        }
        this.field_a = 0;
        return this.a(-27377);
    }

    final IntrusiveNode a(byte param0, long param1) {
        IntrusiveNode var5 = null;
        int var6 = TorChallenge.field_F ? 1 : 0;
        IntrusiveNode var4 = this.field_e[(int)(param1 & (long)(-1 + this.field_b))];
        this.field_f = var4.next;
        while (var4 != this.field_f) {
          if (~param1 == ~this.field_f.key) {
            var5 = this.field_f;
            this.field_f = this.field_f.next;
            return var5;
          }
          this.field_f = this.field_f.next;
        }
        this.field_f = null;
        if (param0 < 88) {
          this.field_e = (IntrusiveNode[]) null;
          return null;
        }
        return null;
    }

    final void a(int param0, IntrusiveNode param1, long param2) {
        IntrusiveNode var5 = null;
        try {
          if (param1.previous != null) {
            param1.unlink(true);
          }
          var5 = this.field_e[(int)((long)(this.field_b - 1) & param2)];
          param1.previous = var5.previous;
          param1.next = var5;
          param1.previous.next = param1;
          param1.next.previous = param1;
          int var6 = 80 / ((-24 - param0) / 40);
          param1.key = param2;
        } catch (RuntimeException runtimeException) {
          throw oj.wrapException((Throwable) ((Object) runtimeException), "ha.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_d = 0;
    }
}
