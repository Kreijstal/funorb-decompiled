/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg implements ub {
    private dh field_j;
    static String field_k;
    private int field_i;
    private int field_h;
    static jp field_e;
    private int field_c;
    private int field_a;
    static jp field_g;
    static jp[] field_b;
    private int field_f;
    static int field_d;
    private int field_l;

    public static void a(int param0) {
        field_g = null;
        field_b = null;
        field_e = null;
        field_k = null;
        if (param0 != -51) {
          field_k = (String) null;
        }
    }

    public final void a(boolean param0, int param1, int param2, oc param3, int param4) {
        int var10 = 0;
        oc stackIn_4_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        qi var12 = null;
        var11 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param3 instanceof qi) {
            stackIn_4_0 = (oc) (param3);
          } else {
            stackIn_4_0 = null;
          }
          var12 = (qi) (stackIn_4_0);
          lb.g(param3.field_o + param2, param3.field_w + param4, param3.field_t, param3.field_s, this.field_i);
          if (var12 != null) {
          }
          var7 = param3.field_t - 2 * var12.field_L;
          var8 = param2 - (-param3.field_o - var12.field_L);
          var9 = var12.field_M + param3.field_w + param4;
          lb.d(var8, var9, var7 + var8, var9, this.field_l);
          for (var10 = var12.c(false) - 1; var10 >= 0; var10--) {
            lb.f(var8 + var12.a(var10, false) * var7 / var12.h(-119), var9, this.field_c, this.field_a);
          }
          if (param1 != -20618) {
            dg.a(46);
          }
          if (this.field_j != null) {
            this.field_j.b(var12.field_A, var7 / 2 + var8, var9 + this.field_j.field_N + var12.field_M, this.field_h, this.field_f);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("dg.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(')').toString());
        }
    }

    final static String b(int param0) {
        if (null == tb.field_cb) {
          return "";
        }
        int var1 = 90 % ((-28 - param0) / 48);
        return tb.field_cb;
    }

    final static void a(boolean param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var6Lifetime3;
        int var7Lifetime3;
        var8 = BrickABrac.field_J ? 1 : 0;
        if (0 > ld.field_t) {
          return;
        }
        var3 = param2 - 135;
        var4 = param1 - 35;
        var5 = 256;
        if (ld.field_t < 75) {
          var5 = (ld.field_t << 8) / 75;
        }
        if (ld.field_t > 200) {
          var5 = (-ld.field_t + 250 << 8) / 50;
        }
        fc.a(-90, me.field_b);
        mg.c();
        if (!param0) {
          lb.d();
          jl.b(-120);
          if (256 > var5) {
            lb.d(0, 0, lb.field_c, lb.field_d, 0, 256 - var5);
          }
          sc.b(-96);
          if (ld.field_t < 150) {
            me.field_b.a(var3, var4);
          } else {
            vq.field_I.b(var3 + 15, 10 + var4, var5);
          }
          var6 = -125 + ld.field_t;
          if (var6 > 0 &&
            var6 < 50) {
            if (20 <= var6) {
              if (30 <= var6) {
                var7 = (-var6 + 50) * 256 / 20;
                aa.field_b.f(var3, var4, var7);
              } else {
                aa.field_b.f(var3, var4, 256);
              }
            } else {
              var7 = var6 * 256 / 20;
              aa.field_b.f(var3, var4, var7);
            }
          }
          var6Lifetime3 = -140 + ld.field_t;
          if (var6Lifetime3 > 0) {
            var7Lifetime3 = 256;
            if (var6Lifetime3 < 20) {
              var7Lifetime3 = 256 * var6Lifetime3 / 20;
            }
            BitPacketBuffer.field_t.b(15 + var3, 10 + var4, var5 * var7Lifetime3 >> 8);
          }
          return;
        }
        dg.a(-70);
        lb.d();
        jl.b(-120);
        if (256 > var5) {
          lb.d(0, 0, lb.field_c, lb.field_d, 0, 256 - var5);
        }
        sc.b(-96);
        if (ld.field_t < 150) {
          me.field_b.a(var3, var4);
        } else {
          vq.field_I.b(var3 + 15, 10 + var4, var5);
        }
        var6Lifetime1 = -125 + ld.field_t;
        if (var6Lifetime1 > 0 &&
          var6Lifetime1 < 50) {
          if (20 > var6Lifetime1) {
            var7Lifetime1 = var6Lifetime1 * 256 / 20;
            aa.field_b.f(var3, var4, var7Lifetime1);
          } else {
            if (30 > var6Lifetime1) {
              aa.field_b.f(var3, var4, 256);
            } else {
              var7Lifetime1 = (-var6Lifetime1 + 50) * 256 / 20;
              aa.field_b.f(var3, var4, var7Lifetime1);
            }
          }
        }
        var6Lifetime2 = -140 + ld.field_t;
        if (var6Lifetime2 > 0) {
          var7Lifetime2 = 256;
          if (var6Lifetime2 < 20) {
            var7Lifetime2 = 256 * var6Lifetime2 / 20;
          }
          BitPacketBuffer.field_t.b(15 + var3, 10 + var4, var5 * var7Lifetime2 >> 8);
        }
        return;
    }

    final static om a(int param0, byte param1) {
        if (param1 == 61) {
          return null == pn.field_i ? null : (om) (pn.field_i.a((long)param0, -1));
        }
        return (om) null;
    }

    final static void a(boolean param0) {
        bd.a(17, param0);
    }

    final static void a(int param0, int param1, int param2, jp param3, jp param4, int param5, int param6, jp param7, int param8, int param9) {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        try {
          param4.d((param8 * 5 >> 16) + param2 + (param1 - param4.field_x) / 2, param5);
          param7.c((-param7.field_x + param1) / 2 + (param2 + (10 * param8 >> 16)), -param7.field_z + 480 + (param9 + param5));
          param3.c((20 * param8 >> 16) + (param1 - param3.field_x) / 2 + param2, -param3.field_z + (480 + param5) + param9);
          if (param0 != -899814320) {
            dg.a(-80);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_5_0 = var10;
          stackIn_5_1 = new StringBuilder().append("dg.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    dg(dh param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
          this.field_j = param0;
          this.field_h = param1;
          this.field_i = param4;
          this.field_a = param6;
          this.field_f = param2;
          this.field_c = param5;
          this.field_l = param3;
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "dg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_k = "Click";
    }
}
