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
        Object var5 = null;
        L0: {
          fl.a(param0 - -20, 256, 16777215, ug.field_n, param3 - -4, (mm) (Object) w.field_kb);
          param0 += 26;
          fl.a(12 + param0, 256, 16777215, vk.field_b[0], 4 + param3, (mm) (Object) se.field_S);
          ph.field_yb[0].c(122 + param3, param0);
          param0 += 16;
          fl.a(12 + param0, param1 ^ 261, 16777215, vk.field_b[1], param3 - -4, (mm) (Object) se.field_S);
          ph.field_yb[1].c(param3 + 122, param0);
          param0 += 23;
          if (param1 == 5) {
            break L0;
          } else {
            var5 = null;
            boolean discarded$1 = fc.a((byte) 7, (String) null);
            break L0;
          }
        }
        L1: {
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
            break L1;
          } else {
            break L1;
          }
        }
    }

    final static void a(int param0, boolean param1) {
        if (ea.d((byte) 80)) {
            param1 = false;
        }
        cg.b(param1, 1);
        ub.a((byte) 54);
        if (param0 != 5) {
            field_g = null;
        }
    }

    public static void a(int param0) {
        if (param0 < 26) {
            return;
        }
        field_d = null;
        field_g = null;
        field_c = null;
        field_f = null;
        field_b = null;
    }

    final static ck[] a(int param0, ck param1, int param2) {
        int var7 = 0;
        ck var8 = null;
        int[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = client.field_A ? 1 : 0;
        ck[] var3 = new ck[param0];
        int[] var4 = param1.field_D;
        int var5 = param1.field_K / param0;
        if (param2 != -10241) {
            return null;
        }
        int var6 = param1.field_I - var5;
        for (var7 = 0; var7 < param0; var7++) {
            ck dupTemp$0 = new ck(var5, param1.field_H);
            var3[var7] = dupTemp$0;
            var8 = dupTemp$0;
            var9 = var8.field_D;
            var10 = var7 * var5 + param1.field_F;
            var11 = param1.field_z;
            var12 = var11 * var5 + var10;
            var13 = 0;
            for (var14 = -param1.field_H; (var14 ^ -1) > -1; var14++) {
                for (var15 = -var5; -1 < (var15 ^ -1); var15++) {
                    int incrementValue$1 = var13;
                    var13++;
                    int incrementValue$2 = var12;
                    var12++;
                    var9[incrementValue$1] = var4[incrementValue$2];
                }
                var12 = var12 + var6;
            }
        }
        return var3;
    }

    final static boolean a(byte param0, String param1) {
        String var2 = null;
        Exception var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_12_0 = 0;
        var4 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (!fd.field_d.startsWith("win")) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (param1.startsWith("http://")) {
                  break L1;
                } else {
                  if (param1.startsWith("https://")) {
                    break L1;
                  } else {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0 != 0;
                  }
                }
              }
              var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
              var3 = 0;
              L2: while (true) {
                if (var3 >= param1.length()) {
                  Process discarded$11 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                  if (param0 == -19) {
                    stackOut_18_0 = 1;
                    stackIn_19_0 = stackOut_18_0;
                    break L0;
                  } else {
                    stackOut_16_0 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    return stackIn_17_0 != 0;
                  }
                } else {
                  if (0 != (var2.indexOf((int) param1.charAt(var3)) ^ -1)) {
                    var3++;
                    continue L2;
                  } else {
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0 != 0;
                  }
                }
              }
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = (Exception) (Object) decompiledCaughtException;
          return false;
        }
        return stackIn_19_0 != 0;
    }

    final static void a(byte param0) {
        try {
            IOException iOException = null;
            int var1 = 0;
            int var2 = 0;
            IOException var3 = null;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              var4 = client.field_A ? 1 : 0;
              if (ta.field_k == null) {
                break L0;
              } else {
                ta.field_k.d((byte) 117);
                break L0;
              }
            }
            L1: {
              if (qb.field_r == null) {
                break L1;
              } else {
                qb.field_r.a((byte) -98);
                break L1;
              }
            }
            L2: {
              if (null != mk.field_d) {
                try {
                  L3: {
                    mk.field_d.c((byte) 124);
                    break L3;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    iOException = (IOException) (Object) decompiledCaughtException;
                    break L4;
                  }
                }
                break L2;
              } else {
                break L2;
              }
            }
            L5: {
              var1 = -32 % ((param0 - -41) / 50);
              if (null != ig.field_cc) {
                var2 = 0;
                L6: while (true) {
                  if (ig.field_cc.length <= var2) {
                    break L5;
                  } else {
                    if (ig.field_cc[var2] != null) {
                      try {
                        L7: {
                          ig.field_cc[var2].c((byte) 125);
                          var2++;
                          break L7;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter1) {
                        decompiledCaughtException = decompiledCaughtParameter1;
                        L8: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          var2++;
                          break L8;
                        }
                      }
                      continue L6;
                    } else {
                      var2++;
                      continue L6;
                    }
                  }
                }
              } else {
                break L5;
              }
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
