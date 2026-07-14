/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ji extends uf {
    static int field_k;
    static ci[] field_j;
    int field_i;
    int field_h;

    final static int a(int param0, int param1, int param2, int param3, String param4, byte param5, int param6) {
        Object var8 = null;
        if (param5 < 59) {
          var8 = null;
          nb discarded$2 = ji.a(74, (String) null, false, (String) null);
          return og.field_f.a(param4, param0, param3 - 20, -param0 + param6, 480, param2, -1, 0, 0, param1);
        } else {
          return og.field_f.a(param4, param0, param3 - 20, -param0 + param6, 480, param2, -1, 0, 0, param1);
        }
    }

    private ji() throws Throwable {
        throw new Error();
    }

    final static boolean a(byte param0, q param1, q param2) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          var4 = Terraphoenix.field_V;
          var3 = -param2.field_Mb + param1.field_Mb;
          if (param1.field_Eb == ml.field_t) {
            // wide iinc 3 -200
            break L0;
          } else {
            if (param1.field_Eb != null) {
              break L0;
            } else {
              // wide iinc 3 200
              break L0;
            }
          }
        }
        if (param2.field_Eb == ml.field_t) {
          // wide iinc 3 200
          if (param0 == -19) {
            L1: {
              if (0 >= var3) {
                stackOut_26_0 = 0;
                stackIn_27_0 = stackOut_26_0;
                break L1;
              } else {
                stackOut_25_0 = 1;
                stackIn_27_0 = stackOut_25_0;
                break L1;
              }
            }
            return stackIn_27_0 != 0;
          } else {
            L2: {
              field_k = -9;
              if (0 >= var3) {
                stackOut_22_0 = 0;
                stackIn_23_0 = stackOut_22_0;
                break L2;
              } else {
                stackOut_21_0 = 1;
                stackIn_23_0 = stackOut_21_0;
                break L2;
              }
            }
            return stackIn_23_0 != 0;
          }
        } else {
          if (null != param2.field_Eb) {
            L3: {
              if (param0 == -19) {
                break L3;
              } else {
                field_k = -9;
                break L3;
              }
            }
            L4: {
              if (0 >= var3) {
                stackOut_16_0 = 0;
                stackIn_17_0 = stackOut_16_0;
                break L4;
              } else {
                stackOut_15_0 = 1;
                stackIn_17_0 = stackOut_15_0;
                break L4;
              }
            }
            return stackIn_17_0 != 0;
          } else {
            L5: {
              // wide iinc 3 -200
              if (param0 == -19) {
                break L5;
              } else {
                field_k = -9;
                break L5;
              }
            }
            L6: {
              if (0 >= var3) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L6;
              } else {
                stackOut_9_0 = 1;
                stackIn_11_0 = stackOut_9_0;
                break L6;
              }
            }
            return stackIn_11_0 != 0;
          }
        }
    }

    final static void a(int param0, boolean param1, int param2, boolean param3, int param4, String param5, long param6, he param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        try {
            int var15 = 0;
            IOException var16 = null;
            int stackIn_3_0 = 0;
            int stackIn_6_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_2_0 = 0;
            int stackOut_1_0 = 0;
            int stackOut_5_0 = 0;
            int stackOut_4_0 = 0;
            L0: {
              mk.field_j = new uc(param9);
              di.field_l = new uc(param8);
              nd.field_i = param13;
              if (!param1) {
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
              jm.field_c = stackIn_3_0 != 0;
              sb.field_i = param2;
              if (!param3) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
            hf.field_x = stackIn_6_0 != 0;
            gi.field_v = param11;
            pc.field_a = param6;
            pg.field_f = param0;
            var15 = 61 % ((-9 - param4) / 59);
            ij.field_d = param12;
            wa.field_t = param5;
            da.field_g = param7;
            hb.field_i = param10;
            if (null == da.field_g.field_m) {
              var16 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(var16.toString());
            } else {
              try {
                mh.field_b = new ak(da.field_g.field_m, 64, 0);
              } catch (java.io.IOException decompiledCaughtParameter) {
                decompiledCaughtException = decompiledCaughtParameter;
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static StringBuilder a(char param0, StringBuilder param1, byte param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Terraphoenix.field_V;
        var4 = param1.length();
        param1.setLength(param3);
        var5 = var4;
        L0: while (true) {
          if (param3 <= var5) {
            if (param2 != 110) {
              field_j = null;
              return param1;
            } else {
              return param1;
            }
          } else {
            param1.setCharAt(var5, param0);
            var5++;
            continue L0;
          }
        }
    }

    final static nb a(int param0, String param1, boolean param2, String param3) {
        CharSequence var7 = null;
        long var4 = 0L;
        String var6 = null;
        if (param0 != param1.indexOf('@')) {
            var6 = param1;
        } else {
            var7 = (CharSequence) (Object) param1;
            var4 = qd.a(-81, var7);
        }
        return nh.a(var4, param2, -63, param3, var6);
    }

    public static void a(int param0) {
        if (param0 != 19061) {
            ji.a(-117);
            field_j = null;
            return;
        }
        field_j = null;
    }

    static {
    }
}
