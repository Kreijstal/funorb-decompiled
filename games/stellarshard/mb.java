/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb {
    static String field_c;
    static oj field_b;
    static String field_a;

    final static void a(int param0, byte[] param1) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_50_1 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
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
        ka var16 = null;
        ka var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        var15 = stellarshard.field_B;
        try {
          var16 = new ka(param1);
          var17 = var16;
          var17.field_k = -2 + param1.length;
          sb.field_b = var17.c((byte) 40);
          ih.field_d = new int[sb.field_b];
          ih.field_b = new byte[sb.field_b][];
          vc.field_b = new int[sb.field_b];
          lj.field_D = new byte[sb.field_b][];
          ak.field_c = new int[sb.field_b];
          sk.field_c = new boolean[sb.field_b];
          vi.field_c = new int[sb.field_b];
          var17.field_k = param1.length + (-7 - sb.field_b * 8);
          nc.field_G = var17.c((byte) 86);
          wd.field_b = var17.c((byte) 39);
          var3 = 1 + (var17.f(4) & 255);
          for (var4 = 0; sb.field_b > var4; var4++) {
            ak.field_c[var4] = var16.c((byte) 30);
          }
          for (var4Lifetime1 = 0; sb.field_b > var4Lifetime1; var4Lifetime1++) {
            vi.field_c[var4Lifetime1] = var17.c((byte) 95);
          }
          for (var4Lifetime2 = 0; sb.field_b > var4Lifetime2; var4Lifetime2++) {
            vc.field_b[var4Lifetime2] = var17.c((byte) 30);
          }
          for (var4Lifetime3 = 0; var4Lifetime3 < sb.field_b; var4Lifetime3++) {
            ih.field_d[var4Lifetime3] = var17.c((byte) 83);
          }
          var17.field_k = -(3 * (-1 + var3)) + param1.length + (-7 - sb.field_b * 8);
          gj.field_w = new int[var3];
          for (var4Lifetime4 = 1; var3 > var4Lifetime4; var4Lifetime4++) {
            gj.field_w[var4Lifetime4] = var17.c(true);
            if (gj.field_w[var4Lifetime4] == 0) {
              gj.field_w[var4Lifetime4] = 1;
            }
          }
          var17.field_k = param0;
          for (var4Lifetime5 = 0; sb.field_b > var4Lifetime5; var4Lifetime5++) {
            var5 = vc.field_b[var4Lifetime5];
            var6 = ih.field_d[var4Lifetime5];
            var7 = var6 * var5;
            var20 = new byte[var7];
            var18 = var20;
            var8 = var18;
            ih.field_b[var4Lifetime5] = var20;
            var21 = new byte[var7];
            var19 = var21;
            var9 = var19;
            lj.field_D[var4Lifetime5] = var21;
            var10 = 0;
            var11 = var17.f(4);
            stackIn_22_0 = 0;
            stackIn_22_1 = 1 & var11;
            if (stackIn_22_0 == stackIn_22_1) {
              for (var12 = 0; var12 < var7; var12++) {
                var8[var12] = var17.g(110);
              }
              if ((2 & var11) != 0) {
                for (var12 = 0; var7 > var12; var12++) {
                  dupTemp$0 = var17.g(-81);
                  var9[var12] = dupTemp$0;
                  var13 = dupTemp$0;
                  stackIn_49_0 = var10;
                  if (var13 == -1) {
                    stackIn_50_1 = 0;
                  } else {
                    stackIn_50_1 = 1;
                  }
                  var10 = stackIn_49_0 | stackIn_50_1;
                }
              }
            } else {
              for (var12 = 0; var5 > var12; var12++) {
                for (var13 = 0; var13 < var6; var13++) {
                  var8[var13 * var5 + var12] = var17.g(-62);
                }
              }
              if ((2 & var11) != 0) {
                for (var12 = 0; var12 < var5; var12++) {
                  for (var13 = 0; var13 < var6; var13++) {
                    dupTemp$1 = var17.g(ih.a(param0, 102));
                    var9[var12 + var13 * var5] = dupTemp$1;
                    var14 = dupTemp$1;
                    stackIn_37_0 = var10;
                    if (var14 == -1) {
                      stackIn_38_1 = 0;
                    } else {
                      stackIn_38_1 = 1;
                    }
                    var10 = stackIn_37_0 | stackIn_38_1;
                  }
                }
              }
            }
            sk.field_c[var4Lifetime5] = var10 != 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_55_0 = var2;
          stackIn_55_1 = new StringBuilder().append("mb.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0) {
          field_a = (String) null;
        }
    }

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (param1 < 108) {
            field_a = (String) null;
          }
          param2 = ci.a(param2, '_', "", 2619);
          var3 = la.a(param2, (byte) 79);
          stackIn_7_0 = (param0.indexOf(param2) != -1) || (-1 != param0.indexOf(var3));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("mb.C(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        field_c = "Waiting for fonts";
        field_b = new oj();
        field_a = "Account created successfully!";
    }
}
