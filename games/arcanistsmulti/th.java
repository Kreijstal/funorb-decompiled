/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th {
    static int field_f;
    private fm[] field_h;
    static gn field_d;
    static String field_i;
    static int[] field_g;
    static lg field_k;
    static String field_j;
    private we field_e;
    static kc field_c;
    static String field_a;
    static int[] field_b;

    final void a(int param0, int param1, String param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 >= 0 &&
            this.field_h.length > param3) {
            if (param0 >= param1 &&
              this.field_e.field_c.length > param0) {
              this.field_h[param3].field_b[param0] = param2;
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_11_0 = runtimeException;
          stackIn_11_1 = new StringBuilder().append("th.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(')').toString());
        }
    }

    final static qb[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var14 = 0;
        int var9;
        qb[] var10;
        qb[] var11_ref_qb__;
        int var11;
        int var12;
        qb var13;
        int var15;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        qb[] var10Lifetime1;
        var15 = ArcanistsMulti.field_G ? 1 : 0;
        var9 = param1 + param7 + param6;
        var10 = new qb[]{new qb(var9, var9), new qb(param2, var9), new qb(var9, var9), new qb(var9, param2), new qb(64, 64), new qb(var9, param2), new qb(var9, var9), new qb(param2, var9), new qb(var9, var9)};
        var11_ref_qb__ = var10;
        for (var12 = 0; var11_ref_qb__.length > var12; var12++) {
          var13 = var11_ref_qb__[var12];
          for (var14 = 0; var13.field_A.length > var14; var14++) {
            var13.field_A[var14] = param8;
          }
        }
        var10Lifetime1 = var11_ref_qb__;
        for (var11 = 0; param7 > var11; var11++) {
          for (var12Lifetime1 = 0; var12Lifetime1 < var9; var12Lifetime1++) {
            var10Lifetime1[6].field_A[var12Lifetime1 + (-1 + var9 - var11) * var9] = param5;
            var10Lifetime1[8].field_A[var12Lifetime1 + (-var11 + var9 - 1) * var9] = param5;
            var10Lifetime1[2].field_A[-1 + var9 - (var11 - var12Lifetime1 * var9)] = param5;
            var10Lifetime1[8].field_A[-var11 - (-var9 + 1) + var12Lifetime1 * var9] = param5;
          }
        }
        if (param4 != -32573) {
          field_d = (gn) null;
        }
        for (var11Lifetime1 = 0; var11Lifetime1 < param7; var11Lifetime1++) {
          for (var12Lifetime2 = 0; var12Lifetime2 < var9; var12Lifetime2++) {
            var10Lifetime1[0].field_A[var12Lifetime2 + var11Lifetime1 * var9] = param3;
            var10Lifetime1[0].field_A[var9 * var12Lifetime2 + var11Lifetime1] = param3;
            if (var9 - var11Lifetime1 > var12Lifetime2) {
              var10Lifetime1[2].field_A[var12Lifetime2 + var9 * var11Lifetime1] = param3;
              var10Lifetime1[6].field_A[var9 * var12Lifetime2 + var11Lifetime1] = param3;
            }
          }
        }
        for (var11Lifetime2 = 0; var11Lifetime2 < param2; var11Lifetime2++) {
          for (var12Lifetime3 = 0; var12Lifetime3 < param7; var12Lifetime3++) {
            var10Lifetime1[7].field_A[var11Lifetime2 + param2 * (-1 + var9 - var12Lifetime3)] = param5;
            var10Lifetime1[5].field_A[var9 - 1 - (var12Lifetime3 - var9 * var11Lifetime2)] = param5;
            var10Lifetime1[1].field_A[var11Lifetime2 + var12Lifetime3 * param2] = param3;
            var10Lifetime1[3].field_A[var11Lifetime2 * var9 + var12Lifetime3] = param3;
          }
        }
        for (var11Lifetime3 = 0; param2 >> 1 > var11Lifetime3; var11Lifetime3++) {
          for (var12Lifetime4 = 0; var12Lifetime4 < param1; var12Lifetime4++) {
            var10Lifetime1[1].field_A[var11Lifetime3 + (-1 - var12Lifetime4 + var9) * param2] = param0;
            var10Lifetime1[3].field_A[var9 - 1 + (-var12Lifetime4 + var11Lifetime3 * var9)] = param0;
            var10Lifetime1[7].field_A[param2 * var12Lifetime4 + var11Lifetime3] = param0;
            var10Lifetime1[5].field_A[var11Lifetime3 * var9 + var12Lifetime4] = param0;
          }
        }
        return var10Lifetime1;
    }

    final static void a(eg param0, eg param1, eg param2, byte param3, boolean param4) {
        try {
          wn.field_z = nj.a("", param3 + 133);
          wn.field_z.a(false, (byte) -59);
          aa.a(param3 ^ -121, param2, param1, param0);
          ci.a((byte) 50);
          hb.field_Gb = uj.field_h;
          in.field_Gb = uj.field_h;
          if (param3 != -40) {
            field_c = (kc) null;
          }
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "th.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(int param0, int param1) {
        if (param0 > param1) {
          return false;
        }
        if (param1 >= this.field_h.length) {
          return false;
        }
        if (-1L != this.field_h[param1].field_f) {
          return false;
        }
        this.field_h[param1].field_f = this.field_e.a(0);
        return true;
    }

    public static void a(byte param0) {
        field_g = null;
        field_k = null;
        field_a = null;
        field_i = null;
        field_d = null;
        field_b = null;
        if (param0 != -113) {
          ll var2 = (ll) null;
          th.a((nf) null, (ll) null, -127, -97, -25, -84);
        }
        field_j = null;
        field_c = null;
    }

    final static void a(nf param0, ll param1, int param2, int param3, int param4, int param5) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        var18 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param1 == null) {
            return;
          }
          if (0 > param3) {
            param3 = -param3;
          }
          var6_int = -param3 + param5;
          if (0 > var6_int) {
            var6_int = 0;
          }
          var7 = 1 + (param5 + param3);
          if (param2 + param0.field_H < var7) {
            var7 = -1 + param0.field_H;
          }
          var8 = var6_int;
          var9 = param3 * param3;
          var10 = 0;
          var11 = -var8 + param5;
          var12 = var11 * var11;
          if (param5 > var7) {
            param5 = var7;
          }
          var13 = var12 - var11;
          while (var8 < param5) {
            {
              while ((!(var13 > var9) ||
                !(var9 < var12))) {
                var12 = var12 + (var10 + var10);
                incrementValue$3 = var10;
                var10++;
                var13 = var13 + (incrementValue$3 + var10);
              }
              {
                var14 = 1 + param4 - var10;
                if (var14 < 0) {
                  var14 = 0;
                }
                var15 = param4 + var10;
                if (var15 > param0.field_y - 1) {
                  var15 = param0.field_y - 1;
                }
                var16 = var8 * param0.field_y + var14;
                incrementValue$2 = var11;
                var11--;
                var12 = var12 - (incrementValue$2 + var11);
                for (var17 = var14; var17 < var15; var17++) {
                  if (0 != param1.field_m[var16]) {
                    param1.field_m[var16] = (byte)-2;
                  }
                  var16++;
                }
                var8++;
                var13 = var13 - (var11 + var11);
              }
            }
          }
          var11Lifetime1 = -param5 + var8;
          var10Lifetime1 = param3;
          var13Lifetime1 = var9 + var11Lifetime1 * var11Lifetime1;
          var12Lifetime1 = var13Lifetime1 - var10Lifetime1;
          var13Lifetime1 = var13Lifetime1 - var11Lifetime1;
          while (var7 > var8) {
            while (var9 < var13Lifetime1) {
              if (var9 < var12Lifetime1) {
                incrementValue$0 = var10Lifetime1;
                var10Lifetime1--;
                var13Lifetime1 = var13Lifetime1 - (incrementValue$0 + var10Lifetime1);
                var12Lifetime1 = var12Lifetime1 - (var10Lifetime1 + var10Lifetime1);
                continue;
              }
              break;
            }
            var14Lifetime1 = param4 - var10Lifetime1;
            if (var14Lifetime1 < 0) {
              var14Lifetime1 = 0;
            }
            var15Lifetime1 = param4 + var10Lifetime1;
            if (-1 + param0.field_y < var15Lifetime1) {
              var15Lifetime1 = -1 + param0.field_y;
            }
            var19 = var14Lifetime1 + var8 * param0.field_y;
            var16Lifetime1 = var19;
            for (var17Lifetime1 = var14Lifetime1; var17Lifetime1 <= var15Lifetime1; var17Lifetime1++) {
              if (0 != param1.field_m[var19]) {
                param1.field_m[var19] = (byte)-4;
              }
              var19++;
            }
            var13Lifetime1 = var13Lifetime1 + (var11Lifetime1 + var11Lifetime1);
            var8++;
            incrementValue$1 = var11Lifetime1;
            var11Lifetime1++;
            var12Lifetime1 = var12Lifetime1 + (incrementValue$1 + var11Lifetime1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_49_0 = var6;
          stackIn_49_1 = new StringBuilder().append("th.F(");
          if (param0 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          stackIn_52_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',');
          if (param1 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_49_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final String a(byte param0, int param1) {
        if (param0 <= 107) {
          return (String) null;
        }
        if (param1 < 0) {
          return null;
        }
        if (param1 >= this.field_h.length) {
          return null;
        }
        return fd.a(false, this.field_h[param1]);
    }

    private th() throws Throwable {
        throw new Error();
    }

    static {
        field_i = "Music: ";
        field_j = "Hair";
        field_g = new int[]{13, 14, 15, 16, 17, 18, 43, 44, 59, 40};
        field_a = "GAME DRAWN<br><br>";
        field_b = new int[]{4};
    }
}
