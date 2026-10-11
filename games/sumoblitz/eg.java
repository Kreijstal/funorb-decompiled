/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg extends ms {
    boolean field_o;
    static an field_l;
    int field_k;
    static String field_n;
    int[] field_m;

    public static void c(boolean param0) {
        field_n = null;
        field_l = null;
        if (param0) {
          field_n = (String) null;
        }
    }

    eg() {
        this.field_o = false;
    }

    final static void a(int param0, byte[] param1) {
        byte dupTemp$1 = 0;
        byte dupTemp$0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_1 = 0;
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
        fs var16 = null;
        fs var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        int var12Lifetime1;
        int var12Lifetime2;
        int var13Lifetime1;
        int var13Lifetime2;
        int var12Lifetime3;
        var15 = Sumoblitz.field_L ? 1 : 0;
        try {
          var16 = new fs(param1);
          var17 = var16;
          var17.field_p = -2 + param1.length;
          rl.field_n = var17.a(255);
          vg.field_k = new int[rl.field_n];
          we.field_B = new int[rl.field_n];
          og.field_d = new boolean[rl.field_n];
          ag.field_d = new byte[rl.field_n][];
          av.field_C = new int[rl.field_n];
          er.field_h = new int[rl.field_n];
          fl.field_o = new byte[rl.field_n][];
          var17.field_p = -(rl.field_n * 8) - 7 + param1.length;
          vf.field_d = var17.a(param0);
          li.field_u = var17.a(255);
          var3 = 1 + (var17.e(param0 - 31557) & 255);
          for (var4 = 0; var4 < rl.field_n; var4++) {
            er.field_h[var4] = var16.a(255);
          }
          for (var4Lifetime1 = 0; rl.field_n > var4Lifetime1; var4Lifetime1++) {
            av.field_C[var4Lifetime1] = var17.a(255);
          }
          for (var4Lifetime2 = 0; rl.field_n > var4Lifetime2; var4Lifetime2++) {
            vg.field_k[var4Lifetime2] = var17.a(255);
          }
          for (var4Lifetime3 = 0; var4Lifetime3 < rl.field_n; var4Lifetime3++) {
            we.field_B[var4Lifetime3] = var17.a(jg.a(param0, 0));
          }
          var17.field_p = -(8 * rl.field_n) + (-7 + param1.length - (-1 + var3) * 3);
          iv.field_l = new int[var3];
          for (var4Lifetime4 = 1; var3 > var4Lifetime4; var4Lifetime4++) {
            iv.field_l[var4Lifetime4] = var17.c((byte) 121);
            if (iv.field_l[var4Lifetime4] == 0) {
              iv.field_l[var4Lifetime4] = 1;
            }
          }
          var17.field_p = 0;
          for (var4Lifetime5 = 0; var4Lifetime5 < rl.field_n; var4Lifetime5++) {
            L6: {
              var5 = vg.field_k[var4Lifetime5];
              var6 = we.field_B[var4Lifetime5];
              var7 = var6 * var5;
              var20 = new byte[var7];
              var18 = var20;
              var8 = var18;
              ag.field_d[var4Lifetime5] = var20;
              var21 = new byte[var7];
              var19 = var21;
              var9 = var19;
              fl.field_o[var4Lifetime5] = var21;
              var10 = 0;
              var11 = var17.e(param0 - 31557);
              if ((var11 & 1) == 0) {
                for (var12 = 0; var7 > var12; var12++) {
                  var8[var12] = var17.d(true);
                }
                if ((0 != (2 & var11))) {
                  for (var12Lifetime3 = 0; var7 > var12Lifetime3; var12Lifetime3++) {
                    dupTemp$1 = var17.d(true);
                    var9[var12Lifetime3] = dupTemp$1;
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
                break L6;
              }
              var12Lifetime1 = 0;
              while (var5 > var12Lifetime1) {
                var13Lifetime1 = 0;
                while (true) {
                  stackIn_37_0 = ~var6;
                  stackIn_37_1 = ~var13Lifetime1;
                  if (stackIn_37_0 >= stackIn_37_1) {
                    var12Lifetime1++;
                    break;
                  }
                  var8[var12Lifetime1 + var5 * var13Lifetime1] = var17.d(true);
                  var13Lifetime1++;
                }
              }
              if ((2 & var11) != 0) {
                for (var12Lifetime2 = 0; var12Lifetime2 < var5; var12Lifetime2++) {
                  for (var13Lifetime2 = 0; var6 > var13Lifetime2; var13Lifetime2++) {
                    dupTemp$0 = var17.d(true);
                    var9[var5 * var13Lifetime2 + var12Lifetime2] = dupTemp$0;
                    var14 = dupTemp$0;
                    stackIn_48_0 = var10;
                    if (-1 == var14) {
                      stackIn_49_1 = 0;
                    } else {
                      stackIn_49_1 = 1;
                    }
                    var10 = stackIn_48_0 | stackIn_49_1;
                  }
                }
              }
            }
            og.field_d[var4Lifetime5] = var10 != 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_55_0 = var2;
          stackIn_55_1 = new StringBuilder().append("eg.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(')').toString());
        }
    }

    static {
        field_n = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
    }
}
