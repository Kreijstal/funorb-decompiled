/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.net.URL;
import java.lang.String;

final class hc {
    static int field_c;
    static String field_e;
    static String field_d;
    static int field_b;
    static boolean[] field_a;

    public static void a(boolean param0) {
        Object var2 = null;
        if (param0) {
          var2 = null;
          hc.a((Throwable) null, (String) null, (byte) 4);
          field_a = null;
          field_e = null;
          field_d = null;
          return;
        } else {
          field_a = null;
          field_e = null;
          field_d = null;
          return;
        }
    }

    final static byte[] a(byte param0, byte[] param1) {
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        rb var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param0 > 10) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return null;
                }
                case 2: {
                    var9 = new rb(param1);
                    var3 = var9.j(7909);
                    var4 = var9.f((byte) -97);
                    if ((var4 ^ -1) > -1) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (qi.field_c == 0) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (qi.field_c >= var4) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    throw new RuntimeException();
                }
                case 7: {
                    if (var3 == 0) {
                        statePc = 20;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var5_int = var9.f((byte) -104);
                    if ((var5_int ^ -1) > -1) {
                        statePc = 12;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (qi.field_c == 0) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (qi.field_c >= var5_int) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    throw new RuntimeException();
                }
                case 13: {
                    var16 = new byte[var5_int];
                    var14 = var16;
                    var12 = var14;
                    var10 = var12;
                    var6 = var10;
                    if (var3 != 1) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    int discarded$3 = nk.a(var16, var5_int, param1, var4, 9);
                    return var6;
                }
                case 15: {
                    var7 = (Object) (Object) mj.field_b;
                    // monitorenter mj.field_b
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    try {
                        mj.field_b.a(var9, true, var16);
                        // monitorexit var7
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    return var6;
                }
                case 18: {
                    try {
                        var8 = caughtException;
                        // monitorexit var7
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 19: {
                    throw (RuntimeException) (Object) var8;
                }
                case 20: {
                    var17 = new byte[var4];
                    var15 = var17;
                    var13 = var15;
                    var11 = var13;
                    var5 = var11;
                    var9.a(var4, (byte) 88, var17, 0);
                    return var5;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(Throwable param0, String param1, byte param2) {
        try {
            Exception var3 = null;
            String var3_ref = null;
            bk var4 = null;
            DataInputStream var5 = null;
            String var6 = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            ka stackIn_13_0 = null;
            int stackIn_13_1 = 0;
            java.net.URL stackIn_13_2 = null;
            java.net.URL stackIn_13_3 = null;
            java.net.URL stackIn_13_4 = null;
            StringBuilder stackIn_13_5 = null;
            ka stackIn_14_0 = null;
            int stackIn_14_1 = 0;
            java.net.URL stackIn_14_2 = null;
            java.net.URL stackIn_14_3 = null;
            java.net.URL stackIn_14_4 = null;
            StringBuilder stackIn_14_5 = null;
            ka stackIn_15_0 = null;
            int stackIn_15_1 = 0;
            java.net.URL stackIn_15_2 = null;
            java.net.URL stackIn_15_3 = null;
            java.net.URL stackIn_15_4 = null;
            StringBuilder stackIn_15_5 = null;
            String stackIn_15_6 = null;
            Throwable decompiledCaughtException = null;
            ka stackOut_12_0 = null;
            int stackOut_12_1 = 0;
            java.net.URL stackOut_12_2 = null;
            java.net.URL stackOut_12_3 = null;
            java.net.URL stackOut_12_4 = null;
            StringBuilder stackOut_12_5 = null;
            ka stackOut_14_0 = null;
            int stackOut_14_1 = 0;
            java.net.URL stackOut_14_2 = null;
            java.net.URL stackOut_14_3 = null;
            java.net.URL stackOut_14_4 = null;
            StringBuilder stackOut_14_5 = null;
            String stackOut_14_6 = null;
            ka stackOut_13_0 = null;
            int stackOut_13_1 = 0;
            java.net.URL stackOut_13_2 = null;
            java.net.URL stackOut_13_3 = null;
            java.net.URL stackOut_13_4 = null;
            StringBuilder stackOut_13_5 = null;
            String stackOut_13_6 = null;
            try {
              L0: {
                if (param2 >= 54) {
                  break L0;
                } else {
                  field_e = null;
                  break L0;
                }
              }
              L1: {
                var3_ref = "";
                if (param0 == null) {
                  break L1;
                } else {
                  var3_ref = uf.a(param0, -17490);
                  break L1;
                }
              }
              L2: {
                if (param1 != null) {
                  L3: {
                    if (param0 != null) {
                      var3_ref = var3_ref + " | ";
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var3_ref = var3_ref + param1;
                  break L2;
                } else {
                  break L2;
                }
              }
              ic.a((byte) -126, var3_ref);
              var6 = ed.a(-1, var3_ref, "%3a", ":");
              var7 = ed.a(-1, var6, "%40", "@");
              var8 = ed.a(-1, var7, "%26", "&");
              var9 = ed.a(-1, var8, "%23", "#");
              if (null != ek.field_b) {
                L4: {
                  stackOut_12_0 = kg.field_d;
                  stackOut_12_1 = -10;
                  stackOut_12_2 = null;
                  stackOut_12_3 = null;
                  stackOut_12_4 = ek.field_b.getCodeBase();
                  stackOut_12_5 = new StringBuilder().append("clienterror.ws?c=").append(ac.field_f).append("&u=");
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
                  if (null == re.field_q) {
                    stackOut_14_0 = (ka) (Object) stackIn_14_0;
                    stackOut_14_1 = stackIn_14_1;
                    stackOut_14_2 = null;
                    stackOut_14_3 = null;
                    stackOut_14_4 = (java.net.URL) (Object) stackIn_14_4;
                    stackOut_14_5 = (StringBuilder) (Object) stackIn_14_5;
                    stackOut_14_6 = "" + ne.field_j;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    stackIn_15_2 = stackOut_14_2;
                    stackIn_15_3 = stackOut_14_3;
                    stackIn_15_4 = stackOut_14_4;
                    stackIn_15_5 = stackOut_14_5;
                    stackIn_15_6 = stackOut_14_6;
                    break L4;
                  } else {
                    stackOut_13_0 = (ka) (Object) stackIn_13_0;
                    stackOut_13_1 = stackIn_13_1;
                    stackOut_13_2 = null;
                    stackOut_13_3 = null;
                    stackOut_13_4 = (java.net.URL) (Object) stackIn_13_4;
                    stackOut_13_5 = (StringBuilder) (Object) stackIn_13_5;
                    stackOut_13_6 = re.field_q;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_15_1 = stackOut_13_1;
                    stackIn_15_2 = stackOut_13_2;
                    stackIn_15_3 = stackOut_13_3;
                    stackIn_15_4 = stackOut_13_4;
                    stackIn_15_5 = stackOut_13_5;
                    stackIn_15_6 = stackOut_13_6;
                    break L4;
                  }
                }
                new java.net.URL(stackIn_15_4, stackIn_15_6 + "&v1=" + ka.field_l + "&v2=" + ka.field_o + "&e=" + var9);
                var4 = ((ka) (Object) stackIn_15_0).a((byte) stackIn_15_1, stackIn_15_2);
                L5: while (true) {
                  if (var4.field_b != 0) {
                    L6: {
                      if ((var4.field_b ^ -1) != -2) {
                        break L6;
                      } else {
                        var5 = (DataInputStream) var4.field_f;
                        int discarded$1 = var5.read();
                        var5.close();
                        break L6;
                      }
                    }
                  } else {
                    uc.a(-94, 1L);
                    continue L5;
                  }
                }
              } else {
                return;
              }
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var3 = (Exception) (Object) decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static ig a(String[] args, int param1) {
        ig var2 = null;
        if (param1 != 0) {
          field_e = null;
          var2 = new ig(false);
          var2.field_a = args;
          return var2;
        } else {
          var2 = new ig(false);
          var2.field_a = args;
          return var2;
        }
    }

    final static void a(int param0, qe param1, int param2, qe param3, int param4, gi param5, int param6, int param7, int param8, int param9, gi param10, int param11, gi param12, byte param13, int param14, int param15, int param16, int param17, int param18, int param19, int param20) {
        ui.a(640, param17, param1, param3);
        le.a(-4797, param16, param19, param8, param15);
        if (param13 != -11) {
          field_e = null;
          fc.a(param0, (byte) -102, param20);
          jl.a(param12, param5, param2, -20, param18, param9);
          el.a(param10, param11, param4, true);
          eg.a(param14, param6, (byte) -68, param7);
          return;
        } else {
          fc.a(param0, (byte) -102, param20);
          jl.a(param12, param5, param2, -20, param18, param9);
          el.a(param10, param11, param4, true);
          eg.a(param14, param6, (byte) -68, param7);
          return;
        }
    }

    final static String a(byte param0) {
        if (!(uh.field_k != jl.field_a)) {
            return lh.field_D;
        }
        if (param0 < 93) {
            return null;
        }
        return sd.field_b;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Please send me news and updates (I can unsubscribe at any time)";
        field_e = "       ";
        field_b = 0;
    }
}
