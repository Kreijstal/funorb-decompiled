/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m extends ji {
    static int field_B;
    static int field_A;
    static String[] field_y;
    static r field_z;

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9_ref_int__ = null;
        int var9 = 0;
        int[] var10_ref_int__ = null;
        int var10 = 0;
        int var11_int = 0;
        int[] var11 = null;
        int var12_int = 0;
        int[] var12 = null;
        int var13 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var13 = Vertigo2.field_L ? 1 : 0;
        try {
          var5_int = 0;
          var6 = param1;
          var7 = -param1;
          ki.a(-126, -param1 + param4, vl.field_e[param0], param1 + param4, param3);
          if (param2 != -78) {
            m.h(-101);
          }
          var8 = -1;
          while (var6 > var5_int) {
            var8 += 2;
            var7 = var7 + var8;
            var5_int++;
            if (0 <= var7) {
              var6--;
              var7 = var7 - (var6 << 1);
              var9_ref_int__ = vl.field_e[var6 + param0];
              var10_ref_int__ = vl.field_e[param0 - var6];
              var11_int = param4 + var5_int;
              var12_int = -var5_int + param4;
              ki.a(-107, var12_int, var9_ref_int__, var11_int, param3);
              ki.a(param2 - 7, var12_int, var10_ref_int__, var11_int, param3);
            }
            var9 = var6 + param4;
            var10 = param4 - var6;
            var11 = vl.field_e[param0 + var5_int];
            var12 = vl.field_e[param0 - var5_int];
            ki.a(-85, var10, var11, var9, param3);
            ki.a(-100, var10, var12, var9, param3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var5), "m.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void d(int param0, int param1, int param2) {
        tk.a(-1, param2, param2, (double)param1, (double)param1);
        if (param0 <= 80) {
          m.d(-49, -25, 24);
        }
    }

    public m() {
        super(1, true);
    }

    public static void g(int param0) {
        field_y = null;
        field_z = null;
        if (param0 != 2) {
          byte[] var2 = (byte[]) null;
          m.a((byte[]) null, 85);
        }
    }

    final int[] c(int param0, int param1) {
        int[][] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int var8 = 0;
        int var9 = Vertigo2.field_L ? 1 : 0;
        if (param1 <= 91) {
          return (int[]) null;
        }
        int[] var10 = this.field_x.a(param0, (byte) -45);
        int[] var3 = var10;
        if (this.field_x.field_i) {
          var4 = this.c(0, 3, param0);
          var5 = var4[0];
          var6 = var4[1];
          var7 = var4[2];
          for (var8 = 0; we.field_M > var8; var8++) {
            var10[var8] = (var7[var8] + (var5[var8] + var6[var8])) / 3;
          }
          return var3;
        }
        return var3;
    }

    final static co a(byte[] param0, int param1) {
        co var2 = null;
        RuntimeException var2_ref = null;
        co stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            return null;
          }
          if (param1 != 0) {
            field_B = -85;
          }
          var2 = new co(param0, ca.field_a, pc.field_a, mh.field_c, vi.field_w, se.field_y);
          la.a((byte) 113);
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("m.B(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean h(int param0) {
        int var1 = 23 % ((-79 - param0) / 37);
        if (!sl.b(-24)) {
          return false;
        }
        if ((8 & rg.field_f) == 0) {
          return true;
        }
        return false;
    }

    static {
        field_y = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_A = -1;
    }
}
