/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pw {
    static int field_a;
    private static String field_z;

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5);

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        wma var4_ref_wma = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        wma var17 = null;
        int var17_int = 0;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        var19 = VoidHunters.field_G;
        try {
          L0: {
            uib.field_p = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
            var1_int = eha.field_o.length;
            var21 = new int[var1_int];
            var20 = var21;
            var2 = var20;
            var3 = 0;
            L1: while (true) {
              if (var3 >= var1_int) {
                L2: {
                  if (param0 == 74) {
                    break L2;
                  } else {
                    pw.a((byte) 57);
                    break L2;
                  }
                }
                L3: {
                  var3 = uib.field_p[9] >> 301890344;
                  var4 = uib.field_p[10] >> -846164440;
                  var5 = uib.field_p[11] >> 1832288584;
                  var6 = nd.field_r << -297999964;
                  var7 = 0;
                  var8 = eu.a(var6, 57) >> 417026088;
                  var9 = fc.a(var6, (byte) 61) >> -1876127800;
                  if (0 == (kc.field_b ^ -1)) {
                    break L3;
                  } else {
                    if (uia.field_b == -1) {
                      break L3;
                    } else {
                      var8 = 240 + -uia.field_b;
                      var9 = -128;
                      var7 = kc.field_b - 320;
                      break L3;
                    }
                  }
                }
                var10 = 256.0 / Math.sqrt((double)(var8 * var8 + var7 * var7 - -(var9 * var9)));
                var8 = (int)((double)var8 * var10);
                var9 = (int)((double)var9 * var10);
                var7 = (int)((double)var7 * var10);
                var12 = -var3 + var7;
                var13 = var8 + -var4;
                var14 = var9 - var5;
                var10 = 256.0 / Math.sqrt((double)(var13 * var13 + (var12 * var12 - -(var14 * var14))));
                var12 = (int)((double)var12 * var10);
                var14 = (int)((double)var14 * var10);
                var13 = (int)((double)var13 * var10);
                var15 = 0;
                L4: while (true) {
                  if (var15 >= eha.field_o.length) {
                    break L0;
                  } else {
                    var16 = 0;
                    var17_int = 1;
                    L5: while (true) {
                      if (var17_int >= eha.field_o.length) {
                        var21[var16] = -2147483648;
                        var17 = eha.field_o[var16];
                        rv.a(param0 ^ -34, var16);
                        var18 = 0;
                        L6: while (true) {
                          if (var18 >= 3) {
                            wl.a(var17, eob.field_p, false, true, false, uib.field_p, false);
                            kt.a(var17, var13, var12, -119, var14, var8, var9, var7);
                            var15++;
                            continue L4;
                          } else {
                            eob.field_p[var18] = eob.field_p[var18] + raa.field_p[var15][var18];
                            var18++;
                            continue L6;
                          }
                        }
                      } else {
                        L7: {
                          if (var21[var17_int] > var21[var16]) {
                            var16 = var17_int;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        var17_int++;
                        continue L5;
                      }
                    }
                  }
                }
              } else {
                var4_ref_wma = eha.field_o[var3];
                var17 = var4_ref_wma;
                var17 = var4_ref_wma;
                var4_ref_wma.a(84);
                rv.a(-37, var3);
                var5 = var4_ref_wma.field_B + var4_ref_wma.field_d >> 444455841;
                var6 = var4_ref_wma.field_u + var4_ref_wma.field_a >> 394147265;
                var7 = var4_ref_wma.field_s - -var4_ref_wma.field_q >> 1189930849;
                var8 = uib.field_p[9] >> -1310901534;
                var9 = uib.field_p[10] >> 1051754402;
                var10_int = uib.field_p[11] >> 172944546;
                var11 = var9 * eob.field_p[4] + (var8 * eob.field_p[3] + eob.field_p[5] * var10_int) >> -1939472690;
                var12 = var9 * eob.field_p[7] + eob.field_p[6] * var8 + var10_int * eob.field_p[8] >> -1341327570;
                var13 = eob.field_p[11] * var10_int + var9 * eob.field_p[10] + eob.field_p[9] * var8 >> -1047338450;
                var2[var3] = var13 * var7 + var5 * var11 - -(var6 * var12) >> 1993440496;
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1), field_z + param0 + ')');
        }
    }

    static {
        field_z = "pw.B(";
    }
}
