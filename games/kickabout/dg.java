/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class dg {
    static java.util.zip.CRC32 field_b;
    static String field_f;
    static boolean field_a;
    private ut[] field_d;
    static boolean field_e;
    static String field_c;

    void a(int param0, int param1, int param2, int param3, int param4) {
        ea.a(param2, param1, param0, (byte) 22, ((dg) this).field_d, param3);
        if (param4 != 3) {
            Object var7 = null;
            dg.a((byte) -66, -25, -85, (up) null);
        }
    }

    final static void a(byte param0, int param1, int param2, up param3) {
        RuntimeException runtimeException = null;
        Object var5 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              np.field_Jb.a((gn) (Object) new rt(param2, param1, param3), 3);
              if (param0 == -120) {
                break L1;
              } else {
                var5 = null;
                dg.a((byte) 119, -53, 107, (up) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("dg.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param3 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final static String a(byte param0, int param1, long param2, boolean param3, int param4) {
        String var7 = null;
        String var8 = null;
        String var9 = null;
        StringBuilder var10 = null;
        int var11 = 0;
        int var12_int = 0;
        StringBuilder var12 = null;
        int var13 = 0;
        StringBuilder var14 = null;
        L0: {
          var13 = Kickabout.field_G;
          var14 = new StringBuilder(0);
          if (0L <= param2) {
            break L0;
          } else {
            StringBuilder discarded$5 = var14.append("-");
            param2 = -param2;
            break L0;
          }
        }
        L1: {
          var7 = ".";
          var8 = ",";
          if (param4 == 1) {
            var8 = ".";
            var7 = ",";
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (2 != param4) {
            break L2;
          } else {
            var8 = hp.field_a;
            var7 = ",";
            break L2;
          }
        }
        L3: {
          if (3 != param4) {
            break L3;
          } else {
            var8 = ".";
            var7 = var8;
            var9 = var7;
            var7 = var8;
            var7 = ",";
            break L3;
          }
        }
        L4: {
          if (param4 != 4) {
            break L4;
          } else {
            var7 = ",";
            var9 = var7;
            var9 = var7;
            var8 = ".";
            var9 = var8;
            var9 = var8;
            break L4;
          }
        }
        var10 = new StringBuilder(0);
        var11 = 0;
        L5: while (true) {
          if (param1 <= var11) {
            L6: {
              var12_int = 40 / ((param0 - -70) / 34);
              var11 = 0;
              if (param2 == 0L) {
                var9 = "0";
                break L6;
              } else {
                var12 = new StringBuilder(0);
                L7: while (true) {
                  if (param2 <= 0L) {
                    var9 = var12.toString();
                    break L6;
                  } else {
                    L8: {
                      if (!param3) {
                        break L8;
                      } else {
                        if (0 == var11) {
                          break L8;
                        } else {
                          if (var11 % 3 != 0) {
                            break L8;
                          } else {
                            StringBuilder discarded$6 = var12.append(var8);
                            break L8;
                          }
                        }
                      }
                    }
                    StringBuilder discarded$7 = var12.append(Integer.toString((int)(param2 % 10L)));
                    param2 = param2 / 10L;
                    var11++;
                    continue L7;
                  }
                }
              }
            }
            if (0 < var10.length()) {
              StringBuilder discarded$8 = var10.append(var7);
              return var14.toString() + bo.a(-1, var9) + bo.a(-1, var10.toString());
            } else {
              return var14.toString() + bo.a(-1, var9) + bo.a(-1, var10.toString());
            }
          } else {
            StringBuilder discarded$9 = var10.append(Integer.toString((int)(param2 % 10L)));
            param2 = param2 / 10L;
            var11++;
            continue L5;
          }
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        int var1 = 0;
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Please log in to access this feature.";
        field_e = true;
        field_a = true;
        field_b = new java.util.zip.CRC32();
    }
}
