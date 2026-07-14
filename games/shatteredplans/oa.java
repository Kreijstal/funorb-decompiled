/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class oa {
    static fg field_a;
    static fr field_b;

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = ShatteredPlansClient.field_F ? 1 : 0;
        if (-1 < (param1 ^ -1)) {
            param2 = param2 + param1;
            param1 = 0;
        }
        if (!((param4 ^ -1) <= -1)) {
            param0 = param0 + param4;
            param4 = 0;
        }
        if (gf.field_k < param0 + param4) {
            param0 = gf.field_k + -param4;
        }
        if (gf.field_b < param2 + param1) {
            param2 = gf.field_b - param1;
        }
        param1--;
        int var5 = param0 + param4;
        int var6 = param4;
        int var7 = -15 % ((6 - param3) / 48);
        while (var5 > var6) {
            var8 = param1 + gf.field_b * var6;
            for (var9 = param2; (var9 ^ -1) < -1; var9--) {
                var8++;
                var10 = gf.field_h[var8];
                var10 = (var10 >> -1233052606 & 4144959) + (8355711 & var10 >> -80429087);
                gf.field_h[var8] = var10;
            }
            var6++;
        }
    }

    final static void a(int param0) {
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
                        var3 = ShatteredPlansClient.field_F ? 1 : 0;
                        if (param0 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        oa.b(-14);
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (vp.field_o == null) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        vp.field_o.e(param0 + -16363);
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        if (vn.field_w == null) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        vn.field_w.a((byte) -122);
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        if (null == oq.field_g) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        try {
                            oq.field_g.b((byte) 127);
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (null == tr.field_Eb) {
                            statePc = 18;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        var1 = 0;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        if (var1 >= tr.field_Eb.length) {
                            statePc = 18;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        if (tr.field_Eb[var1] != null) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        var1++;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 15: {
                        try {
                            tr.field_Eb[var1].b((byte) -65);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        var1++;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 17: {
                        var2 = (IOException) (Object) caughtException;
                        var1++;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 18: {
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

    public final String toString() {
        throw new IllegalStateException();
    }

    final static char a(int param0, byte param1) {
        int var3 = 0;
        int var2 = 255 & param1;
        if (var2 == 0) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if ((var2 ^ -1) <= -129) {
            if (!((var2 ^ -1) <= -161)) {
                var3 = tl.field_p[-128 + var2];
                if (var3 == 0) {
                    var3 = 63;
                }
                var2 = var3;
            }
        }
        if (param0 != -12541) {
            return 'ﾷ';
        }
        return (char)var2;
    }

    final static bi[] a(int param0, boolean param1, int param2, int param3) {
        if (param1) {
            oa.a(-72, 121, 20, (byte) 125, 74);
        }
        return ao.a((byte) 97, param0, param2, 1, param3);
    }

    public static void b(int param0) {
        field_b = null;
        if (param0 <= 7) {
            return;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new fg();
    }
}
