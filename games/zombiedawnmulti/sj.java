/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj extends ae {
    private int field_i;
    private int field_o;
    static int field_p;
    private int field_k;
    static ja field_j;
    private int field_q;
    private int field_l;
    private int field_n;
    static int field_m;

    final static void a(String[] args, int param1, int param2, String param3) {
        int var5 = 0;
        boolean stackIn_9_0 = false;
        boolean stackIn_10_1 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          id.field_B = oi.field_j;
          if (param2 == 255) {
            stackIn_9_0 = false;
            stackIn_10_1 = !(rj.field_J >= 13);
            iq.field_c = ij.a(stackIn_9_0, stackIn_10_1);
          } else {
            if (param2 < 100) {
              iq.field_c = p.a(-38, param3, param2);
            } else {
              if (105 < param2) {
                iq.field_c = p.a(-38, param3, param2);
              } else {
                iq.field_c = kn.a(args, -111);
              }
            }
          }
          if (param1 == 31407) {
            return;
          }
          field_p = -77;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("sj.E(");
          if (args == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    sj(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        super(param0);
        this.field_o = param3;
        this.field_q = param4;
        this.field_i = param2;
        this.field_k = param6;
        this.field_n = param5;
        this.field_l = param1;
    }

    final static void a(int param0, int param1, byte param2) {
        int[] var7 = null;
        int[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param2 != -66) {
          return;
        }
        try {
          var7 = new int[1 + me.field_f.length];
          var3 = var7;
          var4 = new int[me.field_f.length + 1];
          for (var5 = 0; me.field_f.length > var5; var5++) {
            var7[var5] = me.field_f[var5];
            var4[var5] = nm.field_u[var5];
          }
          var3[var3.length - 1] = param1;
          var4[-1 + var4.length] = param0;
          nm.field_u = var4;
          me.field_f = var3;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "sj.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        int var11 = 0;
        int incrementValue$0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var14 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param1 != -891231071) {
            return;
          }
          if (param2 <= param5) {
            return;
          }
          if (param5 + 1 >= param4) {
            return;
          }
          if (param4 > 5 + param5 &&
            param0 != param6) {
            var7_int = (1 & (param0 & param6)) + ((param6 >> 1) + (param0 >> 1));
            var8 = param5;
            var9 = param0;
            var10 = param6;
            for (var11 = param5; param4 > var11; var11++) {
              var12 = la.field_c[var11];
              if (param3) {
                stackIn_26_0 = lb.field_c[var12];
              } else {
                stackIn_26_0 = hn.field_f[var12];
              }
              var13 = stackIn_26_0;
              if (var13 > var7_int) {
                la.field_c[var11] = la.field_c[var8];
                incrementValue$0 = var8;
                var8++;
                la.field_c[incrementValue$0] = var12;
                if (var9 > var13) {
                  var9 = var13;
                }
              } else {
                if (var10 < var13) {
                  var10 = var13;
                }
              }
            }
            sj.a(param0, param1 + 0, param2, param3, var8, param5, var9);
            sj.a(var10, param1 + 0, param2, param3, param4, var8, param6);
            return;
          }
          for (var7_intLifetime1 = param4 - 1; var7_intLifetime1 > param5; var7_intLifetime1--) {
            for (var8Lifetime1 = param5; var7_intLifetime1 > var8Lifetime1; var8Lifetime1++) {
              var9Lifetime1 = la.field_c[var8Lifetime1];
              var10Lifetime1 = la.field_c[1 + var8Lifetime1];
              if (un.a(101, param3, var9Lifetime1, var10Lifetime1)) {
                la.field_c[var8Lifetime1] = var10Lifetime1;
                la.field_c[1 + var8Lifetime1] = var9Lifetime1;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var7), "sj.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void a(int param0, qd param1) {
        wb stackIn_4_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        Throwable decompiledCaughtException = null;
        gm var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        wb var4_ref = null;
        Exception var5 = null;
        qk var5_ref = null;
        wb var6 = null;
        try {
          var3 = op.field_m.a(this.field_i, 70);
          var4 = null;
          try {
            if (this.field_l == -1) {
              stackIn_4_0 = null;
            } else {
              stackIn_4_0 = op.field_m.a(this.field_l, false);
            }
            var4_ref = stackIn_4_0;
            if (param0 != 0) {
              sj.c(true);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (Exception) (Object) decompiledCaughtException;
            return;
          }
          var5_ref = new qk(this.field_q, this.field_n);
          var6 = param1.a(this.field_k, var4_ref, var3, true, var5_ref);
          var6.field_y = this.field_o;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("sj.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        if (!param1) {
          this.field_q = 6;
        }
    }

    public static void c(boolean param0) {
        field_j = null;
        if (!param0) {
          sj.a(-121, -52, -61, false, 25, -17, -24);
        }
    }

    final static boolean a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 12319) {
            sj.a(97, -25, -42, true, 8, 4, 118);
          }
          stackIn_3_0 = dp.a(0, false, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("sj.G(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
