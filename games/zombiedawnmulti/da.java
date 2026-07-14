/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class da {
    static long field_c;
    static String field_i;
    private java.util.zip.Inflater field_d;
    static String field_f;
    static cj field_h;
    static int field_a;
    static volatile int field_e;
    static byte[] field_b;
    static String field_g;

    public static void a(byte param0) {
        int var1 = -54 % ((param0 - -24) / 59);
        field_b = null;
        field_h = null;
        field_g = null;
        field_i = null;
        field_f = null;
    }

    final void a(byte[] param0, k param1, int param2) {
        try {
            if (param2 <= 26) {
                return;
            }
            if (param1.field_m[param1.field_j] == 31) {
                // if_icmpne L54
            } else {
                throw new RuntimeException("");
            }
            if (null == ((da) this).field_d) {
                ((da) this).field_d = new java.util.zip.Inflater(true);
            }
            try {
                ((da) this).field_d.setInput(param1.field_m, 10 + param1.field_j, -8 - param1.field_j + (-10 + param1.field_m.length));
                int discarded$0 = ((da) this).field_d.inflate(param0);
            } catch (Exception exception) {
                ((da) this).field_d.reset();
                throw new RuntimeException("");
            }
            ((da) this).field_d.reset();
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int[] a(int param0) {
        if (param0 != 8) {
            return null;
        }
        return new int[8];
    }

    final static void b(int param0) {
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
                        var3 = ZombieDawnMulti.field_E ? 1 : 0;
                        if (null != i.field_a) {
                            statePc = 2;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        i.field_a.f(31);
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        if (null != rn.field_d) {
                            statePc = 5;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        rn.field_d.a((byte) 77);
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        if (param0 == -8) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        field_g = null;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        if (null == hc.field_b) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        try {
                            hc.field_b.a((byte) -106);
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        if (null != rl.field_r) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        return;
                    }
                    case 14: {
                        var1 = 0;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        if (rl.field_r.length <= var1) {
                            statePc = 22;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        if (rl.field_r[var1] != null) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        var1++;
                        var1++;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 18: {
                        try {
                            rl.field_r[var1].a((byte) -125);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        var1++;
                        var1++;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 20: {
                        var2 = (IOException) (Object) caughtException;
                        var1++;
                        statePc = 15;
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

    final static n a(int param0, int param1, byte[] param2) {
        n var3 = null;
        if (param0 >= -44) {
          field_c = 35L;
          var3 = new n(param2);
          nq.field_s.a((br) (Object) var3, false);
          ih.a(var3, 1, param1);
          return var3;
        } else {
          var3 = new n(param2);
          nq.field_s.a((br) (Object) var3, false);
          ih.a(var3, 1, param1);
          return var3;
        }
    }

    public da() {
        this(-1, 1000000, 1000000);
    }

    final static ri[] a(String param0, ul param1, byte param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        if (param2 != 19) {
          da.a((byte) -85);
          var4 = param1.a(param3, (byte) -65);
          var5 = param1.a(param0, var4, param2 ^ -20);
          return pf.a(var4, param1, -75, var5);
        } else {
          var4 = param1.a(param3, (byte) -65);
          var5 = param1.a(param0, var4, param2 ^ -20);
          return pf.a(var4, param1, -75, var5);
        }
    }

    final static ja a(int param0, String param1) {
        ef var2 = pb.field_e;
        ja var3 = new ja(var2.a(param1), 27);
        var3.a();
        var2.b(param1, var3.field_x / 2, 17, 16777215, -1);
        int var4 = -13 % ((param0 - -44) / 43);
        return var3;
    }

    private da(int param0, int param1, int param2) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = -1;
        field_f = "Fastest";
        field_i = "Email (Login):";
        field_b = new byte[]{(byte)4};
        field_g = "Fool the fools!";
    }
}
