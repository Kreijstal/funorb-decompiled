/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class cd {
    static uf field_d;
    static String field_c;
    static int field_b;
    static int[] field_f;
    static hj[] field_a;
    static byte[][] field_e;

    final static String a(int param0, long param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        kn.field_f.setTime(new Date(param1));
        var3 = kn.field_f.get(7);
        var4 = kn.field_f.get(5);
        var5 = kn.field_f.get(2);
        var6 = kn.field_f.get(1);
        if (param0 <= 43) {
          return (String) null;
        } else {
          var7 = kn.field_f.get(11);
          var8 = kn.field_f.get(12);
          var9 = kn.field_f.get(13);
          return tm.field_b[var3 + -1] + ", " + var4 / 10 + var4 % 10 + "-" + eb.field_n[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
    }

    final static void b(int param0) {
        int var1_int = 0;
        int var2 = 0;
        int[] array$0 = null;
        int[] array$1 = null;
        int[] array$2 = null;
        int var3 = 0;
        int var4 = HoldTheLine.field_D;
        try {
            hk.field_c = new int[4][];
            d.field_c = new int[4];
            on.field_v = new int[4][];
            ha.field_j = new int[4][];
            for (var1_int = 0; -5 < (var1_int ^ -1); var1_int++) {
                var2 = pc.field_l[var1_int];
                array$0 = new int[var2];
                hk.field_c[var1_int] = array$0;
                array$1 = new int[var2];
                on.field_v[var1_int] = array$1;
                array$2 = new int[var2];
                ha.field_j[var1_int] = array$2;
                for (var3 = 0; var2 > var3; var3++) {
                    hk.field_c[var1_int][var3] = -1;
                    on.field_v[var1_int][var3] = -1;
                    ha.field_j[var1_int][var3] = 3;
                }
                d.field_c[var1_int] = -1;
            }
            ao.field_b = 0;
            on.field_s = true;
            ad.field_a = false;
            nd.field_e = true;
            if (param0 < 100) {
                field_a = (hj[]) null;
            }
            hk.field_d = 0;
            ij.field_l = true;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "cd.F(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        String discarded$2 = null;
        field_d = null;
        field_f = null;
        field_c = null;
        field_a = null;
        if (param0 != 1) {
          discarded$2 = cd.a(93, -81L);
          field_e = (byte[][]) null;
          return;
        } else {
          field_e = (byte[][]) null;
          return;
        }
    }

    final static void a(int param0, String param1) {
        System.out.println("Error: " + vn.a("\n", "%0a", param0 + -75, param1));
        if (param0 != 12) {
            cd.b(-37);
        }
    }

    final static void a(hj param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            var9_int = -param7 + param2 + param8 + param0.field_u;
            var10 = param4 + (param0.field_u + (param8 + param2));
            var11 = param3 + param0.field_x + (param0.field_y >> -1214942943);
            tc.e(var9_int, 0, var10, var11 - -param5);
            param0.b(-1 + param8, -1 + param3, param6);
            param0.b(param8 - 1, 1 + param3, param6);
            tc.a(bd.field_R);
            tc.e(var9_int + 1, 0, var10 - -1, param5 + var11);
            param0.b(param8 - -1, param3 + -1, param6);
            param0.b(1 + param8, param3 - -1, param6);
            tc.a(bd.field_R);
            var9_int = param8 + (param0.field_u + param0.field_s) - (param2 + param4);
            var10 = -param2 + param8 + (param0.field_u + param0.field_s) - param7;
            tc.e(var9_int, var11 + -param5, var10, 480);
            if (param1 > 111) {
              param0.b(-1 + param8, param3 + -1, param6);
              param0.b(param8 + -1, 1 + param3, param6);
              tc.a(bd.field_R);
              tc.e(1 + var9_int, var11 + -param5, 1 + var10, 480);
              param0.b(param8 + 1, -1 + param3, param6);
              param0.b(1 + param8, param3 + 1, param6);
              tc.a(bd.field_R);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var9);
            stackOut_4_1 = new StringBuilder().append("cd.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static float a(wc[] param0, int param1, float param2) {
        RuntimeException var3 = null;
        float stackIn_2_0 = 0.0f;
        float stackIn_4_0 = 0.0f;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        float stackOut_3_0 = 0.0f;
        float stackOut_1_0 = 0.0f;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 == 1) {
              stackOut_3_0 = tf.a((byte) 117, param2, param0) / ce.a(-1, param0);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = -0.11478078365325928f;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("cd.C(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static sh a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        sh var8 = null;
        int var9 = 0;
        sh stackIn_4_0 = null;
        sh stackIn_7_0 = null;
        sh stackIn_11_0 = null;
        sh stackIn_17_0 = null;
        sh stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        sh stackOut_3_0 = null;
        sh stackOut_10_0 = null;
        sh stackOut_19_0 = null;
        sh stackOut_16_0 = null;
        sh stackOut_6_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var9 = HoldTheLine.field_D;
        try {
          L0: {
            var2_int = param1.length();
            if (var2_int == 0) {
              stackOut_3_0 = fo.field_k;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-256 <= (var2_int ^ -1)) {
                var3 = fl.a(param1, (byte) -126, '.');
                if (-3 < (var3.length ^ -1)) {
                  stackOut_10_0 = fo.field_k;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var5 = -111 / ((param0 - -56) / 44);
                  var4 = var3;
                  var6 = 0;
                  L1: while (true) {
                    if (var4.length <= var6) {
                      stackOut_19_0 = qg.a(var3[-1 + var3.length], 124);
                      stackIn_20_0 = stackOut_19_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      var7 = var4[var6];
                      var8 = pk.a((byte) -102, var7);
                      if (var8 != null) {
                        stackOut_16_0 = (sh) (var8);
                        stackIn_17_0 = stackOut_16_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        var6++;
                        continue L1;
                      }
                    }
                  }
                }
              } else {
                stackOut_6_0 = wb.field_h;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var2);
            stackOut_21_1 = new StringBuilder().append("cd.E(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L2;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_17_0;
              } else {
                return stackIn_20_0;
              }
            }
          }
        }
    }

    static {
        field_c = "Click to add or remove AI racers";
        field_e = new byte[250][];
    }
}
