/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pfb {
    static String field_a;
    private int field_e;
    private vh field_b;
    private nga field_c;
    private int field_d;

    final void b(byte param0) {
        if (param0 > 72) {
          this.field_b.a((byte) 61);
          this.field_c.b(0);
          this.field_d = this.field_e;
          return;
        }
        field_a = (String) null;
        this.field_b.a((byte) 61);
        this.field_c.b(0);
        this.field_d = this.field_e;
    }

    public static void a(int param0) {
        field_a = null;
        int var1 = 77 / ((62 - param0) / 56);
    }

    private final void a(int param0, Object param1, long param2, int param3) {
        is var6 = null;
        ska var6_ref = null;
        int var7 = VoidHunters.field_G;
        if (param3 > this.field_e) {
          throw new IllegalStateException();
        }
        this.a(-70, param2);
        this.field_d = this.field_d - param3;
        while (0 > this.field_d) {
          var6 = (is) (this.field_b.a(-7481));
          this.a(var6, -17173);
        }
        if (param0 > -43) {
          return;
        }
        try {
          var6_ref = new ska(param1, param3);
          this.field_c.a(var6_ref, 0, param2);
          this.field_b.a(-17569, var6_ref);
          ((is) ((Object) var6_ref)).field_i = 0L;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "pfb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    pfb(int param0) {
        this(param0, param0);
    }

    final void a(Object param0, long param1, byte param2) {
        try {
          if (param2 != -117) {
            pfb.a(-73);
          }
          this.a(param2 ^ 20, param0, param1, 1);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "pfb.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final Object a(byte param0) {
        Object var3 = null;
        is var4 = null;
        int var5 = VoidHunters.field_G;
        is var2 = (is) (this.field_c.a(param0 ^ 33));
        while (var2 != null) {
          var3 = var2.a(120);
          if (var3 != null) {
            return var3;
          }
          var4 = var2;
          var2 = (is) (this.field_c.a((byte) 44));
          var4.b(param0 ^ -3911);
          var4.d((byte) -35);
          this.field_d = this.field_d + var4.field_k;
        }
        if (param0 != 67) {
          return (Object) null;
        }
        return null;
    }

    final void a(boolean param0, int param1) {
        long fieldTemp$0 = 0L;
        long fieldTemp$1 = 0L;
        Object var3;
        is var3_ref;
        bna var4;
        int var5;
        is var3_refLifetime1;
        bna var4Lifetime1;
        var3 = null;
        var5 = VoidHunters.field_G;
        if (param0) {
          var3_ref = (is) (this.field_b.a(false));
          while (var3_ref != null) {
            if (!var3_ref.e((byte) 74)) {
              fieldTemp$0 = var3_ref.field_i + 1L;
              var3_ref.field_i = var3_ref.field_i + 1L;
              if ((long)param1 < fieldTemp$0) {
                var4 = new bna(var3_ref.a(122), var3_ref.field_k);
                this.field_c.a(var4, 0, var3_ref.field_b);
                gbb.a(var4, var3_ref, (byte) -68);
                var3_ref.b(-3846);
                var3_ref.d((byte) -35);
              }
            } else {
              if (null == var3_ref.a(107)) {
                var3_ref.b(-3846);
                var3_ref.d((byte) -35);
                this.field_d = this.field_d + var3_ref.field_k;
              }
            }
            var3_ref = (is) (this.field_b.b(8063));
          }
          return;
        }
        this.field_d = 105;
        var3_refLifetime1 = (is) (this.field_b.a(false));
        while (var3_refLifetime1 != null) {
          if (!var3_refLifetime1.e((byte) 74)) {
            fieldTemp$1 = var3_refLifetime1.field_i + 1L;
            var3_refLifetime1.field_i = var3_refLifetime1.field_i + 1L;
            if ((long)param1 < fieldTemp$1) {
              var4Lifetime1 = new bna(var3_refLifetime1.a(122), var3_refLifetime1.field_k);
              this.field_c.a(var4Lifetime1, 0, var3_refLifetime1.field_b);
              gbb.a(var4Lifetime1, var3_refLifetime1, (byte) -68);
              var3_refLifetime1.b(-3846);
              var3_refLifetime1.d((byte) -35);
            }
          } else {
            if (null == var3_refLifetime1.a(107)) {
              var3_refLifetime1.b(-3846);
              var3_refLifetime1.d((byte) -35);
              this.field_d = this.field_d + var3_refLifetime1.field_k;
            }
          }
          var3_refLifetime1 = (is) (this.field_b.b(8063));
        }
    }

    final Object a(boolean param0) {
        is var2;
        Object var3;
        int var5;
        is var6;
        is var7;
        is var2Lifetime1;
        Object var3Lifetime1;
        var5 = VoidHunters.field_G;
        if (!param0) {
          var2 = (is) (this.field_c.a((byte) 44));
          while (true) {
            if (var2 == null) {
              return null;
            }
            var3 = var2.a(118);
            if (var3 != null) {
              return var3;
            }
            var6 = var2;
            var2 = (is) (this.field_c.a((byte) 44));
            var6.b(-3846);
            var6.d((byte) -35);
            this.field_d = this.field_d + var6.field_k;
          }
        }
        this.a((Object) null, -64L, (byte) -68);
        var2Lifetime1 = (is) (this.field_c.a((byte) 44));
        while (true) {
          if (var2Lifetime1 == null) {
            return null;
          }
          var3Lifetime1 = var2Lifetime1.a(118);
          if (var3Lifetime1 != null) {
            return var3Lifetime1;
          }
          var7 = var2Lifetime1;
          var2Lifetime1 = (is) (this.field_c.a((byte) 44));
          var7.b(-3846);
          var7.d((byte) -35);
          this.field_d = this.field_d + var7.field_k;
        }
    }

    final Object b(int param0, long param1) {
        ska var6 = null;
        is var7 = (is) (this.field_c.a((byte) -124, param1));
        if (var7 == null) {
          return null;
        }
        Object var5 = var7.a(param0 ^ 94);
        if (var5 == null) {
          var7.b(-3846);
          var7.d((byte) -35);
          this.field_d = this.field_d + var7.field_k;
          return null;
        }
        if (var7.e((byte) 50)) {
          var6 = new ska(var5, var7.field_k);
          this.field_c.a(var6, 0, var7.field_b);
          this.field_b.a(-17569, var6);
          ((is) ((Object) var6)).field_i = 0L;
          var7.b(-3846);
          var7.d((byte) -35);
          if (param0 != 0) {
            pfb.a(-93);
            return var5;
          }
          return var5;
        }
        this.field_b.a(param0 - 17569, var7);
        var7.field_i = 0L;
        if (param0 != 0) {
          pfb.a(-93);
          return var5;
        }
        return var5;
    }

    private final void a(is param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -17173) {
            return;
          }
          if (param0 == null) {
            return;
          }
          param0.b(-3846);
          param0.d((byte) -35);
          this.field_d = this.field_d + param0.field_k;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("pfb.H(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, long param1) {
        is var4 = null;
        is var4Lifetime1;
        if (param0 < -66) {
          var4 = (is) (this.field_c.a((byte) -112, param1));
          this.a(var4, -17173);
          return;
        }
        this.a((Object) null, 32L, (byte) 24);
        var4Lifetime1 = (is) (this.field_c.a((byte) -112, param1));
        this.a(var4Lifetime1, -17173);
    }

    private pfb(int param0, int param1) {
        int var3;
        this.field_b = new vh();
        this.field_d = param0;
        this.field_e = param0;
        var3 = 1;
        while (true) {
          if (var3 + var3 >= param0) {
            this.field_c = new nga(var3);
            return;
          }
          if (var3 < param1) {
            var3 = var3 + var3;
            continue;
          }
          break;
        }
        this.field_c = new nga(var3);
        return;
    }

    static {
        field_a = "Next mission: ";
    }
}
