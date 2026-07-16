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
            byte[][][] discarded$0 = sl.a((mf) null, (mf) null, (int[]) null, (byte[][][]) null, -11, 8);
        }
        field_b = null;
        field_d = null;
    }

    final static byte[][][] a(mf param0, mf param1, int[] param2, byte[][][] param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        byte[][][] var11 = null;
        byte[][][] var13 = null;
        byte[][] var14 = null;
        L0: {
          var10 = EscapeVector.field_A;
          var6 = dh.field_e.length;
          if (param3 != null) {
            break L0;
          } else {
            var13 = new byte[var6][][];
            var11 = var13;
            param3 = var11;
            break L0;
          }
        }
        var7 = param5;
        L1: while (true) {
          if (var7 >= var6) {
            return param3;
          } else {
            var8 = dh.field_e[var7];
            if (param4 == var8) {
              if (param3[var7] == null) {
                var14 = ol.a(-51, param1, param2, var7, param0);
                param3[var7] = var14;
                var7++;
                continue L1;
              } else {
                var7++;
                continue L1;
              }
            } else {
              var7++;
              continue L1;
            }
          }
        }
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
          if ((var8.e(param1 ^ param1) ^ -1) != -2) {
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
        L1: {
          if (param1 == 0) {
            break L1;
          } else {
            field_b = null;
            break L1;
          }
        }
        if (-1 != sk.field_d.field_f) {
          L2: {
            long dupTemp$2 = td.b(128);
            le.field_c = dupTemp$2;
            field_a = dupTemp$2;
            if (-2 != sk.field_d.field_f) {
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_b = new ed[7][4];
    }
}
