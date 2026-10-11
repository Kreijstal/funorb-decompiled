/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih {
    private static String[] field_a;
    static int field_c;
    static String field_b;

    final static ut[] a(int param0, int param1, int param2) {
        if (param1 != 0) {
          return (ut[]) null;
        }
        return cq.a(1, param2, param0, 124);
    }

    final static boolean a(CharSequence param0, boolean param1) {
        RuntimeException var2 = null;
        nu var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            var3 = (nu) null;
            ih.a(28, (nu) null, 23);
          }
          stackIn_3_0 = gv.a(false, param0, 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ih.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 66049) {
          return;
        }
        field_b = null;
    }

    final static void a(int param0, nu param1, int param2) {
        int var4 = 0;
        int[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        eg var8 = null;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_6_2 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var9 = Kickabout.field_G;
        try {
          jo.field_F = param1;
          k.field_g = param2;
          if (param0 != -3) {
            return;
          }
          var12 = new int[2];
          var11 = var12;
          var10 = var11;
          var3 = var10;
          stackIn_5_0 = var10;
          stackIn_5_1 = 0;
          if (k.field_g == 1) {
            stackIn_6_2 = 148;
          } else {
            stackIn_6_2 = 1900;
          }
          stackIn_5_0[stackIn_5_1] = stackIn_6_2;
          nb.field_j = new ut[2];
          var10[1] = -var12[0] + 2048;
          for (var4 = 0; var4 < 2; var4++) {
            var5 = jo.field_F.field_H[var4];
            var6 = jo.field_F.field_d[var4];
            var7 = jo.field_F.field_Q[var4];
            var8 = df.a(var5, ev.field_B[var7], true, ev.field_B[var6]).b(100, 4369, 20, -56, -20);
            nb.field_j[var4] = new ut(200, 200);
            iw.a(param0 - 124, nb.field_j[var4]);
            t.c();
            t.b(on.field_g >> 1, 410);
            var8.a(0, var12[var4], 0, 0, 0, 0, 0, 350);
            ta.e(127);
            eo.a(nb.field_j[var4], 65793);
            eo.a(nb.field_j[var4], 66049);
            eo.a(nb.field_j[var4], 65793);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("ih.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean[][][] a(int param0, String param1) {
        int var4 = 0;
        int var6 = 0;
        boolean[][][] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var5 = 0;
        int var7 = 0;
        boolean[][][] var8 = null;
        int stackIn_7_0 = 0;
        boolean[][][] stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = new boolean[2][13][10];
          var2 = var8;
          var3 = 0;
          for (var4 = 0; var4 < param1.length(); var4++) {
            var5 = Integer.parseInt(param1.substring(var4, var4 + 1), 16);
            for (var6 = 0; 4 > var6; var6++) {
              stackIn_7_0 = ((var5 & 1 << var6) == 0) ? 0 : 1;
              var7 = stackIn_7_0;
              var8[var3 / 130][var3 % 130 / 10][var3 % 130 % 10] = var7 != 0;
              var3++;
            }
          }
          if (param0 != 21656) {
            field_c = 22;
          }
          stackIn_12_0 = var2;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_15_0 = var2_ref;
          stackIn_15_1 = new StringBuilder().append("ih.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_b = "Unable to connect to the data server. Please check any firewall you are using.";
        field_a = new String[4];
        field_c = -1;
        field_a[2] = "bigticktime";
        field_a[0] = "info";
        field_a[3] = "mainlooptime";
        field_a[1] = "quickticktime";
    }
}
