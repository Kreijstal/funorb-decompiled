/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gj {
    static String field_c;
    static String field_b;
    static RgbSprite field_a;

    final static void a(int param0, IndexedSprite param1, byte param2, int param3, int param4, int param5) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
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
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        var20 = SteelSentinels.obfuscationControl;
        try {
          if (param2 > -63) {
            field_b = (String) null;
          }
          var6_int = (param5 - param3 << 8) / param1.field_g;
          var7 = (param3 << 8) + var6_int * param1.field_j;
          param0 = param0 + param1.field_j;
          param4 = param4 + param1.field_n;
          var8 = SoftwareRaster.field_c * param4 + param0;
          var9 = 0;
          var10 = param1.field_i;
          var11 = param1.field_a;
          var12 = SoftwareRaster.field_c - var11;
          if (SoftwareRaster.field_l > param4) {
            var14 = -param4 + SoftwareRaster.field_l;
            var8 = var8 + SoftwareRaster.field_c * var14;
            var10 = var10 - var14;
            param4 = SoftwareRaster.field_l;
            var9 = var9 + var14 * var11;
          }
          var13 = 0;
          if (param0 < SoftwareRaster.field_i) {
            var14Lifetime1 = SoftwareRaster.field_i - param0;
            var11 = var11 - var14Lifetime1;
            param0 = SoftwareRaster.field_i;
            var12 = var12 + var14Lifetime1;
            var13 = var13 + var14Lifetime1;
            var9 = var9 + var14Lifetime1;
            var8 = var8 + var14Lifetime1;
            var7 = var7 + var14Lifetime1 * var6_int;
          }
          if (SoftwareRaster.field_d < var10 + param4) {
            var10 = var10 - (var10 + (param4 - SoftwareRaster.field_d));
          }
          if (var11 + param0 > SoftwareRaster.field_b) {
            var14Lifetime2 = param0 + (var11 - SoftwareRaster.field_b);
            var12 = var12 + var14Lifetime2;
            var13 = var13 + var14Lifetime2;
            var11 = var11 - var14Lifetime2;
          }
          if (0 < var11 &&
            var10 > 0) {
            for (param4 = -var10; param4 < 0; param4++) {
              var14Lifetime3 = var7;
              for (param0 = -var11; 0 > param0; param0++) {
                var15 = var14Lifetime3 >> 8;
                var16 = 256 - var15;
                var14Lifetime3 = var14Lifetime3 + var6_int;
                if (var15 >= 0) {
                  incrementValue$0 = var9;
                  var9++;
                  var17 = param1.field_o[param1.field_p[incrementValue$0] & 255];
                  if (var17 != 0) {
                    if (255 < var15) {
                      SoftwareRaster.field_g[var8] = var17;
                    } else {
                      var18 = SoftwareRaster.field_g[var8];
                      var19 = var16 * (16711935 & var18) + var15 * (var17 & 16711935) >> 8 & 16711935;
                      SoftwareRaster.field_g[var8] = var19 + ec.a(65280, var16 * ec.a(var18, 65280) + ec.a(65280, var17) * var15 >> 8);
                    }
                  }
                  var8++;
                } else {
                  var8++;
                  var9++;
                }
              }
              var9 = var9 + var13;
              var8 = var8 + var12;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_33_0 = var6;
          stackIn_33_1 = new StringBuilder().append("gj.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static RgbSprite[] b(int param0) {
        int var2 = 0;
        int var6 = 0;
        int var7 = 0;
        RgbSprite[] var1;
        int var3;
        byte[] var5;
        int[] var6_ref_int__;
        int var8;
        byte[] var9;
        int[] var10;
        byte[] var12;
        int[] var13;
        byte[] var16;
        int[] var17;
        byte[] var21;
        int[] var22;
        var8 = SteelSentinels.obfuscationControl;
        var1 = new RgbSprite[rl.field_d];
        for (var2 = param0; var2 < rl.field_d; var2++) {
          var3 = le.field_L[var2] * ca.field_r[var2];
          var21 = dl.field_L[var2];
          if (!pd.field_U[var2]) {
            var10 = new int[var3];
            var22 = var10;
            for (var6 = 0; var3 > var6; var6++) {
              var10[var6] = ba.field_d[ec.a(255, (int) var21[var6])];
            }
            var1[var2] = new RgbSprite(un.field_n, eb.field_n, rl.field_a[var2], oa.field_M[var2], le.field_L[var2], ca.field_r[var2], var22);
          } else {
            var16 = sn.field_g[var2];
            var12 = var16;
            var9 = var12;
            var5 = var9;
            var17 = new int[var3];
            var13 = var17;
            var6_ref_int__ = var13;
            for (var7 = 0; var3 > var7; var7++) {
              var6_ref_int__[var7] = vn.a(ba.field_d[ec.a(255, (int) var21[var7])], ec.a(var16[var7] << 24, -16777216));
            }
            var1[var2] = (RgbSprite) ((Object) new ek(un.field_n, eb.field_n, rl.field_a[var2], oa.field_M[var2], le.field_L[var2], ca.field_r[var2], var17));
          }
        }
        NodeHashTable.a(9324);
        return var1;
    }

    final static void a(int param0, int param1) {
        try {
          Throwable decompiledCaughtException = null;
          IOException var2 = null;
          boolean decompiledFrameRemainder0 = true;
          if (null != rb.field_h) {
            if (param1 >= 0) {
              decompiledFrameRemainder0 = (rn.field_v == jd.field_sb);
              if ((decompiledFrameRemainder0) && (mm.field_g.position == 0 &&
                10000L + vf.field_d < mm.a(param0 + 49))) {
                mm.field_g.writeCipheredOpcode(param1, (byte) -117);
              }
            } else {
              if (mm.field_g.position == 0 &&
                10000L + vf.field_d < mm.a(param0 + 49)) {
                mm.field_g.writeCipheredOpcode(param1, (byte) -117);
              }
            }
            if (decompiledFrameRemainder0) {
              if (param0 != 0) {
                field_b = (String) null;
              }
              if (mm.field_g.position > 0) {
                try {
                  rb.field_h.a(mm.field_g.position, mm.field_g.payload, -100, 0);
                  vf.field_d = mm.a(param0 + 58);
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = (IOException) (Object) decompiledCaughtException;
                  pm.m(-41);
                }
                mm.field_g.position = 0;
              }
              return;
            }
          }
          mm.field_g.position = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        int var1 = 10 % ((44 - param0) / 40);
        field_c = null;
    }

    static {
        field_c = "???";
    }
}
