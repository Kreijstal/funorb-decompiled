/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.net.URL;
import java.lang.String;

final class hb {
    static String field_a;
    static java.awt.Image field_i;
    static int field_f;
    private int field_g;
    private int field_b;
    private ga field_e;
    private rj field_h;
    static String field_c;
    static String field_d;

    final static void a(Throwable param0, int param1, String param2) {
        try {
            Exception var3 = null;
            String var3_ref = null;
            ce var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            uf stackIn_13_0 = null;
            int stackIn_13_1 = 0;
            java.net.URL stackIn_13_2 = null;
            java.net.URL stackIn_13_3 = null;
            java.net.URL stackIn_13_4 = null;
            StringBuilder stackIn_13_5 = null;
            uf stackIn_14_0 = null;
            int stackIn_14_1 = 0;
            java.net.URL stackIn_14_2 = null;
            java.net.URL stackIn_14_3 = null;
            java.net.URL stackIn_14_4 = null;
            StringBuilder stackIn_14_5 = null;
            uf stackIn_15_0 = null;
            int stackIn_15_1 = 0;
            java.net.URL stackIn_15_2 = null;
            java.net.URL stackIn_15_3 = null;
            java.net.URL stackIn_15_4 = null;
            StringBuilder stackIn_15_5 = null;
            String stackIn_15_6 = null;
            uf stackOut_12_0 = null;
            int stackOut_12_1 = 0;
            java.net.URL stackOut_12_2 = null;
            java.net.URL stackOut_12_3 = null;
            java.net.URL stackOut_12_4 = null;
            StringBuilder stackOut_12_5 = null;
            uf stackOut_13_0 = null;
            int stackOut_13_1 = 0;
            java.net.URL stackOut_13_2 = null;
            java.net.URL stackOut_13_3 = null;
            java.net.URL stackOut_13_4 = null;
            StringBuilder stackOut_13_5 = null;
            String stackOut_13_6 = null;
            uf stackOut_14_0 = null;
            int stackOut_14_1 = 0;
            java.net.URL stackOut_14_2 = null;
            java.net.URL stackOut_14_3 = null;
            java.net.URL stackOut_14_4 = null;
            StringBuilder stackOut_14_5 = null;
            String stackOut_14_6 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = TrackController.field_F ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3_ref = "";
                            if (param0 != null) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var3_ref = j.a(false, param0);
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (param2 == null) {
                                statePc = 8;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (param0 == null) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var3_ref = var3_ref + " | ";
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var3_ref = var3_ref + param2;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            re.a((byte) 53, var3_ref);
                            var7 = bb.a(var3_ref, (byte) -82, "%3a", ":");
                            var8 = bb.a(var7, (byte) -82, "%40", "@");
                            var9 = bb.a(var8, (byte) -82, "%26", "&");
                            var10 = bb.a(var9, (byte) -82, "%23", "#");
                            if (param1 == 0) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        return;
                    }
                    case 10: {
                        try {
                            if (null != qf.field_b) {
                                statePc = 12;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        return;
                    }
                    case 12: {
                        try {
                            stackOut_12_0 = re.field_f;
                            stackOut_12_1 = 0;
                            stackOut_12_2 = null;
                            stackOut_12_3 = null;
                            stackOut_12_4 = qf.field_b.getCodeBase();
                            stackOut_12_5 = new StringBuilder().append("clienterror.ws?c=").append(lj.field_a).append("&u=");
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
                            if (null != ac.field_b) {
                                statePc = 14;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            stackOut_13_0 = (uf) (Object) stackIn_13_0;
                            stackOut_13_1 = stackIn_13_1;
                            stackOut_13_2 = null;
                            stackOut_13_3 = null;
                            stackOut_13_4 = (java.net.URL) (Object) stackIn_13_4;
                            stackOut_13_5 = (StringBuilder) (Object) stackIn_13_5;
                            stackOut_13_6 = "" + fi.field_p;
                            stackIn_15_0 = stackOut_13_0;
                            stackIn_15_1 = stackOut_13_1;
                            stackIn_15_2 = stackOut_13_2;
                            stackIn_15_3 = stackOut_13_3;
                            stackIn_15_4 = stackOut_13_4;
                            stackIn_15_5 = stackOut_13_5;
                            stackIn_15_6 = stackOut_13_6;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            stackOut_14_0 = (uf) (Object) stackIn_14_0;
                            stackOut_14_1 = stackIn_14_1;
                            stackOut_14_2 = null;
                            stackOut_14_3 = null;
                            stackOut_14_4 = (java.net.URL) (Object) stackIn_14_4;
                            stackOut_14_5 = (StringBuilder) (Object) stackIn_14_5;
                            stackOut_14_6 = ac.field_b;
                            stackIn_15_0 = stackOut_14_0;
                            stackIn_15_1 = stackOut_14_1;
                            stackIn_15_2 = stackOut_14_2;
                            stackIn_15_3 = stackOut_14_3;
                            stackIn_15_4 = stackOut_14_4;
                            stackIn_15_5 = stackOut_14_5;
                            stackIn_15_6 = stackOut_14_6;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            new java.net.URL(stackIn_15_4, stackIn_15_6 + "&v1=" + uf.field_e + "&v2=" + uf.field_g + "&e=" + var10);
                            var4 = ((uf) (Object) stackIn_15_0).a(stackIn_15_1 != 0, stackIn_15_2);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (0 != var4.field_f) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            wl.a(1L, false);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (var4.field_f != 1) {
                                statePc = 22;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var5 = (DataInputStream) var4.field_e;
                            int discarded$1 = var5.read();
                            var5.close();
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 22: {
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

    final static cg[] a(int param0, la param1) {
        int var2 = 0;
        int var3 = 0;
        cg[] var4 = null;
        int var5 = 0;
        cg var6 = null;
        int var6_int = 0;
        int var7 = 0;
        var7 = TrackController.field_F ? 1 : 0;
        var2 = param1.d(param0 ^ 12, 8);
        if (-1 > (var2 ^ -1)) {
          return null;
        } else {
          var3 = param1.d(0, param0);
          var4 = new cg[var3];
          var5 = 0;
          L0: while (true) {
            if (var3 <= var5) {
              return var4;
            } else {
              if (lf.a((byte) -68, param1)) {
                var6 = new cg();
                int discarded$6 = param1.d(0, 24);
                int discarded$7 = param1.d(0, 24);
                var6.field_a = param1.d(param0 ^ 12, 24);
                int discarded$8 = param1.d(0, 9);
                int discarded$9 = param1.d(0, 12);
                int discarded$10 = param1.d(param0 + -12, 12);
                int discarded$11 = param1.d(0, 12);
                var4[var5] = var6;
                var5++;
                var5++;
                continue L0;
              } else {
                var6_int = param1.d(0, be.d((byte) -98, -1 + var5));
                var4[var5] = var4[var6_int];
                var5++;
                var5++;
                continue L0;
              }
            }
          }
        }
    }

    final Object a(long param0, byte param1) {
        int var5 = 0;
        Object var6 = null;
        ad var7 = null;
        vh var8 = null;
        var8 = (vh) (Object) ((hb) this).field_e.a(param0, 20);
        var5 = 79 / ((param1 - -50) / 50);
        if (var8 != null) {
          var6 = var8.a((byte) 52);
          if (var6 == null) {
            var8.a(-110);
            var8.e(0);
            ((hb) this).field_g = ((hb) this).field_g + var8.field_o;
            return null;
          } else {
            L0: {
              if (var8.f(-19429)) {
                var7 = new ad(var6, var8.field_o);
                ((hb) this).field_e.a((fc) (Object) var7, var8.field_b, -1);
                ((hb) this).field_h.a((gb) (Object) var7, 8466);
                ((vh) (Object) var7).field_m = 0L;
                var8.a(-57);
                var8.e(0);
                break L0;
              } else {
                ((hb) this).field_h.a((gb) (Object) var8, 8466);
                var8.field_m = 0L;
                break L0;
              }
            }
            return var6;
          }
        } else {
          return null;
        }
    }

    private final void a(byte param0, vh param1) {
        Object var4 = null;
        if (param0 < -92) {
          if (param1 != null) {
            param1.a(-113);
            param1.e(0);
            ((hb) this).field_g = ((hb) this).field_g + param1.field_o;
            return;
          } else {
            return;
          }
        } else {
          var4 = null;
          hb.a((Throwable) null, 126, (String) null);
          if (param1 == null) {
            return;
          } else {
            param1.a(-113);
            param1.e(0);
            ((hb) this).field_g = ((hb) this).field_g + param1.field_o;
            return;
          }
        }
    }

    private final void a(long param0, int param1) {
        vh var4 = null;
        var4 = (vh) (Object) ((hb) this).field_e.a(param0, 20);
        if (param1 >= -68) {
          field_c = null;
          this.a((byte) -108, var4);
          return;
        } else {
          this.a((byte) -108, var4);
          return;
        }
    }

    private final void a(int param0, int param1, long param2, Object param3) {
        ad var6 = null;
        int var7 = 0;
        vh var8 = null;
        var7 = TrackController.field_F ? 1 : 0;
        if (((hb) this).field_b < param0) {
          throw new IllegalStateException();
        } else {
          this.a(param2, -89);
          ((hb) this).field_g = ((hb) this).field_g - param0;
          L0: while (true) {
            if ((((hb) this).field_g ^ -1) <= -1) {
              if (param1 >= -53) {
                return;
              } else {
                var6 = new ad(param3, param0);
                ((hb) this).field_e.a((fc) (Object) var6, param2, -1);
                ((hb) this).field_h.a((gb) (Object) var6, 8466);
                ((vh) (Object) var6).field_m = 0L;
                return;
              }
            } else {
              var8 = (vh) (Object) ((hb) this).field_h.a(65);
              this.a((byte) -103, var8);
              continue L0;
            }
          }
        }
    }

    private hb() throws Throwable {
        throw new Error();
    }

    public static void a(boolean param0) {
        field_c = null;
        field_d = null;
        field_i = null;
        if (param0) {
            field_i = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final void a(int param0, Object param1, long param2) {
        this.a(1, -84, param2, param1);
        if (param0 >= -26) {
            Object discarded$0 = ((hb) this).a(-15L, (byte) -124);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "OK";
        field_d = "Type your password again to make sure it's correct";
        field_c = "Time bonus: ";
        field_f = 0;
    }
}
