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
        if (param0 != 127) {
            sl.a((mf) null, (mf) null, (int[]) null, (byte[][][]) null, -11, 8);
        }
        field_b = (ed[][]) null;
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
        byte[][] var16 = null;
        byte[][][] stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              var6_int = dh.field_e.length;
              if (param3 != null) {
                break L1;
              } else {
                var13 = new byte[var6_int][][];
                var11 = var13;
                param3 = var11;
                break L1;
              }
            }
            var7 = param5;
            L2: while (true) {
              if (var7 >= var6_int) {
                stackIn_12_0 = (byte[][][]) (param3);
                break L0;
              } else {
                L3: {
                  var8 = dh.field_e[var7];
                  if (param4 == var8) {
                    if (param3[var7] == null) {
                      var16 = ol.a(-51, param1, param2, var7, param0);
                      param3[var7] = var16;
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
            stackIn_15_0 = (RuntimeException) (var6);

            stackIn_15_1 = new StringBuilder().append("sl.A(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L7;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L7;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), stackIn_25_2 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_12_0;
    }

    final static gi a(boolean param0, int param1) {
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_21_0 = null;
        Throwable decompiledCaughtException = null;
        c var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        c var8 = null;
        si var9 = null;
        L0: {
          var7 = EscapeVector.field_A;
          var8 = om.field_g;
          var2 = var8;
          var3 = var8.e(0);
          fl.field_o = var3 & 127;
          if (0 == (128 & var3)) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = 1;
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
          if ((var8.e(param1 ^ param1) ^ -1) != -2) {
            stackIn_9_0 = 0;
            break L2;
          } else {
            stackIn_9_0 = 1;
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
          var8.f(1952);
          var8.c(false);
          break L4;
        }
        L6: {
          if (!param0) {
            od.field_d = fn.a(var8, 10241, 80);
            bo.field_H = null;
            break L6;
          } else {
            var5 = var8.f(1952);
            try {
              L7: {
                L8: {
                  var9 = hi.field_s.a(var5, (byte) -126);
                  od.field_d = var9.g(-4);
                  if (rm.field_g.equals(ck.field_r)) {
                    stackIn_21_0 = null;
                    break L8;
                  } else {
                    stackIn_21_0 = var9.field_z;
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
                pf.a(false, "CC1", (Throwable) ((Object) var6));
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
        long dupTemp$2 = 0L;
        L0: {
          if (sk.field_d == null) {
            sk.field_d = ca.field_c.a(ej.field_b, 4, cn.field_h);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param1 == 0) {
            break L1;
          } else {
            field_b = (ed[][]) null;
            break L1;
          }
        }
        if (-1 != (sk.field_d.field_f ^ -1)) {
          L2: {
            dupTemp$2 = td.b(128);
            le.field_c = dupTemp$2;
            field_a = dupTemp$2;
            if (-2 != (sk.field_d.field_f ^ -1)) {
              break L2;
            } else {
              break L2;
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
        field_c = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_b = new ed[7][4];
    }
}
