/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me {
    static String field_m;
    static String field_e;
    private ul field_b;
    static String field_c;
    static vk field_k;
    private f field_i;
    static int field_h;
    static int[] field_f;
    static String field_d;
    static boolean field_g;
    private ul field_l;
    static String field_j;
    private f field_a;

    final jd a(int param0, byte param1, int[] param2) {
        RuntimeException var4 = null;
        byte[] var5 = null;
        jd stackIn_2_0 = null;
        jd stackIn_5_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (1 == this.field_l.c(-1)) {
            stackIn_2_0 = this.a(0, param0, false, param2);
            return stackIn_2_0;
          }
          if (this.field_l.d(param0, -2) == 1) {
            stackIn_5_0 = this.a(param0, 0, false, param2);
            return stackIn_5_0;
          }
          if (param1 != -64) {
            var5 = (byte[]) null;
            me.a((byte[]) null, false);
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("me.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final jd a(int param0, int[] param1, int param2) {
        RuntimeException var4 = null;
        jd stackIn_3_0 = null;
        jd stackIn_9_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_b.c(-1) == 1) {
            stackIn_3_0 = this.a(-1991540092, param1, 0, param0);
            return stackIn_3_0;
          }
          if (param2 <= 99) {
            field_c = (String) null;
          }
          if (this.field_b.d(param0, -2) != 1) {
            throw new RuntimeException();
          }
          stackIn_9_0 = this.a(-1991540092, param1, param0, 0);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("me.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    final static bo a(int param0, java.applet.Applet param1) {
        int var5 = 0;
        String var2 = null;
        RuntimeException var2_ref = null;
        bo[] var3 = null;
        int var4 = 0;
        bo var6 = null;
        int var7 = 0;
        bo stackIn_4_0 = null;
        bo stackIn_10_0 = null;
        bo stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var2 = ec.a(param1, (byte) 112, "jagex-last-login-method");
          if (var2 == null) {
            stackIn_4_0 = wi.field_h;
            return stackIn_4_0;
          }
          var3 = io.a(true);
          var4 = 53 % ((param0 - 52) / 37);
          for (var5 = 0; var5 < var3.length; var5++) {
            var6 = var3[var5];
            if (var6.a(var2, (byte) -107)) {
              stackIn_10_0 = var6;
              return stackIn_10_0;
            }
          }
          stackIn_13_0 = wi.field_h;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_16_0 = var2_ref;
          stackIn_16_1 = new StringBuilder().append("me.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_m = null;
        field_d = null;
        if (param0 != 119) {
          me.a((byte) -96);
        }
        field_f = null;
        field_e = null;
        field_c = null;
        field_j = null;
        field_k = null;
    }

    final static int[] a(int param0, int param1, int param2) {
        int var3 = on.a(param2, -18924);
        int var4 = wn.a(-126, param2);
        int var5 = on.a(param0, -18924);
        if (param1 != -2106461552) {
          return (int[]) null;
        }
        int var6 = wn.a(-127, param0);
        int var7 = (int)((long)var3 * (long)var5 >> 16);
        int var8 = (int)((long)var3 * (long)var6 >> 16);
        int var9 = (int)((long)var5 * (long)var4 >> 16);
        int var10 = (int)((long)var6 * (long)var4 >> 16);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    final static sl a(byte[] param0, boolean param1) {
        sl var2 = null;
        RuntimeException var2_ref = null;
        sl stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            return null;
          }
          var2 = new sl(param0, k.field_i, qj.field_o, oq.field_w, vj.field_p, tp.field_t, qp.field_t);
          if (!param1) {
            field_h = -18;
          }
          fd.h((byte) 126);
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("me.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    private final jd a(int param0, int param1, boolean param2, int[] param3) {
        jd stackIn_4_0 = null;
        Object stackIn_8_0 = null;
        f stackIn_15_0 = null;
        boolean stackIn_16_1 = false;
        ac stackIn_22_0 = null;
        boolean stackIn_23_1 = false;
        jd stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        jd var8 = null;
        ac var9 = null;
        jd var8Lifetime1;
        try {
          var5_int = ((536875007 & param0) << 4 | param0 >>> 12) ^ param1;
          var5_int = var5_int | param0 << 16;
          if (param2) {
            field_h = -103;
          }
          var6 = 4294967296L ^ (long)var5_int;
          var8 = (jd) (this.field_a.a(0, var6));
          if (var8 != null) {
            stackIn_4_0 = var8;
            return stackIn_4_0;
          }
          if (param3 != null &&
            param3[0] <= 0) {
            stackIn_8_0 = null;
            return (jd) (stackIn_8_0);
          }
          var9 = (ac) (this.field_i.a(0, var6));
          if (var9 == null) {
            var9 = ac.a(this.field_l, param0, param1);
            if (var9 == null) {
              return null;
            }
            stackIn_15_0 = this.field_i;
            stackIn_16_1 = !(param2);
            ((f) (Object) stackIn_15_0).a(stackIn_16_1, var6, var9);
          }
          var8Lifetime1 = var9.a(param3);
          if (var8Lifetime1 == null) {
            return null;
          }
          stackIn_22_0 = var9;
          stackIn_23_1 = !(param2);
          ((ac) (Object) stackIn_22_0).a(stackIn_23_1);
          this.field_a.a(true, var6, var8Lifetime1);
          stackIn_24_0 = var8Lifetime1;
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_27_0 = var5;
          stackIn_27_1 = new StringBuilder().append("me.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    private final jd a(int param0, int[] param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        jd var8 = null;
        jc var9 = null;
        jd var10 = null;
        jd stackIn_2_0 = null;
        Object stackIn_9_0 = null;
        jd stackIn_14_0 = null;
        jd stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        jd var8Lifetime1;
        try {
          var5_int = (param2 << 4 & 65526 | param2 >>> 12) ^ param3;
          var5_int = var5_int | param2 << 16;
          var6 = (long)var5_int;
          var8 = (jd) (this.field_a.a(0, var6));
          if (var8 != null) {
            stackIn_2_0 = var8;
            return stackIn_2_0;
          }
          if (param1 != null &&
            param1[0] <= 0) {
            return null;
          }
          var9 = jc.a(this.field_b, param2, param3);
          if (var9 == null) {
            stackIn_9_0 = null;
            return (jd) (stackIn_9_0);
          }
          var10 = var9.a();
          var8Lifetime1 = var10;
          this.field_a.a(true, var6, var8Lifetime1);
          if (param1 != null) {
            param1[0] = param1[0] - var10.field_h.length;
          }
          if (param0 == -1991540092) {
            stackIn_16_0 = var8Lifetime1;
            return stackIn_16_0;
          }
          stackIn_14_0 = (jd) null;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("me.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    me(ul param0, ul param1) {
        this.field_i = new f(256);
        this.field_a = new f(256);
        try {
          this.field_b = param0;
          this.field_l = param1;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "me.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = "Refuse to believe. The truth is in here.";
        field_f = new int[]{};
        field_c = "Block their path.";
        field_d = "Kick";
        field_e = "Unpacking music";
        field_j = "Expert";
    }
}
