/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vc {
    static String field_a;
    static cr field_b;

    final static void a(int param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          for (var1_int = param0; var1_int < 11; var1_int++) {
            var2 = var1_int / 7;
            var3 = var1_int - 7 * var2;
            var4 = 12 * var2 + var3;
            al.field_A[var4] = "F" + (var3 + 1);
            al.field_o[var4] = var3 + 1;
            al.field_x[var4] = var2;
          }
          for (var1_intLifetime1 = 0; var1_intLifetime1 < 10; var1_intLifetime1++) {
            var2Lifetime1 = var1_intLifetime1 / 5;
            var3Lifetime1 = -(var2Lifetime1 * 5) + (7 + var1_intLifetime1);
            var4Lifetime1 = 12 * var2Lifetime1 + var3Lifetime1;
            al.field_A[var4Lifetime1] = "F" + (var3Lifetime1 + 1);
            al.field_o[var4Lifetime1] = var3Lifetime1;
            al.field_x[var4Lifetime1] = var2Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var1), "vc.D(" + param0 + ')');
        }
    }

    final static void c(int param0) {
        if (hm.field_F != 0 - sq.field_e &&
          -sq.field_e + 250 == hm.field_F) {
        }
        int var1 = 60 / ((param0 + 6) / 39);
        hm.field_F = hm.field_F + 1;
    }

    public static void b(int param0) {
        field_b = null;
        if (param0 != 0) {
          return;
        }
        field_a = null;
    }

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_intLifetime1;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          for (var2_int = 0; param1.length() > var2_int; var2_int++) {
            var3 = param1.charAt(var2_int);
            if (!oc.a((char) var3, (byte) -115) &&
              !ab.a(false, (char) var3)) {
              return true;
            }
          }
          var2_intLifetime1 = 35 / ((-66 - param0) / 41);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("vc.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        bs var1 = null;
        uh var1_ref = null;
        RuntimeException var1_ref2 = null;
        int var2 = 0;
        bs var1Lifetime1;
        var2 = Vertigo2.field_L ? 1 : 0;
        try {
          var1 = (bs) (mk.field_J.a((byte) 100));
          while (var1 != null) {
            if (var1.field_Ub > 0) {
              var1.field_Ub = var1.field_Ub - 1;
              if (var1.field_Ub == 0) {
                var1.field_Hb = 0;
                if (var1.k(15)) {
                  var1.c(param0 + 61);
                }
              }
            }
            var1 = (bs) (mk.field_J.b(103));
          }
          if (param0 != -59) {
            field_a = (String) null;
          }
          var1_ref = (uh) (nr.field_p.a((byte) 100));
          while (var1_ref != null) {
            if (var1_ref.field_ic > 0) {
              var1_ref.field_ic = var1_ref.field_ic - 1;
              if (0 == var1_ref.field_ic) {
                var1_ref.field_Lb = 0;
                if (var1_ref.k(param0 ^ -4082)) {
                  var1_ref.c(2);
                }
              }
            }
            var1_ref = (uh) (nr.field_p.b(47));
          }
          var1Lifetime1 = (bs) (kq.field_Rb.a((byte) 100));
          while (var1Lifetime1 != null) {
            if (var1Lifetime1.field_Ub <= 0) {
              var1Lifetime1 = (bs) (kq.field_Rb.b(38));
              continue;
            }
            var1Lifetime1.field_Ub = var1Lifetime1.field_Ub - 1;
            if (0 == var1Lifetime1.field_Ub) {
              var1Lifetime1.field_Hb = 0;
              if (var1Lifetime1.k(param0 ^ -54)) {
                var1Lifetime1.c(2);
              }
            }
            var1Lifetime1 = (bs) (kq.field_Rb.b(38));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref2 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var1_ref2), "vc.E(" + param0 + ')');
        }
    }

    final synchronized static byte[] a(int param0, byte param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int var2 = 0;
        int dupTemp$3 = 0;
        byte[][] arrayValue$4 = null;
        byte[] var2_ref_byte__;
        byte[] var3;
        byte[] var2_ref_byte__Lifetime1;
        byte[] var2_ref_byte__Lifetime2;
        if (param1 != -69) {
          return (byte[]) null;
        }
        if (param0 == 100 &&
          so.field_B > 0) {
          fieldTemp$0 = so.field_B - 1;
          so.field_B = so.field_B - 1;
          var2_ref_byte__ = ac.field_O[fieldTemp$0];
          ac.field_O[so.field_B] = null;
          return var2_ref_byte__;
        }
        if (param0 == 5000 &&
          ie.field_Kb > 0) {
          fieldTemp$1 = ie.field_Kb - 1;
          ie.field_Kb = ie.field_Kb - 1;
          var2_ref_byte__Lifetime1 = bh.field_g[fieldTemp$1];
          bh.field_g[ie.field_Kb] = null;
          return var2_ref_byte__Lifetime1;
        }
        if (param0 == 30000 &&
          ff.field_b > 0) {
          fieldTemp$2 = ff.field_b - 1;
          ff.field_b = ff.field_b - 1;
          var2_ref_byte__Lifetime2 = uo.field_f[fieldTemp$2];
          uo.field_f[ff.field_b] = null;
          return var2_ref_byte__Lifetime2;
        }
        if (df.field_j != null) {
          for (var2 = 0; ue.field_M.length > var2; var2++) {
            if (param0 == ue.field_M[var2] &&
              mi.field_w[var2] > 0) {
              dupTemp$3 = mi.field_w[var2] - 1;
              arrayValue$4 = df.field_j[var2];
              mi.field_w[var2] = dupTemp$3;
              var3 = arrayValue$4[dupTemp$3];
              df.field_j[var2][mi.field_w[var2]] = null;
              return var3;
            }
          }
        }
        return new byte[param0];
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, byte param7, int param8, int param9) {
        int var25 = 0;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        var36 = Vertigo2.field_L ? 1 : 0;
        try {
          var10_int = -83 / ((param7 + 84) / 37);
          if (param8 == param1 &&
            param4 == param5 &&
            param0 == param6 &&
            param3 == param2) {
            uj.a(param8, param6, param3, true, param4, param9);
            return;
          }
          var11 = param8;
          var12 = param4;
          var13 = param8 * 3;
          var14 = 3 * param4;
          var15 = param1 * 3;
          var16 = 3 * param5;
          var17 = param0 * 3;
          var18 = 3 * param2;
          var19 = var15 + param6 - (var17 + param8);
          var20 = -param4 + (var16 - var18 + param3);
          var21 = var13 + (var17 - var15 - var15);
          var22 = var14 + (-var16 + var18 - var16);
          var23 = -var13 + var15;
          var24 = -var14 + var16;
          for (var25 = 128; var25 <= 4096; var25 += 128) {
            var26 = var25 * var25 >> 12;
            var27 = var25 * var26 >> 12;
            var28 = var19 * var27;
            var29 = var20 * var27;
            var30 = var21 * var26;
            var31 = var26 * var22;
            var32 = var23 * var25;
            var33 = var25 * var24;
            var34 = (var32 + var30 + var28 >> 12) + param8;
            var35 = (var29 + (var31 + var33) >> 12) + param4;
            uj.a(var11, var34, var35, true, var12, param9);
            var11 = var34;
            var12 = var35;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var10), "vc.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        field_a = "Waiting for fonts";
    }
}
