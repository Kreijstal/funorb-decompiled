/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fc {
    static w field_f;
    static int[] field_d;
    static w field_c;
    static int[] field_b;
    static long field_h;
    static int field_a;
    static String field_g;
    static int field_e;

    final static void a(int param0, byte param1, boolean param2, int param3) {
        L0: {
          fl.a(param0 - -20, 256, 16777215, ug.field_n, param3 - -4, (mm) (Object) w.field_kb);
          param0 += 26;
          fl.a(12 + param0, 256, 16777215, vk.field_b[0], 4 + param3, (mm) (Object) se.field_S);
          ph.field_yb[0].c(122 + param3, param0);
          param0 += 16;
          fl.a(12 + param0, 256, 16777215, vk.field_b[1], param3 - -4, (mm) (Object) se.field_S);
          ph.field_yb[1].c(param3 + 122, param0);
          param0 += 23;
          fl.a(12 + param0, 256, 16777215, vk.field_b[2], 4 + param3, (mm) (Object) se.field_S);
          ph.field_yb[3].c(122 + param3, param0);
          param0 += 16;
          fl.a(param0 - -12, 256, 16777215, vk.field_b[3], 4 + param3, (mm) (Object) se.field_S);
          ph.field_yb[2].c(param3 + 100, param0);
          ed.a(16777215, 119 + param3, "/", 12 + param0, (byte) 75, (mm) (Object) se.field_S);
          ph.field_yb[4].c(122 + param3, param0);
          param0 += 23;
          fl.a(param0 + 12, 256, 16777215, vk.field_b[5], param3 - -4, (mm) (Object) se.field_S);
          ph.field_yb[5].c(122 + param3, param0);
          param0 += 23;
          if (param2) {
            fl.a(12 + param0, 256, 16777215, vk.field_b[6], 4 + param3, (mm) (Object) se.field_S);
            ph.field_yb[6].c(param3 + 122, param0);
            break L0;
          } else {
            break L0;
          }
        }
    }

    final static void a(int param0, boolean param1) {
        if (ea.d((byte) 80)) {
            param1 = false;
        }
        int discarded$0 = 1;
        cg.b(param1);
        int discarded$1 = 54;
        ub.a();
    }

    public static void a(int param0) {
        field_d = null;
        field_g = null;
        field_c = null;
        field_f = null;
        field_b = null;
    }

    final static ck[] a(int param0, ck param1) {
        RuntimeException var3 = null;
        ck[] var3_array = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ck var8 = null;
        int[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        ck[] stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        ck[] stackOut_12_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var16 = client.field_A ? 1 : 0;
        try {
          L0: {
            var3_array = new ck[31];
            var4 = param1.field_D;
            var5 = param1.field_K / 31;
            var6 = param1.field_I - var5;
            var7 = 0;
            L1: while (true) {
              if (var7 >= 31) {
                stackOut_12_0 = (ck[]) var3_array;
                stackIn_13_0 = stackOut_12_0;
                break L0;
              } else {
                ck dupTemp$3 = new ck(var5, param1.field_H);
                var3_array[var7] = dupTemp$3;
                var8 = dupTemp$3;
                var9 = var8.field_D;
                var10 = var7 * var5 + param1.field_F;
                var11 = param1.field_z;
                var12 = var11 * var5 + var10;
                var13 = 0;
                var14 = -param1.field_H;
                L2: while (true) {
                  if (var14 >= 0) {
                    var7++;
                    continue L1;
                  } else {
                    var15 = -var5;
                    L3: while (true) {
                      if (var15 >= 0) {
                        var12 = var12 + var6;
                        var14++;
                        continue L2;
                      } else {
                        int incrementValue$4 = var13;
                        var13++;
                        int incrementValue$5 = var12;
                        var12++;
                        var9[incrementValue$4] = var4[incrementValue$5];
                        var15++;
                        continue L3;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("fc.B(").append(31).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + -10241 + ')');
        }
        return stackIn_13_0;
    }

    final static boolean a(byte param0, String param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var4 = client.field_A ? 1 : 0;
        try {
          try {
            if (!fd.field_d.startsWith("win")) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L0: {
                if (param1.startsWith("http://")) {
                  break L0;
                } else {
                  if (param1.startsWith("https://")) {
                    break L0;
                  } else {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0 != 0;
                  }
                }
              }
              var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
              var3 = 0;
              L1: while (true) {
                if (var3 >= param1.length()) {
                  Process discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                  stackOut_18_0 = 1;
                  stackIn_19_0 = stackOut_18_0;
                  return stackIn_19_0 != 0;
                } else {
                  if (var2.indexOf((int) param1.charAt(var3)) != -1) {
                    var3++;
                    continue L1;
                  } else {
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0 != 0;
                  }
                }
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            stackOut_20_0 = 0;
            stackIn_21_0 = stackOut_20_0;
            return stackIn_21_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L2: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2_ref2;
            stackOut_22_1 = new StringBuilder().append("fc.F(").append(-19).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L2;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L2;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
        }
    }

    final static void a() {
        try {
            int var1_int = 0;
            RuntimeException var1 = null;
            int var2 = 0;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            var4 = client.field_A ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (ta.field_k == null) {
                    break L1;
                  } else {
                    ta.field_k.d((byte) 117);
                    break L1;
                  }
                }
                L2: {
                  if (qb.field_r == null) {
                    break L2;
                  } else {
                    qb.field_r.a((byte) -98);
                    break L2;
                  }
                }
                L3: {
                  if (null != mk.field_d) {
                    {
                      L4: {
                        mk.field_d.c((byte) 124);
                        break L4;
                      }
                    }
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L6: {
                  var1_int = 0;
                  if (null != ig.field_cc) {
                    var2 = 0;
                    L7: while (true) {
                      if (ig.field_cc.length <= var2) {
                        break L6;
                      } else {
                        L8: {
                          if (ig.field_cc[var2] != null) {
                            {
                              L9: {
                                ig.field_cc[var2].c((byte) 125);
                                break L9;
                              }
                            }
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var2++;
                        continue L7;
                      }
                    }
                  } else {
                    break L6;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (RuntimeException) (Object) decompiledCaughtException;
              throw dh.a((Throwable) (Object) var1, "fc.C(" + 67 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[8192];
        field_g = "Cancel";
        field_b = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    }
}
