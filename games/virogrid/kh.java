/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kh {
    static dl field_c;
    static int[][] field_f;
    static String field_a;
    static ob field_e;
    static int field_d;
    static km field_g;
    static km field_b;

    public static void a(byte param0) {
        field_c = null;
        field_e = null;
        field_f = (int[][]) null;
        field_g = null;
        field_b = null;
        field_a = null;
        if (param0 <= 24) {
          field_f = (int[][]) null;
        }
    }

    final static void a(boolean param0) {
        pe var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        pe var1Lifetime1;
        var2 = Virogrid.field_F ? 1 : 0;
        try {
          ae.field_g.c();
          ac.field_c.c();
          ql.field_t = ql.field_t - 1;
          if (ql.field_t == 0) {
            ql.field_t = 200;
            var1 = (pe) (co.field_a.a((byte) -112));
            while (var1 != null) {
              if (!var1.field_h.b(false)) {
                var1.a(false);
              }
              var1 = (pe) (co.field_a.a(16213));
            }
            if (gk.field_f != null) {
              var1Lifetime1 = (pe) (gk.field_f.a((byte) -112));
              while (var1Lifetime1 != null) {
                if (!var1Lifetime1.field_h.b(false)) {
                  var1Lifetime1.a(false);
                }
                var1Lifetime1 = (pe) (gk.field_f.a(16213));
              }
            }
          }
          if (vg.field_B != null &&
            !vg.field_B.d(120)) {
            qi.field_b = null;
          }
          if (param0) {
            field_f = (int[][]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var1_ref), "kh.D(" + param0 + ')');
        }
    }

    final static void a(int param0) {
        try {
          int var1_int = 0;
          IOException iOException = null;
          IOException var2_ref = null;
          int var3 = 0;
          String var4 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var1 = null;
          var3 = Virogrid.field_F ? 1 : 0;
          try {
            if (param0 != 0) {
              var4 = (String) null;
              kh.a((byte) -112, (String) null);
            }
            if (ji.field_e != null) {
              ji.field_e.b(120);
            }
            if (null != bc.field_a) {
              bc.field_a.b((byte) -56);
            }
            if (dj.field_l != null) {
              try {
                dj.field_l.b((byte) 14);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
              }
            }
            if (null != ij.field_n) {
              for (var1_int = 0; var1_int < ij.field_n.length; var1_int++) {
                if (ij.field_n[var1_int] != null) {
                  try {
                    ij.field_n[var1_int].b((byte) 14);
                  } catch (java.io.IOException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    var2_ref = (IOException) (Object) decompiledCaughtException;
                  }
                }
              }
              return;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw kg.a((Throwable) ((Object) var1), "kh.E(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(km param0, int param1, int param2) {
        dj var9 = null;
        mg var11 = null;
        String var10 = null;
        dj var12 = null;
        mg var14 = null;
        String var13 = null;
        dj var15 = null;
        mg var17 = null;
        String var16 = null;
        dj var18 = null;
        mg var20 = null;
        String var19 = null;
        dj var21 = null;
        mg var23 = null;
        String var22 = null;
        dj var24 = null;
        mg var26 = null;
        String var25 = null;
        dj var27 = null;
        String var28 = null;
        dj var30 = null;
        mg var32 = null;
        String var31 = null;
        dj var33 = null;
        mg var35 = null;
        String var34 = null;
        dj var36 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        mg var29 = null;
        mg var29Lifetime1;
        mg var29Lifetime2;
        mg var29Lifetime3;
        mg var29Lifetime4;
        mg var29Lifetime5;
        mg var29Lifetime6;
        mg var29Lifetime7;
        mg var29Lifetime1Lifetime1;
        mg var29Lifetime1Lifetime2;
        mg var29Lifetime1Lifetime3;
        mg var29Lifetime1Lifetime4;
        mg var29Lifetime1Lifetime5;
        try {
          ai.a(param1, (um) null, (int[]) null, (String) null, 0L, (String) null, -1, param0, 60);
          if (param1 == 0) {
            var9 = md.field_e;
            var11 = j.field_k[0];
            var29 = var11;
            var29Lifetime3 = var11;
            var10 = vb.field_d;
            var9.field_a.a(var10, (byte) 89, 11, var11);
            var12 = md.field_e;
            var14 = j.field_k[1];
            var29Lifetime4 = var14;
            var29Lifetime5 = var14;
            var13 = ql.field_p;
            var12.field_a.a(var13, (byte) 89, 12, var14);
            var15 = md.field_e;
            var17 = j.field_k[2];
            var29Lifetime6 = var17;
            var29Lifetime7 = var17;
            var16 = f.field_h;
            var15.field_a.a(var16, (byte) 89, 13, var17);
          }
          if (1 == param1) {
            var18 = md.field_e;
            var20 = j.field_k[0];
            var29Lifetime1 = var20;
            var29Lifetime1Lifetime1 = var20;
            var19 = pc.field_c;
            var18.field_a.a(var19, (byte) 89, 11, var20);
            var21 = md.field_e;
            var23 = j.field_k[1];
            var29Lifetime1Lifetime2 = var23;
            var29Lifetime1Lifetime3 = var23;
            var22 = oa.field_u;
            var21.field_a.a(var22, (byte) 89, 12, var23);
            var24 = md.field_e;
            var26 = j.field_k[2];
            var29Lifetime1Lifetime4 = var26;
            var29Lifetime1Lifetime5 = var26;
            var25 = la.field_m;
            var24.field_a.a(var25, (byte) 89, 13, var26);
          }
          if (param1 == 2) {
            var27 = md.field_e;
            var29Lifetime2 = j.field_k[0];
            var28 = bf.field_s;
            var27.field_a.a(var28, (byte) 89, 11, var29Lifetime2);
            var30 = md.field_e;
            var32 = j.field_k[1];
            var31 = ql.field_f;
            var30.field_a.a(var31, (byte) 89, 12, var32);
            var33 = md.field_e;
            var35 = j.field_k[2];
            var34 = mi.field_a;
            var33.field_a.a(var34, (byte) 89, 13, var35);
          }
          if (param2 != 20435) {
            field_c = (dl) null;
          }
          var36 = md.field_e;
          var4 = param0.field_Bb;
          var5 = param0.field_J;
          var6 = param0.field_K;
          var7 = param0.field_ub;
          var36.field_a.a(var7, 0, var6, var4, var5);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "kh.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static mg[] a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var14 = 0;
        int var9;
        mg[] var10;
        mg[] var11_ref_mg__;
        int var11;
        int var12;
        mg var13;
        int var15;
        e var16;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        var15 = Virogrid.field_F ? 1 : 0;
        var9 = param8 + param0 + param6;
        var10 = new mg[]{new mg(var9, var9), new mg(param5, var9), new mg(var9, var9), new mg(var9, param5), new mg(64, 64), new mg(var9, param5), new mg(var9, var9), new mg(param5, var9), new mg(var9, var9)};
        var11_ref_mg__ = var10;
        for (var12 = 0; var12 < var11_ref_mg__.length; var12++) {
          var13 = var11_ref_mg__[var12];
          for (var14 = 0; var13.field_B.length > var14; var14++) {
            var13.field_B[var14] = param4;
          }
        }
        for (var11 = 0; param0 > var11; var11++) {
          for (var12Lifetime1 = 0; var9 > var12Lifetime1; var12Lifetime1++) {
            var10[6].field_B[var12Lifetime1 + (-var11 + (var9 - 1)) * var9] = param1;
            var10[8].field_B[var12Lifetime1 + (var9 + (-var11 - 1)) * var9] = param1;
            var10[2].field_B[var9 * var12Lifetime1 + (-var11 - 1 + var9)] = param1;
            var10[8].field_B[var9 - (1 + var11 - var9 * var12Lifetime1)] = param1;
          }
        }
        for (var11Lifetime1 = 0; param0 > var11Lifetime1; var11Lifetime1++) {
          for (var12Lifetime2 = 0; var9 > var12Lifetime2; var12Lifetime2++) {
            var10[0].field_B[var12Lifetime2 + var9 * var11Lifetime1] = param3;
            var10[0].field_B[var12Lifetime2 * var9 + var11Lifetime1] = param3;
            if ((var9 - var11Lifetime1) > var12Lifetime2) {
              var10[2].field_B[var12Lifetime2 + var11Lifetime1 * var9] = param3;
              var10[6].field_B[var9 * var12Lifetime2 + var11Lifetime1] = param3;
            }
          }
        }
        if (param2 != -105) {
          var16 = (e) null;
          kh.a(92, -47, -44, -58, (e) null, (byte) 53, (mg[]) null, 44, 120, 77, -28, (mg[]) null, 119, (e) null, true);
        }
        for (var11Lifetime2 = 0; var11Lifetime2 < param5; var11Lifetime2++) {
          for (var12Lifetime3 = 0; param0 > var12Lifetime3; var12Lifetime3++) {
            var10[7].field_B[(-var12Lifetime3 + (var9 - 1)) * param5 + var11Lifetime2] = param1;
            var10[5].field_B[var11Lifetime2 * var9 + (-var12Lifetime3 - 1) + var9] = param1;
            var10[1].field_B[param5 * var12Lifetime3 + var11Lifetime2] = param3;
            var10[3].field_B[var11Lifetime2 * var9 + var12Lifetime3] = param3;
          }
        }
        for (var11Lifetime3 = 0; var11Lifetime3 < param5 >> 1; var11Lifetime3++) {
          for (var12Lifetime4 = 0; var12Lifetime4 < param6; var12Lifetime4++) {
            var10[1].field_B[var11Lifetime3 + (-1 + var9 - var12Lifetime4) * param5] = param7;
            var10[3].field_B[-var12Lifetime4 - (1 - var9) + var11Lifetime3 * var9] = param7;
            var10[7].field_B[var11Lifetime3 + var12Lifetime4 * param5] = param7;
            var10[5].field_B[var12Lifetime4 + var9 * var11Lifetime3] = param7;
          }
        }
        return var10;
    }

    final static void a(int param0, int param1, int param2, int param3, e param4, byte param5, mg[] param6, int param7, int param8, int param9, int param10, mg[] param11, int param12, e param13, boolean param14) {
        try {
          mg[] var16 = (mg[]) null;
          ok.a(param0, 480, jl.field_E, -100, param3, param9, en.field_Kb, param2, param10, param13, param1, (mg[]) null, 0, param8, param7, ti.field_b, param11, param4, param6, param12, 0);
          int var15_int = -42 % ((18 - param5) / 62);
          ti.a(param14, -1502464351);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "kh.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + (param11 != null ? "{...}" : "null") + ',' + param12 + ',' + (param13 != null ? "{...}" : "null") + ',' + param14 + ')');
        }
    }

    final static gh a(byte param0, String param1) {
        int var2_int = 0;
        String var3 = null;
        gh var4 = null;
        String var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        gh stackIn_16_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          if (ie.field_a == null) {
            return null;
          }
          var2_int = 0 % ((param0 + 51) / 62);
          var7 = (CharSequence) ((Object) param1);
          var3 = c.a(var7, true);
          if (var3 == null) {
            var3 = param1;
          }
          var4 = (gh) (ie.field_a.a((long)var3.hashCode(), (byte) 96));
          while (var4 != null) {
            var8 = (CharSequence) ((Object) var4.field_Hb);
            var5 = c.a(var8, true);
            if (var5 == null) {
              var5 = var4.field_Hb;
            }
            if (var5.equals(var3)) {
              stackIn_16_0 = var4;
              return stackIn_16_0;
            }
            var4 = (gh) (ie.field_a.c(48));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("kh.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    static {
        field_c = new dl();
        field_a = "Add name";
        field_e = new ob();
    }
}
