/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf {
    static String field_a;
    static double field_c;
    static String field_b;

    final static void a(int param0, byte[] param1) {
        byte dupTemp$1 = 0;
        byte dupTemp$0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_48_1 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        fj var16 = null;
        fj var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        var15 = Torquing.field_u;
        try {
          var16 = new fj(param1);
          var17 = var16;
          var17.field_n = -2 + param1.length;
          ti.field_g = var17.i(7088);
          fq.field_G = new byte[ti.field_g][];
          fj.field_o = new int[ti.field_g];
          ij.field_o = new int[ti.field_g];
          pn.field_b = new byte[ti.field_g][];
          na.field_G = new int[ti.field_g];
          lp.field_e = new boolean[ti.field_g];
          vo.field_b = new int[ti.field_g];
          var17.field_n = -(8 * ti.field_g) - 7 + param1.length;
          fm.field_E = var17.i(7088);
          rh.field_d = var17.i(7088);
          var3 = (255 & var17.i((byte) -101)) + 1;
          if (param0 < 101) {
            return;
          }
          for (var4 = 0; ti.field_g > var4; var4++) {
            fj.field_o[var4] = var16.i(7088);
          }
          for (var4Lifetime1 = 0; var4Lifetime1 < ti.field_g; var4Lifetime1++) {
            na.field_G[var4Lifetime1] = var17.i(7088);
          }
          for (var4Lifetime2 = 0; ti.field_g > var4Lifetime2; var4Lifetime2++) {
            vo.field_b[var4Lifetime2] = var17.i(7088);
          }
          for (var4Lifetime3 = 0; ti.field_g > var4Lifetime3; var4Lifetime3++) {
            ij.field_o[var4Lifetime3] = var17.i(7088);
          }
          var17.field_n = param1.length - (7 + ti.field_g * 8 + 3 * (-1 + var3));
          cq.field_y = new int[var3];
          for (var4Lifetime4 = 1; var4Lifetime4 < var3; var4Lifetime4++) {
            cq.field_y[var4Lifetime4] = var17.e((byte) 62);
            if (cq.field_y[var4Lifetime4] == 0) {
              cq.field_y[var4Lifetime4] = 1;
            }
          }
          var17.field_n = 0;
          for (var4Lifetime5 = 0; ti.field_g > var4Lifetime5; var4Lifetime5++) {
            var5 = vo.field_b[var4Lifetime5];
            var6 = ij.field_o[var4Lifetime5];
            var7 = var6 * var5;
            var20 = new byte[var7];
            var18 = var20;
            var8 = var18;
            pn.field_b[var4Lifetime5] = var20;
            var21 = new byte[var7];
            var19 = var21;
            var9 = var19;
            fq.field_G[var4Lifetime5] = var21;
            var10 = 0;
            var11 = var17.i((byte) -101);
            if ((1 & var11) == 0) {
              for (var12 = 0; var7 > var12; var12++) {
                var8[var12] = var17.f((byte) 88);
              }
              if ((2 & var11) != 0) {
                for (var12 = 0; var12 < var7; var12++) {
                  dupTemp$1 = var17.f((byte) 80);
                  var9[var12] = dupTemp$1;
                  var13 = dupTemp$1;
                  stackIn_32_0 = var10;
                  if (var13 == -1) {
                    stackIn_33_1 = 0;
                  } else {
                    stackIn_33_1 = 1;
                  }
                  var10 = stackIn_32_0 | stackIn_33_1;
                }
              }
            } else {
              for (var12 = 0; var5 > var12; var12++) {
                for (var13 = 0; var13 < var6; var13++) {
                  var8[var5 * var13 + var12] = var17.f((byte) 103);
                }
              }
              if (0 != (var11 & 2)) {
                for (var12 = 0; var12 < var5; var12++) {
                  for (var13 = 0; var6 > var13; var13++) {
                    dupTemp$0 = var17.f((byte) 61);
                    var9[var5 * var13 + var12] = dupTemp$0;
                    var14 = dupTemp$0;
                    stackIn_47_0 = var10;
                    if (var14 == -1) {
                      stackIn_48_1 = 0;
                    } else {
                      stackIn_48_1 = 1;
                    }
                    var10 = stackIn_47_0 | stackIn_48_1;
                  }
                }
              }
            }
            lp.field_e[var4Lifetime5] = var10 != 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_54_0 = var2;
          stackIn_54_1 = new StringBuilder().append("tf.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_54_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(')').toString());
        }
    }

    final static String a(boolean param0, int param1, boolean param2, boolean param3) {
        int var4 = param1;
        if (param3) {
          var4 += 4;
        }
        if (param0) {
          var4 += 2;
        }
        if (param2) {
          var4++;
        }
        return n.field_s[var4];
    }

    final static void a(int param0, java.awt.Canvas param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 >= -44) {
            return;
          }
          og.a((java.awt.Component) ((Object) param1), -1);
          qk.a(-90, (java.awt.Component) ((Object) param1));
          if (null != wb.field_u) {
            wb.field_u.a(0, (java.awt.Component) ((Object) param1));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("tf.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        if (param0 <= 52) {
          java.awt.Canvas var2 = (java.awt.Canvas) null;
          tf.a(37, (java.awt.Canvas) null);
        }
    }

    static {
        field_a = "Waiting for music";
        field_b = "Visit the Account Management section on the main site to view.";
    }
}
