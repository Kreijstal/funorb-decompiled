/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd implements t {
    static String field_h;
    private int field_k;
    private int field_a;
    private int field_i;
    static qj field_g;
    private oh field_c;
    private int field_e;
    private int field_b;
    static int field_d;
    static String field_f;
    private int field_j;

    public final void a(int param0, al param1, int param2, boolean param3, int param4) {
        int var10 = 0;
        al stackIn_4_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        qk var12 = null;
        var11 = TrackController.field_F ? 1 : 0;
        try {
          if (param1 instanceof qk) {
            stackIn_4_0 = (al) (param1);
          } else {
            stackIn_4_0 = null;
          }
          var12 = (qk) (stackIn_4_0);
          ll.c(param1.field_p + param4, param1.field_m + param2, param1.field_x, param1.field_u, this.field_a);
          if (var12 == null) {
          }
          var7 = -(2 * var12.field_I) + param1.field_x;
          var8 = param1.field_p + param4 + var12.field_I;
          var9 = var12.field_P + (param1.field_m + param2);
          ll.e(var8, var9, var8 + var7, var9, this.field_k);
          for (var10 = -1 + var12.c(true); var10 >= 0; var10--) {
            ll.f(var12.a(param0 ^ 24968, var10) * var7 / var12.k(26856) + var8, var9, this.field_i, this.field_b);
          }
          if (param0 != -24969) {
            return;
          }
          if (null != this.field_c) {
            this.field_c.b(var12.field_s, var8 + var7 / 2, var9 + this.field_c.field_q + var12.field_P, this.field_j, this.field_e);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("jd.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_f = null;
        if (param0 != -12814) {
          field_g = (qj) null;
        }
        field_g = null;
    }

    final static oi a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        oi var7 = null;
        int var8 = 0;
        oi stackIn_4_0 = null;
        oi stackIn_8_0 = null;
        oi stackIn_12_0 = null;
        oi stackIn_17_0 = null;
        oi stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = TrackController.field_F ? 1 : 0;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_4_0 = oc.field_j;
            return stackIn_4_0;
          }
          if (param1 < var2_int) {
            stackIn_8_0 = bl.field_c;
            return stackIn_8_0;
          }
          var3 = te.a(param0, '.', (byte) -67);
          if (2 > var3.length) {
            stackIn_12_0 = oc.field_j;
            return stackIn_12_0;
          }
          var4 = var3;
          var5 = 0;
          while (true) {
            if (var5 >= var4.length) {
              stackIn_20_0 = u.a(var3[var3.length - 1], true);
              return stackIn_20_0;
            }
            var6 = var4[var5];
            var7 = kf.a(var6, true);
            if (var7 == null) {
              var5++;
              continue;
            }
            break;
          }
          stackIn_17_0 = var7;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("jd.B(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    final static qj[] a(int param0, int param1, int param2, kk param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        qj[] stackIn_5_0 = null;
        qj[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!sk.a(param1, param3, param0 - 4763, param2)) {
            stackIn_2_0 = null;
            return (qj[]) (stackIn_2_0);
          }
          if (param0 == 4764) {
            stackIn_7_0 = dh.e(param0 ^ 4766);
            return stackIn_7_0;
          }
          stackIn_5_0 = (qj[]) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("jd.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    jd(oh param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
          this.field_k = param3;
          this.field_i = param5;
          this.field_b = param6;
          this.field_a = param4;
          this.field_c = param0;
          this.field_j = param1;
          this.field_e = param2;
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "jd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_h = "Start Game";
        field_f = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
