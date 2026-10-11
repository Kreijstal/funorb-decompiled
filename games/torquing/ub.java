/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub extends lg {
    static mm field_G;
    private int field_H;
    private sk field_F;
    static int field_E;
    static int field_C;
    static int[] field_D;

    final void a(int param0, byte param1, int param2, int param3) {
        int var5;
        int var6;
        cd var8;
        int var9;
        int var10;
        int var11;
        t var13;
        t var14;
        t var15;
        t var16;
        int var9Lifetime1;
        int var10Lifetime1;
        var11 = Torquing.field_u;
        super.a(param0, (byte) -126, param2, param3);
        if (0 != param0) {
          return;
        }
        if (param1 > -7) {
          return;
        }
        var5 = (this.field_p >> 1) + this.field_w + param3;
        var6 = this.field_k + param2 + (this.field_o >> 1);
        var8 = this.field_F.a((byte) -87);
        if (var8 == q.field_a) {
          var16 = wj.field_h[0];
          var9 = var16.field_w << 1;
          var10 = var16.field_u << 1;
          if (dp.field_b == null) {
            dp.field_b = new t(var9, var10);
            tm.a((byte) 99, dp.field_b);
          } else {
            if (dp.field_b.field_s < var9) {
              dp.field_b = new t(var9, var10);
              tm.a((byte) 99, dp.field_b);
            } else {
              if (var10 > dp.field_b.field_t) {
                dp.field_b = new t(var9, var10);
                tm.a((byte) 99, dp.field_b);
              } else {
                tm.a((byte) -105, dp.field_b);
                ph.b();
              }
            }
          }
          var16.c(112, 144, var16.field_w << 4, var16.field_u << 4, -this.field_H << 10, 4096);
          r.a(123);
          dp.field_b.a(-var16.field_w + var5, -var16.field_u + var6, 256);
          return;
        }
        if (gn.field_h != var8) {
          if (var8 == so.field_u) {
            var14 = wj.field_h[2];
            var14.a(-(var14.field_s >> 1) + var5, var6 - (var14.field_t >> 1), 256);
            return;
          }
          if (so.field_s != var8) {
            return;
          }
          var13 = wj.field_h[1];
          var13.a(var5 - (var13.field_s >> 1), -(var13.field_t >> 1) + var6, 256);
          return;
        }
        var15 = wj.field_h[0];
        var9Lifetime1 = var15.field_w << 1;
        var10Lifetime1 = var15.field_u << 1;
        if (dp.field_b == null) {
          dp.field_b = new t(var9Lifetime1, var10Lifetime1);
          tm.a((byte) 99, dp.field_b);
        } else {
          if (dp.field_b.field_s < var9Lifetime1) {
            dp.field_b = new t(var9Lifetime1, var10Lifetime1);
            tm.a((byte) 99, dp.field_b);
          } else {
            if (var10Lifetime1 > dp.field_b.field_t) {
              dp.field_b = new t(var9Lifetime1, var10Lifetime1);
              tm.a((byte) 99, dp.field_b);
            } else {
              tm.a((byte) -105, dp.field_b);
              ph.b();
            }
          }
        }
        var15.c(112, 144, var15.field_w << 4, var15.field_u << 4, -this.field_H << 10, 4096);
        r.a(123);
        dp.field_b.a(-var15.field_w + var5, -var15.field_u + var6, 256);
    }

    final static void a(int param0, long param1) {
        if (param0 != 1976) {
          ub.a(-53, -74L);
          if (0L >= param1) {
            return;
          }
          if (param1 % 10L != 0L) {
            op.a(param1, param0 - 1897);
            return;
          }
          op.a(-1L + param1, 112);
          op.a(1L, 93);
          return;
        }
        if (0L >= param1) {
          return;
        }
        if (param1 % 10L != 0L) {
          op.a(param1, param0 - 1897);
          return;
        }
        op.a(-1L + param1, 112);
        op.a(1L, 93);
    }

    public static void a(byte param0) {
        field_G = null;
        field_D = null;
        if (param0 != -19) {
          ub.a((byte) -112);
        }
    }

    final boolean a(gm param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ub.JA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, gm param1, int param2, int param3) {
        try {
          this.field_H = this.field_H + 1;
          int var5_int = -105 % ((param0 + 28) / 43);
          super.a(-84, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "ub.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final String b(int param0) {
        if (this.field_s) {
          return this.field_F.a(param0 ^ 124);
        }
        if (param0 == 0) {
          return null;
        }
        ub.a((byte) 125);
        return null;
    }

    ub(sk param0) {
        try {
          this.field_F = param0;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "ub.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_D = new int[]{0, 0, 0, 65535, 0, 0, 0, 65535, 0, 0, 0, 65535};
    }
}
