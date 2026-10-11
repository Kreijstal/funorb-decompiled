/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb {
    static qj field_f;
    static long field_b;
    static hi field_e;
    static int field_a;
    static String field_h;
    static boolean field_d;
    static int[][] field_g;
    static byte[][][] field_c;
    static int field_i;
    static int field_j;

    public static void a(byte param0) {
        if (param0 <= 62) {
          field_g = (int[][]) null;
        }
        field_c = (byte[][][]) null;
        field_h = null;
        field_f = null;
        field_g = (int[][]) null;
        field_e = null;
    }

    final static short[] a(short[] param0, int param1, int param2, hj param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        short[] stackIn_10_0 = null;
        short[] stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          var4_int = param3.k(param2, 1522829539);
          if (var4_int == 0) {
            return null;
          }
          if (param0 == null ||
            var4_int != param0.length) {
            param0 = new short[var4_int];
          }
          if (param1 != 256) {
            stackIn_10_0 = (short[]) null;
            return stackIn_10_0;
          }
          var5 = param3.k(4, 1522829539);
          var6 = (short)param3.k(16, 1522829539);
          if (0 >= var5) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param0[var7] = (short)var6;
            }
          } else {
            for (var7 = 0; var7 < var4_int; var7++) {
              param0[var7] = (short)(param3.k(var5, 1522829539) + var6);
            }
          }
          stackIn_19_0 = (short[]) (param0);
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("lb.D(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final static String a(boolean param0) {
        String var1 = "";
        if (null != ok.field_a) {
          var1 = ok.field_a.e((byte) 28);
        }
        if (var1.length() == 0) {
          var1 = gj.a(-113);
        }
        if (!param0) {
          field_g = (int[][]) null;
        }
        if (0 == var1.length()) {
          var1 = nf.field_q;
        }
        return var1;
    }

    final static q a(String param0, int param1) {
        q stackIn_4_0 = null;
        q stackIn_10_0 = null;
        q stackIn_14_0 = null;
        int stackIn_23_0 = 0;
        q stackIn_28_0 = null;
        q stackIn_41_0 = null;
        q stackIn_46_0 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_4_0 = ai.field_a;
            return stackIn_4_0;
          }
          if (param1 != 5507) {
            field_a = -60;
          }
          if (var2_int > 64) {
            stackIn_10_0 = rd.field_d;
            return stackIn_10_0;
          }
          if (param0.charAt(0) == 34) {
            if (param0.charAt(var2_int - 1) != 34) {
              stackIn_14_0 = vc.field_N;
              return stackIn_14_0;
            }
            var3 = 0;
            for (var4 = 1; var4 < -1 + var2_int; var4++) {
              var5 = param0.charAt(var4);
              if (92 == var5) {
                stackIn_23_0 = (var3 != 0) ? 0 : 1;
                var3 = stackIn_23_0;
              } else {
                if (var5 == 34 &&
                  var3 == 0) {
                  stackIn_28_0 = vc.field_N;
                  return stackIn_28_0;
                }
                var3 = 0;
              }
            }
            return null;
          }
          var3Lifetime1 = 0;
          for (var4Lifetime1 = 0; var2_int > var4Lifetime1; var4Lifetime1++) {
            boolean decompiledFrameRemainder0 = true;
            var5Lifetime1 = param0.charAt(var4Lifetime1);
            if (46 == var5Lifetime1) {
              if (0 != var4Lifetime1 &&
                var4Lifetime1 != var2_int - 1 &&
                var3Lifetime1 == 0) {
                var3Lifetime1 = 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                stackIn_41_0 = vc.field_N;
                return stackIn_41_0;
              }
            }
            if (decompiledFrameRemainder0) {
              if (-1 == nb.field_c.indexOf(var5Lifetime1)) {
                stackIn_46_0 = vc.field_N;
                return stackIn_46_0;
              }
              var3Lifetime1 = 0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_52_0 = var2;
          stackIn_52_1 = new StringBuilder().append("lb.A(");
          if (param0 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_52_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_b = 0L;
        field_f = new qj();
        field_a = 256;
        field_e = new hi();
        field_i = 0;
        field_g = new int[][]{new int[]{0, 0, 640, 480}};
    }
}
