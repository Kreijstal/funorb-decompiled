/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vda {
    static sna field_a;

    final static void a(long param0, int param1, int param2, int param3, boolean param4, boolean param5, int param6, int param7, ht param8, int param9, int param10, String param11, int param12, int param13) {
        try {
            IOException var15 = null;
            RuntimeException var15_ref = null;
            int stackIn_3_0 = 0;
            int stackIn_8_0 = 0;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_2_0 = 0;
            int stackOut_1_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_6_0 = 0;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            try {
              L0: {
                ig.field_m = new pf(param6);
                sja.field_fb = new pf(param2);
                if (!param5) {
                  stackOut_2_0 = 0;
                  stackIn_3_0 = stackOut_2_0;
                  break L0;
                } else {
                  stackOut_1_0 = 1;
                  stackIn_3_0 = stackOut_1_0;
                  break L0;
                }
              }
              L1: {
                vs.field_c = stackIn_3_0 != 0;
                oja.field_c = param9;
                if (param7 == 64) {
                  break L1;
                } else {
                  vda.a(-73, -89, 99, 10, (byte) 120, -109);
                  break L1;
                }
              }
              L2: {
                mfa.field_a = param10;
                oca.field_p = param11;
                cp.field_c = param12;
                vi.field_a = param0;
                if (!param4) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L2;
                } else {
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L2;
                }
              }
              cr.field_b = stackIn_8_0 != 0;
              kha.field_k = param3;
              cc.field_e = param8;
              fl.field_q = param1;
              kn.field_h = param13;
              if (null != cc.field_e.field_a) {
                try {
                  L3: {
                    vg.field_n = new v(cc.field_e.field_a, 64, 0);
                    break L3;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var15 = (IOException) (Object) decompiledCaughtException;
                  throw new RuntimeException(var15.toString());
                }
                return;
              } else {
                return;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var15_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_14_0 = (RuntimeException) (var15_ref);
                stackOut_14_1 = new StringBuilder().append("vda.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                if (param8 == null) {
                  stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackOut_16_2 = "null";
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  break L4;
                } else {
                  stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackOut_15_2 = "{...}";
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  break L4;
                }
              }
              L5: {
                stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param9).append(',').append(param10).append(',');
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                if (param11 == null) {
                  stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackOut_19_2 = "null";
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  stackIn_20_2 = stackOut_19_2;
                  break L5;
                } else {
                  stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackOut_18_2 = "{...}";
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  stackIn_20_2 = stackOut_18_2;
                  break L5;
                }
              }
              throw pe.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param12 + ',' + param13 + ')');
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
        RuntimeException var6 = null;
        int var6_int = 0;
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
        RuntimeException decompiledCaughtException = null;
        var26 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var6_int = 0;
              var7 = param0;
              var8 = param3 * param3;
              var9 = param0 * param0;
              var10 = var9 << -1099970431;
              var11 = var8 << 1310385601;
              var14 = -29 % ((-25 - param4) / 35);
              var12 = param0 << -1597775807;
              var13 = var10 + (1 - var12) * var8;
              var15 = -((-1 + var12) * var11) + var9;
              var16 = var8 << 338888322;
              var17 = var9 << 1579941474;
              var18 = var10 * (3 + (var6_int << 348594625));
              var19 = (-3 + (var7 << 1269825)) * var11;
              var20 = var17 * (1 + var6_int);
              if (an.field_q > param2) {
                break L1;
              } else {
                if (ha.field_n >= param2) {
                  var22 = cr.a(eo.field_l, param3 + param5, pw.field_x, 0);
                  var23 = cr.a(eo.field_l, param5 + -param3, pw.field_x, 0);
                  hba.a(param1, var23, tj.field_b[param2], 7, var22);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            var21 = (-1 + var7) * var16;
            L2: while (true) {
              if (0 >= var7) {
                break L0;
              } else {
                L3: {
                  if ((var13 ^ -1) > -1) {
                    L4: while (true) {
                      if (var13 >= 0) {
                        break L3;
                      } else {
                        var15 = var15 + var20;
                        var13 = var13 + var18;
                        var18 = var18 + var17;
                        var20 = var20 + var17;
                        var6_int++;
                        continue L4;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                L5: {
                  if (0 <= var15) {
                    break L5;
                  } else {
                    var13 = var13 + var18;
                    var15 = var15 + var20;
                    var6_int++;
                    var20 = var20 + var17;
                    var18 = var18 + var17;
                    break L5;
                  }
                }
                var15 = var15 + -var19;
                var13 = var13 + -var21;
                var19 = var19 - var16;
                var7--;
                var21 = var21 - var16;
                var22 = param2 - var7;
                var23 = param2 - -var7;
                if (var23 < an.field_q) {
                  continue L2;
                } else {
                  if (ha.field_n < var22) {
                    continue L2;
                  } else {
                    L6: {
                      var24 = cr.a(eo.field_l, var6_int + param5, pw.field_x, 0);
                      var25 = cr.a(eo.field_l, -var6_int + param5, pw.field_x, 0);
                      if (var22 >= an.field_q) {
                        hba.a(param1, var25, tj.field_b[var22], 7, var24);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    if (var23 <= ha.field_n) {
                      hba.a(param1, var25, tj.field_b[var23], 7, var24);
                      continue L2;
                    } else {
                      continue L2;
                    }
                  }
                }
              }
            }
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
