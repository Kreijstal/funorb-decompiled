/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sl {
    static String[] field_c;
    static uf field_d;
    static long field_a;
    static ed[][] field_b;

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_d = null;
    }

    final static byte[][][] a(mf param0, mf param1, int[] param2, byte[][][] param3, int param4, int param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        byte[][][] var11 = null;
        byte[][][] var13 = null;
        byte[][][] var15 = null;
        byte[][][] var17 = null;
        byte[][] var18 = null;
        byte[][][] stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[][][] stackOut_11_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var10 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              var6_int = dh.field_e.length;
              if (param3 != null) {
                break L1;
              } else {
                var17 = new byte[var6_int][][];
                var15 = var17;
                var13 = var15;
                var11 = var13;
                param3 = var11;
                break L1;
              }
            }
            var7 = 0;
            L2: while (true) {
              if (var7 >= var6_int) {
                stackOut_11_0 = (byte[][][]) param3;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                L3: {
                  var8 = dh.field_e[var7];
                  if (param4 == var8) {
                    if (param3[var7] == null) {
                      var18 = ol.a(-51, param1, param2, var7, param0);
                      param3[var7] = var18;
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                var7++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var6;
            stackOut_13_1 = new StringBuilder().append("sl.A(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          L6: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          L7: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param3 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw t.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param4 + ',' + 0 + ')');
        }
        return stackIn_12_0;
    }

    final static gi a(boolean param0, int param1) {
        c var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        c var8 = null;
        si var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_21_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        Object stackOut_20_0 = null;
        int[] stackOut_19_0 = null;
        L0: {
          var7 = EscapeVector.field_A;
          var8 = om.field_g;
          var2 = var8;
          var3 = var8.e(0);
          fl.field_o = var3 & 127;
          if (0 == (128 & var3)) {
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
          rm.field_c = stackIn_3_0 != 0;
          ve.field_g = var8.e(0);
          ah.field_e = var8.i(-800509813);
          if (fl.field_o != 2) {
            im.field_a = 0;
            jn.field_d = 0;
            break L1;
          } else {
            jn.field_d = var8.f(1952);
            im.field_a = var8.d((byte) -119);
            break L1;
          }
        }
        L2: {
          if (var8.e(0) != 1) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var4 = stackIn_9_0;
          gm.field_e = var8.c(false);
          if (var4 != 0) {
            rm.field_g = var8.c(false);
            break L3;
          } else {
            rm.field_g = gm.field_e;
            break L3;
          }
        }
        L4: {
          L5: {
            if (1 == fl.field_o) {
              break L5;
            } else {
              if (fl.field_o == 4) {
                break L5;
              } else {
                break L4;
              }
            }
          }
          int discarded$2 = var8.f(1952);
          String discarded$3 = var8.c(false);
          break L4;
        }
        L6: {
          if (!param0) {
            od.field_d = fn.a((n) (Object) var8, 10241, 80);
            bo.field_H = null;
            break L6;
          } else {
            var5 = var8.f(1952);
            try {
              L7: {
                L8: {
                  var9 = hi.field_s.a(var5, (byte) -126);
                  od.field_d = var9.g(-4);
                  if (rm.field_g.equals((Object) (Object) ck.field_r)) {
                    stackOut_20_0 = null;
                    stackIn_21_0 = (int[]) (Object) stackOut_20_0;
                    break L8;
                  } else {
                    stackOut_19_0 = var9.field_z;
                    stackIn_21_0 = stackOut_19_0;
                    break L8;
                  }
                }
                bo.field_H = stackIn_21_0;
                break L7;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L9: {
                var6 = (Exception) (Object) decompiledCaughtException;
                pf.a(false, "CC1", (Throwable) (Object) var6);
                bo.field_H = null;
                od.field_d = null;
                break L9;
              }
            }
            break L6;
          }
        }
        return new gi(param0);
    }

    final static boolean a(boolean param0, byte param1) {
        L0: {
          if (sk.field_d == null) {
            sk.field_d = ca.field_c.a(ej.field_b, 4, cn.field_h);
            break L0;
          } else {
            break L0;
          }
        }
        if (-1 != sk.field_d.field_f) {
          L1: {
            long dupTemp$2 = td.b(128);
            le.field_c = dupTemp$2;
            field_a = dupTemp$2;
            if (-2 != sk.field_d.field_f) {
              break L1;
            } else {
              break L1;
            }
          }
          al.field_d = ak.field_d;
          sk.field_d = null;
          return true;
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_b = new ed[7][4];
    }
}
