/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ee {
    static boolean field_b;
    static boolean field_a;

    final static String a(char param0, String param1, String param2, int param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String stackIn_10_0 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param2.length();
              var5 = param1.length();
              var6 = var4_int;
              var7 = var5 - 1;
              if (-1 == (var7 ^ -1)) {
                break L1;
              } else {
                var8_int = 0;
                L2: while (true) {
                  var8_int = param2.indexOf((int) param0, var8_int);
                  if (-1 < (var8_int ^ -1)) {
                    break L1;
                  } else {
                    var8_int++;
                    var6 = var6 + var7;
                    continue L2;
                  }
                }
              }
            }
            var8 = new StringBuilder(var6);
            var9 = 0;
            L3: while (true) {
              var10 = param2.indexOf((int) param0, var9);
              if (-1 < (var10 ^ -1)) {
                if (param3 <= -36) {
                  discarded$3 = var8.append(param2.substring(var9));
                  stackIn_12_0 = var8.toString();
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_10_0 = (String) null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                discarded$4 = var8.append(param2.substring(var9, var10));
                discarded$5 = var8.append(param1);
                var9 = var10 - -1;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("ee.E(").append(param0).append(',');

            if (param1 == null) {
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

            if (param2 == null) {
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
          throw fa.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          return stackIn_12_0;
        }
    }

    final static fc a(byte[] param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        fc stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var2_int = 90000;
            var3 = 10;
            var4 = 0;
            var5 = new byte[param0.length + 12];
            nn.a(-107, 0, var5, ql.a(param1, 0, param0));
            nn.a(-124, 1, var5, var4);
            nn.a(-101, 2, var5, var2_int);
            nn.a(-113, 3, var5, var3);
            var6 = 1;
            L1: while (true) {
              if (var6 >= param0.length / 4) {
                stackIn_5_0 = nn.a(-93, var5);
                break L0;
              } else {
                nn.a(-115, 3 + var6, var5, ql.a(true, var6, param0));
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("ee.B(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0;
    }

    final static boolean a(boolean param0, boolean param1) {
        long dupTemp$2 = 0L;
        L0: {
          if (wp.field_g == null) {
            wp.field_g = ok.field_m.a(tm.field_c, jo.field_b, (byte) -120);
            break L0;
          } else {
            break L0;
          }
        }
        if (-1 != (wp.field_g.field_f ^ -1)) {
          dupTemp$2 = bl.a((byte) 90);
          cf.field_g = dupTemp$2;
          mo.field_Gb = dupTemp$2;
          if (!param1) {
            L1: {
              if ((wp.field_g.field_f ^ -1) != -2) {
                break L1;
              } else {
                break L1;
              }
            }
            vo.field_l = sb.field_i;
            wp.field_g = null;
            return true;
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static lm a(int param0, int param1, int param2, boolean param3) {
        if (!param3) {
            field_b = false;
        }
        if (19 == param0) {
            return null;
        }
        return (lm) ((Object) new od(param2, param1, param0));
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, boolean param5, boolean param6, int param7, boolean param8, int param9, int param10, boolean param11, int param12, boolean param13) {
        ui.field_j = null;
        no.c((byte) 75);
        param8 = ih.a(param10, 4, param3, param2, param7, param8, param4);
        el.a(param9, param13, param12, 2, param8, param0, param6, param2, param5, param11);
        if (!param1) {
            ee.a(-102, true, -123, -91, -93, false, false, -65, false, 82, -99, true, 54, true);
        }
        bg.a(param12, (byte) 101, param6);
        ig.a((byte) -114, param12, param8, param7);
    }

    static {
        field_b = false;
    }
}
