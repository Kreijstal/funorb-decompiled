/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd {
    static boolean field_b;
    static String field_c;
    static int[] field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static ii[] a(byte param0) {
        ii[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = Transmogrify.field_A ? 1 : 0;
                    var1 = new ii[ih.field_b];
                    var2 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (ih.field_b <= var2) {
                        statePc = 9;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var1[var2] = new ii(pj.field_y, ll.field_U, gj.field_j[var2], re.field_a[var2], ql.field_b[var2], wk.field_b[var2], re.field_K[var2], rg.field_D);
                    var2++;
                    if (var3 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return var1;
                }
                case 4: {
                    if (var3 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (param0 > 96) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    field_c = (String) null;
                    statePc = 8;
                    continue stateLoop;
                }
                case 7: {
                    wd.d(121);
                    return var1;
                }
                case 8: {
                    wd.d(121);
                    return var1;
                }
                case 9: {
                    if (param0 > 96) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    field_c = (String) null;
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    wd.d(121);
                    return var1;
                }
                case 12: {
                    wd.d(121);
                    return var1;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(byte param0) {
        if (param0 != -74) {
            return;
        }
        field_a = null;
        field_c = null;
    }

    static {
        field_c = "Continue";
    }
}
