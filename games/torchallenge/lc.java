/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc extends da {
    static boolean field_r;
    static ge[] field_o;
    byte[] field_q;
    static String field_m;
    static int[] field_n;
    static int[][] field_p;
    static boolean field_j;
    long field_l;
    static int[][][] field_k;
    int field_i;

    final static int b(int param0, int param1) {
        if (param0 > -28) {
          return 6;
        }
        param1 = param1 & 8191;
        if (param1 >= 4096) {
          return param1 < 6144 ? -k.field_d[-param1 + 6144] : k.field_d[-6144 + param1];
        }
        return param1 < 2048 ? k.field_d[-param1 + 2048] : -k.field_d[-2048 + param1];
    }

    final static boolean a(int param0) {
        ll.field_i = true;
        ji.field_y = 15000L + ol.a(256);
        if (param0 != 1) {
          java.math.BigInteger var2 = (java.math.BigInteger) null;
          lc.a(20, (uf) null, -87, (byte[]) null, -9, (java.math.BigInteger) null, (java.math.BigInteger) null);
        }
        return gj.field_c == 11 ? true : false;
    }

    final static void a(int param0, uf param1, int param2, byte[] param3, int param4, java.math.BigInteger param5, java.math.BigInteger param6) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
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
        var10 = TorChallenge.field_F ? 1 : 0;
        try {
          var7_int = dh.a(param2 + 8, param4);
          if (af.field_d == null) {
            af.field_d = new java.security.SecureRandom();
          }
          var13 = new int[4];
          var12 = var13;
          var8 = var12;
          for (var9 = 0; var9 < 4; var9++) {
            var8[var9] = af.field_d.nextInt();
          }
          if (null == nh.field_eb ||
            !(var7_int <= nh.field_eb.field_m.length)) {
            nh.field_eb = new uf(var7_int);
          }
          nh.field_eb.field_q = 0;
          nh.field_eb.a(param4, param0, param3, -16384);
          nh.field_eb.c(var7_int, (byte) 36);
          nh.field_eb.a(var13, (byte) -124);
          if (null == bi.field_d ||
            !(bi.field_d.field_m.length >= 100)) {
            bi.field_d = new uf(100);
          }
          bi.field_d.field_q = 0;
          bi.field_d.d(10, (byte) 122);
          var11 = 0;
          var9Lifetime1 = var11;
          while (var11 < 4) {
            bi.field_d.a(var13[var11], false);
            var11++;
          }
          bi.field_d.a(param4, (byte) 106);
          bi.field_d.a(param6, true, param5);
          param1.a(bi.field_d.field_q, param2, bi.field_d.field_m, param2 ^ -16384);
          param1.a(nh.field_eb.field_q, 0, nh.field_eb.field_m, -16384);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_22_0 = var7;
          stackIn_22_1 = new StringBuilder().append("lc.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param6 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final static int a(int param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        var2 = -1;
        var5 = 0;
        if (v.field_X[0][rf.field_ib][param0][0] <= nd.field_e &&
          nd.field_e < v.field_X[0][rf.field_ib][param0][1]) {
          var4 = v.field_X[0][rf.field_ib][param0][1];
          var3 = v.field_X[0][rf.field_ib][param0][0];
          var5Lifetime1 = -var3 + nd.field_e;
          var2 = var5Lifetime1 * 256 / (var4 - var3);
        }
        if (v.field_X[1][rf.field_ib][param0][0] <= nd.field_e &&
          nd.field_e < v.field_X[1][rf.field_ib][param0][1]) {
          var3Lifetime1 = v.field_X[1][rf.field_ib][param0][0];
          var4Lifetime1 = v.field_X[1][rf.field_ib][param0][1];
          var5Lifetime2 = -var3Lifetime1 + nd.field_e;
          var2 = 256 - 256 * var5Lifetime2 / (-var3Lifetime1 + var4Lifetime1);
        }
        if (v.field_X[0][rf.field_ib][param0][0] > nd.field_e) {
          var2 = 0;
        }
        if (nd.field_e >= v.field_X[param1][rf.field_ib][param0][1]) {
          var2 = 0;
        }
        return var2;
    }

    public static void b(byte param0) {
        field_m = null;
        field_n = null;
        field_p = (int[][]) null;
        field_k = (int[][][]) null;
        if (param0 != -75) {
          field_o = (ge[]) null;
        }
        field_o = null;
    }

    lc(long param0, int param1, byte[] param2) {
        try {
          this.field_l = param0;
          this.field_q = param2;
          this.field_i = param1;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "lc.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_j = true;
        field_m = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_r = false;
        field_p = new int[][]{new int[]{0}, new int[]{0}, new int[]{0}, new int[]{0}, new int[]{0}, new int[]{0, 1}};
        field_n = new int[]{0, 0};
        field_k = new int[][][]{new int[][]{new int[]{0, 0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0, 0, 0, 0, 0}, new int[]{0, 0}, new int[]{0}, new int[]{0, 0, 0, 0, 0, 0}}, new int[][]{new int[]{0, 0}, new int[]{0, 0, 0, 0}, new int[]{0, -18, 0, 2, 0, 0}, new int[]{0, 0, 0, 0, 0, 0}, new int[]{0, -18, 0, 3, 0}, new int[]{0, -34, 0, 0, 0}, new int[]{0}}, new int[][]{new int[]{0, 0, 0}, new int[]{0, 0}, new int[]{0, 0, 0, 0}, new int[]{0, 0, -8, 0, 4, 0}, new int[]{0, 0, 0}, new int[]{0}, new int[]{0, 0, 0, -18, 15, 0}}};
    }
}
