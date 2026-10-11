/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rn {
    static lg field_b;
    static String field_a;

    final static void a(byte[] param0, int param1) {
        byte dupTemp$1 = 0;
        byte dupTemp$0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_46_0 = 0;
        int stackIn_47_1 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
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
        de var16 = null;
        de var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        var15 = ZombieDawn.field_J;
        try {
          var16 = new de(param0);
          var17 = var16;
          var17.field_j = -2 + param0.length;
          t.field_h = var17.f(param1 + 2);
          bn.field_c = new int[t.field_h];
          uf.field_n = new int[t.field_h];
          sl.field_d = new int[t.field_h];
          ka.field_f = new byte[t.field_h][];
          vj.field_m = new byte[t.field_h][];
          jc.field_r = new boolean[t.field_h];
          bo.field_o = new int[t.field_h];
          var17.field_j = -7 + (param0.length - t.field_h * 8);
          gl.field_F = var17.f(2);
          kd.field_pb = var17.f(2);
          var3 = (255 & var17.d((byte) -125)) + 1;
          for (var4 = 0; var4 < t.field_h; var4++) {
            sl.field_d[var4] = var16.f(2);
          }
          for (var4Lifetime1 = 0; t.field_h > var4Lifetime1; var4Lifetime1++) {
            bo.field_o[var4Lifetime1] = var17.f(2);
          }
          for (var4Lifetime2 = 0; var4Lifetime2 < t.field_h; var4Lifetime2++) {
            bn.field_c[var4Lifetime2] = var17.f(2);
          }
          for (var4Lifetime3 = param1; t.field_h > var4Lifetime3; var4Lifetime3++) {
            uf.field_n[var4Lifetime3] = var17.f(2);
          }
          var17.field_j = -(t.field_h * 8) - 7 + param0.length - (var3 - 1) * 3;
          j.field_a = new int[var3];
          for (var4Lifetime4 = 1; var3 > var4Lifetime4; var4Lifetime4++) {
            j.field_a[var4Lifetime4] = var17.g(-1875);
            if (j.field_a[var4Lifetime4] == 0) {
              j.field_a[var4Lifetime4] = 1;
            }
          }
          var17.field_j = 0;
          for (var4Lifetime5 = 0; var4Lifetime5 < t.field_h; var4Lifetime5++) {
            var5 = bn.field_c[var4Lifetime5];
            var6 = uf.field_n[var4Lifetime5];
            var7 = var6 * var5;
            var20 = new byte[var7];
            var18 = var20;
            var8 = var18;
            vj.field_m[var4Lifetime5] = var20;
            var21 = new byte[var7];
            var19 = var21;
            var9 = var19;
            ka.field_f[var4Lifetime5] = var21;
            var10 = 0;
            var11 = var17.d((byte) -115);
            if ((1 & var11) == 0) {
              for (var12 = 0; var7 > var12; var12++) {
                var8[var12] = var17.e((byte) 116);
              }
              if ((var11 & 2) != 0) {
                for (var12 = 0; var7 > var12; var12++) {
                  dupTemp$1 = var17.e((byte) 116);
                  var9[var12] = dupTemp$1;
                  var13 = dupTemp$1;
                  stackIn_30_0 = var10;
                  if (var13 == -1) {
                    stackIn_31_1 = 0;
                  } else {
                    stackIn_31_1 = 1;
                  }
                  var10 = stackIn_30_0 | stackIn_31_1;
                }
              }
            } else {
              for (var12 = 0; var5 > var12; var12++) {
                for (var13 = 0; var13 < var6; var13++) {
                  var8[var13 * var5 + var12] = var17.e((byte) 116);
                }
              }
              if ((var11 & 2) != 0) {
                for (var12 = 0; var5 > var12; var12++) {
                  for (var13 = 0; var13 < var6; var13++) {
                    dupTemp$0 = var17.e((byte) 116);
                    var9[var13 * var5 + var12] = dupTemp$0;
                    var14 = dupTemp$0;
                    stackIn_46_0 = var10;
                    if (-1 == var14) {
                      stackIn_47_1 = 0;
                    } else {
                      stackIn_47_1 = 1;
                    }
                    var10 = stackIn_46_0 | stackIn_47_1;
                  }
                }
              }
            }
            jc.field_r[var4Lifetime5] = var10 != 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_53_0 = var2;
          stackIn_53_1 = new StringBuilder().append("rn.B(");
          if (param0 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != -12637) {
          byte[] var2 = (byte[]) null;
          rn.a((byte[]) null, -33);
        }
    }

    static {
        field_a = "Create a free account to start using this feature";
        field_b = null;
    }
}
