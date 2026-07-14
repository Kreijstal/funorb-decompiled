/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;
import java.net.URL;
import java.lang.String;

final class gi implements Iterable {
    hf[] field_a;
    static int field_e;
    static gk field_d;
    private hf field_f;
    int field_c;
    static int[] field_b;

    public final Iterator iterator() {
        return (Iterator) (Object) new k((gi) this);
    }

    final static void b(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = Geoblox.field_C;
        va.field_d = false;
        if (param0 == -12618) {
          ff.field_d = null;
          if (!cf.field_i) {
            var1 = ik.field_a;
            if ((var1 ^ -1) < -1) {
              if (1 == var1) {
                ff.field_d = ih.field_b;
                ff.field_d = gg.a(-11455, new CharSequence[3]);
                Geoblox.field_y.h((byte) -104);
                rd.c(520);
                return;
              } else {
                ff.field_d = wj.a(ra.field_b, new String[1], (byte) -124);
                ff.field_d = gg.a(-11455, new CharSequence[3]);
                Geoblox.field_y.h((byte) -104);
                rd.c(520);
                return;
              }
            } else {
              Geoblox.field_y.h((byte) -104);
              rd.c(520);
              return;
            }
          } else {
            Geoblox.field_y.c(false);
            return;
          }
        } else {
          return;
        }
    }

    final void a(long param0, int param1, hf param2) {
        hf var5 = null;
        L0: {
          if (param2.field_c != null) {
            param2.a(false);
            break L0;
          } else {
            break L0;
          }
        }
        var5 = ((gi) this).field_a[(int)((long)(-1 + ((gi) this).field_c) & param0)];
        param2.field_c = var5.field_c;
        if (param1 > -48) {
          field_b = null;
          param2.field_b = var5;
          param2.field_c.field_b = param2;
          param2.field_a = param0;
          param2.field_b.field_c = param2;
          return;
        } else {
          param2.field_b = var5;
          param2.field_c.field_b = param2;
          param2.field_a = param0;
          param2.field_b.field_c = param2;
          return;
        }
    }

