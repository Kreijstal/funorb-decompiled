/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class tm implements Iterator {
    static String field_a;
    private jl field_c;
    private jl field_b;
    private lm field_d;
    static String field_e;

    final static byte[] a(int param0, byte[] param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        byte[] var6_ref_byte__ = null;
        int var6 = 0;
        byte[] var7 = null;
        Object var8 = null;
        Throwable var9 = null;
        kg var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = new kg(param1);
                    var3 = 94 % ((53 - param0) / 46);
                    var4 = var10.c(32);
                    var5 = var10.f((byte) 46);
                    if (-1 < (var5 ^ -1)) {
                        statePc = 4;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (qk.field_a == 0) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (var5 <= qk.field_a) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    throw new RuntimeException();
                }
                case 5: {
                    if (var4 != 0) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var17 = new byte[var5];
                    var15 = var17;
                    var13 = var15;
                    var11 = var13;
                    var6_ref_byte__ = var11;
                    var10.a(0, (byte) 122, var5, var17);
                    return var6_ref_byte__;
                }
                case 7: {
                    var6 = var10.f((byte) 51);
                    if (var6 < 0) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (qk.field_a == 0) {
                        statePc = 12;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (qk.field_a >= var6) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    throw new RuntimeException();
                }
                case 12: {
                    var18 = new byte[var6];
                    var16 = var18;
                    var14 = var16;
                    var12 = var14;
                    var7 = var12;
                    if (-2 != (var4 ^ -1)) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    int discarded$4 = oa.a(var18, var6, param1, var5, 9);
                    statePc = 19;
                    continue stateLoop;
                }
                case 14: {
                    var8 = (Object) (Object) mc.field_d;
                    // monitorenter mc.field_d
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    try {
                        mc.field_d.a(false, var18, var10);
                        // monitorexit var8
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var9 = caughtException;
                        // monitorexit var8
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 18: {
                    throw (RuntimeException) (Object) var9;
                }
                case 19: {
                    return var7;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final Object next() {
        jl var1 = ((tm) this).field_c;
        if (var1 != ((tm) this).field_d.field_b) {
            ((tm) this).field_c = var1.field_o;
        } else {
            ((tm) this).field_c = null;
            var1 = null;
        }
        ((tm) this).field_b = var1;
        return (Object) (Object) var1;
    }

    final static al a(java.applet.Applet param0, int param1) {
        al var5 = null;
        int var6 = Confined.field_J ? 1 : 0;
        String var2 = ml.a("jagex-last-login-method", (byte) 79, param0);
        if (var2 == null) {
            return tk.field_f;
        }
        al[] var3 = nn.b(68);
        int var4 = 0;
        if (param1 > -3) {
            field_e = null;
        }
        while (var4 < var3.length) {
            var5 = var3[var4];
            if (var5.a(var2, -5851)) {
                return var5;
            }
            var4++;
        }
        return tk.field_f;
    }

    public final void remove() {
        if (!(((tm) this).field_b != null)) {
            throw new IllegalStateException();
        }
        ((tm) this).field_b.b(true);
        ((tm) this).field_b = null;
    }

    final static void a(int param0, int param1) {
        ue.field_t = param1 >> -753071228 & 3;
        g.field_m = (12 & param1) >> -1998435326;
        if (param0 > -121) {
            field_e = null;
        }
        if (!(ue.field_t >= -3)) {
            ue.field_t = 2;
        }
        if (2 < g.field_m) {
            g.field_m = 2;
        }
        wd.field_c = 3 & param1;
        if (!(-3 >= wd.field_c)) {
            wd.field_c = 2;
        }
    }

    public final boolean hasNext() {
        return ((tm) this).field_d.field_b != ((tm) this).field_c;
    }

    public static void a(int param0) {
        field_a = null;
        int var1 = -25 / ((param0 - 10) / 55);
        field_e = null;
    }

    tm(lm param0) {
        ((tm) this).field_b = null;
        ((tm) this).field_d = param0;
        ((tm) this).field_b = null;
        ((tm) this).field_c = ((tm) this).field_d.field_b.field_o;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Press <%0> to fire homing missiles";
        field_a = "Try again";
    }
}
