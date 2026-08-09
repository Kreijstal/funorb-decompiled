/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ib extends gg {
    static Random field_i;
    int[] field_n;
    int field_m;
    boolean field_k;
    static boolean field_o;
    static int field_h;
    static dh field_l;
    static int field_j;

    public static void a(int param0) {
        field_i = null;
        if (param0 == 0) {
            return;
        }
        field_i = (Random) null;
    }

    final static o a(int param0, boolean param1, int param2) {
        o var3 = null;
        int var4 = 0;
        int var5 = 0;
        o stackIn_5_0 = null;
        o stackIn_6_0 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = SolKnight.field_L ? 1 : 0;
                    var3 = new o(param0, param0);
                    var4 = 0;
                    if (param1) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_j = -85;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (var4 < var3.field_v.length) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return var3;
                }
                case 4: {
                    stackIn_6_0 = (o) (var3);
                    stackIn_5_0 = stackIn_6_0;
                    if (var5 == 0) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    return stackIn_5_0;
                }
                case 6: {
                    stackIn_6_0.field_v[var4] = param2;
                    var4++;
                    if (var5 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    return var3;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    ib() {
        this.field_k = false;
    }

    static {
        field_i = new Random();
        field_l = null;
        field_j = 0;
    }
}
