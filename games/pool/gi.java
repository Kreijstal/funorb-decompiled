/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi extends ma {
    static vh field_o;
    int field_r;
    int field_p;
    int field_l;
    int field_q;
    gi field_s;
    static String field_n;
    int field_m;
    static int field_t;

    final static int a(int param0, int param1) {
        int var2 = param1;
        if (param0 < 0 ||
          65536 <= param0) {
          param0 = param0 >>> 16;
          var2 += 16;
        }
        if (param0 >= 256) {
          param0 = param0 >>> 8;
          var2 += 8;
        }
        if (16 <= param0) {
          var2 += 4;
          param0 = param0 >>> 4;
        }
        if (param0 >= 4) {
          var2 += 2;
          param0 = param0 >>> 2;
        }
        if (param0 >= 1) {
          param0 = param0 >>> 1;
          var2++;
        }
        return param0 + var2;
    }

    final void a(int param0, int param1, int param2, int param3, boolean param4, int param5) {
        int var7 = this.field_q + param5;
        int var8 = param1 + this.field_m;
        qh.e(var8 - 1, var7, this.field_l + 1, param0, param2);
        qh.e(var8 - 1, param3 + var7 + this.field_r, 1 + this.field_l, param0, param2);
        if (param4) {
          qh.g(var8 - 2, var7, this.field_r, param0, param2);
        }
        if (this.field_s == null) {
          qh.g(this.field_l + var8, var7, this.field_r, param0, param2);
        } else {
          this.field_s.a(param0, param1, param2, -1, false, param5);
        }
    }

    final static void a(int param0) {
        int var15 = 0;
        int var17_int = 0;
        int var18 = 0;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        oc var4_ref_oc = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        int[] var19 = null;
        int[] var20 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        oc var17 = null;
        int var3Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        double var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        try {
          eh.field_p = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
          var1_int = qe.field_S.length;
          var20 = new int[var1_int];
          var19 = var20;
          var2 = var19;
          for (var3 = 0; var1_int > var3; var3++) {
            var4_ref_oc = qe.field_S[var3];
            var4_ref_oc.a((byte) 87);
            qe.b(0, var3);
            var5 = var4_ref_oc.field_n + var4_ref_oc.field_q >> 1;
            var6 = var4_ref_oc.field_b + var4_ref_oc.field_N >> 1;
            var7 = var4_ref_oc.field_f + var4_ref_oc.field_F >> 1;
            var8 = eh.field_p[9] >> 2;
            var9 = eh.field_p[10] >> 2;
            var10_int = eh.field_p[11] >> 2;
            var11 = var10_int * li.field_b[5] + (var8 * li.field_b[3] + var9 * li.field_b[4]) >> 14;
            var12 = li.field_b[8] * var10_int + li.field_b[6] * var8 + var9 * li.field_b[7] >> 14;
            var13 = li.field_b[10] * var9 + (li.field_b[9] * var8 + li.field_b[11] * var10_int) >> 14;
            var2[var3] = var7 * var13 + (var11 * var5 + var12 * var6) >> 16;
          }
          var3Lifetime1 = eh.field_p[9] >> 8;
          var4 = eh.field_p[10] >> 8;
          var5Lifetime1 = eh.field_p[11] >> 8;
          var6Lifetime1 = im.field_fc << 4;
          var7Lifetime1 = 0;
          var8Lifetime1 = af.c((byte) -123, var6Lifetime1) >> 8;
          var9Lifetime1 = o.a(var6Lifetime1, (byte) 83) >> 8;
          if (wn.field_i != -1 &&
            gg.field_f != -1) {
            var9Lifetime1 = -128;
            var7Lifetime1 = -320 + wn.field_i;
            var8Lifetime1 = -gg.field_f + 240;
          }
          var10 = 256.0 / Math.sqrt((double)(var8Lifetime1 * var8Lifetime1 + (var7Lifetime1 * var7Lifetime1 + var9Lifetime1 * var9Lifetime1)));
          var7Lifetime1 = (int)((double)var7Lifetime1 * var10);
          var8Lifetime1 = (int)((double)var8Lifetime1 * var10);
          var9Lifetime1 = (int)((double)var9Lifetime1 * var10);
          var12Lifetime1 = -var3Lifetime1 + var7Lifetime1;
          var13Lifetime1 = -var4 + var8Lifetime1;
          var14 = -var5Lifetime1 + var9Lifetime1;
          if (param0 != -21818) {
            return;
          }
          var10Lifetime1 = 256.0 / Math.sqrt((double)(var14 * var14 + var13Lifetime1 * var13Lifetime1 + var12Lifetime1 * var12Lifetime1));
          var12Lifetime1 = (int)((double)var12Lifetime1 * var10Lifetime1);
          var14 = (int)((double)var14 * var10Lifetime1);
          var13Lifetime1 = (int)((double)var13Lifetime1 * var10Lifetime1);
          for (var15 = 0; qe.field_S.length > var15; var15++) {
            var16 = 0;
            for (var17_int = 1; var17_int < qe.field_S.length; var17_int++) {
              if (var20[var17_int] > var20[var16]) {
                var16 = var17_int;
              }
            }
            var20[var16] = -2147483648;
            var17 = qe.field_S[var16];
            qe.b(0, var16);
            for (var18 = 0; var18 < 3; var18++) {
              li.field_b[var18] = li.field_b[var18] + qp.field_gc[var15][var18];
            }
            ve.a(param0 + 21815, false, eh.field_p, false, true, li.field_b, var17);
            kj.a(var14, 8355711, var17, var8Lifetime1, var13Lifetime1, var9Lifetime1, var12Lifetime1, var7Lifetime1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1), "gi.A(" + param0 + ')');
        }
    }

    public static void a(boolean param0) {
        field_n = null;
        if (!param0) {
          field_o = (vh) null;
        }
        field_o = null;
    }

    final static ij a(boolean param0, int param1, String param2, String param3) {
        ij var4 = null;
        RuntimeException var4_ref = null;
        ij stackIn_3_0 = null;
        ij stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (me.a(-2, param1) == null) {
            var4 = new ij(param1);
            var4.a(param2, (byte) 120, param3);
            nd.field_i.b((byte) -20, var4);
            stackIn_3_0 = var4;
            return stackIn_3_0;
          }
          if (param0) {
            return null;
          }
          stackIn_7_0 = (ij) null;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_11_0 = var4_ref;
          stackIn_11_1 = new StringBuilder().append("gi.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    gi(int param0) {
        this.field_s = null;
        this.field_p = param0;
    }

    static {
        field_n = "That name is not available";
    }
}
