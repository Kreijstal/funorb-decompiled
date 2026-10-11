/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vda {
    static sna field_a;

    final static void a(long param0, int param1, int param2, int param3, boolean param4, boolean param5, int param6, int param7, ht param8, int param9, int param10, String param11, int param12, int param13) {
        try {
          RuntimeException stackIn_16_0 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          IOException var15 = null;
          RuntimeException var15_ref = null;
          try {
            ig.field_m = new pf(param6);
            sja.field_fb = new pf(param2);
            vs.field_c = param5;
            oja.field_c = param9;
            if (param7 != 64) {
              vda.a(-73, -89, 99, 10, (byte) 120, -109);
            }
            mfa.field_a = param10;
            oca.field_p = param11;
            cp.field_c = param12;
            vi.field_a = param0;
            cr.field_b = param4;
            kha.field_k = param3;
            cc.field_e = param8;
            fl.field_q = param1;
            kn.field_h = param13;
            if (null == cc.field_e.field_a) {
              return;
            }
            try {
              vg.field_n = new v(cc.field_e.field_a, 64, 0);
              return;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var15 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(var15.toString());
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var15_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_16_0 = var15_ref;
            stackIn_16_1 = new StringBuilder().append("vda.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            if (param8 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param9).append(',').append(param10).append(',');
            if (param11 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw pe.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param12).append(',').append(param13).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        int var1 = 42 % ((34 - param0) / 38);
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
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
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var22Lifetime1;
        int var23Lifetime1;
        var26 = BachelorFridge.field_y;
        try {
          var6_int = 0;
          var7 = param0;
          var8 = param3 * param3;
          var9 = param0 * param0;
          var10 = var9 << 1;
          var11 = var8 << 1;
          var14 = -29 % ((-25 - param4) / 35);
          var12 = param0 << 1;
          var13 = var10 + (1 - var12) * var8;
          var15 = -((-1 + var12) * var11) + var9;
          var16 = var8 << 2;
          var17 = var9 << 2;
          var18 = var10 * (3 + (var6_int << 1));
          var19 = (-3 + (var7 << 1)) * var11;
          var20 = var17 * (1 + var6_int);
          if (an.field_q <= param2 &&
            ha.field_n >= param2) {
            var22 = cr.a(eo.field_l, param3 + param5, pw.field_x, 0);
            var23 = cr.a(eo.field_l, param5 - param3, pw.field_x, 0);
            hba.a(param1, var23, tj.field_b[param2], 7, var22);
          }
          var21 = (-1 + var7) * var16;
          while (true) {
            if (0 >= var7) {
              return;
            }
            if (var13 < 0) {
              while (var13 < 0) {
                var15 = var15 + var20;
                var13 = var13 + var18;
                var18 = var18 + var17;
                var20 = var20 + var17;
                var6_int++;
              }
            }
            if (0 > var15) {
              var13 = var13 + var18;
              var15 = var15 + var20;
              var6_int++;
              var20 = var20 + var17;
              var18 = var18 + var17;
            }
            var15 = var15 - var19;
            var13 = var13 - var21;
            var19 = var19 - var16;
            var7--;
            var21 = var21 - var16;
            var22Lifetime1 = param2 - var7;
            var23Lifetime1 = param2 + var7;
            if (var23Lifetime1 < an.field_q) {
              continue;
            }
            if (ha.field_n < var22Lifetime1) {
              continue;
            }
            var24 = cr.a(eo.field_l, var6_int + param5, pw.field_x, 0);
            var25 = cr.a(eo.field_l, -var6_int + param5, pw.field_x, 0);
            if (var22Lifetime1 >= an.field_q) {
              hba.a(param1, var25, tj.field_b[var22Lifetime1], 7, var24);
            }
            if (var23Lifetime1 > ha.field_n) {
              continue;
            }
            hba.a(param1, var25, tj.field_b[var23Lifetime1], 7, var24);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var6), "vda.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
    }
}
