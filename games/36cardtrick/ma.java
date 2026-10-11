/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma {
    static boolean[] field_a;
    static String field_b;
    static String[] field_d;
    static int field_c;

    final static kc[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, byte param8) {
        int var14 = 0;
        int var9;
        kc[] var10;
        kc[] var11_ref_kc__;
        int var11;
        int var12;
        kc var13;
        int var15;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        kc[] var10Lifetime1;
        var15 = Main.field_T;
        var9 = param3 + param1 + param6;
        var10 = new kc[]{new kc(var9, var9), new kc(param4, var9), new kc(var9, var9), new kc(var9, param4), new kc(64, 64), new kc(var9, param4), new kc(var9, var9), new kc(param4, var9), new kc(var9, var9)};
        var11_ref_kc__ = var10;
        for (var12 = 0; var12 < var11_ref_kc__.length; var12++) {
          var13 = var11_ref_kc__[var12];
          for (var14 = 0; var13.field_r.length > var14; var14++) {
            var13.field_r[var14] = param2;
          }
        }
        var10Lifetime1 = var11_ref_kc__;
        for (var11 = 0; param1 > var11; var11++) {
          for (var12Lifetime1 = 0; var9 > var12Lifetime1; var12Lifetime1++) {
            var10Lifetime1[6].field_r[(var9 - var11 - 1) * var9 + var12Lifetime1] = param0;
            var10Lifetime1[8].field_r[(-1 + (-var11 + var9)) * var9 + var12Lifetime1] = param0;
            var10Lifetime1[2].field_r[-1 - (-var9 + var11 - var9 * var12Lifetime1)] = param0;
            var10Lifetime1[8].field_r[var9 * var12Lifetime1 - var11 - (1 - var9)] = param0;
          }
        }
        if (param8 >= -12) {
          field_d = (String[]) null;
        }
        for (var11Lifetime1 = 0; var11Lifetime1 < param1; var11Lifetime1++) {
          for (var12Lifetime2 = 0; var12Lifetime2 < var9; var12Lifetime2++) {
            var10Lifetime1[0].field_r[var12Lifetime2 + var11Lifetime1 * var9] = param7;
            var10Lifetime1[0].field_r[var9 * var12Lifetime2 + var11Lifetime1] = param7;
            if (var9 - var11Lifetime1 > var12Lifetime2) {
              var10Lifetime1[2].field_r[var12Lifetime2 + var11Lifetime1 * var9] = param7;
              var10Lifetime1[6].field_r[var12Lifetime2 * var9 + var11Lifetime1] = param7;
            }
          }
        }
        for (var11Lifetime2 = 0; param4 > var11Lifetime2; var11Lifetime2++) {
          for (var12Lifetime3 = 0; param1 > var12Lifetime3; var12Lifetime3++) {
            var10Lifetime1[7].field_r[(-1 + (var9 - var12Lifetime3)) * param4 + var11Lifetime2] = param0;
            var10Lifetime1[5].field_r[-var12Lifetime3 + var9 + (-1 + var11Lifetime2 * var9)] = param0;
            var10Lifetime1[1].field_r[var11Lifetime2 + var12Lifetime3 * param4] = param7;
            var10Lifetime1[3].field_r[var12Lifetime3 + var11Lifetime2 * var9] = param7;
          }
        }
        for (var11Lifetime3 = 0; var11Lifetime3 < param4 >> 1; var11Lifetime3++) {
          for (var12Lifetime4 = 0; param3 > var12Lifetime4; var12Lifetime4++) {
            var10Lifetime1[1].field_r[(var9 + (-var12Lifetime4 - 1)) * param4 + var11Lifetime3] = param5;
            var10Lifetime1[3].field_r[var9 * var11Lifetime3 - (var12Lifetime4 + (1 - var9))] = param5;
            var10Lifetime1[7].field_r[var12Lifetime4 * param4 + var11Lifetime3] = param5;
            var10Lifetime1[5].field_r[var9 * var11Lifetime3 + var12Lifetime4] = param5;
          }
        }
        return var10Lifetime1;
    }

    final static qa a(java.applet.Applet param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        qa[] var3 = null;
        int var4 = 0;
        qa var5 = null;
        int var6 = 0;
        qa stackIn_4_0 = null;
        qa stackIn_9_0 = null;
        qa stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Main.field_T;
        try {
          var2 = he.a(param1 - 21124, param0, "jagex-last-login-method");
          if (var2 == null) {
            stackIn_4_0 = bf.field_c;
            return stackIn_4_0;
          }
          var3 = ff.a(param1 - 17914);
          var4 = 0;
          while (true) {
            if (var3.length <= var4) {
              if (param1 != -3825) {
                field_c = -86;
              }
              stackIn_14_0 = bf.field_c;
              return stackIn_14_0;
            }
            var5 = var3[var4];
            if (!var5.a(true, var2)) {
              var4++;
              continue;
            }
            break;
          }
          stackIn_9_0 = var5;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_17_0 = var2_ref;
          stackIn_17_1 = new StringBuilder().append("ma.B(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    final static ac a(Throwable param0, String param1) {
        ac var2 = null;
        if (!(param0 instanceof ac)) {
          var2 = new ac(param0, param1);
        } else {
          var2 = (ac) ((Object) param0);
          var2.field_a = var2.field_a + ' ' + param1;
        }
        return var2;
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 >= -27) {
          return;
        }
        field_d = null;
        field_b = null;
    }

    final static int a(int param0, int param1) {
        int var2;
        int var3;
        var3 = Main.field_T;
        d.field_a = null;
        ed.field_c = 0;
        tf.field_r = null;
        var2 = ak.field_O;
        ak.field_O = ej.field_kb;
        if (51 == param1) {
          dg.field_H.field_l = 2;
        } else {
          if (param1 != 50) {
            dg.field_H.field_l = 1;
          } else {
            dg.field_H.field_l = 5;
          }
        }
        ej.field_kb = var2;
        dg.field_H.field_b = dg.field_H.field_b + 1;
        if (param0 <= dg.field_H.field_b &&
          51 == param1) {
          return 2;
        }
        if (dg.field_H.field_b >= 2 &&
          param1 == 50) {
          return 5;
        }
        if (dg.field_H.field_b < 4) {
          return -1;
        }
        return 1;
    }

    static {
        field_b = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_c = 0;
    }
}
