/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh {
    static rj field_b;
    static int field_a;
    static int[] field_d;
    static int[][] field_c;
    static aa field_e;
    static long field_f;

    final static ge[] a(int param0, lj param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        String var6 = null;
        ge[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param1.a(param3, -80);
          if (param0 <= 27) {
            var6 = (String) null;
            mh.a((String) null, (byte) -125, 0.009368140250444412f);
          }
          var5 = param1.a(var4_int, param2, (byte) 85);
          stackIn_3_0 = m.a(param1, var4_int, (byte) 6, var5);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("mh.B(").append(param0).append(',');
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
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(String param0, byte param1, float param2) {
        bg.field_G = param2;
        if (param1 != -125) {
          return;
        }
        try {
          sa.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "mh.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, byte[] param1, int[] param2, int param3, boolean param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        byte dupTemp$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param4) {
            field_e = (aa) null;
          }
          var5_int = 0;
          while (true) {
            if (vf.field_b.length <= var5_int) {
              return;
            }
            param3 = vf.field_b[var5_int];
            var6 = var5_int << 4;
            while (true) {
              incrementValue$0 = param3;
              param3--;
              if (incrementValue$0 == 0) {
                var5_int++;
                break;
              }
              incrementValue$1 = var6;
              var6++;
              param0 = k.field_e[incrementValue$1];
              dupTemp$2 = param1[param0];
              dupTemp$3 = param2[dupTemp$2];
              param2[dupTemp$2] = dupTemp$3 + 1;
              k.field_e[dupTemp$3] = param0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("mh.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static boolean a(String param0, boolean param1, String param2) {
        RuntimeException var3 = null;
        String var4 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (li.a((byte) -82, param2)) {
            return false;
          }
          if (qf.a(-8503, param2)) {
            return false;
          }
          if (gi.a((byte) 57, param2)) {
            return false;
          }
          if (param0.length() == 0) {
            return true;
          }
          if (kc.a(param0, (byte) -52, param2)) {
            return false;
          }
          if (!param1) {
            var4 = (String) null;
            mh.a(66, (lj) null, (String) null, (String) null);
          }
          if (bc.a((byte) -128, param2, param0)) {
            return false;
          }
          if (!ja.a(param2, 119, param0)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("mh.D(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        field_e = null;
        int var1 = -79 % ((param0 - 6) / 35);
        field_c = (int[][]) null;
    }

    static {
        field_b = new rj();
        field_d = new int[5];
        field_c = new int[][]{new int[]{15, 15, 15}, new int[]{10, 10, 10}, new int[]{5, 10, 15}, new int[]{50, 50, 50}, new int[]{5, 5, 5}, new int[]{20, 20, 60}, new int[]{0, 0, 0}, new int[]{0, 0, 0}, new int[]{0}, new int[]{0}};
    }
}
