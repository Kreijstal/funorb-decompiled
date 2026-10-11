/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tp implements iq {
    private int field_l;
    private int field_m;
    private int field_f;
    private int field_h;
    static int field_g;
    private nq field_c;
    static bi field_e;
    private int field_a;
    private int field_i;
    static int field_b;
    static String field_k;
    static int field_j;
    static String field_d;

    public final void a(vg param0, int param1, boolean param2, int param3, byte param4) {
        int var10 = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        td var12 = null;
        vg stackIn_4_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (!(param0 instanceof td)) {
            stackIn_4_0 = null;
          } else {
            stackIn_4_0 = (vg) (param0);
          }
          var12 = (td) (stackIn_4_0);
          gf.d(param1 + param0.field_m, param3 + param0.field_q, param0.field_x, param0.field_n, this.field_l);
          if (var12 != null) {
          }
          var7 = -(2 * var12.field_M) + param0.field_x;
          var8 = param1 + param0.field_m + var12.field_M;
          var9 = param0.field_q + param3 + var12.field_I;
          if (param4 != 12) {
            return;
          }
          gf.g(var8, var9, var7 + var8, var9, this.field_f);
          for (var10 = -1 + var12.g((byte) 93); var10 >= 0; var10--) {
            gf.g(var8 + var12.a(var10, (byte) -58) * var7 / var12.a((byte) -13), var9, this.field_a, this.field_h);
          }
          if (null == this.field_c) {
            return;
          }
          this.field_c.c(var12.field_s, var8 + var7 / 2, var9 + this.field_c.field_L + var12.field_I, this.field_m, this.field_i);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("tp.E(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_e = null;
        field_k = null;
        if (param0 != 49) {
          field_g = 72;
        }
    }

    final static nk[] a(String param0, bc param1, String param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        nk[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param1.a(126, param0);
          if (param3 != -118) {
            field_j = -121;
          }
          var5 = param1.a(var4_int, (byte) 106, param2);
          stackIn_3_0 = lg.a(param3 ^ 20391, param1, var5, var4_int);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("tp.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int[] param0, long param1, String param2, String param3, int param4, ub param5, qr param6, int param7, int param8) {
        try {
          if (param4 != 293) {
            field_k = (String) null;
          }
          hp.field_l = param5;
          hp.field_m = new fc(param6, param1, param3, param2, param8, param7, param0);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "tp.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    tp(nq param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
          this.field_c = param0;
          this.field_a = param5;
          this.field_m = param1;
          this.field_l = param4;
          this.field_f = param3;
          this.field_i = param2;
          this.field_h = param6;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "tp.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void b(byte param0) {
        int fieldTemp$0 = 0;
        int var1 = 0;
        int var1Lifetime1;
        if (um.field_k < vc.field_c.length) {
          fieldTemp$0 = um.field_k;
          um.field_k = um.field_k + 1;
          sd.field_t = vc.field_c[fieldTemp$0];
          var1 = -8 % ((-21 - param0) / 42);
          return;
        }
        sd.field_t = null;
        var1Lifetime1 = -8 % ((-21 - param0) / 42);
    }

    static {
        field_g = -1;
        field_k = "Rules: Streamlined";
        field_d = "Unable to add name - system busy";
    }
}
