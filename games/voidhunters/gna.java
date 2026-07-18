/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.net.URL;
import java.lang.String;

class gna extends elb {
    private int field_j;
    private int field_l;
    static String field_m;
    private byte[] field_i;
    private int[] field_k;

    final void a(int param0, int param1, int param2) {
        int var4 = -50 / ((-53 - param0) / 48);
        ((gna) this).field_j = ((gna) this).field_j + (param2 * ((gna) this).field_k[param1] >> 12);
    }

    final static void a(Throwable param0, String param1, int param2) {
        try {
            Exception var3 = null;
            String var3_ref = null;
            mob var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            eab stackIn_12_0 = null;
            java.net.URL stackIn_12_1 = null;
            java.net.URL stackIn_12_2 = null;
            java.net.URL stackIn_12_3 = null;
            StringBuilder stackIn_12_4 = null;
            eab stackIn_13_0 = null;
            java.net.URL stackIn_13_1 = null;
            java.net.URL stackIn_13_2 = null;
            java.net.URL stackIn_13_3 = null;
            StringBuilder stackIn_13_4 = null;
            eab stackIn_14_0 = null;
            java.net.URL stackIn_14_1 = null;
            java.net.URL stackIn_14_2 = null;
            java.net.URL stackIn_14_3 = null;
            StringBuilder stackIn_14_4 = null;
            String stackIn_14_5 = null;
            Throwable decompiledCaughtException = null;
            eab stackOut_11_0 = null;
            java.net.URL stackOut_11_1 = null;
            java.net.URL stackOut_11_2 = null;
            java.net.URL stackOut_11_3 = null;
            StringBuilder stackOut_11_4 = null;
            eab stackOut_13_0 = null;
            java.net.URL stackOut_13_1 = null;
            java.net.URL stackOut_13_2 = null;
            java.net.URL stackOut_13_3 = null;
            StringBuilder stackOut_13_4 = null;
            String stackOut_13_5 = null;
            eab stackOut_12_0 = null;
            java.net.URL stackOut_12_1 = null;
            java.net.URL stackOut_12_2 = null;
            java.net.URL stackOut_12_3 = null;
            StringBuilder stackOut_12_4 = null;
            String stackOut_12_5 = null;
            var6 = VoidHunters.field_G;
            try {
              L0: {
                L1: {
                  var3_ref = "";
                  if (param0 != null) {
                    var3_ref = eva.a(true, param0);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param1 == null) {
                    break L2;
                  } else {
                    L3: {
                      if (param0 == null) {
                        break L3;
                      } else {
                        var3_ref = var3_ref + " | ";
                        break L3;
                      }
                    }
                    var3_ref = var3_ref + param1;
                    break L2;
                  }
                }
                pa.a(var3_ref, 3);
                var7 = sh.a("%3a", ":", var3_ref, param2 + param2);
                var8 = sh.a("%40", "@", var7, param2);
                var9 = sh.a("%26", "&", var8, 0);
                var10 = sh.a("%23", "#", var9, param2);
                if (null == qv.field_p) {
                  return;
                } else {
                  L4: {
                    stackOut_11_0 = vpa.field_b;
                    stackOut_11_1 = null;
                    stackOut_11_2 = null;
                    stackOut_11_3 = qv.field_p.getCodeBase();
                    stackOut_11_4 = new StringBuilder().append("clienterror.ws?c=").append(w.field_y).append("&u=");
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    stackIn_13_2 = stackOut_11_2;
                    stackIn_13_3 = stackOut_11_3;
                    stackIn_13_4 = stackOut_11_4;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    stackIn_12_3 = stackOut_11_3;
                    stackIn_12_4 = stackOut_11_4;
                    if (null != ku.field_d) {
                      stackOut_13_0 = (eab) (Object) stackIn_13_0;
                      stackOut_13_1 = null;
                      stackOut_13_2 = null;
                      stackOut_13_3 = (java.net.URL) (Object) stackIn_13_3;
                      stackOut_13_4 = (StringBuilder) (Object) stackIn_13_4;
                      stackOut_13_5 = ku.field_d;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      stackIn_14_2 = stackOut_13_2;
                      stackIn_14_3 = stackOut_13_3;
                      stackIn_14_4 = stackOut_13_4;
                      stackIn_14_5 = stackOut_13_5;
                      break L4;
                    } else {
                      stackOut_12_0 = (eab) (Object) stackIn_12_0;
                      stackOut_12_1 = null;
                      stackOut_12_2 = null;
                      stackOut_12_3 = (java.net.URL) (Object) stackIn_12_3;
                      stackOut_12_4 = (StringBuilder) (Object) stackIn_12_4;
                      stackOut_12_5 = "" + tia.field_C;
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_14_1 = stackOut_12_1;
                      stackIn_14_2 = stackOut_12_2;
                      stackIn_14_3 = stackOut_12_3;
                      stackIn_14_4 = stackOut_12_4;
                      stackIn_14_5 = stackOut_12_5;
                      break L4;
                    }
                  }
                  var4 = ((eab) (Object) stackIn_14_0).a(new java.net.URL(stackIn_14_3, stackIn_14_5 + "&v1=" + eab.field_w + "&v2=" + eab.field_r + "&e=" + var10), 108);
                  L5: while (true) {
                    if (var4.field_f != 0) {
                      L6: {
                        if (var4.field_f != 1) {
                          break L6;
                        } else {
                          var5 = (DataInputStream) var4.field_d;
                          int discarded$1 = var5.read();
                          var5.close();
                          break L6;
                        }
                      }
                      break L0;
                    } else {
                      gdb.b(120, 1L);
                      continue L5;
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L7: {
                var3 = (Exception) (Object) decompiledCaughtException;
                break L7;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    void a(int param0, int param1, byte param2) {
        int fieldTemp$0 = ((gna) this).field_l;
        ((gna) this).field_l = ((gna) this).field_l + 1;
        ((gna) this).field_i[fieldTemp$0] = (byte)((dla.a((int) param2, 255) >> 1) + 127);
        if (param0 != 1111320769) {
            ((gna) this).a(-23, -5, 87);
        }
    }

    final void a(int param0) {
        ((gna) this).field_j = Math.abs(((gna) this).field_j);
        if (((gna) this).field_j >= 4096) {
            ((gna) this).field_j = 4095;
            int fieldTemp$0 = ((gna) this).field_l;
            ((gna) this).field_l = ((gna) this).field_l + 1;
            ((gna) this).a(1111320769, fieldTemp$0, (byte)(((gna) this).field_j >> 4));
            if (param0 != 1424903724) {
                return;
            }
            ((gna) this).field_j = 0;
            return;
        }
        int fieldTemp$1 = ((gna) this).field_l;
        ((gna) this).field_l = ((gna) this).field_l + 1;
        ((gna) this).a(1111320769, fieldTemp$1, (byte)(((gna) this).field_j >> 4));
        if (param0 != 1424903724) {
            return;
        }
        ((gna) this).field_j = 0;
    }

    final void a(boolean param0) {
        ((gna) this).field_j = 0;
        if (!param0) {
            return;
        }
        ((gna) this).field_l = 0;
    }

    gna(int param0, int param1, int param2, int param3, int param4, float param5) {
        super(param0, param1, param2, param3, param4);
        int var7 = 0;
        ((gna) this).field_k = new int[((gna) this).field_a];
        for (var7 = 0; var7 < ((gna) this).field_a; var7++) {
            ((gna) this).field_k[var7] = (short)(int)(Math.pow((double)param5, (double)var7) * 4096.0);
        }
    }

    public static void b(boolean param0) {
        field_m = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Enter the name you'd prefer. This is the name displayed to other players.";
    }
}
