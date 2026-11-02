/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il {
    private int field_f;
    static volatile boolean field_e;
    static byte[][] field_b;
    private IntrusiveNode field_g;
    private IntrusiveNode[] field_d;
    private int field_c;
    private IntrusiveNode field_a;

    final static void a(int param0, Sprite param1) {
        try {
          ja.c((byte) -52);
          if (param0 != 1) {
            Sprite var3 = (Sprite) null;
            il.a(74, (Sprite) null);
          }
          SoftwareRasterizer.a(param1.field_z, param1.field_q, param1.field_u);
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "il.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(IntrusiveNode param0, long param1, byte param2) {
        IntrusiveNode var5 = null;
        try {
          if (param2 >= -62) {
            this.a(false);
          }
          if (null != param0.next) {
            param0.unlink((byte) 12);
          }
          var5 = this.field_d[(int)((long)(this.field_c - 1) & param1)];
          param0.previous = var5;
          param0.next = var5.next;
          param0.next.previous = param0;
          param0.previous.next = param0;
          param0.key = param1;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "il.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void b(byte param0) {
        field_b = (byte[][]) null;
        int var1 = 117 / ((50 - param0) / 52);
    }

    final static Sprite a(String param0, String param1, Archive param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Sprite stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param2.c(param3, param1);
          var5 = param2.a(-117, var4_int, param0);
          stackIn_1_0 = hl.a(param2, var5, (byte) -90, var4_int);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("il.G(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    final IntrusiveNode a(byte param0, long param1) {
        IntrusiveNode var4;
        IntrusiveNode var5;
        int var6;
        IntrusiveNode var4Lifetime1;
        IntrusiveNode var5Lifetime1;
        var6 = Terraphoenix.field_V;
        if (param0 == 46) {
          var4 = this.field_d[(int)((long)(-1 + this.field_c) & param1)];
          this.field_g = var4.previous;
          while (true) {
            if (var4 == this.field_g) {
              this.field_g = null;
              return null;
            }
            if (this.field_g.key != param1) {
              this.field_g = this.field_g.previous;
              continue;
            }
            break;
          }
          var5 = this.field_g;
          this.field_g = this.field_g.previous;
          return var5;
        }
        this.field_g = (IntrusiveNode) null;
        var4Lifetime1 = this.field_d[(int)((long)(-1 + this.field_c) & param1)];
        this.field_g = var4Lifetime1.previous;
        while (true) {
          if (var4Lifetime1 == this.field_g) {
            this.field_g = null;
            return null;
          }
          if (this.field_g.key != param1) {
            this.field_g = this.field_g.previous;
            continue;
          }
          break;
        }
        var5Lifetime1 = this.field_g;
        this.field_g = this.field_g.previous;
        return var5Lifetime1;
    }

    final IntrusiveNode a(byte param0) {
        this.field_f = 0;
        if (param0 != 117) {
          return (IntrusiveNode) null;
        }
        return this.a(true);
    }

    final IntrusiveNode a(boolean param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int var3;
        IntrusiveNode var4;
        IntrusiveNode var5;
        IntrusiveNode var9;
        IntrusiveNode var12;
        var3 = Terraphoenix.field_V;
        if (this.field_f <= 0) {
          if (!param0) {
            return (IntrusiveNode) null;
          }
          do {
            if (this.field_f >= this.field_c) {
              return null;
            }
            fieldTemp$1 = this.field_f;
            this.field_f = this.field_f + 1;
            var4 = this.field_d[fieldTemp$1].previous;
            var5 = var4;
          } while (var4 == this.field_d[this.field_f - 1]);
          this.field_a = var5.previous;
          return var5;
        }
        if (this.field_a != this.field_d[-1 + this.field_f]) {
          var12 = this.field_a;
          this.field_a = var12.previous;
          return var12;
        }
        if (!param0) {
          return (IntrusiveNode) null;
        }
        do {
          if (this.field_f >= this.field_c) {
            return null;
          }
          fieldTemp$0 = this.field_f;
          this.field_f = this.field_f + 1;
          var4 = this.field_d[fieldTemp$0].previous;
          var9 = var4;
        } while (var4 == this.field_d[this.field_f - 1]);
        this.field_a = var9.previous;
        return var9;
    }

    final static byte[] a(byte param0, String param1) {
        RuntimeException var2 = null;
        Archive var3 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 70) {
            var3 = (Archive) null;
            il.a((String) null, (String) null, (Archive) null, -14);
          }
          stackIn_3_0 = nj.field_i.a("", param1, -21653);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("il.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    il(int param0) {
        int var2 = 0;
        IntrusiveNode dupTemp$1 = null;
        IntrusiveNode var3;
        this.field_f = 0;
        this.field_d = new IntrusiveNode[param0];
        this.field_c = param0;
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$1 = new IntrusiveNode();
          var3 = dupTemp$1;
          this.field_d[var2] = dupTemp$1;
          var3.previous = var3;
          var3.next = var3;
        }
    }

    static {
        field_b = new byte[1000][];
        field_e = true;
    }
}
