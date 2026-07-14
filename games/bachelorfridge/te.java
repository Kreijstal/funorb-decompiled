/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class te extends kj {
    private int field_i;
    private int field_g;
    static String field_f;
    private int field_h;

    final static void c(byte param0) {
        try {
            IOException iOException = null;
            int var1 = 0;
            IOException var2 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var3 = BachelorFridge.field_y;
                        if (aka.field_G == null) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        aka.field_G.c(20);
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (param0 > 39) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        te.c(26);
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        if (null == oea.field_q) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        oea.field_q.a((byte) -36);
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        if (null != f.field_a) {
                            statePc = 8;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        try {
                            f.field_a.d(-120);
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (null != fr.field_m) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        return;
                    }
                    case 13: {
                        var1 = 0;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        if (fr.field_m.length <= var1) {
                            statePc = 21;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        if (fr.field_m[var1] != null) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        var1++;
                        var1++;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 17: {
                        try {
                            fr.field_m[var1].d(-7);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        var1++;
                        var1++;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 19: {
                        var2 = (IOException) (Object) caughtException;
                        var1++;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 21: {
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

    public static void c(int param0) {
        if (param0 != 35) {
            te.c((byte) -70);
            field_f = null;
            return;
        }
        field_f = null;
    }

    final static int a(int param0, byte param1) {
        String var2 = null;
        String var2_ref = null;
        int var3 = 0;
        var3 = 70 % ((18 - param1) / 42);
        var2 = lka.field_E[param0][7];
        var2_ref = var2.trim();
        var2_ref = var2_ref.toLowerCase();
        if (var2_ref.equals((Object) (Object) "")) {
          return 0;
        } else {
          return ((ji) (Object) dl.field_h.a(true, (long)var2_ref.hashCode())).field_h;
        }
    }

    final boolean b(int param0) {
        L0: {
          if ((((te) this).field_g ^ -1) == -61) {
            jja.a(192, -1, 25);
            break L0;
          } else {
            break L0;
          }
        }
        ((te) this).field_g = ((te) this).field_g - 1;
        if (((te) this).field_g - 1 < 0) {
          ((te) this).field_e.field_h.b((byte) 106, 35, ((te) this).field_d, ((te) this).field_c);
          jja.a(128, -1, 24);
          return true;
        } else {
          if (param0 <= 21) {
            boolean discarded$2 = ((te) this).b(1);
            return false;
          } else {
            return false;
          }
        }
    }

    final static int d(byte param0) {
        if (param0 != 89) {
            field_f = null;
            return dfa.field_b - rs.field_a;
        }
        return dfa.field_b - rs.field_a;
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        ee var5 = null;
        int var6 = 0;
        int var7 = 0;
        var4 = ((te) this).field_g * ((-(((te) this).field_g * 655360) + 52428800 >> -1986239376) + 400) / 80;
        if (param1 != 0) {
          ((te) this).field_h = -112;
          var5 = sv.field_c;
          var6 = -(((te) this).field_g * ((te) this).field_i / 80) + param2;
          var7 = -var4 + (param0 + -(((te) this).field_h * ((te) this).field_g / 80));
          var5.a(var6, var7 + -64);
          return;
        } else {
          var5 = sv.field_c;
          var6 = -(((te) this).field_g * ((te) this).field_i / 80) + param2;
          var7 = -var4 + (param0 + -(((te) this).field_h * ((te) this).field_g / 80));
          var5.a(var6, var7 + -64);
          return;
        }
    }

    te(gj param0, int param1, int param2) {
        super(param0, param1, param2);
        ((te) this).field_g = 80;
        ((te) this).field_i = kla.a(129, m.field_a, -2147483648) - 64;
        ((te) this).field_h = -32 + kla.a(65, m.field_a, -2147483648);
    }

    final void a(int param0, boolean param1, int param2) {
        if (!param1) {
            te.c((byte) 59);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Location";
    }
}
