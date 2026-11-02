/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd {
    static String field_a;
    static Sprite[] field_e;
    private int field_c;
    static Sprite[] field_f;
    private IntrusiveNode field_h;
    private IntrusiveNode[] field_g;
    static int field_d;
    private IntrusiveNode field_b;
    private int field_i;

    final IntrusiveNode c(byte param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int var3;
        IntrusiveNode var4;
        IntrusiveNode var5;
        IntrusiveNode var9;
        IntrusiveNode var12;
        var3 = SolKnight.field_L ? 1 : 0;
        if (param0 < 49) {
          return (IntrusiveNode) null;
        }
        if (0 >= this.field_c) {
          do {
            if (this.field_i <= this.field_c) {
              return null;
            }
            fieldTemp$1 = this.field_c;
            this.field_c = this.field_c + 1;
            var4 = this.field_g[fieldTemp$1].previous;
            var5 = var4;
          } while (var4 == this.field_g[this.field_c - 1]);
          this.field_h = var5.previous;
          return var5;
        }
        if (this.field_g[this.field_c - 1] != this.field_h) {
          var12 = this.field_h;
          this.field_h = var12.previous;
          return var12;
        }
        do {
          if (this.field_i <= this.field_c) {
            return null;
          }
          fieldTemp$0 = this.field_c;
          this.field_c = this.field_c + 1;
          var4 = this.field_g[fieldTemp$0].previous;
          var9 = var4;
        } while (var4 == this.field_g[this.field_c - 1]);
        this.field_h = var9.previous;
        return var9;
    }

    final IntrusiveNode a(boolean param0, long param1) {
        IntrusiveNode var5 = null;
        int var6 = SolKnight.field_L ? 1 : 0;
        IntrusiveNode var4 = this.field_g[(int)((long)(this.field_i - 1) & param1)];
        this.field_b = var4.previous;
        while (var4 != this.field_b) {
          if (~this.field_b.key == ~param1) {
            var5 = this.field_b;
            this.field_b = this.field_b.previous;
            return var5;
          }
          this.field_b = this.field_b.previous;
        }
        this.field_b = null;
        if (param0) {
          return null;
        }
        this.c((byte) -46);
        return null;
    }

    final IntrusiveNode b(int param0) {
        this.field_c = param0;
        return this.c((byte) 107);
    }

    final static void a(byte param0) {
        h.a(4, true);
        if (param0 == -13) {
          return;
        }
        qd.a(28);
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 != 4) {
          return;
        }
        field_a = null;
        field_e = null;
    }

    final void a(byte param0, IntrusiveNode param1, long param2) {
        IntrusiveNode var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          if (param1.next != null) {
            param1.unlink(10);
          }
          var5 = this.field_g[(int)(param2 & (long)(this.field_i - 1))];
          param1.previous = var5;
          param1.next = var5.next;
          param1.next.previous = param1;
          param1.previous.next = param1;
          param1.key = param2;
          if (param0 <= 22) {
            field_d = -118;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_8_0 = var5_ref;
          stackIn_8_1 = new StringBuilder().append("qd.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean b(byte param0) {
        if (te.field_O == -1) {
          if (!bf.c(79, 1)) {
            return false;
          }
          te.field_O = te.field_N.readUnsignedByte(255);
          te.field_N.position = 0;
        }
        if (te.field_O == -2) {
          if (!bf.c(36, 2)) {
            return false;
          }
          te.field_O = te.field_N.readUnsignedShort(-22);
          te.field_N.position = 0;
        }
        if (param0 <= 124) {
          qd.a(-104);
          return bf.c(100, te.field_O);
        }
        return bf.c(100, te.field_O);
    }

    qd(int param0) {
        int var2 = 0;
        IntrusiveNode dupTemp$1 = null;
        IntrusiveNode var3;
        this.field_c = 0;
        this.field_g = new IntrusiveNode[param0];
        this.field_i = param0;
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$1 = new IntrusiveNode();
          var3 = dupTemp$1;
          this.field_g[var2] = dupTemp$1;
          var3.next = var3;
          var3.previous = var3;
        }
    }

    static {
        field_a = "To server list";
        field_d = 0;
    }
}
