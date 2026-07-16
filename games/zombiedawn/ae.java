/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.net.URL;
import java.lang.String;

final class ae {
    static int field_a;
    static int[] field_c;
    static String[] field_b;

    final static void a(dj param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        gd var5 = null;
        int[] var6 = null;
        int var7 = 0;
        am var8 = null;
        int var9 = 0;
        am var10 = null;
        var7 = ZombieDawn.field_J;
        var8 = new am(param0.a("", -119, "logo.fo3d"));
        var10 = var8;
        var3 = var10.d((byte) -119);
        var10.h((byte) 75);
        if (param1 < -109) {
          ag.field_a = pi.a(12, var10);
          ic.field_W = new gd[var3];
          eg.field_o = new int[var3][];
          var4 = 0;
          L0: while (true) {
            if (var4 >= var3) {
              var10.i(8);
              var9 = 0;
              var4 = var9;
              L1: while (true) {
                if (var9 >= var3) {
                  return;
                } else {
                  var5 = ic.field_W[var9];
                  var5.a((byte) 0, 6, 6, 1, 6);
                  var5.b(32767);
                  var6 = new int[]{var5.field_s + var5.field_o >> 2109026625, var5.field_E - -var5.field_L >> -488456511, var5.field_b + var5.field_a >> -233943231};
                  eg.field_o[var9] = var6;
                  var5.a(-var6[2], 112, -var6[1], -var6[0]);
                  var9++;
                  continue L1;
                }
              }
            } else {
              ic.field_W[var4] = bj.a(var8, (byte) -128);
              var4++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            field_b = null;
        }
        field_b = null;
        field_c = null;
    }

    final static int a(byte param0, char param1, CharSequence param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = ZombieDawn.field_J;
          var3 = 0;
          var4 = param2.length();
          if (param0 == -49) {
            break L0;
          } else {
            field_c = null;
            break L0;
          }
        }
        var5 = 0;
        L1: while (true) {
          if (var4 <= var5) {
            return var3;
          } else {
            if (param1 == param2.charAt(var5)) {
              var3++;
              var5++;
              continue L1;
            } else {
              var5++;
              continue L1;
            }
          }
        }
    }

    final static int[] a(int param0) {
        if (param0 != 14821) {
            field_c = null;
        }
        return new int[8];
    }

    final static void a(Throwable param0, int param1, String param2) {
        try {
            Exception var3 = null;
            String var3_ref = null;
            op var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            ec stackIn_13_0 = null;
            int stackIn_13_1 = 0;
            java.net.URL stackIn_13_2 = null;
            java.net.URL stackIn_13_3 = null;
            java.net.URL stackIn_13_4 = null;
            StringBuilder stackIn_13_5 = null;
            ec stackIn_14_0 = null;
            int stackIn_14_1 = 0;
            java.net.URL stackIn_14_2 = null;
            java.net.URL stackIn_14_3 = null;
            java.net.URL stackIn_14_4 = null;
            StringBuilder stackIn_14_5 = null;
            ec stackIn_15_0 = null;
            int stackIn_15_1 = 0;
            java.net.URL stackIn_15_2 = null;
            java.net.URL stackIn_15_3 = null;
            java.net.URL stackIn_15_4 = null;
            StringBuilder stackIn_15_5 = null;
            String stackIn_15_6 = null;
            Throwable decompiledCaughtException = null;
            ec stackOut_12_0 = null;
            int stackOut_12_1 = 0;
            java.net.URL stackOut_12_2 = null;
            java.net.URL stackOut_12_3 = null;
            java.net.URL stackOut_12_4 = null;
            StringBuilder stackOut_12_5 = null;
            ec stackOut_14_0 = null;
            int stackOut_14_1 = 0;
            java.net.URL stackOut_14_2 = null;
            java.net.URL stackOut_14_3 = null;
            java.net.URL stackOut_14_4 = null;
            StringBuilder stackOut_14_5 = null;
            String stackOut_14_6 = null;
            ec stackOut_13_0 = null;
            int stackOut_13_1 = 0;
            java.net.URL stackOut_13_2 = null;
            java.net.URL stackOut_13_3 = null;
            java.net.URL stackOut_13_4 = null;
            StringBuilder stackOut_13_5 = null;
            String stackOut_13_6 = null;
            L0: {
              var6 = ZombieDawn.field_J;
              if (param1 == 10331) {
                break L0;
              } else {
                ae.a(false);
                break L0;
              }
            }
            try {
              L1: {
                L2: {
                  var3_ref = "";
                  if (param0 == null) {
                    break L2;
                  } else {
                    var3_ref = vj.a(param0, (byte) -93);
                    break L2;
                  }
                }
                L3: {
                  if (param2 == null) {
                    break L3;
                  } else {
                    L4: {
                      if (param0 != null) {
                        var3_ref = var3_ref + " | ";
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var3_ref = var3_ref + param2;
                    break L3;
                  }
                }
                ed.a(83, var3_ref);
                var7 = fg.a(":", -127, "%3a", var3_ref);
                var8 = fg.a("@", -127, "%40", var7);
                var9 = fg.a("&", -128, "%26", var8);
                var10 = fg.a("#", -127, "%23", var9);
                if (b.field_m == null) {
                  return;
                } else {
                  L5: {
                    stackOut_12_0 = mh.field_E;
                    stackOut_12_1 = param1 ^ 13702;
                    stackOut_12_2 = null;
                    stackOut_12_3 = null;
                    stackOut_12_4 = b.field_m.getCodeBase();
                    stackOut_12_5 = new StringBuilder().append("clienterror.ws?c=").append(ke.field_b).append("&u=");
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_14_1 = stackOut_12_1;
                    stackIn_14_2 = stackOut_12_2;
                    stackIn_14_3 = stackOut_12_3;
                    stackIn_14_4 = stackOut_12_4;
                    stackIn_14_5 = stackOut_12_5;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    stackIn_13_2 = stackOut_12_2;
                    stackIn_13_3 = stackOut_12_3;
                    stackIn_13_4 = stackOut_12_4;
                    stackIn_13_5 = stackOut_12_5;
                    if (null == i.field_U) {
                      stackOut_14_0 = (ec) (Object) stackIn_14_0;
                      stackOut_14_1 = stackIn_14_1;
                      stackOut_14_2 = null;
                      stackOut_14_3 = null;
                      stackOut_14_4 = (java.net.URL) (Object) stackIn_14_4;
                      stackOut_14_5 = (StringBuilder) (Object) stackIn_14_5;
                      stackOut_14_6 = "" + nk.field_e;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      stackIn_15_2 = stackOut_14_2;
                      stackIn_15_3 = stackOut_14_3;
                      stackIn_15_4 = stackOut_14_4;
                      stackIn_15_5 = stackOut_14_5;
                      stackIn_15_6 = stackOut_14_6;
                      break L5;
                    } else {
                      stackOut_13_0 = (ec) (Object) stackIn_13_0;
                      stackOut_13_1 = stackIn_13_1;
                      stackOut_13_2 = null;
                      stackOut_13_3 = null;
                      stackOut_13_4 = (java.net.URL) (Object) stackIn_13_4;
                      stackOut_13_5 = (StringBuilder) (Object) stackIn_13_5;
                      stackOut_13_6 = i.field_U;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      stackIn_15_2 = stackOut_13_2;
                      stackIn_15_3 = stackOut_13_3;
                      stackIn_15_4 = stackOut_13_4;
                      stackIn_15_5 = stackOut_13_5;
                      stackIn_15_6 = stackOut_13_6;
                      break L5;
                    }
                  }
                  var4 = ((ec) (Object) stackIn_15_0).a(stackIn_15_1, new java.net.URL(stackIn_15_4, stackIn_15_6 + "&v1=" + ec.field_h + "&v2=" + ec.field_g + "&e=" + var10));
                  L6: while (true) {
                    if (-1 != var4.field_f) {
                      L7: {
                        if (-2 != var4.field_f) {
                          break L7;
                        } else {
                          var5 = (DataInputStream) var4.field_d;
                          int discarded$1 = var5.read();
                          var5.close();
                          break L7;
                        }
                      }
                      break L1;
                    } else {
                      ld.a(1L, (byte) 62);
                      continue L6;
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L8: {
                var3 = (Exception) (Object) decompiledCaughtException;
                break L8;
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
        int var2 = 0;
        field_c = new int[50];
        double var0 = 6.283185307179586 / (double)field_c.length;
        for (var2 = 0; field_c.length > var2; var2++) {
            field_c[var2] = (int)(48.0 * Math.sin((double)var2 * var0));
        }
        field_b = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
