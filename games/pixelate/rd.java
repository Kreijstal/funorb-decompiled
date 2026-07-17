/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rd extends fa {
    static byte[] field_l;
    int field_k;
    int field_m;

    public static void a(int param0) {
        field_l = null;
        if (param0 != -5778) {
            Object var2 = null;
            rd.a(-60, (we) null);
        }
    }

    final static void a(int param0, int param1, byte param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        RuntimeException var10 = null;
        int[] var10_array = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var16 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              param0--;
              if (param0 < 0) {
                if (param2 <= -92) {
                  break L0;
                } else {
                  rd.a(true, 41, true);
                  return;
                }
              } else {
                var17 = param3;
                var10_array = var17;
                var11 = param1;
                var12 = param8;
                var13 = param4;
                var14 = param7;
                var15 = 8355711 & var17[var11] >> 1;
                var10_array[var11] = (cm.a(33423531, var13) >> 9) + cm.a(var12 >> 1, 16711680) + cm.a(255, var14 >> 17) + var15;
                param1++;
                param7 = param7 + param6;
                param4 = param4 + param9;
                param8 = param8 + param5;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var10 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var10;
            stackOut_6_1 = new StringBuilder().append("rd.D(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 41);
        }
    }

    final static void a(String param0, int param1, java.applet.Applet param2) {
        try {
            Throwable var3 = null;
            RuntimeException var3_ref = null;
            String var4 = null;
            String var5 = null;
            Object var6 = null;
            String var7 = null;
            String var8 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            try {
              L0: {
                jp.field_c = param0;
                try {
                  L1: {
                    L2: {
                      if (param1 > 124) {
                        break L2;
                      } else {
                        var6 = null;
                        rd.a((String) null, -73, (java.applet.Applet) null);
                        break L2;
                      }
                    }
                    L3: {
                      var7 = param2.getParameter("cookieprefix");
                      var5 = var7;
                      var5 = var7;
                      var4 = param2.getParameter("cookiehost");
                      var5 = var4;
                      var5 = var4;
                      var8 = var7 + "settings=" + param0 + "; version=1; path=/; domain=" + var4;
                      var5 = var8;
                      var5 = var8;
                      if (param0.length() == 0) {
                        var5 = var8 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                        break L3;
                      } else {
                        var5 = var8 + "; Expires=" + po.a(10, hm.a(64) + 94608000000L) + "; Max-Age=" + 94608000L;
                        break L3;
                      }
                    }
                    cq.a(param2, (byte) -121, "document.cookie=\"" + var5 + "\"");
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var3 = decompiledCaughtException;
                    break L4;
                  }
                }
                int discarded$1 = 0;
                ib.a(param2);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_11_0 = (RuntimeException) var3_ref;
                stackOut_11_1 = new StringBuilder().append("rd.A(");
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                if (param0 == null) {
                  stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                  stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                  stackOut_13_2 = "null";
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  break L5;
                } else {
                  stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                  stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                  stackOut_12_2 = "{...}";
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  break L5;
                }
              }
              L6: {
                stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44).append(param1).append(44);
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                if (param2 == null) {
                  stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                  stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                  stackOut_16_2 = "null";
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  break L6;
                } else {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "{...}";
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  break L6;
                }
              }
              throw aa.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0, int param1, boolean param2) {
        if (param1 != -17130) {
          field_l = null;
          vn.a(param1 ^ 17146, param0, param2, (String) null);
          return;
        } else {
          vn.a(param1 ^ 17146, param0, param2, (String) null);
          return;
        }
    }

    final static boolean a(int param0, boolean param1) {
        try {
            if (!(param0 > vi.field_o.field_m)) {
                return true;
            }
            if (!(null != sh.field_e)) {
                return false;
            }
            int var2_int = sh.field_e.a(-70);
            if (!(var2_int <= 0)) {
                if (!(-vi.field_o.field_m + param0 >= var2_int)) {
                    var2_int = param0 - vi.field_o.field_m;
                }
                sh.field_e.a(vi.field_o.field_k, vi.field_o.field_m, (byte) 119, var2_int);
                jc.field_c = hm.a(64);
                vi.field_o.field_m = vi.field_o.field_m + var2_int;
                if (param0 > vi.field_o.field_m) {
                    return false;
                }
                vi.field_o.field_m = 0;
                return true;
            }
            {
                if (var2_int >= 0) {
                    int discarded$3 = 8;
                    if (no.d() <= 30000L) {
                        return false;
                    }
                }
                na.a(true);
            }
            return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, we param1) {
        int var2_int = 0;
        try {
            if (param0 > -111) {
                rd.a(-27);
            }
            aj.field_n = param1.a((byte) -121) << 5;
            var2_int = param1.f(255);
            bq.field_c = (7 & var2_int) << 18;
            aj.field_n = aj.field_n + (var2_int >> 3);
            bq.field_c = bq.field_c + (param1.a((byte) 47) << 2);
            var2_int = param1.f(255);
            bq.field_c = bq.field_c + (var2_int >> 6);
            of.field_g = var2_int << 15 & 2064384;
            of.field_g = of.field_g + (param1.f(255) << 7);
            var2_int = param1.f(255);
            of.field_b = var2_int << 16 & 65536;
            of.field_g = of.field_g + (var2_int >> 1);
            of.field_b = of.field_b + param1.a((byte) 96);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "rd.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    rd() {
    }

    static {
    }
}
