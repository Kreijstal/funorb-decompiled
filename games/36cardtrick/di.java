/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di {
    int field_c;
    static rf field_d;
    int[] field_a;
    int field_b;

    final static byte[] a(byte[] param0, w param1, int param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        byte[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = Main.field_T;
        try {
          var4_int = param1.g(param3, -1);
          if (var4_int == 0) {
            stackIn_3_0 = null;
            return (byte[]) (stackIn_3_0);
          }
          if (param0 == null ||
            param0.length != var4_int) {
            param0 = new byte[var4_int];
          }
          var5 = param1.g(3, -1);
          var6 = (byte)param1.g(8, -1);
          if (param2 != 17259) {
            field_d = (rf) null;
          }
          if (var5 <= 0) {
            for (var7 = 0; var4_int > var7; var7++) {
              param0[var7] = (byte)var6;
            }
          } else {
            for (var7 = 0; var7 < var4_int; var7++) {
              param0[var7] = (byte)(param1.g(var5, -1) + var6);
            }
          }
          stackIn_18_0 = (byte[]) (param0);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("di.C(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int a(byte param0) {
        int stackIn_6_0 = 0;
        if (param0 < 74) {
          this.field_c = -54;
        }
        if (null != this.field_a &&
          this.field_a.length != 0) {
          stackIn_6_0 = this.field_a[this.field_a.length - 1];
        } else {
          stackIn_6_0 = 0;
        }
        return stackIn_6_0;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4;
        var4 = Main.field_T;
        if (this.field_a != null &&
          0 != this.field_a.length) {
          for (var3 = param0; var3 < this.field_a.length; var3++) {
            if (param1 < this.field_a[var3] + this.field_a[var3 - 1] >> 1) {
              return -1 + var3;
            }
          }
          return -1 + this.field_a.length;
        }
        return 0;
    }

    final static void a(wb param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var6_intLifetime1;
        int var11Lifetime1;
        int var11Lifetime2;
        try {
          var6_int = param0.field_f;
          var7 = 0;
          var8 = 65536 / var6_int;
          param2 = param2 + param0.field_h;
          param5 = param5 + param0.field_c;
          var7 = var7 + param0.field_c * var8;
          var9 = 0;
          var6_intLifetime1 = param0.field_b;
          var10 = param0.field_g;
          if (param2 < vj.field_f) {
            var11 = vj.field_f - param2;
            param2 = vj.field_f;
            var9 = var9 + var11;
            var10 = var10 - var11;
          }
          if (var10 + param2 > vj.field_a) {
            var10 = -param2 + vj.field_a;
          }
          if (param5 < vj.field_h) {
            var11Lifetime1 = -param5 + vj.field_h;
            var7 = var7 + var8 * var11Lifetime1;
            param5 = vj.field_h;
            var9 = var9 + param0.field_g * var11Lifetime1;
            var6_intLifetime1 = var6_intLifetime1 - var11Lifetime1;
          }
          if (vj.field_b < var6_intLifetime1 + param5) {
            var6_intLifetime1 = vj.field_b - param5;
          }
          var11Lifetime2 = -var10 + vj.field_l;
          var12 = -var10 + param0.field_g;
          var13 = param5 * vj.field_l + param2;
          q.a(vj.field_j, (byte) 122, param3, var13, var6_intLifetime1, var10, var8, var7, param0.field_i, var9, var11Lifetime2, var12, param1);
          if (param4 != 13449) {
            field_d = (rf) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("di.H(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void b(int param0) {
        if (null != pc.field_a) {
          pc.field_a.s(-94);
        }
        ti.field_e = new fh();
        vb.field_h.c(ti.field_e, (byte) 57);
        if (param0 != 1) {
          wb var2 = (wb) null;
          di.a((wb) null, -23, -72, 49, -91, 49);
        }
    }

    final static nc a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        nc var5 = null;
        nc stackIn_4_0 = null;
        nc stackIn_8_0 = null;
        nc stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != null &&
            param0.length() != 0) {
            var2_int = param0.indexOf((int) (char)param1);
            if (var2_int == -1) {
              stackIn_8_0 = ec.field_j;
              return stackIn_8_0;
            }
            var3 = param0.substring(0, var2_int);
            var4 = param0.substring(var2_int + 1);
            var5 = we.a(var3, 34);
            if (var5 == null) {
              return n.b(var4, (byte) -117);
            }
            stackIn_12_0 = var5;
            return stackIn_12_0;
          }
          stackIn_4_0 = hc.field_b;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("di.A(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != -1) {
          di.b(-101);
        }
        field_d = null;
    }

    di(int param0, int param1, int param2) {
        this.field_a = new int[1 + param2];
        this.field_b = param0;
        this.field_c = param1;
    }

    final static boolean a(byte param0, w param1) {
        RuntimeException var2 = null;
        wb var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -49) {
            var3 = (wb) null;
            di.a((wb) null, -19, -90, -105, -40, -114);
          }
          stackIn_5_0 = (1 == param1.g(1, -1));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("di.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    static {
    }
}
