/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tm {
    private static long[] field_c;
    static boolean[] field_b;
    static String field_h;
    static NodeDeque field_f;
    static int field_a;
    static String field_e;
    static String field_d;
    static int field_g;

    final static void a(wq param0, int param1, byte param2, java.math.BigInteger param3, int param4, byte[] param5, java.math.BigInteger param6) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int var9Lifetime1;
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          var7_int = wi.a((byte) -98, param1);
          if (null == bg.field_p) {
            bg.field_p = new java.security.SecureRandom();
          }
          var13 = new int[4];
          var12 = var13;
          var8 = var12;
          for (var9 = 0; var9 < 4; var9++) {
            var8[var9] = bg.field_p.nextInt();
          }
          if (vh.field_N == null ||
            !(vh.field_N.field_k.length >= var7_int)) {
            vh.field_N = new wq(var7_int);
          }
          vh.field_N.field_l = 0;
          vh.field_N.a(param5, -1, param4, param1);
          vh.field_N.f((byte) -74, var7_int);
          vh.field_N.a(18146, var13);
          if (null == RectangleBody.field_r ||
            !(RectangleBody.field_r.field_k.length >= 100)) {
            RectangleBody.field_r = new wq(100);
          }
          RectangleBody.field_r.field_l = 0;
          RectangleBody.field_r.a(21, 10);
          if (param2 <= 115) {
            tm.a(-128, (byte) -47);
          }
          var11 = 0;
          var9Lifetime1 = var11;
          while (4 > var11) {
            RectangleBody.field_r.a(var13[var11], (byte) -79);
            var11++;
          }
          RectangleBody.field_r.b((byte) 122, param1);
          RectangleBody.field_r.a(param3, param6, 19775);
          param0.a(RectangleBody.field_r.field_k, -1, 0, RectangleBody.field_r.field_l);
          param0.a(vh.field_N.field_k, -1, 0, vh.field_N.field_l);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_24_0 = var7;
          stackIn_24_1 = new StringBuilder().append("tm.B(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param6 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final static void a(byte param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var6 = 0;
        pg var6_ref_pg = null;
        int var7 = 0;
        byte[] var8 = null;
        pg var9 = null;
        int var10 = 0;
        byte[] var11 = null;
        pg var13 = null;
        byte[] var14 = null;
        byte[] var17 = null;
        int var6Lifetime1;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          if (oa.field_Ub != 0) {
            var2_long = ue.a(false);
            var4 = oa.field_Ub;
            if (fk.field_b != 0.0) {
              var4 = (int)((double)var4 + ji.field_e.nextGaussian() * fk.field_b);
              if (0 > var4) {
                var4 = 0;
              }
            }
            if (0 < k.field_h.field_l) {
              var14 = new byte[k.field_h.field_l];
              var11 = var14;
              var8 = var11;
              var17 = var8;
              for (var6 = 0; var14.length > var6; var6++) {
                var8[var6] = k.field_h.field_k[var6];
              }
              var6_ref_pg = new pg(var2_long + (long)var4, k.field_h.field_l, var17);
              hg.field_a.addLast(var6_ref_pg, (byte) 3);
              k.field_h.field_l = 0;
            }
            var9 = (pg) (hg.field_a.first(-62));
            var13 = var9;
            if (var13 != null &&
              var13.field_j < var2_long) {
              var13.unlink((byte) 111);
              var10 = 0;
              var6Lifetime1 = var10;
              while (var10 < var13.field_r) {
                k.field_h.field_k[var10] = var9.field_l[var10];
                var10++;
              }
              k.field_h.field_l = var13.field_r;
            }
          }
          if (param0 != 110) {
            field_b = (boolean[]) null;
          }
          cr.a(param1, 10000);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var2), "tm.D(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        field_h = null;
        if (!param0) {
          return;
        }
        field_b = null;
        field_f = null;
        field_e = null;
        field_d = null;
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        if (param0 == 0) {
          var2 = md.field_r;
        }
        if (param1 != 18) {
          java.math.BigInteger var3 = (java.math.BigInteger) null;
          tm.a((wq) null, 46, (byte) -64, (java.math.BigInteger) null, -75, (byte[]) null, (java.math.BigInteger) null);
        }
        if (param0 == 1) {
          var2 = md.field_v;
        }
        if (param0 == 2) {
          var2 = to.field_a;
        }
        return var2;
    }

    static {
        int var2 = 0;
        int var3 = 0;
        long var0;
        field_c = new long[256];
        for (var2 = 0; var2 < 256; var2++) {
          var0 = (long)var2;
          for (var3 = 0; var3 < 8; var3++) {
            if ((1L & var0) == 1L) {
              var0 = -3932672073523589310L ^ var0 >>> 1;
            } else {
              var0 = var0 >>> 1;
            }
          }
          field_c[var2] = var0;
        }
        field_h = "Ninja skills!";
        field_e = "Waiting for graphics";
        field_f = new NodeDeque();
        field_d = "Strong: balls destroy bricks without bouncing.";
    }
}
