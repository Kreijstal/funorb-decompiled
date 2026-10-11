/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj extends jc {
    static int field_J;
    int field_L;
    static int field_K;
    static String[][] field_M;

    final static void o(int param0) {
        int var17_int = 0;
        int var18 = 0;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        pb var4_ref_pb = null;
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
        int var15 = 0;
        int var16 = 0;
        pb var17 = null;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var3Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        double var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = MinerDisturbance.field_ab;
        try {
          pc.field_g = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
          var1_int = aj.field_b.length;
          var21 = new int[var1_int];
          var20 = var21;
          var2 = var20;
          for (var3 = 0; var1_int > var3; var3++) {
            var4_ref_pb = aj.field_b[var3];
            var4_ref_pb.a(true);
            fd.a(3300, var3);
            var5 = var4_ref_pb.field_H + var4_ref_pb.field_v >> 1;
            var6 = var4_ref_pb.field_h + var4_ref_pb.field_l >> 1;
            var7 = var4_ref_pb.field_J + var4_ref_pb.field_j >> 1;
            var8 = pc.field_g[9] >> 2;
            var9 = pc.field_g[10] >> 2;
            var10_int = pc.field_g[11] >> 2;
            var11 = var8 * tk.field_d[3] - (-(var9 * tk.field_d[4]) - var10_int * tk.field_d[5]) >> 14;
            var12 = var10_int * tk.field_d[8] + var9 * tk.field_d[7] + tk.field_d[6] * var8 >> 14;
            var13 = tk.field_d[9] * var8 - (-(tk.field_d[10] * var9) - var10_int * tk.field_d[11]) >> 14;
            var2[var3] = var13 * var7 + var11 * var5 + var6 * var12 >> 16;
          }
          var3Lifetime1 = pc.field_g[9] >> 8;
          var4 = pc.field_g[10] >> 8;
          var5Lifetime1 = pc.field_g[11] >> 8;
          var6Lifetime1 = mn.field_x << 4;
          var7Lifetime1 = 0;
          var8Lifetime1 = nm.a(var6Lifetime1, (byte) -128) >> 8;
          var9Lifetime1 = j.a(var6Lifetime1, -50) >> 8;
          if (nk.field_w != -1 &&
            -1 != gb.field_e) {
            var9Lifetime1 = -128;
            var8Lifetime1 = -gb.field_e + 240;
            var7Lifetime1 = -320 + nk.field_w;
          }
          var10 = 256.0 / Math.sqrt((double)(var7Lifetime1 * var7Lifetime1 + var8Lifetime1 * var8Lifetime1 + var9Lifetime1 * var9Lifetime1));
          var9Lifetime1 = (int)((double)var9Lifetime1 * var10);
          var7Lifetime1 = (int)((double)var7Lifetime1 * var10);
          var8Lifetime1 = (int)((double)var8Lifetime1 * var10);
          var12Lifetime1 = -var3Lifetime1 + var7Lifetime1;
          var13Lifetime1 = var8Lifetime1 - var4;
          var14 = var9Lifetime1 - var5Lifetime1;
          var10Lifetime1 = 256.0 / Math.sqrt((double)(var13Lifetime1 * var13Lifetime1 + var12Lifetime1 * var12Lifetime1 + var14 * var14));
          var14 = (int)((double)var14 * var10Lifetime1);
          var13Lifetime1 = (int)((double)var13Lifetime1 * var10Lifetime1);
          var12Lifetime1 = (int)((double)var12Lifetime1 * var10Lifetime1);
          var15 = 0;
          if (param0 != -1236579128) {
            field_J = 107;
          }
          while (aj.field_b.length > var15) {
            var16 = 0;
            for (var17_int = 1; aj.field_b.length > var17_int; var17_int++) {
              if (var21[var16] < var21[var17_int]) {
                var16 = var17_int;
              }
            }
            var21[var16] = -2147483648;
            var17 = aj.field_b[var16];
            fd.a(3300, var16);
            for (var18 = 0; var18 < 3; var18++) {
              tk.field_d[var18] = tk.field_d[var18] + pa.field_b[var15][var18];
            }
            tm.a(var17, -363953584, pc.field_g, tk.field_d, true, false, false);
            sl.a(-1, var8Lifetime1, var12Lifetime1, var7Lifetime1, var17, var13Lifetime1, var9Lifetime1, var14);
            var15++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var1), "oj.E(" + param0 + ')');
        }
    }

    final static void c(byte param0) {
        if (param0 != -62) {
          oj.a(-128, 66);
        }
    }

    oj(fe param0) {
        super(param0.field_u, param0.field_t, param0.field_v, param0.field_q, (ad) null, (rm) null);
        try {
          param0.a(this.field_q, -57, 0, this.field_v, 0);
          this.field_L = 256;
          this.field_I = param0;
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "oj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(pi param0, pi param1, byte param2) {
        try {
          if (param2 != -117) {
            field_K = -82;
          }
          if (param0.field_c != null) {
            param0.b(34);
          }
          param0.field_f = param1;
          param0.field_c = param1.field_c;
          param0.field_c.field_f = param0;
          param0.field_f.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "oj.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1) {
        dm.field_j = param0;
        if (param1 != 3) {
          field_K = 80;
        }
    }

    public oj() {
        super(0, 0, 0, 0, (ad) null, (rm) null);
        this.field_L = 256;
    }

    public static void n(int param0) {
        field_M = (String[][]) null;
        if (param0 != 65536) {
          oj.a(-64, -101);
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (param3 != 0) {
          return;
        }
        if (this.field_I == null) {
          return;
        }
        if (0 == this.field_L) {
          return;
        }
        if (256 == this.field_L) {
          this.field_I.a((byte) 4, param1 + this.field_u, this.field_t + param2, param3);
          return;
        }
        ea var6 = new ea(this.field_I.field_v, this.field_I.field_q);
        vb.a(var6, 125);
        this.field_I.a(param0, 0, 0, param3);
        tk.b(true);
        var6.f(param1 + this.field_u, param2 + this.field_t, this.field_L);
    }

    static {
        field_K = -1;
        field_M = new String[][]{new String[]{"Ah, you've found the bones of an old miner. Clearly, he wasn't as fortunate as you. Check his body; he might have some equipment he no longer has any use for. You have taken care of whatever killed him, right?"}};
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$c5042ffd0615(pi param0, pi param1, int param2) {
        try {
          if (param2 != -117) {
            field_K = -82;
          }
          if (param0.field_c != null) {
            param0.b(34);
          }
          param0.field_f = param1;
          param0.field_c = param1.field_c;
          param0.field_c.field_f = param0;
          param0.field_f.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "oj.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }
}
