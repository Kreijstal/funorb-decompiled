/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf {
    static String field_e;
    static int field_b;
    static tk field_a;
    static vh field_d;
    static boolean field_c;

    final static double[] a(int param0, double[] param1, double[] param2) {
        RuntimeException var3 = null;
        double[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 2) {
            lf.a(-30, (byte) -80);
          }
          stackIn_3_0 = new double[]{-(param1[1] * param2[2]) + param2[1] * param1[2], -(param1[2] * param2[0]) + param2[2] * param1[0], -(param2[1] * param1[0]) + param1[1] * param2[0]};
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("lf.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void a(int param0, byte param1) {
        jd.field_b = param0;
        if (param1 <= 74) {
          field_d = (vh) null;
        }
    }

    final static void a(java.math.BigInteger param0, byte[] param1, java.math.BigInteger param2, ge param3, int param4, int param5, int param6) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int var9Lifetime1;
        try {
          var7_int = w.a(8, param4);
          if (null == cb.field_a) {
            cb.field_a = new java.security.SecureRandom();
          }
          var12 = new int[4];
          var11 = var12;
          var8 = var11;
          for (var9 = 0; var9 < 4; var9++) {
            var8[var9] = cb.field_a.nextInt();
          }
          if (null == gd.field_f ||
            !(var7_int <= gd.field_f.field_t.length)) {
            gd.field_f = new ge(var7_int);
          }
          gd.field_f.field_v = 0;
          gd.field_f.a(param1, (byte) 0, param5, param4);
          gd.field_f.b(var7_int, (byte) -8);
          gd.field_f.a(32052, var12);
          if (il.field_b == null ||
            !(100 <= il.field_b.field_t.length)) {
            il.field_b = new ge(100);
          }
          il.field_b.field_v = 0;
          il.field_b.a(10, false);
          var10 = param6;
          var9Lifetime1 = var10;
          while (var10 < 4) {
            il.field_b.a(true, var12[var10]);
            var10++;
          }
          il.field_b.a((byte) -81, param4);
          il.field_b.a(param2, 116, param0);
          param3.a(il.field_b.field_t, (byte) 0, 0, il.field_b.field_v);
          param3.a(gd.field_f.field_t, (byte) 0, 0, gd.field_f.field_v);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_21_0 = var7;
          stackIn_21_1 = new StringBuilder().append("lf.B(");
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
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param3 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_a = null;
        if (param0 != 112) {
          return;
        }
        field_d = null;
    }

    static {
        field_e = "You have been removed from <%0>'s game.";
        field_c = true;
    }
}
