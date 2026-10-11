/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc {
    static boolean field_d;
    static int field_b;
    static String field_c;
    static int field_a;
    static cr field_e;
    static double field_g;
    static int field_f;

    final static void a(int param0, byte[] param1) {
        byte dupTemp$1 = 0;
        byte dupTemp$0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_51_1 = 0;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_58_2 = null;
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
        ed var16 = null;
        ed var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        var15 = Vertigo2.field_L ? 1 : 0;
        try {
          var16 = new ed(param1);
          var17 = var16;
          var17.field_u = -2 + param1.length;
          eo.field_m = var17.a((byte) -11);
          vi.field_w = new int[eo.field_m];
          vl.field_j = new boolean[eo.field_m];
          pc.field_a = new int[eo.field_m];
          mh.field_c = new int[eo.field_m];
          ca.field_a = new int[eo.field_m];
          ej.field_c = new byte[eo.field_m][];
          se.field_y = new byte[eo.field_m][];
          var17.field_u = param1.length - 7 - eo.field_m * 8;
          ql.field_M = var17.a((byte) -11);
          vj.field_c = var17.a((byte) -11);
          var3 = (var17.h(-11) & 255) + 1;
          for (var4 = 0; eo.field_m > var4; var4++) {
            ca.field_a[var4] = var16.a((byte) -11);
          }
          for (var4Lifetime1 = 0; var4Lifetime1 < eo.field_m; var4Lifetime1++) {
            pc.field_a[var4Lifetime1] = var17.a((byte) -11);
          }
          for (var4Lifetime2 = 0; eo.field_m > var4Lifetime2; var4Lifetime2++) {
            mh.field_c[var4Lifetime2] = var17.a((byte) -11);
          }
          for (var4Lifetime3 = 0; eo.field_m > var4Lifetime3; var4Lifetime3++) {
            vi.field_w[var4Lifetime3] = var17.a((byte) -11);
          }
          var17.field_u = -(3 * (var3 - 1)) + (param1.length - 7 - eo.field_m * 8);
          in.field_c = new int[var3];
          for (var4Lifetime4 = 1; var3 > var4Lifetime4; var4Lifetime4++) {
            in.field_c[var4Lifetime4] = var17.m(0);
            if (in.field_c[var4Lifetime4] == 0) {
              in.field_c[var4Lifetime4] = 1;
            }
          }
          if (param0 <= 52) {
            return;
          }
          var17.field_u = 0;
          for (var4Lifetime5 = 0; var4Lifetime5 < eo.field_m; var4Lifetime5++) {
            var5 = mh.field_c[var4Lifetime5];
            var6 = vi.field_w[var4Lifetime5];
            var7 = var6 * var5;
            var20 = new byte[var7];
            var18 = var20;
            var8 = var18;
            se.field_y[var4Lifetime5] = var20;
            var21 = new byte[var7];
            var19 = var21;
            var9 = var19;
            ej.field_c[var4Lifetime5] = var21;
            var10 = 0;
            var11 = var17.h(-11);
            stackIn_24_0 = 0;
            stackIn_24_1 = var11 & 1;
            if (stackIn_24_0 == stackIn_24_1) {
              for (var12 = 0; var7 > var12; var12++) {
                var8[var12] = var17.g(97);
              }
              if ((var11 & 2) != 0) {
                for (var12 = 0; var7 > var12; var12++) {
                  dupTemp$1 = var17.g(102);
                  var9[var12] = dupTemp$1;
                  var13 = dupTemp$1;
                  stackIn_34_0 = var10;
                  if (var13 == -1) {
                    stackIn_35_1 = 0;
                  } else {
                    stackIn_35_1 = 1;
                  }
                  var10 = stackIn_34_0 | stackIn_35_1;
                }
              }
            } else {
              for (var12 = 0; var5 > var12; var12++) {
                for (var13 = 0; var13 < var6; var13++) {
                  var8[var13 * var5 + var12] = var17.g(106);
                }
              }
              if ((2 & var11) != 0) {
                for (var12 = 0; var12 < var5; var12++) {
                  for (var13 = 0; var13 < var6; var13++) {
                    dupTemp$0 = var17.g(112);
                    var9[var12 + var5 * var13] = dupTemp$0;
                    var14 = dupTemp$0;
                    stackIn_50_0 = var10;
                    if (var14 == -1) {
                      stackIn_51_1 = 0;
                    } else {
                      stackIn_51_1 = 1;
                    }
                    var10 = stackIn_50_0 | stackIn_51_1;
                  }
                }
              }
            }
            vl.field_j[var4Lifetime5] = var10 != 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_57_0 = var2;
          stackIn_57_1 = new StringBuilder().append("lc.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_58_2 = "null";
          } else {
            stackIn_58_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_57_0), ((StringBuilder) (Object) stackIn_57_1).append(stackIn_58_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 30015) {
          field_e = (cr) null;
        }
        field_e = null;
    }

    static {
        field_f = -1;
        field_c = "Waiting for sound effects";
    }
}