    final static bg a(rh param0, int param1, rh param2, String param3, String param4) {
        int var5 = 0;
        int var6 = 0;
        var5 = param2.a((byte) 126, param4);
        if (param1 != 1) {
          field_b = null;
          var6 = param2.a(param3, param1 ^ -82, var5);
          return rb.a(var6, 0, param2, var5, param0);
        } else {
          var6 = param2.a(param3, param1 ^ -82, var5);
          return rb.a(var6, 0, param2, var5, param0);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        var9 = Geoblox.field_C;
        if (param6 >= param3) {
          if (param2 > param6) {
            sd.a(param5, param4, param7, 110, vb.field_c, param2, param0, param6, param3);
            if (param1 >= -102) {
              gi.a(-38);
              return;
            } else {
              return;
            }
          } else {
            if (param3 < param2) {
              sd.a(param0, param4, param7, 127, vb.field_c, param6, param5, param2, param3);
              if (param1 >= -102) {
                gi.a(-38);
                return;
              } else {
                return;
              }
            } else {
              sd.a(param4, param0, param7, 120, vb.field_c, param6, param5, param3, param2);
              if (param1 >= -102) {
                gi.a(-38);
                return;
              } else {
                return;
              }
            }
          }
        } else {
          if (param3 >= param2) {
            if (param2 > param6) {
              sd.a(param0, param5, param7, -110, vb.field_c, param3, param4, param2, param6);
              if (param1 < -102) {
                return;
              } else {
                gi.a(-38);
                return;
              }
            } else {
              sd.a(param5, param0, param7, -102, vb.field_c, param3, param4, param6, param2);
              if (param1 < -102) {
                return;
              } else {
                gi.a(-38);
                return;
              }
            }
          } else {
            sd.a(param4, param5, param7, 116, vb.field_c, param2, param0, param3, param6);
            if (param1 >= -102) {
              gi.a(-38);
              return;
            } else {
              return;
            }
          }
        }
    }

    final static void a(Throwable param0, String param1, byte param2) {
        try {
            String var3 = null;
            Exception var3_ref = null;
            cb var4 = null;
            DataInputStream var5 = null;
            String var6 = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            d stackIn_12_0 = null;
            int stackIn_12_1 = 0;
            java.net.URL stackIn_12_2 = null;
            java.net.URL stackIn_12_3 = null;
            java.net.URL stackIn_12_4 = null;
            StringBuilder stackIn_12_5 = null;
            d stackIn_13_0 = null;
            int stackIn_13_1 = 0;
            java.net.URL stackIn_13_2 = null;
            java.net.URL stackIn_13_3 = null;
            java.net.URL stackIn_13_4 = null;
            StringBuilder stackIn_13_5 = null;
            d stackIn_14_0 = null;
            int stackIn_14_1 = 0;
            java.net.URL stackIn_14_2 = null;
            java.net.URL stackIn_14_3 = null;
            java.net.URL stackIn_14_4 = null;
            StringBuilder stackIn_14_5 = null;
            String stackIn_14_6 = null;
            Throwable decompiledCaughtException = null;
            d stackOut_11_0 = null;
            int stackOut_11_1 = 0;
            java.net.URL stackOut_11_2 = null;
            java.net.URL stackOut_11_3 = null;
            java.net.URL stackOut_11_4 = null;
            StringBuilder stackOut_11_5 = null;
            d stackOut_13_0 = null;
            int stackOut_13_1 = 0;
            java.net.URL stackOut_13_2 = null;
            java.net.URL stackOut_13_3 = null;
            java.net.URL stackOut_13_4 = null;
            StringBuilder stackOut_13_5 = null;
            String stackOut_13_6 = null;
            d stackOut_12_0 = null;
            int stackOut_12_1 = 0;
            java.net.URL stackOut_12_2 = null;
            java.net.URL stackOut_12_3 = null;
            java.net.URL stackOut_12_4 = null;
            StringBuilder stackOut_12_5 = null;
            String stackOut_12_6 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var3 = "";
                            if (param0 != null) {
                                statePc = 2;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var3 = ch.a(param0, param2 + -124);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (param1 == null) {
                                statePc = 8;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (param0 != null) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var3 = var3 + " | ";
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var3 = var3 + param1;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            gb.a(var3, (byte) -75);
                            var6 = og.a(var3, "%3a", true, ":");
                            var7 = og.a(var6, "%40", true, "@");
                            var8 = og.a(var7, "%26", true, "&");
                            var9 = og.a(var8, "%23", true, "#");
                            if (null == c.field_x) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        return;
                    }
                    case 11: {
                        try {
                            stackOut_11_0 = ml.field_s;
                            stackOut_11_1 = -14;
                            stackOut_11_2 = null;
                            stackOut_11_3 = null;
                            stackOut_11_4 = c.field_x.getCodeBase();
                            stackOut_11_5 = new StringBuilder().append("clienterror.ws?c=").append(kk.field_t).append("&u=");
                            stackIn_13_0 = stackOut_11_0;
                            stackIn_13_1 = stackOut_11_1;
                            stackIn_13_2 = stackOut_11_2;
                            stackIn_13_3 = stackOut_11_3;
                            stackIn_13_4 = stackOut_11_4;
                            stackIn_13_5 = stackOut_11_5;
                            stackIn_12_0 = stackOut_11_0;
                            stackIn_12_1 = stackOut_11_1;
                            stackIn_12_2 = stackOut_11_2;
                            stackIn_12_3 = stackOut_11_3;
                            stackIn_12_4 = stackOut_11_4;
                            stackIn_12_5 = stackOut_11_5;
                            if (null == uk.field_p) {
                                statePc = 13;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            stackOut_12_0 = (d) (Object) stackIn_12_0;
                            stackOut_12_1 = stackIn_12_1;
                            stackOut_12_2 = null;
                            stackOut_12_3 = null;
                            stackOut_12_4 = (java.net.URL) (Object) stackIn_12_4;
                            stackOut_12_5 = (StringBuilder) (Object) stackIn_12_5;
                            stackOut_12_6 = uk.field_p;
                            stackIn_14_0 = stackOut_12_0;
                            stackIn_14_1 = stackOut_12_1;
                            stackIn_14_2 = stackOut_12_2;
                            stackIn_14_3 = stackOut_12_3;
                            stackIn_14_4 = stackOut_12_4;
                            stackIn_14_5 = stackOut_12_5;
                            stackIn_14_6 = stackOut_12_6;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            stackOut_13_0 = (d) (Object) stackIn_13_0;
                            stackOut_13_1 = stackIn_13_1;
                            stackOut_13_2 = null;
                            stackOut_13_3 = null;
                            stackOut_13_4 = (java.net.URL) (Object) stackIn_13_4;
                            stackOut_13_5 = (StringBuilder) (Object) stackIn_13_5;
                            stackOut_13_6 = "" + vi.field_H;
                            stackIn_14_0 = stackOut_13_0;
                            stackIn_14_1 = stackOut_13_1;
                            stackIn_14_2 = stackOut_13_2;
                            stackIn_14_3 = stackOut_13_3;
                            stackIn_14_4 = stackOut_13_4;
                            stackIn_14_5 = stackOut_13_5;
                            stackIn_14_6 = stackOut_13_6;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            new java.net.URL(stackIn_14_4, stackIn_14_6 + "&v1=" + d.field_o + "&v2=" + d.field_t + "&e=" + var9);
                            var4 = ((d) (Object) stackIn_14_0).a(stackIn_14_1, stackIn_14_2);
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (var4.field_a != 0) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            bc.a(param2 + -125, 1L);
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (-2 != (var4.field_a ^ -1)) {
                                statePc = 21;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var5 = (DataInputStream) var4.field_b;
                            int discarded$2 = var5.read();
                            var5.close();
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        var3_ref = (Exception) (Object) caughtException;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        if (param2 != 125) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        return;
                    }
                    case 23: {
                        gi.a(-109);
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0, byte param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        var3 = 1;
        L0: while (true) {
          if (-2 <= (param0 ^ -1)) {
            var4 = 28 % ((-75 - param1) / 49);
            if ((param0 ^ -1) == -2) {
              return param2 * var3;
            } else {
              return var3;
            }
          } else {
            L1: {
              if (0 != (param0 & 1)) {
                var3 = var3 * param2;
                break L1;
              } else {
                break L1;
              }
            }
            param0 = param0 >> 1;
            param2 = param2 * param2;
            continue L0;
          }
        }
    }

    public static void a(int param0) {
        if (param0 != -1) {
            return;
        }
        field_d = null;
        field_b = null;
    }

    private gi() throws Throwable {
        throw new Error();
    }

    final hf a(long param0, byte param1) {
        int var4 = 0;
        hf var5 = null;
        hf var6 = null;
        int var7 = 0;
        var7 = Geoblox.field_C;
        var4 = -95 / ((param1 - -9) / 43);
        var5 = ((gi) this).field_a[(int)((long)(-1 + ((gi) this).field_c) & param0)];
        ((gi) this).field_f = var5.field_b;
        L0: while (true) {
          if (((gi) this).field_f != var5) {
            if ((((gi) this).field_f.field_a ^ -1L) != (param0 ^ -1L)) {
              ((gi) this).field_f = ((gi) this).field_f.field_b;
              continue L0;
            } else {
              var6 = ((gi) this).field_f;
              ((gi) this).field_f = ((gi) this).field_f.field_b;
              return var6;
            }
          } else {
            ((gi) this).field_f = null;
            return null;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
        field_d = new gk();
        field_b = new int[8192];
    }
}
