/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qe extends ln {
    static String field_h;
    static ol field_g;

    public static void a(int param0) {
        Object var2 = null;
        if (param0 != 17659) {
          var2 = null;
          qe.a(-128, (java.applet.Applet) null);
          field_h = null;
          field_g = null;
          return;
        } else {
          field_h = null;
          field_g = null;
          return;
        }
    }

    qe(String param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3);
    }

    final static String a(byte param0, char param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        StringBuilder var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = CrazyCrystals.field_B;
          if (param0 == 36) {
            break L0;
          } else {
            qe.a(10);
            break L0;
          }
        }
        var4 = param2.length();
        var5 = param3.length();
        var6 = var4;
        var7 = -1 + var5;
        if (0 == var7) {
          var8 = new StringBuilder(var6);
          var9 = 0;
          L1: while (true) {
            var10 = param2.indexOf((int) param1, var9);
            if (-1 < (var10 ^ -1)) {
              StringBuilder discarded$6 = var8.append(param2.substring(var9));
              return var8.toString();
            } else {
              StringBuilder discarded$7 = var8.append(param2.substring(var9, var10));
              var9 = var10 + 1;
              StringBuilder discarded$8 = var8.append(param3);
              continue L1;
            }
          }
        } else {
          var8_int = 0;
          L2: while (true) {
            var8_int = param2.indexOf((int) param1, var8_int);
            if (-1 >= (var8_int ^ -1)) {
              var8_int++;
              var6 = var6 + var7;
              continue L2;
            } else {
              var8 = new StringBuilder(var6);
              var9 = 0;
              L3: while (true) {
                var10 = param2.indexOf((int) param1, var9);
                if (-1 < (var10 ^ -1)) {
                  StringBuilder discarded$9 = var8.append(param2.substring(var9));
                  return var8.toString();
                } else {
                  StringBuilder discarded$10 = var8.append(param2.substring(var9, var10));
                  var9 = var10 + 1;
                  StringBuilder discarded$11 = var8.append(param3);
                  continue L3;
                }
              }
            }
          }
        }
    }

    final int a(int param0, byte param1) {
        int var3 = 0;
        var3 = 59 % ((55 - param1) / 50);
        if (1 < ((qe) this).field_c) {
          if ((rl.field_h & 1 << param0) == 0) {
            return 0;
          } else {
            return 1;
          }
        } else {
          return 0;
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            String var4 = null;
            int var3 = 0;
            java.net.URL var5 = null;
            try {
                var2 = param1.getDocumentBase().getFile();
                var4 = var2;
                var4 = var2;
                var3 = var2.indexOf('?');
                var4 = "reload.ws";
                if (var3 >= param0) {
                    var4 = var4 + var2.substring(var3);
                }
                var5 = new java.net.URL(param1.getCodeBase(), var4);
                param1.getAppletContext().showDocument(gh.a(param1, var5, (byte) 67), "_self");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0, boolean param1, int param2, un param3, int param4, int param5, int param6, long param7, int param8, int param9, String param10, boolean param11, int param12, int param13) {
        try {
            IOException var15 = null;
            int stackIn_5_0 = 0;
            int stackIn_8_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_4_0 = 0;
            int stackOut_3_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_6_0 = 0;
            kd.field_n = new md(param6);
            tp.field_f = new md(param4);
            gj.field_l = param13;
            gf.field_b = param3;
            kl.field_T = param8;
            vn.field_f = param9;
            if (param0 <= -70) {
              L0: {
                fe.field_j = param2;
                if (!param1) {
                  stackOut_4_0 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  break L0;
                } else {
                  stackOut_3_0 = 1;
                  stackIn_5_0 = stackOut_3_0;
                  break L0;
                }
              }
              L1: {
                ag.field_b = stackIn_5_0 != 0;
                df.field_a = param10;
                vb.field_m = param7;
                if (!param11) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L1;
                } else {
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L1;
                }
              }
              fj.field_d = stackIn_8_0 != 0;
              mc.field_r = param5;
              tb.field_g = param12;
              if (null == gf.field_b.field_s) {
                var15 = (IOException) (Object) decompiledCaughtException;
                throw new RuntimeException(var15.toString());
              } else {
                try {
                  fp.field_e = new qa(gf.field_b.field_s, 64, 0);
                } catch (java.io.IOException decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  return;
                }
              }
            } else {
              return;
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
        field_h = "Visit the Account Management section on the main site to view.";
    }
}
